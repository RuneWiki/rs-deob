import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class480 {

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "[I")
    public static int[] field6948;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field6946;

    static {
        new class157(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6947 = -1;
        field6949 = 0;
        field6948 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZB)Ljava/lang/String;", line = 4)
    public static final String method2855(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 67) {
            field6948 = null;
        }
        field6945++;
        return arg1 && arg0 >= 0 ? class412.method2421(10, arg1, arg0, (byte) 56) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V", line = 26)
    public static final void method2856(byte arg0) {
        field6946++;
        class523.field7655 = true;
        if (arg0 != 116) {
            method2856((byte) -103);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 39)
    public static final void method2857(int arg0) {
        field6944++;
        if (class317.method1823(3, class494.field7155) || class222.method1384(0, class494.field7155)) {
            class130.method936(class108.field1747 >> 10, 5000, class118.field1848 >> 10, 61);
        } else {
            int var1 = class81.field1158.field263[0] >> 3;
            int var2 = class81.field1158.field257[0] >> 3;
            if (var1 >= 0 && var1 < class9.field111 >> 3 && var2 >= 0 && var2 < (class192.field2809 >> 3)) {
                class130.method936(var2, 5000, var1, arg0 ^ 0xE9839E93);
            } else {
                class130.method936(class192.field2809 >> 4, 0, class9.field111 >> 4, 73);
            }
        }
        class457.method2672(1);
        class307.method1776((byte) 26);
        if (arg0 != -377250077) {
            method2858(-7);
        }
        class421.method2487(0);
        class413.method2433(19661);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 68)
    public static void method2858(int arg0) {
        field6948 = null;
        if (arg0 != 0) {
            field6949 = 53;
        }
    }
}
