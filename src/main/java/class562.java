import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class562 extends class557 {

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Lmw;")
    public static class517 field7697 = new class517(62, 8);

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field7700 = 0;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Lmw;")
    public static class517 field7699 = new class517(31, 3);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Ljava/lang/String;")
    private String field7702;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[I")
    public static int[] field7701;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ltn;I)V")
    public final void method32(class95 arg0, int arg1) {
        if (arg1 != -29265) {
            field7697 = null;
        }
        field7696++;
        arg0.field1350 = this.field7702;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public static void method3203(byte arg0) {
        field7697 = null;
        if (arg0 == 14) {
            field7699 = null;
            field7701 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLdt;)V")
    public final void method30(byte arg0, class254 arg1) {
        this.field7702 = arg1.method1699(-94);
        field7698++;
        if (arg0 != 110) {
            method3203((byte) -42);
        }
    }
}
