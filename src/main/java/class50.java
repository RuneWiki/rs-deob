import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class50 {

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field772 = 0;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "Z")
    public static boolean field771 = true;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[I")
    public static int[] field770 = new int[14];

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Lcu;")
    public static class145 field773 = new class145(1, 3);

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field775 = 2;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Lnc;")
    public static class21 field776;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Lpc;")
    public static class473 field774;

    static {
        new class304("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 14)
    public static void method378(byte arg0) {
        field773 = null;
        field776 = null;
        field770 = null;
        field774 = null;
        if (arg0 > -13) {
            method378((byte) 90);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I", line = 36)
    public static final int method379(int arg0, int arg1) {
        return class156.field2280 == null ? 0 : class156.field2280[arg0][arg1] & 0xFF;
    }
}
