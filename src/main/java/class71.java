import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class71 extends class117 {

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(IIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class130.field2424 * arg2 + arg1;
        int var8 = class130.field2424 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class130.field2425) {
            int var11 = class130.field2425 - arg2;
            arg4 -= var11;
            arg2 = class130.field2425;
            var10 += arg3 * var11;
            var7 += class130.field2424 * var11;
        }
        if (arg2 + arg4 > class130.field2428) {
            arg4 -= arg2 + arg4 - class130.field2428;
        }
        if (arg1 < class130.field2422) {
            int var12 = class130.field2422 - arg1;
            arg3 -= var12;
            arg1 = class130.field2422;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class130.field2423) {
            int var13 = arg1 + arg3 - class130.field2423;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class117.method728(class130.field2426, super.field2171[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V")
    public class71(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class71(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class130.field2424 * arg2 + arg1;
        int var9 = class130.field2424 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class130.field2425) {
            int var12 = class130.field2425 - arg2;
            arg4 -= var12;
            arg2 = class130.field2425;
            var11 += arg3 * var12;
            var8 += class130.field2424 * var12;
        }
        if (arg2 + arg4 > class130.field2428) {
            arg4 -= arg2 + arg4 - class130.field2428;
        }
        if (arg1 < class130.field2422) {
            int var13 = class130.field2422 - arg1;
            arg3 -= var13;
            arg1 = class130.field2422;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class130.field2423) {
            int var14 = arg1 + arg3 - class130.field2423;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class117.method731(class130.field2426, super.field2171[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
