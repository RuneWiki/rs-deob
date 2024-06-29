import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class class527 extends class674 {

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "Lqk;")
    public static class148 field7370 = new class148(31, 3);

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field7374 = 7000;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "J")
    public static long field7373 = -1L;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field7375 = field7374;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        if (arg1 <= 76) {
            field7374 = -25;
        }
        ++field7365;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method3136(byte arg0, String arg1) throws ClassNotFoundException {
        ++field7371;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else {
            if (arg0 != -101) {
                method3137(64);
            }
            if (arg1.equals("I")) {
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
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method3137(int arg0) {
        if (arg0 == 7000) {
            field7370 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)Z")
    public final boolean method342(boolean arg0) {
        ++field7368;
        if (arg0) {
            this.method342(true);
        }
        return class359.field4594[(super.field9490 >> class509.field7106) + -class126.field1717 - -class707.field9874][(super.field9489 >> class509.field7106) + -class157.field2139 + class707.field9874];
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        int var2 = 98 % ((arg0 - -45) / 42);
        ++field7369;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(IIIII)V")
    public class527(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field9501 = (byte) arg3;
        super.field9490 = arg0;
        super.field9489 = arg2;
        super.field9495 = (byte) arg4;
        super.field9502 = arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[Lkb;)I")
    public final int method344(int arg0, class757[] arg1) {
        ++field7372;
        int var3 = 104 % ((35 - arg0) / 58);
        return this.method3864(super.field9489 >> class509.field7106, arg1, super.field9490 >> class509.field7106, 0);
    }

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        ++field7364;
        class590 var2 = class141.method926(super.field9501, super.field9490 >> class509.field7106, super.field9489 >> class509.field7106);
        if (arg0 != 32188) {
            field7374 = 57;
        }
        return var2 != null && var2.field8468.field10360 ? class628.method3665(65535, var2.field8468.method268(-1) - -this.method268(-1), super.field9490 >> class509.field7106, super.field9489 >> class509.field7106, super.field9501) : class614.method3603(super.field9489 >> class509.field7106, false, super.field9490 >> class509.field7106, super.field9501);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        if (arg0 != -57) {
            this.method365(31, (byte) -118, true, 85, (class545) null, 84, (class674) null);
        }
        ++field7367;
        return false;
    }
}
