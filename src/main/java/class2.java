import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 extends class22 {

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "([BIIIII)V", line = 5)
    public final void method28(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class21.field291 * arg2 + arg1;
        int var8 = class21.field291 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class21.field290) {
            int var11 = class21.field290 - arg2;
            arg4 -= var11;
            arg2 = class21.field290;
            var10 += arg3 * var11;
            var7 += class21.field291 * var11;
        }
        if (arg2 + arg4 > class21.field288) {
            arg4 -= arg2 + arg4 - class21.field288;
        }
        if (arg1 < class21.field292) {
            int var12 = class21.field292 - arg1;
            arg3 -= var12;
            arg1 = class21.field292;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class21.field289) {
            int var13 = arg1 + arg3 - class21.field289;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class22.method142(class21.field294, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 53)
    public class2(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "([BIIIIII)V", line = 58)
    public final void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class21.field291 * arg2 + arg1;
        int var9 = class21.field291 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class21.field290) {
            int var12 = class21.field290 - arg2;
            arg4 -= var12;
            arg2 = class21.field290;
            var11 += arg3 * var12;
            var8 += class21.field291 * var12;
        }
        if (arg2 + arg4 > class21.field288) {
            arg4 -= arg2 + arg4 - class21.field288;
        }
        if (arg1 < class21.field292) {
            int var13 = class21.field292 - arg1;
            arg3 -= var13;
            arg1 = class21.field292;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class21.field289) {
            int var14 = arg1 + arg3 - class21.field289;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class22.method150(class21.field294, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
