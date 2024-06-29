import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public interface class178 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BII)V")
    void method1271(byte arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[I)V")
    void method1272(int arg0, int[] arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
    void method1273(byte arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)I")
    int method1274(byte arg0, int arg1);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
    void method1275(byte arg0, boolean arg1, Component arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    void method1276(int arg0, int arg1);
}
