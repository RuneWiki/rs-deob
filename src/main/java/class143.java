import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class143 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2238 = "Continue";

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
    public static int[] field2241 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "B")
    public byte field2239;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Ljava/lang/String;")
    public String field2236;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Ljava/lang/String;")
    public String field2240;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Ljava/lang/String;")
    public String field2242;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2238 = null;
        field2241 = null;
        if (arg0 != 4) {
            method1133(20);
        }
    }
}
