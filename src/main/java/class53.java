import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class53 extends class223 {

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
    public static boolean field582 = false;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lbg;")
    public static class324 field579 = new class324(64, 10);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Ltb;")
    public static class274 field580;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method518(boolean arg0) {
        field580 = null;
        if (!arg0) {
            method518(true);
        }
        field579 = null;
    }
}
