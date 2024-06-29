import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class625 extends class424 {

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "[B")
    public byte[] field8744;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
    public static int[] field8742 = new int[2];

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lfl;")
    public static class103 field8740 = new class103(8, 1);

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lhg;")
    public static class473 field8743;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 6)
    public static void method3475(int arg0) {
        field8742 = null;
        field8743 = null;
        field8740 = null;
        if (arg0 != -28378) {
            field8742 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V", line = 23)
    public class625(byte[] arg0) {
        this.field8744 = arg0;
    }
}
