import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class205 extends class43 {

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    private int field3748 = 6;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Lmb;")
    public static class132 field3749 = class166.method1092("Ausw-=hlen", 113);

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lmb;")
    public static class132 field3752 = class166.method1092("cookieprefix", 113);

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Lmb;")
    public static class132 field3750 = class166.method1092("Angreifen", 112);

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "[Lhh;")
    public static class85[] field3755;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field3751;
        if (arg1 == -73) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    super.field746 = arg2.method716(-1308) == 1;
                }
            } else {
                this.field3748 = arg2.method716(-1308);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class205() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public static void method1286(int arg0) {
        field3752 = null;
        field3749 = null;
        int var1 = -86 % ((arg0 - 43) / 51);
        field3755 = null;
        field3750 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field3753;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(arg1 + -119, 0, arg0);
            int[] var5 = this.method300(arg1 ^ -68, 1, arg0);
            int var6 = this.field3748;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class131.field2427; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class131.field2427; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class131.field2427; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 > var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class131.field2427; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 <= var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class131.field2427 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class131.field2427 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class131.field2427 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((4096 - var4[var23]) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class131.field2427 > var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class131.field2427 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class131.field2427 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class131.field2427 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class131.field2427; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            return null;
        } else {
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            ++field3754;
            if (super.field764.field3960) {
                int[][] var4 = this.method301(arg1, (byte) 39, 0);
                int[][] var5 = this.method301(arg1, (byte) 127, 1);
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var5[0];
                int[] var12 = var4[2];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field3748;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (~var15 != -5) {
                                if (~var15 != -6) {
                                    if (~var15 != -7) {
                                        if (~var15 != -8) {
                                            if (var15 != 8) {
                                                if (var15 != 9) {
                                                    if (~var15 != -11) {
                                                        if (~var15 != -12) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; class131.field2427 > var16; ++var16) {
                                                                    int var17 = var12[var16];
                                                                    int var18 = var11[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var13[var16];
                                                                    int var22 = var10[var16];
                                                                    var7[var16] = var19 - (-var18 - -(var18 * var19 >> 11));
                                                                    var6[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                    var8[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~class131.field2427 < ~var23; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var11[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var9[var23];
                                                                int var28 = var13[var23];
                                                                int var29 = var10[var23];
                                                                var7[var23] = var25 >= var27 ? -var27 + var25 : var27 - var25;
                                                                var6[var23] = ~var28 > ~var29 ? var29 - var28 : var28 - var29;
                                                                var8[var23] = var24 > var26 ? -var26 + var24 : -var24 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class131.field2427; ++var30) {
                                                            int var31 = var9[var30];
                                                            int var32 = var10[var30];
                                                            int var33 = var14[var30];
                                                            int var34 = var11[var30];
                                                            int var35 = var13[var30];
                                                            int var36 = var12[var30];
                                                            var7[var30] = var31 <= var34 ? var34 : var31;
                                                            var6[var30] = ~var32 < ~var35 ? var32 : var35;
                                                            var8[var30] = ~var33 <= ~var36 ? var33 : var36;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class131.field2427; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var11[var37];
                                                        int var41 = var10[var37];
                                                        int var42 = var9[var37];
                                                        int var43 = var12[var37];
                                                        var7[var37] = ~var40 >= ~var42 ? var40 : var42;
                                                        var6[var37] = var38 > var41 ? var41 : var38;
                                                        var8[var37] = var43 >= var39 ? var39 : var43;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class131.field2427; ++var44) {
                                                    int var45 = var12[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var10[var44];
                                                    var7[var44] = ~var46 != -1 ? -((-var11[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                    var6[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                    var8[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; class131.field2427 > var48; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var12[var48];
                                                int var51 = var10[var48];
                                                var7[var48] = ~var49 == -4097 ? 4096 : (var11[var48] << 12) / (4096 - var49);
                                                var6[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                                var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; class131.field2427 > var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var11[var52];
                                            var7[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                            var6[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                            var8[var52] = ~var53 > -2049 ? var12[var52] * var53 >> 11 : -((4096 - var12[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; class131.field2427 > var56; ++var56) {
                                        var7[var56] = 4096 - ((-var9[var56] + 4096) * (-var11[var56] + 4096) >> 12);
                                        var6[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = 4096 - ((4096 - var12[var56]) * (-var14[var56] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class131.field2427; ++var57) {
                                    int var58 = var14[var57];
                                    int var59 = var11[var57];
                                    int var60 = var13[var57];
                                    var7[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                    var6[var57] = ~var60 == -1 ? 4096 : (var10[var57] << 12) / var60;
                                    var8[var57] = var58 != 0 ? (var12[var57] << 12) / var58 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; ~var61 > ~class131.field2427; ++var61) {
                                var7[var61] = var9[var61] * var11[var61] >> 12;
                                var6[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var12[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class131.field2427; ++var62) {
                            var7[var62] = var9[var62] + -var11[var62];
                            var6[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var12[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class131.field2427 < ~var63; ++var63) {
                        var7[var63] = var9[var63] + var11[var63];
                        var6[var63] = var10[var63] + var13[var63];
                        var8[var63] = var12[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }
}
