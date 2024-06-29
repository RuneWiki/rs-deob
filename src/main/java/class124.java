import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class124 extends class211 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class4.field74 * arg2 + arg1;
        int var9 = class4.field74 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class4.field70) {
            int var12 = class4.field70 - arg2;
            arg4 -= var12;
            arg2 = class4.field70;
            var11 += arg3 * var12;
            var8 += class4.field74 * var12;
        }
        if (arg2 + arg4 > class4.field69) {
            arg4 -= arg2 + arg4 - class4.field69;
        }
        if (arg1 < class4.field72) {
            int var13 = class4.field72 - arg1;
            arg3 -= var13;
            arg1 = class4.field72;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class4.field73) {
            int var14 = arg1 + arg3 - class4.field73;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class211.method1342(class4.field71, super.field4100[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
    public class124(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(IIIIII)V")
    public final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class4.field74 * arg2 + arg1;
        int var8 = class4.field74 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class4.field70) {
            int var11 = class4.field70 - arg2;
            arg4 -= var11;
            arg2 = class4.field70;
            var10 += arg3 * var11;
            var7 += class4.field74 * var11;
        }
        if (arg2 + arg4 > class4.field69) {
            arg4 -= arg2 + arg4 - class4.field69;
        }
        if (arg1 < class4.field72) {
            int var12 = class4.field72 - arg1;
            arg3 -= var12;
            arg1 = class4.field72;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class4.field73) {
            int var13 = arg1 + arg3 - class4.field73;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class211.method1350(class4.field71, super.field4100[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class124(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
