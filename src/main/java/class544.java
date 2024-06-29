import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class544 extends class201 {

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lig;")
    public static class206 field7776 = new class206(59, -1);

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lkca;")
    public static class73 field7777 = new class73(32, -1);

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field7779 = 0;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "Lbg;")
    public static class400 field7778 = new class400(0);

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "[Ld;")
    public static class132[] field7780;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lqf;ZII)V", line = 5)
    public static final void method3157(class593 arg0, boolean arg1, int arg2, int arg3) {
        field7775++;
        class199 var4 = arg0.method3456(class413.field6264, arg1);
        if (var4 == null) {
            return;
        }
        class413.field6264.method368(arg3, arg2, arg0.field8570 + arg3, arg0.field8518 + arg2);
        if (class17.field172 >= 3) {
            class413.field6264.method312(-16777216, var4, arg3, arg2);
        } else {
            class614.field8942.method2707((float) arg0.field8570 / 2.0F + (float) arg3, (float) arg0.field8518 / 2.0F + (float) arg2, 4096, (int) (-class388.field5967) & 0x3FFF << 2, var4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 32)
    public static void method3158(int arg0) {
        field7778 = null;
        if (arg0 <= -16) {
            field7780 = null;
            field7777 = null;
            field7776 = null;
        }
    }
}
