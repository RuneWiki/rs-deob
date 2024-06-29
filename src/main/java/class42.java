import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class42 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field570 = new String[200];

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[I")
    public static int[] field572 = new int[6];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ldc;")
    public static class13 field571;

    static {
        new class332("From", "Von:", "De", "De");
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ltq;I)V", line = 7)
    public static final void method313(class63 arg0, int arg1) {
        field569++;
        if (class475.field6646.method2464(true) == 0 || arg1 != 36) {
            return;
        }
        if (class170.field2424 == 0) {
            for (class357 var4 = (class357) class475.field6646.method2456(arg1 ^ 0x7D41); var4 != null; var4 = (class357) class475.field6646.method2461(arg1 ^ 0x109)) {
                class23.field309.method2371(var4.field5422, false, var4.field5427, var4.field5423, var4.field5429, var4.field5430, arg0, class100.field1430, false, 0, arg0, var4.field5426 ? class472.field6622.field3833 : null);
                var4.method283(2);
            }
            class456.method2706((byte) 114);
            return;
        }
        if (class2.field39 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class2.field39 = class63.method522(0, class21.field261, class492.field6913, var2, 0, true);
            class302.field4499 = class2.field39.method539(class361.method2221(class388.field5716, arg1 + 44, 0, class87.field1235), class368.method2274(class425.field6075, class87.field1235, 0), true);
        }
        for (class357 var3 = (class357) class475.field6646.method2456(32101); var3 != null; var3 = (class357) class475.field6646.method2461(301)) {
            class23.field309.method2371(var3.field5422, false, var3.field5427, var3.field5423, var3.field5429, var3.field5430, arg0, class302.field4499, false, 0, class2.field39, var3.field5426 ? class472.field6622.field3833 : null);
            var3.method283(2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 59)
    public static void method314(byte arg0) {
        if (arg0 >= 92) {
            field572 = null;
            field571 = null;
            field570 = null;
        }
    }
}
