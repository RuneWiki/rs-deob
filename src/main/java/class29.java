import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class24 {

    @OriginalMember(owner = "mapview!oa", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 3)
    public class29(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(IIIIIII)V", line = 7)
    public final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class22.field246 * arg2 + arg1;
        int var9 = class22.field246 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class22.field247) {
            int var12 = class22.field247 - arg2;
            arg4 -= var12;
            arg2 = class22.field247;
            var11 += arg3 * var12;
            var8 += class22.field246 * var12;
        }
        if (arg2 + arg4 > class22.field245) {
            arg4 -= arg2 + arg4 - class22.field245;
        }
        if (arg1 < class22.field248) {
            int var13 = class22.field248 - arg1;
            arg3 -= var13;
            arg1 = class22.field248;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class22.field251) {
            int var14 = arg1 + arg3 - class22.field251;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class24.method133(class22.field249, super.field269[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(IIIIII)V", line = 56)
    public final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class22.field246 * arg2 + arg1;
        int var8 = class22.field246 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class22.field247) {
            int var11 = class22.field247 - arg2;
            arg4 -= var11;
            arg2 = class22.field247;
            var10 += arg3 * var11;
            var7 += class22.field246 * var11;
        }
        if (arg2 + arg4 > class22.field245) {
            arg4 -= arg2 + arg4 - class22.field245;
        }
        if (arg1 < class22.field248) {
            int var12 = class22.field248 - arg1;
            arg3 -= var12;
            arg1 = class22.field248;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class22.field251) {
            int var13 = arg1 + arg3 - class22.field251;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class24.method121(class22.field249, super.field269[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
