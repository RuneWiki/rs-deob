import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class143 {

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lub;")
    public static class227 field2463 = class257.method1749("blaugr-Un:", 17263);

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lub;")
    public static class227 field2469 = null;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[[I")
    public static int[][] field2470 = new int[5][5000];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Ln;")
    public static class138 field2459;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Ln;")
    public static class138 field2464;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lnh;")
    public static class57 field2455;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[B")
    public byte[] field2458;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[B")
    public byte[] field2468;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
    public static final void method902(long arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2466++;
        if (arg0 != 0L) {
            class175.field2918++;
            class176.field2935.method664((byte) 54, 177);
            class176.field2935.method1457(arg0, -76);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method903(int arg0) {
        field2469 = null;
        field2463 = null;
        field2470 = null;
        field2455 = null;
        field2464 = null;
        field2459 = null;
        if (arg0 < 76) {
            method903(-107);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lck;Z)V")
    public static final void method904(class108 arg0, boolean arg1) {
        class94.field1633.method1272(5664, arg0);
        while (true) {
            class108 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class108[][] var7;
            class108 var66;
            do {
                class108 var65;
                do {
                    class108 var64;
                    do {
                        class108 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class108) class94.field1633.method1269((byte) 127);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2036);
                                            var3 = var2.field2016;
                                            var4 = var2.field2033;
                                            var5 = var2.field2018;
                                            var6 = var2.field2023;
                                            var7 = class261.field4539[var5];
                                            if (!var2.field2030) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class108 var8 = class261.field4539[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2036) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class72.field1265 && var3 > class108.field2008) {
                                                    class108 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2036 && (var9.field2030 || (var2.field2014 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class72.field1265 && var3 < class12.field236 - 1) {
                                                    class108 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2036 && (var10.field2030 || (var2.field2014 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class37.field619 && var4 > class9.field170) {
                                                    class108 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2036 && (var11.field2030 || (var2.field2014 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class37.field619 && var4 < class4.field53 - 1) {
                                                    class108 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2036 && (var12.field2030 || (var2.field2014 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2030 = false;
                                            if (var2.field2015 != null) {
                                                class108 var13 = var2.field2015;
                                                if (var13.field2013 == null) {
                                                    if (var13.field2035 != null) {
                                                        if (class235.method1569(0, var3, var4)) {
                                                            class4.method12(var13.field2035, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, true);
                                                        } else {
                                                            class4.method12(var13.field2035, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class235.method1569(0, var3, var4)) {
                                                    class173.method1106(var13.field2013, 0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, true);
                                                } else {
                                                    class173.method1106(var13.field2013, 0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, false);
                                                }
                                                class50 var14 = var13.field2024;
                                                if (var14 != null) {
                                                    var14.field886.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var14.field877 - class130.field2282, var14.field881 - class173.field2885, var14.field875 - class203.field3471, var14.field879);
                                                }
                                                for (int var15 = 0; var15 < var13.field2012; var15++) {
                                                    class230 var16 = var13.field2021[var15];
                                                    if (var16 != null) {
                                                        var16.field4021.method85(var16.field4018, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var16.field4016 - class130.field2282, var16.field4023 - class173.field2885, var16.field4012 - class203.field3471, var16.field4029);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2013 == null) {
                                                if (var2.field2035 != null) {
                                                    if (class235.method1569(var6, var3, var4)) {
                                                        class4.method12(var2.field2035, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class4.method12(var2.field2035, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, false);
                                                    }
                                                }
                                            } else if (class235.method1569(var6, var3, var4)) {
                                                class173.method1106(var2.field2013, var6, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2013.field4113 != 12345678 || class215.field3630 && var5 <= class9.field173) {
                                                    class173.method1106(var2.field2013, var6, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class133 var18 = var2.field2039;
                                                if (var18 != null && (var18.field2312 & 0xFFFFFFFF80000000L) != 0L) {
                                                    var18.field2304.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var18.field2311 - class130.field2282, var18.field2313 - class173.field2885, var18.field2307 - class203.field3471, var18.field2312);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class50 var21 = var2.field2024;
                                            class78 var22 = var2.field2037;
                                            if (var21 != null || var22 != null) {
                                                if (class72.field1265 == var3) {
                                                    var19++;
                                                } else if (class72.field1265 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class37.field619 == var4) {
                                                    var19 += 3;
                                                } else if (class37.field619 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class94.field1629[var19];
                                                var2.field2022 = class29.field467[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field878 & class26.field429[var19]) == 0) {
                                                    var2.field2009 = 0;
                                                } else if (var21.field878 == 16) {
                                                    var2.field2009 = 3;
                                                    var2.field2027 = class132.field2301[var19];
                                                    var2.field2031 = 3 - var2.field2027;
                                                } else if (var21.field878 == 32) {
                                                    var2.field2009 = 6;
                                                    var2.field2027 = class100.field1756[var19];
                                                    var2.field2031 = 6 - var2.field2027;
                                                } else if (var21.field878 == 64) {
                                                    var2.field2009 = 12;
                                                    var2.field2027 = class191.field3249[var19];
                                                    var2.field2031 = 12 - var2.field2027;
                                                } else {
                                                    var2.field2009 = 9;
                                                    var2.field2027 = class109.field2042[var19];
                                                    var2.field2031 = 9 - var2.field2027;
                                                }
                                                if ((var21.field878 & var20) != 0 && !class253.method1714(var6, var3, var4, var21.field878)) {
                                                    var21.field886.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var21.field877 - class130.field2282, var21.field881 - class173.field2885, var21.field875 - class203.field3471, var21.field879);
                                                }
                                                if ((var21.field883 & var20) != 0 && !class253.method1714(var6, var3, var4, var21.field883)) {
                                                    var21.field880.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var21.field877 - class130.field2282, var21.field881 - class173.field2885, var21.field875 - class203.field3471, var21.field879);
                                                }
                                            }
                                            if (var22 != null && !class246.method1639(var6, var3, var4, var22.field1362.method88())) {
                                                if ((var22.field1374 & var20) != 0) {
                                                    var22.field1362.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var22.field1375 + var22.field1363 - class130.field2282, var22.field1368 - class173.field2885, var22.field1366 + var22.field1361 - class203.field3471, var22.field1378);
                                                } else if (var22.field1374 == 256) {
                                                    int var23 = var22.field1375 - class130.field2282;
                                                    int var24 = var22.field1368 - class173.field2885;
                                                    int var25 = var22.field1366 - class203.field3471;
                                                    int var26 = var22.field1371;
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
                                                        var22.field1362.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var22.field1363 + var23, var24, var22.field1361 + var25, var22.field1378);
                                                    } else if (var22.field1373 != null) {
                                                        var22.field1373.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var23, var24, var25, var22.field1378);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class133 var29 = var2.field2039;
                                                if (var29 != null && (var29.field2312 & 0xFFFFFFFF80000000L) == 0L) {
                                                    var29.field2304.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var29.field2311 - class130.field2282, var29.field2313 - class173.field2885, var29.field2307 - class203.field3471, var29.field2312);
                                                }
                                                class260 var30 = var2.field2019;
                                                if (var30 != null && var30.field4536 == 0) {
                                                    if (var30.field4523 != null) {
                                                        var30.field4523.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var30.field4524 - class130.field2282, var30.field4529 - class173.field2885, var30.field4526 - class203.field3471, var30.field4538);
                                                    }
                                                    if (var30.field4531 != null) {
                                                        var30.field4531.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var30.field4524 - class130.field2282, var30.field4529 - class173.field2885, var30.field4526 - class203.field3471, var30.field4538);
                                                    }
                                                    if (var30.field4521 != null) {
                                                        var30.field4521.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var30.field4524 - class130.field2282, var30.field4529 - class173.field2885, var30.field4526 - class203.field3471, var30.field4538);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2014;
                                            if (var31 != 0) {
                                                if (var3 < class72.field1265 && (var31 & 0x4) != 0) {
                                                    class108 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2036) {
                                                        class94.field1633.method1272(5664, var32);
                                                    }
                                                }
                                                if (var4 < class37.field619 && (var31 & 0x2) != 0) {
                                                    class108 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2036) {
                                                        class94.field1633.method1272(5664, var33);
                                                    }
                                                }
                                                if (var3 > class72.field1265 && (var31 & 0x1) != 0) {
                                                    class108 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2036) {
                                                        class94.field1633.method1272(5664, var34);
                                                    }
                                                }
                                                if (var4 > class37.field619 && (var31 & 0x8) != 0) {
                                                    class108 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2036) {
                                                        class94.field1633.method1272(5664, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2009 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2012; var37++) {
                                                if (class38.field627 != var2.field2021[var37].field4033 && (var2.field2017[var37] & var2.field2009) == var2.field2027) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class50 var38 = var2.field2024;
                                                if (!class253.method1714(var6, var3, var4, var38.field878)) {
                                                    var38.field886.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var38.field877 - class130.field2282, var38.field881 - class173.field2885, var38.field875 - class203.field3471, var38.field879);
                                                }
                                                var2.field2009 = 0;
                                            }
                                        }
                                        if (!var2.field2029) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2012;
                                            var2.field2029 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class230 var42 = var2.field2021[var41];
                                                if (class38.field627 != var42.field4033) {
                                                    for (int var43 = var42.field4032; var43 <= var42.field4020; var43++) {
                                                        for (int var44 = var42.field4025; var44 <= var42.field4015; var44++) {
                                                            class108 var45 = var7[var43][var44];
                                                            if (var45.field2030) {
                                                                var2.field2029 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2009 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field4032) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field4020) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field4025) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field4015) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2009) == var2.field2031) {
                                                                    var2.field2029 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class69.field1221[var40++] = var42;
                                                    int var47 = class72.field1265 - var42.field4032;
                                                    int var48 = var42.field4020 - class72.field1265;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class37.field619 - var42.field4025;
                                                    int var50 = var42.field4015 - class37.field619;
                                                    if (var50 > var49) {
                                                        var42.field4013 = var47 + var50;
                                                    } else {
                                                        var42.field4013 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class230 var54 = class69.field1221[var53];
                                                    if (class38.field627 != var54.field4033) {
                                                        if (var54.field4013 > var51) {
                                                            var51 = var54.field4013;
                                                            var52 = var53;
                                                        } else if (var54.field4013 == var51) {
                                                            int var55 = var54.field4016 - class130.field2282;
                                                            int var56 = var54.field4012 - class203.field3471;
                                                            int var57 = class69.field1221[var52].field4016 - class130.field2282;
                                                            int var58 = class69.field1221[var52].field4012 - class203.field3471;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class230 var59 = class69.field1221[var52];
                                                var59.field4033 = class38.field627;
                                                if (!class254.method1725(var6, var59.field4032, var59.field4020, var59.field4025, var59.field4015, var59.field4021.method88())) {
                                                    var59.field4021.method85(var59.field4018, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var59.field4016 - class130.field2282, var59.field4023 - class173.field2885, var59.field4012 - class203.field3471, var59.field4029);
                                                }
                                                for (int var60 = var59.field4032; var60 <= var59.field4020; var60++) {
                                                    for (int var61 = var59.field4025; var61 <= var59.field4015; var61++) {
                                                        class108 var62 = var7[var60][var61];
                                                        if (var62.field2009 != 0) {
                                                            class94.field1633.method1272(5664, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2036) {
                                                            class94.field1633.method1272(5664, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2029) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2029 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2036);
                            } while (var2.field2009 != 0);
                            if (var3 > class72.field1265 || var3 <= class108.field2008) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2036);
                        if (var3 < class72.field1265 || var3 >= class12.field236 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2036);
                    if (var4 > class37.field619 || var4 <= class9.field170) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2036);
                if (var4 < class37.field619 || var4 >= class4.field53 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2036);
            var2.field2036 = false;
            class16.field289--;
            class260 var67 = var2.field2019;
            if (var67 != null && var67.field4536 != 0) {
                if (var67.field4523 != null) {
                    var67.field4523.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var67.field4524 - class130.field2282, var67.field4529 - class173.field2885 - var67.field4536, var67.field4526 - class203.field3471, var67.field4538);
                }
                if (var67.field4531 != null) {
                    var67.field4531.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var67.field4524 - class130.field2282, var67.field4529 - class173.field2885 - var67.field4536, var67.field4526 - class203.field3471, var67.field4538);
                }
                if (var67.field4521 != null) {
                    var67.field4521.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var67.field4524 - class130.field2282, var67.field4529 - class173.field2885 - var67.field4536, var67.field4526 - class203.field3471, var67.field4538);
                }
            }
            if (var2.field2022 != 0) {
                class78 var68 = var2.field2037;
                if (var68 != null && !class246.method1639(var6, var3, var4, var68.field1362.method88())) {
                    if ((var68.field1374 & var2.field2022) != 0) {
                        var68.field1362.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var68.field1375 + var68.field1363 - class130.field2282, var68.field1368 - class173.field2885, var68.field1366 + var68.field1361 - class203.field3471, var68.field1378);
                    } else if (var68.field1374 == 256) {
                        int var69 = var68.field1375 - class130.field2282;
                        int var70 = var68.field1368 - class173.field2885;
                        int var71 = var68.field1366 - class203.field3471;
                        int var72 = var68.field1371;
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
                            var68.field1362.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var68.field1363 + var69, var70, var68.field1361 + var71, var68.field1378);
                        } else if (var68.field1373 != null) {
                            var68.field1373.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var69, var70, var71, var68.field1378);
                        }
                    }
                }
                class50 var75 = var2.field2024;
                if (var75 != null) {
                    if ((var75.field883 & var2.field2022) != 0 && !class253.method1714(var6, var3, var4, var75.field883)) {
                        var75.field880.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var75.field877 - class130.field2282, var75.field881 - class173.field2885, var75.field875 - class203.field3471, var75.field879);
                    }
                    if ((var75.field878 & var2.field2022) != 0 && !class253.method1714(var6, var3, var4, var75.field878)) {
                        var75.field886.method85(0, class243.field4210, class141.field2439, class215.field3622, class245.field4289, var75.field877 - class130.field2282, var75.field881 - class173.field2885, var75.field875 - class203.field3471, var75.field879);
                    }
                }
            }
            if (var5 < class156.field2677 - 1) {
                class108 var76 = class261.field4539[var5 + 1][var3][var4];
                if (var76 != null && var76.field2036) {
                    class94.field1633.method1272(5664, var76);
                }
            }
            if (var3 < class72.field1265) {
                class108 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2036) {
                    class94.field1633.method1272(5664, var77);
                }
            }
            if (var4 < class37.field619) {
                class108 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2036) {
                    class94.field1633.method1272(5664, var78);
                }
            }
            if (var3 > class72.field1265) {
                class108 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2036) {
                    class94.field1633.method1272(5664, var79);
                }
            }
            if (var4 > class37.field619) {
                class108 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2036) {
                    class94.field1633.method1272(5664, var80);
                }
            }
        }
    }
}
