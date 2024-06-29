import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class210 extends class134 {

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field3365 = -1;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public int field3372 = 0;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "[Z")
    public static boolean[] field3373;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    public static void method1488(int arg0) {
        if (arg0 >= 75) {
            field3373 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lpd;IIIIII)V")
    public static final void method1489(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class34.method198(arg1 - 10478, arg5, arg3, arg0.field836, arg2, arg6, 0, arg4, arg0.field850);
        if (arg1 == -1) {
            field3369++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static final void method1490(byte arg0) {
        class72.field1040.method1979(214094817);
        class202.field3238 = 1;
        if (arg0 < 93) {
            method1490((byte) 5);
        }
        class79.field1257 = null;
        field3375++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1491(int arg0, String arg1) {
        field3366++;
        String var2 = class137.method919(class294.method2051(arg0 ^ 0xFFFFAA36, arg1), 0);
        if (arg0 != 21950) {
            method1493(70);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public static final void method1492(byte arg0) {
        int var1 = -15 % ((arg0 + 53) / 61);
        class163.field2568 = new class281();
        field3371++;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        if (class296.field4871 > 1) {
            class296.field4871--;
            class96.field1419 = class40.field502;
        }
        if (class94.field1418 > 0) {
            class94.field1418--;
        }
        field3367++;
        if (class311.field5021) {
            class311.field5021 = false;
            class29.method173(40);
            return;
        }
        for (int var1 = 0; var1 < 100 && class171.method1126(103); var1++) {
        }
        if (class115.field1733 != 30) {
            return;
        }
        class219.method1535((byte) 102, class276.field4572, 120);
        Object var2 = class282.field4721.field1538;
        synchronized (class282.field4721.field1538) {
            if (!class56.field747) {
                class282.field4721.field1546 = 0;
            } else if (class102.field1548 != 0 || class282.field4721.field1546 >= 40) {
                class276.field4572.method1391(0, 160);
                class276.field4572.method1446((byte) 126, 0);
                class297.field4896++;
                int var3 = class276.field4572.field3272;
                int var4 = 0;
                for (int var5 = 0; class282.field4721.field1546 > var5 && class276.field4572.field3272 - var3 < 240; var5++) {
                    int var6 = class282.field4721.field1543[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    var4++;
                    int var7 = class282.field4721.field1545[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class282.field4721.field1543[var5] == -1 && class282.field4721.field1545[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class184.field2851 != var7 || class301.field4934 != var6) {
                        int var9 = var7 - class184.field2851;
                        class184.field2851 = var7;
                        int var10 = var6 - class301.field4934;
                        class301.field4934 = var6;
                        if (class266.field4379 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class276.field4572.method1412((var9 << 6) + (class266.field4379 << 12) + var10, false);
                            class266.field4379 = 0;
                        } else if (class266.field4379 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class276.field4572.method1446((byte) 36, class266.field4379 + 128);
                            var9 += 128;
                            class276.field4572.method1412((var9 << 8) + var10, false);
                            class266.field4379 = 0;
                        } else if (class266.field4379 < 32) {
                            class276.field4572.method1446((byte) 90, class266.field4379 + 192);
                            if (var8) {
                                class276.field4572.method1425(Integer.MIN_VALUE, (byte) -125);
                            } else {
                                class276.field4572.method1425(var6 << 16 | var7, (byte) -126);
                            }
                            class266.field4379 = 0;
                        } else {
                            class276.field4572.method1412(class266.field4379 + 57344, false);
                            if (var8) {
                                class276.field4572.method1425(Integer.MIN_VALUE, (byte) -122);
                            } else {
                                class276.field4572.method1425(var6 << 16 | var7, (byte) -125);
                            }
                            class266.field4379 = 0;
                        }
                    } else if (class266.field4379 < 2047) {
                        class266.field4379++;
                    }
                }
                class276.field4572.method1408((byte) 46, class276.field4572.field3272 - var3);
                if (class282.field4721.field1546 <= var4) {
                    class282.field4721.field1546 = 0;
                } else {
                    class282.field4721.field1546 -= var4;
                    for (int var11 = 0; var11 < class282.field4721.field1546; var11++) {
                        class282.field4721.field1545[var11] = class282.field4721.field1545[var4 + var11];
                        class282.field4721.field1543[var11] = class282.field4721.field1543[var4 + var11];
                    }
                }
            }
        }
        if (class102.field1548 != 0) {
            class114.field1728++;
            long var12 = (class92.field1408 - class100.field1511) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class199.field3158;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            class100.field1511 = class92.field1408;
            int var16 = class218.field3483;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var12;
            if (class102.field1548 == 2) {
                var15 = 1;
            }
            class276.field4572.method1391(0, 182);
            class276.field4572.method1448(var14 | var16 << 16, (byte) 82);
            class276.field4572.method1427(true, var15 << 15 | var17);
        }
        if (class110.field1679 > 0) {
            class110.field1679--;
        }
        if (class87.field1355 && class110.field1679 <= 0) {
            class110.field1679 = 20;
            class180.field2794++;
            class87.field1355 = false;
            class276.field4572.method1391(0, 199);
            class276.field4572.method1433((int) class79.field1255, (byte) 127);
            class276.field4572.method1427(true, (int) class202.field3253);
        }
        if (class304.field4968 && !class193.field3055) {
            class297.field4879++;
            class193.field3055 = true;
            class276.field4572.method1391(0, 64);
            class276.field4572.method1446((byte) 52, 1);
        }
        if (!class304.field4968 && class193.field3055) {
            class193.field3055 = false;
            class297.field4879++;
            class276.field4572.method1391(0, 64);
            class276.field4572.method1446((byte) 29, 0);
        }
        if (!class217.field3462) {
            class117.field1773++;
            class276.field4572.method1391(0, 72);
            class276.field4572.method1435(123, class284.method2005(true));
            class217.field3462 = true;
        }
        if (class284.field4754) {
            class284.field4754 = false;
        } else {
            class292.field4822 /= 2.0F;
        }
        if (class309.field5008) {
            class309.field5008 = false;
        } else {
            class295.field4847 /= 2.0F;
        }
        class161.method1064((byte) 24);
        if (class115.field1733 != 30) {
            return;
        }
        class265.method1830(-1);
        class163.method1082((byte) 113);
        class69.method438(-128);
        class310.field5016++;
        if (class310.field5016 > 750) {
            class29.method173(40);
            return;
        }
        class15.method100(-48);
        class118.method767(0);
        class161.method1068((byte) -121);
        for (int var18 = client.method1097((byte) -112, true); var18 != -1; var18 = client.method1097((byte) -105, false)) {
            class265.method1828(var18, true);
            class204.field3285[class10.method53(31, class84.field1333++)] = var18;
        }
        for (class36 var19 = class126.method841(87); var19 != null; var19 = class126.method841(74)) {
            int var20 = var19.method226(8);
            int var21 = var19.method223(5698);
            if (var20 == 1) {
                class19.field260[var21] = var19.field465;
                class181.field2807[class10.method53(class10.field134++, 31)] = var21;
            } else if (var20 == 2) {
                class16.field232[var21] = var19.field459;
                class103.field1557[class10.method53(class29.field374++, 31)] = var21;
            } else if (var20 == 3) {
                class254 var22 = class80.method534(-101, var21);
                if (!var19.field459.equals(var22.field4113)) {
                    var22.field4113 = var19.field459;
                    class58.method354(true, var22);
                }
            } else if (var20 == 4) {
                class254 var23 = class80.method534(-66, var21);
                int var24 = var19.field458;
                int var25 = var19.field465;
                int var26 = var19.field461;
                if (var23.field4054 != var25 || var23.field4073 != var24 || var23.field4064 != var26) {
                    var23.field4073 = var24;
                    var23.field4064 = var26;
                    var23.field4054 = var25;
                    class58.method354(true, var23);
                }
            } else if (var20 == 5) {
                class254 var27 = class80.method534(-126, var21);
                if (var19.field465 != var27.field4121 || var19.field465 == -1) {
                    var27.field4033 = 0;
                    var27.field4117 = 1;
                    var27.field4165 = 0;
                    var27.field4121 = var19.field465;
                    class58.method354(true, var27);
                }
            } else if (var20 == 6) {
                int var38 = var19.field465;
                int var39 = (var38 & 0x7D29) >> 10;
                int var40 = (var38 & 0x3E9) >> 5;
                class254 var41 = class80.method534(-29, var21);
                int var42 = var38 & 0x1F;
                int var43 = (var39 << 19) + (var40 << 11) + (var42 << 3);
                if (var41.field4075 != var43) {
                    var41.field4075 = var43;
                    class58.method354(true, var41);
                }
            } else if (var20 == 7) {
                class254 var28 = class80.method534(104, var21);
                boolean var29 = var19.field465 == 1;
                if (var28.field4049 != var29) {
                    var28.field4049 = var29;
                    class58.method354(true, var28);
                }
            } else if (var20 == 8) {
                class254 var37 = class80.method534(105, var21);
                if (var19.field465 != var37.field4139 || var19.field458 != var37.field4154 || var19.field461 != var37.field4093) {
                    var37.field4139 = var19.field465;
                    var37.field4154 = var19.field458;
                    var37.field4093 = var19.field461;
                    if (var37.field4174 != -1) {
                        if (var37.field4122 > 0) {
                            var37.field4093 = var37.field4093 * 32 / var37.field4122;
                        } else if (var37.field4105 > 0) {
                            var37.field4093 = var37.field4093 * 32 / var37.field4105;
                        }
                    }
                    class58.method354(true, var37);
                }
            } else if (var20 == 9) {
                class254 var30 = class80.method534(-56, var21);
                if (var19.field465 != var30.field4174 || var19.field458 != var30.field4183) {
                    var30.field4183 = var19.field458;
                    var30.field4174 = var19.field465;
                    class58.method354(true, var30);
                }
            } else if (var20 == 10) {
                class254 var36 = class80.method534(107, var21);
                if (var19.field465 != var36.field4047 || var19.field458 != var36.field4080 || var19.field461 != var36.field4191) {
                    var36.field4047 = var19.field465;
                    var36.field4080 = var19.field458;
                    var36.field4191 = var19.field461;
                    class58.method354(true, var36);
                }
            } else if (var20 == 11) {
                class254 var35 = class80.method534(121, var21);
                var35.field4200 = var35.field4178 = var19.field458;
                var35.field4074 = 0;
                var35.field4197 = var35.field4088 = var19.field465;
                var35.field4131 = 0;
                class58.method354(true, var35);
            } else if (var20 == 12) {
                class254 var33 = class80.method534(-40, var21);
                int var34 = var19.field465;
                if (var33 != null && var33.field4052 == 0) {
                    if (var33.field4081 - var33.field4152 < var34) {
                        var34 = var33.field4081 - var33.field4152;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field4125 != var34) {
                        var33.field4125 = var34;
                        class58.method354(true, var33);
                    }
                }
            } else if (var20 == 13) {
                class254 var32 = class80.method534(91, var21);
                var32.field4163 = var19.field465;
            } else if (var20 == 14) {
                class254 var31 = class80.method534(99, var21);
                var31.field4188 = var19.field465;
            }
        }
        if (class229.field3657 != 0) {
            class280.field4639 += 20;
            if (class280.field4639 >= 400) {
                class229.field3657 = 0;
            }
        }
        class247.field3938++;
        if (class74.field1175 != null) {
            class310.field5011++;
            if (class310.field5011 >= 15) {
                class58.method354(true, class74.field1175);
                class74.field1175 = null;
            }
        }
        if (class156.field2470 != null) {
            class58.method354(true, class156.field2470);
            class162.field2546++;
            if (class1.field1 > (class36.field471 + 5) || class36.field471 - 5 > class1.field1 || class60.field924 > (class146.field2305 + 5) || (class146.field2305 - 5) > class60.field924) {
                class275.field4547 = true;
            }
            if (class109.field1669 == 0) {
                if (class275.field4547 && class162.field2546 >= 5) {
                    if (class218.field3480 == class156.field2470 && class64.field957 != class135.field2112) {
                        class314.field5069++;
                        class254 var44 = class156.field2470;
                        byte var45 = 0;
                        if (class35.field435 == 1 && var44.field4060 == 206) {
                            var45 = 1;
                        }
                        if (var44.field4068[class64.field957] <= 0) {
                            var45 = 0;
                        }
                        if (client.method1085(var44).method1653(-100)) {
                            int var46 = class64.field957;
                            int var47 = class135.field2112;
                            var44.field4068[var46] = var44.field4068[var47];
                            var44.field4021[var46] = var44.field4021[var47];
                            var44.field4068[var47] = -1;
                            var44.field4021[var47] = 0;
                        } else if (var45 == 1) {
                            int var48 = class135.field2112;
                            int var49 = class64.field957;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var44.method1766(var48, var48 - 1, (byte) -60);
                                    var48--;
                                } else if (var49 > var48) {
                                    var44.method1766(var48, var48 + 1, (byte) -60);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method1766(class135.field2112, class64.field957, (byte) -60);
                        }
                        class276.field4572.method1391(0, 215);
                        class276.field4572.method1407(var45, false);
                        class276.field4572.method1448(class156.field2470.field4077, (byte) -112);
                        class276.field4572.method1452(-10615, class135.field2112);
                        class276.field4572.method1412(class64.field957, false);
                    }
                } else if ((class258.field4246 == 1 || class144.method969(class18.field251 - 1, -1)) && class18.field251 > 2) {
                    class90.method581(1);
                } else if (class18.field251 > 0) {
                    class121.method791((byte) 104);
                }
                class102.field1548 = 0;
                class310.field5011 = 10;
                class156.field2470 = null;
            }
        }
        class115.field1744 = false;
        class85.field1348 = 0;
        class254 var50 = class217.field3458;
        class254 var51 = class156.field2471;
        class314.field5063 = null;
        class217.field3458 = null;
        class156.field2471 = null;
        class197.field3131 = false;
        while (class58.method359(false) && class85.field1348 < 128) {
            class248.field3944[class85.field1348] = class264.field4355;
            class259.field4256[class85.field1348] = class242.field3823;
            class85.field1348++;
        }
        class175.field2741 = null;
        if (class160.field2523 != -1) {
            class14.method87(0, 0, class79.field1254, 0, class160.field2523, 0, false, class169.field2644);
        }
        class40.field502++;
        if (class175.field2741 != null) {
            class195.method1349(11505);
        }
        while (true) {
            class298 var52;
            class254 var53;
            class254 var54;
            do {
                var52 = (class298) class24.field311.method1960((byte) -123);
                if (var52 == null) {
                    while (true) {
                        class298 var55;
                        class254 var56;
                        class254 var57;
                        do {
                            var55 = (class298) class154.field2405.method1960((byte) -98);
                            if (var55 == null) {
                                while (true) {
                                    class298 var58;
                                    class254 var59;
                                    class254 var60;
                                    do {
                                        var58 = (class298) class276.field4573.method1960((byte) -118);
                                        if (var58 == null) {
                                            if (class175.field2741 == null) {
                                                class242.field3837 = 0;
                                            }
                                            if (class138.field2135 != null) {
                                                class130.method860(3);
                                            }
                                            if (class37.field484 > 0 && class3.field26[82] && class3.field26[81] && class150.field2332 != 0) {
                                                int var61 = class165.field2600 - class150.field2332;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class209.method1482(class309.field5006.field849[0] + class101.field1517, var61, 63, class309.field5006.field804[0] + class254.field4063);
                                            }
                                            if (class37.field484 > 0 && class3.field26[82] && class3.field26[81]) {
                                                if (class74.field1138 != -1) {
                                                    class209.method1482(class74.field1138 + class101.field1517, class165.field2600, 63, class254.field4063 + class299.field4912);
                                                }
                                                class301.field4937 = 0;
                                                class183.field2849 = 0;
                                            } else if (class183.field2849 == 2) {
                                                if (class74.field1138 != -1) {
                                                    class14.field206++;
                                                    class276.field4572.method1391(0, 195);
                                                    class276.field4572.method1433(class268.field4398, (byte) 113);
                                                    class276.field4572.method1452(-10615, class254.field4063 + class299.field4912);
                                                    class276.field4572.method1435(114, class84.field1334);
                                                    class276.field4572.method1412(class74.field1138 + class101.field1517, false);
                                                    class47.field648 = class199.field3158;
                                                    class156.field2474 = class218.field3483;
                                                    class229.field3657 = 1;
                                                    class280.field4639 = 0;
                                                }
                                                class183.field2849 = 0;
                                            } else if (class301.field4937 == 2) {
                                                if (class74.field1138 != -1) {
                                                    class276.field4572.method1391(0, 105);
                                                    class276.field4572.method1433(class74.field1138 + class101.field1517, (byte) 124);
                                                    class276.field4572.method1412(class299.field4912 + class254.field4063, false);
                                                    class229.field3657 = 1;
                                                    class280.field4639 = 0;
                                                    class156.field2474 = class218.field3483;
                                                    class47.field648 = class199.field3158;
                                                    class118.field1798++;
                                                }
                                                class301.field4937 = 0;
                                            } else if (class74.field1138 != -1 && class183.field2849 == 0 && class301.field4937 == 0) {
                                                int var62 = (class74.field1138 << 1) + 1 - class309.field5006.method362(25892) >> 1;
                                                int var63 = (class299.field4912 << 1) + 1 - class309.field5006.method362(25892) >> 1;
                                                class86.method572(0, (byte) 79, var63, var62);
                                                class47.field648 = class199.field3158;
                                                class280.field4639 = 0;
                                                class156.field2474 = class218.field3483;
                                                class229.field3657 = 1;
                                                class105.method678(class309.field5006.field849[0], 0, true, 0, 0, (byte) 127, 0, class309.field5006.field804[0], var63, var62, 0);
                                            }
                                            class74.field1138 = -1;
                                            class198.method1369((byte) 48);
                                            if (class217.field3458 != var50) {
                                                if (var50 != null) {
                                                    class58.method354(true, var50);
                                                }
                                                if (class217.field3458 != null) {
                                                    class58.method354(true, class217.field3458);
                                                }
                                            }
                                            if (class156.field2471 != var51 && class283.field4733 == class230.field3664) {
                                                if (var51 != null) {
                                                    class58.method354(true, var51);
                                                }
                                                if (class156.field2471 != null) {
                                                    class58.method354(true, class156.field2471);
                                                }
                                            }
                                            if (class156.field2471 == null) {
                                                if (class230.field3664 > 0) {
                                                    class230.field3664--;
                                                }
                                            } else if (class230.field3664 < class283.field4733) {
                                                class230.field3664++;
                                                if (class283.field4733 == class230.field3664) {
                                                    class58.method354(true, class156.field2471);
                                                }
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class314.field5064[var64]++;
                                            }
                                            int var65 = class242.method1701((byte) 53);
                                            int var66 = class2.method4(37);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class22.field283++;
                                                class94.field1418 = 250;
                                                class230.method1618(14500, 0);
                                                class276.field4572.method1391(0, 30);
                                            }
                                            if (class104.field1569 != null && class104.field1569.field725 == 1) {
                                                if (class104.field1569.field723 != null) {
                                                    class182.method1210(class300.field4929, true, class212.field3387);
                                                }
                                                class212.field3387 = false;
                                                class104.field1569 = null;
                                                class300.field4929 = null;
                                            }
                                            class241.field3813++;
                                            if (arg0 < 42) {
                                                field3373 = null;
                                            }
                                            class286.field4775++;
                                            class247.field3935++;
                                            if (class247.field3935 > 500) {
                                                class247.field3935 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class130.field1993 += class139.field2158;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class128.field1974 += class160.field2521;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class8.field75 += class186.field2888;
                                                }
                                            }
                                            if (class130.field1993 < -55) {
                                                class139.field2158 = 2;
                                            }
                                            if (class286.field4775 > 500) {
                                                class286.field4775 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class265.field4365 += class252.field3999;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class262.field4330 += class105.field1579;
                                                }
                                            }
                                            if (class130.field1993 > 55) {
                                                class139.field2158 = -2;
                                            }
                                            if (class265.field4365 < -20) {
                                                class252.field3999 = 1;
                                            }
                                            if (class128.field1974 < -40) {
                                                class160.field2521 = 1;
                                            }
                                            if (class128.field1974 > 40) {
                                                class160.field2521 = -1;
                                            }
                                            if (class265.field4365 > 10) {
                                                class252.field3999 = -1;
                                            }
                                            if (class8.field75 < -50) {
                                                class186.field2888 = 2;
                                            }
                                            if (class8.field75 > 50) {
                                                class186.field2888 = -2;
                                            }
                                            if (class262.field4330 < -60) {
                                                class105.field1579 = 2;
                                            }
                                            if (class262.field4330 > 60) {
                                                class105.field1579 = -2;
                                            }
                                            if (class241.field3813 > 50) {
                                                class276.field4572.method1391(0, 164);
                                                class22.field287++;
                                            }
                                            if (class52.field709) {
                                                class134.method902(98);
                                                class52.field709 = false;
                                            }
                                            try {
                                                if (class103.field1551 != null && class276.field4572.field3272 > 0) {
                                                    class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                                                    class241.field3813 = 0;
                                                    class276.field4572.field3272 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class29.method173(40);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4906;
                                        if (var59.field4040 < 0) {
                                            break;
                                        }
                                        var60 = class80.method534(124, var59.field4167);
                                    } while (var60 == null || var60.field4123 == null || var60.field4123.length <= var59.field4040 || var60.field4123[var59.field4040] != var59);
                                    class126.method844(200000, var58);
                                }
                            }
                            var56 = var55.field4906;
                            if (var56.field4040 < 0) {
                                break;
                            }
                            var57 = class80.method534(115, var56.field4167);
                        } while (var57 == null || var57.field4123 == null || var56.field4040 >= var57.field4123.length || var57.field4123[var56.field4040] != var56);
                        class126.method844(200000, var55);
                    }
                }
                var53 = var52.field4906;
                if (var53.field4040 < 0) {
                    break;
                }
                var54 = class80.method534(-30, var53.field4167);
            } while (var54 == null || var54.field4123 == null || var54.field4123.length <= var53.field4040 || var54.field4123[var53.field4040] != var53);
            class126.method844(200000, var52);
        }
    }
}
