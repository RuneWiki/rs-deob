import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class418 {

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field6294 = 1339;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Lig;")
    public static class206 field6295 = new class206(98, -1);

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6298 = 0;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V", line = 6)
    public static void method2642(byte arg0) {
        field6295 = null;
        if (arg0 < 70) {
            field6298 = -54;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method2643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 67) {
            return;
        }
        for (class592 var7 = (class592) class101.field1200.method3297((byte) 97); var7 != null; var7 = (class592) class101.field1200.method3296((byte) -122)) {
            if (var7.field8493 <= class287.field3982) {
                var7.method3488(false);
            } else {
                class109.method679((var7.field8501 << 9) + 256, var7.field8495 * 2, 0, arg2, arg4 >> 1, var7.field8499, arg5 >> 1, (var7.field8492 << 9) + 256, arg0);
                class472.field6992.method1031(var7.field8498 | 0xFF000000, class547.field7831[1] + arg1, var7.field8503, 0, 26404, arg6 + class547.field7831[0]);
            }
        }
        field6297++;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)V", line = 46)
    public static final void method2644(int arg0, byte arg1) {
        class655.method3746(false);
        field6296++;
        class499.method2989(true);
        class302.method2022(true, arg0, -2221);
        class199.method1265(class319.field4621, class227.field3191, class413.field6264, (byte) -114);
        class248.method1647(-1, class319.field4621, class413.field6264);
        class26.method155(35633);
        class41.method221(arg1 ^ 0x50, class603.field8816);
        if (arg1 != 80) {
            return;
        }
        class410.method2598(arg1 ^ 0x33);
        class170.method982(17526);
        if (class133.field1673 == 2) {
            class353.method2235(3, 1);
        } else if (class133.field1673 == 6) {
            class353.method2235(7, 1);
        } else if (class133.field1673 == 9) {
            class353.method2235(10, 1);
            return;
        } else if (class133.field1673 == 1) {
            class427.method2669(-23264, class319.field4621, class413.field6264);
            return;
        }
    }
}
