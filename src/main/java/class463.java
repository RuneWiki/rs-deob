import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class463 {

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[I")
    public static int[] field6225 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6224 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2635(boolean arg0) {
        field6225 = null;
        if (arg0) {
            field6223 = -57;
        }
    }
}
