import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class624 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Z")
    public static boolean field8640 = false;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lnv;")
    public static class63 field8641 = new class63(14, 1);

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lnv;")
    public static class63 field8644 = new class63(15, 4);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lnv;")
    public static class63 field8645 = new class63(16, -2);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lnv;")
    public static class63 field8646 = new class63(17, 0);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lnv;")
    public static class63 field8647 = new class63(18, -2);

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lnv;")
    public static class63 field8648 = new class63(19, -2);

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Lnv;")
    public static class63 field8649 = new class63(20, 6);

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lnv;")
    public static class63 field8650 = new class63(21, 9);

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "Lnv;")
    public static class63 field8651 = new class63(22, -2);

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lnv;")
    public static class63 field8652 = new class63(23, 4);

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lnv;")
    public static class63 field8653 = new class63(24, -1);

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lnv;")
    public static class63 field8654 = new class63(25, -2);

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lnv;")
    public static class63 field8655 = new class63(26, 0);

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lnv;")
    public static class63 field8656 = new class63(27, 0);

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "[Lnv;")
    private static class63[] field8657 = new class63[32];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lbw;")
    public static class448 field8643;

    static {
        class63[] var0 = class651.method3647(8);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field8657[var0[var1].field799] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 24)
    public static void method3469(byte arg0) {
        field8644 = null;
        field8648 = null;
        if (arg0 >= -125) {
            field8653 = null;
        }
        field8641 = null;
        field8653 = null;
        field8645 = null;
        field8654 = null;
        field8656 = null;
        field8650 = null;
        field8651 = null;
        field8646 = null;
        field8647 = null;
        field8652 = null;
        field8657 = null;
        field8649 = null;
        field8643 = null;
        field8655 = null;
    }
}
