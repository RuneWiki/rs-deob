import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class374 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field5247 = 1;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field5245;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public int field5246;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static final void method2353(byte arg0) {
        field5249++;
        class744.field10423.method1530((byte) 87);
        int var1 = -87 / ((-arg0 - 5) / 55);
        class667.field9363 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method2354(byte arg0, String arg1) throws ClassNotFoundException {
        field5248++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 >= -51) {
                method2353((byte) 109);
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}
