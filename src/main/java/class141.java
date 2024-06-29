import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 extends class156 {

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
    public class141(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIII)V")
    public final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class129.field2911 * arg2 + arg1;
        int var9 = class129.field2911 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class129.field2912) {
            int var12 = class129.field2912 - arg2;
            arg4 -= var12;
            arg2 = class129.field2912;
            var11 += arg3 * var12;
            var8 += class129.field2911 * var12;
        }
        if (arg2 + arg4 > class129.field2909) {
            arg4 -= arg2 + arg4 - class129.field2909;
        }
        if (arg1 < class129.field2907) {
            int var13 = class129.field2907 - arg1;
            arg3 -= var13;
            arg1 = class129.field2907;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class129.field2910) {
            int var14 = arg1 + arg3 - class129.field2910;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class156.method1148(class129.field2906, super.field3383[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class141(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(IIIIII)V")
    public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class129.field2911 * arg2 + arg1;
        int var8 = class129.field2911 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class129.field2912) {
            int var11 = class129.field2912 - arg2;
            arg4 -= var11;
            arg2 = class129.field2912;
            var10 += arg3 * var11;
            var7 += class129.field2911 * var11;
        }
        if (arg2 + arg4 > class129.field2909) {
            arg4 -= arg2 + arg4 - class129.field2909;
        }
        if (arg1 < class129.field2907) {
            int var12 = class129.field2907 - arg1;
            arg3 -= var12;
            arg1 = class129.field2907;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class129.field2910) {
            int var13 = arg1 + arg3 - class129.field2910;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class156.method1132(class129.field2906, super.field3383[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
