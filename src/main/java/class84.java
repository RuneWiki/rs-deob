import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class84 extends class62 {

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Z")
    private boolean field1203 = true;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Z")
    private boolean field1200 = true;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field1208 = -1;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "[I")
    public static int[] field1211;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "F")
    public static float field1210;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "Lvn;")
    public static class261 field1197;

    static {
        new class572("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field1211 = new int[8];
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 3)
    public static void method633(byte arg0) {
        if (arg0 <= 28) {
            method637(4, 0, -74, 58, 88, 88);
        }
        field1197 = null;
        field1211 = null;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)[I", line = 17)
    public final int[] method13(int arg0, int arg1) {
        ++field1199;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int[] var4 = this.method408(this.field1200 ? -arg0 + class285.field3989 : arg0, 0, (byte) -69);
            if (!this.field1203) {
                class648.method3736(var4, 0, var3, 0, class438.field5847);
            } else {
                for (int var5 = 0; ~var5 > ~class438.field5847; ++var5) {
                    var3[var5] = var4[-var5 + class410.field5604];
                }
            }
        }
        return arg1 != 656024161 ? null : var3;
    }

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V", line = 55)
    public static final void method634(int arg0) {
        ++field1198;
        if (class278.field3902 < 1024.0F) {
            class278.field3902 = 1024.0F;
        }
        while (class539.field8023 >= 16384.0F) {
            class539.field8023 -= 16384.0F;
        }
        if (class278.field3902 > 3072.0F) {
            class278.field3902 = 3072.0F;
        }
        while (class539.field8023 < 0.0F) {
            class539.field8023 += 16384.0F;
        }
        int var1 = class24.field224 >> 7;
        int var2 = class111.field1579 >> 7;
        int var3 = class132.method919(class89.field1339, class111.field1579, class24.field224, (byte) -82);
        int var4 = 0;
        if (~var1 < -4 && var2 > 3 && var1 < class146.field2125 + -4 && class410.field5609 + -4 > var2) {
            for (int var5 = var1 + -4; ~var5 >= ~(var1 + 4); ++var5) {
                for (int var6 = var2 + -4; var2 - -4 >= var6; ++var6) {
                    int var7 = class89.field1339;
                    if (var7 < 3 && class111.method815(var5, (byte) 50, var6)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class304.field4182.field4148 != null && class304.field4182.field4148[var7] != null) {
                        var8 = (255 & class304.field4182.field4148[var7][var5][var6]) * 8;
                    }
                    int var9 = var3 + -class165.field2609[var7].method1239(var5, var6) + var8;
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        if (arg0 == 1) {
            int var10 = (var4 >> 0) * 1536;
            if (~var10 < -786433) {
                var10 = 786432;
            }
            if (~var10 > -262145) {
                var10 = 262144;
            }
            if (~var10 < ~class1.field2) {
                class1.field2 += (-class1.field2 + var10) / 24;
            } else if (~class1.field2 < ~var10) {
                class1.field2 += (-class1.field2 + var10) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(II)[[[B", line = 142)
    public static final byte[][][] method635(int arg0, int arg1) {
        ++field1207;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; ++var7) {
            for (int var132 = 0; ~var3 < ~var132; ++var132) {
                if (~var7 <= ~var132) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; --var10) {
            for (int var131 = 0; var4 > var131; ++var131) {
                if (var10 >= var131) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; ++var13) {
            for (int var130 = 0; ~var130 > ~var3; ++var130) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                ++var11;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; --var16) {
            for (int var129 = 0; ~var129 > ~var3; ++var129) {
                if (~var16 >= ~var129) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        if (arg1 < 54) {
            return null;
        } else {
            byte[] var18 = new byte[var3 * var4];
            for (int var19 = var4 + -1; var19 >= 0; --var19) {
                for (int var128 = 0; ~var128 > ~var3; ++var128) {
                    if (var19 >> 1 >= var128) {
                        var18[var17] = -1;
                    }
                    ++var17;
                }
            }
            var2[1][0] = var18;
            byte[] var20 = new byte[var3 * var4];
            int var21 = 0;
            for (int var22 = 0; var22 < var4; ++var22) {
                for (int var127 = 0; var127 < var3; ++var127) {
                    if (var21 >= 0 && ~var21 > ~var20.length) {
                        if (~var127 <= ~(var22 << 1)) {
                            var20[var21] = -1;
                        }
                        ++var21;
                    } else {
                        ++var21;
                    }
                }
            }
            var2[1][1] = var20;
            int var23 = 0;
            byte[] var24 = new byte[var3 * var4];
            for (int var25 = 0; var25 < var4; ++var25) {
                for (int var126 = var3 - 1; ~var126 <= -1; --var126) {
                    if (~var126 >= ~(var25 >> 1)) {
                        var24[var23] = -1;
                    }
                    ++var23;
                }
            }
            var2[1][2] = var24;
            int var26 = 0;
            byte[] var27 = new byte[var3 * var4];
            for (int var28 = var4 + -1; var28 >= 0; --var28) {
                for (int var125 = var3 + -1; var125 >= 0; --var125) {
                    if (var28 << 1 <= var125) {
                        var27[var26] = -1;
                    }
                    ++var26;
                }
            }
            var2[1][3] = var27;
            int var29 = 0;
            byte[] var30 = new byte[var3 * var4];
            for (int var31 = var4 + -1; var31 >= 0; --var31) {
                for (int var124 = var3 + -1; var124 >= 0; --var124) {
                    if (var124 <= var31 >> 1) {
                        var30[var29] = -1;
                    }
                    ++var29;
                }
            }
            var2[2][0] = var30;
            byte[] var32 = new byte[var3 * var4];
            int var33 = 0;
            for (int var34 = var4 + -1; ~var34 <= -1; --var34) {
                for (int var123 = 0; var3 > var123; ++var123) {
                    if (~(var34 << 1) >= ~var123) {
                        var32[var33] = -1;
                    }
                    ++var33;
                }
            }
            var2[2][1] = var32;
            int var35 = 0;
            byte[] var36 = new byte[var3 * var4];
            for (int var37 = 0; var37 < var4; ++var37) {
                for (int var122 = 0; var3 > var122; ++var122) {
                    if (var122 <= var37 >> 1) {
                        var36[var35] = -1;
                    }
                    ++var35;
                }
            }
            var2[2][2] = var36;
            int var38 = 0;
            byte[] var39 = new byte[var3 * var4];
            for (int var40 = 0; var4 > var40; ++var40) {
                for (int var121 = var3 - 1; ~var121 <= -1; --var121) {
                    if (var121 >= var40 << 1) {
                        var39[var38] = -1;
                    }
                    ++var38;
                }
            }
            var2[2][3] = var39;
            int var41 = 0;
            byte[] var42 = new byte[var3 * var4];
            for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
                for (int var120 = 0; ~var120 > ~var3; ++var120) {
                    if (var43 >> 1 <= var120) {
                        var42[var41] = -1;
                    }
                    ++var41;
                }
            }
            var2[3][0] = var42;
            byte[] var44 = new byte[var3 * var4];
            int var45 = 0;
            for (int var46 = 0; ~var4 < ~var46; ++var46) {
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
            for (int var49 = 0; var49 < var4; ++var49) {
                for (int var118 = var3 + -1; var118 >= 0; --var118) {
                    if (~(var49 >> 1) >= ~var118) {
                        var48[var47] = -1;
                    }
                    ++var47;
                }
            }
            var2[3][2] = var48;
            byte[] var50 = new byte[var3 * var4];
            int var51 = 0;
            for (int var52 = var4 + -1; ~var52 <= -1; --var52) {
                for (int var117 = var3 + -1; var117 >= 0; --var117) {
                    if (~(var52 << 1) <= ~var117) {
                        var50[var51] = -1;
                    }
                    ++var51;
                }
            }
            var2[3][3] = var50;
            byte[] var53 = new byte[var3 * var4];
            int var54 = 0;
            for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
                for (int var116 = var3 - 1; ~var116 <= -1; --var116) {
                    if (~(var55 >> 1) >= ~var116) {
                        var53[var54] = -1;
                    }
                    ++var54;
                }
            }
            var2[4][0] = var53;
            byte[] var56 = new byte[var3 * var4];
            int var57 = 0;
            for (int var58 = var4 + -1; var58 >= 0; --var58) {
                for (int var115 = 0; ~var115 > ~var3; ++var115) {
                    if (~(var58 << 1) <= ~var115) {
                        var56[var57] = -1;
                    }
                    ++var57;
                }
            }
            var2[4][1] = var56;
            int var59 = 0;
            byte[] var60 = new byte[var3 * var4];
            for (int var61 = 0; var61 < var4; ++var61) {
                for (int var114 = 0; var114 < var3; ++var114) {
                    if (~(var61 >> 1) >= ~var114) {
                        var60[var59] = -1;
                    }
                    ++var59;
                }
            }
            var2[4][2] = var60;
            int var62 = 0;
            byte[] var63 = new byte[var3 * var4];
            for (int var64 = 0; var64 < var4; ++var64) {
                for (int var113 = var3 - 1; var113 >= 0; --var113) {
                    if (var64 << 1 >= var113) {
                        var63[var62] = -1;
                    }
                    ++var62;
                }
            }
            var2[4][3] = var63;
            int var65 = 0;
            byte[] var66 = new byte[var3 * var4];
            for (int var67 = 0; var67 < var4; ++var67) {
                for (int var112 = 0; ~var112 > ~var3; ++var112) {
                    if (~var112 >= ~(var3 / 2)) {
                        var66[var65] = -1;
                    }
                    ++var65;
                }
            }
            var2[5][0] = var66;
            int var68 = 0;
            byte[] var69 = new byte[var3 * var4];
            for (int var70 = 0; var70 < var4; ++var70) {
                for (int var111 = 0; ~var111 > ~var3; ++var111) {
                    if (var70 <= var4 / 2) {
                        var69[var68] = -1;
                    }
                    ++var68;
                }
            }
            var2[5][1] = var69;
            int var71 = 0;
            byte[] var72 = new byte[var3 * var4];
            for (int var73 = 0; ~var4 < ~var73; ++var73) {
                for (int var110 = 0; var110 < var3; ++var110) {
                    if (~var110 <= ~(var3 / 2)) {
                        var72[var71] = -1;
                    }
                    ++var71;
                }
            }
            var2[5][2] = var72;
            byte[] var74 = new byte[var3 * var4];
            int var75 = 0;
            for (int var76 = 0; var4 > var76; ++var76) {
                for (int var109 = 0; var3 > var109; ++var109) {
                    if (var76 >= var4 / 2) {
                        var74[var75] = -1;
                    }
                    ++var75;
                }
            }
            var2[5][3] = var74;
            byte[] var77 = new byte[var3 * var4];
            int var78 = 0;
            for (int var79 = 0; var4 > var79; ++var79) {
                for (int var108 = 0; ~var108 > ~var3; ++var108) {
                    if (~(-(var4 / 2) + var79) <= ~var108) {
                        var77[var78] = -1;
                    }
                    ++var78;
                }
            }
            var2[6][0] = var77;
            byte[] var80 = new byte[var3 * var4];
            int var81 = 0;
            for (int var82 = var4 - 1; ~var82 <= -1; --var82) {
                for (int var107 = 0; ~var3 < ~var107; ++var107) {
                    if (~(-(var4 / 2) + var82) <= ~var107) {
                        var80[var81] = -1;
                    }
                    ++var81;
                }
            }
            var2[6][1] = var80;
            int var83 = 0;
            byte[] var84 = new byte[var3 * var4];
            for (int var85 = var4 + -1; ~var85 <= -1; --var85) {
                for (int var106 = var3 + -1; var106 >= 0; --var106) {
                    if (~(-(var4 / 2) + var85) <= ~var106) {
                        var84[var83] = -1;
                    }
                    ++var83;
                }
            }
            var2[6][2] = var84;
            int var86 = 0;
            byte[] var87 = new byte[var3 * var4];
            for (int var88 = 0; ~var88 > ~var4; ++var88) {
                for (int var105 = var3 + -1; ~var105 <= -1; --var105) {
                    if (var105 <= var88 - var4 / 2) {
                        var87[var86] = -1;
                    }
                    ++var86;
                }
            }
            var2[6][3] = var87;
            byte[] var89 = new byte[var3 * var4];
            int var90 = 0;
            for (int var91 = 0; var91 < var4; ++var91) {
                for (int var104 = 0; ~var104 > ~var3; ++var104) {
                    if (var104 >= -(var4 / 2) + var91) {
                        var89[var90] = -1;
                    }
                    ++var90;
                }
            }
            var2[7][0] = var89;
            byte[] var92 = new byte[var3 * var4];
            int var93 = 0;
            for (int var94 = var4 - 1; ~var94 <= -1; --var94) {
                for (int var103 = 0; ~var3 < ~var103; ++var103) {
                    if (var103 >= -(var4 / 2) + var94) {
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
            for (int var100 = 0; var100 < var4; ++var100) {
                for (int var101 = var3 + -1; var101 >= 0; --var101) {
                    if (var101 >= var100 - var4 / 2) {
                        var98[var99] = -1;
                    }
                    ++var99;
                }
            }
            var2[7][3] = var98;
            return var2;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBII)V", line = 923)
    public static final void method636(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (~class14.field136 >= ~arg3 && ~arg3 >= ~class130.field1801) {
            int var5 = class36.method223(class100.field1452, (byte) 50, arg0, class3.field25);
            int var6 = class36.method223(class100.field1452, (byte) 50, arg4, class3.field25);
            class410.method2411(var6, var5, false, arg3, arg1);
        }
        if (arg2 >= 6) {
            ++field1202;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 940)
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1204;
        int var6 = class36.method223(class100.field1452, (byte) 50, arg1, class3.field25);
        int var7 = class36.method223(class100.field1452, (byte) 50, arg3, class3.field25);
        int var8 = class36.method223(class130.field1801, (byte) 50, arg5, class14.field136);
        int var9 = class36.method223(class130.field1801, (byte) 50, arg2, class14.field136);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class140.method969(var8, 15888, arg4, var9, class604.field8993[var10]);
        }
        if (arg0 != 3727) {
            method634(-23);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 967)
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lgw;II)V", line = 980)
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field788 = arg0.method1032((byte) -33) == 1;
                }
            } else {
                this.field1200 = ~arg0.method1032((byte) -33) == -2;
            }
        } else {
            this.field1203 = ~arg0.method1032((byte) -33) == -2;
        }
        if (arg1 != -1) {
            this.field1203 = false;
        }
        ++field1209;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I", line = 1034)
    public final int[][] method409(int arg0, byte arg1) {
        ++field1201;
        int[][] var3 = super.field772.method2906(8, arg0);
        if (arg1 >= -20) {
            return null;
        } else {
            if (super.field772.field6899) {
                int[][] var4 = this.method407(0, (byte) 41, !this.field1200 ? arg0 : -arg0 + class285.field3989);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field1203) {
                    for (int var11 = 0; ~var11 > ~class438.field5847; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; var12 < class438.field5847; ++var12) {
                        var8[var12] = var5[-var12 + class410.field5604];
                        var9[var12] = var6[-var12 + class410.field5604];
                        var10[var12] = var7[-var12 + class410.field5604];
                    }
                }
            }
            return var3;
        }
    }
}
