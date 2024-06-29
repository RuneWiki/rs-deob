import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class260 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
    private static boolean field3523 = false;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    private static int field3525 = 0;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lmg;")
    private static class530 field3524 = new class530();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1544(boolean arg0, int arg1) {
        field3523 = arg0;
        if (arg1 != 10260) {
            method1546((byte) -6);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final synchronized void method1545(byte arg0) {
        if (arg0 != 51) {
            field3525 = -114;
        }
        while (true) {
            class446 var1 = (class446) field3524.method3134((byte) -73);
            if (var1 == null) {
                return;
            }
            var1.field6554.method442();
            var1.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final synchronized void method1546(byte arg0) {
        if (arg0 != -36) {
            field3525 = -116;
        }
        field3525--;
        if (field3525 == 0) {
            method1545((byte) 51);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjs;)V")
    public static final synchronized void method1547(int arg0, class194 arg1) {
        if (field3523) {
            return;
        }
        if (arg0 <= ~field3525) {
            arg1.method442();
        } else {
            class446 var2 = new class446();
            var2.field6554 = arg1;
            field3524.method3139(~arg0, var2);
        }
    }
}
