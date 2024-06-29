import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class582 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lkda;")
    public static class328 field8550;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 3)
    public static void method3471(int arg0) {
        field8550 = null;
        if (arg0 != 1) {
            method3473(false, true, 98);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V", line = 15)
    public static final void method3472(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3047 != null) {
            var3.field3047 = null;
        }
        if (var3.field3037 != null) {
            var3.field3037 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZI)V", line = 32)
    public static final void method3473(boolean arg0, boolean arg1, int arg2) {
        if (arg2 != -3) {
            field8550 = null;
        }
        if (arg0) {
            class35.field419++;
            class79.method608(0);
        }
        field8545++;
        if (arg1) {
            class142.field1996++;
            class529.method3189(-123);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 57)
    public static final String method3474(int arg0, String arg1) {
        field8548++;
        String var2 = class221.method1434((byte) -101, class42.method270(arg1, 103));
        if (var2 == null) {
            var2 = "";
        }
        return arg0 == -32281 ? var2 : null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)I", line = 74)
    public static final int method3475(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            method3476(108, -98, (byte) 126);
        }
        field8546++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I", line = 111)
    public static final int method3476(int arg0, int arg1, byte arg2) {
        int var3 = 86 % ((-arg2 - 9) / 51);
        field8549++;
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;", line = 141)
    public final String toString() {
        field8547++;
        throw new IllegalStateException();
    }
}
