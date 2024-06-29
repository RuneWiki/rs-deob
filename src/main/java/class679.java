import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public interface class679 extends class218 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZILpn;I[B)V")
    void method2136(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class692 arg6, int arg7, byte[] arg8);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
    boolean method2140(int arg0);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
    int method2139(int arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZIZ)V")
    void method2137(boolean arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BF)F")
    float method2135(byte arg0, float arg1);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(BF)F")
    float method2138(byte arg0, float arg1);

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
    int method2141(int arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[IIIII)V")
    void method2134(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7);
}
