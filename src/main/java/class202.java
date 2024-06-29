import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class202 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljd;")
    private static class92 field3907 = method1325((byte) 90, "glow2:");

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljd;")
    public static class92 field3911 = field3907;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljd;")
    public static class92 field3913 = method1325((byte) 90, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljd;")
    public static class92 field3914 = method1325((byte) 90, "::rect_debug");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Ljd;")
    private static class92 field3909 = method1325((byte) 90, "Bad session id)3");

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljd;")
    public static class92 field3908 = field3907;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Ljd;")
    public static class92 field3916 = field3909;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ljd;")
    public static class92 field3919 = method1325((byte) 90, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[I")
    public static int[] field3922 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Ljd;")
    public static class92 field3921 = method1325((byte) 90, ":tradereq:");

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1324(int arg0) {
        class89.field1758.method923(-105);
        class214.field4184.method923(-114);
        if (arg0 != 1) {
            method1326(22);
        }
        field3910++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjava/lang/String;)Ljd;")
    public static final class92 method1325(byte arg0, String arg1) {
        byte[] var2 = arg1.getBytes();
        field3917++;
        if (arg0 != 90) {
            method1324(69);
        }
        int var3 = var2.length;
        class92 var4 = new class92();
        int var5 = 0;
        var4.field1856 = new byte[var3];
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1856[var4.field1838++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field1856[var4.field1838++] = (byte) var6;
            }
        }
        var4.method604((byte) -83);
        return var4.method644((byte) 127);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field3914 = null;
        field3908 = null;
        field3922 = null;
        field3913 = null;
        field3921 = null;
        field3909 = null;
        int var1 = -114 / ((arg0 - 69) / 47);
        field3916 = null;
        field3907 = null;
        field3919 = null;
        field3911 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method1327(int arg0, int arg1) {
        field3912++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + arg1;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method1328(int arg0, int arg1, int arg2) {
        field3918++;
        if (arg1 != 126) {
            return 118;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
