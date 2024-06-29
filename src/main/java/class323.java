import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class323 extends class175 {

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
    private int field4588 = 6;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "Ljb;")
    public static class519 field4587 = new class519(114, 6);

    @OriginalMember(owner = "client!bv", name = "O", descriptor = "I")
    public static int field4591 = -2;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "Lvt;")
    public static class320 field4586;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZI)[I", line = 5)
    public final int[] method47(boolean arg0, int arg1) {
        ++field4584;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            field4586 = null;
        }
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            int[] var5 = this.method1202(arg1, -1150480797, 1);
            int var6 = this.field4588;
            if (~var6 != -2) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class598.field8136; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class598.field8136 < ~var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var12 > var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class598.field8136; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class598.field8136 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var17 <= ~var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class598.field8136 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class598.field8136 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class598.field8136; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class598.field8136 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class598.field8136; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class598.field8136; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class598.field8136; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class598.field8136; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 261)
    public class323() {
        super(2, false);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILdt;Z)V", line = 266)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            this.method238(83, (byte) 107);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field2305 = arg1.method1731((byte) 64) == 1;
            }
        } else {
            this.field4588 = arg1.method1731((byte) 64);
        }
        ++field4589;
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)V", line = 302)
    public static void method2091(int arg0) {
        if (arg0 != 261699916) {
            field4591 = -113;
        }
        field4587 = null;
        field4586 = null;
    }

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "(I)V", line = 313)
    public static final void method2092(int arg0) {
        ++field4585;
        if (arg0 != 32311) {
            method2092(88);
        }
        class743.field10052 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIILlf;B)Lfu;", line = 328)
    public static final class411 method2093(int arg0, int arg1, int arg2, class250 arg3, byte arg4) {
        ++field4590;
        if (arg4 >= -45) {
            return null;
        } else if (!arg3.field3588 && (!class439.method2627(0, arg2) || !class439.method2627(0, arg0))) {
            return arg3.field3616 ? new class411(arg3, 34037, arg1, arg2, arg0) : new class411(arg3, arg1, arg2, arg0, class8.method45(23714, arg2), class8.method45(23714, arg0));
        } else {
            return new class411(arg3, 3553, arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IB)[[I", line = 347)
    public final int[][] method238(int arg0, byte arg1) {
        if (arg1 > -47) {
            field4586 = null;
        }
        ++field4583;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746) {
            int[][] var4 = this.method1205(0, arg0, 29179);
            int[][] var5 = this.method1205(1, arg0, 29179);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4588;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (var15 != 9) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class598.field8136 > var16; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var19 + var20 + -(var19 * var20 >> 11);
                                                                var7[var16] = var17 + var22 + -(var17 * var22 >> 11);
                                                                var8[var16] = var21 - -var18 + -(var18 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class598.field8136 < ~var23; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = var29 <= var24 ? -var29 + var24 : -var24 + var29;
                                                            var7[var23] = var27 < var26 ? -var27 + var26 : -var26 + var27;
                                                            var8[var23] = var25 < var28 ? -var25 + var28 : var25 - var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class598.field8136 < ~var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = ~var33 <= ~var31 ? var33 : var31;
                                                        var7[var30] = var34 > var35 ? var34 : var35;
                                                        var8[var30] = var36 <= var32 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class598.field8136; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var41 <= ~var43 ? var43 : var41;
                                                    var7[var37] = ~var42 < ~var39 ? var39 : var42;
                                                    var8[var37] = ~var38 > ~var40 ? var38 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class598.field8136; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 != -1 ? -((-var12[var44] + 4096 << 12) / var46) + 4096 : 0;
                                                var7[var44] = var47 != 0 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var45 != 0 ? -((4096 - var14[var44] << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class598.field8136 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = var50 != 4096 ? (var14[var48] << 12) / (4096 - var50) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class598.field8136 > var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var10[var52] + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = ~var55 > -2049 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class598.field8136; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (4096 - var13[var56]) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class598.field8136; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var58 == -1 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class598.field8136; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class598.field8136 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class598.field8136 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }
}
