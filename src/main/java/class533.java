import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class533 extends class349 {

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    private int field7351 = 6;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Lcb;")
    public static class318 field7352 = new class318(103, 5);

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lcga;IIII)V")
    public static final void method3019(class255 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class414.method2422(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class149.field1872) {
            class414.method2422(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class414.method2422(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class334.field4887) {
            class414.method2422(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class334.field4887) {
            class414.method2422(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class149.field1872 && arg4 <= class334.field4887) {
            class414.method2422(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class414.method2422(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class149.field1872 && arg4 > 0) {
            class414.method2422(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field7346;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = -26 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(0, -1090477337, arg1);
            int[] var6 = this.method2181(1, -1090477337, arg1);
            int var7 = this.field7351;
            if (~var7 != -2) {
                if (var7 != 2) {
                    if (var7 != 3) {
                        if (~var7 != -5) {
                            if (~var7 != -6) {
                                if (~var7 != -7) {
                                    if (~var7 != -8) {
                                        if (~var7 != -9) {
                                            if (var7 != 9) {
                                                if (~var7 != -11) {
                                                    if (~var7 != -12) {
                                                        if (~var7 == -13) {
                                                            for (int var8 = 0; ~class39.field497 < ~var8; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var3[var8] = var9 + var10 + -(var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class39.field497 > var11; ++var11) {
                                                            int var12 = var6[var11];
                                                            int var13 = var5[var11];
                                                            var3[var11] = var13 <= var12 ? -var13 + var12 : var13 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~class39.field497 < ~var14; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var3[var14] = var15 < var16 ? var16 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~class39.field497 < ~var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var3[var17] = ~var19 < ~var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class39.field497; ++var20) {
                                                int var21 = var5[var20];
                                                var3[var20] = ~var21 == -1 ? 0 : -((-var6[var20] + 4096 << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class39.field497; ++var22) {
                                            int var23 = var5[var22];
                                            var3[var22] = var23 != 4096 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; class39.field497 > var24; ++var24) {
                                        int var25 = var6[var24];
                                        var3[var24] = var25 >= 2048 ? 4096 - ((-var5[var24] + 4096) * (-var25 + 4096) >> 11) : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class39.field497 < ~var26; ++var26) {
                                    var3[var26] = 4096 - ((4096 - var5[var26]) * (-var6[var26] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class39.field497 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var3[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class39.field497; ++var29) {
                            var3[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; ~class39.field497 < ~var30; ++var30) {
                        var3[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; ~var31 > ~class39.field497; ++var31) {
                    var3[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            this.method13((byte) 97, 101);
        }
        ++field7345;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field5100 = arg2.method957((byte) -91) == 1;
            }
        } else {
            this.field7351 = arg2.method957((byte) -102);
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public static final void method3020(int arg0) {
        ++field7349;
        if (!class373.field5382) {
            if (!class72.field935.field6535) {
                class74.field945 += (-class74.field945 + -12.0F) / 2.0F;
            } else {
                class283.field3826 = (float) ((int) class283.field3826 + -17 & -16);
            }
            class373.field5382 = true;
            class308.field4137 = true;
            if (arg0 != 1) {
                field7350 = -52;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)V")
    public static void method3021(int arg0) {
        field7352 = null;
        if (arg0 != 0) {
            field7350 = 110;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)V")
    public static final void method3022(byte arg0) {
        ++field7347;
        int var1 = class654.field9256;
        int[] var2 = class123.field1595;
        for (int var3 = 0; ~var1 < ~var3; ++var3) {
            class519 var4 = class292.field3912[var2[var3]];
            if (var4 != null) {
                class531.method3014(var4.method241(-25747), -28385, var4);
            }
        }
        if (arg0 != -94) {
            field7350 = 116;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        ++field7348;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = 112 % ((arg1 - -32) / 47);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 43, arg0);
            int[][] var6 = this.method2180(1, 61, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field7351;
            if (var16 != 1) {
                if (var16 != 2) {
                    if (~var16 != -4) {
                        if (var16 != 4) {
                            if (var16 != 5) {
                                if (~var16 != -7) {
                                    if (~var16 != -8) {
                                        if (var16 != 8) {
                                            if (~var16 != -10) {
                                                if (var16 != 10) {
                                                    if (var16 != 11) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~var17 > ~class39.field497; ++var17) {
                                                                int var18 = var15[var17];
                                                                int var19 = var13[var17];
                                                                int var20 = var10[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var14[var17];
                                                                int var23 = var12[var17];
                                                                var7[var17] = -(var19 * var20 >> 11) + var20 + var19;
                                                                var8[var17] = -(var21 * var22 >> 11) + var21 - -var22;
                                                                var9[var17] = var23 - (var18 * var23 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class39.field497 > var24; ++var24) {
                                                            int var25 = var10[var24];
                                                            int var26 = var13[var24];
                                                            int var27 = var14[var24];
                                                            int var28 = var12[var24];
                                                            int var29 = var11[var24];
                                                            int var30 = var15[var24];
                                                            var7[var24] = var26 >= var25 ? -var25 + var26 : -var26 + var25;
                                                            var8[var24] = var29 > var27 ? var29 - var27 : -var29 + var27;
                                                            var9[var24] = var28 > var30 ? var28 - var30 : -var28 + var30;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class39.field497; ++var31) {
                                                        int var32 = var13[var31];
                                                        int var33 = var10[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var11[var31];
                                                        int var36 = var14[var31];
                                                        int var37 = var12[var31];
                                                        var7[var31] = var33 <= var32 ? var32 : var33;
                                                        var8[var31] = ~var36 <= ~var35 ? var36 : var35;
                                                        var9[var31] = ~var34 <= ~var37 ? var34 : var37;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; var38 < class39.field497; ++var38) {
                                                    int var39 = var11[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var14[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var12[var38];
                                                    int var44 = var13[var38];
                                                    var7[var38] = var42 < var44 ? var42 : var44;
                                                    var8[var38] = ~var41 < ~var39 ? var39 : var41;
                                                    var9[var38] = ~var40 >= ~var43 ? var40 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class39.field497 > var45; ++var45) {
                                                int var46 = var12[var45];
                                                int var47 = var11[var45];
                                                int var48 = var10[var45];
                                                var7[var45] = ~var48 == -1 ? 0 : -((-var13[var45] + 4096 << 12) / var48) + 4096;
                                                var8[var45] = var47 == 0 ? 0 : -((-var14[var45] + 4096 << 12) / var47) + 4096;
                                                var9[var45] = var46 != 0 ? 4096 - (-var15[var45] + 4096 << 12) / var46 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class39.field497 > var49; ++var49) {
                                            int var50 = var12[var49];
                                            int var51 = var10[var49];
                                            int var52 = var11[var49];
                                            var7[var49] = var51 == 4096 ? 4096 : (var13[var49] << 12) / (4096 - var51);
                                            var8[var49] = var52 == 4096 ? 4096 : (var14[var49] << 12) / (-var52 + 4096);
                                            var9[var49] = var50 != 4096 ? (var15[var49] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~class39.field497 < ~var53; ++var53) {
                                        int var54 = var13[var53];
                                        int var55 = var14[var53];
                                        int var56 = var15[var53];
                                        var7[var53] = var54 >= 2048 ? -((4096 - var54) * (-var10[var53] + 4096) >> 11) + 4096 : var10[var53] * var54 >> 11;
                                        var8[var53] = ~var55 > -2049 ? var11[var53] * var55 >> 11 : 4096 - ((-var11[var53] + 4096) * (-var55 + 4096) >> 11);
                                        var9[var53] = ~var56 > -2049 ? var12[var53] * var56 >> 11 : -((4096 - var12[var53]) * (4096 - var56) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class39.field497 > var57; ++var57) {
                                    var7[var57] = -((-var10[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = 4096 - ((4096 - var11[var57]) * (-var14[var57] + 4096) >> 12);
                                    var9[var57] = 4096 - ((4096 - var12[var57]) * (4096 - var15[var57]) >> 12);
                                }
                            }
                        } else {
                            for (int var58 = 0; var58 < class39.field497; ++var58) {
                                int var59 = var15[var58];
                                int var60 = var14[var58];
                                int var61 = var13[var58];
                                var7[var58] = var61 != 0 ? (var10[var58] << 12) / var61 : 4096;
                                var8[var58] = ~var60 == -1 ? 4096 : (var11[var58] << 12) / var60;
                                var9[var58] = ~var59 == -1 ? 4096 : (var12[var58] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class39.field497; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class39.field497 > var63; ++var63) {
                        var7[var63] = var10[var63] + -var13[var63];
                        var8[var63] = var11[var63] - var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class39.field497 > var64; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] - -var14[var64];
                    var9[var64] = var12[var64] - -var15[var64];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class533() {
        super(2, false);
    }
}
