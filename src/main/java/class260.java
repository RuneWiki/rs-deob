import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class260 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    private static int field3708 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Z")
    private static boolean field3709 = false;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lmr;")
    private static class611 field3707 = new class611();

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZZ)V")
    public static final synchronized void method1723(boolean arg0, boolean arg1) {
        if (arg0) {
            method1727((byte) -16);
        }
        field3709 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final synchronized void method1724(int arg0) {
        if (arg0 != -14594) {
            method1726(null, true);
        }
        field3708--;
        if (field3708 == 0) {
            method1725(arg0 + 14511);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final synchronized void method1725(int arg0) {
        if (arg0 >= -53) {
            field3708 = -98;
        }
        while (true) {
            class392 var1 = (class392) field3707.method3563(0);
            if (var1 == null) {
                return;
            }
            var1.field5646.method9(true);
            var1.method2656((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Le;Z)V")
    public static final synchronized void method1726(class2 arg0, boolean arg1) {
        if (field3709) {
            return;
        }
        if (arg1) {
            field3709 = false;
        }
        if (field3708 <= 0) {
            arg0.method9(false);
        } else {
            class392 var2 = new class392();
            var2.field5646 = arg0;
            field3707.method3559(var2, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final synchronized void method1727(byte arg0) {
        if (arg0 == -52) {
            field3708++;
        }
    }
}
