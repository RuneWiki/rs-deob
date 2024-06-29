import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 {

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "J")
    public static long field217 = 0L;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Ls;")
    public static class34 field221 = class9.method35("Transportation", 220);

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Z")
    public static boolean field222 = false;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "[I")
    public static int[] field223 = new int[256];

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "Ls;")
    public static class34 field224 = class9.method35("b12_full", 220);

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Ls;")
    public static class34 field225;

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "[I")
    public static int[] field218;

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
            field223[var0] = var1;
        }
        field225 = class9.method35("Pub)4Bar", 220);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)I", line = 39)
    public static final int method114(int arg0) {
        if (arg0 != -24983) {
            field218 = null;
        }
        if (class18.field153 == null) {
            return 0;
        } else if (class18.field153.field18 == null) {
            return field218[class18.field153.field11 & 0xFF];
        } else {
            return field218[class18.field153.field18[class31.field433] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B)J", line = 58)
    public static final synchronized long method115(byte arg0) {
        if (arg0 <= 68) {
            field220 = 20;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class34.field473) {
            class12.field118 += class34.field473 - var1;
        }
        class34.field473 = var1;
        return var1 + class12.field118;
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 92)
    public static void method116(int arg0) {
        if (arg0 != -2) {
            method115((byte) -67);
        }
        field218 = null;
        field224 = null;
        field225 = null;
        field221 = null;
        field223 = null;
    }
}
