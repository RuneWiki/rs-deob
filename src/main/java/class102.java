import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Leb;")
    public static class31 field2455 = new class31(200);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lqf;")
    public static class117 field2465 = class72.method514(115, "Art");

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lqf;")
    public static class117 field2468 = class72.method514(121, "(Y ");

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lqf;")
    private static class117 field2463 = class72.method514(116, " ");

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lqf;")
    private static class117 field2469 = class72.method514(102, "Service unavailable)3");

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lqf;")
    public static class117 field2464 = field2463;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lqf;")
    public static class117 field2467 = field2469;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
    public static int[] field2470 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lee;")
    public class34 field2457;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lvc;")
    public static final class146 method789(byte arg0) {
        field2466++;
        if (arg0 != -62) {
            field2464 = null;
        }
        try {
            return (class146) Class.forName("ke").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class140();
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method790(int arg0) {
        field2463 = null;
        if (arg0 != 0) {
            method790(-118);
        }
        field2465 = null;
        field2470 = null;
        field2468 = null;
        field2455 = null;
        field2469 = null;
        field2464 = null;
        field2467 = null;
    }
}
