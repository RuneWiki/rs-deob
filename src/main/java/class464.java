import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class464 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Z")
    public static boolean field6311 = false;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "[I")
    public static int[] field6310 = new int[3];

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field6309 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method2681(int arg0) {
        field6310 = null;
        if (arg0 != -1) {
            field6310 = null;
        }
    }
}
