import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class99 {

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "[I")
    public static int[] field29 = new int[1024];

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "[Lne;")
    public static class338[] field34 = new class338[14];

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "Lpu;")
    public static class589 field30;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "Ldd;")
    public static class733 field33;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 3)
    public static final Class method93(int arg0, String arg1) throws ClassNotFoundException {
        field36++;
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
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else if (arg0 == 8006) {
            return Class.forName(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Llf;", line = 44)
    public final class251 method94(int arg0) {
        field31++;
        if (arg0 != 1024) {
            field30 = null;
        }
        return class179.field2196;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 64)
    public static void method95(byte arg0) {
        field30 = null;
        field34 = null;
        if (arg0 < -82) {
            field29 = null;
            field33 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lps;Lft;IIIIIIIIIIIIII)V", line = 82)
    public class2(class105 arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field35 = arg15;
    }
}
