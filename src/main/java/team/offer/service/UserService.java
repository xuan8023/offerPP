package team.offer.service;

import team.offer.entity.Position;
import team.offer.entity.PositionVo;
import team.offer.entity.User;

import java.util.List;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 8:46 2018/1/18
 * @Modified By:
 */
public interface UserService {

    //获取个人详细信息
    User findUserById(Integer id) throws Exception;

    //获取个人详细信息
    User findUserByEmail(String email) throws Exception;

    //用户注册
    boolean register(User user) throws Exception;

    //用户登录(每次登录还需要更新上线时间)
    boolean login(User user) throws Exception;

    //验证邮箱
    boolean verifyEmail(String email) throws Exception;
    //忘记密码
    void forgetPassword(String email,String password) throws Exception;

    //修改密码
    boolean changePassword(User loginUser,String oldPassword,String newPassword) throws Exception;

    //用户查看收藏的职位
    List<PositionVo> queryCollection(Integer id) throws Exception;

    //收藏职位
    boolean collectionPosition(Integer uid,Integer pid) throws Exception;

    //用户删除收藏的职位
    boolean deleteCollection(Integer uid,Integer pid) throws Exception;

    //查看新投递
    List<PositionVo> newApplication(Integer id) throws Exception;

    //查看已查阅
    List<PositionVo> consultedApplication(Integer id) throws Exception;

    //查看待安排
    List<PositionVo> arrangedApplication(Integer id) throws Exception;

    //投递职位
    boolean deliverPosition(Integer uid,Integer pid) throws Exception;



}
