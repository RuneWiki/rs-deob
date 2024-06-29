import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class73 extends class59 {

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Lok;")
    public static class41 field1078 = class137.method956("(U2", 45);

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Lok;")
    public static class41 field1087 = class137.method956(" loggt sich aus)3", 45);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "Lbc;")
    public class302 field1072;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Lbc;")
    public class302 field1079;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "Lok;")
    public class41 field1086;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Z")
    public boolean field1074;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "[Ljava/lang/Object;")
    public Object[] field1083;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IZ)Z", line = 14)
    public static final boolean method538(int arg0, boolean arg1) {
        class33.field498 = true;
        field1073++;
        class313.field5287 = arg0 + 1 & 0xFFFF;
        if (arg1) {
            field1078 = (class41) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 30)
    public static final void method539(int arg0, int arg1) {
        if (arg0 != 65535) {
            method541(0, 120, -12, false, -59);
        }
        field1076++;
        class46 var2 = class195.method1396(3, arg1, false);
        var2.method336(true);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 48)
    public static final void method540(int arg0) {
        if (arg0 == 3) {
            field1077++;
            class276.field4519.method615(arg0 ^ 0x3E63);
            class306.field5132.method2054((byte) 28);
            class152.field2394.method2054((byte) 52);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZI)V", line = 63)
    public static final void method541(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1075++;
        class245.field3909 = -1;
        class296.field4788 = -1;
        class110.field1565 = class212.field3414 * arg2 / arg1;
        class45.field707 = class66.field1004 * arg0 / arg4;
        class317.method2188(-1);
        if (!arg3) {
            field1078 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 81)
    public static void method542(int arg0) {
        field1087 = null;
        if (arg0 > -102) {
            field1081 = 2;
        }
        field1078 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 110)
    public static final Class method543(int arg0, String arg1) throws ClassNotFoundException {
        field1085++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg0 != -1) {
            return (Class) null;
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
}
