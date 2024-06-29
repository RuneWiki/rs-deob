import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class304 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Leh;")
    public static class246 field4434 = new class246(39, -1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method1852(byte arg0) {
        if (arg0 != -123) {
            method1853(92);
        }
        field4434 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method1853(int arg0) {
        field4433++;
        if (class472.field6578 == -1) {
            return;
        }
        int var1 = class22.field277.method1192(true);
        if (arg0 != 39) {
            method1852((byte) -86);
        }
        int var2 = class22.field277.method1194(arg0 - 3);
        class432 var3 = (class432) class323.field4718.method2655(15152);
        if (var3 != null) {
            var1 = var3.method1084((byte) -102);
            var2 = var3.method1082(-769);
        }
        class196.method1234(-16277, var1, class273.field4048, class147.field1956, 0, var2, 0, 0, 0, class472.field6578);
        if (class378.field5357 != null) {
            class247.method1565(var2, var1, false);
        }
    }
}
