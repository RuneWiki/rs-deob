import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class449 extends class397 {

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field6548 = 0;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Lhe;")
    public static class239 field6550;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "[Lkl;")
    private class51[] field6544;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "[[[B")
    public static byte[][][] field6546;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(B)V")
    public static void method2617(byte arg0) {
        if (arg0 != -1) {
            method2617((byte) 103);
        }
        field6550 = null;
        field6546 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([[IB)V")
    private final void method2618(int[][] arg0, byte arg1) {
        ++field6543;
        int var3 = class164.field2152;
        int var4 = class508.field7746;
        if (arg1 != 30) {
            field6548 = 98;
        }
        class225.method1389(arg0, -128);
        class413.method2461(0, class107.field1429, 0, 88, class340.field4948);
        if (this.field6544 != null) {
            for (int var5 = 0; ~var5 > ~this.field6544.length; ++var5) {
                class51 var6 = this.field6544[var5];
                int var7 = var6.field757;
                int var8 = var6.field759;
                if (~var7 <= -1) {
                    if (var8 < 0) {
                        var6.method115(var3, 17091, var4);
                    } else {
                        var6.method116(arg1 ^ 119, var4, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method117(var4, -112, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field5859 = ~arg2.method941((byte) 124) == -2;
            }
        } else {
            this.field6544 = new class51[arg2.method941((byte) 126)];
            for (int var4 = 0; ~this.field6544.length < ~var4; ++var4) {
                int var5 = arg2.method941((byte) 127);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field6544[var4] = class304.method1830((byte) 115, arg2);
                            }
                        } else {
                            this.field6544[var4] = class325.method1947(-1, arg2);
                        }
                    } else {
                        this.field6544[var4] = class415.method2467(arg2, 789221);
                    }
                } else {
                    this.field6544[var4] = class203.method1255(120, arg2);
                }
            }
        }
        if (arg1 == 80) {
            ++field6552;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field6547;
        int[][] var3 = super.field5848.method1692(arg1, 124);
        if (arg0 < 81) {
            this.method486((byte) 41, 47);
        }
        if (super.field5848.field3939) {
            int var4 = class164.field2152;
            int var5 = class508.field7746;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5848.method1691(58);
            this.method2618(var6, (byte) 30);
            for (int var8 = 0; ~class508.field7746 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class164.field2152 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class500.method3013(4080, var15 << 4);
                    var12[var14] = class500.method3013(4080, var15 >> 4);
                    var11[var14] = class500.method3013(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(B)V")
    public static final void method2619(byte arg0) {
        ++field6551;
        if (class485.field7023 != null) {
            if (class485.field7023.field6417 == 1) {
                class485.field7023 = null;
                return;
            }
            if (~class485.field7023.field6417 == -3) {
                class410.method2449(84, class15.field228, 2, class420.field6207);
                class485.field7023 = null;
                return;
            }
        }
        if (arg0 != -1) {
            field6548 = -40;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)[[[B")
    public static final byte[][][] method2620(byte arg0, int arg1) {
        ++field6545;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var4 > var7; ++var7) {
            for (int var132 = 0; ~var132 > ~var3; ++var132) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var131 = 0; var4 > var131; ++var131) {
                if (~var131 >= ~var10) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 + -1; var16 >= 0; --var16) {
            for (int var129 = 0; var129 < var3; ++var129) {
                if (~var129 <= ~var16) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 + -1; ~var19 <= -1; --var19) {
            for (int var128 = 0; var3 > var128; ++var128) {
                if (~var128 >= ~(var19 >> 1)) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; ~var4 < ~var22; ++var22) {
            for (int var127 = 0; var127 < var3; ++var127) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var127 >= var22 << 1) {
                        var21[var20] = -1;
                    }
                    ++var20;
                } else {
                    ++var20;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var4 > var25; ++var25) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (var25 >> 1 >= var126) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; ~var28 <= -1; --var28) {
            for (int var125 = var3 + -1; var125 >= 0; --var125) {
                if (~(var28 << 1) >= ~var125) {
                    var27[var26] = -1;
                }
                ++var26;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; var31 >= 0; --var31) {
            for (int var124 = var3 + -1; var124 >= 0; --var124) {
                if (~(var31 >> 1) <= ~var124) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; var3 > var123; ++var123) {
                if (var123 >= var34 << 1) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; ~var37 > ~var4; ++var37) {
            for (int var122 = 0; ~var122 > ~var3; ++var122) {
                if (~var122 >= ~(var37 >> 1)) {
                    var36[var35] = -1;
                }
                ++var35;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; ++var40) {
            for (int var121 = var3 + -1; var121 >= 0; --var121) {
                if (~(var40 << 1) >= ~var121) {
                    var38[var39] = -1;
                }
                ++var39;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
            for (int var120 = 0; ~var120 > ~var3; ++var120) {
                if (~var120 <= ~(var43 >> 1)) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var4 > var46; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (var119 <= var46 << 1) {
                    var44[var45] = -1;
                }
                ++var45;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var4 > var49; ++var49) {
            for (int var118 = var3 + -1; ~var118 <= -1; --var118) {
                if (~(var49 >> 1) >= ~var118) {
                    var48[var47] = -1;
                }
                ++var47;
            }
        }
        var2[3][2] = var48;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 + -1; var52 >= 0; --var52) {
            for (int var117 = var3 + -1; ~var117 <= -1; --var117) {
                if (~var117 >= ~(var52 << 1)) {
                    var51[var50] = -1;
                }
                ++var50;
            }
        }
        var2[3][3] = var51;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
            for (int var116 = var3 - 1; ~var116 <= -1; --var116) {
                if (var116 >= var55 >> 1) {
                    var54[var53] = -1;
                }
                ++var53;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; ~var58 <= -1; --var58) {
            for (int var115 = 0; ~var115 > ~var3; ++var115) {
                if (~var115 >= ~(var58 << 1)) {
                    var56[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; ~var61 > ~var4; ++var61) {
            for (int var114 = 0; var114 < var3; ++var114) {
                if (var114 >= var61 >> 1) {
                    var60[var59] = -1;
                }
                ++var59;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var4 > var64; ++var64) {
            for (int var113 = var3 + -1; var113 >= 0; --var113) {
                if (~(var64 << 1) <= ~var113) {
                    var63[var62] = -1;
                }
                ++var62;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; ++var67) {
            for (int var112 = 0; var112 < var3; ++var112) {
                if (~var112 >= ~(var3 / 2)) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; ~var70 > ~var4; ++var70) {
            for (int var111 = 0; ~var3 < ~var111; ++var111) {
                if (~var70 >= ~(var4 / 2)) {
                    var68[var69] = -1;
                }
                ++var69;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; ~var73 > ~var4; ++var73) {
            for (int var110 = 0; ~var110 > ~var3; ++var110) {
                if (var110 >= var3 / 2) {
                    var71[var72] = -1;
                }
                ++var72;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; ~var76 > ~var4; ++var76) {
            for (int var109 = 0; var109 < var3; ++var109) {
                if (var4 / 2 <= var76) {
                    var74[var75] = -1;
                }
                ++var75;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; ~var79 > ~var4; ++var79) {
            for (int var108 = 0; ~var108 > ~var3; ++var108) {
                if (~(-(var4 / 2) + var79) <= ~var108) {
                    var78[var77] = -1;
                }
                ++var77;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 + -1; ~var82 <= -1; --var82) {
            for (int var107 = 0; var107 < var3; ++var107) {
                if (~var107 >= ~(-(var4 / 2) + var82)) {
                    var81[var80] = -1;
                }
                ++var80;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 + -1; ~var85 <= -1; --var85) {
            for (int var106 = var3 - 1; var106 >= 0; --var106) {
                if (~(-(var4 / 2) + var85) <= ~var106) {
                    var84[var83] = -1;
                }
                ++var83;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var4 > var88; ++var88) {
            for (int var105 = var3 + -1; var105 >= 0; --var105) {
                if (var105 <= -(var4 / 2) + var88) {
                    var86[var87] = -1;
                }
                ++var87;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; ~var91 > ~var4; ++var91) {
            for (int var104 = 0; var104 < var3; ++var104) {
                if (var91 - var4 / 2 <= var104) {
                    var89[var90] = -1;
                }
                ++var90;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; --var94) {
            for (int var103 = 0; var103 < var3; ++var103) {
                if (~var103 <= ~(-(var4 / 2) + var94)) {
                    var92[var93] = -1;
                }
                ++var93;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 + -1; ~var97 <= -1; --var97) {
            for (int var102 = var3 + -1; ~var102 <= -1; --var102) {
                if (~var102 <= ~(var97 - var4 / 2)) {
                    var95[var96] = -1;
                }
                ++var96;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        if (arg0 < 87) {
            field6548 = 42;
        }
        for (int var100 = 0; ~var100 > ~var4; ++var100) {
            for (int var101 = var3 + -1; ~var101 <= -1; --var101) {
                if (~(-(var4 / 2) + var100) >= ~var101) {
                    var98[var99] = -1;
                }
                ++var99;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field6549;
        int[] var3 = super.field5854.method465(arg1, arg0 + 780833182);
        if (super.field5854.field991) {
            this.method2618(super.field5854.method461(10466), (byte) 30);
        }
        if (arg0 != -780833076) {
            field6548 = 55;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class449() {
        super(0, true);
    }

    static {
        new class194("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        new class194("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }
}
