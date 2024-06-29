import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class721 extends class739 {

    @OriginalMember(owner = "client!uha", name = "E", descriptor = "I")
    private int field10144 = 6;

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
    public static int field10146 = 50;

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "[I")
    public static int[] field10142 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "[I")
    public static int[] field10140 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "I", descriptor = "[I")
    public static int[] field10147 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "K", descriptor = "J")
    public static long field10149 = -1L;

    @OriginalMember(owner = "client!uha", name = "M", descriptor = "I")
    public static int field10151 = 1;

    @OriginalMember(owner = "client!uha", name = "J", descriptor = "[I")
    public static int[] field10148 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field10150 = new String[field10146];

    @OriginalMember(owner = "client!uha", name = "R", descriptor = "[I")
    public static int[] field10156 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "N", descriptor = "[I")
    public static int[] field10152 = new int[field10146];

    @OriginalMember(owner = "client!uha", name = "Q", descriptor = "[I")
    public static int[] field10155 = new int[2];

    @OriginalMember(owner = "client!uha", name = "P", descriptor = "I")
    public static int field10154 = -1;

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!uha", name = "D", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!uha", name = "O", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (arg2 == 1) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field10320 = arg0.method2886(true) == 1;
                }
            } else {
                this.field10144 = arg0.method2886(true);
            }
            ++field10143;
        }
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)I")
    public static final int method4040(int arg0) {
        if (arg0 != 16) {
            field10142 = null;
        }
        ++field10139;
        return 16;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(B)V")
    public static void method4041(byte arg0) {
        field10155 = null;
        field10152 = null;
        field10156 = null;
        field10147 = null;
        field10140 = null;
        field10142 = null;
        field10150 = null;
        int var1 = 31 % ((-62 - arg0) / 43);
        field10148 = null;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field10153;
        if (arg1 != 8213) {
            field10151 = -118;
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[][] var4 = this.method4124(arg0, 0, true);
            int[][] var5 = this.method4124(arg0, 1, true);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field10144;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class399.field5703 < ~var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = -(var19 * var22 >> 11) + var19 + var22;
                                                                var7[var16] = -(var18 * var20 >> 11) + var20 + var18;
                                                                var8[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class399.field5703; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var27 >= ~var24 ? -var27 + var24 : -var24 + var27;
                                                            var7[var23] = ~var25 > ~var26 ? -var25 + var26 : -var26 + var25;
                                                            var8[var23] = ~var29 <= ~var28 ? -var28 + var29 : var28 - var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class399.field5703 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var35 < ~var32 ? var35 : var32;
                                                        var7[var30] = ~var34 >= ~var36 ? var36 : var34;
                                                        var8[var30] = ~var31 > ~var33 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class399.field5703; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var40 <= ~var42 ? var42 : var40;
                                                    var7[var37] = var39 <= var41 ? var39 : var41;
                                                    var8[var37] = var43 >= var38 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class399.field5703 > var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 != 0 ? 4096 - (4096 - var12[var44] << 12) / var47 : 0;
                                                var7[var44] = var46 == 0 ? 0 : -((4096 - var13[var44] << 12) / var46) + 4096;
                                                var8[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class399.field5703 < ~var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (4096 - var51) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class399.field5703 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var7[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : -((4096 - var55) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class399.field5703 > var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (4096 - var12[var56]) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class399.field5703; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class399.field5703; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class399.field5703 < ~var62; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class399.field5703 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field10141;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 82, 0);
            int[] var5 = this.method4127(arg1, 63, 1);
            int var6 = this.field10144;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class399.field5703; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - ((var8 * var9 >> 11) + -var9);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class399.field5703 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class399.field5703 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class399.field5703 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var17 >= ~var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class399.field5703 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class399.field5703 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class399.field5703; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class399.field5703; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class399.field5703; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class399.field5703 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class399.field5703; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class399.field5703; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg0) {
            this.field10144 = 5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V")
    public class721() {
        super(2, false);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method4042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10145;
        if (~class200.field2976 >= ~arg6 && class204.field3061 >= arg3 && class377.field5458 <= arg0 && ~arg1 >= ~class362.field5291) {
            if (~arg5 != -2) {
                class407.method2484(arg1, arg3, arg5, arg6, arg2, 0, arg0);
            } else {
                class608.method3542(arg0, (byte) -84, arg1, arg3, arg6, arg2);
            }
        } else if (arg5 == 1) {
            class441.method2701(arg6, arg2, arg0, (byte) 72, arg1, arg3);
        } else {
            class545.method3281(arg1, arg5, arg6, arg3, arg0, arg2, 1595866465);
        }
        if (arg4 != 10226) {
            method4042(-92, -33, 116, -16, -18, 116, 89);
        }
    }
}
