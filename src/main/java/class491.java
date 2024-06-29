import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class491 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[F")
    public static float[] field6734 = new float[4];

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[C")
    private static char[] field6735 = new char[64];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "[Lmq;")
    public static class85[] field6736;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method2869(int arg0) {
        field6734 = null;
        field6735 = null;
        field6736 = null;
        int var1 = 97 % ((-arg0 - 8) / 42);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field6735[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field6735[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field6735[var2] = (char) (var2 - 4);
        }
        field6735[63] = '-';
        field6735[62] = '*';
    }
}
