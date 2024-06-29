import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class554 extends class145 {

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
    private int field7864 = 6;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "[Lfg;")
    public static class110[] field7859 = new class110[2048];

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
    public static int field7863 = 0;

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "Ldb;")
    public static class272 field7865 = new class272(8, 0, 4, 1);

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!tda", name = "N", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!tda", name = "O", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILrt;)V", line = 4)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field1790 = arg2.method1177(255) == 1;
            }
        } else {
            this.field7864 = arg2.method1177(255);
        }
        ++field7858;
        if (arg1 > -67) {
            field7863 = -63;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "([BBLjava/lang/String;I)I", line = 46)
    public static final int method3200(byte[] arg0, byte arg1, String arg2, int arg3) {
        ++field7867;
        int var4 = arg2.length();
        if (arg1 < 42) {
            method3202(104);
        }
        int var5 = arg3;
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            char var7 = arg2.charAt(var6);
            if (~var7 >= -128) {
                arg0[var5++] = (byte) var7;
            } else if (~var7 >= -2048) {
                arg0[var5++] = (byte) class283.method1834(var7 >> 6, 192);
                arg0[var5++] = (byte) class283.method1834(128, class643.method3659(63, var7));
            } else {
                arg0[var5++] = (byte) class283.method1834(224, var7 >> 12);
                arg0[var5++] = (byte) class283.method1834(class643.method3659(var7, 4078) >> 6, 128);
                arg0[var5++] = (byte) class283.method1834(class643.method3659(63, var7), 128);
            }
        }
        return -arg3 + var5;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(BI)V", line = 89)
    public static final void method3201(byte arg0, int arg1) {
        ++field7862;
        int var2 = -105 / ((9 - arg0) / 35);
        class467 var3 = class541.method3144(arg1, (byte) -103, 2);
        var3.method2852(0);
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V", line = 102)
    public class554() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "(I)V", line = 105)
    public static void method3202(int arg0) {
        if (arg0 == 0) {
            field7865 = null;
            field7859 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)V", line = 119)
    public static final void method3203(int arg0, int arg1) {
        class75.field814 = arg0;
        if (arg1 != 0) {
            field7859 = null;
        }
        ++field7866;
        class59.field682 = -1;
        class59.field682 = -1;
        class171.method986((byte) 31);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[I", line = 136)
    public final int[] method27(boolean arg0, int arg1) {
        ++field7860;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[] var4 = this.method865(0, arg1, (byte) 85);
            int[] var5 = this.method865(1, arg1, (byte) -89);
            int var6 = this.field7864;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class647.field9368; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class647.field9368 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var12 < var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; class647.field9368 > var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var14 <= ~var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class647.field9368 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class647.field9368; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class647.field9368 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class647.field9368; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class647.field9368; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class647.field9368; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class647.field9368; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class647.field9368 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class647.field9368; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0) {
            field7859 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BI)[[I", line = 391)
    public final int[][] method75(byte arg0, int arg1) {
        if (arg0 > -28) {
            method3201((byte) 103, 74);
        }
        ++field7861;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) 88);
            int[][] var5 = this.method866(1, arg1, (byte) -123);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field7864;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class647.field9368 > var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = var19 + var22 + -(var19 * var22 >> 11);
                                                                var7[var16] = -(var17 * var21 >> 11) + var17 + var21;
                                                                var8[var16] = var18 + var20 - (var18 * var20 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class647.field9368; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var10[var23];
                                                            var6[var23] = var25 < var24 ? -var25 + var24 : -var24 + var25;
                                                            var7[var23] = ~var28 > ~var29 ? -var28 + var29 : -var29 + var28;
                                                            var8[var23] = ~var27 <= ~var26 ? -var26 + var27 : -var27 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class647.field9368; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = ~var32 > ~var35 ? var35 : var32;
                                                        var7[var30] = var36 <= var34 ? var34 : var36;
                                                        var8[var30] = ~var31 > ~var33 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class647.field9368 < ~var37; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = var40 <= var39 ? var40 : var39;
                                                    var7[var37] = var42 > var41 ? var41 : var42;
                                                    var8[var37] = var38 > var43 ? var43 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class647.field9368 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = var45 != 0 ? 4096 - (4096 - var13[var44] << 12) / var45 : 0;
                                                var8[var44] = var47 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class647.field9368 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var51);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class647.field9368 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : 4096 - ((4096 - var9[var52]) * (-var54 + 4096) >> 11);
                                        var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class647.field9368; ++var56) {
                                    var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class647.field9368; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var14[var57];
                                int var60 = var13[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var60 == 0 ? 4096 : (var10[var57] << 12) / var60;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class647.field9368; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class647.field9368 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class647.field9368; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
