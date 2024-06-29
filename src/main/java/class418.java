import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class418 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[Lkc;")
    public static class436[] field5863 = new class436[29];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field5865 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lik;")
    public static class410 field5861 = new class410(5);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5867;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2585(boolean arg0) {
        field5866++;
        if (!arg0) {
            method2586(30);
        }
        for (class19 var1 = (class19) class75.field1119.method1240((byte) -124); var1 != null; var1 = (class19) class75.field1119.method1245(1)) {
            class144 var2 = var1.field369;
            if (class69.field1046 != var2.field3170 || var2.field2190 < class414.field5793) {
                var1.method2367(5);
                var2.method1113(true);
            } else if (class414.field5793 >= var2.field2187) {
                if (var2.field2198 > 0) {
                    class127 var3 = class298.field4012[var2.field2198 - 1];
                    if (var3 != null && var3.field3176 >= 0 && var3.field3176 < class116.field1621 * 128 && var3.field3167 >= 0 && (class385.field5425 * 128) > var3.field3167) {
                        var2.method1112(class22.method281(1, var2.field3170, var3.field3167, var3.field3176) - var2.field2176, class414.field5793, var3.field3167, -1, var3.field3176);
                    }
                }
                if (var2.field2198 < 0) {
                    int var4 = -var2.field2198 - 1;
                    class338 var5;
                    if (class401.field5606 == var4) {
                        var5 = class95.field1379;
                    } else {
                        var5 = class220.field3044[var4];
                    }
                    if (var5 != null && var5.field3176 >= 0 && (class116.field1621 * 128) > var5.field3176 && var5.field3167 >= 0 && (class385.field5425 * 128) > var5.field3167) {
                        var2.method1112(class22.method281(1, var2.field3170, var5.field3167, var5.field3176) - var2.field2176, class414.field5793, var5.field3167, -1, var5.field3176);
                    }
                }
                var2.method1111(class339.field4628, (byte) 100);
                class384.method2379(var2, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 63)
    public static void method2586(int arg0) {
        int var1 = 31 / ((arg0 + 28) / 42);
        field5863 = null;
        field5867 = null;
        field5861 = null;
    }
}
