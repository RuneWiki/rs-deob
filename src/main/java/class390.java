import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class390 extends class649 {

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "[I")
    public static int[] field5836 = new int[6];

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            field5830 = 66;
        }
        ++field5828;
        return arg1 != 0 && super.field9224.field5427.method3956(3) != 1 ? 2 : 1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
    public static final boolean method2433(int arg0, int arg1, int arg2) {
        ++field5825;
        if (arg1 != 2048) {
            field5836 = null;
        }
        return (arg2 & 2048) != 0;
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)Z")
    public final boolean method2434(int arg0) {
        if (arg0 != -16181) {
            method2436(8, -33);
        }
        ++field5827;
        return true;
    }

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)I")
    public final int method2435(int arg0) {
        if (arg0 != 3) {
            return 67;
        } else {
            ++field5826;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(II)V")
    public static final void method2436(int arg0, int arg1) {
        class662.method3722((byte) -17);
        ++field5833;
        if (arg1 == -8335) {
            int var2 = class346.field5119.method3690(-59, arg0).field3053;
            if (~var2 != -1) {
                int var3 = class422.field6216.field4645[arg0];
                if (var2 == 6) {
                    class342.field5055 = var3;
                }
                if (~var2 == -6) {
                    class70.field1083 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field5835;
        if (~super.field9223 != -1 && super.field9224.field5427.method3956(3) != 1) {
            super.field9223 = 0;
        }
        if (~super.field9223 > -1 || ~super.field9223 < -2) {
            super.field9223 = this.method135(arg0 + -85);
        }
        if (arg0 != 1) {
            this.method135(-43);
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = -6 / ((-18 - arg0) / 50);
        ++field5834;
        return 1;
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V")
    public static void method2437(int arg0) {
        if (arg0 != 6) {
            field5836 = null;
        }
        field5836 = null;
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)V")
    public static final void method2438(int arg0) {
        class702.field9935.method3465(arg0);
        ++field5832;
        class97.field1436 = 0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        if (arg1 <= -120) {
            ++field5824;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)V")
    public static final void method2439(boolean arg0) {
        if (!arg0) {
            field5830 = 92;
        }
        class754.field10518.method76(110);
        ++field5829;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(ILhs;)V")
    public class390(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class666.field9459 = arg0;
        if (arg2 != 1) {
            method2436(-115, 11);
        }
        class618.field8709 = arg6;
        class64.field1035 = arg3;
        class524.field7552 = arg4;
        class197.field3388 = arg1;
        ++field5831;
        if (arg5 && ~class524.field7552 <= -101) {
            class329.field4857 = class64.field1035 * 512 + 256;
            class497.field7212 = class618.field8709 * 512 + 256;
            class101.field1507 = class232.method1611(class329.field4857, class497.field7212, class582.field8234, (byte) -110) - class197.field3388;
        }
        class275.field4202 = -1;
        class87.field1279 = -1;
        class639.field8978 = 2;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lhs;)V")
    public class390(class358 arg0) {
        super(arg0);
    }
}
