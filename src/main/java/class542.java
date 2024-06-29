import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class542 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    private static boolean field7869 = false;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    private static int field7871 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Loe;")
    private static class183 field7870 = new class183();

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZB)V", line = 4)
    public static final synchronized void method3174(boolean arg0, byte arg1) {
        field7869 = arg0;
        int var2 = -54 % ((arg1 + 64) / 41);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lp;I)V", line = 13)
    public static final synchronized void method3175(class199 arg0, int arg1) {
        if (field7869) {
            return;
        }
        if (field7871 <= arg1) {
            arg0.method221(false);
        } else {
            class444 var2 = new class444();
            var2.field6317 = arg0;
            field7870.method1129(var2, 262144);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 39)
    public static final synchronized void method3176(boolean arg0) {
        field7871--;
        if (field7871 == 0) {
            method3178(false);
        }
        if (!arg0) {
            method3178(false);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 54)
    public static final synchronized void method3177(int arg0) {
        field7871++;
        if (arg0 >= -19) {
            method3177(49);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V", line = 64)
    public static final synchronized void method3178(boolean arg0) {
        while (true) {
            class444 var1 = (class444) field7870.method1137(-1);
            if (var1 == null) {
                if (arg0) {
                    field7869 = true;
                    return;
                }
                return;
            }
            var1.field6317.method221(true);
            var1.method3045(!arg0);
        }
    }
}
