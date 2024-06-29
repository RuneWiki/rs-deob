import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class80 extends class69 {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Z")
    public static boolean field1118 = false;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lui;")
    public static class239 field1115 = new class239(128);

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1121 = -1;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public int field1117;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lda;")
    public class107 field1112;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Loc;")
    public class129 field1101;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Ltc;")
    public class35 field1105;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lwc;")
    public class91 field1107;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method595(byte arg0, String arg1) throws ClassNotFoundException {
        field1094++;
        if (arg0 != 96) {
            field1118 = true;
        }
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
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class92.field1319 * arg0 >> 8;
        if (arg1 != 16491) {
            return;
        }
        if (var4 != 0 && arg2 != -1) {
            class284.method1903(0, var4, 24, class263.field4169, false, arg2);
            class82.field1141 = true;
        }
        field1099++;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public final void method597(int arg0) {
        this.field1105 = null;
        if (arg0 == -1) {
            this.field1112 = null;
            this.field1107 = null;
            field1120++;
            this.field1101 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method598(int arg0) {
        if (arg0 == 0) {
            field1115 = null;
        }
    }
}
