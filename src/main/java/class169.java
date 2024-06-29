import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class169 extends class124 {

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    private int field2859 = 2000;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    private int field2863 = 4096;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "I")
    private int field2867 = 0;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    private int field2871 = 0;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "I")
    private int field2872 = 16;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Le;")
    public static class191 field2856 = class54.method368(" loggt sich aus)3", 2047);

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field2861 = 0;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "Le;")
    public static class191 field2864 = class54.method368(":chalreq:", 2047);

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field2854 = -1;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "Lwe;")
    public static class147 field2868 = new class147(5);

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "[Lc;")
    public static class60[] field2857;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)I")
    public static final int method1141(int arg0, int arg1, int arg2) {
        ++field2855;
        class34 var3 = (class34) class91.field1475.method612((long) arg0, true);
        if (arg1 < 123) {
            return 124;
        } else if (var3 == null) {
            return 0;
        } else {
            return ~arg2 <= -1 && ~var3.field638.length < ~arg2 ? var3.field638[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field2864 = null;
        field2856 = null;
        field2868 = null;
        field2857 = null;
        if (arg0 != 4095) {
            field2864 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2870;
        if (!arg2) {
            this.field2872 = -125;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field2863 = arg1.method1593(arg2);
                        }
                    } else {
                        this.field2871 = arg1.method1593(true);
                    }
                } else {
                    this.field2872 = arg1.method1580(-26);
                }
            } else {
                this.field2859 = arg1.method1593(true);
            }
        } else {
            this.field2867 = arg1.method1580(-8);
        }
    }

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 == -1) {
            ++field2862;
            class127.method862(7332);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1143(boolean arg0, int arg1) {
        ++field2865;
        if (class92.field1509 == arg1) {
            class163.field2764 = true;
            ++class92.field1509;
            if (class92.field1509 > 65535) {
                class92.field1509 = 0;
            }
            return true;
        } else {
            if (!arg0) {
                field2856 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "(I)V")
    public static final void method1144(int arg0) {
        ++field2866;
        if (arg0 != -1001) {
            field2856 = null;
        }
        if (~class47.field836 == -31) {
            class188.method1293(25, -30211);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field2860;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int var4 = this.field2863 >> 1;
            int[][] var5 = super.field2064.method376((byte) 105);
            Random var6 = new Random((long) this.field2867);
            for (int var7 = 0; ~this.field2859 < ~var7; ++var7) {
                int var8 = this.field2863 <= 0 ? this.field2871 : this.field2871 + (class172.method1156(var6, Integer.MIN_VALUE, this.field2863) - var4);
                int var9 = var8 >> 4 & 255;
                int var10 = class172.method1156(var6, Integer.MIN_VALUE, class64.field1132);
                int var11 = class172.method1156(var6, Integer.MIN_VALUE, class87.field1423);
                int var12 = (class150.field2582[var9] * this.field2872 >> 12) + var10;
                int var13 = var11 - -(class20.field281[var9] * this.field2872 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var11;
                        var11 = var13;
                        var13 = var19;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class172.method1156(var6, Integer.MIN_VALUE, 4096) >> 2);
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var24 += var23;
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class8.field82 & var28;
                        int var31 = class181.field3119 & var21;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return arg0 < 68 ? null : var3;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        class52.method353((byte) 11);
        class74.method479(false);
        ++field2869;
        class143.method941(36);
        class219.method1485(true);
        class150.method1020((byte) -69);
        class262.method1801((byte) -123);
        class265.method1819(-17169);
        class199.method1393((byte) 85);
        class173.method1163(-1);
        class1.method2((byte) -126);
        class50.method335(true);
        class92.method560((byte) -122);
        class20.method149(-1);
        class110.method711(0);
        ((class192) class15.field199).method1367((byte) 57);
        class265.field4688.method440((byte) 56);
        class27.field396.method821((byte) -124);
        class68.field1188.method821((byte) -123);
        class37.field683.method821((byte) -125);
        class137.field2303.method821((byte) -123);
        class273.field4834.method821((byte) -128);
        int var1 = 63 % ((-37 - arg0) / 39);
        class102.field1653.method821((byte) -124);
        class200.field3581.method821((byte) -128);
        class215.field3792.method821((byte) -124);
        class245.field4359.method821((byte) -125);
        class28.field409.method821((byte) -128);
        class152.field2604.method821((byte) -128);
        class201.field3609.method992(-31);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class49.field871[var12][var31] = 0;
                class111.field1861[var12][var31] = 99999999;
            }
        }
        if (arg7 > -3) {
            method1145((byte) -53);
        }
        ++field2858;
        class49.field871[arg10][arg0] = 99;
        int var13 = arg10;
        class111.field1861[arg10][arg0] = 0;
        int var14 = arg0;
        byte var15 = 0;
        int var16 = 0;
        class19.field256[var15] = arg10;
        int var32 = var15 + 1;
        class196.field3502[var15] = arg0;
        boolean var17 = false;
        int[][] var18 = class82.field1383[class261.field4598].field3873;
        while (var32 != var16) {
            var14 = class196.field3502[var16];
            var13 = class19.field256[var16];
            var16 = 4095 & var16 + 1;
            if (arg1 == var13 && ~arg4 == ~var14) {
                var17 = true;
                break;
            }
            if (~arg9 != -1) {
                if ((arg9 < 5 || arg9 == 10) && class82.field1383[class261.field4598].method1496(arg3, arg4, arg1, var14, var13, 2, arg9 + -1, -5591)) {
                    var17 = true;
                    break;
                }
                if (~arg9 > -11 && class82.field1383[class261.field4598].method1501(19661064, var13, 2, arg1, arg9 + -1, arg4, arg3, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg2 != -1 && arg5 != 0 && class82.field1383[class261.field4598].method1498(var13, -1, 2, var14, arg5, arg1, arg4, arg2, arg6)) {
                var17 = true;
                break;
            }
            int var30 = class111.field1861[var13][var14] - -1;
            if (~var13 < -1 && class49.field871[var13 + -1][var14] == 0 && ~(var18[var13 + -1][var14] & 19661070) == -1 && (19661112 & var18[var13 - 1][var14 + 1]) == 0) {
                class19.field256[var32] = var13 + -1;
                class196.field3502[var32] = var14;
                var32 = 4095 & var32 + 1;
                class49.field871[var13 + -1][var14] = 2;
                class111.field1861[var13 + -1][var14] = var30;
            }
            if (~var13 > -103 && class49.field871[var13 + 1][var14] == 0 && (19661187 & var18[var13 + 2][var14]) == 0 && (19661280 & var18[var13 + 2][var14 + 1]) == 0) {
                class19.field256[var32] = var13 + 1;
                class196.field3502[var32] = var14;
                var32 = var32 - -1 & 4095;
                class49.field871[var13 + 1][var14] = 8;
                class111.field1861[var13 + 1][var14] = var30;
            }
            if (~var14 < -1 && ~class49.field871[var13][var14 + -1] == -1 && ~(var18[var13][var14 + -1] & 19661070) == -1 && (var18[var13 - -1][var14 + -1] & 19661187) == 0) {
                class19.field256[var32] = var13;
                class196.field3502[var32] = var14 + -1;
                var32 = 4095 & var32 + 1;
                class49.field871[var13][var14 + -1] = 1;
                class111.field1861[var13][var14 + -1] = var30;
            }
            if (var14 < 102 && class49.field871[var13][var14 + 1] == 0 && ~(var18[var13][var14 + 2] & 19661112) == -1 && (var18[var13 + 1][var14 + 2] & 19661280) == 0) {
                class19.field256[var32] = var13;
                class196.field3502[var32] = var14 + 1;
                class49.field871[var13][var14 + 1] = 4;
                class111.field1861[var13][var14 + 1] = var30;
                var32 = var32 - -1 & 4095;
            }
            if (var13 > 0 && var14 > 0 && class49.field871[var13 + -1][var14 + -1] == 0 && ~(var18[var13 + -1][var14] & 19661112) == -1 && ~(19661070 & var18[var13 + -1][var14 - 1]) == -1 && ~(19661187 & var18[var13][var14 + -1]) == -1) {
                class19.field256[var32] = var13 + -1;
                class196.field3502[var32] = var14 + -1;
                var32 = var32 - -1 & 4095;
                class49.field871[var13 - 1][var14 - 1] = 3;
                class111.field1861[var13 - 1][var14 - 1] = var30;
            }
            if (~var13 > -103 && ~var14 < -1 && ~class49.field871[var13 + 1][var14 + -1] == -1 && ~(var18[var13 + 1][var14 + -1] & 19661070) == -1 && ~(var18[var13 + 2][var14 + -1] & 19661187) == -1 && (19661280 & var18[var13 + 2][var14]) == 0) {
                class19.field256[var32] = var13 - -1;
                class196.field3502[var32] = var14 + -1;
                var32 = 4095 & var32 + 1;
                class49.field871[var13 + 1][var14 - 1] = 9;
                class111.field1861[var13 + 1][var14 + -1] = var30;
            }
            if (var13 > 0 && ~var14 > -103 && class49.field871[var13 - 1][var14 + 1] == 0 && (var18[var13 + -1][var14 + 1] & 19661070) == 0 && (var18[var13 + -1][var14 + 2] & 19661112) == 0 && ~(var18[var13][var14 - -2] & 19661280) == -1) {
                class19.field256[var32] = var13 + -1;
                class196.field3502[var32] = var14 - -1;
                class49.field871[var13 - 1][var14 + 1] = 6;
                class111.field1861[var13 + -1][var14 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (~var13 > -103 && ~var14 > -103 && class49.field871[var13 + 1][var14 + 1] == 0 && ~(var18[var13 + 1][var14 - -2] & 19661112) == -1 && ~(var18[var13 + 2][var14 + 2] & 19661280) == -1 && (var18[var13 - -2][var14 - -1] & 19661187) == 0) {
                class19.field256[var32] = var13 + 1;
                class196.field3502[var32] = var14 - -1;
                class49.field871[var13 + 1][var14 + 1] = 12;
                var32 = 4095 & var32 + 1;
                class111.field1861[var13 + 1][var14 - -1] = var30;
            }
        }
        class45.field809 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = -var21 + arg1; arg1 + var21 >= var22; ++var22) {
                for (int var23 = arg4 - var21; var23 <= arg4 + var21; ++var23) {
                    if (~var22 <= -1 && var23 >= 0 && ~var22 > -105 && ~var23 > -105 && ~class111.field1861[var22][var23] > -101) {
                        int var24 = 0;
                        if (var22 >= arg1) {
                            if (~(arg2 + -1 + arg1) > ~var22) {
                                var24 = var22 - (arg1 - (-arg2 + 1));
                            }
                        } else {
                            var24 = arg1 - var22;
                        }
                        int var25 = 0;
                        if (~arg4 >= ~var23) {
                            if (arg4 - 1 + arg5 < var23) {
                                var25 = -arg4 + 1 + var23 + -arg5;
                            }
                        } else {
                            var25 = arg4 - var23;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var26 > ~var19 || ~var19 == ~var26 && var20 > class111.field1861[var22][var23]) {
                            var14 = var23;
                            var19 = var26;
                            var20 = class111.field1861[var22][var23];
                            var13 = var22;
                        }
                    }
                }
            }
            if (~var19 == -1001) {
                return false;
            }
            if (arg10 == var13 && arg0 == var14) {
                return false;
            }
            class45.field809 = 1;
        }
        byte var27 = 0;
        class19.field256[var27] = var13;
        int var33 = var27 + 1;
        class196.field3502[var27] = var14;
        int var28;
        int var29 = var28 = class49.field871[var13][var14];
        while (arg10 != var13 || ~arg0 != ~var14) {
            if (~var28 != ~var29) {
                class19.field256[var33] = var13;
                var28 = var29;
                class196.field3502[var33++] = var14;
            }
            if ((var29 & 1) == 0) {
                if ((4 & var29) != 0) {
                    --var14;
                }
            } else {
                ++var14;
            }
            if ((var29 & 2) == 0) {
                if (~(var29 & 8) != -1) {
                    --var13;
                }
            } else {
                ++var13;
            }
            var29 = class49.field871[var13][var14];
        }
        if (var33 > 0) {
            class17.method130(var33, arg11, 82);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
