import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface class95 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ)V")
    void method608(int arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
    int method609(int arg0, byte arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[I)V")
    void method610(int arg0, int[] arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    void method611(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
    void method612(int arg0, boolean arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    void method613(Component arg0, int arg1, int arg2, boolean arg3) throws Exception;
}
