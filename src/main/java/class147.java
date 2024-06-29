import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class147 implements class152 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2276 = 0;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2280 = null;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public final String method1002(int[] arg0, int arg1, int arg2, long arg3) {
        field2278++;
        if (arg2 == 0) {
            class21 var6 = class203.method1360(arg0[0], (byte) 56);
            return var6.method187((int) arg3, 15424);
        } else if (arg2 == 1 || arg2 == 10) {
            class123 var7 = class32.method260((int) arg3, true);
            return var7.field1885;
        } else if (arg1 == 1306) {
            return arg2 == 6 || arg2 == 7 || arg2 == 11 ? class203.method1360(arg0[0], (byte) 56).method187((int) arg3, 15424) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        if (arg0 > 69) {
            field2280 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
    public static final boolean method1004(int arg0, int arg1) {
        field2277++;
        byte var2 = 0;
        byte var3 = 0;
        if (class256.field3919 == null) {
            if (class48.field787 == null) {
                class256.field3919 = new class49(512, 512);
            } else {
                class256.field3919 = (class49) class48.field787;
            }
            int[] var4 = class256.field3919.field795;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var21 = ((var3 + 103 - var7) * 4 * 512) + 24628;
                for (int var22 = var2 + 1; var22 < (104 - var2 - 1); var22++) {
                    if ((class191.field3041[arg1][var22][var7] & 0x18) == 0) {
                        class266.method1816(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (class191.field3041[arg1 + 1][var22][var7] & 0x8) != 0) {
                        class266.method1816(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class108.field1720 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class209.method1404(class274.field4318, var8 + var2, var3 + var9);
                    if (var10 != 0L) {
                        class73 var12 = class85.method690(2276, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field1183;
                        if (var12.field1189 != null) {
                            for (int var14 = 0; var14 < var12.field1189.length; var14++) {
                                if (var12.field1189[var14] != -1) {
                                    class73 var15 = class85.method690(2276, var12.field1189[var14]);
                                    if (var15.field1183 >= 0) {
                                        var13 = var15.field1183;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var8;
                            int var17 = var9 + var3;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class72.field1142[class274.field4318].field1286;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && var16 > var8 - 3 && (var18[var16 - 1][var17] & 0x2C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var16 < (var8 + 3) && (var18[var16 + 1][var17] & 0x2C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > (var9 - 3) && (var18[var16][var17 - 1] & 0x2C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var17 < (var9 + 3) && (var18[var16][var17 + 1] & 0x2C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class291.field4584[class108.field1720] = var12.field1209;
                            class215.field3320[class108.field1720] = var16 - var2;
                            class78.field1318[class108.field1720] = var17 - var3;
                            class108.field1720++;
                        }
                    }
                }
            }
        }
        class256.field3919.method415();
        int var23 = ((int) (Math.random() * 20.0D) - 10) + 238 << 16;
        int var24 = (int) (Math.random() * 20.0D) + (((int) (Math.random() * 20.0D)) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class191.field3041[arg1][var2 + var26][var3 + var25] & 0x18) == 0 && !class45.method377(var24, var26, var23, var25, var3, arg1, false, var2)) {
                    class223.field3508.method1710(18814);
                    return false;
                }
                if (arg1 < 3 && (class191.field3041[arg1 + 1][var26 + var2][var3 + var25] & 0x8) != 0 && !class45.method377(var24, var26, var23, var25, var3, arg1 + 1, false, var2)) {
                    class223.field3508.method1710(18814);
                    return false;
                }
            }
        }
        class48.field787 = class256.field3919;
        class223.field3508.method1710(18814);
        if (arg0 >= -118) {
            field2279 = 5;
        }
        class256.field3919 = null;
        return true;
    }
}
