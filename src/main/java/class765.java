import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class765 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lhj;")
    public static class596 field10539 = new class596(87, 12);

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lnja;")
    public static class456 field10540;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    public static void method4239(boolean arg0) {
        if (!arg0) {
            field10540 = null;
            field10539 = null;
        }
    }
}
