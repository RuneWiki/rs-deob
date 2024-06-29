import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class306 extends class59 {

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[I")
    public int[] field5125 = new int[] { -1 };

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    public int[] field5130 = new int[] { 0 };

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lok;")
    public static class41 field5119 = class137.method956("runes", 45);

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
    public static int[] field5120 = new int[32];

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lok;")
    public static class41 field5124 = class137.method956("overlay2", 45);

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lok;")
    public static class41 field5122 = class137.method956("Verbindung mit Update)2Server)3)3)3", 45);

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[Lok;")
    public static class41[] field5129;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Lee;")
    public static class75 field5128;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Lak;")
    public static class20 field5131;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Lok;")
    public static class41 field5133;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Lqe;")
    public static class298 field5132;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "F")
    public static float field5127;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2110(boolean arg0) {
        field5124 = null;
        field5131 = null;
        field5120 = null;
        field5119 = null;
        if (!arg0) {
            return;
        }
        field5129 = null;
        field5132 = null;
        field5133 = null;
        field5122 = null;
        field5128 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method2111(byte arg0, int arg1) {
        class72 var2;
        if (class166.field2625 || class88.field1298 == null) {
            var2 = new class72(512, 512);
        } else {
            var2 = (class72) class88.field1298;
        }
        field5123++;
        int[] var3 = var2.field1070;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class126.field1879[arg1][var8][var6] & 0x18) == 0) {
                    class203.method1442(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class126.field1879[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class203.method1442(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method525();
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class126.field1879[arg1][var12][var11] & 0x18) == 0) {
                    class241.method1727(var9, var12, var11, arg1, var10, 0);
                }
                if (arg1 < 3 && (class126.field1879[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class241.method1727(var9, var12, var11, arg1 + 1, var10, 0);
                }
            }
        }
        class5.field61 = 0;
        int var13 = 0;
        int var14 = 96 % ((arg0 + 62) / 38);
        while (var13 < 104) {
            for (int var15 = 0; var15 < 104; var15++) {
                long var16 = class14.method62(class55.field807, var13, var15);
                if (var16 != 0L) {
                    class171 var18 = class234.method1684(-2441, (int) (var16 >>> 32) & Integer.MAX_VALUE);
                    int var19 = var18.field2774;
                    if (var18.field2745 != null) {
                        for (int var20 = 0; var20 < var18.field2745.length; var20++) {
                            if (var18.field2745[var20] != -1) {
                                class171 var21 = class234.method1684(-2441, var18.field2745[var20]);
                                if (var21.field2774 >= 0) {
                                    var19 = var21.field2774;
                                    break;
                                }
                            }
                        }
                    }
                    if (var19 >= 0) {
                        int var22 = var15;
                        int var23 = var13;
                        if (var19 != 22 && var19 != 29 && var19 != 34 && var19 != 36 && var19 != 46 && var19 != 47 && var19 != 48) {
                            int[][] var24 = class222.field3548[class55.field807].field3570;
                            for (int var25 = 0; var25 < 10; var25++) {
                                int var26 = (int) (Math.random() * 4.0D);
                                if (var26 == 0 && var23 > 0 && var23 > var13 - 3 && (var24[var23 - 1][var22] & 0x12C0108) == 0) {
                                    var23--;
                                }
                                if (var26 == 1 && var23 < 103 && var23 < var13 + 3 && (var24[var23 + 1][var22] & 0x12C0180) == 0) {
                                    var23++;
                                }
                                if (var26 == 2 && var22 > 0 && var22 > var15 - 3 && (var24[var23][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var26 == 3 && var22 < 103 && var22 < var15 + 3 && (var24[var23][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class59.field845[class5.field61] = var18.field2733;
                        class8.field99[class5.field61] = var23;
                        class144.field2199[class5.field61] = var22;
                        class5.field61++;
                    }
                }
            }
            var13++;
        }
        if (class166.field2625) {
            for (int var27 = 0; var27 < var4; var27++) {
                if (var3[var27] == 0) {
                    var3[var27] = 1;
                }
            }
            class88.field1298 = new class17(var2);
        } else {
            class88.field1298 = var2;
        }
        if (class166.field2625) {
            class54.field801 = null;
        } else {
            class217.field3485.method1353((byte) -26);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5120[var1] = var0 - 1;
            var0 += var0;
        }
        field5129 = new class41[500];
        field5128 = new class75(64);
        field5131 = new class20(4);
        field5133 = class137.method956("Lade)3)3)3", 45);
        field5132 = new class298();
        field5134 = -1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V", line = 263)
    public static final void method2112(int arg0, int arg1, int arg2) {
        field5121++;
        if (class307.field5160 != arg1) {
            class203.field3278 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class203.field3278[var3] = (var3 << 12) / arg1;
            }
            class51.field776 = arg1 - 1;
            class307.field5160 = arg1;
            class252.field4013 = arg1 == 64 ? 2048 : 4096;
        }
        if (class226.field3609 != arg2) {
            if (class307.field5160 == arg2) {
                class16.field216 = class203.field3278;
            } else {
                class16.field216 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class16.field216[var4] = (var4 << 12) / arg2;
                }
            }
            class226.field3609 = arg2;
            class27.field410 = arg2 - 1;
        }
        if (arg0 >= -67) {
            field5129 = (class41[]) null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Lka;", line = 350)
    public static final class279 method2113(byte arg0) {
        class279 var1 = new class279(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], class223.field3562[0], class312.field5263);
        field5126++;
        class286.method2005((byte) -9);
        return arg0 == 84 ? var1 : (class279) null;
    }
}
