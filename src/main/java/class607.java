import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class607 extends class60 {

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Lmja;")
    public static class441 field8171 = new class441("game4", "Game 4", 3);

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Luda;")
    public static class476 field8173;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)V", line = 4)
    public final void method407(byte arg0, int arg1) {
        int var3 = -66 / ((28 - arg0) / 50);
        ++field8176;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;IIIIBII[[[BIIII)V", line = 16)
    public static final void method3448(class66 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, byte[][][] arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field8170;
        if (arg9 != 0 && ~arg4 != -1) {
            if (arg5 > 21) {
                if (~arg9 == -10) {
                    arg9 = 1;
                    arg2 = arg2 + 1 & 3;
                }
                if (arg9 == 10) {
                    arg9 = 1;
                    arg2 = arg2 - -3 & 3;
                }
                if (~arg9 == -12) {
                    arg9 = 8;
                    arg2 = 3 & arg2 + 3;
                }
                arg0.method553(arg7, arg10, arg6, arg11, arg12, arg3, arg8[arg9 + -1][arg2], arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lhd;)V", line = 48)
    public class607(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILhd;)V", line = 51)
    public class607(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 54)
    public final void method409(byte arg0) {
        ++field8167;
        if (super.field798.method4292(-4152) == class359.field4463) {
            if (super.field798.method4287((byte) 100)) {
                super.field799 = 0;
            }
        } else {
            super.field799 = 1;
        }
        if (super.field799 != 0 && ~super.field799 != -2) {
            super.field799 = this.method405(false);
        }
        if (arg0 >= -27) {
            field8171 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBI)V", line = 76)
    public static final void method3449(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field8175;
        int var5 = -81 % ((29 - arg3) / 52);
        if (~class471.field6572 >= ~(-arg4 + arg2) && ~(arg2 - -arg4) >= ~class223.field2604 && -arg4 + arg1 >= class187.field2268 && ~(arg1 + arg4) >= ~class461.field6480) {
            class269.method1591(arg4, arg2, arg1, arg0, (byte) 30);
        } else {
            class200.method1298(arg0, arg2, false, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I", line = 93)
    public final int method406(int arg0, int arg1) {
        ++field8172;
        if (super.field798.method4287((byte) 55)) {
            return 3;
        } else {
            if (arg0 != 0) {
                field8171 = null;
            }
            if (super.field798.method4292(-4152) == class359.field4463) {
                if (~arg1 == -1) {
                    if (~super.field798.field10657.method3370(arg0) == -2) {
                        return 2;
                    }
                    if (super.field798.field10641.method1572(0) == 1) {
                        return 2;
                    }
                    if (super.field798.field10675.method4155(0) > 0) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V", line = 129)
    public static void method3450(byte arg0) {
        field8173 = null;
        int var1 = -118 / ((-21 - arg0) / 62);
        field8171 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I", line = 143)
    public final int method405(boolean arg0) {
        if (arg0) {
            return 63;
        } else {
            ++field8169;
            return 1;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I", line = 157)
    public final int method3451(int arg0) {
        ++field8168;
        if (arg0 != 0) {
            field8173 = null;
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z", line = 170)
    public final boolean method3452(byte arg0) {
        ++field8174;
        if (super.field798.method4287((byte) 53)) {
            return false;
        } else {
            if (arg0 > -61) {
                this.method406(-57, -8);
            }
            return super.field798.method4292(-4152) == class359.field4463;
        }
    }
}
