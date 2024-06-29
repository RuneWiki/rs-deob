import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class261 extends class304 {

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    private int field4016 = 4096;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "J")
    public static long field4013 = 0L;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "Lec;")
    public static class99 field4017 = new class99(64);

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    public static int field4020 = 1;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "Lmn;")
    public static class161 field4011;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method71(int arg0, int arg1) {
        field4019++;
        if (arg0 != 7) {
            field4020 = -85;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int[] var4 = this.method2086(arg1 - 1 & class65.field941, 0, (byte) 112);
            int[] var5 = this.method2086(arg1, 0, (byte) 112);
            int[] var6 = this.method2086(arg1 + 1 & class65.field941, 0, (byte) 112);
            for (int var7 = 0; var7 < class218.field3333; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field4016;
                int var9 = (var5[class54.field721 & var7 + 1] - var5[class54.field721 & var7 - 1]) * this.field4016;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 57)
    public class261() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 66)
    public static void method1833(int arg0) {
        field4017 = null;
        field4011 = null;
        if (arg0 != 10) {
            field4011 = (class161) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILwm;)V", line = 77)
    public static final void method1834(int arg0, class254 arg1) {
        field4012++;
        if ((arg1.field3840.length - arg1.field3866) < 1) {
            return;
        }
        int var2 = arg1.method1774((byte) -95);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0 > -15 || arg1.field3840.length - arg1.field3866 < var3) {
            return;
        }
        class102.field1482 = arg1.method1774((byte) 109);
        if (class102.field1482 < 1) {
            class102.field1482 = 1;
        } else if (class102.field1482 > 4) {
            class102.field1482 = 4;
        }
        class197.method1437(-85, arg1.method1774((byte) 51) == 1);
        class322.field4976 = arg1.method1774((byte) 92) == 1;
        class320.field4958 = arg1.method1774((byte) 25) == 1;
        class255.field3884 = arg1.method1774((byte) -128) == 1;
        class267.field4149 = arg1.method1774((byte) -120) == 1;
        class284.field4430 = arg1.method1774((byte) 99) == 1;
        class258.field3983 = arg1.method1774((byte) -127) == 1;
        class134.field2036 = arg1.method1774((byte) -100) == 1;
        class165.field2674 = arg1.method1774((byte) -113);
        if (class165.field2674 > 2) {
            class165.field2674 = 2;
        }
        if (var2 >= 2) {
            class309.field4812 = arg1.method1774((byte) -126) == 1;
        } else {
            class309.field4812 = arg1.method1774((byte) -127) == 1;
            arg1.method1774((byte) -91);
        }
        class122.field1874 = arg1.method1774((byte) -120) == 1;
        class67.field972 = arg1.method1774((byte) 63) == 1;
        class248.field3745 = arg1.method1774((byte) -109);
        if (class248.field3745 > 2) {
            class248.field3745 = 2;
        }
        class142.field2190 = class248.field3745;
        class318.field4915 = arg1.method1774((byte) -105) == 1;
        class311.field4833 = arg1.method1774((byte) -127);
        if (class311.field4833 > 127) {
            class311.field4833 = 127;
        }
        class59.field783 = arg1.method1774((byte) -1);
        class71.field1022 = arg1.method1774((byte) -119);
        if (class71.field1022 > 127) {
            class71.field1022 = 127;
        }
        if (var2 >= 1) {
            class25.field272 = arg1.method1755(false);
            class169.field2735 = arg1.method1755(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1774((byte) -125);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1774((byte) -91);
            if (class245.field3715 < 96) {
                var4 = 0;
            }
            class249.method1700(var4);
        }
        if (var2 >= 5) {
            class146.field2232 = arg1.method1741(-32769);
        }
        if (var2 >= 6) {
            class216.field3321 = arg1.method1774((byte) 44);
        }
        if (var2 >= 7) {
            class7.field112 = arg1.method1774((byte) -104) == 1;
        }
        if (var2 >= 8) {
            class152.field2305 = arg1.method1774((byte) 123) == 1;
        }
        if (var2 >= 9) {
            class245.field3705 = arg1.method1774((byte) -115);
        }
        if (var2 >= 10) {
            class235.field3578 = arg1.method1774((byte) -96) != 0;
        }
        if (var2 >= 11) {
            class305.field4698 = arg1.method1774((byte) -122) != 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lwm;II)V", line = 244)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field4018++;
        if (arg2 != -2828) {
            field4020 = -5;
        }
        if (arg1 == 0) {
            this.field4016 = arg0.method1755(false);
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)I", line = 263)
    public static int method1835(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII[Lmn;III)V", line = 271)
    public static final void method1836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class161[] arg6, int arg7, int arg8, int arg9) {
        if (class73.field1058) {
            class175.method1316(arg5, arg8, arg1, arg4);
        } else {
            class287.method1980(arg5, arg8, arg1, arg4);
            class164.method1228();
        }
        for (int var10 = arg9; var10 < arg6.length; var10++) {
            class161 var11 = arg6[var10];
            if (var11 != null && (var11.field2566 == arg2 || arg2 == -1412584499 && class296.field4572 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class41.field602[class184.field2913] = var11.field2621 + arg0;
                    class120.field1850[class184.field2913] = var11.field2587 + arg3;
                    class174.field2803[class184.field2913] = var11.field2619;
                    class97.field1400[class184.field2913] = var11.field2490;
                    var12 = class184.field2913++;
                } else {
                    var12 = arg7;
                }
                var11.field2457 = var12;
                var11.field2595 = class233.field3542;
                if (!var11.field2550 || !client.method1002(var11)) {
                    if (var11.field2598 > 0) {
                        class345.method2392(var11, 5);
                    }
                    int var13 = var11.field2587 + arg3;
                    int var14 = var11.field2621 + arg0;
                    int var15 = var11.field2512;
                    if (class335.field5216 && (client.method1012(var11).field54 != 0 || var11.field2590 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class296.field4572 == var11) {
                        if (arg2 != -1412584499 && !var11.field2571) {
                            class83.field1219 = arg6;
                            class112.field1696 = arg0;
                            class267.field4152 = arg3;
                            continue;
                        }
                        if (class284.field4424 && class163.field2646) {
                            int var16 = class290.field4468;
                            int var17 = var16 - class204.field3120;
                            if (class183.field2894 > var17) {
                                var17 = class183.field2894;
                            }
                            if (class183.field2894 + class153.field2324.field2619 < var17 - -var11.field2619) {
                                var17 = class183.field2894 + class153.field2324.field2619 - var11.field2619;
                            }
                            int var18 = class108.field1622;
                            int var19 = var18 - class331.field5106;
                            if (var19 < class34.field495) {
                                var19 = class34.field495;
                            }
                            if (var11.field2490 + var19 > class34.field495 + class153.field2324.field2490) {
                                var19 = class34.field495 + class153.field2324.field2490 - var11.field2490;
                            }
                            var13 = var19;
                            var14 = var17;
                        }
                        if (!var11.field2571) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2590 == 2) {
                        var20 = arg5;
                        var24 = arg8;
                        var25 = arg4;
                        var23 = arg1;
                    } else {
                        var20 = var14 > arg5 ? var14 : arg5;
                        int var21 = var11.field2490 + var13;
                        int var22 = var11.field2619 + var14;
                        if (var11.field2590 == 9) {
                            var21++;
                            var22++;
                        }
                        var23 = var22 >= arg1 ? arg1 : var22;
                        var24 = var13 > arg8 ? var13 : arg8;
                        var25 = arg4 <= var21 ? arg4 : var21;
                    }
                    if (!var11.field2550 || var23 > var20 && var24 < var25) {
                        if (var11.field2598 != 0) {
                            if (var11.field2598 == 1337 || var11.field2598 == 1403) {
                                class163.field2648 = var13;
                                class213.field3275 = var14;
                                class302.field4628 = var11;
                                class98.method735(var11.field2490, 0, var11.field2598 == 1403, var13, var14, var11.field2619);
                                class121.field1861[var12] = true;
                                if (class73.field1058) {
                                    class175.method1316(arg5, arg8, arg1, arg4);
                                } else {
                                    class287.method1980(arg5, arg8, arg1, arg4);
                                }
                                continue;
                            }
                            if (var11.field2598 == 1338) {
                                if (!var11.method1212(41)) {
                                    continue;
                                }
                                class214.method1533(var14, var12, arg9 + 14240, var11, var13);
                                if (class73.field1058) {
                                    class175.method1316(arg5, arg8, arg1, arg4);
                                } else {
                                    class287.method1980(arg5, arg8, arg1, arg4);
                                }
                                if (class260.field4003 != 0 && class260.field4003 != 3 || class330.field5089 || class272.field4253 < var20 || var24 > class234.field3562 || class272.field4253 >= var23 || var25 <= class234.field3562) {
                                    continue;
                                }
                                int var26 = class272.field4253 - var14;
                                int var27 = class234.field3562 - var13;
                                int var28 = var11.field2478[var27];
                                if (var28 > var26 || var11.field2556[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var27 - var11.field2490 / 2;
                                int var30 = var26 - var11.field2619 / 2;
                                int var31 = (int) class243.field3695 + class63.field846 & 0x7FF;
                                int var32 = class164.field2650[var31];
                                int var33 = (class94.field1332 + 256) * var32 >> 8;
                                int var34 = class164.field2664[var31];
                                int var35 = (class94.field1332 + 256) * var34 >> 8;
                                int var36 = var29 * var33 + var30 * var35 >> 11;
                                int var37 = class39.field575.field4713 + (var36 - (class39.field575.method1897(8) - 1) * 64) >> 7;
                                int var38 = var29 * var35 - var30 * var33 >> 11;
                                int var39 = class39.field575.field4731 - var38 - ((class39.field575.method1897(8) + -1) * 64) >> 7;
                                if (class7.field110 && (class201.field3098 & 0x40) != 0) {
                                    class161 var40 = class94.method680(class333.field5194, 0, class183.field2893);
                                    if (var40 == null) {
                                        class297.method2051(0);
                                    } else {
                                        class202.method1463((short) 26, var39, 1L, class242.field3685, var37, -81, " ->", class60.field794);
                                    }
                                    continue;
                                }
                                if (class248.field3754 == 1) {
                                    class202.method1463((short) 13, var39, 1L, -1, var37, -79, "", class112.field1699);
                                }
                                class202.method1463((short) 6, var39, 1L, -1, var37, -83, "", class259.field3994);
                                continue;
                            }
                            if (var11.field2598 == 1339) {
                                if (var11.method1212(-122)) {
                                    class233.method1635(var13, var11, var14, var12, (byte) 55);
                                    if (class73.field1058) {
                                        class175.method1316(arg5, arg8, arg1, arg4);
                                    } else {
                                        class287.method1980(arg5, arg8, arg1, arg4);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2598 == 1400) {
                                class28.method217(var11.field2619, var13, var14, var11.field2490, 13543);
                                class121.field1861[var12] = true;
                                class331.field5117[var12] = true;
                                if (class73.field1058) {
                                    class175.method1316(arg5, arg8, arg1, arg4);
                                } else {
                                    class287.method1980(arg5, arg8, arg1, arg4);
                                }
                                continue;
                            }
                            if (var11.field2598 == 1401) {
                                class36.method279(var11.field2619, var14, var11.field2490, var13, (byte) 91);
                                class121.field1861[var12] = true;
                                class331.field5117[var12] = true;
                                if (class73.field1058) {
                                    class175.method1316(arg5, arg8, arg1, arg4);
                                } else {
                                    class287.method1980(arg5, arg8, arg1, arg4);
                                }
                                continue;
                            }
                            if (var11.field2598 == 1402) {
                                if (!class73.field1058) {
                                    class56.method401(arg9 ^ 0xFF00, var14, var13);
                                    class121.field1861[var12] = true;
                                    class331.field5117[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field2598 == 1405) {
                                if (!class262.field4045) {
                                    continue;
                                }
                                int var41 = var13 + 15;
                                int var42 = var11.field2619 + var14;
                                class265.field4128.method2271("Fps:" + class2.field31, var42, var41, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var142 = var41 + 15;
                                int var45 = 16776960;
                                if (var44 > 65536) {
                                    var45 = 16711680;
                                }
                                class265.field4128.method2271("Mem:" + var44 + "k", var42, var142, var45, -1);
                                var41 = var142 + 15;
                                if (class73.field1058) {
                                    int var46 = 16776960;
                                    int var47 = (class80.field1185 + class80.field1184 + class80.field1186) / 1024;
                                    if (var47 > 65536) {
                                        var46 = 16711680;
                                    }
                                    class265.field4128.method2271("Card:" + var47 + "k", var42, var41, var46, -1);
                                    var41 += 15;
                                }
                                int var48 = 0;
                                int var49 = 16776960;
                                int var50 = 0;
                                int var51 = 0;
                                for (int var52 = 0; var52 < 29; var52++) {
                                    var48 += class138.field2078[var52].method2016(82);
                                    var51 += class138.field2078[var52].method2021(true);
                                    var50 += class138.field2078[var52].method2012(2319);
                                }
                                int var53 = var50 * 100 / var48;
                                int var54 = var51 * 10000 / var48;
                                String var55 = "Cache:" + class49.method377(true, 48, 2, (long) var54, 0) + "% (" + var53 + "%)";
                                class300.field4623.method2271(var55, var42, var41, var49, -1);
                                var41 += 12;
                                class121.field1861[var12] = true;
                                class331.field5117[var12] = true;
                                continue;
                            }
                            if (var11.field2598 == 1406) {
                                class263.field4057 = var13;
                                class2.field27 = var11;
                                class37.field535 = var14;
                                continue;
                            }
                        }
                        if (!class330.field5089) {
                            if (var11.field2590 == 0 && var11.field2601 && class272.field4253 >= var20 && class234.field3562 >= var24 && var23 > class272.field4253 && class234.field3562 < var25 && !class335.field5216) {
                                class204.field3122[0] = class239.field3646;
                                class311.field4832[0] = "";
                                class336.field5229[0] = class38.field552;
                                class32.field393 = 1;
                                class118.field1843[0] = 1005;
                            }
                            if (class272.field4253 >= var20 && class234.field3562 >= var24 && var23 > class272.field4253 && class234.field3562 < var25) {
                                class181.method1351(var11, class234.field3562 - var13, -var14 + class272.field4253, (byte) 1);
                            }
                        }
                        if (var11.field2590 == 0) {
                            if (!var11.field2550 && client.method1002(var11) && class3.field40 != var11) {
                                continue;
                            }
                            if (!var11.field2550) {
                                if ((var11.field2441 - var11.field2490) < var11.field2546) {
                                    var11.field2546 = var11.field2441 - var11.field2490;
                                }
                                if (var11.field2546 < 0) {
                                    var11.field2546 = 0;
                                }
                            }
                            if (class73.field1058 && var11.field2598 == 1407) {
                                class20.method158(var14, var13, var11.field2619, var11.field2490);
                            }
                            method1836(var14 - var11.field2573, var23, var11.field2615, var13 - var11.field2546, var25, var20, arg6, var12, var24, 0);
                            if (var11.field2509 != null) {
                                method1836(var14 - var11.field2573, var23, var11.field2615, var13 - var11.field2546, var25, var20, var11.field2509, var12, var24, 0);
                            }
                            class242 var56 = (class242) class222.field3383.method1716(-1, (long) var11.field2615);
                            if (var56 != null) {
                                if (var56.field3683 == 0 && !class330.field5089 && var20 <= class272.field4253 && var24 <= class234.field3562 && var23 > class272.field4253 && class234.field3562 < var25 && !class335.field5216) {
                                    class204.field3122[0] = class239.field3646;
                                    class311.field4832[0] = "";
                                    class118.field1843[0] = 1005;
                                    class32.field393 = 1;
                                    class336.field5229[0] = class38.field552;
                                }
                                class153.method1153(var24, var25, var13, var23, -47, var14, var56.field3689, var12, var20);
                            }
                            if (class73.field1058 && var11.field2598 == 1407) {
                                class20.method161();
                            }
                            if (class73.field1058) {
                                class175.method1316(arg5, arg8, arg1, arg4);
                            } else {
                                class287.method1980(arg5, arg8, arg1, arg4);
                                class164.method1228();
                            }
                        }
                        if (class30.field357[var12] || class8.field122 > 1) {
                            if (var11.field2590 == 0 && !var11.field2550 && var11.field2441 > var11.field2490) {
                                class121.method914(var11.field2441, 50, var14 + var11.field2619, var11.field2546, var11.field2490, var13);
                            }
                            if (var11.field2590 != 1) {
                                if (var11.field2590 == 2) {
                                    int var125 = 0;
                                    for (int var126 = 0; var126 < var11.field2462; var126++) {
                                        for (int var127 = 0; var127 < var11.field2576; var127++) {
                                            int var128 = (var11.field2497 + 32) * var126 + var13;
                                            int var129 = (var11.field2493 + 32) * var127 + var14;
                                            if (var125 < 20) {
                                                var128 += var11.field2504[var125];
                                                var129 += var11.field2567[var125];
                                            }
                                            if (var11.field2487[var125] > 0) {
                                                boolean var131 = false;
                                                boolean var132 = false;
                                                int var133 = var11.field2487[var125] - 1;
                                                if ((var129 + 32) > arg5 && arg1 > var129 && arg8 < (var128 + 32) && arg4 > var128 || class192.field2995 == var11 && class59.field788 == var125) {
                                                    class269 var134;
                                                    if (class320.field4939 == 1 && class318.field4911 == var125 && class171.field2759 == var11.field2615) {
                                                        var134 = class37.method283(var11.field2455, var11.field2480[var125], var133, 0, -32534, 2, (class295) null);
                                                    } else {
                                                        var134 = class37.method283(var11.field2455, var11.field2480[var125], var133, 3153952, arg9 - 32534, 1, (class295) null);
                                                    }
                                                    if (class164.field2663) {
                                                        class121.field1861[var12] = true;
                                                    }
                                                    if (var134 == null) {
                                                        class254.method1776(arg9 ^ 0x4, var11);
                                                    } else if (class192.field2995 == var11 && class59.field788 == var125) {
                                                        int var135 = class290.field4468 - class262.field4027;
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        int var136 = class108.field1622 - class10.field144;
                                                        if (var136 < 5 && var136 > -5) {
                                                            var136 = 0;
                                                        }
                                                        if (class61.field819 < 5) {
                                                            var135 = 0;
                                                            var136 = 0;
                                                        }
                                                        var134.method123(var129 + var135, var128 + var136, 128);
                                                        if (arg2 != -1) {
                                                            class161 var137 = arg6[arg2 & 0xFFFF];
                                                            int var138;
                                                            int var139;
                                                            if (class73.field1058) {
                                                                var139 = class175.field2817;
                                                                var138 = class175.field2815;
                                                            } else {
                                                                var138 = class287.field4456;
                                                                var139 = class287.field4454;
                                                            }
                                                            if (var139 > (var128 + var136) && var137.field2546 > 0) {
                                                                int var140 = (var139 - var128 - var136) * class228.field3488 / 3;
                                                                if (var140 > (class228.field3488 * 10)) {
                                                                    var140 = class228.field3488 * 10;
                                                                }
                                                                if (var137.field2546 < var140) {
                                                                    var140 = var137.field2546;
                                                                }
                                                                var137.field2546 -= var140;
                                                                class10.field144 += var140;
                                                                class254.method1776(4, var137);
                                                            }
                                                            if ((var128 + var136 + 32) > var138 && var137.field2546 < (var137.field2441 - var137.field2490)) {
                                                                int var141 = (var128 + var136 + 32 - var138) * class228.field3488 / 3;
                                                                if (var141 > (class228.field3488 * 10)) {
                                                                    var141 = class228.field3488 * 10;
                                                                }
                                                                if (var141 > var137.field2441 - var137.field2490 - var137.field2546) {
                                                                    var141 = var137.field2441 - var137.field2546 - var137.field2490;
                                                                }
                                                                var137.field2546 += var141;
                                                                class10.field144 -= var141;
                                                                class254.method1776(4, var137);
                                                            }
                                                        }
                                                    } else if (class307.field4782 == var11 && class160.field2424 == var125) {
                                                        var134.method123(var129, var128, 128);
                                                    } else {
                                                        var134.method124(var129, var128);
                                                    }
                                                }
                                            } else if (var11.field2468 != null && var125 < 20) {
                                                class269 var130 = var11.method1208(var125, (byte) -88);
                                                if (var130 != null) {
                                                    var130.method124(var129, var128);
                                                } else if (class298.field4589) {
                                                    class254.method1776(4, var11);
                                                }
                                            }
                                            var125++;
                                        }
                                    }
                                } else if (var11.field2590 == 3) {
                                    int var57;
                                    if (class304.method2083(true, var11)) {
                                        var57 = var11.field2540;
                                        if (class3.field40 == var11 && var11.field2529 != 0) {
                                            var57 = var11.field2529;
                                        }
                                    } else {
                                        var57 = var11.field2597;
                                        if (class3.field40 == var11 && var11.field2559 != 0) {
                                            var57 = var11.field2559;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2544) {
                                            if (class73.field1058) {
                                                class175.method1322(var14, var13, var11.field2619, var11.field2490, var57);
                                            } else {
                                                class287.method1987(var14, var13, var11.field2619, var11.field2490, var57);
                                            }
                                        } else if (class73.field1058) {
                                            class175.method1320(var14, var13, var11.field2619, var11.field2490, var57);
                                        } else {
                                            class287.method1981(var14, var13, var11.field2619, var11.field2490, var57);
                                        }
                                    } else if (var11.field2544) {
                                        if (class73.field1058) {
                                            class175.method1311(var14, var13, var11.field2619, var11.field2490, var57, 256 - (var15 & 0xFF));
                                        } else {
                                            class287.method1978(var14, var13, var11.field2619, var11.field2490, var57, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class73.field1058) {
                                        class175.method1321(var14, var13, var11.field2619, var11.field2490, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class287.method1977(var14, var13, var11.field2619, var11.field2490, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2590 == 4) {
                                    class326 var121 = var11.method1199(false, class241.field3676);
                                    if (var121 != null) {
                                        String var122 = var11.field2466;
                                        int var123;
                                        if (class304.method2083(true, var11)) {
                                            var123 = var11.field2540;
                                            if (class3.field40 == var11 && var11.field2529 != 0) {
                                                var123 = var11.field2529;
                                            }
                                            if (var11.field2588.length() > 0) {
                                                var122 = var11.field2588;
                                            }
                                        } else {
                                            var123 = var11.field2597;
                                            if (class3.field40 == var11 && var11.field2559 != 0) {
                                                var123 = var11.field2559;
                                            }
                                        }
                                        if (var11.field2550 && var11.field2523 != -1) {
                                            class108 var124 = class222.method1576(var11.field2523, (byte) 92);
                                            var122 = var124.field1630;
                                            if (var122 == null) {
                                                var122 = "null";
                                            }
                                            if ((var124.field1583 == 1 || var11.field2456 != 1) && var11.field2456 != -1) {
                                                var122 = "<col=ff9040>" + var122 + "</col> x" + class43.method337(var11.field2456, -1434);
                                            }
                                        }
                                        if (class29.field352 == var11) {
                                            var123 = var11.field2597;
                                            var122 = class233.field3543;
                                        }
                                        if (!var11.field2550) {
                                            var122 = class338.method2356(arg9, var122, var11);
                                        }
                                        var121.method2266(var122, var14, var13, var11.field2619, var11.field2490, var123, var11.field2607 ? 0 : -1, var11.field2541, var11.field2469, var11.field2542);
                                    } else if (class298.field4589) {
                                        class254.method1776(4, var11);
                                    }
                                } else if (var11.field2590 == 5) {
                                    if (!var11.field2550) {
                                        class269 var104 = var11.method1202(arg9 - 117, class304.method2083(true, var11));
                                        if (var104 != null) {
                                            var104.method124(var14, var13);
                                        } else if (class298.field4589) {
                                            class254.method1776(arg9 + 4, var11);
                                        }
                                    } else if (var11.field2491 >= 0) {
                                        class221 var120 = var11.method1205((byte) 119);
                                        if (class73.field1058) {
                                            var120.method1575(0, var14, var13, var11.field2619, var11.field2490, var11.field2459, var11.field2471, 0);
                                        } else {
                                            var120.method1573(0, var14, var13, var11.field2619, var11.field2490, var11.field2459, var11.field2471, 0);
                                        }
                                    } else {
                                        class269 var105;
                                        if (var11.field2523 == -1) {
                                            var105 = var11.method1202(100, false);
                                        } else if (var11.field2611 && class39.field575.field4199 != null) {
                                            var105 = class37.method283(var11.field2455, var11.field2456, var11.field2523, var11.field2568, -32534, var11.field2569, class39.field575.field4199);
                                        } else {
                                            var105 = class37.method283(var11.field2455, var11.field2456, var11.field2523, var11.field2568, arg9 - 32534, var11.field2569, (class295) null);
                                        }
                                        if (var105 != null) {
                                            int var106 = var105.field4188;
                                            int var107 = var105.field4179;
                                            if (var11.field2479) {
                                                int var108 = (var11.field2619 - (1 - var106)) / var106;
                                                int var109 = (var11.field2490 - (1 - var107)) / var107;
                                                if (class73.field1058) {
                                                    class44 var110 = (class44) var105;
                                                    class175.method1318(var14, var13, var14 + var11.field2619, var11.field2490 + var13);
                                                    boolean var111 = class183.method1359(var105.field4175, arg9 ^ 0x1);
                                                    boolean var112 = class183.method1359(var105.field4184, 1);
                                                    if (var111 && var112) {
                                                        if (var15 == 0) {
                                                            var110.method344(var14, var13, var108, var109);
                                                        } else {
                                                            var110.method347(var14, var13, 256 - (var15 & 0xFF), var108, var109);
                                                        }
                                                    } else if (var111) {
                                                        for (int var116 = 0; var116 < var109; var116++) {
                                                            if (var15 == 0) {
                                                                var110.method344(var14, var107 * var116 + var13, var108, 1);
                                                            } else {
                                                                var110.method347(var14, var107 * var116 + var13, -(var15 & 0xFF) + 256, var108, 1);
                                                            }
                                                        }
                                                    } else if (var112) {
                                                        for (int var113 = 0; var113 < var108; var113++) {
                                                            if (var15 == 0) {
                                                                var110.method344(var14 + (var106 * var113), var13, 1, var109);
                                                            } else {
                                                                var110.method347(var106 * var113 + var14, var13, 256 - (var15 & 0xFF), 1, var109);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var114 = 0; var114 < var108; var114++) {
                                                            for (int var115 = 0; var115 < var109; var115++) {
                                                                if (var15 == 0) {
                                                                    var105.method124(var106 * var114 + var14, var107 * var115 + var13);
                                                                } else {
                                                                    var105.method123(var106 * var114 + var14, var107 * var115 + var13, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class175.method1316(arg5, arg8, arg1, arg4);
                                                } else {
                                                    class287.method1988(var14, var13, var11.field2619 + var14, var11.field2490 + var13);
                                                    for (int var117 = 0; var117 < var108; var117++) {
                                                        for (int var118 = 0; var118 < var109; var118++) {
                                                            if (var11.field2484 != 0) {
                                                                var105.method1884(var107 * var118 + (var107 / 2) + var13, var11.field2484, -128, 4096, var106 / 2 + var106 * var117 + var14);
                                                            } else if (var15 == 0) {
                                                                var105.method124(var14 + (var106 * var117), var13 - -(var107 * var118));
                                                            } else {
                                                                var105.method123(var106 * var117 + var14, var107 * var118 + var13, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class287.method1980(arg5, arg8, arg1, arg4);
                                                }
                                            } else {
                                                int var119 = var11.field2619 * 4096 / var106;
                                                if (var11.field2484 != 0) {
                                                    var105.method1884(var11.field2490 / 2 + var13, var11.field2484, -96, var119, var14 + (var11.field2619 / 2));
                                                } else if (var15 != 0) {
                                                    var105.method122(var14, var13, var11.field2619, var11.field2490, 256 - (var15 & 0xFF));
                                                } else if (var11.field2619 == var106 && var11.field2490 == var107) {
                                                    var105.method124(var14, var13);
                                                } else {
                                                    var105.method132(var14, var13, var11.field2619, var11.field2490);
                                                }
                                            }
                                        } else if (class298.field4589) {
                                            class254.method1776(4, var11);
                                        }
                                    }
                                } else if (var11.field2590 == 6) {
                                    class74 var58 = null;
                                    boolean var59 = class304.method2083(true, var11);
                                    int var60;
                                    if (var59) {
                                        var60 = var11.field2458;
                                    } else {
                                        var60 = var11.field2494;
                                    }
                                    int var61 = 0;
                                    if (var11.field2523 != -1) {
                                        class108 var66 = class222.method1576(var11.field2523, (byte) 92);
                                        if (var66 != null) {
                                            class108 var67 = var66.method820(54, var11.field2456);
                                            class28 var68 = var60 == -1 ? null : client.method1010(var60, (byte) 104);
                                            if (var11.field2611 && class39.field575.field4199 != null) {
                                                var58 = var67.method828(var68, var11.field2460, 1, (byte) -61, var11.field2470, var11.field2532, class39.field575.field4199);
                                            } else {
                                                var58 = var67.method828(var68, var11.field2460, 1, (byte) -56, var11.field2470, var11.field2532, (class295) null);
                                            }
                                            if (var58 == null) {
                                                class254.method1776(4, var11);
                                            } else {
                                                var61 = -var58.method565() / 2;
                                            }
                                        }
                                    } else if (var11.field2481 == 5) {
                                        if (var11.field2444 == -1) {
                                            var58 = class212.field3257.method2037(-1, (class28) null, (class28) null, -1, (class69[]) null, -87980144, 0, 0, -1, -1, true);
                                        } else {
                                            int var62 = var11.field2444 & 0x7FF;
                                            if (class153.field2323 == var62) {
                                                var62 = 2047;
                                            }
                                            class270 var63 = class201.field3096[var62];
                                            class28 var64 = var60 == -1 ? null : client.method1010(var60, (byte) 113);
                                            if (var63 != null && (int) class49.method374(var63.field4218, -1) << 11 == (var11.field2444 & 0xFFFFF800)) {
                                                var58 = var63.field4199.method2037(-1, var64, (class28) null, var11.field2460, (class69[]) null, arg9 ^ 0xFAC18790, 0, 0, 0, -1, true);
                                            }
                                        }
                                    } else if (var60 == -1) {
                                        var58 = var11.method1209((class28) null, class39.field575.field4199, false, -1, var59, -1, 0);
                                        if (var58 == null && class298.field4589) {
                                            class254.method1776(4, var11);
                                        }
                                    } else {
                                        class28 var65 = client.method1010(var60, (byte) 120);
                                        var58 = var11.method1209(var65, class39.field575.field4199, false, var11.field2532, var59, var11.field2460, var11.field2470);
                                        if (var58 == null && class298.field4589) {
                                            class254.method1776(4, var11);
                                        }
                                    }
                                    if (var58 != null) {
                                        int var69;
                                        if (var11.field2465 <= 0) {
                                            var69 = 256;
                                        } else {
                                            var69 = (var11.field2619 << 8) / var11.field2465;
                                        }
                                        int var70 = var11.field2619 / 2 + var14 + (var11.field2605 * var69 >> 8);
                                        int var71;
                                        if (var11.field2602 <= 0) {
                                            var71 = 256;
                                        } else {
                                            var71 = (var11.field2490 << 8) / var11.field2602;
                                        }
                                        int var72 = (var11.field2560 * var71 >> 8) + var11.field2490 / 2 + var13;
                                        if (class73.field1058) {
                                            if (var11.field2474) {
                                                class73.method534(var70, var72, var11.field2565, var11.field2561, var69, var71);
                                            } else {
                                                class73.method539(var70, var72, var69, var71);
                                                class73.method524((float) var11.field2547, (float) var11.field2561 * 1.5F);
                                            }
                                            class73.method550();
                                            class73.method558(true);
                                            class73.method531(false);
                                            class275.method1911(0, class102.field1482);
                                            if (class174.field2802) {
                                                class175.method1314();
                                                class73.method517();
                                                class175.method1316(arg5, arg8, arg1, arg4);
                                                class174.field2802 = false;
                                            }
                                            if (var11.field2453) {
                                                class73.method538();
                                            }
                                            int var75 = class164.field2664[var11.field2622] * var11.field2565 >> 16;
                                            int var76 = class164.field2650[var11.field2622] * var11.field2565 >> 16;
                                            if (var11.field2550) {
                                                var58.method581(0, var11.field2473, var11.field2475, var11.field2622, var11.field2600, var76 + var61 + var11.field2609, var75 - -var11.field2609, -1L);
                                            } else {
                                                var58.method581(0, var11.field2473, 0, var11.field2622, 0, var76, var75, -1L);
                                            }
                                            if (var11.field2453) {
                                                class73.method525();
                                            }
                                        } else {
                                            class164.method1237(var70, var72);
                                            int var73 = class164.field2650[var11.field2622] * var11.field2565 >> 16;
                                            int var74 = class164.field2664[var11.field2622] * var11.field2565 >> 16;
                                            if (!var11.field2550) {
                                                var58.method581(0, var11.field2473, 0, var11.field2622, 0, var73, var74, -1L);
                                            } else if (var11.field2474) {
                                                ((class113) var58).method868(0, var11.field2473, var11.field2475, var11.field2622, var11.field2600, var73 + var61 + var11.field2609, var11.field2609 + var74, var11.field2565);
                                            } else {
                                                var58.method581(0, var11.field2473, var11.field2475, var11.field2622, var11.field2600, var11.field2609 + var61 + var73, var11.field2609 + var74, -1L);
                                            }
                                            class164.method1244();
                                        }
                                    }
                                } else {
                                    if (var11.field2590 == 7) {
                                        class326 var77 = var11.method1199(false, class241.field3676);
                                        if (var77 == null) {
                                            if (class298.field4589) {
                                                class254.method1776(arg9 ^ 0x4, var11);
                                            }
                                            continue;
                                        }
                                        int var78 = 0;
                                        for (int var79 = 0; var79 < var11.field2462; var79++) {
                                            for (int var80 = 0; var80 < var11.field2576; var80++) {
                                                if (var11.field2487[var78] > 0) {
                                                    class108 var81 = class222.method1576(var11.field2487[var78] - 1, (byte) 92);
                                                    String var82;
                                                    if (var81.field1583 != 1 && var11.field2480[var78] == 1) {
                                                        var82 = "<col=ff9040>" + var81.field1630 + "</col>";
                                                    } else {
                                                        var82 = "<col=ff9040>" + var81.field1630 + "</col> x" + class43.method337(var11.field2480[var78], -1434);
                                                    }
                                                    int var83 = (var11.field2493 + 115) * var80 + var14;
                                                    int var84 = (var11.field2497 + 12) * var79 + var13;
                                                    if (var11.field2541 == 0) {
                                                        var77.method2274(var82, var83, var84, var11.field2597, var11.field2607 ? 0 : -1);
                                                    } else if (var11.field2541 == 1) {
                                                        var77.method2265(var82, var83 + 57, var84, var11.field2597, var11.field2607 ? 0 : -1);
                                                    } else {
                                                        var77.method2271(var82, var83 + 115 - 1, var84, var11.field2597, var11.field2607 ? 0 : -1);
                                                    }
                                                }
                                                var78++;
                                            }
                                        }
                                    }
                                    if (var11.field2590 == 8 && class108.field1584 == var11 && class264.field4098 == class23.field259) {
                                        int var85 = 0;
                                        int var86 = 0;
                                        class326 var87 = class265.field4128;
                                        String var88 = var11.field2466;
                                        String var89 = class338.method2356(arg9 ^ 0x0, var88, var11);
                                        while (var89.length() > 0) {
                                            int var90 = var89.indexOf("<br>");
                                            String var91;
                                            if (var90 == -1) {
                                                var91 = var89;
                                                var89 = "";
                                            } else {
                                                var91 = var89.substring(0, var90);
                                                var89 = var89.substring(var90 + 4);
                                            }
                                            int var92 = var87.method2281(var91);
                                            if (var92 > var86) {
                                                var86 = var92;
                                            }
                                            var85 += var87.field5022 + 1;
                                        }
                                        var85 += 7;
                                        var86 += 6;
                                        int var93 = var14 + var11.field2619 - var86 - 5;
                                        int var94 = var11.field2490 + var13 + 5;
                                        if (arg4 < var94 + var85) {
                                            var94 = arg4 - var85;
                                        }
                                        if (var14 + 5 > var93) {
                                            var93 = var14 + 5;
                                        }
                                        if (arg1 < (var86 + var93)) {
                                            var93 = arg1 - var86;
                                        }
                                        if (class73.field1058) {
                                            class175.method1322(var93, var94, var86, var85, 16777120);
                                            class175.method1320(var93, var94, var86, var85, 0);
                                        } else {
                                            class287.method1987(var93, var94, var86, var85, 16777120);
                                            class287.method1981(var93, var94, var86, var85, 0);
                                        }
                                        String var95 = var11.field2466;
                                        int var96 = var94 + var87.field5022 + 2;
                                        String var97 = class338.method2356(0, var95, var11);
                                        while (var97.length() > 0) {
                                            int var98 = var97.indexOf("<br>");
                                            String var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = "";
                                            } else {
                                                var99 = var97.substring(0, var98);
                                                var97 = var97.substring(var98 + 4);
                                            }
                                            var87.method2274(var99, var93 + 3, var96, 0, -1);
                                            var96 += var87.field5022 + 1;
                                        }
                                    }
                                    if (var11.field2590 == 9) {
                                        int var100;
                                        int var101;
                                        int var102;
                                        int var103;
                                        if (var11.field2515) {
                                            var100 = var14 + var11.field2619;
                                            var101 = var14;
                                            var103 = var13 + var11.field2490;
                                            var102 = var13;
                                        } else {
                                            var100 = var11.field2619 + var14;
                                            var101 = var14;
                                            var102 = var13 + var11.field2490;
                                            var103 = var13;
                                        }
                                        if (var11.field2553 == 1) {
                                            if (class73.field1058) {
                                                class175.method1313(var101, var103, var100, var102, var11.field2597);
                                            } else {
                                                class287.method1991(var101, var103, var100, var102, var11.field2597);
                                            }
                                        } else if (class73.field1058) {
                                            class175.method1325(var101, var103, var100, var102, var11.field2597, var11.field2553);
                                        } else {
                                            class287.method1995(var101, var103, var100, var102, var11.field2597, var11.field2553);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field4015++;
    }
}
