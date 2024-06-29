import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class166 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    private static int field2315 = 0;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Z")
    private static boolean field2316 = false;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "Lfh;")
    private static class653 field2317 = new class653();

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 9)
    public static final synchronized void method1163(byte arg0) {
        if (arg0 != 125) {
            field2316 = false;
        }
        field2315++;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ZB)V", line = 24)
    public static final synchronized void method1164(boolean arg0, byte arg1) {
        int var2 = 29 / ((77 - arg1) / 41);
        field2316 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 33)
    public static final synchronized void method1165(int arg0) {
        if (arg0 >= -22) {
            return;
        }
        while (true) {
            class252 var1 = (class252) field2317.method3665(23290);
            if (var1 == null) {
                return;
            }
            var1.field3217.method123(true);
            var1.method1175(-2);
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V", line = 54)
    public static final synchronized void method1166(int arg0) {
        field2315--;
        if (field2315 == 0) {
            method1165(arg0 - 25312);
        }
        if (arg0 != 25279) {
            field2317 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Le;I)V", line = 72)
    public static final synchronized void method1167(class535 arg0, int arg1) {
        if (field2316) {
            return;
        }
        if (arg1 <= ~field2315) {
            arg0.method123(false);
        } else {
            class252 var2 = new class252();
            var2.field3217 = arg0;
            field2317.method3671(var2, false);
        }
    }
}
