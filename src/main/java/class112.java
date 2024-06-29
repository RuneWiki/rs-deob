import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class112 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field2393 = 0;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field2410 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2389 = 1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2405 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lod;")
    public static class101 field2391 = class46.method335(-113, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Lod;")
    private static class101 field2408 = class46.method335(81, "K");

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lod;")
    public static class101 field2402 = field2408;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lod;")
    private static class101 field2413 = class46.method335(62, "Attack");

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Lod;")
    public static class101 field2400 = field2413;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "Lod;")
    public static class101 field2399 = field2408;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lcb;")
    public static class17 field2398 = new class17(50);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lod;")
    public static class101 field2415 = class46.method335(-122, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Lcb;")
    public static class17 field2416 = new class17(64);

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2417 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lh;")
    public class49 field2409;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field2416 = null;
        field2399 = null;
        field2413 = null;
        field2400 = null;
        field2398 = null;
        field2415 = null;
        field2408 = null;
        field2391 = null;
        if (arg0 != -4681) {
            field2405 = -3;
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
    public static final int method823(int arg0, int arg1, int arg2) {
        field2412++;
        int var3 = 0;
        if (arg1 != 1) {
            method823(-116, -9, -58);
        }
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
