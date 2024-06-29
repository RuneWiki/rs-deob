import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[I")
    public static int[] field2579 = new int[100];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2574 = 0;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Laf;")
    public static class7 field2578 = class48.method406(40, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Laf;")
    public static class7 field2576 = class48.method406(40, "<img=0>");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
    public static int[] field2584 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Laf;")
    public static class7 field2577 = class48.method406(40, " <col=ffff00>");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method850(int arg0) {
        field2586++;
        class113 var1 = class82.field1882;
        synchronized (class82.field1882) {
            class64.field1415 = class144.field3399;
            if (class108.field2639 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class119.field2818[var2] = false;
                }
                class108.field2639 = class120.field2835;
            } else {
                while (class120.field2835 != class108.field2639) {
                    int var3 = class119.field2822[class120.field2835];
                    class120.field2835 = class120.field2835 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class119.field2818[var3] = true;
                    } else {
                        class119.field2818[~var3] = false;
                    }
                }
            }
            class144.field3399 = class143.field3395;
            if (arg0 != -113) {
                field2582 = -51;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method851(Component arg0, int arg1) {
        field2580++;
        if (arg1 != 0) {
            method853(-127, -17);
        }
        Method var2 = class100.field2368;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class82.field1882);
        arg0.addFocusListener(class82.field1882);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)Lad;")
    public static final class5 method852(int arg0) {
        field2585++;
        class5 var1 = new class5(class51.field1234, class127.field3059, class86.field2005, class27.field697, class82.field1879);
        class53.method429(arg0 - 81);
        return arg0 == 0 ? var1 : null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I")
    public static final int method853(int arg0, int arg1) {
        field2575++;
        int var2 = -60 % ((arg1 + 14) / 43);
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
    public static void method854(boolean arg0) {
        field2579 = null;
        field2584 = null;
        if (arg0) {
            method853(-128, -103);
        }
        field2577 = null;
        field2576 = null;
        field2578 = null;
    }
}
