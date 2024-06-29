import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class228 extends class125 {

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Z")
    public static boolean field3406 = false;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field3412 = 52;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field3417 = -1;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILgp;)V", line = 4)
    public class228(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I", line = 7)
    public static final int method1585(int arg0, int arg1) {
        if (arg0 > -90) {
            field3412 = -116;
        }
        ++field3415;
        byte var2;
        if (~arg1 < -12001) {
            var2 = 4;
            class693.method3910(2);
        } else if (arg1 <= 5000) {
            if (arg1 > 2000) {
                var2 = 2;
                class184.method1302(0);
            } else {
                class521.method3171(true, (byte) 21);
                var2 = 1;
            }
        } else {
            class353.method2246(true);
            var2 = 3;
        }
        if (class243.field3580.field7975.method3775(false) != 2) {
            class243.field3580.method3301(2, 24, class243.field3580.field8019);
            class403.method2449(false, 2, -51);
        }
        class23.method102((byte) -74);
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V", line = 55)
    public final void method157(byte arg0, int arg1) {
        ++field3414;
        if (arg0 >= -32) {
            this.method157((byte) -5, 86);
        }
        super.field1732 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 67)
    public static final void method1586(int arg0) {
        if (arg0 != 2) {
            method1588((class194) null, -126);
        }
        class5.method21(false);
        ++field3416;
        class751.field10467 = null;
        class680.field9653 = null;
        class181.field2495 = null;
        class387.field5590 = null;
        class36.field322 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I", line = 84)
    public final int method158(byte arg0) {
        int var2 = 122 / ((arg0 - -63) / 49);
        ++field3413;
        return 1;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I", line = 98)
    public final int method1587(boolean arg0) {
        ++field3411;
        if (arg0) {
            field3406 = true;
        }
        return super.field1732;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lgp;)V", line = 109)
    public class228(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Laj;I)Ljava/lang/String;", line = 113)
    public static final String method1588(class194 arg0, int arg1) {
        if (arg1 >= -103) {
            field3417 = 60;
        }
        ++field3409;
        return arg0.field2847 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V", line = 125)
    public static final void method1589(int arg0, String arg1, String arg2) {
        ++field3408;
        class39.field672 = 1;
        class544.field7903 = -1;
        int var3 = -62 % ((arg0 - 17) / 63);
        class715.method4014((byte) 7, arg2, false, arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)I", line = 137)
    public final int method155(boolean arg0, int arg1) {
        ++field3405;
        if (!arg0) {
            this.method157((byte) -43, 105);
        }
        if (super.field1733.method3308(-100)) {
            return 3;
        } else if (super.field1733.method3309((byte) -22) == class391.field5635) {
            if (arg1 == 0) {
                if (~super.field1733.field8005.method4058(false) == -2) {
                    return 2;
                }
                if (super.field1733.field8008.method4186(false) == 1) {
                    return 2;
                }
                if (super.field1733.field8001.method3761(false) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V", line = 176)
    public final void method156(boolean arg0) {
        if (super.field1733.method3309((byte) -22) != class391.field5635) {
            super.field1732 = 1;
        } else if (super.field1733.method3308(-72)) {
            super.field1732 = 0;
        }
        if (!arg0) {
            field3412 = 45;
        }
        ++field3407;
        if (super.field1732 != 0 && ~super.field1732 != -2) {
            super.field1732 = this.method158((byte) -9);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Z", line = 198)
    public final boolean method1590(int arg0) {
        if (arg0 != -7558) {
            return false;
        } else {
            ++field3410;
            if (super.field1733.method3308(-66)) {
                return false;
            } else {
                return super.field1733.method3309((byte) -22) == class391.field5635;
            }
        }
    }
}
