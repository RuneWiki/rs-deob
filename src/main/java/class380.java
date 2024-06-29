import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class380 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lfn;")
    public static class52 field5395 = new class52(40, 6);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5396 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 7)
    public static void method2280(byte arg0) {
        if (arg0 != 42) {
            field5395 = null;
        }
        field5395 = null;
        field5396 = null;
    }
}
