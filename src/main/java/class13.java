import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public interface class13 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
    int method108(byte arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    void method109(int arg0, int arg1) throws Exception;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    void method110(boolean arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    void method111(int arg0, int arg1, Component arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([I)V")
    void method112(int[] arg0);
}
