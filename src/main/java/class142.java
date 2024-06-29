import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class142 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2348 = -1;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lci;")
    public static class83 field2344;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(CB)Z")
    public static final boolean method1054(char arg0, byte arg1) {
        field2345++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            int var2 = 89 / ((-arg1 - 44) / 52);
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
    public static final void method1055(byte arg0, int arg1) {
        field2347++;
        if (arg0 == 38) {
            class237.field3992.method98(arg0 - 37, arg1);
            class54.field947.method98(arg0 ^ 0x27, arg1);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        field2344 = null;
        if (arg0 != 72) {
            field2343 = -22;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
    public static final int method1057(int arg0, int arg1) {
        field2342++;
        if (arg0 != 28260) {
            field2346 = 83;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
