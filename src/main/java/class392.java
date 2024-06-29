import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public interface class392 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
    int method2294(int arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[I)V")
    void method2295(int arg0, int[] arg1);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    void method2296(int arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    void method2297(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    void method2298(int arg0, int arg1, int arg2) throws Exception;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILjava/awt/Component;)V")
    void method2299(int arg0, boolean arg1, int arg2, Component arg3) throws Exception;
}
