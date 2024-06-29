import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class65 extends class42 {

    @OriginalMember(owner = "client!fi", name = "Sb", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!fi", name = "bc", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!fi", name = "Wb", descriptor = "I")
    public static int field1073 = -1;

    @OriginalMember(owner = "client!fi", name = "hc", descriptor = "Lmb;")
    private static class132 field1084 = class166.method1092("Please remove ", 125);

    @OriginalMember(owner = "client!fi", name = "dc", descriptor = "I")
    public static volatile int field1080 = -1;

    @OriginalMember(owner = "client!fi", name = "fc", descriptor = "Lmb;")
    public static class132 field1082 = field1084;

    @OriginalMember(owner = "client!fi", name = "cc", descriptor = "Lmb;")
    public static class132 field1079 = field1084;

    @OriginalMember(owner = "client!fi", name = "Ob", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!fi", name = "Pb", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!fi", name = "Qb", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!fi", name = "Tb", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!fi", name = "Xb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!fi", name = "Zb", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!fi", name = "ac", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fi", name = "ec", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!fi", name = "gc", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fi", name = "Rb", descriptor = "Loc;")
    public static class155 field1068;

    @OriginalMember(owner = "client!fi", name = "Vb", descriptor = "Lra;")
    public class185 field1072;

    @OriginalMember(owner = "client!fi", name = "Ub", descriptor = "[Lrd;")
    public static class188[] field1071;

    @OriginalMember(owner = "client!fi", name = "Yb", descriptor = "[[I")
    public static int[][] field1075;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1083;
        if (this.field1072 != null) {
            class236 var11 = super.field695 != -1 && super.field713 == 0 ? class99.method619(super.field695, 4) : null;
            class236 var12 = ~super.field737 == 0 || super.field737 == super.field715 && var11 != null ? null : class99.method619(super.field737, 4);
            class221 var13 = this.field1072.method1182(super.field693, var11, (byte) 49, super.field699, var12);
            if (var13 != null) {
                super.field733 = var13.method55();
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                if (this.field1072.field3402 != 0 && ~this.field1072.field3411 != -1) {
                    int var17 = class50.field851[arg0];
                    int var18 = class50.field853[arg0];
                    short var19 = this.field1072.field3411;
                    short var20 = this.field1072.field3402;
                    int var21 = -var20 / 2;
                    int var22 = var20 / 2;
                    int var23 = -var19 / 2;
                    int var24 = -var19 / 2;
                    int var25 = var17 * var24 + -(var18 * var22) >> 16;
                    int var26 = var17 * var23 + -(var18 * var21) >> 16;
                    int var27 = var17 * var21 + var18 * var23 >> 16;
                    int var28 = var18 * var24 - -(var17 * var22) >> 16;
                    int var29 = class195.method1239(super.field723 + var26, class139.field2615, false, super.field673 + var27);
                    int var30 = class195.method1239(super.field723 + var25, class139.field2615, false, super.field673 - -var28);
                    int var31 = -var20 / 2;
                    int var32 = var19 / 2;
                    int var33 = var17 * var32 - var18 * var31 >> 16;
                    int var34 = var19 / 2;
                    int var35 = var20 / 2;
                    int var36 = var18 * var32 - -(var17 * var31) >> 16;
                    int var37 = class195.method1239(super.field723 + var33, class139.field2615, false, super.field673 + var36);
                    int var38 = var17 * var34 + -(var18 * var35) >> 16;
                    int var39 = var18 * var34 - -(var17 * var35) >> 16;
                    int var40 = var29 >= var30 ? var30 : var29;
                    int var41 = class195.method1239(super.field723 + var38, class139.field2615, false, super.field673 + var39);
                    int var42 = var29 + var41;
                    int var43 = ~var37 > ~var41 ? var37 : var41;
                    var14 = 2047 & (int) (325.95D * Math.atan2((double) (-var43 + var40), (double) var19));
                    if (~var14 != -1) {
                        var13.method1389(var14);
                    }
                    int var44 = var30 < var41 ? var30 : var41;
                    int var45 = var37 <= var29 ? var37 : var29;
                    if (~(var30 + var37) > ~var42) {
                        var42 = var30 + var37;
                    }
                    var15 = (int) (Math.atan2((double) (-var44 + var45), (double) var20) * 325.95D) & 2047;
                    if (var15 != 0) {
                        var13.method1375(var15);
                    }
                    var16 = (var42 >> 1) + -super.field719;
                    if (var16 != 0) {
                        var13.method1376(0, var16, 0);
                    }
                }
                class221 var46 = null;
                if (~super.field731 != 0 && super.field740 != -1) {
                    class217 var47 = class108.method689(super.field731, 1);
                    var46 = var47.method1353((byte) 73, super.field740);
                    if (var46 != null) {
                        var46.method1376(0, -super.field717, 0);
                        if (var47.field3968) {
                            if (~var14 != -1) {
                                var46.method1389(var14);
                            }
                            if (var15 != 0) {
                                var46.method1375(var15);
                            }
                            if (~var16 != -1) {
                                var46.method1376(0, var16, 0);
                            }
                        }
                    }
                }
                if (var46 != null) {
                    var13 = ((class242) var13).method1540(var46);
                }
                if (~this.field1072.field3422 == -2) {
                    var13.field4025 = true;
                }
                var13.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
    public final boolean method291(int arg0) {
        if (arg0 <= 2) {
            field1069 = 74;
        }
        ++field1081;
        return this.field1072 != null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static final void method407(boolean arg0) {
        if (class22.field319 > 0) {
            for (int var1 = 0; ~var1 > -257; ++var1) {
                if (~class22.field319 >= -769) {
                    if (class22.field319 > 256) {
                        class157.field2857[var1] = class9.field93[var1];
                    } else {
                        class157.field2857[var1] = class35.method253(-class22.field319 + 256, class9.field93[var1], (byte) 31, class86.field1500[var1]);
                    }
                } else {
                    class157.field2857[var1] = class35.method253(-class22.field319 + 1024, class86.field1500[var1], (byte) 31, class9.field93[var1]);
                }
            }
        } else if (class241.field4326 <= 0) {
            for (int var2 = 0; ~var2 > -257; ++var2) {
                class157.field2857[var2] = class86.field1500[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (class241.field4326 <= 768) {
                    if (~class241.field4326 < -257) {
                        class157.field2857[var3] = class181.field3332[var3];
                    } else {
                        class157.field2857[var3] = class35.method253(256 - class241.field4326, class181.field3332[var3], (byte) 31, class86.field1500[var3]);
                    }
                } else {
                    class157.field2857[var3] = class35.method253(-class241.field4326 + 1024, class86.field1500[var3], (byte) 31, class181.field3332[var3]);
                }
            }
        }
        short var4 = 256;
        ++field1066;
        int var5 = 0;
        int var6 = class47.field810.field4207 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var4 - 1; ++var8) {
            int var21 = (-var8 + var4) * class9.field99[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; ++var22) {
                int var24 = class93.field1633[var5++];
                int var25 = class47.field810.field263[var6++];
                if (var24 != 0) {
                    int var26 = -var24 + 256;
                    int var28 = class157.field2857[var24];
                    class6.field58.field263[var7++] = class75.method450(-16711936, var24 * class75.method450(var28, 16711935) - -(class75.method450(16711935, var25) * var26)) + class75.method450(16711680, class75.method450(var28, 65280) * var24 - -(var26 * class75.method450(var25, 65280))) >> 8;
                } else {
                    class6.field58.field263[var7++] = var25;
                }
            }
            for (int var23 = 0; var21 > var23; ++var23) {
                class6.field58.field263[var7++] = class47.field810.field263[var6++];
            }
            var6 += class47.field810.field4207 + -128;
        }
        int var9 = 0;
        if (!arg0) {
            method408(35, -77, -102);
        }
        int var10 = 0;
        class6.field58.method106(0, 9);
        int var11 = class47.field810.field4207 * 9 + 128;
        for (int var12 = 1; ~(var4 + -1) < ~var12; ++var12) {
            int var13 = (-var12 + var4) * class9.field99[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; ~var13 < ~var14; ++var14) {
                int var10001 = var9++;
                --var11;
                class62.field1038.field263[var10001] = class47.field810.field263[var11];
            }
            for (int var15 = var13; ~var15 > -129; ++var15) {
                int var16 = class93.field1633[var10++];
                --var11;
                int var17 = class47.field810.field263[var11];
                if (var16 == 0) {
                    class62.field1038.field263[var9++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class157.field2857[var16];
                    class62.field1038.field263[var9++] = class75.method450(var16 * class75.method450(var20, 65280) + var19 * class75.method450(var17, 65280), 16711680) + class75.method450(var16 * class75.method450(var20, 16711935) + class75.method450(16711935, var17) * var19, -16711936) >> 8;
                }
            }
            var11 += class47.field810.field4207 - -128;
            var10 += var13;
        }
        class62.field1038.method106(637, 9);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)J")
    public static final long method408(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 != null && var3.field3100 != null ? var3.field3100.field210 : 0L;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method55() {
        ++field1067;
        return super.field733;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
    public static final void method409(byte arg0) {
        ++field1074;
        int var1 = (class210.field3854.field723 >> 7) - -class168.field3082;
        class27.field444 = 0;
        int var2 = (class210.field3854.field673 >> 7) + class129.field2389;
        if (var2 >= 3053 && var2 <= 3156 && ~var1 <= -3057 && ~var1 >= -3137) {
            class27.field444 = 1;
        }
        if (~var2 <= -3073 && var2 <= 3118 && ~var1 <= -9493 && ~var1 >= -9536) {
            class27.field444 = 1;
        }
        int var3 = -60 % ((arg0 - 46) / 60);
        if (~class27.field444 == -2 && ~var2 <= -3140 && var2 <= 3199 && ~var1 <= -3009 && var1 <= 3062) {
            class27.field444 = 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static void method410(byte arg0) {
        field1075 = null;
        field1068 = null;
        int var1 = -96 / ((-52 - arg0) / 48);
        field1082 = null;
        field1079 = null;
        field1071 = null;
        field1084 = null;
    }
}
