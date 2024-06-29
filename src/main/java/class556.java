import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class556 {

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "Z")
    private static boolean field7743 = false;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
    private static int field7744 = 0;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "Lmba;")
    private static class646 field7742 = new class646();

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(BLe;)V", line = 3)
    public static final synchronized void method3276(byte arg0, class2 arg1) {
        if (arg0 != -10) {
            method3278(114);
        }
        if (field7743) {
            return;
        }
        if (field7744 <= 0) {
            arg1.method12(false);
        } else {
            class82 var2 = new class82();
            var2.field1180 = arg1;
            field7742.method3610(9289, var2);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V", line = 33)
    public static final synchronized void method3277(int arg0) {
        while (true) {
            class82 var1 = (class82) field7742.method3623(0);
            if (var1 == null) {
                if (arg0 != -1) {
                    method3276((byte) -105, null);
                    return;
                }
                return;
            }
            var1.field1180.method12(true);
            var1.method549(arg0 ^ 0xFFFFE6F5);
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)V", line = 54)
    public static final synchronized void method3278(int arg0) {
        if (arg0 == 6287) {
            field7744++;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V", line = 64)
    public static final synchronized void method3279(boolean arg0) {
        field7744--;
        if (arg0) {
            field7742 = null;
        }
        if (field7744 == 0) {
            method3277(-1);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZB)V", line = 79)
    public static final synchronized void method3280(boolean arg0, byte arg1) {
        if (arg1 != -79) {
            method3279(false);
        }
        field7743 = arg0;
    }
}
