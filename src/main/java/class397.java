import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class397 {

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "J")
    public static long field5932;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "[Ll;")
    public static class127[] field5929;

    static {
        new class347(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lfe;", line = 11)
    public static final class152 method2382(int arg0) {
        class487.field7253 = 0;
        field5934++;
        return arg0 <= 37 ? null : class210.method1357((byte) -79);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 24)
    public static void method2383(byte arg0) {
        if (arg0 > 82) {
            field5929 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 38)
    public static final Class method2384(byte arg0, String arg1) throws ClassNotFoundException {
        field5930++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg0 >= -121) {
            return null;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Z", line = 81)
    public static final boolean method2385(int arg0, int arg1, int arg2) {
        field5933++;
        if (arg0 <= 11) {
            field5929 = null;
        }
        return (arg2 & 0x70000) != 0 | class268.method1670(arg2, (byte) -108, arg1) || class328.method2040(arg2, arg1, 13430);
    }
}
