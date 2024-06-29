import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lfg;")
    public static class83 field152 = new class83("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "Lfg;")
    public static class83 field162 = new class83(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lfg;")
    public static class83 field163 = new class83("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "F")
    public static float field164;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Lte;")
    public static class435 field161;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "[I")
    public static int[] field159;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILgf;)V")
    public static final void method108(int arg0, int arg1, int arg2, class180 arg3) {
        class61 var4 = class176.method1082(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field824 = arg3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method109(int arg0) {
        field159 = null;
        field161 = null;
        if (arg0 == -1) {
            field162 = null;
            field152 = null;
            field163 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII[Lss;IIII)V")
    public static final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, class295[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field153++;
        class418.field6109.method462(arg7, arg0, arg1, arg3);
        if (arg8 > -78) {
            field163 = null;
        }
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class295 var11 = arg5[var10];
            if (var11 != null && (var11.field3988 == arg2 || arg2 == -1412584499 && class292.field3914 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class113.field1527[class196.field2829].setBounds(var11.field4063 + arg9, var11.field3982 + arg4, var11.field4022, var11.field3960);
                    var12 = class196.field2829++;
                } else {
                    var12 = arg6;
                }
                var11.field3958 = class393.field5484;
                var11.field3956 = var12;
                if (!client.method1202(var11)) {
                    if (var11.field3995 != 0) {
                        class408.method2355(var11, 116);
                    }
                    int var13 = var11.field4063 + arg9;
                    int var14 = var11.field3982 + arg4;
                    int var15 = var11.field3940;
                    if (class476.field6973 && (client.method1191(var11).field2833 != 0 || var11.field3984 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class292.field3914 == var11) {
                        if (arg2 != -1412584499 && (class78.field1123 == var11.field4079 || class500.field7353 == var11.field4079)) {
                            class433.field6313 = arg4;
                            class499.field7347 = arg9;
                            class385.field5412 = arg5;
                            continue;
                        }
                        if (class153.field2174 && class23.field378) {
                            int var16 = class332.field4528.method54(80);
                            int var17 = class332.field4528.method55((byte) -117);
                            int var18 = var16 - class119.field1629;
                            int var19 = var17 - class278.field3763;
                            if (var18 < class49.field667) {
                                var18 = class49.field667;
                            }
                            if (var19 < class191.field2690) {
                                var19 = class191.field2690;
                            }
                            if ((class49.field667 + class177.field2509.field4022) < (var18 + var11.field4022)) {
                                var18 = class49.field667 + class177.field2509.field4022 - var11.field4022;
                            }
                            var13 = var18;
                            if (class191.field2690 + class177.field2509.field3960 < var11.field3960 + var19) {
                                var19 = class177.field2509.field3960 + class191.field2690 - var11.field3960;
                            }
                            var14 = var19;
                        }
                        if (class500.field7353 == var11.field4079) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3984 == 2) {
                        var20 = arg7;
                        var21 = arg0;
                        var22 = arg1;
                        var23 = arg3;
                    } else {
                        int var24 = var11.field4022 + var13;
                        int var25 = var11.field3960 + var14;
                        var21 = var14 <= arg0 ? arg0 : var14;
                        if (var11.field3984 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var13 <= arg7 ? arg7 : var13;
                        var22 = var24 >= arg1 ? arg1 : var24;
                        var23 = var25 < arg3 ? var25 : arg3;
                    }
                    if (var22 > var20 && var23 > var21) {
                        if (var11.field3995 != 0) {
                            if (class496.field7306 == var11.field3995 || class242.field3369 == var11.field3995) {
                                class255.method1498(var11.field3960, var13, -97, var11.field4022, var14, class242.field3369 == var11.field3995);
                                class451.field6504[var12] = true;
                                class418.field6109.method462(arg7, arg0, arg1, arg3);
                                continue;
                            }
                            if (class162.field2313 == var11.field3995) {
                                if (var11.method1690(-1, class418.field6109) != null) {
                                    class503.method2959(false);
                                    class510.method2994(var13, var14, var11, (byte) -65, class418.field6109);
                                    class9.field83[var12] = true;
                                    class418.field6109.method462(arg7, arg0, arg1, arg3);
                                }
                                continue;
                            }
                            if (class415.field6084 == var11.field3995) {
                                if (var11.method1690(-1, class418.field6109) != null) {
                                    class384.method2207((byte) -108, var11, var13, var14);
                                    class9.field83[var12] = true;
                                    class418.field6109.method462(arg7, arg0, arg1, arg3);
                                }
                                continue;
                            }
                            if (class246.field3432 == var11.field3995) {
                                class446.method2639(var11.field3960, class418.field6109, var13, class456.field6677, -101, var14, var11.field4022);
                                class451.field6504[var12] = true;
                                class418.field6109.method462(arg7, arg0, arg1, arg3);
                                continue;
                            }
                            if (class18.field193 == var11.field3995) {
                                class3.method23(var11.field3960, class418.field6109, var11.field4022, var14, (byte) 53, var13);
                                class451.field6504[var12] = true;
                                class418.field6109.method462(arg7, arg0, arg1, arg3);
                                continue;
                            }
                            if (class157.field2241 == var11.field3995) {
                                if (!class433.field6302 && !class176.field2503) {
                                    continue;
                                }
                                int var26 = var13 + var11.field4022;
                                int var27 = var14 + 15;
                                if (class433.field6302) {
                                    class117.field1579.method2890(-1, "Fps:" + class20.field214, -256, var27, var26, -4907);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class117.field1579.method2890(-1, "Mem:" + var29 + "k", var30, var27, var26, -4907);
                                    var27 += 15;
                                    class117.field1579.method2890(-1, "In:" + class473.field6910 + "B/s Out:" + class61.field838 + "B/s", -256, var27, var26, -4907);
                                    var27 += 15;
                                    int var31 = class418.field6109.method484() / 1024;
                                    class117.field1579.method2890(-1, "Offheap:" + var31 + "k", var31 <= 65536 ? -256 : -65536, var27, var26, -4907);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class14.field165[var35].method3041(0);
                                        var33 += class14.field165[var35].method3037(true);
                                        var34 += class14.field165[var35].method3034((byte) 39);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class463.method2723(true, true, (long) var37, 0, 2) + "% (" + var36 + "%)";
                                    class176.field2505.method2890(-1, var38, -256, var27, var26, -4907);
                                    var27 += 12;
                                }
                                if (class119.field1620 > 0) {
                                    class176.field2505.method2890(-1, "Particles: " + class282.field3810 + " / " + class119.field1620, -256, var27, var26, -4907);
                                }
                                var27 += 12;
                                if (class176.field2503) {
                                    class176.field2505.method2890(-1, "Polys: " + class418.field6109.method509() + " Models: " + class418.field6109.method432(), -256, var27, var26, -4907);
                                    var27 += 12;
                                    class176.field2505.method2890(-1, "Ls: " + class299.field4113 + " La: " + class461.field6709 + " NPC: " + class66.field917 + " Pl: " + class100.field1370, -256, var27, var26, -4907);
                                    class173.method1070(-110);
                                    var27 += 12;
                                }
                                class451.field6504[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3984 == 0) {
                            if (class299.field4116 == var11.field3995 && class418.field6109.method474()) {
                                class418.field6109.method493(var13, var14, var11.field4022, var11.field3960);
                            }
                            method110(var21, var22, var11.field4073, var23, var14 - var11.field3977, arg5, var12, var20, -85, var13 - var11.field3968);
                            if (var11.field4050 != null) {
                                method110(var21, var22, var11.field4073, var23, var14 - var11.field3977, var11.field4050, var12, var20, -120, var13 - var11.field3968);
                            }
                            class14 var39 = (class14) class269.field3690.method979((byte) 28, (long) var11.field4073);
                            if (var39 != null) {
                                class87.method610(var23, var20, var14, var12, var21, var22, var39.field167, (byte) -91, var13);
                            }
                            if (class299.field4116 == var11.field3995 && class418.field6109.method474()) {
                                class418.field6109.method505();
                                class81.field1147 = true;
                            }
                            class418.field6109.method462(arg7, arg0, arg1, arg3);
                        }
                        if (class501.field7378[var12] || class477.field6977 > 1) {
                            if (var11.field3984 == 3) {
                                if (var15 == 0) {
                                    if (var11.field4010) {
                                        class418.field6109.method459(var13, var14, var11.field4022, var11.field3960, var11.field3925, 0);
                                    } else {
                                        class418.field6109.method431(var13, var14, var11.field4022, var11.field3960, var11.field3925, 0);
                                    }
                                } else if (var11.field4010) {
                                    class418.field6109.method459(var13, var14, var11.field4022, var11.field3960, var11.field3925 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class418.field6109.method431(var13, var14, var11.field4022, var11.field3960, var11.field3925 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field3984 == 4) {
                                class490 var40 = var11.method1683((byte) -109, class418.field6109);
                                if (var40 != null) {
                                    int var41 = var11.field3925;
                                    String var42 = var11.field3961;
                                    if (var11.field4072 != -1) {
                                        class316 var43 = class75.field1097.method823(false, var11.field4072);
                                        var42 = var43.field4345;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field4392 == 1 || var11.field3981 != 1) && var11.field3981 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class401.method2329(var11.field3981, -880);
                                        }
                                    }
                                    if (class347.field4748 == var11) {
                                        var42 = class139.field1986.method590(class105.field1434, -22602);
                                        var41 = var11.field3925;
                                    }
                                    if (class184.field2577) {
                                        class418.field6109.method516(var13, var14, var13 + var11.field4022, var14 - -var11.field3960);
                                    }
                                    var40.method2889(var42, var11.field3987 ? 255 - (var15 & 0xFF) << 24 : -1, 0, var11.field4014, var11.field4024, var11.field4022, null, 5327, var11.field4076, var14, var11.field3960, 0, var41 | 255 - (var15 & 0xFF) << 24, var11.field3963, var13, class354.field4830, null);
                                    if (class184.field2577) {
                                        class418.field6109.method462(arg7, arg0, arg1, arg3);
                                    }
                                } else if (class456.field6664) {
                                    class150.method952((byte) -68, var11);
                                }
                            } else if (var11.field3984 == 5) {
                                if (var11.field3994 >= 0) {
                                    var11.method1686(class56.field771, (byte) 98, class504.field7416).method2187(var11.field4019 << 3, var14, 0, var11.field3960, 0, var11.field4083 << 3, class418.field6109, var11.field4022, var13, 0);
                                } else {
                                    class529 var45;
                                    if (var11.field4072 == -1) {
                                        var45 = var11.method1693(class418.field6109, 119);
                                    } else {
                                        class109 var44 = var11.field4075 ? class75.field1089.field2741 : null;
                                        var45 = class75.field1097.method829((byte) 63, var11.field3981, var11.field4072, var44, var11.field4033, var11.field4001, class418.field6109, var11.field4035 | 0xFF000000);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method126();
                                        int var47 = var45.method121();
                                        int var48 = 255 - (var15 & 0xFF) << 24 | (var11.field3925 == 0 ? 16777215 : var11.field3925 & 0xFFFFFF);
                                        if (var11.field3967) {
                                            class418.field6109.method516(var13, var14, var11.field4022 + var13, var11.field3960 + var14);
                                            if (var11.field4013 != 0) {
                                                int var49 = (-(-var46 - var11.field4022) - 1) / var46;
                                                int var50 = (var47 + var11.field3960 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field3925 == 0) {
                                                            var45.method3109((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field4013);
                                                        } else {
                                                            var45.method3108((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field4013, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field3925 == 0 && var15 == 0) {
                                                var45.method3112(var13, var14, var11.field4022, var11.field3960);
                                            } else {
                                                var45.method124(var13, var14, var11.field4022, var11.field3960, 0, var48, 1);
                                            }
                                            class418.field6109.method462(arg7, arg0, arg1, arg3);
                                        } else if (var11.field3925 == 0 && var15 == 0) {
                                            if (var11.field4013 != 0) {
                                                var45.method3109((float) var11.field4022 / 2.0F + (float) var13, (float) var11.field3960 / 2.0F + (float) var14, var11.field4022 * 4096 / var46, var11.field4013);
                                            } else if (var11.field4022 == var46 && var11.field3960 == var47) {
                                                var45.method3111(var13, var14);
                                            } else {
                                                var45.method3106(var13, var14, var11.field4022, var11.field3960);
                                            }
                                        } else if (var11.field4013 != 0) {
                                            var45.method3108((float) var11.field4022 / 2.0F + (float) var13, (float) var11.field3960 / 2.0F + (float) var14, var11.field4022 * 4096 / var46, var11.field4013, 0, var48, 1);
                                        } else if (var11.field4022 == var46 && var11.field3960 == var47) {
                                            var45.method130(var13, var14, 0, var48, 1);
                                        } else {
                                            var45.method119(var13, var14, var11.field4022, var11.field3960, 0, var48, 1);
                                        }
                                    } else if (class456.field6664) {
                                        class150.method952((byte) -64, var11);
                                    }
                                }
                            } else if (var11.field3984 == 6) {
                                class6.method34(-60);
                                class121 var53 = null;
                                int var54 = 0;
                                if (var11.field4072 != -1) {
                                    class316 var55 = class75.field1097.method823(false, var11.field4072);
                                    if (var55 != null) {
                                        class316 var56 = var55.method1787(var11.field3981, 0);
                                        class467 var57 = var11.field4060 == -1 ? null : class275.field3740.method1484(0, var11.field4060);
                                        class109 var58 = var11.field4075 ? class75.field1089.field2741 : null;
                                        var53 = var56.method1786(1, var11.field4018, false, var11.field4070, var57, var58, 2048, class418.field6109, var11.field4078);
                                        if (var53 == null) {
                                            class150.method952((byte) -66, var11);
                                        } else {
                                            var54 = -var53.method771() >> 1;
                                        }
                                    }
                                } else if (var11.field3965 == 5) {
                                    int var63 = var11.field3948;
                                    if (var63 >= 0 && var63 < 2048) {
                                        class192 var64 = class309.field4234[var63];
                                        class467 var65 = var11.field4060 == -1 ? null : class275.field3740.method1484(0, var11.field4060);
                                        if (var64 != null && (class202.field2880 == var63 || class145.method932(var64.field2693, -111) == var11.field4045)) {
                                            var53 = var64.field2741.method700(0, var11.field4078, var11.field4070, -87, class201.field2873, class20.field211, -1, 0, class418.field6109, var11.field4018, 2048, true, class398.field5549, class75.field1097, class453.field6623, null, var65, class275.field3740, null);
                                        }
                                    }
                                } else if (var11.field3965 == 8 || var11.field3965 == 9) {
                                    class113 var60 = class223.method1313(false, Integer.MIN_VALUE, var11.field3948);
                                    class467 var61 = var11.field4060 == -1 ? null : class275.field3740.method1484(0, var11.field4060);
                                    if (var60 != null) {
                                        class109 var62 = var11.field4075 ? class75.field1089.field2741 : null;
                                        var53 = var60.method726(var11.field4078, 2048, var11.field4045, var62, var11.field4070, var61, false, var11.field3965 == 9, var11.field4018, class418.field6109);
                                    }
                                } else if (var11.field4060 == -1) {
                                    var53 = var11.method1687(class418.field6109, -1, 0, class453.field6623, 2048, class20.field211, class201.field2873, null, -1, class398.field5549, 26, class75.field1097, class75.field1089.field2741, class275.field3740);
                                    if (var53 == null && class456.field6664) {
                                        class150.method952((byte) 113, var11);
                                    }
                                } else {
                                    class467 var59 = class275.field3740.method1484(0, var11.field4060);
                                    var53 = var11.method1687(class418.field6109, var11.field4078, var11.field4018, class453.field6623, 2048, class20.field211, class201.field2873, var59, var11.field4070, class398.field5549, -117, class75.field1097, class75.field1089.field2741, class275.field3740);
                                    if (var53 == null && class456.field6664) {
                                        class150.method952((byte) -98, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field3945 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field4022 << 9) / var11.field3945;
                                    }
                                    int var67;
                                    if (var11.field3955 > 0) {
                                        var67 = (var11.field3960 << 9) / var11.field3955;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = var13 - (-(var11.field4022 / 2) - (var11.field4007 * var66 >> 9));
                                    int var69 = var11.field3960 / 2 + (var14 + (var11.field3996 * var67 >> 9));
                                    class500.field7351.method328();
                                    class418.field6109.method437(class500.field7351);
                                    class418.field6109.method467(var68, var69, var66, var67);
                                    class418.field6109.method440((float) (var11.field3999 << 0), var11.field4088 ? (float) (var11.field4025 << 0) : (float) (var11.field4025 << 0) * 1.5F);
                                    if (arg2 == -1412584499 || class81.field1147) {
                                        class418.field6109.method526();
                                        class418.field6109.method446();
                                        class418.field6109.method462(arg7, arg0, arg1, arg3);
                                        class81.field1147 = false;
                                    }
                                    if (var11.field4016) {
                                        class418.field6109.method469(false);
                                    }
                                    int var70 = (var11.field4009 << 0) * class377.field5316[var11.field4074 << 3] >> 15;
                                    int var71 = (var11.field4009 << 0) * class377.field5315[var11.field4074 << 3] >> 15;
                                    class493.field7284.method347(-var11.field4058 << 3);
                                    class493.field7284.method336(var11.field4017 << 3);
                                    class493.field7284.method335(var11.field3937 << 0, var70 + (var11.field3946 << 0) + var54, (var11.field3946 << 0) + var71);
                                    class493.field7284.method345(var11.field4074 << 3);
                                    if (class184.field2577) {
                                        class418.field6109.method516(var13, var14, var11.field4022 + var13, var14 - -var11.field3960);
                                    }
                                    if (var11.field4088) {
                                        var53.method764(class493.field7284, null, var11.field4009 << 0, 1);
                                    } else {
                                        var53.method781(class493.field7284, null, 1);
                                    }
                                    if (class184.field2577) {
                                        class418.field6109.method462(arg7, arg0, arg1, arg3);
                                    }
                                    if (var11.field4016) {
                                        class418.field6109.method469(true);
                                    }
                                    class418.field6109.method440(0.0F, 0.0F);
                                }
                            } else if (var11.field3984 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field4056) {
                                    var72 = var13 + var11.field4022;
                                    var73 = var11.field3960 + var14;
                                    var74 = var13;
                                    var75 = var14;
                                } else {
                                    var75 = var11.field3960 + var14;
                                    var74 = var13;
                                    var73 = var14;
                                    var72 = var11.field4022 + var13;
                                }
                                if (var11.field3944 == 1) {
                                    class418.field6109.method504(var74, var73, var72, var75, var11.field3925, 0);
                                } else {
                                    class418.field6109.method468(var74, var73, var72, var75, var11.field3925, var11.field3944, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method111(String arg0, int arg1) throws ClassNotFoundException {
        field158++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1 >= -88) {
                method110(107, 41, 72, 113, -64, null, 122, 34, -60, 49);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public static final void method112(String arg0, int arg1) {
        field148++;
        if (arg0.equals("")) {
            return;
        }
        class356.method1978((byte) 117, class116.field1561);
        class88.field1202++;
        class244.field3395.method2084(class121.method780(arg0, (byte) 74), false);
        class244.field3395.method2073(16, arg0);
        if (arg1 != 2048) {
            field163 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZFII[FIIIIFI)V")
    public static final void method113(boolean arg0, float arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, float arg9, int arg10) {
        int var11 = arg6 - arg3;
        int var12 = arg8 - arg10;
        int var13 = arg2 - arg7;
        field154++;
        float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[3] * (float) var13 + arg4[4] * (float) var12;
        if (!arg0) {
            return;
        }
        float var16 = arg4[8] * (float) var11 + arg4[7] * (float) var12 + arg4[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + arg1 + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class249.field3462 = var18;
        class81.field1149 = var17;
    }
}
