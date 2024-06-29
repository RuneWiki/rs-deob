import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class637 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[B")
    public static byte[] field9046 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lfc;")
    public static class235 field9047 = new class235(43, 4);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lsr;")
    public static class228 field9048 = new class228();

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 25)
    public static void method3552(boolean arg0) {
        if (!arg0) {
            field9046 = null;
            field9048 = null;
            field9047 = null;
        }
    }
}
