import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class319 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Loga;")
    public static class476 field4123 = null;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "Z")
    public static boolean field4126 = true;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BLsl;)Lib;", line = 4)
    public static final class156 method1879(byte arg0, class461 arg1) {
        field4127++;
        if (arg0 > -82) {
            method1880(124, (byte) -105, -42);
        }
        return new class156(arg1.method2577(2), arg1.method2577(2), arg1.method2577(2), arg1.method2577(2), arg1.method2576((byte) 63), arg1.method2576((byte) 127), arg1.method2600((byte) -125));
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBI)Z", line = 15)
    public static final boolean method1880(int arg0, byte arg1, int arg2) {
        if (arg1 <= 60) {
            field4126 = true;
        }
        field4125++;
        return class309.method1857(arg0, -29742, arg2) & class323.method1893(true, arg2, arg0);
    }
}
