import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class51 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "[B")
    public static byte[] field668 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLdga;)Llw;")
    public static final class672 method290(byte arg0, class138 arg1) {
        field669++;
        class672 var2 = new class672();
        var2.field9533 = arg1.method922((byte) -113);
        if (arg0 != 0) {
            field668 = null;
        }
        var2.field9531 = class673.field9539.method2804(27993, var2.field9533);
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method291(byte arg0) {
        field668 = null;
        if (arg0 != 0) {
            method290((byte) -53, null);
        }
    }
}
