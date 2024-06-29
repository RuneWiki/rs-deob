import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class203 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3065 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3061 = "K";

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lik;")
    public static class267 field3064 = new class267(64);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1291(int arg0) {
        if (arg0 != 17547) {
            field3065 = -67;
        }
        field3064 = null;
        field3061 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
    public static final void method1292(int arg0, boolean arg1) {
        field3063++;
        if (class184.field2794 == arg0) {
            return;
        }
        if (arg1) {
            field3064 = null;
        }
        if (class184.field2794 == 0) {
            class224.method1428(17736);
        }
        if (arg0 == 40) {
            class66.method452(0);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class191.field2939 != null) {
            class191.field2939.method955((byte) 117);
            class191.field2939 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class90.field1416 = 0;
            class106.field1613 = 1;
            class33.field480 = 0;
            class83.field1331 = 0;
            class173.field2634 = 1;
            class282.method1863(true, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class199.method1252(2);
        }
        if (arg0 == 5) {
            class176.method1089(class295.field4675, -32599);
        } else {
            class241.method1526(122);
        }
        boolean var3 = class184.field2794 == 5 || class184.field2794 == 10 || class184.field2794 == 28;
        if (var3 != var2) {
            if (var2) {
                class150.field2168 = class108.field1690;
                if (class284.field4248 == 0) {
                    class119.method758(-25289, 2);
                } else {
                    client.method961(class108.field1690, class143.field2090, false, (byte) -46, 2, 0, 255);
                }
                class265.field3995.method349(false, (byte) 118);
            } else {
                class119.method758(-25289, 2);
                class265.field3995.method349(true, (byte) 103);
            }
        }
        class184.field2794 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method1293(byte arg0) {
        if (arg0 < 11) {
            field3061 = null;
        }
        class237.field3566.method1782(0);
        class255.field3883.method1782(0);
        field3060++;
    }
}
