import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class243 {

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Z")
    private static boolean field3078 = false;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    private static int field3080 = 0;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "Lbv;")
    private static class568 field3079 = new class568();

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public static final synchronized void method1505(int arg0) {
        if (arg0 == -21353) {
            field3080--;
            if (field3080 == 0) {
                method1507(-88);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lo;I)V")
    public static final synchronized void method1506(class439 arg0, int arg1) {
        if (field3078) {
            return;
        }
        if (arg1 < field3080) {
            class278 var2 = new class278();
            var2.field3628 = arg0;
            field3079.method3181(var2, true);
        } else {
            arg0.method503(false);
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static final synchronized void method1507(int arg0) {
        if (arg0 > -69) {
            method1507(-37);
        }
        while (true) {
            class278 var1 = (class278) field3079.method3184(-5295);
            if (var1 == null) {
                return;
            }
            var1.field3628.method503(true);
            var1.method589(-8880);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
    public static final synchronized void method1508(boolean arg0) {
        field3080++;
        if (arg0) {
            field3079 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1509(boolean arg0, int arg1) {
        field3078 = arg0;
        int var2 = -39 / ((arg1 + 1) / 49);
    }
}
