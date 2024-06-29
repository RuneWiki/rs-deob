import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class243 extends class41 {

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "J")
    public static volatile long field4223 = 0L;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Lne;")
    public static class260 field4221 = new class260();

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "J")
    public static volatile long field4225 = 0L;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field4226 = -1;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field4227 = -1;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "B")
    public byte field4218;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lsc;")
    public class181 field4219;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lsc;")
    public class181 field4222;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "[Ltg;")
    public static class107[] field4224;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1647(String arg0, byte arg1) throws ClassNotFoundException {
        field4217++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg1 < 77) {
                method1648(-8);
            }
            if (arg0.equals("F")) {
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

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method1648(int arg0) {
        field4221 = null;
        if (arg0 == 21843) {
            field4224 = null;
        }
    }
}
