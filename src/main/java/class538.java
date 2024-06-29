import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class538 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lqe;")
    public static class469 field7690 = new class469(79, 2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "J")
    public static long field7689;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lop;")
    public static class190 field7691;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lvd;")
    public static class39 field7687;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILha;)V", line = 5)
    public static final void method3158(int arg0, class60 arg1) {
        if (class332.field4768) {
            class650.method3775(arg1, -56);
        } else {
            class446.method2760(114, arg1);
        }
        if (arg0 <= 38) {
            method3159(-105);
        }
        field7688++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 21)
    public static void method3159(int arg0) {
        field7687 = null;
        field7691 = null;
        if (arg0 == 2) {
            field7690 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 34)
    public static final Class method3160(int arg0, String arg1) throws ClassNotFoundException {
        field7686++;
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
            if (arg0 != 79) {
                method3158(-24, null);
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
