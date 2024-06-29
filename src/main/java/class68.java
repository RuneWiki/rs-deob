import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class class68 extends class248 {

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field1275 = 1;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "Lij;")
    private static class50 field1277 = class78.method578(121, "red:");

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Lij;")
    public static class50 field1288 = field1277;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "Lij;")
    public static class50 field1287 = field1277;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Llc;")
    public static class214 field1278 = new class214();

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field1290 = 1;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Z")
    public static boolean field1289 = false;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[Lce;BIIIII)V")
    public static final void method518(int arg0, int arg1, int arg2, class10[] arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1282++;
        class158.method1105(arg0, arg6, arg5, arg8);
        class13.method90();
        if (arg4 >= -51) {
            field1286 = 94;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class10 var11 = arg3[var10];
            if (var11 != null && (var11.field149 == arg1 || arg1 == -1412584499 && class206.field3413 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class238.field4046[class60.field1094] = var11.field272 + arg9;
                    class159.field2741[class60.field1094] = var11.field241 + arg7;
                    class172.field2877[class60.field1094] = var11.field243;
                    class151.field2624[class60.field1094] = var11.field242;
                    var12 = class60.field1094++;
                } else {
                    var12 = arg2;
                }
                var11.field256 = var12;
                var11.field270 = class244.field4245;
                if (!var11.field222 || !client.method624(var11)) {
                    if (var11.field259 > 0) {
                        class87.method691(var11, 0);
                    }
                    int var13 = var11.field241 + arg7;
                    int var14 = var11.field272 + arg9;
                    int var15 = var11.field252;
                    if (class126.field2206 && (client.method605(var11) != 0 || var11.field227 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class206.field3413 == var11) {
                        if (arg1 != -1412584499 && !var11.field284) {
                            class59.field1087 = arg7;
                            class238.field4042 = arg3;
                            class209.field3472 = arg9;
                            continue;
                        }
                        if (!var11.field284) {
                            var15 = 128;
                        }
                        if (class69.field1296 && class211.field3516) {
                            int var16 = class69.field1297;
                            int var17 = var16 - class121.field2133;
                            int var18 = class173.field2904;
                            if (var17 < class238.field4037) {
                                var17 = class238.field4037;
                            }
                            if (var11.field243 + var17 > class238.field4037 + class60.field1103.field243) {
                                var17 = class238.field4037 + class60.field1103.field243 - var11.field243;
                            }
                            int var19 = var18 - class120.field2114;
                            if (class124.field2167 > var19) {
                                var19 = class124.field2167;
                            }
                            var14 = var17;
                            if ((class124.field2167 + class60.field1103.field242) < (var19 + var11.field242)) {
                                var19 = class124.field2167 + class60.field1103.field242 - var11.field242;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field227 == 2) {
                        var20 = arg6;
                        var21 = arg8;
                        var22 = arg0;
                        var23 = arg5;
                    } else {
                        int var24 = var11.field243 + var14;
                        var22 = arg0 < var14 ? var14 : arg0;
                        int var25 = var11.field242 + var13;
                        if (var11.field227 == 9) {
                            var25++;
                            var24++;
                        }
                        var20 = var13 > arg6 ? var13 : arg6;
                        var23 = var24 < arg5 ? var24 : arg5;
                        var21 = arg8 > var25 ? var25 : arg8;
                    }
                    if (!var11.field222 || var23 > var22 && var20 < var21) {
                        if (var11.field259 != 0) {
                            if (var11.field259 == 1337) {
                                class73.field1373 = var14;
                                class115.field2018 = var11;
                                class56.field999 = var13;
                                class233.method1586((byte) -123, var11.field242, var14, var13, var11.field259 == 1403, var11.field243);
                                class158.method1105(arg0, arg6, arg5, arg8);
                                continue;
                            }
                            if (var11.field259 == 1338) {
                                if (var11.method62(-13491)) {
                                    class62.method474(22906, var13, var14, var11, var12);
                                    class158.method1105(arg0, arg6, arg5, arg8);
                                }
                                continue;
                            }
                            if (var11.field259 == 1339) {
                                if (var11.method62(-13491)) {
                                    class90.method702(var11, 0, var12, var13, var14);
                                    class158.method1105(arg0, arg6, arg5, arg8);
                                }
                                continue;
                            }
                            if (var11.field259 == 1400) {
                                class174.method1201(var11.field242, var11.field243, var13, (byte) -113, var14);
                                class210.field3492[var12] = true;
                                class208.field3458[var12] = true;
                                class158.method1105(arg0, arg6, arg5, arg8);
                                continue;
                            }
                            if (var11.field259 == 1401) {
                                class74.method558(var11.field242, false, var13, var14, var11.field243);
                                class210.field3492[var12] = true;
                                class208.field3458[var12] = true;
                                class158.method1105(arg0, arg6, arg5, arg8);
                                continue;
                            }
                            if (var11.field259 == 1402) {
                                class60.method469(false, var14, var13);
                                class210.field3492[var12] = true;
                                class208.field3458[var12] = true;
                                continue;
                            }
                            if (var11.field259 == 1404) {
                                class229.method1562(var11, class57.field1029, 0, class245.field4259, var11.field242, var11.field243, var13, var14);
                                class210.field3492[var12] = true;
                                class208.field3458[var12] = true;
                                continue;
                            }
                            if (var11.field259 == 1405) {
                                if (class244.field4253) {
                                    int var26 = var14 + var11.field243;
                                    int var27 = var13 + 15;
                                    class36.field711.method1076(class80.method589(new class50[] { class200.field3295, class78.method579(class227.field3825, -26225) }, 28743), var26, var27, 16776960, -1);
                                    int var109 = var27 + 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = 16776960;
                                    int var30 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    if (var30 > 65536) {
                                        var29 = 16711680;
                                    }
                                    class36.field711.method1076(class80.method589(new class50[] { class15.field335, class78.method579(var30, -26225), class189.field3124 }, 28743), var26, var109, var29, -1);
                                    class210.field3492[var12] = true;
                                    class208.field3458[var12] = true;
                                    var27 = var109 + 15;
                                }
                                continue;
                            }
                        }
                        if (var11.field227 == 0 && var11.field262 && var22 <= class69.field1297 && class173.field2904 >= var20 && var23 > class69.field1297 && var21 > class173.field2904 && !class205.field3406 && !class126.field2206) {
                            class136.field2368 = 1;
                            class17.field379[0] = 1002;
                            class250.field4334[0] = class76.field1431;
                            class36.field691[0] = class245.field4271;
                        }
                        int var31 = class69.field1297;
                        int var32 = class173.field2904;
                        if (!class205.field3406 && var31 >= var22 && var32 >= var20 && var31 < var23 && var21 > var32) {
                            client.method617(var11, var32 - var13, var31 - var14, 100);
                        }
                        if (var11.field227 == 0) {
                            if (!var11.field222 && client.method624(var11) && class29.field615 != var11) {
                                continue;
                            }
                            if (!var11.field222) {
                                if (var11.field239 > var11.field292 - var11.field242) {
                                    var11.field239 = var11.field292 - var11.field242;
                                }
                                if (var11.field239 < 0) {
                                    var11.field239 = 0;
                                }
                            }
                            method518(var22, var11.field155, var12, arg3, (byte) -87, var23, var20, var13 - var11.field239, var21, var14 - var11.field156);
                            if (var11.field297 != null) {
                                method518(var22, var11.field155, var12, var11.field297, (byte) -120, var23, var20, var13 - var11.field239, var21, var14 - var11.field156);
                            }
                            class87 var33 = (class87) class132.field2304.method443((long) var11.field155, (byte) 57);
                            if (var33 != null) {
                                if (var33.field1676 == 0 && var22 <= class69.field1297 && var20 <= class173.field2904 && class69.field1297 < var23 && var21 > class173.field2904 && !class205.field3406 && !class126.field2206) {
                                    class136.field2368 = 1;
                                    class250.field4334[0] = class76.field1431;
                                    class17.field379[0] = 1002;
                                    class36.field691[0] = class245.field4271;
                                }
                                class125.method902(0, var14, var33.field1678, var22, var12, var20, var13, var23, var21);
                            }
                            class158.method1105(arg0, arg6, arg5, arg8);
                            class13.method90();
                        }
                        if (class200.field3306[var12] || class54.field967 > 1) {
                            if (var11.field227 == 0 && !var11.field222 && var11.field292 > var11.field242) {
                                class118.method851(var11.field292, var13, 118, var11.field243 + var14, var11.field242, var11.field239);
                            }
                            if (var11.field227 != 1) {
                                if (var11.field227 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var11.field178; var35++) {
                                        for (int var36 = 0; var36 < var11.field229; var36++) {
                                            int var37 = (var11.field210 + 32) * var36 + var14;
                                            int var38 = (var11.field274 + 32) * var35 + var13;
                                            if (var34 < 20) {
                                                var37 += var11.field267[var34];
                                                var38 += var11.field180[var34];
                                            }
                                            if (var11.field298[var34] > 0) {
                                                int var40 = var11.field298[var34] - 1;
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                if (arg0 < var37 + 32 && arg5 > var37 && arg6 < var38 + 32 && arg8 > var38 || class7.field97 == var11 && class258.field4496 == var34) {
                                                    class85 var43;
                                                    if (class114.field1992 == 1 && class239.field4075 == var34 && class15.field353 == var11.field155) {
                                                        var43 = class29.method256(var11.field152[var34], 0, var40, true, 2, var11.field264);
                                                    } else {
                                                        var43 = class29.method256(var11.field152[var34], 3153952, var40, true, 1, var11.field264);
                                                    }
                                                    if (class13.field317) {
                                                        class210.field3492[var12] = true;
                                                    }
                                                    if (var43 == null) {
                                                        class140.method979((byte) 110, var11);
                                                    } else if (class7.field97 == var11 && class258.field4496 == var34) {
                                                        int var44 = class69.field1297 - class203.field3377;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class173.field2904 - class155.field2699;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class82.field1469 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method667(var37 + var44, var38 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class10 var46 = arg3[arg1 & 0xFFFF];
                                                            int var47 = class158.field2726;
                                                            int var48 = class158.field2727;
                                                            if (var48 > var38 + var45 && var46.field239 > 0) {
                                                                int var49 = (var48 - var45 - var38) * class55.field988 / 3;
                                                                if (var49 > (class55.field988 * 10)) {
                                                                    var49 = class55.field988 * 10;
                                                                }
                                                                if (var46.field239 < var49) {
                                                                    var49 = var46.field239;
                                                                }
                                                                var46.field239 -= var49;
                                                                class155.field2699 += var49;
                                                                class140.method979((byte) 44, var46);
                                                            }
                                                            if (var38 + var45 + 32 > var47 && (var46.field292 - var46.field242) > var46.field239) {
                                                                int var50 = (var38 + var45 + 32 - var47) * class55.field988 / 3;
                                                                if ((class55.field988 * 10) < var50) {
                                                                    var50 = class55.field988 * 10;
                                                                }
                                                                if (var46.field292 - var46.field242 - var46.field239 < var50) {
                                                                    var50 = var46.field292 - var46.field239 - var46.field242;
                                                                }
                                                                class155.field2699 -= var50;
                                                                var46.field239 += var50;
                                                                class140.method979((byte) 81, var46);
                                                            }
                                                        }
                                                    } else if (class104.field1899 == var11 && class60.field1118 == var34) {
                                                        var43.method667(var37, var38, 128);
                                                    } else {
                                                        var43.method673(var37, var38);
                                                    }
                                                }
                                            } else if (var11.field144 != null && var34 < 20) {
                                                class85 var39 = var11.method55((byte) 125, var34);
                                                if (var39 != null) {
                                                    var39.method673(var37, var38);
                                                } else if (class164.field2800) {
                                                    class140.method979((byte) 60, var11);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var11.field227 == 3) {
                                    int var51;
                                    if (class99.method759(128, var11)) {
                                        var51 = var11.field246;
                                        if (class29.field615 == var11 && var11.field294 != 0) {
                                            var51 = var11.field294;
                                        }
                                    } else {
                                        var51 = var11.field280;
                                        if (class29.field615 == var11 && var11.field136 != 0) {
                                            var51 = var11.field136;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field146) {
                                            class158.method1104(var14, var13, var11.field243, var11.field242, var51);
                                        } else {
                                            class158.method1119(var14, var13, var11.field243, var11.field242, var51);
                                        }
                                    } else if (var11.field146) {
                                        class158.method1113(var14, var13, var11.field243, var11.field242, var51, 256 - (var15 & 0xFF));
                                    } else {
                                        class158.method1111(var14, var13, var11.field243, var11.field242, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field227 == 4) {
                                    class152 var52 = var11.method58(0, class256.field4432);
                                    if (var52 != null) {
                                        class50 var53 = var11.field137;
                                        int var54;
                                        if (class99.method759(128, var11)) {
                                            var54 = var11.field246;
                                            if (class29.field615 == var11 && var11.field294 != 0) {
                                                var54 = var11.field294;
                                            }
                                            if (var11.field164.method396(1) > 0) {
                                                var53 = var11.field164;
                                            }
                                        } else {
                                            var54 = var11.field280;
                                            if (class29.field615 == var11 && var11.field136 != 0) {
                                                var54 = var11.field136;
                                            }
                                        }
                                        if (var11.field222 && var11.field300 != -1) {
                                            class239 var55 = class15.method111(var11.field300, false);
                                            var53 = var55.field4103;
                                            if (var53 == null) {
                                                var53 = class184.field3025;
                                            }
                                            if ((var55.field4117 == 1 || var11.field205 != 1) && var11.field205 != -1) {
                                                var53 = class80.method589(new class50[] { class61.field1123, var53, class209.field3467, class64.method502(var11.field205, 107) }, 28743);
                                            }
                                        }
                                        if (class220.field3676 == var11) {
                                            var54 = var11.field280;
                                            var53 = class44.field793;
                                        }
                                        if (!var11.field222) {
                                            var53 = class177.method1215(var53, var11, (byte) 76);
                                        }
                                        var52.method1059(var53, var14, var13, var11.field243, var11.field242, var54, var11.field248 ? 0 : -1, var11.field154, var11.field271, var11.field207);
                                    } else if (class164.field2800) {
                                        class140.method979((byte) 99, var11);
                                    }
                                } else if (var11.field227 == 5) {
                                    if (var11.field222) {
                                        class85 var56;
                                        if (var11.field300 == -1) {
                                            var56 = var11.method65(false, (byte) 113);
                                        } else {
                                            var56 = class29.method256(var11.field205, var11.field184, var11.field300, true, var11.field193, var11.field264);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field1648;
                                            int var58 = var56.field1637;
                                            if (var11.field176) {
                                                int var59 = (var11.field243 + var57 - 1) / var57;
                                                int var60 = (var58 - (1 - var11.field242)) / var58;
                                                class158.method1110(var14, var13, var14 + var11.field243, var11.field242 + var13);
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var11.field296 != 0) {
                                                            var56.method668(var11.field296, var57 / 2 + var57 * var61 + var14, 4096, var58 * var62 + var58 / 2 + var13, 120);
                                                        } else if (var15 == 0) {
                                                            var56.method673(var57 * var61 + var14, var58 * var62 + var13);
                                                        } else {
                                                            var56.method667(var14 + (var57 * var61), var58 * var62 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class158.method1105(arg0, arg6, arg5, arg8);
                                            } else {
                                                int var63 = var11.field243 * 4096 / var57;
                                                if (var11.field296 != 0) {
                                                    var56.method668(var11.field296, var14 + (var11.field243 / 2), var63, var11.field242 / 2 + var13, 118);
                                                } else if (var15 != 0) {
                                                    var56.method676(var14, var13, var11.field243, var11.field242, 256 - (var15 & 0xFF));
                                                } else if (var11.field243 == var57 && var11.field242 == var58) {
                                                    var56.method673(var14, var13);
                                                } else {
                                                    var56.method670(var14, var13, var11.field243, var11.field242);
                                                }
                                            }
                                        } else if (class164.field2800) {
                                            class140.method979((byte) 90, var11);
                                        }
                                    } else {
                                        class85 var64 = var11.method65(class99.method759(128, var11), (byte) 127);
                                        if (var64 != null) {
                                            var64.method673(var14, var13);
                                        } else if (class164.field2800) {
                                            class140.method979((byte) 25, var11);
                                        }
                                    }
                                } else if (var11.field227 == 6) {
                                    boolean var65 = class99.method759(128, var11);
                                    int var66;
                                    if (var65) {
                                        var66 = var11.field171;
                                    } else {
                                        var66 = var11.field200;
                                    }
                                    class98 var67 = null;
                                    int var68 = 0;
                                    if (var11.field300 != -1) {
                                        class239 var73 = class15.method111(var11.field300, false);
                                        if (var73 != null) {
                                            class239 var74 = var73.method1628(true, var11.field205);
                                            class186 var75 = var66 == -1 ? null : class123.method891(-5664, var66);
                                            var67 = var74.method1614(var11.field237, (byte) 80, 1, var75);
                                            if (var67 == null) {
                                                class140.method979((byte) 109, var11);
                                            } else {
                                                var68 = -var67.method126() / 2;
                                            }
                                        }
                                    } else if (var11.field232 == 5) {
                                        if (var11.field159 == -1) {
                                            var67 = class75.field1427.method295(-65, -1, (class186) null, (class186) null, -1);
                                        } else {
                                            int var70 = var11.field159 & 0x7FF;
                                            if (class240.field4124 == var70) {
                                                var70 = 2047;
                                            }
                                            class187 var71 = class71.field1370[var70];
                                            class186 var72 = var66 == -1 ? null : class123.method891(-5664, var66);
                                            if (var71 != null && (int) var71.field3097.method368((byte) -103) << 11 == (var11.field159 & 0xFFFFF800)) {
                                                var67 = var71.field3092.method295(86, var11.field237, (class186) null, var72, 0);
                                            }
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var11.method56(-1, class239.field4067.field3092, var65, (class186) null, (byte) 114);
                                        if (var67 == null && class164.field2800) {
                                            class140.method979((byte) 104, var11);
                                        }
                                    } else {
                                        class186 var69 = class123.method891(-5664, var66);
                                        var67 = var11.method56(var11.field237, class239.field4067.field3092, var65, var69, (byte) 114);
                                        if (var67 == null && class164.field2800) {
                                            class140.method979((byte) 49, var11);
                                        }
                                    }
                                    if (var67 != null) {
                                        int var76;
                                        if (var11.field290 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field243 << 8) / var11.field290;
                                        }
                                        int var77;
                                        if (var11.field174 > 0) {
                                            var77 = (var11.field242 << 8) / var11.field174;
                                        } else {
                                            var77 = 256;
                                        }
                                        int var78 = (var11.field135 * var76 >> 8) + var11.field243 / 2 + var14;
                                        int var79 = var11.field242 / 2 + var13 + (var11.field273 * var77 >> 8);
                                        class13.method104(var78, var79);
                                        int var80 = class13.field313[var11.field183] * var11.field218 >> 16;
                                        int var81 = class13.field311[var11.field183] * var11.field218 >> 16;
                                        if (!var11.field222) {
                                            var67.method752(0, var11.field276, 0, var11.field183, 0, var80, var81);
                                        } else if (var11.field223) {
                                            ((class149) var67).method1048(0, var11.field276, var11.field172, var11.field183, var11.field215, var80 + var68 + var11.field173, var11.field173 + var81, var11.field218);
                                        } else {
                                            var67.method752(0, var11.field276, var11.field172, var11.field183, var11.field215, var68 + var80 + var11.field173, var11.field173 + var81);
                                        }
                                        class13.method105();
                                    }
                                } else {
                                    if (var11.field227 == 7) {
                                        class152 var82 = var11.method58(0, class256.field4432);
                                        if (var82 == null) {
                                            if (class164.field2800) {
                                                class140.method979((byte) 21, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var84 < var11.field178; var84++) {
                                            for (int var85 = 0; var85 < var11.field229; var85++) {
                                                if (var11.field298[var83] > 0) {
                                                    class239 var86 = class15.method111(var11.field298[var83] - 1, false);
                                                    class50 var87;
                                                    if (var86.field4117 != 1 && var11.field152[var83] == 1) {
                                                        var87 = class80.method589(new class50[] { class61.field1123, var86.field4103, class192.field3195 }, 28743);
                                                    } else {
                                                        var87 = class80.method589(new class50[] { class61.field1123, var86.field4103, class209.field3467, class64.method502(var11.field152[var83], 101) }, 28743);
                                                    }
                                                    int var88 = (var11.field210 + 115) * var85 + var14;
                                                    int var89 = var13 + ((var11.field274 + 12) * var84);
                                                    if (var11.field154 == 0) {
                                                        var82.method1058(var87, var88, var89, var11.field280, var11.field248 ? 0 : -1);
                                                    } else if (var11.field154 == 1) {
                                                        var82.method1080(var87, var88 + 57, var89, var11.field280, var11.field248 ? 0 : -1);
                                                    } else {
                                                        var82.method1076(var87, var88 + 115 - 1, var89, var11.field280, var11.field248 ? 0 : -1);
                                                    }
                                                }
                                                var83++;
                                            }
                                        }
                                    }
                                    if (var11.field227 == 8 && class134.field2340 == var11 && class21.field442 == class136.field2343) {
                                        int var90 = 0;
                                        int var91 = 0;
                                        class152 var92 = class36.field711;
                                        class50 var93 = var11.field137;
                                        class50 var94 = class177.method1215(var93, var11, (byte) 104);
                                        while (var94.method396(1) > 0) {
                                            int var102 = var94.method390(class56.field994, -1);
                                            class50 var103;
                                            if (var102 == -1) {
                                                var103 = var94;
                                                var94 = class245.field4271;
                                            } else {
                                                var103 = var94.method363(0, var102, 0);
                                                var94 = var94.method397(64, var102 + 4);
                                            }
                                            int var104 = var92.method1081(var103);
                                            var91 += var92.field2649 + 1;
                                            if (var90 < var104) {
                                                var90 = var104;
                                            }
                                        }
                                        var90 += 6;
                                        int var95 = var14 + var11.field243 - var90 - 5;
                                        var91 += 7;
                                        if (var95 < (var14 + 5)) {
                                            var95 = var14 + 5;
                                        }
                                        if ((var90 + var95) > arg5) {
                                            var95 = arg5 - var90;
                                        }
                                        int var96 = var13 + var11.field242 + 5;
                                        if (arg8 < (var91 + var96)) {
                                            var96 = arg8 - var91;
                                        }
                                        class158.method1104(var95, var96, var90, var91, 16777120);
                                        class158.method1119(var95, var96, var90, var91, 0);
                                        class50 var97 = var11.field137;
                                        int var98 = var96 + var92.field2649 + 2;
                                        class50 var99 = class177.method1215(var97, var11, (byte) 114);
                                        while (var99.method396(1) > 0) {
                                            int var100 = var99.method390(class56.field994, -1);
                                            class50 var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = class245.field4271;
                                            } else {
                                                var101 = var99.method363(0, var100, 0);
                                                var99 = var99.method397(64, var100 + 4);
                                            }
                                            var92.method1058(var101, var95 + 3, var98, 0, -1);
                                            var98 += var92.field2649 + 1;
                                        }
                                    }
                                    if (var11.field227 == 9) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (var11.field234) {
                                            var105 = var11.field243 + var14;
                                            var106 = var11.field242 + var13;
                                            var107 = var13;
                                            var108 = var14;
                                        } else {
                                            var105 = var11.field243 + var14;
                                            var106 = var13;
                                            var107 = var11.field242 + var13;
                                            var108 = var14;
                                        }
                                        if (var11.field202 == 1) {
                                            class158.method1099(var108, var106, var105, var107, var11.field280);
                                        } else {
                                            class158.method1109(var108, var106, var105, var107, var11.field280, var11.field202);
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

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)[Loe;")
    public static final class207[] method519(boolean arg0) {
        field1280++;
        class207[] var1 = new class207[class190.field3151];
        for (int var2 = 0; var2 < class190.field3151; var2++) {
            var1[var2] = new class67(class89.field1707, class116.field2024, class20.field421[var2], class2.field27[var2], class46.field836[var2], class164.field2805[var2], class31.field628[var2], class114.field1996);
        }
        if (!arg0) {
            field1286 = -24;
        }
        class261.method1759(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
    public static final void method520(int arg0) {
        if (class201.field3313 > 0) {
            class201.field3313--;
        }
        field1281++;
        if (class22.field510 > 1) {
            class22.field510--;
            class255.field4399 = class217.field3649;
        }
        if (class122.field2149) {
            class122.field2149 = false;
            class26.method244((byte) -88);
            return;
        }
        for (int var1 = 0; var1 < 100 && class51.method416(arg0 ^ 0xFFFFE6E9); var1++) {
        }
        if (class25.field537 != 30) {
            return;
        }
        class115.method828(193, class190.field3141, (byte) 53);
        Object var2 = class238.field4045.field3768;
        synchronized (class238.field4045.field3768) {
            if (!class243.field4216) {
                class238.field4045.field3777 = 0;
            } else if (class193.field3200 != 0 || class238.field4045.field3777 >= 40) {
                class61.field1130++;
                class190.field3141.method1598((byte) -128, 89);
                int var3 = 0;
                class190.field3141.method1471(0, (byte) 24);
                int var4 = class190.field3141.field3581;
                for (int var5 = 0; class238.field4045.field3777 > var5 && class190.field3141.field3581 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class238.field4045.field3776[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class238.field4045.field3775[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class238.field4045.field3776[var5] == -1 && class238.field4045.field3775[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class177.field2966 != var7 || class95.field1770 != var6) {
                        int var9 = var6 - class95.field1770;
                        class95.field1770 = var6;
                        int var10 = var7 - class177.field2966;
                        class177.field2966 = var7;
                        if (class216.field3572 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class190.field3141.method1494((class216.field3572 << 12) + (var10 << 6) + var9, (byte) -1);
                            class216.field3572 = 0;
                        } else if (class216.field3572 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class190.field3141.method1471(class216.field3572 + 128, (byte) 24);
                            var9 += 128;
                            var10 += 128;
                            class190.field3141.method1494((var10 << 8) + var9, (byte) -9);
                            class216.field3572 = 0;
                        } else if (class216.field3572 < 32) {
                            class190.field3141.method1471(class216.field3572 + 192, (byte) 24);
                            if (var8) {
                                class190.field3141.method1446(arg0 + 6462, Integer.MIN_VALUE);
                            } else {
                                class190.field3141.method1446(126, var6 << 16 | var7);
                            }
                            class216.field3572 = 0;
                        } else {
                            class190.field3141.method1494(class216.field3572 + 57344, (byte) -83);
                            if (var8) {
                                class190.field3141.method1446(-73, Integer.MIN_VALUE);
                            } else {
                                class190.field3141.method1446(9, var6 << 16 | var7);
                            }
                            class216.field3572 = 0;
                        }
                    } else if (class216.field3572 < 2047) {
                        class216.field3572++;
                    }
                }
                class190.field3141.method1458(class190.field3141.field3581 - var4, -1);
                if (var3 >= class238.field4045.field3777) {
                    class238.field4045.field3777 = 0;
                } else {
                    class238.field4045.field3777 -= var3;
                    for (int var11 = 0; var11 < class238.field4045.field3777; var11++) {
                        class238.field4045.field3775[var11] = class238.field4045.field3775[var3 + var11];
                        class238.field4045.field3776[var11] = class238.field4045.field3776[var11 + var3];
                    }
                }
            }
        }
        if (class193.field3200 != 0) {
            class222.field3730++;
            long var12 = (class85.field1638 - class3.field53) / 50L;
            class3.field53 = class85.field1638;
            int var14 = class56.field1000;
            byte var15 = 0;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (class193.field3200 == 2) {
                var15 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var16 = (int) var12;
            int var17 = class52.field950;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class190.field3141.method1598((byte) -124, 39);
            class190.field3141.method1470(var14 | var17 << 16, arg0 + 1621206866);
            class190.field3141.method1463((byte) -121, var15 << 15 | var16);
        }
        if (class46.field846[96] || class46.field846[97] || class46.field846[98] || class46.field846[99]) {
            class6.field82 = true;
        }
        if (class89.field1705 > 0) {
            class89.field1705--;
        }
        if (class6.field82 && class89.field1705 <= 0) {
            class6.field82 = false;
            class89.field1705 = 20;
            class20.field427++;
            class190.field3141.method1598((byte) -128, 87);
            class190.field3141.method1480(class160.field2758, (byte) -122);
            class190.field3141.method1495(2, class19.field406);
        }
        if (class191.field3185 && !class151.field2619) {
            class187.field3069++;
            class151.field2619 = true;
            class190.field3141.method1598((byte) -97, 90);
            class190.field3141.method1471(1, (byte) 24);
        }
        if (!class191.field3185 && class151.field2619) {
            class187.field3069++;
            class151.field2619 = false;
            class190.field3141.method1598((byte) -109, 90);
            class190.field3141.method1471(0, (byte) 24);
        }
        if (!class190.field3152) {
            class190.field3141.method1598((byte) -125, 241);
            class190.field3141.method1457(class190.method1284(false), -407803416);
            class190.field3152 = true;
            class187.field3073++;
        }
        class64.method504((byte) -98);
        if (class25.field537 != 30) {
            return;
        }
        class261.method1757((byte) 90);
        class121.method878(54);
        class10.field204++;
        if (class10.field204 > 750) {
            class26.method244((byte) -127);
            return;
        }
        class192.method1304(true);
        class36.method287(false);
        class155.method1091(false);
        if (class19.field398 != null) {
            class154.method1085((byte) -125);
        }
        for (int var18 = class207.method1396((byte) 110, true); var18 != -1; var18 = class207.method1396((byte) 117, false)) {
            class40.method308(var18, 0);
            class10.field190[class51.method413(class197.field3276++, 31)] = var18;
        }
        for (class137 var19 = class228.method1558(arg0 ^ 0xFFFFE6D6); var19 != null; var19 = class228.method1558(0)) {
            int var20 = var19.method948((byte) -118);
            int var21 = var19.method946((byte) 73);
            if (var20 == 1) {
                class106.field1910[var21] = var19.field2383;
                class21.field449[class51.method413(class191.field3170++, 31)] = var21;
            } else if (var20 == 2) {
                class22.field509[var21] = var19.field2372;
                class251.field4350[class51.method413(class52.field953++, 31)] = var21;
            }
        }
        class55.field988++;
        if (class48.field861 != 0) {
            class237.field4011 += 20;
            if (class237.field4011 >= 400) {
                class48.field861 = 0;
            }
        }
        if (class104.field1899 != null) {
            class121.field2131++;
            if (class121.field2131 >= 15) {
                class140.method979((byte) 79, class104.field1899);
                class104.field1899 = null;
            }
        }
        if (class7.field97 != null) {
            class140.method979((byte) 86, class7.field97);
            class82.field1469++;
            if (class203.field3377 + 5 < class69.field1297 || class203.field3377 - 5 > class69.field1297 || class173.field2904 > (class155.field2699 + 5) || class173.field2904 < class155.field2699 - 5) {
                class66.field1271 = true;
            }
            if (class238.field4039 == 0) {
                if (class66.field1271 && class82.field1469 >= 5) {
                    if (class7.field97 == class45.field834 && class41.field752 != class258.field4496) {
                        class10 var22 = class7.field97;
                        byte var23 = 0;
                        class112.field1980++;
                        if (class93.field1738 == 1 && var22.field259 == 206) {
                            var23 = 1;
                        }
                        if (var22.field298[class41.field752] <= 0) {
                            var23 = 0;
                        }
                        if (class86.method686(107, client.method605(var22))) {
                            int var26 = class258.field4496;
                            int var27 = class41.field752;
                            var22.field298[var27] = var22.field298[var26];
                            var22.field152[var27] = var22.field152[var26];
                            var22.field298[var26] = -1;
                            var22.field152[var26] = 0;
                        } else if (var23 == 1) {
                            int var24 = class258.field4496;
                            int var25 = class41.field752;
                            while (var24 != var25) {
                                if (var24 > var25) {
                                    var22.method68(arg0 - 1978, var24, var24 - 1);
                                    var24--;
                                } else if (var25 > var24) {
                                    var22.method68(-8420, var24, var24 + 1);
                                    var24++;
                                }
                            }
                        } else {
                            var22.method68(arg0 ^ 0x39CA, class258.field4496, class41.field752);
                        }
                        class190.field3141.method1598((byte) -101, 48);
                        class190.field3141.method1488(true, var23);
                        class190.field3141.method1480(class41.field752, (byte) -118);
                        class190.field3141.method1494(class258.field4496, (byte) -127);
                        class190.field3141.method1446(-23, class7.field97.field155);
                    }
                } else if ((class231.field3888 == 1 || class86.method685((byte) -126, class136.field2368 - 1)) && class136.field2368 > 2) {
                    class119.method863(-28459);
                } else if (class136.field2368 > 0) {
                    class250.method1695(class136.field2368 - 1, -7);
                }
                class193.field3200 = 0;
                class121.field2131 = 10;
                class7.field97 = null;
            }
        }
        class211.field3516 = false;
        class62.field1162 = 0;
        class22.field470 = null;
        class10 var28 = class29.field615;
        class10 var29 = class134.field2340;
        class29.field615 = null;
        class134.field2340 = null;
        class220.field3683 = false;
        while (class141.method986(-31402) && class62.field1162 < 128) {
            class124.field2175[class62.field1162] = class190.field3153;
            class100.field1842[class62.field1162] = class133.field2333;
            class62.field1162++;
        }
        class19.field398 = null;
        if (class48.field871 != -1) {
            class205.method1383(class1.field1, class136.field2370, arg0 + 6441, 0, class48.field871, 0, 0, 0);
        }
        class217.field3649++;
        while (true) {
            class93 var30;
            class10 var31;
            class10 var32;
            do {
                var30 = (class93) class183.field3018.method679((byte) -94);
                if (var30 == null) {
                    while (true) {
                        class93 var33;
                        class10 var34;
                        class10 var35;
                        do {
                            var33 = (class93) class36.field685.method679((byte) -94);
                            if (var33 == null) {
                                while (true) {
                                    class93 var36;
                                    class10 var37;
                                    class10 var38;
                                    do {
                                        var36 = (class93) class160.field2751.method679((byte) -94);
                                        if (var36 == null) {
                                            if (class229.field3841 && class19.field398 == null) {
                                                class229.field3841 = false;
                                            }
                                            if (class206.field3413 != null) {
                                                class102.method778(arg0 + 30319);
                                            }
                                            if (class132.field2301 != -1) {
                                                int var39 = class132.field2301;
                                                int var40 = class100.field1837;
                                                boolean var41 = class26.method243(class239.field4067.field3980[0], true, 0, false, 0, var39, var40, class239.field4067.field3978[0], 0, 0, 0, 0);
                                                class132.field2301 = -1;
                                                if (var41) {
                                                    class258.field4497 = class52.field950;
                                                    class2.field34 = class56.field1000;
                                                    class237.field4011 = 0;
                                                    class48.field861 = 1;
                                                }
                                            }
                                            class80.method587(arg0 + 6457);
                                            if (class29.field615 != var28) {
                                                if (var28 != null) {
                                                    class140.method979((byte) 54, var28);
                                                }
                                                if (class29.field615 != null) {
                                                    class140.method979((byte) 100, class29.field615);
                                                }
                                            }
                                            if (class134.field2340 != var29 && class21.field442 == class136.field2343) {
                                                if (var29 != null) {
                                                    class140.method979((byte) 89, var29);
                                                }
                                                if (class134.field2340 != null) {
                                                    class140.method979((byte) 28, class134.field2340);
                                                }
                                            }
                                            if (class134.field2340 == null) {
                                                if (class136.field2343 > 0) {
                                                    class136.field2343--;
                                                }
                                            } else if (class136.field2343 < class21.field442) {
                                                class136.field2343++;
                                                if (class21.field442 == class136.field2343) {
                                                    class140.method979((byte) 87, class134.field2340);
                                                }
                                            }
                                            if (class130.field2291 == 1) {
                                                class173.method1191((byte) -2);
                                            } else if (class130.field2291 == 2) {
                                                class99.method757((byte) -112);
                                            } else {
                                                class178.method1217(false);
                                            }
                                            for (int var42 = 0; var42 < 5; var42++) {
                                                int var10002 = class85.field1644[var42]++;
                                            }
                                            int var43 = class157.method1095(0);
                                            int var44 = class97.method731(arg0 ^ arg0);
                                            if (var43 > 4500 && var44 > 4500) {
                                                class233.field3905++;
                                                class201.field3313 = 250;
                                                class37.method297(31132, 4000);
                                                class190.field3141.method1598((byte) -108, 83);
                                            }
                                            class130.field2281++;
                                            if (class130.field2281 > 500) {
                                                class130.field2281 = 0;
                                                int var45 = (int) (Math.random() * 8.0D);
                                                if ((var45 & 0x2) == 2) {
                                                    class207.field3443 += class227.field3828;
                                                }
                                                if ((var45 & 0x1) == 1) {
                                                    class46.field843 += class125.field2186;
                                                }
                                                if ((var45 & 0x4) == 4) {
                                                    class123.field2163 += class115.field2013;
                                                }
                                            }
                                            class18.field390++;
                                            if (class207.field3443 < -55) {
                                                class227.field3828 = 2;
                                            }
                                            class205.field3404++;
                                            if (class46.field843 < -50) {
                                                class125.field2186 = 2;
                                            }
                                            if (class207.field3443 > 55) {
                                                class227.field3828 = -2;
                                            }
                                            if (class18.field390 > 500) {
                                                class18.field390 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x1) == 1) {
                                                    class45.field832 += class41.field757;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class252.field4381 += class200.field3290;
                                                }
                                            }
                                            if (class123.field2163 < -40) {
                                                class115.field2013 = 1;
                                            }
                                            if (class252.field4381 < -20) {
                                                class200.field3290 = 1;
                                            }
                                            if (class123.field2163 > 40) {
                                                class115.field2013 = -1;
                                            }
                                            if (class46.field843 > 50) {
                                                class125.field2186 = -2;
                                            }
                                            if (class45.field832 < -60) {
                                                class41.field757 = 2;
                                            }
                                            if (class252.field4381 > 10) {
                                                class200.field3290 = -1;
                                            }
                                            if (class45.field832 > 60) {
                                                class41.field757 = -2;
                                            }
                                            if (class205.field3404 > 50) {
                                                class190.field3141.method1598((byte) -115, 155);
                                                class221.field3705++;
                                            }
                                            class44.method328(arg0 ^ 0x1954);
                                            try {
                                                if (class148.field2547 != null && class190.field3141.field3581 > 0) {
                                                    class148.field2547.method632(0, class190.field3141.field3633, class190.field3141.field3581, true);
                                                    class190.field3141.field3581 = 0;
                                                    class205.field3404 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var47) {
                                                class26.method244((byte) -102);
                                                return;
                                            }
                                        }
                                        var37 = var36.field1740;
                                        if (var37.field216 < 0) {
                                            break;
                                        }
                                        var38 = class89.method698(var37.field149, (byte) 94);
                                    } while (var38 == null || var38.field297 == null || var37.field216 >= var38.field297.length || var38.field297[var37.field216] != var37);
                                    class214.method1422(var36, -15181);
                                }
                            }
                            var34 = var33.field1740;
                            if (var34.field216 < 0) {
                                break;
                            }
                            var35 = class89.method698(var34.field149, (byte) 94);
                        } while (var35 == null || var35.field297 == null || var35.field297.length <= var34.field216 || var35.field297[var34.field216] != var34);
                        class214.method1422(var33, arg0 - 8739);
                    }
                }
                var31 = var30.field1740;
                if (var31.field216 < 0) {
                    break;
                }
                var32 = class89.method698(var31.field149, (byte) 94);
            } while (var32 == null || var32.field297 == null || var32.field297.length <= var31.field216 || var32.field297[var31.field216] != var31);
            class214.method1422(var30, -15181);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLbf;ILwi;)V")
    public static final void method521(byte arg0, class47 arg1, int arg2, class21 arg3) {
        field1284++;
        byte[] var4 = null;
        class86 var5 = class129.field2259;
        synchronized (class129.field2259) {
            for (class124 var6 = (class124) class129.field2259.method689(1001); var6 != null; var6 = (class124) class129.field2259.method688(-104)) {
                if (((long) arg2) == var6.field635 && var6.field2179 == arg1 && var6.field2178 == 0) {
                    var4 = var6.field2182;
                    break;
                }
            }
        }
        if (arg0 != -34) {
            return;
        }
        if (var4 == null) {
            byte[] var7 = arg1.method355(arg2, true);
            arg3.method162(arg2, arg1, true, -1, var7);
        } else {
            arg3.method162(arg2, arg1, true, -1, var4);
        }
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)I")
    public static final int method522(int arg0) {
        field1279++;
        if (arg0 < 89) {
            method519(false);
        }
        return 2;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)Z")
    public abstract boolean method523(boolean arg0);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
    public static void method524(int arg0) {
        field1278 = null;
        field1287 = null;
        field1288 = null;
        field1277 = null;
        if (arg0 != -55) {
            method526(true, 59L);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method525(byte arg0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZJ)V")
    public static final void method526(boolean arg0, long arg1) {
        field1276++;
        if (arg0) {
            method520(-50);
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class227.field3830; var3++) {
            if (class59.field1070[var3] == arg1) {
                class16.field372++;
                class227.field3830--;
                for (int var4 = var3; var4 < class227.field3830; var4++) {
                    class208.field3452[var4] = class208.field3452[var4 + 1];
                    class141.field2477[var4] = class141.field2477[var4 + 1];
                    class224.field3764[var4] = class224.field3764[var4 + 1];
                    class59.field1070[var4] = class59.field1070[var4 + 1];
                    class216.field3567[var4] = class216.field3567[var4 + 1];
                    class196.field3251[var4] = class196.field3251[var4 + 1];
                }
                class184.field3023 = class217.field3649;
                class190.field3141.method1598((byte) -106, 107);
                class190.field3141.method1464(arg1, 867341416);
                return;
            }
        }
    }
}
