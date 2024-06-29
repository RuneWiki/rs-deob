import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface class204 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    void method1348(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
    void method1349(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    void method1350(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[I)V")
    void method1351(int arg0, int[] arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
    void method1352(Component arg0, boolean arg1, int arg2, byte arg3) throws Exception;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I")
    int method1353(int arg0, int arg1);
}
