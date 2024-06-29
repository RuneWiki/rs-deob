import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class119 extends class163 {

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lke;")
    public static class256 field2107 = class316.method2202("<col=ff9040>", 27626);

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "[I")
    public static int[] field2105 = new int[128];

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lke;")
    public static class256 field2106 = class316.method2202("(U5", 27626);

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field2119 = 128;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public int field2104;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public int field2117;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "Lae;")
    public static class100 field2111;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lrd;")
    public static class135 field2102;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Lng;")
    public static class138 field2112;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "Lla;")
    public class188 field2116;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "Lla;")
    public class188 field2122;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Lke;")
    public class256 field2108;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "Z")
    public boolean field2103;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "Z")
    public static boolean field2121;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "[Ljava/lang/Object;")
    public Object[] field2114;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V", line = 7)
    public static void method808(int arg0) {
        field2112 = null;
        field2102 = null;
        field2106 = null;
        field2111 = null;
        field2105 = null;
        field2107 = null;
        if (arg0 <= 72) {
            method810(11, 36, 5);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lra;B)V", line = 27)
    public static final void method809(class41 arg0, byte arg1) {
        field2110++;
        if (class161.field2859 != null) {
            try {
                class161.field2859.method905(0L, (byte) 53);
                class161.field2859.method904(24, arg0.field738, arg0.field772, 1625757712);
            } catch (Exception var3) {
            }
        }
        if (arg1 != 93) {
            method810(50, -18, 95);
        }
        arg0.field738 += 24;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)I", line = 86)
    public static final int method810(int arg0, int arg1, int arg2) {
        field2115++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 25709) {
            field2102 = (class135) null;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
