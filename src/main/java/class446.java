import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class446 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Leh;")
    public static class246 field6231 = new class246(43, -2);

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[I")
    public static int[] field6232 = new int[32];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V")
    public static void method2604(boolean arg0) {
        field6231 = null;
        if (arg0) {
            field6232 = null;
        }
    }
}
