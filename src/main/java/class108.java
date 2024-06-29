import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lv;")
    public static class146 field2574 = class159.method1226((byte) -37, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lv;")
    public static class146 field2575 = class159.method1226((byte) -37, "Ausw-=hlen");

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2577 = -1;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lv;")
    private static class146 field2580 = class159.method1226((byte) -37, "Login limit exceeded)3");

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lv;")
    public static class146 field2572 = field2580;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lv;")
    private static class146 field2581 = class159.method1226((byte) -37, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lv;")
    public static class146 field2573 = field2581;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lvf;")
    public static class152 field2578 = new class152();

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lv;")
    public static class146 field2582 = class159.method1226((byte) -37, "nav");

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lla;")
    public static class77 field2584;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public static final int method864(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2572 = null;
        }
        field2576++;
        long var3 = (long) ((arg0 << 16) + arg2);
        return class145.field3322 != null && class145.field3322.field679 == var3 ? class35.field775.field2304 * 99 / (class35.field775.field2320.length - class145.field3322.field3231) + 1 : 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method865(int arg0) {
        field2573 = null;
        field2575 = null;
        field2582 = null;
        field2580 = null;
        field2578 = null;
        field2584 = null;
        field2581 = null;
        field2572 = null;
        field2574 = null;
        if (arg0 != -1) {
            field2575 = null;
        }
    }
}
