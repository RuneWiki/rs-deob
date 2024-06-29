import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class177 extends class198 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(IIIIII)V")
    public final void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class62.field1050 * arg2 + arg1;
        int var8 = class62.field1050 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class62.field1049) {
            int var11 = class62.field1049 - arg2;
            arg4 -= var11;
            arg2 = class62.field1049;
            var10 += arg3 * var11;
            var7 += class62.field1050 * var11;
        }
        if (arg2 + arg4 > class62.field1048) {
            arg4 -= arg2 + arg4 - class62.field1048;
        }
        if (arg1 < class62.field1051) {
            int var12 = class62.field1051 - arg1;
            arg3 -= var12;
            arg1 = class62.field1051;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class62.field1047) {
            int var13 = arg1 + arg3 - class62.field1047;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class198.method1282(class62.field1052, super.field3731[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class177(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V")
    public class177(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
    public final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class62.field1050 * arg2 + arg1;
        int var9 = class62.field1050 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class62.field1049) {
            int var12 = class62.field1049 - arg2;
            arg4 -= var12;
            arg2 = class62.field1049;
            var11 += arg3 * var12;
            var8 += class62.field1050 * var12;
        }
        if (arg2 + arg4 > class62.field1048) {
            arg4 -= arg2 + arg4 - class62.field1048;
        }
        if (arg1 < class62.field1051) {
            int var13 = class62.field1051 - arg1;
            arg3 -= var13;
            arg1 = class62.field1051;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class62.field1047) {
            int var14 = arg1 + arg3 - class62.field1047;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class198.method1258(class62.field1052, super.field3731[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
