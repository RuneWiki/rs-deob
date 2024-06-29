import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 extends class56 {

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class69(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class69(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIIII)V")
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class99.field1818 * arg2 + arg1;
        int var9 = class99.field1818 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class99.field1821) {
            int var12 = class99.field1821 - arg2;
            arg4 -= var12;
            arg2 = class99.field1821;
            var11 += arg3 * var12;
            var8 += class99.field1818 * var12;
        }
        if (arg2 + arg4 > class99.field1820) {
            arg4 -= arg2 + arg4 - class99.field1820;
        }
        if (arg1 < class99.field1819) {
            int var13 = class99.field1819 - arg1;
            arg3 -= var13;
            arg1 = class99.field1819;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class99.field1817) {
            int var14 = arg1 + arg3 - class99.field1817;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class56.method399(class99.field1823, super.field1051[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(IIIIII)V")
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class99.field1818 * arg2 + arg1;
        int var8 = class99.field1818 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class99.field1821) {
            int var11 = class99.field1821 - arg2;
            arg4 -= var11;
            arg2 = class99.field1821;
            var10 += arg3 * var11;
            var7 += class99.field1818 * var11;
        }
        if (arg2 + arg4 > class99.field1820) {
            arg4 -= arg2 + arg4 - class99.field1820;
        }
        if (arg1 < class99.field1819) {
            int var12 = class99.field1819 - arg1;
            arg3 -= var12;
            arg1 = class99.field1819;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class99.field1817) {
            int var13 = arg1 + arg3 - class99.field1817;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class56.method402(class99.field1823, super.field1051[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
