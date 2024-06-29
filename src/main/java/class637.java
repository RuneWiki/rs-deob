import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class637 extends class36 {

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lfl;")
    public class640 field9166;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Lig;")
    public static class206 field9163 = new class206(116, -1);

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[B")
    public static byte[] field9165 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "Lkca;")
    public static class73 field9167;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "F")
    public static float field9162;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Lcm;")
    public static class631 field9160;

    static {
        new class474("Ok", "Okay", "OK", "Ok");
        field9167 = new class73(34, 8);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 3)
    public static void method3633(byte arg0) {
        field9163 = null;
        field9160 = null;
        if (arg0 <= 123) {
            method3633((byte) 58);
        }
        field9167 = null;
        field9165 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lfl;)V", line = 39)
    public class637(class640 arg0) {
        this.field9166 = arg0;
    }
}
