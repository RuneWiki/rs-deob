import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class482 extends class202 {

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Lvk;")
    public static class305 field7334;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method2970(byte arg0) {
        field7334 = null;
        if (arg0 != -1) {
            field7334 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[[[B")
    public static final byte[][][] method2971(byte arg0, int arg1) {
        ++field7335;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            for (int var133 = 0; var3 > var133; ++var133) {
                if (var133 <= var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var132 = 0; var132 < var4; ++var132) {
                if (var10 >= var132) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var131 = 0; ~var131 > ~var3; ++var131) {
                if (var13 <= var131) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; --var16) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
                if (~var130 <= ~var16) {
                    var15[var14] = -1;
                }
                ++var14;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; ~var19 <= -1; --var19) {
            for (int var129 = 0; var129 < var3; ++var129) {
                if (var19 >> 1 >= var129) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; ++var22) {
            for (int var128 = 0; ~var3 < ~var128; ++var128) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (~(var22 << 1) >= ~var128) {
                        var21[var20] = -1;
                    }
                    ++var20;
                } else {
                    ++var20;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var4 > var25; ++var25) {
            for (int var127 = var3 - 1; var127 >= 0; --var127) {
                if (~var127 >= ~(var25 >> 1)) {
                    var23[var24] = -1;
                }
                ++var24;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; --var28) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (var28 << 1 <= var126) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; --var31) {
            for (int var125 = var3 + -1; var125 >= 0; --var125) {
                if (~(var31 >> 1) <= ~var125) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var124 = 0; ~var124 > ~var3; ++var124) {
                if (~(var34 << 1) >= ~var124) {
                    var33[var32] = -1;
                }
                ++var32;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var4 > var37; ++var37) {
            for (int var123 = 0; var123 < var3; ++var123) {
                if (~var123 >= ~(var37 >> 1)) {
                    var36[var35] = -1;
                }
                ++var35;
            }
        }
        var2[2][2] = var36;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var4 > var40; ++var40) {
            for (int var122 = var3 + -1; var122 >= 0; --var122) {
                if (var40 << 1 <= var122) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        int var41 = -96 % ((72 - arg0) / 34);
        byte[] var42 = new byte[var3 * var4];
        int var43 = 0;
        for (int var44 = var4 - 1; var44 >= 0; --var44) {
            for (int var121 = 0; ~var3 < ~var121; ++var121) {
                if (var44 >> 1 <= var121) {
                    var42[var43] = -1;
                }
                ++var43;
            }
        }
        var2[3][0] = var42;
        byte[] var45 = new byte[var3 * var4];
        int var46 = 0;
        for (int var47 = 0; var4 > var47; ++var47) {
            for (int var120 = 0; var120 < var3; ++var120) {
                if (var120 <= var47 << 1) {
                    var45[var46] = -1;
                }
                ++var46;
            }
        }
        var2[3][1] = var45;
        int var48 = 0;
        byte[] var49 = new byte[var3 * var4];
        for (int var50 = 0; var4 > var50; ++var50) {
            for (int var119 = var3 + -1; var119 >= 0; --var119) {
                if (var119 >= var50 >> 1) {
                    var49[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var49;
        byte[] var51 = new byte[var3 * var4];
        int var52 = 0;
        for (int var53 = var4 + -1; var53 >= 0; --var53) {
            for (int var118 = var3 - 1; ~var118 <= -1; --var118) {
                if (var53 << 1 >= var118) {
                    var51[var52] = -1;
                }
                ++var52;
            }
        }
        var2[3][3] = var51;
        byte[] var54 = new byte[var3 * var4];
        int var55 = 0;
        for (int var56 = var4 + -1; ~var56 <= -1; --var56) {
            for (int var117 = var3 + -1; ~var117 <= -1; --var117) {
                if (~(var56 >> 1) >= ~var117) {
                    var54[var55] = -1;
                }
                ++var55;
            }
        }
        var2[4][0] = var54;
        int var57 = 0;
        byte[] var58 = new byte[var3 * var4];
        for (int var59 = var4 + -1; ~var59 <= -1; --var59) {
            for (int var116 = 0; ~var3 < ~var116; ++var116) {
                if (var59 << 1 >= var116) {
                    var58[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var58;
        byte[] var60 = new byte[var3 * var4];
        int var61 = 0;
        for (int var62 = 0; ~var4 < ~var62; ++var62) {
            for (int var115 = 0; var3 > var115; ++var115) {
                if (~var115 <= ~(var62 >> 1)) {
                    var60[var61] = -1;
                }
                ++var61;
            }
        }
        var2[4][2] = var60;
        int var63 = 0;
        byte[] var64 = new byte[var3 * var4];
        for (int var65 = 0; ~var4 < ~var65; ++var65) {
            for (int var114 = var3 + -1; ~var114 <= -1; --var114) {
                if (~(var65 << 1) <= ~var114) {
                    var64[var63] = -1;
                }
                ++var63;
            }
        }
        var2[4][3] = var64;
        byte[] var66 = new byte[var3 * var4];
        int var67 = 0;
        for (int var68 = 0; var4 > var68; ++var68) {
            for (int var113 = 0; var113 < var3; ++var113) {
                if (~(var3 / 2) <= ~var113) {
                    var66[var67] = -1;
                }
                ++var67;
            }
        }
        var2[5][0] = var66;
        byte[] var69 = new byte[var3 * var4];
        int var70 = 0;
        for (int var71 = 0; ~var71 > ~var4; ++var71) {
            for (int var112 = 0; ~var112 > ~var3; ++var112) {
                if (var71 <= var4 / 2) {
                    var69[var70] = -1;
                }
                ++var70;
            }
        }
        var2[5][1] = var69;
        byte[] var72 = new byte[var3 * var4];
        int var73 = 0;
        for (int var74 = 0; ~var74 > ~var4; ++var74) {
            for (int var111 = 0; var3 > var111; ++var111) {
                if (~var111 <= ~(var3 / 2)) {
                    var72[var73] = -1;
                }
                ++var73;
            }
        }
        var2[5][2] = var72;
        byte[] var75 = new byte[var3 * var4];
        int var76 = 0;
        for (int var77 = 0; ~var77 > ~var4; ++var77) {
            for (int var110 = 0; var110 < var3; ++var110) {
                if (~var77 <= ~(var4 / 2)) {
                    var75[var76] = -1;
                }
                ++var76;
            }
        }
        var2[5][3] = var75;
        int var78 = 0;
        byte[] var79 = new byte[var3 * var4];
        for (int var80 = 0; ~var80 > ~var4; ++var80) {
            for (int var109 = 0; var3 > var109; ++var109) {
                if (var109 <= var80 - var4 / 2) {
                    var79[var78] = -1;
                }
                ++var78;
            }
        }
        var2[6][0] = var79;
        int var81 = 0;
        byte[] var82 = new byte[var3 * var4];
        for (int var83 = var4 + -1; ~var83 <= -1; --var83) {
            for (int var108 = 0; var3 > var108; ++var108) {
                if (var108 <= -(var4 / 2) + var83) {
                    var82[var81] = -1;
                }
                ++var81;
            }
        }
        var2[6][1] = var82;
        int var84 = 0;
        byte[] var85 = new byte[var3 * var4];
        for (int var86 = var4 + -1; ~var86 <= -1; --var86) {
            for (int var107 = var3 - 1; ~var107 <= -1; --var107) {
                if (var107 <= -(var4 / 2) + var86) {
                    var85[var84] = -1;
                }
                ++var84;
            }
        }
        var2[6][2] = var85;
        byte[] var87 = new byte[var3 * var4];
        int var88 = 0;
        for (int var89 = 0; ~var89 > ~var4; ++var89) {
            for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                if (-(var4 / 2) + var89 >= var106) {
                    var87[var88] = -1;
                }
                ++var88;
            }
        }
        var2[6][3] = var87;
        int var90 = 0;
        byte[] var91 = new byte[var3 * var4];
        for (int var92 = 0; var4 > var92; ++var92) {
            for (int var105 = 0; ~var105 > ~var3; ++var105) {
                if (~(-(var4 / 2) + var92) >= ~var105) {
                    var91[var90] = -1;
                }
                ++var90;
            }
        }
        var2[7][0] = var91;
        int var93 = 0;
        byte[] var94 = new byte[var3 * var4];
        for (int var95 = var4 + -1; var95 >= 0; --var95) {
            for (int var104 = 0; var104 < var3; ++var104) {
                if (~(-(var4 / 2) + var95) >= ~var104) {
                    var94[var93] = -1;
                }
                ++var93;
            }
        }
        var2[7][1] = var94;
        byte[] var96 = new byte[var3 * var4];
        int var97 = 0;
        for (int var98 = var4 + -1; ~var98 <= -1; --var98) {
            for (int var103 = var3 + -1; ~var103 <= -1; --var103) {
                if (var103 >= var98 - var4 / 2) {
                    var96[var97] = -1;
                }
                ++var97;
            }
        }
        var2[7][2] = var96;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; ~var4 < ~var101; ++var101) {
            for (int var102 = var3 + -1; var102 >= 0; --var102) {
                if (-(var4 / 2) + var101 <= var102) {
                    var100[var99] = -1;
                }
                ++var99;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            field7334 = null;
        }
        ++field7336;
        int[][] var3 = super.field3081.method1050(arg1, -122);
        if (super.field3081.field2432) {
            int[][] var4 = this.method1382(0, arg1, 82);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class276.field4375 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class482() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field7332;
        int[] var3 = super.field3064.method2452((byte) 110, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field3064.field5837) {
                int[] var4 = this.method1376(1046794076, 0, arg0);
                for (int var5 = 0; class276.field4375 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3071 = ~arg0.method1445(117) == -2;
        }
        int var4 = -113 / ((-46 - arg1) / 50);
        ++field7333;
    }

    static {
        new class213("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
    }
}
