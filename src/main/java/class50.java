import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class50 extends class154 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIIIII)V")
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class163.field3193 * arg2 + arg1;
        int var9 = class163.field3193 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class163.field3187) {
            int var12 = class163.field3187 - arg2;
            arg4 -= var12;
            arg2 = class163.field3187;
            var11 += arg3 * var12;
            var8 += class163.field3193 * var12;
        }
        if (arg2 + arg4 > class163.field3191) {
            arg4 -= arg2 + arg4 - class163.field3191;
        }
        if (arg1 < class163.field3188) {
            int var13 = class163.field3188 - arg1;
            arg3 -= var13;
            arg1 = class163.field3188;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class163.field3190) {
            int var14 = arg1 + arg3 - class163.field3190;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class154.method999(class163.field3192, super.field3085[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class50(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(IIIIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class163.field3193 * arg2 + arg1;
        int var8 = class163.field3193 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class163.field3187) {
            int var11 = class163.field3187 - arg2;
            arg4 -= var11;
            arg2 = class163.field3187;
            var10 += arg3 * var11;
            var7 += class163.field3193 * var11;
        }
        if (arg2 + arg4 > class163.field3191) {
            arg4 -= arg2 + arg4 - class163.field3191;
        }
        if (arg1 < class163.field3188) {
            int var12 = class163.field3188 - arg1;
            arg3 -= var12;
            arg1 = class163.field3188;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class163.field3190) {
            int var13 = arg1 + arg3 - class163.field3190;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class154.method983(class163.field3192, super.field3085[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([B)V")
    public class50(byte[] arg0) {
        super(arg0);
    }
}
