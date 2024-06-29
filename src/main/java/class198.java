import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class198 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lhj;")
    public static class569 field2902 = new class569();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1406(byte arg0) {
        field2902 = null;
        int var1 = -55 / ((arg0 + 39) / 60);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZIII)I")
    public static final int method1407(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field2901++;
        if (!arg3) {
            field2902 = null;
        }
        if ((arg6 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return -arg4 - (-(7 - arg0) - 1);
        }
    }
}
