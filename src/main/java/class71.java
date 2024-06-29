import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class71 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1180 = -1;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lcba;")
    public static class471 field1179 = new class471(96, 12);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Ltl;")
    public static class531 field1181 = new class531("LIVE", 0);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static void method575(byte arg0) {
        field1181 = null;
        if (arg0 < -109) {
            field1179 = null;
        }
    }
}
