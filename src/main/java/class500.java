import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class500 {

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "[I")
    public static int[] field7362 = new int[14];

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field7363 = 0;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "I")
    public static int field7364 = 0;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "Lng;")
    public static class226 field7360 = new class226(4);

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Loq;")
    public static class239 field7365;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "Lac;")
    public static class376 field7361;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static void method2991(int arg0) {
        field7361 = null;
        field7360 = null;
        if (arg0 != 0) {
            method2992(false, true);
        }
        field7362 = null;
        field7365 = null;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
    public static final void method2992(boolean arg0, boolean arg1) {
        field7359++;
        if (arg0) {
            if (class6.field79 != -1) {
                class67.method399(0, class6.field79);
            }
            for (class92 var2 = (class92) class431.field6450.method2608(true); var2 != null; var2 = (class92) class431.field6450.method2603(30)) {
                if (!var2.method2050(1)) {
                    var2 = (class92) class431.field6450.method2608(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class250.method1671(false, true, var2, arg1);
            }
            class6.field79 = -1;
            class431.field6450 = new class433(8);
            class453.method2723(1351874563);
            class6.field79 = class269.field3922;
            class159.method1015(false, (byte) 70);
            class377.method2315(arg1);
            class360.method2239(class6.field79);
        }
        class48.method300(0);
        class195.field2839 = -1;
        if (arg1) {
            method2992(false, false);
        }
        class30.method176(arg1, class202.field2925);
        field7365 = new class239();
        field7365.field1763 = class30.field323 * 128 / 2;
        field7365.field1769 = class182.field2661 * 128 / 2;
        field7365.field1997[0] = class30.field323 / 2;
        class260.field3827 = 0;
        class24.field258 = 0;
        field7365.field1996[0] = class182.field2661 / 2;
        if (class140.field2103 == 2) {
            class260.field3827 = class5.field74 << 7;
            class24.field258 = class526.field7785 << 7;
        } else {
            class305.method1923((byte) 115);
        }
        class407.method2449(-112);
        if (class24.field258 == 0 || class260.field3827 == 0) {
            class11.method76(false, 10);
        } else {
            class125.method833(-5564);
            class11.method76(false, 28);
        }
    }
}
