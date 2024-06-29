import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class696 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[J")
    public static long[] field9710 = new long[256];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public int field9709;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public int field9711;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public int field9713;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public int field9714;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public int field9715;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public int field9716;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "Z")
    public static boolean field9712;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method3942(int arg0) {
        field9710 = null;
        if (arg0 != 21541) {
            method3942(0);
        }
    }

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
            field9710[var0] = var1;
        }
    }
}
