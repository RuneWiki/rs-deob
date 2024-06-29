import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class129 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Ltd;")
    public static class136 field3090 = class145.method1172(")3", 45);

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Ltd;")
    private static class136 field3097 = class145.method1172("New User", 45);

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Ltd;")
    private static class136 field3096 = class145.method1172("Connecting to server)3)3)3", 45);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Ltd;")
    public static class136 field3092 = field3097;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Ltd;")
    public static class136 field3093 = field3096;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[Lke;IIIIII)V")
    public static final void method1057(int arg0, int arg1, int arg2, class74[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3091++;
        class114.method902(arg6, arg1, arg4, arg5);
        class103.method818();
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class74 var11 = arg3[var10];
            if (var11 != null && (var11.field1628 == arg2 || arg2 == -1412584499 && class38.field894 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class100.field2408[class70.field1477] = var11.field1619 + arg8;
                    class154.field3535[class70.field1477] = var11.field1610 + arg9;
                    class125.field2907[class70.field1477] = var11.field1545;
                    class133.field3137[class70.field1477] = var11.field1686;
                    var12 = class70.field1477++;
                } else {
                    var12 = arg7;
                }
                var11.field1612 = class44.field1013;
                var11.field1578 = var12;
                if (!var11.field1616 || !class19.method135(var11, (byte) 127)) {
                    if (var11.field1630 > 0) {
                        class119.method933(var11, 150);
                    }
                    int var13 = var11.field1619 + arg8;
                    int var14 = var11.field1610 + arg9;
                    int var15 = var11.field1617;
                    if (class38.field894 == var11) {
                        if (arg2 != -1412584499 && !var11.field1620) {
                            class107.field2517 = arg8;
                            class39.field906 = arg3;
                            class132.field3117 = arg9;
                            continue;
                        }
                        if (class151.field3459 && class11.field188) {
                            int var16 = class18.field360;
                            int var17 = var16 - class8.field134;
                            int var18 = class142.field3292;
                            int var19 = var18 - class37.field865;
                            if (class128.field3084 > var19) {
                                var19 = class128.field3084;
                            }
                            if (class122.field2839 > var17) {
                                var17 = class122.field2839;
                            }
                            if (class128.field3084 + class39.field903.field1686 < var11.field1686 + var19) {
                                var19 = class128.field3084 + class39.field903.field1686 - var11.field1686;
                            }
                            var14 = var19;
                            if (var17 + var11.field1545 > class122.field2839 + class39.field903.field1545) {
                                var17 = class122.field2839 + class39.field903.field1545 - var11.field1545;
                            }
                            var13 = var17;
                        }
                        if (!var11.field1620) {
                            var15 = 128;
                        }
                    }
                    int var25;
                    int var27;
                    int var28;
                    int var29;
                    if (var11.field1690 == 2) {
                        var27 = arg1;
                        var25 = arg6;
                        var28 = arg4;
                        var29 = arg5;
                    } else if (var11.field1690 == 9) {
                        int var20 = var13;
                        int var21 = var14;
                        int var22 = var11.field1545 + var13;
                        int var23 = var11.field1686 + var14;
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }
                        var25 = var20 > arg6 ? var20 : arg6;
                        var22++;
                        if (var14 > var23) {
                            var21 = var23;
                            var23 = var14;
                        }
                        var27 = arg1 < var21 ? var21 : arg1;
                        var28 = var22 < arg4 ? var22 : arg4;
                        var23++;
                        var29 = arg5 <= var23 ? arg5 : var23;
                    } else {
                        var25 = arg6 < var13 ? var13 : arg6;
                        var27 = var14 > arg1 ? var14 : arg1;
                        int var30 = var11.field1686 + var14;
                        int var31 = var11.field1545 + var13;
                        var29 = arg5 > var30 ? var30 : arg5;
                        var28 = var31 >= arg4 ? arg4 : var31;
                    }
                    if (!var11.field1616 || var25 < var28 && var27 < var29) {
                        if (var11.field1630 != 0) {
                            if (var11.field1630 == 1337) {
                                class85.field1997 = var14;
                                class122.field2853 = var13;
                                class99.method799(var11.field1686, var14, var13, -124, var11.field1545);
                                class114.method902(arg6, arg1, arg4, arg5);
                                continue;
                            }
                            if (var11.field1630 == 1338) {
                                class18.method131(true, var13, var12, var14);
                                class114.method902(arg6, arg1, arg4, arg5);
                                continue;
                            }
                        }
                        int var32 = class142.field3292;
                        int var33 = class18.field360;
                        if (!class96.field2267 && var25 <= var33 && var32 >= var27 && var28 > var33 && var29 > var32) {
                            class31.method269(arg0 - 5695, var11, var32 - var14, -var13 + var33);
                        }
                        if (var11.field1690 == 0) {
                            if (!var11.field1616 && class19.method135(var11, (byte) 99) && class79.field1821 != var11) {
                                continue;
                            }
                            if (!var11.field1616) {
                                if (var11.field1638 - var11.field1686 < var11.field1646) {
                                    var11.field1646 = var11.field1638 - var11.field1686;
                                }
                                if (var11.field1646 < 0) {
                                    var11.field1646 = 0;
                                }
                            }
                            method1057(arg0, var27, var11.field1663, arg3, var28, var29, var25, var12, var13 - var11.field1677, -var11.field1646 + var14);
                            if (var11.field1688 != null) {
                                method1057(1005, var27, var11.field1663, var11.field1688, var28, var29, var25, var12, var13 - var11.field1677, -var11.field1646 + var14);
                            }
                            class118 var34 = (class118) class18.field363.method109(36, (long) var11.field1663);
                            if (var34 != null) {
                                if (var34.field2682 == 0 && class18.field360 >= var25 && class142.field3292 >= var27 && class18.field360 < var28 && var29 > class142.field3292 && !class96.field2267 && !class86.field2010) {
                                    class27.field600[0] = 1005;
                                    class14.field274 = 1;
                                    class119.field2713[0] = class89.field2114;
                                    class65.field1407[0] = class37.field871;
                                }
                                class24.method224(var13, var29, var34.field2693, var28, 0, var27, var25, var14, var12);
                            }
                            class114.method902(arg6, arg1, arg4, arg5);
                            class103.method818();
                        }
                        if (class94.field2206[var12] || class15.field303 > 1) {
                            if (var11.field1690 == 0 && !var11.field1616 && var11.field1638 > var11.field1686) {
                                class125.method961(16, var11.field1638, var11.field1686, var11.field1646, var14, var11.field1545 + var13);
                            }
                            if (var11.field1690 != 1) {
                                if (var11.field1690 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1686; var36++) {
                                        for (int var37 = 0; var37 < var11.field1545; var37++) {
                                            int var38 = (var11.field1642 + 32) * var37 + var13;
                                            int var39 = (var11.field1667 + 32) * var36 + var14;
                                            if (var35 < 20) {
                                                var39 += var11.field1611[var35];
                                                var38 += var11.field1640[var35];
                                            }
                                            if (var11.field1552[var35] > 0) {
                                                boolean var40 = false;
                                                int var41 = var11.field1552[var35] - 1;
                                                boolean var42 = false;
                                                if (arg6 < var38 + 32 && var38 < arg4 && var39 + 32 > arg1 && var39 < arg5 || class86.field2021 == var11 && class5.field113 == var35) {
                                                    class10 var43;
                                                    if (class147.field3410 == 1 && class128.field3081 == var35 && class139.field3250 == var11.field1663) {
                                                        var43 = class39.method330(arg0 - 1071, var11.field1595[var35], false, 2, var41, 0);
                                                    } else {
                                                        var43 = class39.method330(-85, var11.field1595[var35], false, 1, var41, 3153952);
                                                    }
                                                    if (var43 == null) {
                                                        class145.method1173(var11, -4008);
                                                    } else if (class86.field2021 == var11 && class5.field113 == var35) {
                                                        int var44 = class142.field3292 - class69.field1450;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class18.field360 - class143.field3322;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class151.field3448 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method66(var38 + var45, var39 + var44, 128);
                                                        if (arg2 != -1) {
                                                            class74 var46 = arg3[arg2 & 0xFFFF];
                                                            if (var39 + var44 < class114.field2635 && var46.field1646 > 0) {
                                                                int var47 = (class114.field2635 - var44 - var39) * class41.field967 / 3;
                                                                if (class41.field967 * 10 < var47) {
                                                                    var47 = class41.field967 * 10;
                                                                }
                                                                if (var46.field1646 < var47) {
                                                                    var47 = var46.field1646;
                                                                }
                                                                var46.field1646 -= var47;
                                                                class69.field1450 += var47;
                                                                class145.method1173(var46, -4008);
                                                            }
                                                            if (var39 + var44 + 32 > class114.field2633 && var46.field1638 - var46.field1686 > var46.field1646) {
                                                                int var48 = (var39 + var44 + 32 - class114.field2633) * class41.field967 / 3;
                                                                if (class41.field967 * 10 < var48) {
                                                                    var48 = class41.field967 * 10;
                                                                }
                                                                if (var48 > var46.field1638 - var46.field1686 - var46.field1646) {
                                                                    var48 = var46.field1638 - var46.field1686 - var46.field1646;
                                                                }
                                                                class69.field1450 -= var48;
                                                                var46.field1646 += var48;
                                                                class145.method1173(var46, -4008);
                                                            }
                                                        }
                                                    } else if (class44.field1015 == var11 && class132.field3118 == var35) {
                                                        var43.method66(var38, var39, 128);
                                                    } else {
                                                        var43.method46(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field1598 != null && var35 < 20) {
                                                class10 var49 = var11.method545(arg0 ^ 0x3EC, var35);
                                                if (var49 != null) {
                                                    var49.method46(var38, var39);
                                                } else if (client.field449) {
                                                    class145.method1173(var11, -4008);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field1690 == 3) {
                                    int var50;
                                    if (class131.method1068(var11, arg0 + 2144)) {
                                        var50 = var11.field1566;
                                        if (class79.field1821 == var11 && var11.field1551 != 0) {
                                            var50 = var11.field1551;
                                        }
                                    } else {
                                        var50 = var11.field1664;
                                        if (class79.field1821 == var11 && var11.field1645 != 0) {
                                            var50 = var11.field1645;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1647) {
                                            class114.method891(var13, var14, var11.field1545, var11.field1686, var50);
                                        } else {
                                            class114.method897(var13, var14, var11.field1545, var11.field1686, var50);
                                        }
                                    } else if (var11.field1647) {
                                        class114.method887(var13, var14, var11.field1545, var11.field1686, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class114.method895(var13, var14, var11.field1545, var11.field1686, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1690 == 4) {
                                    class95 var51 = var11.method538(0);
                                    if (var51 != null) {
                                        class136 var52 = var11.field1666;
                                        int var53;
                                        if (class131.method1068(var11, 3149)) {
                                            var53 = var11.field1566;
                                            if (class79.field1821 == var11 && var11.field1551 != 0) {
                                                var53 = var11.field1551;
                                            }
                                            if (var11.field1569.method1119(arg0 - 11516) > 0) {
                                                var52 = var11.field1569;
                                            }
                                        } else {
                                            var53 = var11.field1664;
                                            if (class79.field1821 == var11 && var11.field1645 != 0) {
                                                var53 = var11.field1645;
                                            }
                                        }
                                        if (var11.field1616 && var11.field1582 != -1) {
                                            class121 var54 = class63.method472(var11.field1582, (byte) -19);
                                            var52 = var54.field2789;
                                            if (var52 == null) {
                                                var52 = class104.field2475;
                                            }
                                            if ((var54.field2761 == 1 || var11.field1680 != 1) && var11.field1680 != -1) {
                                                var52 = class79.method570(0, new class136[] { class41.field961, var52, class135.field3167, class101.method812(var11.field1680, (byte) 97) });
                                            }
                                        }
                                        if (class107.field2523 == var11) {
                                            var52 = class24.field554;
                                            var53 = var11.field1664;
                                        }
                                        if (!var11.field1616) {
                                            var52 = class143.method1161(var11, 0, var52);
                                        }
                                        var51.method723(var52, var13, var14, var11.field1545, var11.field1686, var53, var11.field1622 ? 0 : -1, var11.field1661, var11.field1589, var11.field1564);
                                    } else if (client.field449) {
                                        class145.method1173(var11, -4008);
                                    }
                                } else if (var11.field1690 == 5) {
                                    if (var11.field1616) {
                                        class10 var56;
                                        if (var11.field1582 == -1) {
                                            var56 = var11.method535(false, false);
                                        } else {
                                            var56 = class39.method330(arg0 ^ 0xFFFFFC4E, var11.field1680, false, var11.field1649, var11.field1582, var11.field1602);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field170;
                                            int var58 = var56.field173;
                                            if (var11.field1592) {
                                                class114.method892(var13, var14, var13 + var11.field1545, var11.field1686 + var14);
                                                int var60 = (var11.field1545 + var57 - 1) / var57;
                                                int var61 = (var58 + var11.field1686 - 1) / var58;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var11.field1676 != 0) {
                                                            var56.method60(var57 / 2 + var57 * var62 + var13, var58 * var63 + var14 - -(var58 / 2), var11.field1676, 4096);
                                                        } else if (var15 == 0) {
                                                            var56.method46(var57 * var62 + var13, var58 * var63 + var14);
                                                        } else {
                                                            var56.method66(var13 + var57 * var62, var58 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class114.method902(arg6, arg1, arg4, arg5);
                                            } else {
                                                int var59 = var11.field1545 * 4096 / var57;
                                                if (var11.field1676 != 0) {
                                                    var56.method60(var11.field1545 / 2 + var13, var14 - -(var11.field1686 / 2), var11.field1676, var59);
                                                } else if (var15 != 0) {
                                                    var56.method47(var13, var14, var11.field1545, var11.field1686, 256 - (var15 & 0xFF));
                                                } else if (var11.field1545 == var57 && var11.field1686 == var58) {
                                                    var56.method46(var13, var14);
                                                } else {
                                                    var56.method68(var13, var14, var11.field1545, var11.field1686);
                                                }
                                            }
                                        } else if (client.field449) {
                                            class145.method1173(var11, -4008);
                                        }
                                    } else {
                                        class10 var55 = var11.method535(class131.method1068(var11, arg0 ^ 0xFA0), false);
                                        if (var55 != null) {
                                            var55.method46(var13, var14);
                                        } else if (client.field449) {
                                            class145.method1173(var11, -4008);
                                        }
                                    }
                                } else if (var11.field1690 == 6) {
                                    boolean var64 = class131.method1068(var11, 3149);
                                    class23 var65 = null;
                                    int var66;
                                    if (var64) {
                                        var66 = var11.field1625;
                                    } else {
                                        var66 = var11.field1675;
                                    }
                                    int var67 = 0;
                                    if (var11.field1582 != -1) {
                                        class121 var68 = class63.method472(var11.field1582, (byte) -53);
                                        if (var68 != null) {
                                            class121 var69 = var68.method946(var11.field1680, (byte) 127);
                                            var65 = var69.method939(arg0 ^ 0xFFFFFC12, 1);
                                            if (var65 == null) {
                                                class145.method1173(var11, -4008);
                                            } else {
                                                var65.method195();
                                                var67 = var65.field2607 / 2;
                                            }
                                        }
                                    } else if (var11.field1679 == 5) {
                                        if (var11.field1594 == 0) {
                                            var65 = class133.field3131.method797(-1, -127, null, null, -1);
                                        } else {
                                            var65 = class24.field555.method93(-48);
                                        }
                                    } else if (var66 == -1) {
                                        var65 = var11.method539(-1, null, (byte) -11, var64, class24.field555.field258);
                                        if (var65 == null && client.field449) {
                                            class145.method1173(var11, -4008);
                                        }
                                    } else {
                                        class116 var70 = class29.method252(true, var66);
                                        var65 = var11.method539(var11.field1634, var70, (byte) 96, var64, class24.field555.field258);
                                        if (var65 == null && client.field449) {
                                            class145.method1173(var11, -4008);
                                        }
                                    }
                                    class103.method827(var11.field1545 / 2 + var13, var11.field1686 / 2 + var14);
                                    int var71 = class103.field2456[var11.field1580] * var11.field1648 >> 16;
                                    int var72 = class103.field2452[var11.field1580] * var11.field1648 >> 16;
                                    if (var65 != null) {
                                        if (var11.field1616) {
                                            var65.method195();
                                            if (var11.field1570) {
                                                var65.method196(0, var11.field1591, var11.field1632, var11.field1580, var11.field1555, var71 + var11.field1609 + var67, var11.field1609 + var72, var11.field1648);
                                            } else {
                                                var65.method189(0, var11.field1591, var11.field1632, var11.field1580, var11.field1555, var67 + var71 + var11.field1609, var72 - -var11.field1609);
                                            }
                                        } else {
                                            var65.method189(0, var11.field1591, 0, var11.field1580, 0, var71, var72);
                                        }
                                    }
                                    class103.method832();
                                } else {
                                    if (var11.field1690 == 7) {
                                        class95 var73 = var11.method538(0);
                                        if (var73 == null) {
                                            if (client.field449) {
                                                class145.method1173(var11, -4008);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field1686; var75++) {
                                            for (int var76 = 0; var76 < var11.field1545; var76++) {
                                                if (var11.field1552[var74] > 0) {
                                                    class121 var77 = class63.method472(var11.field1552[var74] - 1, (byte) 121);
                                                    class136 var78 = var77.field2789;
                                                    if (var78 == null) {
                                                        var78 = class104.field2475;
                                                    }
                                                    if (var77.field2761 == 1 || var11.field1595[var74] != 1) {
                                                        var78 = class79.method570(0, new class136[] { class41.field961, var78, class135.field3167, class101.method812(var11.field1595[var74], (byte) 97) });
                                                    }
                                                    int var79 = (var11.field1642 + 115) * var76 + var13;
                                                    int var80 = var14 + (var11.field1667 + 12) * var75;
                                                    if (var11.field1661 == 0) {
                                                        var73.method702(var78, var79, var80, var11.field1664, var11.field1622 ? 0 : -1);
                                                    } else if (var11.field1661 == 1) {
                                                        var73.method724(var78, var79 + var11.field1545 / 2, var80, var11.field1664, var11.field1622 ? 0 : -1);
                                                    } else {
                                                        var73.method709(var78, var79 + var11.field1545 - 1, var80, var11.field1664, var11.field1622 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field1690 == 8 && class94.field2203 == var11 && class91.field2148 == class28.field614) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class95 var83 = class100.field2413;
                                        class136 var84 = var11.field1666;
                                        class136 var85 = class143.method1161(var11, 0, var84);
                                        while (var85.method1119(-10511) > 0) {
                                            int var93 = var85.method1100(class113.field2624, arg0 - 1005);
                                            class136 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class37.field871;
                                            } else {
                                                var94 = var85.method1105(0, (byte) -7, var93);
                                                var85 = var85.method1108(var93 + 4, -16621);
                                            }
                                            int var95 = var83.method706(var94);
                                            var82 += var83.field2225 + 1;
                                            if (var81 < var95) {
                                                var81 = var95;
                                            }
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var86 = var11.field1545 + var13 - var81 - 5;
                                        if (var13 + 5 > var86) {
                                            var86 = var13 + 5;
                                        }
                                        int var87 = var11.field1686 + var14 + 5;
                                        if (arg4 < var81 + var86) {
                                            var86 = arg4 - var81;
                                        }
                                        if (arg5 < var82 + var87) {
                                            var87 = arg5 - var82;
                                        }
                                        class114.method891(var86, var87, var81, var82, 16777120);
                                        class114.method897(var86, var87, var81, var82, 0);
                                        int var88 = var87 + var83.field2225 + 2;
                                        class136 var89 = var11.field1666;
                                        class136 var90 = class143.method1161(var11, arg0 ^ 0x3ED, var89);
                                        while (var90.method1119(-10511) > 0) {
                                            int var91 = var90.method1100(class113.field2624, 0);
                                            class136 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class37.field871;
                                            } else {
                                                var92 = var90.method1105(0, (byte) -7, var91);
                                                var90 = var90.method1108(var91 + 4, arg0 ^ 0xFFFFBCFE);
                                            }
                                            var83.method702(var92, var86 + 3, var88, 0, -1);
                                            var88 += var83.field2225 + 1;
                                        }
                                    }
                                    if (var11.field1690 == 9) {
                                        if (var11.field1601 == 1) {
                                            class114.method893(var13, var14, var11.field1545 + var13, var11.field1686 + var14, var11.field1664);
                                        } else {
                                            int var96 = var11.field1686 < 0 ? -var11.field1686 : var11.field1686;
                                            int var97 = var11.field1545 >= 0 ? var11.field1545 : -var11.field1545;
                                            int var98 = var97;
                                            if (var97 < var96) {
                                                var98 = var96;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field1686 << 16) / var98;
                                                int var100 = (var11.field1545 << 16) / var98;
                                                if (var99 > var100) {
                                                    var99 = -var99;
                                                } else {
                                                    var100 = -var100;
                                                }
                                                int var101 = var11.field1601 * var99 >> 17;
                                                int var102 = var11.field1601 * var100 + 1 >> 17;
                                                int var103 = var13 + var101;
                                                int var104 = var13 + var101 + var11.field1545;
                                                int var105 = var11.field1601 * var100 >> 17;
                                                int var106 = var14 + var105;
                                                int var107 = var11.field1601 * var99 + 1 >> 17;
                                                int var108 = var13 + var11.field1545 - var107;
                                                int var109 = var13 - var107;
                                                int var110 = var11.field1686 + var14 + var105;
                                                int var111 = var14 + var11.field1686 - var102;
                                                class103.method824(var103, var109, var108);
                                                int var112 = var14 - var102;
                                                class103.method831(var106, var112, var111, var103, var109, var108, var11.field1664);
                                                class103.method824(var103, var108, var104);
                                                class103.method831(var106, var111, var110, var103, var108, var104, var11.field1664);
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
        if (arg0 != 1005) {
            method1061((byte) -36, true);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1058(int arg0, Component arg1) {
        field3089++;
        if (arg0 != 32) {
            method1058(-106, null);
        }
        arg1.addMouseListener(class90.field2132);
        arg1.addMouseMotionListener(class90.field2132);
        arg1.addFocusListener(class90.field2132);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I")
    public abstract int method449(boolean arg0);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1059(int arg0) {
        if (arg0 <= 31) {
            return;
        }
        field3093 = null;
        field3092 = null;
        field3090 = null;
        field3096 = null;
        field3097 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method1060(byte arg0) {
        if (class79.field1808 != null) {
            class52 var1 = class79.field1808;
            synchronized (class79.field1808) {
                class79.field1808 = null;
            }
        }
        if (arg0 <= 119) {
            method1060((byte) 44);
        }
        field3098++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method447(Component arg0, byte arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZ)V")
    public static final void method1061(byte arg0, boolean arg1) {
        field3095++;
        if (class3.field60 == null) {
            return;
        }
        if (arg0 != 97) {
            method1061((byte) 10, true);
        }
        try {
            class127 var2 = new class127(4);
            var2.method1026(arg1 ? 2 : 3, (byte) 127);
            var2.method1001(95, 0);
            class3.field60.method145(4, arg0 - 6757, var2.field2960, 0);
        } catch (IOException var4) {
            try {
                class3.field60.method144(1);
            } catch (Exception var3) {
            }
            class143.field3311++;
            class3.field60 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method448(int arg0, Component arg1);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    public static final void method1062(int arg0, int arg1) {
        field3094++;
        if (arg1 != -8030) {
            return;
        }
        if (arg0 == -1 && !class47.field1078) {
            class67.method493((byte) -8);
        } else if (arg0 != -1 && class110.field2582 != arg0 && class147.field3400 != 0 && !class47.field1078) {
            class110.method873(0, 2, arg0, class147.field3400, class39.field921, false, (byte) 106);
        }
        class110.field2582 = arg0;
    }
}
