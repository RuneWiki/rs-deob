import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class262 extends class170 {

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    private int field4676 = 6;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field4661 = 0;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "[I")
    public static int[] field4668 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lqk;")
    public static class207 field4660 = class24.method212(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lqk;")
    private static class207 field4665 = class24.method212(255, "Connection lost)3");

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "Lqk;")
    public static class207 field4669 = class24.method212(255, "details");

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "Lmd;")
    public static class220 field4670 = null;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "Lqk;")
    public static class207 field4666 = field4665;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lqk;")
    public static class207 field4663 = class24.method212(255, "; Expires=");

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(BI)V")
    public static final void method1812(byte arg0, int arg1) {
        ++field4667;
        int var2 = -125 / ((arg0 - 61) / 33);
        class252.field4534.method1383(-8052, arg1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field4673;
        if (arg1) {
            field4663 = null;
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, -108, arg0);
            int[][] var5 = this.method1223(1, -93, arg0);
            int[] var6 = var3[1];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4676;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class88.field1595; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var7[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var11[var16];
                                                                int var22 = var13[var16];
                                                                var9[var16] = var17 - (var17 * var18 >> 11) + var18;
                                                                var6[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                var8[var16] = -(var20 * var21 >> 11) + var21 - -var20;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class88.field1595; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var7[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var10[var23];
                                                            var9[var23] = var27 <= var25 ? var25 - var27 : -var25 + var27;
                                                            var6[var23] = ~var29 < ~var28 ? -var28 + var29 : -var29 + var28;
                                                            var8[var23] = ~var26 < ~var24 ? var26 - var24 : -var26 + var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class88.field1595 > var30; ++var30) {
                                                        int var31 = var7[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var9[var30] = var31 > var33 ? var31 : var33;
                                                        var6[var30] = var34 > var36 ? var34 : var36;
                                                        var8[var30] = ~var32 < ~var35 ? var32 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class88.field1595; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var7[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var11[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var10[var37];
                                                    var9[var37] = var38 > var39 ? var39 : var38;
                                                    var6[var37] = var43 < var40 ? var43 : var40;
                                                    var8[var37] = var42 > var41 ? var41 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class88.field1595 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var11[var44];
                                                int var47 = var7[var44];
                                                var9[var44] = var47 != 0 ? -((-var12[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var6[var44] = ~var45 == -1 ? 0 : -((4096 - var13[var44] << 12) / var45) + 4096;
                                                var8[var44] = ~var46 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class88.field1595 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var10[var48];
                                            int var51 = var7[var48];
                                            var9[var48] = var51 == 4096 ? 4096 : (var12[var48] << 12) / (-var51 + 4096);
                                            var6[var48] = ~var50 != -4097 ? (var13[var48] << 12) / (4096 - var50) : 4096;
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (4096 - var49) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; class88.field1595 > var52; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var9[var52] = var53 < 2048 ? var7[var52] * var53 >> 11 : -((-var7[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((-var10[var52] + 4096) * (-var54 + 4096) >> 11) : var10[var52] * var54 >> 11;
                                        var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : 4096 - ((4096 - var11[var52]) * (-var55 + 4096) >> 11);
                                    }
                                }
                            } else {
                                for (int var56 = 0; class88.field1595 > var56; ++var56) {
                                    var9[var56] = -((4096 - var7[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var6[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class88.field1595; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var9[var57] = var60 == 0 ? 4096 : (var7[var57] << 12) / var60;
                                var6[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; class88.field1595 > var61; ++var61) {
                            var9[var61] = var7[var61] * var12[var61] >> 12;
                            var6[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class88.field1595 < ~var62; ++var62) {
                        var9[var62] = var7[var62] - var12[var62];
                        var6[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class88.field1595 < ~var63; ++var63) {
                    var9[var63] = var7[var63] - -var12[var63];
                    var6[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)I")
    public static final int method1813(int arg0) {
        ++field4674;
        if (arg0 != 7) {
            method1814(47);
        }
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field2998 = arg0.method1045((byte) -56) == 1;
            }
        } else {
            this.field4676 = arg0.method1045((byte) -103);
        }
        if (arg1 != 5877) {
            method1813(17);
        }
        ++field4664;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)Lta;")
    public static final class254 method1814(int arg0) {
        ++field4671;
        if (arg0 != -23145) {
            method1812((byte) 3, -125);
        }
        return class1.field5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lqk;")
    public static final class207 method1815(int arg0, byte arg1) {
        ++field4659;
        int var2 = 97 / ((arg1 - -53) / 47);
        return class137.method948(10, false, arg0, true);
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)V")
    public static void method1816(int arg0) {
        field4670 = null;
        field4660 = null;
        field4666 = null;
        field4665 = null;
        field4663 = null;
        if (arg0 < -88) {
            field4669 = null;
            field4668 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class262() {
        super(2, false);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field4662;
        if (arg0 != -30) {
            field4666 = null;
        }
        int[] var3 = super.field3001.method1538(arg0 ^ -107, arg1);
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, -39);
            int[] var5 = this.method1226(1, arg1, 127);
            int var6 = this.field4676;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (~var6 != -10) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~class88.field1595 < ~var7; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var9 + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class88.field1595; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 < var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class88.field1595; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class88.field1595 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var18 > var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class88.field1595 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class88.field1595; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class88.field1595; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class88.field1595 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (4096 - var5[var25]) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class88.field1595; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; var28 < class88.field1595; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class88.field1595 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class88.field1595; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }
}
