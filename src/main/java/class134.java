import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class134 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public static boolean field2451 = false;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Loh;")
    public static class263 field2454 = class253.method1681(-120, "Schlie-8en");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Loh;")
    private static class263 field2459 = class253.method1681(-123, "level: ");

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field2465 = 0;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Loh;")
    public static class263 field2460 = field2459;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Loh;")
    public static class263 field2457 = class253.method1681(-120, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lue;")
    public static class86 field2452;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[[Z")
    public static boolean[][] field2466;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)I")
    public static final int method882(int arg0, byte arg1) {
        if (arg1 > -18) {
            method883(55);
        }
        field2453++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method883(int arg0) {
        field2466 = null;
        field2460 = null;
        if (arg0 != 0) {
            field2462 = -34;
        }
        field2459 = null;
        field2454 = null;
        field2457 = null;
        field2452 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final void method884(int arg0) {
        class64.field1289.method830(50);
        class163.field2964.method830(50);
        int var1 = 81 % ((22 - arg0) / 34);
        field2456++;
    }
}
