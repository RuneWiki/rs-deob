import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 extends class326 {

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    private int field867 = 6;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "[[I")
    public static int[][] field860 = new int[128][128];

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "Lnk;")
    public static class464 field858 = null;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
    public static boolean field866 = false;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "[[I")
    public static int[][] field868;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field864;
        int[] var3 = super.field4344.method130(arg1, -104);
        if (arg0 > -6) {
            return null;
        } else {
            if (super.field4344.field286) {
                int[] var4 = this.method1824(0, false, arg1);
                int[] var5 = this.method1824(1, false, arg1);
                int var6 = this.field867;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~class181.field2495 < ~var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~var10 > ~class181.field2495; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var12 >= ~var11 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; class181.field2495 > var13; ++var13) {
                                                            int var14 = var4[var13];
                                                            int var15 = var5[var13];
                                                            var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class181.field2495; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 <= var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~class181.field2495 < ~var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 == -1 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < class181.field2495; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class181.field2495 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class181.field2495; ++var25) {
                                        var3[var25] = 4096 - ((4096 - var4[var25]) * (4096 - var5[var25]) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class181.field2495; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; class181.field2495 > var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class181.field2495 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class181.field2495; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        ++field859;
        int[][] var3 = super.field4343.method2356(arg0, 98);
        if (arg1 > -52) {
            method435((byte) 79);
        }
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[][] var5 = this.method1828(1, true, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field867;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class181.field2495 > var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var19 - (var19 * var20 >> 11) + var20;
                                                                var7[var16] = -(var17 * var21 >> 11) + var17 - -var21;
                                                                var8[var16] = -(var18 * var22 >> 11) + var18 + var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class181.field2495; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = ~var29 <= ~var26 ? -var26 + var29 : -var29 + var26;
                                                            var7[var23] = ~var28 < ~var24 ? -var24 + var28 : -var28 + var24;
                                                            var8[var23] = ~var27 <= ~var25 ? -var25 + var27 : -var27 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class181.field2495; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 > var35 ? var36 : var35;
                                                        var7[var30] = ~var34 < ~var33 ? var34 : var33;
                                                        var8[var30] = ~var31 <= ~var32 ? var31 : var32;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class181.field2495 > var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var42 <= ~var40 ? var40 : var42;
                                                    var7[var37] = ~var38 >= ~var39 ? var38 : var39;
                                                    var8[var37] = ~var43 > ~var41 ? var43 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class181.field2495; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var45 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var45) + 4096;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class181.field2495; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var7[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = var49 != 4096 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class181.field2495; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 <= -2049 ? -((4096 - var9[var52]) * (4096 - var54) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? -((4096 - var10[var52]) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class181.field2495; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class181.field2495; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = var59 != 0 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class181.field2495 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class181.field2495; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class181.field2495; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 < -3) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    super.field4358 = ~arg1.method201((byte) -127) == -2;
                }
            } else {
                this.field867 = arg1.method201((byte) -126);
            }
            ++field863;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
    public static final void method434(boolean arg0) {
        if (!arg0) {
            ++field861;
            for (class370 var1 = (class370) class177.field2403.method652((byte) 37); var1 != null; var1 = (class370) class177.field2403.method653(95)) {
                class230 var2 = var1.field5067;
                if (class373.field5104 == var2.field6502 && ~var2.field3028 <= ~class70.field968) {
                    if (class70.field968 >= var2.field3035) {
                        if (~var2.field3017 < -1) {
                            class121 var3 = class221.field2941[var2.field3017 + -1];
                            if (var3 != null && ~var3.field6501 <= -1 && var3.field6501 < class295.field3947 * 128 && ~var3.field6507 <= -1 && class39.field567 * 128 > var3.field6507) {
                                var2.method1287(class247.method1385(49, var3.field6501, var3.field6507, var2.field6502) + -var2.field3050, var3.field6501, class70.field968, true, var3.field6507);
                            }
                        }
                        if (var2.field3017 < 0) {
                            int var4 = -var2.field3017 - 1;
                            class487 var5;
                            if (~class332.field4494 == ~var4) {
                                var5 = class233.field3103;
                            } else {
                                var5 = class413.field5644[var4];
                            }
                            if (var5 != null && var5.field6501 >= 0 && var5.field6501 < class295.field3947 * 128 && var5.field6507 >= 0 && var5.field6507 < class39.field567 * 128) {
                                var2.method1287(class247.method1385(-106, var5.field6501, var5.field6507, var2.field6502) - var2.field3050, var5.field6501, class70.field968, true, var5.field6507);
                            }
                        }
                        var2.method1282(class448.field6098, !arg0);
                        class214.method1212(var2, true);
                    }
                } else {
                    var1.method2614((byte) -73);
                    var2.method1281((byte) 74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class65() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static void method435(byte arg0) {
        field868 = null;
        field860 = null;
        if (arg0 > -57) {
            field860 = null;
        }
        field858 = null;
    }
}
