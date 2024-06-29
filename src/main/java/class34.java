import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class34 extends class64 {

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    private int field706;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "Lcd;")
    private static class23 field703 = class54.method414("scroll:", -1);

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Lcd;")
    public static class23 field699 = field703;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Lcd;")
    public static class23 field691 = class54.method414("Stufe)2", -1);

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Lcd;")
    public static class23 field693 = field703;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Lcd;")
    private static class23 field692 = class54.method414("RuneScape is loading )2 please wait)3)3)3", -1);

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "Lcd;")
    private static class23 field698 = class54.method414("You have only just left another world)3", -1);

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "Lcd;")
    public static class23 field705 = field698;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Lcd;")
    public static class23 field697 = field692;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Lkh;")
    public static class97 field689;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
    public static int[] field690;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "[I")
    public static int[] field701;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "[I")
    public static int[] field702;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class34() {
        this(4096);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
    private class34(int arg0) {
        super(0, true);
        this.field706 = 4096;
        this.field706 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII[Lfa;II)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class47[] arg7, int arg8, int arg9) {
        ++field700;
        class196.method1278(arg1, arg2, arg9, arg5);
        class140.method888();
        if (arg8 >= -76) {
            method248(true);
        }
        for (int var10 = 0; ~arg7.length < ~var10; ++var10) {
            class47 var11 = arg7[var10];
            if (var11 != null && (~var11.field1051 == ~arg4 || arg4 == -1412584499 && class17.field361 == var11)) {
                int var12;
                if (arg0 != -1) {
                    var12 = arg0;
                } else {
                    class78.field1718[class5.field92] = var11.field1102 - -arg6;
                    class121.field2504[class5.field92] = var11.field1120 + arg3;
                    class112.field2372[class5.field92] = var11.field1125;
                    class179.field3558[class5.field92] = var11.field1123;
                    var12 = class5.field92++;
                }
                var11.field1141 = var12;
                var11.field1109 = class15.field339;
                if (!var11.field1027 || !class95.method624(-1, var11)) {
                    if (~var11.field1124 < -1) {
                        class174.method1096(var11, -78);
                    }
                    int var13 = var11.field1102 + arg6;
                    int var14 = var11.field1120 + arg3;
                    int var15 = var11.field1115;
                    if (class17.field361 == var11) {
                        if (arg4 != -1412584499 && !var11.field1034) {
                            class135.field2807 = arg6;
                            class48.field1162 = arg3;
                            class56.field1309 = arg7;
                            continue;
                        }
                        if (!var11.field1034) {
                            var15 = 128;
                        }
                        if (class157.field3141 && class160.field3218) {
                            int var16 = class78.field1724;
                            int var17 = var16 - class161.field3239;
                            if (var17 < class153.field3050) {
                                var17 = class153.field3050;
                            }
                            if (~(class153.field3050 + class191.field3798.field1125) > ~(var11.field1125 + var17)) {
                                var17 = -var11.field1125 + class153.field3050 - -class191.field3798.field1125;
                            }
                            var13 = var17;
                            int var18 = class64.field1518;
                            int var19 = var18 - class44.field929;
                            if (class96.field2030 > var19) {
                                var19 = class96.field2030;
                            }
                            if (~(class96.field2030 - -class191.field3798.field1123) > ~(var11.field1123 + var19)) {
                                var19 = -var11.field1123 + class191.field3798.field1123 + class96.field2030;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var23;
                    int var25;
                    if (var11.field1127 != 2) {
                        if (~var11.field1127 != -10) {
                            var20 = ~arg2 <= ~var14 ? arg2 : var14;
                            var21 = ~var13 < ~arg1 ? var13 : arg1;
                            int var22 = var13 - -var11.field1125;
                            var23 = ~var22 > ~arg9 ? var22 : arg9;
                            int var24 = var11.field1123 + var14;
                            var25 = ~arg5 < ~var24 ? var24 : arg5;
                        } else {
                            int var26 = var13;
                            int var27 = var14;
                            int var28 = var11.field1123 + var14;
                            int var29 = var11.field1125 + var13;
                            if (var13 > var29) {
                                var26 = var29;
                                var29 = var13;
                            }
                            if (~var28 > ~var14) {
                                var27 = var28;
                                var28 = var14;
                            }
                            var20 = ~var27 < ~arg2 ? var27 : arg2;
                            var21 = ~var26 < ~arg1 ? var26 : arg1;
                            ++var28;
                            var25 = var28 >= arg5 ? arg5 : var28;
                            ++var29;
                            var23 = ~arg9 >= ~var29 ? arg9 : var29;
                        }
                    } else {
                        var25 = arg5;
                        var20 = arg2;
                        var21 = arg1;
                        var23 = arg9;
                    }
                    if (!var11.field1027 || ~var23 < ~var21 && var20 < var25) {
                        if (~var11.field1124 != -1) {
                            if (var11.field1124 == 1337) {
                                class174.field3472 = var14;
                                class98.field2087 = var13;
                                class53.method411(var14, 0, var13, var11.field1123, var11.field1125);
                                class196.method1278(arg1, arg2, arg9, arg5);
                                continue;
                            }
                            if (~var11.field1124 == -1339) {
                                class78.method538(var14, var13, 5, var12);
                                class196.method1278(arg1, arg2, arg9, arg5);
                                continue;
                            }
                        }
                        int var32 = class78.field1724;
                        int var33 = class64.field1518;
                        if (!class134.field2786 && var21 <= var32 && ~var33 <= ~var20 && var32 < var23 && var25 > var33) {
                            class97.method637(var11, -12078, var32 - var13, -var14 + var33);
                        }
                        if (var11.field1127 == 0) {
                            if (!var11.field1027 && class95.method624(-1, var11) && class62.field1442 != var11) {
                                continue;
                            }
                            if (!var11.field1027) {
                                if (var11.field1065 > -var11.field1123 + var11.field1107) {
                                    var11.field1065 = -var11.field1123 + var11.field1107;
                                }
                                if (var11.field1065 < 0) {
                                    var11.field1065 = 0;
                                }
                            }
                            method247(var12, var21, var20, -var11.field1065 + var14, var11.field1071, var25, var13 - var11.field1100, arg7, -78, var23);
                            if (var11.field1029 != null) {
                                method247(var12, var21, var20, var14 - var11.field1065, var11.field1071, var25, var13 - var11.field1100, var11.field1029, -107, var23);
                            }
                            class115 var34 = (class115) class31.field665.method260((long) var11.field1071, (byte) 28);
                            if (var34 != null) {
                                if (~var34.field2400 == -1 && ~var21 >= ~class78.field1724 && class64.field1518 >= var20 && ~var23 < ~class78.field1724 && var25 > class64.field1518 && !class134.field2786 && !class57.field1338) {
                                    class88.field1876[0] = class153.field3061;
                                    class81.field1771[0] = class66.field1566;
                                    class49.field1171 = 1;
                                    class103.field2201[0] = 1003;
                                }
                                class112.method718(var13, var14, var20, var23, var12, var21, var25, false, var34.field2408);
                            }
                            class196.method1278(arg1, arg2, arg9, arg5);
                            class140.method888();
                        }
                        if (class204.field4024[var12] || class25.field547 > 1) {
                            if (var11.field1127 == 0 && !var11.field1027 && ~var11.field1107 < ~var11.field1123) {
                                class74.method527(var14, var11.field1065, var11.field1123, -123, var13 - -var11.field1125, var11.field1107);
                            }
                            if (~var11.field1127 != -2) {
                                if (~var11.field1127 == -3) {
                                    int var35 = 0;
                                    for (int var36 = 0; ~var11.field1123 < ~var36; ++var36) {
                                        for (int var37 = 0; var37 < var11.field1125; ++var37) {
                                            int var38 = var13 - -((32 - -var11.field1088) * var37);
                                            int var39 = (32 - -var11.field1037) * var36 + var14;
                                            if (~var35 > -21) {
                                                var38 += var11.field1012[var35];
                                                var39 += var11.field1137[var35];
                                            }
                                            if (var11.field1136[var35] <= 0) {
                                                if (var11.field1078 != null && ~var35 > -21) {
                                                    class38 var40 = var11.method368(749, var35);
                                                    if (var40 == null) {
                                                        if (class8.field167) {
                                                            class3.method12(var11, false);
                                                        }
                                                    } else {
                                                        var40.method315(var38, var39);
                                                    }
                                                }
                                            } else {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field1136[var35] + -1;
                                                if (arg1 < var38 - -32 && var38 < arg9 && ~arg2 > ~(var39 + 32) && ~var39 > ~arg5 || class191.field3795 == var11 && ~class20.field418 == ~var35) {
                                                    class38 var44;
                                                    if (class47.field1013 == 1 && class79.field1725 == var35 && class168.field3362 == var11.field1071) {
                                                        var44 = class58.method449(2, var11.field1024[var35], 0, var43, -1663219674, false);
                                                    } else {
                                                        var44 = class58.method449(1, var11.field1024[var35], 3153952, var43, -1663219674, false);
                                                    }
                                                    if (var44 != null) {
                                                        if (class191.field3795 == var11 && class20.field418 == var35) {
                                                            int var45 = -class91.field1947 + class64.field1518;
                                                            int var46 = -class13.field298 + class78.field1724;
                                                            if (var45 < 5 && var45 > -5) {
                                                                var45 = 0;
                                                            }
                                                            if (var46 < 5 && ~var46 < 4) {
                                                                var46 = 0;
                                                            }
                                                            if (~class168.field3365 > -6) {
                                                                var46 = 0;
                                                                var45 = 0;
                                                            }
                                                            var44.method300(var38 - -var46, var39 + var45, 128);
                                                            if (arg4 != -1) {
                                                                class47 var47 = arg7[65535 & arg4];
                                                                int var48 = class196.field3873;
                                                                int var49 = class196.field3867;
                                                                if (var39 + var45 < var48 && var47.field1065 > 0) {
                                                                    int var50 = (-var39 + -var45 + var48) * class138.field2850 / 3;
                                                                    if (class138.field2850 * 10 < var50) {
                                                                        var50 = class138.field2850 * 10;
                                                                    }
                                                                    if (~var47.field1065 > ~var50) {
                                                                        var50 = var47.field1065;
                                                                    }
                                                                    var47.field1065 -= var50;
                                                                    class91.field1947 += var50;
                                                                    class3.method12(var47, false);
                                                                }
                                                                if (var39 + var45 + 32 > var49 && ~(-var47.field1123 + var47.field1107) < ~var47.field1065) {
                                                                    int var51 = (-var49 + var45 + var39 + 32) * class138.field2850 / 3;
                                                                    if (~(class138.field2850 * 10) > ~var51) {
                                                                        var51 = class138.field2850 * 10;
                                                                    }
                                                                    if (var51 > -var47.field1065 + var47.field1107 + -var47.field1123) {
                                                                        var51 = var47.field1107 - var47.field1123 + -var47.field1065;
                                                                    }
                                                                    var47.field1065 += var51;
                                                                    class91.field1947 -= var51;
                                                                    class3.method12(var47, false);
                                                                }
                                                            }
                                                        } else if (class91.field1949 == var11 && ~class121.field2515 == ~var35) {
                                                            var44.method300(var38, var39, 128);
                                                        } else {
                                                            var44.method315(var38, var39);
                                                        }
                                                    } else {
                                                        class3.method12(var11, false);
                                                    }
                                                }
                                            }
                                            ++var35;
                                        }
                                    }
                                } else if (var11.field1127 == 3) {
                                    int var52;
                                    if (class97.method645(65535, var11)) {
                                        var52 = var11.field1118;
                                        if (class62.field1442 == var11 && var11.field1017 != 0) {
                                            var52 = var11.field1017;
                                        }
                                    } else {
                                        var52 = var11.field1112;
                                        if (class62.field1442 == var11 && var11.field1091 != 0) {
                                            var52 = var11.field1091;
                                        }
                                    }
                                    if (~var15 != -1) {
                                        if (!var11.field1058) {
                                            class196.method1268(var13, var14, var11.field1125, var11.field1123, var52, -(var15 & 255) + 256);
                                        } else {
                                            class196.method1271(var13, var14, var11.field1125, var11.field1123, var52, 256 - (255 & var15));
                                        }
                                    } else if (var11.field1058) {
                                        class196.method1281(var13, var14, var11.field1125, var11.field1123, var52);
                                    } else {
                                        class196.method1273(var13, var14, var11.field1125, var11.field1123, var52);
                                    }
                                } else if (~var11.field1127 == -5) {
                                    class26 var53 = var11.method372((byte) 110);
                                    if (var53 == null) {
                                        if (class8.field167) {
                                            class3.method12(var11, false);
                                        }
                                    } else {
                                        class23 var54 = var11.field1030;
                                        int var55;
                                        if (class97.method645(65535, var11)) {
                                            var55 = var11.field1118;
                                            if (class62.field1442 == var11 && ~var11.field1017 != -1) {
                                                var55 = var11.field1017;
                                            }
                                            if (~var11.field1099.method143(-41) < -1) {
                                                var54 = var11.field1099;
                                            }
                                        } else {
                                            var55 = var11.field1112;
                                            if (class62.field1442 == var11 && ~var11.field1091 != -1) {
                                                var55 = var11.field1091;
                                            }
                                        }
                                        if (var11.field1027 && ~var11.field1147 != 0) {
                                            class63 var56 = class85.method565(var11.field1147, (byte) 114);
                                            var54 = var56.field1483;
                                            if (var54 == null) {
                                                var54 = class201.field3975;
                                            }
                                            if ((var56.field1471 == 1 || var11.field1092 != 1) && ~var11.field1092 != 0) {
                                                var54 = class3.method14(true, new class23[] { class169.field3373, var54, class82.field1776, class8.method48((byte) -114, var11.field1092) });
                                            }
                                        }
                                        if (class72.field1644 == var11) {
                                            var55 = var11.field1112;
                                            var54 = class97.field2063;
                                        }
                                        if (!var11.field1027) {
                                            var54 = class194.method1253((byte) 15, var11, var54);
                                        }
                                        var53.method281(var54, var13, var14, var11.field1125, var11.field1123, var55, var11.field1035 ? 0 : -1, var11.field1108, var11.field1106, var11.field1014);
                                    }
                                } else if (~var11.field1127 == -6) {
                                    if (!var11.field1027) {
                                        class38 var57 = var11.method371((byte) -42, class97.method645(65535, var11));
                                        if (var57 != null) {
                                            var57.method315(var13, var14);
                                        } else if (class8.field167) {
                                            class3.method12(var11, false);
                                        }
                                    } else {
                                        class38 var58;
                                        if (~var11.field1147 == 0) {
                                            var58 = var11.method371((byte) -42, false);
                                        } else {
                                            var58 = class58.method449(var11.field1114, var11.field1092, var11.field1064, var11.field1147, -1663219674, false);
                                        }
                                        if (var58 == null) {
                                            if (class8.field167) {
                                                class3.method12(var11, false);
                                            }
                                        } else {
                                            int var59 = var58.field786;
                                            int var60 = var58.field784;
                                            if (!var11.field1069) {
                                                int var61 = var11.field1125 * 4096 / var59;
                                                if (~var11.field1036 == -1) {
                                                    if (~var15 == -1) {
                                                        if (~var11.field1125 == ~var59 && var11.field1123 == var60) {
                                                            var58.method315(var13, var14);
                                                        } else {
                                                            var58.method294(var13, var14, var11.field1125, var11.field1123);
                                                        }
                                                    } else {
                                                        var58.method296(var13, var14, var11.field1125, var11.field1123, -(var15 & 255) + 256);
                                                    }
                                                } else {
                                                    var58.method317(var11.field1125 / 2 + var13, var11.field1123 / 2 + var14, var11.field1036, var61);
                                                }
                                            } else {
                                                class196.method1272(var13, var14, var11.field1125 + var13, var11.field1123 + var14);
                                                int var62 = (var11.field1123 - (-var60 + 1)) / var60;
                                                int var63 = (var11.field1125 - -var59 + -1) / var59;
                                                for (int var64 = 0; var63 > var64; ++var64) {
                                                    for (int var65 = 0; ~var62 < ~var65; ++var65) {
                                                        if (~var11.field1036 == -1) {
                                                            if (~var15 != -1) {
                                                                var58.method300(var13 - -(var59 * var64), var14 - -(var60 * var65), 256 - (var15 & 255));
                                                            } else {
                                                                var58.method315(var59 * var64 + var13, var60 * var65 + var14);
                                                            }
                                                        } else {
                                                            var58.method317(var59 * var64 + var13 - -(var59 / 2), var60 * var65 + var14 - -(var60 / 2), var11.field1036, 4096);
                                                        }
                                                    }
                                                }
                                                class196.method1278(arg1, arg2, arg9, arg5);
                                            }
                                        }
                                    }
                                } else if (var11.field1127 == 6) {
                                    boolean var66 = class97.method645(65535, var11);
                                    int var67;
                                    if (var66) {
                                        var67 = var11.field1047;
                                    } else {
                                        var67 = var11.field1095;
                                    }
                                    class18 var68 = null;
                                    int var69 = 0;
                                    if (var11.field1147 != -1) {
                                        class63 var70 = class85.method565(var11.field1147, (byte) 118);
                                        if (var70 != null) {
                                            class63 var71 = var70.method467((byte) -71, var11.field1092);
                                            var68 = var71.method465(-128, 1);
                                            if (var68 != null) {
                                                var68.method122();
                                                var69 = var68.field3376 / 2;
                                            } else {
                                                class3.method12(var11, false);
                                            }
                                        }
                                    } else if (var11.field1135 != 5) {
                                        if (~var67 == 0) {
                                            var68 = var11.method369(class134.field2790.field1328, var66, false, (class94) null, -1);
                                            if (var68 == null && class8.field167) {
                                                class3.method12(var11, false);
                                            }
                                        } else {
                                            class94 var72 = class20.method128(var67, (byte) 113);
                                            var68 = var11.method369(class134.field2790.field1328, var66, false, var72, var11.field1082);
                                            if (var68 == null && class8.field167) {
                                                class3.method12(var11, false);
                                            }
                                        }
                                    } else if (~var11.field1032 != -1) {
                                        var68 = class134.field2790.method31(-114);
                                    } else {
                                        var68 = class13.field292.method1015(-1, (class94) null, -1, true, (class94) null);
                                    }
                                    if (var68 != null) {
                                        class140.method889(var11.field1125 / 2 + var11.field1033 + var13, var11.field1123 / 2 + var11.field1097 + var14);
                                        int var73 = class140.field2891[var11.field1073] * var11.field1040 >> 16;
                                        int var74 = class140.field2878[var11.field1073] * var11.field1040 >> 16;
                                        if (var11.field1027) {
                                            if (!var11.field1084) {
                                                var68.method115(0, var11.field1048, var11.field1067, var11.field1073, var11.field1038, var74 - (-var69 - var11.field1021), var11.field1021 + var73);
                                            } else {
                                                var68.method120(0, var11.field1048, var11.field1067, var11.field1073, var11.field1038, var11.field1021 + var74 - -var69, var11.field1021 + var73, var11.field1040);
                                            }
                                        } else {
                                            var68.method115(0, var11.field1048, 0, var11.field1073, 0, var74, var73);
                                        }
                                        class140.method886();
                                    }
                                } else {
                                    if (~var11.field1127 == -8) {
                                        class26 var75 = var11.method372((byte) 122);
                                        if (var75 == null) {
                                            if (class8.field167) {
                                                class3.method12(var11, false);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; ~var11.field1123 < ~var77; ++var77) {
                                            for (int var78 = 0; var78 < var11.field1125; ++var78) {
                                                if (~var11.field1136[var76] < -1) {
                                                    class63 var79 = class85.method565(var11.field1136[var76] + -1, (byte) -88);
                                                    class23 var80;
                                                    if (var79.field1471 != 1 && ~var11.field1024[var76] == -2) {
                                                        var80 = class3.method14(true, new class23[] { class169.field3373, var79.field1483, class158.field3168 });
                                                    } else {
                                                        var80 = class3.method14(true, new class23[] { class169.field3373, var79.field1483, class82.field1776, class8.method48((byte) -76, var11.field1024[var76]) });
                                                    }
                                                    int var81 = (12 - -var11.field1037) * var77 + var14;
                                                    int var82 = (115 - -var11.field1088) * var78 + var13;
                                                    if (var11.field1108 != 0) {
                                                        if (var11.field1108 != 1) {
                                                            var75.method265(var80, var82 - (-var11.field1125 + 1), var81, var11.field1112, !var11.field1035 ? -1 : 0);
                                                        } else {
                                                            var75.method270(var80, var82 - -(var11.field1125 / 2), var81, var11.field1112, var11.field1035 ? 0 : -1);
                                                        }
                                                    } else {
                                                        var75.method291(var80, var82, var81, var11.field1112, !var11.field1035 ? -1 : 0);
                                                    }
                                                }
                                                ++var76;
                                            }
                                        }
                                    }
                                    if (var11.field1127 == 8 && class200.field3966 == var11 && class179.field3557 == class128.field2658) {
                                        int var83 = 0;
                                        int var84 = 0;
                                        class23 var85 = var11.field1030;
                                        class26 var86 = class14.field301;
                                        class23 var87 = class194.method1253((byte) 15, var11, var85);
                                        while (var87.method143(-41) > 0) {
                                            int var95 = var87.method168(0, class31.field668);
                                            class23 var96;
                                            if (~var95 == 0) {
                                                var96 = var87;
                                                var87 = class66.field1566;
                                            } else {
                                                var96 = var87.method156(0, var95, -118);
                                                var87 = var87.method136(var95 - -4, -3331);
                                            }
                                            int var97 = var86.method273(var96);
                                            var84 += var86.field762 + 1;
                                            if (~var97 < ~var83) {
                                                var83 = var97;
                                            }
                                        }
                                        var83 += 6;
                                        var84 += 7;
                                        int var88 = var11.field1123 + var14 + 5;
                                        int var89 = var11.field1125 + var13 - 5 + -var83;
                                        if (var88 - -var84 > arg5) {
                                            var88 = -var84 + arg5;
                                        }
                                        if (var89 < var13 + 5) {
                                            var89 = var13 - -5;
                                        }
                                        if (~(var89 - -var83) < ~arg9) {
                                            var89 = -var83 + arg9;
                                        }
                                        class196.method1281(var89, var88, var83, var84, 16777120);
                                        class196.method1273(var89, var88, var83, var84, 0);
                                        int var90 = var88 - (-var86.field762 - 2);
                                        class23 var91 = var11.field1030;
                                        class23 var92 = class194.method1253((byte) 15, var11, var91);
                                        while (~var92.method143(-41) < -1) {
                                            int var93 = var92.method168(0, class31.field668);
                                            class23 var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = class66.field1566;
                                            } else {
                                                var94 = var92.method156(0, var93, -89);
                                                var92 = var92.method136(var93 - -4, -3331);
                                            }
                                            var86.method291(var94, var89 + 3, var90, 0, -1);
                                            var90 += var86.field762 + 1;
                                        }
                                    }
                                    if (~var11.field1127 == -10) {
                                        if (var11.field1060 == 1) {
                                            class196.method1270(var13, var14, var11.field1125 + var13, var11.field1123 + var14, var11.field1112);
                                        } else {
                                            int var98 = ~var11.field1123 <= -1 ? var11.field1123 : -var11.field1123;
                                            int var99 = ~var11.field1125 <= -1 ? var11.field1125 : -var11.field1125;
                                            int var100 = var99;
                                            if (~var98 < ~var99) {
                                                var100 = var98;
                                            }
                                            if (var100 != 0) {
                                                int var101 = (var11.field1125 << 16) / var100;
                                                int var102 = var13 - arg1;
                                                int var103 = (var11.field1123 << 16) / var100;
                                                if (~var103 < ~var101) {
                                                    var103 = -var103;
                                                } else {
                                                    var101 = -var101;
                                                }
                                                int var104 = var11.field1060 * var101 >> 17;
                                                int var105 = var11.field1060 * var103 >> 17;
                                                int var106 = var14 - arg2;
                                                int var107 = var11.field1060 * var103 + 1 >> 17;
                                                int var108 = var102 - var107 + var11.field1125;
                                                int var109 = -var107 + var102;
                                                int var110 = var11.field1125 - -var105 + var102;
                                                int var111 = var11.field1060 * var101 + 1 >> 17;
                                                int var112 = -var111 + var106;
                                                int var113 = var11.field1123 + var106 + -var111;
                                                int var114 = var102 + var105;
                                                int var115 = var104 + var106;
                                                int var116 = var104 + var106 + var11.field1123;
                                                class140.method896(var114, var109, var108);
                                                class140.method892(var115, var112, var113, var114, var109, var108, var11.field1112);
                                                class140.method896(var114, var108, var110);
                                                class140.method892(var115, var113, var116, var114, var108, var110, var11.field1112);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (~arg1 == -1) {
            this.field706 = (arg2.method1202(110) << 12) / 255;
        }
        int var5 = -57 % ((arg0 - 7) / 43);
        ++field696;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public static final void method248(boolean arg0) {
        ++field704;
        if (~class58.field1359 == -112) {
            int var1 = class81.field1769.method1202(123);
            int var2 = ((120 & var1) >> 4) + class174.field3470;
            int var3 = (var1 & 7) + class9.field183;
            int var4 = class81.field1769.method1197(-1);
            int var5 = class81.field1769.method1202(124);
            int var6 = 15 & var5 >> 4;
            int var7 = 7 & var5;
            int var8 = class81.field1769.method1202(104);
            if (~var2 <= -1 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
                int var9 = var6 + 1;
                if (class134.field2790.field219[0] >= -var9 + var2 && ~(var2 + var9) <= ~class134.field2790.field219[0] && class134.field2790.field230[0] >= -var9 + var3 && ~(var3 + var9) <= ~class134.field2790.field230[0] && ~class205.field4031 != -1 && ~var7 < -1 && ~class51.field1216 > -51) {
                    class62.field1441[class51.field1216] = var4;
                    class122.field2527[class51.field1216] = var7;
                    class29.field621[class51.field1216] = var8;
                    client.field572[class51.field1216] = null;
                    class117.field2441[class51.field1216] = (var2 << 16) - -(var3 << 8) + var6;
                    ++class51.field1216;
                }
            }
        }
        if (~class58.field1359 == -89) {
            int var10 = class81.field1769.method1202(-83);
            int var11 = ((113 & var10) >> 4) + class174.field3470;
            int var12 = (7 & var10) + class9.field183;
            int var13 = class81.field1769.method1197(-1);
            int var14 = class81.field1769.method1202(-67);
            int var15 = class81.field1769.method1197(-1);
            if (var11 >= 0 && ~var12 <= -1 && ~var11 > -105 && var12 < 104) {
                int var16 = var11 * 128 + 64;
                int var17 = var12 * 128 - -64;
                class5 var18 = new class5(var13, class59.field1385, var16, var17, class203.method1330((byte) -88, var17, var16, class59.field1385) - var14, var15, class15.field339);
                class202.field3984.method186(var18, -26692);
            }
        } else if (~class58.field1359 == -151) {
            int var19 = class81.field1769.method1184(-25);
            int var20 = class81.field1769.method1202(104);
            int var21 = ((126 & var20) >> 4) + class174.field3470;
            int var22 = (var20 & 7) + class9.field183;
            if (var21 >= 0 && ~var22 <= -1 && var21 < 104 && var22 < 104) {
                class25 var23 = class150.field3006[class59.field1385][var21][var22];
                if (var23 != null) {
                    for (class52 var24 = (class52) var23.method188((byte) 54); var24 != null; var24 = (class52) var23.method185((byte) -102)) {
                        if (~(32767 & var19) == ~var24.field1241) {
                            var24.method1018(15789);
                            break;
                        }
                    }
                    if (var23.method188((byte) 54) == null) {
                        class150.field3006[class59.field1385][var21][var22] = null;
                    }
                    class168.method1029(var22, var21, -1);
                }
            }
        } else if (class58.field1359 == 15) {
            int var25 = class81.field1769.method1203(-115);
            int var26 = (var25 >> 4 & 7) + class174.field3470;
            int var27 = (var25 & 7) + class9.field183;
            int var28 = class81.field1769.method1216((byte) 115);
            int var29 = class81.field1769.method1197(-1);
            if (var26 >= 0 && ~var27 <= -1 && var26 < 104 && ~var27 > -105) {
                class52 var30 = new class52();
                var30.field1241 = var29;
                var30.field1233 = var28;
                if (class150.field3006[class59.field1385][var26][var27] == null) {
                    class150.field3006[class59.field1385][var26][var27] = new class25();
                }
                class150.field3006[class59.field1385][var26][var27].method186(var30, -26692);
                class168.method1029(var27, var26, -1);
            }
        } else if (~class58.field1359 == -14) {
            int var31 = class81.field1769.method1202(110);
            int var32 = var31 >> 2;
            int var33 = class103.field2188[var32];
            int var34 = class81.field1769.method1216((byte) 105);
            int var35 = 3 & var31;
            int var36 = class81.field1769.method1202(102);
            int var37 = (7 & var36) + class9.field183;
            int var38 = (var36 >> 4 & 7) + class174.field3470;
            if (var38 >= 0 && ~var37 <= -1 && var38 < 104 && ~var37 > -105) {
                class133.method849(var38, 19468, var34, -1, 0, class59.field1385, var35, var33, var37, var32);
            }
        } else if (arg0) {
            if (~class58.field1359 == -43) {
                int var39 = class81.field1769.method1207((byte) 96);
                int var40 = class174.field3470 - -((118 & var39) >> 4);
                int var41 = class9.field183 - -(var39 & 7);
                byte var42 = class81.field1769.method1179(128);
                int var43 = class81.field1769.method1197(-1);
                int var44 = class81.field1769.method1200(-120);
                byte var45 = class81.field1769.method1228(-28109);
                int var46 = class81.field1769.method1200(-108);
                byte var47 = class81.field1769.method1179(128);
                int var48 = class81.field1769.method1197(-1);
                byte var49 = class81.field1769.method1179(128);
                int var50 = class81.field1769.method1202(111);
                int var51 = var50 >> 2;
                class57 var52;
                if (~class15.field338 == ~var48) {
                    var52 = class134.field2790;
                } else {
                    var52 = class95.field2007[var48];
                }
                int var53 = var50 & 3;
                int var54 = class103.field2188[var51];
                if (var52 != null) {
                    class104 var55 = class65.method486(var44, (byte) -66);
                    int var56;
                    int var57;
                    if (var53 != 1 && ~var53 != -4) {
                        var56 = var55.field2205;
                        var57 = var55.field2232;
                    } else {
                        var56 = var55.field2232;
                        var57 = var55.field2205;
                    }
                    int var58 = (var57 >> 1) + var40;
                    int var59 = (var56 >> 1) + var41;
                    int var60 = (var56 + 1 >> 1) + var41;
                    int var61 = (var57 + 1 >> 1) + var40;
                    int[][] var62 = class182.field3596[class59.field1385];
                    int var63 = (var40 << 7) - -(var57 << 6);
                    int var64 = (var41 << 7) + (var56 << 6);
                    int var65 = var62[var58][var59] + var62[var61][var59] - -var62[var58][var60] - -var62[var61][var60] >> 2;
                    class18 var66 = var55.method679(var65, var63, var64, var51, (byte) 86, var62, var53);
                    if (var66 != null) {
                        if (var45 < var47) {
                            byte var67 = var47;
                            var47 = var45;
                            var45 = var67;
                        }
                        if (var49 > var42) {
                            byte var68 = var49;
                            var49 = var42;
                            var42 = var68;
                        }
                        class133.method849(var40, 19468, -1, var46 + 1, var43 + 1, class59.field1385, 0, var54, var41, 0);
                        var52.field1347 = var41 * 128 + var56 * 64;
                        var52.field1331 = var40 + var45;
                        var52.field1334 = var43 - -class15.field339;
                        var52.field1340 = var40 + var47;
                        var52.field1317 = var41 - -var49;
                        var52.field1339 = var66;
                        var52.field1336 = var40 * 128 - -(var57 * 64);
                        var52.field1332 = var41 + var42;
                        var52.field1333 = var65;
                        var52.field1316 = var46 - -class15.field339;
                    }
                }
            }
            if (class58.field1359 == 11) {
                int var69 = class81.field1769.method1202(103);
                int var70 = (7 & var69 >> 4) + class174.field3470;
                int var71 = class9.field183 - -(var69 & 7);
                int var72 = class81.field1769.method1197(-1);
                int var73 = class81.field1769.method1197(-1);
                int var74 = class81.field1769.method1197(-1);
                if (~var70 <= -1 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class25 var75 = class150.field3006[class59.field1385][var70][var71];
                    if (var75 != null) {
                        for (class52 var76 = (class52) var75.method188((byte) 54); var76 != null; var76 = (class52) var75.method185((byte) -102)) {
                            if ((var72 & 32767) == var76.field1241 && ~var76.field1233 == ~var73) {
                                var76.field1233 = var74;
                                break;
                            }
                        }
                        class168.method1029(var71, var70, -1);
                    }
                }
            } else if (~class58.field1359 == -6) {
                int var77 = class81.field1769.method1184(-25);
                int var78 = class81.field1769.method1184(-25);
                int var79 = class81.field1769.method1201(false);
                int var80 = ((115 & var79) >> 4) + class174.field3470;
                int var81 = (var79 & 7) + class9.field183;
                int var82 = class81.field1769.method1216((byte) 73);
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && ~class15.field338 != ~var77) {
                    class52 var83 = new class52();
                    var83.field1241 = var82;
                    var83.field1233 = var78;
                    if (class150.field3006[class59.field1385][var80][var81] == null) {
                        class150.field3006[class59.field1385][var80][var81] = new class25();
                    }
                    class150.field3006[class59.field1385][var80][var81].method186(var83, -26692);
                    class168.method1029(var81, var80, -1);
                }
            } else if (~class58.field1359 == -10) {
                int var84 = class81.field1769.method1202(110);
                int var85 = (7 & var84) + class9.field183;
                int var86 = ((var84 & 118) >> 4) + class174.field3470;
                int var87 = var86 + class81.field1769.method1204(true);
                int var88 = var85 - -class81.field1769.method1204(true);
                int var89 = class81.field1769.method1196(false);
                int var90 = class81.field1769.method1197(-1);
                int var91 = 4 * class81.field1769.method1202(120);
                int var92 = 4 * class81.field1769.method1202(-23);
                int var93 = class81.field1769.method1197(-1);
                int var94 = class81.field1769.method1197(-1);
                int var95 = class81.field1769.method1202(-120);
                int var96 = class81.field1769.method1202(-46);
                if (var86 >= 0 && var85 >= 0 && ~var86 > -105 && ~var85 > -105 && ~var87 <= -1 && var88 >= 0 && ~var87 > -105 && var88 < 104 && ~var90 != -65536) {
                    int var97 = var87 * 128 + 64;
                    int var98 = var86 * 128 - -64;
                    int var99 = var85 * 128 + 64;
                    class88 var100 = new class88(var90, class59.field1385, var98, var99, class203.method1330((byte) -88, var99, var98, class59.field1385) - var91, class15.field339 + var93, class15.field339 + var94, var95, var96, var89, var92);
                    int var101 = var88 * 128 + 64;
                    var100.method584(var97, var101, -var92 + class203.method1330((byte) -88, var101, var97, class59.field1385), class15.field339 + var93, (byte) 114);
                    class89.field1924.method186(var100, -26692);
                }
            } else if (class58.field1359 == 76) {
                int var102 = class81.field1769.method1201(false);
                int var103 = var102 >> 2;
                int var104 = 3 & var102;
                int var105 = class103.field2188[var103];
                int var106 = class81.field1769.method1202(-62);
                int var107 = (var106 & 7) + class9.field183;
                int var108 = (var106 >> 4 & 7) + class174.field3470;
                if (~var108 <= -1 && ~var107 <= -1 && ~var108 > -105 && var107 < 104) {
                    class133.method849(var108, 19468, -1, -1, 0, class59.field1385, var104, var105, var107, var103);
                }
            } else if (class58.field1359 == 236) {
                int var109 = class81.field1769.method1207((byte) 54);
                int var110 = (7 & var109) + class9.field183;
                int var111 = ((123 & var109) >> 4) + class174.field3470;
                int var112 = class81.field1769.method1202(-109);
                int var113 = var112 >> 2;
                int var114 = class103.field2188[var113];
                int var115 = 3 & var112;
                int var116 = class81.field1769.method1197(-1);
                if (var111 >= 0 && var110 >= 0 && ~var111 > -104 && var110 < 103) {
                    if (var114 == 0) {
                        class161 var117 = class205.field4041.method789(class59.field1385, var111, var110);
                        if (var117 != null) {
                            int var118 = 32767 & var117.field3238 >> 14;
                            if (var113 != 2) {
                                var117.field3228 = new class117(var118, var113, var115, class59.field1385, var111, var110, var116, false, var117.field3228);
                            } else {
                                var117.field3228 = new class117(var118, 2, var115 + 4, class59.field1385, var111, var110, var116, false, var117.field3228);
                                var117.field3232 = new class117(var118, 2, var115 + 1 & 3, class59.field1385, var111, var110, var116, false, var117.field3232);
                            }
                        }
                    }
                    if (~var114 == -2) {
                        class179 var119 = class205.field4041.method819(class59.field1385, var111, var110);
                        if (var119 != null) {
                            int var120 = (var119.field3546 & 536858737) >> 14;
                            if (~var113 != -5 && ~var113 != -6) {
                                if (var113 == 6) {
                                    var119.field3539 = new class117(var120, 4, var115 + 4, class59.field1385, var111, var110, var116, false, var119.field3539);
                                } else if (~var113 == -8) {
                                    var119.field3539 = new class117(var120, 4, (var115 + 2 & 3) + 4, class59.field1385, var111, var110, var116, false, var119.field3539);
                                } else if (var113 == 8) {
                                    var119.field3539 = new class117(var120, 4, var115 - -4, class59.field1385, var111, var110, var116, false, var119.field3539);
                                    var119.field3545 = new class117(var120, 4, (var115 + 2 & 3) + 4, class59.field1385, var111, var110, var116, false, var119.field3545);
                                }
                            } else {
                                var119.field3539 = new class117(var120, 4, var115, class59.field1385, var111, var110, var116, false, var119.field3539);
                            }
                        }
                    }
                    if (~var114 == -3) {
                        class95 var121 = class205.field4041.method803(class59.field1385, var111, var110);
                        if (~var113 == -12) {
                            var113 = 10;
                        }
                        if (var121 != null) {
                            var121.field2010 = new class117((536859604 & var121.field1994) >> 14, var113, var115, class59.field1385, var111, var110, var116, false, var121.field2010);
                        }
                    }
                    if (~var114 == -4) {
                        class98 var122 = class205.field4041.method815(class59.field1385, var111, var110);
                        if (var122 != null) {
                            var122.field2089 = new class117(var122.field2086 >> 14 & 32767, 22, var115, class59.field1385, var111, var110, var116, false, var122.field2089);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field694;
        int[] var3 = super.field1513.method1033(-66, arg0);
        if (super.field1513.field3368) {
            class93.method608(var3, 0, class168.field3367, this.field706);
        }
        return arg1 != -9421 ? null : var3;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static void method249(int arg0) {
        field689 = null;
        field705 = null;
        field691 = null;
        field693 = null;
        field698 = null;
        field702 = null;
        field703 = null;
        field692 = null;
        field699 = null;
        field701 = null;
        field697 = null;
        if (arg0 != 0) {
            field699 = null;
        }
        field690 = null;
    }
}
