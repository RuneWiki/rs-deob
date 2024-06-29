import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class301 {

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "Z")
    private static boolean field3922 = false;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    private static int field3921 = 0;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "Lfha;")
    private static class522 field3923 = new class522();

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method1763(boolean arg0, int arg1) {
        if (arg1 < -119) {
            field3922 = arg0;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)V")
    public static final synchronized void method1764(byte arg0) {
        if (arg0 != 45) {
            method1765(null, 51);
        }
        field3921++;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Le;I)V")
    public static final synchronized void method1765(class2 arg0, int arg1) {
        if (field3922) {
            return;
        }
        if (field3921 > arg1) {
            class428 var2 = new class428();
            var2.field5911 = arg0;
            field3923.method3116(29066, var2);
        } else {
            arg0.method3(false);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public static final synchronized void method1766(int arg0) {
        field3921--;
        if (arg0 < 76) {
            field3923 = null;
        }
        if (field3921 == 0) {
            method1767(0);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
    public static final synchronized void method1767(int arg0) {
        while (true) {
            class428 var1 = (class428) field3923.method3115(true);
            if (var1 == null) {
                if (arg0 != 0) {
                    field3921 = -67;
                    return;
                }
                return;
            }
            var1.field5911.method3(true);
            var1.method3065(-17363);
        }
    }
}
