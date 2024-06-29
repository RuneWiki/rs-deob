import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class509 {

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    private static int field7178 = 0;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "Z")
    private static boolean field7180 = false;

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lwba;")
    private static class46 field7179 = new class46();

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static final synchronized void method2921(byte arg0) {
        field7178++;
        int var1 = 37 % ((-arg0 - 10) / 47);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
    public static final synchronized void method2922(int arg0) {
        field7178--;
        int var1 = -72 / ((arg0 - 28) / 63);
        if (field7178 == 0) {
            method2925(0);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method2923(boolean arg0, byte arg1) {
        field7180 = arg0;
        if (arg1 > -122) {
            method2923(false, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLp;)V")
    public static final synchronized void method2924(byte arg0, class198 arg1) {
        if (field7180) {
            return;
        }
        if (arg0 != -106) {
            method2921((byte) 73);
        }
        if (field7178 > 0) {
            class346 var2 = new class346();
            var2.field5041 = arg1;
            field7179.method474(var2, arg0 ^ 0xFFFFFF90);
        } else {
            arg1.method131(false);
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
    public static final synchronized void method2925(int arg0) {
        while (true) {
            class346 var1 = (class346) field7179.method483((byte) -126);
            if (var1 == null) {
                if (arg0 != 0) {
                    field7180 = false;
                    return;
                }
                return;
            }
            var1.field5041.method131(true);
            var1.method3678(-1);
        }
    }
}
