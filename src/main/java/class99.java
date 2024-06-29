import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class99 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
    public static int[] field1311;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V", line = 9)
    public static void method687(boolean arg0) {
        if (!arg0) {
            field1311 = null;
        }
    }
}
