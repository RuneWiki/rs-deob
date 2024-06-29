import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class254 extends class260 {

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lbu;")
    public static class21 field3737 = new class21(47, 7);

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Loo;")
    public static class652 field3744 = new class652(3000000, 200);

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3745 = 2;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
    public static int[] field3746 = new int[8];

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "F")
    public static float field3740;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[[Lmea;")
    public static class451[][] field3741;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(ILgn;)V")
    public class254(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        ++field3743;
        if (arg1 != 122) {
            this.method123(-36);
        }
        super.field3828 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lgn;)V")
    public class254(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)Z")
    public final boolean method1658(int arg0) {
        if (arg0 <= 73) {
            return true;
        } else {
            ++field3733;
            int var2 = super.field3829.method4083(114).method2814(0);
            return ~var2 <= -97;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lha;ZI)V")
    public static final void method1659(class65 arg0, boolean arg1, int arg2) {
        ++field3742;
        if (class694.field9700 && class385.field5304) {
            if (class109.field1607) {
                class766.field10550 = class94.field1071.method1512(-97);
            }
            class211.field3269 = 0;
            class650.field9083 = 0;
            class612.field8598 = 0;
            int[] var3 = arg0.method510();
            class662.field9215 = (int) ((float) var3[3] / 3.0F);
            class348.field4874 = (int) ((float) var3[2] / 3.0F);
            arg0.method549(class585.field8273);
            if (~((int) ((float) class585.field8273[0] / 3.0F)) != ~class476.field6672 || ~((int) ((float) class585.field8273[1] / 3.0F)) != ~class215.field3323) {
                class476.field6672 = (int) ((float) class585.field8273[0] / 3.0F);
                class215.field3323 = (int) ((float) class585.field8273[1] / 3.0F);
                class284.field4195 = class215.field3323 >> 1;
                class244.field3631 = class476.field6672 >> 1;
                class485.field6828 = new int[class476.field6672 * class215.field3323];
            }
            class27.field400 = arg0.method440();
            class138.field2052 = 0;
            if (arg1) {
                field3737 = null;
            }
            for (int var4 = 0; var4 < class169.field2647; ++var4) {
                class139.method1006(arg0, class111.field1700[var4], -1, arg2);
            }
            for (int var5 = 0; ~class715.field9911 < ~var5; ++var5) {
                class139.method1006(arg0, class481.field6754[var5], -1, arg2);
            }
            for (int var6 = 0; ~var6 > ~class296.field4300; ++var6) {
                class139.method1006(arg0, class626.field8776[var6], -1, arg2);
            }
            class710.field9866 = 0;
            if (~class138.field2052 < -1) {
                int var7 = class485.field6828.length;
                int var8 = -var7 + var7 & 7;
                int var9 = 0;
                while (var8 > var9) {
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                }
                while (~var7 < ~var9) {
                    class485.field6828[var9++] = Integer.MAX_VALUE;
                }
                class561.field7974 = 1;
                for (int var10 = 0; var10 < class138.field2052; ++var10) {
                    class478 var11 = class335.field4721[var10];
                    class456.method2718(var11.field6719[0], var11.field6719[3], var11.field6713[3], var11.field6713[1], var11.field6719[1], var11.field6707[0], (byte) 36, var11.field6713[0], var11.field6707[1], var11.field6707[3]);
                    class456.method2718(var11.field6719[1], var11.field6719[3], var11.field6713[3], var11.field6713[2], var11.field6719[2], var11.field6707[1], (byte) 36, var11.field6713[1], var11.field6707[2], var11.field6707[3]);
                }
                class561.field7974 = 2;
            }
            if (class109.field1607) {
                class387.field5361 = class94.field1071.method1512(-118) - class766.field10550;
            }
        } else {
            class138.field2052 = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        ++field3739;
        return arg0 != 4377 ? -95 : 0;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
    public final int method1660(int arg0) {
        if (arg0 > -14) {
            method1661(70);
        }
        ++field3731;
        return super.field3828;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        ++field3735;
        if (arg0 != -1) {
            return 82;
        } else {
            int var3 = super.field3829.method4083(92).method2814(0);
            if (~var3 > -97) {
                return 3;
            } else if (~arg1 < -2 && var3 < 128) {
                return 3;
            } else {
                return arg1 > 3 && var3 < 192 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public static void method1661(int arg0) {
        field3741 = null;
        field3737 = null;
        field3744 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field3745 = -33;
        }
        field3746 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Leba;IIII)Z")
    public static final boolean method1662(class613 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3738;
        if (class694.field9700 && class385.field5304) {
            if (~class710.field9866 > -101) {
                return false;
            } else if (!class295.method1924(arg1, 1, arg4, arg3)) {
                return false;
            } else {
                int var5 = arg4 << class645.field9018;
                int var6 = arg1 << class645.field9018;
                if (arg2 >= -36) {
                    field3736 = 77;
                }
                int var7 = class208.field3219[arg3].method1904(arg1, (byte) 62, arg4) - 1;
                int var8 = var7 - -arg0.method916(true);
                if (~arg0.field8610 == -2) {
                    if (!class263.method1706(var8, class109.field1611 + var6, var8, var6, var5, var5, var7, -97, var6, var5)) {
                        return false;
                    } else if (!class263.method1706(var8, var6 - -class109.field1611, var7, var6, var5, var5, var7, -128, class109.field1611 + var6, var5)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (~arg0.field8610 == -3) {
                    if (!class263.method1706(var8, class109.field1611 + var6, var8, var6 - -class109.field1611, var5, var5 - -class109.field1611, var7, -47, class109.field1611 + var6, var5)) {
                        return false;
                    } else if (!class263.method1706(var7, class109.field1611 + var6, var8, class109.field1611 + var6, var5, class109.field1611 + var5, var7, -101, class109.field1611 + var6, class109.field1611 + var5)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (~arg0.field8610 == -5) {
                    if (!class263.method1706(var8, class109.field1611 + var6, var8, var6, class109.field1611 + var5, class109.field1611 + var5, var7, -34, var6, class109.field1611 + var5)) {
                        return false;
                    } else if (!class263.method1706(var8, class109.field1611 + var6, var7, var6, class109.field1611 + var5, class109.field1611 + var5, var7, -50, class109.field1611 + var6, class109.field1611 + var5)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (arg0.field8610 == 8) {
                    if (!class263.method1706(var8, var6, var8, var6, var5, var5 - -class109.field1611, var7, -43, var6, var5)) {
                        return false;
                    } else if (!class263.method1706(var7, var6, var8, var6, var5, class109.field1611 + var5, var7, -98, var6, var5 - -class109.field1611)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (~arg0.field8610 == -17) {
                    if (!class663.method3780(class556.field7931, var7, var5, class556.field7931, (byte) 94, class556.field7931 + var6, var8)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (arg0.field8610 == 32) {
                    if (!class663.method3780(class556.field7931, var7, class556.field7931 + var5, class556.field7931, (byte) 66, var6 - -class556.field7931, var8)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (arg0.field8610 == 64) {
                    if (!class663.method3780(class556.field7931, var7, var5 - -class556.field7931, class556.field7931, (byte) 76, var6, var8)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else if (~arg0.field8610 == -129) {
                    if (!class663.method3780(class556.field7931, var7, var5, class556.field7931, (byte) 98, var6, var8)) {
                        return false;
                    } else {
                        ++class612.field8598;
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        ++field3734;
        int var2 = super.field3829.method4083(87).method2814(0);
        if (~var2 > -97) {
            super.field3828 = 0;
        }
        if (super.field3828 > 1 && var2 < 128) {
            super.field3828 = 1;
        }
        if (super.field3828 > 2 && ~var2 > -193) {
            super.field3828 = 2;
        }
        if (arg0 > 102) {
            if (super.field3828 < 0 || ~super.field3828 < -4) {
                super.field3828 = this.method123(4377);
            }
        }
    }
}
