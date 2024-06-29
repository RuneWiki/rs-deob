import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class17 extends class4 {

    @OriginalMember(owner = "mapview!ia", name = "k", descriptor = "Z")
    public static boolean field145 = false;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "Lf;")
    public static class10 field147 = class23.method139("Woodcutting stump", (byte) -112);

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Lf;")
    public static class10 field149 = class23.method139("fonts", (byte) -52);

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "mapview!ia", name = "l", descriptor = "Lf;")
    public static class10 field146 = class23.method139("Spinning Wheel", (byte) -93);

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "Lf;")
    public static class10 field152 = class23.method139("Bank", (byte) -74);

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Lf;")
    public static class10 field150 = class23.method139("Chainmail Shop", (byte) -57);

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "mapview!ia", name = "t", descriptor = "Lf;")
    public static class10 field154 = class23.method139("Switch to ", (byte) -76);

    @OriginalMember(owner = "mapview!ia", name = "u", descriptor = "Lf;")
    public static class10 field155 = class23.method139(" map", (byte) -74);

    @OriginalMember(owner = "mapview!ia", name = "y", descriptor = "[J")
    public static long[] field159 = new long[32];

    @OriginalMember(owner = "mapview!ia", name = "s", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "mapview!ia", name = "v", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "mapview!ia", name = "x", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "mapview!ia", name = "w", descriptor = "J")
    public static long field157;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 34)
    public static void method109(byte arg0) {
        field149 = null;
        field150 = null;
        field146 = null;
        field147 = null;
        field155 = null;
        field154 = null;
        field152 = null;
        field159 = null;
        if (arg0 > -31) {
            method109((byte) 56);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([BIII)Lf;", line = 60)
    public static final class10 method110(byte[] arg0, int arg1, int arg2, int arg3) {
        class10 var4 = new class10();
        var4.field106 = arg3;
        var4.field112 = new byte[arg2];
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            if (arg0[var5] != 0) {
                var4.field112[var4.field106++] = arg0[var5];
            }
        }
        return var4;
    }
}
