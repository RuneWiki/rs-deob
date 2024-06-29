import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ldd;")
    private static class35 field459 = class180.method1196((byte) 127, " more options");

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ldd;")
    public static class35 field460 = field459;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field461;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[[[B")
    public static byte[][][] field458;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method201(byte arg0) {
        field459 = null;
        field461 = null;
        field460 = null;
        int var1 = 3 % ((-arg0 - 9) / 41);
        field458 = null;
    }
}
