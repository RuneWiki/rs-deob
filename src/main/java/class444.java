import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class444 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "[I")
    public static int[] field6134 = new int[256];

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
    public static void method2604(byte arg0) {
        if (arg0 >= 16) {
            field6134 = null;
        }
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
            field6134[var0] = var1;
        }
    }
}
