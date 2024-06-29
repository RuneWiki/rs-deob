import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class512 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    private static boolean field7571 = false;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    private static int field7570 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lam;")
    private static class455 field7572 = new class455();

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final synchronized void method3052(int arg0) {
        field7570--;
        if (arg0 == 16028 && field7570 == 0) {
            method3053(0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
    public static final synchronized void method3053(int arg0) {
        while (true) {
            class445 var1 = (class445) field7572.method2654(-1);
            if (var1 == null) {
                if (arg0 != 0) {
                    method3054(-120, null);
                    return;
                }
                return;
            }
            var1.field6229.method540();
            var1.method2891(105);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILm;)V")
    public static final synchronized void method3054(int arg0, class130 arg1) {
        if (field7571) {
            return;
        }
        int var2 = 76 % ((arg0 + 49) / 56);
        if (field7570 <= 0) {
            arg1.method540();
        } else {
            class445 var3 = new class445();
            var3.field6229 = arg1;
            field7572.method2657(8492, var3);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method3055(boolean arg0, byte arg1) {
        if (arg1 > 47) {
            field7571 = arg0;
        }
    }
}
