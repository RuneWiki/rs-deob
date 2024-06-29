import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class624 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Ljba;")
    public class400 field8738 = new class400();

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lkca;")
    public static class83 field8739 = new class83(8);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    public static int[] field8737;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[[I")
    public static int[][] field8740;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method3599(byte arg0) {
        field8737 = null;
        field8740 = null;
        if (arg0 < -42) {
            field8739 = null;
        }
    }
}
