import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class348 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "[I")
    public static int[] field4940 = new int[14];

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "[C")
    private static char[] field4943 = new char[64];

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public int field4942;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lgga;")
    public static class513 field4945;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4943[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4943[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4943[var2] = (char) (var2 + 48 - 52);
        }
        field4943[62] = '+';
        field4943[63] = '/';
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V", line = 11)
    public static void method2119(byte arg0) {
        field4940 = null;
        field4943 = null;
        if (arg0 != 78) {
            method2119((byte) -2);
        }
        field4945 = null;
    }
}
