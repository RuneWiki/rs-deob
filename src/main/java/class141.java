import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class141 extends class362 {

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2334;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2333;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "[I")
    public static int[] field2335;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static final void method1123(int arg0) {
        if (class591.field8069 > 1) {
            class728.field9854 = class253.field3660;
            class591.field8069--;
        }
        field2331++;
        if (class145.field2406) {
            class145.field2406 = false;
            class288.method1878(67);
            return;
        }
        if (!class311.field4321) {
            class750.method4183((byte) 95);
        }
        for (int var1 = 0; var1 < 100 && class302.method1965((byte) -52); var1++) {
        }
        if (class214.field3036 != 10) {
            return;
        }
        while (class369.method2346(arg0 ^ 0x2CA2)) {
            class564 var2 = class227.method1594(class205.field2957, class72.field1320, -92);
            var2.field7778.method1526(false, 0);
            int var3 = var2.field7778.field3109;
            class607.method3451((byte) 121, var2.field7778);
            var2.field7778.method1487(113, var2.field7778.field3109 - var3);
            class167.method1260(119, var2);
        }
        if (class107.field1880 == null) {
            if (class554.method3190(-121) >= class81.field1485) {
                class107.field1880 = class440.field6266.method1250(-5255, class678.field9207.field9144);
            }
        } else if (class107.field1880.field8993 != -1) {
            class564 var4 = class227.method1594(class376.field5324, class72.field1320, -81);
            var4.field7778.method1485((byte) 107, class107.field1880.field8993);
            class167.method1260(122, var4);
            class107.field1880 = null;
            class81.field1485 = class554.method3190(-106) + 30000L;
        }
        class19 var5 = (class19) class494.field6832.method1269(4);
        if (var5 != null || (class554.method3190(-97) - 2000L) > class382.field5546) {
            class564 var6 = null;
            int var7 = 0;
            for (class19 var8 = (class19) class261.field3746.method1269(4); var8 != null && (var6 == null || var6.field7778.field3109 - var7 < 240); var8 = (class19) class261.field3746.method1264((byte) 79)) {
                var8.method2314((byte) 107);
                int var9 = var8.method146(-15);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method143((byte) -127);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class704.field9527 != var10 || class346.field4846 != var9) {
                    if (var6 == null) {
                        class570.field7844++;
                        var6 = class227.method1594(class561.field7751, class72.field1320, -94);
                        var6.field7778.method1526(false, 0);
                        var7 = var6.field7778.field3109;
                    }
                    int var11 = var10 - class704.field9527;
                    class704.field9527 = var10;
                    int var12 = var9 - class346.field4846;
                    class346.field4846 = var9;
                    int var13 = (int) ((var8.method147((byte) -107) - class382.field5546) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field7778.method1485((byte) 107, (var13 << 12) + (var11 << 6) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var12 += 128;
                        var6.field7778.method1526(false, var13 + 128);
                        var6.field7778.method1485((byte) 107, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field7778.method1485((byte) 107, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7778.method1539((byte) 99, Integer.MIN_VALUE);
                        } else {
                            var6.field7778.method1539((byte) 101, var9 << 16 | var10);
                        }
                    } else {
                        var6.field7778.method1526(false, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field7778.method1539((byte) 114, Integer.MIN_VALUE);
                        } else {
                            var6.field7778.method1539((byte) 100, var10 | var9 << 16);
                        }
                    }
                    class382.field5546 = var8.method147((byte) -109);
                }
            }
            if (var6 != null) {
                var6.field7778.method1487(105, var6.field7778.field3109 - var7);
                class167.method1260(23, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method147((byte) -110) - class747.field10342) / 50L;
            class747.field10342 = var5.method147((byte) -87);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method146(20);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method143((byte) -128);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method145(arg0 ^ 0x2CEE) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class456.field6427++;
            class564 var20 = class227.method1594(class581.field7960, class72.field1320, arg0 - 11525);
            var20.field7778.method1485((byte) 107, var19 | var18 << 15);
            var20.field7778.method1539((byte) 121, var16 << 16 | var17);
            class167.method1260(25, var20);
        }
        if (class74.field1337 > 0) {
            class449.field6347++;
            class564 var21 = class227.method1594(class731.field9883, class72.field1320, -111);
            var21.field7778.method1526(false, class74.field1337 * 3);
            for (int var22 = 0; var22 < class74.field1337; var22++) {
                class366 var23 = class373.field5298[var22];
                long var24 = (var23.method2330((byte) -29) - class54.field1110) / 50L;
                class54.field1110 = var23.method2330((byte) 106);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field7778.method1526(false, var23.method2331(false));
                var21.field7778.method1485((byte) 107, (int) var24);
            }
            class167.method1260(-49, var21);
        }
        if (class649.field8934 > 0) {
            class649.field8934--;
        }
        if (class392.field5766 && class649.field8934 <= 0) {
            class620.field8443++;
            class392.field5766 = false;
            class649.field8934 = 20;
            class564 var26 = class227.method1594(class276.field3875, class72.field1320, arg0 - 11549);
            var26.field7778.method1497(arg0 ^ 0x3C4D, (int) class451.field6366 >> 3);
            var26.field7778.method1485((byte) 107, (int) class440.field6267 >> 3);
            class167.method1260(-31, var26);
        }
        if (class195.field2888 != class109.field1897) {
            class537.field7430++;
            class109.field1897 = class195.field2888;
            class564 var27 = class227.method1594(class508.field7067, class72.field1320, arg0 ^ 0xFFFFD337);
            var27.field7778.method1526(false, class195.field2888 ? 1 : 0);
            class167.method1260(arg0 - 11501, var27);
        }
        if (!class184.field2782) {
            class554.field7656++;
            class564 var28 = class227.method1594(class548.field7545, class72.field1320, -113);
            var28.field7778.method1526(false, 0);
            int var29 = var28.field7778.field3109;
            class215 var30 = class693.field9368.method2063(arg0 ^ 0x2CB0);
            var28.field7778.method1528(var30.field3109, 0, var30.field3066, 82);
            var28.field7778.method1487(96, var28.field7778.field3109 - var29);
            class167.method1260(arg0 - 11473, var28);
            class184.field2782 = true;
        }
        if (class649.field8928 != null) {
            if (class438.field6252 == 2) {
                class114.method1006((byte) 127);
            } else if (class438.field6252 == 3) {
                class710.method3947((byte) -4);
            }
        }
        if (class371.field5285) {
            class371.field5285 = false;
        } else {
            class201.field2912 /= 2.0F;
        }
        if (class216.field3137) {
            class216.field3137 = false;
        } else {
            class55.field1119 /= 2.0F;
        }
        class113.method1000((byte) 33);
        if (class214.field3036 != 10) {
            return;
        }
        class587.method3351((byte) 55);
        class479.method2807(arg0 - 11335);
        class643.method3647(-123);
        class568.field7816++;
        if (class568.field7816 > 750) {
            class288.method1878(83);
            return;
        }
        class699.method3910(arg0 - 6692);
        class556.method3199(true);
        class463.method2734(0);
        for (int var31 = class390.field5635.method893((byte) -126, true); var31 != -1; var31 = class390.field5635.method893((byte) -128, false)) {
            class656.method3701(true, var31);
            class531.field7323[class263.method1762(31, class190.field2836++)] = var31;
        }
        for (class594 var32 = class443.method2664(2681); var32 != null; var32 = class443.method2664(2681)) {
            int var33 = var32.method3377(true);
            int var34 = var32.method3380(1);
            if (var33 == 1) {
                class377.field5346[var34] = var32.field8126;
                class129.field2172 |= class269.field3797[var34];
                class655.field8996[class263.method1762(31, class311.field4338++)] = var34;
            } else if (var33 == 2) {
                class429.field6149[var34] = var32.field8128;
                class339.field4767[class263.method1762(class443.field6291++, 31)] = var34;
            } else if (var33 == 3) {
                class378 var58 = class60.method633(1512932720, var34);
                if (!var32.field8128.equals(var58.field5468)) {
                    var58.field5468 = var32.field8128;
                    class296.method1945(-9343, var58);
                }
            } else if (var33 == 4) {
                class378 var35 = class60.method633(1512932720, var34);
                int var36 = var32.field8126;
                int var37 = var32.field8125;
                int var38 = var32.field8124;
                if (var35.field5446 != var36 || var35.field5429 != var37 || var35.field5455 != var38) {
                    var35.field5429 = var37;
                    var35.field5446 = var36;
                    var35.field5455 = var38;
                    class296.method1945(-9343, var35);
                }
            } else if (var33 == 5) {
                class378 var39 = class60.method633(arg0 ^ 0x5A2DA9D8, var34);
                if (var32.field8126 != var39.field5375 || var32.field8126 == -1) {
                    var39.field5375 = var32.field8126;
                    var39.field5471 = 0;
                    var39.field5517 = 0;
                    var39.field5406 = 1;
                    class691 var40 = var39.field5375 == -1 ? null : class456.field6436.method1021(var39.field5375, 7);
                    if (var40 != null) {
                        class231.method1609(var39.field5471, var40, 30);
                    }
                    class296.method1945(-9343, var39);
                }
            } else if (var33 == 6) {
                int var41 = var32.field8126;
                int var42 = (var41 & 0x7FF9) >> 10;
                int var43 = var41 >> 5 & 0x1F;
                int var44 = var41 & 0x1F;
                int var45 = (var44 << 3) + ((var42 << 19) + (var43 << 11));
                class378 var46 = class60.method633(1512932720, var34);
                if (var46.field5425 != var45) {
                    var46.field5425 = var45;
                    class296.method1945(-9343, var46);
                }
            } else if (var33 == 7) {
                class378 var47 = class60.method633(1512932720, var34);
                boolean var48 = var32.field8126 == 1;
                if (var47.field5489 != var48) {
                    var47.field5489 = var48;
                    class296.method1945(-9343, var47);
                }
            } else if (var33 == 8) {
                class378 var49 = class60.method633(1512932720, var34);
                if (var32.field8126 != var49.field5433 || var32.field8125 != var49.field5351 || var32.field8124 != var49.field5392) {
                    var49.field5392 = var32.field8124;
                    var49.field5351 = var32.field8125;
                    var49.field5433 = var32.field8126;
                    if (var49.field5488 != -1) {
                        if (var49.field5472 > 0) {
                            var49.field5392 = var49.field5392 * 32 / var49.field5472;
                        } else if (var49.field5518 > 0) {
                            var49.field5392 = var49.field5392 * 32 / var49.field5518;
                        }
                    }
                    class296.method1945(-9343, var49);
                }
            } else if (var33 == 9) {
                class378 var57 = class60.method633(1512932720, var34);
                if (var32.field8126 != var57.field5488 || var32.field8125 != var57.field5457) {
                    var57.field5457 = var32.field8125;
                    var57.field5488 = var32.field8126;
                    class296.method1945(-9343, var57);
                }
            } else if (var33 == 10) {
                class378 var56 = class60.method633(1512932720, var34);
                if (var32.field8126 != var56.field5484 || var32.field8125 != var56.field5462 || var32.field8124 != var56.field5393) {
                    var56.field5462 = var32.field8125;
                    var56.field5484 = var32.field8126;
                    var56.field5393 = var32.field8124;
                    class296.method1945(-9343, var56);
                }
            } else if (var33 == 11) {
                class378 var55 = class60.method633(1512932720, var34);
                var55.field5493 = 0;
                var55.field5426 = var55.field5415 = var32.field8125;
                var55.field5357 = 0;
                var55.field5476 = var55.field5464 = var32.field8126;
                class296.method1945(-9343, var55);
            } else if (var33 == 12) {
                class378 var53 = class60.method633(1512932720, var34);
                int var54 = var32.field8126;
                if (var53 != null && var53.field5450 == 0) {
                    if (var53.field5467 - var53.field5465 < var54) {
                        var54 = var53.field5467 - var53.field5465;
                    }
                    if (var54 < 0) {
                        var54 = 0;
                    }
                    if (var53.field5431 != var54) {
                        var53.field5431 = var54;
                        class296.method1945(-9343, var53);
                    }
                }
            } else if (var33 == 14) {
                class378 var50 = class60.method633(1512932720, var34);
                var50.field5432 = var32.field8126;
            } else if (var33 == 15) {
                class136.field2279 = var32.field8125;
                class295.field4138 = var32.field8126;
                class6.field46 = true;
            } else if (var33 == 16) {
                class378 var52 = class60.method633(1512932720, var34);
                var52.field5378 = var32.field8126;
            } else if (var33 == 17) {
                class378 var51 = class60.method633(1512932720, var34);
                var51.field5482 = var32.field8126;
            }
        }
        class322.field4464++;
        if (class282.field3944 != 0) {
            class362.field5205 += 20;
            if (class362.field5205 >= 400) {
                class282.field3944 = 0;
            }
        }
        if (class253.field3655 != null) {
            class746.field10326++;
            if (class746.field10326 >= 15) {
                class296.method1945(-9343, class253.field3655);
                class253.field3655 = null;
            }
        }
        class238.field3455 = null;
        class216.field3134 = false;
        class445.field6321 = null;
        class422.field6093 = false;
        class608.method3459(null, false, -1, -1);
        class195.method1391(-1, null, 1, -1);
        if (!class184.field2785) {
            class130.field2184 = -1;
        }
        class194.method1384((byte) -73);
        class253.field3660++;
        if (class254.field3665) {
            class266.field3773++;
            class564 var59 = class227.method1594(class22.field537, class72.field1320, arg0 - 11525);
            var59.field7778.method1539((byte) 117, class696.field9404 << 14 | class449.field6348 << 28 | class334.field4721);
            class167.method1260(30, var59);
            class254.field3665 = false;
        }
        while (true) {
            class33 var60;
            class378 var61;
            class378 var62;
            do {
                var60 = (class33) class223.field3188.method1271(8);
                if (var60 == null) {
                    while (true) {
                        class33 var63;
                        class378 var64;
                        class378 var65;
                        do {
                            var63 = (class33) class575.field7892.method1271(8);
                            if (var63 == null) {
                                while (true) {
                                    class33 var66;
                                    class378 var67;
                                    class378 var68;
                                    do {
                                        var66 = (class33) class208.field2975.method1271(arg0 - 11424);
                                        if (var66 == null) {
                                            if (class445.field6321 == null) {
                                                class13.field237 = 0;
                                            }
                                            if (class591.field8071 != null) {
                                                class109.method973(-30206);
                                            }
                                            if (class476.field6653 > 0 && class117.field1992.method1346(82, arg0 ^ 0xFFFFD32A) && class117.field1992.method1346(81, -121) && class266.field3770 != 0) {
                                                int var69 = class58.field1147.field5926 - class266.field3770;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class570.method3300(class58.field1147.field5743[0] + class367.field5236, arg0 ^ 0x2CAA, var69, class58.field1147.field5746[0] + class221.field3177);
                                            }
                                            class210.method1447(-120);
                                            int var70 = 0;
                                            if (arg0 != 11432) {
                                                return;
                                            }
                                            while (var70 < 5) {
                                                int var10002 = class576.field7909[var70]++;
                                                var70++;
                                            }
                                            if (class129.field2172 && class554.method3190(-84) - 60000L > class699.field9461) {
                                                class380.method2405(arg0 - 11313);
                                            }
                                            for (class692 var71 = (class692) class167.field2627.method1301(arg0 - 11424); var71 != null; var71 = (class692) class167.field2627.method1307((byte) -105)) {
                                                if (class554.method3190(arg0 ^ 0xFFFFD316) / 1000L - 5L > (long) var71.field9365) {
                                                    if (var71.field9364 > 0) {
                                                        class128.method1064("", 5, (byte) -128, 0, var71.field9361 + class497.field6910.method2936(class607.field8336, 544), "", "");
                                                    }
                                                    if (var71.field9364 == 0) {
                                                        class128.method1064("", 5, (byte) -105, 0, var71.field9361 + class497.field6911.method2936(class607.field8336, 544), "", "");
                                                    }
                                                    var71.method4018(false);
                                                }
                                            }
                                            class133.field2240++;
                                            if (class133.field2240 > 500) {
                                                class133.field2240 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x4) == 4) {
                                                    class637.field8757 += class181.field2749;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class66.field1256 += class424.field6114;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class680.field9216 += class386.field5599;
                                                }
                                            }
                                            if (class66.field1256 < -50) {
                                                class424.field6114 = 2;
                                            }
                                            if (class66.field1256 > 50) {
                                                class424.field6114 = -2;
                                            }
                                            if (class680.field9216 < -55) {
                                                class386.field5599 = 2;
                                            }
                                            if (class637.field8757 < -40) {
                                                class181.field2749 = 1;
                                            }
                                            if (class680.field9216 > 55) {
                                                class386.field5599 = -2;
                                            }
                                            class539.field7465++;
                                            if (class637.field8757 > 40) {
                                                class181.field2749 = -1;
                                            }
                                            if (class539.field7465 > 500) {
                                                class539.field7465 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x2) == 2) {
                                                    class548.field7552 += class167.field2630;
                                                }
                                                if ((var73 & 0x1) == 1) {
                                                    class28.field748 += class147.field2461;
                                                }
                                            }
                                            if (class28.field748 < -60) {
                                                class147.field2461 = 2;
                                            }
                                            if (class548.field7552 < -20) {
                                                class167.field2630 = 1;
                                            }
                                            if (class28.field748 > 60) {
                                                class147.field2461 = -2;
                                            }
                                            if (class548.field7552 > 10) {
                                                class167.field2630 = -1;
                                            }
                                            class10.field137++;
                                            if (class10.field137 > 50) {
                                                class82.field1488++;
                                                class564 var74 = class227.method1594(class507.field7050, class72.field1320, -125);
                                                class167.method1260(arg0 ^ 0xFFFFD33F, var74);
                                            }
                                            if (class123.field2116) {
                                                class464.method2736(0);
                                                class123.field2116 = false;
                                            }
                                            try {
                                                class620.method3538(0);
                                                return;
                                            } catch (IOException var75) {
                                                class288.method1878(93);
                                                return;
                                            }
                                        }
                                        var67 = var66.field847;
                                        if (var67.field5380 < 0) {
                                            break;
                                        }
                                        var68 = class60.method633(1512932720, var67.field5510);
                                    } while (var68 == null || var68.field5474 == null || var67.field5380 >= var68.field5474.length || var68.field5474[var67.field5380] != var67);
                                    class83.method788(var66);
                                }
                            }
                            var64 = var63.field847;
                            if (var64.field5380 < 0) {
                                break;
                            }
                            var65 = class60.method633(1512932720, var64.field5510);
                        } while (var65 == null || var65.field5474 == null || var65.field5474.length <= var64.field5380 || var65.field5474[var64.field5380] != var64);
                        class83.method788(var63);
                    }
                }
                var61 = var60.field847;
                if (var61.field5380 < 0) {
                    break;
                }
                var62 = class60.method633(1512932720, var61.field5510);
            } while (var62 == null || var62.field5474 == null || var62.field5474.length <= var61.field5380 || var62.field5474[var61.field5380] != var61);
            class83.method788(var60);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method1124(String arg0, byte arg1) {
        field2330++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        if (arg1 != -20) {
            method1123(-54);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        field2335 = null;
        field2333 = null;
        field2334 = null;
        int var1 = 31 % ((3 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public static final void method1126(int arg0) {
        field2328++;
        if (arg0 == 2) {
            class538.field7445 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(II)V")
    public class141(int arg0, int arg1) {
        this.field2329 = arg0;
        this.field2332 = arg1;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field2334 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field2333 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
