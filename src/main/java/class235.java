import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class235 extends class155 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIIIIII)V")
    public final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class83.field1565 * arg2 + arg1;
        int var9 = class83.field1565 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class83.field1566) {
            int var12 = class83.field1566 - arg2;
            arg4 -= var12;
            arg2 = class83.field1566;
            var11 += arg3 * var12;
            var8 += class83.field1565 * var12;
        }
        if (arg2 + arg4 > class83.field1563) {
            arg4 -= arg2 + arg4 - class83.field1563;
        }
        if (arg1 < class83.field1562) {
            int var13 = class83.field1562 - arg1;
            arg3 -= var13;
            arg1 = class83.field1562;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class83.field1564) {
            int var14 = arg1 + arg3 - class83.field1564;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class221.method1438(super.field2826[arg0], arg5, arg6, class83.field1561, arg4, -9540, var8, var10, arg3, var9, var11);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class83.field1565 * arg2 + arg1;
        int var8 = class83.field1565 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class83.field1566) {
            int var11 = class83.field1566 - arg2;
            arg4 -= var11;
            arg2 = class83.field1566;
            var10 += arg3 * var11;
            var7 += class83.field1565 * var11;
        }
        if (arg2 + arg4 > class83.field1563) {
            arg4 -= arg2 + arg4 - class83.field1563;
        }
        if (arg1 < class83.field1562) {
            int var12 = class83.field1562 - arg1;
            arg3 -= var12;
            arg1 = class83.field1562;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class83.field1564) {
            int var13 = arg1 + arg3 - class83.field1564;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method184(class83.field1561, arg3, arg5, true, arg4, var9, var8, var10, super.field2826[arg0], var7);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B)V")
    public class235(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class235(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
