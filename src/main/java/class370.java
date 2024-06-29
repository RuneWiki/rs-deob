import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class370 extends class96 {

    @OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
    private int field4754 = 81;

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "I")
    private int field4755 = 0;

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "I")
    private int field4757 = 1024;

    @OriginalMember(owner = "client!nt", name = "Z", descriptor = "I")
    private int field4766 = 4;

    @OriginalMember(owner = "client!nt", name = "W", descriptor = "I")
    private int field4763 = 8;

    @OriginalMember(owner = "client!nt", name = "eb", descriptor = "I")
    private int field4771 = 1024;

    @OriginalMember(owner = "client!nt", name = "db", descriptor = "I")
    private int field4770 = 204;

    @OriginalMember(owner = "client!nt", name = "Y", descriptor = "I")
    private int field4765 = 409;

    @OriginalMember(owner = "client!nt", name = "jb", descriptor = "[I")
    public static int[] field4776;

    @OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!nt", name = "R", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!nt", name = "S", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!nt", name = "U", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!nt", name = "V", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!nt", name = "X", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!nt", name = "bb", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!nt", name = "cb", descriptor = "I")
    private int field4769;

    @OriginalMember(owner = "client!nt", name = "fb", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!nt", name = "gb", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!nt", name = "ib", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!nt", name = "hb", descriptor = "Lia;")
    public static class142 field4774;

    @OriginalMember(owner = "client!nt", name = "T", descriptor = "[I")
    private int[] field4760;

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "[[I")
    private int[][] field4752;

    @OriginalMember(owner = "client!nt", name = "ab", descriptor = "[[I")
    private int[][] field4767;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILdn;)Luu;")
    public static final class420 method2154(int arg0, int arg1, int arg2, class201 arg3) {
        ++field4758;
        byte[] var4 = arg3.method1313((byte) -114, arg1, arg2);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != 10481) {
                method2160(98);
            }
            return new class420(var4);
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
    public class370() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field4756;
        if (arg0 >= 15) {
            this.method2156((byte) 81);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method2155(int arg0, byte arg1) {
        ++field4768;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; ++var7) {
            for (int var132 = 0; ~var3 < ~var132; ++var132) {
                if (~var132 >= ~var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 + -1; ~var10 <= -1; --var10) {
            for (int var131 = 0; ~var131 > ~var4; ++var131) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; ~var13 > ~var4; ++var13) {
            for (int var130 = 0; var130 < var3; ++var130) {
                if (~var130 <= ~var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 + -1; var16 >= 0; --var16) {
            for (int var129 = 0; ~var129 > ~var3; ++var129) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; ~var19 <= -1; --var19) {
            for (int var128 = 0; var128 < var3; ++var128) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var4 > var22; ++var22) {
            for (int var127 = 0; var127 < var3; ++var127) {
                if (~var21 <= -1 && var20.length > var21) {
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
        for (int var25 = 0; ~var4 < ~var25; ++var25) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (~(var25 >> 1) <= ~var126) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 + -1; var28 >= 0; --var28) {
            for (int var125 = var3 - 1; var125 >= 0; --var125) {
                if (var125 >= var28 << 1) {
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
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; ~var3 < ~var123; ++var123) {
                if (~var123 <= ~(var34 << 1)) {
                    var33[var32] = -1;
                }
                ++var32;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; ~var4 < ~var37; ++var37) {
            for (int var122 = 0; var122 < var3; ++var122) {
                if (~var122 >= ~(var37 >> 1)) {
                    var35[var36] = -1;
                }
                ++var36;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var4 > var40; ++var40) {
            for (int var121 = var3 - 1; var121 >= 0; --var121) {
                if (~var121 <= ~(var40 << 1)) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 + -1; var43 >= 0; --var43) {
            for (int var120 = 0; var3 > var120; ++var120) {
                if (~(var43 >> 1) >= ~var120) {
                    var42[var41] = -1;
                }
                ++var41;
            }
        }
        var2[3][0] = var42;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; ~var4 < ~var46; ++var46) {
            for (int var119 = 0; var3 > var119; ++var119) {
                if (~var119 >= ~(var46 << 1)) {
                    var45[var44] = -1;
                }
                ++var44;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; ~var49 > ~var4; ++var49) {
            for (int var118 = var3 - 1; ~var118 <= -1; --var118) {
                if (var118 >= var49 >> 1) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        if (arg1 != 11) {
            field4776 = null;
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; --var52) {
            for (int var117 = var3 + -1; var117 >= 0; --var117) {
                if (var117 <= var52 << 1) {
                    var51[var50] = -1;
                }
                ++var50;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 + -1; ~var55 <= -1; --var55) {
            for (int var116 = var3 + -1; var116 >= 0; --var116) {
                if (~(var55 >> 1) >= ~var116) {
                    var53[var54] = -1;
                }
                ++var54;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; --var58) {
            for (int var115 = 0; var115 < var3; ++var115) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var4 > var61; ++var61) {
            for (int var114 = 0; var3 > var114; ++var114) {
                if (var61 >> 1 <= var114) {
                    var60[var59] = -1;
                }
                ++var59;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; ~var4 < ~var64; ++var64) {
            for (int var113 = var3 + -1; var113 >= 0; --var113) {
                if (var113 <= var64 << 1) {
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
                if (var112 <= var3 / 2) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; ++var70) {
            for (int var111 = 0; ~var111 > ~var3; ++var111) {
                if (~(var4 / 2) <= ~var70) {
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
                if (~var110 <= ~(var3 / 2)) {
                    var71[var72] = -1;
                }
                ++var72;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; ~var76 > ~var4; ++var76) {
            for (int var109 = 0; ~var3 < ~var109; ++var109) {
                if (var4 / 2 <= var76) {
                    var74[var75] = -1;
                }
                ++var75;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; ~var4 < ~var79; ++var79) {
            for (int var108 = 0; ~var3 < ~var108; ++var108) {
                if (~(-(var4 / 2) + var79) <= ~var108) {
                    var77[var78] = -1;
                }
                ++var78;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 + -1; var82 >= 0; --var82) {
            for (int var107 = 0; ~var3 < ~var107; ++var107) {
                if (~var107 >= ~(-(var4 / 2) + var82)) {
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
                if (~var106 >= ~(-(var4 / 2) + var85)) {
                    var84[var83] = -1;
                }
                ++var83;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; ++var88) {
            for (int var105 = var3 + -1; ~var105 <= -1; --var105) {
                if (var88 - var4 / 2 >= var105) {
                    var87[var86] = -1;
                }
                ++var86;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; ~var4 < ~var91; ++var91) {
            for (int var104 = 0; ~var3 < ~var104; ++var104) {
                if (~var104 <= ~(-(var4 / 2) + var91)) {
                    var89[var90] = -1;
                }
                ++var90;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 + -1; var94 >= 0; --var94) {
            for (int var103 = 0; ~var103 > ~var3; ++var103) {
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
                if (~(-(var4 / 2) + var97) >= ~var102) {
                    var95[var96] = -1;
                }
                ++var96;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var4 > var100; ++var100) {
            for (int var101 = var3 + -1; ~var101 <= -1; --var101) {
                if (~(var100 - var4 / 2) >= ~var101) {
                    var99[var98] = -1;
                }
                ++var98;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field4761;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            method2154(18, -34, -123, (class201) null);
        }
        if (super.field1331.field863) {
            int var4 = 0;
            int var5;
            for (var5 = class74.field933[arg0] + this.field4755; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field4763 && var5 >= this.field4760[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field4760[var4];
            int var9 = this.field4760[var4 + -1];
            if (~(this.field4769 + var9) > ~var5 && var5 < var8 - this.field4769) {
                for (int var10 = 0; class269.field3403 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field4771 : this.field4771;
                    int var13;
                    for (var13 = (this.field4775 * var12 >> 12) + class510.field7476[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4766 > var11 && ~var13 <= ~this.field4767[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field4767[var6][var11];
                    int var16 = this.field4767[var6][var14];
                    if (~(var16 - -this.field4769) > ~var13 && ~(-this.field4769 + var15) < ~var13) {
                        var3[var10] = this.field4752[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class526.method3111(var3, 0, class269.field3403, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "(B)V")
    private final void method2156(byte arg0) {
        ++field4764;
        Random var2 = new Random((long) this.field4763);
        this.field4775 = 4096 / this.field4766;
        this.field4769 = this.field4754 / 2;
        this.field4753 = 4096 / this.field4763;
        int var3 = this.field4775 / 2;
        int var4 = this.field4753 / 2;
        this.field4767 = new int[this.field4763][this.field4766 + 1];
        this.field4752 = new int[this.field4763][this.field4766];
        this.field4760 = new int[this.field4763 + 1];
        this.field4760[0] = 0;
        if (arg0 != 81) {
            method2160(39);
        }
        for (int var5 = 0; var5 < this.field4763; ++var5) {
            if (var5 > 0) {
                int var6 = this.field4753;
                int var7 = (-2048 + class179.method1160(Integer.MIN_VALUE, var2, 4096)) * this.field4770 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4760[var5] = this.field4760[var5 + -1] - -var8;
            }
            this.field4767[var5][0] = 0;
            for (int var9 = 0; this.field4766 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field4775;
                    int var11 = (class179.method1160(arg0 ^ -2147483567, var2, 4096) + -2048) * this.field4765 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4767[var5][var9] = this.field4767[var5][var9 - 1] - -var12;
                }
                this.field4752[var5][var9] = ~this.field4757 >= -1 ? 4096 : -class179.method1160(Integer.MIN_VALUE, var2, this.field4757) + 4096;
            }
            this.field4767[var5][this.field4766] = 4096;
        }
        this.field4760[this.field4763] = 4096;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(IB)I")
    public static final int method2157(int arg0, byte arg1) {
        ++field4759;
        if (arg1 != 20) {
            method2155(-41, (byte) 37);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
    public static final void method2158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4762;
        if (arg1 < -36) {
            if (arg4 > arg3) {
                class183.method1212(arg2, class333.field4265[arg0], true, arg3, arg4);
            } else {
                class183.method1212(arg2, class333.field4265[arg0], true, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            method2159((class88) null, 18);
        }
        ++field4773;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field4757 = arg2.method568((byte) 110);
                                    }
                                } else {
                                    this.field4754 = arg2.method568((byte) 110);
                                }
                            } else {
                                this.field4755 = arg2.method568((byte) 110);
                            }
                        } else {
                            this.field4771 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field4770 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field4765 = arg2.method568((byte) 110);
                }
            } else {
                this.field4763 = arg2.method617(arg1 ^ -3);
            }
        } else {
            this.field4766 = arg2.method617(arg1 ^ -3);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lbt;I)V")
    public static final void method2159(class88 arg0, int arg1) {
        ++field4772;
        for (int var2 = 0; ~class67.field831 < ~var2; ++var2) {
            int var3 = arg0.method604(-9338);
            int var4 = arg0.method568((byte) 110);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class301.field3902[var3] != null) {
                class301.field3902[var3].field626 = var4;
            }
        }
        if (arg1 != -8155) {
            field4776 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "(I)V")
    public static void method2160(int arg0) {
        field4774 = null;
        field4776 = null;
        if (arg0 < 65) {
            method2160(-82);
        }
    }

    static {
        new class169("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field4776 = new int[13];
    }
}
