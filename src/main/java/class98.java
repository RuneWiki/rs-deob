import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class98 extends class208 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class239.field4313 * arg2 + arg1;
        int var9 = class239.field4313 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class239.field4309) {
            int var12 = class239.field4309 - arg2;
            arg4 -= var12;
            arg2 = class239.field4309;
            var11 += arg3 * var12;
            var8 += class239.field4313 * var12;
        }
        if (arg2 + arg4 > class239.field4311) {
            arg4 -= arg2 + arg4 - class239.field4311;
        }
        if (arg1 < class239.field4312) {
            int var13 = class239.field4312 - arg1;
            arg3 -= var13;
            arg1 = class239.field4312;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class239.field4310) {
            int var14 = arg1 + arg3 - class239.field4310;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class31.method219(arg4, arg5, (byte) -72, class239.field4308, super.field3786[arg0], var8, var10, var9, arg6, arg3, var11);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
    public class98(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class98(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class239.field4313 * arg2 + arg1;
        int var8 = class239.field4313 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class239.field4309) {
            int var11 = class239.field4309 - arg2;
            arg4 -= var11;
            arg2 = class239.field4309;
            var10 += arg3 * var11;
            var7 += class239.field4313 * var11;
        }
        if (arg2 + arg4 > class239.field4311) {
            arg4 -= arg2 + arg4 - class239.field4311;
        }
        if (arg1 < class239.field4312) {
            int var12 = class239.field4312 - arg1;
            arg3 -= var12;
            arg1 = class239.field4312;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class239.field4310) {
            int var13 = arg1 + arg3 - class239.field4310;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class222.method1393(arg4, var9, arg5, var7, true, arg3, var8, super.field3786[arg0], class239.field4308, var10);
        }
    }
}
