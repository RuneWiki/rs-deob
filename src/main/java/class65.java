import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class65 extends class30 {

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B)V")
    public class65(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class145.field2637 * arg2 + arg1;
        int var8 = class145.field2637 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class145.field2638) {
            int var11 = class145.field2638 - arg2;
            arg4 -= var11;
            arg2 = class145.field2638;
            var10 += arg3 * var11;
            var7 += class145.field2637 * var11;
        }
        if (arg2 + arg4 > class145.field2641) {
            arg4 -= arg2 + arg4 - class145.field2641;
        }
        if (arg1 < class145.field2636) {
            int var12 = class145.field2636 - arg1;
            arg3 -= var12;
            arg1 = class145.field2636;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class145.field2639) {
            int var13 = arg1 + arg3 - class145.field2639;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class163.method1047(3, var8, var9, arg5, class145.field2640, arg3, super.field654[arg0], var10, arg4, var7);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IIIIIII)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class145.field2637 * arg2 + arg1;
        int var9 = class145.field2637 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class145.field2638) {
            int var12 = class145.field2638 - arg2;
            arg4 -= var12;
            arg2 = class145.field2638;
            var11 += arg3 * var12;
            var8 += class145.field2637 * var12;
        }
        if (arg2 + arg4 > class145.field2641) {
            arg4 -= arg2 + arg4 - class145.field2641;
        }
        if (arg1 < class145.field2636) {
            int var13 = class145.field2636 - arg1;
            arg3 -= var13;
            arg1 = class145.field2636;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class145.field2639) {
            int var14 = arg1 + arg3 - class145.field2639;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class95.method615(var10, true, arg5, class145.field2640, arg3, var9, var11, super.field654[arg0], arg4, arg6, var8);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class65(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
