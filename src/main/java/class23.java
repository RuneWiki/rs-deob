import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class23 extends class10 {

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V", line = 5)
    public class23(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class37.field502 * arg2 + arg1;
        int var9 = class37.field502 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class37.field503) {
            int var12 = class37.field503 - arg2;
            arg4 -= var12;
            arg2 = class37.field503;
            var11 += arg3 * var12;
            var8 += class37.field502 * var12;
        }
        if (arg2 + arg4 > class37.field506) {
            arg4 -= arg2 + arg4 - class37.field506;
        }
        if (arg1 < class37.field505) {
            int var13 = class37.field505 - arg1;
            arg3 -= var13;
            arg1 = class37.field505;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class37.field504) {
            int var14 = arg1 + arg3 - class37.field504;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class10.method44(class37.field501, super.field126[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(IIIIII)V", line = 58)
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class37.field502 * arg2 + arg1;
        int var8 = class37.field502 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class37.field503) {
            int var11 = class37.field503 - arg2;
            arg4 -= var11;
            arg2 = class37.field503;
            var10 += arg3 * var11;
            var7 += class37.field502 * var11;
        }
        if (arg2 + arg4 > class37.field506) {
            arg4 -= arg2 + arg4 - class37.field506;
        }
        if (arg1 < class37.field505) {
            int var12 = class37.field505 - arg1;
            arg3 -= var12;
            arg1 = class37.field505;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class37.field504) {
            int var13 = arg1 + arg3 - class37.field504;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class10.method50(class37.field501, super.field126[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
