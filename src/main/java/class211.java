import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class211 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2489 = 0;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2496 = -1;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2493 = 1339;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Loa;")
    public static class650 field2491;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1237(int arg0, byte arg1, int arg2) {
        field2494++;
        if (arg1 <= 87) {
            field2489 = 55;
        }
        return class638.method3584(arg0, arg2, 13896) & class42.method263(arg2, arg0, (byte) -13);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
    public static final int method1238(boolean arg0, int arg1) {
        field2495++;
        double var2 = (double) ((arg1 & 0xFFE607) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF04) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        if (arg0) {
            method1241(-79, -26, -36);
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2491 = null;
        if (arg0 != -29800) {
            field2493 = 47;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2492++;
        int var8 = class654.method3659(-7690, arg2, class377.field4848, class125.field1524);
        int var9 = class654.method3659(-7690, arg4, class377.field4848, class125.field1524);
        int var10 = class654.method3659(-7690, arg1, class337.field4186, class292.field3700);
        int var11 = class654.method3659(-7690, arg7, class337.field4186, class292.field3700);
        int var12 = class654.method3659(-7690, arg2 + arg5, class377.field4848, class125.field1524);
        int var13 = class654.method3659(-7690, arg4 - arg5, class377.field4848, class125.field1524);
        for (int var14 = var8; var14 < var12; var14++) {
            class390.method2223(var10, arg6, class30.field364[var14], (byte) -102, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class390.method2223(var10, arg6, class30.field364[var15], (byte) -107, var11);
        }
        int var16 = class654.method3659(-7690, arg1 + arg5, class337.field4186, class292.field3700);
        int var17 = class654.method3659(-7690, arg7 - arg5, class337.field4186, class292.field3700);
        if (arg0 >= -49) {
            method1239(-6);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class30.field364[var18];
            class390.method2223(var10, arg6, var19, (byte) -108, var16);
            class390.method2223(var16, arg3, var19, (byte) -75, var17);
            class390.method2223(var17, arg6, var19, (byte) -95, var11);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
    public static final boolean method1241(int arg0, int arg1, int arg2) {
        field2490++;
        if (!class367.field4752) {
            return false;
        }
        int var3 = arg2 >> 16;
        if (arg0 != 22) {
            return true;
        }
        int var4 = arg2 & 0xFFFF;
        if (class325.field4062[var3] == null || class325.field4062[var3][var4] == null) {
            return false;
        }
        class337 var5 = class325.field4062[var3][var4];
        if (arg1 == -1 && var5.field4212 == 0) {
            for (class501 var6 = (class501) class345.field4438.method1909(true); var6 != null; var6 = (class501) class345.field4438.method1916((byte) 96)) {
                if (var6.field6242 == 60 || var6.field6242 == 1002 || var6.field6242 == 3 || var6.field6242 == 22 || var6.field6242 == 44) {
                    for (class337 var7 = class442.method2421(var6.field6251, 84); var7 != null; var7 = class329.method1887(var7, true)) {
                        if (var5.field4172 == var7.field4172) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class501 var8 = (class501) class345.field4438.method1909(true); var8 != null; var8 = (class501) class345.field4438.method1916((byte) 102)) {
                if (var8.field6248 == arg1 && var5.field4172 == var8.field6251 && (var8.field6242 == 60 || var8.field6242 == 1002 || var8.field6242 == 3 || var8.field6242 == 22 || var8.field6242 == 44)) {
                    return true;
                }
            }
        }
        return false;
    }
}
