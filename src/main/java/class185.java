import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class185 extends class288 {

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    private int field2853;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2862 = "Opened title screen";

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "Lam;")
    public static class180 field2857 = new class180();

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[J")
    public static long[] field2864 = new long[1000];

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[Lg;")
    public static class284[] field2865 = new class284[0];

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field2867 = -2;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2866;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        if (arg2 < -11) {
            ++field2851;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        ++field2855;
        if (arg0 != 1429) {
            this.method104(66, 71, -36);
        }
        int var4 = this.field2853 * arg1 >> 12;
        int var5 = this.field2854 * arg1 >> 12;
        int var6 = this.field2859 * arg2 >> 12;
        int var7 = this.field2861 * arg2 >> 12;
        class38.method277(super.field4567, var6, -81, var5, var7, var4);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIII)V")
    public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2854 = arg2;
        this.field2861 = arg3;
        this.field2859 = arg1;
        this.field2853 = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -12984) {
            method1247(-44, 101, -80, -125, 58, 49, -107, 90);
        }
        ++field2852;
        if (arg6 >= 1 && arg0 >= 1 && ~arg6 >= -103 && ~arg0 >= -103) {
            if (!class191.method1284(-102) && ~(class181.field2827[0][arg6][arg0] & 2) == -1) {
                int var8 = arg7;
                if ((class181.field2827[arg7][arg6][arg0] & 8) != 0) {
                    var8 = 0;
                }
                if (class255.field4081 != var8) {
                    return;
                }
            }
            int var9 = arg7;
            if (arg7 < 3 && ~(class181.field2827[1][arg6][arg0] & 2) == -3) {
                var9 = arg7 + 1;
            }
            class66.method489(arg7, (byte) 58, var9, arg4, arg0, arg6, class176.field2765[arg7]);
            if (arg1 >= 0) {
                boolean var10 = class132.field2072;
                class132.field2072 = true;
                class82.method584(false, arg1, arg7, arg6, arg5, arg0, true, false, var9, class176.field2765[arg7], arg3);
                class132.field2072 = var10;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILsd;)I")
    public static final int method1248(int arg0, class45 arg1) {
        ++field2856;
        if (arg0 != -1) {
            return -103;
        } else {
            class60 var2 = arg1.field645;
            if (var2.field1020 != null) {
                var2 = var2.method459(true);
                if (var2 == null) {
                    return -1;
                }
            }
            int var3 = var2.field1014;
            class283 var4 = arg1.method972((byte) -71);
            if (~arg1.field2250 != ~var4.field4496) {
                if (arg1.field2250 != var4.field4468 && ~arg1.field2250 != ~var4.field4497 && ~arg1.field2250 != ~var4.field4485 && ~arg1.field2250 != ~var4.field4495) {
                    if (arg1.field2250 == var4.field4494 || ~arg1.field2250 == ~var4.field4454 || arg1.field2250 == var4.field4466 || arg1.field2250 == var4.field4483) {
                        var3 = var2.field1000;
                    }
                } else {
                    var3 = var2.field983;
                }
            } else {
                var3 = var2.field981;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static void method1249(boolean arg0) {
        field2866 = null;
        field2865 = null;
        field2862 = null;
        if (arg0) {
            field2865 = null;
        }
        field2857 = null;
        field2864 = null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)V")
    public final void method104(int arg0, int arg1, int arg2) {
        if (arg0 < -31) {
            ++field2860;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lre;IIIIIIIBI)V")
    public static final void method1250(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        ++field2858;
        class211.method1418(arg4, arg6, arg9, arg3);
        class195.method1331();
        int var10 = -92 / ((-6 - arg8) / 42);
        for (int var11 = 0; var11 < arg0.length; ++var11) {
            class228 var12 = arg0[var11];
            if (var12 != null && (var12.field3467 == arg2 || ~arg2 == 1412584498 && class205.field3205 == var12)) {
                int var13;
                if (~arg1 == 0) {
                    class129.field2025[class77.field1262] = var12.field3577 + arg7;
                    class115.field1879[class77.field1262] = var12.field3532 + arg5;
                    class251.field4040[class77.field1262] = var12.field3574;
                    class278.field4418[class77.field1262] = var12.field3625;
                    var13 = class77.field1262++;
                } else {
                    var13 = arg1;
                }
                var12.field3617 = var13;
                var12.field3575 = class192.field2978;
                if (!var12.field3520 || !client.method1046(var12)) {
                    if (~var12.field3549 < -1) {
                        class108.method772(var12, (byte) -127);
                    }
                    int var14 = var12.field3577 + arg7;
                    int var15 = var12.field3532 + arg5;
                    int var16 = var12.field3570;
                    if (class170.field2647 && (client.method1059(var12).field4362 != 0 || ~var12.field3477 == -1) && ~var16 < -128) {
                        var16 = 127;
                    }
                    if (class205.field3205 == var12) {
                        if (~arg2 != 1412584498 && !var12.field3472) {
                            class28.field394 = arg7;
                            class126.field1986 = arg0;
                            class39.field564 = arg5;
                            continue;
                        }
                        if (class37.field530 && class71.field1148) {
                            int var17 = class79.field1323;
                            int var18 = class115.field1883;
                            int var19 = var17 - class280.field4427;
                            int var20 = var18 - class180.field2805;
                            if (~class142.field2165 < ~var19) {
                                var19 = class142.field2165;
                            }
                            if (~var20 > ~class237.field3844) {
                                var20 = class237.field3844;
                            }
                            if (class237.field3844 + class78.field1293.field3625 < var12.field3625 + var20) {
                                var20 = class237.field3844 - -class78.field1293.field3625 + -var12.field3625;
                            }
                            var15 = var20;
                            if (~(class142.field2165 - -class78.field1293.field3574) > ~(var19 - -var12.field3574)) {
                                var19 = class142.field2165 - (-class78.field1293.field3574 - -var12.field3574);
                            }
                            var14 = var19;
                        }
                        if (!var12.field3472) {
                            var16 = 128;
                        }
                    }
                    int var21;
                    int var24;
                    int var25;
                    int var26;
                    if (~var12.field3477 != -3) {
                        var21 = ~arg4 > ~var14 ? var14 : arg4;
                        int var22 = var12.field3625 + var15;
                        int var23 = var12.field3574 + var14;
                        if (~var12.field3477 == -10) {
                            ++var22;
                            ++var23;
                        }
                        var24 = ~arg9 >= ~var23 ? arg9 : var23;
                        var25 = ~arg3 < ~var22 ? var22 : arg3;
                        var26 = arg6 < var15 ? var15 : arg6;
                    } else {
                        var25 = arg3;
                        var21 = arg4;
                        var26 = arg6;
                        var24 = arg9;
                    }
                    if (!var12.field3520 || ~var21 > ~var24 && ~var25 < ~var26) {
                        if (var12.field3549 != 0) {
                            if (var12.field3549 == 1337 || ~var12.field3549 == -1404) {
                                class212.field3291 = var14;
                                class177.field2767 = var12;
                                class212.field3289 = var15;
                                method1251(var12.field3625, var12.field3549 == 1403, var14, var12.field3574, 0, var15);
                                class25.field335[var13] = true;
                                class211.method1418(arg4, arg6, arg9, arg3);
                                continue;
                            }
                            if (var12.field3549 == 1338) {
                                if (!var12.method1518(77)) {
                                    continue;
                                }
                                class197.method1344(var13, 4, var14, var12, var15);
                                class211.method1418(arg4, arg6, arg9, arg3);
                                if (~class53.field806 != -1 && class53.field806 != 3 || class47.field687 || class179.field2796 < var21 || var26 > class147.field2332 || class179.field2796 >= var24 || class147.field2332 >= var25) {
                                    continue;
                                }
                                int var27 = -var15 + class147.field2332;
                                int var28 = var12.field3589[var27];
                                int var29 = -var14 + class179.field2796;
                                if (var28 > var29 || ~(var12.field3544[var27] + var28) > ~var29) {
                                    continue;
                                }
                                int var30 = var29 - var12.field3574 / 2;
                                int var31 = 2047 & (int) class16.field244 + class103.field1732;
                                int var32 = class195.field3091[var31];
                                int var33 = (class77.field1265 + 256) * var32 >> 8;
                                int var34 = class195.field3089[var31];
                                int var35 = var27 - var12.field3625 / 2;
                                int var36 = (class77.field1265 - -256) * var34 >> 8;
                                int var37 = var30 * var36 + var33 * var35 >> 11;
                                int var38 = class283.field4473.field2240 + var37 + 64 + -(class283.field4473.method971(65535) * 64) >> 7;
                                int var39 = var35 * var36 + -(var30 * var33) >> 11;
                                int var40 = class283.field4473.field2278 - (var39 - (-(class283.field4473.method971(65535) * 64) + 64)) >> 7;
                                if (class122.field1960 && ~(class170.field2644 & 64) != -1) {
                                    class228 var41 = class31.method239(class139.field2132, -1, class102.field1704);
                                    if (var41 != null) {
                                        class117.method825(class258.field4123, -1, class37.field518, var40, 1L, (short) 11, " ->", var38);
                                    } else {
                                        class150.method1008(false);
                                    }
                                    continue;
                                }
                                if (class167.field2613 == 1) {
                                    class117.method825(-1, -1, class222.field3406, var40, 1L, (short) 18, "", var38);
                                }
                                class117.method825(-1, -1, class186.field2868, var40, 1L, (short) 2, "", var38);
                                continue;
                            }
                            if (var12.field3549 == 1339) {
                                if (var12.method1518(76)) {
                                    class248.method1709(var14, var13, true, var12, var15);
                                    class211.method1418(arg4, arg6, arg9, arg3);
                                }
                                continue;
                            }
                            if (var12.field3549 == 1400) {
                                class149.method1002(2, var14, var12.field3625, var12.field3574, var15);
                                class25.field335[var13] = true;
                                class85.field1428[var13] = true;
                                class211.method1418(arg4, arg6, arg9, arg3);
                                continue;
                            }
                            if (var12.field3549 == 1401) {
                                class219.method1471(var12.field3625, var12.field3574, var15, false, var14);
                                class25.field335[var13] = true;
                                class85.field1428[var13] = true;
                                class211.method1418(arg4, arg6, arg9, arg3);
                                continue;
                            }
                            if (~var12.field3549 == -1403) {
                                class253.method1727(var15, var14, false);
                                class25.field335[var13] = true;
                                class85.field1428[var13] = true;
                                continue;
                            }
                            if (~var12.field3549 == -1406) {
                                if (!class11.field208) {
                                    continue;
                                }
                                int var42 = var12.field3574 + var14;
                                int var43 = var15 + 15;
                                class179.field2784.method1657("Fps:" + class106.field1771, var42, var43, 16776960, -1);
                                Runtime var44 = Runtime.getRuntime();
                                int var132 = var43 + 15;
                                int var45 = (int) ((var44.totalMemory() + -var44.freeMemory()) / 1024L);
                                int var46 = 16776960;
                                if (var45 > 65536) {
                                    var46 = 16711680;
                                }
                                int var47 = 0;
                                int var48 = 0;
                                int var49 = 0;
                                class179.field2784.method1657("Mem:" + var45 + "k", var42, var132, var46, -1);
                                int var50 = 16776960;
                                for (int var51 = 0; var51 < 29; ++var51) {
                                    var48 += class230.field3659[var51].method1969(-164777272);
                                    var49 += class230.field3659[var51].method1975((byte) -41);
                                    var47 += class230.field3659[var51].method1966(true);
                                }
                                var43 = var132 + 15;
                                int var52 = var49 * 10000 / var48;
                                int var53 = var47 * 100 / var48;
                                String var54 = "Cache:" + class128.method887((byte) 110, 0, (long) var52, true, 2) + "% (" + var53 + "%)";
                                class28.field392.method1657(var54, var42, var43, var50, -1);
                                class25.field335[var13] = true;
                                class85.field1428[var13] = true;
                                var43 += 12;
                                continue;
                            }
                            if (~var12.field3549 == -1407) {
                                class104.field1739 = var12;
                                class205.field3197 = var15;
                                class71.field1143 = var14;
                                continue;
                            }
                        }
                        if (!class47.field687) {
                            if (var12.field3477 == 0 && var12.field3636 && ~class179.field2796 <= ~var21 && ~class147.field2332 <= ~var26 && class179.field2796 < var24 && var25 > class147.field2332 && !class170.field2647) {
                                class268.field4273[0] = class248.field4020;
                                class146.field2319[0] = 1004;
                                class128.field2018 = 1;
                                class88.field1492[0] = class94.field1600;
                                class256.field4099[0] = "";
                            }
                            if (var21 <= class179.field2796 && var26 <= class147.field2332 && ~class179.field2796 > ~var24 && class147.field2332 < var25) {
                                class39.method292((byte) -125, var12, class179.field2796 - var14, class147.field2332 - var15);
                            }
                        }
                        if (~var12.field3477 == -1) {
                            if (!var12.field3520 && client.method1046(var12) && class209.field3258 != var12) {
                                continue;
                            }
                            if (!var12.field3520) {
                                if (var12.field3523 > var12.field3513 - var12.field3625) {
                                    var12.field3523 = -var12.field3625 + var12.field3513;
                                }
                                if (~var12.field3523 > -1) {
                                    var12.field3523 = 0;
                                }
                            }
                            method1250(arg0, var13, var12.field3480, var25, var21, -var12.field3523 + var15, var26, -var12.field3606 + var14, (byte) 80, var24);
                            if (var12.field3498 != null) {
                                method1250(var12.field3498, var13, var12.field3480, var25, var21, -var12.field3523 + var15, var26, -var12.field3606 + var14, (byte) 38, var24);
                            }
                            class251 var55 = (class251) class127.field2007.method285((long) var12.field3480, 13821);
                            if (var55 != null) {
                                if (~var55.field4045 == -1 && !class47.field687 && class179.field2796 >= var21 && ~var26 >= ~class147.field2332 && ~var24 < ~class179.field2796 && var25 > class147.field2332 && !class170.field2647) {
                                    class146.field2319[0] = 1004;
                                    class268.field4273[0] = class248.field4020;
                                    class128.field2018 = 1;
                                    class88.field1492[0] = class94.field1600;
                                    class256.field4099[0] = "";
                                }
                                class186.method1256(23419, var26, var24, var13, var15, var21, var14, var25, var55.field4041);
                            }
                            class211.method1418(arg4, arg6, arg9, arg3);
                            class195.method1331();
                        }
                        if (class126.field1995[var13] || ~class42.field605 < -2) {
                            if (var12.field3477 == 0 && !var12.field3520 && var12.field3625 < var12.field3513) {
                                class42.method309(var12.field3523, var12.field3513, var12.field3625, var15, -122, var14 - -var12.field3574);
                            }
                            if (var12.field3477 != 1) {
                                if (~var12.field3477 == -3) {
                                    int var56 = 0;
                                    for (int var57 = 0; ~var12.field3485 < ~var57; ++var57) {
                                        for (int var58 = 0; ~var58 > ~var12.field3464; ++var58) {
                                            int var59 = (var12.field3547 + 32) * var58 + var14;
                                            int var60 = (var12.field3601 + 32) * var57 + var15;
                                            if (~var56 > -21) {
                                                var60 += var12.field3628[var56];
                                                var59 += var12.field3545[var56];
                                            }
                                            if (~var12.field3604[var56] >= -1) {
                                                if (var12.field3528 != null && ~var56 > -21) {
                                                    class186 var61 = var12.method1514(-1, var56);
                                                    if (var61 == null) {
                                                        if (class39.field565) {
                                                            class82.method591(var12, false);
                                                        }
                                                    } else {
                                                        var61.method856(var59, var60);
                                                    }
                                                }
                                            } else {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var12.field3604[var56] + -1;
                                                if (var59 - -32 > arg4 && var59 < arg9 && ~(var60 + 32) < ~arg6 && var60 < arg3 || class268.field4278 == var12 && ~class288.field4568 == ~var56) {
                                                    class186 var65;
                                                    if (~class73.field1227 == -2 && class265.field4223 == var56 && class81.field1350 == var12.field3480) {
                                                        var65 = class140.method946(-25311, 0, var12.field3488[var56], 2, var12.field3638, (class49) null, var64);
                                                    } else {
                                                        var65 = class140.method946(-25311, 3153952, var12.field3488[var56], 1, var12.field3638, (class49) null, var64);
                                                    }
                                                    if (class195.field3080) {
                                                        class25.field335[var13] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class82.method591(var12, false);
                                                    } else if (class268.field4278 == var12 && ~class288.field4568 == ~var56) {
                                                        int var66 = -class131.field2063 + class115.field1883;
                                                        if (var66 < 5 && ~var66 < 4) {
                                                            var66 = 0;
                                                        }
                                                        int var67 = class79.field1323 - class248.field4010;
                                                        if (~var67 > -6 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (class152.field2383 < 5) {
                                                            var67 = 0;
                                                            var66 = 0;
                                                        }
                                                        var65.method852(var59 + var67, var60 + var66, 128);
                                                        if (~arg2 != 0) {
                                                            class228 var68 = arg0[65535 & arg2];
                                                            int var69 = class211.field3280;
                                                            int var70 = class211.field3272;
                                                            if (~var69 < ~(var60 - -var66) && var68.field3523 > 0) {
                                                                int var71 = (var69 - var60 - var66) * class84.field1413 / 3;
                                                                if (~(class84.field1413 * 10) > ~var71) {
                                                                    var71 = class84.field1413 * 10;
                                                                }
                                                                if (~var68.field3523 > ~var71) {
                                                                    var71 = var68.field3523;
                                                                }
                                                                class131.field2063 += var71;
                                                                var68.field3523 -= var71;
                                                                class82.method591(var68, false);
                                                            }
                                                            if (~(var60 + var66 + 32) < ~var70 && -var68.field3625 + var68.field3513 > var68.field3523) {
                                                                int var72 = (-var70 + 32 + var60 + var66) * class84.field1413 / 3;
                                                                if (~(class84.field1413 * 10) > ~var72) {
                                                                    var72 = class84.field1413 * 10;
                                                                }
                                                                if (~(var68.field3513 - var68.field3625 - var68.field3523) > ~var72) {
                                                                    var72 = -var68.field3625 + var68.field3513 + -var68.field3523;
                                                                }
                                                                var68.field3523 += var72;
                                                                class131.field2063 -= var72;
                                                                class82.method591(var68, false);
                                                            }
                                                        }
                                                    } else if (class81.field1348 == var12 && ~class275.field4379 == ~var56) {
                                                        var65.method852(var59, var60, 128);
                                                    } else {
                                                        var65.method856(var59, var60);
                                                    }
                                                }
                                            }
                                            ++var56;
                                        }
                                    }
                                } else if (~var12.field3477 == -4) {
                                    int var73;
                                    if (class155.method1038(var12, (byte) 5)) {
                                        var73 = var12.field3603;
                                        if (class209.field3258 == var12 && var12.field3611 != 0) {
                                            var73 = var12.field3611;
                                        }
                                    } else {
                                        var73 = var12.field3493;
                                        if (class209.field3258 == var12 && var12.field3557 != 0) {
                                            var73 = var12.field3557;
                                        }
                                    }
                                    if (~var16 != -1) {
                                        if (var12.field3571) {
                                            class211.method1423(var14, var15, var12.field3574, var12.field3625, var73, 256 - (255 & var16));
                                        } else {
                                            class211.method1413(var14, var15, var12.field3574, var12.field3625, var73, -(255 & var16) + 256);
                                        }
                                    } else if (!var12.field3571) {
                                        class211.method1411(var14, var15, var12.field3574, var12.field3625, var73);
                                    } else {
                                        class211.method1424(var14, var15, var12.field3574, var12.field3625, var73);
                                    }
                                } else if (var12.field3477 == 4) {
                                    class242 var74 = var12.method1521(-24, class132.field2071);
                                    if (var74 == null) {
                                        if (class39.field565) {
                                            class82.method591(var12, false);
                                        }
                                    } else {
                                        String var75 = var12.field3643;
                                        int var76;
                                        if (class155.method1038(var12, (byte) 5)) {
                                            var76 = var12.field3603;
                                            if (class209.field3258 == var12 && ~var12.field3611 != -1) {
                                                var76 = var12.field3611;
                                            }
                                            if (var12.field3527.length() > 0) {
                                                var75 = var12.field3527;
                                            }
                                        } else {
                                            var76 = var12.field3493;
                                            if (class209.field3258 == var12 && var12.field3557 != 0) {
                                                var76 = var12.field3557;
                                            }
                                        }
                                        if (var12.field3520 && ~var12.field3481 != 0) {
                                            class72 var77 = class85.method602(false, var12.field3481);
                                            var75 = var77.field1176;
                                            if (var75 == null) {
                                                var75 = "null";
                                            }
                                            if ((~var77.field1201 == -2 || var12.field3596 != 1) && ~var12.field3596 != 0) {
                                                var75 = "<col=ff9040>" + var75 + "</col> x" + class264.method1785(var12.field3596, -7);
                                            }
                                        }
                                        if (class184.field2847 == var12) {
                                            var76 = var12.field3493;
                                            var75 = class256.field4095;
                                        }
                                        if (!var12.field3520) {
                                            var75 = class236.method1624(var75, -23487, var12);
                                        }
                                        var74.method1673(var75, var14, var15, var12.field3574, var12.field3625, var76, var12.field3470 ? 0 : -1, var12.field3621, var12.field3521, var12.field3608);
                                    }
                                } else if (var12.field3477 == 5) {
                                    if (!var12.field3520) {
                                        class186 var78 = var12.method1510(class155.method1038(var12, (byte) 5), 96);
                                        if (var78 != null) {
                                            var78.method856(var14, var15);
                                        } else if (class39.field565) {
                                            class82.method591(var12, false);
                                        }
                                    } else if (~var12.field3615 <= -1) {
                                        class119 var87 = var12.method1515((byte) 75);
                                        var87.method831(0, var14, var15, var12.field3574, var12.field3625, var12.field3487, var12.field3468, 0);
                                    } else {
                                        class186 var79;
                                        if (~var12.field3481 == 0) {
                                            var79 = var12.method1510(false, 65);
                                        } else if (var12.field3644 && class283.field4473.field3800 != null) {
                                            var79 = class140.method946(-25311, var12.field3530, var12.field3596, var12.field3531, var12.field3638, class283.field4473.field3800, var12.field3481);
                                        } else {
                                            var79 = class140.method946(-25311, var12.field3530, var12.field3596, var12.field3531, var12.field3638, (class49) null, var12.field3481);
                                        }
                                        if (var79 == null) {
                                            if (class39.field565) {
                                                class82.method591(var12, false);
                                            }
                                        } else {
                                            int var80 = var79.field2869;
                                            int var81 = var79.field2877;
                                            if (!var12.field3497) {
                                                int var86 = var12.field3574 * 4096 / var80;
                                                if (var12.field3486 != 0) {
                                                    var79.method1260(var12.field3486, 107, var12.field3625 / 2 + var15, var86, var14 - -(var12.field3574 / 2));
                                                } else if (~var16 == -1) {
                                                    if (var12.field3574 == var80 && var12.field3625 == var81) {
                                                        var79.method856(var14, var15);
                                                    } else {
                                                        var79.method845(var14, var15, var12.field3574, var12.field3625);
                                                    }
                                                } else {
                                                    var79.method854(var14, var15, var12.field3574, var12.field3625, -(var16 & 255) + 256);
                                                }
                                            } else {
                                                int var82 = (var80 + -1 + var12.field3574) / var80;
                                                int var83 = (var81 + -1 + var12.field3625) / var81;
                                                class211.method1427(var14, var15, var12.field3574 + var14, var12.field3625 + var15);
                                                for (int var84 = 0; var84 < var82; ++var84) {
                                                    for (int var85 = 0; ~var85 > ~var83; ++var85) {
                                                        if (~var12.field3486 == -1) {
                                                            if (~var16 != -1) {
                                                                var79.method852(var80 * var84 + var14, var81 * var85 + var15, 256 - (var16 & 255));
                                                            } else {
                                                                var79.method856(var80 * var84 + var14, var81 * var85 + var15);
                                                            }
                                                        } else {
                                                            var79.method1260(var12.field3486, 71, var81 * var85 + var81 / 2 + var15, 4096, var80 / 2 + var80 * var84 + var14);
                                                        }
                                                    }
                                                }
                                                class211.method1418(arg4, arg6, arg9, arg3);
                                            }
                                        }
                                    }
                                } else if (~var12.field3477 == -7) {
                                    boolean var88 = class155.method1038(var12, (byte) 5);
                                    int var89;
                                    if (!var88) {
                                        var89 = var12.field3504;
                                    } else {
                                        var89 = var12.field3483;
                                    }
                                    class9 var90 = null;
                                    int var91 = 0;
                                    if (var12.field3481 == -1) {
                                        if (var12.field3515 == 5) {
                                            if (var12.field3496 == -1) {
                                                var90 = class202.field3159.method364(-1, (class65[]) null, true, (class30) null, (byte) 112, (class30) null, 0, -1, 0, -1, -1);
                                            } else {
                                                int var92 = 2047 & var12.field3496;
                                                if (~class116.field1897 == ~var92) {
                                                    var92 = 2047;
                                                }
                                                class236 var93 = class210.field3267[var92];
                                                class30 var94 = ~var89 == 0 ? null : class148.method996(-84, var89);
                                                if (var93 != null && ~((int) class148.method1000(var93.field3803, 934) << 11) == ~(-2048 & var12.field3496)) {
                                                    var90 = var93.field3800.method364(0, (class65[]) null, true, var94, (byte) 105, (class30) null, 0, -1, 0, var12.field3598, -1);
                                                }
                                            }
                                        } else if (var89 != -1) {
                                            class30 var95 = class148.method996(-53, var89);
                                            var90 = var12.method1513(-6084, var88, var12.field3598, var12.field3580, var12.field3538, var95, class283.field4473.field3800);
                                            if (var90 == null && class39.field565) {
                                                class82.method591(var12, false);
                                            }
                                        } else {
                                            var90 = var12.method1513(-6084, var88, -1, 0, -1, (class30) null, class283.field4473.field3800);
                                            if (var90 == null && class39.field565) {
                                                class82.method591(var12, false);
                                            }
                                        }
                                    } else {
                                        class72 var96 = class85.method602(false, var12.field3481);
                                        if (var96 != null) {
                                            class72 var97 = var96.method517(true, var12.field3596);
                                            class30 var98 = ~var89 == 0 ? null : class148.method996(-99, var89);
                                            if (var12.field3644 && class283.field4473.field3800 != null) {
                                                var90 = var97.method525(113, var98, 1, var12.field3538, var12.field3580, var12.field3598, class283.field4473.field3800);
                                            } else {
                                                var90 = var97.method525(120, var98, 1, var12.field3538, var12.field3580, var12.field3598, (class49) null);
                                            }
                                            if (var90 == null) {
                                                class82.method591(var12, false);
                                            } else {
                                                var91 = -var90.method102() / 2;
                                            }
                                        }
                                    }
                                    if (var90 != null) {
                                        int var99;
                                        if (~var12.field3482 >= -1) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var12.field3574 << 8) / var12.field3482;
                                        }
                                        int var100 = var12.field3574 / 2 + var14 - -(var12.field3613 * var99 >> 8);
                                        int var101;
                                        if (~var12.field3491 < -1) {
                                            var101 = (var12.field3625 << 8) / var12.field3491;
                                        } else {
                                            var101 = 256;
                                        }
                                        int var102 = (var12.field3546 * var101 >> 8) + (var15 - -(var12.field3625 / 2));
                                        class195.method1336(var100, var102);
                                        int var103 = class195.field3091[var12.field3614] * var12.field3500 >> 16;
                                        int var104 = class195.field3089[var12.field3614] * var12.field3500 >> 16;
                                        if (var12.field3520) {
                                            if (var12.field3593) {
                                                ((class54) var90).method401(0, var12.field3618, var12.field3585, var12.field3614, var12.field3502, var91 + var103 + var12.field3509, var12.field3509 + var104, var12.field3500);
                                            } else {
                                                var90.method73(0, var12.field3618, var12.field3585, var12.field3614, var12.field3502, var103 - -var91 + var12.field3509, var12.field3509 + var104, -1L);
                                            }
                                        } else {
                                            var90.method73(0, var12.field3618, 0, var12.field3614, 0, var103, var104, -1L);
                                        }
                                        class195.method1333();
                                    }
                                } else {
                                    if (var12.field3477 == 7) {
                                        class242 var105 = var12.method1521(77, class132.field2071);
                                        if (var105 == null) {
                                            if (class39.field565) {
                                                class82.method591(var12, false);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; ~var12.field3485 < ~var107; ++var107) {
                                            for (int var108 = 0; var12.field3464 > var108; ++var108) {
                                                if (var12.field3604[var106] > 0) {
                                                    class72 var109 = class85.method602(false, var12.field3604[var106] + -1);
                                                    String var110;
                                                    if (var109.field1201 != 1 && var12.field3488[var106] == 1) {
                                                        var110 = "<col=ff9040>" + var109.field1176 + "</col>";
                                                    } else {
                                                        var110 = "<col=ff9040>" + var109.field1176 + "</col> x" + class264.method1785(var12.field3488[var106], -7);
                                                    }
                                                    int var111 = (var12.field3601 + 12) * var107 + var15;
                                                    int var112 = (var12.field3547 + 115) * var108 + var14;
                                                    if (~var12.field3621 == -1) {
                                                        var105.method1676(var110, var112, var111, var12.field3493, !var12.field3470 ? -1 : 0);
                                                    } else if (var12.field3621 == 1) {
                                                        var105.method1671(var110, var112 + 57, var111, var12.field3493, !var12.field3470 ? -1 : 0);
                                                    } else {
                                                        var105.method1657(var110, var112 - -114, var111, var12.field3493, !var12.field3470 ? -1 : 0);
                                                    }
                                                }
                                                ++var106;
                                            }
                                        }
                                    }
                                    if (var12.field3477 == 8 && class295.field4653 == var12 && ~class83.field1399 == ~class105.field1748) {
                                        class242 var113 = class179.field2784;
                                        int var114 = 0;
                                        int var115 = 0;
                                        String var116 = var12.field3643;
                                        String var117 = class236.method1624(var116, -23487, var12);
                                        while (var117.length() > 0) {
                                            int var125 = var117.indexOf("<br>");
                                            String var126;
                                            if (~var125 == 0) {
                                                var126 = var117;
                                                var117 = "";
                                            } else {
                                                var126 = var117.substring(0, var125);
                                                var117 = var117.substring(var125 + 4);
                                            }
                                            int var127 = var113.method1674(var126);
                                            var115 += var113.field3929 + 1;
                                            if (~var114 > ~var127) {
                                                var114 = var127;
                                            }
                                        }
                                        var115 += 7;
                                        var114 += 6;
                                        int var118 = var14 - -var12.field3574 + -5 + -var114;
                                        if (~(var14 + 5) < ~var118) {
                                            var118 = var14 + 5;
                                        }
                                        int var119 = var12.field3625 - -5 + var15;
                                        if (arg9 < var114 + var118) {
                                            var118 = -var114 + arg9;
                                        }
                                        if (arg3 < var119 - -var115) {
                                            var119 = arg3 - var115;
                                        }
                                        class211.method1424(var118, var119, var114, var115, 16777120);
                                        class211.method1411(var118, var119, var114, var115, 0);
                                        int var120 = var113.field3929 + var119 + 2;
                                        String var121 = var12.field3643;
                                        String var122 = class236.method1624(var121, -23487, var12);
                                        while (var122.length() > 0) {
                                            int var123 = var122.indexOf("<br>");
                                            String var124;
                                            if (var123 != -1) {
                                                var124 = var122.substring(0, var123);
                                                var122 = var122.substring(var123 + 4);
                                            } else {
                                                var124 = var122;
                                                var122 = "";
                                            }
                                            var113.method1676(var124, var118 - -3, var120, 0, -1);
                                            var120 += var113.field3929 - -1;
                                        }
                                    }
                                    if (~var12.field3477 == -10) {
                                        int var128;
                                        int var129;
                                        int var130;
                                        int var131;
                                        if (!var12.field3539) {
                                            var128 = var12.field3625 + var15;
                                            var129 = var14 - -var12.field3574;
                                            var130 = var15;
                                            var131 = var14;
                                        } else {
                                            var128 = var15;
                                            var131 = var14;
                                            var129 = var14 - -var12.field3574;
                                            var130 = var12.field3625 + var15;
                                        }
                                        if (~var12.field3605 != -2) {
                                            class211.method1410(var131, var130, var129, var128, var12.field3493, var12.field3605);
                                        } else {
                                            class211.method1429(var131, var130, var129, var128, var12.field3493);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZIIII)V")
    private static final void method1251(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2863;
        ++class121.field1938;
        class86.method609(108);
        if (arg1) {
            class152.method1028(0, false, false, (byte) -12);
        } else {
            class105.method757((byte) -110, 0);
            class152.method1028(0, false, true, (byte) -59);
            if (class162.field2546 == 0) {
                for (int var6 = 1; var6 <= 5; ++var6) {
                    class152.method1028(var6, false, false, (byte) -38);
                    class152.method1028(var6, true, false, (byte) -60);
                    class105.method757((byte) -110, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; ++var7) {
                    class105.method757((byte) -110, var7);
                    class152.method1028(var7, false, false, (byte) -19);
                    class152.method1028(var7, true, false, (byte) -56);
                }
            }
        }
        if (!arg1) {
            class186.method1253(13312);
        }
        class152.method1027((byte) -67);
        if (class259.field4130 == 1) {
            int var8 = (int) class142.field2160;
            int var9 = (int) class16.field244 + class86.field1448 & 2047;
            if (~(class127.field2010 / 256) < ~var8) {
                var8 = class127.field2010 / 256;
            }
            if (class239.field3885[4] && ~var8 > ~(class281.field4451[4] + 128)) {
                var8 = class281.field4451[4] + 128;
            }
            class108.method774(var8, (byte) 55, var8 * 3 + 600, arg0, -50 + class34.method269(class240.field3892, class283.field4473.field2278, class283.field4473.field2240, arg4 + 103), class25.field332, class140.field2144, var9);
        } else if (class259.field4130 == 5) {
            class98.method722(arg0, -1);
        }
        int var10 = class219.field3375;
        int var11 = class170.field2653;
        int var12 = class293.field4624;
        int var13 = class83.field1408;
        int var14 = class62.field1066;
        for (int var15 = 0; ~var15 > -6; ++var15) {
            if (class239.field3885[var15]) {
                int var22 = (int) ((double) (-class157.field2447[var15]) + (double) (class157.field2447[var15] * 2 + 1) * Math.random() + Math.sin((double) class97.field1629[var15] / 100.0D * (double) class82.field1388[var15]) * (double) class281.field4451[var15]);
                if (~var15 == -1) {
                    class219.field3375 += var22;
                }
                if (var15 == 3) {
                    class83.field1408 = class83.field1408 + var22 & 2047;
                }
                if (~var15 == -5) {
                    class62.field1066 += var22;
                    if (class62.field1066 < 128) {
                        class62.field1066 = 128;
                    }
                    if (~class62.field1066 < -384) {
                        class62.field1066 = 383;
                    }
                }
                if (~var15 == -3) {
                    class293.field4624 += var22;
                }
                if (~var15 == -2) {
                    class170.field2653 += var22;
                }
            }
        }
        class179.method1217(126);
        class211.method1418(arg2, arg5, arg2 + arg3, arg0 + arg5);
        class195.method1331();
        if (class7.field155 < arg4) {
            class211.method1424(arg2, arg5, arg3, arg0, 0);
        } else {
            class119 var16 = class93.method701((byte) 96, class20.field294, class30.field432, class238.field3862, class7.field155);
            var16.method831(class205.field3194, arg2, arg5, arg3, arg0, class62.field1066, class83.field1408, 0);
        }
        if (!class47.field687 && arg2 <= class179.field2796 && ~class179.field2796 > ~(arg2 + arg3) && class147.field2332 >= arg5 && class147.field2332 < arg0 + arg5) {
            class235.field3796 = true;
            class228.field3623 = 0;
            int var17 = class144.field2217;
            int var18 = class99.field1670;
            int var19 = class95.field1610;
            int var20 = class146.field2323;
            class26.field353 = (-arg2 + class179.field2796) * (-var19 + var17) / arg3 + var19;
            class50.field739 = (-arg5 + class147.field2332) * (-var18 + var20) / arg0 - -var18;
        } else {
            class235.field3796 = false;
            class228.field3623 = 0;
        }
        class230.method1534(false);
        byte var21 = class271.method1830(10272) != 2 ? 1 : (byte) class121.field1938;
        class201.method1360(class219.field3375, class170.field2653, class293.field4624, class62.field1066, class83.field1408, class30.field441, class206.field3227, class190.field2949, class161.field2531, class27.field363, class240.field3894, class240.field3892 + 1, var21, class283.field4473.field2240 >> 7, class283.field4473.field2278 >> 7);
        class230.method1534(false);
        class7.method68();
        class84.method594(false, 256, arg0, arg5, arg2, 256, arg3);
        class95.method712(arg2, arg5, 256, arg4 ^ -125, 256, arg3, arg0);
        ((class187) class195.field3087).method1265(true, class84.field1413);
        class292.method1954(arg0, arg2, arg3, arg5, arg4 + -1);
        class219.field3375 = var10;
        class293.field4624 = var12;
        class83.field1408 = var13;
        class170.field2653 = var11;
        class62.field1066 = var14;
        if (class196.field3101 && ~class240.field3903.method1552((byte) 118) == -1) {
            class196.field3101 = false;
        }
        if (class196.field3101) {
            class211.method1424(arg2, arg5, arg3, arg0, 0);
            class206.method1384(false, class139.field2125, 1);
        }
        if (!arg1 && !class196.field3101 && !class47.field687 && ~class179.field2796 <= ~arg2 && class179.field2796 < arg2 + arg3 && ~class147.field2332 <= ~arg5 && class147.field2332 < arg0 + arg5) {
            class131.method910(class179.field2796, arg3, arg2, arg5, arg0, -2, class147.field2332);
        }
    }
}
