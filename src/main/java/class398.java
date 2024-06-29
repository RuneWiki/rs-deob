import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class398 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    private static int field5630 = 0;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
    private static boolean field5631 = false;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lv;")
    private static class165 field5632 = new class165();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 4)
    public static final synchronized void method2446(int arg0) {
        while (true) {
            class721 var1 = (class721) field5632.method1034(20791);
            if (var1 == null) {
                if (arg0 >= -16) {
                    method2449((byte) -63);
                    return;
                }
                return;
            }
            var1.field9953.method450(true);
            var1.method527(-11229);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLe;)V", line = 24)
    public static final synchronized void method2447(boolean arg0, class784 arg1) {
        if (field5631) {
            return;
        }
        if (field5630 > 0) {
            class721 var2 = new class721();
            var2.field9953 = arg1;
            field5632.method1039(var2, 0);
        } else {
            arg1.method450(false);
        }
        if (!arg0) {
            method2449((byte) 31);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 51)
    public static final synchronized void method2448(int arg0) {
        field5630++;
        if (arg0 > -56) {
            field5630 = -14;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 65)
    public static final synchronized void method2449(byte arg0) {
        if (arg0 == 118) {
            field5630--;
            if (field5630 == 0) {
                method2446(-59);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V", line = 81)
    public static final synchronized void method2450(boolean arg0, int arg1) {
        if (arg1 > 57) {
            field5631 = arg0;
        }
    }
}
