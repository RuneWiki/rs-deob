import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lp;")
    public static class280 field909 = class18.method140((byte) -124, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!i", name = "d", descriptor = "J")
    public static long field911 = 0L;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static volatile int field908 = 0;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Z")
    public static final boolean method408(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field914++;
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method409(byte arg0) {
        field909 = null;
        if (arg0 >= -23) {
            field911 = 74L;
        }
    }
}
