import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class37 extends class23 {

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 3)
    public class37(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IIIIII)V", line = 8)
    public final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class27.field397 * arg2 + arg1;
        int var8 = class27.field397 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class27.field402) {
            int var11 = class27.field402 - arg2;
            arg4 -= var11;
            arg2 = class27.field402;
            var10 += arg3 * var11;
            var7 += class27.field397 * var11;
        }
        if (arg2 + arg4 > class27.field398) {
            arg4 -= arg2 + arg4 - class27.field398;
        }
        if (arg1 < class27.field401) {
            int var12 = class27.field401 - arg1;
            arg3 -= var12;
            arg1 = class27.field401;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class27.field400) {
            int var13 = arg1 + arg3 - class27.field400;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class23.method162(class27.field399, super.field259[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIIIII)V", line = 56)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class27.field397 * arg2 + arg1;
        int var9 = class27.field397 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class27.field402) {
            int var12 = class27.field402 - arg2;
            arg4 -= var12;
            arg2 = class27.field402;
            var11 += arg3 * var12;
            var8 += class27.field397 * var12;
        }
        if (arg2 + arg4 > class27.field398) {
            arg4 -= arg2 + arg4 - class27.field398;
        }
        if (arg1 < class27.field401) {
            int var13 = class27.field401 - arg1;
            arg3 -= var13;
            arg1 = class27.field401;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class27.field400) {
            int var14 = arg1 + arg3 - class27.field400;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class23.method160(class27.field399, super.field259[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
