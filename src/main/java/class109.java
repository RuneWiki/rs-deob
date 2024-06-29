import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class109 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field1738 = -1;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[Lwl;")
    public static class304[] field1740 = new class304[14];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    public static int[] field1741 = new int[128];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lag;")
    public static class211 field1737;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ldk;")
    public static class251 field1739;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method770(byte arg0) {
        class50.field837.method1255(arg0 - 96);
        field1735++;
        if (arg0 != 14) {
            field1737 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method771(int arg0) {
        field1739 = null;
        field1741 = null;
        field1740 = null;
        if (arg0 < 5) {
            method770((byte) -10);
        }
        field1737 = null;
    }
}
