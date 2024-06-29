import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class85 extends class124 {

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    private int field1402 = 6;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "Le;")
    public static class191 field1400 = class54.method368("<col=ff9040>", 2047);

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "Le;")
    public static class191 field1409 = class54.method368("Benutzeroberfl-=che geladen)3", 2047);

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "Le;")
    public static class191 field1407 = class54.method368("Lade Texturen )2 ", 2047);

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "Z")
    public static boolean field1399;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V")
    public static final void method526(int arg0, byte arg1) {
        ++field1403;
        class183 var2 = class17.field226;
        synchronized (class17.field226) {
            class185.field3232 = arg0;
            if (arg1 >= -110) {
                method526(34, (byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1409 = null;
        if (arg0 != -114) {
            method527((byte) -26);
        }
        field1407 = null;
        field1400 = null;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)V")
    public static final void method528(byte arg0) {
        class129.field2140 = null;
        class226.field4066 = null;
        class132.field2225 = null;
        class138.field2331 = null;
        class176.field2991 = null;
        class40.field722 = null;
        class79.field1342 = null;
        class59.field1075 = null;
        ++field1405;
        class149.field2567 = null;
        if (arg0 != -21) {
            field1400 = null;
        }
        class14.field175 = null;
        class33.field481 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class85() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field1404;
        if (arg1 != -7) {
            this.field1402 = 43;
        }
        int[][] var3 = super.field2053.method1775((byte) -114, arg0);
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -105, arg0, 0);
            int[][] var5 = this.method843((byte) -114, arg0, 1);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var3[0];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1402;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class64.field1132 < ~var16; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var8[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var11[var16];
                                                                var10[var16] = var20 + var21 - (var20 * var21 >> 11);
                                                                var7[var16] = -(var17 * var19 >> 11) + var17 + var19;
                                                                var6[var16] = var22 - (-var18 - -(var18 * var22 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class64.field1132 < ~var23; ++var23) {
                                                            int var24 = var8[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var14[var23];
                                                            var10[var23] = var25 >= var28 ? -var28 + var25 : -var25 + var28;
                                                            var7[var23] = var27 >= var24 ? -var24 + var27 : -var27 + var24;
                                                            var6[var23] = var29 >= var26 ? -var26 + var29 : -var29 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class64.field1132; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var8[var30];
                                                        int var34 = var11[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var13[var30];
                                                        var10[var30] = var32 > var35 ? var32 : var35;
                                                        var7[var30] = var36 >= var33 ? var36 : var33;
                                                        var6[var30] = ~var34 >= ~var31 ? var31 : var34;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class64.field1132 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var8[var37];
                                                    int var43 = var9[var37];
                                                    var10[var37] = ~var43 <= ~var39 ? var39 : var43;
                                                    var7[var37] = ~var40 < ~var42 ? var42 : var40;
                                                    var6[var37] = var38 < var41 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class64.field1132; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var8[var44];
                                                int var47 = var9[var44];
                                                var10[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = var46 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var46) + 4096;
                                                var6[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class64.field1132; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var8[var48];
                                            var10[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var51);
                                            var6[var48] = var50 == 4096 ? 4096 : (var14[var48] << 12) / (-var50 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class64.field1132; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var10[var52] = ~var53 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11) : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var54 <= -2049 ? 4096 - ((4096 - var8[var52]) * (4096 - var54) >> 11) : var8[var52] * var54 >> 11;
                                        var6[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : -((4096 - var55) * (-var11[var52] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class64.field1132 < ~var56; ++var56) {
                                    var10[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var8[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class64.field1132; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var10[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 != -1 ? (var8[var57] << 12) / var59 : 4096;
                                var6[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class64.field1132; ++var61) {
                            var10[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var8[var61] * var13[var61] >> 12;
                            var6[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class64.field1132; ++var62) {
                        var10[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var8[var62] + -var13[var62];
                        var6[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class64.field1132 < ~var63; ++var63) {
                    var10[var63] = var9[var63] + var12[var63];
                    var7[var63] = var8[var63] + var13[var63];
                    var6[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field1408;
        if (arg0 < 68) {
            field1399 = false;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 53, arg1);
            int[] var5 = this.method844(1, 43, arg1);
            int var6 = this.field1402;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class64.field1132 < ~var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class64.field1132 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class64.field1132; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class64.field1132 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var17 > var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class64.field1132; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((4096 - var5[var19] << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class64.field1132 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class64.field1132 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class64.field1132; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class64.field1132; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class64.field1132; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class64.field1132; ++var29) {
                        var3[var29] = var4[var29] - var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class64.field1132 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field1398;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2063 = ~arg1.method1580(-59) == -2;
            }
        } else {
            this.field1402 = arg1.method1580(-30);
        }
        if (!arg2) {
            this.method137(27, (byte) 120);
        }
    }
}
