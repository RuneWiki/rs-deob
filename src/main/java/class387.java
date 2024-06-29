import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class387 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field5958 = 0;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "Lfj;")
    public static class572 field5961 = new class572("", 13);

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public int field5959;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public int field5964;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2505(int arg0) {
        class51.field544.method1606((byte) 97);
        field5962++;
        for (int var1 = 0; var1 < 32; var1++) {
            class565.field8056[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class488.field7122[var2] = 0L;
        }
        if (arg0 < 70) {
            field5958 = -82;
        }
        class613.field8914 = 0;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILoa;)V", line = 30)
    public static final void method2506(int arg0, class605 arg1) {
        field5963++;
        if (class270.field3788.method707((byte) -106) == 0) {
            return;
        }
        if (class81.field908 == arg0) {
            for (class163 var2 = (class163) class270.field3788.method719(false); var2 != null; var2 = (class163) class270.field3788.method716(14)) {
                class622.field8999.method19(arg1, var2.field2000 ? class439.field6548.field9470 : null, arg1, false, var2.field2002, var2.field1993, var2.field2005, false, (byte) -106, var2.field2003, var2.field2001, class280.field3903);
                var2.method2108(true);
            }
            class410.method2598(105);
            return;
        }
        if (class403.field6094 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class403.field6094 = class605.method3526(0, (byte) -63, 0, class206.field2762, var3, class73.field780);
            class169.field2060 = class403.field6094.method329(class644.method3663(class227.field3191, arg0 + 39, 0, class546.field7820), class372.method2393(class319.field4621, class546.field7820, 0), true);
        }
        for (class163 var4 = (class163) class270.field3788.method719(false); var4 != null; var4 = (class163) class270.field3788.method716(14)) {
            class622.field8999.method19(class403.field6094, var4.field2000 ? class439.field6548.field9470 : null, arg1, false, var4.field2002, var4.field1993, var4.field2005, false, (byte) -103, var4.field2003, var4.field2001, class169.field2060);
            var4.method2108(true);
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V", line = 85)
    public static void method2507(int arg0) {
        if (arg0 < 126) {
            method2506(63, null);
        }
        field5961 = null;
    }
}
