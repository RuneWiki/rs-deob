import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class108 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ldd;")
    private static class35 field2403 = class180.method1196((byte) -21, "Too many connections from your address)3");

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ldd;")
    public static class35 field2405 = class180.method1196((byte) 126, "Cabbage");

    @OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
    public static int[] field2407 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2402 = -1;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[Ldd;")
    public static class35[] field2404 = new class35[1000];

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ldd;")
    private static class35 field2409 = class180.method1196((byte) -40, "No reply from loginserver)3");

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ldd;")
    public static class35 field2406 = field2409;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Ldd;")
    public static class35 field2410 = field2403;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Loa;")
    public static class135 field2408;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        field2409 = null;
        field2405 = null;
        field2403 = null;
        field2410 = null;
        field2406 = null;
        field2408 = null;
        field2404 = null;
        if (arg0 >= -73) {
            method797(-30);
        }
        field2407 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method798(int arg0, int arg1, int arg2, long arg3) {
        class54 var5 = class191.field3853[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1210 != null && var5.field1210.field444 == arg3) {
            return true;
        } else if (var5.field1231 != null && var5.field1231.field3139 == arg3) {
            return true;
        } else if (var5.field1230 != null && var5.field1230.field2747 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1218; var6++) {
                if (var5.field1225[var6].field2822 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
