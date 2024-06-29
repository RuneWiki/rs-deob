import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class389 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    private static int field5821 = 0;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
    private static boolean field5823 = false;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ltg;")
    private static class605 field5822 = new class605();

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V", line = 3)
    public static final synchronized void method2428(boolean arg0, boolean arg1) {
        if (!arg0) {
            field5823 = arg1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 13)
    public static final synchronized void method2429(int arg0) {
        while (true) {
            class586 var1 = (class586) field5822.method3466(0);
            if (var1 == null) {
                if (arg0 != -1) {
                    method2431(null, 3);
                    return;
                }
                return;
            }
            var1.field8283.method5(true);
            var1.method636((byte) 97);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 37)
    public static final synchronized void method2430(boolean arg0) {
        field5821--;
        if (field5821 == 0) {
            method2429(-1);
        }
        if (arg0) {
            field5822 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Le;I)V", line = 53)
    public static final synchronized void method2431(class2 arg0, int arg1) {
        if (field5823) {
            return;
        }
        int var2 = 12 % ((53 - arg1) / 43);
        if (field5821 <= 0) {
            arg0.method5(false);
        } else {
            class586 var3 = new class586();
            var3.field8283 = arg0;
            field5822.method3472(84, var3);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 81)
    public static final synchronized void method2432(int arg0) {
        if (arg0 == 0) {
            field5821++;
        }
    }
}
