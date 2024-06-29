import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class178 extends class142 {

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class178(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIIII)V")
    public final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class53.field1010 * arg2 + arg1;
        int var9 = class53.field1010 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class53.field1008) {
            int var12 = class53.field1008 - arg2;
            arg4 -= var12;
            arg2 = class53.field1008;
            var11 += arg3 * var12;
            var8 += class53.field1010 * var12;
        }
        if (arg2 + arg4 > class53.field1011) {
            arg4 -= arg2 + arg4 - class53.field1011;
        }
        if (arg1 < class53.field1013) {
            int var13 = class53.field1013 - arg1;
            arg3 -= var13;
            arg1 = class53.field1013;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class53.field1012) {
            int var14 = arg1 + arg3 - class53.field1012;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class142.method896(class53.field1007, super.field2738[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class53.field1010 * arg2 + arg1;
        int var8 = class53.field1010 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class53.field1008) {
            int var11 = class53.field1008 - arg2;
            arg4 -= var11;
            arg2 = class53.field1008;
            var10 += arg3 * var11;
            var7 += class53.field1010 * var11;
        }
        if (arg2 + arg4 > class53.field1011) {
            arg4 -= arg2 + arg4 - class53.field1011;
        }
        if (arg1 < class53.field1013) {
            int var12 = class53.field1013 - arg1;
            arg3 -= var12;
            arg1 = class53.field1013;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class53.field1012) {
            int var13 = arg1 + arg3 - class53.field1012;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class142.method887(class53.field1007, super.field2738[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
    public class178(byte[] arg0) {
        super(arg0);
    }
}
