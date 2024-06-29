import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class121 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lkb;")
    public static class93 field2247 = class76.method390("<)4col>", 0);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
    public static boolean field2241 = false;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lkb;")
    private static class93 field2245 = class76.method390("Your account is already logged in)3", 0);

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2250 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lkb;")
    public static class93 field2238 = field2245;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "J")
    public static long field2244;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2246;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)Z")
    public static final boolean method684(int arg0, int arg1, int arg2, byte[] arg3) {
        field2249++;
        if (arg2 != -104) {
            return false;
        }
        boolean var4 = true;
        class158 var5 = new class158(arg3);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1072(-25182);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1072(arg2 - 25078);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var5.method1054(128) >> 2;
                    int var14 = var8 >> 6 & 0x3F;
                    int var15 = arg0 + var12;
                    int var16 = arg1 + var14;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class81 var17 = class154.method990(var6, true);
                        if (var13 != 22 || !class82.field1515 || var17.field1478 != 0 || var17.field1480 == 1 || var17.field1489) {
                            if (!var17.method416(true)) {
                                var4 = false;
                                class85.field1552++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1072(-25182);
                if (var10 == 0) {
                    break;
                }
                var5.method1054(128);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[Lh;IIIIIZ)V")
    public static final void method685(int arg0, int arg1, int arg2, class65[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field2239++;
        if (arg9) {
            return;
        }
        class118.method656(arg4, arg0, arg6, arg5);
        class150.method918();
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class65 var11 = arg3[var10];
            if (var11 != null && (var11.field1143 == arg2 || arg2 == -1412584499 && class73.field1348 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class136.field2645[class23.field357] = var11.field1113 + arg8;
                    class36.field592[class23.field357] = var11.field1090 + arg1;
                    class49.field783[class23.field357] = var11.field1044;
                    class64.field1024[class23.field357] = var11.field1052;
                    var12 = class23.field357++;
                } else {
                    var12 = arg7;
                }
                var11.field1109 = class21.field338;
                var11.field1135 = var12;
                if (!var11.field1152 || !class131.method766(var11, -30568)) {
                    if (var11.field1056 > 0) {
                        class69.method366(325, var11);
                    }
                    int var13 = var11.field1172;
                    int var14 = var11.field1113 + arg8;
                    int var15 = var11.field1090 + arg1;
                    if (class73.field1348 == var11) {
                        if (arg2 != -1412584499 && !var11.field1181) {
                            class122.field2274 = arg1;
                            class26.field397 = arg3;
                            field2248 = arg8;
                            continue;
                        }
                        if (!var11.field1181) {
                            var13 = 128;
                        }
                        if (client.field499 && class75.field1356) {
                            int var16 = class170.field3380;
                            int var17 = var16 - class184.field3635;
                            int var18 = class97.field1826;
                            if (class139.field2695 > var17) {
                                var17 = class139.field2695;
                            }
                            int var19 = var18 - class1.field26;
                            if (var17 + var11.field1052 > class139.field2695 + class32.field520.field1052) {
                                var17 = class139.field2695 + class32.field520.field1052 - var11.field1052;
                            }
                            if (var19 < class30.field511) {
                                var19 = class30.field511;
                            }
                            if (class30.field511 + class32.field520.field1044 < var11.field1044 + var19) {
                                var19 = class30.field511 + class32.field520.field1044 - var11.field1044;
                            }
                            var15 = var17;
                            var14 = var19;
                        }
                    }
                    int var24;
                    int var25;
                    int var28;
                    int var29;
                    if (var11.field1076 == 2) {
                        var24 = arg4;
                        var25 = arg6;
                        var28 = arg0;
                        var29 = arg5;
                    } else if (var11.field1076 == 9) {
                        int var20 = var14;
                        int var21 = var15;
                        int var22 = var11.field1044 + var14;
                        if (var14 > var22) {
                            var20 = var22;
                            var22 = var14;
                        }
                        var24 = var20 > arg4 ? var20 : arg4;
                        var22++;
                        var25 = var22 >= arg6 ? arg6 : var22;
                        int var26 = var11.field1052 + var15;
                        if (var26 < var15) {
                            var21 = var26;
                            var26 = var15;
                        }
                        var28 = var21 <= arg0 ? arg0 : var21;
                        var26++;
                        var29 = var26 >= arg5 ? arg5 : var26;
                    } else {
                        var24 = var14 <= arg4 ? arg4 : var14;
                        var28 = arg0 >= var15 ? arg0 : var15;
                        int var30 = var11.field1044 + var14;
                        var25 = var30 < arg6 ? var30 : arg6;
                        int var31 = var15 + var11.field1052;
                        var29 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var11.field1152 || var24 < var25 && var28 < var29) {
                        if (var11.field1056 != 0) {
                            if (var11.field1056 == 1337) {
                                class64.field1023 = var15;
                                class102.field1880 = var14;
                                class114.method633(var15, var14, var11.field1044, var11.field1052, -128);
                                class118.method656(arg4, arg0, arg6, arg5);
                                continue;
                            }
                            if (var11.field1056 == 1338) {
                                class152.method951(var15, true, var12, var14);
                                class118.method656(arg4, arg0, arg6, arg5);
                                continue;
                            }
                        }
                        int var32 = class170.field3380;
                        int var33 = class97.field1826;
                        if (!field2241 && var33 >= var24 && var32 >= var28 && var25 > var33 && var29 > var32) {
                            class49.method263(var11, 806872871, var33 - var14, -var15 + var32);
                        }
                        if (var11.field1076 == 0) {
                            if (!var11.field1152 && class131.method766(var11, -30568) && class80.field1418 != var11) {
                                continue;
                            }
                            if (!var11.field1152) {
                                if (var11.field1162 > var11.field1103 - var11.field1052) {
                                    var11.field1162 = var11.field1103 - var11.field1052;
                                }
                                if (var11.field1162 < 0) {
                                    var11.field1162 = 0;
                                }
                            }
                            method685(var28, var15 - var11.field1162, var11.field1058, arg3, var24, var29, var25, var12, var14 - var11.field1122, false);
                            if (var11.field1121 != null) {
                                method685(var28, var15 - var11.field1162, var11.field1058, var11.field1121, var24, var29, var25, var12, var14 - var11.field1122, false);
                            }
                            class78 var34 = (class78) class147.field2834.method616((long) var11.field1058, -1);
                            if (var34 != null) {
                                if (var34.field1401 == 0 && class97.field1826 >= var24 && var28 <= class170.field3380 && var25 > class97.field1826 && class170.field3380 < var29 && !field2241 && !class135.field2620) {
                                    class171.field3391[0] = class32.field530;
                                    class35.field575[0] = class43.field712;
                                    class100.field1841 = 1;
                                    class152.field2944[0] = 1003;
                                }
                                class127.method720(var28, var25, var14, var12, var34.field1406, var24, var15, var29, true);
                            }
                            class118.method656(arg4, arg0, arg6, arg5);
                            class150.method918();
                        }
                        if (class151.field2934[var12] || class144.field2797 > 1) {
                            if (var11.field1076 == 0 && !var11.field1152 && var11.field1103 > var11.field1052) {
                                class85.method434(var11.field1052, (byte) -62, var11.field1162, var15, var11.field1044 + var14, var11.field1103);
                            }
                            if (var11.field1076 != 1) {
                                if (var11.field1076 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1052; var36++) {
                                        for (int var37 = 0; var37 < var11.field1044; var37++) {
                                            int var38 = (var11.field1071 + 32) * var36 + var15;
                                            int var39 = var14 + (var11.field1169 + 32) * var37;
                                            if (var35 < 20) {
                                                var39 += var11.field1145[var35];
                                                var38 += var11.field1165[var35];
                                            }
                                            if (var11.field1146[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field1146[var35] - 1;
                                                if (var39 + 32 > arg4 && var39 < arg6 && var38 + 32 > arg0 && var38 < arg5 || class153.field3010 == var11 && class63.field995 == var35) {
                                                    class129 var43;
                                                    if (class144.field2800 == 1 && class148.field2852 == var35 && class141.field2753 == var11.field1058) {
                                                        var43 = class186.method1215(0, 9, var42, 2, false, var11.field1102[var35]);
                                                    } else {
                                                        var43 = class186.method1215(3153952, 9, var42, 1, false, var11.field1102[var35]);
                                                    }
                                                    if (var43 == null) {
                                                        class160.method1095(0, var11);
                                                    } else if (class153.field3010 == var11 && class63.field995 == var35) {
                                                        int var44 = class170.field3380 - class111.field1996;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class97.field1826 - class68.field1244;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class23.field356 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method742(var39 + var45, var38 - -var44, 128);
                                                        if (arg2 != -1) {
                                                            int var46 = class118.field2200;
                                                            int var47 = class118.field2203;
                                                            class65 var48 = arg3[arg2 & 0xFFFF];
                                                            if (var47 > var38 + var44 && var48.field1162 > 0) {
                                                                int var49 = (var47 - var44 - var38) * class24.field363 / 3;
                                                                if (var49 > class24.field363 * 10) {
                                                                    var49 = class24.field363 * 10;
                                                                }
                                                                if (var48.field1162 < var49) {
                                                                    var49 = var48.field1162;
                                                                }
                                                                var48.field1162 -= var49;
                                                                class111.field1996 += var49;
                                                                class160.method1095(0, var48);
                                                            }
                                                            if (var38 + var44 + 32 > var46 && var48.field1162 < var48.field1103 - var48.field1052) {
                                                                int var50 = (var38 + var44 + 32 - var46) * class24.field363 / 3;
                                                                if (class24.field363 * 10 < var50) {
                                                                    var50 = class24.field363 * 10;
                                                                }
                                                                if (var48.field1103 - var48.field1052 - var48.field1162 < var50) {
                                                                    var50 = var48.field1103 - var48.field1162 - var48.field1052;
                                                                }
                                                                class111.field1996 -= var50;
                                                                var48.field1162 += var50;
                                                                class160.method1095(0, var48);
                                                            }
                                                        }
                                                    } else if (class107.field1947 == var11 && class203.field3921 == var35) {
                                                        var43.method742(var39, var38, 128);
                                                    } else {
                                                        var43.method737(var39, var38);
                                                    }
                                                }
                                            } else if (var11.field1154 != null && var35 < 20) {
                                                class129 var51 = var11.method338(var35, 7702);
                                                if (var51 != null) {
                                                    var51.method737(var39, var38);
                                                } else if (class75.field1359) {
                                                    class160.method1095(0, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field1076 == 3) {
                                    int var52;
                                    if (class137.method861(var11, 17108)) {
                                        var52 = var11.field1040;
                                        if (class80.field1418 == var11 && var11.field1120 != 0) {
                                            var52 = var11.field1120;
                                        }
                                    } else {
                                        var52 = var11.field1167;
                                        if (class80.field1418 == var11 && var11.field1134 != 0) {
                                            var52 = var11.field1134;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1074) {
                                            class118.method651(var14, var15, var11.field1044, var11.field1052, var52);
                                        } else {
                                            class118.method669(var14, var15, var11.field1044, var11.field1052, var52);
                                        }
                                    } else if (var11.field1074) {
                                        class118.method654(var14, var15, var11.field1044, var11.field1052, var52, 256 - (var13 & 0xFF));
                                    } else {
                                        class118.method653(var14, var15, var11.field1044, var11.field1052, var52, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1076 == 4) {
                                    class45 var53 = var11.method343(-121);
                                    if (var53 != null) {
                                        class93 var54 = var11.field1131;
                                        int var55;
                                        if (class137.method861(var11, 17108)) {
                                            var55 = var11.field1040;
                                            if (class80.field1418 == var11 && var11.field1120 != 0) {
                                                var55 = var11.field1120;
                                            }
                                            if (var11.field1100.method510(124) > 0) {
                                                var54 = var11.field1100;
                                            }
                                        } else {
                                            var55 = var11.field1167;
                                            if (class80.field1418 == var11 && var11.field1134 != 0) {
                                                var55 = var11.field1134;
                                            }
                                        }
                                        if (var11.field1152 && var11.field1038 != -1) {
                                            class166 var56 = class166.method1126(126, var11.field1038);
                                            var54 = var56.field3281;
                                            if (var54 == null) {
                                                var54 = class73.field1345;
                                            }
                                            if ((var56.field3288 == 1 || var11.field1132 != 1) && var11.field1132 != -1) {
                                                var54 = class203.method1321(new class93[] { class64.field1026, var54, class29.field468, class151.method943(var11.field1132, (byte) -94) }, -17);
                                            }
                                        }
                                        if (class82.field1511 == var11) {
                                            var54 = class151.field2917;
                                            var55 = var11.field1167;
                                        }
                                        if (!var11.field1152) {
                                            var54 = class73.method382(var54, var11, (byte) 96);
                                        }
                                        var53.method1011(var54, var14, var15, var11.field1044, var11.field1052, var55, var11.field1064 ? 0 : -1, var11.field1101, var11.field1142, var11.field1094);
                                    } else if (class75.field1359) {
                                        class160.method1095(0, var11);
                                    }
                                } else if (var11.field1076 == 5) {
                                    if (var11.field1152) {
                                        class129 var57;
                                        if (var11.field1038 == -1) {
                                            var57 = var11.method341((byte) -122, false);
                                        } else {
                                            var57 = class186.method1215(var11.field1148, 9, var11.field1038, var11.field1050, false, var11.field1132);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field2447;
                                            int var59 = var57.field2448;
                                            if (var11.field1067) {
                                                class118.method658(var14, var15, var11.field1044 + var14, var11.field1052 + var15);
                                                int var60 = (var11.field1044 + var59 - 1) / var59;
                                                int var61 = (var58 + var11.field1052 - 1) / var58;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field1138 != 0) {
                                                            var57.method740(var59 / 2 + var59 * var62 + var14, var58 / 2 + (var15 - -(var58 * var63)), var11.field1138, 4096);
                                                        } else if (var13 == 0) {
                                                            var57.method737(var59 * var62 + var14, var15 - -(var58 * var63));
                                                        } else {
                                                            var57.method742(var59 * var62 + var14, var58 * var63 + var15, 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class118.method656(arg4, arg0, arg6, arg5);
                                            } else {
                                                int var64 = var11.field1044 * 4096 / var59;
                                                if (var11.field1138 != 0) {
                                                    var57.method740(var11.field1044 / 2 + var14, var11.field1052 / 2 + var15, var11.field1138, var64);
                                                } else if (var13 != 0) {
                                                    var57.method748(var14, var15, var11.field1044, var11.field1052, 256 - (var13 & 0xFF));
                                                } else if (var11.field1044 == var59 && var11.field1052 == var58) {
                                                    var57.method737(var14, var15);
                                                } else {
                                                    var57.method744(var14, var15, var11.field1044, var11.field1052);
                                                }
                                            }
                                        } else if (class75.field1359) {
                                            class160.method1095(0, var11);
                                        }
                                    } else {
                                        class129 var65 = var11.method341((byte) -125, class137.method861(var11, 17108));
                                        if (var65 != null) {
                                            var65.method737(var14, var15);
                                        } else if (class75.field1359) {
                                            class160.method1095(0, var11);
                                        }
                                    }
                                } else if (var11.field1076 == 6) {
                                    boolean var66 = class137.method861(var11, 17108);
                                    int var67;
                                    if (var66) {
                                        var67 = var11.field1171;
                                    } else {
                                        var67 = var11.field1173;
                                    }
                                    class52 var68 = null;
                                    int var69 = 0;
                                    if (var11.field1038 != -1) {
                                        class166 var74 = class166.method1126(-83, var11.field1038);
                                        if (var74 != null) {
                                            class166 var75 = var74.method1117(0, var11.field1132);
                                            var68 = var75.method1121(null, 1, -62, 0);
                                            if (var68 == null) {
                                                class160.method1095(0, var11);
                                            } else {
                                                var68.method269();
                                                var69 = -var68.field73 / 2;
                                            }
                                        }
                                    } else if (var11.field1174 == 5) {
                                        if (var11.field1037 == -1) {
                                            var68 = class81.field1471.method881(-1, -257, -1, null, null);
                                        } else {
                                            int var71 = var11.field1037 & 0x7FF;
                                            if (class6.field111 == var71) {
                                                var71 = 2047;
                                            }
                                            class34 var72 = class206.field4035[var71];
                                            class37 var73 = var67 == -1 ? null : class39.method213(-10639, var67);
                                            if (var72 != null && (int) var72.field550.method482(-114) << 11 == (var11.field1037 & 0xFFFFF800)) {
                                                var68 = var72.field560.method881(var11.field1043, -257, 0, null, var73);
                                            }
                                        }
                                    } else if (var67 == -1) {
                                        var68 = var11.method336(var66, -1, (byte) 47, null, class106.field1940.field560);
                                        if (var68 == null && class75.field1359) {
                                            class160.method1095(0, var11);
                                        }
                                    } else {
                                        class37 var70 = class39.method213(-10639, var67);
                                        var68 = var11.method336(var66, var11.field1043, (byte) 39, var70, class106.field1940.field560);
                                        if (var68 == null && class75.field1359) {
                                            class160.method1095(0, var11);
                                        }
                                    }
                                    if (var68 != null) {
                                        class150.method921(var11.field1044 / 2 + var14 + var11.field1175, var11.field1052 / 2 + (var15 - -var11.field1170));
                                        int var76 = class150.field2896[var11.field1111] * var11.field1082 >> 16;
                                        int var77 = class150.field2888[var11.field1111] * var11.field1082 >> 16;
                                        if (!var11.field1152) {
                                            var68.method272(0, var11.field1157, 0, var11.field1111, 0, var76, var77);
                                        } else if (var11.field1156) {
                                            var68.method278(0, var11.field1157, var11.field1180, var11.field1111, var11.field1140, var76 + var69 + var11.field1054, var11.field1054 + var77, var11.field1082);
                                        } else {
                                            var68.method272(0, var11.field1157, var11.field1180, var11.field1111, var11.field1140, var69 + var76 + var11.field1054, var77 - -var11.field1054);
                                        }
                                        class150.method922();
                                    }
                                } else {
                                    if (var11.field1076 == 7) {
                                        class45 var78 = var11.method343(-126);
                                        if (var78 == null) {
                                            if (class75.field1359) {
                                                class160.method1095(0, var11);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field1052; var80++) {
                                            for (int var81 = 0; var81 < var11.field1044; var81++) {
                                                if (var11.field1146[var79] > 0) {
                                                    class166 var82 = class166.method1126(98, var11.field1146[var79] - 1);
                                                    class93 var83;
                                                    if (var82.field3288 != 1 && var11.field1102[var79] == 1) {
                                                        var83 = class203.method1321(new class93[] { class64.field1026, var82.field3281, field2247 }, -45);
                                                    } else {
                                                        var83 = class203.method1321(new class93[] { class64.field1026, var82.field3281, class29.field468, class151.method943(var11.field1102[var79], (byte) -100) }, -57);
                                                    }
                                                    int var84 = (var11.field1071 + 12) * var80 + var15;
                                                    int var85 = (var11.field1169 + 115) * var81 + var14;
                                                    if (var11.field1101 == 0) {
                                                        var78.method1013(var83, var85, var84, var11.field1167, var11.field1064 ? 0 : -1);
                                                    } else if (var11.field1101 == 1) {
                                                        var78.method997(var83, var11.field1044 / 2 + var85, var84, var11.field1167, var11.field1064 ? 0 : -1);
                                                    } else {
                                                        var78.method1004(var83, var85 + var11.field1044 - 1, var84, var11.field1167, var11.field1064 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field1076 == 8 && class145.field2823 == var11 && class19.field312 == class113.field2113) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        class45 var88 = class26.field410;
                                        class93 var89 = var11.field1131;
                                        class93 var90 = class73.method382(var89, var11, (byte) -118);
                                        while (var90.method510(21) > 0) {
                                            int var98 = var90.method489((byte) 72, class128.field2430);
                                            class93 var99;
                                            if (var98 == -1) {
                                                var99 = var90;
                                                var90 = class43.field712;
                                            } else {
                                                var99 = var90.method497((byte) -98, var98, 0);
                                                var90 = var90.method514(109, var98 + 4);
                                            }
                                            int var100 = var88.method1005(var99);
                                            var87 += var88.field3101 + 1;
                                            if (var100 > var86) {
                                                var86 = var100;
                                            }
                                        }
                                        int var91 = var15 + var11.field1052 + 5;
                                        var86 += 6;
                                        var87 += 7;
                                        int var92 = var14 + var11.field1044 - var86 - 5;
                                        if (arg5 < var87 + var91) {
                                            var91 = arg5 - var87;
                                        }
                                        if (var14 + 5 > var92) {
                                            var92 = var14 + 5;
                                        }
                                        if (var86 + var92 > arg6) {
                                            var92 = arg6 - var86;
                                        }
                                        class118.method651(var92, var91, var86, var87, 16777120);
                                        class118.method669(var92, var91, var86, var87, 0);
                                        class93 var93 = var11.field1131;
                                        int var94 = var88.field3101 + var91 + 2;
                                        class93 var95 = class73.method382(var93, var11, (byte) 3);
                                        while (var95.method510(119) > 0) {
                                            int var96 = var95.method489((byte) 40, class128.field2430);
                                            class93 var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = class43.field712;
                                            } else {
                                                var97 = var95.method497((byte) -110, var96, 0);
                                                var95 = var95.method514(70, var96 + 4);
                                            }
                                            var88.method1013(var97, var92 + 3, var94, 0, -1);
                                            var94 += var88.field3101 + 1;
                                        }
                                    }
                                    if (var11.field1076 == 9) {
                                        if (var11.field1066 == 1) {
                                            class118.method668(var14, var15, var11.field1044 + var14, var11.field1052 + var15, var11.field1167);
                                        } else {
                                            int var101 = var11.field1044 >= 0 ? var11.field1044 : -var11.field1044;
                                            int var102 = var11.field1052 >= 0 ? var11.field1052 : -var11.field1052;
                                            int var103 = var101;
                                            if (var102 > var101) {
                                                var103 = var102;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var11.field1044 << 16) / var103;
                                                int var105 = (var11.field1052 << 16) / var103;
                                                if (var105 <= var104) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var106 = var11.field1066 * var105 + 1 >> 17;
                                                int var107 = var11.field1066 * var105 >> 17;
                                                int var108 = var11.field1066 * var104 + 1 >> 17;
                                                int var109 = var11.field1066 * var104 >> 17;
                                                int var110 = var14 - arg4;
                                                int var111 = var15 - arg0;
                                                int var112 = var107 + var110;
                                                int var113 = var110 - var106;
                                                int var114 = var110 + var11.field1044 - var106;
                                                int var115 = var109 + var111;
                                                int var116 = var107 + var110 + var11.field1044;
                                                int var117 = var111 + var11.field1052 - var108;
                                                int var118 = var111 + var11.field1052 + var109;
                                                int var119 = var111 - var108;
                                                class150.method930(var112, var113, var114);
                                                class150.method927(var115, var119, var117, var112, var113, var114, var11.field1167);
                                                class150.method930(var112, var114, var116);
                                                class150.method927(var115, var117, var118, var112, var114, var116, var11.field1167);
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method686(byte arg0) {
        field2238 = null;
        if (arg0 <= 114) {
            method685(-99, -126, 3, null, -128, -98, -21, 47, 93, true);
        }
        field2247 = null;
        field2245 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lrd;[BB)V")
    public final void method687(class158 arg0, byte[] arg1, byte arg2) {
        field2243++;
        if (arg0.field3162[arg0.field3153] != 31 || arg0.field3162[arg0.field3153 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2246 == null) {
            this.field2246 = new Inflater(true);
        }
        try {
            this.field2246.setInput(arg0.field3162, arg0.field3153 + 10, arg0.field3162.length - 8 - (arg0.field3153 + 10));
            this.field2246.inflate(arg1);
        } catch (Exception var4) {
            this.field2246.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2246.reset();
        if (arg2 != -109) {
            field2238 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
    public static final boolean method688(int arg0) {
        long var1 = class171.method1146((byte) 112);
        field2240++;
        int var3 = (int) (var1 - field2244);
        if (var3 > 200) {
            var3 = 200;
        }
        if (arg0 != 4096) {
            method688(45);
        }
        class175.field3457 += var3;
        field2244 = var1;
        if (class15.field271 == 0 && class25.field373 == 0 && class85.field1549 == 0 && class155.field3054 == 0) {
            return true;
        } else if (class62.field986 == null) {
            return false;
        } else {
            try {
                if (class175.field3457 > 30000) {
                    throw new IOException();
                }
                while (class25.field373 < 20 && class155.field3054 > 0) {
                    class161 var4 = (class161) class207.field4045.method612(12981);
                    class158 var5 = new class158(4);
                    var5.method1069(1, (byte) -26);
                    var5.method1050(false, (int) var4.field718);
                    class62.field986.method6(0, var5.field3162, 4, (byte) 121);
                    class9.field142.method617(arg0 - 4096, var4.field718, var4);
                    class155.field3054--;
                    class25.field373++;
                }
                while (class15.field271 < 20 && class85.field1549 > 0) {
                    class161 var6 = (class161) class92.field1678.method78(120);
                    class158 var7 = new class158(4);
                    var7.method1069(0, (byte) -26);
                    var7.method1050(false, (int) var6.field718);
                    class62.field986.method6(0, var7.field3162, 4, (byte) 89);
                    var6.method60((byte) -93);
                    class126.field2368.method617(0, var6.field718, var6);
                    class15.field271++;
                    class85.field1549--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class62.field986.method4(arg0 ^ 0x1005);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class175.field3457 = 0;
                    byte var10 = 0;
                    if (class191.field3736 == null) {
                        var10 = 8;
                    } else if (class61.field982 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class106.field1937.field3153;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class62.field986.method3(class106.field1937.field3162, -1, var11, class106.field1937.field3153);
                        if (class68.field1264 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class106.field1937.field3162[class106.field1937.field3153 + var12] = (byte) class29.method159(class106.field1937.field3162[class106.field1937.field3153 + var12], class68.field1264);
                            }
                        }
                        class106.field1937.field3153 += var11;
                        if (var10 > class106.field1937.field3153) {
                            break;
                        }
                        if (class191.field3736 == null) {
                            class106.field1937.field3153 = 0;
                            int var13 = class106.field1937.method1054(128);
                            int var14 = class106.field1937.method1071(arg0 ^ 0x7DC5);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class106.field1937.method1054(arg0 - 3968);
                            int var18 = class106.field1937.method1076(24277);
                            class161 var19 = (class161) class9.field142.method616(var15, -1);
                            class131.field2467 = true;
                            if (var19 == null) {
                                var19 = (class161) class126.field2368.method616(var15, -1);
                                class131.field2467 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class191.field3736 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class79.field1414 = new class158(var18 + var20 + class191.field3736.field3218);
                            class79.field1414.method1069(var17, (byte) -26);
                            class79.field1414.method1051(true, var18);
                            class61.field982 = 8;
                            class106.field1937.field3153 = 0;
                        } else if (class61.field982 == 0) {
                            if (class106.field1937.field3162[0] == -1) {
                                class61.field982 = 1;
                                class106.field1937.field3153 = 0;
                            } else {
                                class191.field3736 = null;
                            }
                        }
                    } else {
                        int var21 = class79.field1414.field3162.length - class191.field3736.field3218;
                        int var22 = 512 - class61.field982;
                        if (var22 > var21 - class79.field1414.field3153) {
                            var22 = var21 - class79.field1414.field3153;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        class62.field986.method3(class79.field1414.field3162, -1, var22, class79.field1414.field3153);
                        if (class68.field1264 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class79.field1414.field3162[class79.field1414.field3153 + var23] = (byte) class29.method159(class79.field1414.field3162[class79.field1414.field3153 + var23], class68.field1264);
                            }
                        }
                        class79.field1414.field3153 += var22;
                        class61.field982 += var22;
                        if (class79.field1414.field3153 == var21) {
                            if (class191.field3736.field718 == 16711935L) {
                                class68.field1243 = class79.field1414;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class114 var26 = class153.field3013[var25];
                                    if (var26 != null) {
                                        class68.field1243.field3153 = var25 * 8 + 5;
                                        int var27 = class68.field1243.method1076(arg0 + 20181);
                                        int var28 = class68.field1243.method1076(24277);
                                        var26.method628(var28, var27, true);
                                    }
                                }
                            } else {
                                class112.field2078.reset();
                                class112.field2078.update(class79.field1414.field3162, 0, var21);
                                int var24 = (int) class112.field2078.getValue();
                                if (class191.field3736.field3226 != var24) {
                                    try {
                                        class62.field986.method10(false);
                                    } catch (Exception var30) {
                                    }
                                    class62.field986 = null;
                                    class181.field3578++;
                                    class68.field1264 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class2.field38 = 0;
                                class181.field3578 = 0;
                                class191.field3736.field3228.method629((class191.field3736.field718 & 0xFF0000L) == 16711680L, class79.field1414.field3162, (byte) 50, class131.field2467, (int) (class191.field3736.field718 & 0xFFFFL));
                            }
                            class191.field3736.method235(false);
                            class79.field1414 = null;
                            if (class131.field2467) {
                                class25.field373--;
                            } else {
                                class15.field271--;
                            }
                            class191.field3736 = null;
                            class61.field982 = 0;
                        } else {
                            if (class61.field982 != 512) {
                                break;
                            }
                            class61.field982 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class62.field986.method10(false);
                } catch (Exception var29) {
                }
                class62.field986 = null;
                class2.field38++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class121() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
    private class121(int arg0, int arg1, int arg2) {
    }
}
