import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class405 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private static int field5331 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Z")
    private static boolean field5332 = false;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lifa;")
    private static class450 field5333 = new class450();

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static final synchronized void method2429(int arg0) {
        if (arg0 >= -57) {
            field5332 = false;
        }
        while (true) {
            class590 var1 = (class590) field5333.method2730(-31260);
            if (var1 == null) {
                return;
            }
            var1.field8025.method229(true);
            var1.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLe;)V")
    public static final synchronized void method2430(byte arg0, class559 arg1) {
        if (field5332 || arg0 != -104) {
            return;
        }
        if (field5331 <= 0) {
            arg1.method229(false);
        } else {
            class590 var2 = new class590();
            var2.field8025 = arg1;
            field5333.method2732(var2, arg0 + 22043);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static final synchronized void method2431(boolean arg0) {
        field5331++;
        if (!arg0) {
            field5333 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final synchronized void method2432(int arg0) {
        field5331--;
        int var1 = -127 / ((arg0 - 51) / 38);
        if (field5331 == 0) {
            method2429(-74);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method2433(boolean arg0, byte arg1) {
        if (arg1 > 12) {
            field5332 = arg0;
        }
    }
}
