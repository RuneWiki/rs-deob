import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class632 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Lrda;")
    public static class692 field8826 = new class692("LIVE", 0);

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Z")
    public static boolean field8829 = false;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Z")
    public static boolean field8833 = false;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "J")
    public static long field8830;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field8832;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public static void method3544(byte arg0) {
        int var1 = 121 / ((arg0 - 32) / 43);
        field8826 = null;
        field8832 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lqn;BLjava/lang/String;I)Leba;")
    public static final class615 method3545(class70 arg0, byte arg1, String arg2, int arg3) {
        int var4 = 32 / ((arg1 - 33) / 38);
        field8827++;
        return class155.method1130((byte) 7, arg2, arg0, "openjs", arg3);
    }
}
