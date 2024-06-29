import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class182 extends class430 {

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "Lmfa;")
    public static class407 field2509 = new class407(0);

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public int field2505;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public int field2507;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "Lsk;")
    public static class121 field2510;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
    public static void method1285(boolean arg0) {
        if (!arg0) {
            method1285(true);
        }
        field2510 = null;
        field2509 = null;
    }
}
