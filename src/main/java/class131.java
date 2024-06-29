import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class131 {

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2134 = null;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Ld;")
    public static class267 field2129;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Lla;")
    public static class422 field2130;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lla;")
    public static class422 field2136;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "[I")
    public static int[] field2138;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1059(int arg0, int arg1, int arg2) {
        field2132++;
        if (arg0 != 33) {
            field2129 = null;
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V", line = 21)
    public static void method1060(int arg0) {
        field2134 = null;
        field2138 = null;
        field2136 = null;
        if (arg0 != 25306) {
            field2130 = null;
        }
        field2130 = null;
        field2129 = null;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)I", line = 37)
    public static final int method1061(int arg0, int arg1, int arg2) {
        field2137++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        if (arg1 != 2) {
            method1061(115, 94, -27);
        }
        double var5 = Math.log((double) arg0) / Math.log(2.0D);
        double var7 = var5 + (var3 - var5) * Math.random();
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }
}
