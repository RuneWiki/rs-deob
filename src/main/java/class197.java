import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface class197 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)I")
    int method1227(int arg0, byte arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    void method1228(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)V")
    void method1229(int arg0, byte arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)V")
    void method1230(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[I)V")
    void method1231(int arg0, int[] arg1);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
    void method1232(boolean arg0, Component arg1, int arg2, int arg3) throws Exception;
}
