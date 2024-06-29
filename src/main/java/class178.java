import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface class178 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    void method1187(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLjava/awt/Component;IB)V")
    void method1188(boolean arg0, Component arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
    void method1189(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[I)V")
    void method1190(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
    int method1191(int arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    void method1192(int arg0, int arg1);
}
