import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class29 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Z")
    private static boolean field441 = false;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    private static int field442 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lki;")
    private static class364 field440 = new class364();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 3)
    public static final synchronized void method238(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field440 = null;
        }
        field441 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 14)
    public static final synchronized void method239(int arg0) {
        if (arg0 != 11302) {
            method239(40);
        }
        field442++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 25)
    public static final synchronized void method240(int arg0) {
        field442--;
        if (field442 == 0) {
            method242((byte) -29);
        }
        int var1 = 107 % ((-arg0 - 49) / 36);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILg;)V", line = 42)
    public static final synchronized void method241(int arg0, class128 arg1) {
        if (field441) {
            return;
        }
        int var2 = 90 % ((arg0 + 73) / 40);
        if (field442 <= 0) {
            arg1.method599(false);
        } else {
            class496 var3 = new class496();
            var3.field6551 = arg1;
            field440.method2087(var3, -125);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 66)
    public static final synchronized void method242(byte arg0) {
        while (true) {
            class496 var1 = (class496) field440.method2092((byte) 92);
            if (var1 == null) {
                if (arg0 >= -21) {
                    field442 = 121;
                    return;
                }
                return;
            }
            var1.field6551.method599(true);
            var1.method2438((byte) 119);
        }
    }
}
