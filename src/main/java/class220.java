import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public interface class220 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)I")
    int method1524(byte arg0, int arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBI)V")
    void method1525(int arg0, byte arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;IZZ)V")
    void method1526(Component arg0, int arg1, boolean arg2, boolean arg3) throws Exception;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[I)V")
    void method1527(int arg0, int[] arg1);

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V")
    void method1528(int arg0, byte arg1);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IB)V")
    void method1529(int arg0, byte arg1);
}
