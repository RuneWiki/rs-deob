import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class126 extends class256 {

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lw;")
    public class140 field2433;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Lii;")
    public static class244 field2435 = new class244();

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lbj;")
    public static class151 field2437;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method891(boolean arg0) {
        if (arg0) {
            field2436 = 11;
        }
        field2437 = null;
        field2435 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lw;)V")
    public class126(class140 arg0) {
        this.field2433 = arg0;
    }
}
