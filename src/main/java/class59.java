import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class59 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field746 = -1;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Leba;")
    public static class550 field748 = new class550(92, -2);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lit;")
    public static class513 field745;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Z")
    public static boolean field747;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[[I")
    public static int[][] field744;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method338(byte arg0) {
        if (arg0 < 32) {
            field747 = false;
        }
        field745 = null;
        field744 = null;
        field748 = null;
    }
}
