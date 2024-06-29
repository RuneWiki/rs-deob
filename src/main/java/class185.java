import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class185 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Ltm;")
    public static class334 field3107 = new class334(58, 4);

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[[B")
    public static byte[][] field3109 = new byte[1000][];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3108++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg6 - arg2;
        int var12 = arg3 - arg2;
        int var13 = arg6 * arg6;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = 38 % ((-arg4 - 39) / 62);
        int var21 = var15 << 1;
        int var22 = arg3 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var22) * var13 + var17;
        int var25 = var14 - ((var22 - 1) * var18);
        int var26 = (1 - var23) * var15 + var19;
        int var27 = var16 - (var23 - 1) * var21;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var22 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg3 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        int[] var40 = class77.field1131[arg0];
        class608.method3484(var40, arg7 - arg6, -7, arg5, arg7 - var11);
        class608.method3484(var40, arg7 - var11, -7, arg1, arg7 + var11);
        class608.method3484(var40, arg7 + var11, -7, arg5, arg7 + arg6);
        while (var9 > 0) {
            boolean var41 = var9 <= var12;
            if (var41) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var26 += var34;
                        var27 += var38;
                        var34 += var31;
                        var38 += var31;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var26 += var34;
                    var27 += var38;
                    var10++;
                    var34 += var31;
                    var38 += var31;
                }
                var27 += -var35;
                var26 += -var39;
                var35 -= var30;
                var39 -= var30;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var25 += var36;
                    var24 += var32;
                    var36 += var29;
                    var8++;
                    var32 += var29;
                }
            }
            if (var25 < 0) {
                var25 += var36;
                var24 += var32;
                var8++;
                var36 += var29;
                var32 += var29;
            }
            var25 += -var33;
            var24 += -var37;
            var9--;
            var37 -= var28;
            var33 -= var28;
            int var42 = arg0 - var9;
            int var43 = arg0 + var9;
            int var44 = arg7 + var8;
            int var45 = arg7 - var8;
            if (var41) {
                int var46 = arg7 + var10;
                int var47 = arg7 - var10;
                class608.method3484(class77.field1131[var42], var45, -7, arg5, var47);
                class608.method3484(class77.field1131[var42], var47, -7, arg1, var46);
                class608.method3484(class77.field1131[var42], var46, -7, arg5, var44);
                class608.method3484(class77.field1131[var43], var45, -7, arg5, var47);
                class608.method3484(class77.field1131[var43], var47, -7, arg1, var46);
                class608.method3484(class77.field1131[var43], var46, -7, arg5, var44);
            } else {
                class608.method3484(class77.field1131[var42], var45, -7, arg5, var44);
                class608.method3484(class77.field1131[var43], var45, -7, arg5, var44);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 179)
    public static void method1417(byte arg0) {
        if (arg0 <= 100) {
            method1417((byte) 2);
        }
        field3107 = null;
        field3109 = null;
    }
}
