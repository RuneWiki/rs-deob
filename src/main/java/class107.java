import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class107 extends class77 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(IIIIII)V")
    public final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class71.field1755 * arg2 + arg1;
        int var8 = class71.field1755 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class71.field1756) {
            int var11 = class71.field1756 - arg2;
            arg4 -= var11;
            arg2 = class71.field1756;
            var10 += arg3 * var11;
            var7 += class71.field1755 * var11;
        }
        if (arg2 + arg4 > class71.field1757) {
            arg4 -= arg2 + arg4 - class71.field1757;
        }
        if (arg1 < class71.field1754) {
            int var12 = class71.field1754 - arg1;
            arg3 -= var12;
            arg1 = class71.field1754;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class71.field1760) {
            int var13 = arg1 + arg3 - class71.field1760;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class77.method659(class71.field1759, super.field1859[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V")
    public class107(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)V")
    public final void method660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class71.field1755 * arg2 + arg1;
        int var9 = class71.field1755 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class71.field1756) {
            int var12 = class71.field1756 - arg2;
            arg4 -= var12;
            arg2 = class71.field1756;
            var11 += arg3 * var12;
            var8 += class71.field1755 * var12;
        }
        if (arg2 + arg4 > class71.field1757) {
            arg4 -= arg2 + arg4 - class71.field1757;
        }
        if (arg1 < class71.field1754) {
            int var13 = class71.field1754 - arg1;
            arg3 -= var13;
            arg1 = class71.field1754;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class71.field1760) {
            int var14 = arg1 + arg3 - class71.field1760;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class77.method661(class71.field1759, super.field1859[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class107(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
