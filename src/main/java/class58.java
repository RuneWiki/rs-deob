import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    private int field1428 = 0;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[[I")
    public int[][] field1418;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lad;")
    public static class5 field1407 = class88.method674("Wen m-Ochten Sie der Liste hinzuf-Ugen?", 76);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lad;")
    public static class5 field1406 = class88.method674("Gegenstand f-Ur Mitglieder", -103);

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lad;")
    public static class5 field1423 = class88.method674("mod_icons", 80);

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "[I")
    public static int[] field1420 = new int[500];

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "Lad;")
    public static class5 field1435 = class88.method674(" )2> @lre@", -102);

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "Lad;")
    private static class5 field1433 = class88.method674("button near the top of that page)3", 117);

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lad;")
    public static class5 field1416 = field1433;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Ldd;")
    public static class23 field1419 = new class23();

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "Lad;")
    private static class5 field1439 = class88.method674("Take", -83);

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lad;")
    public static class5 field1438 = field1439;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lbb;")
    public static class9 field1437 = new class9(100);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Lgd;")
    public static class40 field1436;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Lle;")
    public static class71 field1417;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "[[I")
    public static int[][] field1411;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method464(int arg0, int arg1, byte arg2) {
        field1422++;
        int var4 = -1 / ((-arg2 - 11) / 49);
        int var5 = arg1 - this.field1428;
        int var6 = arg0 - this.field1408;
        this.field1418[var5][var6] = class5.method54(this.field1418[var5][var6], 2097152);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII[Lrc;IIIII)Z", line = 17)
    public static final boolean method465(int arg0, int arg1, int arg2, int arg3, int arg4, class105[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class55.method454(arg6, arg2, arg10, arg7);
        field1414++;
        boolean var11 = true;
        for (int var12 = arg0; var12 < arg5.length; var12++) {
            class105 var13 = arg5[var12];
            if (var13 != null && var13.field2575 == arg1) {
                if (var13.field2558 > 0) {
                    class91.method691(var13, -1);
                }
                int var14 = var13.field2640 + arg6;
                int var15 = var13.field2537 + arg2;
                if (!var13.field2626) {
                    var15 -= arg8;
                }
                if (!var13.field2626) {
                    var14 -= arg3;
                }
                int var16 = var13.field2589;
                if (class90.field2120 == var13) {
                    var16 = 128;
                    class105 var17 = class16.method129((byte) -126, var13);
                    int[] var18 = class4.method29(var17, (byte) 63);
                    int[] var19 = class4.method29(var13, (byte) 118);
                    int var20 = class22.field564 + var19[0] - class99.field2406 - var18[0];
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var20 + var13.field2636 > var17.field2636) {
                        var20 = var17.field2636 - var13.field2636;
                    }
                    var14 = var18[0] + var20;
                    int var21 = class91.field2131 + var19[1] - class23.field591 - var18[1];
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var13.field2611 + var21 > var17.field2611) {
                        var21 = var17.field2611 - var13.field2611;
                    }
                    var15 = var18[1] + var21;
                }
                if (var13.field2630 == 0) {
                    if (var13.field2552 && !class4.method28((byte) 26, arg9, var12)) {
                        continue;
                    }
                    if (!var13.field2615) {
                        if (var13.field2547 > var13.field2538 - var13.field2611) {
                            var13.field2547 = var13.field2538 - var13.field2611;
                        }
                        if (var13.field2547 < 0) {
                            var13.field2547 = 0;
                        }
                    }
                    var11 &= method465(0, var12, var15, var13.field2605, arg4, arg5, var14, var15 + var13.field2611, var13.field2547, arg9, var14 + var13.field2636);
                    if (var13.field2562 != null) {
                        var11 &= method465(0, var13.field2568, var15, var13.field2605, arg4, var13.field2562, var14, var13.field2611 + var15, var13.field2547, arg9, var13.field2636 + var14);
                    }
                    class55.method454(arg6, arg2, arg10, arg7);
                    if (var13.field2538 > var13.field2611) {
                        class110.method889(var13.field2611, var13.field2636 + var14, var13.field2538, var15, true, var13.field2547);
                    }
                }
                if (var13.field2630 != 1) {
                    if (var13.field2630 == 2) {
                        int var22 = 0;
                        for (int var23 = 0; var23 < var13.field2611; var23++) {
                            for (int var24 = 0; var24 < var13.field2636; var24++) {
                                int var25 = (var13.field2578 + 32) * var24 + var14;
                                int var26 = (var13.field2550 + 32) * var23 + var15;
                                if (var22 < 20) {
                                    var26 += var13.field2599[var22];
                                    var25 += var13.field2541[var22];
                                }
                                if (var13.field2620[var22] > 0) {
                                    int var27 = 0;
                                    int var28 = var13.field2620[var22] - 1;
                                    int var29 = 0;
                                    if (class55.field1377 - 32 < var25 && class55.field1379 > var25 && var26 > class55.field1375 - 32 && var26 < class55.field1378 || class13.field383 != 0 && class59.field1447 == var22) {
                                        int var30 = 0;
                                        if (class112.field2814 == 1 && class22.field567 == var22 && (arg4 << 16) + var12 == class91.field2148) {
                                            var30 = 16777215;
                                        }
                                        class122 var31 = class134.method1032(var28, 14017, var30, var13.field2609[var22]);
                                        if (var31 == null) {
                                            var11 = false;
                                        } else {
                                            if (class13.field383 != 0 && class59.field1447 == var22 && (arg4 << 16) + var12 == class89.field2111) {
                                                var27 = class22.field564 - class7.field266;
                                                if (var27 < 5 && var27 > -5) {
                                                    var27 = 0;
                                                }
                                                var29 = class91.field2131 - class91.field2157;
                                                if (var29 < 5 && var29 > -5) {
                                                    var29 = 0;
                                                }
                                                if (class43.field1084 < 5) {
                                                    var27 = 0;
                                                    var29 = 0;
                                                }
                                                var31.method968(var25 + var27, var26 + var29, 128);
                                                if (arg1 != -1) {
                                                    class105 var32 = arg5[arg1];
                                                    if (class55.field1375 > var26 + var29 && var32.field2547 > 0) {
                                                        int var33 = (class55.field1375 - var29 - var26) * class98.field2382 / 3;
                                                        if (class98.field2382 * 10 < var33) {
                                                            var33 = class98.field2382 * 10;
                                                        }
                                                        if (var33 > var32.field2547) {
                                                            var33 = var32.field2547;
                                                        }
                                                        var32.field2547 -= var33;
                                                        class91.field2157 += var33;
                                                    }
                                                    if (var26 + var29 + 32 > class55.field1378 && var32.field2538 - var32.field2611 > var32.field2547) {
                                                        int var34 = (var26 + var29 + 32 - class55.field1378) * class98.field2382 / 3;
                                                        if (var34 > class98.field2382 * 10) {
                                                            var34 = class98.field2382 * 10;
                                                        }
                                                        if (var34 > var32.field2538 - var32.field2611 - var32.field2547) {
                                                            var34 = var32.field2538 - var32.field2611 - var32.field2547;
                                                        }
                                                        var32.field2547 += var34;
                                                        class91.field2157 -= var34;
                                                    }
                                                }
                                            } else if (class22.field570 != 0 && class128.field3084 == var22 && (arg4 << 16) + var12 == class12.field362) {
                                                var31.method968(var25, var26, 128);
                                            } else {
                                                var31.method964(var25, var26);
                                            }
                                            if (var31.field3016 == 33 || var13.field2609[var22] != 1) {
                                                int var35 = var13.field2609[var22];
                                                class49.field1263.method1014(class82.method635(var35, -5), var25 + var27 + 1, var26 + var29 + 10, 0);
                                                class49.field1263.method1014(class82.method635(var35, -6), var25 + var27, var26 + 9 + var29, 16776960);
                                            }
                                        }
                                    }
                                } else if (var13.field2616 != null && var22 < 20) {
                                    class122 var36 = var13.method840(var22, 21698);
                                    if (var36 != null) {
                                        var36.method964(var25, var26);
                                    } else if (class102.field2484) {
                                        var11 = false;
                                    }
                                }
                                var22++;
                            }
                        }
                    } else if (var13.field2630 == 3) {
                        int var37;
                        if (class5.method69(-8743, var13)) {
                            var37 = var13.field2561;
                            if (class4.method28((byte) 30, arg9, var12) && var13.field2535 != 0) {
                                var37 = var13.field2535;
                            }
                        } else {
                            var37 = var13.field2637;
                            if (class4.method28((byte) 95, arg9, var12) && var13.field2606 != 0) {
                                var37 = var13.field2606;
                            }
                        }
                        if (var16 == 0) {
                            if (var13.field2618) {
                                class55.method443(var14, var15, var13.field2636, var13.field2611, var37);
                            } else {
                                class55.method452(var14, var15, var13.field2636, var13.field2611, var37);
                            }
                        } else if (var13.field2618) {
                            class55.method448(var14, var15, var13.field2636, var13.field2611, var37, 256 - (var16 & 0xFF));
                        } else {
                            class55.method453(var14, var15, var13.field2636, var13.field2611, var37, 256 - (var16 & 0xFF));
                        }
                    } else if (var13.field2630 == 4) {
                        class130 var38 = var13.method837((byte) -55);
                        if (var38 != null) {
                            class5 var39 = var13.field2625;
                            int var40;
                            if (class5.method69(-8743, var13)) {
                                var40 = var13.field2561;
                                if (class4.method28((byte) -126, arg9, var12) && var13.field2535 != 0) {
                                    var40 = var13.field2535;
                                }
                                if (var13.field2574.method33(96) > 0) {
                                    var39 = var13.field2574;
                                }
                            } else {
                                var40 = var13.field2637;
                                if (class4.method28((byte) 5, arg9, var12) && var13.field2606 != 0) {
                                    var40 = var13.field2606;
                                }
                            }
                            if (var13.field2604 == 6 && (arg4 << 16) + var12 == class80.field1885) {
                                var39 = class80.field1883;
                                var40 = var13.field2637;
                            }
                            if (class55.field1381 == 479) {
                                if (var40 == 16776960) {
                                    var40 = 255;
                                }
                                if (var40 == 49152) {
                                    var40 = 16777215;
                                }
                            }
                            class5 var41 = class16.method125(var13, 4, var39);
                            var38.method1005(var41, var14, var15, var13.field2636, var13.field2611, var40, var13.field2591, var13.field2570, var13.field2601, var13.field2586);
                        } else if (class102.field2484) {
                            var11 = false;
                        }
                    } else if (var13.field2630 == 5) {
                        class122 var42 = var13.method842(arg0 ^ 0x6625, class5.method69(-8743, var13));
                        if (var42 != null) {
                            var42.method964(var14, var15);
                        } else if (class102.field2484) {
                            var11 = false;
                        }
                    } else if (var13.field2630 == 6) {
                        class114.method908(var14 + var13.field2636 / 2, var13.field2611 / 2 + var15);
                        int var43 = class114.field2831[var13.field2622] * var13.field2598 >> 16;
                        int var44 = class114.field2835[var13.field2622] * var13.field2598 >> 16;
                        boolean var45 = class5.method69(-8743, var13);
                        int var46;
                        if (var45) {
                            var46 = var13.field2554;
                        } else {
                            var46 = var13.field2627;
                        }
                        Object var47 = null;
                        class45 var48;
                        if (var13.field2587 == 5) {
                            if (var13.field2602 == 0) {
                                var48 = class34.field826.method499(-1, null, null, -1, arg0 - 16448);
                            } else {
                                var48 = class82.field1932.method30((byte) 57);
                            }
                        } else if (var46 == -1) {
                            var48 = var13.method843(-1, class82.field1932.field2786, var45, -38, null);
                            if (var48 == null && class102.field2484) {
                                var11 = false;
                            }
                        } else {
                            class72 var49 = class78.method605(var46, (byte) 20);
                            var48 = var13.method843(var13.field2559, class82.field1932.field2786, var45, -80, var49);
                            if (var48 == null && class102.field2484) {
                                var11 = false;
                            }
                        }
                        if (var48 != null) {
                            var48.method394(0, var13.field2623, 0, var13.field2622, 0, var43, var44);
                        }
                        class114.method909();
                    } else {
                        if (var13.field2630 == 7) {
                            class130 var50 = var13.method837((byte) -55);
                            if (var50 == null) {
                                if (class102.field2484) {
                                    var11 = false;
                                }
                                continue;
                            }
                            int var51 = 0;
                            for (int var52 = 0; var52 < var13.field2611; var52++) {
                                for (int var53 = 0; var53 < var13.field2636; var53++) {
                                    if (var13.field2620[var51] > 0) {
                                        class27 var54 = class3.method21((byte) 54, var13.field2620[var51] - 1);
                                        class5 var55 = var54.field650;
                                        if (var55 == null) {
                                            var55 = class92.field2193;
                                        }
                                        if (var54.field695 == 1 || var13.field2609[var51] != 1) {
                                            var55 = class69.method546(true, new class5[] { var55, class16.field433, class88.method666(var13.field2609[var51], false) });
                                        }
                                        int var56 = (var13.field2578 + 115) * var53 + var14;
                                        int var57 = (var13.field2550 + 12) * var52 + var15;
                                        if (var13.field2570 == 0) {
                                            var50.method1016(var55, var56, var57, var13.field2637, var13.field2591);
                                        } else if (var13.field2570 == 1) {
                                            var50.method1000(var55, var56 + var13.field2636 / 2, var57, var13.field2637, var13.field2591);
                                        } else {
                                            var50.method1009(var55, var56 + var13.field2636 - 1, var57, var13.field2637, var13.field2591);
                                        }
                                    }
                                    var51++;
                                }
                            }
                        }
                        if (var13.field2630 == 8 && class89.method683(arg9, var12, arg0 - 2) && class95.field2277 == class109.field2743) {
                            int var58 = 0;
                            int var59 = 0;
                            class5 var60 = var13.field2625;
                            class130 var61 = class82.field1924;
                            class5 var62 = class16.method125(var13, arg0 ^ 0x4, var60);
                            while (var62.method33(64) > 0) {
                                int var70 = var62.method32(class106.field2662, 0);
                                class5 var71;
                                if (var70 == -1) {
                                    var71 = var62;
                                    var62 = class135.field3269;
                                } else {
                                    var71 = var62.method51((byte) -72, 0, var70);
                                    var62 = var62.method52(var70 + 2, (byte) -93);
                                }
                                int var72 = var61.method1006(var71);
                                if (var72 > var58) {
                                    var58 = var72;
                                }
                                var59 += var61.field3156 + 1;
                            }
                            var59 += 7;
                            var58 += 6;
                            int var63 = var13.field2611 + var15 + 5;
                            if (arg7 < var63 + var59) {
                                var63 = arg7 - var59;
                            }
                            int var64 = var14 + var13.field2636 - var58 - 5;
                            if (var14 + 5 > var64) {
                                var64 = var14 + 5;
                            }
                            if (var64 + var58 > arg10) {
                                var64 = arg10 - var58;
                            }
                            class55.method443(var64, var63, var58, var59, 16777120);
                            class55.method452(var64, var63, var58, var59, 0);
                            int var65 = var61.field3156 + var63 + 2;
                            class5 var66 = var13.field2625;
                            class5 var67 = class16.method125(var13, 4, var66);
                            while (var67.method33(123) > 0) {
                                int var68 = var67.method32(class106.field2662, 0);
                                class5 var69;
                                if (var68 == -1) {
                                    var69 = var67;
                                    var67 = class135.field3269;
                                } else {
                                    var69 = var67.method51((byte) -123, 0, var68);
                                    var67 = var67.method52(var68 + 2, (byte) -124);
                                }
                                var61.method1016(var69, var64 + 3, var65, 0, false);
                                var65 += var61.field3156 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var11;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIII)V", line = 590)
    public final void method466(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1431++;
        int var7 = arg1 - this.field1408;
        int var8 = arg2 - this.field1428;
        if (~arg5 == arg4) {
            if (arg3 == 0) {
                this.method468(arg4 + 65, var8, var7, 128);
                this.method468(123, var8 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method468(25, var8, var7, 2);
                this.method468(arg4 + 29, var8, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method468(68, var8, var7, 8);
                this.method468(25, var8 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method468(66, var8, var7, 32);
                this.method468(61, var8, var7 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method468(110, var8, var7, 1);
                this.method468(48, var8 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method468(115, var8, var7, 4);
                this.method468(35, var8 + 1, var7 - -1, 64);
            }
            if (arg3 == 2) {
                this.method468(125, var8, var7, 16);
                this.method468(123, var8 + 1, var7 + -1, 1);
            }
            if (arg3 == 3) {
                this.method468(101, var8, var7, 64);
                this.method468(44, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method468(70, var8, var7, 130);
                this.method468(26, var8 - 1, var7, 8);
                this.method468(51, var8, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method468(53, var8, var7, 10);
                this.method468(arg4 + 80, var8, var7 + 1, 32);
                this.method468(120, var8 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method468(61, var8, var7, 40);
                this.method468(64, var8 + 1, var7, 128);
                this.method468(116, var8, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method468(32, var8, var7, 160);
                this.method468(arg4 + 97, var8, var7 - 1, 2);
                this.method468(73, var8 - 1, var7, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method468(87, var8, var7, 65536);
                this.method468(109, var8 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method468(43, var8, var7, 1024);
                this.method468(arg4 ^ 0xFFFFFFB2, var8, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method468(arg4 + 66, var8, var7, 4096);
                this.method468(arg4 ^ 0xFFFFFF94, var8 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method468(81, var8, var7, 16384);
                this.method468(116, var8, var7 - 1, 1024);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method468(73, var8, var7, 512);
                this.method468(arg4 ^ 0xFFFFFF83, var8 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method468(44, var8, var7, 2048);
                this.method468(73, var8 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method468(113, var8, var7, 8192);
                this.method468(89, var8 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method468(80, var8, var7, 32768);
                this.method468(arg4 ^ 0xFFFFFFC1, var8 - 1, var7 + -1, 2048);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method468(arg4 ^ 0xFFFFFFC4, var8, var7, 66560);
            this.method468(84, var8 - 1, var7, 4096);
            this.method468(51, var8, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method468(61, var8, var7, 5120);
            this.method468(arg4 + 81, var8, var7 + 1, 16384);
            this.method468(arg4 ^ 0xFFFFFFD8, var8 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method468(arg4 ^ 0xFFFFFF92, var8, var7, 20480);
            this.method468(68, var8 + 1, var7, 65536);
            this.method468(31, var8, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method468(51, var8, var7, 81920);
            this.method468(48, var8, var7 - 1, 1024);
            this.method468(arg4 ^ 0xFFFFFFA7, var8 - 1, var7, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIZII)Z", line = 807)
    public final boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1427++;
        int var9 = arg0 + arg2 - 1;
        int var10 = arg3 + arg6 - 1;
        if (arg0 <= arg7 && arg7 <= var9 && arg1 >= arg3 && var10 >= arg1) {
            return true;
        } else if (arg0 - 1 == arg7 && arg3 <= arg1 && var10 >= arg1 && (this.field1418[arg7 - this.field1428][arg1 - this.field1408] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg3 <= arg1 && arg1 <= var10 && (this.field1418[arg7 - this.field1428][arg1 - this.field1408] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg7 >= arg0 && arg7 <= var9 && (this.field1418[arg7 - this.field1428][arg1 - this.field1408] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else if (var10 + 1 == arg1 && arg0 <= arg7 && var9 >= arg7 && (this.field1418[arg7 - this.field1428][arg1 - this.field1408] & 0x20) == 0 && (arg4 & 0x1) == 0) {
            return true;
        } else if (arg5) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V", line = 846)
    private final void method468(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 24) {
            this.field1418[arg1][arg2] = class104.method832(this.field1418[arg1][arg2], 16777215 - arg3);
            field1426++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 857)
    public final void method469(int arg0) {
        field1424++;
        int var2 = 77 / ((arg0 + 42) / 38);
        for (int var3 = 0; var3 < this.field1410; var3++) {
            for (int var4 = 0; var4 < this.field1429; var4++) {
                if (var3 == 0 || var4 == 0 || this.field1410 - 1 == var3 || this.field1429 - 1 == var4) {
                    this.field1418[var3][var4] = 16777215;
                } else {
                    this.field1418[var3][var4] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZIIIII)V", line = 887)
    public final void method470(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field1428;
        int var9 = arg2 - this.field1408;
        int var10 = 256;
        field1409++;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg5;
            arg5 = arg3;
            arg3 = var11;
        }
        if (arg1) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < var8 + arg5; var12++) {
            if (var12 >= 0 && this.field1410 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && this.field1429 > var13) {
                        this.method468(100, var12, var13, var10);
                    }
                }
            }
        }
        if (arg4 != 18344) {
            method471((byte) 88);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 937)
    public static final void method471(byte arg0) {
        field1430++;
        try {
            Graphics var1 = class9.field305.getGraphics();
            client.field494.method253(4, var1, false, 4);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
        if (arg0 != 51) {
            field1416 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIBII)Z", line = 954)
    public final boolean method472(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1421++;
        if (arg0 == arg1 && arg2 == arg6) {
            return true;
        }
        int var8 = arg6 - this.field1408;
        int var9 = arg2 - this.field1408;
        int var10 = arg1 - this.field1428;
        int var11 = arg0 - this.field1428;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        if (arg4 != -83) {
            field1417 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)Z", line = 1045)
    public final boolean method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1432++;
        if (arg3 == arg6 && arg2 == arg4) {
            return true;
        }
        int var8 = arg4 - this.field1408;
        int var9 = arg2 - this.field1408;
        int var10 = arg3 - this.field1428;
        int var11 = arg6 - this.field1428;
        if (arg5 != -18685) {
            return true;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 - 1 == var10 && var8 == var9) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field1418[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field1418[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field1418[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 1235)
    public static void method474(int arg0) {
        if (arg0 != 32) {
            field1411 = null;
        }
        field1436 = null;
        field1438 = null;
        field1423 = null;
        field1411 = null;
        field1420 = null;
        field1407 = null;
        field1433 = null;
        field1417 = null;
        field1406 = null;
        field1419 = null;
        field1437 = null;
        field1416 = null;
        field1439 = null;
        field1435 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)[B", line = 1261)
    public static final byte[] method475(byte[] arg0, int arg1) {
        int var2 = -111 % ((-arg1 - 42) / 45);
        class39 var3 = new class39(arg0);
        int var4 = var3.method330(-30864);
        field1413++;
        int var5 = var3.method322((byte) -118);
        if (var5 < 0 || class121.field3007 != 0 && var5 > class121.field3007) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var9 = new byte[var5];
            var3.method313(0, (byte) 89, var5, var9);
            return var9;
        } else {
            int var6 = var3.method322((byte) -118);
            if (var6 < 0 || class121.field3007 != 0 && class121.field3007 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class93.method709(var7, var6, arg0, var5, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var5)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBII)V", line = 1332)
    private final void method476(int arg0, byte arg1, int arg2, int arg3) {
        field1425++;
        if (arg1 < -113) {
            this.field1418[arg2][arg3] = class5.method54(this.field1418[arg2][arg3], arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V", line = 1347)
    public final void method477(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1428;
        if (arg1 >= 97) {
            int var5 = arg2 - this.field1408;
            this.field1418[var4][var5] = class104.method832(this.field1418[var4][var5], 14680063);
            field1412++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIBIIII)V", line = 1379)
    public final void method478(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1415++;
        int var8 = 256;
        if (arg2 >= -123) {
            this.method478(true, -59, (byte) -123, 17, 29, 21, 40);
        }
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg6;
            arg6 = arg1;
            arg1 = var9;
        }
        int var10 = arg3 - this.field1408;
        int var11 = arg5 - this.field1428;
        if (arg0) {
            var8 += 131072;
        }
        for (int var12 = var11; var12 < var11 + arg6; var12++) {
            if (var12 >= 0 && this.field1410 > var12) {
                for (int var13 = var10; var13 < arg1 + var10; var13++) {
                    if (var13 >= 0 && this.field1429 > var13) {
                        this.method476(var8, (byte) -128, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V", line = 1430)
    public class58(int arg0, int arg1) {
        this.field1410 = arg0;
        this.field1429 = arg1;
        this.field1408 = 0;
        this.field1418 = new int[this.field1410][this.field1429];
        this.method469(-110);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIIIIB)V", line = 1451)
    public final void method479(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1434++;
        int var7 = arg2 - this.field1408;
        int var8 = arg3 - this.field1428;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method476(128, (byte) -126, var8, var7);
                this.method476(8, (byte) -120, var8 - 1, var7);
            }
            if (arg1 == 1) {
                this.method476(2, (byte) -126, var8, var7);
                this.method476(32, (byte) -125, var8, var7 + 1);
            }
            if (arg1 == 2) {
                this.method476(8, (byte) -122, var8, var7);
                this.method476(128, (byte) -126, var8 + 1, var7);
            }
            if (arg1 == 3) {
                this.method476(32, (byte) -119, var8, var7);
                this.method476(2, (byte) -126, var8, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method476(1, (byte) -126, var8, var7);
                this.method476(16, (byte) -117, var8 - 1, var7 + 1);
            }
            if (arg1 == 1) {
                this.method476(4, (byte) -126, var8, var7);
                this.method476(64, (byte) -116, var8 + 1, var7 + 1);
            }
            if (arg1 == 2) {
                this.method476(16, (byte) -124, var8, var7);
                this.method476(1, (byte) -121, var8 + 1, var7 + -1);
            }
            if (arg1 == 3) {
                this.method476(64, (byte) -122, var8, var7);
                this.method476(4, (byte) -121, var8 - 1, var7 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method476(130, (byte) -116, var8, var7);
                this.method476(8, (byte) -120, var8 - 1, var7);
                this.method476(32, (byte) -122, var8, var7 + 1);
            }
            if (arg1 == 1) {
                this.method476(10, (byte) -126, var8, var7);
                this.method476(32, (byte) -119, var8, var7 + 1);
                this.method476(128, (byte) -119, var8 + 1, var7);
            }
            if (arg1 == 2) {
                this.method476(40, (byte) -118, var8, var7);
                this.method476(128, (byte) -123, var8 + 1, var7);
                this.method476(2, (byte) -119, var8, var7 - 1);
            }
            if (arg1 == 3) {
                this.method476(160, (byte) -125, var8, var7);
                this.method476(2, (byte) -125, var8, var7 - 1);
                this.method476(8, (byte) -114, var8 - 1, var7);
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    this.method476(65536, (byte) -118, var8, var7);
                    this.method476(4096, (byte) -122, var8 - 1, var7);
                }
                if (arg1 == 1) {
                    this.method476(1024, (byte) -124, var8, var7);
                    this.method476(16384, (byte) -121, var8, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method476(4096, (byte) -119, var8, var7);
                    this.method476(65536, (byte) -125, var8 + 1, var7);
                }
                if (arg1 == 3) {
                    this.method476(16384, (byte) -117, var8, var7);
                    this.method476(1024, (byte) -116, var8, var7 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg1 == 0) {
                    this.method476(512, (byte) -127, var8, var7);
                    this.method476(8192, (byte) -118, var8 - 1, var7 - -1);
                }
                if (arg1 == 1) {
                    this.method476(2048, (byte) -126, var8, var7);
                    this.method476(32768, (byte) -115, var8 + 1, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method476(8192, (byte) -116, var8, var7);
                    this.method476(512, (byte) -115, var8 + 1, var7 - 1);
                }
                if (arg1 == 3) {
                    this.method476(32768, (byte) -117, var8, var7);
                    this.method476(2048, (byte) -120, var8 - 1, var7 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    this.method476(66560, (byte) -126, var8, var7);
                    this.method476(4096, (byte) -128, var8 - 1, var7);
                    this.method476(16384, (byte) -122, var8, var7 + 1);
                }
                if (arg1 == 1) {
                    this.method476(5120, (byte) -120, var8, var7);
                    this.method476(16384, (byte) -120, var8, var7 + 1);
                    this.method476(65536, (byte) -125, var8 + 1, var7);
                }
                if (arg1 == 2) {
                    this.method476(20480, (byte) -128, var8, var7);
                    this.method476(65536, (byte) -119, var8 + 1, var7);
                    this.method476(1024, (byte) -119, var8, var7 - 1);
                }
                if (arg1 == 3) {
                    this.method476(81920, (byte) -128, var8, var7);
                    this.method476(1024, (byte) -128, var8, var7 - 1);
                    this.method476(4096, (byte) -116, var8 - 1, var7);
                }
            }
        }
        int var9 = -105 % ((10 - arg5) / 61);
    }
}
