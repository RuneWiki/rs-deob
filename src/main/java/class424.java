import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class424 implements class515 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lgj;")
    private class662 field5801;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lgj;")
    private class662 field5803;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Leja;")
    private class765 field5805;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lda;")
    private class67 field5799;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    public static int[] field5802;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z", line = 10)
    public final boolean method1789(byte arg0) {
        field5806++;
        if (arg0 != 29) {
            field5808 = -63;
        }
        boolean var2 = true;
        if (!this.field5803.method3737(this.field5805.field10551, false)) {
            var2 = false;
        }
        if (!this.field5801.method3737(this.field5805.field10551, false)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)[[[B", line = 31)
    public static final byte[][][] method2503(byte arg0, int arg1) {
        field5800++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if ((var19 >> 1) >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var127 >= var22 << 1) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if ((var28 << 1) <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= var37 >> 1) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var40 << 1 <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        if (arg0 != 26) {
            method2503((byte) -105, 37);
        }
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= var52 << 1) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= var55 >> 1) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= (var61 >> 1)) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var3 / 2 >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var4 / 2 >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var3 / 2 <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - (var4 / 2)) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - var4 / 2) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var85 - var4 / 2) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - (var4 / 2) <= var103) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var97 - (var4 / 2)) <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if ((var100 - (var4 / 2)) <= var101) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V", line = 809)
    public static void method2504(int arg0) {
        if (arg0 != 4) {
            method2503((byte) -18, 104);
        }
        field5802 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V", line = 820)
    public final void method1102(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field5805.field10557.method3006(arg1 ^ 0x48C, class374.field5075, this.field5805.field10550) + this.field5805.field10556;
            int var4 = this.field5805.field10560.method2837(arg1 + 949, class412.field5635, this.field5805.field10558) + this.field5805.field10552;
            this.field5799.method599((byte) 0, this.field5805.field10554, var4, this.field5805.field10555, this.field5805.field10550, null, 0, 0, this.field5805.field10562, this.field5805.field10558, this.field5805.field10549, this.field5805.field10561, null, null, var3, this.field5805.field10559);
        }
        field5798++;
        if (arg1 != 1164) {
            this.field5799 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V", line = 841)
    public static final void method2505(boolean arg0, int arg1) {
        if (class695.field9619 == null) {
            class139.method1141(12);
        }
        field5804++;
        if (arg1 <= -57 && arg0) {
            class695.field9619.method3413(-1555300634);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 860)
    public final void method1790(int arg0) {
        field5807++;
        if (arg0 != 6187) {
            this.field5801 = null;
        }
        class145 var2 = class502.method2871(arg0 ^ 0xFFFFE7D4, this.field5805.field10551, this.field5801);
        this.field5799 = class95.field1472.method476(var2, class49.method372(this.field5803, this.field5805.field10551), true);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lgj;Lgj;Leja;)V", line = 872)
    public class424(class662 arg0, class662 arg1, class765 arg2) {
        this.field5801 = arg1;
        this.field5803 = arg0;
        this.field5805 = arg2;
    }
}
