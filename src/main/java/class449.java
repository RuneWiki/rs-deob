import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class449 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Z")
    public static boolean field6558 = true;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
    public static int[] field6563 = new int[4096];

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Z")
    public static boolean field6561 = true;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field6566 = 0;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
    public static boolean field6560 = false;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Ldb;")
    public static class26 field6565;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lr;")
    public static class63 field6564;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method2816(int arg0) {
        field6564 = null;
        field6565 = null;
        if (arg0 != 18391) {
            field6560 = true;
        }
        field6563 = null;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static final void method2817(int arg0) {
        field6562++;
        if (arg0 != 25422) {
            method2818(-61);
        }
        class37.field590.method204((byte) 56);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
    public static final void method2818(int arg0) {
        field6567++;
        for (class191 var1 = (class191) class45.field669.method2649(0); var1 != null; var1 = (class191) class45.field669.method2656(0)) {
            class23 var2 = var1.field2663;
            if (class193.field2688 != var2.field5291 || class50.field698 > var2.field386) {
                var1.method2574((byte) 115);
                var2.method196(false);
            } else if (var2.field383 <= class50.field698) {
                if (var2.field365 > 0) {
                    class129 var3 = class23.field408[var2.field365 - 1];
                    if (var3 != null && var3.field5284 >= 0 && (class324.field4652 * 128) > var3.field5284 && var3.field5298 >= 0 && var3.field5298 < class336.field4964 * 128) {
                        var2.method199(class50.field698, 7403, class139.method935(var3.field5298, -117, var3.field5284, var2.field5291) - var2.field397, var3.field5284, var3.field5298);
                    }
                }
                if (var2.field365 < 0) {
                    int var4 = -var2.field365 - 1;
                    class194 var5;
                    if (class452.field6590 == var4) {
                        var5 = class100.field1350;
                    } else {
                        var5 = class125.field1664[var4];
                    }
                    if (var5 != null && var5.field5284 >= 0 && class324.field4652 * 128 > var5.field5284 && var5.field5298 >= 0 && class336.field4964 * 128 > var5.field5298) {
                        var2.method199(class50.field698, 7403, class139.method935(var5.field5298, arg0 + 5740, var5.field5284, var2.field5291) - var2.field397, var5.field5284, var5.field5298);
                    }
                }
                var2.method197(-1, class175.field2280);
                class84.method524(var2, true);
            }
        }
        if (arg0 != -5815) {
            field6566 = -19;
        }
    }
}
