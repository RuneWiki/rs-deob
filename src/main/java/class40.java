import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class40 extends class216 {

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "[I")
    public static int[] field582 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field581 = 0;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(Z)J", line = 11)
    public static final long method337(boolean arg0) {
        field580++;
        if (!arg0) {
            method338((byte) 39);
        }
        return class508.field7188.method1219(-18641);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V", line = 22)
    public static void method338(byte arg0) {
        field582 = null;
        if (arg0 != 103) {
            method337(true);
        }
    }
}
