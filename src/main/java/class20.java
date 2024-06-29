import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class20 extends class19 {

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(IIIIII)V", line = 4)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class32.field445 * arg2 + arg1;
        int var8 = class32.field445 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class32.field444) {
            int var11 = class32.field444 - arg2;
            arg4 -= var11;
            arg2 = class32.field444;
            var10 += arg3 * var11;
            var7 += class32.field445 * var11;
        }
        if (arg2 + arg4 > class32.field448) {
            arg4 -= arg2 + arg4 - class32.field448;
        }
        if (arg1 < class32.field442) {
            int var12 = class32.field442 - arg1;
            arg3 -= var12;
            arg1 = class32.field442;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class32.field447) {
            int var13 = arg1 + arg3 - class32.field447;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class19.method93(class32.field446, super.field170[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIIIIII)V", line = 52)
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class32.field445 * arg2 + arg1;
        int var9 = class32.field445 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class32.field444) {
            int var12 = class32.field444 - arg2;
            arg4 -= var12;
            arg2 = class32.field444;
            var11 += arg3 * var12;
            var8 += class32.field445 * var12;
        }
        if (arg2 + arg4 > class32.field448) {
            arg4 -= arg2 + arg4 - class32.field448;
        }
        if (arg1 < class32.field442) {
            int var13 = class32.field442 - arg1;
            arg3 -= var13;
            arg1 = class32.field442;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class32.field447) {
            int var14 = arg1 + arg3 - class32.field447;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class19.method96(class32.field446, super.field170[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 100)
    public class20(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
