import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class400 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public static boolean field6023 = false;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    public static int[] field6024 = new int[2];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method2461(byte arg0) {
        if (arg0 == 41) {
            field6024 = null;
        }
    }
}
