import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class225 {

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "[J")
    public static long[] field2913 = new long[256];

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field2914;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2913[var0] = var1;
        }
        field2914 = 13156520;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V", line = 4)
    public static void method1364(byte arg0) {
        field2913 = null;
        int var1 = -22 % ((34 - arg0) / 62);
    }
}
