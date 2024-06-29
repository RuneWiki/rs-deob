import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class4 extends class213 {

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Ljj;")
    public static class398 field33 = new class398(83, 1);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field41 = 13156520;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(ZI)V")
    public final void method17(boolean arg0, int arg1) {
        if (arg1 <= 37) {
            field38 = -9;
        }
        ++field31;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public static final void method18(int arg0) {
        class606.field8280.method2001(class539.field7389, !class72.field935.field6510 ? -1 : class494.field6685 + 256 << 2, 0);
        if (arg0 != -5788) {
            field33 = null;
        }
        ++field40;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lsv;)V")
    public class4(class312 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILaw;)V")
    public final void method19(int arg0, int arg1, class619 arg2) {
        super.field2766.method1884(arg2, arg1 ^ -10);
        ++field37;
        super.field2766.method1995(arg0, 1);
        if (arg1 != 8) {
            field41 = -77;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method20(int arg0) {
        ++field34;
        if (arg0 <= 32) {
            this.method22((byte) 115);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method21(String arg0, int arg1, char arg2) {
        ++field30;
        int var3 = arg1;
        int var4 = arg0.length();
        for (int var5 = 0; var4 > var5; ++var5) {
            if (arg0.charAt(var5) == arg2) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)Z")
    public final boolean method22(byte arg0) {
        ++field39;
        if (arg0 != 75) {
            method18(-4);
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(ZI)V")
    public final void method23(boolean arg0, int arg1) {
        if (arg1 != -18) {
            method25(-122, 80, 71);
        }
        ++field43;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
    public static void method24(byte arg0) {
        field33 = null;
        if (arg0 > -48) {
            field33 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)Z")
    public static final boolean method25(int arg0, int arg1, int arg2) {
        ++field42;
        if (!class91.method505(arg2, (byte) 95, arg1)) {
            return false;
        } else {
            return class644.method3585((byte) 103, arg2, arg1) | ~(arg2 & 45056) != arg0 | class216.method1336(arg1, arg2, (byte) -56) ? true : (55 & arg1) == 0 & (class558.method3121(arg1, arg2, true) | class298.method1780(true, arg2, arg1));
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 == 0) {
            class422.field5874 = null;
            ++field35;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public static final void method27(int arg0, int arg1) {
        ++field36;
        if (arg1 != 55) {
            method25(122, -90, -105);
        }
        class19 var2 = class364.method2236(1248116640, arg0, 5);
        var2.method104(10);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        if (arg0 == -16595) {
            ++field32;
        }
    }
}
