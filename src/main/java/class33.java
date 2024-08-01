import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("db")
public class class33 extends class17 {

    @OriginalMember(owner = "db", name = "<init>", descriptor = "([B)V")
    public class33(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "db", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class33(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "db", name = "b", descriptor = "(IIIIIII)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class11.field172 * arg2 + arg1;
        int var9 = class11.field172 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class11.field170) {
            int var12 = class11.field170 - arg2;
            arg4 -= var12;
            arg2 = class11.field170;
            var11 += arg3 * var12;
            var8 += class11.field172 * var12;
        }
        if (arg2 + arg4 > class11.field174) {
            arg4 -= arg2 + arg4 - class11.field174;
        }
        if (arg1 < class11.field171) {
            int var13 = class11.field171 - arg1;
            arg3 -= var13;
            arg1 = class11.field171;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class11.field173) {
            int var14 = arg1 + arg3 - class11.field173;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class17.method145(class11.field175, super.field328[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "db", name = "e", descriptor = "(IIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class11.field172 * arg2 + arg1;
        int var8 = class11.field172 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class11.field170) {
            int var11 = class11.field170 - arg2;
            arg4 -= var11;
            arg2 = class11.field170;
            var10 += arg3 * var11;
            var7 += class11.field172 * var11;
        }
        if (arg2 + arg4 > class11.field174) {
            arg4 -= arg2 + arg4 - class11.field174;
        }
        if (arg1 < class11.field171) {
            int var12 = class11.field171 - arg1;
            arg3 -= var12;
            arg1 = class11.field171;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class11.field173) {
            int var13 = arg1 + arg3 - class11.field173;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class17.method141(class11.field175, super.field328[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
