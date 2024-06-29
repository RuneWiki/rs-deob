import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class115 {

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2086 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2084 = 1;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lp;")
    public static class280 field2087 = class18.method140((byte) -119, "brillant1:");

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
    public static boolean field2088 = false;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lp;")
    private static class280 field2090 = class18.method140((byte) -128, "glow3:");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lp;")
    public static class280 field2085 = field2090;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lp;")
    public static class280 field2083 = field2090;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lp;")
    public static class280 field2093 = class18.method140((byte) -122, " loggt sich aus)3");

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2091 = -1;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZI)I")
    public static final int method836(int arg0, boolean arg1, int arg2) {
        field2089++;
        if (arg2 == -1) {
            return 12345678;
        }
        if (!arg1) {
            field2090 = null;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method837(byte arg0) {
        field2087 = null;
        field2093 = null;
        if (arg0 == 125) {
            field2085 = null;
            field2083 = null;
            field2090 = null;
        }
    }
}
