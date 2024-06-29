import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 {

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lna;")
    public static class26 field446 = class30.method205((byte) 69, "Suchen");

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lna;")
    public static class26 field447 = class30.method205((byte) 66, "Clothes Shop");

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lna;")
    public static class26 field448 = class30.method205((byte) 26, "Furnace");

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lna;")
    public static class26 field450 = class30.method205((byte) 46, "sprites");

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lna;")
    public static class26 field449 = class30.method205((byte) 21, "Mini)2Game");

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lna;")
    public static class26 field444 = class30.method205((byte) 32, "Crafting Shop");

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lna;")
    public static class26 field451 = class30.method205((byte) 50, "_");

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "[Lm;")
    public static class23[] field445;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)V", line = 44)
    public static void method222(boolean arg0) {
        if (arg0) {
            field448 = null;
        }
        field451 = null;
        field445 = null;
        field444 = null;
        field448 = null;
        field450 = null;
        field447 = null;
        field446 = null;
        field449 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I[B)[B", line = 82)
    public static final byte[] method223(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class11.method79(arg1, 0, var3, arg0, var2);
        return var3;
    }
}
