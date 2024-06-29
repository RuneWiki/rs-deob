import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class269 extends class242 {

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    private int field4713 = 4096;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    private int field4714 = 0;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field4711 = 8192;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    private int field4721 = 2048;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    private int field4718 = 0;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    private int field4727 = 2048;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "I")
    private int field4726 = 12288;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "Lp;")
    public static class280 field4717 = class18.method140((byte) -118, "(U0a )2 via: ");

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "Lp;")
    public static class280 field4722 = class18.method140((byte) -124, "(U1");

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public static int field4725 = 0;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "[[[I")
    public static int[][][] field4719 = new int[2][][];

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "Lp;")
    public static class280 field4710 = class18.method140((byte) -117, "Lade)3)3)3");

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "[Lde;")
    public static class108[] field4708;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(III)Z")
    private final boolean method1800(int arg0, int arg1, int arg2) {
        if (arg0 != 22629) {
            return true;
        } else {
            ++field4712;
            int var4 = (arg2 - -arg1) * this.field4726 >> 12;
            int var5 = class90.field1459[(var4 * 255 & 1044938) >> 12];
            int var6 = (var5 << 12) / this.field4726;
            int var7 = (var6 << 12) / this.field4711;
            int var8 = this.field4713 * var7 >> 12;
            return ~(-arg1 + arg2) > ~var8 && ~(-var8) > ~(-arg1 + arg2);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        ++field4716;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field4711 = arg2.method193((byte) 77);
                                }
                            } else {
                                this.field4713 = arg2.method193((byte) 77);
                            }
                        } else {
                            this.field4726 = arg2.method193((byte) 77);
                        }
                    } else {
                        this.field4721 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field4714 = arg2.method193((byte) 77);
                }
            } else {
                this.field4718 = arg2.method193((byte) 77);
            }
        } else {
            this.field4727 = arg2.method193((byte) 77);
        }
        if (arg0 >= -119) {
            this.method54(-31, -50);
        }
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4710 = null;
        field4722 = null;
        if (arg0 == -1) {
            field4719 = null;
            field4708 = null;
            field4717 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(III)Z")
    private final boolean method1802(int arg0, int arg1, int arg2) {
        ++field4723;
        int var4 = (-arg0 + arg2) * this.field4726 >> 12;
        int var5 = class90.field1459[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4726;
        int var7 = (var6 << 12) / this.field4711;
        int var8 = this.field4713 * var7 >> 12;
        int var9 = -98 % ((-32 - arg1) / 48);
        return arg0 + arg2 < var8 && ~(arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)I")
    public static final int method1803(byte arg0, int arg1) {
        ++field4715;
        if ((arg1 < 65 || arg1 > 90) && (~arg1 > -193 || arg1 > 222 || ~arg1 == -216)) {
            if (~arg1 == -160) {
                return 255;
            } else {
                if (arg0 != 88) {
                    field4725 = -22;
                }
                return ~arg1 == -141 ? 156 : arg1;
            }
        } else {
            return arg1 + 32;
        }
    }

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "(III)Z")
    public static final boolean method1804(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class57.field916; ++var3) {
            class33 var4 = class132.field2355[var3];
            if (var4.field605 == 1) {
                int var5 = var4.field621 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field611 * var5 >> 8) + var4.field615;
                    int var7 = (var4.field613 * var5 >> 8) + var4.field609;
                    int var8 = (var4.field610 * var5 >> 8) + var4.field618;
                    int var9 = (var4.field622 * var5 >> 8) + var4.field614;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field605 == 2) {
                int var10 = arg0 - var4.field621;
                if (var10 > 0) {
                    int var11 = (var4.field611 * var10 >> 8) + var4.field615;
                    int var12 = (var4.field613 * var10 >> 8) + var4.field609;
                    int var13 = (var4.field610 * var10 >> 8) + var4.field618;
                    int var14 = (var4.field622 * var10 >> 8) + var4.field614;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field605 == 3) {
                int var15 = var4.field615 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field620 * var15 >> 8) + var4.field621;
                    int var17 = (var4.field606 * var15 >> 8) + var4.field608;
                    int var18 = (var4.field610 * var15 >> 8) + var4.field618;
                    int var19 = (var4.field622 * var15 >> 8) + var4.field614;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field605 == 4) {
                int var20 = arg2 - var4.field615;
                if (var20 > 0) {
                    int var21 = (var4.field620 * var20 >> 8) + var4.field621;
                    int var22 = (var4.field606 * var20 >> 8) + var4.field608;
                    int var23 = (var4.field610 * var20 >> 8) + var4.field618;
                    int var24 = (var4.field622 * var20 >> 8) + var4.field614;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field605 == 5) {
                int var25 = arg1 - var4.field618;
                if (var25 > 0) {
                    int var26 = (var4.field620 * var25 >> 8) + var4.field621;
                    int var27 = (var4.field606 * var25 >> 8) + var4.field608;
                    int var28 = (var4.field611 * var25 >> 8) + var4.field615;
                    int var29 = (var4.field613 * var25 >> 8) + var4.field609;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        int var3 = -29 % ((arg1 - 73) / 41);
        ++field4709;
        int[] var4 = super.field4251.method1417((byte) 95, arg0);
        if (super.field4251.field3655) {
            int var5 = class117.field2106[arg0] + -2048;
            for (int var6 = 0; var6 < class264.field4654; ++var6) {
                int var7 = class102.field1701[var6] + -2048;
                int var8 = this.field4718 + var5;
                int var9 = this.field4714 + var7;
                int var10 = var7 - -this.field4727;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var9 > 2047 ? var9 + 4096 : var9;
                int var13 = var12 > 2048 ? var12 + -4096 : var12;
                int var14 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var15 = var11 <= 2048 ? var11 : var11 - 4096;
                int var16 = this.field4721 + var5;
                int var17 = var16 < -2048 ? var16 - -4096 : var16;
                int var18 = var14 <= 2048 ? var14 : var14 + -4096;
                int var19 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var4[var6] = !this.method1802(var15, -120, var18) && !this.method1800(22629, var13, var19) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        ++field4720;
        if (arg0 > 122) {
            class252.method1696(-9);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method1805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; ~var31 > -105; ++var31) {
                class234.field4071[var12][var31] = 0;
                class64.field1072[var12][var31] = 99999999;
            }
        }
        ++field4724;
        class234.field4071[arg6][arg4] = 99;
        class64.field1072[arg6][arg4] = arg7;
        int var13 = arg6;
        int var14 = arg4;
        byte var15 = 0;
        class250.field4385[var15] = arg6;
        int var32 = var15 + 1;
        class241.field4218[var15] = arg4;
        int var16 = 0;
        boolean var17 = false;
        int[][] var18 = class183.field3211[class231.field4013].field1604;
        while (var32 != var16) {
            var13 = class250.field4385[var16];
            var14 = class241.field4218[var16];
            var16 = 4095 & var16 - -1;
            if (~arg2 == ~var13 && arg1 == var14) {
                var17 = true;
                break;
            }
            if (~arg9 != -1) {
                if ((arg9 < 5 || arg9 == 10) && class183.field3211[class231.field4013].method703(arg1, 59, 2, arg2, arg9 - 1, var14, arg3, var13)) {
                    var17 = true;
                    break;
                }
                if (~arg9 > -11 && class183.field3211[class231.field4013].method701(var14, arg2, 2, arg3, true, arg9 + -1, arg1, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && ~arg0 != -1 && class183.field3211[class231.field4013].method694(2, false, var14, var13, arg10, arg0, arg5, arg2, arg1)) {
                var17 = true;
                break;
            }
            int var30 = class64.field1072[var13][var14] + 1;
            if (~var13 < -1 && ~class234.field4071[var13 + -1][var14] == -1 && ~(19661070 & var18[var13 - 1][var14]) == -1 && (var18[var13 + -1][var14 + 1] & 19661112) == 0) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var14;
                class234.field4071[var13 + -1][var14] = 2;
                var32 = var32 + 1 & 4095;
                class64.field1072[var13 + -1][var14] = var30;
            }
            if (~var13 > -103 && class234.field4071[var13 - -1][var14] == 0 && ~(19661187 & var18[var13 + 2][var14]) == -1 && (var18[var13 + 2][var14 + 1] & 19661280) == 0) {
                class250.field4385[var32] = var13 + 1;
                class241.field4218[var32] = var14;
                class234.field4071[var13 + 1][var14] = 8;
                class64.field1072[var13 + 1][var14] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var14 < -1 && class234.field4071[var13][var14 - 1] == 0 && ~(var18[var13][var14 + -1] & 19661070) == -1 && ~(var18[var13 + 1][var14 - 1] & 19661187) == -1) {
                class250.field4385[var32] = var13;
                class241.field4218[var32] = var14 + -1;
                var32 = 4095 & var32 + 1;
                class234.field4071[var13][var14 + -1] = 1;
                class64.field1072[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && ~class234.field4071[var13][var14 + 1] == -1 && (19661112 & var18[var13][var14 + 2]) == 0 && (var18[var13 + 1][var14 + 2] & 19661280) == 0) {
                class250.field4385[var32] = var13;
                class241.field4218[var32] = var14 - -1;
                var32 = 4095 & var32 + 1;
                class234.field4071[var13][var14 + 1] = 4;
                class64.field1072[var13][var14 + 1] = var30;
            }
            if (~var13 < -1 && var14 > 0 && ~class234.field4071[var13 + -1][var14 + -1] == -1 && ~(19661112 & var18[var13 - 1][var14]) == -1 && (var18[var13 + -1][var14 + -1] & 19661070) == 0 && (var18[var13][var14 + -1] & 19661187) == 0) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var14 - 1;
                class234.field4071[var13 + -1][var14 + -1] = 3;
                class64.field1072[var13 + -1][var14 + -1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (var13 < 102 && var14 > 0 && ~class234.field4071[var13 + 1][var14 + -1] == -1 && (var18[var13 + 1][var14 + -1] & 19661070) == 0 && ~(19661187 & var18[var13 + 2][var14 - 1]) == -1 && (19661280 & var18[var13 + 2][var14]) == 0) {
                class250.field4385[var32] = var13 + 1;
                class241.field4218[var32] = var14 + -1;
                class234.field4071[var13 + 1][var14 - 1] = 9;
                var32 = 4095 & var32 + 1;
                class64.field1072[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && ~var14 > -103 && class234.field4071[var13 + -1][var14 - -1] == 0 && (var18[var13 - 1][var14 + 1] & 19661070) == 0 && (19661112 & var18[var13 + -1][var14 + 2]) == 0 && ~(var18[var13][var14 + 2] & 19661280) == -1) {
                class250.field4385[var32] = var13 + -1;
                class241.field4218[var32] = var14 + 1;
                var32 = var32 + 1 & 4095;
                class234.field4071[var13 + -1][var14 - -1] = 6;
                class64.field1072[var13 + -1][var14 + 1] = var30;
            }
            if (~var13 > -103 && ~var14 > -103 && class234.field4071[var13 + 1][var14 - -1] == 0 && (19661112 & var18[var13 + 1][var14 + 2]) == 0 && (var18[var13 + 2][var14 - -2] & 19661280) == 0 && (var18[var13 + 2][var14 + 1] & 19661187) == 0) {
                class250.field4385[var32] = var13 + 1;
                class241.field4218[var32] = var14 + 1;
                class234.field4071[var13 + 1][var14 - -1] = 12;
                class64.field1072[var13 - -1][var14 + 1] = var30;
                var32 = 4095 & var32 + 1;
            }
        }
        class104.field1733 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg2; ~(arg2 + var21) <= ~var22; ++var22) {
                for (int var23 = -var21 + arg1; ~var23 >= ~(arg1 + var21); ++var23) {
                    if (~var22 <= -1 && var23 >= 0 && ~var22 > -105 && ~var23 > -105 && class64.field1072[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 >= arg2) {
                            if (~var22 < ~(arg2 + arg10 - 1)) {
                                var24 = -arg10 + 1 + -arg2 + var22;
                            }
                        } else {
                            var24 = -var22 + arg2;
                        }
                        int var25 = 0;
                        if (~arg1 >= ~var23) {
                            if (~(arg0 + arg1 + -1) > ~var23) {
                                var25 = var23 - (arg0 + arg1 + -1);
                            }
                        } else {
                            var25 = arg1 - var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class64.field1072[var22][var23]) {
                            var13 = var22;
                            var19 = var26;
                            var20 = class64.field1072[var22][var23];
                            var14 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (~arg6 == ~var13 && arg4 == var14) {
                return false;
            }
            class104.field1733 = 1;
        }
        byte var27 = 0;
        class250.field4385[var27] = var13;
        int var33 = var27 + 1;
        class241.field4218[var27] = var14;
        int var28;
        int var29 = var28 = class234.field4071[var13][var14];
        while (~arg6 != ~var13 || ~arg4 != ~var14) {
            if (~var28 != ~var29) {
                var28 = var29;
                class250.field4385[var33] = var13;
                class241.field4218[var33++] = var14;
            }
            if (~(var29 & 2) == -1) {
                if ((8 & var29) != 0) {
                    --var13;
                }
            } else {
                ++var13;
            }
            if ((1 & var29) == 0) {
                if ((4 & var29) != 0) {
                    --var14;
                }
            } else {
                ++var14;
            }
            var29 = class234.field4071[var13][var14];
        }
        if (~var33 < -1) {
            class227.method1527(var33, true, arg8);
            return true;
        } else if (~arg8 == -2) {
            return false;
        } else {
            return true;
        }
    }
}
