import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class373 {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Z")
    private static boolean field5294 = false;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    private static int field5295 = 0;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Lsu;")
    private static class192 field5296 = new class192();

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 3)
    public static final synchronized void method2175(int arg0) {
        field5295--;
        if (~field5295 == arg0) {
            method2179((byte) -89);
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 16)
    public static final synchronized void method2176(int arg0) {
        field5295++;
        if (arg0 != -23634) {
            method2175(-100);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lg;B)V", line = 28)
    public static final synchronized void method2177(class141 arg0, byte arg1) {
        if (field5294) {
            return;
        }
        if (field5295 > 0) {
            class529 var2 = new class529();
            var2.field7234 = arg0;
            field5296.method1273(var2, (byte) 122);
        } else {
            arg0.method58(false);
        }
        if (arg1 != -27) {
            field5296 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)V", line = 54)
    public static final synchronized void method2178(boolean arg0, byte arg1) {
        field5294 = arg0;
        if (arg1 != 82) {
            method2175(3);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 64)
    public static final synchronized void method2179(byte arg0) {
        if (arg0 != -89) {
            return;
        }
        while (true) {
            class529 var1 = (class529) field5296.method1272(arg0 + 89);
            if (var1 == null) {
                return;
            }
            var1.field7234.method58(true);
            var1.method2971(1);
        }
    }
}
