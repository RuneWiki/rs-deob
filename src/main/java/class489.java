import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class489 {

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
    public static int[] field6914 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "Lgda;")
    public static class53 field6913 = new class53(13, 7);

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[I")
    public static int[] field6915 = new int[32];

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public static void method2922(byte arg0) {
        field6913 = null;
        if (arg0 < -19) {
            field6915 = null;
            field6914 = null;
        }
    }
}
