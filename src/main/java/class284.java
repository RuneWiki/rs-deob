import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class284 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Z")
    private static boolean field3936 = false;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    private static int field3938 = 0;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Leea;")
    private static class114 field3937 = new class114();

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method1835(int arg0, boolean arg1) {
        if (arg0 != -2662) {
            field3936 = true;
        }
        field3936 = arg1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static final synchronized void method1836(int arg0) {
        if (arg0 != 0) {
            method1835(-43, true);
        }
        while (true) {
            class424 var1 = (class424) field3937.method714(true);
            if (var1 == null) {
                return;
            }
            var1.field6321.method70(true);
            var1.method2108(true);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static final synchronized void method1837(int arg0) {
        field3938--;
        if (field3938 == 0) {
            method1836(0);
        }
        if (arg0 != -16497) {
            field3936 = false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lg;I)V")
    public static final synchronized void method1838(class137 arg0, int arg1) {
        if (field3936) {
            return;
        }
        int var2 = -64 / ((arg1 + 5) / 45);
        if (field3938 > 0) {
            class424 var3 = new class424();
            var3.field6321 = arg0;
            field3937.method706(var3, true);
        } else {
            arg0.method70(false);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
    public static final synchronized void method1839(int arg0) {
        int var1 = 4 / ((arg0 + 55) / 57);
        field3938++;
    }
}
