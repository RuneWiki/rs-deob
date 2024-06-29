import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class111 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lrd;")
    public static class114 field2579 = class84.method656(" )2> @whi@", (byte) 127);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lrd;")
    private static class114 field2584 = class84.method656("Loading sprites )2 ", (byte) 124);

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lrd;")
    public static class114 field2589 = class84.method656("Bitte versuchen Sie)1", (byte) 124);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lrd;")
    public static class114 field2578 = field2584;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lrd;")
    private static class114 field2587 = class84.method656("Please wait 1 minute and try again)3", (byte) 121);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lrd;")
    public static class114 field2592 = field2587;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lrd;")
    private static class114 field2590 = class84.method656("Please wait 5 minutes before trying again)3", (byte) 127);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lrd;")
    public static class114 field2595 = field2590;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lrd;")
    public static class114 field2586 = field2587;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Lrd;")
    public static class114 field2597 = class84.method656("da dieser Computer gegen unsere ", (byte) 127);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Lrd;")
    public static class114 field2600 = class84.method656("l", (byte) 122);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Ldd;")
    public static class26 field2585 = new class26(50);

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lrd;")
    public static class114 field2602 = class84.method656("@cya@", (byte) 124);

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Lmd;")
    public static class84 field2601 = new class84();

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public int field2593;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public int field2596;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lpb;")
    public static class100 field2580;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lha;")
    public class50 field2591;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    public static int[] field2583;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "[I")
    public static int[] field2594;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method844(int arg0) {
        class42.field860 = true;
        field2598++;
        if (arg0 != 9236) {
            method845((byte) 107);
        }
        class3.method12(false);
        if (class123.field2905 != -1) {
            boolean var2 = class144.method1147(0, 261, 190, 0, false, 1, class123.field2905);
            if (!var2) {
                class24.field460 = true;
            }
        } else if (class123.field2906[class102.field2351] != -1) {
            boolean var1 = class144.method1147(0, 261, 190, 0, false, 1, class123.field2906[class102.field2351]);
            if (!var1) {
                class24.field460 = true;
            }
        }
        if (class116.field2714 && class14.field304 == 1) {
            if (class46.field941 == 1) {
                class141.method1123(190);
            } else {
                class24.method171(arg0 ^ 0xFFFFDBED);
            }
        }
        class92.method707((byte) -7);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method845(byte arg0) {
        field2583 = null;
        field2587 = null;
        if (arg0 >= -41) {
            return;
        }
        field2600 = null;
        field2594 = null;
        field2589 = null;
        field2592 = null;
        field2595 = null;
        field2585 = null;
        field2597 = null;
        field2579 = null;
        field2586 = null;
        field2601 = null;
        field2602 = null;
        field2578 = null;
        field2584 = null;
        field2580 = null;
        field2590 = null;
    }
}
