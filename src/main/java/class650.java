import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class650 extends class601 {

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "[I")
    public static int[] field8722 = new int[32];

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "Z")
    public static boolean field8720 = false;

    @OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!vea", name = "o", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)I", line = 5)
    public final int method45(int arg0) {
        ++field8716;
        return arg0 != 8976 ? -106 : 1;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(II)V", line = 16)
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = 106 % ((22 - arg0) / 34);
        ++field8718;
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)Z", line = 26)
    public final boolean method3639(int arg0) {
        ++field8715;
        if (arg0 != 2048) {
            this.method43(-26, 27);
        }
        if (super.field8137.method2153(arg0 + -2057) == class540.field7508) {
            return !super.field8137.method2161(arg0 ^ 2048);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(B)V", line = 46)
    public static void method3640(byte arg0) {
        field8722 = null;
        int var1 = -124 % ((arg0 - -37) / 39);
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lqea;)V", line = 55)
    public class650(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(IB)I", line = 58)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return -60;
        } else {
            ++field8723;
            if (super.field8137.method2153(-9) == class540.field7508) {
                if (super.field8137.method2161(arg1 + -22)) {
                    return 3;
                } else {
                    return ~arg0 != -1 && ~super.field8137.field4752.method62(0) != -2 ? 2 : 1;
                }
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)I", line = 82)
    public final int method3641(int arg0) {
        if (arg0 != 0) {
            return 76;
        } else {
            ++field8714;
            return super.field8131;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(ILqea;)V", line = 96)
    public class650(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 100)
    public final void method41(byte arg0) {
        int var2 = 32 % ((59 - arg0) / 33);
        ++field8717;
        if (super.field8137.method2153(-9) != class540.field7508) {
            super.field8131 = 1;
        } else if (super.field8137.method2161(0)) {
            super.field8131 = 0;
        }
        if (~super.field8131 != -1 && super.field8131 != 1) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)V", line = 122)
    public static final void method3642(int arg0) {
        ++field8721;
        for (class160 var1 = (class160) class131.field1826.method821((byte) 110); var1 != null; var1 = (class160) class131.field1826.method818(77)) {
            if (!var1.field2232) {
                class480.method2923(var1.field2230, 0);
            } else {
                var1.field2232 = false;
            }
        }
        if (arg0 <= 24) {
            method3640((byte) 108);
        }
    }
}
