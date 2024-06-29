import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class530 extends class156 {

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field7822;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "[I")
    public static int[] field7821 = new int[1];

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
    public static final void method3127(String[] arg0, short[] arg1, byte arg2) {
        if (arg2 == 25) {
            field7824++;
            class481.method2876(0, arg1, arg0, 2, arg0.length - 1);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIBIII)V")
    public static final void method3128(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class517.method3074(arg5, 22320);
        field7818++;
        int var7 = 0;
        int var8 = arg5 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        if (arg3 > -100) {
            return;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class23.field356[arg1];
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class271.method1736(var16, arg0, arg2 - arg5, -11, var15);
        class271.method1736(var17, arg6, var16, -11, var15);
        class271.method1736(arg2 + arg5, arg0, var17, -11, var15);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class5.field74[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class23.field356[arg1 + var9];
                    int[] var19 = class23.field356[arg1 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class271.method1736(var20, arg0, var21, -11, var18);
                    class271.method1736(var20, arg0, var21, -11, var19);
                } else {
                    int[] var22 = class23.field356[arg1 + var9];
                    int[] var23 = class23.field356[arg1 - var9];
                    int var24 = class5.field74[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class271.method1736(var28, arg0, var26, -11, var22);
                    class271.method1736(var27, arg6, var28, -11, var22);
                    class271.method1736(var25, arg0, var27, -11, var22);
                    class271.method1736(var28, arg0, var26, -11, var23);
                    class271.method1736(var27, arg6, var28, -11, var23);
                    class271.method1736(var25, arg0, var27, -11, var23);
                }
            }
            int[] var29 = class23.field356[arg1 + var7];
            int[] var30 = class23.field356[arg1 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class5.field74[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class271.method1736(var35, arg0, var32, -11, var29);
                class271.method1736(var34, arg6, var35, -11, var29);
                class271.method1736(var31, arg0, var34, -11, var29);
                class271.method1736(var35, arg0, var32, -11, var30);
                class271.method1736(var34, arg6, var35, -11, var30);
                class271.method1736(var31, arg0, var34, -11, var30);
            } else {
                class271.method1736(var31, arg0, var32, -11, var29);
                class271.method1736(var31, arg0, var32, -11, var30);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(Z)V")
    public static void method3129(boolean arg0) {
        if (arg0) {
            field7821 = null;
        }
        field7821 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLns;ILjava/lang/String;)Lvq;")
    public static final class338 method3130(boolean arg0, class438 arg1, int arg2, String arg3) {
        field7820++;
        int var4 = arg1.method2652(arg3, -63);
        if (var4 == -1) {
            return new class338(0);
        }
        int[] var5 = arg1.method2641(var4, 0);
        class338 var6 = new class338(var5.length);
        if (arg2 >= -93) {
            field7821 = null;
        }
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field5354) {
                class91 var9 = new class91(arg1.method2650(var5[var8++], -96, var4));
                int var10 = var9.method626((byte) 100);
                int var11 = var9.method631(10494);
                int var12 = var9.method618((byte) 100);
                if (!arg0 && var12 == 1) {
                    var6.field5354--;
                } else {
                    var6.field5353[var7] = var10;
                    var6.field5358[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)Z")
    public final boolean method1005(boolean arg0) {
        if (arg0) {
            field7819++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ldt;Ljava/lang/Object;I)V")
    public class530(class431 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7822 = arg1;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(ZI)V")
    public static final void method3131(boolean arg0, int arg1) {
        field7817++;
        if (arg0 && class135.field1952 != null) {
            class453.field6657 = class135.field1952.field4833;
        } else {
            class453.field6657 = -1;
        }
        class178.field2537 = null;
        class135.field1952 = null;
        class369.field5668 = 0;
        class217.field3009 = null;
        class135.method888();
        class135.field1967.method1959((byte) 113);
        class135.field1963 = null;
        class219.field3059 = null;
        class413.field6207 = null;
        class270.field3761 = null;
        class149.field2144 = null;
        class145.field2089 = -1;
        class40.field623 = null;
        class233.field3304 = null;
        class162.field2346 = null;
        class499.field7393 = null;
        class276.field3835 = -1;
        class180.field2571 = null;
        class135.field1953.method355(true);
        class135.field1950.method328((byte) 29, 64, arg1);
        class135.field1953.method358((byte) 84, 128, 64);
        class135.field1951.method2032(arg1 ^ 0xFFFF8258, 64);
        class144.field2075.method650(64, 0);
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(IIIIIII)V")
    public static final void method3132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7823++;
        int var7 = class442.field6574;
        class73.field989 = 0;
        int[] var8 = class320.field4896;
        for (int var9 = 0; var9 < (class25.field411 + var7); var9++) {
            class329 var32 = null;
            class337 var33;
            if (var9 >= var7) {
                var33 = class151.field2174[class259.field3609[var9 - var7]];
                var32 = ((class194) var33).field2768;
                if (var32.field5068 != null) {
                    var32 = var32.method2125(class36.field583, false);
                    if (var32 == null) {
                        continue;
                    }
                }
            } else {
                var33 = class439.field6539[var8[var9]];
            }
            if (var33.field5249 >= 0 && (class527.field7787 == var33.field5251 || class339.field5365.field2210 == var33.field2210)) {
                class104.method702(arg3, arg2 >> 1, var33, arg6 >> 1, arg1, var33.method1372(-116), 12407);
                if (class470.field6872[0] >= 0) {
                    if (var33.field5327 != null && (var9 >= var7 || class44.field654 == 0 || class44.field654 == 3 || class44.field654 == 1 && class377.method2344(((class322) var33).field4947, 0)) && class73.field989 < class260.field3627) {
                        class260.field3630[class73.field989] = class472.field6901.method45(var33.field5327, (byte) -74) / 2;
                        class260.field3624[class73.field989] = class470.field6872[0];
                        class260.field3625[class73.field989] = class470.field6872[1];
                        class260.field3631[class73.field989] = var33.field5272;
                        class260.field3622[class73.field989] = var33.field5328;
                        class260.field3626[class73.field989] = var33.field5318;
                        class260.field3623[class73.field989] = var33.field5327;
                        class73.field989++;
                    }
                    int var34 = class470.field6872[1] + arg4;
                    int var45;
                    if (var33.field5310 || var33.field5303 <= class405.field6116) {
                        var45 = var34 - Math.max(class472.field6901.field58, class63.field892[0].method214());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var37;
                        if (var7 <= var9) {
                            var37 = var32.field5105;
                            if (var37 == -1) {
                                var37 = var33.method2181(0).field3045;
                            }
                        } else {
                            class322 var38 = class439.field6539[var8[var9]];
                            var37 = var33.method2181(0).field3045;
                            if (var38.field4978) {
                                var36 = 2;
                            }
                        }
                        class191[] var39 = class63.field892;
                        if (var37 != -1) {
                            class191[] var40 = (class191[]) class224.field3158.method1013((long) var37, (byte) -106);
                            if (var40 == null) {
                                class476[] var41 = class476.method2847(class113.field1576, var37, 0);
                                if (var41 != null) {
                                    var40 = new class191[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class337.field5242.method1117(var41[var42], true);
                                    }
                                    class224.field3158.method1012(-61, (long) var37, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class191 var43 = var39[0];
                        class191 var44 = var39[var36];
                        var45 = var34 - Math.max(class472.field6901.field58, var43.method214());
                        int var46 = class470.field6872[0] + arg5 - (var43.method220() >> 1);
                        int var47 = var43.method220() * var33.field5268 / 255;
                        if (var33.field5268 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method1332(var46, var45);
                        class337.field5242.method1110(var46, var45, var46 + var47, var45 + var43.method214());
                        var44.method1332(var46, var45);
                        class337.field5242.method1046(arg5, arg4, arg2 + arg5, arg4 - -arg6);
                    }
                    var45 -= 2;
                    if (!var33.field5310) {
                        if (var33.field5283 > class405.field6116) {
                            class191 var48 = class494.field7231[var33.field5274 ? 2 : 0];
                            class191 var49 = class494.field7231[var33.field5274 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class194)) {
                                var51 = var32.field5041;
                                if (var51 == -1) {
                                    var51 = var33.method2181(0).field3029;
                                }
                            } else {
                                var51 = var33.method2181(0).field3029;
                            }
                            if (var51 != -1) {
                                class191[] var52 = (class191[]) class302.field4450.method1013((long) var51, (byte) -106);
                                if (var52 == null) {
                                    class476[] var53 = class476.method2847(class113.field1576, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class191[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class337.field5242.method1117(var53[var54], true);
                                        }
                                        class302.field4450.method1012(-70, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field5274 ? 2 : 0];
                                    var49 = var52[var33.field5274 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field5283 - class405.field6116;
                            int var56;
                            if (var55 <= var33.field5271) {
                                var56 = var48.method220();
                            } else {
                                int var57 = var55 - var33.field5271;
                                int var58 = var33.field5324 == 0 ? 0 : (var33.field5275 - var57) / var33.field5324 * var33.field5324;
                                var56 = var48.method220() * var58 / var33.field5275;
                            }
                            int var59 = var48.method214();
                            var45 -= var59;
                            int var60 = arg5 + class470.field6872[0] - (var48.method220() >> 1);
                            var48.method1332(var60, var45);
                            class337.field5242.method1110(var60, var45, var56 + var60, var45 + var59);
                            var49.method1332(var60, var45);
                            var45 -= 2;
                            class337.field5242.method1046(arg5, arg4, arg2 + arg5, arg4 + arg6);
                        }
                        if (var9 < var7) {
                            class322 var61 = (class322) var33;
                            if (var61.field4973 != -1) {
                                var45 -= 25;
                                class439.field6538[var61.field4973].method1332(arg5 + class470.field6872[0] - 12, var45);
                                var45 -= 2;
                            }
                            if (var61.field4972 != -1) {
                                var45 -= 25;
                                class331.field5127[var61.field4972].method1332(class470.field6872[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field5051 >= 0 && var32.field5051 < class331.field5127.length) {
                            var45 -= 25;
                            class191 var62 = class331.field5127[var32.field5051];
                            var62.method1332(class470.field6872[0] + (arg5 - (var62.method220() >> 1)), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var33 instanceof class322)) {
                        int var63 = 0;
                        class187[] var64 = class463.field6771;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class187 var67 = var64[var65];
                            if (var67 != null && var67.field2631 == 1 && class259.field3609[var9 - var7] == var67.field2626) {
                                class191 var68 = class483.field7036[var67.field2629];
                                if (var63 < var68.method214()) {
                                    var63 = var68.method214();
                                }
                                if (class405.field6116 % 20 < 10) {
                                    var68.method1332(class470.field6872[0] + arg5 - 12, -var68.method214() + var45);
                                }
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var69 = 0;
                        class187[] var70 = class463.field6771;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class187 var73 = var70[var71];
                            if (var73 != null && var73.field2631 == 10 && var8[var9] == var73.field2626) {
                                class191 var74 = class483.field7036[var73.field2629];
                                if (var69 < var74.method214()) {
                                    var69 = var74.method214();
                                }
                                var74.method1332(class470.field6872[0] + arg5 - 12, -var74.method214() + var45);
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    }
                    for (int var75 = 0; var75 < 4; var75++) {
                        if (var33.field5263[var75] > class405.field6116) {
                            int var76 = var33.method1372(arg0 ^ 0xFFFFFFA9) / 2;
                            class104.method702(arg3, arg2 >> 1, var33, arg6 >> 1, arg1, var76, 12407);
                            if (class470.field6872[0] > -1) {
                                if (var75 == 1) {
                                    class470.field6872[1] -= 20;
                                }
                                if (var75 == 2) {
                                    class470.field6872[0] -= 15;
                                    class470.field6872[1] -= 10;
                                }
                                if (var75 == 3) {
                                    class470.field6872[0] += 15;
                                    class470.field6872[1] -= 10;
                                }
                                class414.field6216[var33.field5293[var75]].method1332(class470.field6872[0] + arg5 - 12, class470.field6872[1] + -12 + arg4);
                                class23.field349.method239(0, arg0 ^ 0x3742, Integer.toString(var33.field5247[var75]), -1, arg5 + class470.field6872[0] - 1, class470.field6872[1] + arg4 + 3);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class149.field2142; var10++) {
            int var28 = class101.field1452[var10];
            class337 var29;
            if (var28 < 2048) {
                var29 = class439.field6539[var28];
            } else {
                var29 = class151.field2174[var28 - 2048];
            }
            int var30 = class8.field124[var10];
            class337 var31;
            if (var30 >= 2048) {
                var31 = class151.field2174[var30 - 2048];
            } else {
                var31 = class439.field6539[var30];
            }
            class383.method2374(arg2, arg3, arg6, arg4, --var29.field5307, (byte) 122, arg1, var29, arg5, var31);
        }
        int var11 = class472.field6901.field58 + class472.field6901.field44 + arg0;
        for (int var12 = 0; var12 < class73.field989; var12++) {
            int var13 = class260.field3624[var12];
            int var14 = class260.field3625[var12];
            int var15 = class260.field3630[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class260.field3625[var27] - var11 < var14 + 2 && (class260.field3625[var27] + 2) > (var14 - var11) && (var13 - var15) < (class260.field3624[var27] + class260.field3630[var27]) && (class260.field3624[var27] - class260.field3630[var27]) < (var13 + var15) && var14 > (class260.field3625[var27] - var11)) {
                        var14 = class260.field3625[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class260.field3625[var12] = var14;
            String var17 = class260.field3623[var12];
            if (class77.field1064 == 0) {
                int var18 = 16776960;
                if (class260.field3631[var12] < 6) {
                    var18 = class217.field3017[class260.field3631[var12]];
                }
                if (class260.field3631[var12] == 6) {
                    var18 = (class527.field7787 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class260.field3631[var12] == 7) {
                    var18 = class527.field7787 % 20 >= 10 ? 65535 : 255;
                }
                if (class260.field3631[var12] == 8) {
                    var18 = (class527.field7787 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class260.field3631[var12] == 9) {
                    int var19 = 150 - class260.field3626[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 + 16384000 - (var19 * 327680);
                    } else if (var19 < 150) {
                        var18 = ((var19 - 100) * 5) + 65280;
                    }
                }
                if (class260.field3631[var12] == 10) {
                    int var20 = 150 - class260.field3626[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 500 + 255 - (var20 * 5);
                    }
                }
                if (class260.field3631[var12] == 11) {
                    int var21 = 150 - class260.field3626[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = 65280 - (16384250 - (var21 * 327685));
                    } else if (var21 < 150) {
                        var18 = 16777215 + 32768000 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class260.field3622[var12] == 0) {
                    class104.field1497.method239(-16777216, arg0 + 14142, var17, var22, arg5 + var13, arg4 + var14);
                }
                if (class260.field3622[var12] == 1) {
                    class104.field1497.method238(-16777216, 2, class527.field7787, var22, arg5 + var13, var17, arg4 + var14);
                }
                if (class260.field3622[var12] == 2) {
                    class104.field1497.method251(class527.field7787, var17, (byte) 40, var22, arg5 + var13, arg4 + var14, -16777216);
                }
                if (class260.field3622[var12] == 3) {
                    class104.field1497.method254(var22, arg5 + var13, -class260.field3626[var12] + 150, var17, class527.field7787, -16777216, true, arg4 + var14);
                }
                if (class260.field3622[var12] == 4) {
                    int var23 = (150 - class260.field3626[var12]) * (class472.field6901.method45(var17, (byte) -115) + 100) / 150;
                    class337.field5242.method1110(var13 + arg5 - 50, arg4, var13 + arg5 + 50, arg4 + arg6);
                    class104.field1497.method235(var17, var22, arg5 + var13 + 50 - var23, -16777216, arg0 + 29449, arg4 + var14);
                    class337.field5242.method1046(arg5, arg4, arg5 + arg2, arg4 + arg6);
                }
                if (class260.field3622[var12] == 5) {
                    int var24 = 150 - class260.field3626[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class472.field6901.field58 + class472.field6901.field44;
                    class337.field5242.method1110(arg5, arg4 - (var26 - var14) - 1, arg2 + arg5, arg4 - (-var14 - 5));
                    class104.field1497.method239(-16777216, 14144, var17, var22, arg5 + var13, arg4 + var14 - -var25);
                    class337.field5242.method1046(arg5, arg4, arg2 + arg5, arg4 + arg6);
                }
            } else {
                class104.field1497.method239(-16777216, 14144, var17, -256, arg5 + var13, arg4 + var14);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1006(byte arg0) {
        if (arg0 != 2) {
            this.field7822 = null;
        }
        field7816++;
        return this.field7822;
    }
}
