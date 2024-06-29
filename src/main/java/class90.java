import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public interface class90 extends class506 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[IIIIIII)V")
    void method587(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
    int method588(byte arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)I")
    int method593(boolean arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILlw;IIIIII[B)V")
    void method594(int arg0, class233 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZZ)V")
    void method597(int arg0, boolean arg1, boolean arg2);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IF)F")
    float method590(int arg0, float arg1);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IF)F")
    float method591(int arg0, float arg1);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)Z")
    boolean method589(byte arg0);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBII[III)V")
    void method595(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);
}
