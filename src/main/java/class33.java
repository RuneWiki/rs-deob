import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 extends class21 {

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(IIIIII)V", line = 4)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class23.field231 * arg2 + arg1;
        int var8 = class23.field231 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field227) {
            int var11 = class23.field227 - arg2;
            arg4 -= var11;
            arg2 = class23.field227;
            var10 += arg3 * var11;
            var7 += class23.field231 * var11;
        }
        if (arg2 + arg4 > class23.field228) {
            arg4 -= arg2 + arg4 - class23.field228;
        }
        if (arg1 < class23.field229) {
            int var12 = class23.field229 - arg1;
            arg3 -= var12;
            arg1 = class23.field229;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class23.field232) {
            int var13 = arg1 + arg3 - class23.field232;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method113(class23.field226, super.field186[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class23.field231 * arg2 + arg1;
        int var9 = class23.field231 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class23.field227) {
            int var12 = class23.field227 - arg2;
            arg4 -= var12;
            arg2 = class23.field227;
            var11 += arg3 * var12;
            var8 += class23.field231 * var12;
        }
        if (arg2 + arg4 > class23.field228) {
            arg4 -= arg2 + arg4 - class23.field228;
        }
        if (arg1 < class23.field229) {
            int var13 = class23.field229 - arg1;
            arg3 -= var13;
            arg1 = class23.field229;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class23.field232) {
            int var14 = arg1 + arg3 - class23.field232;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method102(class23.field226, super.field186[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 101)
    public class33(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
