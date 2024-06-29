import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class376 extends class223 {

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[I")
    public static int[] field5560 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lbg;")
    public static class324 field5569 = new class324(81, -2);

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lgk;")
    public static class331 field5570 = new class331("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "J")
    public long field5561;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lac;")
    public class376 field5564;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Lac;")
    public class376 field5565;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lya;")
    public static class38 field5563;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 3)
    public final void method2307(byte arg0) {
        field5562++;
        if (this.field5565 == null) {
            return;
        }
        int var2 = 89 / ((arg0 + 28) / 45);
        this.field5565.field5564 = this.field5564;
        this.field5564.field5565 = this.field5565;
        this.field5564 = null;
        this.field5565 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2308(int arg0, int arg1) {
        class45.field510 = -1;
        class447.field6600 = -1;
        field5558++;
        if (arg1 > 43) {
            class63.field744 = arg0;
            class231.method1552(-1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V", line = 44)
    public static final void method2309(byte arg0) {
        field5568++;
        class156 var1 = class100.field1370;
        synchronized (class100.field1370) {
            class100.field1370.method1119(arg0 ^ 0xFFFFFFB2);
            if (arg0 != -60) {
                field5566 = 1;
            }
        }
        class156 var2 = class484.field7118;
        synchronized (class484.field7118) {
            class484.field7118.method1119(85);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 60)
    public static void method2310(int arg0) {
        if (arg0 < 77) {
            field5566 = 94;
        }
        field5560 = null;
        field5563 = null;
        field5569 = null;
        field5570 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Z", line = 77)
    public final boolean method2311(boolean arg0) {
        field5567++;
        if (!arg0) {
            method2308(-9, 99);
        }
        return this.field5565 != null;
    }
}
