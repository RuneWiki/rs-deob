import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class270 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Z")
    private static boolean field3803 = false;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    private static int field3802 = 0;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Low;")
    private static class665 field3804 = new class665();

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public static final synchronized void method1722(int arg0) {
        if (arg0 != -1) {
            method1723(true, -60);
        }
        while (true) {
            class449 var1 = (class449) field3804.method3726(12691);
            if (var1 == null) {
                return;
            }
            var1.field6182.method444(true);
            var1.method4237(-1);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1723(boolean arg0, int arg1) {
        int var2 = 90 % ((arg1 + 44) / 35);
        field3803 = arg0;
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
    public static final synchronized void method1724(int arg0) {
        if (arg0 <= 100) {
            field3804 = null;
        }
        field3802--;
        if (field3802 == 0) {
            method1722(-1);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public static final synchronized void method1725(int arg0) {
        if (arg0 != -1) {
            method1725(44);
        }
        field3802++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Le;I)V")
    public static final synchronized void method1726(class784 arg0, int arg1) {
        if (field3803) {
            return;
        }
        if (~field3802 >= arg1) {
            arg0.method444(false);
        } else {
            class449 var2 = new class449();
            var2.field6182 = arg0;
            field3804.method3728((byte) 119, var2);
        }
    }
}
