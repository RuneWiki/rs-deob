import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class404 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field6020 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[C")
    private static char[] field6019 = new char[64];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "F")
    public static float field6023;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Laq;")
    public static class645 field6022;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method2462(int arg0) {
        field6019 = null;
        if (arg0 != -9660) {
            method2462(110);
        }
        field6022 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6019[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6019[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6019[var2] = (char) (var2 + 48 - 52);
        }
        field6019[63] = '/';
        field6019[62] = '+';
    }
}
