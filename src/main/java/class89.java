import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class89 extends class13 {

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class89(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(IIIIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class169.field3271 * arg2 + arg1;
        int var9 = class169.field3271 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class169.field3265) {
            int var12 = class169.field3265 - arg2;
            arg4 -= var12;
            arg2 = class169.field3265;
            var11 += arg3 * var12;
            var8 += class169.field3271 * var12;
        }
        if (arg2 + arg4 > class169.field3266) {
            arg4 -= arg2 + arg4 - class169.field3266;
        }
        if (arg1 < class169.field3267) {
            int var13 = class169.field3267 - arg1;
            arg3 -= var13;
            arg1 = class169.field3267;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class169.field3270) {
            int var14 = arg1 + arg3 - class169.field3270;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class13.method117(class169.field3268, super.field273[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
    public class89(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(IIIIII)V")
    public final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class169.field3271 * arg2 + arg1;
        int var8 = class169.field3271 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class169.field3265) {
            int var11 = class169.field3265 - arg2;
            arg4 -= var11;
            arg2 = class169.field3265;
            var10 += arg3 * var11;
            var7 += class169.field3271 * var11;
        }
        if (arg2 + arg4 > class169.field3266) {
            arg4 -= arg2 + arg4 - class169.field3266;
        }
        if (arg1 < class169.field3267) {
            int var12 = class169.field3267 - arg1;
            arg3 -= var12;
            arg1 = class169.field3267;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class169.field3270) {
            int var13 = arg1 + arg3 - class169.field3270;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class13.method109(class169.field3268, super.field273[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
