import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class437 extends class101 {

    @OriginalMember(owner = "client!za", name = "p", descriptor = "Lor;")
    public static class668 field6161 = null;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "Laj;")
    public static class333 field6160;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 3)
    public static void method2634(byte arg0) {
        field6161 = null;
        field6160 = null;
        if (arg0 != -5) {
            method2635((byte) -69);
        }
    }

    @OriginalMember(owner = "client!za", name = "d", descriptor = "(B)Z", line = 19)
    public static final boolean method2635(byte arg0) {
        if (arg0 < 87) {
            return true;
        } else {
            field6159++;
            return class99.field1374 != 0;
        }
    }
}
