import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class259 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lma;")
    private static class5 field4416 = class12.method119("Discard", (byte) 57);

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Lma;")
    public static class5 field4420 = class12.method119("Bitte entfernen Sie ", (byte) 80);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lma;")
    public static class5 field4417 = field4416;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[B")
    public static byte[] field4418;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lel;")
    public static class218 field4422;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4423;

    static {
        int var0 = 0;
        field4418 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4418[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field4422 = new class218();
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 19)
    public static void method1797(byte arg0) {
        if (arg0 < 108) {
            return;
        }
        field4417 = null;
        field4418 = null;
        field4416 = null;
        field4422 = null;
        field4420 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I", line = 44)
    public static int method1798(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
