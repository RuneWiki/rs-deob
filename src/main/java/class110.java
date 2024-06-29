import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public interface class110 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IBZ)V")
    void method871(Component arg0, int arg1, byte arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    void method872(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    void method873(int arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)I")
    int method874(int arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
    void method875(int arg0, int[] arg1);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)V")
    void method876(int arg0, int arg1);
}
