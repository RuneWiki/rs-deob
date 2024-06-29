import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class442 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
    public static int[] field6298 = new int[256];

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field6297 = -1;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lgga;")
    public static class265 field6300;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[I")
    public static int[] field6299;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2623(byte arg0) {
        if (arg0 <= 5) {
            field6298 = null;
        }
        field6299 = null;
        field6300 = null;
        field6298 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6298[var0] = var1;
        }
        field6300 = new class265();
    }
}
