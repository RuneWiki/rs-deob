import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[[[B")
    public static byte[][][] field190;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method84(int arg0) {
        field190 = null;
        if (arg0 != -29159) {
            method84(-24);
        }
    }
}
