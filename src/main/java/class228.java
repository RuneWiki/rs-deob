import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class228 extends class29 {

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[J")
    public static long[] field3611 = new long[256];

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "[I")
    public static int[] field3618;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Ljava/lang/String;")
    public String field3613;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
    public int[] field3612;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "[I")
    public int[] field3616;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "[Lol;")
    public class246[] field3614;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field3609;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 16)
    public static void method1657(int arg0) {
        field3618 = null;
        if (arg0 != 1) {
            method1657(-22);
        }
        field3611 = null;
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
            field3611[var0] = var1;
        }
        field3618 = new int[50];
    }
}
