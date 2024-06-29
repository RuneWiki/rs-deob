import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class290 extends class418 {

    @OriginalMember(owner = "client!hfa", name = "G", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!hfa", name = "N", descriptor = "Z")
    public static boolean field3668 = false;

    @OriginalMember(owner = "client!hfa", name = "H", descriptor = "Lhs;")
    public static class304 field3662 = new class304();

    @OriginalMember(owner = "client!hfa", name = "O", descriptor = "Lvh;")
    public static class335 field3669 = new class335(0, 0);

    @OriginalMember(owner = "client!hfa", name = "Q", descriptor = "I")
    public static int field3671 = -1;

    @OriginalMember(owner = "client!hfa", name = "A", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!hfa", name = "B", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!hfa", name = "C", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!hfa", name = "F", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!hfa", name = "I", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hfa", name = "J", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!hfa", name = "K", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!hfa", name = "L", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!hfa", name = "M", descriptor = "Lkf;")
    public class237 field3667;

    @OriginalMember(owner = "client!hfa", name = "E", descriptor = "[B")
    public byte[] field3659;

    @OriginalMember(owner = "client!hfa", name = "P", descriptor = "[Lln;")
    public static class352[] field3670;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "(I)V")
    public static void method1738(int arg0) {
        if (arg0 <= 10) {
            field3671 = -86;
        }
        field3662 = null;
        field3670 = null;
        field3669 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1739(int arg0, int arg1, byte arg2) {
        ++field3663;
        if (arg2 != -14) {
            return false;
        } else {
            return (arg1 & 256) != 0;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)I")
    public final int method1740(byte arg0) {
        ++field3656;
        if (arg0 <= 38) {
            method1739(-57, 54, (byte) 108);
        }
        return super.field5346 ? 0 : 100;
    }

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "(I)[B")
    public final byte[] method1741(int arg0) {
        ++field3658;
        if (super.field5346) {
            throw new RuntimeException();
        } else {
            if (arg0 != 0) {
                field3668 = false;
            }
            return this.field3659;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1742(byte arg0, String arg1) {
        ++field3660;
        int var2 = arg1.length();
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = -4 & var2 + 3;
            int var4 = var3 / 4 * 3;
            if (arg0 != -16) {
                field3669 = null;
            }
            if (var3 + -2 < var2 && ~class245.method1469(arg1.charAt(var3 + -2), (byte) 9) != 0) {
                if (~(var3 + -1) <= ~var2 || class245.method1469(arg1.charAt(var3 - 1), (byte) 9) == -1) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class640.method3590(var5, arg1, 0, arg0 ^ -16711921);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BZ)V")
    public static final void method1743(byte arg0, boolean arg1) {
        ++field3657;
        if (class185.field2182 == null) {
            class403.method2266((byte) -60);
        }
        if (arg1) {
            class185.field2182.method2428(31);
        }
        if (arg0 > -98) {
            method1739(31, -112, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IB)V")
    public static final void method1744(int arg0, byte arg1) {
        if (arg1 == 123) {
            ++field3664;
            class243 var2 = class546.method2926(arg0, 10, true);
            var2.method1455(true);
        }
    }
}
