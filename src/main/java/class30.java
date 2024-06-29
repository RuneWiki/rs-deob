import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class30 extends class185 {

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    private int field430 = 6;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Z")
    public static boolean field428 = false;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[I")
    public static int[] field431 = new int[14];

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field433 = -2;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "J")
    public static long field436 = 0L;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lpf;")
    public static class294 field438;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lja;")
    public static class60 field437;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)V")
    public static final void method188(boolean arg0) {
        class136.field1990 = -1;
        class205.field3077 = 0;
        class18.field216 = 0;
        class157.field2367 = -1;
        class196.field2979.field3748 = 0;
        class100.field1580.field3748 = 0;
        class202.field3050 = 0;
        ++field435;
        class85.field1366 = -1;
        class218.field3275 = false;
        class56.field892 = 0;
        class214.field3211 = 0;
        class218.field3278 = 0;
        class246.field3683 = -1;
        for (int var1 = 0; ~class96.field1521.length < ~var1; ++var1) {
            if (class96.field1521[var1] != null) {
                class96.field1521[var1].field2283 = -1;
            }
        }
        for (int var2 = 0; var2 < class18.field220.length; ++var2) {
            if (class18.field220[var2] != null) {
                class18.field220[var2].field2283 = -1;
            }
        }
        class180.method1124(9721);
        class253.field3837 = 1;
        class203.method1292(30, arg0);
        for (int var3 = 0; var3 < 100; ++var3) {
            class7.field105[var3] = true;
        }
        class24.method150(arg0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field439;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 124, arg0, 0);
            int[] var5 = this.method1146((byte) 121, arg0, 1);
            int var6 = this.field430;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class174.field2648; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class174.field2648; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 <= var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class174.field2648 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var15 > ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class174.field2648; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 < ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class174.field2648 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class174.field2648; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class174.field2648; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class174.field2648; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class174.field2648 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class174.field2648; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class174.field2648; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class174.field2648 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 < 70) {
            method190(41, -108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            method188(true);
        }
        ++field434;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(false, 0, arg1);
            int[][] var5 = this.method1152(false, 1, arg1);
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field430;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class174.field2648 > var16; ++var16) {
                                                                int var17 = var6[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var8[var16];
                                                                int var22 = var9[var16];
                                                                var7[var16] = var17 - (var17 * var18 >> 11) + var18;
                                                                var11[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var10[var16] = -(var20 * var22 >> 11) + var22 + var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class174.field2648; ++var23) {
                                                            int var24 = var6[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var8[var23];
                                                            var7[var23] = var28 < var24 ? -var28 + var24 : -var24 + var28;
                                                            var11[var23] = ~var29 >= ~var25 ? -var29 + var25 : -var25 + var29;
                                                            var10[var23] = var27 >= var26 ? -var26 + var27 : -var27 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class174.field2648; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var6[var30];
                                                        int var34 = var14[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var8[var30];
                                                        var7[var30] = var35 >= var33 ? var35 : var33;
                                                        var11[var30] = var31 < var36 ? var36 : var31;
                                                        var10[var30] = var32 > var34 ? var32 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class174.field2648 > var37; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var6[var37];
                                                    int var43 = var8[var37];
                                                    var7[var37] = ~var39 < ~var42 ? var42 : var39;
                                                    var11[var37] = ~var43 > ~var40 ? var43 : var40;
                                                    var10[var37] = var41 < var38 ? var41 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class174.field2648 < ~var44; ++var44) {
                                                int var45 = var6[var44];
                                                int var46 = var9[var44];
                                                int var47 = var8[var44];
                                                var7[var44] = var45 != 0 ? -((4096 - var12[var44] << 12) / var45) + 4096 : 0;
                                                var11[var44] = ~var47 != -1 ? -((4096 - var13[var44] << 12) / var47) + 4096 : 0;
                                                var10[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class174.field2648 > var48; ++var48) {
                                            int var49 = var6[var48];
                                            int var50 = var9[var48];
                                            int var51 = var8[var48];
                                            var7[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var11[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var10[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class174.field2648 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var7[var52] = var54 < 2048 ? var6[var52] * var54 >> 11 : 4096 - ((4096 - var6[var52]) * (-var54 + 4096) >> 11);
                                        var11[var52] = ~var53 > -2049 ? var8[var52] * var53 >> 11 : -((-var8[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var10[var52] = ~var55 <= -2049 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class174.field2648; ++var56) {
                                    var7[var56] = -((-var6[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var11[var56] = -((4096 - var8[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var10[var56] = 4096 - ((-var9[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class174.field2648 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var7[var57] = ~var60 == -1 ? 4096 : (var6[var57] << 12) / var60;
                                var11[var57] = ~var59 != -1 ? (var8[var57] << 12) / var59 : 4096;
                                var10[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class174.field2648; ++var61) {
                            var7[var61] = var6[var61] * var12[var61] >> 12;
                            var11[var61] = var8[var61] * var13[var61] >> 12;
                            var10[var61] = var9[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class174.field2648 < ~var62; ++var62) {
                        var7[var62] = var6[var62] + -var12[var62];
                        var11[var62] = var8[var62] + -var13[var62];
                        var10[var62] = var9[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class174.field2648; ++var63) {
                    var7[var63] = var6[var63] + var12[var63];
                    var11[var63] = var8[var63] + var13[var63];
                    var10[var63] = var9[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static void method189(int arg0) {
        field431 = null;
        field438 = null;
        field437 = null;
        int var1 = -40 / ((-60 - arg0) / 62);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field432;
        if (arg2 == -6357) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    super.field2814 = arg1.method1593((byte) 27) == 1;
                }
            } else {
                this.field430 = arg1.method1593((byte) 27);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I")
    public static final int method190(int arg0, int arg1) {
        ++field429;
        if (arg0 != -616323832) {
            method188(false);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class30() {
        super(2, false);
    }
}
