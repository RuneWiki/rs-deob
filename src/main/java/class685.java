import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class685 extends class666 {

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
    private int field9700 = 6;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public static int field9699 = -1;

    @OriginalMember(owner = "client!nca", name = "J", descriptor = "Lkfa;")
    public static class549 field9704 = new class549(19, 8);

    @OriginalMember(owner = "client!nca", name = "L", descriptor = "Ltf;")
    public static class264 field9706 = new class264(0, -1);

    @OriginalMember(owner = "client!nca", name = "M", descriptor = "[F")
    public static float[] field9707 = new float[4];

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!nca", name = "H", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!nca", name = "K", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method122(int arg0, int arg1) {
        ++field9701;
        if (arg0 > -21) {
            field9706 = null;
        }
        int[] var3 = super.field9466.method1811(arg1, 33);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -128, arg1);
            int[] var5 = this.method3739(1, -120, arg1);
            int var6 = this.field9700;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class501.field7222 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - (var8 * var9 >> 11) + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class501.field7222; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class501.field7222; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 > var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class501.field7222; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class501.field7222 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class501.field7222 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class501.field7222; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class501.field7222; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class501.field7222; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class501.field7222 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; var29 < class501.field7222; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class501.field7222; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZIIII)V", line = 249)
    public static final void method3814(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9698;
        class530 var5 = class242.method1402(-77, 4, arg4);
        var5.method3025((byte) -69);
        if (arg0) {
            method3815(23);
        }
        var5.field7593 = arg1;
        var5.field7595 = arg2;
        var5.field7589 = arg3;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)[[I", line = 265)
    public final int[][] method1251(int arg0, byte arg1) {
        if (arg1 != 98) {
            return null;
        } else {
            ++field9703;
            int[][] var3 = super.field9471.method3639(15, arg0);
            if (super.field9471.field9180) {
                int[][] var4 = this.method3737(arg0, 0, 3);
                int[][] var5 = this.method3737(arg0, 1, 3);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field9700;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (~var15 != -11) {
                                                        if (var15 != 11) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; class501.field7222 > var16; ++var16) {
                                                                    int var17 = var9[var16];
                                                                    int var18 = var13[var16];
                                                                    int var19 = var10[var16];
                                                                    int var20 = var12[var16];
                                                                    int var21 = var11[var16];
                                                                    int var22 = var14[var16];
                                                                    var6[var16] = var20 - (var17 * var20 >> 11) + var17;
                                                                    var7[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                    var8[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; ~var23 > ~class501.field7222; ++var23) {
                                                                int var24 = var10[var23];
                                                                int var25 = var12[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var9[var23];
                                                                int var29 = var11[var23];
                                                                var6[var23] = var28 <= var25 ? -var28 + var25 : -var25 + var28;
                                                                var7[var23] = var27 >= var24 ? -var24 + var27 : -var27 + var24;
                                                                var8[var23] = ~var26 <= ~var29 ? var26 - var29 : var29 - var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; ~var30 > ~class501.field7222; ++var30) {
                                                            int var31 = var14[var30];
                                                            int var32 = var9[var30];
                                                            int var33 = var11[var30];
                                                            int var34 = var13[var30];
                                                            int var35 = var12[var30];
                                                            int var36 = var10[var30];
                                                            var6[var30] = ~var32 < ~var35 ? var32 : var35;
                                                            var7[var30] = var34 < var36 ? var36 : var34;
                                                            var8[var30] = ~var33 >= ~var31 ? var31 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class501.field7222; ++var37) {
                                                        int var38 = var10[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var12[var37];
                                                        int var41 = var13[var37];
                                                        int var42 = var9[var37];
                                                        int var43 = var11[var37];
                                                        var6[var37] = ~var40 >= ~var42 ? var40 : var42;
                                                        var7[var37] = ~var41 >= ~var38 ? var41 : var38;
                                                        var8[var37] = var43 >= var39 ? var39 : var43;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; var44 < class501.field7222; ++var44) {
                                                    int var45 = var11[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = var46 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                    var7[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                    var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~class501.field7222 < ~var48; ++var48) {
                                                int var49 = var11[var48];
                                                int var50 = var9[var48];
                                                int var51 = var10[var48];
                                                var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                                var8[var48] = ~var49 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var49);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class501.field7222 < ~var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = var55 >= 2048 ? 4096 - ((4096 - var55) * (-var9[var52] + 4096) >> 11) : var9[var52] * var55 >> 11;
                                            var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : 4096 - ((-var10[var52] + 4096) * (-var54 + 4096) >> 11);
                                            var8[var52] = var53 < 2048 ? var11[var52] * var53 >> 11 : -((4096 - var53) * (-var11[var52] + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; ~class501.field7222 < ~var56; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; var57 < class501.field7222; ++var57) {
                                    int var58 = var13[var57];
                                    int var59 = var14[var57];
                                    int var60 = var12[var57];
                                    var6[var57] = ~var60 == -1 ? 4096 : (var9[var57] << 12) / var60;
                                    var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                    var8[var57] = ~var59 != -1 ? (var11[var57] << 12) / var59 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; class501.field7222 > var61; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~class501.field7222 < ~var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; var63 < class501.field7222; ++var63) {
                        var6[var63] = var9[var63] - -var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILiaa;Z)V", line = 580)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field9465 = arg1.method2541(71) == 1;
            }
        } else {
            this.field9700 = arg1.method2541(97);
        }
        if (!arg2) {
            field9707 = null;
        }
        ++field9702;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V", line = 624)
    public class685() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "(I)V", line = 631)
    public static final void method3815(int arg0) {
        ++field9705;
        class680.field9630.method3459((byte) -116);
        int var1 = class680.field9630.method3465(8, (byte) -81);
        if (~class118.field1356 < ~var1) {
            for (int var2 = var1; ~var2 > ~class118.field1356; ++var2) {
                class550.field7859[class59.field619++] = class664.field9449[var2];
            }
        }
        if (class118.field1356 < var1) {
            throw new RuntimeException("gnpov1");
        } else if (arg0 <= -108) {
            class118.field1356 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class664.field9449[var3];
                class625 var5 = ((class443) class392.field5223.method3234((byte) -57, (long) var4)).field6107;
                int var6 = class680.field9630.method3465(1, (byte) -125);
                if (~var6 == -1) {
                    class664.field9449[class118.field1356++] = var4;
                    var5.field3734 = class469.field6549;
                } else {
                    int var7 = class680.field9630.method3465(2, (byte) -82);
                    if (~var7 == -1) {
                        class664.field9449[class118.field1356++] = var4;
                        var5.field3734 = class469.field6549;
                        class233.field2975[class46.field507++] = var4;
                    } else if (var7 == 1) {
                        class664.field9449[class118.field1356++] = var4;
                        var5.field3734 = class469.field6549;
                        int var8 = class680.field9630.method3465(3, (byte) -86);
                        var5.method3505(1, var8, -12662);
                        int var9 = class680.field9630.method3465(1, (byte) -115);
                        if (~var9 == -2) {
                            class233.field2975[class46.field507++] = var4;
                        }
                    } else if (var7 == 2) {
                        class664.field9449[class118.field1356++] = var4;
                        var5.field3734 = class469.field6549;
                        if (~class680.field9630.method3465(1, (byte) -87) != -2) {
                            int var10 = class680.field9630.method3465(3, (byte) -118);
                            var5.method3505(0, var10, -12662);
                        } else {
                            int var11 = class680.field9630.method3465(3, (byte) -91);
                            var5.method3505(2, var11, -12662);
                            int var12 = class680.field9630.method3465(3, (byte) -101);
                            var5.method3505(2, var12, -12662);
                        }
                        int var13 = class680.field9630.method3465(1, (byte) -91);
                        if (~var13 == -2) {
                            class233.field2975[class46.field507++] = var4;
                        }
                    } else if (var7 == 3) {
                        class550.field7859[class59.field619++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "(I)V", line = 747)
    public static void method3816(int arg0) {
        field9704 = null;
        if (arg0 != -2) {
            method3815(117);
        }
        field9707 = null;
        field9706 = null;
    }
}
