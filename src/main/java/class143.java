import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class143 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field2221 = 0;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public static int[] field2223 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lpp;")
    public static class464 field2220 = new class464(71, 4);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[Lhca;", line = 14)
    public static final class179[] method1056(byte arg0) {
        field2222++;
        if (arg0 != -18) {
            method1057(-107);
        }
        return new class179[] { class173.field2510, class539.field7510, class115.field1889 };
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 25)
    public static void method1057(int arg0) {
        field2223 = null;
        if (arg0 == 24170) {
            field2220 = null;
        }
    }
}
