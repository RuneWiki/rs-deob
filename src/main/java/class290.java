import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class290 extends class263 {

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V", line = 3)
    public class290(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V", line = 6)
    public class290(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIIII)V", line = 10)
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class286.field4719 * arg2 + arg1;
        int var9 = class286.field4719 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class286.field4724) {
            int var12 = class286.field4724 - arg2;
            arg4 -= var12;
            arg2 = class286.field4724;
            var11 += arg3 * var12;
            var8 += class286.field4719 * var12;
        }
        if (arg2 + arg4 > class286.field4722) {
            arg4 -= arg2 + arg4 - class286.field4722;
        }
        if (arg1 < class286.field4723) {
            int var13 = class286.field4723 - arg1;
            arg3 -= var13;
            arg1 = class286.field4723;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class286.field4720) {
            int var14 = arg1 + arg3 - class286.field4720;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class78.method548(var10, arg4, var11, var9, class286.field4718, arg3, var8, arg5, this.field4282[arg0], arg6, -27);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIII)V", line = 60)
    public final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class286.field4719 * arg2 + arg1;
        int var8 = class286.field4719 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class286.field4724) {
            int var11 = class286.field4724 - arg2;
            arg4 -= var11;
            arg2 = class286.field4724;
            var10 += arg3 * var11;
            var7 += class286.field4719 * var11;
        }
        if (arg2 + arg4 > class286.field4722) {
            arg4 -= arg2 + arg4 - class286.field4722;
        }
        if (arg1 < class286.field4723) {
            int var12 = class286.field4723 - arg1;
            arg3 -= var12;
            arg1 = class286.field4723;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class286.field4720) {
            int var13 = arg1 + arg3 - class286.field4720;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class174.method1110(var9, 3, var10, var7, arg3, arg4, class286.field4718, var8, this.field4282[arg0], arg5);
        }
    }
}
