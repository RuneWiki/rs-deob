import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class243 {

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    private int field28 = 6;

    @OriginalMember(owner = "client!dp", name = "D", descriptor = "Llga;")
    public static class712 field22 = new class712(24, -1);

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "Ljava/lang/String;")
    public static String field27 = null;

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "I")
    public static int field26 = 104;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!dp", name = "E", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "Ljava/awt/Font;")
    public static Font field31;

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "[Ltw;")
    public static class204[] field30;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method2(int arg0, int arg1) {
        ++field25;
        if (arg0 > -76) {
            method7(-24, -20);
        }
        int[][] var3 = super.field3156.method3306(arg1, 0);
        if (super.field3156.field8335) {
            int[][] var4 = this.method1457(arg1, 24431, 0);
            int[][] var5 = this.method1457(arg1, 24431, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field28;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class687.field9628 > var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var11[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                                var7[var16] = var17 - -var19 + -(var17 * var19 >> 11);
                                                                var8[var16] = var20 + var21 + -(var20 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class687.field9628 > var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = ~var29 > ~var28 ? var28 - var29 : -var28 + var29;
                                                            var7[var23] = ~var25 <= ~var26 ? -var26 + var25 : -var25 + var26;
                                                            var8[var23] = ~var24 < ~var27 ? -var27 + var24 : var27 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class687.field9628 > var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var10[var30];
                                                        var6[var30] = var32 > var33 ? var32 : var33;
                                                        var7[var30] = var34 >= var36 ? var34 : var36;
                                                        var8[var30] = var35 >= var31 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class687.field9628; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = var43 > var40 ? var40 : var43;
                                                    var7[var37] = var39 <= var38 ? var39 : var38;
                                                    var8[var37] = var41 < var42 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class687.field9628 < ~var44; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = var46 == 0 ? 0 : -((4096 - var13[var44] << 12) / var46) + 4096;
                                                var8[var44] = ~var47 == -1 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var47;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class687.field9628; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class687.field9628; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 >= 2048 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : 4096 - ((-var10[var52] + 4096) * (-var54 + 4096) >> 11);
                                        var8[var52] = var53 < 2048 ? var11[var52] * var53 >> 11 : -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class687.field9628; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class687.field9628 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var58 != -1 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class687.field9628; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class687.field9628; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class687.field9628 < ~var63; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I", line = 323)
    public final int[] method5(int arg0, int arg1) {
        ++field24;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field26 = 39;
        }
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1, 0, arg0 ^ 255);
            int[] var5 = this.method1462(arg1, 1, 0);
            int var6 = this.field28;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; var7 < class687.field9628; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class687.field9628; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class687.field9628; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class687.field9628; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class687.field9628 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class687.field9628; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (4096 - var22);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class687.field9628 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class687.field9628 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class687.field9628 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class687.field9628; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class687.field9628; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class687.field9628 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)Z", line = 574)
    public static final boolean method7(int arg0, int arg1) {
        ++field29;
        if (arg0 != 1) {
            field27 = null;
        }
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V", line = 586)
    public class3() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "(B)V", line = 589)
    public static void method8(byte arg0) {
        field22 = null;
        field30 = null;
        field31 = null;
        field27 = null;
        if (arg0 < 106) {
            method8((byte) 69);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lvea;", line = 608)
    public static final class276 method9(int arg0, byte arg1) {
        ++field32;
        class276[] var2 = class424.method2429((byte) 15);
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            if (var2[var3].field3680 == arg0) {
                return var2[var3];
            }
        }
        int var4 = -92 % ((arg1 - 18) / 41);
        return null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILji;B)V", line = 640)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        ++field23;
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field3159 = arg1.method3428((byte) -113) == 1;
            }
        } else {
            this.field28 = arg1.method3428((byte) 99);
        }
        if (arg2 >= -92) {
            field22 = null;
        }
    }
}
