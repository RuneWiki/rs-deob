import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class247 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field4240 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lsn;")
    public static class495 field4238;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 10)
    public static void method1681(int arg0) {
        field4238 = null;
        if (arg0 != -1) {
            method1682((byte) 112);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1682(byte arg0) {
        class468.field6955.method1362(-1);
        field4239++;
        class333.field5233.method1652(arg0 ^ 0x6A0B);
        if (class144.field2350 != null) {
            class144.field2350.method51(class270.field4495, (byte) 69);
        }
        class326.field5138.method641(121);
        class270.field4495.setBackground(Color.black);
        class31.field485 = -1;
        class468.field6955 = class402.method2494(class270.field4495, (byte) -54);
        class333.field5233 = class237.method1628(class270.field4495, (byte) 12, true);
        if (class144.field2350 != null) {
            class144.field2350.method49((byte) -66, class270.field4495);
        }
        if (arg0 != 98) {
            method1681(47);
        }
    }
}
