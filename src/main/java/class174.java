import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class174 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[I")
    public static int[] field2655 = new int[256];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Llf;")
    public static class94[] field2654;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1244(int arg0) {
        field2655 = null;
        field2654 = null;
        if (arg0 != -10502) {
            method1244(69);
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
            field2655[var0] = var1;
        }
        field2656 = 0;
    }
}
