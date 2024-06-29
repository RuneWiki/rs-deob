import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class204 extends class354 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    private int field2721 = 6;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "Lla;")
    public static class319 field2726 = new class319(45, 0);

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V", line = 3)
    public static void method1377(boolean arg0) {
        field2726 = null;
        if (!arg0) {
            field2726 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I", line = 13)
    public final int[][] method354(int arg0, byte arg1) {
        int var3 = 25 % ((48 - arg1) / 60);
        ++field2724;
        int[][] var4 = super.field5474.method2414((byte) -96, arg0);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[][] var6 = this.method2274((byte) 84, arg0, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field2721;
            if (var16 != 1) {
                if (var16 != 2) {
                    if (~var16 != -4) {
                        if (~var16 != -5) {
                            if (var16 != 5) {
                                if (~var16 != -7) {
                                    if (~var16 != -8) {
                                        if (~var16 != -9) {
                                            if (var16 != 9) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~class531.field7814 < ~var17; ++var17) {
                                                                int var18 = var12[var17];
                                                                int var19 = var13[var17];
                                                                int var20 = var11[var17];
                                                                int var21 = var14[var17];
                                                                int var22 = var15[var17];
                                                                int var23 = var10[var17];
                                                                var7[var17] = var19 - (var19 * var23 >> 11) + var23;
                                                                var8[var17] = -(var20 * var21 >> 11) + var20 - -var21;
                                                                var9[var17] = -(var18 * var22 >> 11) + var22 + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class531.field7814 > var24; ++var24) {
                                                            int var25 = var12[var24];
                                                            int var26 = var13[var24];
                                                            int var27 = var14[var24];
                                                            int var28 = var11[var24];
                                                            int var29 = var15[var24];
                                                            int var30 = var10[var24];
                                                            var7[var24] = ~var30 >= ~var26 ? -var30 + var26 : -var26 + var30;
                                                            var8[var24] = var28 > var27 ? var28 - var27 : -var28 + var27;
                                                            var9[var24] = ~var29 <= ~var25 ? var29 - var25 : -var29 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~class531.field7814 < ~var31; ++var31) {
                                                        int var32 = var14[var31];
                                                        int var33 = var11[var31];
                                                        int var34 = var15[var31];
                                                        int var35 = var12[var31];
                                                        int var36 = var13[var31];
                                                        int var37 = var10[var31];
                                                        var7[var31] = ~var36 > ~var37 ? var37 : var36;
                                                        var8[var31] = var33 > var32 ? var33 : var32;
                                                        var9[var31] = ~var34 > ~var35 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; class531.field7814 > var38; ++var38) {
                                                    int var39 = var13[var38];
                                                    int var40 = var14[var38];
                                                    int var41 = var15[var38];
                                                    int var42 = var10[var38];
                                                    int var43 = var12[var38];
                                                    int var44 = var11[var38];
                                                    var7[var38] = ~var39 >= ~var42 ? var39 : var42;
                                                    var8[var38] = ~var44 <= ~var40 ? var40 : var44;
                                                    var9[var38] = var41 <= var43 ? var41 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~var45 > ~class531.field7814; ++var45) {
                                                int var46 = var11[var45];
                                                int var47 = var12[var45];
                                                int var48 = var10[var45];
                                                var7[var45] = ~var48 == -1 ? 0 : -((-var13[var45] + 4096 << 12) / var48) + 4096;
                                                var8[var45] = var46 == 0 ? 0 : -((-var14[var45] + 4096 << 12) / var46) + 4096;
                                                var9[var45] = ~var47 == -1 ? 0 : 4096 - (-var15[var45] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class531.field7814 > var49; ++var49) {
                                            int var50 = var10[var49];
                                            int var51 = var11[var49];
                                            int var52 = var12[var49];
                                            var7[var49] = var50 != 4096 ? (var13[var49] << 12) / (4096 - var50) : 4096;
                                            var8[var49] = ~var51 == -4097 ? 4096 : (var14[var49] << 12) / (4096 - var51);
                                            var9[var49] = var52 == 4096 ? 4096 : (var15[var49] << 12) / (-var52 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class531.field7814; ++var53) {
                                        int var54 = var15[var53];
                                        int var55 = var13[var53];
                                        int var56 = var14[var53];
                                        var7[var53] = ~var55 > -2049 ? var10[var53] * var55 >> 11 : -((-var10[var53] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var53] = ~var56 > -2049 ? var11[var53] * var56 >> 11 : 4096 - ((4096 - var11[var53]) * (-var56 + 4096) >> 11);
                                        var9[var53] = var54 < 2048 ? var12[var53] * var54 >> 11 : 4096 - ((4096 - var54) * (-var12[var53] + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class531.field7814; ++var57) {
                                    var7[var57] = -((4096 - var10[var57]) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((4096 - var11[var57]) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~var58 > ~class531.field7814; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var7[var58] = var60 == 0 ? 4096 : (var10[var58] << 12) / var60;
                                var8[var58] = var59 == 0 ? 4096 : (var11[var58] << 12) / var59;
                                var9[var58] = ~var61 != -1 ? (var12[var58] << 12) / var61 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; class531.field7814 > var62; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class531.field7814; ++var63) {
                        var7[var63] = var10[var63] + -var13[var63];
                        var8[var63] = var11[var63] + -var14[var63];
                        var9[var63] = var12[var63] - var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; ~class531.field7814 < ~var64; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] - -var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(BI)[I", line = 329)
    public final int[] method270(byte arg0, int arg1) {
        ++field2723;
        if (arg0 >= -74) {
            field2726 = null;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 111, 0, arg1);
            int[] var5 = this.method2275((byte) 75, 1, arg1);
            int var6 = this.field2721;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class531.field7814 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - ((var8 * var9 >> 11) + -var8);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class531.field7814; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class531.field7814 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class531.field7814; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class531.field7814 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class531.field7814; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class531.field7814 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class531.field7814 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class531.field7814 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class531.field7814 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class531.field7814; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class531.field7814 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 577)
    public class204() {
        super(2, false);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lnj;II)V", line = 588)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field2722;
        if (arg2 != 1638) {
            method1377(false);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field5466 = ~arg0.method1087(false) == -2;
            }
        } else {
            this.field2721 = arg0.method1087(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Luu;ILuu;Luu;Lwt;)Z", line = 622)
    public static final boolean method1378(class191 arg0, int arg1, class191 arg2, class191 arg3, class206 arg4) {
        class370.field5659 = arg3;
        class52.field741 = arg0;
        if (arg1 != 1) {
            return false;
        } else {
            class480.field7082 = arg4;
            class164.field2213 = arg2;
            ++field2725;
            return true;
        }
    }
}
