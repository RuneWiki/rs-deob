import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class473 {

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lap;")
    public static class310 field6659 = new class310(45, 15);

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "[I")
    public static int[] field6662 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public int field6656;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public int field6657;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public int field6661;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Lkg;")
    public static class194 field6660;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public static void method2802(byte arg0) {
        field6660 = null;
        if (arg0 != -122) {
            method2803(-113, 124, 14);
        }
        field6662 = null;
        field6659 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
    public static final void method2803(int arg0, int arg1, int arg2) {
        class466.field6571 = arg0 - class330.field4602;
        if (arg2 != 120) {
            method2802((byte) 41);
        }
        field6658++;
        class430.field6008 = arg1 - class330.field4596;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lvc;IIZILam;I)V")
    public static final void method2804(class89 arg0, int arg1, int arg2, boolean arg3, int arg4, class199 arg5, int arg6) {
        field6655++;
        if (arg3) {
            class318.field4497.method2493((class364.field5007 - class318.field4497.method1294()) / 2, (class431.field6099 - class318.field4497.method1295()) / 2);
            class464.field6545.method2493((class364.field5007 - class464.field6545.method1294()) / 2, 18);
        }
        arg5.method1385((class6.field42 == class35.field378 ? class4.field27 : class105.field1471).method1078(class66.field967, 100), arg4, -1, class431.field6099 / 2 - 26, class364.field5007 / 2, 1453761640);
        int var7 = class431.field6099 / 2 - 18;
        arg0.method348(class364.field5007 / 2 - 152, var7, 304, 34, arg2, 0);
        arg0.method348(class364.field5007 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg0.method438(class364.field5007 / 2 - 150, var7 + 2, class20.field217 * 3, 30, arg1, 0);
        arg0.method438(class364.field5007 / 2 + class20.field217 * 3 - 150, var7 - -2, 300 - class20.field217 * 3, 30, 0, 0);
        arg5.method1385(class295.field4159, arg4, -1, class431.field6099 / 2 + 4, class364.field5007 / 2, 1453761640);
        int var8 = 5 % ((-arg6 - 55) / 51);
    }
}
