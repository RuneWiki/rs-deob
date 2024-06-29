import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class424 extends class220 {

    @OriginalMember(owner = "client!vn", name = "X", descriptor = "I")
    private int field6309 = 6;

    @OriginalMember(owner = "client!vn", name = "U", descriptor = "[I")
    public static int[] field6306 = new int[32];

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "J")
    public static long field6304 = 0L;

    @OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
    public static int field6305 = 0;

    @OriginalMember(owner = "client!vn", name = "W", descriptor = "I")
    public static volatile int field6308 = 0;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!vn", name = "Y", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!vn", name = "V", descriptor = "Las;")
    public static class177 field6307;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBLil;)V", line = 3)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field3131 = ~arg2.method1697(84) == -2;
            }
        } else {
            this.field6309 = arg2.method1697(arg1 ^ -91);
        }
        if (arg1 != -49) {
            field6308 = 14;
        }
        ++field6302;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V", line = 45)
    public static void method2726(boolean arg0) {
        field6307 = null;
        if (arg0) {
            field6308 = -58;
        }
        field6306 = null;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)[[I", line = 61)
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            field6308 = -11;
        }
        ++field6303;
        int[][] var3 = super.field3135.method1774(arg0, arg1 ^ -2);
        if (super.field3135.field4087) {
            int[][] var4 = this.method1369(0, (byte) 116, arg0);
            int[][] var5 = this.method1369(1, (byte) 115, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field6309;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class344.field5043; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var21 + var22 - (var21 * var22 >> 11);
                                                                var7[var16] = -(var17 * var20 >> 11) + var17 + var20;
                                                                var8[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class344.field5043 > var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var12[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var24 >= ~var26 ? -var24 + var26 : -var26 + var24;
                                                            var7[var23] = var27 <= var25 ? -var27 + var25 : -var25 + var27;
                                                            var8[var23] = ~var28 >= ~var29 ? -var28 + var29 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class344.field5043 < ~var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 <= var34 ? var34 : var36;
                                                        var7[var30] = ~var35 >= ~var32 ? var32 : var35;
                                                        var8[var30] = ~var31 <= ~var33 ? var31 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class344.field5043; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var41 >= var42 ? var42 : var41;
                                                    var7[var37] = ~var38 < ~var43 ? var43 : var38;
                                                    var8[var37] = ~var40 >= ~var39 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class344.field5043 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var46 != -1 ? -((4096 - var13[var44] << 12) / var46) + 4096 : 0;
                                                var8[var44] = var47 == 0 ? 0 : 4096 - (4096 - var14[var44] << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class344.field5043; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (4096 - var51) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class344.field5043 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((4096 - var55) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = ~var53 <= -2049 ? -((4096 - var10[var52]) * (4096 - var53) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class344.field5043; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class344.field5043; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = var59 != 0 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class344.field5043 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class344.field5043; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class344.field5043; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V", line = 395)
    public class424() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(II)[I", line = 398)
    public final int[] method43(int arg0, int arg1) {
        ++field6301;
        if (arg0 != -11543) {
            return null;
        } else {
            int[] var3 = super.field3125.method2005(arg1, (byte) -81);
            if (super.field3125.field4676) {
                int[] var4 = this.method1366(0, (byte) -40, arg1);
                int[] var5 = this.method1366(1, (byte) -40, arg1);
                int var6 = this.field6309;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (var6 != 9) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; var7 < class344.field5043; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var9 - -var8 - (var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class344.field5043 > var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = var11 >= var12 ? var11 - var12 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class344.field5043 < ~var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = var15 < var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class344.field5043 < ~var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 > var17 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class344.field5043; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 == -1 ? 0 : 4096 - (-var5[var19] + 4096 << 12) / var20;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < class344.field5043; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class344.field5043 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; class344.field5043 > var25; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class344.field5043; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class344.field5043; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class344.field5043; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class344.field5043 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }
}
