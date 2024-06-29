import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[Lgj;")
    public static class381[] field98;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ldg;Z)V")
    public static final void method47(class236 arg0, boolean arg1) {
        field97++;
        if ((arg0.field3364.length - arg0.field3320) < 1) {
            return;
        }
        int var2 = arg0.method1574(-113);
        if (var2 < 0 || var2 > 1 || (arg0.field3364.length - arg0.field3320) < 2 || !arg1) {
            return;
        }
        int var3 = arg0.method1617((byte) 48);
        if ((var3 * 6) != (arg0.field3364.length - arg0.field3320)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field3364.length <= arg0.field3320) {
                            return;
                        }
                        var4 = arg0.method1617((byte) 48);
                        var5 = arg0.method1597(3641);
                    } while (class158.field2064.length <= var4);
                } while (!class134.field1621[var4]);
            } while (class204.method1352((byte) -2, var4).field6202 == '1' && (var5 < -1 || var5 > 1));
            class158.field2064[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method48(boolean arg0) {
        field98 = null;
        if (arg0) {
            field98 = null;
        }
    }
}
