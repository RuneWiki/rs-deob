import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class154 extends class262 {

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public int field2084 = -1;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Ljb;")
    public static class519 field2088 = new class519(116, 28);

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field2089 = -1;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Ljava/lang/String;")
    public String field2082;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "Ljava/lang/String;")
    public String field2085;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2083;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)Leaa;", line = 3)
    public final class526 method1070(int arg0) {
        ++field2087;
        if (arg0 != 9342) {
            method1072((byte) 15);
        }
        return class438.field6320[super.field3869];
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V", line = 25)
    public static void method1071(int arg0) {
        if (arg0 == 28) {
            field2083 = null;
            field2088 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Lmr;", line = 36)
    public static final class154 method1072(byte arg0) {
        if (arg0 >= -4) {
            method1071(-6);
        }
        ++field2081;
        return ~class310.field4388.length < ~class247.field3222 ? class310.field4388[class247.field3222++] : null;
    }
}
