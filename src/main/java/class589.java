import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class589 extends class82 {

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    private int field8546 = 6;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "Lib;")
    public static class133 field8544 = class612.method3520(0);

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method481(int arg0, int arg1) {
        ++field8540;
        if (arg0 != 1000) {
            this.field8546 = 23;
        }
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (super.field992.field7962) {
            int[][] var4 = this.method488(0, arg1, 1);
            int[][] var5 = this.method488(1, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field8546;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; var16 < class629.field9033; ++var16) {
                                                                int var17 = var10[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var20 + var21 - (var20 * var21 >> 11);
                                                                var7[var16] = var17 + var19 - (var17 * var19 >> 11);
                                                                var8[var16] = var22 - (var18 * var22 >> 11) + var18;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class629.field9033; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var14[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var9[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var24 > ~var27 ? -var24 + var27 : -var27 + var24;
                                                            var7[var23] = ~var28 < ~var29 ? var28 - var29 : -var28 + var29;
                                                            var8[var23] = var26 > var25 ? -var25 + var26 : -var26 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class629.field9033; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = var32 >= var34 ? var32 : var34;
                                                        var7[var30] = ~var31 <= ~var35 ? var31 : var35;
                                                        var8[var30] = var36 >= var33 ? var36 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class629.field9033 > var37; ++var37) {
                                                    int var38 = var14[var37];
                                                    int var39 = var12[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var41 <= ~var39 ? var39 : var41;
                                                    var7[var37] = ~var42 >= ~var40 ? var42 : var40;
                                                    var8[var37] = ~var38 >= ~var43 ? var38 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class629.field9033; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 != 0 ? -((4096 - var12[var44] << 12) / var46) + 4096 : 0;
                                                var7[var44] = var45 != 0 ? -((4096 - var13[var44] << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 == 0 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class629.field9033; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var11[var48];
                                            int var51 = var9[var48];
                                            var6[var48] = ~var51 == -4097 ? 4096 : (var12[var48] << 12) / (4096 - var51);
                                            var7[var48] = ~var49 != -4097 ? (var13[var48] << 12) / (4096 - var49) : 4096;
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class629.field9033; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var12[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var54 >= 2048 ? -((-var9[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var9[var52] * var54 >> 11;
                                        var7[var52] = ~var55 <= -2049 ? -((4096 - var10[var52]) * (4096 - var55) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var53 <= -2049 ? -((4096 - var53) * (-var11[var52] + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class629.field9033 > var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class629.field9033 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var12[var57];
                                int var60 = var13[var57];
                                var6[var57] = var59 == 0 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var60 != 0 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = ~var58 == -1 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class629.field9033; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; var62 < class629.field9033; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class629.field9033 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 323)
    public static void method3414(byte arg0) {
        int var1 = -126 % ((arg0 - -5) / 51);
        field8544 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILos;)V", line = 333)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field8545;
        int var4 = 96 % ((-69 - arg1) / 42);
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field999 = arg2.method2129(-63) == 1;
            }
        } else {
            this.field8546 = arg2.method2129(-94);
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(II)[I", line = 369)
    public final int[] method201(int arg0, int arg1) {
        ++field8541;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 0, arg0);
            int[] var5 = this.method489(false, 1, arg0);
            int var6 = this.field8546;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class629.field9033 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class629.field9033 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 <= var12 ? -var11 + var12 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~class629.field9033 < ~var13; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 < var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; var16 < class629.field9033; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 < ~var17 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class629.field9033; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : 4096 - (4096 - var5[var19] << 12) / var20;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class629.field9033; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class629.field9033; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var24) * (-var4[var23] + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; var25 < class629.field9033; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (4096 - var5[var25]) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class629.field9033 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class629.field9033; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class629.field9033 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; class629.field9033 > var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 != 12218) {
            this.method481(43, -45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZLjava/lang/String;)V", line = 615)
    public static final void method3415(String arg0, int arg1, String arg2, int arg3, boolean arg4, String arg5) {
        ++field8547;
        class62.method365(arg0, arg3, (String) null, (byte) -29, arg2, arg1, arg5, -1);
        if (arg4) {
            field8544 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "(I)V", line = 627)
    public static final void method3416(int arg0) {
        ++field8543;
        int var1 = (int) ((double) class106.field1289 * 34.46D);
        int var2 = var1 << 0;
        if (class210.field2560.method1104()) {
            var2 += 128;
        }
        class210.field2560.method1184(50, var2);
        if (arg0 != 697608907) {
            method3415((String) null, -16, (String) null, 126, false, (String) null);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLos;)Ljava/lang/String;", line = 645)
    public static final String method3417(byte arg0, class374 arg1) {
        ++field8539;
        int var2 = 108 / ((-70 - arg0) / 47);
        return class622.method3564(arg1, -108, 32767);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 655)
    public static final String method3418(long arg0, byte arg1) {
        ++field8542;
        if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg1 != 53) {
                field8544 = null;
            }
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    var6.append(class258.field3322[(int) (-(arg0 * 37L) + var7)]);
                }
                return var6.reverse().toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 695)
    public class589() {
        super(2, false);
    }
}
