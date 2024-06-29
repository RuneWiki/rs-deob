import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends class21 {

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(IIIIII)V", line = 4)
    public final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class2.field45 * arg2 + arg1;
        int var8 = class2.field45 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class2.field44) {
            int var11 = class2.field44 - arg2;
            arg4 -= var11;
            arg2 = class2.field44;
            var10 += arg3 * var11;
            var7 += class2.field45 * var11;
        }
        if (arg2 + arg4 > class2.field43) {
            arg4 -= arg2 + arg4 - class2.field43;
        }
        if (arg1 < class2.field42) {
            int var12 = class2.field42 - arg1;
            arg3 -= var12;
            arg1 = class2.field42;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class2.field46) {
            int var13 = arg1 + arg3 - class2.field46;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method129(class2.field48, super.field227[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(IIIIIII)V", line = 53)
    public final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class2.field45 * arg2 + arg1;
        int var9 = class2.field45 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class2.field44) {
            int var12 = class2.field44 - arg2;
            arg4 -= var12;
            arg2 = class2.field44;
            var11 += arg3 * var12;
            var8 += class2.field45 * var12;
        }
        if (arg2 + arg4 > class2.field43) {
            arg4 -= arg2 + arg4 - class2.field43;
        }
        if (arg1 < class2.field42) {
            int var13 = class2.field42 - arg1;
            arg3 -= var13;
            arg1 = class2.field42;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class2.field46) {
            int var14 = arg1 + arg3 - class2.field46;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method124(class2.field48, super.field227[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 101)
    public class10(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
