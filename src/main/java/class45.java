import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class45 extends class156 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V")
    public final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class118.field2202 * arg2 + arg1;
        int var9 = class118.field2202 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class118.field2203) {
            int var12 = class118.field2203 - arg2;
            arg4 -= var12;
            arg2 = class118.field2203;
            var11 += arg3 * var12;
            var8 += class118.field2202 * var12;
        }
        if (arg2 + arg4 > class118.field2200) {
            arg4 -= arg2 + arg4 - class118.field2200;
        }
        if (arg1 < class118.field2205) {
            int var13 = class118.field2205 - arg1;
            arg3 -= var13;
            arg1 = class118.field2205;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class118.field2206) {
            int var14 = arg1 + arg3 - class118.field2206;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class156.method994(class118.field2204, super.field3080[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(IIIIII)V")
    public final void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class118.field2202 * arg2 + arg1;
        int var8 = class118.field2202 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class118.field2203) {
            int var11 = class118.field2203 - arg2;
            arg4 -= var11;
            arg2 = class118.field2203;
            var10 += arg3 * var11;
            var7 += class118.field2202 * var11;
        }
        if (arg2 + arg4 > class118.field2200) {
            arg4 -= arg2 + arg4 - class118.field2200;
        }
        if (arg1 < class118.field2205) {
            int var12 = class118.field2205 - arg1;
            arg3 -= var12;
            arg1 = class118.field2205;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class118.field2206) {
            int var13 = arg1 + arg3 - class118.field2206;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class156.method1001(class118.field2204, super.field3080[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class45(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        super(arg0);
    }
}
