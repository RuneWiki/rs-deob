import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class80 extends class137 {

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(IIIIII)V")
    public final void method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class148.field2883 * arg2 + arg1;
        int var8 = class148.field2883 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class148.field2884) {
            int var11 = class148.field2884 - arg2;
            arg4 -= var11;
            arg2 = class148.field2884;
            var10 += arg3 * var11;
            var7 += class148.field2883 * var11;
        }
        if (arg2 + arg4 > class148.field2887) {
            arg4 -= arg2 + arg4 - class148.field2887;
        }
        if (arg1 < class148.field2888) {
            int var12 = class148.field2888 - arg1;
            arg3 -= var12;
            arg1 = class148.field2888;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class148.field2885) {
            int var13 = arg1 + arg3 - class148.field2885;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class137.method878(class148.field2882, super.field2626[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class80(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII)V")
    public final void method562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class148.field2883 * arg2 + arg1;
        int var9 = class148.field2883 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class148.field2884) {
            int var12 = class148.field2884 - arg2;
            arg4 -= var12;
            arg2 = class148.field2884;
            var11 += arg3 * var12;
            var8 += class148.field2883 * var12;
        }
        if (arg2 + arg4 > class148.field2887) {
            arg4 -= arg2 + arg4 - class148.field2887;
        }
        if (arg1 < class148.field2888) {
            int var13 = class148.field2888 - arg1;
            arg3 -= var13;
            arg1 = class148.field2888;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class148.field2885) {
            int var14 = arg1 + arg3 - class148.field2885;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class137.method867(class148.field2882, super.field2626[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
