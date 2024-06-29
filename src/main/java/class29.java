import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class29 extends class191 {

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
    public int field597 = 0;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "[I")
    public static int[] field587 = new int[5];

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "Z")
    public static volatile boolean field591 = false;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Ldd;")
    public static class35 field594 = class180.method1196((byte) -115, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field592 = -1;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "Ldd;")
    private static class35 field598 = class180.method1196((byte) -41, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Ldd;")
    public static class35 field588 = field598;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "Lld;")
    public static class111 field593 = new class111(64);

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Lce;")
    public static class26 field585;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[Lbg;")
    public static class18[] field589;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static void method274(int arg0) {
        field588 = null;
        if (arg0 != 0) {
            method274(126);
        }
        field598 = null;
        field585 = null;
        field594 = null;
        field593 = null;
        field587 = null;
        field589 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lce;II)V")
    private final void method275(class26 arg0, int arg1, int arg2) {
        if (arg2 == -30138) {
            field596++;
            if (arg1 == 5) {
                this.field597 = arg0.method256((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lce;B)V")
    public final void method276(class26 arg0, byte arg1) {
        field595++;
        int var3 = 38 / ((arg1 + 62) / 49);
        while (true) {
            int var4 = arg0.method221(-105);
            if (var4 == 0) {
                return;
            }
            this.method275(arg0, var4, -30138);
        }
    }
}
