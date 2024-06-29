import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class241 extends class101 {

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Ljava/lang/String;")
    public String field3586;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3589 = 2;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3591 = "wave2:";

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
    public static boolean field3588 = false;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[Lqg;")
    public static class195[] field3592 = new class195[2048];

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[I")
    public static int[] field3595;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[[[Lum;")
    public static class221[][][] field3585;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method1632(int arg0, byte arg1) {
        if ((class114.field1750.field1566 + 64 - class114.field1750.method696((byte) 117) * 64 >> 7) == class253.field3844 && (class114.field1750.field1505 - ((class114.field1750.method696((byte) 117) - 1) * 64) >> 7) == class283.field4288) {
            class253.field3844 = 0;
        }
        field3587++;
        int var2 = class56.field706;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class195 var4;
            if (arg0 == 0) {
                var4 = class114.field1750;
            } else {
                var4 = field3592[class20.field239[var3]];
            }
            if (var4 != null && var4.method455(119)) {
                int var5 = var4.method696((byte) 117);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field1566 & 0x7F) == 64 && (var4.field1505 & 0x7F) == 64) {
                            int var6 = var4.field1566 >> 7;
                            int var7 = var4.field1505 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class206.field3104[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field1566 & 0x7F) == 0 && (var4.field1505 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field1566 & 0x7F) == 64 && (var4.field1505 & 0x7F) == 64)) {
                        int var8 = var4.field1566 - (var5 * 64) >> 7;
                        int var9 = var4.field1505 - (var5 * 64) >> 7;
                        int var10 = var8 + var4.method696((byte) 117);
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        int var11 = var9 + var4.method696((byte) 117);
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class206.field3104[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -103) {
            return;
        }
        label230: for (int var14 = 0; var14 < var2; var14++) {
            long var15;
            class195 var17;
            if (arg0 == 0) {
                var15 = 8791798054912L;
                var17 = class114.field1750;
            } else {
                var15 = (long) class20.field239[var14] << 32;
                var17 = field3592[class20.field239[var14]];
            }
            if (var17 != null && var17.method455(125)) {
                int var18 = var17.method696((byte) 117);
                if (arg0 == 0 || arg0 == var18) {
                    var17.field1477 = true;
                    var17.field2942 = false;
                    if ((class97.field1467 && class56.field706 > 200 || class56.field706 > 50) && arg0 != 0 && var17.field1507 == var17.method699(0).field3597) {
                        var17.field2942 = true;
                    }
                    if (var18 == 1) {
                        if ((var17.field1566 & 0x7F) == 64 && (var17.field1505 & 0x7F) == 64) {
                            int var19 = var17.field1566 >> 7;
                            int var20 = var17.field1505 >> 7;
                            if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                                continue;
                            }
                            if (class206.field3104[var19][var20] > 1) {
                                var10002 = class206.field3104[var19][var20]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var17.field1566 & 0x7F) == 0 && (var17.field1505 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var17.field1566 & 0x7F) == 64 && (var17.field1505 & 0x7F) == 0) {
                        int var21 = var17.field1566 - (var18 * 64) >> 7;
                        int var22 = var17.field1505 - (var18 * 64) >> 7;
                        int var23 = var18 + var21;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        int var24 = var18 + var22;
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        boolean var25 = true;
                        for (int var26 = var21; var26 < var23; var26++) {
                            for (int var27 = var22; var27 < var24; var27++) {
                                if (class206.field3104[var26][var27] <= 1) {
                                    var25 = false;
                                    break;
                                }
                            }
                        }
                        if (var25) {
                            int var28 = var21;
                            while (true) {
                                if (var23 <= var28) {
                                    continue label230;
                                }
                                for (int var29 = var22; var29 < var24; var29++) {
                                    var10002 = class206.field3104[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var17.field1517 == null || var17.field1542 > class304.field4641 || class304.field4641 >= var17.field1528) {
                        var17.field1477 = false;
                        var17.field1497 = class74.method473(var17.field1505, var17.field1566, 64, class180.field2697);
                        class309.method2136(class180.field2697, var17.field1566, var17.field1505, var17.field1497, (var18 - 1) * 64 + 60, var17, var17.field1470, var15, var17.field1510);
                    } else {
                        var17.field2942 = false;
                        var17.field1477 = false;
                        var17.field1497 = class74.method473(var17.field1505, var17.field1566, 64, class180.field2697);
                        class269.method1890(class180.field2697, var17.field1566, var17.field1505, var17.field1497, var17, var17.field1470, var15, var17.field1544, var17.field1560, var17.field1564, var17.field1479);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 275)
    public static void method1633(int arg0) {
        field3585 = (class221[][][]) null;
        field3592 = null;
        field3591 = null;
        field3595 = null;
        if (arg0 != 30305) {
            field3589 = -32;
        }
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 292)
    public static final void method1634(int arg0) {
        field3590++;
        class68.method453(0);
        class292.method2048(9040);
        class296.method2064(-24177);
        if (arg0 <= 80) {
            field3585 = (class221[][][]) ((class221[][][]) null);
        }
        class217.method1493(39);
        class188.method1284(true);
        class161.method1144((byte) -118);
        class253.method1709((byte) 116);
        class224.method1567(false);
        class48.method334((byte) -33);
        class225.method1568(128);
        class3.method5((byte) -60);
        class116.method795(-26897);
        class309.method2138(113);
        class285.method1987(16);
        class87.method604((byte) -73);
        class66.method435((byte) -119);
        if (class21.field259 != 0) {
            for (int var1 = 0; var1 < class268.field4111.length; var1++) {
                class268.field4111[var1] = null;
            }
            class265.field4059 = 0;
        }
        class153.method1098(0);
        class299.method2080(12);
        class211.field3215.method2182(false);
        if (!class117.field1817) {
            ((class292) class148.field2233).method2043(105);
        }
        class123.field1920.method1677(false);
        class206.field3102.method1435((byte) 118);
        class213.field3228.method1435((byte) 118);
        class226.field3451.method1435((byte) 118);
        class113.field1744.method1435((byte) 118);
        class222.field3389.method1435((byte) 118);
        class48.field613.method1435((byte) 118);
        class9.field76.method1435((byte) 118);
        class68.field898.method1435((byte) 118);
        class81.field1142.method1435((byte) 118);
        class70.field925.method1435((byte) 118);
        class125.field1966.method1435((byte) 118);
        class13.field146.method2182(false);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 354)
    public class241() {
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIILla;ZZIII)V", line = 358)
    public static final void method1635(int arg0, int arg1, int arg2, int arg3, int arg4, class191 arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3594++;
        if (arg7 && !class80.method540(-87) && (class179.field2645[0][arg4][arg9] & 0x2) == 0) {
            if ((class179.field2645[arg2][arg4][arg9] & 0x10) != 0) {
                return;
            }
            if (class38.method264(arg9, arg2, arg3 ^ 0x7A5C, arg4) != class54.field675) {
                return;
            }
        }
        if (arg2 < class311.field4736) {
            class311.field4736 = arg2;
        }
        class22 var11 = class284.method1980(arg0, (byte) 96);
        if (class117.field1817 && var11.field270) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var12 = var11.field330;
            var13 = var11.field293;
        } else {
            var12 = var11.field293;
            var13 = var11.field330;
        }
        int var14;
        int var15;
        if ((arg4 + var13) <= 104) {
            var14 = (var13 >> 1) + arg4;
            var15 = arg4 + (var13 + 1 >> 1);
        } else {
            var15 = arg4 + 1;
            var14 = arg4;
        }
        int var16;
        int var17;
        if (arg9 + var12 > 104) {
            var16 = arg9;
            var17 = arg9 + 1;
        } else {
            var16 = arg9 + (var12 >> 1);
            var17 = (var12 + 1 >> 1) + arg9;
        }
        int[][] var18 = class294.field4502[arg10];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        if (arg3 != 31325) {
            return;
        }
        int var20 = (arg4 << 7) + (var13 << 6);
        int var21 = (arg9 << 7) + (var12 << 6);
        int var22 = 0;
        if (class117.field1817 && arg10 != 0) {
            int[][] var23 = class294.field4502[0];
            var22 = var19 - (var23[var14][var16] - (-var23[var15][var16] - (var23[var14][var17] + var23[var15][var17])) >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg4 | 0x40000000 | arg9 << 7 | arg8 << 14 | arg1 << 20);
        if (arg6) {
            var24 = class55.field690[0];
        } else if (arg10 < 3) {
            var24 = class294.field4502[arg10 + 1];
        }
        if (var11.field323 == 0 || arg6) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field274 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field268) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg0 << 32;
        if (var11.method146(-75)) {
            class5.method10(arg1, (byte) -128, arg4, (class195) null, arg9, arg2, var11, (class69) null);
        }
        boolean var29 = var11.field345 & !arg6;
        if (arg8 == 22) {
            if (class170.field2549 || var11.field323 != 0 || var11.field332 == 1 || var11.field324) {
                class233 var77;
                if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                    class245 var76 = var11.method145(22, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1, var29, var21);
                    if (class117.field1817 && var29) {
                        class32.method224(var76.field3655, var20, var22, var21);
                    }
                    var77 = var76.field3649;
                } else {
                    var77 = new class17(arg0, 22, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
                }
                class265.method1864(arg2, arg4, arg9, var19, var77, var27, var11.field266);
                if (var11.field332 == 1 && arg5 != null) {
                    arg5.method1317(false, arg4, arg9);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class233 var71;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var70 = var11.method145(10, arg7, var20, -9367, var24, (class59) null, var19, var18, arg8 == 11 ? arg1 + 4 : arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var70.field3655, var20, var22, var21);
                }
                var71 = var70.field3649;
            } else {
                var71 = new class17(arg0, 10, arg8 == 11 ? arg1 + 4 : arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            if (var71 != null) {
                boolean var72 = class169.method1179(arg2, arg4, arg9, var19, var13, var12, var71, 0, var27);
                if (var11.field288 && var72 && arg7) {
                    int var73 = 15;
                    if (var71 instanceof class100) {
                        var73 = ((class100) var71).method506() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class212.field3225[arg2][arg4 + var74][arg9 + var75] < var73) {
                                class212.field3225[arg2][arg4 + var74][arg9 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1315(arg9, arg4, var12, (byte) -38, var11.field301, var13);
            }
        } else if (arg8 >= 12) {
            class233 var69;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var68 = var11.method145(arg8, arg7, var20, arg3 - 40692, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var68.field3655, var20, var22, var21);
                }
                var69 = var68.field3649;
            } else {
                var69 = new class17(arg0, arg8, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class169.method1179(arg2, arg4, arg9, var19, 1, 1, var69, 0, var27);
            if (arg7 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0) {
                class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 4);
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1315(arg9, arg4, var12, (byte) -38, var11.field301, var13);
            }
        } else if (arg8 == 0) {
            class233 var31;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var30 = var11.method145(0, arg7, var20, arg3 - 40692, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var30.field3655, var20, var22, var21);
                }
                var31 = var30.field3649;
            } else {
                var31 = new class17(arg0, 0, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class224.method1562(arg2, arg4, arg9, var19, var31, (class233) null, class40.field483[arg1], 0, var27);
            if (arg7) {
                if (arg1 == 0) {
                    if (var11.field288) {
                        class212.field3225[arg2][arg4][arg9] = 50;
                        class212.field3225[arg2][arg4][arg9 + 1] = 50;
                    }
                    if (var11.field339) {
                        class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field288) {
                        class212.field3225[arg2][arg4][arg9 + 1] = 50;
                        class212.field3225[arg2][arg4 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field339) {
                        class22.field337[arg2][arg4][arg9 + 1] = class140.method1009(class22.field337[arg2][arg4][arg9 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field288) {
                        class212.field3225[arg2][arg4 + 1][arg9] = 50;
                        class212.field3225[arg2][arg4 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field339) {
                        class22.field337[arg2][arg4 + 1][arg9] = class140.method1009(class22.field337[arg2][arg4 + 1][arg9], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field288) {
                        class212.field3225[arg2][arg4][arg9] = 50;
                        class212.field3225[arg2][arg4 + 1][arg9] = 50;
                    }
                    if (var11.field339) {
                        class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 2);
                    }
                }
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1301(arg4, arg8, (byte) 116, arg1, var11.field301, arg9);
            }
            if (var11.field343 != 16) {
                class69.method459(arg2, arg4, arg9, var11.field343);
            }
        } else if (arg8 == 1) {
            class233 var67;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var66 = var11.method145(1, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var66.field3655, var20, var22, var21);
                }
                var67 = var66.field3649;
            } else {
                var67 = new class17(arg0, 1, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class224.method1562(arg2, arg4, arg9, var19, var67, (class233) null, class267.field4106[arg1], 0, var27);
            if (var11.field288 && arg7) {
                if (arg1 == 0) {
                    class212.field3225[arg2][arg4][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class212.field3225[arg2][arg4 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class212.field3225[arg2][arg4 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class212.field3225[arg2][arg4][arg9] = 50;
                }
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1301(arg4, arg8, (byte) 115, arg1, var11.field301, arg9);
            }
        } else if (arg8 == 2) {
            int var32 = arg1 + 1 & 0x3;
            class233 var34;
            class233 var36;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var33 = var11.method145(2, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1 + 4, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var33.field3655, var20, var22, var21);
                }
                var34 = var33.field3649;
                class245 var35 = var11.method145(2, arg7, var20, -9367, var24, (class59) null, var19, var18, var32, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var35.field3655, var20, var22, var21);
                }
                var36 = var35.field3649;
            } else {
                var34 = new class17(arg0, 2, arg1 + 4, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
                var36 = new class17(arg0, 2, var32, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class224.method1562(arg2, arg4, arg9, var19, var34, var36, class40.field483[arg1], class40.field483[var32], var27);
            if (var11.field339 && arg7) {
                if (arg1 == 0) {
                    class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 1);
                    class22.field337[arg2][arg4][arg9 + 1] = class140.method1009(class22.field337[arg2][arg4][arg9 + 1], 2);
                } else if (arg1 == 1) {
                    class22.field337[arg2][arg4][arg9 + 1] = class140.method1009(class22.field337[arg2][arg4][arg9 + 1], 2);
                    class22.field337[arg2][arg4 + 1][arg9] = class140.method1009(class22.field337[arg2][arg4 + 1][arg9], 1);
                } else if (arg1 == 2) {
                    class22.field337[arg2][arg4 + 1][arg9] = class140.method1009(class22.field337[arg2][arg4 + 1][arg9], 1);
                    class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 2);
                } else if (arg1 == 3) {
                    class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 2);
                    class22.field337[arg2][arg4][arg9] = class140.method1009(class22.field337[arg2][arg4][arg9], 1);
                }
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1301(arg4, arg8, (byte) 125, arg1, var11.field301, arg9);
            }
            if (var11.field343 != 16) {
                class69.method459(arg2, arg4, arg9, var11.field343);
            }
        } else if (arg8 == 3) {
            class233 var65;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var64 = var11.method145(3, arg7, var20, arg3 - 40692, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var64.field3655, var20, var22, var21);
                }
                var65 = var64.field3649;
            } else {
                var65 = new class17(arg0, 3, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class224.method1562(arg2, arg4, arg9, var19, var65, (class233) null, class267.field4106[arg1], 0, var27);
            if (var11.field288 && arg7) {
                if (arg1 == 0) {
                    class212.field3225[arg2][arg4][arg9 + 1] = 50;
                } else if (arg1 == 1) {
                    class212.field3225[arg2][arg4 + 1][arg9 + 1] = 50;
                } else if (arg1 == 2) {
                    class212.field3225[arg2][arg4 + 1][arg9] = 50;
                } else if (arg1 == 3) {
                    class212.field3225[arg2][arg4][arg9] = 50;
                }
            }
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1301(arg4, arg8, (byte) 120, arg1, var11.field301, arg9);
            }
        } else if (arg8 == 9) {
            class233 var63;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var62 = var11.method145(arg8, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var62.field3655, var20, var22, var21);
                }
                var63 = var62.field3649;
            } else {
                var63 = new class17(arg0, arg8, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class169.method1179(arg2, arg4, arg9, var19, 1, 1, var63, 0, var27);
            if (var11.field332 != 0 && arg5 != null) {
                arg5.method1315(arg9, arg4, var12, (byte) -38, var11.field301, var13);
            }
            if (var11.field343 != 16) {
                class69.method459(arg2, arg4, arg9, var11.field343);
            }
        } else if (arg8 == 4) {
            class233 var61;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var60 = var11.method145(4, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var60.field3655, var20, var22, var21);
                }
                var61 = var60.field3649;
            } else {
                var61 = new class17(arg0, 4, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class30.method192(arg2, arg4, arg9, var19, var61, (class233) null, class40.field483[arg1], 0, 0, 0, var27);
        } else if (arg8 == 5) {
            long var37 = class179.method1237(arg2, arg4, arg9);
            int var39 = 16;
            if (var37 != 0L) {
                var39 = class284.method1980((int) (var37 >>> 32) & Integer.MAX_VALUE, (byte) 112).field343;
            }
            class233 var41;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var40 = var11.method145(4, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var40.field3655, var20 - (class299.field4564[arg1] * 8), var22, var21 - (class40.field478[arg1] * 8));
                }
                var41 = var40.field3649;
            } else {
                var41 = new class17(arg0, 4, arg1, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class30.method192(arg2, arg4, arg9, var19, var41, (class233) null, class40.field483[arg1], 0, class299.field4564[arg1] * var39, class40.field478[arg1] * var39, var27);
        } else if (arg8 == 6) {
            int var55 = 8;
            long var56 = class179.method1237(arg2, arg4, arg9);
            if (var56 != 0L) {
                var55 = class284.method1980(Integer.MAX_VALUE & (int) (var56 >>> 32), (byte) 110).field343 / 2;
            }
            class233 var59;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var58 = var11.method145(4, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1 + 4, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var58.field3655, var20 - (class75.field970[arg1] * 8), var22, var21 - (class30.field400[arg1] * 8));
                }
                var59 = var58.field3649;
            } else {
                var59 = new class17(arg0, 4, arg1 + 4, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class30.method192(arg2, arg4, arg9, var19, var59, (class233) null, 256, arg1, class75.field970[arg1] * var55, class30.field400[arg1] * var55, var27);
        } else if (arg8 == 7) {
            int var42 = arg1 + 2 & 0x3;
            class233 var44;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                class245 var43 = var11.method145(4, arg7, var20, -9367, var24, (class59) null, var19, var18, var42 + 4, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var43.field3655, var20, var22, var21);
                }
                var44 = var43.field3649;
            } else {
                var44 = new class17(arg0, 4, var42 + 4, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class30.method192(arg2, arg4, arg9, var19, var44, (class233) null, 256, var42, 0, 0, var27);
        } else if (arg8 == 8) {
            int var45 = 8;
            long var46 = class179.method1237(arg2, arg4, arg9);
            if (var46 != 0L) {
                var45 = class284.method1980(Integer.MAX_VALUE & (int) (var46 >>> 32), (byte) 115).field343 / 2;
            }
            int var48 = arg1 + 2 & 0x3;
            class233 var52;
            class233 var54;
            if (var11.field328 == -1 && var11.field336 == null && !var11.field278) {
                int var49 = class30.field400[arg1] * 8;
                int var50 = class75.field970[arg1] * 8;
                class245 var51 = var11.method145(4, arg7, var20, -9367, var24, (class59) null, var19, var18, arg1 + 4, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var51.field3655, var20 - var50, var22, var21 - var49);
                }
                var52 = var51.field3649;
                class245 var53 = var11.method145(4, arg7, var20, arg3 ^ 0xFFFFA134, var24, (class59) null, var19, var18, var48 + 4, var29, var21);
                if (class117.field1817 && var29) {
                    class32.method224(var53.field3655, var20 - var50, var22, var21 - var49);
                }
                var54 = var53.field3649;
            } else {
                var52 = new class17(arg0, 4, arg1 + 4, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
                var54 = new class17(arg0, 4, var48 + 4, arg10, arg4, arg9, var11.field328, var11.field344, (class233) null);
            }
            class30.method192(arg2, arg4, arg9, var19, var52, var54, 256, arg1, class75.field970[arg1] * var45, class30.field400[arg1] * var45, var27);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1011)
    public class241(String arg0) {
        this.field3586 = arg0;
    }
}
