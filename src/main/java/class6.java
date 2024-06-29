import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lt;")
    public static class31 field116 = class11.method64(94, " )2 ");

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lt;")
    public static class31 field117 = class11.method64(120, "Mining Site");

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lt;")
    public static class31 field121 = class11.method64(117, "Axe Shop");

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Lt;")
    public static class31 field122 = class11.method64(-37, "Transportation");

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lt;")
    public static class31 field123 = class11.method64(-121, "Mining Shop");

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lt;")
    public static class31 field119 = class11.method64(120, "Saw Mill");

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lt;")
    public static class31 field124 = class11.method64(-74, "Jewellery");

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "J")
    public static volatile long field114 = 0L;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[J")
    public static long[] field126 = new long[32];

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "I")
    public static volatile int field118 = 0;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[I")
    public static int[] field115;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "[Ln;")
    public static class26[] field120;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Z)V", line = 44)
    public static void method48(boolean arg0) {
        field117 = null;
        field116 = null;
        field119 = null;
        field126 = null;
        field120 = null;
        field122 = null;
        field121 = null;
        field123 = null;
        field115 = null;
        if (!arg0) {
            method48(true);
        }
        field124 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lt;Lv;Lt;I)[Lja;", line = 91)
    public static final class19[] method49(class31 arg0, class33 arg1, class31 arg2, int arg3) {
        int var4 = arg1.method193(arg0, arg3 ^ 0xFFFFFFAF);
        if (arg3 == 32) {
            int var5 = arg1.method197(arg2, var4, (byte) 15);
            return class15.method92(false, var5, var4, arg1);
        } else {
            return (class19[]) null;
        }
    }
}
