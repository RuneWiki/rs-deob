import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class51 extends class123 {

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    private int field880 = 6;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "Leb;")
    private static class230 field881 = class68.method589(0, "Allocating memory");

    @OriginalMember(owner = "client!tk", name = "fb", descriptor = "Leb;")
    public static class230 field884 = field881;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!tk", name = "gb", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!tk", name = "hb", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "Lkk;")
    public static class223 field878;

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "Lkk;")
    public static class223 field883;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(II)V")
    public static final void method410(int arg0, int arg1) {
        ++field885;
        if (arg0 != arg1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    throw new RuntimeException();
                } else {
                    class99.method846((byte) 116);
                }
            } else {
                class255.method1790((byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field876;
        if (arg1 != 26080) {
            this.method2(-31, 58);
        }
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -121);
            int[][] var5 = this.method960(1, arg0, (byte) -109);
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var5[1];
            int var15 = this.field880;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class140.field2505 < ~var16; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var7[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var12[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = var19 - (-var21 - -(var19 * var21 >> 11));
                                                                var9[var16] = var17 + var20 + -(var17 * var20 >> 11);
                                                                var8[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class140.field2505; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var7[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var24 < var28 ? var28 - var24 : -var28 + var24;
                                                            var9[var23] = var29 >= var25 ? -var25 + var29 : var25 - var29;
                                                            var8[var23] = var27 <= var26 ? -var27 + var26 : var27 - var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class140.field2505; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var7[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var34 >= var33 ? var34 : var33;
                                                        var9[var30] = ~var32 > ~var31 ? var31 : var32;
                                                        var8[var30] = var36 < var35 ? var35 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class140.field2505 < ~var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var7[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = var42 <= var39 ? var42 : var39;
                                                    var9[var37] = var40 <= var41 ? var40 : var41;
                                                    var8[var37] = ~var38 < ~var43 ? var43 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class140.field2505 < ~var44; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var7[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = ~var46 == -1 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var9[var44] = ~var45 != -1 ? -((4096 - var14[var44] << 12) / var45) + 4096 : 0;
                                                var8[var44] = var47 != 0 ? 4096 - (4096 - var13[var44] << 12) / var47 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class140.field2505; ++var48) {
                                            int var49 = var7[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var49 == 4096 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var9[var48] = var50 != 4096 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                            var8[var48] = var51 != 4096 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class140.field2505; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var13[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = var53 >= 2048 ? -((-var7[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var7[var52] * var53 >> 11;
                                        var9[var52] = ~var55 > -2049 ? var10[var52] * var55 >> 11 : -((4096 - var55) * (-var10[var52] + 4096) >> 11) + 4096;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class140.field2505; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var7[var56] + 4096) >> 12) + 4096;
                                    var9[var56] = 4096 - ((4096 - var14[var56]) * (-var10[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class140.field2505; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 != -1 ? (var7[var57] << 12) / var59 : 4096;
                                var9[var57] = ~var60 != -1 ? (var10[var57] << 12) / var60 : 4096;
                                var8[var57] = var58 != 0 ? (var11[var57] << 12) / var58 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class140.field2505; ++var61) {
                            var6[var61] = var7[var61] * var12[var61] >> 12;
                            var9[var61] = var10[var61] * var14[var61] >> 12;
                            var8[var61] = var11[var61] * var13[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class140.field2505 < ~var62; ++var62) {
                        var6[var62] = var7[var62] + -var12[var62];
                        var9[var62] = var10[var62] + -var14[var62];
                        var8[var62] = var11[var62] - var13[var62];
                    }
                }
            } else {
                for (int var63 = 0; class140.field2505 > var63; ++var63) {
                    var6[var63] = var7[var63] - -var12[var63];
                    var9[var63] = var10[var63] + var14[var63];
                    var8[var63] = var11[var63] - -var13[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class51() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)Z")
    public static final boolean method411(int arg0) {
        ++field879;
        class178 var1 = class173.field3059;
        synchronized (class173.field3059) {
            if (class65.field1226 == class217.field3753) {
                return false;
            } else {
                class214.field3699 = class141.field2535[class65.field1226];
                class216.field3727 = class12.field240[class65.field1226];
                class65.field1226 = class65.field1226 - arg0 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)V")
    public static void method412(int arg0) {
        field878 = null;
        field883 = null;
        if (arg0 <= -124) {
            field884 = null;
            field881 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = -100 % ((arg1 - -24) / 57);
        int[] var4 = super.field2160.method1323((byte) 109, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 36);
            int[] var6 = this.method965(1, arg0, (byte) 112);
            int var7 = this.field880;
            if (~var7 != -2) {
                if (~var7 != -3) {
                    if (~var7 != -4) {
                        if (var7 != 4) {
                            if (~var7 != -6) {
                                if (~var7 != -7) {
                                    if (~var7 != -8) {
                                        if (~var7 != -9) {
                                            if (~var7 != -10) {
                                                if (~var7 != -11) {
                                                    if (~var7 != -12) {
                                                        if (var7 == 12) {
                                                            for (int var8 = 0; var8 < class140.field2505; ++var8) {
                                                                int var9 = var6[var8];
                                                                int var10 = var5[var8];
                                                                var4[var8] = var9 + var10 + -(var9 * var10 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var11 = 0; class140.field2505 > var11; ++var11) {
                                                            int var12 = var5[var11];
                                                            int var13 = var6[var11];
                                                            var4[var11] = var12 > var13 ? -var13 + var12 : -var12 + var13;
                                                        }
                                                    }
                                                } else {
                                                    for (int var14 = 0; ~var14 > ~class140.field2505; ++var14) {
                                                        int var15 = var5[var14];
                                                        int var16 = var6[var14];
                                                        var4[var14] = var16 < var15 ? var15 : var16;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; class140.field2505 > var17; ++var17) {
                                                    int var18 = var5[var17];
                                                    int var19 = var6[var17];
                                                    var4[var17] = var18 < var19 ? var18 : var19;
                                                }
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < class140.field2505; ++var20) {
                                                int var21 = var5[var20];
                                                var4[var20] = ~var21 == -1 ? 0 : -((4096 - var6[var20] << 12) / var21) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var22 = 0; class140.field2505 > var22; ++var22) {
                                            int var23 = var5[var22];
                                            var4[var22] = ~var23 == -4097 ? 4096 : (var6[var22] << 12) / (-var23 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var24 = 0; var24 < class140.field2505; ++var24) {
                                        int var25 = var6[var24];
                                        var4[var24] = var25 >= 2048 ? -((4096 - var5[var24]) * (-var25 + 4096) >> 11) + 4096 : var5[var24] * var25 >> 11;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class140.field2505; ++var26) {
                                    var4[var26] = -((4096 - var6[var26]) * (-var5[var26] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var27 = 0; ~class140.field2505 < ~var27; ++var27) {
                                int var28 = var6[var27];
                                var4[var27] = ~var28 == -1 ? 4096 : (var5[var27] << 12) / var28;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class140.field2505; ++var29) {
                            var4[var29] = var5[var29] * var6[var29] >> 12;
                        }
                    }
                } else {
                    for (int var30 = 0; class140.field2505 > var30; ++var30) {
                        var4[var30] = var5[var30] + -var6[var30];
                    }
                }
            } else {
                for (int var31 = 0; var31 < class140.field2505; ++var31) {
                    var4[var31] = var5[var31] + var6[var31];
                }
            }
        }
        ++field882;
        return var4;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method413(Random arg0, int arg1, int arg2) {
        ++field886;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class212.method1475(arg1, arg2 ^ -2147469756)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 4294967295L) >> 32);
        } else {
            int var3 = arg2 - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class209.method1453(arg1, var4, -123);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field877;
        if (arg2 == 1876195788) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    super.field2147 = arg1.method200(255) == 1;
                }
            } else {
                this.field880 = arg1.method200(255);
            }
        }
    }
}
