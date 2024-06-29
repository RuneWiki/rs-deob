import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field678 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[J")
    public static long[] field679 = new long[32];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[Lje;")
    public static class67[] field684 = new class67[100];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lje;")
    public static class67 field687 = class85.method592(255, "Schlie-8en");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lje;")
    public static class67 field685 = class85.method592(255, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Z")
    public static boolean field691 = false;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lje;")
    public static class67 field686 = class85.method592(255, "Freie Welt");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lje;")
    public static class67 field689 = class85.method592(255, "jolt");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        field686 = null;
        if (arg0 >= -54) {
            return;
        }
        field687 = null;
        field679 = null;
        field684 = null;
        field689 = null;
        field685 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method237(int arg0) {
        field683++;
        if (arg0 != -16542) {
            field688 = -90;
        }
        while (true) {
            class4 var1 = class6.field142;
            class98 var2;
            synchronized (class6.field142) {
                var2 = (class98) class133.field2999.method22((byte) 108);
            }
            if (var2 == null) {
                return;
            }
            var2.field2185.method1057(var2.field2182, (int) var2.field300, var2.field2191, false, 255);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lta;I)V")
    public static final void method238(class133 arg0, int arg1) {
        if (arg0.field2969 == 0) {
            arg0.field2972 = 1024;
        }
        field681++;
        arg0.field2934 = 0;
        if (arg0.field2969 == 1) {
            arg0.field2972 = 1536;
        }
        int var2 = arg0.field2956 - class34.field627;
        int var3 = arg0.field2978 * 128 + arg0.field2958 * 64;
        if (arg0.field2969 == 2) {
            arg0.field2972 = 0;
        }
        int var4 = arg0.field2953 * 128 + arg0.field2958 * 64;
        arg0.field2963 += (var3 - arg0.field2963) / var2;
        arg0.field2957 += (var4 - arg0.field2957) / var2;
        if (~arg0.field2969 == arg1) {
            arg0.field2972 = 512;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLje;)V")
    public static final void method239(byte arg0, class67 arg1) {
        field682++;
        if (class138.field3110 == null) {
            return;
        }
        long var2 = arg1.method476((byte) 77);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class138.field3110.length && class138.field3110[var4].field300 != var2) {
            var4++;
        }
        if (arg0 == -105 && (var4 < class138.field3110.length && class138.field3110[var4] != null)) {
            class69.field1399.method285(107, (byte) 64);
            class137.field3092++;
            class69.field1399.method656(2, class138.field3110[var4].field300);
        }
    }
}
