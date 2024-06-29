import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class59 extends class128 {

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Ljava/lang/String;")
    public String field965;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    public static int field970 = -1;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lvb;")
    public static class140 field968;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Lfm;")
    public static class93 field967;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Lclient;")
    public static client field973;

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    public class59() {
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method402(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        field966++;
        class25.method136(arg5, arg3, (String) null, arg0, (byte) -5, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class59(String arg0) {
        this.field965 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V")
    public static final void method403(int arg0) {
        field971++;
        if (arg0 > -21) {
            method405(45);
        }
        for (int var1 = 0; var1 < class69.field1145; var1++) {
            int var2 = class40.field584[var1];
            class299 var3 = class270.field4355[var2];
            int var4 = class131.field2053.method1133((byte) 53);
            if ((var4 & 0x10) != 0) {
                var4 += class131.field2053.method1133((byte) 53) << 8;
            }
            class155.method1058(var3, var4, var2, 120);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Llm;Z)V")
    public static final void method404(class151 arg0, boolean arg1) {
        class167.field2722.method1646(true, arg0);
        while (true) {
            class151 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class151[][] var7;
            class151 var83;
            do {
                class151 var82;
                do {
                    class151 var81;
                    do {
                        class151 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class151) class167.field2722.method1651((byte) 125);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2361);
                                            var3 = var2.field2348;
                                            var4 = var2.field2350;
                                            var5 = var2.field2354;
                                            var6 = var2.field2353;
                                            var7 = class218.field3584[var5];
                                            if (!var2.field2359) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class151 var8 = class218.field3584[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2361) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class39.field562 && var3 > class308.field4924) {
                                                    class151 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2361 && (var9.field2359 || (var2.field2358 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class39.field562 && var3 < class189.field3060 - 1) {
                                                    class151 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2361 && (var10.field2359 || (var2.field2358 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class39.field576 && var4 > class52.field874) {
                                                    class151 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2361 && (var11.field2359 || (var2.field2358 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class39.field576 && var4 < class107.field1711 - 1) {
                                                    class151 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2361 && (var12.field2359 || (var2.field2358 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2359 = false;
                                            if (var2.field2360 != null) {
                                                class151 var13 = var2.field2360;
                                                if (var13.field2367 == null) {
                                                    if (var13.field2356 != null) {
                                                        if (class287.method1913(0, var3, var4)) {
                                                            class145.method1012(var13.field2356, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, true);
                                                        } else {
                                                            class145.method1012(var13.field2356, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class287.method1913(0, var3, var4)) {
                                                    class273.method1830(var13.field2367, 0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, true);
                                                } else {
                                                    class273.method1830(var13.field2367, 0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, false);
                                                }
                                                class209 var14 = var13.field2352;
                                                if (var14 != null) {
                                                    var14.field3305.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var14.field3312 - class100.field1626, var14.field3306 - class241.field3841, var14.field3308 - class238.field3823, var14.field3313, var5, (class171) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2357; var15++) {
                                                    class179 var16 = var13.field2347[var15];
                                                    if (var16 != null) {
                                                        var16.field2932.method9(var16.field2927, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var16.field2917 - class100.field1626, var16.field2924 - class241.field3841, var16.field2926 - class238.field3823, var16.field2933, var5, (class171) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2367 == null) {
                                                if (var2.field2356 != null) {
                                                    if (class287.method1913(var6, var3, var4)) {
                                                        class145.method1012(var2.field2356, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class145.method1012(var2.field2356, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, false);
                                                    }
                                                }
                                            } else if (class287.method1913(var6, var3, var4)) {
                                                class273.method1830(var2.field2367, var6, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2367.field1725 != 12345678 || class148.field2313 && var5 <= class160.field2549) {
                                                    class273.method1830(var2.field2367, var6, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class188 var18 = var2.field2364;
                                                if (var18 != null && (var18.field3050 & 0x80000000L) != 0L) {
                                                    var18.field3057.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var18.field3053 - class100.field1626, var18.field3054 - class241.field3841, var18.field3055 - class238.field3823, var18.field3050, var5, (class171) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class209 var21 = var2.field2352;
                                            class259 var22 = var2.field2355;
                                            if (var21 != null || var22 != null) {
                                                if (class39.field562 == var3) {
                                                    var19++;
                                                } else if (class39.field562 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class39.field576 == var4) {
                                                    var19 += 3;
                                                } else if (class39.field576 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class203.field3242[var19];
                                                var2.field2349 = class160.field2544[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3310 & class105.field1668[var19]) == 0) {
                                                    var2.field2344 = 0;
                                                } else if (var21.field3310 == 16) {
                                                    var2.field2344 = 3;
                                                    var2.field2370 = class146.field2295[var19];
                                                    var2.field2346 = 3 - var2.field2370;
                                                } else if (var21.field3310 == 32) {
                                                    var2.field2344 = 6;
                                                    var2.field2370 = class236.field3791[var19];
                                                    var2.field2346 = 6 - var2.field2370;
                                                } else if (var21.field3310 == 64) {
                                                    var2.field2344 = 12;
                                                    var2.field2370 = class148.field2312[var19];
                                                    var2.field2346 = 12 - var2.field2370;
                                                } else {
                                                    var2.field2344 = 9;
                                                    var2.field2370 = class246.field3921[var19];
                                                    var2.field2346 = 9 - var2.field2370;
                                                }
                                                if ((var21.field3310 & var20) != 0 && !class63.method433(var6, var3, var4, var21.field3310)) {
                                                    var21.field3305.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var21.field3312 - class100.field1626, var21.field3306 - class241.field3841, var21.field3308 - class238.field3823, var21.field3313, var5, (class171) null);
                                                }
                                                if ((var21.field3311 & var20) != 0 && !class63.method433(var6, var3, var4, var21.field3311)) {
                                                    var21.field3316.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var21.field3312 - class100.field1626, var21.field3306 - class241.field3841, var21.field3308 - class238.field3823, var21.field3313, var5, (class171) null);
                                                }
                                            }
                                            if (var22 != null && !class199.method1390(var6, var3, var4, var22.field4174.method15())) {
                                                if ((var22.field4181 & var20) != 0) {
                                                    var22.field4174.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var22.field4192 + var22.field4178 - class100.field1626, var22.field4179 - class241.field3841, var22.field4183 + var22.field4180 - class238.field3823, var22.field4185, var5, (class171) null);
                                                } else if (var22.field4181 == 256) {
                                                    int var23 = var22.field4192 - class100.field1626;
                                                    int var24 = var22.field4179 - class241.field3841;
                                                    int var25 = var22.field4183 - class238.field3823;
                                                    int var26 = var22.field4187;
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
                                                        var22.field4174.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var22.field4178 + var23, var24, var22.field4180 + var25, var22.field4185, var5, (class171) null);
                                                    } else if (var22.field4186 != null) {
                                                        var22.field4186.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var23, var24, var25, var22.field4185, var5, (class171) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class188 var29 = var2.field2364;
                                                if (var29 != null && (var29.field3050 & 0x80000000L) == 0L) {
                                                    var29.field3057.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var29.field3053 - class100.field1626, var29.field3054 - class241.field3841, var29.field3055 - class238.field3823, var29.field3050, var5, (class171) null);
                                                }
                                                class29 var30 = var2.field2362;
                                                if (var30 != null && var30.field361 == 0) {
                                                    if (var30.field352 != null) {
                                                        var30.field352.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var30.field357 - class100.field1626, var30.field356 - class241.field3841, var30.field354 - class238.field3823, var30.field362, var5, (class171) null);
                                                    }
                                                    if (var30.field355 != null) {
                                                        var30.field355.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var30.field357 - class100.field1626, var30.field356 - class241.field3841, var30.field354 - class238.field3823, var30.field362, var5, (class171) null);
                                                    }
                                                    if (var30.field358 != null) {
                                                        var30.field358.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var30.field357 - class100.field1626, var30.field356 - class241.field3841, var30.field354 - class238.field3823, var30.field362, var5, (class171) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2358;
                                            if (var31 != 0) {
                                                if (var3 < class39.field562 && (var31 & 0x4) != 0) {
                                                    class151 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2361) {
                                                        class167.field2722.method1646(true, var32);
                                                    }
                                                }
                                                if (var4 < class39.field576 && (var31 & 0x2) != 0) {
                                                    class151 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2361) {
                                                        class167.field2722.method1646(true, var33);
                                                    }
                                                }
                                                if (var3 > class39.field562 && (var31 & 0x1) != 0) {
                                                    class151 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2361) {
                                                        class167.field2722.method1646(true, var34);
                                                    }
                                                }
                                                if (var4 > class39.field576 && (var31 & 0x8) != 0) {
                                                    class151 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2361) {
                                                        class167.field2722.method1646(true, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2344 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2357; var37++) {
                                                if (class173.field2830 != var2.field2347[var37].field2930 && (var2.field2368[var37] & var2.field2344) == var2.field2370) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class209 var38 = var2.field2352;
                                                if (!class63.method433(var6, var3, var4, var38.field3310)) {
                                                    var38.field3305.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var38.field3312 - class100.field1626, var38.field3306 - class241.field3841, var38.field3308 - class238.field3823, var38.field3313, var5, (class171) null);
                                                }
                                                var2.field2344 = 0;
                                            }
                                        }
                                        if (!var2.field2363) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2357;
                                            var2.field2363 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class179 var42 = var2.field2347[var41];
                                                if (class173.field2830 != var42.field2930) {
                                                    for (int var43 = var42.field2931; var43 <= var42.field2918; var43++) {
                                                        for (int var44 = var42.field2915; var44 <= var42.field2925; var44++) {
                                                            class151 var45 = var7[var43][var44];
                                                            if (var45.field2359) {
                                                                var2.field2363 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field2344 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2931) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2918) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2915) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2925) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2344) == var2.field2346) {
                                                                    var2.field2363 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class136.field2155[var40++] = var42;
                                                    int var47 = class39.field562 - var42.field2931;
                                                    int var48 = var42.field2918 - class39.field562;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class39.field576 - var42.field2915;
                                                    int var50 = var42.field2925 - class39.field576;
                                                    if (var50 > var49) {
                                                        var42.field2922 = var47 + var50;
                                                    } else {
                                                        var42.field2922 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class179 var54 = class136.field2155[var53];
                                                    if (class173.field2830 != var54.field2930) {
                                                        if (var54.field2922 > var51) {
                                                            var51 = var54.field2922;
                                                            var52 = var53;
                                                        } else if (var54.field2922 == var51) {
                                                            int var55 = var54.field2917 - class100.field1626;
                                                            int var56 = var54.field2926 - class238.field3823;
                                                            int var57 = class136.field2155[var52].field2917 - class100.field1626;
                                                            int var58 = class136.field2155[var52].field2926 - class238.field3823;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class179 var59 = class136.field2155[var52];
                                                var59.field2930 = class173.field2830;
                                                if (!class221.method1520(var6, var59.field2931, var59.field2918, var59.field2915, var59.field2925, var59.field2932.method15())) {
                                                    var59.field2932.method9(var59.field2927, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var59.field2917 - class100.field1626, var59.field2924 - class241.field3841, var59.field2926 - class238.field3823, var59.field2933, var5, (class171) null);
                                                }
                                                for (int var60 = var59.field2931; var60 <= var59.field2918; var60++) {
                                                    for (int var61 = var59.field2915; var61 <= var59.field2925; var61++) {
                                                        class151 var62 = var7[var60][var61];
                                                        if (var62.field2344 != 0) {
                                                            class167.field2722.method1646(true, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2361) {
                                                            class167.field2722.method1646(true, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2363) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field2363 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2366 != null) {
                                        int var63 = class302.field4825 + class171.field2781;
                                        int var64 = class302.field4835 + class171.field2784;
                                        class282 var65 = var2.field2366.field2878;
                                        for (class282 var66 = var65.field4503; var66 != var65; var66 = var66.field4503) {
                                            class135 var67 = (class135) var66;
                                            if (var67.field2139 != null && !var67.field2139.field3097.field2775) {
                                                if ((byte) ((int) (var67.field2139.field3097.field2785 & 0xFFL)) != var2.field2345) {
                                                    var2.field2366 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field2143 >> 12) - class100.field1626;
                                                int var69 = (var67.field2136 >> 12) - class241.field3841;
                                                int var70 = (var67.field2133 >> 12) - class238.field3823;
                                                int var71 = class69.field1140 * var68 + class264.field4230 * var70 >> 16;
                                                int var72 = class69.field1140 * var70 - class264.field4230 * var68 >> 16;
                                                int var74 = class285.field4524 * var69 - class108.field1729 * var72 >> 16;
                                                int var75 = class285.field4524 * var72 + class108.field1729 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class127.method901(var77, var78, (var67.field2139.field3101.field4545 << 16) / var79, var67.field2135, var67.field2135 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2361);
                            } while (var2.field2344 != 0);
                            if (var3 > class39.field562 || var3 <= class308.field4924) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field2361);
                        if (var3 < class39.field562 || var3 >= class189.field3060 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field2361);
                    if (var4 > class39.field576 || var4 <= class52.field874) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field2361);
                if (var4 < class39.field576 || var4 >= class107.field1711 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field2361);
            var2.field2361 = false;
            class115.field1836--;
            class29 var84 = var2.field2362;
            if (var84 != null && var84.field361 != 0) {
                if (var84.field352 != null) {
                    var84.field352.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var84.field357 - class100.field1626, var84.field356 - class241.field3841 - var84.field361, var84.field354 - class238.field3823, var84.field362, var5, (class171) null);
                }
                if (var84.field355 != null) {
                    var84.field355.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var84.field357 - class100.field1626, var84.field356 - class241.field3841 - var84.field361, var84.field354 - class238.field3823, var84.field362, var5, (class171) null);
                }
                if (var84.field358 != null) {
                    var84.field358.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var84.field357 - class100.field1626, var84.field356 - class241.field3841 - var84.field361, var84.field354 - class238.field3823, var84.field362, var5, (class171) null);
                }
            }
            if (var2.field2349 != 0) {
                class259 var85 = var2.field2355;
                if (var85 != null && !class199.method1390(var6, var3, var4, var85.field4174.method15())) {
                    if ((var85.field4181 & var2.field2349) != 0) {
                        var85.field4174.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var85.field4192 + var85.field4178 - class100.field1626, var85.field4179 - class241.field3841, var85.field4183 + var85.field4180 - class238.field3823, var85.field4185, var5, (class171) null);
                    } else if (var85.field4181 == 256) {
                        int var86 = var85.field4192 - class100.field1626;
                        int var87 = var85.field4179 - class241.field3841;
                        int var88 = var85.field4183 - class238.field3823;
                        int var89 = var85.field4187;
                        int var90;
                        if (var89 == 1 || var89 == 2) {
                            var90 = -var86;
                        } else {
                            var90 = var86;
                        }
                        int var91;
                        if (var89 == 2 || var89 == 3) {
                            var91 = -var88;
                        } else {
                            var91 = var88;
                        }
                        if (var91 >= var90) {
                            var85.field4174.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var85.field4178 + var86, var87, var85.field4180 + var88, var85.field4185, var5, (class171) null);
                        } else if (var85.field4186 != null) {
                            var85.field4186.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var86, var87, var88, var85.field4185, var5, (class171) null);
                        }
                    }
                }
                class209 var92 = var2.field2352;
                if (var92 != null) {
                    if ((var92.field3311 & var2.field2349) != 0 && !class63.method433(var6, var3, var4, var92.field3311)) {
                        var92.field3316.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var92.field3312 - class100.field1626, var92.field3306 - class241.field3841, var92.field3308 - class238.field3823, var92.field3313, var5, (class171) null);
                    }
                    if ((var92.field3310 & var2.field2349) != 0 && !class63.method433(var6, var3, var4, var92.field3310)) {
                        var92.field3305.method9(0, class108.field1729, class285.field4524, class264.field4230, class69.field1140, var92.field3312 - class100.field1626, var92.field3306 - class241.field3841, var92.field3308 - class238.field3823, var92.field3313, var5, (class171) null);
                    }
                }
            }
            if (var5 < class183.field3013 - 1) {
                class151 var93 = class218.field3584[var5 + 1][var3][var4];
                if (var93 != null && var93.field2361) {
                    class167.field2722.method1646(true, var93);
                }
            }
            if (var3 < class39.field562) {
                class151 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field2361) {
                    class167.field2722.method1646(true, var94);
                }
            }
            if (var4 < class39.field576) {
                class151 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field2361) {
                    class167.field2722.method1646(true, var95);
                }
            }
            if (var3 > class39.field562) {
                class151 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field2361) {
                    class167.field2722.method1646(true, var96);
                }
            }
            if (var4 > class39.field576) {
                class151 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field2361) {
                    class167.field2722.method1646(true, var97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)V")
    public static void method405(int arg0) {
        if (arg0 != 11321) {
            field973 = null;
        }
        field967 = null;
        field973 = null;
        field968 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BC)C")
    public static final char method406(byte arg0, char arg1) {
        field969++;
        if (arg0 < 104) {
            method402((String) null, 125, 6, 124, (String) null, (String) null);
        }
        if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}
