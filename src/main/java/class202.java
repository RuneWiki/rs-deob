import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class202 extends class151 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(IIIIII)V")
    public final void method944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class168.field3338 * arg2 + arg1;
        int var8 = class168.field3338 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class168.field3336) {
            int var11 = class168.field3336 - arg2;
            arg4 -= var11;
            arg2 = class168.field3336;
            var10 += arg3 * var11;
            var7 += class168.field3338 * var11;
        }
        if (arg2 + arg4 > class168.field3339) {
            arg4 -= arg2 + arg4 - class168.field3339;
        }
        if (arg1 < class168.field3340) {
            int var12 = class168.field3340 - arg1;
            arg3 -= var12;
            arg1 = class168.field3340;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class168.field3335) {
            int var13 = arg1 + arg3 - class168.field3335;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class151.method950(class168.field3334, super.field3064[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
    public final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class168.field3338 * arg2 + arg1;
        int var9 = class168.field3338 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class168.field3336) {
            int var12 = class168.field3336 - arg2;
            arg4 -= var12;
            arg2 = class168.field3336;
            var11 += arg3 * var12;
            var8 += class168.field3338 * var12;
        }
        if (arg2 + arg4 > class168.field3339) {
            arg4 -= arg2 + arg4 - class168.field3339;
        }
        if (arg1 < class168.field3340) {
            int var13 = class168.field3340 - arg1;
            arg3 -= var13;
            arg1 = class168.field3340;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class168.field3335) {
            int var14 = arg1 + arg3 - class168.field3335;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class151.method947(class168.field3334, super.field3064[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
    public class202(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class202(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
