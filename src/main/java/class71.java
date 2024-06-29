import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public interface class71 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
    void method667(int arg0, byte arg1) throws Exception;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([I)V")
    void method668(int[] arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    void method669(boolean arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
    int method670(byte arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    void method671(Component arg0, int arg1) throws Exception;
}
