import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class137 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
    public static int[] field1502 = new int[500];

    @OriginalMember(owner = "client!st", name = "d", descriptor = "F")
    public static float field1504;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method767(byte arg0) {
        field1502 = null;
        if (arg0 <= 5) {
            field1502 = null;
        }
    }
}
