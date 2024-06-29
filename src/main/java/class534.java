import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class534 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field7764 = 0;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Los;")
    public static class309 field7762 = new class309("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lph;")
    public static class459 field7760;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLnn;I)V")
    private final void method3151(boolean arg0, class289 arg1, int arg2) {
        field7765++;
        if (arg2 == 5) {
            this.field7764 = arg1.method1841((byte) -126);
        }
        if (!arg0) {
            method3152(74);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method3152(int arg0) {
        if (arg0 != -1) {
            method3152(71);
        }
        field7762 = null;
        field7760 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLgh;)V")
    public static final void method3153(byte arg0, class388 arg1) {
        field7763++;
        if (arg0 == 99 && arg1.field5784 == 5 && arg1.field5688 != -1) {
            class473.method2824(class262.field4006, arg1, -8435);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lnn;B)V")
    public final void method3154(class289 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                field7761++;
                int var4 = 91 % ((60 - arg1) / 52);
                return;
            }
            this.method3151(true, arg0, var3);
        }
    }
}
