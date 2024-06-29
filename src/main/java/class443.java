import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class443 extends class270 {

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "Lag;")
    public class625 field6107;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "Lpr;")
    public static class407 field6111 = new class407(1, -1);

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "Lkfa;")
    public static class549 field6112 = new class549(21, -1);

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "Ljo;")
    public static class303 field6110;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIBI)V", line = 5)
    public static final void method2453(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class394.method2149(false, arg3);
        field6109++;
        int var7 = 0;
        if (arg5 != -114) {
            method2453(7, 106, 65, 106, 94, (byte) 71, -111);
        }
        int var8 = arg3 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class156.field1755[arg2];
        int var16 = arg6 - var8;
        int var17 = arg6 + var8;
        class445.method2463(arg6 - arg3, arg5 + 212, var16, arg1, var15);
        class445.method2463(var16, 121, var17, arg0, var15);
        class445.method2463(var17, 99, arg6 + arg3, arg1, var15);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class366.field4782[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var18 = class156.field1755[arg2 + var9];
                    int[] var19 = class156.field1755[arg2 - var9];
                    int var20 = class366.field4782[var9];
                    int var21 = arg6 + var7;
                    int var22 = arg6 - var7;
                    int var23 = arg6 + var20;
                    int var24 = arg6 - var20;
                    class445.method2463(var22, arg5 ^ 0xFFFFFFE5, var24, arg1, var18);
                    class445.method2463(var24, 95, var23, arg0, var18);
                    class445.method2463(var23, 119, var21, arg1, var18);
                    class445.method2463(var22, 111, var24, arg1, var19);
                    class445.method2463(var24, 112, var23, arg0, var19);
                    class445.method2463(var23, arg5 + 241, var21, arg1, var19);
                } else {
                    int[] var25 = class156.field1755[arg2 + var9];
                    int[] var26 = class156.field1755[arg2 - var9];
                    int var27 = arg6 + var7;
                    int var28 = arg6 - var7;
                    class445.method2463(var28, 116, var27, arg1, var25);
                    class445.method2463(var28, arg5 ^ 0xFFFFFFD3, var27, arg1, var26);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class156.field1755[arg2 + var7];
            int[] var30 = class156.field1755[arg2 - var7];
            int var31 = arg6 + var9;
            int var32 = arg6 - var9;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class366.field4782[var7] : var11;
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class445.method2463(var32, 110, var35, arg1, var29);
                class445.method2463(var35, 100, var34, arg0, var29);
                class445.method2463(var34, 103, var31, arg1, var29);
                class445.method2463(var32, 97, var35, arg1, var30);
                class445.method2463(var35, arg5 + 211, var34, arg0, var30);
                class445.method2463(var34, 112, var31, arg1, var30);
            } else {
                class445.method2463(var32, 99, var31, arg1, var29);
                class445.method2463(var32, 118, var31, arg1, var30);
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V", line = 133)
    public static void method2454(byte arg0) {
        field6110 = null;
        field6112 = null;
        field6111 = null;
        if (arg0 >= -82) {
            field6111 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lag;)V", line = 144)
    public class443(class625 arg0) {
        this.field6107 = arg0;
    }
}
