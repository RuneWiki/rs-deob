import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class162 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
    public static int[] field2112 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2111;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1013(byte arg0) {
        int var1 = -107 / ((-arg0 - 49) / 60);
        field2111 = null;
        field2112 = null;
    }
}
