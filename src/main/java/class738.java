import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class738 extends class529 {

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field10336 = 0;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "Lkh;")
    public static class354 field10334 = new class354();

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "F")
    public static float field10337;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field10332;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Lda;")
    public static class423 field10331;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I", line = 6)
    public final int[] method191(int arg0, byte arg1) {
        ++field10332;
        int[] var3 = super.field7456.method1635(arg0, -55);
        int var4 = 41 % ((27 - arg1) / 49);
        if (super.field7456.field3449) {
            class617.method3388(var3, 0, class304.field3909, class310.field3960[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 27)
    public class738() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Lfq;", line = 30)
    public static final class141 method4135(int arg0, int arg1) {
        ++field10333;
        if (arg1 < 2) {
            return null;
        } else {
            class141[] var2 = class182.method1166(22050);
            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (~var2[var3].field1680 == ~arg0) {
                    return var2[var3];
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V", line = 54)
    public static void method4136(byte arg0) {
        field10334 = null;
        int var1 = -18 % ((-4 - arg0) / 60);
        field10331 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILgaa;)V", line = 74)
    public static final void method4137(int arg0, int arg1, int arg2, class460 arg3) {
        if (arg3.field6577 == 0) {
            arg3.field6543 = arg3.field6502;
        } else if (arg3.field6577 == 1) {
            arg3.field6543 = (-arg3.field6514 + arg2) / 2 + arg3.field6502;
        } else if (arg3.field6577 == 2) {
            arg3.field6543 = -arg3.field6514 + -arg3.field6502 + arg2;
        } else if (~arg3.field6577 != -4) {
            if (~arg3.field6577 == -5) {
                arg3.field6543 = (arg3.field6502 * arg2 >> 14) + (arg2 - arg3.field6514) / 2;
            } else {
                arg3.field6543 = -(arg3.field6502 * arg2 >> 14) + arg2 + -arg3.field6514;
            }
        } else {
            arg3.field6543 = arg3.field6502 * arg2 >> 14;
        }
        if (arg1 != -897306066) {
            method4136((byte) 73);
        }
        if (~arg3.field6591 == -1) {
            arg3.field6572 = arg3.field6624;
        } else if (arg3.field6591 == 1) {
            arg3.field6572 = (-arg3.field6566 + arg0) / 2 - -arg3.field6624;
        } else if (arg3.field6591 == 2) {
            arg3.field6572 = -arg3.field6566 + arg0 + -arg3.field6624;
        } else if (~arg3.field6591 == -4) {
            arg3.field6572 = arg3.field6624 * arg0 >> 14;
        } else if (arg3.field6591 != 4) {
            arg3.field6572 = -arg3.field6566 + arg0 - (arg3.field6624 * arg0 >> 14);
        } else {
            arg3.field6572 = (-arg3.field6566 + arg0) / 2 - -(arg3.field6624 * arg0 >> 14);
        }
        ++field10335;
        if (class491.field6959) {
            if (client.method715(arg3).field465 == 0 && ~arg3.field6483 != -1) {
                return;
            }
            if (arg3.field6543 < 0) {
                arg3.field6543 = 0;
            } else if (arg2 < arg3.field6543 + arg3.field6514) {
                arg3.field6543 = -arg3.field6514 + arg2;
            }
            if (~arg3.field6572 > -1) {
                arg3.field6572 = 0;
                return;
            }
            if (arg3.field6572 + arg3.field6566 > arg0) {
                arg3.field6572 = arg0 - arg3.field6566;
                return;
            }
        }
    }
}
