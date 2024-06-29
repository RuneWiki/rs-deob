import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class206 extends class273 {

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3316 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "Lkj;")
    public static class114 field3309;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Z")
    public static boolean field3312;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "[I")
    public static int[] field3322;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
    public static final void method1383(int arg0, int arg1, int arg2) {
        ++field3314;
        if (arg1 == 103) {
            if (~class26.field458 != ~arg0) {
                class265.field4234 = new int[arg0];
                for (int var3 = 0; var3 < arg0; ++var3) {
                    class265.field4234[var3] = (var3 << 12) / arg0;
                }
                class26.field458 = arg0;
                class232.field3679 = arg0 * 32;
                client.field4573 = arg0 - 1;
            }
            if (~class67.field1129 != ~arg2) {
                if (~class26.field458 == ~arg2) {
                    class255.field4068 = class265.field4234;
                } else {
                    class255.field4068 = new int[arg2];
                    for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                        class255.field4068[var4] = (var4 << 12) / arg2;
                    }
                }
                class67.field1129 = arg2;
                class145.field2392 = arg2 + -1;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(Z)V")
    public static void method1384(boolean arg0) {
        field3322 = null;
        field3309 = null;
        if (arg0) {
            field3312 = true;
        }
        field3316 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        ++field3315;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int[] var4 = this.method1850(arg1, 2, (byte) -126);
            int[][] var5 = this.method1853(0, arg1, (byte) 8);
            int[][] var6 = this.method1853(1, arg1, (byte) 8);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[2];
            int[] var11 = var5[1];
            int[] var12 = var6[1];
            int[] var13 = var6[0];
            int[] var14 = var5[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class26.field458; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var14[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var10[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var9[var16] = var12[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var13[var16] * var18 + var14[var16] * var17 >> 12;
                    var9[var16] = var11[var16] * var17 - -(var12[var16] * var18) >> 12;
                    var8[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        if (arg0 < 122) {
            this.method2((class136) null, -116, -67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
    public static final void method1385(byte arg0, int arg1) {
        class2.field12.method1163(arg1, false);
        class270.field4337.method1163(arg1, false);
        ++field3313;
        int var2 = 51 / ((-50 - arg0) / 39);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class206() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            method1384(true);
        }
        if (arg1 == 0) {
            super.field4358 = arg0.method1012(4) == 1;
        }
        ++field3323;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            field3309 = null;
        }
        ++field3308;
        int[] var3 = super.field4359.method387((byte) 119, arg1);
        if (super.field4359.field833) {
            int[] var4 = this.method1850(arg1, 0, (byte) -42);
            int[] var5 = this.method1850(arg1, 1, (byte) 103);
            int[] var6 = this.method1850(arg1, 2, (byte) 55);
            for (int var7 = 0; ~class26.field458 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)C")
    public static final char method1386(char arg0, int arg1) {
        if (arg1 != -27109) {
            field3312 = false;
        }
        ++field3321;
        return ~arg0 != -182 && arg0 != 402 ? Character.toTitleCase(arg0) : arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BIIZZIII)V")
    public static final void method1387(byte arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field3319;
        if (arg4 || class33.field551 != arg1 || ~class111.field1716 != ~arg6 || class282.field4485 != arg5 && !class9.method50(false)) {
            class33.field551 = arg1;
            class111.field1716 = arg6;
            class282.field4485 = arg5;
            if (class9.method50(false)) {
                class282.field4485 = 0;
            }
            if (arg3) {
                class274.method1856(28, 5);
            } else {
                class274.method1856(25, 5);
            }
            class72.method554(true, class35.field591, (byte) -59);
            int var8 = class170.field2787;
            class170.field2787 = (arg6 - 6) * 8;
            int var9 = class256.field4082;
            class256.field4082 = arg1 * 8 + -48;
            class266.field4256 = class155.method1122(class111.field1716 * 8, class33.field551 * 8, 119);
            class13.field172 = null;
            int var10 = class170.field2787 - var8;
            int var11 = class170.field2787;
            if (arg0 != 106) {
                field3312 = true;
            }
            int var12 = class256.field4082 - var9;
            int var13 = class256.field4082;
            if (!arg3) {
                for (int var14 = 0; var14 < 32768; ++var14) {
                    class139 var15 = class3.field45[var14];
                    if (var15 != null) {
                        for (int var16 = 0; var16 < 10; ++var16) {
                            var15.field2844[var16] -= var12;
                            var15.field2813[var16] -= var10;
                        }
                        var15.field2887 -= var10 * 128;
                        var15.field2849 -= var12 * 128;
                    }
                }
            } else {
                class7.field88 = 0;
                for (int var17 = 0; var17 < 32768; ++var17) {
                    class139 var33 = class3.field45[var17];
                    if (var33 != null) {
                        var33.field2849 -= var12 * 128;
                        var33.field2887 -= var10 * 128;
                        if (var33.field2849 >= 0 && var33.field2849 <= 13184 && ~var33.field2887 <= -1 && ~var33.field2887 >= -13185) {
                            for (int var34 = 0; ~var34 > -11; ++var34) {
                                var33.field2844[var34] -= var12;
                                var33.field2813[var34] -= var10;
                            }
                            class287.field4587[class7.field88++] = var17;
                        } else {
                            class3.field45[var17].method1038(-15565, (class165) null);
                            class3.field45[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class213 var31 = class191.field3129[var18];
                if (var31 != null) {
                    for (int var32 = 0; var32 < 10; ++var32) {
                        var31.field2844[var32] -= var12;
                        var31.field2813[var32] -= var10;
                    }
                    var31.field2849 -= var12 * 128;
                    var31.field2887 -= var10 * 128;
                }
            }
            class92.field1448 = arg5;
            class48.field878.method1409(arg7, (byte) 120, false, arg2);
            byte var19 = 1;
            byte var20 = 0;
            byte var21 = 104;
            if (var12 < 0) {
                var21 = -1;
                var20 = 103;
                var19 = -1;
            }
            byte var22 = 0;
            byte var23 = 104;
            byte var24 = 1;
            if (var10 < 0) {
                var24 = -1;
                var23 = -1;
                var22 = 103;
            }
            for (int var25 = var20; ~var21 != ~var25; var25 += var19) {
                for (int var27 = var22; var23 != var27; var27 += var24) {
                    int var28 = var12 + var25;
                    int var29 = var10 + var27;
                    for (int var30 = 0; var30 < 4; ++var30) {
                        if (var28 >= 0 && ~var29 <= -1 && ~var28 > -105 && ~var29 > -105) {
                            class2.field23[var30][var25][var27] = class2.field23[var30][var28][var29];
                        } else {
                            class2.field23[var30][var25][var27] = null;
                        }
                    }
                }
            }
            for (class110 var26 = (class110) class189.field3082.method1807(arg0 ^ -27); var26 != null; var26 = (class110) class189.field3082.method1808((byte) 107)) {
                var26.field1705 -= var10;
                var26.field1688 -= var12;
                if (var26.field1688 < 0 || ~var26.field1705 > -1 || ~var26.field1688 <= -105 || var26.field1705 >= 104) {
                    var26.method1074((byte) -128);
                }
            }
            class137.field2304 = -1;
            if (arg3) {
                class11.field147 -= var12;
                class76.field1240 -= var12;
                class141.field2345 -= var10;
                class31.field527 -= var12 * 128;
                class148.field2434 -= var10 * 128;
                class67.field1146 -= var10;
            } else {
                class184.field3033 = 1;
            }
            if (~class71.field1191 != -1) {
                class146.field2404 -= var10;
                class71.field1191 -= var12;
            }
            class153.field2497 = 0;
            class229.field3655.method1818(arg0 + 21);
            class140.field2335.method1818(arg0 ^ 31);
        }
    }
}
