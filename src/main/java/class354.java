import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public interface class354 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
    void method2469(Component arg0, boolean arg1, int arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    void method2470(int arg0, int arg1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)I")
    int method2471(int arg0, byte arg1);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
    void method2472(int arg0, int arg1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[I)V")
    void method2473(int arg0, int[] arg1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
    void method2474(byte arg0, int arg1, int arg2) throws Exception;
}
