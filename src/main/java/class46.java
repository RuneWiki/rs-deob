import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class46 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "B")
    private byte field766;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lsb;")
    private static class98 field771 = class47.method368("Close", 0);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[[S")
    public static short[][] field772 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lsb;")
    public static class98 field775 = field771;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Lsb;")
    public static class98 field769 = class47.method368("<)4col> x", 0);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lca;")
    public static class102 field774;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
    public final int method361(byte arg0) {
        field768++;
        return arg0 > -78 ? 109 : this.field766 & 0x7;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method362(int arg0) {
        field776++;
        if (class222.field3824 == 227) {
            int var1 = class144.field2536.method1480(-121);
            int var2 = (var1 & 0x7) + class251.field4398;
            int var3 = ((var1 & 0x72) >> 4) + class153.field2802;
            int var4 = class144.field2536.method1446(arg0 ^ 0xAD1);
            int var5 = var4 >> 2;
            int var6 = class76.field1358[var5];
            int var7 = var4 & 0x3;
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                class92.method678(var7, -1, var3, var5, var2, true, var6, 0, -1, class265.field4640);
            }
            return;
        }
        if (arg0 != 7735) {
            field775 = null;
        }
        if (class222.field3824 == 83) {
            int var8 = class144.field2536.method1446(5350);
            int var9 = (var8 & 0xF) + class251.field4398 * 2;
            int var10 = (var8 >> 4 & 0xF) + class153.field2802 * 2;
            int var11 = var10 + class144.field2536.method1472(92);
            int var12 = class144.field2536.method1472(arg0 ^ 0x1E4B) + var9;
            int var13 = class144.field2536.method1483(-126);
            int var14 = class144.field2536.method1487(66);
            int var15 = class144.field2536.method1446(5350) * 4;
            int var16 = class144.field2536.method1446(5350) * 4;
            int var17 = class144.field2536.method1487(104);
            int var18 = class144.field2536.method1487(112);
            int var19 = class144.field2536.method1446(arg0 - 2385);
            int var20 = class144.field2536.method1446(5350);
            if (var10 >= 0 && var9 >= 0 && var10 < 208 && var9 < 208 && var11 >= 0 && var12 >= 0 && var11 < 208 && var12 < 208 && var14 != 65535) {
                int var21 = var11 * 64;
                int var22 = var10 * 64;
                int var23 = var12 * 64;
                int var24 = var9 * 64;
                class76 var25 = new class76(var14, class265.field4640, var22, var24, class70.method480(class265.field4640, (byte) 126, var22, var24) - var15, class236.field4071 + var17, var18 + class236.field4071, var19, var20, var13, var16);
                var25.method586(var21, var23, -71, class236.field4071 + var17, -var16 + class70.method480(class265.field4640, (byte) 126, var21, var23));
                class64.field1048.method376((byte) 13, new class124(var25));
            }
        } else if (class222.field3824 == 76) {
            int var26 = class144.field2536.method1446(5350);
            int var27 = class153.field2802 + (var26 >> 4 & 0x7);
            int var28 = (var26 & 0x7) + class251.field4398;
            int var29 = class144.field2536.method1475((byte) 53);
            int var30 = class144.field2536.method1475((byte) -111);
            int var31 = class144.field2536.method1487(arg0 ^ 0x1E4C);
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && class234.field4046 != var30) {
                class9 var32 = new class9();
                var32.field201 = var29;
                var32.field202 = var31;
                if (class115.field2050[class265.field4640][var27][var28] == null) {
                    class115.field2050[class265.field4640][var27][var28] = new class48();
                }
                class115.field2050[class265.field4640][var27][var28].method376((byte) 13, new class194(var32));
                class43.method344(var28, arg0 ^ 0x1E36, var27);
            }
        } else if (class222.field3824 == 16) {
            int var33 = class144.field2536.method1446(5350);
            int var34 = class153.field2802 + ((var33 & 0x70) >> 4);
            int var35 = class251.field4398 + (var33 & 0x7);
            int var36 = class144.field2536.method1487(arg0 ^ 0x1E16);
            int var37 = class144.field2536.method1446(arg0 ^ 0xAD1);
            int var38 = class144.field2536.method1487(100);
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                int var39 = var34 * 128 + 64;
                int var40 = var35 * 128 + 64;
                class233 var41 = new class233(var36, class265.field4640, var39, var40, class70.method480(class265.field4640, (byte) 126, var39, var40) - var37, var38, class236.field4071);
                class135.field2387.method376((byte) 13, new class182(var41));
            }
        } else if (class222.field3824 == 68) {
            int var42 = class144.field2536.method1478(-127);
            int var43 = class144.field2536.method1487(20);
            int var44 = class144.field2536.method1480(arg0 ^ 0xFFFFE1BC);
            int var45 = class251.field4398 + (var44 & 0x7);
            int var46 = (var44 >> 4 & 0x7) + class153.field2802;
            if (var46 >= 0 && var45 >= 0 && var46 < 104 && var45 < 104) {
                class9 var47 = new class9();
                var47.field202 = var42;
                var47.field201 = var43;
                if (class115.field2050[class265.field4640][var46][var45] == null) {
                    class115.field2050[class265.field4640][var46][var45] = new class48();
                }
                class115.field2050[class265.field4640][var46][var45].method376((byte) 13, new class194(var47));
                class43.method344(var45, 1, var46);
            }
        } else if (class222.field3824 == 94) {
            int var48 = class144.field2536.method1446(5350);
            int var49 = (var48 & 0x7) + class251.field4398;
            int var50 = ((var48 & 0x7B) >> 4) + class153.field2802;
            int var51 = class144.field2536.method1487(106);
            if (var50 >= 0 && var49 >= 0 && var50 < 104 && var49 < 104) {
                class48 var52 = class115.field2050[class265.field4640][var50][var49];
                if (var52 != null) {
                    for (class194 var53 = (class194) var52.method371((byte) 61); var53 != null; var53 = (class194) var52.method370(true)) {
                        if ((var51 & 0x7FFF) == var53.field3362.field201) {
                            var53.method1611((byte) -125);
                            break;
                        }
                    }
                    if (var52.method371((byte) 61) == null) {
                        class115.field2050[class265.field4640][var50][var49] = null;
                    }
                    class43.method344(var49, arg0 ^ 0x1E36, var50);
                }
            }
        } else if (class222.field3824 == 43) {
            int var54 = class144.field2536.method1487(27);
            int var55 = class144.field2536.method1446(5350);
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = class76.field1358[var56];
            int var59 = class144.field2536.method1471(4);
            if (var54 == 65535) {
                var54 = -1;
            }
            int var60 = class153.field2802 + (var59 >> 4 & 0x7);
            int var61 = (var59 & 0x7) + class251.field4398;
            class145.method1075(var61, var57, var54, var58, class265.field4640, var60, 1, var56);
        } else if (class222.field3824 == 145) {
            int var62 = class144.field2536.method1446(5350);
            int var63 = var62 >> 2;
            int var64 = class76.field1358[var63];
            int var65 = var62 & 0x3;
            int var66 = class144.field2536.method1475((byte) -114);
            int var67 = class144.field2536.method1480(-117);
            int var68 = class153.field2802 + ((var67 & 0x75) >> 4);
            int var69 = (var67 & 0x7) + class251.field4398;
            if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                class92.method678(var65, -1, var68, var63, var69, true, var64, 0, var66, class265.field4640);
            }
        } else if (class222.field3824 == 184) {
            int var70 = class144.field2536.method1446(5350);
            int var71 = ((var70 & 0x71) >> 4) + class153.field2802;
            int var72 = class251.field4398 + (var70 & 0x7);
            int var73 = class144.field2536.method1472(118) + var71;
            int var74 = var72 + class144.field2536.method1472(73);
            int var75 = class144.field2536.method1483(-107);
            int var76 = class144.field2536.method1487(106);
            int var77 = class144.field2536.method1446(arg0 - 2385) * 4;
            int var78 = class144.field2536.method1446(arg0 ^ 0xAD1) * 4;
            int var79 = class144.field2536.method1487(97);
            int var80 = class144.field2536.method1487(74);
            int var81 = class144.field2536.method1446(5350);
            int var82 = class144.field2536.method1446(5350);
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var76 != 65535) {
                int var83 = var72 * 128 + 64;
                int var84 = var74 * 128 + 64;
                int var85 = var73 * 128 + 64;
                int var86 = var71 * 128 + 64;
                class76 var87 = new class76(var76, class265.field4640, var86, var83, class70.method480(class265.field4640, (byte) 126, var86, var83) - var77, var79 - -class236.field4071, class236.field4071 + var80, var81, var82, var75, var78);
                var87.method586(var85, var84, 62, class236.field4071 + var79, class70.method480(class265.field4640, (byte) 126, var85, var84) - var78);
                class64.field1048.method376((byte) 13, new class124(var87));
            }
        } else if (class222.field3824 == 110) {
            int var88 = class144.field2536.method1446(arg0 ^ 0xAD1);
            int var89 = (var88 >> 4 & 0x7) + class153.field2802;
            int var90 = (var88 & 0x7) + class251.field4398;
            int var91 = class144.field2536.method1487(28);
            int var92 = class144.field2536.method1446(5350);
            if (var91 == 65535) {
                var91 = -1;
            }
            int var93 = (var92 & 0xF9) >> 4;
            int var94 = class144.field2536.method1446(5350);
            int var95 = var92 & 0x7;
            if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                int var96 = var93 + 1;
                if ((var89 - var96) <= class163.field2943.field4501[0] && class163.field2943.field4501[0] <= (var89 + var96) && var90 - var96 <= class163.field2943.field4491[0] && class163.field2943.field4491[0] <= (var90 + var96) && class90.field1585 != 0 && var95 > 0 && class105.field1866 < 50 && var91 != -1) {
                    class181.field3120[class105.field1866] = var91;
                    class226.field3898[class105.field1866] = var95;
                    class211.field3617[class105.field1866] = var94;
                    class75.field1320[class105.field1866] = null;
                    class148.field2706[class105.field1866] = (var89 << 16) + var93 + (var90 << 8);
                    class105.field1866++;
                }
            }
        } else if (class222.field3824 == 214) {
            int var97 = class144.field2536.method1446(5350);
            int var98 = (var97 >> 4 & 0x7) + class153.field2802;
            int var99 = (var97 & 0x7) + class251.field4398;
            int var100 = class144.field2536.method1487(arg0 - 7685);
            int var101 = class144.field2536.method1487(110);
            int var102 = class144.field2536.method1487(arg0 - 7658);
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                class48 var103 = class115.field2050[class265.field4640][var98][var99];
                if (var103 != null) {
                    for (class194 var104 = (class194) var103.method371((byte) 61); var104 != null; var104 = (class194) var103.method370(true)) {
                        class9 var105 = var104.field3362;
                        if ((var100 & 0x7FFF) == var105.field201 && var105.field202 == var101) {
                            var105.field202 = var102;
                            break;
                        }
                    }
                    class43.method344(var99, 1, var98);
                }
            }
        } else if (class222.field3824 == 97) {
            int var106 = class144.field2536.method1487(109);
            int var107 = class144.field2536.method1443(4);
            int var108 = var107 >> 2;
            int var109 = var107 & 0x3;
            int var110 = class76.field1358[var108];
            byte var111 = class144.field2536.method1455(arg0 ^ 0x1E54);
            int var112 = class144.field2536.method1478(-98);
            int var113 = class144.field2536.method1487(28);
            int var114 = class144.field2536.method1480(-117);
            int var115 = (var114 >> 4 & 0x7) + class153.field2802;
            int var116 = class251.field4398 + (var114 & 0x7);
            int var117 = class144.field2536.method1475((byte) 125);
            byte var118 = class144.field2536.method1472(77);
            byte var119 = class144.field2536.method1455(arg0 ^ 0x1E68);
            byte var120 = class144.field2536.method1472(65);
            class192 var121;
            if (class234.field4046 == var117) {
                var121 = class163.field2943;
            } else {
                var121 = class141.field2499[var117];
            }
            if (var121 != null) {
                class21 var122 = class125.method929(var112, (byte) -122);
                int var123;
                int var124;
                if (var109 == 1 || var109 == 3) {
                    var124 = var122.field398;
                    var123 = var122.field397;
                } else {
                    var123 = var122.field398;
                    var124 = var122.field397;
                }
                int var125 = var115 + (var123 + 1 >> 1);
                int var126 = (var124 >> 1) + var116;
                int var127 = (var124 + 1 >> 1) + var116;
                int[][] var128 = class78.field1393[class265.field4640];
                int var129 = var115 + (var123 >> 1);
                int var130 = var128[var125][var126] + var128[var129][var126] + var128[var125][var127] + var128[var129][var127] >> 2;
                int[][] var131 = null;
                if (class265.field4640 < 3) {
                    var131 = class78.field1393[class265.field4640 + 1];
                }
                int var132 = (var116 << 7) + (var124 << 6);
                int var133 = (var115 << 7) + (var123 << 6);
                class122 var134 = var122.method232(false, var109, var128, var133, var122.field422, -8188, var132, var108, var131, var130, (class24) null);
                if (var134 != null) {
                    if (var111 > var120) {
                        byte var135 = var111;
                        var111 = var120;
                        var120 = var135;
                    }
                    if (var118 < var119) {
                        byte var136 = var119;
                        var119 = var118;
                        var118 = var136;
                    }
                    class92.method678(0, var106 + 1, var115, 0, var116, true, var110, var113 + 1, -1, class265.field4640);
                    var121.field3347 = var130;
                    var121.field3326 = var116 + var119;
                    var121.field3340 = var116 + var118;
                    var121.field3334 = var115 * 128 + var123 * 64;
                    var121.field3329 = var113 + class236.field4071;
                    var121.field3356 = var116 * 128 + (var124 * 64);
                    var121.field3350 = (class17) var134.field2241;
                    var121.field3341 = var115 + var120;
                    var121.field3331 = var111 + var115;
                    var121.field3327 = class236.field4071 + var106;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I")
    public final int method363(int arg0) {
        if (arg0 != 8) {
            field774 = null;
        }
        field767++;
        return (this.field766 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public static void method364(byte arg0) {
        field772 = null;
        field775 = null;
        field774 = null;
        field771 = null;
        if (arg0 >= -52) {
            method365((class24[]) null, (class24[]) null, (class24[]) null, (class24[]) null, (byte) 38, (class75) null, (class247[]) null);
        }
        field769 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([Lqh;[Lqh;[Lqh;[Lqh;BLtg;[Lkb;)V")
    public static final void method365(class24[] arg0, class24[] arg1, class24[] arg2, class24[] arg3, byte arg4, class75 arg5, class247[] arg6) {
        class2.field15 = arg5;
        field773++;
        class110.field1960 = arg2;
        class192.field3357 = arg6;
        class115.field2069 = arg3;
        class84.field1476 = arg1;
        class134.field2375 = arg0;
        class93.field1623.method382(false);
        int var7 = class2.field15.method564(class194.field3363, -14783);
        int[] var8 = class2.field15.method554(0, var7);
        if (arg4 != 73) {
            method365((class24[]) null, (class24[]) null, (class24[]) null, (class24[]) null, (byte) -3, (class75) null, (class247[]) null);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            class93.field1623.method376((byte) 13, class135.method1015((byte) -30, new class216(class2.field15.method571(var7, var8[var9], -76))));
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class46() {
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Llj;)V")
    public class46(class216 arg0) {
        this.field766 = arg0.method1472(70);
        this.field770 = arg0.method1487(47);
        this.field780 = arg0.method1442(-1330139880);
        this.field765 = arg0.method1442(-1330139880);
        this.field779 = arg0.method1442(-1330139880);
        this.field777 = arg0.method1442(-1330139880);
    }
}
