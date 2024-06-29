import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class67 extends class106 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Leh;")
    private static class47 field1436 = class195.method1282((byte) -4, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "Leh;")
    public static class47 field1443 = field1436;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "Leh;")
    private static class47 field1438 = class195.method1282((byte) -4, "Invalid username or password)3");

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "[Leh;")
    public static class47[] field1441 = new class47[100];

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Leh;")
    public static class47 field1442 = class195.method1282((byte) -4, "headicons_prayer");

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Leh;")
    public static class47 field1439 = field1438;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Leh;")
    public class47 field1433;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Lgf;")
    public static class61 field1431;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "[I")
    public static int[] field1432;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "[I")
    public int[] field1435;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "[I")
    public int[] field1447;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "[Leh;")
    public class47[] field1446;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "[[[B")
    public static byte[][][] field1440;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
    public static final void method555(int arg0, boolean arg1) {
        if (class9.field211 == 0) {
            class181.field3468.method760((byte) 28, arg0);
        } else {
            class189.field3668 = arg0;
        }
        field1430++;
        if (!arg1) {
            method555(-101, false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1440 = null;
        field1431 = null;
        field1441 = null;
        field1432 = null;
        field1443 = null;
        field1436 = null;
        field1439 = null;
        if (arg0 == -19) {
            field1438 = null;
            field1442 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lgf;IIIIIIII)V")
    public static final void method557(int arg0, class61[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1429++;
        if (arg9 != 1) {
            method557(106, null, -83, 76, 115, 122, -89, 0, 6, 103);
        }
        class169.method1147(arg3, arg4, arg2, arg8);
        class17.method179();
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class61 var11 = arg1[var10];
            if (var11 != null && (var11.field1245 == arg0 || arg0 == -1412584499 && class26.field511 == var11)) {
                int var12;
                if (arg5 == -1) {
                    client.field550[class3.field39] = var11.field1253 + arg6;
                    class75.field1629[class3.field39] = var11.field1229 + arg7;
                    class90.field1899[class3.field39] = var11.field1187;
                    class191.field3713[class3.field39] = var11.field1303;
                    var12 = class3.field39++;
                } else {
                    var12 = arg5;
                }
                var11.field1223 = class18.field362;
                var11.field1182 = var12;
                if (!var11.field1313 || !class72.method632(var11, -63)) {
                    if (var11.field1225 > 0) {
                        class115.method908((byte) 96, var11);
                    }
                    int var13 = var11.field1253 + arg6;
                    int var14 = var11.field1229 + arg7;
                    int var15 = var11.field1185;
                    if (class26.field511 == var11) {
                        if (arg0 != -1412584499 && !var11.field1192) {
                            class124.field2498 = arg7;
                            class41.field822 = arg1;
                            class131.field2592 = arg6;
                            continue;
                        }
                        if (class68.field1500 && class201.field3908) {
                            int var16 = class84.field1788;
                            int var17 = var16 - class141.field2755;
                            if (var17 < class193.field3740) {
                                var17 = class193.field3740;
                            }
                            if (var11.field1187 + var17 > class193.field3740 + class63.field1344.field1187) {
                                var17 = class193.field3740 + class63.field1344.field1187 - var11.field1187;
                            }
                            int var18 = class41.field814;
                            int var19 = var18 - class180.field3447;
                            if (var19 < class40.field787) {
                                var19 = class40.field787;
                            }
                            if (class40.field787 + class63.field1344.field1303 < var11.field1303 + var19) {
                                var19 = class40.field787 + class63.field1344.field1303 - var11.field1303;
                            }
                            var13 = var17;
                            var14 = var19;
                        }
                        if (!var11.field1192) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1311 == 2) {
                        var20 = arg4;
                        var21 = arg2;
                        var22 = arg8;
                        var23 = arg3;
                    } else if (var11.field1311 == 9) {
                        int var26 = var13;
                        int var27 = var14;
                        int var28 = var11.field1187 + var13;
                        if (var28 < var13) {
                            var26 = var28;
                            var28 = var13;
                        }
                        var28++;
                        var21 = var28 < arg2 ? var28 : arg2;
                        var23 = arg3 >= var26 ? arg3 : var26;
                        int var30 = var11.field1303 + var14;
                        if (var14 > var30) {
                            var27 = var30;
                            var30 = var14;
                        }
                        var30++;
                        var22 = arg8 <= var30 ? arg8 : var30;
                        var20 = arg4 < var27 ? var27 : arg4;
                    } else {
                        var23 = arg3 >= var13 ? arg3 : var13;
                        var20 = arg4 < var14 ? var14 : arg4;
                        int var24 = var13 + var11.field1187;
                        var21 = var24 >= arg2 ? arg2 : var24;
                        int var25 = var14 + var11.field1303;
                        var22 = arg8 <= var25 ? arg8 : var25;
                    }
                    if (!var11.field1313 || var21 > var23 && var22 > var20) {
                        if (var11.field1225 != 0) {
                            if (var11.field1225 == 1337) {
                                class195.field3797 = var13;
                                class95.field1972 = var14;
                                class196.method1290(var14, arg9 + 599, var11.field1187, var11.field1303, var13);
                                class169.method1147(arg3, arg4, arg2, arg8);
                                continue;
                            }
                            if (var11.field1225 == 1338) {
                                if (var11.method518(arg9 ^ 0xFFFFD0C8)) {
                                    class193.method1265(110, var11, var14, var12, var13);
                                    class169.method1147(arg3, arg4, arg2, arg8);
                                }
                                continue;
                            }
                            if (var11.field1225 == 1339) {
                                if (var11.method518(arg9 ^ 0xFFFFD0C8)) {
                                    class40.method343(var13, -104, var11, var12, var14);
                                    class169.method1147(arg3, arg4, arg2, arg8);
                                }
                                continue;
                            }
                        }
                        int var32 = class84.field1788;
                        int var33 = class41.field814;
                        if (!class80.field1726 && var32 >= var23 && var33 >= var20 && var32 < var21 && var22 > var33) {
                            class177.method1184(var32 - var13, var11, arg9 ^ 0xFFFFFFE1, var33 - var14);
                        }
                        if (var11.field1311 == 0) {
                            if (!var11.field1313 && class72.method632(var11, -127) && field1431 != var11) {
                                continue;
                            }
                            if (!var11.field1313) {
                                if (var11.field1250 > var11.field1188 - var11.field1303) {
                                    var11.field1250 = var11.field1188 - var11.field1303;
                                }
                                if (var11.field1250 < 0) {
                                    var11.field1250 = 0;
                                }
                            }
                            method557(var11.field1211, arg1, var21, var23, var20, var12, var13 - var11.field1316, -var11.field1250 + var14, var22, 1);
                            if (var11.field1227 != null) {
                                method557(var11.field1211, var11.field1227, var21, var23, var20, var12, var13 - var11.field1316, var14 - var11.field1250, var22, 1);
                            }
                            class63 var34 = (class63) class138.field2710.method1342((long) var11.field1211, (byte) -20);
                            if (var34 != null) {
                                if (var34.field1345 == 0 && class84.field1788 >= var23 && var20 <= class41.field814 && var21 > class84.field1788 && var22 > class41.field814 && !class80.field1726 && !class193.field3746) {
                                    class166.field3224[0] = class123.field2487;
                                    class95.field1971 = 1;
                                    class80.field1731[0] = class181.field3472;
                                    class25.field478[0] = 1003;
                                }
                                class180.method1197(var22, var34.field1349, var12, var13, true, var14, var23, var20, var21);
                            }
                            class169.method1147(arg3, arg4, arg2, arg8);
                            class17.method179();
                        }
                        if (class159.field3094[var12] || class135.field2651 > 1) {
                            if (var11.field1311 == 0 && !var11.field1313 && var11.field1188 > var11.field1303) {
                                class137.method996(var11.field1187 + var13, var11.field1303, var11.field1250, (byte) 29, var14, var11.field1188);
                            }
                            if (var11.field1311 != 1) {
                                if (var11.field1311 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1303; var36++) {
                                        for (int var37 = 0; var37 < var11.field1187; var37++) {
                                            int var38 = (var11.field1248 + 32) * var36 + var14;
                                            int var39 = (var11.field1233 + 32) * var37 + var13;
                                            if (var35 < 20) {
                                                var39 += var11.field1261[var35];
                                                var38 += var11.field1257[var35];
                                            }
                                            if (var11.field1264[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field1264[var35] - 1;
                                                if (var39 + 32 > arg3 && arg2 > var39 && arg4 < var38 + 32 && arg8 > var38 || class190.field3684 == var11 && class80.field1730 == var35) {
                                                    class50 var43;
                                                    if (class109.field2268 == 1 && class186.field3591 == var35 && class192.field3721 == var11.field1211) {
                                                        var43 = class18.method199(var42, 104, 2, 0, var11.field1310[var35], false);
                                                    } else {
                                                        var43 = class18.method199(var42, -102, 1, 3153952, var11.field1310[var35], false);
                                                    }
                                                    if (var43 == null) {
                                                        class20.method204(var11, (byte) -5);
                                                    } else if (class190.field3684 == var11 && class80.field1730 == var35) {
                                                        int var44 = class41.field814 - class19.field371;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class84.field1788 - class91.field1914;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class44.field892 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method444(var39 + var45, var38 + var44, 128);
                                                        if (arg0 != -1) {
                                                            class61 var46 = arg1[arg0 & 0xFFFF];
                                                            int var47 = class169.field3265;
                                                            int var48 = class169.field3266;
                                                            if (var47 > var38 + var44 && var46.field1250 > 0) {
                                                                int var49 = (var47 - var38 - var44) * class190.field3677 / 3;
                                                                if (var49 > class190.field3677 * 10) {
                                                                    var49 = class190.field3677 * 10;
                                                                }
                                                                if (var49 > var46.field1250) {
                                                                    var49 = var46.field1250;
                                                                }
                                                                var46.field1250 -= var49;
                                                                class19.field371 += var49;
                                                                class20.method204(var46, (byte) -5);
                                                            }
                                                            if (var48 < var38 + var44 + 32 && var46.field1250 < var46.field1188 - var46.field1303) {
                                                                int var50 = (var38 + var44 + 32 - var48) * class190.field3677 / 3;
                                                                if (class190.field3677 * 10 < var50) {
                                                                    var50 = class190.field3677 * 10;
                                                                }
                                                                if (var46.field1188 - var46.field1303 - var46.field1250 < var50) {
                                                                    var50 = var46.field1188 - var46.field1303 - var46.field1250;
                                                                }
                                                                var46.field1250 += var50;
                                                                class19.field371 -= var50;
                                                                class20.method204(var46, (byte) -5);
                                                            }
                                                        }
                                                    } else if (class184.field3523 == var11 && class23.field457 == var35) {
                                                        var43.method444(var39, var38, 128);
                                                    } else {
                                                        var43.method439(var39, var38);
                                                    }
                                                }
                                            } else if (var11.field1325 != null && var35 < 20) {
                                                class50 var51 = var11.method511((byte) -89, var35);
                                                if (var51 != null) {
                                                    var51.method439(var39, var38);
                                                } else if (class61.field1293) {
                                                    class20.method204(var11, (byte) -5);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field1311 == 3) {
                                    int var52;
                                    if (class131.method967((byte) -89, var11)) {
                                        var52 = var11.field1208;
                                        if (field1431 == var11 && var11.field1209 != 0) {
                                            var52 = var11.field1209;
                                        }
                                    } else {
                                        var52 = var11.field1193;
                                        if (field1431 == var11 && var11.field1231 != 0) {
                                            var52 = var11.field1231;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1230) {
                                            class169.method1149(var13, var14, var11.field1187, var11.field1303, var52);
                                        } else {
                                            class169.method1151(var13, var14, var11.field1187, var11.field1303, var52);
                                        }
                                    } else if (var11.field1230) {
                                        class169.method1142(var13, var14, var11.field1187, var11.field1303, var52, 256 - (var15 & 0xFF));
                                    } else {
                                        class169.method1153(var13, var14, var11.field1187, var11.field1303, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1311 == 4) {
                                    class89 var53 = var11.method522(0);
                                    if (var53 != null) {
                                        class47 var54 = var11.field1284;
                                        int var55;
                                        if (class131.method967((byte) 41, var11)) {
                                            var55 = var11.field1208;
                                            if (field1431 == var11 && var11.field1209 != 0) {
                                                var55 = var11.field1209;
                                            }
                                            if (var11.field1272.method376(-43) > 0) {
                                                var54 = var11.field1272;
                                            }
                                        } else {
                                            var55 = var11.field1193;
                                            if (field1431 == var11 && var11.field1231 != 0) {
                                                var55 = var11.field1231;
                                            }
                                        }
                                        if (var11.field1313 && var11.field1298 != -1) {
                                            class73 var56 = class87.method713(116, var11.field1298);
                                            var54 = var56.field1563;
                                            if (var54 == null) {
                                                var54 = class59.field1148;
                                            }
                                            if ((var56.field1610 == 1 || var11.field1292 != 1) && var11.field1292 != -1) {
                                                var54 = class5.method24(new class47[] { class34.field667, var54, class119.field2419, class188.method1244(-6068, var11.field1292) }, (byte) 75);
                                            }
                                        }
                                        if (class200.field3905 == var11) {
                                            var55 = var11.field1193;
                                            var54 = class136.field2660;
                                        }
                                        if (!var11.field1313) {
                                            var54 = class184.method1223(-19829, var11, var54);
                                        }
                                        var53.method121(var54, var13, var14, var11.field1187, var11.field1303, var55, var11.field1237 ? 0 : -1, var11.field1216, var11.field1199, var11.field1226);
                                    } else if (class61.field1293) {
                                        class20.method204(var11, (byte) -5);
                                    }
                                } else if (var11.field1311 == 5) {
                                    if (var11.field1313) {
                                        class50 var57;
                                        if (var11.field1298 == -1) {
                                            var57 = var11.method512(false, true);
                                        } else {
                                            var57 = class18.method199(var11.field1298, 103, var11.field1281, var11.field1232, var11.field1292, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field980;
                                            int var59 = var57.field979;
                                            if (var11.field1301) {
                                                class169.method1138(var13, var14, var13 + var11.field1187, var11.field1303 + var14);
                                                int var60 = (var11.field1187 + var58 - 1) / var58;
                                                int var61 = (var11.field1303 + var59 - 1) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field1236 != 0) {
                                                            var57.method443(var58 / 2 + var58 * var62 + var13, var59 * var63 + (var14 - -(var59 / 2)), var11.field1236, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method439(var13 + var58 * var62, var59 * var63 + var14);
                                                        } else {
                                                            var57.method444(var58 * var62 + var13, var59 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class169.method1147(arg3, arg4, arg2, arg8);
                                            } else {
                                                int var64 = var11.field1187 * 4096 / var58;
                                                if (var11.field1236 != 0) {
                                                    var57.method443(var11.field1187 / 2 + var13, var11.field1303 / 2 + var14, var11.field1236, var64);
                                                } else if (var15 != 0) {
                                                    var57.method440(var13, var14, var11.field1187, var11.field1303, 256 - (var15 & 0xFF));
                                                } else if (var11.field1187 == var58 && var11.field1303 == var59) {
                                                    var57.method439(var13, var14);
                                                } else {
                                                    var57.method426(var13, var14, var11.field1187, var11.field1303);
                                                }
                                            }
                                        } else if (class61.field1293) {
                                            class20.method204(var11, (byte) -5);
                                        }
                                    } else {
                                        class50 var65 = var11.method512(class131.method967((byte) -74, var11), true);
                                        if (var65 != null) {
                                            var65.method439(var13, var14);
                                        } else if (class61.field1293) {
                                            class20.method204(var11, (byte) -5);
                                        }
                                    }
                                } else if (var11.field1311 == 6) {
                                    boolean var66 = class131.method967((byte) -55, var11);
                                    int var67;
                                    if (var66) {
                                        var67 = var11.field1262;
                                    } else {
                                        var67 = var11.field1314;
                                    }
                                    int var68 = 0;
                                    class30 var69 = null;
                                    if (var11.field1298 != -1) {
                                        class73 var70 = class87.method713(114, var11.field1298);
                                        if (var70 != null) {
                                            class73 var71 = var70.method647(var11.field1292, (byte) -82);
                                            var69 = var71.method634(2801, null, 0, 1);
                                            if (var69 == null) {
                                                class20.method204(var11, (byte) -5);
                                            } else {
                                                var69.method266();
                                                var68 = -var69.field1928 / 2;
                                            }
                                        }
                                    } else if (var11.field1259 == 5) {
                                        if (var11.field1184 == -1) {
                                            var69 = class205.field4038.method1210(-1, null, null, arg9 ^ 0x51, -1);
                                        } else {
                                            int var73 = var11.field1184 & 0x7FF;
                                            if (class180.field3443 == var73) {
                                                var73 = 2047;
                                            }
                                            class32 var74 = class40.field795[var73];
                                            class22 var75 = var67 == -1 ? null : class25.method236(false, var67);
                                            if (var74 != null && (int) var74.field598.method399(115) << 11 == (var11.field1184 & 0xFFFFF800)) {
                                                var69 = var74.field606.method1210(0, var75, null, 105, var11.field1201);
                                            }
                                        }
                                    } else if (var67 == -1) {
                                        var69 = var11.method516(class123.field2489.field606, var66, null, -1, -1);
                                        if (var69 == null && class61.field1293) {
                                            class20.method204(var11, (byte) -5);
                                        }
                                    } else {
                                        class22 var72 = class25.method236(false, var67);
                                        var69 = var11.method516(class123.field2489.field606, var66, var72, var11.field1201, -1);
                                        if (var69 == null && class61.field1293) {
                                            class20.method204(var11, (byte) -5);
                                        }
                                    }
                                    if (var69 != null) {
                                        class17.method180(var11.field1187 / 2 + var13 + var11.field1197, var11.field1303 / 2 + var14 + var11.field1279);
                                        int var76 = class17.field341[var11.field1220] * var11.field1307 >> 16;
                                        int var77 = class17.field350[var11.field1220] * var11.field1307 >> 16;
                                        if (!var11.field1313) {
                                            var69.method51(0, var11.field1283, 0, var11.field1220, 0, var76, var77);
                                        } else if (var11.field1256) {
                                            var69.method42(0, var11.field1283, var11.field1277, var11.field1220, var11.field1318, var68 + var11.field1189 + var76, var11.field1189 + var77, var11.field1307);
                                        } else {
                                            var69.method51(0, var11.field1283, var11.field1277, var11.field1220, var11.field1318, var68 + var76 + var11.field1189, var77 - -var11.field1189);
                                        }
                                        class17.method187();
                                    }
                                } else {
                                    if (var11.field1311 == 7) {
                                        class89 var78 = var11.method522(arg9 ^ 0x1);
                                        if (var78 == null) {
                                            if (class61.field1293) {
                                                class20.method204(var11, (byte) -5);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field1303; var80++) {
                                            for (int var81 = 0; var81 < var11.field1187; var81++) {
                                                if (var11.field1264[var79] > 0) {
                                                    class73 var82 = class87.method713(114, var11.field1264[var79] - 1);
                                                    class47 var83;
                                                    if (var82.field1610 != 1 && var11.field1310[var79] == 1) {
                                                        var83 = class5.method24(new class47[] { class34.field667, var82.field1563, class8.field157 }, (byte) 116);
                                                    } else {
                                                        var83 = class5.method24(new class47[] { class34.field667, var82.field1563, class119.field2419, class188.method1244(arg9 ^ 0xFFFFE84D, var11.field1310[var79]) }, (byte) 65);
                                                    }
                                                    int var84 = (var11.field1248 + 12) * var80 + var14;
                                                    int var85 = (var11.field1233 + 115) * var81 + var13;
                                                    if (var11.field1216 == 0) {
                                                        var78.method122(var83, var85, var84, var11.field1193, var11.field1237 ? 0 : -1);
                                                    } else if (var11.field1216 == 1) {
                                                        var78.method98(var83, var11.field1187 / 2 + var85, var84, var11.field1193, var11.field1237 ? 0 : -1);
                                                    } else {
                                                        var78.method114(var83, var85 + var11.field1187 - 1, var84, var11.field1193, var11.field1237 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field1311 == 8 && class60.field1177 == var11 && class63.field1351 == class130.field2572) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        class47 var88 = var11.field1284;
                                        class89 var89 = class47.field946;
                                        class47 var90 = class184.method1223(arg9 - 19830, var11, var88);
                                        while (var90.method376(arg9 - 44) > 0) {
                                            int var98 = var90.method378(arg9 + 3, class187.field3612);
                                            class47 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class181.field3472;
                                            } else {
                                                var99 = var90.method401(var98, 0, -49);
                                                var90 = var90.method380((byte) 26, var98 + 4);
                                            }
                                            int var100 = var89.method116(var99);
                                            var87 += var89.field263 + 1;
                                            if (var86 < var100) {
                                                var86 = var100;
                                            }
                                        }
                                        var87 += 7;
                                        var86 += 6;
                                        int var91 = var13 + var11.field1187 - var86 - 5;
                                        if (var91 < var13 + 5) {
                                            var91 = var13 + 5;
                                        }
                                        int var92 = var11.field1303 + var14 + 5;
                                        if (arg8 < var92 + var87) {
                                            var92 = arg8 - var87;
                                        }
                                        if (var86 + var91 > arg2) {
                                            var91 = arg2 - var86;
                                        }
                                        class169.method1149(var91, var92, var86, var87, 16777120);
                                        class169.method1151(var91, var92, var86, var87, 0);
                                        int var93 = var89.field263 + var92 + 2;
                                        class47 var94 = var11.field1284;
                                        class47 var95 = class184.method1223(-19829, var11, var94);
                                        while (var95.method376(-43) > 0) {
                                            int var96 = var95.method378(4, class187.field3612);
                                            class47 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class181.field3472;
                                            } else {
                                                var97 = var95.method401(var96, 0, -49);
                                                var95 = var95.method380((byte) 26, var96 + 4);
                                            }
                                            var89.method122(var97, var91 + 3, var93, 0, -1);
                                            var93 += var89.field263 + 1;
                                        }
                                    }
                                    if (var11.field1311 == 9) {
                                        if (var11.field1195 == 1) {
                                            class169.method1144(var13, var14, var13 + var11.field1187, var11.field1303 + var14, var11.field1193);
                                        } else {
                                            int var101 = var11.field1187 >= 0 ? var11.field1187 : -var11.field1187;
                                            int var102 = var101;
                                            int var103 = var11.field1303 >= 0 ? var11.field1303 : -var11.field1303;
                                            if (var103 > var101) {
                                                var102 = var103;
                                            }
                                            if (var102 != 0) {
                                                int var104 = (var11.field1187 << 16) / var102;
                                                int var105 = (var11.field1303 << 16) / var102;
                                                int var106 = var13 - arg3;
                                                if (var104 < var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var104 = -var104;
                                                }
                                                int var107 = var14 - arg4;
                                                int var108 = var11.field1195 * var104 + 1 >> 17;
                                                int var109 = var11.field1195 * var105 + 1 >> 17;
                                                int var110 = var11.field1195 * var104 >> 17;
                                                int var111 = var106 + var11.field1187 - var109;
                                                int var112 = var106 - var109;
                                                int var113 = var107 + var110;
                                                int var114 = var107 - var108;
                                                int var115 = var11.field1195 * var105 >> 17;
                                                int var116 = var11.field1187 + var106 + var115;
                                                int var117 = var107 + var11.field1303 - var108;
                                                int var118 = var11.field1303 + var107 + var110;
                                                int var119 = var106 + var115;
                                                class17.method182(var119, var112, var111);
                                                class17.method188(var113, var114, var117, var119, var112, var111, var11.field1193);
                                                class17.method182(var119, var111, var116);
                                                class17.method188(var113, var117, var118, var119, var111, var116, var11.field1193);
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

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)V")
    public static final void method558(boolean arg0) {
        field1448++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class95.field1971 - 1; var2++) {
                if (class25.field478[var2] < 1000 && class25.field478[var2 + 1] > 1000) {
                    var1 = false;
                    class47 var3 = class80.field1731[var2];
                    class80.field1731[var2] = class80.field1731[var2 + 1];
                    class80.field1731[var2 + 1] = var3;
                    class47 var4 = class166.field3224[var2];
                    class166.field3224[var2] = class166.field3224[var2 + 1];
                    class166.field3224[var2 + 1] = var4;
                    int var5 = class9.field210[var2];
                    class9.field210[var2] = class9.field210[var2 + 1];
                    class9.field210[var2 + 1] = var5;
                    int var6 = class55.field1063[var2];
                    class55.field1063[var2] = class55.field1063[var2 + 1];
                    class55.field1063[var2 + 1] = var6;
                    short var7 = class25.field478[var2];
                    class25.field478[var2] = class25.field478[var2 + 1];
                    class25.field478[var2 + 1] = var7;
                    long var8 = class173.field3341[var2];
                    class173.field3341[var2] = class173.field3341[var2 + 1];
                    class173.field3341[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZI)V")
    public static final void method559(int arg0, boolean arg1, int arg2) {
        field1444++;
        if (class95.field1971 < 2 && class109.field2268 == 0 && !class78.field1688) {
            return;
        }
        class47 var3;
        if (class109.field2268 == 1 && class95.field1971 < 2) {
            var3 = class5.method24(new class47[] { class98.field2082, class26.field492, class179.field3435, class96.field2045 }, (byte) 100);
        } else if (class78.field1688 && class95.field1971 < 2) {
            var3 = class5.method24(new class47[] { class35.field686, class26.field492, class117.field2371, class96.field2045 }, (byte) 127);
        } else {
            var3 = class100.method810(class95.field1971 - 1, false);
        }
        if (class95.field1971 > 2) {
            var3 = class5.method24(new class47[] { var3, class184.field3528, class167.method1133(class95.field1971 - 2, (byte) -110), class79.field1708 }, (byte) 100);
        }
        int var4 = class52.field1014.method93(var3, arg2 + 4, arg0 + 15, 16777215, 0, class75.field1636, class202.field3932);
        if (!arg1) {
            method557(-4, null, -8, 77, -7, -67, -45, 23, 108, -115);
        }
        class27.method249(arg0, -23343, var4 + class52.field1014.method116(var3), 15, arg2 + 4);
    }
}
