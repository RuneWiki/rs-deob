import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 extends class47 {

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "Loc;")
    public static class99 field1885 = class48.method402((byte) -104, "Ignorieren");

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Loc;")
    private static class99 field1875 = class48.method402((byte) -104, "level)2");

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Loc;")
    public static class99 field1864 = class48.method402((byte) -104, "Hidden)2use");

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "[I")
    public static int[] field1866 = new int[1000];

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Z")
    public static volatile boolean field1872 = false;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Loc;")
    public static class99 field1860 = field1875;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1889 = 0;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Lqd;")
    public class113 field1873;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "Lec;")
    public class31 field1879;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "Lfc;")
    public class38 field1894;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Lkc;")
    public class71 field1876;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Ljava/awt/Font;")
    public static Font field1897;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "[I")
    public static int[] field1887;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[Lhe;IIIII)Z")
    public static final boolean method667(int arg0, int arg1, int arg2, int arg3, class54[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1871++;
        class96.method795(arg3, arg5, arg1, arg9);
        boolean var10 = true;
        int var11 = 0;
        if (arg7 != 19316) {
            return true;
        }
        while (arg4.length > var11) {
            class54 var12 = arg4[var11];
            if (var12 != null && (var12.field1292 == arg6 || arg6 == -1412584499 && class60.field1619 == var12)) {
                label661: {
                    if (var12.field1327 > 0) {
                        class16.method155(arg7 - 19419, var12);
                    }
                    int var13 = arg3 + var12.field1324 - arg8;
                    int var14 = var12.field1356 + arg5 - arg0;
                    int var15 = var12.field1330;
                    if (class60.field1619 == var12) {
                        if (arg6 != -1412584499 && !var12.field1387) {
                            class144.field3607 = arg4;
                            class140.field3479 = arg8;
                            class104.field2524 = arg0;
                            break label661;
                        }
                        class54 var16 = class136.method1140(-98, var12);
                        if (var16 == null) {
                            class60.field1619 = null;
                        } else {
                            int[] var17 = class136.method1137(2, var16);
                            int[] var18 = class136.method1137(2, var12);
                            int var19 = class148.field3656 - class37.field945;
                            if (!var12.field1387) {
                                var15 = 128;
                            }
                            int var20 = class80.field1969 - class91.field2238;
                            if (var19 <= var12.field1400 && var19 >= -var12.field1400 && var12.field1400 >= var20 && -var12.field1400 <= var20 && !class86.field2145) {
                                var19 = 0;
                                var20 = 0;
                            } else if (var12.field1355 < class12.field273 || class86.field2145) {
                                class86.field2145 = true;
                            } else {
                                var19 = 0;
                                var20 = 0;
                            }
                            int var21 = var18[0] + var19 - var17[0];
                            if (var21 < 0) {
                                var21 = 0;
                            }
                            if (var12.field1383 + var21 > var16.field1383) {
                                var21 = var16.field1383 - var12.field1383;
                            }
                            int var22 = var18[1] + var20 - var17[1];
                            var13 = var17[0] + var21;
                            if (var22 < 0) {
                                var22 = 0;
                            }
                            if (var16.field1403 < var22 + var12.field1403) {
                                var22 = var16.field1403 - var12.field1403;
                            }
                            var14 = var17[1] + var22;
                        }
                    }
                    if ((!var12.field1374 || class96.field2331 >= var13 && var14 <= class96.field2328 && var13 + var12.field1383 >= class96.field2327 && class96.field2325 <= var12.field1403 + var14) && (!var12.field1374 || !class11.method123((byte) 94, var12))) {
                        label656: {
                            if (var12.field1341 == 0) {
                                if (!var12.field1374 && class11.method123((byte) 94, var12) && !class84.method732(false, arg2, var11)) {
                                    break label656;
                                }
                                if (!var12.field1374) {
                                    if (var12.field1378 > var12.field1300 - var12.field1403) {
                                        var12.field1378 = var12.field1300 - var12.field1403;
                                    }
                                    if (var12.field1378 < 0) {
                                        var12.field1378 = 0;
                                    }
                                }
                                var10 &= method667(var12.field1378, var12.field1383 + var13, arg2, var13, arg4, var14, var12.field1293, 19316, var12.field1296, var14 + var12.field1403);
                                if (var12.field1344 != null) {
                                    var10 &= method667(var12.field1378, var13 + var12.field1383, arg2, var13, var12.field1344, var14, var12.field1293, 19316, var12.field1296, var12.field1403 + var14);
                                }
                                class96.method795(arg3, arg5, arg1, arg9);
                                if (var12.field1300 > var12.field1403 && !var12.field1374) {
                                    class27.method251(var12.field1300, var14, var12.field1378, var12.field1403, (byte) 70, var12.field1383 + var13);
                                }
                            }
                            if (var12.field1341 != 1) {
                                if (var12.field1341 == 2) {
                                    int var23 = 0;
                                    for (int var24 = 0; var24 < var12.field1403; var24++) {
                                        for (int var25 = 0; var25 < var12.field1383; var25++) {
                                            int var26 = var14 + (var12.field1302 + 32) * var24;
                                            int var27 = (var12.field1309 + 32) * var25 + var13;
                                            if (var23 < 20) {
                                                var27 += var12.field1343[var23];
                                                var26 += var12.field1297[var23];
                                            }
                                            if (var12.field1368[var23] > 0) {
                                                boolean var28 = false;
                                                boolean var29 = false;
                                                int var30 = var12.field1368[var23] - 1;
                                                if (var27 > class96.field2327 - 32 && class96.field2331 > var27 && var26 > class96.field2325 - 32 && class96.field2328 > var26 || class118.field2915 != 0 && class1.field25 == var23) {
                                                    class64 var31;
                                                    if (class46.field1130 == 1 && class5.field101 == var23 && class118.field2895 == var12.field1293) {
                                                        var31 = class59.method529(2, false, var30, -5, 0, var12.field1304[var23]);
                                                    } else {
                                                        var31 = class59.method529(1, false, var30, -5, 3153952, var12.field1304[var23]);
                                                    }
                                                    if (var31 == null) {
                                                        var10 = false;
                                                    } else if (class118.field2915 != 0 && class1.field25 == var23 && class52.field1246 == var12.field1293) {
                                                        int var32 = class80.field1969 - class70.field1801;
                                                        if (var32 < 5 && var32 > -5) {
                                                            var32 = 0;
                                                        }
                                                        int var33 = class148.field3656 - class47.field1143;
                                                        if (var33 < 5 && var33 > -5) {
                                                            var33 = 0;
                                                        }
                                                        if (class42.field1017 < 5) {
                                                            var33 = 0;
                                                            var32 = 0;
                                                        }
                                                        var31.method578(var27 + var33, var26 + var32, 128);
                                                        if (arg6 != -1) {
                                                            class54 var34 = arg4[arg6 & 0xFFFF];
                                                            if (class96.field2325 > var26 + var32 && var34.field1378 > 0) {
                                                                int var35 = (class96.field2325 - var32 - var26) * class143.field3566 / 3;
                                                                if (var35 > class143.field3566 * 10) {
                                                                    var35 = class143.field3566 * 10;
                                                                }
                                                                if (var35 > var34.field1378) {
                                                                    var35 = var34.field1378;
                                                                }
                                                                var34.field1378 -= var35;
                                                                class70.field1801 += var35;
                                                            }
                                                            if (class96.field2328 < var26 + var32 + 32 && var34.field1378 < var34.field1300 - var34.field1403) {
                                                                int var36 = (var26 + var32 + 32 - class96.field2328) * class143.field3566 / 3;
                                                                if (var36 > class143.field3566 * 10) {
                                                                    var36 = class143.field3566 * 10;
                                                                }
                                                                if (var34.field1300 - var34.field1403 - var34.field1378 < var36) {
                                                                    var36 = var34.field1300 - var34.field1378 - var34.field1403;
                                                                }
                                                                var34.field1378 += var36;
                                                                class70.field1801 -= var36;
                                                            }
                                                        }
                                                    } else if (class89.field2201 != 0 && class45.field1078 == var23 && class63.field1675 == var12.field1293) {
                                                        var31.method578(var27, var26, 128);
                                                    } else {
                                                        var31.method584(var27, var26);
                                                    }
                                                }
                                            } else if (var12.field1295 != null && var23 < 20) {
                                                class64 var37 = var12.method456(var23, (byte) -58);
                                                if (var37 != null) {
                                                    var37.method584(var27, var26);
                                                } else if (class148.field3681) {
                                                    var10 = false;
                                                }
                                            }
                                            var23++;
                                        }
                                    }
                                } else if (var12.field1341 == 3) {
                                    int var38;
                                    if (class46.method388(var12, (byte) 75)) {
                                        var38 = var12.field1345;
                                        if (class84.method732(false, arg2, var11) && var12.field1329 != 0) {
                                            var38 = var12.field1329;
                                        }
                                    } else {
                                        var38 = var12.field1317;
                                        if (class84.method732(false, arg2, var11) && var12.field1286 != 0) {
                                            var38 = var12.field1286;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var12.field1338) {
                                            class96.method794(var13, var14, var12.field1383, var12.field1403, var38);
                                        } else {
                                            class96.method798(var13, var14, var12.field1383, var12.field1403, var38);
                                        }
                                    } else if (var12.field1338) {
                                        class96.method796(var13, var14, var12.field1383, var12.field1403, var38, 256 - (var15 & 0xFF));
                                    } else {
                                        class96.method791(var13, var14, var12.field1383, var12.field1403, var38, 256 - (var15 & 0xFF));
                                    }
                                } else if (var12.field1341 == 4) {
                                    class115 var39 = var12.method455(-1);
                                    if (var39 != null) {
                                        class99 var40 = var12.field1372;
                                        int var41;
                                        if (class46.method388(var12, (byte) 112)) {
                                            var41 = var12.field1345;
                                            if (class84.method732(false, arg2, var11) && var12.field1329 != 0) {
                                                var41 = var12.field1329;
                                            }
                                            if (var12.field1366.method810(-58) > 0) {
                                                var40 = var12.field1366;
                                            }
                                        } else {
                                            var41 = var12.field1317;
                                            if (class84.method732(false, arg2, var11) && var12.field1286 != 0) {
                                                var41 = var12.field1286;
                                            }
                                        }
                                        if (var12.field1374 && var12.field1392 != -1) {
                                            class143 var42 = class1.method2((byte) 124, var12.field1392);
                                            var40 = var42.field3551;
                                            if (var40 == null) {
                                                var40 = class143.field3556;
                                            }
                                            if ((var42.field3568 == 1 || var12.field1391 != 1) && var12.field1391 != -1) {
                                                var40 = class20.method189(new class99[] { var40, class4.field81, class67.method592(var12.field1391, true) }, 20);
                                            }
                                        }
                                        if (class31.field731 == var12.field1293 && class25.field574 == var12.field1390) {
                                            var41 = var12.field1317;
                                            var40 = class58.field1514;
                                        }
                                        if (class96.field2329 == 479) {
                                            if (var41 == 16776960) {
                                                var41 = 255;
                                            }
                                            if (var41 == 49152) {
                                                var41 = 16777215;
                                            }
                                        }
                                        class99 var43 = class140.method1152(var12, var40, (byte) 24);
                                        var39.method987(var43, var13, var14, var12.field1383, var12.field1403, var41, var12.field1308, var12.field1348, var12.field1386, var12.field1289);
                                    } else if (class148.field3681) {
                                        var10 = false;
                                    }
                                } else if (var12.field1341 == 5) {
                                    if (var12.field1374) {
                                        class64 var44;
                                        if (var12.field1392 == -1) {
                                            var44 = var12.method444(false, 91);
                                        } else {
                                            var44 = class59.method529(var12.field1351, false, var12.field1392, -5, var12.field1397, var12.field1391);
                                        }
                                        if (var44 != null) {
                                            int var45 = var44.field1685;
                                            int var46 = var44.field1683;
                                            if (var12.field1314) {
                                                int[] var47 = new int[4];
                                                class96.method786(var47);
                                                int var48 = var14;
                                                if (var47[1] > var14) {
                                                    var48 = var47[1];
                                                }
                                                int var49 = var12.field1403 + var14;
                                                int var50 = var12.field1383 + var13;
                                                if (var50 > var47[2]) {
                                                    var50 = var47[2];
                                                }
                                                if (var49 > var47[3]) {
                                                    var49 = var47[3];
                                                }
                                                int var51 = var13;
                                                if (var13 < var47[0]) {
                                                    var51 = var47[0];
                                                }
                                                class96.method795(var51, var48, var50, var49);
                                                int var52 = (var12.field1403 + var46 - 1) / var46;
                                                int var53 = (var12.field1383 + var45 - 1) / var45;
                                                int var54 = 0;
                                                while (true) {
                                                    if (var53 <= var54) {
                                                        class96.method784(var47);
                                                        break;
                                                    }
                                                    for (int var55 = 0; var55 < var52; var55++) {
                                                        if (var12.field1359 != 0) {
                                                            var44.method577(var45 * var54 + var45 / 2 + var13, var46 / 2 + (var14 - -(var46 * var55)), var12.field1359, 4096);
                                                        } else if (var15 == 0) {
                                                            var44.method584(var45 * var54 + var13, var14 - -(var46 * var55));
                                                        } else {
                                                            var44.method578(var45 * var54 + var13, var46 * var55 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                    var54++;
                                                }
                                            } else {
                                                int var56 = var12.field1383 * 4096 / var45;
                                                if (var12.field1359 != 0) {
                                                    var44.method577(var12.field1383 / 2 + var13, var12.field1403 / 2 + var14, var12.field1359, var56);
                                                } else if (var15 != 0) {
                                                    var44.method575(var13, var14, var12.field1383, var12.field1403, 256 - (var15 & 0xFF));
                                                } else if (var12.field1383 == var45 && var12.field1403 == var46) {
                                                    var44.method584(var13, var14);
                                                } else {
                                                    var44.method558(var13, var14, var12.field1383, var12.field1403);
                                                }
                                            }
                                        } else if (class148.field3681) {
                                            var10 = false;
                                        }
                                    } else {
                                        class64 var57 = var12.method444(class46.method388(var12, (byte) 79), 88);
                                        if (var57 != null) {
                                            var57.method584(var13, var14);
                                        } else if (class148.field3681) {
                                            var10 = false;
                                        }
                                    }
                                } else if (var12.field1341 == 6) {
                                    boolean var58 = class46.method388(var12, (byte) 103);
                                    int var59;
                                    if (var58) {
                                        var59 = var12.field1365;
                                    } else {
                                        var59 = var12.field1321;
                                    }
                                    class26 var60 = null;
                                    int var61 = 0;
                                    if (var12.field1392 != -1) {
                                        class143 var63 = class1.method2((byte) 116, var12.field1392);
                                        if (var63 != null) {
                                            class143 var64 = var63.method1170(7, var12.field1391);
                                            var60 = var64.method1165(1, -11);
                                            if (var60 == null) {
                                                var10 = false;
                                            } else {
                                                var60.method239();
                                                var61 = var60.field2187 / 2;
                                            }
                                        }
                                    } else if (var12.field1395 == 5) {
                                        if (var12.field1290 == 0) {
                                            var60 = class126.field3032.method1077(-1, null, -1, arg7 ^ -19231, null);
                                        } else {
                                            var60 = class69.field1770.method276((byte) 19);
                                        }
                                    } else if (var59 == -1) {
                                        var60 = var12.method446(true, class69.field1770.field3020, var58, -1, null);
                                        if (var60 == null && class148.field3681) {
                                            var10 = false;
                                        }
                                    } else {
                                        class81 var62 = class142.method1163(-123, var59);
                                        var60 = var12.method446(true, class69.field1770.field3020, var58, var12.field1313, var62);
                                        if (var60 == null && class148.field3681) {
                                            var10 = false;
                                        }
                                    }
                                    class40.method330(var12.field1383 / 2 + var13, var12.field1403 / 2 + var14);
                                    int var65 = class40.field981[var12.field1398] * var12.field1396 >> 16;
                                    int var66 = class40.field982[var12.field1398] * var12.field1396 >> 16;
                                    if (var60 != null) {
                                        if (var12.field1374) {
                                            var60.method239();
                                            if (var12.field1284) {
                                                var60.method229(0, var12.field1288, var12.field1381, var12.field1398, var12.field1357, var12.field1399 + var66 + var61, var65 - -var12.field1399, var12.field1396);
                                            } else {
                                                var60.method241(0, var12.field1288, var12.field1381, var12.field1398, var12.field1357, var66 + var12.field1399 + var61, var12.field1399 + var65);
                                            }
                                        } else {
                                            var60.method241(0, var12.field1288, 0, var12.field1398, 0, var66, var65);
                                        }
                                    }
                                    class40.method337();
                                } else {
                                    label651: {
                                        if (var12.field1341 == 7) {
                                            class115 var67 = var12.method455(-1);
                                            if (var67 == null) {
                                                if (class148.field3681) {
                                                    var10 = false;
                                                }
                                                break label651;
                                            }
                                            int var68 = 0;
                                            for (int var69 = 0; var69 < var12.field1403; var69++) {
                                                for (int var70 = 0; var70 < var12.field1383; var70++) {
                                                    if (var12.field1368[var68] > 0) {
                                                        class143 var71 = class1.method2((byte) -77, var12.field1368[var68] - 1);
                                                        class99 var72 = var71.field3551;
                                                        if (var72 == null) {
                                                            var72 = class143.field3556;
                                                        }
                                                        if (var71.field3568 == 1 || var12.field1304[var68] != 1) {
                                                            var72 = class20.method189(new class99[] { var72, class4.field81, class67.method592(var12.field1304[var68], true) }, 67);
                                                        }
                                                        int var73 = (var12.field1302 + 12) * var69 + var14;
                                                        int var74 = (var12.field1309 + 115) * var70 + var13;
                                                        if (var12.field1348 == 0) {
                                                            var67.method983(var72, var74, var73, var12.field1317, var12.field1308);
                                                        } else if (var12.field1348 == 1) {
                                                            var67.method989(var72, var12.field1383 / 2 + var74, var73, var12.field1317, var12.field1308);
                                                        } else {
                                                            var67.method966(var72, var12.field1383 + var74 - 1, var73, var12.field1317, var12.field1308);
                                                        }
                                                    }
                                                    var68++;
                                                }
                                            }
                                        }
                                        if (var12.field1341 == 8 && class54.method450(var11, -4, arg2) && class42.field1014 == class34.field851) {
                                            int var75 = 0;
                                            int var76 = 0;
                                            class115 var77 = client.field529;
                                            class99 var78 = var12.field1372;
                                            class99 var79 = class140.method1152(var12, var78, (byte) 24);
                                            while (var79.method810(-58) > 0) {
                                                int var87 = var79.method830(class113.field2828, 63);
                                                class99 var88;
                                                if (var87 == -1) {
                                                    var88 = var79;
                                                    var79 = class137.field3407;
                                                } else {
                                                    var88 = var79.method840(0, -109, var87);
                                                    var79 = var79.method813(var87 + 2, (byte) -71);
                                                }
                                                int var89 = var77.method970(var88);
                                                var76 += var77.field2860 + 1;
                                                if (var75 < var89) {
                                                    var75 = var89;
                                                }
                                            }
                                            var75 += 6;
                                            var76 += 7;
                                            int var80 = var13 + var12.field1383 - var75 - 5;
                                            int var81 = var14 + var12.field1403 + 5;
                                            if (arg9 < var81 + var76) {
                                                var81 = arg9 - var76;
                                            }
                                            if (var13 + 5 > var80) {
                                                var80 = var13 + 5;
                                            }
                                            if (arg1 < var75 + var80) {
                                                var80 = arg1 - var75;
                                            }
                                            class96.method794(var80, var81, var75, var76, 16777120);
                                            class96.method798(var80, var81, var75, var76, 0);
                                            int var82 = var81 + var77.field2860 + 2;
                                            class99 var83 = var12.field1372;
                                            class99 var84 = class140.method1152(var12, var83, (byte) 24);
                                            while (var84.method810(arg7 - 19374) > 0) {
                                                int var85 = var84.method830(class113.field2828, arg7 ^ 0x4B4B);
                                                class99 var86;
                                                if (var85 == -1) {
                                                    var86 = var84;
                                                    var84 = class137.field3407;
                                                } else {
                                                    var86 = var84.method840(0, arg7 ^ 0xFFFFB4EA, var85);
                                                    var84 = var84.method813(var85 + 2, (byte) -77);
                                                }
                                                var77.method983(var86, var80 + 3, var82, 0, false);
                                                var82 += var77.field2860 + 1;
                                            }
                                        }
                                        if (var12.field1341 == 9) {
                                            if (var12.field1277 == 1) {
                                                class96.method792(var13, var14, var12.field1383 + var13, var12.field1403 + var14, var12.field1317);
                                            } else {
                                                int var90 = var12.field1403 < 0 ? -var12.field1403 : var12.field1403;
                                                int var91 = var12.field1383 < 0 ? -var12.field1383 : var12.field1383;
                                                int var92 = var91;
                                                if (var90 > var91) {
                                                    var92 = var90;
                                                }
                                                if (var92 != 0) {
                                                    int var93 = (var12.field1383 << 16) / var92;
                                                    int var94 = (var12.field1403 << 16) / var92;
                                                    if (var94 > var93) {
                                                        var94 = -var94;
                                                    } else {
                                                        var93 = -var93;
                                                    }
                                                    int var95 = var12.field1277 * var94 >> 17;
                                                    int var96 = var12.field1277 * var94 + 1 >> 17;
                                                    int var97 = var12.field1277 * var93 >> 17;
                                                    int var98 = var13 + var95;
                                                    int var99 = var12.field1277 * var93 + 1 >> 17;
                                                    int var100 = var12.field1383 + var13 + var95;
                                                    int var101 = var13 - var96;
                                                    int var102 = var13 + var12.field1383 - var96;
                                                    int var103 = var14 - var99;
                                                    int var104 = var14 + var97;
                                                    int var105 = var12.field1403 + var14 - var99;
                                                    int var106 = var14 + var12.field1403 + var97;
                                                    class40.method344(var98, var101, var102);
                                                    class40.method329(var104, var103, var105, var98, var101, var102, var12.field1317);
                                                    class40.method344(var98, var102, var100);
                                                    class40.method329(var104, var105, var106, var98, var102, var100, var12.field1317);
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
            var11++;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static void method668(int arg0) {
        field1887 = null;
        field1860 = null;
        field1866 = null;
        field1885 = null;
        field1897 = null;
        field1864 = null;
        if (arg0 != -5279) {
            method667(94, 108, 26, -44, null, 83, -110, -13, -120, 63);
        }
        field1875 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public final void method669(byte arg0) {
        this.field1894 = null;
        this.field1876 = null;
        this.field1879 = null;
        this.field1873 = null;
        field1888++;
        int var2 = 80 / ((52 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZI)I")
    public static final int method670(int arg0, int arg1, boolean arg2, int arg3) {
        field1893++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg3 & arg1 - 1;
        int var8 = class144.method1182(-95, var4, var6);
        int var9 = class144.method1182(-128, var4 + 1, var6);
        if (!arg2) {
            field1864 = null;
        }
        int var10 = class144.method1182(-100, var4, var6 + 1);
        int var11 = class144.method1182(59, var4 + 1, var6 - -1);
        int var12 = class42.method367(var5, var9, arg1, 3699, var8);
        int var13 = class42.method367(var5, var11, arg1, 3699, var10);
        return class42.method367(var7, var13, arg1, 3699, var12);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IJ)Loc;")
    public static final class99 method671(int arg0, long arg1) {
        field1877++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 > -114) {
                return null;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class95.field2307[(int) (var8 - arg1 * 37L)];
            }
            class99 var7 = new class99();
            var7.field2394 = var6;
            var7.field2391 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public static final void method672(byte arg0) {
        field1891++;
        if (class104.field2536 != null) {
            class104.field2536.method1215(false);
            class104.field2536 = null;
        }
        class12.method129(2388);
        class68.field1757.method80();
        for (int var1 = 0; var1 < 4; var1++) {
            class86.field2143[var1].method288(16578);
        }
        System.gc();
        if (arg0 >= -30) {
            return;
        }
        class69.method602(2, -101);
        class61.field1628 = -1;
        class72.field1837 = false;
        class149.method1209(0);
        class73.method663(10, (byte) 52);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILpc;ZI)Lra;")
    public static final class115 method673(int arg0, class105 arg1, boolean arg2, int arg3) {
        field1865++;
        if (!arg2) {
            field1872 = false;
        }
        return class95.method782(arg0, (byte) -99, arg1, arg3) ? class68.method598((byte) 91) : null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILpc;)V")
    public static final void method674(int arg0, class105 arg1) {
        if (arg0 != 37) {
            method671(125, 105L);
        }
        field1870++;
        class138.field3444 = arg1;
    }
}
