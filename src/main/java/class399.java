import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class399 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field5603 = -1;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
    public static int[] field5605 = new int[3];

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2333(int arg0) {
        field5605 = null;
        if (arg0 != -31759) {
            method2333(42);
        }
    }
}
