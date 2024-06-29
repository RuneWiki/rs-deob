import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class406 extends class45 {

    @OriginalMember(owner = "client!iu", name = "S", descriptor = "I")
    private int field6088 = 8;

    @OriginalMember(owner = "client!iu", name = "M", descriptor = "I")
    private int field6082 = 0;

    @OriginalMember(owner = "client!iu", name = "R", descriptor = "I")
    private int field6087 = 409;

    @OriginalMember(owner = "client!iu", name = "U", descriptor = "I")
    private int field6090 = 204;

    @OriginalMember(owner = "client!iu", name = "X", descriptor = "I")
    private int field6093 = 4;

    @OriginalMember(owner = "client!iu", name = "N", descriptor = "I")
    private int field6083 = 81;

    @OriginalMember(owner = "client!iu", name = "Y", descriptor = "I")
    private int field6094 = 1024;

    @OriginalMember(owner = "client!iu", name = "ab", descriptor = "I")
    private int field6096 = 1024;

    @OriginalMember(owner = "client!iu", name = "P", descriptor = "Liv;")
    public static class64 field6085 = new class64(17, 8);

    @OriginalMember(owner = "client!iu", name = "bb", descriptor = "I")
    public static int field6097 = 1;

    @OriginalMember(owner = "client!iu", name = "cb", descriptor = "[I")
    public static int[] field6098 = new int[13];

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    private int field6077;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!iu", name = "O", descriptor = "I")
    private int field6084;

    @OriginalMember(owner = "client!iu", name = "Q", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!iu", name = "T", descriptor = "I")
    private int field6089;

    @OriginalMember(owner = "client!iu", name = "V", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!iu", name = "Z", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!iu", name = "db", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!iu", name = "W", descriptor = "[I")
    private int[] field6092;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "[[I")
    private int[][] field6079;

    @OriginalMember(owner = "client!iu", name = "eb", descriptor = "[[I")
    private int[][] field6100;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
    private final void method2477(int arg0) {
        ++field6091;
        Random var2 = new Random((long) this.field6088);
        this.field6089 = 4096 / this.field6093;
        this.field6077 = 4096 / this.field6088;
        this.field6084 = this.field6083 / 2;
        int var3 = this.field6089 / 2;
        this.field6100 = new int[this.field6088][this.field6093 + 1];
        this.field6079 = new int[this.field6088][this.field6093];
        int var4 = this.field6077 / 2;
        this.field6092 = new int[this.field6088 - -1];
        this.field6092[0] = arg0;
        for (int var5 = 0; ~var5 > ~this.field6088; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field6077;
                int var7 = (class455.method2714(var2, 4096, -13848) + -2048) * this.field6090 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6092[var5] = this.field6092[var5 + -1] - -var8;
            }
            this.field6100[var5][0] = 0;
            for (int var9 = 0; this.field6093 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field6089;
                    int var11 = (-2048 + class455.method2714(var2, 4096, -13848)) * this.field6087 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6100[var5][var9] = this.field6100[var5][var9 + -1] - -var12;
                }
                this.field6079[var5][var9] = this.field6096 > 0 ? -class455.method2714(var2, this.field6096, -13848) + 4096 : 4096;
            }
            this.field6100[var5][this.field6093] = 4096;
        }
        this.field6092[this.field6088] = 4096;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field6086;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int var4 = 0;
            int var5;
            for (var5 = class433.field6429[arg1] + this.field6082; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field6088 > var4 && ~this.field6092[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field6092[var4];
            int var9 = this.field6092[var4 + -1];
            if (~(this.field6084 + var9) > ~var5 && ~(-this.field6084 + var8) < ~var5) {
                for (int var10 = 0; var10 < class259.field3768; ++var10) {
                    int var11 = var7 ? this.field6094 : -this.field6094;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field6089 * var11 >> 12) + class69.field1199[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field6093 < ~var12 && this.field6100[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field6100[var6][var14];
                    int var16 = this.field6100[var6][var12];
                    if (~var13 < ~(this.field6084 + var15) && var16 - this.field6084 > var13) {
                        var3[var10] = this.field6079[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class73.method595(var3, 0, class259.field3768, 0);
            }
        }
        if (arg0 != 0) {
            this.field6088 = -65;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(B)V")
    public static void method2478(byte arg0) {
        field6098 = null;
        field6085 = null;
        if (arg0 != -127) {
            method2478((byte) 65);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field6096 = arg0.method1069((byte) -104);
                                    }
                                } else {
                                    this.field6083 = arg0.method1069((byte) -101);
                                }
                            } else {
                                this.field6082 = arg0.method1069((byte) -116);
                            }
                        } else {
                            this.field6094 = arg0.method1069((byte) -94);
                        }
                    } else {
                        this.field6090 = arg0.method1069((byte) -38);
                    }
                } else {
                    this.field6087 = arg0.method1069((byte) -41);
                }
            } else {
                this.field6088 = arg0.method1063((byte) 105);
            }
        } else {
            this.field6093 = arg0.method1063((byte) 108);
        }
        if (arg1 != -26471) {
            field6099 = 103;
        }
        ++field6081;
    }

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (arg0 != 4095) {
            this.method38(-70);
        }
        this.method2477(0);
        ++field6078;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method2479(int arg0, byte arg1) {
        ++field6080;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            for (int var132 = 0; var132 < var3; ++var132) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; ~var10 <= -1; --var10) {
            for (int var131 = 0; var4 > var131; ++var131) {
                if (~var131 >= ~var10) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; var3 > var130; ++var130) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 + -1; ~var16 <= -1; --var16) {
            for (int var129 = 0; var129 < var3; ++var129) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 + -1; ~var19 <= -1; --var19) {
            for (int var128 = 0; ~var128 > ~var3; ++var128) {
                if (~var128 >= ~(var19 >> 1)) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; ++var22) {
            for (int var127 = 0; var127 < var3; ++var127) {
                if (~var20 <= -1 && ~var21.length < ~var20) {
                    if (~var127 <= ~(var22 << 1)) {
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
        for (int var25 = 0; var25 < var4; ++var25) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (var25 >> 1 >= var126) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; ~var28 <= -1; --var28) {
            for (int var125 = var3 + -1; ~var125 <= -1; --var125) {
                if (~(var28 << 1) >= ~var125) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 + -1; var31 >= 0; --var31) {
            for (int var124 = var3 + -1; ~var124 <= -1; --var124) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                ++var29;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; var123 < var3; ++var123) {
                if (var34 << 1 <= var123) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; ++var37) {
            for (int var122 = 0; ~var3 < ~var122; ++var122) {
                if (~(var37 >> 1) <= ~var122) {
                    var36[var35] = -1;
                }
                ++var35;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        if (arg1 < 65) {
            return null;
        } else {
            int var39 = 0;
            for (int var40 = 0; ~var40 > ~var4; ++var40) {
                for (int var121 = var3 - 1; ~var121 <= -1; --var121) {
                    if (var40 << 1 <= var121) {
                        var38[var39] = -1;
                    }
                    ++var39;
                }
            }
            var2[2][3] = var38;
            byte[] var41 = new byte[var3 * var4];
            int var42 = 0;
            for (int var43 = var4 + -1; var43 >= 0; --var43) {
                for (int var120 = 0; ~var3 < ~var120; ++var120) {
                    if (var43 >> 1 <= var120) {
                        var41[var42] = -1;
                    }
                    ++var42;
                }
            }
            var2[3][0] = var41;
            byte[] var44 = new byte[var3 * var4];
            int var45 = 0;
            for (int var46 = 0; var4 > var46; ++var46) {
                for (int var119 = 0; var119 < var3; ++var119) {
                    if (~var119 >= ~(var46 << 1)) {
                        var44[var45] = -1;
                    }
                    ++var45;
                }
            }
            var2[3][1] = var44;
            byte[] var47 = new byte[var3 * var4];
            int var48 = 0;
            for (int var49 = 0; ~var49 > ~var4; ++var49) {
                for (int var118 = var3 - 1; ~var118 <= -1; --var118) {
                    if (~var118 <= ~(var49 >> 1)) {
                        var47[var48] = -1;
                    }
                    ++var48;
                }
            }
            var2[3][2] = var47;
            byte[] var50 = new byte[var3 * var4];
            int var51 = 0;
            for (int var52 = var4 + -1; ~var52 <= -1; --var52) {
                for (int var117 = var3 + -1; var117 >= 0; --var117) {
                    if (var117 <= var52 << 1) {
                        var50[var51] = -1;
                    }
                    ++var51;
                }
            }
            var2[3][3] = var50;
            byte[] var53 = new byte[var3 * var4];
            int var54 = 0;
            for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
                for (int var116 = var3 + -1; ~var116 <= -1; --var116) {
                    if (var55 >> 1 <= var116) {
                        var53[var54] = -1;
                    }
                    ++var54;
                }
            }
            var2[4][0] = var53;
            byte[] var56 = new byte[var3 * var4];
            int var57 = 0;
            for (int var58 = var4 - 1; ~var58 <= -1; --var58) {
                for (int var115 = 0; var3 > var115; ++var115) {
                    if (~(var58 << 1) <= ~var115) {
                        var56[var57] = -1;
                    }
                    ++var57;
                }
            }
            var2[4][1] = var56;
            int var59 = 0;
            byte[] var60 = new byte[var3 * var4];
            for (int var61 = 0; ~var4 < ~var61; ++var61) {
                for (int var114 = 0; ~var3 < ~var114; ++var114) {
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
                for (int var113 = var3 + -1; ~var113 <= -1; --var113) {
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
                for (int var112 = 0; var3 > var112; ++var112) {
                    if (var112 <= var3 / 2) {
                        var66[var65] = -1;
                    }
                    ++var65;
                }
            }
            var2[5][0] = var66;
            byte[] var68 = new byte[var3 * var4];
            int var69 = 0;
            for (int var70 = 0; var4 > var70; ++var70) {
                for (int var111 = 0; var3 > var111; ++var111) {
                    if (var4 / 2 >= var70) {
                        var68[var69] = -1;
                    }
                    ++var69;
                }
            }
            var2[5][1] = var68;
            int var71 = 0;
            byte[] var72 = new byte[var3 * var4];
            for (int var73 = 0; var4 > var73; ++var73) {
                for (int var110 = 0; ~var110 > ~var3; ++var110) {
                    if (var3 / 2 <= var110) {
                        var72[var71] = -1;
                    }
                    ++var71;
                }
            }
            var2[5][2] = var72;
            int var74 = 0;
            byte[] var75 = new byte[var3 * var4];
            for (int var76 = 0; ~var76 > ~var4; ++var76) {
                for (int var109 = 0; var3 > var109; ++var109) {
                    if (var76 >= var4 / 2) {
                        var75[var74] = -1;
                    }
                    ++var74;
                }
            }
            var2[5][3] = var75;
            int var77 = 0;
            byte[] var78 = new byte[var3 * var4];
            for (int var79 = 0; var79 < var4; ++var79) {
                for (int var108 = 0; var108 < var3; ++var108) {
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
                for (int var107 = 0; ~var107 > ~var3; ++var107) {
                    if (-(var4 / 2) + var82 >= var107) {
                        var81[var80] = -1;
                    }
                    ++var80;
                }
            }
            var2[6][1] = var81;
            byte[] var83 = new byte[var3 * var4];
            int var84 = 0;
            for (int var85 = var4 + -1; var85 >= 0; --var85) {
                for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                    if (-(var4 / 2) + var85 >= var106) {
                        var83[var84] = -1;
                    }
                    ++var84;
                }
            }
            var2[6][2] = var83;
            byte[] var86 = new byte[var3 * var4];
            int var87 = 0;
            for (int var88 = 0; var88 < var4; ++var88) {
                for (int var105 = var3 - 1; var105 >= 0; --var105) {
                    if (~var105 >= ~(-(var4 / 2) + var88)) {
                        var86[var87] = -1;
                    }
                    ++var87;
                }
            }
            var2[6][3] = var86;
            int var89 = 0;
            byte[] var90 = new byte[var3 * var4];
            for (int var91 = 0; var91 < var4; ++var91) {
                for (int var104 = 0; var3 > var104; ++var104) {
                    if (-(var4 / 2) + var91 <= var104) {
                        var90[var89] = -1;
                    }
                    ++var89;
                }
            }
            var2[7][0] = var90;
            byte[] var92 = new byte[var3 * var4];
            int var93 = 0;
            for (int var94 = var4 + -1; ~var94 <= -1; --var94) {
                for (int var103 = 0; ~var3 < ~var103; ++var103) {
                    if (~(-(var4 / 2) + var94) >= ~var103) {
                        var92[var93] = -1;
                    }
                    ++var93;
                }
            }
            var2[7][1] = var92;
            byte[] var95 = new byte[var3 * var4];
            int var96 = 0;
            for (int var97 = var4 + -1; var97 >= 0; --var97) {
                for (int var102 = var3 + -1; ~var102 <= -1; --var102) {
                    if (~(var97 - var4 / 2) >= ~var102) {
                        var95[var96] = -1;
                    }
                    ++var96;
                }
            }
            var2[7][2] = var95;
            int var98 = 0;
            byte[] var99 = new byte[var3 * var4];
            for (int var100 = 0; var100 < var4; ++var100) {
                for (int var101 = var3 + -1; ~var101 <= -1; --var101) {
                    if (var101 >= -(var4 / 2) + var100) {
                        var99[var98] = -1;
                    }
                    ++var98;
                }
            }
            var2[7][3] = var99;
            return var2;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
    public class406() {
        super(0, true);
    }
}
