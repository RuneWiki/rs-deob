import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class401 extends class83 {

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    private int field5851 = 6;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "Lmk;")
    public static class154 field5852 = new class154();

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "[I")
    public static int[] field5855 = new int[256];

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "J")
    public static volatile long field5858;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field5854;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = -306674912 ^ var1 >>> 1;
                }
            }
            field5855[var0] = var1;
        }
        field5857 = 0;
        field5856 = 0;
        field5858 = 0L;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2518(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -107) {
            method2519(true);
        }
        ++field5853;
        int var4 = -arg3 + 255;
        int var5 = ((arg0 & 65280) * arg3 & 16711680 | (arg0 & 16711935) * arg3 & -16711936) >>> 8;
        return (((16711935 & arg2) * var4 & -16711936 | (arg2 & 65280) * var4 & 16711680) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I", line = 19)
    public final int[] method37(int arg0, int arg1) {
        ++field5849;
        int[] var3 = super.field916.method1813(arg1, (byte) 9);
        if (arg0 != 2) {
            field5858 = 87L;
        }
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 81, arg1);
            int[] var5 = this.method451(1, 99, arg1);
            int var6 = this.field5851;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class420.field6139; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class420.field6139; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class420.field6139 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 > ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class420.field6139; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 <= ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class420.field6139; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class420.field6139 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class420.field6139; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class420.field6139 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class420.field6139 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class420.field6139 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class420.field6139 > var29; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class420.field6139; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)[[I", line = 270)
    public final int[][] method21(boolean arg0, int arg1) {
        if (!arg0) {
            field5855 = null;
        }
        ++field5854;
        int[][] var3 = super.field927.method1774((byte) -22, arg1);
        if (super.field927.field4104) {
            int[][] var4 = this.method449(0, true, arg1);
            int[][] var5 = this.method449(1, true, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field5851;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class420.field6139 < ~var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var17 + var22 - (var17 * var22 >> 11);
                                                                var7[var16] = -(var18 * var21 >> 11) + var21 + var18;
                                                                var8[var16] = var19 - -var20 + -(var19 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class420.field6139 < ~var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var11[var23];
                                                            var6[var23] = ~var28 < ~var27 ? -var27 + var28 : var27 - var28;
                                                            var7[var23] = ~var26 <= ~var25 ? var26 - var25 : -var26 + var25;
                                                            var8[var23] = var24 < var29 ? -var24 + var29 : -var29 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class420.field6139; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var31 >= ~var35 ? var35 : var31;
                                                        var7[var30] = var32 < var36 ? var36 : var32;
                                                        var8[var30] = ~var33 > ~var34 ? var34 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class420.field6139 > var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = ~var40 >= ~var38 ? var40 : var38;
                                                    var7[var37] = ~var39 < ~var43 ? var43 : var39;
                                                    var8[var37] = var41 > var42 ? var42 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class420.field6139; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = var46 == 0 ? 0 : -((4096 - var13[var44] << 12) / var46) + 4096;
                                                var8[var44] = var47 != 0 ? 4096 - (-var14[var44] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class420.field6139 < ~var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 != 4096 ? (var12[var48] << 12) / (4096 - var51) : 4096;
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var49);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class420.field6139 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 >= 2048 ? 4096 - ((-var9[var52] + 4096) * (-var55 + 4096) >> 11) : var9[var52] * var55 >> 11;
                                        var7[var52] = var54 < 2048 ? var10[var52] * var54 >> 11 : 4096 - ((4096 - var10[var52]) * (-var54 + 4096) >> 11);
                                        var8[var52] = var53 < 2048 ? var11[var52] * var53 >> 11 : -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class420.field6139; ++var56) {
                                    var6[var56] = 4096 - ((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12);
                                    var7[var56] = 4096 - ((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class420.field6139 > var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var60 == -1 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class420.field6139; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class420.field6139; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class420.field6139; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 590)
    public class401() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)V", line = 596)
    public static void method2519(boolean arg0) {
        if (arg0) {
            field5855 = null;
            field5852 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLtq;)V", line = 618)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field5850;
        int var4 = -12 / ((arg1 - -27) / 50);
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field924 = ~arg2.method1350(31351) == -2;
            }
        } else {
            this.field5851 = arg2.method1350(31351);
        }
    }
}
