import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class598 extends class260 {

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field8138 = -1;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Laj;")
    public static class333 field8141;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "Ljw;")
    public static class581 field8147;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)I", line = 7)
    public final int method4(int arg0, byte arg1) {
        ++field8137;
        int var3 = 104 / ((arg1 - -53) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V", line = 17)
    public static void method3324(byte arg0) {
        field8147 = null;
        field8141 = null;
        int var1 = -40 / ((arg0 - -9) / 54);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([IB[J)V", line = 29)
    public static final void method3325(int[] arg0, byte arg1, long[] arg2) {
        ++field8136;
        class30.method217(arg0, 0, arg2.length + -1, arg2, (byte) 8);
        if (arg1 != -68) {
            method3324((byte) 28);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lfca;)V", line = 43)
    public class598(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILfca;)V", line = 46)
    public class598(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IB)V", line = 53)
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            ++field8144;
            super.field3868 = arg0;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I", line = 64)
    public final int method8(byte arg0) {
        ++field8145;
        if (arg0 != 4) {
            field8148 = 124;
        }
        return 1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BILbba;II)V", line = 75)
    public static final void method3326(byte arg0, int arg1, class124 arg2, int arg3, int arg4) {
        ++field8142;
        class208 var5 = arg2.method1014((byte) -34);
        if (arg0 != 69) {
            method3324((byte) 114);
        }
        int var6 = 16383 & -arg2.field1860.field9955 + arg2.field1864;
        if (~arg3 == 0) {
            if (~var6 == -1 && ~arg2.field1804 >= -26) {
                if (!arg2.field1826 || !var5.method1383((byte) 60, arg2.field1794)) {
                    arg2.field1794 = var5.method1388((byte) -76);
                    arg2.field1826 = arg2.field1794 != -1;
                }
            } else {
                if (~arg1 > -1 && ~var5.field2735 != 0) {
                    arg2.field1826 = false;
                    arg2.field1794 = var5.field2735;
                } else if (~arg1 < -1 && var5.field2753 != -1) {
                    arg2.field1794 = var5.field2753;
                } else {
                    arg2.field1794 = var5.field2719;
                }
                arg2.field1826 = false;
            }
        } else if (arg2.field1787 == -1 || ~var6 > -10241 && var6 > 2048) {
            if (~var6 == -1 && arg2.field1804 <= 25) {
                arg2.field1826 = false;
                if (arg3 == 2 && var5.field2765 != -1) {
                    arg2.field1794 = var5.field2765;
                } else if (~arg3 == -1 && ~var5.field2716 != 0) {
                    arg2.field1794 = var5.field2716;
                } else {
                    arg2.field1794 = var5.field2719;
                }
            } else {
                arg2.field1826 = false;
                if (~arg3 == -3 && var5.field2765 != -1) {
                    if (~arg1 > -1 && var5.field2741 != -1) {
                        arg2.field1794 = var5.field2741;
                    } else if (~arg1 < -1 && var5.field2756 != -1) {
                        arg2.field1794 = var5.field2756;
                    } else {
                        arg2.field1794 = var5.field2765;
                    }
                } else if (~arg3 == -1 && ~var5.field2716 != 0) {
                    if (~arg1 > -1 && var5.field2742 != -1) {
                        arg2.field1794 = var5.field2742;
                    } else if (arg1 > 0 && var5.field2758 != -1) {
                        arg2.field1794 = var5.field2758;
                    } else {
                        arg2.field1794 = var5.field2716;
                    }
                } else if (~arg1 > -1 && var5.field2736 != -1) {
                    arg2.field1794 = var5.field2736;
                } else if (arg1 > 0 && ~var5.field2755 != 0) {
                    arg2.field1794 = var5.field2755;
                } else {
                    arg2.field1794 = var5.field2719;
                }
            }
        } else {
            int var7 = 16383 & class195.field2611[arg4] - arg2.field1860.field9955;
            if (arg3 == 2 && ~var5.field2765 != 0) {
                if (var7 > 2048 && var7 <= 6144 && ~var5.field2737 != 0) {
                    arg2.field1794 = var5.field2737;
                } else if (~var7 <= -10241 && var7 < 14336 && ~var5.field2739 != 0) {
                    arg2.field1794 = var5.field2739;
                } else if (var7 > 6144 && var7 < 10240 && var5.field2744 != -1) {
                    arg2.field1794 = var5.field2744;
                } else {
                    arg2.field1794 = var5.field2765;
                }
            } else if (arg3 == 0 && ~var5.field2716 != 0) {
                if (var7 > 2048 && var7 <= 6144 && ~var5.field2729 != 0) {
                    arg2.field1794 = var5.field2729;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field2754 != -1) {
                    arg2.field1794 = var5.field2754;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field2727 != -1) {
                    arg2.field1794 = var5.field2727;
                } else {
                    arg2.field1794 = var5.field2716;
                }
            } else if (var7 > 2048 && var7 <= 6144 && ~var5.field2761 != 0) {
                arg2.field1794 = var5.field2761;
            } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field2731 != 0) {
                arg2.field1794 = var5.field2731;
            } else if (~var7 < -6145 && var7 < 10240 && ~var5.field2733 != 0) {
                arg2.field1794 = var5.field2733;
            } else {
                arg2.field1794 = var5.field2719;
            }
            arg2.field1826 = false;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 238)
    public final void method2(boolean arg0) {
        if (arg0) {
            field8148 = 97;
        }
        if (super.field3868 != 1 && ~super.field3868 != -1) {
            super.field3868 = this.method8((byte) 4);
        }
        ++field8143;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I", line = 260)
    public final int method3327(int arg0) {
        ++field8140;
        if (arg0 < 3) {
            field8148 = 53;
        }
        return super.field3868;
    }
}
