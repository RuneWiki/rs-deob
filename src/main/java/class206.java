import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class206 extends class305 {

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    private int field3158 = 6;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method15(int arg0, int arg1) {
        if (arg1 != 4688) {
            field3162 = -26;
        }
        ++field3164;
        int[] var3 = super.field4677.method2174(arg0, -72);
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, arg0, arg1 + -4688);
            int[] var5 = this.method2021(1, arg0, 0);
            int var6 = this.field3158;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class91.field1471 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class91.field1471 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class91.field1471; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class91.field1471 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class91.field1471; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class91.field1471; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class91.field1471 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class91.field1471; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class91.field1471 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class91.field1471 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class91.field1471 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class91.field1471 < ~var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 715)
    public class206() {
        super(2, false);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILfh;B)V", line = 254)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field3165;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4675 = arg1.method1337((byte) 91) == 1;
            }
        } else {
            this.field3158 = arg1.method1337((byte) 99);
        }
        if (arg2 <= 76) {
            this.method15(-3, 6);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIII)V", line = 290)
    public static final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg0 == ~arg5 && arg2 == arg3 && ~arg4 == ~arg7 && arg1 == arg6) {
            class23.method146(arg9, arg1, arg3, arg0, (byte) 115, arg7);
        } else {
            int var10 = arg0;
            int var11 = arg3;
            int var12 = arg0 * 3;
            int var13 = arg3 * 3;
            int var14 = arg5 * 3;
            int var15 = arg2 * 3;
            int var16 = arg4 * 3;
            int var17 = arg6 * 3;
            int var18 = arg7 - (var16 - var14) + -arg0;
            int var19 = arg1 + var15 + -var17 + -arg3;
            int var20 = -var14 + var16 - (-var12 + var14);
            int var21 = -var15 + var13 + -var15 + var17;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg0;
                int var34 = (var28 + var32 - -var30 >> 12) + arg3;
                class23.method146(arg9, var34, var11, var10, (byte) -11, var33);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8 != 4655) {
            field3162 = 40;
        }
        ++field3160;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V", line = 368)
    public static final void method1438(byte arg0) {
        for (int var1 = 0; class231.field3482 > var1; ++var1) {
            int var2 = class234.field3513[var1];
            class5 var3 = (class5) class366.field5398.method358((byte) -123, (long) var2);
            if (var3 != null) {
                class46 var4 = var3.field65;
                class292.method1956(8, var4, var4.field718.field2594);
            }
        }
        ++field3163;
        if (arg0 < 94) {
            field3162 = -20;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[[I", line = 398)
    public final int[][] method72(int arg0, byte arg1) {
        ++field3161;
        if (arg1 > -59) {
            return null;
        } else {
            int[][] var3 = super.field4674.method2206(-70, arg0);
            if (super.field4674.field5110) {
                int[][] var4 = this.method2015(true, 0, arg0);
                int[][] var5 = this.method2015(true, 1, arg0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field3158;
                if (~var15 != -2) {
                    if (~var15 != -3) {
                        if (~var15 != -4) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (var15 != 8) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (var15 == 12) {
                                                                for (int var16 = 0; ~class91.field1471 < ~var16; ++var16) {
                                                                    int var17 = var12[var16];
                                                                    int var18 = var10[var16];
                                                                    int var19 = var13[var16];
                                                                    int var20 = var11[var16];
                                                                    int var21 = var9[var16];
                                                                    int var22 = var14[var16];
                                                                    var6[var16] = var17 - (var17 * var21 >> 11) + var21;
                                                                    var7[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                    var8[var16] = -(var20 * var22 >> 11) + var22 + var20;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class91.field1471 > var23; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var11[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var13[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var9[var23];
                                                                var6[var23] = var24 < var29 ? -var24 + var29 : -var29 + var24;
                                                                var7[var23] = ~var28 < ~var27 ? var28 - var27 : -var28 + var27;
                                                                var8[var23] = ~var25 < ~var26 ? -var26 + var25 : -var25 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; class91.field1471 > var30; ++var30) {
                                                            int var31 = var13[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var9[var30];
                                                            int var34 = var14[var30];
                                                            int var35 = var12[var30];
                                                            int var36 = var10[var30];
                                                            var6[var30] = ~var35 > ~var33 ? var33 : var35;
                                                            var7[var30] = var31 < var36 ? var36 : var31;
                                                            var8[var30] = ~var32 >= ~var34 ? var34 : var32;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; ~var37 > ~class91.field1471; ++var37) {
                                                        int var38 = var13[var37];
                                                        int var39 = var14[var37];
                                                        int var40 = var11[var37];
                                                        int var41 = var10[var37];
                                                        int var42 = var9[var37];
                                                        int var43 = var12[var37];
                                                        var6[var37] = var42 < var43 ? var42 : var43;
                                                        var7[var37] = ~var38 >= ~var41 ? var38 : var41;
                                                        var8[var37] = ~var39 >= ~var40 ? var39 : var40;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~var44 > ~class91.field1471; ++var44) {
                                                    int var45 = var9[var44];
                                                    int var46 = var11[var44];
                                                    int var47 = var10[var44];
                                                    var6[var44] = var45 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var45;
                                                    var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                    var8[var44] = var46 != 0 ? -((4096 - var14[var44] << 12) / var46) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; ~var48 > ~class91.field1471; ++var48) {
                                                int var49 = var10[var48];
                                                int var50 = var9[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var50 == -4097 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                                var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                                var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; var52 < class91.field1471; ++var52) {
                                            int var53 = var12[var52];
                                            int var54 = var14[var52];
                                            int var55 = var13[var52];
                                            var6[var52] = ~var53 > -2049 ? var9[var52] * var53 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11);
                                            var7[var52] = ~var55 <= -2049 ? 4096 - ((4096 - var55) * (-var10[var52] + 4096) >> 11) : var10[var52] * var55 >> 11;
                                            var8[var52] = ~var54 <= -2049 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class91.field1471; ++var56) {
                                        var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                        var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                        var8[var56] = -((4096 - var14[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; class91.field1471 > var57; ++var57) {
                                    int var58 = var14[var57];
                                    int var59 = var13[var57];
                                    int var60 = var12[var57];
                                    var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                    var7[var57] = var59 != 0 ? (var10[var57] << 12) / var59 : 4096;
                                    var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class91.field1471; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; class91.field1471 > var62; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] - var13[var62];
                            var8[var62] = var11[var62] + -var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~class91.field1471 < ~var63; ++var63) {
                        var6[var63] = var9[var63] - -var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] + var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V", line = 718)
    public static final void method1439(int arg0) {
        ++field3159;
        if (class22.field250) {
            class22.field250 = false;
            class392.field5728 = null;
            int var1 = -119 % ((-76 - arg0) / 50);
            class300.field4609 = null;
        }
    }
}
