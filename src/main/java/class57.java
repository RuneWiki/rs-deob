import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class57 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Ljava/lang/String;")
    public static String field825 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Li;")
    public static class58 field829 = new class58(32);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method366(int arg0) {
        field829 = null;
        if (arg0 == 0) {
            field825 = null;
        }
    }
}
