import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class356 extends class370 {

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field4830 = -1;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field4829 = 0;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field4831 = 0;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public static final void method2251(int arg0, int arg1, int arg2) {
        if (arg0 != 45) {
            method2253(58, 8, 98, (class118) null);
        }
        class157.field1828 = new class365(arg1);
        field4827++;
        class373.field5051 = new class365(arg2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class212.field2586 = 0;
        field4828++;
        for (int var7 = -1; var7 < class450.field6291 + class106.field1263; var7++) {
            class307 var30 = null;
            class204 var31;
            if (var7 < 0) {
                var31 = class143.field1684;
            } else if (class450.field6291 <= var7) {
                var31 = class220.field2726[class437.field5984[var7 - class450.field6291]];
                var30 = ((class298) var31).field3971;
                if (var30.field4113 != null) {
                    var30 = var30.method1946((byte) 127);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class212.field2584[class304.field4083[var7]];
            }
            if (var31.field2413 >= 0) {
                class354.method2244(arg6, var31.method1248(115), arg4 ^ 0x38BF, arg0 >> 1, arg5, var31, arg3 >> 1);
                if (class242.field3234[0] >= 0) {
                    if (var31.field2418 != null && (var7 >= class450.field6291 || class204.field2468 == 0 || class204.field2468 == 3 || class204.field2468 == 1 && class249.method1620(true, ((class131) var31).field1480)) && class453.field6370 > class212.field2586) {
                        class453.field6338[class212.field2586] = class213.field2611.method2203((byte) -105, var31.field2418) / 2;
                        class453.field6387[class212.field2586] = class242.field3234[0];
                        class453.field6447[class212.field2586] = class242.field3234[1];
                        class453.field6361[class212.field2586] = var31.field2426;
                        class453.field6431[class212.field2586] = var31.field2393;
                        class453.field6445[class212.field2586] = var31.field2463;
                        class453.field6472[class212.field2586] = var31.field2418;
                        class212.field2586++;
                    }
                    class436 var32 = class133.field1527[0];
                    int var33 = class242.field3234[1] + arg2 - Math.max(class213.field2611.field4708, var32.method237());
                    if (!var31.field2460 && class106.field1273 < var31.field2422) {
                        class436 var34 = class133.field1527[1];
                        if (var31 instanceof class298) {
                            class298 var35 = (class298) var31;
                            class436[] var36 = (class436[]) class18.field209.method2295((long) var35.field3971.field4148, (byte) 74);
                            if (var36 == null) {
                                class132[] var37 = class132.method853(class15.field177, var35.field3971.field4148, 0);
                                if (var37 != null) {
                                    var36 = new class436[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class267.field3454.method697(var37[var38], true);
                                    }
                                    class18.field209.method2294(var36, (byte) 86, (long) var35.field3971.field4148);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var32 = var36[0];
                                var34 = var36[1];
                            }
                        }
                        int var39 = class242.field3234[0] + arg1 - (var32.method230() >> 1);
                        var32.method2659(var39, var33);
                        int var40 = var32.method230() * var31.field2402 / 255;
                        if (var31.field2402 > 0 && var40 < 2) {
                            var40 = 2;
                        }
                        class267.field3454.method768(var39, var33, var39 + var40, var33 - -var32.method237());
                        var34.method2659(var39, var33);
                        class267.field3454.method774(arg1, arg2, arg1 + arg3, arg0 + arg2);
                    }
                    var33 -= 2;
                    if (!var31.field2460) {
                        if (class106.field1273 < var31.field2424) {
                            class436 var41 = class12.field156[var31.field2390 ? 2 : 0];
                            class436 var42 = class12.field156[var31.field2390 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if ((var31 instanceof class298)) {
                                var44 = var30.field4119;
                                if (var44 == -1) {
                                    var44 = var31.method1250(-7).field5993;
                                }
                            } else {
                                var44 = var31.method1250(-125).field5993;
                            }
                            if (var44 != -1) {
                                class436[] var45 = (class436[]) class320.field4295.method2295((long) var44, (byte) 74);
                                if (var45 == null) {
                                    class132[] var46 = class132.method853(class15.field177, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class436[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class267.field3454.method697(var46[var47], true);
                                        }
                                        class320.field4295.method2294(var45, (byte) 102, (long) var44);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var42 = var45[var31.field2390 ? 3 : 1];
                                    var41 = var45[var31.field2390 ? 2 : 0];
                                }
                            }
                            int var48 = var31.field2424 - class106.field1273;
                            int var51;
                            if (var48 > var31.field2444) {
                                int var49 = var48 - var31.field2444;
                                int var50 = var31.field2462 == 0 ? 0 : (var31.field2461 - var49) / var31.field2462 * var31.field2462;
                                var51 = var50 * var41.method230() / var31.field2461;
                            } else {
                                var51 = var41.method230();
                            }
                            int var52 = var41.method237();
                            var33 -= var52;
                            int var53 = class242.field3234[0] + arg1 - (var41.method230() >> 1);
                            var41.method2659(var53, var33);
                            class267.field3454.method768(var53, var33, var51 + var53, var33 - -var52);
                            var42.method2659(var53, var33);
                            var33 -= 2;
                            class267.field3454.method774(arg1, arg2, arg1 + arg3, arg0 + arg2);
                        }
                        if (class450.field6291 > var7) {
                            class131 var55 = (class131) var31;
                            if (var55.field1469 != -1) {
                                var33 -= 25;
                                class433.field5916[var55.field1469].method2659(arg1 - (12 - class242.field3234[0]), var33);
                                var33 -= 2;
                            }
                            if (var55.field1473 != -1) {
                                var33 -= 25;
                                class412.field5673[var55.field1473].method2659(arg1 + class242.field3234[0] - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field4130 >= 0 && class412.field5673.length > var30.field4130) {
                            class436 var54 = class412.field5673[var30.field4130];
                            var33 -= 25;
                            var54.method2659(class242.field3234[0] + arg1 - (var54.method230() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class131) {
                        int var62 = 0;
                        class220[] var63 = class307.field4159;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class220 var68 = var63[var64];
                            if (var68 != null && var68.field2716 == 1 && class437.field5984[var7 - class450.field6291] == var68.field2711) {
                                class436 var69 = class150.field1756[var68.field2715];
                                if (var69.method237() > var62) {
                                    var62 = var69.method237();
                                }
                                if (class106.field1273 % 20 < 10) {
                                    var69.method2659(arg1 + class242.field3234[0] - 12, -var69.method237() + var33);
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class220[] var57 = class307.field4159;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class220 var60 = var57[var58];
                            if (var60 != null && var60.field2716 == 10 && class304.field4083[var7] == var60.field2711) {
                                class436 var61 = class150.field1756[var60.field2715];
                                if (var61.method237() > var56) {
                                    var56 = var61.method237();
                                }
                                var61.method2659(arg1 + class242.field3234[0] - 12, -var61.method237() + var33);
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (var31.field2437[var66] > class106.field1273) {
                            int var67 = var31.method1248(103) / 2;
                            class354.method2244(arg6, var67, arg4 - 14527, arg0 >> 1, arg5, var31, arg3 >> 1);
                            if (class242.field3234[0] > -1) {
                                if (var66 == 1) {
                                    class242.field3234[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class242.field3234[0] -= 15;
                                    class242.field3234[1] -= 10;
                                }
                                if (var66 == 3) {
                                    class242.field3234[0] += 15;
                                    class242.field3234[1] -= 10;
                                }
                                class300.field4006[var31.field2415[var66]].method2659(arg1 + class242.field3234[0] - 12, arg2 - (-class242.field3234[1] - -12));
                                class363.field4933.method204(0, arg1 + class242.field3234[0] - 1, -1, arg2 - (-class242.field3234[1] + -3), false, Integer.toString(var31.field2452[var66]));
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != 14527) {
            return;
        }
        for (int var8 = 0; var8 < class372.field5042; var8++) {
            int var26 = class430.field5869[var8];
            class204 var27;
            if (var26 >= 2048) {
                var27 = class220.field2726[var26 - 2048];
            } else {
                var27 = class212.field2584[var26];
            }
            int var28 = class31.field331[var8];
            class204 var29;
            if (var28 < 2048) {
                var29 = class212.field2584[var28];
            } else {
                var29 = class220.field2726[var28 - 2048];
            }
            class57.method314(arg2, arg0, arg3, var29, arg6, (byte) 39, arg1, arg5, var27, --var27.field2438);
        }
        int var9 = class213.field2611.field4708 + class213.field2611.field4706 + 2;
        for (int var10 = 0; var10 < class212.field2586; var10++) {
            int var11 = class453.field6387[var10];
            int var12 = class453.field6447[var10];
            int var13 = class453.field6338[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if (class453.field6447[var25] - var9 < var12 + 2 && (var12 - var9) < (class453.field6447[var25] + 2) && class453.field6387[var25] + class453.field6338[var25] > -var13 + var11 && (class453.field6387[var25] - class453.field6338[var25]) < (var11 + var13) && var12 > (class453.field6447[var25] - var9)) {
                        var14 = true;
                        var12 = class453.field6447[var25] - var9;
                    }
                }
            }
            class453.field6447[var10] = var12;
            String var15 = class453.field6472[var10];
            if (class225.field2861 == 0) {
                int var16 = 16776960;
                if (class453.field6361[var10] < 6) {
                    var16 = class303.field4065[class453.field6361[var10]];
                }
                if (class453.field6361[var10] == 6) {
                    var16 = (class302.field4057 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class453.field6361[var10] == 7) {
                    var16 = class302.field4057 % 20 >= 10 ? 65535 : 255;
                }
                if (class453.field6361[var10] == 8) {
                    var16 = (class302.field4057 % 20) < 10 ? 45056 : 8454016;
                }
                if (class453.field6361[var10] == 9) {
                    int var17 = 150 - class453.field6445[var10];
                    if (var17 < 50) {
                        var16 = (var17 * 1280) + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = (var17 - 100) * 5 + 65280;
                    }
                }
                if (class453.field6361[var10] == 10) {
                    int var18 = 150 - class453.field6445[var10];
                    if (var18 < 50) {
                        var16 = var18 * 5 + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16711935 - (var18 - 50) * 327680;
                    } else if (var18 < 150) {
                        var16 = 255 - ((var18 * 5) - ((var18 - 100) * 327680) - 500);
                    }
                }
                if (class453.field6361[var10] == 11) {
                    int var19 = 150 - class453.field6445[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - (var19 * 327685);
                    } else if (var19 < 100) {
                        var16 = var19 * 327685 - 16318970;
                    } else if (var19 < 150) {
                        var16 = 32768000 + 16777215 - (var19 * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class453.field6431[var10] == 0) {
                    class210.field2544.method204(-16777216, arg1 + var11, var20, arg2 + var12, false, var15);
                }
                if (class453.field6431[var10] == 1) {
                    class210.field2544.method190((byte) 56, var20, var15, arg1 + var11, -16777216, class302.field4057, arg2 + var12);
                }
                if (class453.field6431[var10] == 2) {
                    class210.field2544.method192(arg2 + var12, class302.field4057, arg1 + var11, var20, -16777216, var15, false);
                }
                if (class453.field6431[var10] == 3) {
                    class210.field2544.method196(arg1 + var11, 150 - class453.field6445[var10], class302.field4057, -16777216, -1, var15, arg2 + var12, var20);
                }
                if (class453.field6431[var10] == 4) {
                    int var21 = (150 - class453.field6445[var10]) * (class213.field2611.method2203((byte) -105, var15) + 100) / 150;
                    class267.field3454.method768(var11 + arg1 - 50, arg2, var11 + arg1 + 50, arg2 - -arg0);
                    class210.field2544.method206(var20, arg1 + var11 + 50 - var21, arg2 + var12, -16777216, true, var15);
                    class267.field3454.method774(arg1, arg2, arg1 + arg3, arg0 + arg2);
                }
                if (class453.field6431[var10] == 5) {
                    int var22 = 150 - class453.field6445[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class213.field2611.field4708 + class213.field2611.field4706;
                    class267.field3454.method768(arg1, var12 + arg2 - var24 - 1, arg1 + arg3, arg2 + var12 + 5);
                    class210.field2544.method204(-16777216, arg1 + var11, var20, arg2 + var12 + var23, false, var15);
                    class267.field3454.method774(arg1, arg2, arg1 + arg3, arg0 + arg2);
                }
            } else {
                class210.field2544.method204(-16777216, arg1 + var11, -256, arg2 + var12, false, var15);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILuo;)V")
    public static final void method2253(int arg0, int arg1, int arg2, class118 arg3) {
        field4832++;
        if (arg1 < 0 || arg2 < 0 || class226.field2867 == 0 || class285.field3722 == 0) {
            return;
        }
        arg3.method790(class399.field5409, class393.field5357, class226.field2867, class285.field3722);
        arg3.method774(class141.field1660, class264.field3406, class226.field2867, class285.field3722);
        class450 var4 = arg3.method769();
        var4.method928(class119.field1373, class450.field6287, class161.field1879, class431.field5882, class449.field6273, class27.field308);
        arg3.method749(var4);
        if (class219.field2709 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method771();
            int var8 = (arg1 - class399.field5409) * var7 / class226.field2867;
            int var9 = (arg2 - class393.field5357) * var7 / class285.field3722;
            int var10 = arg3.method751();
            int var11 = (arg1 - class399.field5409) * var10 / class226.field2867;
            int var12 = (arg2 - class393.field5357) * var10 / class285.field3722;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method926(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method926(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class22.field232 && class196.field2329 > var22) {
                    int var23 = class43.field513;
                    if (var23 < 3 && (class222.field2770[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class219.field2709[var23].method1054(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class143.field1684.method841(true) - 1) * 64 + var19 >> 7;
                        var6 = var21 + (class143.field1684.method841(true) - 1) * 64 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class104.field1224 && (class105.field1248 & 0x40) != 0) {
                    class453 var24 = class378.method2346(-23490, class62.field759, class357.field4844);
                    if (var24 == null) {
                        class416.method2561((byte) -94);
                    } else {
                        class300.method1908(class272.field3513, " ->", var6, 672, 0L, class335.field4569, var5, 60);
                    }
                } else {
                    if (class31.field356 == 1) {
                        class300.method1908(-1, "", var6, 672, 0L, class238.field3143.method434(class373.field5057, arg0 - 9282), var5, 59);
                    }
                    class300.method1908(-1, "", var6, 672, 0L, class217.field2662, var5, 21);
                    class366.field4978++;
                }
            }
        }
        class288 var25 = class386.field5275;
        if (arg0 != 1090) {
            method2253(125, 119, -3, (class118) null);
        }
        for (class175 var26 = (class175) var25.method1838(-6325); var26 != null; var26 = (class175) var25.method1834((byte) 120)) {
            if (var26.method1100(arg2, -99, arg1, arg3) && class43.field513 == var26.field2026) {
                if (var26.field2024 instanceof class131) {
                    class131 var27 = (class131) var26.field2024;
                    int var28 = var27.method841(true);
                    if ((var28 & 0x1) == 0 && (var27.field1516 & 0x7F) == 0 && (var27.field1514 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field1516 & 0x7F) == 64 && (var27.field1514 & 0x7F) == 64) {
                        int var29 = var27.field1516 + 64 - (var27.method841(true) * 64);
                        int var30 = var27.field1514 - (var27.method841(true) * 64 - 64);
                        for (int var31 = 0; var31 < class106.field1263; var31++) {
                            class298 var36 = class220.field2726[class437.field5984[var31]];
                            if (var36 != null && class106.field1273 != var36.field2439 && var36.field2460) {
                                int var37 = var36.field1516 - ((var36.field3971.field4106 - 1) * 64);
                                int var38 = var36.field1514 - ((var36.field3971.field4106 - 1) * 64);
                                if (var29 <= var37 && var36.field3971.field4106 <= (var27.method841(true) - (var37 - var29 >> 7)) && var38 >= var30 && var36.field3971.field4106 <= var27.method841(true) - (var38 - var30 >> 7)) {
                                    class379.method2357(var36, 121);
                                    var36.field2439 = class106.field1273;
                                }
                            }
                        }
                        for (int var32 = 0; var32 < class450.field6291; var32++) {
                            class131 var33 = class212.field2584[class304.field4083[var32]];
                            if (var33 != null && class106.field1273 != var33.field2439 && var27 != var33 && var33.field2460) {
                                int var34 = var33.field1516 + 64 - (var33.method841(true) * 64);
                                int var35 = var33.field1514 + 64 - (var33.method841(true) * 64);
                                if (var34 >= var29 && var33.method841(true) <= var27.method841(true) - (var34 - var29 >> 7) && var35 >= var30 && var33.method841(true) <= (var27.method841(true) - (var35 - var30 >> 7))) {
                                    class259.method1639((byte) -98, var33);
                                    var33.field2439 = class106.field1273;
                                }
                            }
                        }
                    }
                    if (class106.field1273 == var27.field2439) {
                        continue;
                    }
                    class259.method1639((byte) -29, var27);
                    var27.field2439 = class106.field1273;
                }
                if (var26.field2024 instanceof class298) {
                    class298 var39 = (class298) var26.field2024;
                    if (var39.field3971 != null) {
                        if ((var39.field3971.field4106 & 0x1) == 0 && (var39.field1516 & 0x7F) == 0 && (var39.field1514 & 0x7F) == 0 || (var39.field3971.field4106 & 0x1) == 1 && (var39.field1516 & 0x7F) == 64 && (var39.field1514 & 0x7F) == 64) {
                            int var40 = var39.field1516 - ((var39.field3971.field4106 - 1) * 64);
                            int var41 = var39.field1514 - (var39.field3971.field4106 - 1) * 64;
                            for (int var42 = 0; var42 < class106.field1263; var42++) {
                                class298 var47 = class220.field2726[class437.field5984[var42]];
                                if (var47 != null && class106.field1273 != var47.field2439 && var39 != var47 && var47.field2460) {
                                    int var48 = var47.field1516 - (var47.field3971.field4106 - 1) * 64;
                                    int var49 = var47.field1514 + 64 - (var47.field3971.field4106 * 64);
                                    if (var40 <= var48 && var39.field3971.field4106 - (var48 - var40 >> 7) >= var47.field3971.field4106 && var41 <= var49 && var39.field3971.field4106 - (var49 - var41 >> 7) >= var47.field3971.field4106) {
                                        class379.method2357(var47, arg0 - 997);
                                        var47.field2439 = class106.field1273;
                                    }
                                }
                            }
                            for (int var43 = 0; var43 < class450.field6291; var43++) {
                                class131 var44 = class212.field2584[class304.field4083[var43]];
                                if (var44 != null && class106.field1273 != var44.field2439 && var44.field2460) {
                                    int var45 = var44.field1516 - (var44.method841(true) - 1) * 64;
                                    int var46 = var44.field1514 - ((var44.method841(true) - 1) * 64);
                                    if (var45 >= var40 && var44.method841(true) <= (var39.field3971.field4106 - (var45 - var40 >> 7)) && var46 >= var41 && var44.method841(true) <= var39.field3971.field4106 - (var46 - var41 >> 7)) {
                                        class259.method1639((byte) -120, var44);
                                        var44.field2439 = class106.field1273;
                                    }
                                }
                            }
                        }
                        if (class106.field1273 == var39.field2439) {
                            continue;
                        }
                        class379.method2357(var39, 126);
                        var39.field2439 = class106.field1273;
                    }
                }
                if (var26.field2024 instanceof class191) {
                    class14 var50 = (class14) class76.field939.method2218(1, (long) (var26.field2023 << 14 | var26.field2026 << 28 | var26.field2031));
                    if (var50 != null) {
                        for (class228 var51 = (class228) var50.field171.method1700((byte) 80); var51 != null; var51 = (class228) var50.field171.method1689(-114)) {
                            class59 var52 = class131.method843((byte) 5, var51.field2885);
                            if (class104.field1224) {
                                class354 var57 = class122.field1384 == -1 ? null : class450.method2783(class122.field1384, (byte) -108);
                                if ((class105.field1248 & 0x1) != 0 && (var57 == null || var52.method341((byte) 110, class122.field1384, var57.field4814) != var57.field4814)) {
                                    class300.method1908(class272.field3513, class381.field5204 + " -> <col=ff9040>" + var52.field736, var26.field2023, 672, (long) var51.field2885, class335.field4569, var26.field2031, 6);
                                    class262.field3373++;
                                }
                            } else {
                                String[] var53 = var52.field732;
                                for (int var54 = 4; var54 >= 0; var54--) {
                                    if (var53 != null && var53[var54] != null) {
                                        byte var55 = 0;
                                        int var56 = class339.field4625;
                                        if (var54 == 0) {
                                            var55 = 12;
                                        }
                                        if (var54 == 1) {
                                            var55 = 11;
                                        }
                                        if (var54 == 2) {
                                            var55 = 45;
                                        }
                                        if (var54 == 3) {
                                            var55 = 47;
                                        }
                                        if (var52.field727 == var54) {
                                            var56 = var52.field680;
                                        }
                                        if (var54 == 4) {
                                            var55 = 46;
                                        }
                                        if (var52.field703 == var54) {
                                            var56 = var52.field708;
                                        }
                                        class300.method1908(var56, "<col=ff9040>" + var52.field736, var26.field2023, arg0 - 418, (long) var51.field2885, var53[var54], var26.field2031, var55);
                                        class363.field4929++;
                                    }
                                }
                                class277.field3589++;
                                class300.method1908(class282.field3687, "<col=ff9040>" + var52.field736, var26.field2023, arg0 ^ 0x6E2, (long) var51.field2885, class265.field3410.method434(class373.field5057, -8192), var26.field2031, 1009);
                            }
                        }
                    }
                }
                if (var26.field2024 instanceof class171) {
                    class171 var58 = (class171) var26.field2024;
                    class446 var59 = class380.method2361(var58.method409(-50), -29012);
                    if (var59.field6233 != null) {
                        var59 = var59.method2759(arg0 + 23874);
                    }
                    if (var59 != null) {
                        if (class104.field1224) {
                            class354 var60 = class122.field1384 == -1 ? null : class450.method2783(class122.field1384, (byte) 97);
                            if ((class105.field1248 & 0x4) != 0 && (var60 == null || var59.method2765((byte) 111, var60.field4814, class122.field1384) != var60.field4814)) {
                                class235.field3095++;
                                class300.method1908(class272.field3513, class381.field5204 + " -> <col=00ffff>" + var59.field6212, var26.field2023, 672, class127.method821(var26.field2031, var58, var26.field2023, 1539), class335.field4569, var26.field2031, 44);
                            }
                        } else {
                            String[] var61 = var59.field6214;
                            if (var61 != null) {
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61[var62] != null) {
                                        short var63 = 0;
                                        int var64 = class339.field4625;
                                        if (var62 == 0) {
                                            var63 = 3;
                                        }
                                        if (var62 == 1) {
                                            var63 = 9;
                                        }
                                        if (var62 == 2) {
                                            var63 = 51;
                                        }
                                        if (var62 == 3) {
                                            var63 = 17;
                                        }
                                        if (var59.field6248 == var62) {
                                            var64 = var59.field6226;
                                        }
                                        if (var62 == 4) {
                                            var63 = 1002;
                                        }
                                        if (var59.field6240 == var62) {
                                            var64 = var59.field6182;
                                        }
                                        class395.field5380++;
                                        class300.method1908(var64, "<col=00ffff>" + var59.field6212, var26.field2023, 672, class127.method821(var26.field2031, var58, var26.field2023, 1539), var61[var62], var26.field2031, var63);
                                    }
                                }
                            }
                            class300.method1908(class282.field3687, "<col=00ffff>" + var59.field6212, var26.field2023, 672, (long) var59.field6209, class265.field3410.method434(class373.field5057, arg0 - 9282), var26.field2031, 1011);
                            class222.field2750++;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IIIIIII)V")
    public static final void method2254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4833++;
        int var7 = arg5 - arg2;
        int var8 = arg2 + arg3;
        if (arg0 != -18176) {
            method2252(61, -109, -14, -59, 112, 22, -125);
        }
        for (int var9 = arg3; var9 < var8; var9++) {
            class384.method2394(arg4, arg0 + 18297, class228.field2877[var9], arg6, arg1);
        }
        for (int var10 = arg5; var10 > var7; var10--) {
            class384.method2394(arg4, arg0 ^ 0xFFFFB95F, class228.field2877[var10], arg6, arg1);
        }
        int var11 = arg1 + arg2;
        int var12 = arg6 - arg2;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class228.field2877[var13];
            class384.method2394(arg4, 105, var14, var11, arg1);
            class384.method2394(arg4, arg0 ^ 0xFFFFB975, var14, arg6, var12);
        }
    }
}
