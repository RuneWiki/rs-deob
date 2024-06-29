import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class414 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[Z")
    public static boolean[] field5732 = new boolean[100];

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5731 = 0;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2408(boolean arg0) {
        if (!arg0) {
            method2408(false);
        }
        field5732 = null;
    }
}
