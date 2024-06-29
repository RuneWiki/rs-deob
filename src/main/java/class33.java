import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class33 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lbu;")
    public static class19 field397 = new class19();

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Llu;")
    public static class610 field398 = new class610(54, 12);

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lada;")
    public static class144 field400 = new class144(35, -1);

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
    public static int[] field401 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lps;")
    public static class81 field403;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method211(int arg0) {
        field397 = null;
        if (arg0 == 2047) {
            field401 = null;
            field398 = null;
            field400 = null;
            field403 = null;
        }
    }
}
