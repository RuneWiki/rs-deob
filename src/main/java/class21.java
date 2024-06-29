import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class21 extends class14 {

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 4)
    public class21(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([BIIIIII)V", line = 9)
    public final void method67(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class40.field518 * arg2 + arg1;
        int var9 = class40.field518 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class40.field520) {
            int var12 = class40.field520 - arg2;
            arg4 -= var12;
            arg2 = class40.field520;
            var11 += arg3 * var12;
            var8 += class40.field518 * var12;
        }
        if (arg2 + arg4 > class40.field517) {
            arg4 -= arg2 + arg4 - class40.field517;
        }
        if (arg1 < class40.field519) {
            int var13 = class40.field519 - arg1;
            arg3 -= var13;
            arg1 = class40.field519;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class40.field516) {
            int var14 = arg1 + arg3 - class40.field516;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class14.method72(class40.field515, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([BIIIII)V", line = 57)
    public final void method71(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class40.field518 * arg2 + arg1;
        int var8 = class40.field518 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class40.field520) {
            int var11 = class40.field520 - arg2;
            arg4 -= var11;
            arg2 = class40.field520;
            var10 += arg3 * var11;
            var7 += class40.field518 * var11;
        }
        if (arg2 + arg4 > class40.field517) {
            arg4 -= arg2 + arg4 - class40.field517;
        }
        if (arg1 < class40.field519) {
            int var12 = class40.field519 - arg1;
            arg3 -= var12;
            arg1 = class40.field519;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class40.field516) {
            int var13 = arg1 + arg3 - class40.field516;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class14.method76(class40.field515, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
