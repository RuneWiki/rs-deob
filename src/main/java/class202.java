import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class202 extends class172 {

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class202(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
    public final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class111.field2066 * arg2 + arg1;
        int var9 = class111.field2066 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class111.field2063) {
            int var12 = class111.field2063 - arg2;
            arg4 -= var12;
            arg2 = class111.field2063;
            var11 += arg3 * var12;
            var8 += class111.field2066 * var12;
        }
        if (arg2 + arg4 > class111.field2065) {
            arg4 -= arg2 + arg4 - class111.field2065;
        }
        if (arg1 < class111.field2067) {
            int var13 = class111.field2067 - arg1;
            arg3 -= var13;
            arg1 = class111.field2067;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class111.field2068) {
            int var14 = arg1 + arg3 - class111.field2068;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class95.method584(false, var10, var11, arg5, var8, var9, arg6, arg4, super.field2872[arg0], arg3, class111.field2069);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    public class202(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIII)V")
    public final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class111.field2066 * arg2 + arg1;
        int var8 = class111.field2066 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class111.field2063) {
            int var11 = class111.field2063 - arg2;
            arg4 -= var11;
            arg2 = class111.field2063;
            var10 += arg3 * var11;
            var7 += class111.field2066 * var11;
        }
        if (arg2 + arg4 > class111.field2065) {
            arg4 -= arg2 + arg4 - class111.field2065;
        }
        if (arg1 < class111.field2067) {
            int var12 = class111.field2067 - arg1;
            arg3 -= var12;
            arg1 = class111.field2067;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class111.field2068) {
            int var13 = arg1 + arg3 - class111.field2068;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class85.method511(var8, super.field2872[arg0], arg4, (byte) 101, class111.field2069, var10, arg5, arg3, var9, var7);
        }
    }
}
