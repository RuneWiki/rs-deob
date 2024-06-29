import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class51 extends class512 {

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    private int field833 = 6;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Llo;")
    public static class306 field838 = new class306("M", "M", "M", "M");

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILia;)V", line = 3)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field832;
        if (!arg0) {
            method363((byte) -87);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field7491 = ~arg2.method126((byte) -83) == -2;
            }
        } else {
            this.field833 = arg2.method126((byte) -104);
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)J", line = 38)
    public static final long method362(int arg0) {
        ++field837;
        if (arg0 != -28150) {
            field838 = null;
        }
        return class162.field2584.method263(11854);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I", line = 49)
    public final int[] method75(int arg0, byte arg1) {
        ++field834;
        int var3 = -101 % ((43 - arg1) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, arg0);
            int[] var6 = this.method3013(false, 1, arg0);
            int var7 = this.field833;
            if (~var7 != -2) {
                if (var7 != 2) {
                    if (~var7 != -4) {
                        if (~var7 != -5) {
                            if (var7 != 5) {
                                if (var7 != 6) {
                                    if (~var7 != -8) {
                                        if (var7 != 8) {
                                            if (var7 != 9) {
                                                if (~var7 != -11) {
                                                    if (~var7 != -12) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; var8 < class402.field6113; ++var8) {
                                                                int var9 = var5[var8];
                                                                int var10 = var6[var8];
                                                                var4[var8] = -(var9 * var10 >> 11) + var9 + var10;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; var11 < class402.field6113; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = ~var13 <= ~var12 ? -var12 + var13 : -var13 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; class402.field6113 > var14; ++var14) {
                                                        int var15 = var6[var14];
                                                        int var16 = var5[var14];
                                                        var4[var14] = var16 <= var15 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~class402.field6113 < ~var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var4[var17] = ~var19 < ~var18 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; class402.field6113 > var20; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = ~var21 == -1 ? 0 : -((-var6[var20] + 4096 << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; ~var22 > ~class402.field6113; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = var23 != 4096 ? (var6[var22] << 12) / (-var23 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class402.field6113; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = ~var25 <= -2049 ? -((4096 - var5[var24]) * (-var25 + 4096) >> 11) + 4096 : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class402.field6113 < ~var26; ++var26) {
                                    var4[var26] = 4096 - ((-var5[var26] + 4096) * (-var6[var26] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var27 = 0; class402.field6113 > var27; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = var28 == 0 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class402.field6113 < ~var29; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class402.field6113; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; class402.field6113 > var31; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 298)
    public static void method363(byte arg0) {
        int var1 = -92 / ((52 - arg0) / 61);
        field838 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 649)
    public class51() {
        super(2, false);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)V", line = 312)
    public static final void method364(int arg0, int arg1) {
        if (arg1 != 4096) {
            field838 = null;
        }
        class505.field7357 = null;
        class257.field4335 = arg0;
        class432.field6464 = 1;
        ++field836;
        class264.field4416 = -1;
        class375.field5837 = 0;
        class104.field1743 = -1;
        class321.field5055 = false;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I", line = 335)
    public final int[][] method278(int arg0, int arg1) {
        ++field835;
        int var3 = 47 % ((-40 - arg0) / 47);
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 65, 0);
            int[][] var6 = this.method3012(arg1, 74, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field833;
            if (var16 != 1) {
                if (var16 != 2) {
                    if (var16 != 3) {
                        if (var16 != 4) {
                            if (~var16 != -6) {
                                if (~var16 != -7) {
                                    if (~var16 != -8) {
                                        if (var16 != 8) {
                                            if (~var16 != -10) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class402.field6113 > var17; ++var17) {
                                                                int var18 = var12[var17];
                                                                int var19 = var15[var17];
                                                                int var20 = var10[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var13[var17];
                                                                int var23 = var14[var17];
                                                                var7[var17] = var22 - (var20 * var22 >> 11) + var20;
                                                                var8[var17] = var21 - -var23 + -(var21 * var23 >> 11);
                                                                var9[var17] = var18 - -var19 + -(var18 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~class402.field6113 < ~var24; ++var24) {
                                                            int var25 = var10[var24];
                                                            int var26 = var13[var24];
                                                            int var27 = var12[var24];
                                                            int var28 = var14[var24];
                                                            int var29 = var15[var24];
                                                            int var30 = var11[var24];
                                                            var7[var24] = var25 <= var26 ? -var25 + var26 : -var26 + var25;
                                                            var8[var24] = ~var30 >= ~var28 ? -var30 + var28 : -var28 + var30;
                                                            var9[var24] = var29 < var27 ? -var29 + var27 : var29 - var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; ~var31 > ~class402.field6113; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var14[var31];
                                                        int var34 = var12[var31];
                                                        int var35 = var15[var31];
                                                        int var36 = var10[var31];
                                                        int var37 = var13[var31];
                                                        var7[var31] = var37 >= var36 ? var37 : var36;
                                                        var8[var31] = var33 >= var32 ? var33 : var32;
                                                        var9[var31] = var34 <= var35 ? var35 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; var38 < class402.field6113; ++var38) {
                                                    int var39 = var15[var38];
                                                    int var40 = var11[var38];
                                                    int var41 = var10[var38];
                                                    int var42 = var12[var38];
                                                    int var43 = var13[var38];
                                                    int var44 = var14[var38];
                                                    var7[var38] = ~var43 < ~var41 ? var41 : var43;
                                                    var8[var38] = var40 >= var44 ? var44 : var40;
                                                    var9[var38] = ~var39 >= ~var42 ? var39 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; ~var45 > ~class402.field6113; ++var45) {
                                                int var46 = var10[var45];
                                                int var47 = var12[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = var46 == 0 ? 0 : 4096 - (4096 - var13[var45] << 12) / var46;
                                                var8[var45] = ~var48 != -1 ? -((4096 - var14[var45] << 12) / var48) + 4096 : 0;
                                                var9[var45] = ~var47 == -1 ? 0 : -((-var15[var45] + 4096 << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; ~var49 > ~class402.field6113; ++var49) {
                                            int var50 = var10[var49];
                                            int var51 = var11[var49];
                                            int var52 = var12[var49];
                                            var7[var49] = var50 != 4096 ? (var13[var49] << 12) / (4096 - var50) : 4096;
                                            var8[var49] = var51 == 4096 ? 4096 : (var14[var49] << 12) / (4096 - var51);
                                            var9[var49] = var52 == 4096 ? 4096 : (var15[var49] << 12) / (4096 - var52);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; class402.field6113 > var53; ++var53) {
                                        int var54 = var13[var53];
                                        int var55 = var14[var53];
                                        int var56 = var15[var53];
                                        var7[var53] = var54 >= 2048 ? -((4096 - var10[var53]) * (-var54 + 4096) >> 11) + 4096 : var10[var53] * var54 >> 11;
                                        var8[var53] = ~var55 > -2049 ? var11[var53] * var55 >> 11 : -((-var11[var53] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var9[var53] = ~var56 <= -2049 ? -((-var12[var53] + 4096) * (-var56 + 4096) >> 11) + 4096 : var12[var53] * var56 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class402.field6113; ++var57) {
                                    var7[var57] = -((4096 - var10[var57]) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((4096 - var11[var57]) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((-var12[var57] + 4096) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; var58 < class402.field6113; ++var58) {
                                int var59 = var14[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var7[var58] = ~var60 != -1 ? (var10[var58] << 12) / var60 : 4096;
                                var8[var58] = var59 == 0 ? 4096 : (var11[var58] << 12) / var59;
                                var9[var58] = var61 == 0 ? 4096 : (var12[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; var62 < class402.field6113; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class402.field6113; ++var63) {
                        var7[var63] = var10[var63] + -var13[var63];
                        var8[var63] = var11[var63] + -var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class402.field6113 > var64; ++var64) {
                    var7[var64] = var10[var64] - -var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] - -var15[var64];
                }
            }
        }
        return var4;
    }
}
