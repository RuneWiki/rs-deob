import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class33 extends class212 {

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    private int field528 = 6;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field530 = Calendar.getInstance();

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "Z")
    public static boolean field534 = false;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "Lsc;")
    public static class181 field536 = class149.method967(255, ")2");

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "Lsc;")
    public static class181 field537 = class149.method967(255, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "[I")
    public static int[] field539 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "Z")
    public static volatile boolean field540 = true;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    public static int field538 = 3353893;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
    public static void method257(byte arg0) {
        field537 = null;
        if (arg0 != -82) {
            method258(-102, true);
        }
        field536 = null;
        field530 = null;
        field539 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class33() {
        super(2, false);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
    public static final void method258(int arg0, boolean arg1) {
        if (arg1) {
            field535 = -81;
        }
        ++field525;
        class87.field1376.method1796(20, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field3651 = ~arg0.method1516((byte) 82) == -2;
            }
        } else {
            this.field528 = arg0.method1516((byte) 82);
        }
        if (arg2 != -3) {
            field533 = 65;
        }
        ++field523;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            this.method260(-78, -110);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        ++field532;
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0, 0, 107);
            int[] var5 = this.method1405(arg0, 1, 126);
            int var6 = this.field528;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (var6 != 6) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class26.field452; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - -var8 + -(var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class26.field452 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var12 > ~var11 ? -var12 + var11 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class26.field452; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = ~var15 >= ~var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class26.field452 < ~var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = ~var18 >= ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class26.field452; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? 4096 - (-var5[var19] + 4096 << 12) / var20 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; var21 < class26.field452; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class26.field452 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class26.field452; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; class26.field452 > var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class26.field452 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class26.field452 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class26.field452 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)Z")
    public static final boolean method259(int arg0) {
        ++field524;
        if (~class8.field158 != -1) {
            try {
                class265.field4633.method1244(0, class224.field3870.field2285);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 110) {
            field537 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field531;
        int[][] var3 = super.field3645.method1352(arg0, arg1 ^ -16261);
        if (arg1 != 16383) {
            field536 = null;
        }
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -82);
            int[][] var5 = this.method1410(arg0, 1, (byte) -110);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var5[2];
            int[] var12 = var4[1];
            int[] var13 = var5[1];
            int[] var14 = var5[0];
            int var15 = this.field528;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~class26.field452 < ~var16; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var11[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var9[var16];
                                                                var7[var16] = -(var18 * var22 >> 11) + var22 + var18;
                                                                var8[var16] = var17 - -var20 + -(var17 * var20 >> 11);
                                                                var6[var16] = var21 - (var19 * var21 >> 11) + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class26.field452; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var14[var23];
                                                            var7[var23] = var28 > var29 ? -var29 + var28 : -var28 + var29;
                                                            var8[var23] = ~var27 < ~var26 ? var27 - var26 : -var27 + var26;
                                                            var6[var23] = ~var24 <= ~var25 ? var24 - var25 : -var24 + var25;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class26.field452; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var9[var30];
                                                        int var34 = var13[var30];
                                                        int var35 = var12[var30];
                                                        int var36 = var14[var30];
                                                        var7[var30] = ~var33 < ~var36 ? var33 : var36;
                                                        var8[var30] = ~var34 > ~var35 ? var35 : var34;
                                                        var6[var30] = ~var31 >= ~var32 ? var32 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class26.field452; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var11[var37];
                                                    var7[var37] = var42 >= var41 ? var41 : var42;
                                                    var8[var37] = var40 >= var39 ? var39 : var40;
                                                    var6[var37] = ~var38 <= ~var43 ? var43 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class26.field452; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var10[var44];
                                                int var47 = var12[var44];
                                                var7[var44] = var45 != 0 ? 4096 - (4096 - var14[var44] << 12) / var45 : 0;
                                                var8[var44] = ~var47 != -1 ? 4096 - (-var13[var44] + 4096 << 12) / var47 : 0;
                                                var6[var44] = var46 == 0 ? 0 : -((-var11[var44] + 4096 << 12) / var46) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class26.field452; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var12[var48];
                                            int var51 = var10[var48];
                                            var7[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                            var8[var48] = var50 == 4096 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var6[var48] = var51 == 4096 ? 4096 : (var11[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class26.field452; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var11[var52];
                                        int var55 = var13[var52];
                                        var7[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : -((4096 - var9[var52]) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var55 > -2049 ? var12[var52] * var55 >> 11 : -((-var12[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var6[var52] = ~var54 <= -2049 ? 4096 - ((4096 - var10[var52]) * (-var54 + 4096) >> 11) : var10[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class26.field452; ++var56) {
                                    var7[var56] = -((-var9[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((-var12[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var6[var56] = -((4096 - var10[var56]) * (-var11[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class26.field452 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var11[var57];
                                int var60 = var13[var57];
                                var7[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var12[var57] << 12) / var60;
                                var6[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class26.field452; ++var61) {
                            var7[var61] = var9[var61] * var14[var61] >> 12;
                            var8[var61] = var12[var61] * var13[var61] >> 12;
                            var6[var61] = var10[var61] * var11[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class26.field452; ++var62) {
                        var7[var62] = var9[var62] + -var14[var62];
                        var8[var62] = var12[var62] - var13[var62];
                        var6[var62] = var10[var62] - var11[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class26.field452 < ~var63; ++var63) {
                    var7[var63] = var9[var63] + var14[var63];
                    var8[var63] = var12[var63] + var13[var63];
                    var6[var63] = var10[var63] + var11[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLbj;)V")
    public static final void method261(boolean arg0, class16 arg1) {
        ++field529;
        if (!arg0) {
            class156.field2608 = arg1;
        }
    }
}
