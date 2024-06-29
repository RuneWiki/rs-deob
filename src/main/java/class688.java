import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class688 {

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field9713 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[C")
    private static char[] field9712 = new char[64];

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lpb;")
    public static class2 field9714;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Lmb;")
    public static class383 field9715;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "[F")
    public static float[] field9717;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Liba;")
    public static class211 field9716;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method3853(byte arg0) {
        field9717 = null;
        field9712 = null;
        if (arg0 >= -115) {
            field9717 = null;
        }
        field9715 = null;
        field9716 = null;
        field9714 = null;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field9712[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field9712[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field9712[var2] = (char) (var2 - 4);
        }
        field9712[63] = '/';
        field9712[62] = '+';
        field9714 = new class2(3, 4);
        field9715 = new class383();
        field9717 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
        field9716 = new class211(61, 0);
    }
}
