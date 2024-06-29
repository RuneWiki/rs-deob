import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class30 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field350 = -1;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field353 = -2;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field355 = -1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "F")
    public static float field349;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V", line = 9)
    public static final void method214(int arg0, byte arg1) {
        if (arg1 != -121) {
            method215((byte) 93);
        }
        class208.field3144.method387(arg0, false);
        field354++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 22)
    public static final void method215(byte arg0) {
        class361.field5713++;
        field352++;
        class328.field5282.method304(13, 19830);
        class328.field5282.method1055(class117.method768(-103), 97);
        class328.field5282.method1003(class165.field2546, -2);
        if (arg0 < 76) {
            field349 = -0.39732173F;
        }
        class328.field5282.method1003(class95.field1307, -2);
        class328.field5282.method1055(class24.field285, 96);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 45)
    public static final Class method216(String arg0, int arg1) throws ClassNotFoundException {
        field351++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg1 != 2859) {
                field356 = 66;
            }
            if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }
}
