import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class72 extends class447 {

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field1027 = -1;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field1028 = 1339;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "Lhi;")
    public static class45 field1032 = new class45(8, 8);

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Lrb;")
    public static class283 field1037;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lm;")
    public static class80 field1035;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method571(int arg0, String arg1) throws ClassNotFoundException {
        ++field1030;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0 != 8) {
                method573(false);
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        super.field6558 = arg0;
        if (arg3 == 29849) {
            super.field6555 = arg1;
            ++field1029;
            super.field6561 = arg2;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    public static void method573(boolean arg0) {
        field1037 = null;
        field1035 = null;
        field1032 = null;
        if (arg0) {
            field1035 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BF)V")
    public final void method574(byte arg0, float arg1) {
        int var3 = -100 / ((-72 - arg0) / 46);
        super.field6560 = arg1;
        ++field1034;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIF)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
