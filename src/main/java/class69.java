import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class69 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    private static int field836 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Z")
    private static boolean field834 = false;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lwo;")
    private static class445 field835 = new class445();

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V", line = 5)
    public static final synchronized void method383(int arg0, boolean arg1) {
        field834 = arg1;
        if (arg0 != 0) {
            method383(-94, false);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 15)
    public static final synchronized void method384(int arg0) {
        if (arg0 <= -77) {
            field836--;
            if (field836 == 0) {
                method387((byte) 92);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 31)
    public static final synchronized void method385(int arg0) {
        if (arg0 != -1) {
            method384(-3);
        }
        field836++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILp;)V", line = 41)
    public static final synchronized void method386(int arg0, class247 arg1) {
        if (field834) {
            return;
        }
        if (field836 > 0) {
            class301 var2 = new class301();
            var2.field3990 = arg1;
            field835.method2507(var2, (byte) -128);
        } else {
            arg1.method528(false);
        }
        if (arg0 != -1995) {
            field834 = true;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 65)
    public static final synchronized void method387(byte arg0) {
        int var1 = -73 / ((-arg0 - 19) / 62);
        while (true) {
            class301 var2 = (class301) field835.method2502((byte) 29);
            if (var2 == null) {
                return;
            }
            var2.field3990.method528(true);
            var2.method242(true);
        }
    }
}
