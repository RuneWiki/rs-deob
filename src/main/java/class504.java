import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class504 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Z")
    public boolean field7050;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
    public static int[] field7048 = new int[1];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field7044 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lsp;")
    public class620 field7046;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lsp;")
    public class620 field7049;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
    public boolean field7043;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 3)
    public static void method2853(byte arg0) {
        if (arg0 != 52) {
            field7044 = -67;
        }
        field7048 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2854(int arg0, int arg1) {
        field7040++;
        class274.field4008 = arg0;
        class378.field5562 = arg1;
        class469.field6762 = -1;
        class173.method1192(588394986);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILgp;)V", line = 26)
    public static final void method2855(int arg0, class561 arg1) {
        class517.field7194 = arg1.method3195(0, "p11_full");
        field7045++;
        class97.field1697 = arg1.method3195(0, "p12_full");
        class404.field6021 = arg1.method3195(0, "b12_full");
        class559.field7929 = arg1.method3195(0, "hitmarks");
        class149.field2264 = arg1.method3195(0, "hitbar_default");
        class545.field7585 = arg1.method3195(0, "timerbar_default");
        class220.field3309 = arg1.method3195(0, "headicons_pk");
        class392.field5878 = arg1.method3195(0, "headicons_prayer");
        class186.field2696 = arg1.method3195(0, "hint_headicons");
        class475.field6801 = arg1.method3195(0, "hint_mapmarkers");
        class209.field2957 = arg1.method3195(0, "mapflag");
        class41.field568 = arg1.method3195(0, "cross");
        class474.field6798 = arg1.method3195(arg0 - 4095, "mapdots");
        class527.field7336 = arg1.method3195(arg0 ^ arg0, "scrollbar");
        class318.field4619 = arg1.method3195(0, "name_icons");
        class99.field1727 = arg1.method3195(arg0 ^ 0xFFF, "floorshadows");
        class552.field7823 = arg1.method3195(0, "compass");
        class234.field3446 = arg1.method3195(0, "otherlevel");
        class449.field6541 = arg1.method3195(0, "hint_mapedge");
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z", line = 52)
    public final boolean method2856(int arg0) {
        if (arg0 > -113) {
            this.field7046 = null;
        }
        field7042++;
        return this.field7043 && !this.field7050;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILaea;IIIIIIII)Z", line = 70)
    public static final boolean method2857(int arg0, int arg1, int arg2, class39 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field7041++;
        int var12 = arg4;
        int var13 = arg8;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        class552.field7817[var14][var15] = 99;
        int var17 = arg8 - var15;
        class561.field8015[var14][var15] = 0;
        byte var18 = 0;
        if (arg11 != -1) {
            field7048 = null;
        }
        int var19 = 0;
        class374.field5503[var18] = arg4;
        int var35 = var18 + 1;
        class446.field6515[var18] = arg8;
        int[][] var20 = arg3.field526;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class47.field667 = var13;
                                    class492.field6908 = var12;
                                    return false;
                                }
                                var12 = class374.field5503[var19];
                                var13 = class446.field6515[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg3.field531;
                                var24 = var13 - arg3.field530;
                                if (arg6 == -4) {
                                    if (arg10 == var12 && arg2 == var13) {
                                        class492.field6908 = var12;
                                        class47.field667 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class181.method1222(var12, 12, arg9, arg7, arg1, arg1, arg10, var13, arg2)) {
                                        class492.field6908 = var12;
                                        class47.field667 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg3.method330(arg0, arg10, arg9, arg11 ^ 0xFFFFA753, arg2, arg7, arg1, arg1, var12, var13)) {
                                        class47.field667 = var13;
                                        class492.field6908 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg3.method338(var13, arg0, var12, arg7, arg11 ^ 0x2518, arg9, arg1, arg2, arg10)) {
                                        class492.field6908 = var12;
                                        class47.field667 = var13;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg3.method342(var12, arg2, var13, -21730, arg10, arg1, arg5, arg6)) {
                                        class47.field667 = var13;
                                        class492.field6908 = var12;
                                        return true;
                                    }
                                } else if (arg3.method337(arg5, 32, var13, arg6, arg10, var12, arg1, arg2)) {
                                    class47.field667 = var13;
                                    class492.field6908 = var12;
                                    return true;
                                }
                                var26 = class561.field8015[var21][var22] + 1;
                                if (var21 > 0 && class552.field7817[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg1)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg1 - 1)) {
                                            class374.field5503[var35] = var12 - 1;
                                            class446.field6515[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class552.field7817[var21 - 1][var22] = 2;
                                            class561.field8015[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg1 && class552.field7817[var21 + 1][var22] == 0 && (var20[var23 + arg1][var24] & 0x60E40000) == 0 && (var20[arg1 + var23][arg1 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var28) {
                                            class374.field5503[var35] = var12 + 1;
                                            class446.field6515[var35] = var13;
                                            class552.field7817[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class561.field8015[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class552.field7817[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg1 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var29) {
                                            class374.field5503[var35] = var12;
                                            class446.field6515[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class552.field7817[var21][var22 - 1] = 1;
                                            class561.field8015[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg1 > var22 && class552.field7817[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[var23 + arg1 - 1][arg1 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var30) {
                                            class374.field5503[var35] = var12;
                                            class446.field6515[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class552.field7817[var21][var22 + 1] = 4;
                                            class561.field8015[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class552.field7817[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class374.field5503[var35] = var12 - 1;
                                            class446.field6515[var35] = var13 - 1;
                                            class552.field7817[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class561.field8015[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg1) > var21 && var22 > 0 && class552.field7817[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg1][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg1 <= var32) {
                                            class374.field5503[var35] = var12 + 1;
                                            class446.field6515[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class552.field7817[var21 + 1][var22 - 1] = 9;
                                            class561.field8015[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg1 && class552.field7817[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg1 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class374.field5503[var35] = var12 - 1;
                                    class446.field6515[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class552.field7817[var21 - 1][var22 + 1] = 6;
                                    class561.field8015[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg1));
                        } while ((128 - arg1) <= var22);
                    } while (class552.field7817[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][var24 + arg1] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][var24 + arg1] & 0x7E240000) != 0 || (var20[var23 + arg1][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class374.field5503[var35] = var12 + 1;
                class446.field6515[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class552.field7817[var21 + 1][var22 + 1] = 12;
                class561.field8015[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 517)
    public final void method2858(byte arg0) {
        if (arg0 <= 28) {
            method2855(70, null);
        }
        if (this.field7046 != null) {
            this.field7046.method249(12416);
        }
        field7047++;
        this.field7043 = false;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Z)V", line = 533)
    public class504(boolean arg0) {
        this.field7050 = arg0;
    }
}
