import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class272 {

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "Z")
    public static boolean field3438 = false;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "Lcga;")
    public static class449 field3437 = new class449(14, 8);

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "Lgga;")
    public class272 field3436;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "Lgga;")
    public class272 field3439;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public final void method1619(byte arg0) {
        field3440++;
        if (this.field3436 == null) {
            return;
        }
        this.field3436.field3439 = this.field3439;
        this.field3439.field3436 = this.field3436;
        this.field3439 = null;
        if (arg0 > -72) {
            this.field3439 = null;
        }
        this.field3436 = null;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)V")
    public static void method1620(boolean arg0) {
        if (!arg0) {
            method1620(false);
        }
        field3437 = null;
    }
}
