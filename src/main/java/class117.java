import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class117 extends class123 {

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field2610 = 0;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Loa;")
    public static class98 field2613 = class38.method349(255, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Loa;")
    private static class98 field2617 = class38.method349(255, "Enter name:");

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "J")
    public static long field2608 = 0L;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Loa;")
    public static class98 field2618 = class38.method349(255, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Loa;")
    public static class98 field2611 = class38.method349(255, "@yel@*V");

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Loa;")
    public static class98 field2607 = field2617;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "Ltb;")
    public static class130 field2620;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "Ltd;")
    public static class132 field2623;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "Lve;")
    public class145 field2621;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Lkd;")
    public class73 field2616;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[B")
    public byte[] field2614;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V")
    public static void method930(byte arg0) {
        field2611 = null;
        field2613 = null;
        if (arg0 != -121) {
            field2618 = null;
        }
        field2618 = null;
        field2617 = null;
        field2620 = null;
        field2623 = null;
        field2607 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    public static final void method931(int arg0, byte arg1) {
        int[] var2 = class64.field1372.field1311;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        field2612++;
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class80.field1771[arg0][var21][var5] & 0x18) == 0) {
                    class138.field3373.method252(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class80.field1771[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class138.field3373.method252(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        if (arg1 < 61) {
            field2618 = null;
        }
        int var6 = (int) (Math.random() * 20.0D) + 228 << 16;
        class64.field1372.method499();
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class80.field1771[arg0][var19][var8] & 0x18) == 0) {
                    class130.method1047(false, var6, var19, arg0, var7, var8);
                }
                if (arg0 < 3 && (class80.field1771[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class130.method1047(false, var6, var19, arg0 + 1, var7, var8);
                }
            }
        }
        class54.field1203 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class138.field3373.method227(class114.field2572, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class145.method1167(var12, 65280).field2946;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class137.field3323[class114.field2572].field3675;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class63.field1351[class54.field1203] = class90.field2068[var13];
                        class20.field430[class54.field1203] = var14;
                        class139.field3388[class54.field1203] = var15;
                        class54.field1203++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)Ltd;")
    public static final class132 method932(int arg0, byte arg1) {
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        field2619++;
        if (arg1 != -116) {
            field2620 = null;
        }
        if (class36.field901[var3] == null || class36.field901[var3][var2] == null) {
            boolean var4 = client.method202(var3, arg1 - 642990556);
            if (!var4) {
                return null;
            }
        }
        return class36.field901[var3][var2];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILtb;)Ljc;")
    public static final class65 method933(int arg0, int arg1, class130 arg2) {
        field2622++;
        byte[] var3 = arg2.method1066(122, arg0);
        if (arg1 == -4197) {
            return var3 == null ? null : new class65(var3);
        } else {
            return null;
        }
    }
}
