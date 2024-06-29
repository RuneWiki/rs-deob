import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class78 extends class397 {

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    private int field1100 = 6;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "Liu;")
    public static class390 field1093 = new class390(75, -1);

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field1104 = 1;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "F")
    public static float field1103;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!di", name = "P", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "Lhk;")
    public static class63 field1102;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static void method511(int arg0) {
        field1093 = null;
        if (arg0 != 0) {
            field1102 = null;
        }
        field1102 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class78() {
        super(2, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field5859 = ~arg2.method941((byte) 126) == -2;
            }
        } else {
            this.field1100 = arg2.method941((byte) 124);
        }
        if (arg1 != 80) {
            field1103 = 1.3080654F;
        }
        ++field1096;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1095;
        int[] var3 = super.field5854.method465(arg1, 100);
        if (super.field5854.field991) {
            int[] var4 = this.method2376(arg0 ^ -780833108, 0, arg1);
            int[] var5 = this.method2376(arg0 ^ -780833126, 1, arg1);
            int var6 = this.field1100;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class164.field2152; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class164.field2152; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : var11 - var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class164.field2152; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = ~var14 >= ~var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class164.field2152 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~var19 > ~class164.field2152; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class164.field2152; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class164.field2152; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class164.field2152 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class164.field2152 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 == -1 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; class164.field2152 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~class164.field2152 < ~var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class164.field2152 > var30; ++var30) {
                    var3[var30] = var4[var30] - -var5[var30];
                }
            }
        }
        if (arg0 != -780833076) {
            this.method31(85, 60);
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lhe;B)I")
    public static final int method512(class239 arg0, byte arg1) {
        ++field1094;
        int var2 = 123 % ((arg1 - 49) / 43);
        int var3 = 0;
        if (arg0.method1442(class397.field5844, (byte) -106)) {
            ++var3;
        }
        if (arg0.method1442(class432.field6349, (byte) -109)) {
            ++var3;
        }
        if (arg0.method1442(class283.field4039, (byte) -124)) {
            ++var3;
        }
        if (arg0.method1442(class15.field227, (byte) -110)) {
            ++var3;
        }
        if (arg0.method1442(class221.field3115, (byte) -109)) {
            ++var3;
        }
        if (arg0.method1442(class75.field1071, (byte) -106)) {
            ++var3;
        }
        if (arg0.method1442(class480.field6931, (byte) -116)) {
            ++var3;
        }
        if (arg0.method1442(class272.field3847, (byte) -111)) {
            ++var3;
        }
        if (arg0.method1442(class267.field3770, (byte) -110)) {
            ++var3;
        }
        if (arg0.method1442(class336.field4873, (byte) -113)) {
            ++var3;
        }
        if (arg0.method1442(class169.field2231, (byte) -125)) {
            ++var3;
        }
        if (arg0.method1442(class141.field1848, (byte) -104)) {
            ++var3;
        }
        if (arg0.method1442(class12.field193, (byte) -123)) {
            ++var3;
        }
        if (arg0.method1442(class386.field5721, (byte) -121)) {
            ++var3;
        }
        if (arg0.method1442(class478.field6879, (byte) -126)) {
            ++var3;
        }
        if (arg0.method1442(class463.field6726, (byte) -128)) {
            ++var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static final void method513(int arg0) {
        class231.field3230 = 0;
        if (arg0 != 3671) {
            field1104 = -61;
        }
        ++field1097;
        class2.field33 = -1;
        class495.field7547 = -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lso;B)V")
    public static final void method514(class313 arg0, byte arg1) {
        ++field1101;
        class173 var2 = (class173) class99.field1347.method2310((byte) -54, (long) arg0.field4262);
        if (arg1 <= 8) {
            method513(0);
        }
        if (var2 != null) {
            if (var2.field2366 != null) {
                class375.field5607.method643(var2.field2366);
                var2.field2366 = null;
            }
            var2.method536(false);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field1098;
        int[][] var3 = super.field5848.method1692(arg1, 127);
        if (arg0 < 81) {
            this.method486((byte) -94, 41);
        }
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(arg1, -61, 0);
            int[][] var5 = this.method2377(arg1, -13, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field1100;
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
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class164.field2152; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var12[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var19 + var20 + -(var19 * var20 >> 11);
                                                                var7[var16] = var18 + var21 + -(var18 * var21 >> 11);
                                                                var8[var16] = var17 + var22 - (var17 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; class164.field2152 > var23; ++var23) {
                                                            int var24 = var10[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var14[var23];
                                                            int var27 = var13[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = var29 > var25 ? -var25 + var29 : -var29 + var25;
                                                            var7[var23] = var27 < var24 ? -var27 + var24 : -var24 + var27;
                                                            var8[var23] = var28 > var26 ? var28 - var26 : -var28 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class164.field2152 > var30; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var9[var30];
                                                        var6[var30] = var36 <= var33 ? var33 : var36;
                                                        var7[var30] = ~var34 > ~var32 ? var32 : var34;
                                                        var8[var30] = var35 > var31 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class164.field2152; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var41 <= ~var40 ? var40 : var41;
                                                    var7[var37] = var38 < var39 ? var38 : var39;
                                                    var8[var37] = var43 >= var42 ? var42 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class164.field2152; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 != 0 ? -((-var12[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var7[var44] = ~var45 != -1 ? -((-var13[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class164.field2152 > var48; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = var49 != 4096 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class164.field2152 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? 4096 - ((-var9[var52] + 4096) * (-var53 + 4096) >> 11) : var9[var52] * var53 >> 11;
                                        var7[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 <= -2049 ? -((4096 - var54) * (-var11[var52] + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class164.field2152 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class164.field2152 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 != 0 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class164.field2152 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class164.field2152; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class164.field2152; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }
}
