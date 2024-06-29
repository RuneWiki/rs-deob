import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class199 {

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class6(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIII)V")
    public final void method30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class140.field2968 * arg2 + arg1;
        int var9 = class140.field2968 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class140.field2966) {
            int var12 = class140.field2966 - arg2;
            arg4 -= var12;
            arg2 = class140.field2966;
            var11 += arg3 * var12;
            var8 += class140.field2968 * var12;
        }
        if (arg2 + arg4 > class140.field2969) {
            arg4 -= arg2 + arg4 - class140.field2969;
        }
        if (arg1 < class140.field2967) {
            int var13 = class140.field2967 - arg1;
            arg3 -= var13;
            arg1 = class140.field2967;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class140.field2965) {
            int var14 = arg1 + arg3 - class140.field2965;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class199.method1302(class140.field2964, super.field3948[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
    public class6(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(IIIIII)V")
    public final void method31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class140.field2968 * arg2 + arg1;
        int var8 = class140.field2968 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class140.field2966) {
            int var11 = class140.field2966 - arg2;
            arg4 -= var11;
            arg2 = class140.field2966;
            var10 += arg3 * var11;
            var7 += class140.field2968 * var11;
        }
        if (arg2 + arg4 > class140.field2969) {
            arg4 -= arg2 + arg4 - class140.field2969;
        }
        if (arg1 < class140.field2967) {
            int var12 = class140.field2967 - arg1;
            arg3 -= var12;
            arg1 = class140.field2967;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class140.field2965) {
            int var13 = arg1 + arg3 - class140.field2965;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class199.method1319(class140.field2964, super.field3948[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
