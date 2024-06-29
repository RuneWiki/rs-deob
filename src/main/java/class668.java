import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class668 extends class381 {

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "Ldc;")
    public class302 field9445 = new class302();

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
    public static int field9444 = 104;

    @OriginalMember(owner = "client!bba", name = "l", descriptor = "F")
    public static float field9448;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "[[I")
    public static int[][] field9446;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)B", line = 8)
    public static final byte method3745(int arg0, int arg1, int arg2) {
        if (arg0 < 63) {
            return 66;
        }
        field9449++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V", line = 37)
    public static final void method3746(int arg0, boolean arg1) {
        if (!arg1) {
            method3745(18, 125, 48);
        }
        if (class673.field9460 == 1) {
            class412.field6118 = arg0;
        } else if (class673.field9460 == 2 || class673.field9460 == 3) {
            class687.field9711 = arg0;
        }
        field9447++;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 55)
    public static void method3747(int arg0) {
        field9446 = null;
        if (arg0 != 2) {
            field9448 = 0.6615182F;
        }
    }
}
