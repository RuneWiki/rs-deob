import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class280 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    private static int field3719 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Z")
    private static boolean field3720 = false;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lkba;")
    private static class108 field3721 = new class108();

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method1678(int arg0, boolean arg1) {
        if (arg0 >= -41) {
            method1678(-3, false);
        }
        field3720 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static final synchronized void method1679(int arg0) {
        if (arg0 <= -24) {
            field3719--;
            if (field3719 == 0) {
                method1682(0);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLe;)V")
    public static final synchronized void method1680(boolean arg0, class533 arg1) {
        if (field3720) {
            return;
        }
        if (field3719 <= 0) {
            arg1.method73(false);
        } else {
            class35 var2 = new class35();
            var2.field366 = arg1;
            field3721.method725(var2, -20911);
        }
        if (arg0) {
            field3721 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static final synchronized void method1681(int arg0) {
        field3719++;
        if (arg0 != -374) {
            method1682(-76);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
    public static final synchronized void method1682(int arg0) {
        while (true) {
            class35 var1 = (class35) field3721.method727(6494);
            if (var1 == null) {
                if (arg0 != 0) {
                    method1679(11);
                    return;
                }
                return;
            }
            var1.field366.method73(true);
            var1.method315(94);
        }
    }
}
