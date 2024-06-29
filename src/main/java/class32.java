import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public static boolean field690 = false;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lpe;")
    private static class109 field698 = class141.method1120("slide:", 0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lpe;")
    public static class109 field691 = class141.method1120(" )2> <col=ff9040>", 0);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lpe;")
    public static class109 field697 = field698;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field696 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lpe;")
    public static class109 field699 = class141.method1120("::noclip", 0);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lpe;")
    public static class109 field695 = field698;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lpe;")
    public static class109 field700 = class141.method1120("title_mute", 0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lna;")
    public static class91 field692;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method327(byte arg0) {
        class7.field180.method92((byte) 127);
        if (arg0 < 93) {
            field698 = null;
        }
        field689++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIB[Lwa;IIII)V")
    public static final void method328(int arg0, int arg1, int arg2, int arg3, byte arg4, class154[] arg5, int arg6, int arg7, int arg8, int arg9) {
        field701++;
        if (arg4 != 96) {
            method327((byte) -110);
        }
        class140.method1110(arg1, arg0, arg9, arg6);
        class105.method847();
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class154 var11 = arg5[var10];
            if (var11 != null && (var11.field3458 == arg2 || arg2 == -1412584499 && class66.field1334 == var11)) {
                int var12;
                if (arg8 == -1) {
                    class50.field1045[class19.field490] = var11.field3384 + arg3;
                    class114.field2520[class19.field490] = var11.field3390 + arg7;
                    class61.field1207[class19.field490] = var11.field3427;
                    class137.field2981[class19.field490] = var11.field3382;
                    var12 = class19.field490++;
                } else {
                    var12 = arg8;
                }
                var11.field3410 = var12;
                var11.field3491 = class12.field264;
                if (!var11.field3473 || !class153.method1179((byte) -102, var11)) {
                    if (var11.field3459 > 0) {
                        class127.method1034(var11, true);
                    }
                    int var13 = var11.field3384 + arg3;
                    int var14 = var11.field3390 + arg7;
                    int var15 = var11.field3462;
                    if (class66.field1334 == var11) {
                        if (arg2 != -1412584499 && !var11.field3396) {
                            class74.field1484 = arg3;
                            class27.field636 = arg7;
                            class109.field2300 = arg5;
                            continue;
                        }
                        if (!var11.field3396) {
                            var15 = 128;
                        }
                        if (field690 && class82.field1731) {
                            int var16 = class82.field1754;
                            int var17 = var16 - class62.field1282;
                            if (class110.field2327 > var17) {
                                var17 = class110.field2327;
                            }
                            int var18 = class48.field992;
                            if (class110.field2327 + class100.field2100.field3427 < var11.field3427 + var17) {
                                var17 = class110.field2327 + class100.field2100.field3427 - var11.field3427;
                            }
                            var13 = var17;
                            int var19 = var18 - class76.field1579;
                            if (var19 < class20.field509) {
                                var19 = class20.field509;
                            }
                            if (class20.field509 + class100.field2100.field3382 < var11.field3382 + var19) {
                                var19 = class20.field509 + class100.field2100.field3382 - var11.field3382;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3476 == 2) {
                        var20 = arg1;
                        var21 = arg6;
                        var22 = arg9;
                        var23 = arg0;
                    } else if (var11.field3476 == 9) {
                        int var26 = var14;
                        int var27 = var13 + var11.field3427;
                        int var28 = var13;
                        if (var13 > var27) {
                            var28 = var27;
                            var27 = var13;
                        }
                        var20 = arg1 < var28 ? var28 : arg1;
                        int var30 = var11.field3382 + var14;
                        var27++;
                        if (var14 > var30) {
                            var26 = var30;
                            var30 = var14;
                        }
                        var22 = arg9 <= var27 ? arg9 : var27;
                        var23 = arg0 < var26 ? var26 : arg0;
                        var30++;
                        var21 = var30 >= arg6 ? arg6 : var30;
                    } else {
                        var20 = arg1 >= var13 ? arg1 : var13;
                        var23 = var14 <= arg0 ? arg0 : var14;
                        int var24 = var13 + var11.field3427;
                        int var25 = var14 + var11.field3382;
                        var21 = arg6 <= var25 ? arg6 : var25;
                        var22 = arg9 > var24 ? var24 : arg9;
                    }
                    if (!var11.field3473 || var20 < var22 && var23 < var21) {
                        if (var11.field3459 != 0) {
                            if (var11.field3459 == 1337) {
                                class49.field1009 = var13;
                                class44.field926 = var14;
                                class14.method168(var11.field3382, -256, var14, var13, var11.field3427);
                                class140.method1110(arg1, arg0, arg9, arg6);
                                continue;
                            }
                            if (var11.field3459 == 1338) {
                                class55.method439(false, var12, var13, var14);
                                class140.method1110(arg1, arg0, arg9, arg6);
                                continue;
                            }
                        }
                        int var32 = class82.field1754;
                        int var33 = class48.field992;
                        if (!class3.field64 && var32 >= var20 && var33 >= var23 && var32 < var22 && var21 > var33) {
                            class95.method784(var32 - var13, -var14 + var33, var11, (byte) -105);
                        }
                        if (var11.field3476 == 0) {
                            if (!var11.field3473 && class153.method1179((byte) -56, var11) && class4.field81 != var11) {
                                continue;
                            }
                            if (!var11.field3473) {
                                if (var11.field3417 > var11.field3425 - var11.field3382) {
                                    var11.field3417 = var11.field3425 - var11.field3382;
                                }
                                if (var11.field3417 < 0) {
                                    var11.field3417 = 0;
                                }
                            }
                            method328(var23, var20, var11.field3514, var13 - var11.field3481, (byte) 96, arg5, var21, var14 - var11.field3417, var12, var22);
                            if (var11.field3520 != null) {
                                method328(var23, var20, var11.field3514, var13 - var11.field3481, (byte) 96, var11.field3520, var21, var14 - var11.field3417, var12, var22);
                            }
                            class79 var34 = (class79) class134.field2916.method505((byte) -46, (long) var11.field3514);
                            if (var34 != null) {
                                if (var34.field1652 == 0 && class82.field1754 >= var20 && var23 <= class48.field992 && class82.field1754 < var22 && var21 > class48.field992 && !class3.field64 && !class14.field380) {
                                    class101.field2116[0] = class125.field2773;
                                    class149.field3285[0] = 1005;
                                    class101.field2135[0] = class131.field2866;
                                    class63.field1302 = 1;
                                }
                                class41.method381(arg4 + 21, var22, var20, var14, var21, var12, var34.field1655, var13, var23);
                            }
                            class140.method1110(arg1, arg0, arg9, arg6);
                            class105.method847();
                        }
                        if (class83.field1770[var12] || class23.field562 > 1) {
                            if (var11.field3476 == 0 && !var11.field3473 && var11.field3425 > var11.field3382) {
                                class68.method529(arg4 + 5251, var11.field3382, var11.field3427 + var13, var11.field3425, var11.field3417, var14);
                            }
                            if (var11.field3476 != 1) {
                                if (var11.field3476 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field3382; var36++) {
                                        for (int var37 = 0; var37 < var11.field3427; var37++) {
                                            int var38 = var13 + (var11.field3407 + 32) * var37;
                                            int var39 = (var11.field3420 + 32) * var36 + var14;
                                            if (var35 < 20) {
                                                var39 += var11.field3418[var35];
                                                var38 += var11.field3466[var35];
                                            }
                                            if (var11.field3496[var35] > 0) {
                                                boolean var40 = false;
                                                int var41 = var11.field3496[var35] - 1;
                                                boolean var42 = false;
                                                if (arg1 < var38 + 32 && arg9 > var38 && var39 + 32 > arg0 && arg6 > var39 || class114.field2526 == var11 && class88.field1866 == var35) {
                                                    class29 var43;
                                                    if (class135.field2936 == 1 && client.field532 == var35 && class123.field2733 == var11.field3514) {
                                                        var43 = class153.method1180(var41, 2, false, 0, var11.field3450[var35], (byte) -96);
                                                    } else {
                                                        var43 = class153.method1180(var41, 1, false, 3153952, var11.field3450[var35], (byte) -96);
                                                    }
                                                    if (var43 == null) {
                                                        class138.method1092(0, var11);
                                                    } else if (class114.field2526 == var11 && class88.field1866 == var35) {
                                                        int var44 = class82.field1754 - class133.field2898;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class48.field992 - class60.field1178;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class24.field565 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method267(var38 + var44, var39 + var45, 128);
                                                        if (arg2 != -1) {
                                                            class154 var46 = arg5[arg2 & 0xFFFF];
                                                            if (class140.field3047 > var39 + var45 && var46.field3417 > 0) {
                                                                int var47 = (class140.field3047 - var39 - var45) * class139.field3042 / 3;
                                                                if (var47 > class139.field3042 * 10) {
                                                                    var47 = class139.field3042 * 10;
                                                                }
                                                                if (var46.field3417 < var47) {
                                                                    var47 = var46.field3417;
                                                                }
                                                                class60.field1178 += var47;
                                                                var46.field3417 -= var47;
                                                                class138.method1092(0, var46);
                                                            }
                                                            if (var45 + var39 + 32 > class140.field3052 && var46.field3425 - var46.field3382 > var46.field3417) {
                                                                int var48 = (var39 + var45 + 32 - class140.field3052) * class139.field3042 / 3;
                                                                if (var48 > class139.field3042 * 10) {
                                                                    var48 = class139.field3042 * 10;
                                                                }
                                                                if (var48 > var46.field3425 - var46.field3382 - var46.field3417) {
                                                                    var48 = var46.field3425 - var46.field3382 - var46.field3417;
                                                                }
                                                                class60.field1178 -= var48;
                                                                var46.field3417 += var48;
                                                                class138.method1092(0, var46);
                                                            }
                                                        }
                                                    } else if (class35.field786 == var11 && class110.field2347 == var35) {
                                                        var43.method267(var38, var39, 128);
                                                    } else {
                                                        var43.method279(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field3471 != null && var35 < 20) {
                                                class29 var49 = var11.method1192(var35, true);
                                                if (var49 != null) {
                                                    var49.method279(var38, var39);
                                                } else if (class120.field2665) {
                                                    class138.method1092(0, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field3476 == 3) {
                                    int var50;
                                    if (class20.method204(var11, (byte) -85)) {
                                        var50 = var11.field3486;
                                        if (class4.field81 == var11 && var11.field3381 != 0) {
                                            var50 = var11.field3381;
                                        }
                                    } else {
                                        var50 = var11.field3439;
                                        if (class4.field81 == var11 && var11.field3431 != 0) {
                                            var50 = var11.field3431;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3391) {
                                            class140.method1118(var13, var14, var11.field3427, var11.field3382, var50);
                                        } else {
                                            class140.method1115(var13, var14, var11.field3427, var11.field3382, var50);
                                        }
                                    } else if (var11.field3391) {
                                        class140.method1100(var13, var14, var11.field3427, var11.field3382, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class140.method1108(var13, var14, var11.field3427, var11.field3382, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3476 == 4) {
                                    class159 var51 = var11.method1193((byte) 93);
                                    if (var51 != null) {
                                        class109 var52 = var11.field3451;
                                        int var53;
                                        if (class20.method204(var11, (byte) -115)) {
                                            var53 = var11.field3486;
                                            if (class4.field81 == var11 && var11.field3381 != 0) {
                                                var53 = var11.field3381;
                                            }
                                            if (var11.field3435.method898((byte) 127) > 0) {
                                                var52 = var11.field3435;
                                            }
                                        } else {
                                            var53 = var11.field3439;
                                            if (class4.field81 == var11 && var11.field3431 != 0) {
                                                var53 = var11.field3431;
                                            }
                                        }
                                        if (var11.field3473 && var11.field3386 != -1) {
                                            class112 var54 = class4.method43((byte) 94, var11.field3386);
                                            var52 = var54.field2381;
                                            if (var52 == null) {
                                                var52 = class147.field3216;
                                            }
                                            if ((var54.field2399 == 1 || var11.field3474 != 1) && var11.field3474 != -1) {
                                                var52 = class44.method405(new class109[] { class52.field1071, var52, class125.field2767, class23.method223(var11.field3474, (byte) 48) }, (byte) -74);
                                            }
                                        }
                                        if (class121.field2679 == var11) {
                                            var52 = class153.field3362;
                                            var53 = var11.field3439;
                                        }
                                        if (!var11.field3473) {
                                            var52 = class78.method622(var11, var52, (byte) -128);
                                        }
                                        var51.method564(var52, var13, var14, var11.field3427, var11.field3382, var53, var11.field3434 ? 0 : -1, var11.field3457, var11.field3449, var11.field3409);
                                    } else if (class120.field2665) {
                                        class138.method1092(0, var11);
                                    }
                                } else if (var11.field3476 == 5) {
                                    if (var11.field3473) {
                                        class29 var55;
                                        if (var11.field3386 == -1) {
                                            var55 = var11.method1186(arg4 + 2147483552, false);
                                        } else {
                                            var55 = class153.method1180(var11.field3386, var11.field3515, false, var11.field3509, var11.field3474, (byte) -96);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field665;
                                            int var57 = var55.field662;
                                            if (var11.field3442) {
                                                class140.method1106(var13, var14, var11.field3427 + var13, var11.field3382 + var14);
                                                int var59 = (var56 + var11.field3382 - 1) / var56;
                                                int var60 = (var11.field3427 + var57 - 1) / var57;
                                                for (int var61 = 0; var61 < var60; var61++) {
                                                    for (int var62 = 0; var62 < var59; var62++) {
                                                        if (var11.field3484 != 0) {
                                                            var55.method255(var57 * var61 + var57 / 2 + var13, var56 / 2 + var56 * var62 + var14, var11.field3484, 4096);
                                                        } else if (var15 == 0) {
                                                            var55.method279(var57 * var61 + var13, var56 * var62 + var14);
                                                        } else {
                                                            var55.method267(var57 * var61 + var13, var56 * var62 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class140.method1110(arg1, arg0, arg9, arg6);
                                            } else {
                                                int var58 = var11.field3427 * 4096 / var57;
                                                if (var11.field3484 != 0) {
                                                    var55.method255(var11.field3427 / 2 + var13, var11.field3382 / 2 + var14, var11.field3484, var58);
                                                } else if (var15 != 0) {
                                                    var55.method272(var13, var14, var11.field3427, var11.field3382, 256 - (var15 & 0xFF));
                                                } else if (var11.field3427 == var57 && var11.field3382 == var56) {
                                                    var55.method279(var13, var14);
                                                } else {
                                                    var55.method260(var13, var14, var11.field3427, var11.field3382);
                                                }
                                            }
                                        } else if (class120.field2665) {
                                            class138.method1092(0, var11);
                                        }
                                    } else {
                                        class29 var63 = var11.method1186(Integer.MIN_VALUE, class20.method204(var11, (byte) -105));
                                        if (var63 != null) {
                                            var63.method279(var13, var14);
                                        } else if (class120.field2665) {
                                            class138.method1092(0, var11);
                                        }
                                    }
                                } else if (var11.field3476 == 6) {
                                    boolean var64 = class20.method204(var11, (byte) -89);
                                    class155 var65 = null;
                                    int var66 = 0;
                                    int var67;
                                    if (var64) {
                                        var67 = var11.field3480;
                                    } else {
                                        var67 = var11.field3479;
                                    }
                                    if (var11.field3386 != -1) {
                                        class112 var69 = class4.method43((byte) 94, var11.field3386);
                                        if (var69 != null) {
                                            class112 var70 = var69.method922(105, var11.field3474);
                                            var65 = var70.method923(1, (byte) 76);
                                            if (var65 == null) {
                                                class138.method1092(0, var11);
                                            } else {
                                                var65.method1208();
                                                var66 = var65.field1780 / 2;
                                            }
                                        }
                                    } else if (var11.field3433 == 5) {
                                        if (var11.field3505 == 0) {
                                            var65 = class16.field405.method160(-1, -1, null, null, (byte) -77);
                                        } else {
                                            var65 = class136.field2975.method16(arg4 ^ 0x2582);
                                        }
                                    } else if (var67 == -1) {
                                        var65 = var11.method1188(-1, null, var64, class136.field2975.field1025, 12047);
                                        if (var65 == null && class120.field2665) {
                                            class138.method1092(0, var11);
                                        }
                                    } else {
                                        class6 var68 = class27.method238(8, var67);
                                        var65 = var11.method1188(var11.field3504, var68, var64, class136.field2975.field1025, 12047);
                                        if (var65 == null && class120.field2665) {
                                            class138.method1092(arg4 ^ 0x60, var11);
                                        }
                                    }
                                    class105.method844(var13 + var11.field3427 / 2, var11.field3382 / 2 + var14);
                                    int var71 = class105.field2221[var11.field3503] * var11.field3494 >> 16;
                                    int var72 = class105.field2210[var11.field3503] * var11.field3494 >> 16;
                                    if (var65 != null) {
                                        if (var11.field3473) {
                                            var65.method1208();
                                            if (var11.field3383) {
                                                var65.method1204(0, var11.field3475, var11.field3469, var11.field3503, var11.field3464, var66 + var71 + var11.field3487, var11.field3487 + var72, var11.field3494);
                                            } else {
                                                var65.method1211(0, var11.field3475, var11.field3469, var11.field3503, var11.field3464, var66 + var71 + var11.field3487, var11.field3487 + var72);
                                            }
                                        } else {
                                            var65.method1211(0, var11.field3475, 0, var11.field3503, 0, var71, var72);
                                        }
                                    }
                                    class105.method854();
                                } else {
                                    if (var11.field3476 == 7) {
                                        class159 var73 = var11.method1193((byte) 94);
                                        if (var73 == null) {
                                            if (class120.field2665) {
                                                class138.method1092(0, var11);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field3382; var75++) {
                                            for (int var76 = 0; var76 < var11.field3427; var76++) {
                                                if (var11.field3496[var74] > 0) {
                                                    class112 var77 = class4.method43((byte) 94, var11.field3496[var74] - 1);
                                                    class109 var78;
                                                    if (var77.field2399 != 1 && var11.field3450[var74] == 1) {
                                                        var78 = class44.method405(new class109[] { class52.field1071, var77.field2381, class93.field1999 }, (byte) -74);
                                                    } else {
                                                        var78 = class44.method405(new class109[] { class52.field1071, var77.field2381, class125.field2767, class23.method223(var11.field3450[var74], (byte) 48) }, (byte) -74);
                                                    }
                                                    int var79 = (var11.field3420 + 12) * var75 + var14;
                                                    int var80 = (var11.field3407 + 115) * var76 + var13;
                                                    if (var11.field3457 == 0) {
                                                        var73.method558(var78, var80, var79, var11.field3439, var11.field3434 ? 0 : -1);
                                                    } else if (var11.field3457 == 1) {
                                                        var73.method545(var78, var11.field3427 / 2 + var80, var79, var11.field3439, var11.field3434 ? 0 : -1);
                                                    } else {
                                                        var73.method554(var78, var80 + var11.field3427 - 1, var79, var11.field3439, var11.field3434 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field3476 == 8 && class139.field3023 == var11 && class135.field2951 == class108.field2259) {
                                        int var81 = 0;
                                        class159 var82 = class151.field3319;
                                        int var83 = 0;
                                        class109 var84 = var11.field3451;
                                        class109 var85 = class78.method622(var11, var84, (byte) -126);
                                        while (var85.method898((byte) 121) > 0) {
                                            int var93 = var85.method896(class7.field173, -1);
                                            class109 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class131.field2866;
                                            } else {
                                                var94 = var85.method872(var93, 45, 0);
                                                var85 = var85.method897(false, var93 + 4);
                                            }
                                            int var95 = var82.method546(var94);
                                            if (var81 < var95) {
                                                var81 = var95;
                                            }
                                            var83 += var82.field1411 + 1;
                                        }
                                        var81 += 6;
                                        int var86 = var13 + var11.field3427 - var81 - 5;
                                        var83 += 7;
                                        if (var86 < var13 + 5) {
                                            var86 = var13 + 5;
                                        }
                                        int var87 = var11.field3382 + var14 + 5;
                                        if (arg9 < var81 + var86) {
                                            var86 = arg9 - var81;
                                        }
                                        if (var83 + var87 > arg6) {
                                            var87 = arg6 - var83;
                                        }
                                        class140.method1118(var86, var87, var81, var83, 16777120);
                                        class140.method1115(var86, var87, var81, var83, 0);
                                        class109 var88 = var11.field3451;
                                        int var89 = var82.field1411 + var87 + 2;
                                        class109 var90 = class78.method622(var11, var88, (byte) -126);
                                        while (var90.method898((byte) 122) > 0) {
                                            int var91 = var90.method896(class7.field173, arg4 - 97);
                                            class109 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class131.field2866;
                                            } else {
                                                var92 = var90.method872(var91, arg4 ^ 0xFFFFFFE2, 0);
                                                var90 = var90.method897(false, var91 + 4);
                                            }
                                            var82.method558(var92, var86 + 3, var89, 0, -1);
                                            var89 += var82.field1411 + 1;
                                        }
                                    }
                                    if (var11.field3476 == 9) {
                                        if (var11.field3513 == 1) {
                                            class140.method1109(var13, var14, var11.field3427 + var13, var14 - -var11.field3382, var11.field3439);
                                        } else {
                                            int var96 = var11.field3427 >= 0 ? var11.field3427 : -var11.field3427;
                                            int var97 = var11.field3382 >= 0 ? var11.field3382 : -var11.field3382;
                                            int var98 = var96;
                                            if (var96 < var97) {
                                                var98 = var97;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field3382 << 16) / var98;
                                                int var100 = (var11.field3427 << 16) / var98;
                                                if (var100 < var99) {
                                                    var99 = -var99;
                                                } else {
                                                    var100 = -var100;
                                                }
                                                int var101 = var11.field3513 * var99 >> 17;
                                                int var102 = var11.field3513 * var99 + 1 >> 17;
                                                int var103 = var11.field3513 * var100 + 1 >> 17;
                                                int var104 = var11.field3513 * var100 >> 17;
                                                int var105 = var13 + var101;
                                                int var106 = var13 - var102;
                                                int var107 = var11.field3427 + var13 - var102;
                                                int var108 = var11.field3427 + var13 + var101;
                                                int var109 = var14 + var104;
                                                int var110 = var14 - var103;
                                                int var111 = var11.field3382 + var14 - var103;
                                                int var112 = var11.field3382 + var104 + var14;
                                                class105.method839(var105, var106, var107);
                                                class105.method840(var109, var110, var111, var105, var106, var107, var11.field3439);
                                                class105.method839(var105, var107, var108);
                                                class105.method840(var109, var111, var112, var105, var107, var108, var11.field3439);
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

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        field697 = null;
        field692 = null;
        field691 = null;
        field695 = null;
        field698 = null;
        int var1 = -55 / ((arg0 - 23) / 61);
        field700 = null;
        field699 = null;
    }
}
