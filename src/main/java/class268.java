import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class268 extends class115 {

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    private int field4201 = 4096;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Z")
    public static boolean field4194 = false;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Z")
    public static boolean field4204 = false;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Lqd;")
    public static class37 field4193 = new class37(4);

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[I")
    public static int[] field4192;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "[Lqe;")
    public static class162[] field4197;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILbd;III)V")
    public static final void method1791(int arg0, class271 arg1, int arg2, int arg3, int arg4) {
        ++field4202;
        if (~class283.field4508 > -401) {
            if (arg1.field4291 != null) {
                arg1 = arg1.method1812(0);
            }
            if (arg1 != null) {
                if (arg1.field4240) {
                    if (arg4 != 4) {
                        field4192 = null;
                    }
                    String var5 = arg1.field4300;
                    if (arg1.field4281 != 0) {
                        String var6 = class69.field1076 == 1 ? class75.field1169 : class182.field2603;
                        var5 = var5 + class155.method1048(class55.field847.field764, arg1.field4281, -84) + " (" + var6 + arg1.field4281 + ")";
                    }
                    if (class204.field2963 == 1) {
                        ++class274.field4397;
                        class180.method1167(class240.field3609, class207.field3002 + " -> <col=ffff00>" + var5, class269.field4217, arg3, (short) 8, (long) arg0, -25, arg2);
                    } else if (!class275.field4406) {
                        ++class263.field3954;
                        String[] var7 = arg1.field4261;
                        if (class100.field1488) {
                            var7 = class170.method1121(var7, (byte) 113);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; ~var8 <= -1; --var8) {
                                if (var7[var8] != null && (class69.field1076 != 0 || !var7[var8].equalsIgnoreCase(class1.field16))) {
                                    ++class212.field3047;
                                    int var9 = -1;
                                    if (~arg1.field4294 == ~var8) {
                                        var9 = arg1.field4288;
                                    }
                                    byte var10 = 0;
                                    if (arg1.field4295 == var8) {
                                        var9 = arg1.field4290;
                                    }
                                    if (var8 == 0) {
                                        var10 = 12;
                                    }
                                    if (~var8 == -2) {
                                        var10 = 7;
                                    }
                                    if (var8 == 2) {
                                        var10 = 58;
                                    }
                                    if (~var8 == -4) {
                                        var10 = 59;
                                    }
                                    if (var8 == 4) {
                                        var10 = 24;
                                    }
                                    class180.method1167(var7[var8], "<col=ffff00>" + var5, var9, arg3, var10, (long) arg0, -56, arg2);
                                }
                            }
                        }
                        if (~class69.field1076 == -1 && var7 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class1.field16)) {
                                    ++class156.field2281;
                                    short var12 = 0;
                                    if (~arg1.field4281 < ~class55.field847.field764) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (var11 == 0) {
                                        var13 = 12;
                                    }
                                    if (~var11 == -2) {
                                        var13 = 7;
                                    }
                                    if (~var11 == -3) {
                                        var13 = 58;
                                    }
                                    if (~var11 == -4) {
                                        var13 = 59;
                                    }
                                    if (var11 == 4) {
                                        var13 = 24;
                                    }
                                    if (~var13 != -1) {
                                        var13 += var12;
                                    }
                                    class180.method1167(var7[var11], "<col=ffff00>" + var5, arg1.field4282, arg3, var13, (long) arg0, arg4 + -54, arg2);
                                }
                            }
                        }
                        class180.method1167(class55.field830, "<col=ffff00>" + var5, class206.field2976, arg3, (short) 1004, (long) arg0, -17, arg2);
                    } else {
                        class228 var14 = ~class67.field1043 == 0 ? null : class102.method678((byte) 24, class67.field1043);
                        if (~(class136.field1970 & 2) != -1) {
                            if (var14 == null || arg1.method1817(arg4 + 120, class67.field1043, var14.field3410) != var14.field3410) {
                                ++class129.field1886;
                                class180.method1167(class214.field3087, class14.field214 + " -> <col=ffff00>" + var5, class255.field3866, arg3, (short) 36, (long) arg0, 123, arg2);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        field4197 = null;
        field4192 = null;
        if (arg0 != 107) {
            field4204 = false;
        }
        field4193 = null;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
    public static final void method1793(int arg0) {
        ++field4199;
        int var1 = class68.field1071.method531((byte) 2, arg0);
        if (class193.field2770 > var1) {
            for (int var2 = var1; var2 < class193.field2770; ++var2) {
                class193.field2758[class153.field2230++] = class110.field1589[var2];
            }
        }
        if (var1 > class193.field2770) {
            throw new RuntimeException("gppov1");
        } else {
            class193.field2770 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class110.field1589[var3];
                class53 var5 = class194.field2777[var4];
                int var6 = class68.field1071.method531((byte) -128, 1);
                if (~var6 == -1) {
                    class110.field1589[class193.field2770++] = var4;
                    var5.field85 = class82.field1267;
                } else {
                    int var7 = class68.field1071.method531((byte) 54, 2);
                    if (~var7 == -1) {
                        class110.field1589[class193.field2770++] = var4;
                        var5.field85 = class82.field1267;
                        class60.field909[class282.field4501++] = var4;
                    } else if (var7 == 1) {
                        class110.field1589[class193.field2770++] = var4;
                        var5.field85 = class82.field1267;
                        int var8 = class68.field1071.method531((byte) -126, 3);
                        var5.method68(var8, 1, true);
                        int var9 = class68.field1071.method531((byte) -127, 1);
                        if (var9 == 1) {
                            class60.field909[class282.field4501++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class110.field1589[class193.field2770++] = var4;
                        var5.field85 = class82.field1267;
                        if (class68.field1071.method531((byte) -8, 1) == 1) {
                            int var10 = class68.field1071.method531((byte) 2, 3);
                            var5.method68(var10, 2, true);
                            int var11 = class68.field1071.method531((byte) -128, 3);
                            var5.method68(var11, 2, true);
                        } else {
                            int var12 = class68.field1071.method531((byte) -125, 3);
                            var5.method68(var12, 0, true);
                        }
                        int var13 = class68.field1071.method531((byte) -126, 1);
                        if (~var13 == -2) {
                            class60.field909[class282.field4501++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class193.field2758[class153.field2230++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(III)I")
    public static final int method1794(int arg0, int arg1, int arg2) {
        if (~arg1 > ~arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        ++field4198;
        if (arg0 != -28024) {
            method1794(-74, 11, -87);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field4200;
        if (arg0 != 242152972) {
            method1792((byte) -115);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1 + -1 & class5.field136, 114);
            int[] var5 = this.method797(0, arg1, -71);
            int[] var6 = this.method797(0, class5.field136 & arg1 + 1, arg0 + -242152845);
            for (int var7 = 0; ~class77.field1178 < ~var7; ++var7) {
                int var8 = (var5[var7 + 1 & class207.field2992] + -var5[var7 + -1 & class207.field2992]) * this.field4201;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var6[var7] + -var4[var7]) * this.field4201;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var10 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field4195;
        if (~arg2 == arg0) {
            this.field4201 = arg1.method756(arg0 ^ 29900);
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(II)V")
    public static final void method1795(int arg0, int arg1) {
        ++field4196;
        int var2 = 47 % ((arg0 - 39) / 46);
        class270 var3 = class190.method1213(25702, arg1, 9);
        var3.method1806(-8173);
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
    public static final void method1796(int arg0) {
        class254.field3858.method260(arg0 + -19283);
        if (arg0 != 19283) {
            field4197 = null;
        }
        ++field4203;
        class283.field4513.method260(0);
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, true);
    }
}
