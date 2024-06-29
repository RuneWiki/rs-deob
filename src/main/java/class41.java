import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Llc;")
    public static class86 field577;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method315(byte arg0) {
        if (arg0 == -70) {
            field577 = null;
        }
    }
}
