import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public interface class85 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    int method567(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method568(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[I)V")
    void method569(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
    void method570(boolean arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)V")
    void method571(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
    void method572(int arg0, int arg1);
}
