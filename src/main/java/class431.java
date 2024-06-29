import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class431 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
    public static int[] field5572 = new int[256];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[I")
    public static int[] field5571 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lra;")
    public static class361 field5574;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)Z")
    public static final boolean method2470(int arg0, int arg1, int arg2) {
        field5573++;
        if (arg2 != 1059) {
            method2470(-123, 9, 98);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method2471(byte arg0) {
        field5572 = null;
        field5574 = null;
        field5571 = null;
        int var1 = 17 / ((arg0 + 45) / 63);
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
            field5572[var0] = var1;
        }
        field5574 = new class361(115, -1);
    }
}
