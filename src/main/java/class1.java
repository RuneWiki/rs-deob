import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
    public static boolean field1 = false;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lcd;")
    public static class23 field10 = class54.method414("<col=ffff00>*V", -1);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lcd;")
    public static class23 field11 = class54.method414("Bitte entfernen Sie ", -1);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lcd;")
    public static class23 field8 = class54.method414(" <col=00ff80>", -1);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lcd;")
    public static class23 field14 = class54.method414("blaugr-Un:", -1);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lcd;")
    private static class23 field12 = class54.method414("Please try again)3", -1);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lcd;")
    public static class23 field3 = field12;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lgd;")
    public static class58 field13;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method1(int arg0, int arg1) {
        field2++;
        if (!class82.method556(arg0, (byte) -7)) {
            return;
        }
        class47[] var2 = class100.field2114[arg0];
        if (arg1 < 10) {
            field8 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class47 var4 = var2[var3];
            if (var4 != null) {
                var4.field1082 = 0;
                var4.field1146 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIB)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6++;
        if (class57.field1330 == 1) {
            class48.field1165[class100.field2112 / 100].method315(class180.field3569 - 8, class154.field3088 + -8);
        }
        if (class57.field1330 == 2) {
            class48.field1165[class100.field2112 / 100 + 4].method315(class180.field3569 - 8, class154.field3088 + -8);
        }
        if (arg4 <= 92) {
            method3(91);
        }
        class134.method857((byte) 106);
        if (!class100.field2116) {
            return;
        }
        int var5 = arg1 + 20;
        int var6 = arg2 + 512 - 5;
        int var7 = 16776960;
        class14.field301.method265(class3.method14(true, new class23[] { class204.field4020, class184.method1132(-1, class102.field2176) }), var6, var5, 16776960, -1);
        int var10 = var5 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class193.field3810) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class193.field3810) {
            var7 = 16711680;
        }
        class14.field301.method265(class3.method14(true, new class23[] { class81.field1774, class184.method1132(-1, var9), class42.field903 }), var6, var10, var7, -1);
        var5 = var10 + 15;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method3(int arg0) {
        field13 = null;
        field12 = null;
        field14 = null;
        field11 = null;
        field10 = null;
        if (arg0 != 0) {
            method5(71, null);
        }
        field3 = null;
        field8 = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method4(int arg0, int arg1) {
        field4++;
        if (arg1 == 100 && class14.field323 > 0) {
            byte[] var2 = class205.field4028[--class14.field323];
            class205.field4028[class14.field323] = null;
            return var2;
        } else if (arg1 == 5000 && class67.field1584 > 0) {
            byte[] var3 = class10.field197[--class67.field1584];
            class10.field197[class67.field1584] = null;
            return var3;
        } else if (arg0 != -24769) {
            return null;
        } else if (arg1 == 30000 && class200.field3954 > 0) {
            byte[] var4 = class13.field299[--class200.field3954];
            class13.field299[class200.field3954] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILnb;)V")
    public static final void method5(int arg0, class118 arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1.field2445 != null) {
            arg1.field2445.field1717 = 0;
        }
        arg1.field2444 = false;
        field9++;
        for (class118 var2 = arg1.method232(); var2 != null; var2 = arg1.method231()) {
            method5(0, var2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZB)V")
    public static final void method6(boolean arg0, byte arg1) {
        field5++;
        class186.field3639 = arg0;
        if (class186.field3639) {
            int var15 = class81.field1769.method1184(-25);
            class81.field1769.method634((byte) 126);
            for (int var16 = 0; var16 < 4; var16++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        int var38 = class81.field1769.method626(16789, 1);
                        if (var38 == 1) {
                            class101.field2168[var16][var36][var37] = class81.field1769.method626(16789, 26);
                        } else {
                            class101.field2168[var16][var36][var37] = -1;
                        }
                    }
                }
            }
            class81.field1769.method630(-123);
            int var17 = (class199.field3900 - class81.field1769.field3752) / 16;
            class67.field1577 = new int[var17][4];
            for (int var18 = 0; var18 < var17; var18++) {
                for (int var35 = 0; var35 < 4; var35++) {
                    class67.field1577[var18][var35] = class81.field1769.method1230(9287);
                }
            }
            int var19 = class81.field1769.method1200(-121);
            int var20 = class81.field1769.method1200(-122);
            int var21 = class81.field1769.method1202(-14);
            int var22 = class81.field1769.method1197(-1);
            class135.field2794 = new int[var17];
            class34.field690 = new int[var17];
            class16.field340 = new byte[var17][];
            class117.field2427 = new int[var17];
            class55.field1299 = new byte[var17][];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        int var28 = class101.field2168[var24][var26][var27];
                        if (var28 != -1) {
                            int var29 = var28 >> 14 & 0x3FF;
                            int var30 = var28 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + var30 / 8;
                            for (int var32 = 0; var32 < var23; var32++) {
                                if (class117.field2427[var32] == var31) {
                                    var31 = -1;
                                    break;
                                }
                            }
                            if (var31 != -1) {
                                class117.field2427[var23] = var31;
                                int var33 = var31 >> 8 & 0xFF;
                                int var34 = var31 & 0xFF;
                                class135.field2794[var23] = class82.field1779.method647((byte) -116, class3.method14(true, new class23[] { class55.field1294, class184.method1132(-1, var33), class145.field2961, class184.method1132(-1, var34) }));
                                class34.field690[var23] = class82.field1779.method647((byte) -61, class3.method14(true, new class23[] { class47.field1068, class184.method1132(-1, var33), class145.field2961, class184.method1132(-1, var34) }));
                                var23++;
                            }
                        }
                    }
                }
            }
            class43.method344(var15, var19, var21, var20, false, var22);
        } else {
            int var2 = class81.field1769.method1184(-25);
            int var3 = class81.field1769.method1184(-25);
            int var4 = class81.field1769.method1216((byte) 63);
            int var5 = class81.field1769.method1203(-121);
            int var6 = (class199.field3900 - class81.field1769.field3752) / 16;
            class67.field1577 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class67.field1577[var7][var14] = class81.field1769.method1195(407657744);
                }
            }
            boolean var8 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && (var3 / 8) == 48) {
                var8 = true;
            }
            int var9 = class81.field1769.method1216((byte) 118);
            class135.field2794 = new int[var6];
            class117.field2427 = new int[var6];
            class16.field340 = new byte[var6][];
            if (var2 / 8 == 48 && var3 / 8 == 148) {
                var8 = true;
            }
            class55.field1299 = new byte[var6][];
            class34.field690 = new int[var6];
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class117.field2427[var10] = var13;
                        class135.field2794[var10] = class82.field1779.method647((byte) -92, class3.method14(true, new class23[] { class55.field1294, class184.method1132(-1, var11), class145.field2961, class184.method1132(-1, var12) }));
                        class34.field690[var10] = class82.field1779.method647((byte) -46, class3.method14(true, new class23[] { class47.field1068, class184.method1132(-1, var11), class145.field2961, class184.method1132(-1, var12) }));
                        var10++;
                    }
                }
            }
            class43.method344(var3, var9, var5, var2, false, var4);
        }
        int var25 = -41 % ((-arg1 - 36) / 34);
    }
}
