import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 extends class34 {

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1432 = 0;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[Z")
    public static boolean[] field1431 = new boolean[112];

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method629(boolean arg0) {
        if (arg0) {
            field1432 = 88;
        }
        field1431 = null;
    }
}
