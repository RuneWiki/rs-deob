import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class61 {

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
    public static int[] field830 = new int[14];

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "[I")
    public static int[] field831;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z")
    public static final boolean method435(boolean arg0) {
        if (arg0) {
            field831 = null;
        }
        field829++;
        class115 var1 = class154.field2334.field7365.field1736;
        if (var1 == null || class154.field2334.field7365 == var1) {
            return false;
        }
        class477 var2 = (class477) var1;
        if (var2.field7034 >= 2000) {
            var2.field7034 -= 2000;
        }
        return var2.field7034 == 1008;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
    public static final void method436(int arg0, int arg1) {
        if (arg1 != 2000) {
            method435(false);
        }
        field828++;
        if (class516.field7574 == 1) {
            class112.field1709 = arg0;
        } else if (class516.field7574 == 2 || class516.field7574 == 3) {
            class33.field455 = arg0;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)V")
    public static void method437(boolean arg0) {
        if (!arg0) {
            field831 = null;
        }
        field831 = null;
        field830 = null;
    }
}
