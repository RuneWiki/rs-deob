import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class359 {

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "[I")
    public static int[] field5084 = new int[5];

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "Laq;")
    public static class494 field5083 = new class494(30);

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "Z")
    public static boolean field5086 = false;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "F")
    public static float field5082;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
    public static void method2168(boolean arg0) {
        if (arg0) {
            method2168(false);
        }
        field5083 = null;
        field5084 = null;
    }
}
