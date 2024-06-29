import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class179 extends class70 {

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V")
    public class179(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(IIIIIII)V")
    public final void method663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class178.field3644 * arg2 + arg1;
        int var9 = class178.field3644 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class178.field3648) {
            int var12 = class178.field3648 - arg2;
            arg4 -= var12;
            arg2 = class178.field3648;
            var11 += arg3 * var12;
            var8 += class178.field3644 * var12;
        }
        if (arg2 + arg4 > class178.field3646) {
            arg4 -= arg2 + arg4 - class178.field3646;
        }
        if (arg1 < class178.field3645) {
            int var13 = class178.field3645 - arg1;
            arg3 -= var13;
            arg1 = class178.field3645;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class178.field3647) {
            int var14 = arg1 + arg3 - class178.field3647;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class70.method661(class178.field3650, super.field1742[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(IIIIII)V")
    public final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class178.field3644 * arg2 + arg1;
        int var8 = class178.field3644 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class178.field3648) {
            int var11 = class178.field3648 - arg2;
            arg4 -= var11;
            arg2 = class178.field3648;
            var10 += arg3 * var11;
            var7 += class178.field3644 * var11;
        }
        if (arg2 + arg4 > class178.field3646) {
            arg4 -= arg2 + arg4 - class178.field3646;
        }
        if (arg1 < class178.field3645) {
            int var12 = class178.field3645 - arg1;
            arg3 -= var12;
            arg1 = class178.field3645;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class178.field3647) {
            int var13 = arg1 + arg3 - class178.field3647;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class70.method664(class178.field3650, super.field1742[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class179(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
