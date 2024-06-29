import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class297 extends class287 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ltl;")
    public static class59 field5086 = class85.method639("Musik)2Engine vorbereitet)3", 9588);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field5085 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lgb;")
    public static class212 field5088 = new class212(32);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Lma;", line = 4)
    public static final class263 method2067(int arg0, int arg1, int arg2) {
        if (arg1 <= 39) {
            field5085 = -111;
        }
        field5090++;
        class263 var3 = class247.method1738(false, arg0);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field4377 == null || arg2 >= var3.field4377.length) {
            return null;
        } else {
            return var3.field4377[arg2];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 58)
    public static void method2068(byte arg0) {
        field5088 = null;
        field5086 = null;
        if (arg0 != -33) {
            method2069(-65L, false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JZ)V", line = 73)
    public static final void method2069(long arg0, boolean arg1) {
        field5087++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class293.field5001 < 100 || class45.field737) || class293.field5001 >= 200) {
            class288.method2003(class275.field4742, 0, -123, class206.field3369);
            return;
        }
        class59 var3 = class151.method1085(1, arg0).method480((byte) 122);
        for (int var4 = 0; var4 < class293.field5001; var4++) {
            if (class16.field213[var4] == arg0) {
                class288.method2003(class275.field4742, 0, 102, class233.method1630(new class59[] { var3, class20.field272 }, -2883));
                return;
            }
        }
        for (int var5 = 0; var5 < class156.field2548; var5++) {
            if (class305.field5166[var5] == arg0) {
                class288.method2003(class275.field4742, 0, 56, class233.method1630(new class59[] { class100.field1633, var3, class53.field790 }, -2883));
                return;
            }
        }
        if (var3.method453(class286.field4920.field1663, (byte) -69)) {
            class288.method2003(class275.field4742, 0, -124, class53.field795);
            return;
        }
        class88.field1380[class293.field5001] = var3;
        class195.field3233++;
        class16.field213[class293.field5001] = arg0;
        class25.field332[class293.field5001] = 0;
        class97.field1560[class293.field5001] = class275.field4742;
        class34.field501[class293.field5001] = 0;
        class87.field1375[class293.field5001] = arg1;
        class154.field2520 = class180.field3007;
        class293.field5001++;
        class234.field3888.method1768(true, 239);
        class234.field3888.method1206(arg0, arg1);
    }
}
