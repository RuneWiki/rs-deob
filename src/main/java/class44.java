import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public interface class44 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    void method372(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
    void method373(Component arg0, boolean arg1, int arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
    int method374(byte arg0, int arg1);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(BI)V")
    void method375(byte arg0, int arg1);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[I)V")
    void method376(int arg0, int[] arg1);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
    void method377(int arg0, byte arg1);
}
