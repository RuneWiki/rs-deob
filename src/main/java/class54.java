import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class54 extends class276 {

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    private int field936 = 6;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "Ljava/lang/String;")
    public static String field940 = "";

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "Lvh;")
    public static class108 field938;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
    public static int[] field941;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[Ldk;")
    public static class236[] field939;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static void method337(byte arg0) {
        field940 = null;
        field941 = null;
        field938 = null;
        field939 = null;
        if (arg0 != 41) {
            field939 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class54() {
        super(2, false);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field943;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4408 = ~arg1.method669((byte) 36) == -2;
            }
        } else {
            this.field936 = arg1.method669((byte) 36);
        }
        if (arg2 != -1) {
            method338((byte) -120, -119);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Ldk;")
    public static final class236 method338(byte arg0, int arg1) {
        ++field942;
        if (arg0 <= 11) {
            return null;
        } else {
            return class83.field1513 && class113.field2046 <= arg1 && ~arg1 >= ~class129.field2260 ? field939[-class113.field2046 + arg1] : null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        if (arg1 != -1) {
            method337((byte) 36);
        }
        ++field944;
        int[][] var3 = super.field4418.method835((byte) 104, arg0);
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) -120, arg0, 0);
            int[][] var5 = this.method1810((byte) 98, arg0, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var3[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field936;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class53.field929; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var8[var16];
                                                                var6[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                var11[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                var7[var16] = var17 + var21 + -(var17 * var21 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class53.field929; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var8[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = var28 <= var27 ? -var28 + var27 : -var27 + var28;
                                                            var11[var23] = ~var29 >= ~var24 ? var24 - var29 : -var24 + var29;
                                                            var7[var23] = ~var26 < ~var25 ? -var25 + var26 : -var26 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class53.field929; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var8[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var32 >= ~var36 ? var36 : var32;
                                                        var11[var30] = var33 >= var31 ? var33 : var31;
                                                        var7[var30] = ~var35 >= ~var34 ? var34 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class53.field929 < ~var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var8[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = ~var40 < ~var39 ? var39 : var40;
                                                    var11[var37] = ~var38 <= ~var42 ? var42 : var38;
                                                    var7[var37] = ~var43 <= ~var41 ? var41 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class53.field929 > var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var8[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var46 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var46 : 0;
                                                var11[var44] = var47 == 0 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                                var7[var44] = ~var45 != -1 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~class53.field929 < ~var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var8[var48];
                                            var6[var48] = ~var51 != -4097 ? (var12[var48] << 12) / (-var51 + 4096) : 4096;
                                            var11[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class53.field929 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 >= 2048 ? -((4096 - var8[var52]) * (-var55 + 4096) >> 11) + 4096 : var8[var52] * var55 >> 11;
                                        var11[var52] = ~var54 <= -2049 ? -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var53) * (-var10[var52] + 4096) >> 11) : var10[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class53.field929 < ~var56; ++var56) {
                                    var6[var56] = 4096 - ((-var8[var56] + 4096) * (-var12[var56] + 4096) >> 12);
                                    var11[var56] = -((-var9[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class53.field929; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var8[var57] << 12) / var60 : 4096;
                                var11[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class53.field929; ++var61) {
                            var6[var61] = var8[var61] * var12[var61] >> 12;
                            var11[var61] = var9[var61] * var14[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class53.field929 < ~var62; ++var62) {
                        var6[var62] = var8[var62] + -var12[var62];
                        var11[var62] = var9[var62] + -var14[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class53.field929; ++var63) {
                    var6[var63] = var8[var63] + var12[var63];
                    var11[var63] = var9[var63] + var14[var63];
                    var7[var63] = var10[var63] + var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field935;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            int[] var5 = this.method1805(false, 1, arg1);
            int var6 = this.field936;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class53.field929 > var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class53.field929; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class53.field929; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class53.field929 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class53.field929 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class53.field929 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class53.field929; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class53.field929 > var25; ++var25) {
                                    var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; class53.field929 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class53.field929; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class53.field929; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class53.field929; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0 <= 39) {
            this.method21(-106, (class101) null, (byte) 9);
        }
        return var3;
    }
}
