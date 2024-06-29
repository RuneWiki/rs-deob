import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class439 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field6436 = 12;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field6431 = -1;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field6430 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2775(byte arg0) {
        field6435++;
        class306.field4378 = 0;
        int var1 = (class100.field1350.field5284 >> 7) + class184.field2482;
        int var2 = (class100.field1350.field5298 >> 7) + class38.field620;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class306.field4378 = 1;
        }
        if (arg0 < 69) {
            return;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class306.field4378 = 1;
        }
        if (class306.field4378 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class306.field4378 = 0;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lps;", line = 32)
    public static final class395 method2776(int arg0, int arg1) {
        field6434++;
        class24 var2 = class73.field989;
        class395 var3;
        synchronized (class73.field989) {
            var3 = (class395) class73.field989.method209(arg1 ^ 0x7F, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class281.field4131.method1472(class228.method1415(arg0, 29059), class11.method79(arg1, arg0), 0);
        class395 var5 = new class395();
        if (var4 != null) {
            var5.method2583((byte) -9, new class265(var4));
        }
        class24 var6 = class73.field989;
        synchronized (class73.field989) {
            class73.field989.method202(true, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 67)
    public static final void method2777(boolean arg0) {
        class315.method1966((byte) 61, arg0);
        field6438++;
        class130.field1749 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class240.field3383.length; var2++) {
            if (class100.field1352[var2] != -1 && class240.field3383[var2] == null) {
                class240.field3383[var2] = class285.field4163.method1472(0, class100.field1352[var2], 0);
                if (class240.field3383[var2] == null) {
                    var1 = false;
                    class130.field1749++;
                }
            }
            if (class60.field861[var2] != -1 && class300.field4292[var2] == null) {
                class300.field4292[var2] = class285.field4163.method1468(class29.field497[var2], class60.field861[var2], 8610, 0);
                if (class300.field4292[var2] == null) {
                    var1 = false;
                    class130.field1749++;
                }
            }
            if (class191.field2658[var2] != -1 && class387.field5785[var2] == null) {
                class387.field5785[var2] = class285.field4163.method1472(0, class191.field2658[var2], 0);
                if (class387.field5785[var2] == null) {
                    class130.field1749++;
                    var1 = false;
                }
            }
            if (class176.field2298[var2] != -1 && class407.field6104[var2] == null) {
                class407.field6104[var2] = class285.field4163.method1472(0, class176.field2298[var2], 0);
                if (class407.field6104[var2] == null) {
                    class130.field1749++;
                    var1 = false;
                }
            }
            if (class79.field1085 != null && class340.field5008[var2] == null && class79.field1085[var2] != -1) {
                class340.field5008[var2] = class285.field4163.method1468(class29.field497[var2], class79.field1085[var2], 8610, 0);
                if (class340.field5008[var2] == null) {
                    var1 = false;
                    class130.field1749++;
                }
            }
        }
        if (class403.field5987 == null) {
            if (class424.field6307 == null || !class300.field4299.method1479(-1, class424.field6307.field2325 + "_staticelements")) {
                class403.field5987 = new class396(0);
            } else if (class300.field4299.method1453((byte) 58, class424.field6307.field2325 + "_staticelements")) {
                class403.field5987 = class227.method1410(class424.field6307.field2325 + "_staticelements", class300.field4299, (byte) 119, class17.field208);
            } else {
                class130.field1749++;
                var1 = false;
            }
        }
        if (!var1) {
            class413.field6174 = 1;
            return;
        }
        boolean var3 = true;
        class72.field987 = 0;
        for (int var4 = 0; var4 < class240.field3383.length; var4++) {
            byte[] var20 = class300.field4292[var4];
            if (var20 != null) {
                int var21 = (class106.field1417[var4] >> 8) * 64 - class184.field2482;
                int var22 = (class106.field1417[var4] & 0xFF) * 64 - class38.field620;
                if (class54.field806) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class204.method1286(var21, var20, var22, 0);
            }
            byte[] var23 = class407.field6104[var4];
            if (var23 != null) {
                int var24 = (class106.field1417[var4] >> 8) * 64 - class184.field2482;
                int var25 = (class106.field1417[var4] & 0xFF) * 64 - class38.field620;
                if (class54.field806) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class204.method1286(var24, var23, var25, 0);
            }
        }
        if (!var3) {
            class413.field6174 = 2;
            return;
        }
        if (class413.field6174 != 0) {
            class132.method898(true, -29854, class284.field4157 + "<br>(100%)", class311.field4456);
        }
        class87.method540(110);
        class215.method1350(8110);
        boolean var5 = false;
        if (class35.field574.method2165() && class273.field4024) {
            for (int var6 = 0; var6 < class240.field3383.length; var6++) {
                if (class407.field6104[var6] != null || class387.field5785[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class413.field6165) {
            var7 = class97.field1329[class293.field4245];
        } else {
            var7 = class244.field3406[class293.field4245];
        }
        if (class35.field574.method2150()) {
            var7++;
        }
        class344.method2270(4, class324.field4652, class336.field4964, var7, var5, class35.field574.method2110() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class119.field1605[var8].method932((byte) -107);
        }
        class339.method2243((byte) -111);
        class417.method2694(4, false);
        class184.method1137(7716);
        class87.method540(-112);
        System.gc();
        class315.method1966((byte) -127, true);
        class71.method444(4, 1, false);
        int[][] var9 = null;
        if (!class54.field806) {
            class339.method2241(false, (byte) 116);
            class41.method311(class100.field1350.field303[0] >> 3, class100.field1350.field306[0] >> 3, 11);
            class285.method1810(-9941);
            class101.method689(4, class35.field574, false, -119, (int[][]) null);
            var9 = class128.field1703[0];
            class315.method1966((byte) 63, true);
            class52.method359((byte) -93, false);
            if (class340.field5008 != null) {
                class437.method2767(false);
            }
        }
        if (class54.field806) {
            class49.method342(false, false);
            class41.method311(class100.field1350.field303[0] >> 3, class100.field1350.field306[0] >> 3, 11);
            class285.method1810(-9941);
            class101.method689(4, class35.field574, false, -119, (int[][]) null);
            var9 = class128.field1703[0];
            class315.method1966((byte) 121, true);
            method2779(false, 8);
        }
        class215.method1350(8110);
        class315.method1966((byte) -128, true);
        class66.method429(class35.field574, (class337) null, class119.field1605, 4, false, (byte) -106);
        class81.method517(4, -1, class35.field574);
        class315.method1966((byte) 54, true);
        int var10 = class168.field2203;
        if (class193.field2688 < var10) {
            var10 = class193.field2688;
        }
        if (var10 < (class193.field2688 - 1)) {
            var10 = class193.field2688 - 1;
        }
        if (class116.method810((byte) -25)) {
            class40.method308(0);
        } else {
            class40.method308(var10);
        }
        class82.method522(-116);
        if (var5) {
            class247.method1523(true);
            class71.method444(1, 1, true);
            if (!class54.field806) {
                class339.method2241(true, (byte) 66);
                class101.method689(1, class35.field574, true, -124, var9);
                class315.method1966((byte) -118, true);
                class52.method359((byte) -93, true);
                class81.method517(1, -1, class35.field574);
            }
            if (class54.field806) {
                class49.method342(false, true);
                class101.method689(1, class35.field574, true, -122, var9);
                class315.method1966((byte) -127, true);
                method2779(true, 8);
            }
            class215.method1350(8110);
            class315.method1966((byte) 80, true);
            class66.method429(class35.field574, class198.field2829[0], class119.field1605, 1, true, (byte) -125);
            class81.method517(1, -1, class35.field574);
            class315.method1966((byte) 20, true);
            class82.method522(-97);
            class247.method1523(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class324.field4652; var18++) {
                for (int var19 = 0; var19 < class336.field4964; var19++) {
                    class393.method2573(var19, -122, var11, var18);
                }
            }
        }
        class152.method990((byte) -101);
        class87.method540(-117);
        class447.method2811((byte) -103);
        class215.method1350(8110);
        class326.field4683 = false;
        class238.method1454((byte) -67);
        if (class238.field3346 != null && class159.field2079 != null && class137.field1815 == 25) {
            class232.field3279.method756(0, 155);
            class247.field3440++;
            class232.field3279.method1704(1057001181, (byte) 125);
        }
        if (!class54.field806) {
            int var12 = (class93.field1276 - (class324.field4652 >> 4)) / 8;
            int var13 = (class93.field1276 + (class324.field4652 >> 4)) / 8;
            int var14 = (class249.field3539 - (class336.field4964 >> 4)) / 8;
            int var15 = ((class336.field4964 >> 4) + class249.field3539) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class285.field4163.method1461((byte) 126, "m" + var16 + "_" + var17);
                        class285.field4163.method1461((byte) 116, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class137.field1815 == 28) {
            class199.method1251(10, (byte) 84);
        } else {
            class199.method1251(30, (byte) 104);
            if (class159.field2079 != null) {
                class232.field3279.method756(0, 116);
            }
        }
        class169.method1052((byte) -38);
        class87.method540(106);
        class16.method112(-1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lnr;IIILtb;III)Lqa;", line = 501)
    public static final class243 method2778(class437 arg0, int arg1, int arg2, int arg3, class103 arg4, int arg5, int arg6, int arg7) {
        class71.field972.field3983 = arg3;
        class71.field972.field3976 = arg4 != null;
        class71.field972.field3979 = arg2;
        class71.field972.field3992 = arg7;
        class71.field972.field3980 = arg0.field6424;
        class71.field972.field3991 = arg6;
        class71.field972.field3977 = arg5;
        if (arg1 != 1483) {
            method2776(60, -109);
        }
        field6433++;
        return (class243) class114.field1551.method1635((byte) 97, class71.field972);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V", line = 521)
    private static final void method2779(boolean arg0, int arg1) {
        field6437++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class407.field6104;
        } else {
            var3 = class300.field4292;
            var2 = 4;
        }
        int var4 = 0;
        if (arg1 != 8) {
            return;
        }
        while (var4 < var2) {
            class87.method540(arg1 + 92);
            for (int var5 = 0; var5 < (class324.field4652 >> 3); var5++) {
                for (int var6 = 0; var6 < class336.field4964 >> 3; var6++) {
                    int var7 = class445.field6484[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFFB20) >> 14;
                            int var11 = (var7 & 0x3FFA) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class106.field1417.length; var13++) {
                                if (class106.field1417[var13] == var12 && var3[var13] != null) {
                                    class179.method1102((var11 & 0x7) * 8, class35.field574, var5 * 8, class119.field1605, var6 * 8, arg0, var9, var8, (var10 & 0x7) * 8, var3[var13], var4, false);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lc;", line = 606)
    public static final class159 method2780(int arg0) {
        int var1 = 61 / ((30 - arg0) / 63);
        field6432++;
        return class344.field5039 < class234.field3291.length ? class234.field3291[class344.field5039++] : null;
    }
}
