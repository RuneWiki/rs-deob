import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class66 extends class24 {

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class66(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class17.field282 * arg2 + arg1;
        int var9 = class17.field282 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class17.field285) {
            int var12 = class17.field285 - arg2;
            arg4 -= var12;
            arg2 = class17.field285;
            var11 += arg3 * var12;
            var8 += class17.field282 * var12;
        }
        if (arg2 + arg4 > class17.field281) {
            arg4 -= arg2 + arg4 - class17.field281;
        }
        if (arg1 < class17.field283) {
            int var13 = class17.field283 - arg1;
            arg3 -= var13;
            arg1 = class17.field283;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class17.field279) {
            int var14 = arg1 + arg3 - class17.field279;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class24.method189(class17.field284, super.field408[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(IIIIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class17.field282 * arg2 + arg1;
        int var8 = class17.field282 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class17.field285) {
            int var11 = class17.field285 - arg2;
            arg4 -= var11;
            arg2 = class17.field285;
            var10 += arg3 * var11;
            var7 += class17.field282 * var11;
        }
        if (arg2 + arg4 > class17.field281) {
            arg4 -= arg2 + arg4 - class17.field281;
        }
        if (arg1 < class17.field283) {
            int var12 = class17.field283 - arg1;
            arg3 -= var12;
            arg1 = class17.field283;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class17.field279) {
            int var13 = arg1 + arg3 - class17.field279;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class24.method183(class17.field284, super.field408[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([B)V")
    public class66(byte[] arg0) {
        super(arg0);
    }
}
