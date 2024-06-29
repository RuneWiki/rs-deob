import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class93 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lf;")
    public static class36[] field2334 = new class36[32768];

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[Lp;")
    public static class101[] field2340 = new class101[2048];

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lrd;")
    public static class117 field2336 = class95.method812("Ung-Ultiges Anmelde)2Paket)3", (byte) 8);

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public static int[] field2344 = new int[5];

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lrd;")
    private static class117 field2348 = class95.method812("go back to the main RuneScape webpage", (byte) 8);

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lrd;")
    public static class117 field2343 = field2348;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lrd;")
    public static class117 field2349 = class95.method812("@red@", (byte) 8);

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "J")
    public static long field2338;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "J")
    public static long field2339;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Lra;")
    public static class114 field2342;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lge;")
    public static class47 field2341;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method805(boolean arg0) {
        field2334 = null;
        if (arg0) {
            field2335 = 100;
        }
        field2344 = null;
        field2336 = null;
        field2341 = null;
        field2343 = null;
        field2342 = null;
        field2340 = null;
        field2349 = null;
        field2348 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)I")
    public static final int method806(boolean arg0, int arg1, int arg2) {
        field2337++;
        if (!arg0) {
            method806(false, 4, -2);
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
    public static final int method807(byte arg0) {
        field2345++;
        if (arg0 <= 38) {
            return 61;
        } else {
            int var1 = class133.method1091(class120.field2940, class4.field105, (byte) -126, class45.field1271);
            return var1 - class38.field1117 >= 800 || (class124.field3002[class120.field2940][class45.field1271 >> 7][class4.field105 >> 7] & 0x4) == 0 ? 3 : class120.field2940;
        }
    }
}
