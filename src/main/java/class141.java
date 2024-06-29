import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class141 {

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "[I")
    public static int[] field1706 = new int[200];

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public static void method781(byte arg0) {
        if (arg0 != 42) {
            method781((byte) -98);
        }
        field1706 = null;
    }
}
