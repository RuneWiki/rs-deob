import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class431 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    private static int field6515 = 0;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "Z")
    private static boolean field6516 = false;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lnj;")
    private static class317 field6514 = new class317();

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final synchronized void method2718(int arg0) {
        if (arg0 != 0) {
            method2718(-98);
        }
        while (true) {
            class485 var1 = (class485) field6514.method2127(-115);
            if (var1 == null) {
                return;
            }
            var1.field7359.method175();
            var1.method3149(71);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZZ)V")
    public static final synchronized void method2719(boolean arg0, boolean arg1) {
        field6516 = arg1;
        if (arg0) {
            field6515 = 118;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static final synchronized void method2720(byte arg0) {
        field6515--;
        if (arg0 <= 74) {
            field6515 = -58;
        }
        if (field6515 == 0) {
            method2718(0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lwb;Z)V")
    public static final synchronized void method2721(class400 arg0, boolean arg1) {
        if (arg1) {
            field6514 = null;
        }
        if (field6516) {
            return;
        }
        if (field6515 > 0) {
            class485 var2 = new class485();
            var2.field7359 = arg0;
            field6514.method2124(var2, (byte) -75);
        } else {
            arg0.method175();
        }
    }
}
