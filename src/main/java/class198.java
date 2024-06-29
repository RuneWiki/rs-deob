import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class198 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    private static int field2618 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    private static boolean field2619 = false;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lbg;")
    private static class464 field2620 = new class464();

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 3)
    public static final synchronized void method1214(int arg0) {
        if (arg0 > 82) {
            field2618--;
            if (field2618 == 0) {
                method1218(-9657);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 21)
    public static final synchronized void method1215(int arg0) {
        field2618++;
        int var1 = 102 % ((arg0 - 16) / 32);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLe;)V", line = 33)
    public static final synchronized void method1216(byte arg0, class532 arg1) {
        if (field2619) {
            return;
        }
        if (arg0 != 123) {
            method1215(-33);
        }
        if (field2618 <= 0) {
            arg1.method106(false);
        } else {
            class190 var2 = new class190();
            var2.field2548 = arg1;
            field2620.method2770((byte) -13, var2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V", line = 63)
    public static final synchronized void method1217(boolean arg0, boolean arg1) {
        field2619 = arg0;
        if (!arg1) {
            field2618 = 43;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 77)
    public static final synchronized void method1218(int arg0) {
        while (true) {
            class190 var1 = (class190) field2620.method2762((byte) -16);
            if (var1 == null) {
                if (arg0 != -9657) {
                    field2619 = false;
                    return;
                }
                return;
            }
            var1.field2548.method106(true);
            var1.method1185(-30);
        }
    }
}
