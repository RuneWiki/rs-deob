import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class67 {

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "[I")
    public static int[] field992 = new int[1000];

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "F")
    public static float field991;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method657(int arg0) {
        if (arg0 != 1000) {
            field991 = -1.4745948F;
        }
        field992 = null;
    }
}
