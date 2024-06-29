import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class695 extends class64 {

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    public int field9707 = -1;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "Lkt;")
    public static class159 field9710 = new class159(1);

    @OriginalMember(owner = "client!jha", name = "t", descriptor = "I")
    public static int field9715 = -1;

    @OriginalMember(owner = "client!jha", name = "s", descriptor = "I")
    public static int field9714 = -1;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public int field9709;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!jha", name = "r", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!jha", name = "u", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "Ljava/lang/String;")
    public String field9706;

    @OriginalMember(owner = "client!jha", name = "q", descriptor = "Ljava/lang/String;")
    public String field9712;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)V", line = 3)
    public static final void method3922(int arg0) {
        for (int var1 = arg0; ~class676.field9447 < ~var1; ++var1) {
            int var2 = class304.method1837((byte) 6, var1 - -class65.field716, class676.field9447) * class56.field573;
            for (int var3 = 0; var3 < class56.field573; ++var3) {
                int var4 = var2 + class304.method1837((byte) 6, class122.field1606 + var3, class56.field573);
                if (~class381.field5338[var4] == ~class339.field4577) {
                    class624.field8731[var4].method3453(0, 0, class377.field5235, class759.field10586, class377.field5235 * var3, class759.field10586 * var1, true, true);
                }
            }
        }
        ++field9716;
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)Z", line = 40)
    public static final boolean method3923(int arg0, int arg1) {
        if (arg0 != 2048) {
            method3926(119, -121, (byte) 95);
        }
        ++field9708;
        return ~arg1 == -4 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V", line = 51)
    public static void method3924(int arg0) {
        if (arg0 >= -93) {
            method3923(86, 125);
        }
        field9710 = null;
    }

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "(I)Lhga;", line = 62)
    public final class175 method3925(int arg0) {
        if (arg0 != -1) {
            method3924(-79);
        }
        ++field9711;
        return class1.field8[super.field694];
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIB)Z", line = 83)
    public static final boolean method3926(int arg0, int arg1, byte arg2) {
        if (arg2 < 110) {
            method3924(-79);
        }
        ++field9713;
        return ~(arg1 & 2048) != -1;
    }
}
