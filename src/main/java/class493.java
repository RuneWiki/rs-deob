import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class493 {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    private static int field7136 = 0;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Z")
    private static boolean field7135 = false;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Lgw;")
    private static class118 field7137 = new class118();

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static final synchronized void method2892(int arg0) {
        while (true) {
            class365 var1 = (class365) field7137.method862(-76);
            if (var1 == null) {
                if (arg0 < 61) {
                    field7135 = false;
                    return;
                }
                return;
            }
            var1.field5297.method382();
            var1.method421(22071);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
    public static final synchronized void method2893(int arg0) {
        field7136--;
        if (field7136 == 0) {
            method2892(arg0 - 3144);
        }
        if (arg0 != 3228) {
            method2893(61);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method2894(int arg0, boolean arg1) {
        field7135 = arg1;
        if (arg0 != 0) {
            field7137 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lv;Z)V")
    public static final synchronized void method2895(class416 arg0, boolean arg1) {
        if (arg1) {
            field7135 = false;
        }
        if (field7135) {
            return;
        }
        if (field7136 > 0) {
            class365 var2 = new class365();
            var2.field5297 = arg0;
            field7137.method866((byte) 10, var2);
        } else {
            arg0.method382();
        }
    }
}
