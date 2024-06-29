import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class248 extends class34 {

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Ltc;")
    public class143 field4218;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "Lke;")
    private static class256 field4217 = class316.method2202("Loaded input handler", 27626);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "Lke;")
    public static class256 field4220 = field4217;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lke;")
    public static class256 field4225 = class316.method2202(": ", 27626);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "S")
    public static short field4228 = 1;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field4221 = 0;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Lke;")
    public static class256 field4229 = class316.method2202("Shift)2click ENABLED(Q", 27626);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZIIZ)V", line = 25)
    public static final void method1671(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field4224++;
        class37.field668 = 0L;
        if (!arg4) {
            return;
        }
        int var5 = class35.method247(0);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        boolean var6 = false;
        if (var5 <= 0 != arg2 <= 0) {
            var6 = true;
        }
        if (class4.field70.startsWith("mac") && arg2 > 0) {
            arg1 = true;
        }
        if (arg1 && arg2 > 0) {
            var6 = true;
        }
        class256.method1773(false, arg0, var6, var5, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 61)
    public static void method1672(int arg0) {
        field4225 = null;
        field4229 = null;
        field4217 = null;
        if (arg0 != 0) {
            field4217 = (class256) null;
        }
        field4220 = null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V", line = 74)
    public static final void method1673(int arg0, int arg1, int arg2) {
        if (~class38.field694 != arg2 && arg1 != -1) {
            class183.method1342(class80.field1488, true, false, arg1, 0, class38.field694);
            class250.field4242 = true;
        }
        field4227++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 94)
    public static final Class method1674(byte arg0, String arg1) throws ClassNotFoundException {
        if (arg0 >= -46) {
            return (Class) null;
        }
        field4219++;
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

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIII)V", line = 137)
    public static final void method1675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class244.field4161 <= arg2 && class175.field3106 >= arg0 && arg5 >= class105.field1887 && arg1 <= class274.field4748) {
            class52.method416(arg0, arg3, arg1, arg2, (byte) -106, arg5);
        } else {
            class267.method1854(arg3, (byte) 64, arg2, arg1, arg0, arg5);
        }
        field4226++;
        if (arg4 != 25746) {
            field4222 = 77;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ltc;)V", line = 158)
    public class248(class143 arg0) {
        this.field4218 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLla;)Z", line = 168)
    public static final boolean method1676(byte arg0, class188 arg1) {
        field4230++;
        if (arg1.field3428 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != -77) {
            method1675(-36, 21, -117, 3, 105, 42);
        }
        while (arg1.field3428.length > var2) {
            int var3 = class233.method1580(var2, arg1, -4);
            int var4 = arg1.field3417[var2];
            if (arg1.field3428[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field3428[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field3428[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }
}
