import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class520 {

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Lrp;")
    public static class369 field7307 = new class369();

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "[I")
    public static int[] field7309 = new int[5];

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[S")
    public static short[] field7310;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I")
    public static final int method2966(int arg0, int arg1) {
        field7306++;
        return arg0 == 255 ? arg1 & 0xFF : 29;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public static void method2967(byte arg0) {
        field7307 = null;
        field7309 = null;
        int var1 = 120 / ((-arg0 - 56) / 55);
        field7310 = null;
    }

    static {
        new class180(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field7310 = new short[] { -4160, -4163, -8256, -8259, 22461 };
    }
}
