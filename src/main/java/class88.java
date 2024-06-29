import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class114 {

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B)V")
    public class88(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class88(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIIII)V")
    public final void method626(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class38.field924 * arg2 + arg1;
        int var9 = class38.field924 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class38.field922) {
            int var12 = class38.field922 - arg2;
            arg4 -= var12;
            arg2 = class38.field922;
            var11 += arg3 * var12;
            var8 += class38.field924 * var12;
        }
        if (arg2 + arg4 > class38.field926) {
            arg4 -= arg2 + arg4 - class38.field926;
        }
        if (arg1 < class38.field928) {
            int var13 = class38.field928 - arg1;
            arg3 -= var13;
            arg1 = class38.field928;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class38.field925) {
            int var14 = arg1 + arg3 - class38.field925;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class114.method870(class38.field923, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BIIIII)V")
    public final void method627(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class38.field924 * arg2 + arg1;
        int var8 = class38.field924 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class38.field922) {
            int var11 = class38.field922 - arg2;
            arg4 -= var11;
            arg2 = class38.field922;
            var10 += arg3 * var11;
            var7 += class38.field924 * var11;
        }
        if (arg2 + arg4 > class38.field926) {
            arg4 -= arg2 + arg4 - class38.field926;
        }
        if (arg1 < class38.field928) {
            int var12 = class38.field928 - arg1;
            arg3 -= var12;
            arg1 = class38.field928;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class38.field925) {
            int var13 = arg1 + arg3 - class38.field925;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class114.method859(class38.field923, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
