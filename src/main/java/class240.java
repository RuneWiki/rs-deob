import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public abstract class class240 {

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "Lqfa;")
    public static class98 field3197 = new class98(12, -2);

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
    public static int field3200 = -1;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "[I")
    public static int[] field3201 = new int[2048];

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "Lkt;")
    public static class155 field3203 = new class155();

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 3)
    public static void method1528(int arg0) {
        if (arg0 > 23) {
            field3197 = null;
            field3201 = null;
            field3203 = null;
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZI)I", line = 20)
    public static final int method1529(boolean arg0, int arg1) {
        field3202++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        }
        if (!arg0) {
            method1530((byte) 98);
        }
        if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V", line = 56)
    public static final void method1530(byte arg0) {
        field3199++;
        if (class69.field856 == 0 || arg0 != -21) {
            return;
        }
        try {
            if (++class689.field9420 > 2000) {
                if (class333.field4663 != null) {
                    class333.field4663.method2844(Integer.MIN_VALUE);
                    class333.field4663 = null;
                }
                if (class429.field6123 >= 2) {
                    class480.field6795 = -5;
                    class69.field856 = 0;
                    return;
                }
                class343.field4784.method4163(112);
                class69.field856 = 1;
                class689.field9420 = 0;
                class429.field6123++;
            }
            if (class69.field856 == 1) {
                class43.field531 = class343.field4784.method4160(class202.field2644, (byte) -61);
                class69.field856 = 2;
            }
            if (class69.field856 == 2) {
                if (class43.field531.field3310 == 2) {
                    throw new IOException();
                }
                if (class43.field531.field3310 != 1) {
                    return;
                }
                class333.field4663 = class285.method1861(7500, (Socket) class43.field531.field3311, 62);
                class43.field531 = null;
                class390.method2455((byte) -11);
                class69.field856 = 4;
            }
            if (class69.field856 == 4 && class333.field4663.method2846((byte) 53, 1)) {
                class333.field4663.method2847(-1, class89.field1072.field9154, 0, 1);
                int var1 = class89.field1072.field9154[0] & 0xFF;
                class69.field856 = 0;
                class480.field6795 = var1;
                class333.field4663.method2844(Integer.MIN_VALUE);
                class333.field4663 = null;
            }
        } catch (IOException var2) {
            if (class333.field4663 != null) {
                class333.field4663.method2844(Integer.MIN_VALUE);
                class333.field4663 = null;
            }
            if (class429.field6123 < 2) {
                class343.field4784.method4163(-123);
                class429.field6123++;
                class69.field856 = 1;
                class689.field9420 = 0;
            } else {
                class69.field856 = 0;
                class480.field6795 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILum;)Lbga;", line = 158)
    public static final class356 method1531(int arg0, class524 arg1) {
        field3198++;
        class356 var2;
        if (class745.field10349 == null) {
            var2 = new class356();
        } else {
            var2 = class745.field10349;
            class745.field10349 = class745.field10349.field5066;
            class622.field8667--;
            var2.field5066 = null;
        }
        if (arg0 > -40) {
            method1528(-52);
        }
        var2.field5067 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(BLor;)Lor;")
    public abstract class640 method990(byte arg0, class640 arg1);
}
