import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class241 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lrp;")
    public static class280 field3154;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[Lic;")
    public static class617[] field3153;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static void method1486(boolean arg0) {
        field3153 = null;
        if (!arg0) {
            field3154 = null;
        }
    }
}
