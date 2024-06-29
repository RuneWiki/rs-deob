import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class170 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lrb;")
    public static class143 field2574 = new class143(16);

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2575 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[B")
    public static byte[][] field2576;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        class195.field2878.method1422((byte) 85);
        field2580++;
        class159.field2467.method1422((byte) 118);
        class211.field3110.method1422((byte) 104);
        if (arg0 != 1) {
            method1211(-78, 113, 63, -15, 47, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 27, (byte) -29, -86, -98);
        }
        class299.field4823.method1422((byte) 122);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)I")
    public static final int method1209(int arg0, int arg1, int arg2, int arg3) {
        field2573++;
        if (arg0 != 20) {
            method1213((byte) -16);
        }
        if ((class253.field3806[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class253.field3806[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2578++;
        class32.field401 = 0;
        if (arg6) {
            method1208(76);
        }
        for (int var7 = -1; var7 < (class12.field135 + class103.field1791); var7++) {
            class248 var23;
            if (var7 == -1) {
                var23 = class213.field3139;
            } else if (class103.field1791 > var7) {
                var23 = class92.field1475[class162.field2518[var7]];
            } else {
                var23 = class255.field3856[class14.field159[var7 - class103.field1791]];
            }
            if (var23 != null && var23.method91(78)) {
                if (var23 instanceof class12) {
                    class102 var24 = ((class12) var23).field137;
                    if (var24.field1752 != null) {
                        var24 = var24.method795(65535);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class103.field1791 <= var7) {
                    class102 var25 = ((class12) var23).field137;
                    if (var25.field1752 != null) {
                        var25 = var25.method795(65535);
                    }
                    if (var25.field1756 >= 0 && var25.field1756 < class8.field81.length) {
                        int var26;
                        if (var25.field1720 == -1) {
                            var26 = var23.method1714((byte) -123) + 15;
                        } else {
                            var26 = var25.field1720 + 15;
                        }
                        class33.method215((byte) -35, var26, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                        if (class8.field94 > -1) {
                            class8.field81[var25.field1756].method726(class8.field94 + arg1 - 12, arg0 - -class147.field2354 + -30);
                        }
                    }
                    class147[] var27 = class142.field2301;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class147 var29 = var27[var28];
                        if (var29 != null && var29.field2362 == 1 && class14.field159[var7 - class103.field1791] == var29.field2367 && (class199.field2930 % 20) < 10) {
                            int var30;
                            if (var25.field1720 == -1) {
                                var30 = var23.method1714((byte) -118) + 15;
                            } else {
                                var30 = var25.field1720 + 15;
                            }
                            class33.method215((byte) -35, var30, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                            if (class8.field94 > -1) {
                                class174.field2654[var29.field2364].method726(class8.field94 + arg1 - 12, arg0 + -28 + class147.field2354);
                            }
                        }
                    }
                } else {
                    class207 var31 = (class207) var23;
                    int var32 = 30;
                    if (var31.field3056 != -1 || var31.field3042 != -1) {
                        class33.method215((byte) -35, var23.method1714((byte) -117) + 15, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                        if (class8.field94 > -1) {
                            if (var31.field3056 != -1) {
                                class263.field4161[var31.field3056].method726(class8.field94 + arg1 - 12, arg0 - var32 + class147.field2354);
                                var32 += 25;
                            }
                            if (var31.field3042 != -1) {
                                class8.field81[var31.field3042].method726(arg1 - (12 - class8.field94), -var32 + class147.field2354 + arg0);
                                var32 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class147[] var33 = class142.field2301;
                        for (int var34 = 0; var34 < var33.length; var34++) {
                            class147 var35 = var33[var34];
                            if (var35 != null && var35.field2362 == 10 && class162.field2518[var7] == var35.field2367) {
                                class33.method215((byte) -35, var23.method1714((byte) -121) + 15, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                                if (class8.field94 > -1) {
                                    class174.field2654[var35.field2364].method726(arg1 + class8.field94 - 12, arg0 - var32 + class147.field2354);
                                }
                            }
                        }
                    }
                }
                if (var23.field3731 != null && (var7 >= class103.field1791 || class185.field2767 == 0 || class185.field2767 == 3 || class185.field2767 == 1 && class128.method974(1128, ((class207) var23).field3069))) {
                    class33.method215((byte) -35, var23.method1714((byte) -125), arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                    if (class8.field94 > -1 && class115.field1900 > class32.field401) {
                        class115.field1904[class32.field401] = class208.field3084.method78(var23.field3731) / 2;
                        class115.field1905[class32.field401] = class208.field3084.field107;
                        class115.field1908[class32.field401] = class8.field94;
                        class115.field1899[class32.field401] = class147.field2354;
                        class115.field1911[class32.field401] = var23.field3699;
                        class115.field1909[class32.field401] = var23.field3691;
                        class115.field1903[class32.field401] = var23.field3755;
                        class115.field1910[class32.field401] = var23.field3731;
                        class32.field401++;
                    }
                }
                if (class199.field2930 < var23.field3684) {
                    class94 var36 = class303.field4904[0];
                    class94 var37 = class303.field4904[1];
                    int var38;
                    if ((var23 instanceof class12)) {
                        class12 var39 = (class12) var23;
                        class94[] var40 = (class94[]) class38.field494.method1418((long) var39.field137.field1747, 0);
                        if (var40 == null) {
                            var40 = class193.method1372(class191.field2827, 0, -1, var39.field137.field1747);
                            if (var40 != null) {
                                class38.field494.method1421((long) var39.field137.field1747, var40, (byte) -113);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var36 = var40[0];
                            var37 = var40[1];
                        }
                        class102 var41 = var39.field137;
                        if (var41.field1720 == -1) {
                            var38 = var23.method1714((byte) -114);
                        } else {
                            var38 = var41.field1720;
                        }
                    } else {
                        var38 = var23.method1714((byte) -122);
                    }
                    class33.method215((byte) -35, var38 + var36.field1586 + 10, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                    if (class8.field94 > -1) {
                        int var42 = class8.field94 + arg1 - (var36.field1585 >> 1);
                        int var43 = arg0 + class147.field2354 - 3;
                        var36.method726(var42, var43);
                        int var44 = var23.field3700 * var36.field1585 / 255;
                        int var45 = var36.field1586;
                        class130.method986(var42, var43, var42 + var44, var43 + var45);
                        var37.method726(var42, var43);
                        class130.method982(arg1, arg0, arg1 + arg4, arg0 + arg5);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class199.field2930 < var23.field3696[var46]) {
                        int var47;
                        if ((var23 instanceof class12)) {
                            class12 var48 = (class12) var23;
                            class102 var49 = var48.field137;
                            if (var49.field1720 == -1) {
                                var47 = var23.method1714((byte) -117) / 2;
                            } else {
                                var47 = var49.field1720 / 2;
                            }
                        } else {
                            var47 = var23.method1714((byte) -119) / 2;
                        }
                        class33.method215((byte) -35, var47, arg5 >> 1, arg2, arg3, var23, arg4 >> 1);
                        if (class8.field94 > -1) {
                            if (var46 == 1) {
                                class147.field2354 -= 20;
                            }
                            if (var46 == 2) {
                                class147.field2354 -= 10;
                                class8.field94 -= 15;
                            }
                            if (var46 == 3) {
                                class8.field94 += 15;
                                class147.field2354 -= 10;
                            }
                            class249.field3764[var23.field3734[var46]].method726(arg1 + class8.field94 - 12, class147.field2354 + -12 + arg0);
                            class84.field1336.method67(Integer.toString(var23.field3657[var46]), arg1 + class8.field94 - 1, class147.field2354 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class32.field401; var8++) {
            int var9 = class115.field1908[var8];
            int var10 = class115.field1899[var8];
            int var11 = class115.field1905[var8];
            int var12 = class115.field1904[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var10 + 2) > (class115.field1899[var22] - class115.field1905[var22]) && class115.field1899[var22] + 2 > var10 - var11 && (var9 - var12) < (class115.field1908[var22] + class115.field1904[var22]) && (class115.field1908[var22] - class115.field1904[var22]) < (var9 + var12) && class115.field1899[var22] - class115.field1905[var22] < var10) {
                        var13 = true;
                        var10 = class115.field1899[var22] - class115.field1905[var22];
                    }
                }
            }
            class8.field94 = class115.field1908[var8];
            class147.field2354 = class115.field1899[var8] = var10;
            String var14 = class115.field1910[var8];
            if (class312.field4993 == 0) {
                int var15 = 16776960;
                if (class115.field1911[var8] < 6) {
                    var15 = class82.field1327[class115.field1911[var8]];
                }
                if (class115.field1911[var8] == 6) {
                    var15 = (class62.field949 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class115.field1911[var8] == 7) {
                    var15 = (class62.field949 % 20) < 10 ? 255 : 65535;
                }
                if (class115.field1911[var8] == 8) {
                    var15 = (class62.field949 % 20) < 10 ? 45056 : 8454016;
                }
                if (class115.field1911[var8] == 9) {
                    int var16 = 150 - class115.field1903[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 * 327680 - 16384000);
                    } else if (var16 < 150) {
                        var15 = 65280 - (500 - (var16 * 5));
                    }
                }
                if (class115.field1911[var8] == 10) {
                    int var17 = 150 - class115.field1903[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 + 16384000 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 - ((var17 - 100) * 5 + 32767745);
                    }
                }
                if (class115.field1911[var8] == 11) {
                    int var18 = 150 - class115.field1903[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class115.field1909[var8] == 0) {
                    class208.field3084.method67(var14, class8.field94 + arg1, class147.field2354 + arg0, var15, 0);
                }
                if (class115.field1909[var8] == 1) {
                    class208.field3084.method79(var14, class8.field94 + arg1, class147.field2354 + arg0, var15, 0, class62.field949);
                }
                if (class115.field1909[var8] == 2) {
                    class208.field3084.method68(var14, arg1 + class8.field94, class147.field2354 + arg0, var15, 0, class62.field949);
                }
                if (class115.field1909[var8] == 3) {
                    class208.field3084.method64(var14, class8.field94 + arg1, arg0 - -class147.field2354, var15, 0, class62.field949, 150 - class115.field1903[var8]);
                }
                if (class115.field1909[var8] == 4) {
                    int var19 = (150 - class115.field1903[var8]) * (class208.field3084.method78(var14) + 100) / 150;
                    class130.method986(class8.field94 + arg1 - 50, arg0, arg1 + class8.field94 + 50, arg0 + arg5);
                    class208.field3084.method72(var14, class8.field94 + arg1 + 50 - var19, class147.field2354 + arg0, var15, 0);
                    class130.method982(arg1, arg0, arg1 + arg4, arg0 + arg5);
                }
                if (class115.field1909[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class115.field1903[var8];
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class130.method986(arg1, class147.field2354 + arg0 - class208.field3084.field107 - 1, arg1 + arg4, arg0 - (-class147.field2354 - 5));
                    class208.field3084.method67(var14, class8.field94 + arg1, arg0 + var20 + class147.field2354, var15, 0);
                    class130.method982(arg1, arg0, arg1 + arg4, arg0 + arg5);
                }
            } else {
                class208.field3084.method67(var14, class8.field94 + arg1, arg0 - -class147.field2354, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class159.field2481 * 128) {
            arg0 = class159.field2481 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class7.field67 * 128) {
            arg2 = class7.field67 * 128 - 1;
        }
        class284.field4568 = class244.field3590[arg3];
        class86.field1366 = class244.field3592[arg3];
        class156.field2438 = class244.field3590[arg4];
        class106.field1812 = class244.field3592[arg4];
        class159.field2479 = arg0;
        class282.field4540 = arg1;
        class141.field2281 = arg2;
        class142.field2288 = arg0 / 128;
        class138.field2252 = arg2 / 128;
        class223.field3264 = class142.field2288 - class91.field1457;
        if (class223.field3264 < 0) {
            class223.field3264 = 0;
        }
        class104.field1797 = class138.field2252 - class91.field1457;
        if (class104.field1797 < 0) {
            class104.field1797 = 0;
        }
        class251.field3796 = class91.field1457 + class142.field2288;
        if (class251.field3796 > class159.field2481) {
            class251.field3796 = class159.field2481;
        }
        class218.field3186 = class91.field1457 + class138.field2252;
        if (class218.field3186 > class7.field67) {
            class218.field3186 = class7.field67;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class91.field1457 + class91.field1457 + 2; var16++) {
            for (int var19 = 0; var19 < class91.field1457 + class91.field1457 + 2; var19++) {
                int var20 = (var16 - class91.field1457 << 7) - (class159.field2479 & 0x7F);
                int var21 = (var19 - class91.field1457 << 7) - (class141.field2281 & 0x7F);
                int var22 = class142.field2288 + var16 - class91.field1457;
                int var23 = class138.field2252 + var19 - class91.field1457;
                if (var22 >= 0 && var23 >= 0 && var22 < class159.field2481 && var23 < class7.field67) {
                    int var24;
                    if (class277.field4486 == null) {
                        var24 = class297.field4763[0][var22][var23] + 128 - class282.field4540;
                    } else {
                        var24 = class277.field4486[0][var22][var23] + 128 - class282.field4540;
                    }
                    int var25 = class297.field4763[3][var22][var23] - class282.field4540 - 1000;
                    class64.field971[var16][var19] = class275.method1911(var20, var25, var24, var21, var15);
                } else {
                    class64.field971[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class91.field1457 + class91.field1457 + 1; var17++) {
            for (int var18 = 0; var18 < class91.field1457 + class91.field1457 + 1; var18++) {
                class79.field1276[var17][var18] = class64.field971[var17][var18] || class64.field971[var17 + 1][var18] || class64.field971[var17][var18 + 1] || class64.field971[var17 + 1][var18 + 1];
            }
        }
        class249.field3766 = arg6;
        class187.field2785 = arg7;
        class163.field2519 = arg8;
        class24.field265 = arg9;
        class224.field3290 = arg10;
        class217.method1514();
        if (class276.field4472 != null) {
            class20.method141(true);
            class218.method1523(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class20.method141(false);
        }
        class218.method1523(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lqi;II)V")
    public static final void method1212(class234 arg0, int arg1, int arg2) {
        field2572++;
        Object[] var3 = arg0.field3419;
        int var4 = (Integer) var3[0];
        class247 var5 = class25.method167(var4, -104);
        if (var5 == null) {
            return;
        }
        class245.field3607 = new int[var5.field3644];
        class230.field3375 = new String[var5.field3638];
        if (arg1 < 8) {
            field2574 = null;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8] instanceof Integer) {
                int var9 = (Integer) var3[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field3415;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field3422;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field3423 == null ? -1 : arg0.field3423.field4083;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field3425;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field3423 == null ? -1 : arg0.field3423.field4145;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field3426 == null ? -1 : arg0.field3426.field4083;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field3426 == null ? -1 : arg0.field3426.field4145;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field3417;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field3424;
                }
                class245.field3607[var6++] = var9;
            } else if (var3[var8] instanceof String) {
                String var10 = (String) var3[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field3414;
                }
                class230.field3375[var7++] = var10;
            }
        }
        class181.method1281(-125, var5, arg2);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1213(byte arg0) {
        field2575 = null;
        if (arg0 >= -8) {
            field2575 = null;
        }
        field2574 = null;
        field2576 = null;
    }
}
