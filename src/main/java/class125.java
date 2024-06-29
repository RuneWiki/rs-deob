import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class125 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[I")
    public static int[] field2732 = new int[256];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Ldd;")
    public static class35 field2730 = class180.method1196((byte) 127, "swe");

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ldd;")
    public static class35 field2733;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Ldd;")
    public static class35 field2736;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lgb;")
    public static class63 field2734;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
    public static final int method885(byte arg0) {
        if (arg0 == -120) {
            field2731++;
            return 6;
        } else {
            return 12;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        field2734 = null;
        field2736 = null;
        field2733 = null;
        field2732 = null;
        field2730 = null;
        if (arg0 != -20191) {
            method885((byte) 42);
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
            field2732[var0] = var1;
        }
        field2733 = class180.method1196((byte) 127, "<col=ffff00>");
        field2735 = 0;
        field2736 = null;
    }
}
