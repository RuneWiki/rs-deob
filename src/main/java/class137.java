import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class137 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field1815 = 0;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1811 = "Loading defaults - ";

    @OriginalMember(owner = "client!od", name = "c", descriptor = "F")
    public static float field1813;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lqj;")
    public static class238 field1814;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static final void method911(byte arg0) {
        if (arg0 <= -35) {
            class24.field417.method2128(class274.field4031, class199.field2838, class246.field3429);
            field1812++;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method912(int arg0) {
        field1814 = null;
        if (arg0 > -57) {
            field1814 = null;
        }
        field1811 = null;
    }
}
