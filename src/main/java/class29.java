import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field934 = -1;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "J")
    public static long field936 = 0L;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "[I")
    public static int[] field937 = new int[32];

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
    public static void method495(boolean arg0) {
        if (arg0) {
            field937 = null;
        }
    }
}
