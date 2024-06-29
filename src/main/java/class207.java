import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class207 extends class184 {

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "F")
    public float field2710;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "Z")
    public boolean field2706;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "F")
    public float field2708;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2711 = -1;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Ldr;")
    public static class751 field2705;

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIII)V", line = 8)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2712 = arg2;
        this.field2710 = (float) arg2 / (float) arg4;
        this.field2706 = false;
        this.field2708 = (float) arg3 / (float) arg5;
        this.field2704 = arg3;
        this.method1274(false, false, 10242);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 21)
    public static void method1381(int arg0) {
        if (arg0 == 27606) {
            field2705 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[[B", line = 31)
    public static final byte[][][] method1382(int arg0, int arg1) {
        ++field2709;
        byte[][][] var2 = new byte[arg1][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; ~var4 < ~var7; ++var7) {
            for (int var132 = 0; var3 > var132; ++var132) {
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
            for (int var131 = 0; ~var4 < ~var131; ++var131) {
                if (var10 >= var131) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; ++var13) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
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
        for (int var19 = var4 + -1; var19 >= 0; --var19) {
            for (int var128 = 0; var128 < var3; ++var128) {
                if (var19 >> 1 >= var128) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var4 > var22; ++var22) {
            for (int var127 = 0; ~var3 < ~var127; ++var127) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var22 << 1 <= var127) {
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
        for (int var28 = var4 + -1; ~var28 <= -1; --var28) {
            for (int var125 = var3 + -1; var125 >= 0; --var125) {
                if (~var125 <= ~(var28 << 1)) {
                    var27[var26] = -1;
                }
                ++var26;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var124 = var3 + -1; ~var124 <= -1; --var124) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; var123 < var3; ++var123) {
                if (~(var34 << 1) >= ~var123) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; ++var37) {
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
        for (int var40 = 0; ~var4 < ~var40; ++var40) {
            for (int var121 = var3 + -1; ~var121 <= -1; --var121) {
                if (~var121 <= ~(var40 << 1)) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
            for (int var120 = 0; var3 > var120; ++var120) {
                if (var120 >= var43 >> 1) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var4 > var46; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                ++var44;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; ~var4 < ~var49; ++var49) {
            for (int var118 = var3 - 1; var118 >= 0; --var118) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 + -1; ~var52 <= -1; --var52) {
            for (int var117 = var3 - 1; ~var117 <= -1; --var117) {
                if (var52 << 1 >= var117) {
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
                if (~var116 <= ~(var55 >> 1)) {
                    var53[var54] = -1;
                }
                ++var54;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 + -1; ~var58 <= -1; --var58) {
            for (int var115 = 0; var115 < var3; ++var115) {
                if (~var115 >= ~(var58 << 1)) {
                    var57[var56] = -1;
                }
                ++var56;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; ~var4 < ~var61; ++var61) {
            for (int var114 = 0; ~var3 < ~var114; ++var114) {
                if (~(var61 >> 1) >= ~var114) {
                    var59[var60] = -1;
                }
                ++var60;
            }
        }
        var2[4][2] = var59;
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
                if (var3 / 2 >= var112) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; ~var4 < ~var70; ++var70) {
            for (int var111 = 0; ~var111 > ~var3; ++var111) {
                if (~var70 >= ~(var4 / 2)) {
                    var69[var68] = -1;
                }
                ++var68;
            }
        }
        var2[5][1] = var69;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; ~var73 > ~var4; ++var73) {
            for (int var110 = 0; ~var3 < ~var110; ++var110) {
                if (var3 / 2 <= var110) {
                    var71[var72] = -1;
                }
                ++var72;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; ++var76) {
            for (int var109 = 0; var3 > var109; ++var109) {
                if (~(var4 / 2) >= ~var76) {
                    var74[var75] = -1;
                }
                ++var75;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; ~var79 > ~var4; ++var79) {
            for (int var108 = 0; ~var3 < ~var108; ++var108) {
                if (-(var4 / 2) + var79 >= var108) {
                    var78[var77] = -1;
                }
                ++var77;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 + -1; ~var82 <= -1; --var82) {
            for (int var107 = 0; var3 > var107; ++var107) {
                if (~var107 >= ~(-(var4 / 2) + var82)) {
                    var81[var80] = -1;
                }
                ++var80;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 + -1; var85 >= 0; --var85) {
            for (int var106 = var3 - 1; ~var106 <= -1; --var106) {
                if (~var106 >= ~(-(var4 / 2) + var85)) {
                    var84[var83] = -1;
                }
                ++var83;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; ~var4 < ~var88; ++var88) {
            for (int var105 = var3 - 1; var105 >= 0; --var105) {
                if (~(-(var4 / 2) + var88) <= ~var105) {
                    var87[var86] = -1;
                }
                ++var86;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; ~var4 < ~var91; ++var91) {
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
        for (int var94 = var4 + -1; var94 >= 0; --var94) {
            for (int var103 = 0; ~var103 > ~var3; ++var103) {
                if (~(-(var4 / 2) + var94) >= ~var103) {
                    var92[var93] = -1;
                }
                ++var93;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; --var97) {
            for (int var102 = var3 - 1; ~var102 <= -1; --var102) {
                if (~(-(var4 / 2) + var97) >= ~var102) {
                    var95[var96] = -1;
                }
                ++var96;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; ~var4 < ~var100; ++var100) {
            for (int var101 = var3 - 1; var101 >= 0; --var101) {
                if (-(var4 / 2) + var100 <= var101) {
                    var99[var98] = -1;
                }
                ++var98;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIII[I)V", line = 809)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2712 = arg1;
        this.field2704 = arg2;
        this.method1281(arg5, true, 0, -128, 0, arg2, 0, arg1, 0);
        this.field2706 = false;
        this.field2708 = (float) arg2 / (float) arg4;
        this.field2710 = (float) arg1 / (float) arg3;
        this.method1274(false, false, 10242);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIIZ[BI)V", line = 823)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2704 = arg4;
        this.field2712 = arg3;
        if (super.field68 != 34037) {
            this.field2706 = true;
            this.field2710 = this.field2708 = 1.0F;
        } else {
            this.field2708 = (float) arg4;
            this.field2710 = (float) arg3;
            this.field2706 = false;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIIIZ)V", line = 845)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2712 = arg4;
        if (super.field68 == 34037) {
            this.field2708 = (float) arg5;
            this.field2710 = (float) arg4;
            this.field2706 = false;
        } else {
            this.field2710 = this.field2708 = 1.0F;
            this.field2706 = true;
        }
        this.field2704 = arg5;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIZ[III)V", line = 866)
    public class207(class246 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field68 != -34038) {
            this.field2706 = true;
            this.field2710 = this.field2708 = 1.0F;
        } else {
            this.field2710 = (float) arg2;
            this.field2706 = false;
            this.field2708 = (float) arg3;
        }
        this.field2712 = arg2;
        this.field2704 = arg3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIII)V", line = 889)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field68 == 34037) {
            this.field2708 = (float) arg4;
            this.field2710 = (float) arg3;
            this.field2706 = false;
        } else {
            this.field2706 = true;
            this.field2710 = this.field2708 = 1.0F;
        }
        this.field2704 = arg4;
        this.field2712 = arg3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIII[BI)V", line = 910)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2712 = arg2;
        this.field2704 = arg3;
        this.method1277(arg2, 0, true, -69, arg3, arg6, arg7, 0, 0, 0);
        this.field2706 = false;
        this.field2708 = (float) arg3 / (float) arg5;
        this.field2710 = (float) arg2 / (float) arg4;
        this.method1274(false, false, 10242);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldia;IIIIIIZ)V", line = 925)
    public class207(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2708 = (float) arg4 / (float) arg6;
        this.field2706 = false;
        this.field2704 = arg4;
        this.field2710 = (float) arg3 / (float) arg5;
        this.field2712 = arg3;
        this.method1274(false, false, 10242);
    }
}
