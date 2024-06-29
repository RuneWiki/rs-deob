import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class638 extends class143 {

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "[B")
    public byte[] field9051;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "Leda;")
    public static class116 field9050 = new class116(59, 2);

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field9054 = -1;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Ljn;")
    public static class117 field9056 = new class117(50);

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field9059 = 50;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
    public static int[] field9060 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "[I")
    public static int[] field9063 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field9064 = new String[field9059];

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "[I")
    public static int[] field9057 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "[I")
    public static int[] field9061 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "[I")
    public static int[] field9058 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
    public static int[] field9062 = new int[field9059];

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lek;I)Luw;", line = 5)
    public static final class12 method3595(class465 arg0, int arg1) {
        if (arg1 != 50) {
            method3597(-30);
        }
        field9053++;
        return new class12(arg0.method2744(-1), arg0.method2744(-1), arg0.method2744(-1), arg0.method2744(-1), arg0.method2744(-1), arg0.method2744(-1), arg0.method2744(arg1 - 51), arg0.method2744(arg1 - 51), arg0.method2714(true), arg0.method2705(-70));
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)Z", line = 16)
    public static final boolean method3596(byte arg0, int arg1, int arg2) {
        if (arg0 <= 46) {
            return false;
        } else {
            field9052++;
            return (arg2 & 0x70000) != 0 | class383.method2341(-85, arg1, arg2) || class250.method1597(arg1, arg2, 26127);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 28)
    public static void method3597(int arg0) {
        field9058 = null;
        field9064 = null;
        field9063 = null;
        field9061 = null;
        int var1 = 66 % ((30 - arg0) / 59);
        field9060 = null;
        field9056 = null;
        field9057 = null;
        field9062 = null;
        field9050 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)I", line = 47)
    public static final int method3598(int arg0, int arg1, int arg2) {
        field9055++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 65408) {
            return 93;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "([B)V", line = 73)
    public class638(byte[] arg0) {
        this.field9051 = arg0;
    }
}
