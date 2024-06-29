import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class280 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Ljava/lang/String;")
    public String field4022;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4017 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Lap;")
    public static class310 field4023 = new class310(69, 4);

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lmb;")
    public static class262 field4024 = new class262();

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field4027 = 0;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Lap;")
    public static class310 field4025 = new class310(21, 7);

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lap;")
    public static class310 field4028 = new class310(25, 7);

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lnl;")
    public static class435 field4026;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
    public static int[] field4029;

    @OriginalMember(owner = "client!lo", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4021++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 11)
    public static void method1869(int arg0) {
        field4026 = null;
        field4029 = null;
        if (arg0 != 7) {
            method1871(-74);
        }
        field4025 = null;
        field4017 = null;
        field4023 = null;
        field4028 = null;
        field4024 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 44)
    public static final Class method1870(boolean arg0, String arg1) throws ClassNotFoundException {
        field4018++;
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
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0) {
                method1871(-127);
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 84)
    public static final void method1871(int arg0) {
        field4019++;
        if (arg0 != -32449) {
            field4020 = -43;
        }
        if (class389.field5379 != class340.field4704) {
            try {
                class32.method200("tbrefresh", (byte) -85, class204.field2997);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 105)
    public class280(String arg0, int arg1) {
        this.field4016 = arg1;
        this.field4022 = arg0;
    }
}
