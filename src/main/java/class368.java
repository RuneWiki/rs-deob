import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class368 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field4977 = 1400;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
    public static int[] field4978 = new int[25];

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "[C")
    private static char[] field4979 = new char[64];

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4979[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4979[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4979[var2] = (char) (var2 - 4);
        }
        field4979[63] = '/';
        field4979[62] = '+';
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V", line = 11)
    public static void method2171(byte arg0) {
        field4978 = null;
        if (arg0 >= -13) {
            method2171((byte) 3);
        }
        field4979 = null;
    }
}
