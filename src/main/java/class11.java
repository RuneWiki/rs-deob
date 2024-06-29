import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class11 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "J")
    public long field172 = 0L;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Z")
    public static boolean field176 = true;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lbo;")
    public static class16 field167 = new class16();

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[J")
    public static long[] field179 = new long[256];

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Z")
    public static volatile boolean field178 = false;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field181;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lh;")
    public class111 field165;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lh;")
    public class111 field174;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lph;")
    public static class361 field180;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 13)
    public static final int method63(int arg0, int arg1) {
        if (arg1 < 35) {
            method64((byte) -100, (class361) null);
        }
        field171++;
        return arg0 & 0x7F;
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
            field179[var0] = var1;
        }
        field181 = null;
        field182 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLph;)V", line = 33)
    public static final void method64(byte arg0, class361 arg1) {
        field169++;
        if (arg0 > -22) {
            method63(-108, -125);
        }
        class20.field312 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 44)
    public static void method65(int arg0) {
        field179 = null;
        field180 = null;
        field167 = null;
        field181 = null;
        if (arg0 != 256) {
            field181 = (String[]) null;
        }
    }
}
