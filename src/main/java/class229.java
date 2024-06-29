import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class229 {

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field3709 = -1;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public static int[] field3711 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lck;")
    public static class119 field3705 = class298.method1987((byte) 103, ")4");

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Lck;")
    public static class119 field3710 = class298.method1987((byte) 12, "xx");

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "Lck;")
    private static class119 field3719 = class298.method1987((byte) 31, "K");

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lck;")
    public static class119 field3717 = field3719;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lck;")
    public static class119 field3714 = field3719;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Z")
    public static boolean field3716;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[[[B")
    public static byte[][][] field3702;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I", line = 13)
    public static final int method1486(int arg0, int arg1) {
        int var2 = arg1 & 0x3F;
        if (arg0 != 32) {
            field3710 = (class119) null;
        }
        field3706++;
        int var3 = (arg1 & 0xD4) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 106)
    public static void method1487(byte arg0) {
        field3705 = null;
        field3710 = null;
        field3711 = null;
        field3719 = null;
        field3702 = (byte[][][]) null;
        if (arg0 > -57) {
            field3719 = (class119) null;
        }
        field3717 = null;
        field3714 = null;
    }
}
