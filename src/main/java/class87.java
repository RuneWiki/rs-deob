import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class87 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Llc;")
    public static class123 field1664 = new class123();

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1667 = 255;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Ldj;")
    public static class44 field1668 = class89.method650(255, "::autoshadow on");

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "[I")
    public static int[] field1669 = new int[50];

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1670 = 1;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lve;")
    public static class225 field1665;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lle;")
    public static class125[] field1666;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method643(int arg0) {
        field1664 = null;
        if (arg0 == 0) {
            field1665 = null;
            field1668 = null;
            field1666 = null;
            field1669 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static final void method644(int arg0, int arg1) {
        field1663++;
        if (~arg1 == arg0 && !class197.field3490) {
            class165.method1055(2);
        } else if (arg1 != -1 && (class73.field1386 != arg1 || !class153.method991(-1)) && field1667 != 0 && !class197.field3490) {
            class133.method901(class211.field3797, 2, (byte) 121, false, 0, arg1, field1667);
        }
        class73.field1386 = arg1;
    }
}
