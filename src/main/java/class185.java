import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public interface class185 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
    void method1221(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
    void method1222(int arg0, Component arg1, boolean arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    void method1223(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I")
    int method1224(int arg0, int arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[I)V")
    void method1225(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
    void method1226(boolean arg0, int arg1);
}
