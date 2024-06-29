import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class156 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lqd;")
    public static class40 field2613 = class147.method1106("Untersuchen", (byte) -124);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Lpl;")
    public static class186 field2616 = new class186(50);

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Z")
    public static volatile boolean field2617 = false;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Z")
    public static boolean field2619 = false;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
    public static int[] field2622 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lqd;")
    private static class40 field2623 = class147.method1106("Loaded wordpack", (byte) -81);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lqd;")
    public static class40 field2618 = field2623;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lce;")
    public static class239 field2612;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 4)
    public static void method1207(int arg0) {
        field2612 = null;
        field2623 = null;
        if (arg0 == 7) {
            field2622 = null;
            field2616 = null;
            field2613 = null;
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILve;)V", line = 98)
    public static final void method1208(int arg0, class258 arg1) {
        if (arg0 <= 114) {
            method1208(33, (class258) null);
        }
        field2624++;
        class255 var2 = (class255) class60.field1143.method1405((byte) 115, arg1.field4319.method362(-25194));
        if (var2 == null) {
            return;
        }
        if (var2.field4234 != null) {
            class89.field1610.method1336(var2.field4234);
            var2.field4234 = null;
        }
        var2.method2095(0);
    }
}
