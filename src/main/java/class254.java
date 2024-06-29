import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class254 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method1598(byte arg0) {
        int var1 = -40 % ((44 - arg0) / 63);
        field3505++;
        if (!class13.field187) {
            return;
        }
        class712 var2 = class654.method3778((byte) -99, class480.field6527, class724.field10190);
        if (var2 != null && var2.field10042 != null) {
            class700 var3 = new class700();
            var3.field9745 = var2;
            var3.field9757 = var2.field10042;
            class318.method1840(var3);
        }
        class565.field8033 = -1;
        class220.field3109 = -1;
        class13.field187 = false;
        if (var2 != null) {
            class116.method764(var2, -1176833464);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public static final void method1599(int arg0, int arg1, int arg2) {
        class38 var3 = class352.field4549[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class481.method2836(var3.field542);
        class481.method2836(var3.field533);
        if (var3.field542 != null) {
            var3.field542 = null;
        }
        if (var3.field533 != null) {
            var3.field533 = null;
        }
    }
}
