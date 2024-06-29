import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class153 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Laf;")
    private static class7 field3566 = class48.method406(40, "wave2:");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Laf;")
    public static class7 field3576 = field3566;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Laf;")
    public static class7 field3575 = class48.method406(40, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Laf;")
    public static class7 field3577 = class48.method406(40, "<col=ff3000>");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[J")
    public static long[] field3579 = new long[32];

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Laf;")
    private static class7 field3581 = class48.method406(40, "Could not complete login)3");

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3574 = 50;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Laf;")
    private static class7 field3584 = class48.method406(40, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Laf;")
    public static class7 field3583 = class48.method406(40, "null");

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Laf;")
    public static class7 field3573 = field3584;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Laf;")
    private static class7 field3582 = class48.method406(40, "Connection lost");

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Laf;")
    public static class7 field3580 = field3581;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Laf;")
    public static class7 field3567 = field3566;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Laf;")
    public static class7 field3571 = field3582;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "J")
    public static long field3572;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3569;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    public static final int method1202(int arg0, int arg1) {
        field3578++;
        if (arg1 < 100) {
            field3575 = null;
        }
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field3583 = null;
        field3566 = null;
        field3577 = null;
        field3571 = null;
        field3579 = null;
        field3582 = null;
        if (arg0 != -105) {
            method1202(85, 81);
        }
        field3569 = null;
        field3581 = null;
        field3580 = null;
        field3576 = null;
        field3567 = null;
        field3584 = null;
        field3575 = null;
        field3573 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIII)V")
    public static final void method1204(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3565++;
        for (int var5 = 0; var5 < class83.field1951; var5++) {
            if (arg3 < class86.field2002[var5] + class105.field2579[var5] && class86.field2002[var5] < arg1 + arg3 && class96.field2294[var5] + class28.field730[var5] > arg4 && class96.field2294[var5] < arg4 + arg2) {
                class133.field3114[var5] = true;
            }
        }
        if (arg0 <= 28) {
            method1204((byte) 18, -119, -87, 4, 105);
        }
    }
}
