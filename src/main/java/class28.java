import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class8 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    public final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class52.field1245 * arg2 + arg1;
        int var9 = class52.field1245 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class52.field1246) {
            int var12 = class52.field1246 - arg2;
            arg4 -= var12;
            arg2 = class52.field1246;
            var11 += arg3 * var12;
            var8 += class52.field1245 * var12;
        }
        if (arg2 + arg4 > class52.field1247) {
            arg4 -= arg2 + arg4 - class52.field1247;
        }
        if (arg1 < class52.field1243) {
            int var13 = class52.field1243 - arg1;
            arg3 -= var13;
            arg1 = class52.field1243;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class52.field1241) {
            int var14 = arg1 + arg3 - class52.field1241;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class8.method52(class52.field1242, super.field148[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    public class28(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(IIIIII)V")
    public final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class52.field1245 * arg2 + arg1;
        int var8 = class52.field1245 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class52.field1246) {
            int var11 = class52.field1246 - arg2;
            arg4 -= var11;
            arg2 = class52.field1246;
            var10 += arg3 * var11;
            var7 += class52.field1245 * var11;
        }
        if (arg2 + arg4 > class52.field1247) {
            arg4 -= arg2 + arg4 - class52.field1247;
        }
        if (arg1 < class52.field1243) {
            int var12 = class52.field1243 - arg1;
            arg3 -= var12;
            arg1 = class52.field1243;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class52.field1241) {
            int var13 = arg1 + arg3 - class52.field1241;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class8.method48(class52.field1242, super.field148[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class28(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
}
