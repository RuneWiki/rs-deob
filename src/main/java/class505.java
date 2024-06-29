import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class505 extends class649 {

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field7362 = -1;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field7369 = 0;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "[I")
    public static int[] field7374 = new int[2048];

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "Lcr;")
    public static class292 field7368 = new class292("game3", 2);

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "S")
    public static short field7375 = 320;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Lit;")
    public static class34 field7372;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field7360;
        if (class416.method2555(arg1, (byte) 78)) {
            if (super.field9224.field5415.method2000(2) && !class718.method3961(2, super.field9224.field5415.method2004(arg0 + -18645))) {
                return 3;
            }
            if (~super.field9224.field5409.method2689(3) == -2) {
                return 3;
            }
        }
        if (~arg1 == -4) {
            return 3;
        } else if (arg0 != 18648) {
            return 116;
        } else {
            return class416.method2555(arg1, (byte) 78) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
    public final boolean method3050(int arg0) {
        ++field7370;
        if (arg0 != -16181) {
            field7362 = -42;
        }
        return true;
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)V")
    public static void method3051(int arg0) {
        field7368 = null;
        field7372 = null;
        if (arg0 != 1) {
            field7375 = -20;
        }
        field7374 = null;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lhs;)V")
    public class505(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 != 1) {
            this.method3052(-123);
        }
        ++field7365;
        if (this.method3054(0)) {
            if (super.field9224.field5415.method2000(2) && !class718.method3961(2, super.field9224.field5415.method2004(arg0 ^ 2))) {
                super.field9223 = 1;
            }
            if (~super.field9224.field5409.method2689(arg0 ^ 2) == -2) {
                super.field9223 = 1;
            }
        }
        if (~super.field9223 == -4) {
            super.field9223 = 2;
        }
        if (super.field9223 < 0 || super.field9223 > 3) {
            super.field9223 = this.method135(-127);
        }
    }

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)I")
    public final int method3052(int arg0) {
        if (arg0 != 3) {
            method3056(2, (byte) 32, 96);
        }
        ++field7364;
        return super.field9223;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field7371;
        int var2 = 127 % ((arg0 - -18) / 50);
        return 0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Laia;I)Z")
    public static final boolean method3053(class257 arg0, int arg1) {
        if (arg1 >= -120) {
            field7374 = null;
        }
        ++field7373;
        return class723.field10141 == arg0 || class549.field7833 == arg0 || class222.field3608 == arg0 || class494.field7163 == arg0;
    }

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)Z")
    public final boolean method3054(int arg0) {
        if (arg0 != 0) {
            field7375 = 103;
        }
        ++field7363;
        return class416.method2555(super.field9223, (byte) 78);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 >= -120) {
            field7374 = null;
        }
        super.field9223 = arg0;
        ++field7359;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3055(int arg0, int arg1, byte arg2) {
        if (arg2 != -45) {
            field7369 = 107;
        }
        ++field7361;
        return ~(16 & arg0) != -1;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(ILhs;)V")
    public class505(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3056(int arg0, byte arg1, int arg2) {
        ++field7367;
        if (arg1 >= -126) {
            method3056(95, (byte) -116, 31);
        }
        return (arg2 & 32768) != 0;
    }
}
