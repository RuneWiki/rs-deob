import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class12 extends class32 {

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(IIIIII)V", line = 5)
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class13.field131 * arg2 + arg1;
        int var8 = class13.field131 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class13.field130) {
            int var11 = class13.field130 - arg2;
            arg4 -= var11;
            arg2 = class13.field130;
            var10 += arg3 * var11;
            var7 += class13.field131 * var11;
        }
        if (arg2 + arg4 > class13.field132) {
            arg4 -= arg2 + arg4 - class13.field132;
        }
        if (arg1 < class13.field127) {
            int var12 = class13.field127 - arg1;
            arg3 -= var12;
            arg1 = class13.field127;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class13.field128) {
            int var13 = arg1 + arg3 - class13.field128;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class32.method214(class13.field126, super.field450[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 52)
    public class12(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(IIIIIII)V", line = 56)
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class13.field131 * arg2 + arg1;
        int var9 = class13.field131 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class13.field130) {
            int var12 = class13.field130 - arg2;
            arg4 -= var12;
            arg2 = class13.field130;
            var11 += arg3 * var12;
            var8 += class13.field131 * var12;
        }
        if (arg2 + arg4 > class13.field132) {
            arg4 -= arg2 + arg4 - class13.field132;
        }
        if (arg1 < class13.field127) {
            int var13 = class13.field127 - arg1;
            arg3 -= var13;
            arg1 = class13.field127;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class13.field128) {
            int var14 = arg1 + arg3 - class13.field128;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class32.method212(class13.field126, super.field450[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
