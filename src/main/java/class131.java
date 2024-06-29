import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class131 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lgb;")
    public static class149 field2030 = new class149();

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Luf;")
    public static class176 field2028;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method921(boolean arg0) {
        field2030 = null;
        if (!arg0) {
            field2030 = null;
        }
        field2028 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method922(String arg0, int arg1) {
        field2027++;
        if (arg1 >= -105) {
            field2030 = null;
        }
        System.out.println("Error: " + class288.method1940("\n", (byte) -50, arg0, "%0a"));
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
    public static final boolean method923(byte arg0) {
        field2031++;
        if (arg0 <= 104) {
            method923((byte) -79);
        }
        try {
            if (class295.field4641 == 2) {
                if (class295.field4630 == null) {
                    class295.field4630 = class128.method908(class219.field3420, class32.field516, class13.field223);
                    if (class295.field4630 == null) {
                        return false;
                    }
                }
                if (class136.field2118 == null) {
                    class136.field2118 = new class41(class32.field517, class35.field568);
                }
                if (class61.field988.method1771(class136.field2118, 22050, class295.field4630, 0, class43.field690)) {
                    class61.field988.method1762(-124);
                    class61.field988.method1746(class174.field2583, (byte) -83);
                    class61.field988.method1735(class72.field1140, class295.field4630, -6007);
                    class136.field2118 = null;
                    class295.field4630 = null;
                    class219.field3420 = null;
                    class295.field4641 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class61.field988.method1764(1407621134);
            class219.field3420 = null;
            class295.field4630 = null;
            class295.field4641 = 0;
            class136.field2118 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class140.field2155 = class188.field3010 * arg4 / arg3;
        field2029++;
        class250.field3848 = class221.field3453 * arg2 / arg1;
        class116.field1808 = -1;
        class197.field3094 = arg0;
        class273.method1840((byte) -82);
    }
}
