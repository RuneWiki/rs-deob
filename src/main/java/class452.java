import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class452 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Lge;")
    private class511 field6596 = new class511(128);

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Lci;")
    private class320 field6594;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
    public static int[] field6599 = new int[3];

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Lqv;")
    public static class316 field6597 = new class316(21, 0);

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field6603 = 0;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field6604 = 0;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "[I")
    public static int[] field6602;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILuo;III)V")
    public static final void method2692(int arg0, class413 arg1, int arg2, int arg3, int arg4) {
        field6598++;
        long var5 = (long) (arg0 | arg2 << 14 | arg3 << 28);
        class203 var7 = (class203) class191.field2787.method2284(true, var5);
        if (var7 == null) {
            class203 var8 = new class203();
            class191.field2787.method2292(var5, var8, (byte) -128);
            var8.field3128.method866((byte) 10, arg1);
            return;
        }
        if (arg4 != 0) {
            field6599 = null;
        }
        class116 var9 = class58.field1052.method1646(21708, arg1.field5843);
        int var10 = var9.field1722;
        if (var9.field1742 == 1) {
            var10 = (arg1.field5841 + 1) * var10;
        }
        for (class413 var11 = (class413) var7.field3128.method863(arg4 - 1); var11 != null; var11 = (class413) var7.field3128.method865(-1)) {
            class116 var12 = class58.field1052.method1646(21708, var11.field5843);
            int var13 = var12.field1722;
            if (var12.field1742 == 1) {
                var13 = (var11.field5841 + 1) * var13;
            }
            if (var13 < var10) {
                class94.method724(arg1, (byte) -85, var11);
                return;
            }
        }
        var7.field3128.method866((byte) 10, arg1);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static final void method2693(int arg0) {
        if (arg0 == 11) {
            field6593++;
            class430.field6184 = 0;
            class258.field3829.method861(-1);
            class248.field3714 = false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public static void method2694(byte arg0) {
        field6602 = null;
        int var1 = 106 / ((-arg0 - 57) / 32);
        field6597 = null;
        field6599 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public static final void method2695(int arg0) {
        field6595++;
        if (class246.field3680 > 1) {
            class512.field7447 = class426.field6113;
            class246.field3680--;
        }
        if (class161.field2455) {
            class161.field2455 = false;
            class230.method1540(513);
            return;
        }
        if (!class248.field3714) {
            class136.method990(84);
        }
        for (int var1 = 0; var1 < 100 && class500.method2923((byte) -122); var1++) {
        }
        if (class37.field799 != 9) {
            return;
        }
        class329.method2079(class276.field4124, class491.field7080.method2728((byte) 24), arg0 ^ 0xFFFF947D);
        if (class368.field5312 == null) {
            if (class165.method1188((byte) 26) >= class73.field1194) {
                class368.field5312 = class370.field5337.method987(class474.field6918.field4009, arg0 - 1000);
            }
        } else if (class368.field5312.field5985 != -1) {
            class228.method1528(true, class116.field1801);
            class276.field4124.method3016(class368.field5312.field5985, -82);
            class368.field5312 = null;
            class73.field1194 = class165.method1188((byte) 26) + 30000L;
        }
        class191 var2 = (class191) class425.field6027.method863(arg0 - 1001);
        if (var2 != null || class332.field4918 < (class165.method1188((byte) 26) - 2000L)) {
            boolean var3 = false;
            int var4 = class276.field4124.field7558;
            for (class191 var5 = (class191) class154.field2340.method863(-1); var5 != null && (class276.field4124.field7558 - var4) < 240; var5 = (class191) class154.field2340.method865(arg0 ^ 0xFFFFFC17)) {
                var5.method421(22071);
                int var6 = var5.method1302(-6);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1301((byte) 39);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1302(-6) == -1 && var5.method1301((byte) 39) == -1) {
                    var8 = true;
                    var7 = -1;
                    var6 = -1;
                }
                if (class519.field7582 != var7 || class329.field4839 != var6) {
                    if (!var3) {
                        class87.field1411++;
                        class228.method1528(true, class87.field1409);
                        class276.field4124.method3048(-2034159384, 0);
                        var4 = class276.field4124.field7558;
                        var3 = true;
                    }
                    int var9 = var7 - class519.field7582;
                    class519.field7582 = var7;
                    int var10 = var6 - class329.field4839;
                    class329.field4839 = var6;
                    int var11 = (int) ((var5.method1303((byte) 126) - class332.field4918) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class276.field4124.method3016((var9 << 6) + (var11 << 12) + var10, -91);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var9 += 128;
                        class276.field4124.method3048(-2034159384, var11 + 128);
                        var10 += 128;
                        class276.field4124.method3016((var9 << 8) + var10, -27);
                    } else if (var11 >= 32) {
                        class276.field4124.method3016(var11 + 57344, -87);
                        if (var8) {
                            class276.field4124.method3019(Integer.MIN_VALUE, arg0 + 10648);
                        } else {
                            class276.field4124.method3019(var7 | var6 << 16, 11648);
                        }
                    } else {
                        class276.field4124.method3048(-2034159384, var11 + 192);
                        if (var8) {
                            class276.field4124.method3019(Integer.MIN_VALUE, 11648);
                        } else {
                            class276.field4124.method3019(var7 | var6 << 16, 11648);
                        }
                    }
                    class332.field4918 = var5.method1303((byte) 127);
                }
            }
            if (var3) {
                class276.field4124.method3025(class276.field4124.field7558 - var4, 77);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1303((byte) 126) - class311.field4596) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class311.field4596 = var2.method1303((byte) 125);
            int var14 = var2.method1302(-6);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1301((byte) 39);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1300(0) == 2) {
                var16 = 1;
            }
            class228.method1528(true, class288.field4272);
            class349.field5124++;
            int var17 = (int) var12;
            class276.field4124.method3068((byte) 57, var17 | var16 << 15);
            class276.field4124.method3020(-1022807024, var14 << 16 | var15);
        }
        if (class229.field3442 > 0) {
            class17.field189++;
            class228.method1528(true, class277.field4134);
            class276.field4124.method3048(-2034159384, class229.field3442 * 3);
            for (int var18 = 0; var18 < class229.field3442; var18++) {
                class454 var19 = class528.field7713[var18];
                long var20 = (var19.method2702(30636) - class511.field7425) / 50L;
                if (var20 > 65535L) {
                    var20 = 65535L;
                }
                class511.field7425 = var19.method2702(30636);
                class276.field4124.method3048(-2034159384, var19.method2703((byte) -104));
                class276.field4124.method3016((int) var20, -30);
            }
        }
        if (class141.field2177 > 0) {
            class141.field2177--;
        }
        if (class472.field6873 && class141.field2177 <= 0) {
            class472.field6873 = false;
            class92.field1480++;
            class141.field2177 = 20;
            class228.method1528(true, class250.field3724);
            class276.field4124.method3029(-125, (int) class524.field7655 >> 3);
            class276.field4124.method3068((byte) 57, (int) class508.field7354 >> 3);
        }
        if (class111.field1640 && !class246.field3677) {
            class246.field3677 = true;
            class503.field7259++;
            class228.method1528(true, class80.field1304);
            class276.field4124.method3048(-2034159384, 1);
        }
        if (!class111.field1640 && class246.field3677) {
            class246.field3677 = false;
            class503.field7259++;
            class228.method1528(true, class80.field1304);
            class276.field4124.method3048(arg0 ^ 0x86C13300, 0);
        }
        if (!class132.field2068) {
            class112.field1654++;
            class228.method1528(true, class261.field3861);
            class276.field4124.method3048(-2034159384, 0);
            int var22 = class276.field4124.field7558;
            class519 var23 = class220.field3371.method1051(false);
            class276.field4124.method3058(var23.field7545, (byte) 72, 0, var23.field7558);
            class276.field4124.method3025(class276.field4124.field7558 - var22, 123);
            class132.field2068 = true;
        }
        if (class461.field6675 != null) {
            if (class294.field4381 == 2) {
                class538.method3169(16383);
            } else if (class294.field4381 == 3) {
                class31.method173(-19900);
            }
        }
        if (class494.field7139) {
            class494.field7139 = false;
        } else {
            class253.field3748 /= 2.0F;
        }
        if (class141.field2180) {
            class141.field2180 = false;
        } else {
            class294.field4384 /= 2.0F;
        }
        class300.method1925(116);
        if (class37.field799 != 9) {
            return;
        }
        class96.method729((byte) -98);
        class89.method661(31444);
        class231.method1541((byte) 74);
        class270.method1756(false);
        class505.field7301++;
        if (class505.field7301 > 750) {
            class230.method1540(513);
            return;
        }
        class426.method2538(arg0 ^ 0xFFFFFC32);
        class230.method1533(arg0 ^ 0xFFFFD1D4);
        class441.method2598(arg0 ^ 0xFFFFFC68);
        for (int var24 = class84.field1335.method1954((byte) 125, true); var24 != -1; var24 = class84.field1335.method1954((byte) 123, false)) {
            class140.method1018(5737, var24);
            class446.field6366[class168.method1203(31, class313.field4671++)] = var24;
        }
        for (class275 var25 = class230.method1538((byte) -24); var25 != null; var25 = class230.method1538((byte) -89)) {
            int var26 = var25.method1772(0);
            int var27 = var25.method1775((byte) 74);
            if (var26 == 1) {
                class288.field4270[var27] = var25.field4113;
                class84.field1340 |= class388.field5517[var27];
                class297.field4441[class168.method1203(class447.field6385++, 31)] = var27;
            } else if (var26 == 2) {
                class259.field3838[var27] = var25.field4102;
                class25.field360[class168.method1203(class87.field1412++, 31)] = var27;
            } else if (var26 == 3) {
                class198 var49 = class154.method1087(var27, arg0 ^ 0x3EA);
                if (!var25.field4102.equals(var49.field2993)) {
                    var49.field2993 = var25.field4102;
                    class284.method1832(-17067, var49);
                }
            } else if (var26 == 4) {
                class198 var28 = class154.method1087(var27, 2);
                int var29 = var25.field4113;
                int var30 = var25.field4104;
                int var31 = var25.field4106;
                if (var28.field2959 != var29 || var28.field3005 != var30 || var28.field2937 != var31) {
                    var28.field2959 = var29;
                    var28.field3005 = var30;
                    var28.field2937 = var31;
                    class284.method1832(arg0 ^ 0xFFFFBEBD, var28);
                }
            } else if (var26 == 5) {
                class198 var48 = class154.method1087(var27, 2);
                if (var25.field4113 != var48.field2920 || var25.field4113 == -1) {
                    var48.field2920 = var25.field4113;
                    var48.field2975 = 0;
                    var48.field2900 = 1;
                    var48.field2935 = 0;
                    class284.method1832(-17067, var48);
                }
            } else if (var26 == 6) {
                int var32 = var25.field4113;
                int var33 = var32 >> 10 & 0x1F;
                int var34 = var32 >> 5 & 0x1F;
                int var35 = var32 & 0x1F;
                int var36 = (var34 << 11) + (var33 << 19) + (var35 << 3);
                class198 var37 = class154.method1087(var27, 2);
                if (var37.field2967 != var36) {
                    var37.field2967 = var36;
                    class284.method1832(-17067, var37);
                }
            } else if (var26 == 7) {
                class198 var46 = class154.method1087(var27, arg0 ^ 0x3EA);
                boolean var47 = var25.field4113 == 1;
                if (var46.field2977 != var47) {
                    var46.field2977 = var47;
                    class284.method1832(-17067, var46);
                }
            } else if (var26 == 8) {
                class198 var38 = class154.method1087(var27, 2);
                if (var25.field4113 != var38.field2948 || var25.field4104 != var38.field2972 || var25.field4106 != var38.field2906) {
                    var38.field2948 = var25.field4113;
                    var38.field2906 = var25.field4106;
                    var38.field2972 = var25.field4104;
                    if (var38.field2952 != -1) {
                        if (var38.field2892 > 0) {
                            var38.field2906 = var38.field2906 * 32 / var38.field2892;
                        } else if (var38.field2983 > 0) {
                            var38.field2906 = var38.field2906 * 32 / var38.field2983;
                        }
                    }
                    class284.method1832(-17067, var38);
                }
            } else if (var26 == 9) {
                class198 var39 = class154.method1087(var27, 2);
                if (var25.field4113 != var39.field2952 || var25.field4104 != var39.field2961) {
                    var39.field2961 = var25.field4104;
                    var39.field2952 = var25.field4113;
                    class284.method1832(-17067, var39);
                }
            } else if (var26 == 10) {
                class198 var40 = class154.method1087(var27, 2);
                if (var25.field4113 != var40.field2904 || var25.field4104 != var40.field3021 || var25.field4106 != var40.field3006) {
                    var40.field3021 = var25.field4104;
                    var40.field3006 = var25.field4106;
                    var40.field2904 = var25.field4113;
                    class284.method1832(-17067, var40);
                }
            } else if (var26 == 11) {
                class198 var45 = class154.method1087(var27, 2);
                var45.field2924 = var45.field3036 = var25.field4113;
                var45.field2914 = 0;
                var45.field2957 = var45.field3022 = var25.field4104;
                var45.field2912 = 0;
                class284.method1832(-17067, var45);
            } else if (var26 == 12) {
                class198 var43 = class154.method1087(var27, 2);
                int var44 = var25.field4113;
                if (var43 != null && var43.field2941 == 0) {
                    if (var44 > var43.field3045 - var43.field2988) {
                        var44 = var43.field3045 - var43.field2988;
                    }
                    if (var44 < 0) {
                        var44 = 0;
                    }
                    if (var43.field2898 != var44) {
                        var43.field2898 = var44;
                        class284.method1832(-17067, var43);
                    }
                }
            } else if (var26 == 14) {
                class198 var42 = class154.method1087(var27, 2);
                var42.field2970 = var25.field4113;
            } else if (var26 == 15) {
                class112.field1651 = var25.field4104;
                class17.field186 = var25.field4113;
                class121.field1890 = true;
            } else if (var26 == 16) {
                class198 var41 = class154.method1087(var27, 2);
                var41.field3034 = var25.field4113;
            }
        }
        if (class345.field5081 != 0) {
            class317.field4713 += 20;
            if (class317.field4713 >= 400) {
                class345.field5081 = 0;
            }
        }
        class163.field2465++;
        if (class214.field3230 != null) {
            class126.field1982++;
            if (class126.field1982 >= 15) {
                class284.method1832(-17067, class214.field3230);
                class214.field3230 = null;
            }
        }
        class80.field1302 = null;
        class506.field7305 = false;
        class320.field4773 = null;
        class477.field6949 = false;
        class293.method1891(-1, null, 127, -1);
        class19.method107(-1, -1, null, (byte) 83);
        if (!class219.field3351) {
            class276.field4122 = -1;
        }
        class277.method1781(-94);
        class426.field6113++;
        if (class400.field5683) {
            class228.method1528(true, class63.field1089);
            class228.field3435++;
            class276.field4124.method3020(-1022807024, class220.field3368 << 14 | class344.field5072 << 28 | class290.field4305);
            class400.field5683 = false;
        }
        while (true) {
            class361 var50;
            class198 var51;
            class198 var52;
            do {
                var50 = (class361) class360.field5235.method862(-91);
                if (var50 == null) {
                    while (true) {
                        class361 var53;
                        class198 var54;
                        class198 var55;
                        do {
                            var53 = (class361) class152.field2320.method862(-122);
                            if (var53 == null) {
                                while (true) {
                                    class361 var56;
                                    class198 var57;
                                    class198 var58;
                                    do {
                                        var56 = (class361) class287.field4256.method862(-90);
                                        if (var56 == null) {
                                            if (class80.field1302 == null) {
                                                class488.field7059 = 0;
                                            }
                                            if (class290.field4312 != null) {
                                                class18.method106((byte) -113);
                                            }
                                            if (class37.field791 > 0 && class218.field3339.method74(82, arg0 ^ 0x3A8) && class218.field3339.method74(81, 64) && class500.field7229 != 0) {
                                                int var59 = class364.field5293.field6956 - class500.field7229;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class329.method2081(class82.field1315 + class364.field5293.field343[0], var59, (byte) 105, class364.field5293.field344[0] + class501.field7240);
                                            }
                                            class131.method965(arg0 - 24701);
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class196.field2868[var60]++;
                                            }
                                            if (arg0 != 1000) {
                                                method2696(-22, -60, true);
                                            }
                                            if (class84.field1340 && class516.field7475 < (class165.method1188((byte) 26) - 60000L)) {
                                                class478.method2831((byte) 94);
                                            }
                                            for (class147 var61 = (class147) class247.field3688.method904(false); var61 != null; var61 = (class147) class247.field3688.method907(-1)) {
                                                if (((long) var61.field2269) < (class165.method1188((byte) 26) / 1000L - 5L)) {
                                                    if (var61.field2267 > 0) {
                                                        class10.method52("", 59, 5, var61.field2265 + class114.field1698.method426(class503.field7255, 106), "", 0);
                                                    }
                                                    if (var61.field2267 == 0) {
                                                        class10.method52("", arg0 - 901, 5, var61.field2265 + class540.field7952.method426(class503.field7255, 105), "", 0);
                                                    }
                                                    var61.method2429(arg0 - 883);
                                                }
                                            }
                                            class471.field6833++;
                                            if (class471.field6833 > 500) {
                                                class471.field6833 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x2) == 2) {
                                                    class342.field5053 += class220.field3373;
                                                }
                                                if ((var62 & 0x4) == 4) {
                                                    class505.field7304 += class128.field2003;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class319.field4735 += class77.field1264;
                                                }
                                            }
                                            if (class319.field4735 < -50) {
                                                class77.field1264 = 2;
                                            }
                                            if (class319.field4735 > 50) {
                                                class77.field1264 = -2;
                                            }
                                            if (class342.field5053 < -55) {
                                                class220.field3373 = 2;
                                            }
                                            if (class342.field5053 > 55) {
                                                class220.field3373 = -2;
                                            }
                                            if (class505.field7304 < -40) {
                                                class128.field2003 = 1;
                                            }
                                            class137.field2120++;
                                            if (class505.field7304 > 40) {
                                                class128.field2003 = -1;
                                            }
                                            if (class137.field2120 > 500) {
                                                class137.field2120 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class384.field5495 += class238.field3598;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class78.field1280 += class221.field3385;
                                                }
                                            }
                                            if (class78.field1280 < -60) {
                                                class221.field3385 = 2;
                                            }
                                            if (class78.field1280 > 60) {
                                                class221.field3385 = -2;
                                            }
                                            if (class384.field5495 < -20) {
                                                class238.field3598 = 1;
                                            }
                                            if (class384.field5495 > 10) {
                                                class238.field3598 = -1;
                                            }
                                            class97.field1534++;
                                            if (class97.field1534 > 50) {
                                                class496.field7173++;
                                                class228.method1528(true, class392.field5565);
                                            }
                                            if (class440.field6260) {
                                                class75.method582(9981);
                                                class440.field6260 = false;
                                            }
                                            try {
                                                if (class410.field5802 != null && class276.field4124.field7558 > 0) {
                                                    class76.field1255 += class276.field4124.field7558;
                                                    class410.field5802.method1296(class276.field4124.field7558, 0, 20188, class276.field4124.field7545);
                                                    class276.field4124.field7558 = 0;
                                                    class97.field1534 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class230.method1540(513);
                                                return;
                                            }
                                        }
                                        var57 = var56.field5252;
                                        if (var57.field2969 < 0) {
                                            break;
                                        }
                                        var58 = class154.method1087(var57.field3033, 2);
                                    } while (var58 == null || var58.field3013 == null || var58.field3013.length <= var57.field2969 || var58.field3013[var57.field2969] != var57);
                                    class281.method1805(var56);
                                }
                            }
                            var54 = var53.field5252;
                            if (var54.field2969 < 0) {
                                break;
                            }
                            var55 = class154.method1087(var54.field3033, 2);
                        } while (var55 == null || var55.field3013 == null || var54.field2969 >= var55.field3013.length || var55.field3013[var54.field2969] != var54);
                        class281.method1805(var53);
                    }
                }
                var51 = var50.field5252;
                if (var51.field2969 < 0) {
                    break;
                }
                var52 = class154.method1087(var51.field3033, arg0 - 998);
            } while (var52 == null || var52.field3013 == null || var51.field2969 >= var52.field3013.length || var52.field3013[var51.field2969] != var51);
            class281.method1805(var50);
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class452(class453 arg0, int arg1, class320 arg2) {
        this.field6594 = arg2;
        if (this.field6594 != null) {
            int var4 = this.field6594.method2033((byte) 60) - 1;
            this.field6594.method2030(-10914, var4);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)B")
    public static final byte method2696(int arg0, int arg1, boolean arg2) {
        field6600++;
        if (!arg2) {
            return -1;
        } else if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Lcq;")
    public final class333 method2697(int arg0, int arg1) {
        field6601++;
        class511 var3 = this.field6596;
        class333 var4;
        synchronized (this.field6596) {
            var4 = (class333) this.field6596.method2982(arg0 - 18782, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6594.method2037(class88.method657(arg1, (byte) 97), (byte) 76, class222.method1506((byte) 123, arg1));
        class333 var6 = new class333();
        if (var5 != null) {
            var6.method2118(new class519(var5), (byte) 59);
        }
        class511 var7 = this.field6596;
        synchronized (this.field6596) {
            this.field6596.method2981(var6, arg0 - 18687, (long) arg1);
            if (arg0 != 18782) {
                method2694((byte) -83);
            }
            return var6;
        }
    }
}
