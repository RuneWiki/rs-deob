import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class108 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lqe;")
    public static class168 field1735 = class66.method448("mapscene", -112);

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lqe;")
    public static class168 field1738 = class66.method448("<col=ffffff> )4 ", -128);

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field1734 = 0;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Lti;")
    public static class92 field1736;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[[Lmj;")
    public static class129[][] field1741;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBIILrd;ZI)V")
    public static final void method707(int arg0, byte arg1, int arg2, int arg3, class207 arg4, boolean arg5, int arg6) {
        long var7 = (long) ((arg3 << 16) + arg0);
        field1742++;
        class186 var9 = (class186) class122.field2020.method1527(var7, (byte) -70);
        if (var9 != null) {
            return;
        }
        class186 var10 = (class186) class169.field2926.method1527(var7, (byte) -116);
        if (var10 != null) {
            return;
        }
        class186 var11 = (class186) class34.field430.method1527(var7, (byte) -116);
        if (var11 == null) {
            if (!arg5) {
                class186 var12 = (class186) class257.field4492.method1527(var7, (byte) -90);
                if (var12 != null) {
                    return;
                }
            }
            int var13 = 16 / ((22 - arg2) / 37);
            class186 var14 = new class186();
            var14.field3284 = arg1;
            var14.field3274 = arg4;
            var14.field3279 = arg6;
            if (arg5) {
                class122.field2020.method1533(var7, -110, var14);
                class213.field3686++;
            } else {
                class163.field2797.method400((byte) -124, var14);
                class34.field430.method1533(var7, 107, var14);
                client.field534++;
            }
        } else if (arg5) {
            var11.method1369(-128);
            class122.field2020.method1533(var7, -120, var11);
            client.field534--;
            class213.field3686++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1741 = null;
        field1735 = null;
        if (arg0 >= -35) {
            method707(-54, (byte) 26, -98, -42, null, true, -36);
        }
        field1736 = null;
        field1738 = null;
    }
}
