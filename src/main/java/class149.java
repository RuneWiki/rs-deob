import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class149 extends OutputStream {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    public static int[] field2379 = new int[500];

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[I")
    public static int[] field2380 = new int[14];

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field2387 = 0;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Ljc;")
    public static class243 field2385;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method1152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2381++;
        int var8 = 0;
        int var9 = arg3 - arg6;
        int var10 = 0;
        int var11 = arg5;
        int var12 = arg5 - arg6;
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var9 * var9;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = arg5 << 1;
        int var23 = (1 - var22) * var13 + var18;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var14 << 2;
        int var26 = var14 - ((var22 - 1) * var17);
        int var27 = var13 << 2;
        int var28 = var16 - ((var21 - 1) * var20);
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = var19 * 3;
        int var33 = (var22 - 3) * var17;
        int var34 = (var21 - 3) * var20;
        int var35 = (arg0 + var12) * var30;
        int var36 = (arg5 - 1) * var27;
        int[] var37 = class353.field5599[arg2];
        int var38 = var29;
        class161.method1253(arg1 - var9, var37, -1, arg7, arg1 - arg3);
        class161.method1253(arg1 + var9, var37, -1, arg4, arg1 - var9);
        int var39 = var25;
        class161.method1253(arg1 + arg3, var37, -1, arg7, arg1 + var9);
        while (var11 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var26 += var39;
                    var39 += var25;
                    var23 += var31;
                    var31 += var25;
                    var8++;
                }
            }
            boolean var40 = var11 <= var12;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var24 += var32;
                        var28 += var38;
                        var32 += var29;
                        var38 += var29;
                    }
                }
                if (var28 < 0) {
                    var10++;
                    var24 += var32;
                    var28 += var38;
                    var32 += var29;
                    var38 += var29;
                }
                var28 += -var34;
                var24 += -var35;
                var35 -= var30;
                var34 -= var30;
            }
            if (var26 < 0) {
                var26 += var39;
                var39 += var25;
                var23 += var31;
                var31 += var25;
                var8++;
            }
            var26 += -var33;
            var23 += -var36;
            var36 -= var27;
            var11--;
            var33 -= var27;
            int var41 = arg2 + var11;
            int var42 = arg2 - var11;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 + var10;
                int var46 = arg1 - var10;
                class161.method1253(var46, class353.field5599[var42], -1, arg7, var44);
                class161.method1253(var45, class353.field5599[var42], -1, arg4, var46);
                class161.method1253(var43, class353.field5599[var42], -1, arg7, var45);
                class161.method1253(var46, class353.field5599[var41], -1, arg7, var44);
                class161.method1253(var45, class353.field5599[var41], -1, arg4, var46);
                class161.method1253(var43, class353.field5599[var41], -1, arg7, var45);
            } else {
                class161.method1253(var43, class353.field5599[var42], -1, arg7, var44);
                class161.method1253(var43, class353.field5599[var41], -1, arg7, var44);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 175)
    public static void method1153(byte arg0) {
        int var1 = -65 % ((arg0 + 14) / 47);
        field2379 = null;
        field2380 = null;
        field2385 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 199)
    public static final void method1154() {
        for (int var0 = 0; var0 < class301.field4847; var0++) {
            class209 var1 = class335.field5299[var0];
            class48.method373(var1);
            class335.field5299[var0] = null;
        }
        class301.field4847 = 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 213)
    public static final void method1155(int arg0, int arg1) {
        field2384++;
        class173.field2768.method2334(4, arg0);
        int var2 = 77 / ((42 - arg1) / 61);
    }

    @OriginalMember(owner = "client!kg", name = "write", descriptor = "(I)V", line = 232)
    public final void write(int arg0) throws IOException {
        field2386++;
        throw new IOException();
    }
}
