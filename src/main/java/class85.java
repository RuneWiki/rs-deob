import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class99 {

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class85(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class85(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIIII)V")
    public final void method673(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class56.field1265 * arg2 + arg1;
        int var8 = class56.field1265 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class56.field1266) {
            int var11 = class56.field1266 - arg2;
            arg4 -= var11;
            arg2 = class56.field1266;
            var10 += arg3 * var11;
            var7 += class56.field1265 * var11;
        }
        if (arg2 + arg4 > class56.field1270) {
            arg4 -= arg2 + arg4 - class56.field1270;
        }
        if (arg1 < class56.field1268) {
            int var12 = class56.field1268 - arg1;
            arg3 -= var12;
            arg1 = class56.field1268;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class56.field1267) {
            int var13 = arg1 + arg3 - class56.field1267;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class99.method804(class56.field1269, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIIIII)V")
    public final void method674(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class56.field1265 * arg2 + arg1;
        int var9 = class56.field1265 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class56.field1266) {
            int var12 = class56.field1266 - arg2;
            arg4 -= var12;
            arg2 = class56.field1266;
            var11 += arg3 * var12;
            var8 += class56.field1265 * var12;
        }
        if (arg2 + arg4 > class56.field1270) {
            arg4 -= arg2 + arg4 - class56.field1270;
        }
        if (arg1 < class56.field1268) {
            int var13 = class56.field1268 - arg1;
            arg3 -= var13;
            arg1 = class56.field1268;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class56.field1267) {
            int var14 = arg1 + arg3 - class56.field1267;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class99.method823(class56.field1269, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}
