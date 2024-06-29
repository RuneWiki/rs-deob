import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public interface class33 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
    void method238(Component arg0, boolean arg1, byte arg2, int arg3) throws Exception;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    void method239(boolean arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
    int method240(byte arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
    void method241(int[] arg0);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    void method242(int arg0, int arg1) throws Exception;
}
