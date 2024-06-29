import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class232 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Lki;")
    public static class364 field3103 = new class364();

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public int field3105;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lbb;")
    public static class196 field3109;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1470(boolean arg0, int arg1) {
        class629.field8778++;
        field3101++;
        class11 var2 = class130.method931(class649.field9035, (byte) 54, class284.field3691);
        class100.method760(var2, 37);
        if (arg1 != 0) {
            method1471((byte) 56);
        }
        for (class270 var3 = (class270) class700.field9763.method42((byte) 63); var3 != null; var3 = (class270) class700.field9763.method40(false)) {
            if (!var3.method2440(32)) {
                var3 = (class270) class700.field9763.method42((byte) 70);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field3591 == 0) {
                class298.method1764(arg0, -87, true, var3);
            }
        }
        if (class357.field4636 != null) {
            class386.method2199(class357.field4636, false);
            class357.field4636 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 52)
    public static final void method1471(byte arg0) {
        field3107++;
        if (class112.field1466 > 1) {
            class112.field1466--;
            class149.field1924 = class166.field2089;
        }
        if (class185.field2364) {
            class185.field2364 = false;
            class119.method898((byte) 112);
            return;
        }
        if (!class594.field8025) {
            class382.method2178((byte) -79);
        }
        for (int var1 = 0; var1 < 100 && class612.method3318(true); var1++) {
        }
        if (class566.field7391 != 10) {
            return;
        }
        while (class240.method1516(0)) {
            class11 var2 = class130.method931(class649.field9035, (byte) 54, class507.field6660);
            var2.field114.method2352(true, 0);
            int var3 = var2.field114.field5367;
            class473.method2616(var2.field114, (byte) -21);
            var2.field114.method2357(var2.field114.field5367 - var3, false);
            class100.method760(var2, -128);
        }
        if (class268.field3583 == null) {
            if (class584.method3191(1) >= class363.field4686) {
                class268.field3583 = class433.field5585.method3303(class423.field5473.field3543, (byte) 28);
            }
        } else if (class268.field3583.field2672 != -1) {
            class11 var4 = class130.method931(class649.field9035, (byte) 54, class440.field5679);
            var4.field114.method2386(class268.field3583.field2672, 1103587288);
            class100.method760(var4, -114);
            class268.field3583 = null;
            class363.field4686 = class584.method3191(1) + 30000L;
        }
        class252 var5 = (class252) class700.field9768.method2090(true);
        if (var5 != null || class258.field3475 < (class584.method3191(1) - 2000L)) {
            class11 var6 = null;
            int var7 = 0;
            for (class252 var8 = (class252) class650.field9051.method2090(true); var8 != null && (var6 == null || (var6.field114.field5367 - var7) < 240); var8 = (class252) class650.field9051.method2088(-152)) {
                var8.method2438((byte) 117);
                int var9 = var8.method320(-109);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method323(-5);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class178.field2212 != var10 || class639.field8893 != var9) {
                    if (var6 == null) {
                        class151.field1932++;
                        var6 = class130.method931(class649.field9035, (byte) 54, class631.field8796);
                        var6.field114.method2352(true, 0);
                        var7 = var6.field114.field5367;
                    }
                    int var11 = var10 - class178.field2212;
                    class178.field2212 = var10;
                    int var12 = var9 - class639.field8893;
                    class639.field8893 = var9;
                    int var13 = (int) ((var8.method322(109) - class258.field3475) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field114.method2386((var13 << 12) - (-(var11 << 6) - var12), 1103587288);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field114.method2352(true, var13 + 128);
                        var12 += 128;
                        var11 += 128;
                        var6.field114.method2386((var11 << 8) + var12, 1103587288);
                    } else if (var13 >= 32) {
                        var6.field114.method2386(var13 + 57344, 1103587288);
                        if (var10 == 1 || var9 == -1) {
                            var6.field114.method2353(Integer.MIN_VALUE, (byte) -54);
                        } else {
                            var6.field114.method2353(var9 << 16 | var10, (byte) -86);
                        }
                    } else {
                        var6.field114.method2352(true, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field114.method2353(Integer.MIN_VALUE, (byte) -55);
                        } else {
                            var6.field114.method2353(var9 << 16 | var10, (byte) -48);
                        }
                    }
                    class258.field3475 = var8.method322(111);
                }
            }
            if (var6 != null) {
                var6.field114.method2357(var6.field114.field5367 - var7, false);
                class100.method760(var6, -105);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method322(91) - class416.field5348) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class416.field5348 = var5.method322(112);
            int var16 = var5.method320(-115);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method323(-5);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method324(-2) == 2) {
                var18 = 1;
            }
            class638.field8881++;
            int var19 = (int) var14;
            class11 var20 = class130.method931(class649.field9035, (byte) 54, class240.field3242);
            var20.field114.method2385(var19 | var18 << 15, -1540);
            var20.field114.method2353(var17 | var16 << 16, (byte) -106);
            class100.method760(var20, -117);
        }
        if (class307.field4023 > 0) {
            class419.field5428++;
            class11 var21 = class130.method931(class649.field9035, (byte) 54, class225.field2929);
            var21.field114.method2352(true, class307.field4023 * 3);
            for (int var22 = 0; var22 < class307.field4023; var22++) {
                class409 var23 = class294.field3818[var22];
                long var24 = (var23.method312(-10133) - class305.field4014) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class305.field4014 = var23.method312(-10133);
                var21.field114.method2352(true, var23.method317(-5929));
                var21.field114.method2386((int) var24, 1103587288);
            }
            class100.method760(var21, -119);
        }
        if (class366.field4730 > 0) {
            class366.field4730--;
        }
        if (class63.field862 && class366.field4730 <= 0) {
            class63.field862 = false;
            class152.field1937++;
            class366.field4730 = 20;
            class11 var26 = class130.method931(class649.field9035, (byte) 54, class331.field4303);
            var26.field114.method2385((int) class141.field1859 >> 3, -1540);
            var26.field114.method2385((int) class710.field9918 >> 3, -1540);
            class100.method760(var26, -96);
        }
        if (class164.field2043 != class116.field1496) {
            class116.field1496 = class164.field2043;
            class213.field2744++;
            class11 var27 = class130.method931(class649.field9035, (byte) 54, class649.field9040);
            var27.field114.method2352(true, class164.field2043 ? 1 : 0);
            class100.method760(var27, 107);
        }
        if (!class249.field3389) {
            class195.field2544++;
            class11 var28 = class130.method931(class649.field9035, (byte) 54, class215.field2762);
            var28.field114.method2352(true, 0);
            int var29 = var28.field114.field5367;
            class418 var30 = new class418(class268.method1650(46));
            class260.field3509.method736((byte) 68, var30);
            var28.field114.method2358(94, var30.field5367, 0, var30.field5393);
            var28.field114.method2357(var28.field114.field5367 - var29, false);
            class100.method760(var28, -3);
            class249.field3389 = true;
        }
        if (class483.field6438 != null) {
            if (class704.field9810 == 2) {
                class512.method2763((byte) -98);
            } else if (class704.field9810 == 3) {
                class192.method1260(3);
            }
        }
        if (class515.field6756) {
            class515.field6756 = false;
        } else {
            class66.field907 /= 2.0F;
        }
        if (class440.field5682) {
            class440.field5682 = false;
        } else {
            class507.field6661 /= 2.0F;
        }
        class323.method1867((byte) -125);
        if (class566.field7391 != 10) {
            return;
        }
        class126.method922(true);
        if (arg0 >= -74) {
            field3109 = null;
        }
        class493.method2690(76);
        class205.method1323(-64);
        class531.method2823(-21938);
        class187.field2386++;
        if (class187.field2386 > 750) {
            class119.method898((byte) 107);
            return;
        }
        class158.method1127((byte) -65);
        class448.method2545(21335);
        class686.method3749(-52);
        for (int var31 = class397.field5054.method1719(-120, true); var31 != -1; var31 = class397.field5054.method1719(-9, false)) {
            class233.method1476((byte) 85, var31);
            class27.field412[class597.method3238(31, class314.field4073++)] = var31;
        }
        for (class367 var32 = class51.method454((byte) -50); var32 != null; var32 = class51.method454((byte) -50)) {
            int var33 = var32.method2108(false);
            int var34 = var32.method2114(0);
            if (var33 == 1) {
                class311.field4040[var34] = var32.field4735;
                class653.field9086 |= class564.field7369[var34];
                class2.field12[class597.method3238(31, class521.field6807++)] = var34;
            } else if (var33 == 2) {
                class337.field4362[var34] = var32.field4739;
                class133.field1736[class597.method3238(31, class240.field3244++)] = var34;
            } else if (var33 == 3) {
                class477 var35 = class600.method3268(-67, var34);
                if (!var32.field4739.equals(var35.field6298)) {
                    var35.field6298 = var32.field4739;
                    class386.method2199(var35, false);
                }
            } else if (var33 == 4) {
                class477 var54 = class600.method3268(119, var34);
                int var55 = var32.field4735;
                int var56 = var32.field4736;
                int var57 = var32.field4742;
                if (var54.field6323 != var55 || var54.field6325 != var56 || var54.field6278 != var57) {
                    var54.field6325 = var56;
                    var54.field6323 = var55;
                    var54.field6278 = var57;
                    class386.method2199(var54, false);
                }
            } else if (var33 == 5) {
                class477 var36 = class600.method3268(126, var34);
                if (var32.field4735 != var36.field6272 || var32.field4735 == -1) {
                    var36.field6261 = 0;
                    var36.field6267 = 1;
                    var36.field6272 = var32.field4735;
                    var36.field6301 = 0;
                    class348 var37 = var36.field6272 == -1 ? null : class552.field7163.method3031(107, var36.field6272);
                    if (var37 != null) {
                        class708.method3883(var37, var36.field6301, false);
                    }
                    class386.method2199(var36, false);
                }
            } else if (var33 == 6) {
                int var38 = var32.field4735;
                int var39 = (var38 & 0x7E25) >> 10;
                int var40 = var38 >> 5 & 0x1F;
                int var41 = var38 & 0x1F;
                int var42 = (var39 << 19) + (var41 << 3) + (var40 << 11);
                class477 var43 = class600.method3268(32, var34);
                if (var43.field6302 != var42) {
                    var43.field6302 = var42;
                    class386.method2199(var43, false);
                }
            } else if (var33 == 7) {
                class477 var52 = class600.method3268(111, var34);
                boolean var53 = var32.field4735 == 1;
                if (var53 != var52.field6340) {
                    var52.field6340 = var53;
                    class386.method2199(var52, false);
                }
            } else if (var33 == 8) {
                class477 var44 = class600.method3268(-65, var34);
                if (var32.field4735 != var44.field6283 || var32.field4736 != var44.field6342 || var32.field4742 != var44.field6216) {
                    var44.field6283 = var32.field4735;
                    var44.field6216 = var32.field4742;
                    var44.field6342 = var32.field4736;
                    if (var44.field6321 != -1) {
                        if (var44.field6291 > 0) {
                            var44.field6216 = var44.field6216 * 32 / var44.field6291;
                        } else if (var44.field6297 > 0) {
                            var44.field6216 = var44.field6216 * 32 / var44.field6297;
                        }
                    }
                    class386.method2199(var44, false);
                }
            } else if (var33 == 9) {
                class477 var51 = class600.method3268(120, var34);
                if (var32.field4735 != var51.field6321 || var32.field4736 != var51.field6237) {
                    var51.field6237 = var32.field4736;
                    var51.field6321 = var32.field4735;
                    class386.method2199(var51, false);
                }
            } else if (var33 == 10) {
                class477 var45 = class600.method3268(123, var34);
                if (var32.field4735 != var45.field6253 || var32.field4736 != var45.field6271 || var32.field4742 != var45.field6277) {
                    var45.field6271 = var32.field4736;
                    var45.field6277 = var32.field4742;
                    var45.field6253 = var32.field4735;
                    class386.method2199(var45, false);
                }
            } else if (var33 == 11) {
                class477 var46 = class600.method3268(125, var34);
                var46.field6288 = 0;
                var46.field6243 = 0;
                var46.field6286 = var46.field6238 = var32.field4735;
                var46.field6303 = var46.field6349 = var32.field4736;
                class386.method2199(var46, false);
            } else if (var33 == 12) {
                class477 var49 = class600.method3268(-50, var34);
                int var50 = var32.field4735;
                if (var49 != null && var49.field6312 == 0) {
                    if (var49.field6252 - var49.field6224 < var50) {
                        var50 = var49.field6252 - var49.field6224;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    }
                    if (var49.field6356 != var50) {
                        var49.field6356 = var50;
                        class386.method2199(var49, false);
                    }
                }
            } else if (var33 == 14) {
                class477 var48 = class600.method3268(123, var34);
                var48.field6265 = var32.field4735;
            } else if (var33 == 15) {
                class199.field2598 = var32.field4735;
                class49.field689 = true;
                class247.field3310 = var32.field4736;
            } else if (var33 == 16) {
                class477 var47 = class600.method3268(125, var34);
                var47.field6354 = var32.field4735;
            }
        }
        class57.field767++;
        if (class352.field4517 != 0) {
            class103.field1374 += 20;
            if (class103.field1374 >= 400) {
                class352.field4517 = 0;
            }
        }
        if (class255.field3465 != null) {
            class224.field2918++;
            if (class224.field2918 >= 15) {
                class386.method2199(class255.field3465, false);
                class255.field3465 = null;
            }
        }
        class178.field2217 = null;
        class377.field4835 = null;
        class299.field3907 = false;
        class659.field9179 = false;
        class66.method541(-1, (byte) -5, -1, null);
        class263.method1627((byte) -62, -1, -1, null);
        if (!class499.field6560) {
            client.field1223 = -1;
        }
        class412.method2329(-99);
        class166.field2089++;
        if (class201.field2618) {
            class198.field2597++;
            class11 var58 = class130.method931(class649.field9035, (byte) 54, class266.field3567);
            var58.field114.method2389(class691.field9443 << 28 | class261.field3510 << 14 | class329.field4289, (byte) 124);
            class100.method760(var58, 79);
            class201.field2618 = false;
        }
        while (true) {
            class155 var59;
            class477 var60;
            class477 var61;
            do {
                var59 = (class155) field3103.method2092((byte) 92);
                if (var59 == null) {
                    while (true) {
                        class155 var62;
                        class477 var63;
                        class477 var64;
                        do {
                            var62 = (class155) class612.field8260.method2092((byte) 92);
                            if (var62 == null) {
                                while (true) {
                                    class155 var65;
                                    class477 var66;
                                    class477 var67;
                                    do {
                                        var65 = (class155) class587.field7952.method2092((byte) 92);
                                        if (var65 == null) {
                                            if (class178.field2217 == null) {
                                                class210.field2710 = 0;
                                            }
                                            if (class655.field9114 != null) {
                                                class223.method1412((byte) 88);
                                            }
                                            if (class54.field741 > 0 && class390.field4990.method3168(256, 82) && class390.field4990.method3168(256, 81) && class87.field1160 != 0) {
                                                int var68 = class233.field3130.field508 - class87.field1160;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class438.method2489(class100.field1326 + class233.field3130.field3030[0], -1011358554, var68, class233.field3130.field3039[0] + class186.field2376);
                                            }
                                            class62.method524((byte) -77);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class433.field5583[var69]++;
                                            }
                                            if (class653.field9086 && (class584.method3191(1) - 60000L) > class541.field7037) {
                                                class136.method990(0);
                                            }
                                            for (class691 var70 = (class691) class225.field2926.method2101(260); var70 != null; var70 = (class691) class225.field2926.method2098((byte) 57)) {
                                                if (class584.method3191(1) / 1000L - 5L > (long) var70.field9441) {
                                                    if (var70.field9435 > 0) {
                                                        class495.method2696(-1, 0, "", 5, "", var70.field9437 + class604.field8143.method3280((byte) 125, class144.field1890), "");
                                                    }
                                                    if (var70.field9435 == 0) {
                                                        class495.method2696(-1, 0, "", 5, "", var70.field9437 + class604.field8144.method3280((byte) 125, class144.field1890), "");
                                                    }
                                                    var70.method2227(96);
                                                }
                                            }
                                            class222.field2904++;
                                            if (class222.field2904 > 500) {
                                                class222.field2904 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    class595.field8047 += class148.field1912;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class595.field8042 += class101.field1353;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class611.field8257 += class187.field2383;
                                                }
                                            }
                                            if (class595.field8047 < -50) {
                                                class148.field1912 = 2;
                                            }
                                            if (class595.field8047 > 50) {
                                                class148.field1912 = -2;
                                            }
                                            if (class595.field8042 < -55) {
                                                class101.field1353 = 2;
                                            }
                                            if (class595.field8042 > 55) {
                                                class101.field1353 = -2;
                                            }
                                            if (class611.field8257 < -40) {
                                                class187.field2383 = 1;
                                            }
                                            class347.field4431++;
                                            if (class611.field8257 > 40) {
                                                class187.field2383 = -1;
                                            }
                                            if (class347.field4431 > 500) {
                                                class347.field4431 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class7.field56 += class148.field1917;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class279.field3653 += class44.field612;
                                                }
                                            }
                                            if (class7.field56 < -60) {
                                                class148.field1917 = 2;
                                            }
                                            if (class7.field56 > 60) {
                                                class148.field1917 = -2;
                                            }
                                            if (class279.field3653 < -20) {
                                                class44.field612 = 1;
                                            }
                                            class659.field9191++;
                                            if (class279.field3653 > 10) {
                                                class44.field612 = -1;
                                            }
                                            if (class659.field9191 > 50) {
                                                class564.field7363++;
                                                class11 var73 = class130.method931(class649.field9035, (byte) 54, class307.field4022);
                                                class100.method760(var73, -5);
                                            }
                                            if (class358.field4640) {
                                                class705.method3850(-111);
                                                class358.field4640 = false;
                                            }
                                            try {
                                                class96.method730(0);
                                                return;
                                            } catch (IOException var74) {
                                                class119.method898((byte) -78);
                                                return;
                                            }
                                        }
                                        var66 = var65.field1968;
                                        if (var66.field6221 < 0) {
                                            break;
                                        }
                                        var67 = class600.method3268(110, var66.field6292);
                                    } while (var67 == null || var67.field6258 == null || var67.field6258.length <= var66.field6221 || var67.field6258[var66.field6221] != var66);
                                    class709.method3885(var65);
                                }
                            }
                            var63 = var62.field1968;
                            if (var63.field6221 < 0) {
                                break;
                            }
                            var64 = class600.method3268(115, var63.field6292);
                        } while (var64 == null || var64.field6258 == null || var63.field6221 >= var64.field6258.length || var64.field6258[var63.field6221] != var63);
                        class709.method3885(var62);
                    }
                }
                var60 = var59.field1968;
                if (var60.field6221 < 0) {
                    break;
                }
                var61 = class600.method3268(-88, var60.field6292);
            } while (var61 == null || var61.field6258 == null || var60.field6221 >= var61.field6258.length || var61.field6258[var60.field6221] != var60);
            class709.method3885(var59);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 923)
    public static void method1472(int arg0) {
        field3103 = null;
        field3109 = null;
        if (arg0 > -55) {
            field3103 = null;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z[ILpca;I)V", line = 941)
    public static final void method1473(boolean arg0, int[] arg1, class532 arg2, int arg3) {
        if (arg2.field2979 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field2979.length; var5++) {
                if (arg2.field2979[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field3021 != -1) {
                class348 var6 = class552.field7163.method3031(-101, arg2.field3021);
                int var7 = var6.field4447;
                if (var7 == 1) {
                    arg2.field2943 = 0;
                    arg2.field2939 = arg3;
                    arg2.field2944 = 0;
                    arg2.field2972 = 1;
                    arg2.field3015 = 0;
                    class451.method2548(var6, arg2.field508, arg2.field503, arg2.field506, 255, false, arg2.field3015);
                }
                if (var7 == 2) {
                    arg2.field2944 = 0;
                }
            }
        }
        field3102++;
        boolean var8 = arg0;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field2979 == null || arg2.field2979[var9] == -1 || class552.field7163.method3031(-74, arg1[var9]).field4466 >= class552.field7163.method3031(-116, arg2.field2979[var9]).field4466) {
                arg2.field2979 = arg1;
                arg2.field2939 = arg3;
                arg2.field3037 = arg2.field3038;
            }
        }
        if (var8) {
            arg2.field3037 = arg2.field3038;
            arg2.field2939 = arg3;
            arg2.field2979 = arg1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)Z", line = 1025)
    public static final boolean method1474(int arg0, int arg1) {
        if (arg1 != 32142) {
            field3109 = null;
        }
        field3106++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }
}
