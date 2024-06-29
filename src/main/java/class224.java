import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class224 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lgb;")
    public static class212 field3629 = new class212(64);

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ltl;")
    public static class59 field3633 = class85.method639(")2", 9588);

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 17)
    public static void method1545(int arg0) {
        field3633 = null;
        field3629 = null;
        if (arg0 != 0) {
            field3631 = 67;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Ltl;", line = 30)
    public static final class59 method1546(int arg0, byte arg1) {
        field3628++;
        if (arg1 < 108) {
            method1547((int[][]) ((int[][]) null), true);
        }
        return class294.field5015[arg0].method495(88) <= 0 ? class93.field1440[arg0] : class233.method1630(new class59[] { class93.field1440[arg0], class299.field5120, class294.field5015[arg0] }, -2883);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([[IZ)V", line = 68)
    public static final void method1547(int[][] arg0, boolean arg1) {
        class163.field2662 = arg0;
        field3630++;
        if (arg1) {
            field3633 = (class59) null;
        }
    }
}
