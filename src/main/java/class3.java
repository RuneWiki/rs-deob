import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lai;")
    public static class10 field19 = class44.method278("Update)2Liste geladen)3", 100);

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lai;")
    private static class10 field25 = class44.method278("Loaded fonts", 116);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lai;")
    public static class10 field20 = field25;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lai;")
    private static class10 field23 = class44.method278("Loading title screen )2 ", -52);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lai;")
    public static class10 field27 = class44.method278("<col=ff3000>", 102);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lai;")
    public static class10 field21 = field23;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Lai;")
    public static class10 field28 = class44.method278("Der Server wird gerade aktualisiert)3", -26);

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lai;")
    public static class10 field30 = null;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
    public static boolean field24;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method8(int arg0) {
        field22++;
        if (arg0 < 7) {
            return;
        }
        if (class98.field1818 == 189) {
            int var1 = class74.field1273.method767(true);
            int var2 = class128.field2431 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class84.field1459;
            int var4 = class74.field1273.method762((byte) 115);
            int var5 = class74.field1273.method762((byte) 78);
            int var6 = class74.field1273.method762((byte) 93);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class192 var7 = class33.field508[class42.field687][var2][var3];
                if (var7 != null) {
                    for (class42 var8 = (class42) var7.method1223(true); var8 != null; var8 = (class42) var7.method1226((byte) -57)) {
                        if ((var4 & 0x7FFF) == var8.field694 && var8.field684 == var5) {
                            var8.field684 = var6;
                            break;
                        }
                    }
                    class130.method906(var3, var2, -24639);
                }
            }
        } else if (class98.field1818 == 194) {
            int var9 = class74.field1273.method780(10664);
            int var10 = class74.field1273.method767(true);
            int var11 = (var10 >> 4 & 0x7) + class128.field2431;
            int var12 = (var10 & 0x7) + class84.field1459;
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class192 var13 = class33.field508[class42.field687][var11][var12];
                if (var13 != null) {
                    for (class42 var14 = (class42) var13.method1223(true); var14 != null; var14 = (class42) var13.method1226((byte) -57)) {
                        if ((var9 & 0x7FFF) == var14.field694) {
                            var14.method848(false);
                            break;
                        }
                    }
                    if (var13.method1223(true) == null) {
                        class33.field508[class42.field687][var11][var12] = null;
                    }
                    class130.method906(var12, var11, -24639);
                }
            }
        } else {
            if (class98.field1818 == 21) {
                int var15 = class74.field1273.method767(true);
                int var16 = class128.field2431 + (var15 >> 4 & 0x7);
                int var17 = class84.field1459 + (var15 & 0x7);
                int var18 = class74.field1273.method762((byte) 98);
                int var19 = class74.field1273.method767(true);
                int var20 = var19 >> 4 & 0xF;
                int var21 = var19 & 0x7;
                int var22 = class74.field1273.method767(true);
                if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                    int var23 = var20 + 1;
                    if (class145.field2767.field1099[0] >= var16 - var23 && class145.field2767.field1099[0] <= var16 + var23 && class145.field2767.field1106[0] >= var17 - var23 && class145.field2767.field1106[0] <= var17 + var23 && class120.field2317 != 0 && var21 > 0 && class135.field2540 < 50) {
                        class183.field3480[class135.field2540] = var18;
                        class176.field3373[class135.field2540] = var21;
                        class159.field3062[class135.field2540] = var22;
                        class139.field2625[class135.field2540] = null;
                        class169.field3267[class135.field2540] = (var17 << 8) + (var16 << 16) + var20;
                        class135.field2540++;
                    }
                }
            }
            if (class98.field1818 == 200) {
                int var24 = class74.field1273.method795(-1);
                int var25 = class74.field1273.method780(10664);
                int var26 = class74.field1273.method767(true);
                int var27 = class128.field2431 + (var26 >> 4 & 0x7);
                int var28 = (var26 & 0x7) + class84.field1459;
                int var29 = class74.field1273.method775(-128);
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && class78.field1370 != var25) {
                    class42 var30 = new class42();
                    var30.field684 = var24;
                    var30.field694 = var29;
                    if (class33.field508[class42.field687][var27][var28] == null) {
                        class33.field508[class42.field687][var27][var28] = new class192();
                    }
                    class33.field508[class42.field687][var27][var28].method1230(var30, true);
                    class130.method906(var28, var27, -24639);
                }
            } else if (class98.field1818 == 11) {
                int var31 = class74.field1273.method767(true);
                int var32 = (var31 >> 4 & 0x7) + class128.field2431;
                int var33 = class84.field1459 + (var31 & 0x7);
                int var34 = var32 + class74.field1273.method759((byte) 127);
                int var35 = class74.field1273.method759((byte) 127) + var33;
                int var36 = class74.field1273.method765(76);
                int var37 = class74.field1273.method762((byte) 101);
                int var38 = class74.field1273.method767(true) * 4;
                int var39 = class74.field1273.method767(true) * 4;
                int var40 = class74.field1273.method762((byte) 111);
                int var41 = class74.field1273.method762((byte) 74);
                int var42 = class74.field1273.method767(true);
                int var43 = class74.field1273.method767(true);
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104 && var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var37 != 65535) {
                    int var44 = var35 * 128 + 64;
                    int var45 = var33 * 128 + 64;
                    int var46 = var32 * 128 + 64;
                    int var47 = var34 * 128 + 64;
                    class153 var48 = new class153(var37, class42.field687, var46, var45, class145.method1003((byte) -105, var46, var45, class42.field687) - var38, class120.field2304 + var40, class120.field2304 + var41, var42, var43, var36, var39);
                    var48.method1038(var40 + class120.field2304, var47, var44, -119, class145.method1003((byte) -74, var47, var44, class42.field687) - var39);
                    class125.field2392.method1230(var48, true);
                }
            } else {
                if (class98.field1818 == 2) {
                    byte var49 = class74.field1273.method777(false);
                    int var50 = class74.field1273.method775(-109);
                    int var51 = class74.field1273.method775(-100);
                    int var52 = class74.field1273.method774(255);
                    int var53 = var52 & 0x3;
                    int var54 = var52 >> 2;
                    int var55 = class159.field3070[var54];
                    int var56 = class74.field1273.method774(255);
                    int var57 = (var56 >> 4 & 0x7) + class128.field2431;
                    int var58 = class84.field1459 + (var56 & 0x7);
                    byte var59 = class74.field1273.method759((byte) 127);
                    byte var60 = class74.field1273.method777(false);
                    byte var61 = class74.field1273.method777(false);
                    int var62 = class74.field1273.method775(-49);
                    int var63 = class74.field1273.method795(-1);
                    class38 var64;
                    if (class78.field1370 == var50) {
                        var64 = class145.field2767;
                    } else {
                        var64 = class2.field10[var50];
                    }
                    if (var64 != null) {
                        class47 var65 = class184.method1189(var62, 6);
                        int var66;
                        int var67;
                        if (var53 == 1 || var53 == 3) {
                            var66 = var65.field792;
                            var67 = var65.field804;
                        } else {
                            var66 = var65.field804;
                            var67 = var65.field792;
                        }
                        int var68 = (var66 >> 1) + var57;
                        int var69 = (var66 + 1 >> 1) + var57;
                        int var70 = (var67 >> 1) + var58;
                        int var71 = var58 + (var67 + 1 >> 1);
                        int[][] var72 = class186.field3556[class42.field687];
                        int var73 = (var57 << 7) + (var66 << 6);
                        int var74 = var72[var68][var70] + var72[var69][var70] + var72[var68][var71] + var72[var69][var71] >> 2;
                        int var75 = (var58 << 7) + (var67 << 6);
                        class164 var76 = var65.method291(var72, var75, var73, var74, var54, var53, 110);
                        if (var76 != null) {
                            class136.method928(0, class42.field687, var63 + 1, 0, var57, false, var51 + 1, -1, var58, var55);
                            var64.field610 = var76;
                            var64.field606 = var63 + class120.field2304;
                            var64.field615 = var58 * 128 + var67 * 64;
                            var64.field616 = class120.field2304 + var51;
                            var64.field611 = var74;
                            var64.field605 = var57 * 128 + var66 * 64;
                            if (var61 < var59) {
                                byte var77 = var59;
                                var59 = var61;
                                var61 = var77;
                            }
                            var64.field608 = var57 + var59;
                            if (var49 < var60) {
                                byte var78 = var60;
                                var60 = var49;
                                var49 = var78;
                            }
                            var64.field601 = var58 + var60;
                            var64.field598 = var49 + var58;
                            var64.field592 = var57 + var61;
                        }
                    }
                }
                if (class98.field1818 == 197) {
                    int var79 = class74.field1273.method801(-129);
                    int var80 = var79 >> 2;
                    int var81 = class159.field3070[var80];
                    int var82 = var79 & 0x3;
                    int var83 = class74.field1273.method774(255);
                    int var84 = class128.field2431 + (var83 >> 4 & 0x7);
                    int var85 = (var83 & 0x7) + class84.field1459;
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                        class136.method928(var80, class42.field687, -1, var82, var84, false, 0, -1, var85, var81);
                    }
                } else if (class98.field1818 == 67) {
                    int var86 = class74.field1273.method801(-129);
                    int var87 = (var86 & 0x7) + class84.field1459;
                    int var88 = class128.field2431 + (var86 >> 4 & 0x7);
                    int var89 = class74.field1273.method775(-103);
                    int var90 = class74.field1273.method795(-1);
                    if (var88 >= 0 && var87 >= 0 && var88 < 104 && var87 < 104) {
                        class42 var91 = new class42();
                        var91.field684 = var89;
                        var91.field694 = var90;
                        if (class33.field508[class42.field687][var88][var87] == null) {
                            class33.field508[class42.field687][var88][var87] = new class192();
                        }
                        class33.field508[class42.field687][var88][var87].method1230(var91, true);
                        class130.method906(var87, var88, -24639);
                    }
                } else if (class98.field1818 == 202) {
                    int var92 = class74.field1273.method762((byte) 100);
                    int var93 = class74.field1273.method801(-129);
                    int var94 = var93 >> 2;
                    int var95 = var93 & 0x3;
                    int var96 = class159.field3070[var94];
                    int var97 = class74.field1273.method806(0);
                    int var98 = (var97 >> 4 & 0x7) + class128.field2431;
                    int var99 = (var97 & 0x7) + class84.field1459;
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                        class136.method928(var94, class42.field687, -1, var95, var98, false, 0, var92, var99, var96);
                    }
                } else if (class98.field1818 == 114) {
                    int var100 = class74.field1273.method767(true);
                    int var101 = (var100 & 0x7) + class84.field1459;
                    int var102 = class128.field2431 + (var100 >> 4 & 0x7);
                    int var103 = class74.field1273.method762((byte) 106);
                    int var104 = class74.field1273.method767(true);
                    int var105 = class74.field1273.method762((byte) 83);
                    if (var102 >= 0 && var101 >= 0 && var102 < 104 && var101 < 104) {
                        int var106 = var101 * 128 + 64;
                        int var107 = var102 * 128 + 64;
                        class139 var108 = new class139(var103, class42.field687, var107, var106, class145.method1003((byte) -112, var107, var106, class42.field687) - var104, var105, class120.field2304);
                        class171.field3298.method1230(var108, true);
                    }
                } else if (class98.field1818 == 72) {
                    int var109 = class74.field1273.method801(-129);
                    int var110 = var109 >> 2;
                    int var111 = var109 & 0x3;
                    int var112 = class159.field3070[var110];
                    int var113 = class74.field1273.method762((byte) 90);
                    int var114 = class74.field1273.method806(0);
                    int var115 = (var114 >> 4 & 0x7) + class128.field2431;
                    int var116 = (var114 & 0x7) + class84.field1459;
                    if (var115 >= 0 && var116 >= 0 && var115 < 103 && var116 < 103) {
                        if (var112 == 0) {
                            class186 var117 = class36.field560.method594(class42.field687, var115, var116);
                            if (var117 != null) {
                                int var118 = var117.field3537 >> 14 & 0x7FFF;
                                if (var110 == 2) {
                                    var117.field3540 = new class162(var118, 2, var111 + 4, class42.field687, var115, var116, var113, false, var117.field3540);
                                    var117.field3541 = new class162(var118, 2, var111 + 1 & 0x3, class42.field687, var115, var116, var113, false, var117.field3541);
                                } else {
                                    var117.field3540 = new class162(var118, var110, var111, class42.field687, var115, var116, var113, false, var117.field3540);
                                }
                            }
                        }
                        if (var112 == 1) {
                            class101 var119 = class36.field560.method599(class42.field687, var115, var116);
                            if (var119 != null) {
                                int var120 = var119.field1886 >> 14 & 0x7FFF;
                                if (var110 == 4 || var110 == 5) {
                                    var119.field1879 = new class162(var120, 4, var111, class42.field687, var115, var116, var113, false, var119.field1879);
                                } else if (var110 == 6) {
                                    var119.field1879 = new class162(var120, 4, var111 + 4, class42.field687, var115, var116, var113, false, var119.field1879);
                                } else if (var110 == 7) {
                                    var119.field1879 = new class162(var120, 4, (var111 + 2 & 0x3) + 4, class42.field687, var115, var116, var113, false, var119.field1879);
                                } else if (var110 == 8) {
                                    var119.field1879 = new class162(var120, 4, var111 + 4, class42.field687, var115, var116, var113, false, var119.field1879);
                                    var119.field1892 = new class162(var120, 4, (var111 + 2 & 0x3) + 4, class42.field687, var115, var116, var113, false, var119.field1892);
                                }
                            }
                        }
                        if (var112 == 2) {
                            if (var110 == 11) {
                                var110 = 10;
                            }
                            class15 var121 = class36.field560.method572(class42.field687, var115, var116);
                            if (var121 != null) {
                                var121.field247 = new class162(var121.field243 >> 14 & 0x7FFF, var110, var111, class42.field687, var115, var116, var113, false, var121.field247);
                            }
                        }
                        if (var112 == 3) {
                            class134 var122 = class36.field560.method584(class42.field687, var115, var116);
                            if (var122 != null) {
                                var122.field2514 = new class162(var122.field2510 >> 14 & 0x7FFF, 22, var111, class42.field687, var115, var116, var113, false, var122.field2514);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method9(int arg0) {
        field28 = null;
        field25 = null;
        field23 = null;
        field27 = null;
        field20 = null;
        field30 = null;
        field21 = null;
        field19 = null;
        int var1 = 127 / ((arg0 - 22) / 62);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public static final int method10(int arg0, int arg1) {
        field26++;
        int var2 = -42 % ((-arg1 - 20) / 63);
        return arg0 >> 17 & 0x7;
    }
}
