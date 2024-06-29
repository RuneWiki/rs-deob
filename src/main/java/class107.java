import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 extends class615 {

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    private int field1580 = 6;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "[Lvc;")
    public static class293[] field1576 = new class293[128];

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Lsr;")
    public static class234 field1579;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
    public static void method804(int arg0) {
        field1576 = null;
        if (arg0 != -6418) {
            field1576 = null;
        }
        field1579 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            return null;
        } else {
            ++field1577;
            int[] var3 = super.field8125.method298(arg0, -112);
            if (super.field8125.field579) {
                int[] var4 = this.method3366(0, 997, arg0);
                int[] var5 = this.method3366(1, 997, arg0);
                int var6 = this.field1580;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; class505.field6740 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class505.field6740; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var12 <= var11 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class505.field6740; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class505.field6740 < ~var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class505.field6740 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class505.field6740 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class505.field6740 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class505.field6740 > var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class505.field6740; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class505.field6740; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class505.field6740; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class505.field6740 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            field1576 = null;
        }
        ++field1578;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[][] var5 = this.method3368(true, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1580;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class505.field6740; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var21 - (var20 * var21 >> 11) + var20;
                                                                var7[var16] = var18 - -var22 + -(var18 * var22 >> 11);
                                                                var8[var16] = var17 + var19 - (var17 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class505.field6740; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var28 <= ~var24 ? -var24 + var28 : var24 - var28;
                                                            var7[var23] = ~var29 <= ~var26 ? var29 - var26 : var26 - var29;
                                                            var8[var23] = var27 <= var25 ? -var27 + var25 : -var25 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class505.field6740; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 <= var35 ? var35 : var36;
                                                        var7[var30] = var33 >= var34 ? var33 : var34;
                                                        var8[var30] = var32 > var31 ? var32 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class505.field6740 > var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var39 < ~var40 ? var40 : var39;
                                                    var7[var37] = var41 >= var38 ? var38 : var41;
                                                    var8[var37] = ~var43 > ~var42 ? var43 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class505.field6740 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 != -1 ? -((-var12[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var7[var44] = var45 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var45 : 0;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class505.field6740 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (4096 - var50) : 4096;
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class505.field6740; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : 4096 - ((-var10[var52] + 4096) * (-var55 + 4096) >> 11);
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((4096 - var54) * (-var11[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class505.field6740 < ~var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; class505.field6740 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 == -1 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class505.field6740; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class505.field6740 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class505.field6740; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class107() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field8118 = arg2.method2034(255) == 1;
            }
        } else {
            this.field1580 = arg2.method2034(255);
        }
        if (arg0 <= 44) {
            method804(60);
        }
        ++field1581;
    }
}
