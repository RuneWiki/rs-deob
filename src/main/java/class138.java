import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class138 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Leg;")
    public static class37 field2358 = class174.method1167("loc", 69);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2360 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[I")
    public static int[] field2355;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        field2356++;
        if (!class174.field2924) {
            return;
        }
        class237 var1 = class47.method309(128, class129.field2150, class45.field709);
        if (var1 != null && var1.field4150 != null) {
            class85 var2 = new class85();
            var2.field1346 = var1;
            var2.field1339 = var1.field4150;
            class274.method1841(var2, -82);
        }
        if (arg0 != 77) {
            field2358 = null;
        }
        class174.field2924 = false;
        class121.method856(24665, var1);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method974(int arg0) {
        field2355 = null;
        field2358 = null;
        if (arg0 != 0) {
            method974(33);
        }
    }
}
