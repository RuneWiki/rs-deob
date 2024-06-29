import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class38 extends class46 {

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    public class38(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIIIII)V")
    public final void method302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class158.field2724 * arg2 + arg1;
        int var9 = class158.field2724 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class158.field2727) {
            int var12 = class158.field2727 - arg2;
            arg4 -= var12;
            arg2 = class158.field2727;
            var11 += arg3 * var12;
            var8 += class158.field2724 * var12;
        }
        if (arg2 + arg4 > class158.field2726) {
            arg4 -= arg2 + arg4 - class158.field2726;
        }
        if (arg1 < class158.field2728) {
            int var13 = class158.field2728 - arg1;
            arg3 -= var13;
            arg1 = class158.field2728;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class158.field2725) {
            int var14 = arg1 + arg3 - class158.field2725;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class29.method262(super.field845[arg0], var10, class158.field2729, arg5, var9, arg3, var11, false, arg4, arg6, var8);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class38(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class158.field2724 * arg2 + arg1;
        int var8 = class158.field2724 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class158.field2727) {
            int var11 = class158.field2727 - arg2;
            arg4 -= var11;
            arg2 = class158.field2727;
            var10 += arg3 * var11;
            var7 += class158.field2724 * var11;
        }
        if (arg2 + arg4 > class158.field2726) {
            arg4 -= arg2 + arg4 - class158.field2726;
        }
        if (arg1 < class158.field2728) {
            int var12 = class158.field2728 - arg1;
            arg3 -= var12;
            arg1 = class158.field2728;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class158.field2725) {
            int var13 = arg1 + arg3 - class158.field2725;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class119.method862((byte) 72, class158.field2729, var10, var9, arg5, var7, arg4, super.field845[arg0], var8, arg3);
        }
    }
}
