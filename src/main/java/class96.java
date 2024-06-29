import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class96 extends class115 {

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    private int field1078 = 6;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field1076 = new String[200];

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static volatile int field1077 = 0;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Ljf;")
    public static class119 field1071;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Lra;")
    public static class57 field1073;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Lra;")
    public static class57 field1075;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLbk;I)V", line = 4)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field1068;
        if (arg0 <= 83) {
            this.method149((byte) 59, (class211) null, 40);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1347 = arg1.method1342((byte) -126) == 1;
            }
        } else {
            this.field1078 = arg1.method1342((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I", line = 40)
    public final int[][] method144(int arg0, int arg1) {
        ++field1074;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 109);
        if (super.field1342.field5819) {
            int[][] var4 = this.method639((byte) 34, arg0, 0);
            int[][] var5 = this.method639((byte) 34, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1078;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class218.field2979 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var7[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var8[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class218.field2979 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var27 >= ~var24 ? -var27 + var24 : -var24 + var27;
                                                            var7[var23] = var26 < var25 ? var25 - var26 : -var25 + var26;
                                                            var8[var23] = var29 >= var28 ? -var28 + var29 : -var29 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class218.field2979; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var32 <= var33 ? var33 : var32;
                                                        var7[var30] = var31 < var36 ? var36 : var31;
                                                        var8[var30] = var34 > var35 ? var34 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class218.field2979 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = var39 < var42 ? var39 : var42;
                                                    var7[var37] = ~var38 > ~var43 ? var38 : var43;
                                                    var8[var37] = var41 > var40 ? var40 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class218.field2979; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class218.field2979; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var50);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class218.field2979 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = var54 < 2048 ? var11[var52] * var54 >> 11 : -((4096 - var11[var52]) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class218.field2979 > var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((4096 - var10[var56]) * (4096 - var13[var56]) >> 12);
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class218.field2979; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class218.field2979 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class218.field2979; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class218.field2979 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        int var64 = 94 % ((arg1 - -80) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 356)
    public static void method517(boolean arg0) {
        field1075 = null;
        field1076 = null;
        if (arg0) {
            field1073 = null;
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I", line = 373)
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field1070;
            int[] var3 = super.field1340.method14(65, arg0);
            if (super.field1340.field35) {
                int[] var4 = this.method631(true, 0, arg0);
                int[] var5 = this.method631(true, 1, arg0);
                int var6 = this.field1078;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (~var6 != -12) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; ~class218.field2979 < ~var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class218.field2979 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var11 >= ~var12 ? var12 - var11 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~class218.field2979 < ~var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = ~var15 <= ~var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class218.field2979 > var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class218.field2979 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class218.field2979 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class218.field2979; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = ~var24 <= -2049 ? -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class218.field2979; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class218.field2979; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class218.field2979; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~var29 > ~class218.field2979; ++var29) {
                            var3[var29] = var4[var29] - var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class218.field2979; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBIIIII)V", line = 624)
    public static final void method518(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1072;
        int var8 = arg5 + -334;
        if (~var8 > -1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (-class170.field2383 + class308.field4410) * var8 / 100 + class170.field2383;
        int var10 = arg4 * var9 >> 8;
        int var11 = 16383 & -arg6 + 16384;
        int var12 = 16383 & -arg3 + 16384;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class286.field4025[var11] * -var10 >> 15;
            var15 = class286.field4035[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class286.field4025[var12] * var15 >> 15;
            var15 = class286.field4035[var12] * var15 >> 15;
        }
        class314.field4472 = arg6;
        class77.field869 = arg3;
        class272.field3852 = -var15 + arg0;
        if (arg2 != -123) {
            field1075 = null;
        }
        class272.field3853 = -var13 + arg7;
        class164.field2289 = arg1 - var14;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 676)
    public class96() {
        super(2, false);
    }
}
