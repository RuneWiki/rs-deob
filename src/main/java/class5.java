import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class466 {

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
    private final void method32(boolean arg0, int arg1) {
        if (!arg0) {
            this.field69 = arg1 >> 12 & 4080;
            ++field65;
            this.field73 = (arg1 & 65280) >> 4;
            this.field64 = arg1 << 4 & 4080;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        if (arg1) {
            this.field64 = 19;
        }
        ++field68;
        int[][] var3 = super.field6569.method828((byte) 126, arg0);
        if (super.field6569.field1934) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class312.field4207 > var7; ++var7) {
                var4[var7] = this.field69;
                var5[var7] = this.field73;
                var6[var7] = this.field64;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII[I)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        ++field66;
        if (~arg1 < -1 && !class130.method886(1, arg1)) {
            throw new IllegalArgumentException("");
        } else if (~arg6 < -1 && !class130.method886(arg5 ^ 25950, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg2 != 32993) {
            throw new IllegalArgumentException("");
        } else {
            int var8 = 0;
            if (arg5 != 25951) {
                field71 = -25;
            }
            int var9 = ~arg6 >= ~arg1 ? arg6 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var8, arg3, arg1, arg6, 0, arg2, arg0, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = var15 - -arg1;
                int[] var17 = var13;
                for (int var18 = 0; ~var18 > ~var11; ++var18) {
                    for (int var19 = 0; var19 < var10; ++var19) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = 255 & var20 >> 16;
                        int var24 = 255 & var20 >> 24;
                        int var25 = (65480 & var20) >> 8;
                        int var26 = var20 & 255;
                        int var27 = var12[var16++];
                        int var28 = (255 & var22 >> 8) + var25;
                        int var29 = (255 & var22) + var26;
                        int var30 = (var22 >> 24 & 255) + var24;
                        int var31 = (var22 >> 16 & 255) + var23;
                        int var32 = (255 & var21 >> 16) + var31;
                        int var33 = (var21 >> 24 & 255) + var30;
                        int var34 = (var21 >> 8 & 255) + var28;
                        int var35 = (var21 & 255) + var29;
                        int var36 = (255 & var27) + var35;
                        int var37 = ((16756494 & var27) >> 16) + var32;
                        int var38 = (var27 >> 24 & 255) + var33;
                        int var39 = ((var27 & 65368) >> 8) + var34;
                        var13[var14++] = class73.method578(class73.method578(class589.method3454(1020, var39) << 6, class73.method578(class589.method3454(1020, var38) << 22, class589.method3454(1020, var37) << 14)), class589.method3454(var36, 1020) >> 2);
                    }
                    var16 += arg1;
                    var15 += arg1;
                }
                var13 = var12;
                arg6 = var11;
                arg1 = var10;
                var12 = var17;
                var10 >>= 1;
                var11 >>= 1;
                var9 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.method32(false, arg0.method89((byte) -47));
        }
        if (arg1 == -5062) {
            ++field62;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static final void method35(int arg0) {
        ++field67;
        if (~class440.field6254 == -7) {
            class368.method2208(false, false);
        } else {
            class178.field2558 = class143.field2203;
            class143.field2203 = null;
            int var1 = -39 % ((arg0 - 28) / 48);
            class45.method440(12, 106);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[[B")
    public static final byte[][][] method36(byte arg0, int arg1) {
        ++field63;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; ~var7 > ~var4; ++var7) {
            for (int var132 = 0; var132 < var3; ++var132) {
                if (var132 <= var7) {
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
                if (~var131 >= ~var10) {
                    var9[var8] = -1;
                }
                ++var8;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; ~var13 > ~var4; ++var13) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
                if (var130 >= var13) {
                    var12[var11] = -1;
                }
                ++var11;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 + -1; var16 >= 0; --var16) {
            for (int var129 = 0; ~var3 < ~var129; ++var129) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; --var19) {
            for (int var128 = 0; ~var128 > ~var3; ++var128) {
                if (var128 <= var19 >> 1) {
                    var17[var18] = -1;
                }
                ++var18;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; ~var4 < ~var22; ++var22) {
            for (int var127 = 0; var127 < var3; ++var127) {
                if (var21 >= 0 && ~var20.length < ~var21) {
                    if (~(var22 << 1) >= ~var127) {
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
        for (int var25 = 0; var4 > var25; ++var25) {
            for (int var126 = var3 - 1; ~var126 <= -1; --var126) {
                if (~var126 >= ~(var25 >> 1)) {
                    var24[var23] = -1;
                }
                ++var23;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 + -1; ~var28 <= -1; --var28) {
            for (int var125 = var3 - 1; var125 >= 0; --var125) {
                if (var28 << 1 <= var125) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var124 = var3 + -1; ~var124 <= -1; --var124) {
                if (~(var31 >> 1) <= ~var124) {
                    var30[var29] = -1;
                }
                ++var29;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; ~var123 > ~var3; ++var123) {
                if (var34 << 1 <= var123) {
                    var33[var32] = -1;
                }
                ++var32;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var4 > var37; ++var37) {
            for (int var122 = 0; ~var122 > ~var3; ++var122) {
                if (~(var37 >> 1) <= ~var122) {
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
                if (var121 >= var40 << 1) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 + -1; var43 >= 0; --var43) {
            for (int var120 = 0; var120 < var3; ++var120) {
                if (var43 >> 1 <= var120) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; ~var4 < ~var46; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (var46 << 1 >= var119) {
                    var45[var44] = -1;
                }
                ++var44;
            }
        }
        var2[3][1] = var45;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var4 > var49; ++var49) {
            for (int var118 = var3 + -1; ~var118 <= -1; --var118) {
                if (var49 >> 1 <= var118) {
                    var48[var47] = -1;
                }
                ++var47;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 + -1; var52 >= 0; --var52) {
            for (int var117 = var3 + -1; var117 >= 0; --var117) {
                if (~var117 >= ~(var52 << 1)) {
                    var50[var51] = -1;
                }
                ++var51;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
            for (int var116 = var3 + -1; ~var116 <= -1; --var116) {
                if (var55 >> 1 <= var116) {
                    var54[var53] = -1;
                }
                ++var53;
            }
        }
        var2[4][0] = var54;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; --var58) {
            for (int var115 = 0; ~var115 > ~var3; ++var115) {
                if (var58 << 1 >= var115) {
                    var57[var56] = -1;
                }
                ++var56;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var4 > var61; ++var61) {
            for (int var114 = 0; var3 > var114; ++var114) {
                if (var114 >= var61 >> 1) {
                    var59[var60] = -1;
                }
                ++var60;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; ++var64) {
            for (int var113 = var3 - 1; ~var113 <= -1; --var113) {
                if (~(var64 << 1) <= ~var113) {
                    var63[var62] = -1;
                }
                ++var62;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; ~var67 > ~var4; ++var67) {
            for (int var112 = 0; ~var112 > ~var3; ++var112) {
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
                if (var4 / 2 >= var70) {
                    var69[var68] = -1;
                }
                ++var68;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; ~var4 < ~var73; ++var73) {
            for (int var110 = 0; ~var110 > ~var3; ++var110) {
                if (~(var3 / 2) >= ~var110) {
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
                if (var4 / 2 <= var76) {
                    var74[var75] = -1;
                }
                ++var75;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var4 > var79; ++var79) {
            for (int var108 = 0; var3 > var108; ++var108) {
                if (var108 <= -(var4 / 2) + var79) {
                    var77[var78] = -1;
                }
                ++var78;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; ~var82 <= -1; --var82) {
            for (int var107 = 0; var107 < var3; ++var107) {
                if (-(var4 / 2) + var82 >= var107) {
                    var80[var81] = -1;
                }
                ++var81;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; --var85) {
            for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                if (var106 <= -(var4 / 2) + var85) {
                    var83[var84] = -1;
                }
                ++var84;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var4 > var88; ++var88) {
            for (int var105 = var3 + -1; ~var105 <= -1; --var105) {
                if (~var105 >= ~(-(var4 / 2) + var88)) {
                    var87[var86] = -1;
                }
                ++var86;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var4 > var91; ++var91) {
            for (int var104 = 0; ~var3 < ~var104; ++var104) {
                if (~var104 <= ~(-(var4 / 2) + var91)) {
                    var89[var90] = -1;
                }
                ++var90;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 + -1; ~var94 <= -1; --var94) {
            for (int var103 = 0; var3 > var103; ++var103) {
                if (~var103 <= ~(-(var4 / 2) + var94)) {
                    var93[var92] = -1;
                }
                ++var92;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 + -1; var97 >= 0; --var97) {
            for (int var102 = var3 - 1; var102 >= 0; --var102) {
                if (~(var97 - var4 / 2) >= ~var102) {
                    var96[var95] = -1;
                }
                ++var95;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; ~var100 > ~var4; ++var100) {
            for (int var101 = var3 + -1; var101 >= 0; --var101) {
                if (~var101 <= ~(-(var4 / 2) + var100)) {
                    var98[var99] = -1;
                }
                ++var99;
            }
        }
        var2[7][3] = var98;
        if (arg0 <= 90) {
            method34(80, 10, -43, 44, -77, -32, 45, (int[]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    private class5(int arg0) {
        super(0, false);
        this.method32(false, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
        this(0);
    }

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)V")
    public static final void method37(int arg0) {
        ++field72;
        if (class625.field9110 != -1 && ~class438.field6221 != 0) {
            int var1 = ((-class56.field1001 + class53.field994) * class434.field6189 >> 16) + class56.field1001;
            class434.field6189 += var1;
            if (~class434.field6189 <= -65536) {
                if (class341.field4602) {
                    class516.field7249 = false;
                } else {
                    class516.field7249 = true;
                }
                class434.field6189 = 65535;
                class341.field4602 = true;
            } else {
                class341.field4602 = false;
                class516.field7249 = false;
            }
            float var2 = (float) class434.field6189 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class264.field3690 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var22 = class225.field3221[class625.field9110][var4][var5] * 3;
                int var23 = class225.field3221[class625.field9110][var4 - -1][var5] * 3;
                int var24 = (class225.field3221[class625.field9110][var4 + 2][var5] - class225.field3221[class625.field9110][var4 + 3][var5] + class225.field3221[class625.field9110][var4 + 2][var5]) * 3;
                int var25 = class225.field3221[class625.field9110][var4][var5];
                int var26 = -var22 + var23;
                int var27 = -(var23 * 2) + var22 + var24;
                int var28 = class225.field3221[class625.field9110][var4 + 2][var5] - var25 + -var24 + var23;
                var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
            }
            class563.field7794 = (int) var3[0] + -(class519.field7304 * 128);
            class462.field6488 = (int) var3[2] + -(class6.field80 * 128);
            class117.field1930 = (int) var3[1] * -1;
            float[] var6 = new float[3];
            int var7 = class88.field1386 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var15 = class225.field3221[class438.field6221][var7][var8] * 3;
                int var16 = class225.field3221[class438.field6221][var7 + 1][var8] * 3;
                int var17 = (class225.field3221[class438.field6221][var7 + 2][var8] + class225.field3221[class438.field6221][var7 + 2][var8] + -class225.field3221[class438.field6221][var7 - -3][var8]) * 3;
                int var18 = class225.field3221[class438.field6221][var7][var8];
                int var19 = var16 - var15;
                int var20 = -(var16 * 2) + var15 + var17;
                int var21 = class225.field3221[class438.field6221][var7 + 2][var8] + -var17 + -var18 + var16;
                var6[var8] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
            }
            int var9 = 25 % ((arg0 - 65) / 47);
            float var10 = var6[0] + -var3[0];
            float var11 = (var6[1] + -var3[1]) * -1.0F;
            float var12 = var6[2] - var3[2];
            double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
            class160.field2349 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 16383;
            class88.field1391 = (int) (2607.5945876176133D * -Math.atan2((double) var10, (double) var12)) & 16383;
            class264.field3688 = ((class225.field3221[class625.field9110][var4 + 2][3] + -class225.field3221[class625.field9110][var4][3]) * class434.field6189 >> 16) + class225.field3221[class625.field9110][var4][3];
        }
    }
}
