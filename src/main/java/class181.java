import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public interface class181 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    void method1229(int arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIB)V")
    void method1230(int arg0, int arg1, byte arg2) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    void method1231(int arg0, boolean arg1, int arg2, Component arg3) throws Exception;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[I)V")
    void method1232(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)I")
    int method1233(boolean arg0, int arg1);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
    void method1234(int arg0, int arg1);
}
