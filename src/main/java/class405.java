import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class405 extends class81 {

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field5596;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[I")
    public static int[] field5609;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Lwn;")
    public static class77 field5600;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "Lwn;")
    public static class77 field5613;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "[Lip;")
    public static class49[] field5601;

    static {
        new class368("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5606 = 0;
        field5609 = new int[1000];
        new class368("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field5611 = 0;
        field5610 = 0;
        field5612 = 2;
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V", line = 4)
    public static void method2498(int arg0) {
        field5609 = null;
        field5613 = null;
        field5601 = null;
        if (arg0 > -79) {
            method2505((byte) -7);
        }
        field5600 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lbm;IIIIIZIIIILea;Z)V", line = 17)
    public static final void method2499(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, class58 arg11, boolean arg12) {
        field5608++;
        if (!class397.method2461(-123) && !class227.method1483(-21801, arg8, arg10, class367.field5096, arg1)) {
            return;
        }
        if (arg8 < class56.field733) {
            class56.field733 = arg8;
        }
        class447 var13 = class133.method996((byte) -19, arg4);
        if (class22.field284 == 1 && var13.field6304) {
            return;
        }
        int var14;
        int var15;
        if (arg2 == 1 || arg2 == 3) {
            var15 = var13.field6322;
            var14 = var13.field6330;
        } else {
            var14 = var13.field6322;
            var15 = var13.field6330;
        }
        int var16;
        int var17;
        if (arg10 + var15 <= class11.field107) {
            var16 = (var15 + 1 >> 1) + arg10;
            var17 = arg10 + (var15 >> 1);
        } else {
            var16 = arg10 + 1;
            var17 = arg10;
        }
        int var18;
        int var19;
        if ((arg1 + var14) <= class264.field3620) {
            var18 = (var14 + 1 >> 1) + arg1;
            var19 = arg1 + (var14 >> 1);
        } else {
            var19 = arg1;
            var18 = arg1 + 1;
        }
        class323 var20 = class436.field6160[arg5];
        int var21 = var20.method329(var17, var19) - (-var20.method329(var16, var19) - (var20.method329(var17, var18) + var20.method329(var16, var18))) >> 2;
        int var22 = (arg10 << 7) + (var15 << 6);
        int var23 = (arg1 << 7) + (var14 << 6);
        boolean var24 = arg12 && !arg6 && var13.field6291;
        if (var13.method2767(14533)) {
            class48.method392(var13, -6024, arg2, arg1, (class423) null, (class419) null, arg10, arg8);
        }
        boolean var25 = arg9 == -1 && var13.field6264 == -1 && var13.field6286 == null && var13.field6307 == null && !var13.field6342;
        if (class429.field5984 && var13.field6287 != 1) {
            return;
        }
        if (arg7 == 22) {
            if (class441.field6201 || var13.field6297 != 0 || var13.field6337 == 1 || var13.field6310) {
                class301 var26;
                if (var25) {
                    class229 var27 = new class229(arg11, var13, arg5, var22, var21, var23, arg6, arg2, var24);
                    if (var27.method706(true)) {
                        var27.method698((byte) -87, arg11);
                    }
                    var26 = var27;
                } else {
                    var26 = new class273(arg11, var13, arg2, arg8, arg5, var22, var21, var23, arg6, arg9);
                }
                class253.method1625(arg8, arg10, arg1, var26);
                if (var13.field6337 == 1 && arg0 != null) {
                    arg0.method1977(arg10, true, arg1);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class163 var65 = null;
            int var66;
            class5 var67;
            if (var25) {
                class163 var68 = new class163(arg11, var13, arg8, arg5, var22, var21, var23, arg6, arg10, arg10 + var15 - 1, arg1, arg1 + var14 - 1, arg7, arg2, var24);
                var67 = var68;
                var66 = var68.method1176(-117);
                var65 = var68;
            } else {
                var66 = 15;
                var67 = new class409(arg11, var13, arg7, arg2, arg8, arg5, var22, var21, var23, arg6, arg10, arg10 + var15 - 1, arg1, arg1 + var14 - 1, arg9);
            }
            if (class147.method1064(var67, false)) {
                if (var65 != null && var65.method706(true)) {
                    var65.method698((byte) -78, arg11);
                }
                if (var13.field6343 && arg12) {
                    if (var66 > 30) {
                        var66 = 30;
                    }
                    for (int var69 = 0; var69 <= var15; var69++) {
                        for (int var70 = 0; var70 <= var14; var70++) {
                            var20.method335(arg10 + var69, arg1 + var70, var66);
                        }
                    }
                }
            }
            if (var13.field6337 != 0 && arg0 != null) {
                arg0.method1983(var13.field6292, !var13.field6283, var15, arg1, 12298, var14, arg10);
            }
        } else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
            class5 var29;
            if (var25) {
                class163 var28 = new class163(arg11, var13, arg8, arg5, var22, var21, var23, arg6, arg10, arg10 + var15 - 1, arg1, arg1 + var14 - 1, arg7, arg2, var24);
                var29 = var28;
                if (var28.method706(true)) {
                    var28.method698((byte) -96, arg11);
                }
            } else {
                var29 = new class409(arg11, var13, arg7, arg2, arg8, arg5, var22, var21, var23, arg6, arg10, arg10 + var15 - 1, arg1, arg1 + var14 - 1, arg9);
            }
            class147.method1064(var29, false);
            if (arg12 && !arg6 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg8 > 0 && var13.field6287 != 0) {
                class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 4);
            }
            if (var13.field6337 != 0 && arg0 != null) {
                arg0.method1983(var13.field6292, !var13.field6283, var15, arg1, 12298, var14, arg10);
            }
        } else if (arg7 == 0) {
            class403 var30;
            if (var25) {
                class451 var31 = new class451(arg11, var13, arg5, var22, var21, var23, arg6, arg7, arg2, var24);
                if (var31.method706(true)) {
                    var31.method698((byte) 73, arg11);
                }
                var30 = var31;
            } else {
                var30 = new class88(arg11, var13, 0, arg2, arg8, arg5, var22, var21, var23, arg6, arg9);
            }
            class219.method1457(arg8, arg10, arg1, var30, (class403) null);
            if (arg12) {
                if (arg2 == 0) {
                    if (var13.field6343) {
                        var20.method335(arg10, arg1, 50);
                        var20.method335(arg10, arg1 + 1, 50);
                    }
                    if (var13.field6287 == 1 && !arg6) {
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 1);
                    }
                } else if (arg2 == 1) {
                    if (var13.field6343) {
                        var20.method335(arg10, arg1 + 1, 50);
                        var20.method335(arg10 + 1, arg1 - -1, 50);
                    }
                    if (var13.field6287 == 1 && !arg6) {
                        class436.field6155[arg8][arg10][arg1 + 1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1 + 1], 2);
                    }
                } else if (arg2 == 2) {
                    if (var13.field6343) {
                        var20.method335(arg10 + 1, arg1, 50);
                        var20.method335(arg10 + 1, arg1 + 1, 50);
                    }
                    if (var13.field6287 == 1 && !arg6) {
                        class436.field6155[arg8][arg10 + 1][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10 + 1][arg1], 1);
                    }
                } else if (arg2 == 3) {
                    if (var13.field6343) {
                        var20.method335(arg10, arg1, 50);
                        var20.method335(arg10 + 1, arg1, 50);
                    }
                    if (var13.field6287 == 1 && !arg6) {
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 2);
                    }
                }
            }
            if (var13.field6337 != 0 && arg0 != null) {
                arg0.method1984(1, arg2, arg1, var13.field6292, arg10, arg7, !var13.field6283);
            }
            if (var13.field6270 != 16) {
                class451.method2818(arg8, arg10, arg1, var13.field6270);
            }
        } else if (arg3 == 5000) {
            if (arg7 == 1) {
                class403 var33;
                if (var25) {
                    class451 var32 = new class451(arg11, var13, arg5, var22, var21, var23, arg6, arg7, arg2, var24);
                    if (var32.method706(true)) {
                        var32.method698((byte) 79, arg11);
                    }
                    var33 = var32;
                } else {
                    var33 = new class88(arg11, var13, 1, arg2, arg8, arg5, var22, var21, var23, arg6, arg9);
                }
                class219.method1457(arg8, arg10, arg1, var33, (class403) null);
                if (var13.field6343 && arg12) {
                    if (arg2 == 0) {
                        var20.method335(arg10, arg1 + 1, 50);
                    } else if (arg2 == 1) {
                        var20.method335(arg10 + 1, arg1 + 1, 50);
                    } else if (arg2 == 2) {
                        var20.method335(arg10 + 1, arg1, 50);
                    } else if (arg2 == 3) {
                        var20.method335(arg10, arg1, 50);
                    }
                }
                if (var13.field6337 != 0 && arg0 != null) {
                    arg0.method1984(1, arg2, arg1, var13.field6292, arg10, arg7, !var13.field6283);
                }
            } else if (arg7 == 2) {
                int var34 = arg2 + 1 & 0x3;
                class403 var35;
                class403 var36;
                if (var25) {
                    class451 var37 = new class451(arg11, var13, arg5, var22, var21, var23, arg6, arg7, arg2 + 4, var24);
                    class451 var38 = new class451(arg11, var13, arg5, var22, var21, var23, arg6, arg7, var34, var24);
                    if (var37.method706(true)) {
                        var37.method698((byte) 77, arg11);
                    }
                    var35 = var37;
                    var36 = var38;
                    if (var38.method706(true)) {
                        var38.method698((byte) 110, arg11);
                    }
                } else {
                    var35 = new class88(arg11, var13, 2, arg2 + 4, arg8, arg5, var22, var21, var23, arg6, arg9);
                    var36 = new class88(arg11, var13, 2, var34, arg8, arg5, var22, var21, var23, arg6, arg9);
                }
                class219.method1457(arg8, arg10, arg1, var35, var36);
                if (var13.field6287 == 1 && arg12 && !arg6) {
                    if (arg2 == 0) {
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 1);
                        class436.field6155[arg8][arg10][arg1 + 1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1 + 1], 2);
                    } else if (arg2 == 1) {
                        class436.field6155[arg8][arg10][arg1 + 1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1 + 1], 2);
                        class436.field6155[arg8][arg10 + 1][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10 + 1][arg1], 1);
                    } else if (arg2 == 2) {
                        class436.field6155[arg8][arg10 + 1][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10 + 1][arg1], 1);
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 2);
                    } else if (arg2 == 3) {
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 2);
                        class436.field6155[arg8][arg10][arg1] = (byte) class431.method2655(class436.field6155[arg8][arg10][arg1], 1);
                    }
                }
                if (var13.field6337 != 0 && arg0 != null) {
                    arg0.method1984(arg3 ^ 0x1389, arg2, arg1, var13.field6292, arg10, arg7, !var13.field6283);
                }
                if (var13.field6270 != 16) {
                    class451.method2818(arg8, arg10, arg1, var13.field6270);
                }
            } else if (arg7 == 3) {
                class403 var39;
                if (var25) {
                    class451 var40 = new class451(arg11, var13, arg5, var22, var21, var23, arg6, arg7, arg2, var24);
                    if (var40.method706(true)) {
                        var40.method698((byte) 95, arg11);
                    }
                    var39 = var40;
                } else {
                    var39 = new class88(arg11, var13, 3, arg2, arg8, arg5, var22, var21, var23, arg6, arg9);
                }
                class219.method1457(arg8, arg10, arg1, var39, (class403) null);
                if (var13.field6343 && arg12) {
                    if (arg2 == 0) {
                        var20.method335(arg10, arg1 + 1, 50);
                    } else if (arg2 == 1) {
                        var20.method335(arg10 + 1, arg1 + 1, 50);
                    } else if (arg2 == 2) {
                        var20.method335(arg10 + 1, arg1, 50);
                    } else if (arg2 == 3) {
                        var20.method335(arg10, arg1, 50);
                    }
                }
                if (var13.field6337 != 0 && arg0 != null) {
                    arg0.method1984(1, arg2, arg1, var13.field6292, arg10, arg7, !var13.field6283);
                }
            } else if (arg7 == 9) {
                class5 var41;
                if (var25) {
                    class163 var42 = new class163(arg11, var13, arg8, arg5, var22, var21, var23, arg6, arg10, arg10, arg1, arg1, arg7, arg2, var24);
                    var41 = var42;
                    if (var42.method706(true)) {
                        var42.method698((byte) 84, arg11);
                    }
                } else {
                    var41 = new class409(arg11, var13, arg7, arg2, arg8, arg5, var22, var21, var23, arg6, arg10, arg10 + var15 - 1, arg1, arg1 - (1 - var14), arg9);
                }
                class147.method1064(var41, false);
                if (var13.field6337 != 0 && arg0 != null) {
                    arg0.method1983(var13.field6292, !var13.field6283, var15, arg1, 12298, var14, arg10);
                }
                if (var13.field6270 != 16) {
                    class451.method2818(arg8, arg10, arg1, var13.field6270);
                }
            } else if (arg7 == 4) {
                class371 var44;
                if (var25) {
                    class359 var43 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, 0, 0, 0, arg7, arg2);
                    var44 = var43;
                    if (var43.method706(true)) {
                        var43.method698((byte) -103, arg11);
                    }
                } else {
                    var44 = new class106(arg11, var13, arg7, arg2, arg8, arg5, var22, var21, var23, arg6, 0, 0, 0, arg9);
                }
                class359.method2216(arg8, arg10, arg1, var44, (class371) null);
            } else if (arg7 == 5) {
                int var45 = 16;
                class223 var46 = (class223) class243.method1587(arg8, arg10, arg1);
                if (var46 != null) {
                    var45 = class133.method996((byte) -19, var46.method711(true)).field6270;
                }
                class371 var47;
                if (var25) {
                    class359 var48 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, 0, class95.field1318[arg2] * var45, class351.field4721[arg2] * var45, arg7, arg2);
                    if (var48.method706(true)) {
                        var48.method698((byte) -76, arg11);
                    }
                    var47 = var48;
                } else {
                    var47 = new class106(arg11, var13, arg7, arg2, arg8, arg5, var22, var21, var23, arg6, 0, class95.field1318[arg2] * var45, class351.field4721[arg2] * var45, arg9);
                }
                class359.method2216(arg8, arg10, arg1, var47, (class371) null);
            } else if (arg7 == 6) {
                int var49 = 8;
                class223 var50 = (class223) class243.method1587(arg8, arg10, arg1);
                if (var50 != null) {
                    var49 = class133.method996((byte) -19, var50.method711(true)).field6270 / 2;
                }
                class371 var51;
                if (var25) {
                    class359 var52 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, arg2, class95.field1318[arg2] * var49, class351.field4721[arg2] * var49, arg7, arg2 + 4);
                    var51 = var52;
                    if (var52.method706(true)) {
                        var52.method698((byte) -46, arg11);
                    }
                } else {
                    var51 = new class106(arg11, var13, arg7, arg2 + 4, arg8, arg5, var22, var21, var23, arg6, arg2, class10.field80[arg2] * var49, class366.field5082[arg2] * var49, arg9);
                }
                class359.method2216(arg8, arg10, arg1, var51, (class371) null);
            } else if (arg7 == 7) {
                int var53 = arg2 + 2 & 0x3;
                class371 var54;
                if (var25) {
                    class359 var55 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, var53, 0, 0, arg7, var53 + 4);
                    if (var55.method706(true)) {
                        var55.method698((byte) -83, arg11);
                    }
                    var54 = var55;
                } else {
                    var54 = new class106(arg11, var13, arg7, var53 + 4, arg8, arg5, var22, var21, var23, arg6, var53, 0, 0, arg9);
                }
                class359.method2216(arg8, arg10, arg1, var54, (class371) null);
            } else if (arg7 == 8) {
                int var56 = arg2 + 2 & 0x3;
                int var57 = 8;
                class223 var58 = (class223) class243.method1587(arg8, arg10, arg1);
                if (var58 != null) {
                    var57 = class133.method996((byte) -19, var58.method711(true)).field6270 / 2;
                }
                class371 var61;
                class371 var62;
                if (var25) {
                    class359 var63 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, arg2, class10.field80[arg2] * var57, class366.field5082[arg2] * var57, arg7, arg2 + 4);
                    class359 var64 = new class359(arg11, var13, arg5, var22, var21, var23, arg6, arg2, 0, 0, arg7, var56 + 4);
                    if (var63.method706(true)) {
                        var63.method698((byte) -108, arg11);
                    }
                    var62 = var64;
                    if (var64.method706(true)) {
                        var64.method698((byte) -88, arg11);
                    }
                    var61 = var63;
                } else {
                    class106 var59 = new class106(arg11, var13, arg7, arg2 + 4, arg8, arg5, var22, var21, var23, arg6, arg2, class10.field80[arg2] * var57, class366.field5082[arg2] * var57, arg9);
                    class106 var60 = new class106(arg11, var13, arg7, var56 + 4, arg8, arg5, var22, var21, var23, arg6, arg2, 0, 0, arg9);
                    var61 = var59;
                    var62 = var60;
                }
                class359.method2216(arg8, arg10, arg1, var61, var62);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V", line = 633)
    public static final void method2500(byte arg0, int arg1) {
        class72.field1047.method2531(arg1, 112);
        field5604++;
        class442.field6208.method2531(arg1, 112);
        if (arg0 >= -62) {
            field5600 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 646)
    public final Object method653(int arg0) {
        field5605++;
        if (arg0 != -1) {
            method2500((byte) -49, -12);
        }
        return this.field5596;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[ILbm;I[IIIIZIBIII)I", line = 659)
    public static final int method2501(int arg0, int arg1, int[] arg2, class325 arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, byte arg11, int arg12, int arg13, int arg14) {
        field5607++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class340.field4600[var15][var35] = 0;
                class34.field459[var15][var35] = 99999999;
            }
        }
        if (arg11 < 113) {
            method2502(-58, true, (class61) null, (String) null);
        }
        boolean var16;
        if (arg4 == 1) {
            var16 = class152.method1118(arg10, arg12, arg1, 127, arg14, arg8, arg3, arg6, arg13, arg7, arg0);
        } else if (arg4 == 2) {
            var16 = class65.method516(arg12, arg13, arg6, 512, arg1, arg7, arg0, arg14, arg10, arg8, arg3);
        } else {
            var16 = class71.method560(arg8, arg4, arg12, arg0, arg13, arg7, arg10, 0, arg3, arg1, arg6, arg14);
        }
        int var17 = arg1 - 64;
        int var18 = arg14 - 64;
        int var19 = class389.field5425;
        int var20 = class214.field3002;
        if (!var16) {
            if (!arg9) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg12 - var23; var24 <= arg12 + var23; var24++) {
                for (int var25 = arg10 - var23; var25 <= (arg10 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class34.field459[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg12) {
                            var28 = arg12 - var24;
                        } else if ((arg12 + arg7 - 1) < var24) {
                            var28 = var24 - (arg7 + arg12 - 1);
                        }
                        int var29 = 0;
                        if (arg10 > var25) {
                            var29 = arg10 - var25;
                        } else if (var25 > (arg8 + arg10 - 1)) {
                            var29 = 1 - (arg8 + arg10 - var25);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && var22 > class34.field459[var26][var27]) {
                            var22 = class34.field459[var26][var27];
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class196.field2841[var31] = var19;
        int var37 = var31 + 1;
        class215.field3010[var31] = var20;
        int var32;
        int var33 = var32 = class340.field4600[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg14 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class196.field2841[var37] = var19;
                class215.field3010[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class340.field4600[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg2[var34] = class196.field2841[var37];
            arg5[var34++] = class215.field3010[var37];
            if (var34 >= arg2.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZLok;Ljava/lang/String;)V", line = 842)
    public static final void method2502(int arg0, boolean arg1, class61 arg2, String arg3) {
        field5603++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class387.field5363.method2421(arg3, (class77[]) null, (byte) -88, 250);
        int var8 = class387.field5363.method2422(250, (class77[]) null, arg3, 173) * 13;
        class354.field4765.method245(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class354.field4765.method190(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg2.method490(-1, 1, arg3, -1, 0, var8, arg0, (int[]) null, var5, (byte) -125, (class165) null, (class77[]) null, var6, 0, 0, var7);
        class349.method2110(var5 - var4, var4 + var8 + var4, var4 + var7 + var4, -11514, -var4 + var6);
        if (arg1) {
            class354.field4765.method169();
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)Z", line = 867)
    public final boolean method654(byte arg0) {
        if (arg0 != 104) {
            field5613 = null;
        }
        field5599++;
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 878)
    public static final void method2503(int arg0, int arg1) {
        class408 var2 = class155.field2210;
        synchronized (class155.field2210) {
            class155.field2210.method2531(arg0, arg1 - 28040);
        }
        field5597++;
        if (arg1 != 28152) {
            method2499((class325) null, 62, 111, 36, 4, 64, false, 88, 38, 47, 82, (class58) null, true);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 901)
    public class405(Object arg0) {
        this.field5596 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)Lrr;", line = 910)
    public static final class200 method2504(int arg0, byte arg1) {
        if (arg1 >= -71) {
            field5609 = null;
        }
        field5602++;
        class200 var2 = (class200) class64.field883.method515(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field39.method1926(0, arg0, 11);
        class200 var4 = new class200();
        if (var3 != null) {
            var4.method1380(new class366(var3), (byte) 111);
        }
        class64.field883.method519((long) arg0, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V", line = 935)
    public static final void method2505(byte arg0) {
        if (class98.field1383 == 10 || class98.field1383 == 28) {
            class91.method719(class63.field874 >> 10, class375.field5213 >> 10, false, 5000);
        } else {
            class91.method719(class359.field4970.field2662[0] >> 3, class359.field4970.field2659[0] >> 3, false, 5000);
        }
        field5598++;
        class104.method790(16711680);
        int var1 = -20 % ((arg0 + 3) / 58);
        class101.method774(55);
        class117.method918(-64);
        class399.method2475((byte) 108);
    }
}
