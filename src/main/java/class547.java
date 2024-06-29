import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class547 extends class466 {

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
    private int field7577 = 6;

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "S")
    public static short field7576 = 256;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
    public class547() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V")
    public static final void method3120(int arg0) {
        ++field7573;
        int var1 = class343.field4627.method93((byte) 122);
        class489.field6847 = class343.field4627.method110((byte) 83);
        int var2 = class343.field4627.method96(false);
        boolean var3 = class343.field4627.method110((byte) 49) == 1;
        int var4 = class343.field4627.method104(-58);
        class222.method1424(-110);
        class562.method3206(var2, true);
        class343.field4627.method1240(false);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; class32.field513 >> 3 > var20; ++var20) {
                for (int var21 = 0; var21 < class611.field8786 >> 3; ++var21) {
                    int var22 = class343.field4627.method1237(592256579, 1);
                    if (~var22 == -2) {
                        class104.field1573[var5][var20][var21] = class343.field4627.method1237(592256579, 26);
                    } else {
                        class104.field1573[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class343.field4627.method1239(8);
        int var6 = (-class343.field4627.field165 + class403.field5730) / 16;
        class619.field8864 = new int[var6][4];
        for (int var7 = 0; var6 > var7; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class619.field8864[var7][var19] = class343.field4627.method119(-62);
            }
        }
        class270.field3765 = new int[var6];
        class261.field3629 = null;
        class14.field198 = new int[var6];
        class356.field4799 = new int[var6];
        class493.field6909 = new byte[var6][];
        class219.field3132 = new byte[var6][];
        class633.field9252 = new int[var6];
        class324.field4371 = new byte[var6][];
        class183.field2585 = new int[var6];
        class525.field7381 = null;
        class94.field1452 = new byte[var6][];
        int var8 = 0;
        if (arg0 > -48) {
            field7576 = 54;
        }
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; ~(class32.field513 >> 3) < ~var10; ++var10) {
                for (int var11 = 0; var11 < class611.field8786 >> 3; ++var11) {
                    int var12 = class104.field1573[var9][var10][var11];
                    if (~var12 != 0) {
                        int var13 = (var12 & 16768002) >> 14;
                        int var14 = (var12 & 16381) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; ~var8 < ~var16; ++var16) {
                            if (class183.field2585[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class183.field2585[var8] = var15;
                            int var17 = (65309 & var15) >> 8;
                            int var18 = 255 & var15;
                            class356.field4799[var8] = class23.field346.method252((byte) -91, "m" + var17 + "_" + var18);
                            class14.field198[var8] = class23.field346.method252((byte) 70, "l" + var17 + "_" + var18);
                            class633.field9252[var8] = class23.field346.method252((byte) 19, "um" + var17 + "_" + var18);
                            class270.field3765[var8] = class23.field346.method252((byte) 45, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class228.method1451(var1, 10, var4, 28221, var3);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field7572;
        int[][] var3 = super.field6569.method828((byte) 28, arg0);
        if (arg1) {
            this.method2(29, -49);
        }
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[][] var5 = this.method2719(1, arg0, 5);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field7577;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class312.field4207 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var7[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                                var8[var16] = -(var21 * var22 >> 11) + var22 - -var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class312.field4207; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var9[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = var25 <= var29 ? -var25 + var29 : var25 - var29;
                                                            var7[var23] = var26 > var24 ? -var24 + var26 : -var26 + var24;
                                                            var8[var23] = ~var27 <= ~var28 ? -var28 + var27 : var28 - var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class312.field4207; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var33 >= var35 ? var33 : var35;
                                                        var7[var30] = var34 < var36 ? var36 : var34;
                                                        var8[var30] = ~var32 > ~var31 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class312.field4207; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var40 < var39 ? var40 : var39;
                                                    var7[var37] = ~var42 > ~var41 ? var42 : var41;
                                                    var8[var37] = ~var43 >= ~var38 ? var43 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class312.field4207; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((4096 - var12[var44] << 12) / var46) + 4096;
                                                var7[var44] = ~var45 == -1 ? 0 : -((4096 - var13[var44] << 12) / var45) + 4096;
                                                var8[var44] = var47 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class312.field4207; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class312.field4207; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((4096 - var55) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class312.field4207; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class312.field4207; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class312.field4207; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class312.field4207; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class312.field4207 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "(III)I")
    public static final int method3121(int arg0, int arg1, int arg2) {
        ++field7574;
        if (~arg1 != -5 && ~arg1 != -6) {
            if (arg0 != -13) {
                field7576 = 32;
            }
            return 256;
        } else {
            return class501.field6974[arg2 & 3];
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field7578;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            method3120(45);
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, arg1 ^ 2);
            int[] var5 = this.method2721(1, arg0, 2);
            int var6 = this.field7577;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class312.field4207; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class312.field4207; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class312.field4207 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class312.field4207 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class312.field4207 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class312.field4207; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class312.field4207; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; class312.field4207 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class312.field4207; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class312.field4207; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class312.field4207 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class312.field4207 < ~var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field6565 = ~arg0.method110((byte) 111) == -2;
            }
        } else {
            this.field7577 = arg0.method110((byte) 91);
        }
        if (arg1 == -5062) {
            ++field7575;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3122(String arg0, int arg1) {
        int var2 = 111 / ((arg1 - -64) / 62);
        ++field7571;
        return class245.method1518(arg0, 10, true, -4977);
    }
}
