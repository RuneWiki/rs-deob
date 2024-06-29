import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class192 extends class68 {

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "[I")
    public int[] field3278 = new int[] { 0 };

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
    public int[] field3281 = new int[] { -1 };

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lvc;")
    public static class129 field3280 = new class129();

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field3285 = -1;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "S")
    public static short field3282 = 1;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)I", line = 9)
    public static final int method1365(int arg0, int arg1) {
        field3277++;
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        }
        int var2 = 54 % ((arg0 - 61) / 32);
        if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V", line = 48)
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3279++;
        int var8 = arg0;
        int var9 = 0;
        int var10 = arg5 - arg1;
        int var11 = var10 * var10;
        int var12 = 0;
        int var13 = arg5 * arg5;
        int var14 = arg0 * arg0;
        int var15 = var14 << 1;
        int var16 = arg0 - arg1;
        int var17 = var16 * var16;
        int var18 = var17 << 1;
        int var19 = var13 << 1;
        int var20 = var11 << 1;
        int var21 = var16 << 1;
        int var22 = arg0 << 1;
        int var23 = var14 - ((var22 - 1) * var19);
        int var24 = (arg7 - var22) * var13 + var15;
        int var25 = (1 - var21) * var11 + var18;
        int var26 = var13 << 2;
        int var27 = var14 << 2;
        int var28 = var11 << 2;
        int var29 = var17 << 2;
        int var30 = var15 * 3;
        int var31 = (var22 - 3) * var19;
        int var32 = var17 - (var21 - 1) * var20;
        int var33 = var27;
        int var34 = var18 * 3;
        int var35 = (var21 - 3) * var20;
        int var36 = var29;
        int var37 = (arg0 - 1) * var26;
        int var38 = (var16 - 1) * var28;
        int[] var39 = class314.field5393[arg6];
        class94.method647(var39, arg3 - arg5, -7, arg3 - var10, arg2);
        class94.method647(var39, arg3 - var10, arg7 ^ 0xFFFFFFF8, arg3 + var10, arg4);
        class94.method647(var39, arg3 + var10, -7, arg3 + arg5, arg2);
        while (var8 > 0) {
            boolean var40 = var16 >= var8;
            var8--;
            if (var24 < 0) {
                while (var24 < 0) {
                    var23 += var33;
                    var33 += var27;
                    var24 += var30;
                    var30 += var27;
                    var9++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var12++;
                        var25 += var34;
                        var32 += var36;
                        var36 += var29;
                        var34 += var29;
                    }
                }
                if (var32 < 0) {
                    var12++;
                    var32 += var36;
                    var36 += var29;
                    var25 += var34;
                    var34 += var29;
                }
                var25 += -var38;
                var32 += -var35;
                var35 -= var28;
                var38 -= var28;
            }
            if (var23 < 0) {
                var9++;
                var23 += var33;
                var24 += var30;
                var33 += var27;
                var30 += var27;
            }
            var23 += -var31;
            int var41 = arg6 - var8;
            int var42 = arg3 + var9;
            var31 -= var26;
            int var43 = arg6 + var8;
            var24 += -var37;
            int var44 = arg3 - var9;
            if (var40) {
                int var45 = arg3 - var12;
                int var46 = arg3 + var12;
                class94.method647(class314.field5393[var41], var44, -7, var45, arg2);
                class94.method647(class314.field5393[var41], var45, -7, var46, arg4);
                class94.method647(class314.field5393[var41], var46, arg7 - 8, var42, arg2);
                class94.method647(class314.field5393[var43], var44, -7, var45, arg2);
                class94.method647(class314.field5393[var43], var45, -7, var46, arg4);
                class94.method647(class314.field5393[var43], var46, -7, var42, arg2);
            } else {
                class94.method647(class314.field5393[var41], var44, -7, var42, arg2);
                class94.method647(class314.field5393[var43], var44, -7, var42, arg2);
            }
            var37 -= var26;
        }
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V", line = 225)
    public static void method1367(byte arg0) {
        if (arg0 != 63) {
            field3284 = 79;
        }
        field3280 = null;
    }
}
