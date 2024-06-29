import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class27 extends class8 {

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(IIIIIII)V", line = 5)
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class12.field118 * arg2 + arg1;
        int var9 = class12.field118 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class12.field117) {
            int var12 = class12.field117 - arg2;
            arg4 -= var12;
            arg2 = class12.field117;
            var11 += arg3 * var12;
            var8 += class12.field118 * var12;
        }
        if (arg2 + arg4 > class12.field119) {
            arg4 -= arg2 + arg4 - class12.field119;
        }
        if (arg1 < class12.field114) {
            int var13 = class12.field114 - arg1;
            arg3 -= var13;
            arg1 = class12.field114;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class12.field120) {
            int var14 = arg1 + arg3 - class12.field120;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class14.method79(-79, arg3, var10, var8, class12.field115, arg6, super.field85[arg0], var9, arg4, var11, arg5);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 52)
    public class27(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IIIIII)V", line = 58)
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class12.field118 * arg2 + arg1;
        int var8 = class12.field118 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class12.field117) {
            int var11 = class12.field117 - arg2;
            arg4 -= var11;
            arg2 = class12.field117;
            var10 += arg3 * var11;
            var7 += class12.field118 * var11;
        }
        if (arg2 + arg4 > class12.field119) {
            arg4 -= arg2 + arg4 - class12.field119;
        }
        if (arg1 < class12.field114) {
            int var12 = class12.field114 - arg1;
            arg3 -= var12;
            arg1 = class12.field114;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class12.field120) {
            int var13 = arg1 + arg3 - class12.field120;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class13.method76(0, arg4, var9, arg5, arg3, var8, class12.field115, var7, var10, super.field85[arg0]);
        }
    }
}
