import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class171 {

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3034 = 0;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lqk;")
    private static class207 field3032 = class24.method212(255, "rating: ");

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lqk;")
    public static class207 field3030 = field3032;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lqk;")
    public static class207 field3031 = class24.method212(255, "Schlie-8en");

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ldk;")
    public static class275 field3028 = new class275(8);

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lqk;")
    public static class207 field3036 = class24.method212(255, ")2");

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field3032 = null;
        field3030 = null;
        field3031 = null;
        if (arg0 != 116) {
            method1227((byte) 105);
        }
        field3028 = null;
        field3036 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
    public static final void method1228(boolean arg0) {
        field3033++;
        if (!arg0) {
            method1228(true);
        }
        for (class79 var1 = (class79) class78.field1415.method922((byte) 33); var1 != null; var1 = (class79) class78.field1415.method928(-97)) {
            if (var1.field1452) {
                var1.method599(61);
            }
        }
        for (class79 var2 = (class79) class47.field942.method922((byte) 53); var2 != null; var2 = (class79) class47.field942.method928(-111)) {
            if (var2.field1452) {
                var2.method599(116);
            }
        }
    }
}
