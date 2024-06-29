import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class702 extends class354 implements class718 {

    @OriginalMember(owner = "client!no", name = "x", descriptor = "I")
    private int field9855;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Llga;")
    public static class712 field9852 = new class712(29, 6);

    @OriginalMember(owner = "client!no", name = "z", descriptor = "Ljava/lang/String;")
    public static String field9857 = null;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "F")
    public static float field9858;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "[Lufa;")
    public static class680[] field9863;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)J", line = 4)
    public final long method3339(int arg0) {
        if (arg0 != 20260) {
            field9863 = null;
        }
        ++field9856;
        return 0L;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V", line = 16)
    public static final void method3957(int arg0, int arg1, int arg2) {
        ++field9862;
        if (arg2 != 2) {
            method3957(101, -12, 47);
        }
        if (class603.field8409 != null) {
            int var3 = class56.field573;
            int var4 = class676.field9447;
            class424.method2430(7, arg0, arg1);
            if (~class392.field5553 == -1) {
                class173.field2147 = null;
                class173.field2147 = class603.field8409.method443(class603.field8409.method440(class582.field8155, class569.field8021), class603.field8409.method343(class582.field8155, class569.field8021));
            } else if (class392.field5553 == 1 && (class624.field8731 == null || ~class56.field573 != ~var3 || class676.field9447 != var4)) {
                class624.field8731 = new class657[class676.field9447 * class56.field573];
                for (int var5 = 0; ~class624.field8731.length < ~var5; ++var5) {
                    class624.field8731[var5] = class603.field8409.method443(class603.field8409.method440(class377.field5235, class759.field10586), class603.field8409.method343(class377.field5235, class759.field10586));
                }
                class381.field5338 = new int[class676.field9447 * class56.field573];
                class339.field4577 = 1;
            }
            class315.field4252 = true;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)[[[B", line = 66)
    public static final byte[][][] method3958(int arg0, byte arg1) {
        ++field9854;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; ~var7 > ~var4; ++var7) {
            for (int var133 = 0; var133 < var3; ++var133) {
                if (~var7 <= ~var133) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; --var10) {
            for (int var132 = 0; ~var132 > ~var4; ++var132) {
                if (var10 >= var132) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; ++var13) {
            for (int var131 = 0; ~var3 < ~var131; ++var131) {
                if (var13 <= var131) {
                    var12[var11] = -1;
                }
                ++var11;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 + -1; var16 >= 0; --var16) {
            for (int var130 = 0; var3 > var130; ++var130) {
                if (var130 >= var16) {
                    var15[var14] = -1;
                }
                ++var14;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; ~var19 <= -1; --var19) {
            for (int var129 = 0; var3 > var129; ++var129) {
                if (var19 >> 1 >= var129) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; ~var22 > ~var4; ++var22) {
            for (int var128 = 0; ~var128 > ~var3; ++var128) {
                if (~var21 <= -1 && ~var21 > ~var20.length) {
                    if (~var128 <= ~(var22 << 1)) {
                        var20[var21] = -1;
                    }
                    ++var21;
                } else {
                    ++var21;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; ++var25) {
            for (int var127 = var3 + -1; ~var127 <= -1; --var127) {
                if (var127 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                ++var24;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; ~var28 <= -1; --var28) {
            for (int var126 = var3 + -1; ~var126 <= -1; --var126) {
                if (var126 >= var28 << 1) {
                    var27[var26] = -1;
                }
                ++var26;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var125 = var3 + -1; ~var125 <= -1; --var125) {
                if (~var125 >= ~(var31 >> 1)) {
                    var30[var29] = -1;
                }
                ++var29;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var124 = 0; var3 > var124; ++var124) {
                if (~var124 <= ~(var34 << 1)) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var4 > var37; ++var37) {
            for (int var123 = 0; var3 > var123; ++var123) {
                if (~(var37 >> 1) <= ~var123) {
                    var35[var36] = -1;
                }
                ++var36;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; ~var4 < ~var40; ++var40) {
            for (int var122 = var3 - 1; var122 >= 0; --var122) {
                if (~var122 <= ~(var40 << 1)) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; --var43) {
            for (int var121 = 0; var121 < var3; ++var121) {
                if (~(var43 >> 1) >= ~var121) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; ++var46) {
            for (int var120 = 0; var3 > var120; ++var120) {
                if (~var120 >= ~(var46 << 1)) {
                    var44[var45] = -1;
                }
                ++var45;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; ~var4 < ~var49; ++var49) {
            for (int var119 = var3 + -1; var119 >= 0; --var119) {
                if (~var119 <= ~(var49 >> 1)) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 + -1; var52 >= 0; --var52) {
            for (int var118 = var3 - 1; ~var118 <= -1; --var118) {
                if (var52 << 1 >= var118) {
                    var50[var51] = -1;
                }
                ++var51;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
            for (int var117 = var3 + -1; var117 >= 0; --var117) {
                if (var55 >> 1 <= var117) {
                    var53[var54] = -1;
                }
                ++var54;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; --var58) {
            for (int var116 = 0; var3 > var116; ++var116) {
                if (var116 <= var58 << 1) {
                    var56[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; ~var4 < ~var61; ++var61) {
            for (int var115 = 0; var3 > var115; ++var115) {
                if (var115 >= var61 >> 1) {
                    var60[var59] = -1;
                }
                ++var59;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; ++var64) {
            for (int var114 = var3 + -1; ~var114 <= -1; --var114) {
                if (~(var64 << 1) <= ~var114) {
                    var63[var62] = -1;
                }
                ++var62;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; ~var67 > ~var4; ++var67) {
            for (int var113 = 0; ~var3 < ~var113; ++var113) {
                if (var3 / 2 >= var113) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; ~var4 < ~var70; ++var70) {
            for (int var112 = 0; ~var112 > ~var3; ++var112) {
                if (var4 / 2 >= var70) {
                    var69[var68] = -1;
                }
                ++var68;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; ~var73 > ~var4; ++var73) {
            for (int var111 = 0; var111 < var3; ++var111) {
                if (var111 >= var3 / 2) {
                    var72[var71] = -1;
                }
                ++var71;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; ~var4 < ~var76; ++var76) {
            for (int var110 = 0; ~var3 < ~var110; ++var110) {
                if (var76 >= var4 / 2) {
                    var75[var74] = -1;
                }
                ++var74;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var4 > var79; ++var79) {
            for (int var109 = 0; ~var109 > ~var3; ++var109) {
                if (~var109 >= ~(-(var4 / 2) + var79)) {
                    var77[var78] = -1;
                }
                ++var78;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 + -1; var82 >= 0; --var82) {
            for (int var108 = 0; ~var3 < ~var108; ++var108) {
                if (~var108 >= ~(var82 - var4 / 2)) {
                    var80[var81] = -1;
                }
                ++var81;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 + -1; ~var85 <= -1; --var85) {
            for (int var107 = var3 + -1; var107 >= 0; --var107) {
                if (~var107 >= ~(-(var4 / 2) + var85)) {
                    var83[var84] = -1;
                }
                ++var84;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; ~var4 < ~var88; ++var88) {
            for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                if (~var106 >= ~(-(var4 / 2) + var88)) {
                    var86[var87] = -1;
                }
                ++var87;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var4 > var91; ++var91) {
            for (int var105 = 0; var3 > var105; ++var105) {
                if (~var105 <= ~(var91 - var4 / 2)) {
                    var90[var89] = -1;
                }
                ++var89;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 + -1; var94 >= 0; --var94) {
            for (int var104 = 0; var104 < var3; ++var104) {
                if (~(var94 - var4 / 2) >= ~var104) {
                    var92[var93] = -1;
                }
                ++var93;
            }
        }
        var2[7][1] = var92;
        int var95 = 24 / ((arg1 - 62) / 48);
        int var96 = 0;
        byte[] var97 = new byte[var3 * var4];
        for (int var98 = var4 + -1; var98 >= 0; --var98) {
            for (int var103 = var3 - 1; ~var103 <= -1; --var103) {
                if (var103 >= -(var4 / 2) + var98) {
                    var97[var96] = -1;
                }
                ++var96;
            }
        }
        var2[7][2] = var97;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; var4 > var101; ++var101) {
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

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I", line = 845)
    public final int method3338(int arg0) {
        ++field9850;
        return arg0 != -22132 ? 118 : super.field4728;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)I", line = 856)
    public final int method3340(int arg0) {
        ++field9851;
        if (arg0 != 5061) {
            field9857 = null;
        }
        return this.field9855;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lac;I[BIZ)V", line = 871)
    public class702(class541 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9855 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B[BII)V", line = 884)
    public final void method3342(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field9853;
        if (arg0 != -47) {
            field9852 = null;
        }
        this.method2052(0, arg2, arg1);
        this.field9855 = arg3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIBZ)V", line = 896)
    public static final void method3959(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        class276.method1644(arg1, 0, class688.field9635.length - 1, arg2, arg4, arg0, (byte) 91);
        ++field9861;
        class11.field66 = 0;
        class264.field3463 = null;
        if (arg3 != 82) {
            field9852 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V", line = 909)
    public static void method3960(int arg0) {
        field9857 = null;
        field9852 = null;
        field9863 = null;
        int var1 = 18 % ((-55 - arg0) / 44);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V", line = 930)
    public final void method693(int arg0) {
        ++field9859;
        super.field4717.method2973(this, 2936);
        if (arg0 != 0) {
            method3960(30);
        }
    }
}
