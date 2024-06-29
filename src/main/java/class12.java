import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 {

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[I")
    public static int[] field174 = new int[256];

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Lk;")
    public static class21 field175 = class14.method92((byte) 57, "Loom");

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lk;")
    public static class21 field178;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lk;")
    public static class21 field177;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Lk;")
    public static class21 field179;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Lk;")
    public static class21 field181;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lk;")
    public static class21 field182;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "I")
    public static volatile int field180;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lk;")
    public static class21 field176;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "J")
    public static long field183;

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
            field174[var0] = var1;
        }
        field178 = class14.method92((byte) 57, " )2 ");
        field177 = class14.method92((byte) 57, "Gem Shop");
        field179 = class14.method92((byte) 57, "Spice Shop");
        field181 = class14.method92((byte) 57, "details)3dat");
        field182 = class14.method92((byte) 57, "mapfunction");
        field180 = -1;
        field176 = class14.method92((byte) 57, "Platebody Shop");
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 67)
    public static void method83(int arg0) {
        field181 = null;
        field174 = null;
        field179 = null;
        field182 = null;
        field176 = null;
        if (arg0 >= -6) {
            method83(83);
        }
        field175 = null;
        field178 = null;
        field177 = null;
    }
}
