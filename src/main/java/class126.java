import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class126 extends class83 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class173.field3504 * arg2 + arg1;
        int var9 = class173.field3504 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class173.field3506) {
            int var12 = class173.field3506 - arg2;
            arg4 -= var12;
            arg2 = class173.field3506;
            var11 += arg3 * var12;
            var8 += class173.field3504 * var12;
        }
        if (arg2 + arg4 > class173.field3501) {
            arg4 -= arg2 + arg4 - class173.field3501;
        }
        if (arg1 < class173.field3503) {
            int var13 = class173.field3503 - arg1;
            arg3 -= var13;
            arg1 = class173.field3503;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class173.field3507) {
            int var14 = arg1 + arg3 - class173.field3507;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class83.method569(class173.field3502, super.field1685[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(IIIIII)V")
    public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class173.field3504 * arg2 + arg1;
        int var8 = class173.field3504 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class173.field3506) {
            int var11 = class173.field3506 - arg2;
            arg4 -= var11;
            arg2 = class173.field3506;
            var10 += arg3 * var11;
            var7 += class173.field3504 * var11;
        }
        if (arg2 + arg4 > class173.field3501) {
            arg4 -= arg2 + arg4 - class173.field3501;
        }
        if (arg1 < class173.field3503) {
            int var12 = class173.field3503 - arg1;
            arg3 -= var12;
            arg1 = class173.field3503;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class173.field3507) {
            int var13 = arg1 + arg3 - class173.field3507;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class83.method570(class173.field3502, super.field1685[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class126(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class126(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
