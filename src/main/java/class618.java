import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class618 extends class297 {

    @OriginalMember(owner = "client!jia", name = "I", descriptor = "Z")
    private boolean field8419 = true;

    @OriginalMember(owner = "client!jia", name = "P", descriptor = "Z")
    private boolean field8426 = true;

    @OriginalMember(owner = "client!jia", name = "J", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!jia", name = "K", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!jia", name = "L", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!jia", name = "N", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!jia", name = "O", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!jia", name = "M", descriptor = "Ldb;")
    public static class324 field8423;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        ++field8420;
        int[][] var3 = super.field4166.method2180(-119, arg0);
        if (super.field4166.field4849) {
            int[][] var4 = this.method1948((byte) 120, this.field8426 ? -arg0 + class319.field4394 : arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field8419) {
                for (int var11 = 0; var11 < class525.field7275; ++var11) {
                    var8[var11] = var5[-var11 + class677.field9204];
                    var9[var11] = var6[class677.field9204 - var11];
                    var10[var11] = var7[-var11 + class677.field9204];
                }
            } else {
                for (int var12 = 0; ~class525.field7275 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (arg1 != -1564599039) {
            method3502(-40, true, 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIZIIIIZ[Lat;II)V")
    public static final void method3501(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class378[] arg8, int arg9, int arg10) {
        class272.field3822.method303(arg0, arg4, arg6, arg10);
        if (!arg7) {
            ++field8424;
            for (int var11 = 0; arg8.length > var11; ++var11) {
                class378 var12 = arg8[var11];
                if (var12 != null && (var12.field5510 == arg9 || ~arg9 == 1412584498 && class591.field8071 == var12)) {
                    int var13 = var12.field5476 + arg3;
                    int var14 = var12.field5426 + arg1;
                    int var15 = var12.field5385 + var13 + 1;
                    int var16 = var12.field5465 + var14 - -1;
                    int var17;
                    if (~arg5 == 0) {
                        class27.field743[class697.field9413].setBounds(var12.field5476 + arg3, var12.field5426 + arg1, var12.field5385, var12.field5465);
                        var17 = class697.field9413++;
                    } else {
                        var17 = arg5;
                    }
                    var12.field5470 = class641.field8810;
                    var12.field5436 = var17;
                    if (!client.method1982(var12)) {
                        if (var12.field5441 != 0) {
                            class340.method2153(var12, (byte) -36);
                        }
                        int var18 = var12.field5476 - -arg3;
                        int var19 = var12.field5426 + arg1;
                        int var20 = 0;
                        int var21 = 0;
                        if (class241.field3529) {
                            var20 = class146.method1163((byte) -124);
                            var21 = class313.method2035(arg7);
                        }
                        int var22 = var12.field5372;
                        if (class319.field4396 && (client.method1975(var12).field4628 != 0 || ~var12.field5450 == -1) && ~var22 < -128) {
                            var22 = 127;
                        }
                        if (class591.field8071 == var12) {
                            if (~arg9 != 1412584498 && (class482.field6726 == var12.field5473 || class508.field7068 == var12.field5473)) {
                                class419.field6061 = arg1;
                                class669.field9126 = arg3;
                                class290.field4059 = arg8;
                                continue;
                            }
                            if (class756.field10556 && class422.field6093) {
                                int var23 = class284.field3963.method574(true) - -var20;
                                int var24 = class284.field3963.method571((byte) 101) + var21;
                                int var25 = var23 - class228.field3310;
                                int var26 = var24 - class293.field4109;
                                if (class527.field7294 > var25) {
                                    var25 = class527.field7294;
                                }
                                if (var26 < class246.field3594) {
                                    var26 = class246.field3594;
                                }
                                if (var12.field5385 + var25 > class527.field7294 + class234.field3393.field5385) {
                                    var25 = class527.field7294 + class234.field3393.field5385 + -var12.field5385;
                                }
                                if (var12.field5465 + var26 > class246.field3594 + class234.field3393.field5465) {
                                    var26 = class246.field3594 - -class234.field3393.field5465 + -var12.field5465;
                                }
                                var18 = var25;
                                var19 = var26;
                            }
                            if (~class508.field7068 == ~var12.field5473) {
                                var22 = 128;
                            }
                        }
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        if (~var12.field5450 != -3) {
                            int var27 = var18 - -var12.field5385;
                            int var28 = var12.field5465 + var19;
                            if (~var12.field5450 == -10) {
                                ++var28;
                                ++var27;
                            }
                            var29 = arg0 < var18 ? var18 : arg0;
                            var30 = ~var19 >= ~arg4 ? arg4 : var19;
                            var31 = arg6 <= var27 ? arg6 : var27;
                            var32 = ~var28 > ~arg10 ? var28 : arg10;
                        } else {
                            var29 = arg0;
                            var30 = arg4;
                            var32 = arg10;
                            var31 = arg6;
                        }
                        if (var29 < var31 && var30 < var32) {
                            if (~var12.field5441 != -1) {
                                if (~class507.field7055 == ~var12.field5441 || ~class482.field6728 == ~var12.field5441) {
                                    class608.method3459(var12, false, var19, var18);
                                    if (!class241.field3529) {
                                        class349.method2191(124, class482.field6728 == var12.field5441, var12.field5385, var18, var12.field5465, var19);
                                        class272.field3822.method303(arg0, arg4, arg6, arg10);
                                    }
                                    class286.field3995[var17] = true;
                                    continue;
                                }
                                if (~class316.field4377 == ~var12.field5441) {
                                    if (var12.method2385(class272.field3822, (byte) 8) != null) {
                                        class15.method120(false);
                                        class368.method2340(var12, class272.field3822, var18, var19, 22960);
                                        class521.field7232[var17] = true;
                                        class272.field3822.method303(arg0, arg4, arg6, arg10);
                                        if (class241.field3529) {
                                            if (arg2) {
                                                class546.method3152(-5590, var13, var15, var14, var16);
                                            } else {
                                                class452.method2693(var16, var13, (byte) -74, var15, var14);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (~class656.field9000 == ~var12.field5441) {
                                    if (var12.method2385(class272.field3822, (byte) 26) != null) {
                                        class131.method1076(var19, var12, (byte) -98, var18);
                                        class521.field7232[var17] = true;
                                        class272.field3822.method303(arg0, arg4, arg6, arg10);
                                        if (class241.field3529) {
                                            if (!arg2) {
                                                class452.method2693(var16, var13, (byte) -74, var15, var14);
                                            } else {
                                                class546.method3152(-5590, var13, var15, var14, var16);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (~class19.field289 == ~var12.field5441) {
                                    class238.method1654((byte) -7, var18, var12.field5385, var12.field5465, class272.field3822, var19, class528.field7303);
                                    class286.field3995[var17] = true;
                                    class272.field3822.method303(arg0, arg4, arg6, arg10);
                                    continue;
                                }
                                if (class754.field10534 == var12.field5441) {
                                    class570.method3296(var12.field5465, class272.field3822, var18, var12.field5385, true, var19);
                                    class286.field3995[var17] = true;
                                    class272.field3822.method303(arg0, arg4, arg6, arg10);
                                    continue;
                                }
                                if (~class419.field6062 == ~var12.field5441) {
                                    if (!class137.field2298 && !class567.field7806) {
                                        continue;
                                    }
                                    int var33 = var12.field5385 + var18;
                                    int var34 = var19 + 15;
                                    if (class241.field3529) {
                                        if (!arg2) {
                                            class452.method2693(var16, var13, (byte) -74, var15, var14);
                                        } else {
                                            class546.method3152(-5590, var13, var15, var14, var16);
                                        }
                                    }
                                    if (class137.field2298) {
                                        int var35 = -256;
                                        if (~class602.field8268 > -21) {
                                            var35 = -65536;
                                        }
                                        class355.field5007.method632("Fps:" + class602.field8268, var34, var35, var33, -128, -1);
                                        var34 += 15;
                                        Runtime var36 = Runtime.getRuntime();
                                        int var37 = (int) ((var36.totalMemory() + -var36.freeMemory()) / 1024L);
                                        int var38 = -256;
                                        if (var37 > 98304) {
                                            var38 = -65536;
                                            if (class670.field9148) {
                                                class378.method2387(-35);
                                                for (int var39 = 0; var39 < 10; ++var39) {
                                                    System.gc();
                                                }
                                                var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                                if (var37 > 65536) {
                                                    class356.method2237("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", false, 4);
                                                }
                                            }
                                        }
                                        class355.field5007.method632("Mem:" + var37 + "k", var34, var38, var33, -124, -1);
                                        var34 += 15;
                                        class355.field5007.method632("In:" + class231.field3340 + "B/s Out:" + class688.field9293 + "B/s", var34, -256, var33, -127, -1);
                                        var34 += 15;
                                        int var40 = class272.field3822.method339() / 1024;
                                        class355.field5007.method632("Offheap:" + var40 + "k", var34, var40 <= 65536 ? -256 : -65536, var33, -125, -1);
                                        var34 += 15;
                                        int var41 = 0;
                                        int var42 = 0;
                                        int var43 = 0;
                                        for (int var44 = 0; ~var44 > -38; ++var44) {
                                            if (class633.field8705[var44] != null) {
                                                var41 += class633.field8705[var44].method427(0);
                                                var42 += class633.field8705[var44].method436(0);
                                                var43 += class633.field8705[var44].method423(24940);
                                            }
                                        }
                                        int var45 = var43 * 100 / var41;
                                        int var46 = var42 * 10000 / var41;
                                        String var47 = "Cache:" + class384.method2417(2, true, 0, (long) var46, 16980) + "% (" + var45 + "%)";
                                        class214.field3046.method632(var47, var34, -256, var33, -127, -1);
                                        var34 += 12;
                                    }
                                    if (~class464.field6515 < -1) {
                                        class214.field3046.method632("Particles: " + class424.field6119 + " / " + class464.field6515, var34, -256, var33, -121, -1);
                                    }
                                    var34 += 12;
                                    if (class567.field7806) {
                                        class214.field3046.method632("Polys: " + class272.field3822.method315() + " Models: " + class272.field3822.method285(), var34, -256, var33, -127, -1);
                                        var34 += 12;
                                        class214.field3046.method632("Ls: " + class562.field7757 + " La: " + class612.field8372 + " NPC: " + class70.field1290 + " Pl: " + class599.field8219, var34, -256, var33, -122, -1);
                                        class420.method2583((byte) -123);
                                        var34 += 12;
                                    }
                                    class286.field3995[var17] = true;
                                    continue;
                                }
                            }
                            if (~var12.field5450 == -1) {
                                if (~class56.field1135 == ~var12.field5441 && class272.field3822.method328()) {
                                    class272.field3822.method350(var18, var19, var12.field5385, var12.field5465);
                                }
                                method3501(var29, -var12.field5431 + var19, arg2, var18 - var12.field5423, var30, var17, var31, false, arg8, var12.field5506, var32);
                                if (var12.field5474 != null) {
                                    method3501(var29, -var12.field5431 + var19, arg2, var18 - var12.field5423, var30, var17, var31, false, var12.field5474, var12.field5506, var32);
                                }
                                class432 var48 = (class432) class323.field4473.method1465((long) var12.field5506, -6008);
                                if (var48 != null) {
                                    class348.method2189(var19, var48.field6181, var30, var17, var18, var31, var32, (byte) 60, var29);
                                }
                                if (~class56.field1135 == ~var12.field5441 && class272.field3822.method328()) {
                                    class272.field3822.method337();
                                }
                                class272.field3822.method303(arg0, arg4, arg6, arg10);
                            }
                            if (class195.field2885[var17] || ~class745.field10159 < -2) {
                                if (var12.field5450 == 3) {
                                    if (var22 == 0) {
                                        if (var12.field5486) {
                                            class272.field3822.method217(var18, var19, var12.field5385, var12.field5465, var12.field5425, 0);
                                        } else {
                                            class272.field3822.method288(var18, var19, var12.field5385, var12.field5465, var12.field5425, 0);
                                        }
                                    } else if (!var12.field5486) {
                                        class272.field3822.method288(var18, var19, var12.field5385, var12.field5465, 16777215 & var12.field5425 | -(var22 & 255) + 255 << 24, 1);
                                    } else {
                                        class272.field3822.method217(var18, var19, var12.field5385, var12.field5465, 16777215 & var12.field5425 | -(255 & var22) + 255 << 24, 1);
                                    }
                                    if (class241.field3529) {
                                        if (arg2) {
                                            class546.method3152(-5590, var13, var15, var14, var16);
                                        } else {
                                            class452.method2693(var16, var13, (byte) -74, var15, var14);
                                        }
                                    }
                                } else if (~var12.field5450 == -5) {
                                    class60 var49 = var12.method2386(class272.field3822, (byte) 68);
                                    if (var49 == null) {
                                        if (class462.field6498) {
                                            class296.method1945(-9343, var12);
                                        }
                                    } else {
                                        int var50 = var12.field5425;
                                        String var51 = var12.field5468;
                                        if (var12.field5488 != -1) {
                                            class352 var52 = class721.field9801.method162(-67, var12.field5488);
                                            var51 = var52.field4938;
                                            if (var51 == null) {
                                                var51 = "null";
                                            }
                                            if ((var52.field4963 == 1 || ~var12.field5457 != -2) && ~var12.field5457 != 0) {
                                                var51 = "<col=ff9040>" + var51 + "</col> x" + class237.method1647(-127, var12.field5457);
                                            }
                                        }
                                        if (var12.field5482 != -1) {
                                            var51 = class108.method971(var12.field5482, -1431655765);
                                            if (var51 == null) {
                                                var51 = "";
                                            }
                                        }
                                        if (class647.field8909 == var12) {
                                            var51 = class497.field6922.method2936(class607.field8336, 544);
                                            var50 = var12.field5425;
                                        }
                                        if (class143.field2363) {
                                            class272.field3822.method279(var18, var19, var12.field5385 + var18, var12.field5465 + var19);
                                        }
                                        var49.method631((int[]) null, var12.field5465, (byte) -77, (class487) null, 0, class536.field7418, -(var22 & 255) + 255 << 24 | var50, var19, var12.field5385, var12.field5376, var51, 0, var18, var12.field5438, !var12.field5445 ? -1 : -(255 & var22) + 255 << 24, var12.field5449, var12.field5349);
                                        if (class143.field2363) {
                                            class272.field3822.method303(arg0, arg4, arg6, arg10);
                                        }
                                        if (~var51.trim().length() < -1) {
                                            if (class143.field2363) {
                                                if (class241.field3529) {
                                                    if (!arg2) {
                                                        class452.method2693(var16, var13, (byte) -74, var15, var14);
                                                    } else {
                                                        class546.method3152(-5590, var13, var15, var14, var16);
                                                    }
                                                }
                                            } else {
                                                class597 var53 = class481.method2823(-25411, class272.field3822, var12.field5378);
                                                int var54 = var53.method3393(var51, arg7, var12.field5385, class536.field7418);
                                                int var55 = var53.method3391(class536.field7418, 0, var12.field5349, var12.field5385, var51);
                                                if (class241.field3529) {
                                                    if (!arg2) {
                                                        class452.method2693(var19 + var55, var18, (byte) -74, var18 - -var54, var19);
                                                    } else {
                                                        class546.method3152(-5590, var18, var18 + var54, var19, var19 + var55);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (~var12.field5450 == -6) {
                                    if (var12.field5381 >= 0) {
                                        var12.method2404(arg7, class744.field9996, class132.field2230).method2717(0, class272.field3822, (byte) -35, var18, var12.field5385, var19, var12.field5511 << 3, var12.field5435 << 3, 0, var12.field5465);
                                    } else {
                                        class496 var57;
                                        if (var12.field5488 != -1) {
                                            class627 var56 = var12.field5396 ? class58.field1147.field8181 : null;
                                            var57 = class721.field9801.method163(var12.field5348, (byte) -74, var12.field5488, var12.field5457, -16777216 | var12.field5485, var12.field5354, class272.field3822, var56);
                                        } else if (~var12.field5482 == 0) {
                                            var57 = var12.method2403(class272.field3822, (byte) -57);
                                        } else {
                                            var57 = class105.method956(class272.field3822, 0, var12.field5482);
                                        }
                                        if (var57 == null) {
                                            if (class462.field6498) {
                                                class296.method1945(-9343, var12);
                                            }
                                        } else {
                                            int var58 = var57.method1618();
                                            int var59 = var57.method1614();
                                            int var60 = -(var22 & 255) + 255 << 24 | (~var12.field5425 != -1 ? var12.field5425 & 16777215 : 16777215);
                                            if (var12.field5373) {
                                                class272.field3822.method279(var18, var19, var18 - -var12.field5385, var12.field5465 + var19);
                                                if (~var12.field5504 == -1) {
                                                    if (var12.field5425 == 0 && ~var22 == -1) {
                                                        var57.method2923(var18, var19, var12.field5385, var12.field5465);
                                                    } else {
                                                        var57.method1622(var18, var19, var12.field5385, var12.field5465, 0, var60, 1);
                                                    }
                                                } else {
                                                    int var61 = (var58 - 1 + var12.field5385) / var58;
                                                    int var62 = (var59 - 1 + var12.field5465) / var59;
                                                    for (int var63 = 0; var63 < var61; ++var63) {
                                                        for (int var64 = 0; var64 < var62; ++var64) {
                                                            if (var12.field5425 == 0) {
                                                                var57.method2930((float) var58 / 2.0F + (float) (var18 - -(var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5504);
                                                            } else {
                                                                var57.method2928((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field5504, 0, var60, 1);
                                                            }
                                                        }
                                                    }
                                                }
                                                class272.field3822.method303(arg0, arg4, arg6, arg10);
                                            } else if (var12.field5425 == 0 && var22 == 0) {
                                                if (~var12.field5504 != -1) {
                                                    var57.method2930((float) var12.field5385 / 2.0F + (float) var18, (float) var12.field5465 / 2.0F + (float) var19, var12.field5385 * 4096 / var58, var12.field5504);
                                                } else if (var12.field5385 == var58 && var12.field5465 == var59) {
                                                    var57.method2925(var18, var19);
                                                } else {
                                                    var57.method2924(var18, var19, var12.field5385, var12.field5465);
                                                }
                                            } else if (~var12.field5504 != -1) {
                                                var57.method2928((float) var12.field5385 / 2.0F + (float) var18, (float) var12.field5465 / 2.0F + (float) var19, var12.field5385 * 4096 / var58, var12.field5504, 0, var60, 1);
                                            } else if (~var12.field5385 == ~var58 && var12.field5465 == var59) {
                                                var57.method1200(var18, var19, 0, var60, 1);
                                            } else {
                                                var57.method2922(var18, var19, var12.field5385, var12.field5465, 0, var60, 1);
                                            }
                                        }
                                    }
                                    if (class241.field3529) {
                                        if (!arg2) {
                                            class452.method2693(var16, var13, (byte) -74, var15, var14);
                                        } else {
                                            class546.method3152(-5590, var13, var15, var14, var16);
                                        }
                                    }
                                } else if (var12.field5450 != 6) {
                                    if (~var12.field5450 == -10) {
                                        int var84;
                                        int var85;
                                        int var86;
                                        int var87;
                                        if (!var12.field5420) {
                                            var84 = var12.field5465 + var19;
                                            var85 = var12.field5385 + var18;
                                            var86 = var19;
                                            var87 = var18;
                                        } else {
                                            var86 = var12.field5465 + var19;
                                            var87 = var18;
                                            var85 = var12.field5385 + var18;
                                            var84 = var19;
                                        }
                                        if (~var12.field5366 != -2) {
                                            class272.field3822.method276(var87, var86, var85, var84, var12.field5425, var12.field5366, 0);
                                        } else {
                                            class272.field3822.method234(var87, var86, var85, var84, var12.field5425, 0);
                                        }
                                        if (class241.field3529) {
                                            if (arg2) {
                                                class546.method3152(-5590, var13, var15, var14, var16);
                                            } else {
                                                class452.method2693(var16, var13, (byte) -74, var15, var14);
                                            }
                                        }
                                    }
                                } else {
                                    class493.method2903(115);
                                    class472 var65 = null;
                                    int var66 = 0;
                                    if (~var12.field5488 != 0) {
                                        class352 var67 = class721.field9801.method162(103, var12.field5488);
                                        if (var67 != null) {
                                            class352 var68 = var67.method2207(var12.field5457, (byte) 97);
                                            class691 var69 = var12.field5375 == -1 ? null : class456.field6436.method1021(var12.field5375, 7);
                                            class627 var70 = !var12.field5396 ? null : class58.field1147.field8181;
                                            var65 = var68.method2206(var70, var69, class272.field3822, 2048, var12.field5517, 1, var12.field5471, (byte) 88, var12.field5406);
                                            if (var65 != null) {
                                                var66 = -var65.method486() >> 1;
                                            } else {
                                                class296.method1945(-9343, var12);
                                            }
                                        }
                                    } else if (~var12.field5446 == -6) {
                                        int var71 = var12.field5429;
                                        if (~var71 <= -1 && ~var71 > -2049) {
                                            class598 var72 = class49.field1040[var71];
                                            class691 var73 = ~var12.field5375 == 0 ? null : class456.field6436.method1021(var12.field5375, 7);
                                            if (var72 != null && (class561.field7752 == var71 || ~class51.method592(var72.field8189, (byte) -50) == ~var12.field5455)) {
                                                var65 = var72.field8181.method3579(class390.field5635, (class691) null, (class117[]) null, true, class721.field9801, 0, var73, var12.field5406, true, -1, (int[]) null, 2048, class57.field1143, var12.field5517, class272.field3822, class510.field7099, class456.field6436, 0, var12.field5471, 0, class624.field8505);
                                            }
                                        }
                                    } else if (~var12.field5446 != -9 && var12.field5446 != 9) {
                                        if (var12.field5375 != -1) {
                                            class691 var74 = class456.field6436.method1021(var12.field5375, 7);
                                            var65 = var12.method2390(class57.field1143, class456.field6436, 2048, class272.field3822, var12.field5471, var12.field5517, class721.field9801, class390.field5635, 255, class58.field1147.field8181, var74, class624.field8505, class510.field7099, var12.field5406);
                                            if (var65 == null && class462.field6498) {
                                                class296.method1945(-9343, var12);
                                            }
                                        } else {
                                            var65 = var12.method2390(class57.field1143, class456.field6436, 2048, class272.field3822, -1, 0, class721.field9801, class390.field5635, 255, class58.field1147.field8181, (class691) null, class624.field8505, class510.field7099, -1);
                                            if (var65 == null && class462.field6498) {
                                                class296.method1945(-9343, var12);
                                            }
                                        }
                                    } else {
                                        class6 var75 = class284.method1863((byte) -123, var12.field5429, false);
                                        class691 var76 = ~var12.field5375 == 0 ? null : class456.field6436.method1021(var12.field5375, 7);
                                        if (var75 != null) {
                                            class627 var77 = var12.field5396 ? class58.field1147.field8181 : null;
                                            var65 = var75.method25(var76, var77, var12.field5455, var12.field5471, var12.field5517, var12.field5406, 2048, class272.field3822, var12.field5446 == 9, -1);
                                        }
                                    }
                                    if (var65 != null) {
                                        int var78;
                                        if (var12.field5472 > 0) {
                                            var78 = (var12.field5385 << 9) / var12.field5472;
                                        } else {
                                            var78 = 512;
                                        }
                                        int var79;
                                        if (~var12.field5502 >= -1) {
                                            var79 = 512;
                                        } else {
                                            var79 = (var12.field5465 << 9) / var12.field5502;
                                        }
                                        int var80 = var18 - -(var12.field5385 / 2);
                                        int var81 = var12.field5465 / 2 + var19;
                                        if (!var12.field5460) {
                                            var80 += var12.field5364 * var78 >> 9;
                                            var81 += var12.field5475 * var79 >> 9;
                                        }
                                        class244.field3536.method745();
                                        class272.field3822.method210(class244.field3536);
                                        class272.field3822.method179(var80, var81, var78, var79);
                                        class272.field3822.method324();
                                        if (var12.field5430) {
                                            class272.field3822.method306(false);
                                        }
                                        if (!var12.field5460) {
                                            int var82 = (var12.field5392 << 2) * class255.field3698[var12.field5433 << 3] >> 14;
                                            int var83 = (var12.field5392 << 2) * class255.field3695[var12.field5433 << 3] >> 14;
                                            class216.field3122.method742(-var12.field5393 << 3);
                                            class216.field3122.method774(var12.field5351 << 3);
                                            class216.field3122.method752(var12.field5484 << 2, (var12.field5462 << 2) + var66 + var82, (var12.field5462 << 2) + var83);
                                            class216.field3122.method756(var12.field5433 << 3);
                                        } else {
                                            class216.field3122.method749(var12.field5433);
                                            class216.field3122.method774(var12.field5351);
                                            class216.field3122.method768(var12.field5393);
                                            class216.field3122.method752(var12.field5364, var12.field5475, var12.field5463);
                                        }
                                        var12.method2397(-20154, var65, class272.field3822, class641.field8810, class216.field3122);
                                        if (class143.field2363) {
                                            class272.field3822.method279(var18, var19, var12.field5385 + var18, var12.field5465 + var19);
                                        }
                                        if (!var12.field5460) {
                                            if (!var12.field5365) {
                                                var65.method521(class216.field3122, (class317) null, 1);
                                                if (var12.field5416 != null) {
                                                    class272.field3822.method208(var12.field5416.method2433());
                                                }
                                            } else {
                                                var65.method497(class216.field3122, (class317) null, var12.field5392 << 2, 1);
                                            }
                                        } else if (var12.field5365) {
                                            var65.method497(class216.field3122, (class317) null, var12.field5392, 1);
                                        } else {
                                            var65.method521(class216.field3122, (class317) null, 1);
                                            if (var12.field5416 != null) {
                                                class272.field3822.method208(var12.field5416.method2433());
                                            }
                                        }
                                        if (class143.field2363) {
                                            class272.field3822.method303(arg0, arg4, arg6, arg10);
                                        }
                                        if (var12.field5430) {
                                            class272.field3822.method306(true);
                                        }
                                    }
                                    if (class241.field3529) {
                                        if (arg2) {
                                            class546.method3152(-5590, var13, var15, var14, var16);
                                        } else {
                                            class452.method2693(var16, var13, (byte) -74, var15, var14);
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

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field8425;
        if (arg2 == 31015) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field4178 = ~arg0.method1535(255) == -2;
                    }
                } else {
                    this.field8426 = arg0.method1535(255) == 1;
                }
            } else {
                this.field8419 = ~arg0.method1535(255) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
    public class618() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZI)V")
    public static final void method3502(int arg0, boolean arg1, int arg2) {
        ++class100.field1806;
        ++field8421;
        if (arg1) {
            method3502(-42, true, 43);
        }
        class564 var3 = class227.method1594(class230.field3326, class72.field1320, -97);
        var3.field7778.method1483(52, arg2);
        var3.field7778.method1484(arg0, (byte) 44);
        class167.method1260(25, var3);
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field8422;
        if (arg1 != 255) {
            field8423 = null;
        }
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int[] var4 = this.method1951(this.field8426 ? class319.field4394 - arg0 : arg0, arg1 + 633706082, 0);
            if (!this.field8419) {
                class363.method2320(var4, 0, var3, 0, class525.field7275);
            } else {
                for (int var5 = 0; ~class525.field7275 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class677.field9204];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "(I)V")
    public static void method3503(int arg0) {
        if (arg0 != -1) {
            field8423 = null;
        }
        field8423 = null;
    }
}
