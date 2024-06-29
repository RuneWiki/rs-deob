import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class558 extends class264 {

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "Lpa;")
    public static class387 field7926 = new class387(3000000, 200);

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "[I")
    public static int[] field7928 = new int[32];

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Lke;")
    public static class622 field7930;

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "Z")
    public static boolean field7931;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "I")
    public static int field7929;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field7928[var1] = var0 + -1;
            var0 += var0;
        }
        field7930 = new class622(47, -1);
        field7931 = false;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(ILmfa;)V", line = 5)
    public class558(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lmfa;)V", line = 8)
    public class558(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)I", line = 11)
    public final int method666(byte arg0, int arg1) {
        ++field7925;
        if (!class185.method1379(super.field3731.field9002.method2258((byte) -95), 124)) {
            return 3;
        } else {
            return arg0 != 112 ? 19 : 1;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V", line = 25)
    public static void method3234(boolean arg0) {
        field7928 = null;
        field7926 = null;
        if (!arg0) {
            method3234(false);
        }
        field7930 = null;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)I", line = 37)
    public final int method3235(byte arg0) {
        if (arg0 > -31) {
            return 95;
        } else {
            ++field7929;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(BI)V", line = 48)
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            this.method3236(91);
        }
        ++field7923;
        super.field3733 = arg1;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V", line = 60)
    public final void method660(int arg0) {
        int var2 = -79 % ((1 - arg0) / 41);
        if (super.field3731.field9002.method2259(-1) && !class185.method1379(super.field3731.field9002.method2258((byte) -45), 118)) {
            super.field3733 = 0;
        }
        ++field7924;
        if (~super.field3733 > -1 || ~super.field3733 < -2) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)Z", line = 85)
    public final boolean method3236(int arg0) {
        ++field7921;
        if (!class185.method1379(super.field3731.field9002.method2258((byte) -101), 111)) {
            return false;
        } else {
            if (arg0 != 14996) {
                field7930 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)I", line = 103)
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            field7931 = true;
        }
        ++field7927;
        return 0;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(II)V", line = 128)
    public static final void method3237(int arg0, int arg1) {
        if (arg0 < 71) {
            method3237(-118, -94);
        }
        ++field7922;
        class678 var2 = class630.method3597(29636, 14, (long) arg1);
        var2.method3836((byte) -104);
    }
}
