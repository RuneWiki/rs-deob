import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 extends class53 {

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Lwh;")
    public class192 field1120;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lp;")
    public static class280 field1119 = class18.method140((byte) -125, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lih;")
    public static class202 field1117;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "[I")
    public static int[] field1116;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method461(byte arg0) {
        if (arg0 != -42) {
            field1116 = null;
        }
        field1116 = null;
        field1119 = null;
        field1117 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lwh;)V")
    public class67(class192 arg0) {
        this.field1120 = arg0;
    }
}
