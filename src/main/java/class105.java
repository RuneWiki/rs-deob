import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[Lqf;")
    public static class117[] field2484 = new class117[4];

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lec;")
    private static class32 field2485 = class73.method594("Loaded update list", true);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lec;")
    public static class32 field2487 = field2485;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lec;")
    private static class32 field2483 = class73.method594("Connecting to server)3)3)3", true);

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lec;")
    public static class32 field2498 = class73.method594(":duelreq:", true);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lec;")
    public static class32 field2489 = field2483;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lec;")
    private static class32 field2488 = class73.method594("button near the top of that page)3", true);

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lec;")
    public static class32 field2491 = field2488;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lec;")
    private static class32 field2499 = class73.method594("Members only world", true);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lec;")
    public static class32 field2486 = field2499;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lec;")
    public static class32 field2495 = class73.method594("Lade Schrifts-=tze )2 ", true);

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lec;")
    public static class32 field2502 = class73.method594("title_mute", true);

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lec;")
    private static class32 field2500 = class73.method594("Existing User", true);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lec;")
    public static class32 field2494 = field2500;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lea;")
    public static class30 field2501;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method858(int arg0) {
        field2492++;
        if (!class151.field3470) {
            return;
        }
        class36 var1 = class130.method1002(class146.field3321, class43.field1003, (byte) -29);
        if (var1 != null && var1.field803 != null) {
            class12 var2 = new class12();
            var2.field209 = var1;
            var2.field208 = var1.field803;
            class158.method1224(var2, (byte) -73);
        }
        class151.field3470 = false;
        class132.method1010(var1, (byte) -104);
        if (arg0 != -8602) {
            method860((byte) 56);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method859(byte arg0) {
        if (arg0 != -26) {
            field2500 = null;
        }
        class47.field1115.method491(26);
        field2493++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method860(byte arg0) {
        field2494 = null;
        field2498 = null;
        field2484 = null;
        field2501 = null;
        field2491 = null;
        field2495 = null;
        field2502 = null;
        if (arg0 < 122) {
            method858(0);
        }
        field2499 = null;
        field2485 = null;
        field2500 = null;
        field2489 = null;
        field2487 = null;
        field2488 = null;
        field2486 = null;
        field2483 = null;
    }
}
