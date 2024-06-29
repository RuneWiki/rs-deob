import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class60 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Liga;")
    public static class91 field692 = new class91(10, 8);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lha;Lae;I)V")
    public static final void method482(class473 arg0, class283 arg1, int arg2) {
        field693++;
        class279[] var3 = class279.method1817(arg1, class680.field9500, 0);
        class346.field5032 = new class318[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class346.field5032[var4] = arg0.method192(var3[var4], true);
        }
        class279[] var5 = class279.method1817(arg1, class302.field4406, 0);
        class161.field2085 = new class318[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class161.field2085[var6] = arg0.method192(var5[var6], true);
        }
        class279[] var7 = class279.method1817(arg1, class17.field108, 0);
        class623.field8739 = new class318[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class623.field8739[var8] = arg0.method192(var7[var8], true);
        }
        class279[] var9 = class279.method1817(arg1, class9.field53, 0);
        class382.field5483 = new class318[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class382.field5483[var10] = arg0.method192(var9[var10], true);
        }
        class279[] var11 = class279.method1817(arg1, class769.field10589, 0);
        class612.field8622 = new class318[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class612.field8622[var12] = arg0.method192(var11[var12], true);
        }
        class279[] var13 = class279.method1817(arg1, class145.field1876, 0);
        class182.field2292 = new class318[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class182.field2292[var14] = arg0.method192(var13[var14], true);
        }
        class279[] var15 = class279.method1817(arg1, class681.field9548, 0);
        if (arg2 != -501) {
            return;
        }
        class59.field686 = new class318[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class59.field686[var16] = arg0.method192(var15[var16], true);
        }
        class279[] var17 = class279.method1817(arg1, class764.field10473, 0);
        class683.field9569 = new class318[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class683.field9569[var18] = arg0.method192(var17[var18], true);
        }
        class279[] var19 = class279.method1817(arg1, class591.field8334, 0);
        class686.field9579 = new class318[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class686.field9579[var20] = arg0.method192(var19[var20], true);
        }
        class279[] var21 = class279.method1817(arg1, class351.field5100, 0);
        class672.field9437 = new class318[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class672.field9437[var22] = arg0.method192(var21[var22], true);
        }
        class279[] var23 = class279.method1817(arg1, class559.field7874, 0);
        class74.field832 = new class318[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class74.field832[var24] = arg0.method192(var23[var24], true);
        }
        class279[] var25 = class279.method1817(arg1, class392.field5588, 0);
        class475.field6585 = new class318[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class475.field6585[var26] = arg0.method192(var25[var26], true);
        }
        class140.field1792 = arg0.method192(class279.method1821(arg1, class685.field9572, 0), true);
        class208.field2898 = arg0.method192(class279.method1821(arg1, class758.field10424, 0), true);
        class279[] var27 = class279.method1817(arg1, class479.field6648, 0);
        class69.field768 = new class318[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class69.field768[var28] = arg0.method192(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method483(byte arg0) {
        if (arg0 != 41) {
            method483((byte) 109);
        }
        field692 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static final void method484(int arg0) {
        field691++;
        if (class637.field8958 > 1) {
            class137.field1757 = class453.field6312;
            class637.field8958--;
        }
        if (class669.field9377) {
            class669.field9377 = false;
            class380.method2371((byte) 107);
            return;
        }
        if (!class263.field3850) {
            class442.method2652(-16777216);
        }
        for (int var1 = arg0; var1 < 100 && class748.method4147(arg0 + 50); var1++) {
        }
        if (class664.field9331 != 10) {
            return;
        }
        while (class743.method4114(64)) {
            class116 var2 = class248.method1672(class84.field1023, class543.field7570, -20647);
            var2.field1575.method3005(255, 0);
            int var3 = var2.field1575.field6962;
            class425.method2568(arg0 ^ 0x78, var2.field1575);
            var2.field1575.method2985((byte) -57, var2.field1575.field6962 - var3);
            class443.method2655(0, var2);
        }
        if (class288.field4222 == null) {
            if (class405.field5711 <= class683.method3903((byte) 4)) {
                class288.field4222 = class791.field10838.method2047((byte) -119, class735.field10134.field8299);
            }
        } else if (class288.field4222.field6582 != -1) {
            class116 var4 = class248.method1672(class84.field1023, class177.field2231, -20647);
            var4.field1575.method2986(class288.field4222.field6582, 102);
            class443.method2655(0, var4);
            class288.field4222 = null;
            class405.field5711 = class683.method3903((byte) 4) + 30000L;
        }
        class620 var5 = (class620) class297.field4326.method1041(1048832);
        if (var5 != null || class691.field9651 < (class683.method3903((byte) 4) - 2000L)) {
            class116 var6 = null;
            int var7 = 0;
            for (class620 var8 = (class620) class179.field2264.method1041(1048832); var8 != null && (var6 == null || var6.field1575.field6962 - var7 < 240); var8 = (class620) class179.field2264.method1033(-1)) {
                var8.method527(-11229);
                int var9 = var8.method1626(79);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1623(true);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class492.field6776 != var10 || class448.field6276 != var9) {
                    if (var6 == null) {
                        class615.field8643++;
                        var6 = class248.method1672(class84.field1023, class152.field1989, arg0 - 20647);
                        var6.field1575.method3005(255, 0);
                        var7 = var6.field1575.field6962;
                    }
                    int var11 = var10 - class492.field6776;
                    class492.field6776 = var10;
                    int var12 = var9 - class448.field6276;
                    class448.field6276 = var9;
                    int var13 = (int) ((var8.method1624(-41) - class691.field9651) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field1575.method2986((var11 << 6) + (var13 << 12) + var12, arg0 ^ 0x6A);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field1575.method3005(255, var13 + 128);
                        var12 += 128;
                        var6.field1575.method2986((var11 << 8) + var12, -30);
                    } else if (var13 < 32) {
                        var6.field1575.method3005(255, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1575.method3003(Integer.MIN_VALUE, -23061);
                        } else {
                            var6.field1575.method3003(var9 << 16 | var10, arg0 - 23061);
                        }
                    } else {
                        var6.field1575.method2986(var13 + 57344, 123);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1575.method3003(Integer.MIN_VALUE, -23061);
                        } else {
                            var6.field1575.method3003(var10 | var9 << 16, -23061);
                        }
                    }
                    class691.field9651 = var8.method1624(-106);
                }
            }
            if (var6 != null) {
                var6.field1575.method2985((byte) -57, var6.field1575.field6962 - var7);
                class443.method2655(0, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1624(-92) - class638.field8975) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class638.field8975 = var5.method1624(-89);
            int var16 = var5.method1626(arg0 + 81);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1623(true);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1627(false) == 2) {
                var18 = 1;
            }
            class542.field7521++;
            int var19 = (int) var14;
            class116 var20 = class248.method1672(class84.field1023, class543.field7571, -20647);
            var20.field1575.method2986(var19 | var18 << 15, -77);
            var20.field1575.method3003(var16 << 16 | var17, -23061);
            class443.method2655(0, var20);
        }
        if (class572.field8055 > 0) {
            class438.field6067++;
            class116 var21 = class248.method1672(class84.field1023, class245.field3622, arg0 ^ 0xFFFFAF59);
            var21.field1575.method3005(arg0 ^ 0xFF, class572.field8055 * 3);
            for (int var22 = 0; var22 < class572.field8055; var22++) {
                class659 var23 = class346.field5040[var22];
                long var24 = (var23.method732((byte) 87) - class505.field6874) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class505.field6874 = var23.method732((byte) 35);
                var21.field1575.method3005(255, var23.method727(17788));
                var21.field1575.method2986((int) var24, 101);
            }
            class443.method2655(arg0, var21);
        }
        if (class405.field5709 > 0) {
            class405.field5709--;
        }
        if (class109.field1314 && class405.field5709 <= 0) {
            class109.field1314 = false;
            class560.field7889++;
            class405.field5709 = 20;
            class116 var26 = class248.method1672(class84.field1023, class93.field1082, -20647);
            var26.field1575.method2986((int) class702.field9790 >> 3, -84);
            var26.field1575.method2977(false, (int) class514.field7053 >> 3);
            class443.method2655(0, var26);
        }
        if (class743.field10242 != class536.field7412) {
            class743.field10242 = class536.field7412;
            class424.field5883++;
            class116 var27 = class248.method1672(class84.field1023, class62.field704, -20647);
            var27.field1575.method3005(arg0 ^ 0xFF, class536.field7412 ? 1 : 0);
            class443.method2655(0, var27);
        }
        if (!class106.field1247) {
            class754.field10412++;
            class116 var28 = class248.method1672(class84.field1023, class329.field4609, -20647);
            var28.field1575.method3005(arg0 ^ 0xFF, 0);
            int var29 = var28.field1575.field6962;
            class511 var30 = class688.field9602.method3508(24);
            var28.field1575.method2997((byte) -39, var30.field6979, 0, var30.field6962);
            var28.field1575.method2985((byte) -57, var28.field1575.field6962 - var29);
            class443.method2655(arg0, var28);
            class106.field1247 = true;
        }
        if (class59.field688 != null) {
            if (class695.field9691 == 2) {
                class351.method2217(16384);
            } else if (class695.field9691 == 3) {
                class668.method3817(arg0 ^ 0xFFFFFFB9);
            }
        }
        if (class590.field8317) {
            class590.field8317 = false;
        } else {
            class256.field3781 /= 2.0F;
        }
        if (class256.field3782) {
            class256.field3782 = false;
        } else {
            class195.field2770 /= 2.0F;
        }
        class187.method1173(109);
        if (class664.field9331 != 10) {
            return;
        }
        class56.method470(11192);
        class250.method1679((byte) 111);
        class79.method566(arg0 ^ 0x541C);
        class29.field239++;
        if (class29.field239 > 750) {
            class380.method2371((byte) 114);
            return;
        }
        class633.method3626((byte) -44);
        class136.method914(-52);
        class453.method2731(-16054);
        for (int var31 = class173.field2192.method3397((byte) 54, true); var31 != -1; var31 = class173.field2192.method3397((byte) 54, false)) {
            class386.method2393((byte) 121, var31);
            class276.field3983[class407.method2490(31, class673.field9448++)] = var31;
        }
        for (class17 var32 = class419.method2535(-1); var32 != null; var32 = class419.method2535(-1)) {
            int var33 = var32.method67((byte) 124);
            long var34 = var32.method68((byte) -126);
            if (var33 == 1) {
                class170.field2162[(int) var34] = var32.field107;
                class489.field6728 |= class583.field8250[(int) var34];
                class492.field6783[class407.method2490(31, class79.field893++)] = (int) var34;
            } else if (var33 == 2) {
                class616.field8646[(int) var34] = var32.field102;
                class687.field9592[class407.method2490(class208.field2904++, 31)] = (int) var34;
            } else if (var33 == 3) {
                class115 var63 = class384.method2387(false, (int) var34);
                if (!var32.field102.equals(var63.field1546)) {
                    var63.field1546 = var32.field102;
                    class43.method336(-1, var63);
                }
            } else if (var33 == 4) {
                class115 var36 = class384.method2387(false, (int) var34);
                int var37 = var32.field107;
                int var38 = var32.field104;
                int var39 = var32.field105;
                if (var36.field1479 != var37 || var36.field1404 != var38 || var36.field1456 != var39) {
                    var36.field1404 = var38;
                    var36.field1456 = var39;
                    var36.field1479 = var37;
                    class43.method336(-1, var36);
                }
            } else if (var33 == 5) {
                class115 var40 = class384.method2387(false, (int) var34);
                if (var32.field107 != var40.field1411 || var32.field107 == -1) {
                    var40.field1411 = var32.field107;
                    var40.field1392 = 0;
                    var40.field1390 = 0;
                    var40.field1554 = 1;
                    class73 var41 = var40.field1411 == -1 ? null : class571.field8029.method3695(var40.field1411, (byte) -128);
                    if (var41 != null) {
                        class704.method3976(var40.field1392, var41, 1);
                    }
                    class43.method336(-1, var40);
                }
            } else if (var33 == 6) {
                int var57 = var32.field107;
                int var58 = var57 >> 10 & 0x1F;
                int var59 = (var57 & 0x3E9) >> 5;
                int var60 = var57 & 0x1F;
                int var61 = (var58 << 19) + (var60 << 3) + (var59 << 11);
                class115 var62 = class384.method2387(false, (int) var34);
                if (var62.field1548 != var61) {
                    var62.field1548 = var61;
                    class43.method336(-1, var62);
                }
            } else if (var33 == 7) {
                class115 var42 = class384.method2387(false, (int) var34);
                boolean var43 = var32.field107 == 1;
                if (var43 != var42.field1489) {
                    var42.field1489 = var43;
                    class43.method336(~arg0, var42);
                }
            } else if (var33 == 8) {
                class115 var44 = class384.method2387(false, (int) var34);
                if (var32.field107 != var44.field1469 || var32.field104 != var44.field1449 || var32.field105 != var44.field1536) {
                    var44.field1469 = var32.field107;
                    var44.field1536 = var32.field105;
                    var44.field1449 = var32.field104;
                    if (var44.field1458 != -1) {
                        if (var44.field1508 > 0) {
                            var44.field1536 = var44.field1536 * 32 / var44.field1508;
                        } else if (var44.field1532 > 0) {
                            var44.field1536 = var44.field1536 * 32 / var44.field1532;
                        }
                    }
                    class43.method336(-1, var44);
                }
            } else if (var33 == 9) {
                class115 var56 = class384.method2387(false, (int) var34);
                if (var32.field107 != var56.field1458 || var32.field104 != var56.field1435) {
                    var56.field1435 = var32.field104;
                    var56.field1458 = var32.field107;
                    class43.method336(-1, var56);
                }
            } else if (var33 == 10) {
                class115 var45 = class384.method2387(false, (int) var34);
                if (var32.field107 != var45.field1417 || var32.field104 != var45.field1483 || var32.field105 != var45.field1535) {
                    var45.field1535 = var32.field105;
                    var45.field1483 = var32.field104;
                    var45.field1417 = var32.field107;
                    class43.method336(-1, var45);
                }
            } else if (var33 == 11) {
                class115 var46 = class384.method2387(false, (int) var34);
                var46.field1540 = 0;
                var46.field1534 = 0;
                var46.field1408 = var46.field1432 = var32.field107;
                var46.field1503 = var46.field1493 = var32.field104;
                class43.method336(-1, var46);
            } else if (var33 == 12) {
                class115 var47 = class384.method2387(false, (int) var34);
                int var48 = var32.field107;
                if (var47 != null && var47.field1564 == 0) {
                    if (var48 > (var47.field1422 - var47.field1517)) {
                        var48 = var47.field1422 - var47.field1517;
                    }
                    if (var48 < 0) {
                        var48 = 0;
                    }
                    if (var47.field1495 != var48) {
                        var47.field1495 = var48;
                        class43.method336(-1, var47);
                    }
                }
            } else if (var33 == 14) {
                class115 var55 = class384.method2387(false, (int) var34);
                var55.field1410 = var32.field107;
            } else if (var33 == 15) {
                class461.field6447 = var32.field104;
                class683.field9568 = var32.field107;
                class773.field10654 = true;
            } else if (var33 == 16) {
                class115 var54 = class384.method2387(false, (int) var34);
                var54.field1480 = var32.field107;
            } else if (var33 == 17) {
                class115 var53 = class384.method2387(false, (int) var34);
                var53.field1455 = var32.field107;
            } else if (var33 == 18) {
                class115 var49 = class384.method2387(false, (int) var34);
                int var50 = (int) (var34 >> 32);
                var49.method840(var50, (short) var32.field104, 21829, (short) var32.field107);
            } else if (var33 == 19) {
                class115 var51 = class384.method2387(false, (int) var34);
                int var52 = (int) (var34 >> 32);
                var51.method827(arg0 - 126, (short) var32.field104, var52, (short) var32.field107);
            }
        }
        if (class381.field5457 != 0) {
            class450.field6290 += 20;
            if (class450.field6290 >= 400) {
                class381.field5457 = 0;
            }
        }
        class510.field6925++;
        if (class775.field10679 != null) {
            class752.field10373++;
            if (class752.field10373 >= 15) {
                class43.method336(-1, class775.field10679);
                class775.field10679 = null;
            }
        }
        class475.field6583 = false;
        class86.field1036 = false;
        class378.field5431 = null;
        class31.field296 = null;
        class88.method655(null, -1, -1, arg0 ^ 0x43);
        class400.method2459(-1, -1, null, 5510);
        if (!class773.field10644) {
            class213.field2954 = -1;
        }
        class744.method4121((byte) -121);
        class453.field6312++;
        if (class718.field9945) {
            class81.field917++;
            class116 var64 = class248.method1672(class84.field1023, class666.field9357, arg0 - 20647);
            var64.field1575.method2996(class2.field14 << 28 | class4.field27 << 14 | class206.field2894, true);
            class443.method2655(0, var64);
            class718.field9945 = false;
        }
        while (true) {
            class114 var65;
            class115 var66;
            class115 var67;
            do {
                var65 = (class114) class485.field6704.method1034(20791);
                if (var65 == null) {
                    while (true) {
                        class114 var68;
                        class115 var69;
                        class115 var70;
                        do {
                            var68 = (class114) class194.field2593.method1034(20791);
                            if (var68 == null) {
                                while (true) {
                                    class114 var71;
                                    class115 var72;
                                    class115 var73;
                                    do {
                                        var71 = (class114) class495.field6812.method1034(20791);
                                        if (var71 == null) {
                                            if (class378.field5431 == null) {
                                                class559.field7871 = 0;
                                            }
                                            if (class81.field906 != null) {
                                                class570.method3356(-2);
                                            }
                                            if (class597.field8370 > 0 && class479.field6647.method273(82, Integer.MAX_VALUE) && class479.field6647.method273(81, Integer.MAX_VALUE) && class637.field8957 != 0) {
                                                int var74 = class724.field10031.field3467 - class637.field8957;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class250.method1680(class724.field10031.field9219[0] + class444.field6151, class236.field3535 - -class724.field10031.field9214[0], var74, (byte) -128);
                                            }
                                            class386.method2395(false);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class189.field2364[var75]++;
                                            }
                                            if (class489.field6728 && class669.field9370 < class683.method3903((byte) 4) - 60000L) {
                                                class775.method4276((byte) -21);
                                            }
                                            for (class666 var76 = (class666) class195.field2765.method3103((byte) 72); var76 != null; var76 = (class666) class195.field2765.method3104(arg0 - 10964)) {
                                                if (class683.method3903((byte) 4) / 1000L - 5L > (long) var76.field9356) {
                                                    if (var76.field9360 > 0) {
                                                        class727.method4042("", "", (byte) 55, "", 5, 0, var76.field9359 + class712.field9872.method3999(class553.field7667, (byte) -127));
                                                    }
                                                    if (var76.field9360 == 0) {
                                                        class727.method4042("", "", (byte) -87, "", 5, 0, var76.field9359 + class712.field9873.method3999(class553.field7667, (byte) -57));
                                                    }
                                                    var76.method2773(64);
                                                }
                                            }
                                            class673.field9452++;
                                            if (class673.field9452 > 500) {
                                                class673.field9452 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x4) == 4) {
                                                    class68.field748 += class5.field28;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class658.field9287 += class773.field10656;
                                                }
                                                if ((var77 & 0x1) == 1) {
                                                    class743.field10245 += class433.field6015;
                                                }
                                            }
                                            if (class743.field10245 < -50) {
                                                class433.field6015 = 2;
                                            }
                                            if (class658.field9287 < -55) {
                                                class773.field10656 = 2;
                                            }
                                            if (class743.field10245 > 50) {
                                                class433.field6015 = -2;
                                            }
                                            if (class658.field9287 > 55) {
                                                class773.field10656 = -2;
                                            }
                                            if (class68.field748 < -40) {
                                                class5.field28 = 1;
                                            }
                                            if (class68.field748 > 40) {
                                                class5.field28 = -1;
                                            }
                                            class761.field10446++;
                                            if (class761.field10446 > 500) {
                                                class761.field10446 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class686.field9577 += class692.field9666;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class703.field9795 += class464.field6473;
                                                }
                                            }
                                            if (class703.field9795 < -60) {
                                                class464.field6473 = 2;
                                            }
                                            if (class703.field9795 > 60) {
                                                class464.field6473 = -2;
                                            }
                                            if (class686.field9577 < -20) {
                                                class692.field9666 = 1;
                                            }
                                            class471.field6528++;
                                            if (class686.field9577 > 10) {
                                                class692.field9666 = -1;
                                            }
                                            if (class471.field6528 > 50) {
                                                class136.field1755++;
                                                class116 var79 = class248.method1672(class84.field1023, class727.field10053, -20647);
                                                class443.method2655(0, var79);
                                            }
                                            if (class194.field2491) {
                                                class194.method1195(false);
                                                class194.field2491 = false;
                                            }
                                            try {
                                                class581.method3420(0);
                                                return;
                                            } catch (IOException var80) {
                                                class380.method2371((byte) 111);
                                                return;
                                            }
                                        }
                                        var72 = var71.field1378;
                                        if (var72.field1482 < 0) {
                                            break;
                                        }
                                        var73 = class384.method2387(false, var72.field1436);
                                    } while (var73 == null || var73.field1394 == null || var72.field1482 >= var73.field1394.length || var73.field1394[var72.field1482] != var72);
                                    class700.method3959(var71);
                                }
                            }
                            var69 = var68.field1378;
                            if (var69.field1482 < 0) {
                                break;
                            }
                            var70 = class384.method2387(false, var69.field1436);
                        } while (var70 == null || var70.field1394 == null || var69.field1482 >= var70.field1394.length || var70.field1394[var69.field1482] != var69);
                        class700.method3959(var68);
                    }
                }
                var66 = var65.field1378;
                if (var66.field1482 < 0) {
                    break;
                }
                var67 = class384.method2387(false, var66.field1436);
            } while (var67 == null || var67.field1394 == null || var67.field1394.length <= var66.field1482 || var67.field1394[var66.field1482] != var66);
            class700.method3959(var65);
        }
    }
}
