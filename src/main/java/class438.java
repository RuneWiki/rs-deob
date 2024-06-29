import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class438 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Loe;")
    private static class137 field6445 = new class137();

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILd;)V")
    public static final synchronized void method2701(int arg0, class105 arg1) {
        class206 var2 = new class206();
        var2.field3385 = arg1;
        field6445.method994(var2, -3610);
        if (arg0 >= -10) {
            field6445 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final synchronized void method2702(byte arg0) {
        while (true) {
            class206 var1 = (class206) field6445.method1001(-16153);
            if (var1 == null) {
                int var2 = 58 % ((arg0 + 66) / 39);
                return;
            }
            var1.field3385.method119();
            var1.method2677(-22491);
        }
    }
}
