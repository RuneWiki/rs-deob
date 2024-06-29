import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 extends class119 {

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lvf;")
    public static class152 field2722 = new class152();

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "Lv;")
    public static class146 field2738 = class159.method1226((byte) -37, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Lv;")
    public static class146 field2739 = class159.method1226((byte) -37, "0(U");

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Lv;")
    public static class146 field2737 = class159.method1226((byte) -37, "Texturen geladen)3");

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public int field2731;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Lv;")
    public class146 field2726;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "[I")
    public int[] field2725;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "[I")
    public int[] field2733;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "[Lv;")
    public class146[] field2727;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static final void method895(int arg0) {
        class2.field27.method1050(true);
        if (arg0 != 1) {
            method896(true);
        }
        class12.field190.method1050(true);
        field2730++;
        class46.field1055.method1050(true);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    public static void method896(boolean arg0) {
        field2737 = null;
        if (arg0) {
            field2739 = null;
            field2738 = null;
            field2722 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[Lrd;I[III)V")
    public static final void method897(int[] arg0, class122[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        field2723++;
        if (arg5 != -1 || arg4 >= arg2) {
            return;
        }
        int var6 = arg4 - 1;
        int var7 = arg2 + 1;
        int var8 = (arg4 + arg2) / 2;
        class122 var9 = arg1[var8];
        arg1[var8] = arg1[arg4];
        arg1[arg4] = var9;
        while (var7 > var6) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg3[var11] == 2) {
                        var12 = arg1[var7].field2842;
                        var13 = var9.field2842;
                    } else if (arg3[var11] == 1) {
                        var13 = var9.field2847;
                        var12 = arg1[var7].field2847;
                        if (var12 == -1 && arg0[var11] == 1) {
                            var12 = 2001;
                        }
                        if (var13 == -1 && arg0[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg3[var11] == 3) {
                        var13 = var9.field2829 ? 1 : 0;
                        var12 = arg1[var7].field2829 ? 1 : 0;
                    } else {
                        var12 = arg1[var7].field2827;
                        var13 = var9.field2827;
                    }
                    if (var12 != var13) {
                        if ((arg0[var11] != 1 || var12 <= var13) && (arg0[var11] != 0 || var12 >= var13)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg3[var15] == 2) {
                        var17 = var9.field2842;
                        var16 = arg1[var6].field2842;
                    } else if (arg3[var15] == 1) {
                        var17 = var9.field2847;
                        if (var17 == -1 && arg0[var15] == 1) {
                            var17 = 2001;
                        }
                        var16 = arg1[var6].field2847;
                        if (var16 == -1 && arg0[var15] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var15] == 3) {
                        var17 = var9.field2829 ? 1 : 0;
                        var16 = arg1[var6].field2829 ? 1 : 0;
                    } else {
                        var16 = arg1[var6].field2827;
                        var17 = var9.field2827;
                    }
                    if (var16 != var17) {
                        if ((arg0[var15] != 1 || var16 >= var17) && (arg0[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 < var7) {
                class122 var18 = arg1[var6];
                arg1[var6] = arg1[var7];
                arg1[var7] = var18;
            }
        }
        method897(arg0, arg1, var7, arg3, arg4, arg5);
        method897(arg0, arg1, arg2, arg3, var7 + 1, -1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[Ldd;IIIBIII)V")
    public static final void method898(int arg0, int arg1, class26[] arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field2721++;
        class56.method387(arg9, arg0, arg7, arg3);
        class45.method304();
        if (arg6 != 104) {
            return;
        }
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class26 var11 = arg2[var10];
            if (var11 != null && (var11.field498 == arg5 || arg5 == -1412584499 && client.field340 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class49.field1131[class92.field2203] = var11.field438 + arg8;
                    class151.field3479[class92.field2203] = var11.field501 + arg4;
                    class159.field3647[class92.field2203] = var11.field543;
                    class35.field812[class92.field2203] = var11.field513;
                    var12 = class92.field2203++;
                } else {
                    var12 = arg1;
                }
                var11.field488 = class94.field2229;
                var11.field496 = var12;
                if (!var11.field510 || !class37.method246(-121, var11)) {
                    if (var11.field442 > 0) {
                        class91.method728(var11, -4375);
                    }
                    int var13 = var11.field501 + arg4;
                    int var14 = var11.field438 + arg8;
                    int var15 = var11.field460;
                    if (client.field340 == var11) {
                        if (arg5 != -1412584499 && !var11.field467) {
                            class34.field733 = arg4;
                            class82.field2003 = arg8;
                            class115.field2669 = arg2;
                            continue;
                        }
                        if (class8.field161 && class52.field1204) {
                            int var16 = class2.field45;
                            int var17 = var16 - class118.field2755;
                            int var18 = class151.field3491;
                            if (var17 < class66.field1484) {
                                var17 = class66.field1484;
                            }
                            if (class66.field1484 + class67.field1518.field543 < var11.field543 + var17) {
                                var17 = class66.field1484 + class67.field1518.field543 - var11.field543;
                            }
                            int var19 = var18 - class125.field2897;
                            var14 = var17;
                            if (class33.field707 > var19) {
                                var19 = class33.field707;
                            }
                            if (class33.field707 + class67.field1518.field513 < var19 - -var11.field513) {
                                var19 = class33.field707 + class67.field1518.field513 - var11.field513;
                            }
                            var13 = var19;
                        }
                        if (!var11.field467) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field479 == 2) {
                        var20 = arg9;
                        var21 = arg7;
                        var22 = arg0;
                        var23 = arg3;
                    } else if (var11.field479 == 9) {
                        int var24 = var14;
                        int var25 = var14 + var11.field543;
                        int var26 = var13;
                        int var27 = var11.field513 + var13;
                        if (var14 > var25) {
                            var24 = var25;
                            var25 = var14;
                        }
                        var25++;
                        var21 = var25 < arg7 ? var25 : arg7;
                        var20 = arg9 < var24 ? var24 : arg9;
                        if (var27 < var13) {
                            var26 = var27;
                            var27 = var13;
                        }
                        var22 = arg0 >= var26 ? arg0 : var26;
                        var27++;
                        var23 = arg3 <= var27 ? arg3 : var27;
                    } else {
                        var20 = var14 > arg9 ? var14 : arg9;
                        var22 = var13 > arg0 ? var13 : arg0;
                        int var30 = var11.field543 + var14;
                        int var31 = var11.field513 + var13;
                        var23 = var31 < arg3 ? var31 : arg3;
                        var21 = arg7 > var30 ? var30 : arg7;
                    }
                    if (!var11.field510 || var21 > var20 && var23 > var22) {
                        if (var11.field442 != 0) {
                            if (var11.field442 == 1337) {
                                class3.field79 = var13;
                                class38.field864 = var14;
                                class145.method1068(var11.field543, var13, var11.field513, var14, -1);
                                class56.method387(arg9, arg0, arg7, arg3);
                                continue;
                            }
                            if (var11.field442 == 1338) {
                                class32.method214(var12, var13, var14, arg6 ^ 0x6C);
                                class56.method387(arg9, arg0, arg7, arg3);
                                continue;
                            }
                        }
                        int var32 = class2.field45;
                        int var33 = class151.field3491;
                        if (!class38.field842 && var32 >= var20 && var22 <= var33 && var21 > var32 && var23 > var33) {
                            class113.method877(var32 - var14, -var13 + var33, var11, -1466);
                        }
                        if (var11.field479 == 0) {
                            if (!var11.field510 && class37.method246(-110, var11) && class48.field1110 != var11) {
                                continue;
                            }
                            if (!var11.field510) {
                                if (var11.field505 > var11.field491 - var11.field513) {
                                    var11.field505 = var11.field491 - var11.field513;
                                }
                                if (var11.field505 < 0) {
                                    var11.field505 = 0;
                                }
                            }
                            method898(var22, var12, arg2, var23, var13 - var11.field505, var11.field547, (byte) 104, var21, var14 - var11.field502, var20);
                            if (var11.field562 != null) {
                                method898(var22, var12, var11.field562, var23, var13 - var11.field505, var11.field547, (byte) 104, var21, var14 - var11.field502, var20);
                            }
                            class94 var34 = (class94) class51.field1159.method332((byte) -79, (long) var11.field547);
                            if (var34 != null) {
                                if (var34.field2233 == 0 && class2.field45 >= var20 && class151.field3491 >= var22 && var21 > class2.field45 && var23 > class151.field3491 && !class38.field842 && !class119.field2767) {
                                    class137.field3113[0] = class140.field3210;
                                    class74.field1720[0] = class158.field3633;
                                    class115.field2671[0] = 1002;
                                    class13.field208 = 1;
                                }
                                class54.method367(var14, var13, var34.field2225, var20, var12, var23, (byte) 127, var21, var22);
                            }
                            class56.method387(arg9, arg0, arg7, arg3);
                            class45.method304();
                        }
                        if (class26.field567[var12] || class17.field264 > 1) {
                            if (var11.field479 == 0 && !var11.field510 && var11.field491 > var11.field513) {
                                class24.method146(var11.field505, var11.field491, var13, (byte) 123, var11.field543 + var14, var11.field513);
                            }
                            if (var11.field479 != 1) {
                                if (var11.field479 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field513; var36++) {
                                        for (int var37 = 0; var37 < var11.field543; var37++) {
                                            int var38 = (var11.field469 + 32) * var37 + var14;
                                            int var39 = var13 + (var11.field552 + 32) * var36;
                                            if (var35 < 20) {
                                                var38 += var11.field452[var35];
                                                var39 += var11.field549[var35];
                                            }
                                            if (var11.field519[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var11.field519[var35] - 1;
                                                if (arg9 < var38 + 32 && var38 < arg7 && var39 + 32 > arg0 && var39 < arg3 || class28.field594 == var11 && class113.field2646 == var35) {
                                                    class61 var43;
                                                    if (class47.field1087 == 1 && class12.field189 == var35 && class155.field3544 == var11.field547) {
                                                        var43 = class1.method2(var11.field440[var35], 2, 0, arg6 - 72, false, var42);
                                                    } else {
                                                        var43 = class1.method2(var11.field440[var35], 1, 3153952, arg6 - 72, false, var42);
                                                    }
                                                    if (var43 == null) {
                                                        class75.method567((byte) 122, var11);
                                                    } else if (class28.field594 == var11 && class113.field2646 == var35) {
                                                        int var44 = class151.field3491 - class134.field3065;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        int var45 = class2.field45 - class51.field1155;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (class44.field984 < 5) {
                                                            var45 = 0;
                                                            var44 = 0;
                                                        }
                                                        var43.method434(var38 + var45, var39 + var44, 128);
                                                        if (arg5 != -1) {
                                                            class26 var46 = arg2[arg5 & 0xFFFF];
                                                            if (var39 + var44 < class56.field1266 && var46.field505 > 0) {
                                                                int var47 = (class56.field1266 - var39 - var44) * class1.field16 / 3;
                                                                if (var47 > class1.field16 * 10) {
                                                                    var47 = class1.field16 * 10;
                                                                }
                                                                if (var47 > var46.field505) {
                                                                    var47 = var46.field505;
                                                                }
                                                                var46.field505 -= var47;
                                                                class134.field3065 += var47;
                                                                class75.method567((byte) 122, var46);
                                                            }
                                                            if (class56.field1270 < var44 + var39 + 32 && var46.field491 - var46.field513 > var46.field505) {
                                                                int var48 = (var44 + var39 + 32 - class56.field1270) * class1.field16 / 3;
                                                                if (class1.field16 * 10 < var48) {
                                                                    var48 = class1.field16 * 10;
                                                                }
                                                                if (var48 > var46.field491 - var46.field513 - var46.field505) {
                                                                    var48 = var46.field491 - var46.field513 - var46.field505;
                                                                }
                                                                class134.field3065 -= var48;
                                                                var46.field505 += var48;
                                                                class75.method567((byte) 124, var46);
                                                            }
                                                        }
                                                    } else if (class147.field3405 == var11 && class125.field2896 == var35) {
                                                        var43.method434(var38, var39, 128);
                                                    } else {
                                                        var43.method423(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field554 != null && var35 < 20) {
                                                class61 var49 = var11.method179(-136, var35);
                                                if (var49 != null) {
                                                    var49.method423(var38, var39);
                                                } else if (class48.field1113) {
                                                    class75.method567((byte) 119, var11);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field479 == 3) {
                                    int var50;
                                    if (class2.method8(50, var11)) {
                                        var50 = var11.field570;
                                        if (class48.field1110 == var11 && var11.field443 != 0) {
                                            var50 = var11.field443;
                                        }
                                    } else {
                                        var50 = var11.field580;
                                        if (class48.field1110 == var11 && var11.field561 != 0) {
                                            var50 = var11.field561;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field569) {
                                            class56.method382(var14, var13, var11.field543, var11.field513, var50);
                                        } else {
                                            class56.method391(var14, var13, var11.field543, var11.field513, var50);
                                        }
                                    } else if (var11.field569) {
                                        class56.method384(var14, var13, var11.field543, var11.field513, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class56.method383(var14, var13, var11.field543, var11.field513, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field479 == 4) {
                                    class85 var51 = var11.method177((byte) 86);
                                    if (var51 != null) {
                                        class146 var52 = var11.field441;
                                        int var53;
                                        if (class2.method8(50, var11)) {
                                            var53 = var11.field570;
                                            if (class48.field1110 == var11 && var11.field443 != 0) {
                                                var53 = var11.field443;
                                            }
                                            if (var11.field482.method1080(-1) > 0) {
                                                var52 = var11.field482;
                                            }
                                        } else {
                                            var53 = var11.field580;
                                            if (class48.field1110 == var11 && var11.field561 != 0) {
                                                var53 = var11.field561;
                                            }
                                        }
                                        if (var11.field510 && var11.field485 != -1) {
                                            class59 var54 = class73.method524((byte) 67, var11.field485);
                                            var52 = var54.field1338;
                                            if (var52 == null) {
                                                var52 = class127.field2930;
                                            }
                                            if ((var54.field1344 == 1 || var11.field450 != 1) && var11.field450 != -1) {
                                                var52 = class71.method509(new class146[] { class66.field1486, var52, class148.field3440, class121.method917(-80, var11.field450) }, (byte) 83);
                                            }
                                        }
                                        if (class77.field1874 == var11) {
                                            var52 = class54.field1252;
                                            var53 = var11.field580;
                                        }
                                        if (!var11.field510) {
                                            var52 = class76.method573(var52, true, var11);
                                        }
                                        var51.method820(var52, var14, var13, var11.field543, var11.field513, var53, var11.field539 ? 0 : -1, var11.field568, var11.field503, var11.field489);
                                    } else if (class48.field1113) {
                                        class75.method567((byte) 114, var11);
                                    }
                                } else if (var11.field479 == 5) {
                                    if (var11.field510) {
                                        class61 var55;
                                        if (var11.field485 == -1) {
                                            var55 = var11.method182((byte) 70, false);
                                        } else {
                                            var55 = class1.method2(var11.field450, var11.field529, var11.field527, 32, false, var11.field485);
                                        }
                                        if (var55 != null) {
                                            int var56 = var55.field1415;
                                            int var57 = var55.field1416;
                                            if (var11.field447) {
                                                class56.method378(var14, var13, var11.field543 + var14, var11.field513 + var13);
                                                int var59 = (var56 + var11.field543 - 1) / var56;
                                                int var60 = (var57 + var11.field513 - 1) / var57;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var11.field521 != 0) {
                                                            var55.method440(var56 / 2 + var56 * var61 + var14, var57 / 2 + var57 * var62 + var13, var11.field521, 4096);
                                                        } else if (var15 == 0) {
                                                            var55.method423(var56 * var61 + var14, var13 - -(var57 * var62));
                                                        } else {
                                                            var55.method434(var14 + var56 * var61, var57 * var62 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class56.method387(arg9, arg0, arg7, arg3);
                                            } else {
                                                int var58 = var11.field543 * 4096 / var56;
                                                if (var11.field521 != 0) {
                                                    var55.method440(var11.field543 / 2 + var14, var11.field513 / 2 + var13, var11.field521, var58);
                                                } else if (var15 != 0) {
                                                    var55.method437(var14, var13, var11.field543, var11.field513, 256 - (var15 & 0xFF));
                                                } else if (var11.field543 == var56 && var11.field513 == var57) {
                                                    var55.method423(var14, var13);
                                                } else {
                                                    var55.method425(var14, var13, var11.field543, var11.field513);
                                                }
                                            }
                                        } else if (class48.field1113) {
                                            class75.method567((byte) 112, var11);
                                        }
                                    } else {
                                        class61 var63 = var11.method182((byte) 70, class2.method8(50, var11));
                                        if (var63 != null) {
                                            var63.method423(var14, var13);
                                        } else if (class48.field1113) {
                                            class75.method567((byte) 115, var11);
                                        }
                                    }
                                } else if (var11.field479 == 6) {
                                    boolean var64 = class2.method8(50, var11);
                                    int var65 = 0;
                                    int var66;
                                    if (var64) {
                                        var66 = var11.field563;
                                    } else {
                                        var66 = var11.field530;
                                    }
                                    class139 var67 = null;
                                    if (var11.field485 != -1) {
                                        class59 var68 = class73.method524((byte) 86, var11.field485);
                                        if (var68 != null) {
                                            class59 var69 = var68.method410(true, var11.field450);
                                            var67 = var69.method403((byte) -64, 1);
                                            if (var67 == null) {
                                                class75.method567((byte) 113, var11);
                                            } else {
                                                var67.method1031();
                                                var65 = var67.field1488 / 2;
                                            }
                                        }
                                    } else if (var11.field577 == 5) {
                                        if (var11.field551 == 0) {
                                            var67 = class103.field2503.method283(false, null, null, -1, -1);
                                        } else {
                                            var67 = class116.field2696.method255((byte) -105);
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var11.method183(-1, class116.field2696.field1537, var64, 3407, null);
                                        if (var67 == null && class48.field1113) {
                                            class75.method567((byte) 116, var11);
                                        }
                                    } else {
                                        class72 var70 = class141.method1052(true, var66);
                                        var67 = var11.method183(var11.field556, class116.field2696.field1537, var64, 3407, var70);
                                        if (var67 == null && class48.field1113) {
                                            class75.method567((byte) 118, var11);
                                        }
                                    }
                                    class45.method303(var14 + var11.field543 / 2, var11.field513 / 2 + var13);
                                    int var71 = class45.field1030[var11.field534] * var11.field523 >> 16;
                                    int var72 = class45.field1032[var11.field534] * var11.field523 >> 16;
                                    if (var67 != null) {
                                        if (var11.field510) {
                                            var67.method1031();
                                            if (var11.field456) {
                                                var67.method1028(0, var11.field470, var11.field486, var11.field534, var11.field536, var65 + var71 + var11.field571, var11.field571 + var72, var11.field523);
                                            } else {
                                                var67.method1036(0, var11.field470, var11.field486, var11.field534, var11.field536, var71 + var65 + var11.field571, var11.field571 + var72);
                                            }
                                        } else {
                                            var67.method1036(0, var11.field470, 0, var11.field534, 0, var71, var72);
                                        }
                                    }
                                    class45.method299();
                                } else {
                                    if (var11.field479 == 7) {
                                        class85 var73 = var11.method177((byte) 86);
                                        if (var73 == null) {
                                            if (class48.field1113) {
                                                class75.method567((byte) 121, var11);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field513; var75++) {
                                            for (int var76 = 0; var76 < var11.field543; var76++) {
                                                if (var11.field519[var74] > 0) {
                                                    class59 var77 = class73.method524((byte) 127, var11.field519[var74] - 1);
                                                    class146 var78;
                                                    if (var77.field1344 != 1 && var11.field440[var74] == 1) {
                                                        var78 = class71.method509(new class146[] { class66.field1486, var77.field1338, class13.field222 }, (byte) 120);
                                                    } else {
                                                        var78 = class71.method509(new class146[] { class66.field1486, var77.field1338, class148.field3440, class121.method917(80, var11.field440[var74]) }, (byte) 83);
                                                    }
                                                    int var79 = var14 + (var11.field469 + 115) * var76;
                                                    int var80 = (var11.field552 + 12) * var75 + var13;
                                                    if (var11.field568 == 0) {
                                                        var73.method827(var78, var79, var80, var11.field580, var11.field539 ? 0 : -1);
                                                    } else if (var11.field568 == 1) {
                                                        var73.method806(var78, var11.field543 / 2 + var79, var80, var11.field580, var11.field539 ? 0 : -1);
                                                    } else {
                                                        var73.method824(var78, var11.field543 + var79 - 1, var80, var11.field580, var11.field539 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field479 == 8 && class77.field1873 == var11 && class47.field1085 == class143.field3276) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class85 var83 = class115.field2670;
                                        class146 var84 = var11.field441;
                                        class146 var85 = class76.method573(var84, true, var11);
                                        while (var85.method1080(arg6 ^ 0xFFFFFF97) > 0) {
                                            int var93 = var85.method1090(class115.field2676, 0);
                                            class146 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class158.field3633;
                                            } else {
                                                var94 = var85.method1105(var93, -119, 0);
                                                var85 = var85.method1103(true, var93 + 4);
                                            }
                                            int var95 = var83.method811(var94);
                                            var82 += var83.field2412 + 1;
                                            if (var81 < var95) {
                                                var81 = var95;
                                            }
                                        }
                                        int var86 = var13 + var11.field513 + 5;
                                        var81 += 6;
                                        int var87 = var14 + var11.field543 - var81 - 5;
                                        if (var87 < var14 + 5) {
                                            var87 = var14 + 5;
                                        }
                                        var82 += 7;
                                        if (var86 + var82 > arg3) {
                                            var86 = arg3 - var82;
                                        }
                                        if (var81 + var87 > arg7) {
                                            var87 = arg7 - var81;
                                        }
                                        class56.method382(var87, var86, var81, var82, 16777120);
                                        class56.method391(var87, var86, var81, var82, 0);
                                        int var88 = var86 + var83.field2412 + 2;
                                        class146 var89 = var11.field441;
                                        class146 var90 = class76.method573(var89, true, var11);
                                        while (var90.method1080(-1) > 0) {
                                            int var91 = var90.method1090(class115.field2676, 0);
                                            class146 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class158.field3633;
                                            } else {
                                                var92 = var90.method1105(var91, -58, 0);
                                                var90 = var90.method1103(true, var91 + 4);
                                            }
                                            var83.method827(var92, var87 + 3, var88, 0, -1);
                                            var88 += var83.field2412 + 1;
                                        }
                                    }
                                    if (var11.field479 == 9) {
                                        if (var11.field466 == 1) {
                                            class56.method388(var14, var13, var14 + var11.field543, var11.field513 + var13, var11.field580);
                                        } else {
                                            int var96 = var11.field543 < 0 ? -var11.field543 : var11.field543;
                                            int var97 = var11.field513 >= 0 ? var11.field513 : -var11.field513;
                                            int var98 = var96;
                                            if (var96 < var97) {
                                                var98 = var97;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field543 << 16) / var98;
                                                int var100 = (var11.field513 << 16) / var98;
                                                if (var99 < var100) {
                                                    var100 = -var100;
                                                } else {
                                                    var99 = -var99;
                                                }
                                                int var101 = var11.field466 * var100 >> 17;
                                                int var102 = var11.field466 * var100 + 1 >> 17;
                                                int var103 = var11.field466 * var99 >> 17;
                                                int var104 = var11.field466 * var99 + 1 >> 17;
                                                int var105 = var14 + var101;
                                                int var106 = var14 + var11.field543 - var102;
                                                int var107 = var11.field543 + var101 + var14;
                                                int var108 = var13 + var11.field513 - var104;
                                                int var109 = var13 - var104;
                                                int var110 = var14 - var102;
                                                int var111 = var13 + var103;
                                                int var112 = var11.field513 + var13 + var103;
                                                class45.method297(var105, var110, var106);
                                                class45.method315(var111, var109, var108, var105, var110, var106, var11.field580);
                                                class45.method297(var105, var106, var107);
                                                class45.method315(var111, var108, var112, var105, var106, var107, var11.field580);
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

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method899(int arg0) {
        if (arg0 == 5) {
            field2732++;
            class72.field1674.method1050(true);
        }
    }
}
