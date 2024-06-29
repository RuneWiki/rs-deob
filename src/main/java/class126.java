import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class126 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field1867;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[[[B")
    public static byte[][][] field1868;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method853(int arg0) {
        class179.field2790.method1420(-1);
        field1871++;
        if (arg0 != 2745) {
            method853(60);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method854(byte arg0) {
        field1867 = null;
        field1868 = null;
        if (arg0 != -75) {
            method853(-22);
        }
    }
}
