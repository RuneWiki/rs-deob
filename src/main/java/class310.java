import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class310 extends class348 {

    @OriginalMember(owner = "client!am", name = "u", descriptor = "[I")
    public static int[] field4543;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "C")
    public char field4540;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "J")
    public long field4533;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lam;")
    public class310 field4534;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lg;")
    public static class470 field4541;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "Lclient;")
    public static client field4546;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
    public boolean field4536;

    static {
        new class135("", 76);
        field4543 = new int[] { -1, -1, 1, 1 };
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)C", line = 7)
    public final char method1918(int arg0) {
        field4544++;
        if (arg0 <= 1) {
            field4546 = null;
        }
        return this.field4540;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method1919(int arg0) {
        if (arg0 <= 12) {
            return false;
        } else {
            field4539++;
            return this.field4536;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)I", line = 33)
    public static final int method1920(int arg0, int arg1, byte arg2) {
        field4545++;
        int var3 = 34 % ((arg2 - 60) / 48);
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

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I", line = 64)
    public final int method1921(byte arg0) {
        field4535++;
        if (arg0 > -24) {
            this.method1923(63);
        }
        return this.field4537;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)J", line = 75)
    public final long method1922(int arg0) {
        field4538++;
        if (arg0 != 8) {
            method1924(10);
        }
        return this.field4533;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I", line = 95)
    public final int method1923(int arg0) {
        if (arg0 == 4) {
            field4531++;
            return this.field4542;
        } else {
            return -84;
        }
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(I)V", line = 108)
    public static void method1924(int arg0) {
        field4543 = null;
        field4541 = null;
        if (arg0 != 1) {
            method1920(95, -11, (byte) -41);
        }
        field4546 = null;
    }
}
