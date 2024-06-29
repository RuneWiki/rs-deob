import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class158 extends class380 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "D")
    public static double field2531 = -1.0D;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1205(byte arg0) throws IOException {
        if (class527.field7529 != null && class308.field4416 > 0) {
            class392.field5395.field7042 = 0;
            while (true) {
                class312 var1 = (class312) class559.field7954.method1731((byte) -107);
                if (var1 == null || var1.field4444 > (class392.field5395.field7050.length - class392.field5395.field7042)) {
                    class527.field7529.method615((byte) 68, class392.field5395.field7050, 0, class392.field5395.field7042);
                    class270.field3921 += class392.field5395.field7042;
                    class374.field5165 = 0;
                    break;
                }
                class392.field5395.method2936(arg0 ^ 0xFFFFDBDC, 0, var1.field4445.field7050, var1.field4444);
                class308.field4416 -= var1.field4444;
                var1.method3387((byte) -72);
                var1.field4445.method2970(arg0 - 300264466);
                var1.method1999(13665);
            }
        }
        if (arg0 == -30) {
            field2532++;
        }
    }
}
