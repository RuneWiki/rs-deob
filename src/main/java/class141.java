import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class141 {

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Lcb;")
    public static class318 field1798 = new class318(48, -2);

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "[I")
    public static int[] field1801 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field1800 = 1;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "Z")
    public static boolean field1799 = false;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field1802 = -1;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public int field1793;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 5)
    public static void method972(int arg0) {
        field1798 = null;
        if (arg0 != 38) {
            method972(11);
        }
        field1801 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V", line = 20)
    public static final void method973(int arg0, int arg1) {
        field1795++;
        class235.field3067 = 3;
        class514.field7002 = 100;
        class613.field8375 = -1;
        class341.field5013 = arg1;
        if (arg0 != 155) {
            method972(-77);
        }
    }
}
