import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class159 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Z")
    public static boolean field2070 = false;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[I")
    public static int[] field2071 = new int[4];

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[[[I")
    public static int[][][] field2072;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field2071 = null;
        if (arg0 != -16740) {
            field2072 = null;
        }
        field2072 = null;
    }
}
