import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class38 extends class354 {

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    private int field583 = 6;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Z")
    public static boolean field578 = false;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field577 = -1;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "[I")
    public static int[] field580 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field582;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            field580 = null;
        }
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            int[] var5 = this.method2293(1, arg0, (byte) 69);
            int var6 = this.field583;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; ~var7 > ~class404.field5952; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class404.field5952 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 <= var11 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class404.field5952 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class404.field5952; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 > var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class404.field5952 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class404.field5952; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class404.field5952; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class404.field5952; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class404.field5952 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class404.field5952; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class404.field5952 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class404.field5952; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    public static void method296(byte arg0) {
        field580 = null;
        if (arg0 > -72) {
            method297(-26, (class231) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class38() {
        super(2, false);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field576;
        if (arg0 > -40) {
            return null;
        } else {
            int[][] var3 = super.field5351.method2819((byte) -54, arg1);
            if (super.field5351.field6959) {
                int[][] var4 = this.method2291(0, (byte) -101, arg1);
                int[][] var5 = this.method2291(1, (byte) -80, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field583;
                if (~var15 != -2) {
                    if (var15 != 2) {
                        if (var15 != 3) {
                            if (~var15 != -5) {
                                if (~var15 != -6) {
                                    if (var15 != 6) {
                                        if (var15 != 7) {
                                            if (~var15 != -9) {
                                                if (~var15 != -10) {
                                                    if (var15 != 10) {
                                                        if (var15 != 11) {
                                                            if (~var15 == -13) {
                                                                for (int var16 = 0; var16 < class404.field5952; ++var16) {
                                                                    int var17 = var10[var16];
                                                                    int var18 = var11[var16];
                                                                    int var19 = var9[var16];
                                                                    int var20 = var14[var16];
                                                                    int var21 = var13[var16];
                                                                    int var22 = var12[var16];
                                                                    var6[var16] = var19 - (var19 * var22 >> 11) + var22;
                                                                    var7[var16] = var17 - ((var17 * var21 >> 11) + -var21);
                                                                    var8[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var23 = 0; class404.field5952 > var23; ++var23) {
                                                                int var24 = var12[var23];
                                                                int var25 = var11[var23];
                                                                int var26 = var14[var23];
                                                                int var27 = var9[var23];
                                                                int var28 = var10[var23];
                                                                int var29 = var13[var23];
                                                                var6[var23] = ~var24 > ~var27 ? -var24 + var27 : -var27 + var24;
                                                                var7[var23] = var28 <= var29 ? -var28 + var29 : var28 - var29;
                                                                var8[var23] = ~var25 < ~var26 ? -var26 + var25 : -var25 + var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var30 = 0; var30 < class404.field5952; ++var30) {
                                                            int var31 = var12[var30];
                                                            int var32 = var11[var30];
                                                            int var33 = var14[var30];
                                                            int var34 = var10[var30];
                                                            int var35 = var9[var30];
                                                            int var36 = var13[var30];
                                                            var6[var30] = var35 <= var31 ? var31 : var35;
                                                            var7[var30] = var36 >= var34 ? var36 : var34;
                                                            var8[var30] = ~var33 > ~var32 ? var32 : var33;
                                                        }
                                                    }
                                                } else {
                                                    for (int var37 = 0; var37 < class404.field5952; ++var37) {
                                                        int var38 = var9[var37];
                                                        int var39 = var11[var37];
                                                        int var40 = var13[var37];
                                                        int var41 = var14[var37];
                                                        int var42 = var12[var37];
                                                        int var43 = var10[var37];
                                                        var6[var37] = ~var42 >= ~var38 ? var42 : var38;
                                                        var7[var37] = ~var43 <= ~var40 ? var40 : var43;
                                                        var8[var37] = var39 < var41 ? var39 : var41;
                                                    }
                                                }
                                            } else {
                                                for (int var44 = 0; ~var44 > ~class404.field5952; ++var44) {
                                                    int var45 = var10[var44];
                                                    int var46 = var9[var44];
                                                    int var47 = var11[var44];
                                                    var6[var44] = var46 == 0 ? 0 : 4096 - (-var12[var44] + 4096 << 12) / var46;
                                                    var7[var44] = ~var45 != -1 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                                    var8[var44] = ~var47 != -1 ? -((-var14[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var48 = 0; var48 < class404.field5952; ++var48) {
                                                int var49 = var9[var48];
                                                int var50 = var10[var48];
                                                int var51 = var11[var48];
                                                var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                                var7[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (-var50 + 4096);
                                                var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var52 = 0; ~class404.field5952 < ~var52; ++var52) {
                                            int var53 = var14[var52];
                                            int var54 = var13[var52];
                                            int var55 = var12[var52];
                                            var6[var52] = ~var55 <= -2049 ? -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                            var7[var52] = var54 >= 2048 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                            var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : 4096 - ((4096 - var11[var52]) * (-var53 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var56 = 0; var56 < class404.field5952; ++var56) {
                                        var6[var56] = 4096 - ((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                        var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                        var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var57 = 0; ~class404.field5952 < ~var57; ++var57) {
                                    int var58 = var13[var57];
                                    int var59 = var12[var57];
                                    int var60 = var14[var57];
                                    var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                    var7[var57] = ~var58 == -1 ? 4096 : (var10[var57] << 12) / var58;
                                    var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                                }
                            }
                        } else {
                            for (int var61 = 0; var61 < class404.field5952; ++var61) {
                                var6[var61] = var9[var61] * var12[var61] >> 12;
                                var7[var61] = var10[var61] * var13[var61] >> 12;
                                var8[var61] = var11[var61] * var14[var61] >> 12;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class404.field5952; ++var62) {
                            var6[var62] = var9[var62] + -var12[var62];
                            var7[var62] = var10[var62] + -var13[var62];
                            var8[var62] = var11[var62] - var14[var62];
                        }
                    }
                } else {
                    for (int var63 = 0; ~var63 > ~class404.field5952; ++var63) {
                        var6[var63] = var9[var63] - -var12[var63];
                        var7[var63] = var10[var63] + var13[var63];
                        var8[var63] = var11[var63] - -var14[var63];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 == 15180) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    super.field5354 = ~arg1.method1918((byte) -87) == -2;
                }
            } else {
                this.field583 = arg1.method1918((byte) -45);
            }
            ++field581;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILak;)V")
    public static final void method297(int arg0, class231 arg1) {
        ++field579;
        if (arg0 == -4097) {
            if (!class314.field4487) {
                arg1.method2663(-123);
                --class106.field1669;
            }
        }
    }
}
