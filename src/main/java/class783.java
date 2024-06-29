import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class783 extends class325 {

    @OriginalMember(owner = "client!fja", name = "H", descriptor = "I")
    private int field10796 = 6;

    @OriginalMember(owner = "client!fja", name = "D", descriptor = "I")
    public static int field10792 = 0;

    @OriginalMember(owner = "client!fja", name = "G", descriptor = "[C")
    private static char[] field10795 = new char[64];

    @OriginalMember(owner = "client!fja", name = "C", descriptor = "I")
    public static int field10791;

    @OriginalMember(owner = "client!fja", name = "E", descriptor = "I")
    public static int field10793;

    @OriginalMember(owner = "client!fja", name = "F", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!fja", name = "I", descriptor = "I")
    public static int field10797;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field10793;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 <= 21) {
            field10792 = -34;
        }
        if (super.field4727.field6067) {
            int[] var4 = this.method2062(arg1, 0, (byte) 33);
            int[] var5 = this.method2062(arg1, 1, (byte) 33);
            int var6 = this.field10796;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; class261.field3874 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class261.field3874; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? var12 - var11 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class261.field3874 > var13; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class261.field3874; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class261.field3874; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class261.field3874 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class261.field3874 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class261.field3874; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class261.field3874; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class261.field3874; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class261.field3874; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class261.field3874 > var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IB)[[I")
    public final int[][] method360(int arg0, byte arg1) {
        ++field10797;
        int[][] var3 = super.field4733.method1251((byte) 58, arg0);
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, arg1 + 10, arg0);
            int[][] var5 = this.method2063(1, arg1 + 10, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field10796;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class261.field3874; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var20 - -var22 + -(var20 * var22 >> 11);
                                                                var7[var16] = var19 - (var18 * var19 >> 11) + var18;
                                                                var8[var16] = var17 - -var21 - (var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class261.field3874 > var23; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var28 <= ~var24 ? -var24 + var28 : -var28 + var24;
                                                            var7[var23] = ~var25 >= ~var29 ? -var25 + var29 : -var29 + var25;
                                                            var8[var23] = ~var27 > ~var26 ? var26 - var27 : -var26 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class261.field3874 < ~var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var13[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var35 < var36 ? var36 : var35;
                                                        var7[var30] = var32 >= var33 ? var32 : var33;
                                                        var8[var30] = ~var34 >= ~var31 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class261.field3874 > var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var43 < ~var39 ? var39 : var43;
                                                    var7[var37] = ~var38 <= ~var42 ? var42 : var38;
                                                    var8[var37] = var41 > var40 ? var40 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class261.field3874 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = var45 != 0 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class261.field3874 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class261.field3874 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var54 + 4096) >> 11) : var9[var52] * var54 >> 11;
                                        var7[var52] = var55 >= 2048 ? -((4096 - var10[var52]) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var53 <= -2049 ? -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class261.field3874 > var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (4096 - var14[var56]) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; class261.field3874 > var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; class261.field3874 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class261.field3874; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class261.field3874; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return arg1 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!fja", name = "e", descriptor = "(B)V")
    public static void method4337(byte arg0) {
        field10795 = null;
        if (arg0 > -35) {
            method4338(-1, 17, 127, 53);
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field10794;
        if (arg2 > -41) {
            this.method360(-100, (byte) -16);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field4738 = arg0.method2398(-1372747256) == 1;
            }
        } else {
            this.field10796 = arg0.method2398(-1372747256);
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIII)I")
    public static final int method4338(int arg0, int arg1, int arg2, int arg3) {
        ++field10791;
        if (class528.field7227 == null) {
            return 0;
        } else {
            int var4 = arg1 >> 9;
            int var5 = arg3 >> 9;
            if (var4 >= 0 && ~var5 <= -1 && ~(class597.field8132 + -1) <= ~var4 && ~var5 >= ~(class628.field8800 + -1)) {
                if (arg2 != -12040) {
                    method4338(-88, 71, -112, 15);
                }
                int var6 = arg0;
                if (arg0 < 3 && (class66.field931[1][var4][var5] & 2) != 0) {
                    var6 = arg0 + 1;
                }
                return class528.field7227[var6].method1882(arg3, 0, arg1);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "()V")
    public class783() {
        super(2, false);
    }

    static {
        for (int var0 = 0; var0 < 26; ++var0) {
            field10795[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field10795[var1] = (char) (var1 - 26 + 97);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field10795[var2] = (char) (var2 + -4);
        }
        field10795[62] = '*';
        field10795[63] = '-';
    }
}
