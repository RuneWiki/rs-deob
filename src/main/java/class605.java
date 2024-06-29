import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class605 extends class28 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lft;")
    public static class285 field8191 = new class285(15, 3);

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[[[B")
    public static byte[][][] field8192;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static void method3281(int arg0) {
        field8192 = null;
        field8191 = null;
        if (arg0 != 6248) {
            field8191 = null;
        }
    }
}
