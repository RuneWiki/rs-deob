import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class9 extends RuntimeException {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field124;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "Ljava/lang/String;")
    public String field131;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Ll;")
    public static class66 field125 = new class66(50);

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field127 = new String[1000];

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Z")
    public static boolean field130 = false;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field133 = "Hidden";

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Ll;")
    public static class66 field129 = new class66(64);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBIIIII)I", line = 7)
    public static final int method95(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
        }
        int var8 = arg0 & 0x3;
        field122++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var8 == 2) {
            return -arg3 - (arg2 - 8);
        } else if (arg1 >= -48) {
            return -63;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 43)
    public static void method96(int arg0) {
        field127 = null;
        field125 = null;
        int var1 = 24 / ((30 - arg0) / 51);
        field129 = null;
        field133 = null;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 59)
    public static final void method97(int arg0) {
        if (class186.field2932 > 0) {
            class186.field2932--;
        }
        field128++;
        if (class206.field3175 > 1) {
            class206.field3175--;
            class305.field4738 = class327.field5030;
        }
        if (class287.field4452) {
            class287.field4452 = false;
            class184.method1423((byte) 121);
            return;
        }
        for (int var1 = 0; var1 < 100 && class165.method1310((byte) -92); var1++) {
        }
        if (class295.field4578 != 30) {
            return;
        }
        class3.method31(class99.field1491, (byte) 83, 57);
        Object var2 = class105.field1583.field4754;
        synchronized (class105.field1583.field4754) {
            if (!class321.field4949) {
                class105.field1583.field4758 = 0;
            } else if (class86.field1230 != 0 || class105.field1583.field4758 >= 40) {
                class99.field1491.method1628((byte) -22, 163);
                class63.field968++;
                class99.field1491.method273(0, 0);
                int var3 = class99.field1491.field397;
                int var4 = 0;
                for (int var5 = 0; class105.field1583.field4758 > var5 && class99.field1491.field397 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class105.field1583.field4759[var5];
                    int var7 = class105.field1583.field4757[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (class105.field1583.field4759[var5] == -1 && class105.field1583.field4757[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class123.field1980 != var7 || class326.field5013 != var6) {
                        int var9 = var7 - class123.field1980;
                        class123.field1980 = var7;
                        int var10 = var6 - class326.field5013;
                        class326.field5013 = var6;
                        if (class14.field232 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class99.field1491.method304(false, (class14.field232 << 12) + (var9 << 6) + var10);
                            class14.field232 = 0;
                        } else if (class14.field232 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class99.field1491.method273(arg0 ^ 0x1, class14.field232 + 128);
                            var9 += 128;
                            var10 += 128;
                            class99.field1491.method304(false, (var9 << 8) + var10);
                            class14.field232 = 0;
                        } else if (class14.field232 < 32) {
                            class99.field1491.method273(0, class14.field232 + 192);
                            if (var8) {
                                class99.field1491.method310(arg0 + 105, Integer.MIN_VALUE);
                            } else {
                                class99.field1491.method310(74, var6 << 16 | var7);
                            }
                            class14.field232 = 0;
                        } else {
                            class99.field1491.method304(false, class14.field232 + 57344);
                            if (var8) {
                                class99.field1491.method310(100, Integer.MIN_VALUE);
                            } else {
                                class99.field1491.method310(44, var6 << 16 | var7);
                            }
                            class14.field232 = 0;
                        }
                    } else if (class14.field232 < 2047) {
                        class14.field232++;
                    }
                }
                class99.field1491.method302(class99.field1491.field397 - var3, -122);
                if (class105.field1583.field4758 <= var4) {
                    class105.field1583.field4758 = 0;
                } else {
                    class105.field1583.field4758 -= var4;
                    for (int var11 = 0; var11 < class105.field1583.field4758; var11++) {
                        class105.field1583.field4757[var11] = class105.field1583.field4757[var11 + var4];
                        class105.field1583.field4759[var11] = class105.field1583.field4759[var4 + var11];
                    }
                }
            }
        }
        if (class86.field1230 != 0) {
            class209.field3216++;
            long var13 = (class157.field2522 - class236.field3678) / 50L;
            class236.field3678 = class157.field2522;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class254.field3916;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class305.field4745;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class86.field1230 == 2) {
                var17 = 1;
            }
            int var18 = (int) var13;
            class99.field1491.method1628((byte) -20, 244);
            class99.field1491.method304(false, var17 << 15 | var18);
            class99.field1491.method310(43, var15 << 16 | var16);
        }
        if (class115.field1765 > 0) {
            class115.field1765--;
        }
        if (class78.field1138 && class115.field1765 <= 0) {
            class78.field1138 = false;
            class115.field1765 = 20;
            class99.field1491.method1628((byte) -100, 101);
            class99.field1491.method263((int) class279.field4312, false);
            class324.field4981++;
            class99.field1491.method304(false, (int) class313.field4846);
        }
        if (class64.field985 && !class29.field467) {
            class34.field517++;
            class29.field467 = true;
            class99.field1491.method1628((byte) -108, 51);
            class99.field1491.method273(0, 1);
        }
        if (!class64.field985 && class29.field467) {
            class29.field467 = false;
            class99.field1491.method1628((byte) -8, 51);
            class99.field1491.method273(0, 0);
            class34.field517++;
        }
        if (!class258.field3951) {
            class230.field3597++;
            class99.field1491.method1628((byte) -23, 12);
            class99.field1491.method310(63, class98.method865(arg0 ^ 0x628A00D4));
            class258.field3951 = true;
        }
        if (class20.field321) {
            class20.field321 = false;
        } else {
            class101.field1531 /= 2.0F;
        }
        if (class261.field4005) {
            class261.field4005 = false;
        } else {
            class121.field1935 /= 2.0F;
        }
        class168.method1338(127);
        if (class295.field4578 != 30) {
            return;
        }
        class108.method944(arg0 ^ arg0);
        class340.method2389(-119);
        class263.method1946((byte) -120);
        class174.field2764++;
        if (class174.field2764 > 750) {
            class184.method1423((byte) 122);
            return;
        }
        class276.method2026(-80);
        class270.method1984(arg0 ^ 0xFFFFF368);
        class339.method2383(-24717);
        for (int var19 = class360.method2525((byte) -72, true); var19 != -1; var19 = class360.method2525((byte) -72, false)) {
            class286.method2069(arg0 ^ 0x2E, var19);
            class104.field1574[class301.method2169(class238.field3695++, 31)] = var19;
        }
        for (class138 var20 = class116.method999((byte) -48); var20 != null; var20 = class116.method999((byte) -48)) {
            int var21 = var20.method1150(255);
            int var22 = var20.method1154(-3);
            if (var21 == 1) {
                class10.field134[var22] = var20.field2282;
                class335.field5126[class301.method2169(31, class224.field3505++)] = var22;
            } else if (var21 == 2) {
                class93.field1416[var22] = var20.field2291;
                class99.field1495[class301.method2169(class10.field144++, 31)] = var22;
            } else if (var21 == 3) {
                class342 var44 = class355.method2497(0, var22);
                if (!var20.field2291.equals(var44.field5265)) {
                    var44.field5265 = var20.field2291;
                    class339.method2380(var44, 119);
                }
            } else if (var21 == 4) {
                class342 var23 = class355.method2497(0, var22);
                int var24 = var20.field2282;
                int var25 = var20.field2293;
                int var26 = var20.field2287;
                if (var23.field5311 != var24 || var23.field5441 != var25 || var23.field5363 != var26) {
                    var23.field5363 = var26;
                    var23.field5441 = var25;
                    var23.field5311 = var24;
                    class339.method2380(var23, 105);
                }
            } else if (var21 == 5) {
                class342 var43 = class355.method2497(0, var22);
                if (var20.field2282 != var43.field5440 || var20.field2282 == -1) {
                    var43.field5364 = 1;
                    var43.field5361 = 0;
                    var43.field5310 = 0;
                    var43.field5440 = var20.field2282;
                    class339.method2380(var43, 104);
                }
            } else if (var21 == 6) {
                int var27 = var20.field2282;
                int var28 = var27 >> 10 & 0x1F;
                int var29 = var27 & 0x1F;
                int var30 = (var27 & 0x3EE) >> 5;
                int var31 = (var28 << 19) - (-(var29 << 3) - (var30 << 11));
                class342 var32 = class355.method2497(0, var22);
                if (var32.field5277 != var31) {
                    var32.field5277 = var31;
                    class339.method2380(var32, 111);
                }
            } else if (var21 == 7) {
                class342 var41 = class355.method2497(0, var22);
                boolean var42 = var20.field2282 == 1;
                if (var41.field5384 != var42) {
                    var41.field5384 = var42;
                    class339.method2380(var41, arg0 ^ 0x6E);
                }
            } else if (var21 == 8) {
                class342 var40 = class355.method2497(arg0 ^ 0x1, var22);
                if (var20.field2282 != var40.field5299 || var20.field2293 != var40.field5435 || var20.field2287 != var40.field5288) {
                    var40.field5435 = var20.field2293;
                    var40.field5288 = var20.field2287;
                    var40.field5299 = var20.field2282;
                    if (var40.field5399 != -1) {
                        if (var40.field5443 > 0) {
                            var40.field5288 = var40.field5288 * 32 / var40.field5443;
                        } else if (var40.field5355 > 0) {
                            var40.field5288 = var40.field5288 * 32 / var40.field5355;
                        }
                    }
                    class339.method2380(var40, 121);
                }
            } else if (var21 == 9) {
                class342 var33 = class355.method2497(0, var22);
                if (var20.field2282 != var33.field5399 || var20.field2293 != var33.field5425) {
                    var33.field5425 = var20.field2293;
                    var33.field5399 = var20.field2282;
                    class339.method2380(var33, 109);
                }
            } else if (var21 == 10) {
                class342 var39 = class355.method2497(0, var22);
                if (var20.field2282 != var39.field5289 || var20.field2293 != var39.field5303 || var20.field2287 != var39.field5381) {
                    var39.field5303 = var20.field2293;
                    var39.field5289 = var20.field2282;
                    var39.field5381 = var20.field2287;
                    class339.method2380(var39, 113);
                }
            } else if (var21 == 11) {
                class342 var38 = class355.method2497(arg0 ^ 0x1, var22);
                var38.field5376 = 0;
                var38.field5300 = var38.field5342 = var20.field2293;
                var38.field5350 = var38.field5315 = var20.field2282;
                var38.field5301 = 0;
                class339.method2380(var38, 106);
            } else if (var21 == 12) {
                class342 var36 = class355.method2497(0, var22);
                int var37 = var20.field2282;
                if (var36 != null && var36.field5279 == 0) {
                    if (var36.field5264 - var36.field5339 < var37) {
                        var37 = var36.field5264 - var36.field5339;
                    }
                    if (var37 < 0) {
                        var37 = 0;
                    }
                    if (var36.field5334 != var37) {
                        var36.field5334 = var37;
                        class339.method2380(var36, arg0 ^ 0x6F);
                    }
                }
            } else if (var21 == 13) {
                class342 var34 = class355.method2497(0, var22);
                var34.field5368 = var20.field2282;
            } else if (var21 == 14) {
                class342 var35 = class355.method2497(0, var22);
                var35.field5371 = var20.field2282;
            }
        }
        if (class317.field4884 != 0) {
            class321.field4943 += 20;
            if (class321.field4943 >= 400) {
                class317.field4884 = 0;
            }
        }
        class247.field3840++;
        if (class128.field2134 != null) {
            class281.field4353++;
            if (class281.field4353 >= 15) {
                class339.method2380(class128.field2134, arg0 ^ 0x7F);
                class128.field2134 = null;
            }
        }
        if (class212.field3283 != null) {
            class339.method2380(class212.field3283, arg0 ^ 0x73);
            class31.field490++;
            if ((class283.field4383 + 5) < class268.field4137 || class268.field4137 < (class283.field4383 - 5) || (class115.field1770 + 5) < class78.field1129 || class78.field1129 < class115.field1770 - 5) {
                class277.field4282 = true;
            }
            if (class210.field3242 == 0) {
                if (class277.field4282 && class31.field490 >= 5) {
                    if (class99.field1496 == class212.field3283 && class42.field664 != class206.field3176) {
                        byte var45 = 0;
                        class164.field2609++;
                        class342 var46 = class212.field3283;
                        if (class363.field5745 == 1 && var46.field5427 == 206) {
                            var45 = 1;
                        }
                        if (var46.field5280[class206.field3176] <= 0) {
                            var45 = 0;
                        }
                        if (client.method1022(var46).method1693(-94)) {
                            int var47 = class42.field664;
                            int var48 = class206.field3176;
                            var46.field5280[var48] = var46.field5280[var47];
                            var46.field5344[var48] = var46.field5344[var47];
                            var46.field5280[var47] = -1;
                            var46.field5344[var47] = 0;
                        } else if (var45 == 1) {
                            int var49 = class42.field664;
                            int var50 = class206.field3176;
                            while (var49 != var50) {
                                if (var49 > var50) {
                                    var46.method2403(var49 - 1, arg0 ^ 0x4115, var49);
                                    var49--;
                                } else if (var49 < var50) {
                                    var46.method2403(var49 + 1, 16660, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var46.method2403(class206.field3176, arg0 + 16659, class42.field664);
                        }
                        class99.field1491.method1628((byte) -45, 44);
                        class99.field1491.method258(class206.field3176, (byte) 78);
                        class99.field1491.method315(class212.field3283.field5433, arg0 ^ 0x68);
                        class99.field1491.method258(class42.field664, (byte) 78);
                        class99.field1491.method285(0, var45);
                    }
                } else if ((class120.field1865 == 1 || class350.method2457(false, class66.field1006 - 1)) && class66.field1006 > 2) {
                    class10.method103(25);
                } else if (class66.field1006 > 0) {
                    class57.method570(29311);
                }
                class281.field4353 = 10;
                class86.field1230 = 0;
                class212.field3283 = null;
            }
        }
        class297.field4619 = null;
        class342 var51 = class53.field804;
        class53.field804 = null;
        class58.field910 = 0;
        class62.field955 = false;
        class342 var52 = class355.field5654;
        class355.field5654 = null;
        class215.field3361 = false;
        while (class23.method238((byte) -21) && class58.field910 < 128) {
            class166.field2644[class58.field910] = class328.field5043;
            class362.field5742[class58.field910] = class209.field3221;
            class58.field910++;
        }
        class122.field1950 = null;
        if (class164.field2604 != -1) {
            class31.method334(class164.field2604, 0, (byte) 103, 0, class362.field5740, class126.field2113, 0, 0);
        }
        class327.field5030++;
        if (class122.field1950 != null) {
            class352.method2485(-1);
        }
        while (true) {
            class112 var53;
            class342 var54;
            class342 var55;
            do {
                var53 = (class112) class276.field4272.method2242((byte) -119);
                if (var53 == null) {
                    while (true) {
                        class112 var56;
                        class342 var57;
                        class342 var58;
                        do {
                            var56 = (class112) class126.field2106.method2242((byte) -116);
                            if (var56 == null) {
                                while (true) {
                                    class112 var59;
                                    class342 var60;
                                    class342 var61;
                                    do {
                                        var59 = (class112) class197.field3073.method2242((byte) 44);
                                        if (var59 == null) {
                                            if (class122.field1950 == null) {
                                                class133.field2228 = 0;
                                            }
                                            if (class256.field3937 != null) {
                                                class76.method699(-3);
                                            }
                                            if (class270.field4168 > 0 && class116.field1774[82] && class116.field1774[81] && class283.field4382 != 0) {
                                                int var62 = class119.field1826 - class283.field4382;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class271.method1988(var62, arg0 + 62, class49.field755 - -class173.field2746.field1290[0], class173.field2746.field1300[0] + class358.field5696);
                                            }
                                            if (class270.field4168 > 0 && class116.field1774[82] && class116.field1774[81]) {
                                                if (class282.field4366 != -1) {
                                                    class271.method1988(class119.field1826, 63, class49.field755 + class274.field4254, class358.field5696 + class282.field4366);
                                                }
                                                class37.field574 = 0;
                                                class288.field4469 = 0;
                                            } else if (class288.field4469 == 2) {
                                                if (class282.field4366 != -1) {
                                                    class286.field4439++;
                                                    class99.field1491.method1628((byte) -127, 7);
                                                    class99.field1491.method304(false, class358.field5696 + class282.field4366);
                                                    class99.field1491.method315(class259.field3969, 123);
                                                    class99.field1491.method263(class49.field755 + class274.field4254, false);
                                                    class99.field1491.method263(class270.field4155, false);
                                                    class204.field3155 = class254.field3916;
                                                    class315.field4867 = class305.field4745;
                                                    class317.field4884 = 1;
                                                    class321.field4943 = 0;
                                                }
                                                class288.field4469 = 0;
                                            } else if (class37.field574 == 2) {
                                                if (class282.field4366 != -1) {
                                                    class99.field1491.method1628((byte) -55, 47);
                                                    class283.field4379++;
                                                    class99.field1491.method263(class358.field5696 + class282.field4366, false);
                                                    class99.field1491.method306(class49.field755 + class274.field4254, 126);
                                                    class321.field4943 = 0;
                                                    class317.field4884 = 1;
                                                    class315.field4867 = class305.field4745;
                                                    class204.field3155 = class254.field3916;
                                                }
                                                class37.field574 = 0;
                                            } else if (class282.field4366 != -1 && class288.field4469 == 0 && class37.field574 == 0) {
                                                int var63 = (class282.field4366 << 1) + 1 - class173.field2746.method808(114) >> 1;
                                                int var64 = (class274.field4254 << 1) - (class173.field2746.method808(arg0 + 84) - 1) >> 1;
                                                class50.method480(var64, 0, var63, -98);
                                                class315.field4867 = class305.field4745;
                                                class317.field4884 = 1;
                                                class204.field3155 = class254.field3916;
                                                class321.field4943 = 0;
                                                class191.method1461(true, class173.field2746.field1300[0], 0, 0, 0, class173.field2746.field1290[0], var63, 0, 0, var64, (byte) -69);
                                            }
                                            class282.field4366 = -1;
                                            class113.method971((byte) 29);
                                            if (class53.field804 != var51) {
                                                if (var51 != null) {
                                                    class339.method2380(var51, arg0 ^ 0x75);
                                                }
                                                if (class53.field804 != null) {
                                                    class339.method2380(class53.field804, arg0 + 121);
                                                }
                                            }
                                            if (class355.field5654 != var52 && class210.field3241 == class199.field3093) {
                                                if (var52 != null) {
                                                    class339.method2380(var52, 109);
                                                }
                                                if (class355.field5654 != null) {
                                                    class339.method2380(class355.field5654, 121);
                                                }
                                            }
                                            if (class355.field5654 == null) {
                                                if (class199.field3093 > 0) {
                                                    class199.field3093--;
                                                }
                                            } else if (class210.field3241 > class199.field3093) {
                                                class199.field3093++;
                                                if (class210.field3241 == class199.field3093) {
                                                    class339.method2380(class355.field5654, 123);
                                                }
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class239.field3718[var65]++;
                                            }
                                            int var66 = class45.method452(arg0 ^ 0xFFFFFFFE);
                                            int var67 = class188.method1442(arg0 ^ 0x0);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class186.field2932 = 250;
                                                class249.method1861(14500, arg0 ^ 0x559D);
                                                class99.field1491.method1628((byte) -121, 160);
                                                class296.field4591++;
                                            }
                                            if (class74.field1097 != null && class74.field1097.field1447 == 1) {
                                                if (class74.field1097.field1446 != null) {
                                                    class33.method343(class58.field912, 0, class62.field954);
                                                }
                                                class58.field912 = null;
                                                class74.field1097 = null;
                                                class62.field954 = false;
                                            }
                                            class345.field5499++;
                                            class59.field926++;
                                            class172.field2733++;
                                            if (class59.field926 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class46.field739 += class25.field413;
                                                }
                                                class59.field926 = 0;
                                                if ((var68 & 0x4) == 4) {
                                                    class106.field1592 += class310.field4794;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class202.field3127 += class113.field1726;
                                                }
                                            }
                                            if (class46.field739 < -50) {
                                                class25.field413 = 2;
                                            }
                                            if (class345.field5499 > 500) {
                                                class345.field5499 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x2) == 2) {
                                                    class236.field3676 += class76.field1113;
                                                }
                                                if ((var69 & 0x1) == 1) {
                                                    class290.field4513 += class222.field3452;
                                                }
                                            }
                                            if (class290.field4513 < -60) {
                                                class222.field3452 = 2;
                                            }
                                            if (class106.field1592 < -40) {
                                                class310.field4794 = 1;
                                            }
                                            if (class202.field3127 < -55) {
                                                class113.field1726 = 2;
                                            }
                                            if (class202.field3127 > 55) {
                                                class113.field1726 = -2;
                                            }
                                            if (class236.field3676 < -20) {
                                                class76.field1113 = 1;
                                            }
                                            if (class290.field4513 > 60) {
                                                class222.field3452 = -2;
                                            }
                                            if (class236.field3676 > 10) {
                                                class76.field1113 = -1;
                                            }
                                            if (class106.field1592 > 40) {
                                                class310.field4794 = -1;
                                            }
                                            if (class46.field739 > 50) {
                                                class25.field413 = -2;
                                            }
                                            if (class172.field2733 > 50) {
                                                class99.field1491.method1628((byte) -84, 5);
                                                class187.field2938++;
                                            }
                                            if (class221.field3438) {
                                                class71.method680((byte) -66);
                                                class221.field3438 = false;
                                            }
                                            try {
                                                if (class188.field2950 != null && class99.field1491.field397 > 0) {
                                                    class188.field2950.method2426(0, -28332, class99.field1491.field448, class99.field1491.field397);
                                                    class172.field2733 = 0;
                                                    class99.field1491.field397 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class184.method1423((byte) 120);
                                            }
                                            return;
                                        }
                                        var60 = var59.field1706;
                                        if (var60.field5380 < 0) {
                                            break;
                                        }
                                        var61 = class355.method2497(arg0 - 1, var60.field5296);
                                    } while (var61 == null || var61.field5312 == null || var60.field5380 >= var61.field5312.length || var61.field5312[var60.field5380] != var60);
                                    class160.method1288((byte) -45, var59);
                                }
                            }
                            var57 = var56.field1706;
                            if (var57.field5380 < 0) {
                                break;
                            }
                            var58 = class355.method2497(0, var57.field5296);
                        } while (var58 == null || var58.field5312 == null || var57.field5380 >= var58.field5312.length || var58.field5312[var57.field5380] != var57);
                        class160.method1288((byte) -45, var56);
                    }
                }
                var54 = var53.field1706;
                if (var54.field5380 < 0) {
                    break;
                }
                var55 = class355.method2497(0, var54.field5296);
            } while (var55 == null || var55.field5312 == null || var55.field5312.length <= var54.field5380 || var55.field5312[var54.field5380] != var54);
            class160.method1288((byte) -45, var53);
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 1064)
    public static final void method98(int arg0) {
        class264.field4101.method655(-1);
        class53.field801.method655(-1);
        class184.field2891.method655(-1);
        field126++;
        if (arg0 > -126) {
            field127 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;II[B)I", line = 1088)
    public static final int method99(int arg0, int arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        field123++;
        int var6 = arg0 - arg1;
        for (int var7 = arg3; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg4 + var7] = -97;
            } else {
                arg5[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 1228)
    public class9(Throwable arg0, String arg1) {
        this.field124 = arg0;
        this.field131 = arg1;
    }
}
