import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class402 {

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
    private static boolean field5392 = false;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    private static int field5393 = 0;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Lgk;")
    private static class616 field5394 = new class616();

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static final synchronized void method2261(byte arg0) {
        field5393++;
        if (arg0 != -12) {
            field5393 = -55;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final synchronized void method2262(int arg0) {
        while (true) {
            class601 var1 = (class601) field5394.method3440((byte) 121);
            if (var1 == null) {
                if (arg0 != 29025) {
                    field5393 = 67;
                    return;
                }
                return;
            }
            var1.field8466.method484(true);
            var1.method1922(120);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method2263(boolean arg0, int arg1) {
        if (arg1 > -69) {
            method2265(117, null);
        }
        field5392 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static final synchronized void method2264(int arg0) {
        field5393--;
        if (~field5393 == arg0) {
            method2262(29025);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILp;)V")
    public static final synchronized void method2265(int arg0, class251 arg1) {
        if (field5392) {
            return;
        }
        if (field5393 > 0) {
            class601 var2 = new class601();
            var2.field8466 = arg1;
            field5394.method3425(var2, false);
        } else {
            arg1.method484(false);
        }
        if (arg0 >= -30) {
            method2263(false, 57);
        }
    }
}
