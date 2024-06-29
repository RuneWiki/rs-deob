import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 extends class380 {

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field1223;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Lar;")
    public static class47 field1217 = new class47();

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
    public static final void method611(int arg0) {
        class189 var1 = class242.field3238;
        synchronized (class242.field3238) {
            class242.field3238.method1141(256);
        }
        int var2 = -55 / ((27 - arg0) / 48);
        field1219++;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        if (arg0 != 22) {
            method613((class246) null, 66, (class7) null, (class405) null);
        }
        field1221++;
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(B)V")
    public static void method612(byte arg0) {
        if (arg0 != -118) {
            method613((class246) null, -121, (class7) null, (class405) null);
        }
        field1217 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lni;ILfp;Lii;)V")
    public static final void method613(class246 arg0, int arg1, class7 arg2, class405 arg3) {
        field1222++;
        if (arg1 != -2692) {
            method613((class246) null, -100, (class7) null, (class405) null);
        }
        class67 var4 = arg2.method48(arg1 + 2696, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method408();
        if (var5 < var4.method398()) {
            var5 = var4.method398();
        }
        byte var6 = 10;
        int var7 = arg0.field3321;
        int var8 = arg0.field3326;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field113 != null) {
            var9 = class410.field6062.method2128(class246.field3316, arg2.field113, (int[]) null, (class67[]) null, (byte) -83);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class246.field3316[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class367.field5304.method2715(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class367.field5304.method2714() * var9 + (class367.field5304.method2711() / 2);
        }
        int var15 = var5 / 2 + arg0.field3321;
        if ((class293.field4202 + var5) > var7) {
            var15 = class293.field4202 + var10 / 2 + var6 - (-(var5 / 2) - 5);
            var7 = class293.field4202;
        } else if (var7 > class293.field4200 - var5) {
            var7 = class293.field4200 - var5;
            var15 = class293.field4200 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        int var16 = arg0.field3326;
        if (var8 < (class293.field4190 + var5)) {
            var8 = class293.field4190;
            var16 = var5 / 2 + var6 + class293.field4190;
        } else if (class293.field4201 - var5 < var8) {
            var16 = class293.field4201 - (var5 / 2) - (var6 - -var11);
            var8 = class293.field4201 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field3321), (double) (var8 - arg0.field3326)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method448((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = var5 >> 1;
        if (arg2.field113 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2 + 5);
            var21 = class367.field5304.method2714() * var9 + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg2.field133 != 0) {
                arg3.method2610(var21 - var16, arg2.field133, true, var20 - var18, var18, var16);
            }
            if (arg2.field108 != 0) {
                arg3.method2616(var21 - var16, 1, var18, var20 - var18, arg2.field108, var16);
            }
            for (int var23 = 0; var23 < var9; var23++) {
                String var24 = class246.field3316[var23];
                if (var9 - 1 > var23) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class367.field5304.method2717(arg3, var24, var15, var16, arg2.field96, true);
                var16 += class367.field5304.method2714();
            }
        }
        if (class124.field1728 <= (var7 - var22) || class124.field1728 >= (var7 + var22) || var8 - var22 >= class323.field4747 || (var8 + var22) <= class323.field4747 && var18 >= class124.field1728 || class124.field1728 >= var20 || class323.field4747 <= var19 || class323.field4747 >= var21) {
            return;
        }
        if (arg2.field89[4] != null) {
            class41.method299(0, -1, arg2.field89[4], (long) arg0.field3323, arg2.field102, 1001, false, 0);
        }
        if (arg2.field89[3] != null) {
            class41.method299(0, -1, arg2.field89[3], (long) arg0.field3323, arg2.field102, 1012, false, 0);
        }
        if (arg2.field89[2] != null) {
            class41.method299(0, -1, arg2.field89[2], (long) arg0.field3323, arg2.field102, 1002, false, 0);
        }
        if (arg2.field89[1] != null) {
            class41.method299(0, -1, arg2.field89[1], (long) arg0.field3323, arg2.field102, 1010, false, 0);
        }
        if (arg2.field89[0] != null) {
            class41.method299(0, -1, arg2.field89[0], (long) arg0.field3323, arg2.field102, 1007, false, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method367(int arg0) {
        field1220++;
        return arg0 == 21800 ? this.field1223 : null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBIII)V")
    public static final void method614(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class103.field1423 = 0;
        field1218++;
        for (int var7 = -1; var7 < class65.field861 + class198.field2637; var7++) {
            class249 var30 = null;
            class298 var31;
            if (var7 < 0) {
                var31 = class227.field2988;
            } else if (var7 >= class65.field861) {
                var31 = class306.field4496[class398.field5938[var7 - class65.field861]];
                var30 = ((class43) var31).field606;
                if (var30.field3375 != null) {
                    var30 = var30.method1510(30);
                    if (var30 == null) {
                        continue;
                    }
                }
            } else {
                var31 = class206.field2777[class229.field3071[var7]];
            }
            if (var31.field4319 >= 0) {
                class448.method2815(var31.method308((byte) 80), arg0 >> 1, arg5, arg4, var31, (byte) 89, arg2 >> 1);
                if (class375.field5458[0] >= 0) {
                    if (var31.field4309 != null && (class65.field861 <= var7 || class112.field1577 == 0 || class112.field1577 == 3 || class112.field1577 == 1 && class262.method1804(98, ((class25) var31).field340)) && class103.field1423 < class399.field5944) {
                        class399.field5954[class103.field1423] = class191.field2562.method2127(255, var31.field4309) / 2;
                        class399.field5952[class103.field1423] = class375.field5458[0];
                        class399.field5958[class103.field1423] = class375.field5458[1];
                        class399.field5946[class103.field1423] = var31.field4296;
                        class399.field5941[class103.field1423] = var31.field4323;
                        class399.field5961[class103.field1423] = var31.field4310;
                        class399.field5950[class103.field1423] = var31.field4309;
                        class103.field1423++;
                    }
                    class67 var32 = class93.field1341[0];
                    int var33 = arg1 + class375.field5458[1] - Math.max(class191.field2562.field4578, var32.method398());
                    if (!var31.field4334 && var31.field4315 > class28.field418) {
                        class67 var34 = class93.field1341[1];
                        if (var31 instanceof class43) {
                            class43 var35 = (class43) var31;
                            class67[] var36 = (class67[]) class129.field1789.method1137((long) var35.field606.field3416, 2108653711);
                            if (var36 == null) {
                                class441[] var37 = class441.method2779(class362.field5227, var35.field606.field3416, 0);
                                if (var37 != null) {
                                    var36 = new class67[var37.length];
                                    for (int var38 = 0; var38 < var37.length; var38++) {
                                        var36[var38] = class61.field807.method1710(var37[var38], true);
                                    }
                                    class129.field1789.method1144((long) var35.field606.field3416, var36, -3480);
                                }
                            }
                            if (var36 != null && var36.length == 2) {
                                var34 = var36[1];
                                var32 = var36[0];
                            }
                        }
                        int var39 = class375.field5458[0] + arg6 - (var32.method408() >> 1);
                        var32.method454(var39, var33);
                        int var40 = var32.method408() * var31.field4266 / 255;
                        class61.field807.method1665(var39, var33, var39 + var40, var32.method398() + var33);
                        var34.method454(var39, var33);
                        class61.field807.method1767(arg6, arg1, arg2 + arg6, arg1 - -arg0);
                    }
                    var33 -= 2;
                    if (!var31.field4334) {
                        if (class28.field418 < var31.field4312) {
                            class67 var41 = class195.field2608[var31.field4344 ? 2 : 0];
                            class67 var42 = class195.field2608[var31.field4344 ? 3 : 1];
                            boolean var43 = true;
                            int var44;
                            if (var31 instanceof class43) {
                                var44 = var30.field3378;
                                if (var44 == -1) {
                                    var44 = var31.method2040(false).field5842;
                                }
                            } else {
                                var44 = var31.method2040(false).field5842;
                            }
                            if (var44 != -1) {
                                class67[] var45 = (class67[]) class315.field4603.method1137((long) var44, 2108653711);
                                if (var45 == null) {
                                    class441[] var46 = class441.method2779(class362.field5227, var44, 0);
                                    if (var46 != null) {
                                        var45 = new class67[var46.length];
                                        for (int var47 = 0; var47 < var46.length; var47++) {
                                            var45[var47] = class61.field807.method1710(var46[var47], true);
                                        }
                                        class315.field4603.method1144((long) var44, var45, arg3 ^ 0xDE7);
                                    }
                                }
                                if (var45 != null && var45.length == 4) {
                                    var41 = var45[var31.field4344 ? 2 : 0];
                                    var42 = var45[var31.field4344 ? 3 : 1];
                                }
                            }
                            int var48 = var31.field4312 - class28.field418;
                            int var49;
                            if (var31.field4279 >= var48) {
                                var49 = var41.method408();
                            } else {
                                int var50 = var48 - var31.field4279;
                                int var51 = var31.field4289 == 0 ? 0 : (var31.field4336 - var50) / var31.field4289 * var31.field4289;
                                var49 = var51 * var41.method408() / var31.field4336;
                            }
                            int var52 = var41.method398();
                            var33 -= var52;
                            int var53 = class375.field5458[0] + arg6 - (var41.method408() >> 1);
                            var41.method454(var53, var33);
                            class61.field807.method1665(var53, var33, var49 + var53, var33 + var52);
                            var42.method454(var53, var33);
                            var33 -= 2;
                            class61.field807.method1767(arg6, arg1, arg2 + arg6, arg0 + arg1);
                        }
                        if (var7 < class65.field861) {
                            class25 var54 = (class25) var31;
                            if (var54.field327 != -1) {
                                var33 -= 25;
                                class316.field4620[var54.field327].method454(class375.field5458[0] + arg6 - 12, var33);
                                var33 -= 2;
                            }
                            if (var54.field323 != -1) {
                                var33 -= 25;
                                class323.field4743[var54.field323].method454(arg6 + class375.field5458[0] - 12, var33);
                                var33 -= 2;
                            }
                        } else if (var30.field3385 >= 0 && class323.field4743.length > var30.field3385) {
                            class67 var55 = class323.field4743[var30.field3385];
                            var33 -= 25;
                            var55.method454(arg6 + class375.field5458[0] - (var55.method408() >> 1), var33);
                            var33 -= 2;
                        }
                    }
                    int var10000;
                    if (!var31 instanceof class25) {
                        int var62 = 0;
                        class194[] var63 = class219.field2903;
                        for (int var64 = 0; var64 < var63.length; var64++) {
                            class194 var68 = var63[var64];
                            if (var68 != null && var68.field2596 == 1 && class398.field5938[var7 - class65.field861] == var68.field2601) {
                                class67 var69 = class304.field4459[var68.field2592];
                                if (var69.method398() > var62) {
                                    var62 = var69.method398();
                                }
                                if (class28.field418 % 20 < 10) {
                                    var69.method454(arg6 + class375.field5458[0] - 12, var33 + -var69.method398());
                                }
                            }
                        }
                        if (var62 > 0) {
                            var10000 = var33 - (var62 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var56 = 0;
                        class194[] var57 = class219.field2903;
                        for (int var58 = 0; var58 < var57.length; var58++) {
                            class194 var60 = var57[var58];
                            if (var60 != null && var60.field2596 == 10 && class229.field3071[var7] == var60.field2601) {
                                class67 var61 = class304.field4459[var60.field2592];
                                if (var56 < var61.method398()) {
                                    var56 = var61.method398();
                                }
                                var61.method454(class375.field5458[0] + arg6 - 12, var33 - var61.method398());
                            }
                        }
                        if (var56 > 0) {
                            var10000 = var33 - (var56 + 2);
                        }
                    }
                    for (int var66 = 0; var66 < 4; var66++) {
                        if (var31.field4276[var66] > class28.field418) {
                            int var67 = var31.method308((byte) 115) / 2;
                            class448.method2815(var67, arg0 >> 1, arg5, arg4, var31, (byte) 110, arg2 >> 1);
                            if (class375.field5458[0] > -1) {
                                if (var66 == 1) {
                                    class375.field5458[1] -= 20;
                                }
                                if (var66 == 2) {
                                    class375.field5458[1] -= 10;
                                    class375.field5458[0] -= 15;
                                }
                                if (var66 == 3) {
                                    class375.field5458[0] += 15;
                                    class375.field5458[1] -= 10;
                                }
                                class52.field702[var31.field4287[var66]].method454(arg6 + class375.field5458[0] - 12, arg1 + -12 + class375.field5458[1]);
                                class294.field4209.method1881(arg6 + class375.field5458[0] - 1, Integer.toString(var31.field4331[var66]), class375.field5458[1] + arg1 + 3, 0, -1, -99);
                            }
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class430.field6321; var8++) {
            int var26 = class384.field5556[var8];
            class298 var27;
            if (var26 >= 2048) {
                var27 = class306.field4496[var26 - 2048];
            } else {
                var27 = class206.field2777[var26];
            }
            int var28 = class4.field51[var8];
            class298 var29;
            if (var28 < 2048) {
                var29 = class206.field2777[var28];
            } else {
                var29 = class306.field4496[var28 - 2048];
            }
            class273.method1887(arg0, arg1, 0, var27, --var27.field4308, arg5, arg4, arg2, var29, arg6);
        }
        int var9 = class191.field2562.field4578 + class191.field2562.field4596 + 2;
        for (int var10 = 0; var10 < class103.field1423; var10++) {
            int var11 = class399.field5952[var10];
            int var12 = class399.field5958[var10];
            int var13 = class399.field5954[var10];
            boolean var14 = true;
            while (var14) {
                var14 = false;
                for (int var25 = 0; var25 < var10; var25++) {
                    if (var12 + 2 > class399.field5958[var25] - var9 && class399.field5958[var25] + 2 > -var9 + var12 && (class399.field5954[var25] + class399.field5952[var25]) > (var11 - var13) && class399.field5952[var25] - class399.field5954[var25] < var11 + var13 && class399.field5958[var25] - var9 < var12) {
                        var14 = true;
                        var12 = class399.field5958[var25] - var9;
                    }
                }
            }
            class399.field5958[var10] = var12;
            String var15 = class399.field5950[var10];
            if (class75.field1064 == 0) {
                int var16 = 16776960;
                if (class399.field5946[var10] < 6) {
                    var16 = class329.field4797[class399.field5946[var10]];
                }
                if (class399.field5946[var10] == 6) {
                    var16 = (class236.field3139 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class399.field5946[var10] == 7) {
                    var16 = class236.field3139 % 20 >= 10 ? 65535 : 255;
                }
                if (class399.field5946[var10] == 8) {
                    var16 = (class236.field3139 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class399.field5946[var10] == 9) {
                    int var17 = 150 - class399.field5961[var10];
                    if (var17 < 50) {
                        var16 = var17 * 1280 + 16711680;
                    } else if (var17 < 100) {
                        var16 = 16776960 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var16 = 65280 - (500 - (var17 * 5));
                    }
                }
                if (class399.field5946[var10] == 10) {
                    int var18 = 150 - class399.field5961[var10];
                    if (var18 < 50) {
                        var16 = (var18 * 5) + 16711680;
                    } else if (var18 < 100) {
                        var16 = 16384000 + 16711935 - (var18 * 327680);
                    } else if (var18 < 150) {
                        var16 = 255 - (32768000 - (var18 * 327680)) - ((var18 - 100) * 5);
                    }
                }
                if (class399.field5946[var10] == 11) {
                    int var19 = 150 - class399.field5961[var10];
                    if (var19 < 50) {
                        var16 = 16777215 - var19 * 327685;
                    } else if (var19 < 100) {
                        var16 = (var19 - 50) * 327685 + 65280;
                    } else if (var19 < 150) {
                        var16 = 16777215 + 32768000 - (var19 * 327680);
                    }
                }
                int var20 = var16 | 0xFF000000;
                if (class399.field5941[var10] == 0) {
                    class422.field6227.method1881(arg6 + var11, var15, arg1 + var12, -16777216, var20, -110);
                }
                if (class399.field5941[var10] == 1) {
                    class422.field6227.method1879(2, var20, arg1 + var12, var15, arg6 + var11, -16777216, class236.field3139);
                }
                if (class399.field5941[var10] == 2) {
                    class422.field6227.method1891(var15, arg1 + var12, -16777216, true, arg6 + var11, var20, class236.field3139);
                }
                if (class399.field5941[var10] == 3) {
                    class422.field6227.method1875(-16777216, 124, class236.field3139, var20, arg6 + var11, arg1 + var12, 150 - class399.field5961[var10], var15);
                }
                if (class399.field5941[var10] == 4) {
                    int var21 = (150 - class399.field5961[var10]) * (class191.field2562.method2127(255, var15) + 100) / 150;
                    class61.field807.method1665(var11 + arg6 - 50, arg1, arg6 + var11 + 50, arg0 + arg1);
                    class422.field6227.method1878(arg1 + var12, -16777216, var20, var15, (byte) 119, arg6 + var11 + 50 - var21);
                    class61.field807.method1767(arg6, arg1, arg2 + arg6, arg1 - -arg0);
                }
                if (class399.field5941[var10] == 5) {
                    int var22 = 150 - class399.field5961[var10];
                    int var23 = 0;
                    if (var22 < 25) {
                        var23 = var22 - 25;
                    } else if (var22 > 125) {
                        var23 = var22 - 125;
                    }
                    int var24 = class191.field2562.field4578 + class191.field2562.field4596;
                    class61.field807.method1665(arg6, arg1 + var12 - var24 - 1, arg2 + arg6, arg1 + var12 + 5);
                    class422.field6227.method1881(arg6 + var11, var15, arg1 + var23 + var12, -16777216, var20, 114);
                    class61.field807.method1767(arg6, arg1, arg2 + arg6, arg0 + arg1);
                }
            } else {
                class422.field6227.method1881(arg6 + var11, var15, arg1 + var12, -16777216, -256, -127);
            }
        }
        if (arg3 != -113) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class86(Object arg0) {
        this.field1223 = arg0;
    }
}
