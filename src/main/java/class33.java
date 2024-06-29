import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class33 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lvf;")
    public static class265 field818 = class87.method582(-46, "::clientjs5drop");

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[Lhg;")
    public static class146[] field817;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method267(byte arg0) {
        if (arg0 == -113) {
            field817 = null;
            field818 = null;
        }
    }
}
