import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class529 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "[J")
    public static long[] field7725 = new long[256];

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Liv;")
    public static class82 field7729;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field7730;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
    public static final boolean method3109(int arg0) {
        field7728++;
        if (arg0 != 0) {
            field7729 = null;
        }
        return class271.field3704 > 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method3110(byte arg0, String arg1) {
        int var2 = -62 / ((-arg0 - 22) / 50);
        field7726++;
        return class621.method3551(90, 10, true, arg1);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
    public static final void method3111(int arg0) {
        class301.field4043 = 0;
        class147.field1798 = -1;
        class432.field6201 = arg0;
        field7723++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lec;IB)V")
    public static final void method3112(class213 arg0, int arg1, byte arg2) {
        field7724++;
        int var3 = -1;
        if (arg2 <= 76) {
            field7729 = null;
        }
        int var4 = 0;
        if (class543.field7882 < arg0.field2653) {
            class323.method1880(arg0, -127);
        } else if (arg0.field2638 >= class543.field7882) {
            class251.method1538(arg0, 256);
        } else {
            class521.method3090(false, arg0, -13412);
            var3 = class577.field8434;
            var4 = class674.field9675;
        }
        if (arg0.field530 < 512 || arg0.field531 < 512 || ((class473.field6604 - 1) * 512) <= arg0.field530 || arg0.field531 >= class205.field2465 * 512 - 512) {
            arg0.field2638 = 0;
            arg0.field2637 = -1;
            arg0.field2655 = null;
            arg0.field2626 = -1;
            arg0.field2629 = -1;
            var4 = 0;
            var3 = -1;
            arg0.field2653 = 0;
            arg0.field530 = arg0.field2689[0] * 512 + (arg0.method1284((byte) -124) * 256);
            arg0.field531 = arg0.field2686[0] * 512 + arg0.method1284((byte) -124) * 256;
            arg0.method1297((byte) 99);
        }
        if (class206.field2472 == arg0 && (arg0.field530 < 6144 || arg0.field531 < 6144 || arg0.field530 >= (class473.field6604 * 512 - 6144) || (class205.field2465 - 12) * 512 <= arg0.field531)) {
            arg0.field2638 = 0;
            var4 = 0;
            arg0.field2653 = 0;
            arg0.field2655 = null;
            arg0.field2629 = -1;
            arg0.field2637 = -1;
            var3 = -1;
            arg0.field2626 = -1;
            arg0.field530 = arg0.field2689[0] * 512 + arg0.method1284((byte) -124) * 256;
            arg0.field531 = arg0.field2686[0] * 512 + (arg0.method1284((byte) -124) * 256);
            arg0.method1297((byte) 99);
        }
        int var5 = class445.method2630(-76, arg0);
        class4.method18(arg0, 19);
        class637.method3634(arg0, var3, var5, var4, (byte) -29);
        class531.method3125((byte) -41, var3, arg0);
        class7.method45(126, arg0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIB)I")
    public static final int method3113(int arg0, int arg1, byte arg2) {
        if (arg2 != 104) {
            method3109(-90);
        }
        field7727++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg0--;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method3114(boolean arg0) {
        field7730 = null;
        field7729 = null;
        if (arg0) {
            field7725 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7725[var0] = var1;
        }
        field7729 = new class82(7, 17);
        field7730 = new String[200];
    }
}
