import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public interface class623 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    void method293(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
    void method291(int arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;BIZ)V")
    void method294(Component arg0, byte arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[I)V")
    void method295(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
    int method292(int arg0, byte arg1);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    void method296(int arg0, int arg1, int arg2) throws Exception;
}
