import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class198 extends class187 {

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1337(int arg0) {
        class133.method910(false, 0);
        field2974++;
        class183.field2796 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class204.field3079.length; var2++) {
            if (class129.field2022[var2] != -1 && class204.field3079[var2] == null) {
                class204.field3079[var2] = class297.field4554.method2103(arg0 - 28, class129.field2022[var2], 0);
                if (class204.field3079[var2] == null) {
                    class183.field2796++;
                    var1 = false;
                }
            }
            if (class334.field5191[var2] != -1 && class151.field2380[var2] == null) {
                class151.field2380[var2] = class297.field4554.method2109(-11584, class142.field2255[var2], class334.field5191[var2], 0);
                if (class151.field2380[var2] == null) {
                    var1 = false;
                    class183.field2796++;
                }
            }
            if (class333.field5166) {
                if (class40.field576[var2] != -1 && class184.field2827[var2] == null) {
                    class184.field2827[var2] = class297.field4554.method2103(arg0 - 28, class40.field576[var2], 0);
                    if (class184.field2827[var2] == null) {
                        var1 = false;
                        class183.field2796++;
                    }
                }
                if (class314.field4953[var2] != -1 && class305.field4775[var2] == null) {
                    class305.field4775[var2] = class297.field4554.method2103(0, class314.field4953[var2], 0);
                    if (class305.field4775[var2] == null) {
                        class183.field2796++;
                        var1 = false;
                    }
                }
            }
            if (class188.field2857 != null && class183.field2811[var2] == null && class188.field2857[var2] != -1) {
                class183.field2811[var2] = class297.field4554.method2109(-11584, class142.field2255[var2], class188.field2857[var2], 0);
                if (class183.field2811[var2] == null) {
                    class183.field2796++;
                    var1 = false;
                }
            }
        }
        if (class210.field3333 == null) {
            if (class336.field5223 == null || !class2.field13.method2101(class336.field5223.field3021 + "_labels", 0)) {
                class210.field3333 = new class121(0);
            } else if (class2.field13.method2108(class336.field5223.field3021 + "_labels", arg0 - 28)) {
                class210.field3333 = class110.method743(class336.field5223.field3021 + "_labels", class2.field13, arg0 ^ 0x66);
            } else {
                var1 = false;
                class183.field2796++;
            }
        }
        if (!var1) {
            class19.field257 = 1;
            return;
        }
        boolean var3 = true;
        class255.field3990 = 0;
        for (int var4 = 0; var4 < class204.field3079.length; var4++) {
            byte[] var5 = class151.field2380[var4];
            if (var5 != null) {
                int var6 = (class121.field1865[var4] >> 8) * 64 - class30.field374;
                int var7 = (class121.field1865[var4] & 0xFF) * 64 - class294.field4535;
                if (class133.field2098) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class274.method1798(var5, var7, arg0 - 25631, var6);
            }
            if (class333.field5166) {
                byte[] var8 = class305.field4775[var4];
                if (var8 != null) {
                    int var9 = (class121.field1865[var4] >> 8) * 64 - class30.field374;
                    int var10 = (class121.field1865[var4] & 0xFF) * 64 - class294.field4535;
                    if (class133.field2098) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class274.method1798(var8, var10, -25603, var9);
                }
            }
        }
        if (!var3) {
            class19.field257 = 2;
            return;
        }
        if (class19.field257 != 0) {
            class204.method1369(true, true, class200.field3016 + "<br>(100%)");
        }
        boolean var11 = false;
        class233.method1592(true);
        class205.method1376(0);
        if (class333.field5166 && class297.field4556) {
            for (int var12 = 0; var12 < class204.field3079.length; var12++) {
                if (class305.field4775[var12] != null || class184.field2827[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class120.method817(4, 104, 104, class333.field5166 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class33.field425[var13].method1921(-21761);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class305.field4784[var14][var15][var16] = 0;
                }
            }
        }
        class113.method758(false, true);
        if (class333.field5166) {
            class11.field112.method163();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class11.field110[var17][var18].field2785 = true;
                }
            }
        }
        if (class333.field5166) {
            class147.method1028();
        }
        if (class333.field5166) {
            class58.method397(72);
        }
        class233.method1592(true);
        System.gc();
        class133.method910(true, arg0 - 28);
        class313.method2147(false, false);
        if (!class133.field2098) {
            class152.method1065(false, arg0 - 147);
            class133.method910(true, arg0 ^ 0x1C);
            if (class333.field5166) {
                int var19 = class79.field1173.field476[0] >> 3;
                int var20 = class79.field1173.field505[0] >> 3;
                class246.method1663(var20, -96, var19);
            }
            class197.method1331(false, 0);
            if (class183.field2811 != null) {
                class229.method1569((byte) -101);
            }
        }
        if (class133.field2098) {
            class96.method661(false, -4390);
            class133.method910(true, 0);
            if (class333.field5166) {
                int var21 = class79.field1173.field476[0] >> 3;
                int var22 = class79.field1173.field505[0] >> 3;
                class246.method1663(var22, -100, var21);
            }
            class143.method999(arg0 + 54303684, false);
        }
        class205.method1376(arg0 - 28);
        class133.method910(true, 0);
        class317.method2158(false, class33.field425, (byte) -122, class133.field2098 ? class212.field3362 : (int[][][]) null);
        if (class333.field5166) {
            class147.method1029();
        }
        class133.method910(true, arg0 - 28);
        int var23 = class174.field2662;
        if (var23 > class77.field1154) {
            var23 = class77.field1154;
        }
        if (var23 < (class77.field1154 - 1)) {
            int var24 = class77.field1154 - 1;
        }
        if (class148.method1042((byte) 54)) {
            class58.method399(0);
        } else {
            class58.method399(class174.field2662);
        }
        class63.method420(-100);
        if (class333.field5166 && var11) {
            class95.method653(true);
            class313.method2147(true, false);
            if (!class133.field2098) {
                class152.method1065(true, arg0 ^ 0xFFFFFFBE);
                class133.method910(true, 0);
                class197.method1331(true, 0);
            }
            if (class133.field2098) {
                class96.method661(true, arg0 ^ 0xFFFFEEC6);
                class133.method910(true, 0);
                class143.method999(54303712, true);
            }
            class205.method1376(0);
            class133.method910(true, arg0 ^ 0x1C);
            class317.method2158(true, class33.field425, (byte) -122, class133.field2098 ? class212.field3362 : (int[][][]) null);
            class133.method910(true, 0);
            class63.method420(-100);
            class95.method653(false);
        }
        if (class333.field5166) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class11.field110[var25][var26].method1257(client.field2034[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class310.method2134(var28, var27, arg0 ^ 0x18);
            }
        }
        class143.method1004(arg0 - 96);
        class233.method1592(true);
        class194.method1319(15);
        class205.method1376(0);
        class44.field629 = false;
        if (class333.field5166) {
            class167.method1137(100, true);
        }
        if (class261.field4045 != null && class308.field4851 != null && class304.field4758 == 25) {
            class265.field4095.method2064(255, 218);
            class265.field4095.method2013(1057001181, arg0 ^ 0xFFFFFFA9);
            class197.field2959++;
        }
        if (!class133.field2098) {
            int var29 = (class144.field2288 - 6) / 8;
            int var30 = (class144.field2288 + 6) / 8;
            int var31 = (class240.field3815 - 6) / 8;
            int var32 = (class240.field3815 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var29 || var30 < var33 || var34 < var31 || var34 > var32) {
                        class297.field4554.method2084(-2, "m" + var33 + "_" + var34);
                        class297.field4554.method2084(-2, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class304.field4758 == arg0) {
            class231.method1583(10, (byte) 25);
        } else {
            class231.method1583(30, (byte) -52);
            if (class308.field4851 != null) {
                class265.field4095.method2064(255, 181);
            }
        }
        class230.method1579(-32769);
        class233.method1592(true);
        class293.method1909(0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLbd;)V", line = 518)
    public static final void method1338(byte arg0, class20 arg1) {
        short var2 = 256;
        if (arg0 != -18) {
            return;
        }
        for (int var3 = 0; var3 < class231.field3730.length; var3++) {
            class231.field3730[var3] = 0;
        }
        field2980++;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * 128.0D * Math.random());
            class231.field3730[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class136.field2115[var9] = (class231.field3730[var9 + 1] + class231.field3730[var9 - 1] - (-class231.field3730[var9 - 128] + -class231.field3730[var9 + 128])) / 4;
                }
            }
            int[] var10 = class231.field3730;
            class231.field3730 = class136.field2115;
            class136.field2115 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field1170; var12++) {
            for (int var13 = 0; var13 < arg1.field1166; var13++) {
                if (arg1.field268[var11++] != 0) {
                    int var14 = var13 + arg1.field1168 + 16;
                    int var15 = arg1.field1165 + var12 + 16;
                    int var16 = var14 + (var15 << 7);
                    class231.field3730[var16] = 0;
                }
            }
        }
    }
}
