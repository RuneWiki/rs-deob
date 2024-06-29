import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class209 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3604 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lmb;")
    public static class96 field3608 = class243.method1708("Fallen lassen", (byte) 117);

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[I")
    public static int[] field3606 = new int[128];

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lab;")
    public static class252 field3607;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLw;)Lw;")
    public static final class107 method1458(boolean arg0, class107 arg1) {
        if (arg0) {
            method1458(true, (class107) null);
        }
        field3610++;
        class107 var2 = client.method821(arg1);
        if (var2 == null) {
            var2 = arg1.field1931;
        }
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1459(int arg0) {
        if (arg0 == 28034) {
            field3608 = null;
            field3607 = null;
            field3606 = null;
        }
    }
}
