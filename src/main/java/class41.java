import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class41 extends class23 {

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    private int field693 = 6;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Llc;")
    public static class143 field696 = class66.method374("<br>", -1);

    @OriginalMember(owner = "client!we", name = "L", descriptor = "Llc;")
    public static class143 field694 = class66.method374("cookieprefix", -1);

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "Z")
    public static boolean field699 = false;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "[I")
    public static int[] field697;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        int[][] var3 = super.field366.method209(0, arg0);
        ++field692;
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field366.field508) {
                int[][] var4 = this.method161(arg0, 0, 0);
                int[][] var5 = this.method161(arg0, 1, arg1 ^ 1);
                int[] var6 = var4[0];
                int[] var7 = var3[2];
                int[] var8 = var4[1];
                int[] var9 = var5[1];
                int[] var10 = var3[1];
                int[] var11 = var5[0];
                int[] var12 = var4[2];
                int[] var13 = var3[0];
                int[] var14 = var5[2];
                int var15 = this.field693;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; ~var16 > ~class72.field1359; ++var16) {
                                                                    int var17 = var12[var16];
                                                                    int var18 = var9[var16];
                                                                    int var19 = var8[var16];
                                                                    int var20 = var11[var16];
                                                                    int var21 = var14[var16];
                                                                    int var22 = var6[var16];
                                                                    var13[var16] = var20 + var22 + -(var20 * var22 >> 11);
                                                                    var10[var16] = var19 - -var18 - (var18 * var19 >> 11);
                                                                    var7[var16] = var17 + var21 - (var17 * var21 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; var23 < class72.field1359; ++var23) {
                                                                int var24 = var9[var23];
                                                                int var25 = var12[var23];
                                                                int var26 = var11[var23];
                                                                int var27 = var8[var23];
                                                                int var28 = var6[var23];
                                                                int var29 = var14[var23];
                                                                var13[var23] = ~var28 >= ~var26 ? -var28 + var26 : -var26 + var28;
                                                                var10[var23] = ~var27 >= ~var24 ? var24 - var27 : -var24 + var27;
                                                                var7[var23] = var29 < var25 ? -var29 + var25 : -var25 + var29;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class72.field1359; ++var30) {
                                                            int var31 = var6[var30];
                                                            int var32 = var8[var30];
                                                            int var33 = var12[var30];
                                                            int var34 = var9[var30];
                                                            int var35 = var11[var30];
                                                            int var36 = var14[var30];
                                                            var13[var30] = var31 <= var35 ? var35 : var31;
                                                            var10[var30] = ~var32 >= ~var34 ? var34 : var32;
                                                            var7[var30] = var36 >= var33 ? var36 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~class72.field1359 < ~var37; ++var37) {
                                                        int var38 = var9[var37];
                                                        int var39 = var12[var37];
                                                        int var40 = var6[var37];
                                                        int var41 = var14[var37];
                                                        int var42 = var8[var37];
                                                        int var43 = var11[var37];
                                                        var13[var37] = var43 > var40 ? var40 : var43;
                                                        var10[var37] = ~var42 > ~var38 ? var42 : var38;
                                                        var7[var37] = var41 > var39 ? var39 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; class72.field1359 > var44; ++var44) {
                                                    int var45 = var8[var44];
                                                    int var46 = var12[var44];
                                                    int var47 = var6[var44];
                                                    var13[var44] = var47 != 0 ? 4096 - (4096 - var11[var44] << 12) / var47 : 0;
                                                    var10[var44] = var45 == 0 ? 0 : 4096 - (-var9[var44] + 4096 << 12) / var45;
                                                    var7[var44] = var46 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var46 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class72.field1359; ++var48) {
                                                int var49 = var12[var48];
                                                int var50 = var8[var48];
                                                int var51 = var6[var48];
                                                var13[var48] = var51 == 4096 ? 4096 : (var11[var48] << 12) / (-var51 + 4096);
                                                var10[var48] = var50 == 4096 ? 4096 : (var9[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (-var49 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class72.field1359 < ~var52; ++var52) {
                                            int var53 = var11[var52];
                                            int var54 = var14[var52];
                                            int var55 = var9[var52];
                                            var13[var52] = ~var53 <= -2049 ? -((4096 - var6[var52]) * (4096 - var53) >> 11) + 4096 : var6[var52] * var53 >> 11;
                                            var10[var52] = var55 < 2048 ? var8[var52] * var55 >> 11 : 4096 - ((-var8[var52] + 4096) * (-var55 + 4096) >> 11);
                                            var7[var52] = var54 >= 2048 ? 4096 - ((4096 - var12[var52]) * (4096 - var54) >> 11) : var12[var52] * var54 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class72.field1359; ++var56) {
                                        var13[var56] = 4096 - ((4096 - var6[var56]) * (-var11[var56] + 4096) >> 12);
                                        var10[var56] = -((-var8[var56] + 4096) * (-var9[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var12[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class72.field1359; ++var57) {
                                    int var58 = var11[var57];
                                    int var59 = var9[var57];
                                    int var60 = var14[var57];
                                    var13[var57] = ~var58 == -1 ? 4096 : (var6[var57] << 12) / var58;
                                    var10[var57] = var59 == 0 ? 4096 : (var8[var57] << 12) / var59;
                                    var7[var57] = ~var60 == -1 ? 4096 : (var12[var57] << 12) / var60;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~class72.field1359 < ~var61; ++var61) {
                                var13[var61] = var6[var61] * var11[var61] >> 12;
                                var10[var61] = var8[var61] * var9[var61] >> 12;
                                var7[var61] = var12[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class72.field1359; ++var62) {
                            var13[var62] = var6[var62] - var11[var62];
                            var10[var62] = var8[var62] + -var9[var62];
                            var7[var62] = var12[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class72.field1359 < ~var63; ++var63) {
                        var13[var63] = var6[var63] - -var11[var63];
                        var10[var63] = var8[var63] + var9[var63];
                        var7[var63] = var12[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field695;
        if (arg2) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field373 = arg0.method1265(126) == 1;
                }
            } else {
                this.field693 = arg0.method1265(123);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
    public static void method259(int arg0) {
        field696 = null;
        field694 = null;
        if (arg0 >= 110) {
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class41() {
        super(2, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        int[] var3 = super.field369.method306(arg1, -23179);
        if (arg0 >= -13) {
            field699 = false;
        }
        ++field698;
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 99, 0);
            int[] var5 = this.method155(arg1, (byte) 87, 1);
            int var6 = this.field693;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class72.field1359 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class72.field1359 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class72.field1359; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class72.field1359; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class72.field1359 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class72.field1359 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class72.field1359; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class72.field1359 > var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class72.field1359 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class72.field1359 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class72.field1359; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class72.field1359 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
