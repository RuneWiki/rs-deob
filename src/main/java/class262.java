import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class262 extends class264 {

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "[C")
    private static char[] field3706 = new char[64];

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "[Z")
    public static boolean[] field3707;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "Ldba;")
    public static class101 field3708;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Lfa;")
    public static class243 field3703;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "[[[Lrr;")
    public static class379[][][] field3697;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(BI)C")
    public static final char method1721(byte arg0, int arg1) {
        ++field3704;
        int var2 = arg0 & 255;
        if (arg1 >= -47) {
            field3703 = null;
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && ~var2 > -161) {
                char var3 = class413.field5839[var2 + -128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            method1721((byte) 67, -111);
        }
        ++field3699;
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lmfa;)V")
    public class262(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field3700;
        if (class348.method2200(-4, arg1)) {
            if (super.field3731.field9002.method2259(arg0 ^ -113) && !class205.method1474(super.field3731.field9002.method2258((byte) -47), (byte) -125)) {
                return 3;
            }
            if (super.field3731.field8985.method2724((byte) -60) == 1) {
                return 3;
            }
        }
        if (arg0 != 112) {
            return 34;
        } else if (~arg1 == -4) {
            return 3;
        } else {
            return class348.method2200(arg0 + -116, arg1) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)Z")
    public final boolean method1722(int arg0) {
        ++field3695;
        if (arg0 != 14996) {
            method1725((byte) -22);
        }
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        ++field3698;
        if (arg0 != -38) {
            this.method1724(-34);
        }
        return 0;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field3705;
        if (this.method1724(-29355)) {
            if (super.field3731.field9002.method2259(-1) && !class205.method1474(super.field3731.field9002.method2258((byte) -107), (byte) -110)) {
                super.field3733 = 1;
            }
            if (super.field3731.field8985.method2724((byte) -37) == 1) {
                super.field3733 = 1;
            }
        }
        if (super.field3733 == 3) {
            super.field3733 = 2;
        }
        if (~super.field3733 > -1 || super.field3733 > 3) {
            super.field3733 = this.method663((byte) -38);
        }
        int var2 = 57 / ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)I")
    public final int method1723(byte arg0) {
        ++field3696;
        return arg0 > -31 ? -63 : super.field3733;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)Z")
    public final boolean method1724(int arg0) {
        if (arg0 != -29355) {
            return false;
        } else {
            ++field3702;
            return class348.method2200(arg0 ^ 29353, super.field3733);
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
    public static void method1725(byte arg0) {
        field3703 = null;
        if (arg0 > -16) {
            field3708 = null;
        }
        field3708 = null;
        field3706 = null;
        field3697 = null;
        field3707 = null;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILmfa;)V")
    public class262(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
    public static final void method1726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class689.field9755 != null) {
            class689.field9755[arg0][arg1] = -16777216 | arg2;
        }
        if (class135.field1748 != null) {
            class135.field1748[arg0][arg1] = (short) arg3;
        }
        if (class322.field4766 != null) {
            class322.field4766[arg0][arg1] = (byte) arg4;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field3706[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field3706[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field3706[var2] = (char) (var2 + -52 + 48);
        }
        field3706[63] = '/';
        field3706[62] = '+';
        field3707 = new boolean[8];
        field3708 = new class101(8, 16);
    }
}
