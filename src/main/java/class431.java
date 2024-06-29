import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class431 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public static boolean field6127 = false;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6129 = null;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lik;")
    public static class410 field6128 = new class410(30);

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[I")
    public static int[] field6130;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method2678(byte arg0) {
        field6129 = null;
        field6128 = null;
        field6130 = null;
        if (arg0 >= -50) {
            field6127 = false;
        }
    }
}
