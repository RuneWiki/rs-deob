import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class292 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
    private static boolean field4031 = false;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private static int field4033 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lbu;")
    private static class19 field4032 = new class19();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V", line = 6)
    public static final synchronized void method1796(int arg0, boolean arg1) {
        field4031 = arg1;
        if (arg0 != 0) {
            method1796(26, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILo;)V", line = 18)
    public static final synchronized void method1797(int arg0, class28 arg1) {
        int var2 = 60 / ((18 - arg0) / 44);
        if (field4031) {
            return;
        }
        if (field4033 > 0) {
            class400 var3 = new class400();
            var3.field5491 = arg1;
            field4032.method131(var3, 0);
        } else {
            arg1.method63(false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 41)
    public static final synchronized void method1798(int arg0) {
        while (true) {
            class400 var1 = (class400) field4032.method128(936);
            if (var1 == null) {
                if (arg0 < 80) {
                    method1797(-14, null);
                    return;
                }
                return;
            }
            var1.field5491.method63(true);
            var1.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 62)
    public static final synchronized void method1799(byte arg0) {
        field4033--;
        if (field4033 == 0) {
            method1798(98);
        }
        if (arg0 > -27) {
            method1796(65, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 84)
    public static final synchronized void method1800(int arg0) {
        if (arg0 != 0) {
            method1799((byte) 96);
        }
        field4033++;
    }
}
