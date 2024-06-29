import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class480 extends class322 {

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[F")
    public static float[] field6793 = new float[16];

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6795 = -2;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[[[Lwq;")
    public static class165[][][] field6790;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -83 / ((70 - arg0) / 51);
        ++field6794;
        return 1;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)I")
    public final int method2865(boolean arg0) {
        if (arg0) {
            this.method23(false);
        }
        ++field6792;
        return super.field4451;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Z")
    public final boolean method2866(byte arg0) {
        ++field6791;
        if (super.field4450.method2749(-21) == class556.field7800) {
            return !super.field4450.method2751(-18373);
        } else {
            if (arg0 != -53) {
                method2869(-63, (byte) -28, 80, true, 64, -64, -71);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2867(int arg0, int arg1, byte arg2) {
        ++field6789;
        int var3 = 117 % ((arg2 - -87) / 37);
        return class210.method1296((byte) -97, arg0, arg1) || class542.method3146(false, arg1, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILch;)V")
    public class480(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field6796;
        if (!arg0) {
            if (super.field4450.method2749(-21) != class556.field7800) {
                super.field4451 = 1;
            } else if (super.field4450.method2751(-18373)) {
                super.field4451 = 0;
            }
            if (super.field4451 != 0 && ~super.field4451 != -2) {
                super.field4451 = this.method17((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
    public static void method2868(boolean arg0) {
        if (!arg0) {
            method2867(-51, -72, (byte) -53);
        }
        field6793 = null;
        field6790 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field6788;
        if (super.field4450.method2749(-21) == class556.field7800) {
            if (super.field4450.method2751(-18373)) {
                return 3;
            } else {
                return arg0 != 0 && ~super.field4450.field6546.method1308(false) != -2 ? 2 : 1;
            }
        } else {
            if (arg1 < 10) {
                field6793 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIZIII)V")
    public static final void method2869(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class438.field6243 = arg0;
        ++field6787;
        class726.field10160 = arg6;
        class757.field10521 = arg2;
        class582.field8203 = arg4;
        class619.field8641 = arg5;
        if (arg3 && class438.field6243 >= 100) {
            class511.field7303 = class757.field10521 * 512 + 256;
            class32.field426 = class582.field8203 * 512 + 256;
            class155.field2169 = class469.method2798(71, class32.field426, class526.field7430, class511.field7303) + -class726.field10160;
        }
        class218.field2850 = -1;
        class419.field5919 = -1;
        class97.field1168 = 2;
        if (arg1 > -15) {
            field6793 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lch;)V")
    public class480(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        if (arg0 != 0) {
            this.method2866((byte) -121);
        }
        ++field6786;
    }
}
