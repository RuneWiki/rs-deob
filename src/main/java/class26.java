import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class26 extends class37 {

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class26(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class196.field3872 * arg2 + arg1;
        int var9 = class196.field3872 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class196.field3873) {
            int var12 = class196.field3873 - arg2;
            arg4 -= var12;
            arg2 = class196.field3873;
            var11 += arg3 * var12;
            var8 += class196.field3872 * var12;
        }
        if (arg2 + arg4 > class196.field3867) {
            arg4 -= arg2 + arg4 - class196.field3867;
        }
        if (arg1 < class196.field3870) {
            int var13 = class196.field3870 - arg1;
            arg3 -= var13;
            arg1 = class196.field3870;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class196.field3869) {
            int var14 = arg1 + arg3 - class196.field3869;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class37.method289(class196.field3871, super.field758[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class196.field3872 * arg2 + arg1;
        int var8 = class196.field3872 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class196.field3873) {
            int var11 = class196.field3873 - arg2;
            arg4 -= var11;
            arg2 = class196.field3873;
            var10 += arg3 * var11;
            var7 += class196.field3872 * var11;
        }
        if (arg2 + arg4 > class196.field3867) {
            arg4 -= arg2 + arg4 - class196.field3867;
        }
        if (arg1 < class196.field3870) {
            int var12 = class196.field3870 - arg1;
            arg3 -= var12;
            arg1 = class196.field3870;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class196.field3869) {
            int var13 = arg1 + arg3 - class196.field3869;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class37.method280(class196.field3871, super.field758[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B)V")
    public class26(byte[] arg0) {
        super(arg0);
    }
}
