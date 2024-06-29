import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class95 extends class7 {

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    private int field1884 = 6;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "Lob;")
    public static class141 field1886 = class175.method1195(40, "<col=c0ff00>");

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Lob;")
    public static class141 field1883 = class175.method1195(40, "Okay");

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "Lob;")
    public static class141 field1889 = class175.method1195(40, ")1");

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lvc;")
    public static class212 field1885 = new class212(100);

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lob;")
    public static class141 field1893 = class175.method1195(40, "sl_stars");

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class95() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -69 / ((-42 - arg1) / 41);
        ++field1890;
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, 106, 0);
            int[][] var6 = this.method42(arg0, -58, 1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var5[0];
            int[] var10 = var4[2];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[1];
            int[] var14 = var5[2];
            int[] var15 = var6[2];
            int var16 = this.field1884;
            if (var16 != 1) {
                if (~var16 != -3) {
                    if (var16 != 3) {
                        if (~var16 != -5) {
                            if (var16 != 5) {
                                if (var16 != 6) {
                                    if (~var16 != -8) {
                                        if (~var16 != -9) {
                                            if (~var16 != -10) {
                                                if (~var16 != -11) {
                                                    if (var16 != 11) {
                                                        if (var16 == 12) {
                                                            for (int var17 = 0; class117.field2272 > var17; ++var17) {
                                                                int var18 = var11[var17];
                                                                int var19 = var9[var17];
                                                                int var20 = var15[var17];
                                                                int var21 = var12[var17];
                                                                int var22 = var14[var17];
                                                                int var23 = var13[var17];
                                                                var7[var17] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var8[var17] = var18 + var23 + -(var18 * var23 >> 11);
                                                                var10[var17] = var22 - (-var20 - -(var20 * var22 >> 11));
                                                            }
                                                        }
                                                    } else {
                                                        for (int var24 = 0; class117.field2272 > var24; ++var24) {
                                                            int var25 = var13[var24];
                                                            int var26 = var14[var24];
                                                            int var27 = var11[var24];
                                                            int var28 = var15[var24];
                                                            int var29 = var9[var24];
                                                            int var30 = var12[var24];
                                                            var7[var24] = var30 < var29 ? -var30 + var29 : var30 - var29;
                                                            var8[var24] = var27 <= var25 ? var25 - var27 : -var25 + var27;
                                                            var10[var24] = ~var28 > ~var26 ? -var28 + var26 : -var26 + var28;
                                                        }
                                                    }
                                                } else {
                                                    for (int var31 = 0; var31 < class117.field2272; ++var31) {
                                                        int var32 = var11[var31];
                                                        int var33 = var13[var31];
                                                        int var34 = var12[var31];
                                                        int var35 = var14[var31];
                                                        int var36 = var15[var31];
                                                        int var37 = var9[var31];
                                                        var7[var31] = var34 < var37 ? var37 : var34;
                                                        var8[var31] = ~var32 < ~var33 ? var32 : var33;
                                                        var10[var31] = var36 < var35 ? var35 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var38 = 0; ~class117.field2272 < ~var38; ++var38) {
                                                    int var39 = var15[var38];
                                                    int var40 = var14[var38];
                                                    int var41 = var9[var38];
                                                    int var42 = var11[var38];
                                                    int var43 = var13[var38];
                                                    int var44 = var12[var38];
                                                    var7[var38] = var41 < var44 ? var41 : var44;
                                                    var8[var38] = ~var43 < ~var42 ? var42 : var43;
                                                    var10[var38] = var39 > var40 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var45 = 0; var45 < class117.field2272; ++var45) {
                                                int var46 = var9[var45];
                                                int var47 = var14[var45];
                                                int var48 = var11[var45];
                                                var7[var45] = ~var46 == -1 ? 0 : 4096 - (-var12[var45] + 4096 << 12) / var46;
                                                var8[var45] = ~var48 != -1 ? 4096 - (4096 - var13[var45] << 12) / var48 : 0;
                                                var10[var45] = var47 != 0 ? 4096 - (-var15[var45] + 4096 << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var49 = 0; var49 < class117.field2272; ++var49) {
                                            int var50 = var11[var49];
                                            int var51 = var14[var49];
                                            int var52 = var9[var49];
                                            var7[var49] = var52 == 4096 ? 4096 : (var12[var49] << 12) / (-var52 + 4096);
                                            var8[var49] = ~var50 != -4097 ? (var13[var49] << 12) / (-var50 + 4096) : 4096;
                                            var10[var49] = var51 == 4096 ? 4096 : (var15[var49] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var53 = 0; ~class117.field2272 < ~var53; ++var53) {
                                        int var54 = var12[var53];
                                        int var55 = var15[var53];
                                        int var56 = var13[var53];
                                        var7[var53] = ~var54 <= -2049 ? -((-var9[var53] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var53] * var54 >> 11;
                                        var8[var53] = var56 < 2048 ? var11[var53] * var56 >> 11 : -((-var11[var53] + 4096) * (-var56 + 4096) >> 11) + 4096;
                                        var10[var53] = var55 < 2048 ? var14[var53] * var55 >> 11 : 4096 - ((-var14[var53] + 4096) * (-var55 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var57 = 0; class117.field2272 > var57; ++var57) {
                                    var7[var57] = 4096 - ((4096 - var12[var57]) * (-var9[var57] + 4096) >> 12);
                                    var8[var57] = -((-var11[var57] + 4096) * (-var13[var57] + 4096) >> 12) + 4096;
                                    var10[var57] = -((4096 - var15[var57]) * (-var14[var57] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var58 = 0; ~class117.field2272 < ~var58; ++var58) {
                                int var59 = var12[var58];
                                int var60 = var13[var58];
                                int var61 = var15[var58];
                                var7[var58] = var59 != 0 ? (var9[var58] << 12) / var59 : 4096;
                                var8[var58] = ~var60 != -1 ? (var11[var58] << 12) / var60 : 4096;
                                var10[var58] = var61 != 0 ? (var14[var58] << 12) / var61 : 4096;
                            }
                        }
                    } else {
                        for (int var62 = 0; ~var62 > ~class117.field2272; ++var62) {
                            var7[var62] = var9[var62] * var12[var62] >> 12;
                            var8[var62] = var11[var62] * var13[var62] >> 12;
                            var10[var62] = var14[var62] * var15[var62] >> 12;
                        }
                    }
                } else {
                    for (int var63 = 0; class117.field2272 > var63; ++var63) {
                        var7[var63] = var9[var63] + -var12[var63];
                        var8[var63] = var11[var63] - var13[var63];
                        var10[var63] = var14[var63] + -var15[var63];
                    }
                }
            } else {
                for (int var64 = 0; var64 < class117.field2272; ++var64) {
                    var7[var64] = var9[var64] + var12[var64];
                    var8[var64] = var11[var64] - -var13[var64];
                    var10[var64] = var14[var64] - -var15[var64];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            return null;
        } else {
            ++field1888;
            int[] var3 = super.field100.method842(arg1, 12);
            if (super.field100.field2534) {
                int[] var4 = this.method52(arg1, 0, 82);
                int[] var5 = this.method52(arg1, 1, 29);
                int var6 = this.field1884;
                if (var6 != 1) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; var7 < class117.field2272; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var9 - (-var8 - -(var8 * var9 >> 11));
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class117.field2272 > var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = var12 >= var11 ? -var11 + var12 : var11 - var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; class117.field2272 > var13; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; class117.field2272 > var16; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = var17 <= var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; class117.field2272 > var19; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~var21 > ~class117.field2272; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~class117.field2272 < ~var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class117.field2272; ++var25) {
                                        var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; var26 < class117.field2272; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class117.field2272 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class117.field2272; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class117.field2272; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIILaa;IZJ)Z")
    public static final boolean method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class2 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; ++var13) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                if (var13 < 0 || var20 < 0 || var13 >= class163.field3158 || var20 >= class220.field4172) {
                    return false;
                }
                class153 var21 = class131.field2506[arg0][var13][var20];
                if (var21 != null && var21.field2933 >= 5) {
                    return false;
                }
            }
        }
        class9 var14 = new class9();
        var14.field141 = arg11;
        var14.field150 = arg0;
        var14.field148 = arg5;
        var14.field140 = arg6;
        var14.field154 = arg7;
        var14.field147 = arg8;
        var14.field153 = arg9;
        var14.field156 = arg1;
        var14.field143 = arg2;
        var14.field144 = arg1 + arg3 - 1;
        var14.field157 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var16 = arg2; var16 < arg2 + arg4; ++var16) {
                int var17 = 0;
                if (var15 > arg1) {
                    ++var17;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; --var18) {
                    if (class131.field2506[var18][var15][var16] == null) {
                        class131.field2506[var18][var15][var16] = new class153(var18, var15, var16);
                    }
                }
                class153 var19 = class131.field2506[arg0][var15][var16];
                var19.field2935[var19.field2933] = var14;
                var19.field2930[var19.field2933] = var17;
                var19.field2940 |= var17;
                ++var19.field2933;
            }
        }
        if (arg10) {
            class113.field2165[class17.field304++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field99 = arg2.method991(255) == 1;
            }
        } else {
            this.field1884 = arg2.method991(255);
        }
        int var5 = -91 / ((arg1 - 66) / 57);
        ++field1887;
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
    public static void method643(int arg0) {
        field1889 = null;
        field1893 = null;
        field1885 = null;
        if (arg0 != 0) {
            method643(-109);
        }
        field1886 = null;
        field1883 = null;
    }
}
