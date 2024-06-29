import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
    public static int[] field577 = new int[32];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Ljd;")
    private static class92 field580 = class202.method1325((byte) 90, "Use");

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Ljd;")
    public static class92 field578 = class202.method1325((byte) 90, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljd;")
    public static class92 field581 = field580;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lei;")
    public static class50 field579;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method159(byte arg0) {
        int var1 = -94 / (arg0 / 38);
        field581 = null;
        field578 = null;
        field577 = null;
        field579 = null;
        field580 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field577[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
