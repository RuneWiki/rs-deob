import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class35 {

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Z")
    public static boolean field447 = true;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lu;")
    public static class38 field446 = class9.method45(-41, "37(U");

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "[I")
    public static int[] field443 = new int[128];

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lu;")
    public static class38 field448 = class9.method45(-41, "Scimitar Shop");

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lu;")
    public static class38 field450 = class9.method45(-41, "Achievement Start");

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "B")
    public byte field449;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "[B")
    public byte[] field445;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 8)
    public static void method199(byte arg0) {
        field448 = null;
        field443 = null;
        if (arg0 != -86) {
            method199((byte) -72);
        }
        field450 = null;
        field446 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 34)
    public final void method200(int arg0) {
        if (arg0 != -12497) {
            field450 = null;
        }
        boolean var2 = true;
        if (this.field445 == null) {
            return;
        }
        this.field449 = this.field445[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field445[var3] != this.field449) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field445 = null;
        }
    }
}
