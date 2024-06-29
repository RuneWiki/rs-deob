import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class231 extends class371 {

    @OriginalMember(owner = "client!vba", name = "R", descriptor = "I")
    private int field3421 = 6;

    @OriginalMember(owner = "client!vba", name = "J", descriptor = "Z")
    public static boolean field3413 = true;

    @OriginalMember(owner = "client!vba", name = "Q", descriptor = "Z")
    public static boolean field3420 = false;

    @OriginalMember(owner = "client!vba", name = "L", descriptor = "Lqp;")
    public static class586 field3415 = new class586(37, -1);

    @OriginalMember(owner = "client!vba", name = "S", descriptor = "Lqu;")
    public static class364 field3422 = new class364(40, 7);

    @OriginalMember(owner = "client!vba", name = "T", descriptor = "Lqp;")
    public static class586 field3423 = new class586(19, 12);

    @OriginalMember(owner = "client!vba", name = "K", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!vba", name = "M", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!vba", name = "N", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!vba", name = "P", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
    public static final byte[] method1509(int arg0, Object arg1, int arg2, int arg3) {
        ++field3419;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class554.method3238(var4, (byte) -116, arg3, arg0);
        } else if (arg1 instanceof class282) {
            class282 var5 = (class282) arg1;
            return var5.method429(arg2 + -4097, arg0, arg3);
        } else {
            if (arg2 != 4096) {
                method1510(-37);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "(I)V")
    public static void method1510(int arg0) {
        if (arg0 != 1430373515) {
            field3413 = false;
        }
        field3415 = null;
        field3422 = null;
        field3423 = null;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "()V")
    public class231() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field3416;
        int[][] var3 = super.field5364.method3064(arg0 + -35, arg1);
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -56, 0, arg1);
            int[][] var5 = this.method2263((byte) -74, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3421;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class41.field455; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var17 - -var22 + -(var17 * var22 >> 11);
                                                                var7[var16] = -(var18 * var21 >> 11) + var21 + var18;
                                                                var8[var16] = -(var19 * var20 >> 11) + var20 - -var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class41.field455 < ~var23; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var27 >= ~var28 ? var28 - var27 : -var28 + var27;
                                                            var7[var23] = ~var24 <= ~var26 ? -var26 + var24 : -var24 + var26;
                                                            var8[var23] = var25 > var29 ? -var29 + var25 : var29 - var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class41.field455; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var33 <= ~var34 ? var33 : var34;
                                                        var7[var30] = ~var36 >= ~var35 ? var35 : var36;
                                                        var8[var30] = ~var32 > ~var31 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class41.field455 < ~var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var40 <= ~var42 ? var42 : var40;
                                                    var7[var37] = var43 > var38 ? var38 : var43;
                                                    var8[var37] = ~var41 <= ~var39 ? var39 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class41.field455; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = var47 != 0 ? 4096 - (-var13[var44] + 4096 << 12) / var47 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class41.field455 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class41.field455; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class41.field455 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class41.field455 > var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class41.field455; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class41.field455; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class41.field455 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg0 != 36) {
            field3420 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III[BII)V")
    public static final void method1511(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ++field3418;
        if (arg5 > arg2) {
            int var6 = arg0 + arg2;
            int var7 = -arg2 + arg5 >> 2;
            int var8 = -57 / ((-8 - arg4) / 44);
            while (true) {
                --var7;
                if (var7 < 0) {
                    int var9 = -arg2 + arg5 & 3;
                    while (true) {
                        --var9;
                        if (var9 < 0) {
                            return;
                        }
                        arg3[var6++] = 1;
                    }
                }
                arg3[var6++] = 1;
                arg3[var6++] = 1;
                arg3[var6++] = 1;
                arg3[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field3414;
        if (arg0 > -80) {
            field3422 = null;
        }
        int[] var3 = super.field5378.method1451(108, arg1);
        if (super.field5378.field3254) {
            int[] var4 = this.method2260((byte) -54, arg1, 0);
            int[] var5 = this.method2260((byte) -92, arg1, 1);
            int var6 = this.field3421;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class41.field455; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class41.field455; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class41.field455 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class41.field455; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class41.field455; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class41.field455 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class41.field455; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class41.field455 > var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class41.field455 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class41.field455; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class41.field455 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class41.field455; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field3417;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field5360 = ~arg2.method2561((byte) -40) == -2;
            }
        } else {
            this.field3421 = arg2.method2561((byte) -114);
        }
        int var5 = 93 / ((-15 - arg1) / 39);
    }
}
