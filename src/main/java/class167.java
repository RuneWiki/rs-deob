import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public interface class167 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method814(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)I")
    int method815(int arg0, byte arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
    void method816(int arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
    void method817(int arg0, int arg1);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
    void method818(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[I)V")
    void method819(int arg0, int[] arg1);
}
