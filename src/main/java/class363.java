import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public abstract class class363 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field5180 = 0;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field5184 = 1;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "F")
    public static float field5185;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "F")
    public static float field5186;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Lft;")
    public static class4 field5182;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2203(int arg0) {
        if (class593.field8378 > 1) {
            class24.field331 = field5184;
            class593.field8378--;
        }
        field5183++;
        if (class48.field839) {
            class48.field839 = false;
            class421.method2529((byte) 80);
            return;
        }
        if (!class623.field8731) {
            class21.method262((byte) -8);
        }
        for (int var1 = 0; var1 < 100 && class124.method943(-113); var1++) {
        }
        if (class420.field6113 != 10) {
            return;
        }
        while (class390.method2402(0)) {
            class135 var2 = class688.method3794(class19.field218, class583.field8198, (byte) 38);
            var2.field1978.method3853((byte) 51, 0);
            int var3 = var2.field1978.field9761;
            class495.method2862(var2.field1978, -13654);
            var2.field1978.method3867(var2.field1978.field9761 - var3, (byte) -14);
            class19.method223(var2, 0);
        }
        if (class303.field4517 == null) {
            if (class542.field7610 <= class490.method2840(true)) {
                class303.field4517 = class578.field8142.method64(true, class228.field3284.field4948);
            }
        } else if (class303.field4517.field5075 != -1) {
            class135 var4 = class688.method3794(class98.field1548, class583.field8198, (byte) 38);
            var4.field1978.method3852(false, class303.field4517.field5075);
            class19.method223(var4, 0);
            class303.field4517 = null;
            class542.field7610 = class490.method2840(true) + 30000L;
        }
        class356 var5 = (class356) class691.field9713.method472((byte) -49);
        if (var5 != null || class490.method2840(true) - 2000L > class671.field9493) {
            class135 var6 = null;
            int var7 = 0;
            for (class356 var8 = (class356) class630.field8810.method472((byte) -109); var8 != null && (var6 == null || (var6.field1978.field9761 - var7) < 240); var8 = (class356) class630.field8810.method482(-53)) {
                var8.method3678(arg0 ^ 0x849);
                int var9 = var8.method1032((byte) 15);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1031((byte) 103);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class330.field4883 != var10 || class637.field9002 != var9) {
                    if (var6 == null) {
                        class525.field7405++;
                        var6 = class688.method3794(class313.field4630, class583.field8198, (byte) 38);
                        var6.field1978.method3853((byte) 51, 0);
                        var7 = var6.field1978.field9761;
                    }
                    int var11 = var10 - class330.field4883;
                    class330.field4883 = var10;
                    int var12 = var9 - class637.field9002;
                    class637.field9002 = var9;
                    int var13 = (int) ((var8.method1028(false) - class671.field9493) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field1978.method3852(false, (var13 << 12) + (var11 << 6) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var11 += 128;
                        var6.field1978.method3853((byte) 51, var13 + 128);
                        var6.field1978.method3852(false, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field1978.method3852(false, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1978.method3868(Integer.MIN_VALUE, -318419336);
                        } else {
                            var6.field1978.method3868(var9 << 16 | var10, arg0 ^ 0x12FAB9CE);
                        }
                    } else {
                        var6.field1978.method3853((byte) 51, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1978.method3868(Integer.MIN_VALUE, -318419336);
                        } else {
                            var6.field1978.method3868(var9 << 16 | var10, -318419336);
                        }
                    }
                    class671.field9493 = var8.method1028(false);
                }
            }
            if (var6 != null) {
                var6.field1978.method3867(var6.field1978.field9761 - var7, (byte) -122);
                class19.method223(var6, arg0 + 2122);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1028(false) - class160.field2309) / 50L;
            class160.field2309 = var5.method1028(false);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1032((byte) 15);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1031((byte) 108);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1030(arg0 ^ 0xFFFFF7D7) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class210.field2936++;
            class135 var20 = class688.method3794(class411.field5995, class583.field8198, (byte) 38);
            var20.field1978.method3816(var19 | var18 << 15, -111);
            var20.field1978.method3849(var16 << 16 | var17, (byte) -39);
            class19.method223(var20, 0);
        }
        if (class22.field300 > 0) {
            class176.field2502++;
            class135 var21 = class688.method3794(class519.field7318, class583.field8198, (byte) 38);
            var21.field1978.method3853((byte) 51, class22.field300 * 3);
            for (int var22 = 0; var22 < class22.field300; var22++) {
                class121 var23 = class431.field6314[var22];
                long var24 = (var23.method922(125) - class351.field5072) / 50L;
                class351.field5072 = var23.method922(arg0 + 2237);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field1978.method3853((byte) 51, var23.method920((byte) -114));
                var21.field1978.method3852(false, (int) var24);
            }
            class19.method223(var21, 0);
        }
        if (class188.field2707 > 0) {
            class188.field2707--;
        }
        if (class700.field9892 && class188.field2707 <= 0) {
            class188.field2707 = 20;
            class700.field9892 = false;
            class535.field7506++;
            class135 var26 = class688.method3794(class315.field4667, class583.field8198, (byte) 38);
            var26.field1978.method3865(arg0 - 1449380238, (int) class630.field8811 >> 3);
            var26.field1978.method3852(false, (int) class105.field1635 >> 3);
            class19.method223(var26, 0);
        }
        if (class67.field1229 != class484.field6877) {
            class484.field6877 = class67.field1229;
            class420.field6110++;
            class135 var27 = class688.method3794(class645.field9060, class583.field8198, (byte) 38);
            var27.field1978.method3853((byte) 51, class67.field1229 ? 1 : 0);
            class19.method223(var27, arg0 + 2122);
        }
        if (!class227.field3189) {
            class428.field6287++;
            class135 var28 = class688.method3794(class591.field8274, class583.field8198, (byte) 38);
            var28.field1978.method3853((byte) 51, 0);
            int var29 = var28.field1978.field9761;
            class695 var30 = new class695(class383.method2295((byte) -28));
            class287.field4270.method1619(var30, (byte) -64);
            var28.field1978.method3857(7010, var30.field9761, var30.field9796, 0);
            var28.field1978.method3867(var28.field1978.field9761 - var29, (byte) -61);
            class19.method223(var28, arg0 ^ 0xFFFFF7B6);
            class227.field3189 = true;
        }
        if (class153.field2210 != null) {
            if (class43.field700 == 2) {
                class51.method575((byte) 16);
            } else if (class43.field700 == 3) {
                class623.method3465(28519);
            }
        }
        if (class438.field6398) {
            class438.field6398 = false;
        } else {
            class290.field4303 /= 2.0F;
        }
        if (class553.field7840) {
            class553.field7840 = false;
        } else {
            class706.field9931 /= 2.0F;
        }
        class389.method2397(false);
        if (class420.field6113 != 10) {
            return;
        }
        class424.method2542((byte) 25);
        class36.method424((byte) 5);
        class645.method3582(-122);
        class500.field7082++;
        if (class500.field7082 > 750) {
            class421.method2529((byte) 80);
            return;
        }
        class19.method220(-122);
        class499.method2886(0);
        class242.method1645(true);
        for (int var31 = class61.field1163.method1728(false, true); var31 != -1; var31 = class61.field1163.method1728(false, false)) {
            class295.method1857((byte) 68, var31);
            class321.field4724[class689.method3797(class674.field9522++, 31)] = var31;
        }
        if (arg0 != -2122) {
            method2203(97);
        }
        for (class191 var32 = class586.method3320(1391); var32 != null; var32 = class586.method3320(1391)) {
            int var33 = var32.method1286(2);
            int var34 = var32.method1290(8);
            if (var33 == 1) {
                class524.field7403[var34] = var32.field2754;
                class52.field1042 |= class591.field8281[var34];
                class26.field389[class689.method3797(31, class64.field1199++)] = var34;
            } else if (var33 == 2) {
                class119.field1807[var34] = var32.field2752;
                class196.field2801[class689.method3797(class147.field2159++, 31)] = var34;
            } else if (var33 == 3) {
                class49 var35 = class534.method3038(-100, var34);
                if (!var32.field2752.equals(var35.field950)) {
                    var35.field950 = var32.field2752;
                    class563.method3215(true, var35);
                }
            } else if (var33 == 4) {
                class49 var54 = class534.method3038(-87, var34);
                int var55 = var32.field2754;
                int var56 = var32.field2760;
                int var57 = var32.field2755;
                if (var54.field927 != var55 || var54.field1004 != var56 || var54.field902 != var57) {
                    var54.field902 = var57;
                    var54.field927 = var55;
                    var54.field1004 = var56;
                    class563.method3215(true, var54);
                }
            } else if (var33 == 5) {
                class49 var36 = class534.method3038(-108, var34);
                if (var32.field2754 != var36.field895 || var32.field2754 == -1) {
                    var36.field870 = 0;
                    var36.field942 = 1;
                    var36.field886 = 0;
                    var36.field895 = var32.field2754;
                    class30 var37 = var36.field895 == -1 ? null : class188.field2708.method2140(var36.field895, 123);
                    if (var37 != null) {
                        class207.method1372(var37, 5121, var36.field886);
                    }
                    class563.method3215(true, var36);
                }
            } else if (var33 == 6) {
                int var38 = var32.field2754;
                int var39 = (var38 & 0x7CF3) >> 10;
                int var40 = var38 >> 5 & 0x1F;
                int var41 = var38 & 0x1F;
                int var42 = (var41 << 3) + (var39 << 19) + (var40 << 11);
                class49 var43 = class534.method3038(-97, var34);
                if (var43.field972 != var42) {
                    var43.field972 = var42;
                    class563.method3215(true, var43);
                }
            } else if (var33 == 7) {
                class49 var44 = class534.method3038(arg0 + 2029, var34);
                boolean var45 = var32.field2754 == 1;
                if (var45 != var44.field937) {
                    var44.field937 = var45;
                    class563.method3215(true, var44);
                }
            } else if (var33 == 8) {
                class49 var46 = class534.method3038(-123, var34);
                if (var32.field2754 != var46.field913 || var32.field2760 != var46.field1011 || var32.field2755 != var46.field923) {
                    var46.field1011 = var32.field2760;
                    var46.field913 = var32.field2754;
                    var46.field923 = var32.field2755;
                    if (var46.field1023 != -1) {
                        if (var46.field938 > 0) {
                            var46.field923 = var46.field923 * 32 / var46.field938;
                        } else if (var46.field975 > 0) {
                            var46.field923 = var46.field923 * 32 / var46.field975;
                        }
                    }
                    class563.method3215(true, var46);
                }
            } else if (var33 == 9) {
                class49 var47 = class534.method3038(-113, var34);
                if (var32.field2754 != var47.field1023 || var32.field2760 != var47.field1017) {
                    var47.field1023 = var32.field2754;
                    var47.field1017 = var32.field2760;
                    class563.method3215(true, var47);
                }
            } else if (var33 == 10) {
                class49 var48 = class534.method3038(-97, var34);
                if (var32.field2754 != var48.field954 || var32.field2760 != var48.field859 || var32.field2755 != var48.field858) {
                    var48.field858 = var32.field2755;
                    var48.field859 = var32.field2760;
                    var48.field954 = var32.field2754;
                    class563.method3215(true, var48);
                }
            } else if (var33 == 11) {
                class49 var49 = class534.method3038(-120, var34);
                var49.field873 = 0;
                var49.field940 = 0;
                var49.field957 = var49.field869 = var32.field2754;
                var49.field920 = var49.field926 = var32.field2760;
                class563.method3215(true, var49);
            } else if (var33 == 12) {
                class49 var50 = class534.method3038(-103, var34);
                int var51 = var32.field2754;
                if (var50 != null && var50.field980 == 0) {
                    if (var51 > var50.field921 - var50.field877) {
                        var51 = var50.field921 - var50.field877;
                    }
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (var50.field891 != var51) {
                        var50.field891 = var51;
                        class563.method3215(true, var50);
                    }
                }
            } else if (var33 == 14) {
                class49 var52 = class534.method3038(arg0 + 2008, var34);
                var52.field908 = var32.field2754;
            } else if (var33 == 15) {
                class674.field9547 = var32.field2760;
                class627.field8775 = true;
                class535.field7508 = var32.field2754;
            } else if (var33 == 16) {
                class49 var53 = class534.method3038(arg0 + 2017, var34);
                var53.field889 = var32.field2754;
            }
        }
        if (class574.field8079 != 0) {
            class141.field2080 += 20;
            if (class141.field2080 >= 400) {
                class574.field8079 = 0;
            }
        }
        class312.field4621++;
        if (class80.field1358 != null) {
            class108.field1667++;
            if (class108.field1667 >= 15) {
                class563.method3215(true, class80.field1358);
                class80.field1358 = null;
            }
        }
        class372.field5312 = false;
        class382.field5392 = null;
        class20.field231 = null;
        class593.field8367 = false;
        class488.method2835(null, -1, -1, (byte) 95);
        class213.method1412(-1, 109, null, -1);
        if (!class245.field3797) {
            class190.field2750 = -1;
        }
        class321.method2008(1295);
        field5184++;
        if (class608.field8556) {
            class512.field7197++;
            class135 var58 = class688.method3794(class108.field1665, class583.field8198, (byte) 38);
            var58.field1978.method3849(class636.field8998 | class249.field3866 << 14 | class389.field5776 << 28, (byte) -39);
            class19.method223(var58, 0);
            class608.field8556 = false;
        }
        while (true) {
            class14 var59;
            class49 var60;
            class49 var61;
            do {
                var59 = (class14) class467.field6719.method483((byte) -128);
                if (var59 == null) {
                    while (true) {
                        class14 var62;
                        class49 var63;
                        class49 var64;
                        do {
                            var62 = (class14) class475.field6773.method483((byte) -117);
                            if (var62 == null) {
                                while (true) {
                                    class14 var65;
                                    class49 var66;
                                    class49 var67;
                                    do {
                                        var65 = (class14) class293.field4324.method483((byte) -126);
                                        if (var65 == null) {
                                            if (class382.field5392 == null) {
                                                class83.field1375 = 0;
                                            }
                                            if (class648.field9107 != null) {
                                                class592.method3346(arg0 ^ 0xFFFFF73B);
                                            }
                                            if (class558.field7877 > 0 && class603.field8514.method1364(true, 82) && class603.field8514.method1364(true, 81) && class691.field9722 != 0) {
                                                int var68 = class648.field9106.field3019 - class691.field9722;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class85.method748((byte) 111, class648.field9106.field6271[0] + class109.field1672, var68, class203.field2874 + class648.field9106.field6262[0]);
                                            }
                                            class666.method3685(arg0 + 2242);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class271.field4079[var69]++;
                                            }
                                            if (class52.field1042 && class580.field8175 < (class490.method2840(true) - 60000L)) {
                                                class436.method2598(arg0 + 2087);
                                            }
                                            for (class330 var70 = (class330) class600.field8482.method2417(false); var70 != null; var70 = (class330) class600.field8482.method2414(true)) {
                                                if (class490.method2840(true) / 1000L - 5L > (long) var70.field4878) {
                                                    if (var70.field4879 > 0) {
                                                        class376.method2265(5, 0, "", "", (byte) -122, "", var70.field4881 + class274.field4135.method1804(arg0 ^ 0xFFFFEBB1, class512.field7203));
                                                    }
                                                    if (var70.field4879 == 0) {
                                                        class376.method2265(5, 0, "", "", (byte) -123, "", var70.field4881 + class274.field4136.method1804(7175, class512.field7203));
                                                    }
                                                    var70.method3414(0);
                                                }
                                            }
                                            class86.field1410++;
                                            if (class86.field1410 > 500) {
                                                class86.field1410 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x1) == 1) {
                                                    class633.field8937 += class88.field1471;
                                                }
                                                if ((var71 & 0x2) == 2) {
                                                    class239.field3735 += class98.field1549;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class433.field6338 += class333.field4946;
                                                }
                                            }
                                            if (class633.field8937 < -50) {
                                                class88.field1471 = 2;
                                            }
                                            if (class633.field8937 > 50) {
                                                class88.field1471 = -2;
                                            }
                                            if (class239.field3735 < -55) {
                                                class98.field1549 = 2;
                                            }
                                            if (class239.field3735 > 55) {
                                                class98.field1549 = -2;
                                            }
                                            if (class433.field6338 < -40) {
                                                class333.field4946 = 1;
                                            }
                                            if (class433.field6338 > 40) {
                                                class333.field4946 = -1;
                                            }
                                            class592.field8364++;
                                            if (class592.field8364 > 500) {
                                                class592.field8364 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class252.field3880 += class505.field7142;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class287.field4280 += class491.field6958;
                                                }
                                            }
                                            if (class252.field3880 < -60) {
                                                class505.field7142 = 2;
                                            }
                                            if (class252.field3880 > 60) {
                                                class505.field7142 = -2;
                                            }
                                            if (class287.field4280 < -20) {
                                                class491.field6958 = 1;
                                            }
                                            if (class287.field4280 > 10) {
                                                class491.field6958 = -1;
                                            }
                                            class66.field1222++;
                                            if (class66.field1222 > 50) {
                                                class345.field5040++;
                                                class135 var73 = class688.method3794(class351.field5066, class583.field8198, (byte) 38);
                                                class19.method223(var73, 0);
                                            }
                                            if (class330.field4882) {
                                                class455.method2684((byte) 12);
                                                class330.field4882 = false;
                                            }
                                            try {
                                                class475.method2788(0);
                                                return;
                                            } catch (IOException var74) {
                                                class421.method2529((byte) 80);
                                                return;
                                            }
                                        }
                                        var66 = var65.field129;
                                        if (var66.field914 < 0) {
                                            break;
                                        }
                                        var67 = class534.method3038(-103, var66.field885);
                                    } while (var67 == null || var67.field1014 == null || var66.field914 >= var67.field1014.length || var67.field1014[var66.field914] != var66);
                                    class220.method1443(var65);
                                }
                            }
                            var63 = var62.field129;
                            if (var63.field914 < 0) {
                                break;
                            }
                            var64 = class534.method3038(arg0 + 2031, var63.field885);
                        } while (var64 == null || var64.field1014 == null || var63.field914 >= var64.field1014.length || var64.field1014[var63.field914] != var63);
                        class220.method1443(var62);
                    }
                }
                var60 = var59.field129;
                if (var60.field914 < 0) {
                    break;
                }
                var61 = class534.method3038(-109, var60.field885);
            } while (var61 == null || var61.field1014 == null || var60.field914 >= var61.field1014.length || var61.field1014[var60.field914] != var60);
            class220.method1443(var59);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 868)
    public static void method2204(byte arg0) {
        if (arg0 >= 55) {
            field5182 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)V", line = 878)
    public static final void method2205(byte arg0, int arg1) {
        field5181++;
        if (arg0 != -81) {
            field5185 = 1.0778495F;
        }
        class191 var2 = class6.method38(4, -72, arg1);
        var2.method1284((byte) -74);
    }
}
