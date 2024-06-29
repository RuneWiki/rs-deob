import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class36 {

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Lw;")
    public static class38 field487 = class35.method219("Magic Shop", true);

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Lw;")
    public static class38 field489 = class35.method219("Scimitar Shop", true);

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "[J")
    public static long[] field490 = new long[32];

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Lw;")
    public static class38 field491 = class35.method219("Loading", true);

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Lw;")
    public static class38 field494 = class35.method219("75(U", true);

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lw;")
    public static class38 field493 = class35.method219("world", true);

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "B")
    public byte field488;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lb;")
    public static class3 field492;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "[B")
    public byte[] field486;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 26)
    public static void method224(int arg0) {
        field492 = null;
        field490 = null;
        field493 = null;
        if (arg0 != -4803) {
            field494 = null;
        }
        field494 = null;
        field487 = null;
        field489 = null;
        field491 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(ZI)I", line = 44)
    public static final int method225(boolean arg0, int arg1) {
        if (!arg0) {
            method225(true, -42);
        }
        if (arg1 >= 65 && arg1 <= 90) {
            arg1 += 32;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 88)
    public final void method226(int arg0) {
        boolean var2 = true;
        if (arg0 != 0 || this.field486 == null) {
            return;
        }
        this.field488 = this.field486[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field486[var3] != this.field488) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field486 = null;
        }
    }
}
