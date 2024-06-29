import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class184 extends class42 {

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
    public class184(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class184(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIIII)V")
    public final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class55.field688 * arg2 + arg1;
        int var9 = class55.field688 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class55.field684) {
            int var12 = class55.field684 - arg2;
            arg4 -= var12;
            arg2 = class55.field684;
            var11 += arg3 * var12;
            var8 += class55.field688 * var12;
        }
        if (arg2 + arg4 > class55.field685) {
            arg4 -= arg2 + arg4 - class55.field685;
        }
        if (arg1 < class55.field682) {
            int var13 = class55.field682 - arg1;
            arg3 -= var13;
            arg1 = class55.field682;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class55.field687) {
            int var14 = arg1 + arg3 - class55.field687;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class63.method395(arg3, arg5, arg6, arg4, class55.field683, var9, var8, var10, var11, (byte) -120, super.field482[arg0]);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIII)V")
    public final void method1198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class55.field688 * arg2 + arg1;
        int var8 = class55.field688 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class55.field684) {
            int var11 = class55.field684 - arg2;
            arg4 -= var11;
            arg2 = class55.field684;
            var10 += arg3 * var11;
            var7 += class55.field688 * var11;
        }
        if (arg2 + arg4 > class55.field685) {
            arg4 -= arg2 + arg4 - class55.field685;
        }
        if (arg1 < class55.field682) {
            int var12 = class55.field682 - arg1;
            arg3 -= var12;
            arg1 = class55.field682;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class55.field687) {
            int var13 = arg1 + arg3 - class55.field687;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class9.method42(arg3, class55.field683, var8, arg5, super.field482[arg0], arg4, var7, var9, 126, var10);
        }
    }
}
