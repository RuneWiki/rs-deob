import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class481 extends class11 {

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    private int field7025 = 6;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "Z")
    public static boolean field7023 = false;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "Lvc;")
    public static class207 field7027 = new class207(5000);

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "[S")
    public static short[] field7030 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "Lmg;")
    public static class101 field7022;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)[I", line = 9)
    public final int[] method44(int arg0, int arg1) {
        ++field7024;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -49);
            int[] var5 = this.method48(arg1, 1, (byte) -63);
            int var6 = this.field7025;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~class90.field1316 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class90.field1316; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 >= ~var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class90.field1316; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class90.field1316; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class90.field1316 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class90.field1316 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class90.field1316 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class90.field1316 < ~var25; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class90.field1316; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class90.field1316 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class90.field1316 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class90.field1316; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return arg0 >= -42 ? null : var3;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V", line = 254)
    public static void method2825(byte arg0) {
        field7027 = null;
        field7022 = null;
        if (arg0 < 21) {
            method2826(-42, 111, 3, -111, (class504) null, 56);
        }
        field7030 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I", line = 267)
    public final int[][] method41(int arg0, int arg1) {
        int var3 = -13 / ((-75 - arg0) / 49);
        ++field7026;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 107);
            int[][] var6 = this.method49(arg1, 1, 127);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = this.field7025;
            if (~var16 != -2) {
                if (~var16 != -3) {
                    if (~var16 != -4) {
                        if (~var16 != -5) {
                            if (var16 != 5) {
                                if (~var16 != -7) {
                                    if (~var16 != -8) {
                                        if (~var16 != -9) {
                                            if (var16 != 9) {
                                                if (var16 != 10) {
                                                    if (~var16 != -12) {
                                                        if (~var16 == -13) {
                                                            for (int var17 = 0; ~class90.field1316 < ~var17; ++var17) {
                                                                int var18 = var13[var17];
                                                                int var19 = var12[var17];
                                                                int var20 = var15[var17];
                                                                int var21 = var11[var17];
                                                                int var22 = var10[var17];
                                                                int var23 = var14[var17];
                                                                var7[var17] = var22 - ((var18 * var22 >> 11) + -var18);
                                                                var8[var17] = -(var21 * var23 >> 11) + var21 - -var23;
                                                                var9[var17] = var20 - (var19 * var20 >> 11) + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; ~class90.field1316 < ~var24; ++var24) {
                                                            int var25 = var12[var24];
                                                            int var26 = var13[var24];
                                                            int var27 = var15[var24];
                                                            int var28 = var11[var24];
                                                            int var29 = var10[var24];
                                                            int var30 = var14[var24];
                                                            var7[var24] = var26 < var29 ? -var26 + var29 : -var29 + var26;
                                                            var8[var24] = var28 <= var30 ? -var28 + var30 : -var30 + var28;
                                                            var9[var24] = ~var27 <= ~var25 ? -var25 + var27 : -var27 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; class90.field1316 > var31; ++var31) {
                                                        int var32 = var13[var31];
                                                        int var33 = var10[var31];
                                                        int var34 = var14[var31];
                                                        int var35 = var15[var31];
                                                        int var36 = var11[var31];
                                                        int var37 = var12[var31];
                                                        var7[var31] = var33 > var32 ? var33 : var32;
                                                        var8[var31] = ~var36 >= ~var34 ? var34 : var36;
                                                        var9[var31] = ~var35 <= ~var37 ? var35 : var37;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; class90.field1316 > var38; ++var38) {
                                                    int var39 = var11[var38];
                                                    int var40 = var15[var38];
                                                    int var41 = var13[var38];
                                                    int var42 = var14[var38];
                                                    int var43 = var12[var38];
                                                    int var44 = var10[var38];
                                                    var7[var38] = ~var41 < ~var44 ? var44 : var41;
                                                    var8[var38] = ~var39 > ~var42 ? var39 : var42;
                                                    var9[var38] = ~var43 > ~var40 ? var43 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; class90.field1316 > var45; ++var45) {
                                                int var46 = var12[var45];
                                                int var47 = var11[var45];
                                                int var48 = var10[var45];
                                                var7[var45] = var48 != 0 ? 4096 - (-var13[var45] + 4096 << 12) / var48 : 0;
                                                var8[var45] = var47 == 0 ? 0 : -((4096 - var14[var45] << 12) / var47) + 4096;
                                                var9[var45] = ~var46 != -1 ? -((-var15[var45] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; class90.field1316 > var49; ++var49) {
                                            int var50 = var10[var49];
                                            int var51 = var12[var49];
                                            int var52 = var11[var49];
                                            var7[var49] = var50 != 4096 ? (var13[var49] << 12) / (-var50 + 4096) : 4096;
                                            var8[var49] = var52 == 4096 ? 4096 : (var14[var49] << 12) / (4096 - var52);
                                            var9[var49] = var51 == 4096 ? 4096 : (var15[var49] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; var53 < class90.field1316; ++var53) {
                                        int var54 = var14[var53];
                                        int var55 = var15[var53];
                                        int var56 = var13[var53];
                                        var7[var53] = var56 >= 2048 ? -((4096 - var10[var53]) * (4096 - var56) >> 11) + 4096 : var10[var53] * var56 >> 11;
                                        var8[var53] = var54 >= 2048 ? -((4096 - var11[var53]) * (-var54 + 4096) >> 11) + 4096 : var11[var53] * var54 >> 11;
                                        var9[var53] = var55 >= 2048 ? -((4096 - var12[var53]) * (-var55 + 4096) >> 11) + 4096 : var12[var53] * var55 >> 11;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~var57 > ~class90.field1316; ++var57) {
                                    var7[var57] = -((-var10[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var8[var57] = -((-var11[var57] + 4096) * (-var14[var57] + 4096) >> 12) + 4096;
                                    var9[var57] = -((4096 - var12[var57]) * (-var15[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; class90.field1316 > var58; ++var58) {
                                int var59 = var13[var58];
                                int var60 = var14[var58];
                                int var61 = var15[var58];
                                var7[var58] = ~var59 != -1 ? (var10[var58] << 12) / var59 : 4096;
                                var8[var58] = var60 == 0 ? 4096 : (var11[var58] << 12) / var60;
                                var9[var58] = ~var61 == -1 ? 4096 : (var12[var58] << 12) / var61;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class90.field1316 < ~var62; ++var62) {
                            var7[var62] = var10[var62] * var13[var62] >> 12;
                            var8[var62] = var11[var62] * var14[var62] >> 12;
                            var9[var62] = var12[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; ~class90.field1316 < ~var63; ++var63) {
                        var7[var63] = var10[var63] + -var13[var63];
                        var8[var63] = var11[var63] - var14[var63];
                        var9[var63] = var12[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; class90.field1316 > var64; ++var64) {
                    var7[var64] = var10[var64] + var13[var64];
                    var8[var64] = var11[var64] + var14[var64];
                    var9[var64] = var12[var64] + var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 692)
    public class481() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lsi;II)V", line = 587)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field167 = arg0.method2348(-2) == 1;
            }
        } else {
            this.field7025 = arg0.method2348(-2);
        }
        if (arg1 >= -40) {
            this.method44(51, 84);
        }
        ++field7021;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILdr;I)Ljava/awt/Frame;", line = 622)
    public static final Frame method2826(int arg0, int arg1, int arg2, int arg3, class504 arg4, int arg5) {
        ++field7029;
        if (!arg4.method2968(25859)) {
            return null;
        } else {
            if (~arg0 == -1) {
                class68[] var6 = class90.method675(46, arg4);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~var6.length; ++var8) {
                    if (~var6[var8].field924 == ~arg5 && var6[var8].field928 == arg2 && (~arg1 == -1 || ~var6[var8].field923 == ~arg1) && (!var7 || var6[var8].field925 > arg0)) {
                        var7 = true;
                        arg0 = var6[var8].field925;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class56 var9 = arg4.method2970(arg2, 112, arg5, arg0, arg1);
            while (var9.field667 == 0) {
                class157.method1046(arg3 ^ -23605, 10L);
            }
            Frame var10 = (Frame) var9.field670;
            if (var10 == null) {
                return null;
            } else if (arg3 != 23627) {
                return null;
            } else if (~var9.field667 == -3) {
                class218.method1353(var10, arg4, (byte) -61);
                return null;
            } else {
                return var10;
            }
        }
    }
}
