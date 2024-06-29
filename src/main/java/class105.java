import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class105 extends class201 {

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class105(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
    public class105(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIII)V")
    public final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class221.field3833 * arg2 + arg1;
        int var9 = class221.field3833 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class221.field3835) {
            int var12 = class221.field3835 - arg2;
            arg4 -= var12;
            arg2 = class221.field3835;
            var11 += arg3 * var12;
            var8 += class221.field3833 * var12;
        }
        if (arg2 + arg4 > class221.field3836) {
            arg4 -= arg2 + arg4 - class221.field3836;
        }
        if (arg1 < class221.field3837) {
            int var13 = class221.field3837 - arg1;
            arg3 -= var13;
            arg1 = class221.field3837;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class221.field3832) {
            int var14 = arg1 + arg3 - class221.field3832;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class201.method1264(class221.field3834, super.field3573[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(IIIIII)V")
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class221.field3833 * arg2 + arg1;
        int var8 = class221.field3833 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class221.field3835) {
            int var11 = class221.field3835 - arg2;
            arg4 -= var11;
            arg2 = class221.field3835;
            var10 += arg3 * var11;
            var7 += class221.field3833 * var11;
        }
        if (arg2 + arg4 > class221.field3836) {
            arg4 -= arg2 + arg4 - class221.field3836;
        }
        if (arg1 < class221.field3837) {
            int var12 = class221.field3837 - arg1;
            arg3 -= var12;
            arg1 = class221.field3837;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class221.field3832) {
            int var13 = arg1 + arg3 - class221.field3832;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class201.method1269(class221.field3834, super.field3573[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
