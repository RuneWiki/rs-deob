import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class180 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[I")
    public static int[] field3037 = new int[1000];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lwe;")
    public static class59 field3042;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[[B")
    public static byte[][] field3039;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 5)
    public static void method1378(int arg0) {
        if (arg0 != 1) {
            field3039 = (byte[][]) ((byte[][]) null);
        }
        field3042 = null;
        field3037 = null;
        field3039 = (byte[][]) null;
    }
}
