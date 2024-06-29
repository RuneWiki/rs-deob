import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class468 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lan;")
    public static class182 field6735 = new class182(1, 7);

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6736 = 7000;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field6738 = field6736;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[[[I")
    public static int[][][] field6737;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2760(int arg0) {
        if (arg0 < 20) {
            method2760(-62);
        }
        field6737 = null;
        field6735 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)B")
    public static final byte method2761(int arg0, int arg1, int arg2) {
        if (arg1 < 40) {
            field6738 = -69;
        }
        field6734++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
