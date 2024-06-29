import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class11 extends class137 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class216.field3729 * arg2 + arg1;
        int var9 = class216.field3729 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class216.field3732) {
            int var12 = class216.field3732 - arg2;
            arg4 -= var12;
            arg2 = class216.field3732;
            var11 += arg3 * var12;
            var8 += class216.field3729 * var12;
        }
        if (arg2 + arg4 > class216.field3727) {
            arg4 -= arg2 + arg4 - class216.field3727;
        }
        if (arg1 < class216.field3733) {
            int var13 = class216.field3733 - arg1;
            arg3 -= var13;
            arg1 = class216.field3733;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class216.field3728) {
            int var14 = arg1 + arg3 - class216.field3728;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class56.method391(arg3, var9, var8, var11, super.field2420[arg0], (byte) -20, class216.field3731, arg5, arg4, arg6, var10);
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
    public class11(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class11(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class216.field3729 * arg2 + arg1;
        int var8 = class216.field3729 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class216.field3732) {
            int var11 = class216.field3732 - arg2;
            arg4 -= var11;
            arg2 = class216.field3732;
            var10 += arg3 * var11;
            var7 += class216.field3729 * var11;
        }
        if (arg2 + arg4 > class216.field3727) {
            arg4 -= arg2 + arg4 - class216.field3727;
        }
        if (arg1 < class216.field3733) {
            int var12 = class216.field3733 - arg1;
            arg3 -= var12;
            arg1 = class216.field3733;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class216.field3728) {
            int var13 = arg1 + arg3 - class216.field3728;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class83.method550(arg4, var9, 115, var8, var10, arg5, super.field2420[arg0], class216.field3731, var7, arg3);
        }
    }
}
