import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class270 {

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Z")
    public static boolean field4778 = true;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field4773 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Leb;")
    public static class230 field4772 = class68.method589(0, "Fertigkeit: ");

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field4777 = 0;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[S")
    public static short[] field4779 = new short[] { 20, 19, 37, 3, 12, 48, 32, 59 };

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Leb;")
    private static class230 field4775 = class68.method589(0, "Prepared sound engine");

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Leb;")
    public static class230 field4776 = field4775;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[Lmj;")
    public static class111[] field4774;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method1850(byte arg0) {
        field4779 = null;
        field4774 = null;
        field4776 = null;
        field4775 = null;
        field4772 = null;
        if (arg0 >= -118) {
            field4773 = -20;
        }
    }
}
