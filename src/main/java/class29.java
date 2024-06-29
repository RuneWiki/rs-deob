import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class125 {

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field635 = 0;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field638 = 0;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Ldb;")
    public static class33 field637 = new class33(32);

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Ljd;")
    public static class92 field644 = class202.method1325((byte) 90, "::gc");

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "Ljd;")
    private static class92 field647 = class202.method1325((byte) 90, "Started 3d library");

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "Ljd;")
    public static class92 field645 = field647;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "Lud;")
    public static class192 field643;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lh;I)V")
    public final void method181(class70 arg0, int arg1) {
        if (arg1 != -6555) {
            this.method184(50, null, false);
        }
        while (true) {
            int var3 = arg0.method443(arg1 + 6810);
            if (var3 == 0) {
                field639++;
                return;
            }
            this.method184(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII[La;IIIII)V")
    public static final void method182(boolean arg0, int arg1, int arg2, int arg3, class1[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class163.method1040(arg2, arg7, arg3, arg5);
        class194.method1286();
        field640++;
        int var10 = 0;
        if (!arg0) {
            return;
        }
        while (arg4.length > var10) {
            class1 var11 = arg4[var10];
            if (var11 != null && (var11.field36 == arg9 || arg9 == -1412584499 && class6.field298 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class135.field2703[class66.field1346] = var11.field79 + arg1;
                    class190.field3653[class66.field1346] = var11.field11 + arg6;
                    class74.field1564[class66.field1346] = var11.field96;
                    class206.field3963[class66.field1346] = var11.field28;
                    var12 = class66.field1346++;
                } else {
                    var12 = arg8;
                }
                var11.field39 = var12;
                var11.field135 = class158.field3150;
                if (!var11.field94 || !class103.method709(0, var11)) {
                    label788: {
                        if (var11.field120 > 0) {
                            class130.method861(var11, 5);
                        }
                        int var13 = var11.field79 + arg1;
                        int var14 = var11.field128;
                        int var15 = var11.field11 + arg6;
                        if (class6.field298 == var11) {
                            if (arg9 != -1412584499 && !var11.field85) {
                                class188.field3547 = arg4;
                                field642 = arg6;
                                class188.field3571 = arg1;
                                break label788;
                            }
                            if (class35.field804 && class15.field424) {
                                int var16 = field641;
                                int var17 = var16 - class157.field3118;
                                if (var17 < class159.field3171) {
                                    var17 = class159.field3171;
                                }
                                if (var11.field96 + var17 > class159.field3171 + client.field687.field96) {
                                    var17 = class159.field3171 + client.field687.field96 - var11.field96;
                                }
                                var13 = var17;
                                int var18 = class192.field3756;
                                int var19 = var18 - class143.field2853;
                                if (var19 < class97.field1977) {
                                    var19 = class97.field1977;
                                }
                                if (class97.field1977 + client.field687.field28 < var11.field28 + var19) {
                                    var19 = class97.field1977 + client.field687.field28 - var11.field28;
                                }
                                var15 = var19;
                            }
                            if (!var11.field85) {
                                var14 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field10 == 2) {
                            var20 = arg2;
                            var21 = arg7;
                            var22 = arg5;
                            var23 = arg3;
                        } else if (var11.field10 == 9) {
                            int var24 = var13;
                            int var25 = var15;
                            int var26 = var11.field96 + var13;
                            if (var13 > var26) {
                                var24 = var26;
                                var26 = var13;
                            }
                            int var28 = var11.field28 + var15;
                            if (var28 < var15) {
                                var25 = var28;
                                var28 = var15;
                            }
                            var28++;
                            var22 = arg5 <= var28 ? arg5 : var28;
                            var20 = arg2 >= var24 ? arg2 : var24;
                            var26++;
                            var21 = var25 > arg7 ? var25 : arg7;
                            var23 = var26 >= arg3 ? arg3 : var26;
                        } else {
                            var21 = var15 > arg7 ? var15 : arg7;
                            int var30 = var11.field96 + var13;
                            var23 = arg3 > var30 ? var30 : arg3;
                            var20 = arg2 < var13 ? var13 : arg2;
                            int var31 = var15 + var11.field28;
                            var22 = arg5 <= var31 ? arg5 : var31;
                        }
                        if (!var11.field94 || var23 > var20 && var21 < var22) {
                            label799: {
                                if (var11.field120 != 0) {
                                    if (var11.field120 == 1337) {
                                        class137.field2748 = var13;
                                        class198.field3878 = var15;
                                        class26.method166(var11.field28, var11.field96, var13, var15, 4);
                                        class163.method1040(arg2, arg7, arg3, arg5);
                                        break label799;
                                    }
                                    if (var11.field120 == 1338) {
                                        if (var11.method14(-25771)) {
                                            class175.method1154(var11, var13, -14619, var12, var15);
                                            class163.method1040(arg2, arg7, arg3, arg5);
                                        }
                                        break label799;
                                    }
                                    if (var11.field120 == 1339) {
                                        if (var11.method14(-25771)) {
                                            class208.method1354(arg0, var13, var12, var15, var11);
                                            class163.method1040(arg2, arg7, arg3, arg5);
                                        }
                                        break label799;
                                    }
                                }
                                int var32 = class192.field3756;
                                int var33 = field641;
                                if (!class72.field1524 && var20 <= var33 && var21 <= var32 && var23 > var33 && var22 > var32) {
                                    class36.method230(var33 - var13, var11, var32 - var15, 3);
                                }
                                if (var11.field10 == 0) {
                                    if (!var11.field94 && class103.method709(0, var11) && class114.field2299 != var11) {
                                        break label799;
                                    }
                                    if (!var11.field94) {
                                        if (var11.field73 - var11.field28 < var11.field48) {
                                            var11.field48 = var11.field73 - var11.field28;
                                        }
                                        if (var11.field48 < 0) {
                                            var11.field48 = 0;
                                        }
                                    }
                                    method182(true, var13 - var11.field24, var20, var23, arg4, var22, var15 - var11.field48, var21, var12, var11.field100);
                                    if (var11.field55 != null) {
                                        method182(true, var13 - var11.field24, var20, var23, var11.field55, var22, var15 - var11.field48, var21, var12, var11.field100);
                                    }
                                    class105 var34 = (class105) class118.field2394.method216(-113, (long) var11.field100);
                                    if (var34 != null) {
                                        if (var34.field2147 == 0 && var20 <= field641 && class192.field3756 >= var21 && var23 > field641 && class192.field3756 < var22 && !class72.field1524 && !class133.field2694) {
                                            class3.field182 = 1;
                                            class13.field383[0] = 1003;
                                            class92.field1815[0] = class102.field2098;
                                            class189.field3604[0] = class3.field189;
                                        }
                                        class92.method641(var15, (byte) 121, var22, var34.field2155, var23, var20, var13, var21, var12);
                                    }
                                    class163.method1040(arg2, arg7, arg3, arg5);
                                    class194.method1286();
                                }
                                if (class174.field3364[var12] || class142.field2832 > 1) {
                                    if (var11.field10 == 0 && !var11.field94 && var11.field73 > var11.field28) {
                                        class150.method968(var11.field28, var15, var11.field73, var11.field96 + var13, var11.field48, false);
                                    }
                                    if (var11.field10 != 1) {
                                        if (var11.field10 == 2) {
                                            int var35 = 0;
                                            for (int var36 = 0; var36 < var11.field28; var36++) {
                                                for (int var37 = 0; var37 < var11.field96; var37++) {
                                                    int var38 = (var11.field61 + 32) * var37 + var13;
                                                    int var39 = (var11.field46 + 32) * var36 + var15;
                                                    if (var35 < 20) {
                                                        var38 += var11.field72[var35];
                                                        var39 += var11.field65[var35];
                                                    }
                                                    if (var11.field133[var35] > 0) {
                                                        boolean var40 = false;
                                                        boolean var41 = false;
                                                        int var42 = var11.field133[var35] - 1;
                                                        if (var38 + 32 > arg2 && var38 < arg3 && arg7 < var39 + 32 && var39 < arg5 || class115.field2319 == var11 && class177.field3414 == var35) {
                                                            class167 var43;
                                                            if (class59.field1235 == 1 && class1.field101 == var35 && class31.field699 == var11.field100) {
                                                                var43 = class192.method1269(1498852336, var42, 2, 0, var11.field60[var35], false);
                                                            } else {
                                                                var43 = class192.method1269(1498852336, var42, 1, 3153952, var11.field60[var35], false);
                                                            }
                                                            if (var43 == null) {
                                                                class3.method21(26702, var11);
                                                            } else if (class115.field2319 == var11 && class177.field3414 == var35) {
                                                                int var44 = field641 - class113.field2276;
                                                                int var45 = class192.field3756 - class175.field3381;
                                                                if (var44 < 5 && var44 > -5) {
                                                                    var44 = 0;
                                                                }
                                                                if (var45 < 5 && var45 > -5) {
                                                                    var45 = 0;
                                                                }
                                                                if (class68.field1384 < 5) {
                                                                    var44 = 0;
                                                                    var45 = 0;
                                                                }
                                                                var43.method1109(var38 + var44, var39 - -var45, 128);
                                                                if (arg9 != -1) {
                                                                    class1 var46 = arg4[arg9 & 0xFFFF];
                                                                    int var47 = class163.field3187;
                                                                    int var48 = class163.field3191;
                                                                    if (var47 > var39 + var45 && var46.field48 > 0) {
                                                                        int var49 = (var47 - var39 - var45) * class76.field1588 / 3;
                                                                        if (class76.field1588 * 10 < var49) {
                                                                            var49 = class76.field1588 * 10;
                                                                        }
                                                                        if (var46.field48 < var49) {
                                                                            var49 = var46.field48;
                                                                        }
                                                                        var46.field48 -= var49;
                                                                        class175.field3381 += var49;
                                                                        class3.method21(26702, var46);
                                                                    }
                                                                    if (var48 < var39 + var45 + 32 && var46.field73 - var46.field28 > var46.field48) {
                                                                        int var50 = (var39 + var45 + 32 - var48) * class76.field1588 / 3;
                                                                        if (class76.field1588 * 10 < var50) {
                                                                            var50 = class76.field1588 * 10;
                                                                        }
                                                                        if (var46.field73 - var46.field28 - var46.field48 < var50) {
                                                                            var50 = var46.field73 - var46.field28 - var46.field48;
                                                                        }
                                                                        var46.field48 += var50;
                                                                        class175.field3381 -= var50;
                                                                        class3.method21(26702, var46);
                                                                    }
                                                                }
                                                            } else if (class49.field1075 == var11 && class105.field2148 == var35) {
                                                                var43.method1109(var38, var39, 128);
                                                            } else {
                                                                var43.method1097(var38, var39);
                                                            }
                                                        }
                                                    } else if (var11.field105 != null && var35 < 20) {
                                                        class167 var51 = var11.method7((byte) 120, var35);
                                                        if (var51 != null) {
                                                            var51.method1097(var38, var39);
                                                        } else if (class72.field1531) {
                                                            class3.method21(26702, var11);
                                                        }
                                                    }
                                                    var35++;
                                                }
                                            }
                                        } else if (var11.field10 == 3) {
                                            int var52;
                                            if (class58.method356(-125, var11)) {
                                                var52 = var11.field4;
                                                if (class114.field2299 == var11 && var11.field14 != 0) {
                                                    var52 = var11.field14;
                                                }
                                            } else {
                                                var52 = var11.field8;
                                                if (class114.field2299 == var11 && var11.field81 != 0) {
                                                    var52 = var11.field81;
                                                }
                                            }
                                            if (var14 == 0) {
                                                if (var11.field53) {
                                                    class163.method1049(var13, var15, var11.field96, var11.field28, var52);
                                                } else {
                                                    class163.method1053(var13, var15, var11.field96, var11.field28, var52);
                                                }
                                            } else if (var11.field53) {
                                                class163.method1039(var13, var15, var11.field96, var11.field28, var52, 256 - (var14 & 0xFF));
                                            } else {
                                                class163.method1051(var13, var15, var11.field96, var11.field28, var52, 256 - (var14 & 0xFF));
                                            }
                                        } else if (var11.field10 == 4) {
                                            class50 var53 = var11.method6((byte) 101, class114.field2305);
                                            if (var53 != null) {
                                                class92 var54 = var11.field9;
                                                int var55;
                                                if (class58.method356(-120, var11)) {
                                                    var55 = var11.field4;
                                                    if (class114.field2299 == var11 && var11.field14 != 0) {
                                                        var55 = var11.field14;
                                                    }
                                                    if (var11.field82.method640(true) > 0) {
                                                        var54 = var11.field82;
                                                    }
                                                } else {
                                                    var55 = var11.field8;
                                                    if (class114.field2299 == var11 && var11.field81 != 0) {
                                                        var55 = var11.field81;
                                                    }
                                                }
                                                if (var11.field94 && var11.field37 != -1) {
                                                    class107 var56 = class92.method626((byte) 59, var11.field37);
                                                    var54 = var56.field2162;
                                                    if (var54 == null) {
                                                        var54 = class60.field1251;
                                                    }
                                                    if ((var56.field2185 == 1 || var11.field87 != 1) && var11.field87 != -1) {
                                                        var54 = class77.method529(-3, new class92[] { class51.field1079, var54, class170.field3329, class116.method783(-42, var11.field87) });
                                                    }
                                                }
                                                if (class93.field1897 == var11) {
                                                    var54 = class179.field3431;
                                                    var55 = var11.field8;
                                                }
                                                if (!var11.field94) {
                                                    var54 = class1.method1(var11, false, var54);
                                                }
                                                var53.method982(var54, var13, var15, var11.field96, var11.field28, var55, var11.field102 ? 0 : -1, var11.field88, var11.field127, var11.field119);
                                            } else if (class72.field1531) {
                                                class3.method21(26702, var11);
                                            }
                                        } else if (var11.field10 == 5) {
                                            if (var11.field94) {
                                                class167 var57;
                                                if (var11.field37 == -1) {
                                                    var57 = var11.method4(false, 0);
                                                } else {
                                                    var57 = class192.method1269(1498852336, var11.field37, var11.field109, var11.field51, var11.field87, false);
                                                }
                                                if (var57 != null) {
                                                    int var58 = var57.field3279;
                                                    int var59 = var57.field3278;
                                                    if (var11.field95) {
                                                        class163.method1038(var13, var15, var13 + var11.field96, var15 - -var11.field28);
                                                        int var60 = (var58 + var11.field96 - 1) / var58;
                                                        int var61 = (var59 + var11.field28 - 1) / var59;
                                                        int var62 = 0;
                                                        while (true) {
                                                            if (var60 <= var62) {
                                                                class163.method1040(arg2, arg7, arg3, arg5);
                                                                break;
                                                            }
                                                            for (int var63 = 0; var63 < var61; var63++) {
                                                                if (var11.field69 != 0) {
                                                                    var57.method1095(var58 / 2 + var58 * var62 + var13, var15 - -(var59 * var63) - -(var59 / 2), var11.field69, 4096);
                                                                } else if (var14 == 0) {
                                                                    var57.method1097(var58 * var62 + var13, var59 * var63 + var15);
                                                                } else {
                                                                    var57.method1109(var13 + var58 * var62, var59 * var63 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                            var62++;
                                                        }
                                                    } else {
                                                        int var64 = var11.field96 * 4096 / var58;
                                                        if (var11.field69 != 0) {
                                                            var57.method1095(var11.field96 / 2 + var13, var15 - -(var11.field28 / 2), var11.field69, var64);
                                                        } else if (var14 != 0) {
                                                            var57.method1102(var13, var15, var11.field96, var11.field28, 256 - (var14 & 0xFF));
                                                        } else if (var11.field96 == var58 && var11.field28 == var59) {
                                                            var57.method1097(var13, var15);
                                                        } else {
                                                            var57.method1100(var13, var15, var11.field96, var11.field28);
                                                        }
                                                    }
                                                } else if (class72.field1531) {
                                                    class3.method21(26702, var11);
                                                }
                                            } else {
                                                class167 var65 = var11.method4(class58.method356(-124, var11), 0);
                                                if (var65 != null) {
                                                    var65.method1097(var13, var15);
                                                } else if (class72.field1531) {
                                                    class3.method21(26702, var11);
                                                }
                                            }
                                        } else if (var11.field10 == 6) {
                                            boolean var66 = class58.method356(-121, var11);
                                            class38 var67 = null;
                                            int var68;
                                            if (var66) {
                                                var68 = var11.field13;
                                            } else {
                                                var68 = var11.field27;
                                            }
                                            int var69 = 0;
                                            if (var11.field37 != -1) {
                                                class107 var70 = class92.method626((byte) 59, var11.field37);
                                                if (var70 != null) {
                                                    class107 var71 = var70.method737(var11.field87, true);
                                                    var67 = var71.method732(0, 1, null, -10990);
                                                    if (var67 == null) {
                                                        class3.method21(26702, var11);
                                                    } else {
                                                        var67.method236();
                                                        var69 = -var67.field3511 / 2;
                                                    }
                                                }
                                            } else if (var11.field50 == 5) {
                                                if (var11.field131 == -1) {
                                                    var67 = class118.field2381.method584(-1, null, -1, null, (byte) -49);
                                                } else {
                                                    int var73 = var11.field131 & 0x7FF;
                                                    if (class170.field3313 == var73) {
                                                        var73 = 2047;
                                                    }
                                                    class91 var74 = class172.field3347[var73];
                                                    class22 var75 = var68 == -1 ? null : class153.method978(var68, -107);
                                                    if (var74 != null && (int) var74.field1805.method609(10354) << 11 == (var11.field131 & 0xFFFFF800)) {
                                                        var67 = var74.field1799.method584(var11.field130, null, 0, var75, (byte) -49);
                                                    }
                                                }
                                            } else if (var68 == -1) {
                                                var67 = var11.method8(var66, null, class15.field423.field1799, -1, false);
                                                if (var67 == null && class72.field1531) {
                                                    class3.method21(26702, var11);
                                                }
                                            } else {
                                                class22 var72 = class153.method978(var68, -121);
                                                var67 = var11.method8(var66, var72, class15.field423.field1799, var11.field130, !arg0);
                                                if (var67 == null && class72.field1531) {
                                                    class3.method21(26702, var11);
                                                }
                                            }
                                            if (var67 != null) {
                                                class194.method1295(var11.field96 / 2 + var11.field126 + var13, var11.field28 / 2 + var15 - -var11.field22);
                                                int var76 = class194.field3787[var11.field56] * var11.field132 >> 16;
                                                int var77 = class194.field3803[var11.field56] * var11.field132 >> 16;
                                                if (!var11.field94) {
                                                    var67.method252(0, var11.field106, 0, var11.field56, 0, var76, var77);
                                                } else if (var11.field107) {
                                                    var67.method242(0, var11.field106, var11.field7, var11.field56, var11.field31, var69 + var76 + var11.field5, var11.field5 + var77, var11.field132);
                                                } else {
                                                    var67.method252(0, var11.field106, var11.field7, var11.field56, var11.field31, var76 + var11.field5 + var69, var11.field5 + var77);
                                                }
                                                class194.method1287();
                                            }
                                        } else {
                                            label777: {
                                                if (var11.field10 == 7) {
                                                    class50 var78 = var11.method6((byte) 101, class114.field2305);
                                                    if (var78 == null) {
                                                        if (class72.field1531) {
                                                            class3.method21(26702, var11);
                                                        }
                                                        break label777;
                                                    }
                                                    int var79 = 0;
                                                    for (int var80 = 0; var80 < var11.field28; var80++) {
                                                        for (int var81 = 0; var81 < var11.field96; var81++) {
                                                            if (var11.field133[var79] > 0) {
                                                                class107 var82 = class92.method626((byte) 59, var11.field133[var79] - 1);
                                                                class92 var83;
                                                                if (var82.field2185 != 1 && var11.field60[var79] == 1) {
                                                                    var83 = class77.method529(-3, new class92[] { class51.field1079, var82.field2162, class168.field3292 });
                                                                } else {
                                                                    var83 = class77.method529(-3, new class92[] { class51.field1079, var82.field2162, class170.field3329, class116.method783(-79, var11.field60[var79]) });
                                                                }
                                                                int var84 = (var11.field46 + 12) * var80 + var15;
                                                                int var85 = (var11.field61 + 115) * var81 + var13;
                                                                if (var11.field88 == 0) {
                                                                    var78.method987(var83, var85, var84, var11.field8, var11.field102 ? 0 : -1);
                                                                } else if (var11.field88 == 1) {
                                                                    var78.method1003(var83, var11.field96 / 2 + var85, var84, var11.field8, var11.field102 ? 0 : -1);
                                                                } else {
                                                                    var78.method995(var83, var11.field96 + var85 - 1, var84, var11.field8, var11.field102 ? 0 : -1);
                                                                }
                                                            }
                                                            var79++;
                                                        }
                                                    }
                                                }
                                                if (var11.field10 == 8 && class185.field3506 == var11 && class3.field170 == class172.field3334) {
                                                    int var86 = 0;
                                                    int var87 = 0;
                                                    class92 var88 = var11.field9;
                                                    class50 var89 = class176.field3387;
                                                    class92 var90 = class1.method1(var11, false, var88);
                                                    while (var90.method640(true) > 0) {
                                                        int var98 = var90.method615(class27.field612, true);
                                                        class92 var99;
                                                        if (var98 == -1) {
                                                            var99 = var90;
                                                            var90 = class3.field189;
                                                        } else {
                                                            var99 = var90.method629(var98, 0, 0);
                                                            var90 = var90.method613(0, var98 + 4);
                                                        }
                                                        int var100 = var89.method1000(var99);
                                                        if (var100 > var86) {
                                                            var86 = var100;
                                                        }
                                                        var87 += var89.field3072 + 1;
                                                    }
                                                    var86 += 6;
                                                    int var91 = var13 + var11.field96 - var86 - 5;
                                                    if (var91 < var13 + 5) {
                                                        var91 = var13 + 5;
                                                    }
                                                    int var92 = var15 + var11.field28 + 5;
                                                    if (var86 + var91 > arg3) {
                                                        var91 = arg3 - var86;
                                                    }
                                                    var87 += 7;
                                                    if (var87 + var92 > arg5) {
                                                        var92 = arg5 - var87;
                                                    }
                                                    class163.method1049(var91, var92, var86, var87, 16777120);
                                                    class163.method1053(var91, var92, var86, var87, 0);
                                                    int var93 = var89.field3072 + var92 + 2;
                                                    class92 var94 = var11.field9;
                                                    class92 var95 = class1.method1(var11, false, var94);
                                                    while (var95.method640(true) > 0) {
                                                        int var96 = var95.method615(class27.field612, arg0);
                                                        class92 var97;
                                                        if (var96 == -1) {
                                                            var97 = var95;
                                                            var95 = class3.field189;
                                                        } else {
                                                            var97 = var95.method629(var96, 0, 0);
                                                            var95 = var95.method613(0, var96 + 4);
                                                        }
                                                        var89.method987(var97, var91 + 3, var93, 0, -1);
                                                        var93 += var89.field3072 + 1;
                                                    }
                                                }
                                                if (var11.field10 == 9) {
                                                    if (var11.field19 == 1) {
                                                        class163.method1048(var13, var15, var11.field96 + var13, var11.field28 + var15, var11.field8);
                                                    } else {
                                                        int var101 = var11.field96 < 0 ? -var11.field96 : var11.field96;
                                                        int var102 = var11.field28 < 0 ? -var11.field28 : var11.field28;
                                                        int var103 = var101;
                                                        if (var101 < var102) {
                                                            var103 = var102;
                                                        }
                                                        if (var103 != 0) {
                                                            int var104 = (var11.field28 << 16) / var103;
                                                            int var105 = (var11.field96 << 16) / var103;
                                                            if (var105 >= var104) {
                                                                var105 = -var105;
                                                            } else {
                                                                var104 = -var104;
                                                            }
                                                            int var106 = var11.field19 * var104 + 1 >> 17;
                                                            int var107 = var11.field19 * var104 >> 17;
                                                            int var108 = var11.field19 * var105 >> 17;
                                                            int var109 = var13 - arg2;
                                                            int var110 = var11.field19 * var105 + 1 >> 17;
                                                            int var111 = var15 - arg7;
                                                            int var112 = var107 + var109;
                                                            int var113 = var109 - var106;
                                                            int var114 = var109 + var11.field96 - var106;
                                                            int var115 = var11.field96 + var109 + var107;
                                                            int var116 = var111 - var110;
                                                            int var117 = var108 + var111;
                                                            int var118 = var11.field28 + var111 - var110;
                                                            int var119 = var11.field28 + var111 + var108;
                                                            class194.method1285(var112, var113, var114);
                                                            class194.method1294(var117, var116, var118, var112, var113, var114, var11.field8);
                                                            class194.method1285(var112, var114, var115);
                                                            class194.method1294(var117, var118, var119, var112, var114, var115, var11.field8);
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
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
    public static void method183(int arg0) {
        field637 = null;
        field645 = null;
        field643 = null;
        field644 = null;
        if (arg0 != -15297) {
            field647 = null;
        }
        field647 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILh;Z)V")
    private final void method184(int arg0, class70 arg1, boolean arg2) {
        if (arg2) {
            this.method181(null, 38);
        }
        if (arg0 == 5) {
            this.field635 = arg1.method442(-21351);
        }
        field636++;
    }
}
