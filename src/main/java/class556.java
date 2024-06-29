import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class556 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[J")
    public static long[] field7929 = new long[256];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public static boolean field7933;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lbu;")
    public static class21 field7934;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ltga;")
    public static class63 field7930;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3298(byte arg0) {
        if (arg0 == -22) {
            field7934 = null;
            field7929 = null;
            field7930 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7928++;
        throw new IllegalStateException();
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
            field7929[var0] = var1;
        }
        field7932 = -1;
        field7933 = false;
    }
}
