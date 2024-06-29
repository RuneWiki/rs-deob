import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class26 extends class124 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[Lhh;")
    public static class280[] field398 = new class280[8];

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Lvh;")
    public static class108 field396;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ls;")
    public static class92 field392;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZBIZ)V")
    public static final void method174(boolean arg0, byte arg1, int arg2, boolean arg3) {
        field393++;
        int var10002;
        for (int var4 = 0; var4 < class187.field3037; var4++) {
            class141 var21 = class42.field625[class292.field4668[var4]];
            if (var21 != null && var21.method536(123) && var21.field2421.method1401(0)) {
                int var22 = var21.method528(arg1 ^ 0x9);
                if (arg0) {
                    if (!var21.field2421.field3506) {
                        continue;
                    }
                } else if (arg3 != var21.field2421.field3529 || arg2 != 0 && arg2 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field1397 & 0x7F) == 64 && (var21.field1458 & 0x7F) == 64) {
                        int var29 = var21.field1397 >> 7;
                        int var30 = var21.field1458 >> 7;
                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                            var10002 = class50.field861[var29][var30]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field1397 & 0x7F) == 0 && (var21.field1458 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field1397 & 0x7F) == 64 && (var21.field1458 & 0x7F) == 64)) {
                    int var23 = var21.field1458 - (var22 * 64) >> 7;
                    int var24 = var21.field1397 - (var22 * 64) >> 7;
                    int var25 = var21.method528(arg1 + 135) + var24;
                    if (var24 < 0) {
                        var24 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    int var26 = var23 + var21.method528(arg1 - 34);
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    for (int var27 = var24; var27 < var25; var27++) {
                        for (int var28 = var23; var28 < var26; var28++) {
                            var10002 = class50.field861[var27][var28]++;
                        }
                    }
                }
            }
        }
        if (arg1 != -10) {
            field396 = null;
        }
        label215: for (int var5 = 0; var5 < class187.field3037; var5++) {
            long var6 = (long) class292.field4668[var5] << 32 | 0x20000000L;
            class141 var8 = class42.field625[class292.field4668[var5]];
            if (var8 != null && var8.method536(arg1 ^ 0xFFFFFF8D) && var8.field2421.method1401(0)) {
                int var9 = var8.method528(123);
                if (arg0) {
                    if (!var8.field2421.field3506) {
                        continue;
                    }
                } else if (var8.field2421.field3529 != arg3 || arg2 != 0 && arg2 != var9) {
                    continue;
                }
                var8.field1479 = true;
                if (var9 == 1) {
                    if ((var8.field1397 & 0x7F) == 64 && (var8.field1458 & 0x7F) == 64) {
                        int var10 = var8.field1458 >> 7;
                        int var11 = var8.field1397 >> 7;
                        if (var11 < 0 || var11 >= 104 || var10 < 0 || var10 >= 104) {
                            continue;
                        }
                        if (class50.field861[var11][var10] > 1) {
                            var10002 = class50.field861[var11][var10]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var8.field1397 & 0x7F) == 0 && (var8.field1458 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field1397 & 0x7F) == 64 && (var8.field1458 & 0x7F) == 64) {
                    int var12 = var8.field1458 - (var9 * 64) >> 7;
                    int var13 = var8.field1397 - (var9 * 64) >> 7;
                    int var14 = var9 + var12;
                    int var15 = var9 + var13;
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    boolean var16 = true;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    for (int var17 = var13; var17 < var15; var17++) {
                        for (int var20 = var12; var20 < var14; var20++) {
                            if (class50.field861[var17][var20] <= 1) {
                                var16 = false;
                                break;
                            }
                        }
                    }
                    if (var16) {
                        int var18 = var13;
                        while (true) {
                            if (var18 >= var15) {
                                continue label215;
                            }
                            for (int var19 = var12; var19 < var14; var19++) {
                                var10002 = class50.field861[var18][var19]--;
                            }
                            var18++;
                        }
                    }
                }
                var8.field1479 = false;
                if (!var8.field2421.field3479) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field1391 = class10.method68(true, class176.field2886, var8.field1458, var8.field1397);
                class121.method823(class176.field2886, var8.field1397, var8.field1458, var8.field1391, var9 * 64 + 60 - 64, var8, var8.field1413, var6, var8.field1432);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
    public static void method175(boolean arg0) {
        if (!arg0) {
            method177((class109) null, false);
        }
        field396 = null;
        field392 = null;
        field398 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnh;II)V")
    public static final void method176(int arg0, class288 arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field396 = null;
        }
        if (arg1.field1384 == arg2 && arg2 != -1) {
            class167 var4 = class105.method714(arg2, (byte) 73);
            int var5 = var4.field2742;
            if (var5 == 1) {
                arg1.field1440 = 0;
                arg1.field1400 = 1;
                arg1.field1420 = 0;
                arg1.field1393 = arg3;
                arg1.field1465 = 0;
                class112.method786(arg1.field1458, var4, arg1.field1465, arg1.field1397, (byte) -23, class273.field4378 == arg1);
            }
            if (var5 == 2) {
                arg1.field1440 = 0;
            }
        } else if (arg2 == -1 || arg1.field1384 == -1 || class105.method714(arg2, (byte) 87).field2744 >= class105.method714(arg1.field1384, (byte) 68).field2744) {
            arg1.field1400 = 1;
            arg1.field1440 = 0;
            arg1.field1448 = arg1.field1422;
            arg1.field1393 = arg3;
            arg1.field1384 = arg2;
            arg1.field1465 = 0;
            arg1.field1420 = 0;
            if (arg1.field1384 != -1) {
                class112.method786(arg1.field1458, class105.method714(arg1.field1384, (byte) 53), arg1.field1465, arg1.field1397, (byte) -78, class273.field4378 == arg1);
            }
        }
        field395++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lhj;Z)V")
    public static final void method177(class109 arg0, boolean arg1) {
        class216.field3645.method374(-1, arg0);
        while (true) {
            class109 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class109[][] var7;
            class109 var66;
            do {
                class109 var65;
                do {
                    class109 var64;
                    do {
                        class109 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class109) class216.field3645.method368(-1);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1963);
                                            var3 = var2.field1970;
                                            var4 = var2.field1958;
                                            var5 = var2.field1973;
                                            var6 = var2.field1959;
                                            var7 = class79.field1367[var5];
                                            if (!var2.field1955) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class109 var8 = class79.field1367[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1963) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class184.field2994 && var3 > class90.field1601) {
                                                    class109 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1963 && (var9.field1955 || (var2.field1975 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class184.field2994 && var3 < class37.field546 - 1) {
                                                    class109 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1963 && (var10.field1955 || (var2.field1975 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class102.field1795 && var4 > class153.field2564) {
                                                    class109 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1963 && (var11.field1955 || (var2.field1975 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class102.field1795 && var4 < class229.field3860 - 1) {
                                                    class109 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1963 && (var12.field1955 || (var2.field1975 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1955 = false;
                                            if (var2.field1980 != null) {
                                                class109 var13 = var2.field1980;
                                                if (var13.field1971 == null) {
                                                    if (var13.field1956 != null) {
                                                        if (class152.method1041(0, var3, var4)) {
                                                            class196.method1292(var13.field1956, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, true);
                                                        } else {
                                                            class196.method1292(var13.field1956, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class152.method1041(0, var3, var4)) {
                                                    class181.method1196(var13.field1971, 0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, true);
                                                } else {
                                                    class181.method1196(var13.field1971, 0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, false);
                                                }
                                                class212 var14 = var13.field1957;
                                                if (var14 != null) {
                                                    var14.field3572.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var14.field3581 - class50.field854, var14.field3573 - class210.field3554, var14.field3574 - class199.field3272, var14.field3577, var5, (class32) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1968; var15++) {
                                                    class173 var16 = var13.field1961[var15];
                                                    if (var16 != null) {
                                                        var16.field2842.method120(var16.field2847, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var16.field2846 - class50.field854, var16.field2835 - class210.field3554, var16.field2845 - class199.field3272, var16.field2850, var5, (class32) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1971 == null) {
                                                if (var2.field1956 != null) {
                                                    if (class152.method1041(var6, var3, var4)) {
                                                        class196.method1292(var2.field1956, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class196.method1292(var2.field1956, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, false);
                                                    }
                                                }
                                            } else if (class152.method1041(var6, var3, var4)) {
                                                class181.method1196(var2.field1971, var6, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1971.field3646 != 12345678 || class125.field2202 && var5 <= class74.field1219) {
                                                    class181.method1196(var2.field1971, var6, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class11 var18 = var2.field1978;
                                                if (var18 != null && (var18.field159 & 0x80000000L) != 0L) {
                                                    var18.field158.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var18.field161 - class50.field854, var18.field163 - class210.field3554, var18.field154 - class199.field3272, var18.field159, var5, (class32) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class212 var21 = var2.field1957;
                                            class223 var22 = var2.field1976;
                                            if (var21 != null || var22 != null) {
                                                if (class184.field2994 == var3) {
                                                    var19++;
                                                } else if (class184.field2994 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class102.field1795 == var4) {
                                                    var19 += 3;
                                                } else if (class102.field1795 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class72.field1188[var19];
                                                var2.field1966 = class97.field1658[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3571 & class184.field2985[var19]) == 0) {
                                                    var2.field1967 = 0;
                                                } else if (var21.field3571 == 16) {
                                                    var2.field1967 = 3;
                                                    var2.field1962 = class49.field850[var19];
                                                    var2.field1969 = 3 - var2.field1962;
                                                } else if (var21.field3571 == 32) {
                                                    var2.field1967 = 6;
                                                    var2.field1962 = class12.field171[var19];
                                                    var2.field1969 = 6 - var2.field1962;
                                                } else if (var21.field3571 == 64) {
                                                    var2.field1967 = 12;
                                                    var2.field1962 = class105.field1880[var19];
                                                    var2.field1969 = 12 - var2.field1962;
                                                } else {
                                                    var2.field1967 = 9;
                                                    var2.field1962 = class145.field2478[var19];
                                                    var2.field1969 = 9 - var2.field1962;
                                                }
                                                if ((var21.field3571 & var20) != 0 && !class206.method1361(var6, var3, var4, var21.field3571)) {
                                                    var21.field3572.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var21.field3581 - class50.field854, var21.field3573 - class210.field3554, var21.field3574 - class199.field3272, var21.field3577, var5, (class32) null);
                                                }
                                                if ((var21.field3570 & var20) != 0 && !class206.method1361(var6, var3, var4, var21.field3570)) {
                                                    var21.field3575.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var21.field3581 - class50.field854, var21.field3573 - class210.field3554, var21.field3574 - class199.field3272, var21.field3577, var5, (class32) null);
                                                }
                                            }
                                            if (var22 != null && !class83.method546(var6, var3, var4, var22.field3764.method110())) {
                                                if ((var22.field3758 & var20) != 0) {
                                                    var22.field3764.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var22.field3766 + var22.field3767 - class50.field854, var22.field3763 - class210.field3554, var22.field3760 + var22.field3756 - class199.field3272, var22.field3759, var5, (class32) null);
                                                } else if (var22.field3758 == 256) {
                                                    int var23 = var22.field3766 - class50.field854;
                                                    int var24 = var22.field3763 - class210.field3554;
                                                    int var25 = var22.field3760 - class199.field3272;
                                                    int var26 = var22.field3762;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3764.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var22.field3767 + var23, var24, var22.field3756 + var25, var22.field3759, var5, (class32) null);
                                                    } else if (var22.field3753 != null) {
                                                        var22.field3753.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var23, var24, var25, var22.field3759, var5, (class32) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class11 var29 = var2.field1978;
                                                if (var29 != null && (var29.field159 & 0x80000000L) == 0L) {
                                                    var29.field158.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var29.field161 - class50.field854, var29.field163 - class210.field3554, var29.field154 - class199.field3272, var29.field159, var5, (class32) null);
                                                }
                                                class20 var30 = var2.field1982;
                                                if (var30 != null && var30.field314 == 0) {
                                                    if (var30.field317 != null) {
                                                        var30.field317.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var30.field321 - class50.field854, var30.field318 - class210.field3554, var30.field322 - class199.field3272, var30.field319, var5, (class32) null);
                                                    }
                                                    if (var30.field315 != null) {
                                                        var30.field315.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var30.field321 - class50.field854, var30.field318 - class210.field3554, var30.field322 - class199.field3272, var30.field319, var5, (class32) null);
                                                    }
                                                    if (var30.field316 != null) {
                                                        var30.field316.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var30.field321 - class50.field854, var30.field318 - class210.field3554, var30.field322 - class199.field3272, var30.field319, var5, (class32) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1975;
                                            if (var31 != 0) {
                                                if (var3 < class184.field2994 && (var31 & 0x4) != 0) {
                                                    class109 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1963) {
                                                        class216.field3645.method374(-1, var32);
                                                    }
                                                }
                                                if (var4 < class102.field1795 && (var31 & 0x2) != 0) {
                                                    class109 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1963) {
                                                        class216.field3645.method374(-1, var33);
                                                    }
                                                }
                                                if (var3 > class184.field2994 && (var31 & 0x1) != 0) {
                                                    class109 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1963) {
                                                        class216.field3645.method374(-1, var34);
                                                    }
                                                }
                                                if (var4 > class102.field1795 && (var31 & 0x8) != 0) {
                                                    class109 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1963) {
                                                        class216.field3645.method374(-1, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1967 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1968; var37++) {
                                                if (class142.field2447 != var2.field1961[var37].field2851 && (var2.field1979[var37] & var2.field1967) == var2.field1962) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class212 var38 = var2.field1957;
                                                if (!class206.method1361(var6, var3, var4, var38.field3571)) {
                                                    var38.field3572.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var38.field3581 - class50.field854, var38.field3573 - class210.field3554, var38.field3574 - class199.field3272, var38.field3577, var5, (class32) null);
                                                }
                                                var2.field1967 = 0;
                                            }
                                        }
                                        if (!var2.field1964) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1968;
                                            var2.field1964 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class173 var42 = var2.field1961[var41];
                                                if (class142.field2447 != var42.field2851) {
                                                    for (int var43 = var42.field2840; var43 <= var42.field2855; var43++) {
                                                        for (int var44 = var42.field2839; var44 <= var42.field2843; var44++) {
                                                            class109 var45 = var7[var43][var44];
                                                            if (var45.field1955) {
                                                                var2.field1964 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1967 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2840) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2855) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2839) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2843) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1967) == var2.field1969) {
                                                                    var2.field1964 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class190.field3083[var40++] = var42;
                                                    int var47 = class184.field2994 - var42.field2840;
                                                    int var48 = var42.field2855 - class184.field2994;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class102.field1795 - var42.field2839;
                                                    int var50 = var42.field2843 - class102.field1795;
                                                    if (var50 > var49) {
                                                        var42.field2836 = var47 + var50;
                                                    } else {
                                                        var42.field2836 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class173 var54 = class190.field3083[var53];
                                                    if (class142.field2447 != var54.field2851) {
                                                        if (var54.field2836 > var51) {
                                                            var51 = var54.field2836;
                                                            var52 = var53;
                                                        } else if (var54.field2836 == var51) {
                                                            int var55 = var54.field2846 - class50.field854;
                                                            int var56 = var54.field2845 - class199.field3272;
                                                            int var57 = class190.field3083[var52].field2846 - class50.field854;
                                                            int var58 = class190.field3083[var52].field2845 - class199.field3272;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class173 var59 = class190.field3083[var52];
                                                var59.field2851 = class142.field2447;
                                                if (!class121.method829(var6, var59.field2840, var59.field2855, var59.field2839, var59.field2843, var59.field2842.method110())) {
                                                    var59.field2842.method120(var59.field2847, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var59.field2846 - class50.field854, var59.field2835 - class210.field3554, var59.field2845 - class199.field3272, var59.field2850, var5, (class32) null);
                                                }
                                                for (int var60 = var59.field2840; var60 <= var59.field2855; var60++) {
                                                    for (int var61 = var59.field2839; var61 <= var59.field2843; var61++) {
                                                        class109 var62 = var7[var60][var61];
                                                        if (var62.field1967 != 0) {
                                                            class216.field3645.method374(-1, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1963) {
                                                            class216.field3645.method374(-1, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1964) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1964 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1963);
                            } while (var2.field1967 != 0);
                            if (var3 > class184.field2994 || var3 <= class90.field1601) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1963);
                        if (var3 < class184.field2994 || var3 >= class37.field546 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1963);
                    if (var4 > class102.field1795 || var4 <= class153.field2564) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1963);
                if (var4 < class102.field1795 || var4 >= class229.field3860 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1963);
            var2.field1963 = false;
            class201.field3309--;
            class20 var67 = var2.field1982;
            if (var67 != null && var67.field314 != 0) {
                if (var67.field317 != null) {
                    var67.field317.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var67.field321 - class50.field854, var67.field318 - class210.field3554 - var67.field314, var67.field322 - class199.field3272, var67.field319, var5, (class32) null);
                }
                if (var67.field315 != null) {
                    var67.field315.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var67.field321 - class50.field854, var67.field318 - class210.field3554 - var67.field314, var67.field322 - class199.field3272, var67.field319, var5, (class32) null);
                }
                if (var67.field316 != null) {
                    var67.field316.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var67.field321 - class50.field854, var67.field318 - class210.field3554 - var67.field314, var67.field322 - class199.field3272, var67.field319, var5, (class32) null);
                }
            }
            if (var2.field1966 != 0) {
                class223 var68 = var2.field1976;
                if (var68 != null && !class83.method546(var6, var3, var4, var68.field3764.method110())) {
                    if ((var68.field3758 & var2.field1966) != 0) {
                        var68.field3764.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var68.field3766 + var68.field3767 - class50.field854, var68.field3763 - class210.field3554, var68.field3760 + var68.field3756 - class199.field3272, var68.field3759, var5, (class32) null);
                    } else if (var68.field3758 == 256) {
                        int var69 = var68.field3766 - class50.field854;
                        int var70 = var68.field3763 - class210.field3554;
                        int var71 = var68.field3760 - class199.field3272;
                        int var72 = var68.field3762;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field3764.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var68.field3767 + var69, var70, var68.field3756 + var71, var68.field3759, var5, (class32) null);
                        } else if (var68.field3753 != null) {
                            var68.field3753.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var69, var70, var71, var68.field3759, var5, (class32) null);
                        }
                    }
                }
                class212 var75 = var2.field1957;
                if (var75 != null) {
                    if ((var75.field3570 & var2.field1966) != 0 && !class206.method1361(var6, var3, var4, var75.field3570)) {
                        var75.field3575.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var75.field3581 - class50.field854, var75.field3573 - class210.field3554, var75.field3574 - class199.field3272, var75.field3577, var5, (class32) null);
                    }
                    if ((var75.field3571 & var2.field1966) != 0 && !class206.method1361(var6, var3, var4, var75.field3571)) {
                        var75.field3572.method120(0, class84.field1526, class98.field1692, class264.field4290, class183.field2977, var75.field3581 - class50.field854, var75.field3573 - class210.field3554, var75.field3574 - class199.field3272, var75.field3577, var5, (class32) null);
                    }
                }
            }
            if (var5 < class193.field3126 - 1) {
                class109 var76 = class79.field1367[var5 + 1][var3][var4];
                if (var76 != null && var76.field1963) {
                    class216.field3645.method374(-1, var76);
                }
            }
            if (var3 < class184.field2994) {
                class109 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1963) {
                    class216.field3645.method374(-1, var77);
                }
            }
            if (var4 < class102.field1795) {
                class109 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1963) {
                    class216.field3645.method374(-1, var78);
                }
            }
            if (var3 > class184.field2994) {
                class109 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1963) {
                    class216.field3645.method374(-1, var79);
                }
            }
            if (var4 > class102.field1795) {
                class109 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1963) {
                    class216.field3645.method374(-1, var80);
                }
            }
        }
    }
}
