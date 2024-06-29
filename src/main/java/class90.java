import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class90 extends class229 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class48.field956 * arg2 + arg1;
        int var8 = class48.field956 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class48.field959) {
            int var11 = class48.field959 - arg2;
            arg4 -= var11;
            arg2 = class48.field959;
            var10 += arg3 * var11;
            var7 += class48.field956 * var11;
        }
        if (arg2 + arg4 > class48.field961) {
            arg4 -= arg2 + arg4 - class48.field961;
        }
        if (arg1 < class48.field960) {
            int var12 = class48.field960 - arg1;
            arg3 -= var12;
            arg1 = class48.field960;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class48.field957) {
            int var13 = arg1 + arg3 - class48.field957;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class147.method1013(-116, var9, class48.field955, var10, var7, var8, arg4, arg5, super.field4209[arg0], arg3);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
    public class90(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
    public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class48.field956 * arg2 + arg1;
        int var9 = class48.field956 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class48.field959) {
            int var12 = class48.field959 - arg2;
            arg4 -= var12;
            arg2 = class48.field959;
            var11 += arg3 * var12;
            var8 += class48.field956 * var12;
        }
        if (arg2 + arg4 > class48.field961) {
            arg4 -= arg2 + arg4 - class48.field961;
        }
        if (arg1 < class48.field960) {
            int var13 = class48.field960 - arg1;
            arg3 -= var13;
            arg1 = class48.field960;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class48.field957) {
            int var14 = arg1 + arg3 - class48.field957;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class63.method471((byte) -16, arg6, var9, var8, arg3, arg5, var11, class48.field955, arg4, var10, super.field4209[arg0]);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class90(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
