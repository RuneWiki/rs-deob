import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class240 extends class195 {

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class240(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIIII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class23.field451 * arg2 + arg1;
        int var9 = class23.field451 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class23.field449) {
            int var12 = class23.field449 - arg2;
            arg4 -= var12;
            arg2 = class23.field449;
            var11 += arg3 * var12;
            var8 += class23.field451 * var12;
        }
        if (arg2 + arg4 > class23.field450) {
            arg4 -= arg2 + arg4 - class23.field450;
        }
        if (arg1 < class23.field446) {
            int var13 = class23.field446 - arg1;
            arg3 -= var13;
            arg1 = class23.field446;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class23.field448) {
            int var14 = arg1 + arg3 - class23.field448;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class165.method1127(arg4, class23.field445, super.field3307[arg0], var11, arg6, arg3, var9, var8, var10, true, arg5);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
    public final void method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class23.field451 * arg2 + arg1;
        int var8 = class23.field451 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field449) {
            int var11 = class23.field449 - arg2;
            arg4 -= var11;
            arg2 = class23.field449;
            var10 += arg3 * var11;
            var7 += class23.field451 * var11;
        }
        if (arg2 + arg4 > class23.field450) {
            arg4 -= arg2 + arg4 - class23.field450;
        }
        if (arg1 < class23.field446) {
            int var12 = class23.field446 - arg1;
            arg3 -= var12;
            arg1 = class23.field446;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class23.field448) {
            int var13 = arg1 + arg3 - class23.field448;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class152.method1076(-18681, var8, super.field3307[arg0], class23.field445, arg5, var7, arg3, var10, arg4, var9);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    public class240(byte[] arg0) {
        super(arg0);
    }
}
