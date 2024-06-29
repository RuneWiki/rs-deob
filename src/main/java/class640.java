import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class640 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lgg;")
    public static class398 field8988 = new class398();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method3618(int arg0) {
        if (arg0 > -88) {
            method3619(-122);
        }
        field8988 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static final void method3619(int arg0) {
        class293.field4499 = class594.field8343.field858 + class594.field8343.field861 + 2;
        field8987++;
        class432.field6335 = class632.field8881.field861 + class632.field8881.field858 + 2;
        class8.field84 = new String[500];
        int var1 = 0;
        if (arg0 != 30901) {
            field8988 = null;
        }
        while (class8.field84.length > var1) {
            class8.field84[var1] = "";
            var1++;
        }
        class400.method2484(26852, class641.field8993.method3621(arg0 - 30811, class467.field6804));
    }
}
