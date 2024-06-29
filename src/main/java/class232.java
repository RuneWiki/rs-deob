import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class232 extends class337 {

    @OriginalMember(owner = "client!go", name = "r", descriptor = "Lft;")
    public class727 field3125;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field3121 = 1400;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "[I")
    public static int[] field3126 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Ldl;")
    public static class725 field3120 = new class725(2);

    @OriginalMember(owner = "client!go", name = "t", descriptor = "Lrn;")
    public static class633 field3127 = new class633(9, 3);

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field3128 = new Hashtable();

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "Lie;")
    public static class204 field3124;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1486(boolean arg0) {
        field3128 = null;
        field3124 = null;
        if (!arg0) {
            field3120 = null;
        }
        field3120 = null;
        field3127 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Lg;", line = 22)
    public static final class619 method1487(int arg0, byte arg1) {
        field3123++;
        if (arg1 != -21) {
            field3122 = -43;
        }
        if (arg0 == 0) {
            if ((double) class402.field5335 == 3.0D) {
                return class372.field4555;
            }
            if ((double) class402.field5335 == 4.0D) {
                return class773.field10539;
            }
            if ((double) class402.field5335 == 6.0D) {
                return class190.field2647;
            }
            if ((double) class402.field5335 >= 8.0D) {
                return class249.field3418;
            }
        } else if (arg0 == 1) {
            if ((double) class402.field5335 == 3.0D) {
                return class190.field2647;
            }
            if ((double) class402.field5335 == 4.0D) {
                return class249.field3418;
            }
            if ((double) class402.field5335 == 6.0D) {
                return class588.field7467;
            }
            if ((double) class402.field5335 >= 8.0D) {
                return class266.field3530;
            }
        } else if (arg0 == 2) {
            if ((double) class402.field5335 == 3.0D) {
                return class588.field7467;
            }
            if ((double) class402.field5335 == 4.0D) {
                return class266.field3530;
            }
            if ((double) class402.field5335 == 6.0D) {
                return class596.field7570;
            }
            if ((double) class402.field5335 >= 8.0D) {
                return class202.field2805;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)I", line = 92)
    public static final int method1488(byte arg0) {
        if (arg0 > -27) {
            return -42;
        }
        field3119++;
        int var1 = class93.field1291.method11(3);
        if (var1 < class552.field6986.length - 1) {
            class93.field1291 = class552.field6986[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lft;)V", line = 119)
    public class232(class727 arg0) {
        this.field3125 = arg0;
    }
}
