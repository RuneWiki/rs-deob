import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class567 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field8270 = -1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Z")
    public static boolean field8268 = true;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lgk;B)Lub;")
    public static final class145 method3267(class540 arg0, byte arg1) {
        if (arg1 != -51) {
            field8270 = -23;
        }
        field8271++;
        int var2 = arg0.method3169(26488);
        return new class145(var2);
    }
}
