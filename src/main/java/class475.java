import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class475 extends class667 {

    @OriginalMember(owner = "client!lia", name = "D", descriptor = "I")
    private int field6801 = 6;

    @OriginalMember(owner = "client!lia", name = "C", descriptor = "S")
    public static short field6800 = 320;

    @OriginalMember(owner = "client!lia", name = "G", descriptor = "I")
    public static int field6803 = 0;

    @OriginalMember(owner = "client!lia", name = "K", descriptor = "I")
    public static int field6807 = 0;

    @OriginalMember(owner = "client!lia", name = "B", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!lia", name = "E", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!lia", name = "H", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!lia", name = "I", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!lia", name = "J", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field6799;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[][] var5 = this.method3748(arg1, 0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field6801;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class77.field1455 < ~var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var7[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                                var8[var16] = var20 - (var18 * var20 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class77.field1455 > var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var14[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var25 > ~var29 ? -var25 + var29 : -var29 + var25;
                                                            var7[var23] = var27 <= var24 ? -var27 + var24 : -var24 + var27;
                                                            var8[var23] = var26 <= var28 ? -var26 + var28 : -var28 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class77.field1455; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = var36 < var33 ? var33 : var36;
                                                        var7[var30] = ~var35 > ~var31 ? var31 : var35;
                                                        var8[var30] = ~var34 <= ~var32 ? var34 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class77.field1455; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var40 <= ~var38 ? var38 : var40;
                                                    var7[var37] = ~var42 < ~var41 ? var41 : var42;
                                                    var8[var37] = var43 < var39 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class77.field1455 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var46;
                                                var7[var44] = ~var45 != -1 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 != 0 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class77.field1455; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = var50 != 4096 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class77.field1455 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var53 >= 2048 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class77.field1455; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class77.field1455; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class77.field1455 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class77.field1455 > var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class77.field1455 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field6804;
        if (arg0 > -87) {
            field6800 = -114;
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) -18, 0);
            int[] var5 = this.method3744(arg1, (byte) 119, 1);
            int var6 = this.field6801;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class77.field1455 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class77.field1455 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 < var11 ? var11 - var12 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class77.field1455; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class77.field1455 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 >= var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class77.field1455; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class77.field1455; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class77.field1455 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class77.field1455 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class77.field1455; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class77.field1455; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class77.field1455; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class77.field1455; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IFFF)I")
    public static final int method2867(int arg0, float arg1, float arg2, float arg3) {
        ++field6806;
        if (arg0 != 3094) {
            method2867(63, 0.16143218F, 0.72361416F, -0.91924125F);
        }
        float var4 = arg2 < 0.0F ? -arg2 : arg2;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
        if (var5 > var4 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lfca;I)I")
    public static final int method2868(class84 arg0, int arg1) {
        ++field6802;
        class488 var2 = arg0.field1523;
        if (var2.field6923 != null) {
            var2 = var2.method2926(8730, class742.field10408);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field6961;
        class500 var4 = arg0.method464((byte) 127);
        if (arg0.field939 != -1 && !arg0.field886) {
            if (~arg0.field939 != ~var4.field7116 && arg0.field939 != var4.field7155 && ~arg0.field939 != ~var4.field7142 && ~arg0.field939 != ~var4.field7108) {
                if (arg0.field939 == var4.field7136 || arg0.field939 == var4.field7157 || arg0.field939 == var4.field7139 || ~arg0.field939 == ~var4.field7149) {
                    var3 = var2.field6949;
                }
            } else {
                var3 = var2.field6896;
            }
        } else {
            var3 = var2.field6903;
        }
        if (arg1 <= 54) {
            method2867(-50, -0.6415588F, 0.11886922F, -0.030574534F);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "()V")
    public class475() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        ++field6805;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field9344 = arg0.method273(255) == 1;
            }
        } else {
            this.field6801 = arg0.method273(255);
        }
        if (arg1 != 3) {
            field6800 = -65;
        }
    }
}
