import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class260 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lcd;")
    public static class64 field4473 = class44.method335((byte) 71, ")3");

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lcd;")
    private static class64 field4475 = class44.method335((byte) 71, " more options");

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lcd;")
    public static class64 field4474 = field4475;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lpj;")
    public static class173 field4477 = new class173(5000);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field4479 = new int[32];

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lcd;")
    public static class64 field4481 = class44.method335((byte) 71, "settings");

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lcd;")
    public static class64 field4480;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V", line = 31)
    public static final void method1835(int arg0, byte arg1) {
        field4476++;
        class127 var2;
        if (class123.field2216 || class63.field1218 == null) {
            var2 = new class127(512, 512);
        } else {
            var2 = (class127) class63.field1218;
        }
        int[] var3 = var2.field2274;
        if (arg1 != -50) {
            return;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class82.field1508[arg0][var8][var6] & 0x18) == 0) {
                    class36.method295(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class82.field1508[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class36.method295(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method919();
        int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D)) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class82.field1508[arg0][var12][var11] & 0x18) == 0) {
                    class175.method1227(arg0, var9, true, var12, var11, var10);
                }
                if (arg0 < 3 && (class82.field1508[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class175.method1227(arg0 + 1, var9, true, var12, var11, var10);
                }
            }
        }
        class89.field1612 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class244.method1775(class20.field364, var13, var14);
                if (var15 != 0L) {
                    class290 var17 = class172.method1207(Integer.MAX_VALUE & (int) (var15 >>> 32), -114);
                    int var18 = var17.field5007;
                    if (var17.field4993 != null) {
                        for (int var19 = 0; var19 < var17.field4993.length; var19++) {
                            if (var17.field4993[var19] != -1) {
                                class290 var20 = class172.method1207(var17.field4993[var19], arg1 - 72);
                                if (var20.field5007 >= 0) {
                                    var18 = var20.field5007;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class91.field1637[class20.field364].field905;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && (var13 - 3) < var21 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var13 + 3 > var21 && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var22 > (var14 - 3) && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var22 < (var14 + 3) && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class105.field1943[class89.field1612] = var17.field4962;
                        class55.field933[class89.field1612] = var21;
                        class6.field149[class89.field1612] = var22;
                        class89.field1612++;
                    }
                }
            }
        }
        if (class123.field2216) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class63.field1218 = new class136(var2);
        } else {
            class63.field1218 = var2;
        }
        if (class123.field2216) {
            class210.field3529 = null;
        } else {
            class183.field3130.method765(0);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 293)
    public static void method1836(byte arg0) {
        int var1 = 30 % ((72 - arg0) / 40);
        field4474 = null;
        field4473 = null;
        field4475 = null;
        field4479 = null;
        field4480 = null;
        field4481 = null;
        field4477 = null;
    }
}
