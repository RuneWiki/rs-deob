import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class562 extends class322 {

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field7886 = -1;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "[[I")
    public static int[][] field7890 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I", line = 3)
    public final int method19(int arg0, int arg1) {
        ++field7884;
        if (~arg0 != -1 && super.field4450.field6546.method1308(false) != 1) {
            return arg1 <= 10 ? -42 : 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[[[BIILha;IIIIZII)V", line = 19)
    public static final void method3235(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, class58 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12) {
        ++field7888;
        if (arg3 != 0 && arg4 != 0) {
            if (arg3 == 9) {
                arg3 = 1;
                arg12 = 3 & arg12 + 1;
            }
            if (arg3 == 10) {
                arg12 = arg12 + 3 & 3;
                arg3 = 1;
            }
            if (~arg3 == -12) {
                arg12 = arg12 + 3 & 3;
                arg3 = 8;
            }
            arg5.method488(arg0, arg11, arg8, arg1, arg9, arg6, arg2[arg3 + -1][arg12], arg4, arg7);
            if (!arg10) {
                method3238(-43);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method3236(int arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            field7886 = 58;
        }
        ++field7887;
        return class243.method1550(8, arg1, arg0) & class722.method4053(arg0, false, arg1);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(Z)I", line = 69)
    public final int method3237(boolean arg0) {
        if (arg0) {
            field7890 = null;
        }
        ++field7882;
        return super.field4451;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)V", line = 80)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field7885;
        if (arg0 != 0) {
            method3235(-86, 48, (byte[][][]) null, -61, -120, (class58) null, -15, 57, -121, 63, false, -19, -100);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)V", line = 91)
    public final void method23(boolean arg0) {
        if (~super.field4451 != -1 && ~super.field4450.field6546.method1308(false) != -2) {
            super.field4451 = 0;
        }
        if (!arg0) {
            ++field7891;
            if (super.field4451 < 0 || ~super.field4451 < -2) {
                super.field4451 = this.method17((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V", line = 111)
    public static void method3238(int arg0) {
        field7890 = null;
        if (arg0 != 0) {
            field7886 = -52;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(ILch;)V", line = 121)
    public class562(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)Z", line = 124)
    public final boolean method3239(byte arg0) {
        ++field7883;
        return arg0 == -53;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lch;)V", line = 135)
    public class562(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I", line = 138)
    public final int method17(byte arg0) {
        ++field7889;
        int var2 = 1 / ((arg0 - 70) / 51);
        return 1;
    }
}
