import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
    public static int[] field40 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method18(int arg0) {
        if (arg0 != 526) {
            method18(-88);
        }
        field40 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLhw;)I")
    public static final int method19(boolean arg0, class270 arg1) {
        field41++;
        int var2 = arg1.field3855;
        class674 var3 = arg1.method1093(arg0);
        if (arg1.field2425 == -1 || arg1.field2353) {
            var2 = arg1.field3871;
        } else if (arg1.field2425 == var3.field9572 || arg1.field2425 == var3.field9590 || arg1.field2425 == var3.field9609 || arg1.field2425 == var3.field9598) {
            var2 = arg1.field3863;
        } else if (arg1.field2425 == var3.field9563 || arg1.field2425 == var3.field9570 || arg1.field2425 == var3.field9607 || arg1.field2425 == var3.field9578) {
            var2 = arg1.field3883;
        }
        return var2;
    }
}
