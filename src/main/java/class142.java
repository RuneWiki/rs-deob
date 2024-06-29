import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class142 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2742 = 128;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field2744 = new int[200];

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[[B")
    public static byte[][][] field2745;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        field2745 = null;
        if (arg0 > 12) {
            field2744 = null;
        }
    }
}
