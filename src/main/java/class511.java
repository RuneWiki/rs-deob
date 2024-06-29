import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class511 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lbv;")
    public static class567 field7079 = new class567("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lpp;")
    public static class464 field7080 = new class464(46, 3);

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field7081 = 0;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7082 = null;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V")
    public static final void method2865(byte arg0, int arg1) {
        field7078++;
        if (arg0 == 25) {
            class225.field3361 = arg1;
            class161.field2395.method2406(-124);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Z")
    public static final boolean method2866(int arg0, int arg1, int arg2) {
        field7077++;
        if (arg2 != 46) {
            field7080 = null;
        }
        return (class272.method1765((byte) -17, arg1, arg0) | class513.method2875(arg0, arg1, arg2 - 12) | class252.method1593((byte) 127, arg0, arg1)) & class284.method1807(arg1, -24291, arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method2867(int arg0) {
        field7082 = null;
        field7079 = null;
        if (arg0 == 46) {
            field7080 = null;
        }
    }
}
