import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class409 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Z")
    private static boolean field5437 = false;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private static int field5439 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lmfa;")
    private static class562 field5438 = new class562();

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final synchronized void method2216(boolean arg0) {
        while (true) {
            class100 var1 = (class100) field5438.method3171(768);
            if (var1 == null) {
                if (!arg0) {
                    field5437 = true;
                    return;
                }
                return;
            }
            var1.field1094.method59(true);
            var1.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method2217(boolean arg0, int arg1) {
        field5437 = arg0;
        if (arg1 < 124) {
            method2218(109);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final synchronized void method2218(int arg0) {
        field5439--;
        if (field5439 == 0) {
            method2216(true);
        }
        if (arg0 != 0) {
            field5438 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final synchronized void method2219(int arg0) {
        field5439++;
        if (arg0 != -27438) {
            field5437 = true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lg;B)V")
    public static final synchronized void method2220(class142 arg0, byte arg1) {
        if (field5437) {
            return;
        }
        if (field5439 > 0) {
            class100 var2 = new class100();
            var2.field1094 = arg0;
            field5438.method3164(var2, arg1 ^ 0x153);
        } else {
            arg0.method59(false);
        }
        if (arg1 != 83) {
            field5437 = false;
        }
    }
}
