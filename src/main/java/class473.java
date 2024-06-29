import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class473 extends class504 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[B")
    public byte[] field6335;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[Lwo;")
    public static class696[] field6330 = new class696[14];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lmga;")
    public static class666 field6331 = new class666(64);

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method2663(boolean arg0) {
        class664.field9426 = 0;
        field6333++;
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class131.field2156[var1] = null;
            class425.field5841[var1] = 1;
            class541.field7123[var1] = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V")
    public static final void method2664(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -19) {
            return;
        }
        if (arg2 > arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class236.field3325[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class236.field3325[var6][arg1] = arg4;
            }
        }
        field6332++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method2665(int arg0) {
        if (arg0 <= 54) {
            field6334 = -81;
        }
        field6331 = null;
        field6330 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method2666(byte arg0) {
        if (class108.field1587 > 1) {
            class301.field4203 = class367.field4959;
            class108.field1587--;
        }
        field6329++;
        if (class627.field8464) {
            class627.field8464 = false;
            class70.method545(-118);
            return;
        }
        if (!class388.field5142) {
            class51.method346(true);
        }
        for (int var1 = 0; var1 < 100 && class672.method3764(14097); var1++) {
        }
        if (class32.field525 != 10) {
            return;
        }
        while (class511.method2844(-55)) {
            class402 var2 = class390.method2252(class125.field2087, -85, class262.field3644);
            var2.field5354.method1980(-345277664, 0);
            int var3 = var2.field5354.field4619;
            class19.method191(126, var2.field5354);
            var2.field5354.method2047(var2.field5354.field4619 - var3, 0);
            class36.method278(0, var2);
        }
        if (class388.field5140 == null) {
            if (class681.method3802(-23600) >= class657.field8965) {
                class388.field5140 = class216.field3081.method1184((byte) 110, class214.field3059.field2957);
            }
        } else if (class388.field5140.field9706 != -1) {
            class402 var4 = class390.method2252(class78.field1225, -82, class262.field3644);
            var4.field5354.method2031((byte) 54, class388.field5140.field9706);
            class36.method278(0, var4);
            class388.field5140 = null;
            class657.field8965 = class681.method3802(-23600) + 30000L;
        }
        class458 var5 = (class458) class399.field5298.method3257(-127);
        if (var5 != null || class681.method3802(-23600) - 2000L > class20.field320) {
            class402 var6 = null;
            int var7 = 0;
            for (class458 var8 = (class458) class674.field9534.method3257(-11); var8 != null && (var6 == null || var6.field5354.field4619 - var7 < 240); var8 = (class458) class674.field9534.method3263((byte) -85)) {
                var8.method2797(48);
                int var9 = var8.method1654((byte) 96);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1650(0);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class176.field2710 != var10 || class576.field7611 != var9) {
                    if (var6 == null) {
                        class533.field7083++;
                        var6 = class390.method2252(class18.field295, -113, class262.field3644);
                        var6.field5354.method1980(-345277664, 0);
                        var7 = var6.field5354.field4619;
                    }
                    int var11 = var10 - class176.field2710;
                    class176.field2710 = var10;
                    int var12 = var9 - class576.field7611;
                    class576.field7611 = var9;
                    int var13 = (int) ((var8.method1651((byte) 113) - class20.field320) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field5354.method2031((byte) 54, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var12 += 128;
                        var6.field5354.method1980(-345277664, var13 + 128);
                        var6.field5354.method2031((byte) 54, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field5354.method1980(-345277664, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field5354.method1982(Integer.MIN_VALUE, (byte) 63);
                        } else {
                            var6.field5354.method1982(var9 << 16 | var10, (byte) 63);
                        }
                    } else {
                        var6.field5354.method2031((byte) 54, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field5354.method1982(Integer.MIN_VALUE, (byte) 63);
                        } else {
                            var6.field5354.method1982(var9 << 16 | var10, (byte) 63);
                        }
                    }
                    class20.field320 = var8.method1651((byte) 127);
                }
            }
            if (var6 != null) {
                var6.field5354.method2047(var6.field5354.field4619 - var7, 0);
                class36.method278(0, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1651((byte) 91) - class24.field410) / 50L;
            class24.field410 = var5.method1651((byte) 83);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1654((byte) 96);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1650(0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1649(-20210) == 2) {
                var18 = 1;
            }
            class201.field2936++;
            int var19 = (int) var14;
            class402 var20 = class390.method2252(class383.field5114, -88, class262.field3644);
            var20.field5354.method2003(var19 | var18 << 15, 16777216);
            var20.field5354.method1982(var16 << 16 | var17, (byte) 63);
            class36.method278(0, var20);
        }
        if (class386.field5134 > 0) {
            class685.field9635++;
            class402 var21 = class390.method2252(class158.field2496, -91, class262.field3644);
            var21.field5354.method1980(-345277664, class386.field5134 * 3);
            for (int var22 = 0; var22 < class386.field5134; var22++) {
                class293 var23 = class548.field7318[var22];
                long var24 = (var23.method1808(false) - class296.field4181) / 50L;
                class296.field4181 = var23.method1808(false);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field5354.method1980(-345277664, var23.method1809(13772));
                var21.field5354.method2031((byte) 54, (int) var24);
            }
            class36.method278(0, var21);
        }
        if (class30.field487 > 0) {
            class30.field487--;
        }
        if (class457.field6204 && class30.field487 <= 0) {
            class457.field6204 = false;
            class676.field9561++;
            class30.field487 = 20;
            class402 var26 = class390.method2252(class633.field8511, -98, class262.field3644);
            var26.field5354.method2030((int) class463.field6263 >> 3, 127);
            var26.field5354.method2003((int) class42.field602 >> 3, 16777216);
            class36.method278(0, var26);
        }
        if (class327.field4515 != class277.field3867) {
            class327.field4515 = class277.field3867;
            class171.field2637++;
            class402 var27 = class390.method2252(class366.field4947, -81, class262.field3644);
            var27.field5354.method1980(-345277664, class277.field3867 ? 1 : 0);
            class36.method278(0, var27);
        }
        if (!class268.field3740) {
            class540.field7115++;
            class402 var28 = class390.method2252(class217.field3090, -87, class262.field3644);
            var28.field5354.method1980(-345277664, 0);
            int var29 = var28.field5354.field4619;
            class335 var30 = new class335(class561.method3085(-1));
            class344.field4718.method2325(var30, 1);
            var28.field5354.method2004(255, var30.field4600, 0, var30.field4619);
            var28.field5354.method2047(var28.field5354.field4619 - var29, 0);
            class36.method278(0, var28);
            class268.field3740 = true;
        }
        if (class703.field9899 != null) {
            if (class140.field2254 == 2) {
                class409.method2345(15393);
            } else if (class140.field2254 == 3) {
                class438.method2492((byte) -79);
            }
        }
        if (class576.field7613) {
            class576.field7613 = false;
        } else {
            class432.field5908 /= 2.0F;
        }
        if (class253.field3477) {
            class253.field3477 = false;
        } else {
            class344.field4710 /= 2.0F;
        }
        class258.method1585(79);
        if (class32.field525 != 10) {
            return;
        }
        class627.method3454(13133);
        class18.method185((byte) -127);
        class588.method3237(127);
        class640.method3531(22202);
        class396.field5263++;
        if (arg0 < 63) {
            method2664(31, -87, 98, (byte) -40, -51);
        }
        if (class396.field5263 > 750) {
            class70.method545(-119);
            return;
        }
        class115.method916(11);
        class278.method1730((byte) 95);
        class259.method1588((byte) 102);
        for (int var31 = class80.field1261.method1360(-28, true); var31 != -1; var31 = class80.field1261.method1360(-93, false)) {
            class513.method2855(var31, 4);
            class77.field1208[class571.method3139(31, class575.field7602++)] = var31;
        }
        for (class382 var32 = class322.method1956((byte) 101); var32 != null; var32 = class322.method1956((byte) 109)) {
            int var33 = var32.method2229(122);
            int var34 = var32.method2233(true);
            if (var33 == 1) {
                class476.field6352[var34] = var32.field5099;
                class193.field2825 |= class690.field9711[var34];
                class340.field4702[class571.method3139(31, class224.field3157++)] = var34;
            } else if (var33 == 2) {
                class138.field2228[var34] = var32.field5103;
                class311.field4282[class571.method3139(31, class586.field7775++)] = var34;
            } else if (var33 == 3) {
                class625 var57 = class153.method1078(65535, var34);
                if (!var32.field5103.equals(var57.field8343)) {
                    var57.field8343 = var32.field5103;
                    class463.method2624(false, var57);
                }
            } else if (var33 == 4) {
                class625 var35 = class153.method1078(65535, var34);
                int var36 = var32.field5099;
                int var37 = var32.field5106;
                int var38 = var32.field5104;
                if (var35.field8294 != var36 || var35.field8401 != var37 || var35.field8309 != var38) {
                    var35.field8309 = var38;
                    var35.field8401 = var37;
                    var35.field8294 = var36;
                    class463.method2624(false, var35);
                }
            } else if (var33 == 5) {
                class625 var55 = class153.method1078(65535, var34);
                if (var32.field5099 != var55.field8377 || var32.field5099 == -1) {
                    var55.field8377 = var32.field5099;
                    var55.field8439 = 0;
                    var55.field8321 = 0;
                    var55.field8372 = 1;
                    class616 var56 = var55.field8377 == -1 ? null : class636.field8570.method231(var55.field8377, -11764);
                    if (var56 != null) {
                        class595.method3280(var55.field8321, false, var56);
                    }
                    class463.method2624(false, var55);
                }
            } else if (var33 == 6) {
                int var49 = var32.field5099;
                int var50 = (var49 & 0x7FA5) >> 10;
                int var51 = (var49 & 0x3ED) >> 5;
                int var52 = var49 & 0x1F;
                int var53 = (var50 << 19) + (var51 << 11) + (var52 << 3);
                class625 var54 = class153.method1078(65535, var34);
                if (var54.field8392 != var53) {
                    var54.field8392 = var53;
                    class463.method2624(false, var54);
                }
            } else if (var33 == 7) {
                class625 var39 = class153.method1078(65535, var34);
                boolean var40 = var32.field5099 == 1;
                if (var39.field8432 != var40) {
                    var39.field8432 = var40;
                    class463.method2624(false, var39);
                }
            } else if (var33 == 8) {
                class625 var41 = class153.method1078(65535, var34);
                if (var32.field5099 != var41.field8292 || var32.field5106 != var41.field8373 || var32.field5104 != var41.field8332) {
                    var41.field8332 = var32.field5104;
                    var41.field8373 = var32.field5106;
                    var41.field8292 = var32.field5099;
                    if (var41.field8403 != -1) {
                        if (var41.field8411 > 0) {
                            var41.field8332 = var41.field8332 * 32 / var41.field8411;
                        } else if (var41.field8443 > 0) {
                            var41.field8332 = var41.field8332 * 32 / var41.field8443;
                        }
                    }
                    class463.method2624(false, var41);
                }
            } else if (var33 == 9) {
                class625 var48 = class153.method1078(65535, var34);
                if (var32.field5099 != var48.field8403 || var32.field5106 != var48.field8367) {
                    var48.field8367 = var32.field5106;
                    var48.field8403 = var32.field5099;
                    class463.method2624(false, var48);
                }
            } else if (var33 == 10) {
                class625 var47 = class153.method1078(65535, var34);
                if (var32.field5099 != var47.field8353 || var32.field5106 != var47.field8354 || var32.field5104 != var47.field8346) {
                    var47.field8353 = var32.field5099;
                    var47.field8354 = var32.field5106;
                    var47.field8346 = var32.field5104;
                    class463.method2624(false, var47);
                }
            } else if (var33 == 11) {
                class625 var46 = class153.method1078(65535, var34);
                var46.field8293 = 0;
                var46.field8305 = 0;
                var46.field8317 = var46.field8349 = var32.field5106;
                var46.field8312 = var46.field8297 = var32.field5099;
                class463.method2624(false, var46);
            } else if (var33 == 12) {
                class625 var44 = class153.method1078(65535, var34);
                int var45 = var32.field5099;
                if (var44 != null && var44.field8421 == 0) {
                    if (var45 > var44.field8364 - var44.field8361) {
                        var45 = var44.field8364 - var44.field8361;
                    }
                    if (var45 < 0) {
                        var45 = 0;
                    }
                    if (var44.field8441 != var45) {
                        var44.field8441 = var45;
                        class463.method2624(false, var44);
                    }
                }
            } else if (var33 == 14) {
                class625 var43 = class153.method1078(65535, var34);
                var43.field8289 = var32.field5099;
            } else if (var33 == 15) {
                class227.field3199 = true;
                class476.field6353 = var32.field5106;
                class123.field2061 = var32.field5099;
            } else if (var33 == 16) {
                class625 var42 = class153.method1078(65535, var34);
                var42.field8356 = var32.field5099;
            }
        }
        if (class427.field5862 != 0) {
            class115.field1974 += 20;
            if (class115.field1974 >= 400) {
                class427.field5862 = 0;
            }
        }
        class104.field1561++;
        if (class207.field2981 != null) {
            class458.field6219++;
            if (class458.field6219 >= 15) {
                class463.method2624(false, class207.field2981);
                class207.field2981 = null;
            }
        }
        class155.field2439 = null;
        class233.field3270 = false;
        class484.field6543 = null;
        class704.field9907 = false;
        class575.method3150(null, 5952, -1, -1);
        class585.method3218(null, -1, -2, -1);
        if (!class400.field5305) {
            class428.field5883 = -1;
        }
        class116.method920(11651);
        class367.field4959++;
        if (class263.field3656) {
            class381.field5090++;
            class402 var58 = class390.method2252(class128.field2146, -91, class262.field3644);
            var58.field5354.method2002((byte) 125, class690.field9714 | class251.field3461 << 28 | class226.field3193 << 14);
            class36.method278(0, var58);
            class263.field3656 = false;
        }
        while (true) {
            class48 var59;
            class625 var60;
            class625 var61;
            do {
                var59 = (class48) class697.field9793.method3262(-116);
                if (var59 == null) {
                    while (true) {
                        class48 var62;
                        class625 var63;
                        class625 var64;
                        do {
                            var62 = (class48) class16.field247.method3262(-123);
                            if (var62 == null) {
                                while (true) {
                                    class48 var65;
                                    class625 var66;
                                    class625 var67;
                                    do {
                                        var65 = (class48) class46.field658.method3262(-123);
                                        if (var65 == null) {
                                            if (class155.field2439 == null) {
                                                class562.field7461 = 0;
                                            }
                                            if (class109.field1591 != null) {
                                                class315.method1879((byte) 99);
                                            }
                                            if (class150.field2398 > 0 && class561.field7444.method3271(82, 0) && class561.field7444.method3271(81, 0) && class36.field551 != 0) {
                                                int var68 = class199.field2897.field8609 - class36.field551;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class247.method1516((byte) -44, class233.field3269 + class199.field2897.field5649[0], var68, class199.field2897.field5643[0] + field6334);
                                            }
                                            class656.method3590(10);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class460.field6243[var69]++;
                                            }
                                            if (class193.field2825 && class615.field8139 < (class681.method3802(-23600) - 60000L)) {
                                                class177.method1190(0);
                                            }
                                            for (class266 var70 = (class266) class530.field7061.method328(0); var70 != null; var70 = (class266) class530.field7061.method331((byte) -127)) {
                                                if (class681.method3802(-23600) / 1000L - 5L > (long) var70.field3697) {
                                                    if (var70.field3691 > 0) {
                                                        class135.method1011("", "", var70.field3695 + class72.field1083.method546(class516.field6892, (byte) -35), 5, "", 0, -98);
                                                    }
                                                    if (var70.field3691 == 0) {
                                                        class135.method1011("", "", var70.field3695 + class72.field1084.method546(class516.field6892, (byte) -35), 5, "", 0, -104);
                                                    }
                                                    var70.method2787(false);
                                                }
                                            }
                                            class70.field1050++;
                                            if (class70.field1050 > 500) {
                                                class70.field1050 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x4) == 4) {
                                                    class256.field3549 += class490.field6612;
                                                }
                                                if ((var71 & 0x1) == 1) {
                                                    class283.field4005 += class366.field4954;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class696.field9769 += class260.field3577;
                                                }
                                            }
                                            if (class283.field4005 < -50) {
                                                class366.field4954 = 2;
                                            }
                                            if (class696.field9769 < -55) {
                                                class260.field3577 = 2;
                                            }
                                            if (class283.field4005 > 50) {
                                                class366.field4954 = -2;
                                            }
                                            if (class256.field3549 < -40) {
                                                class490.field6612 = 1;
                                            }
                                            if (class696.field9769 > 55) {
                                                class260.field3577 = -2;
                                            }
                                            if (class256.field3549 > 40) {
                                                class490.field6612 = -1;
                                            }
                                            class190.field2802++;
                                            if (class190.field2802 > 500) {
                                                class190.field2802 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class588.field7795 += class230.field3224;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class376.field5073 += class360.field4869;
                                                }
                                            }
                                            if (class588.field7795 < -60) {
                                                class230.field3224 = 2;
                                            }
                                            if (class376.field5073 < -20) {
                                                class360.field4869 = 1;
                                            }
                                            if (class588.field7795 > 60) {
                                                class230.field3224 = -2;
                                            }
                                            class592.field7835++;
                                            if (class376.field5073 > 10) {
                                                class360.field4869 = -1;
                                            }
                                            if (class592.field7835 > 50) {
                                                class643.field8631++;
                                                class402 var73 = class390.method2252(class586.field7770, -104, class262.field3644);
                                                class36.method278(0, var73);
                                            }
                                            if (class527.field7028) {
                                                class699.method3866(false);
                                                class527.field7028 = false;
                                            }
                                            try {
                                                class179.method1200(70);
                                                return;
                                            } catch (IOException var74) {
                                                class70.method545(-116);
                                                return;
                                            }
                                        }
                                        var66 = var65.field692;
                                        if (var66.field8418 < 0) {
                                            break;
                                        }
                                        var67 = class153.method1078(65535, var66.field8288);
                                    } while (var67 == null || var67.field8420 == null || var66.field8418 >= var67.field8420.length || var67.field8420[var66.field8418] != var66);
                                    class544.method3013(var65);
                                }
                            }
                            var63 = var62.field692;
                            if (var63.field8418 < 0) {
                                break;
                            }
                            var64 = class153.method1078(65535, var63.field8288);
                        } while (var64 == null || var64.field8420 == null || var64.field8420.length <= var63.field8418 || var64.field8420[var63.field8418] != var63);
                        class544.method3013(var62);
                    }
                }
                var60 = var59.field692;
                if (var60.field8418 < 0) {
                    break;
                }
                var61 = class153.method1078(65535, var60.field8288);
            } while (var61 == null || var61.field8420 == null || var60.field8418 >= var61.field8420.length || var61.field8420[var60.field8418] != var60);
            class544.method3013(var59);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
    public class473(byte[] arg0) {
        this.field6335 = arg0;
    }
}
