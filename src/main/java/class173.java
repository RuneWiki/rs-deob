import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class173 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2573 = "shake:";

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2574;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1141(byte arg0) {
        field2574 = null;
        if (arg0 == 44) {
            field2573 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Luf;III)[Lqd;")
    public static final class3[] method1142(class176 arg0, int arg1, int arg2, int arg3) {
        field2572++;
        if (class261.method1750(arg0, arg2, arg3, (byte) 38)) {
            if (arg1 != 358) {
                field2573 = null;
            }
            return class242.method1636((byte) -107);
        } else {
            return null;
        }
    }
}
