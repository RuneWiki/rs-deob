import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class494 extends class546 {

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "Lwr;")
    public static class423 field7216 = new class423();

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)V")
    public final void method793(int arg0, boolean arg1) {
        ++field7215;
        if (arg0 >= -39) {
            method3015((String) null, 112);
        }
    }

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "(I)V")
    public static void method3012(int arg0) {
        if (arg0 != -1) {
            method3014(false, (class665) null);
        }
        field7216 = null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lrr;)V")
    public class494(class332 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)Z")
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            method3015((String) null, 100);
        }
        ++field7214;
        return false;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(III)V")
    public final void method785(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            ++field7217;
        }
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V")
    public final void method783(int arg0) {
        ++field7213;
        if (arg0 != 255) {
            method3014(true, (class665) null);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3013(boolean arg0, int arg1, int arg2) {
        ++field7212;
        if (!arg0) {
            method3014(false, (class665) null);
        }
        return ~(arg2 & 2048) != -1 && ~(55 & arg1) != -1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)V")
    public final void method788(boolean arg0, int arg1) {
        ++field7219;
        if (arg1 != 0) {
            field7216 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLpca;)V")
    public static final void method3014(boolean arg0, class665 arg1) {
        ++field7220;
        class665 var2 = class140.method1196(-71, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class259.field4147;
            var4 = class56.field732;
        } else {
            var3 = var2.field9282;
            var4 = var2.field9411;
        }
        class315.method2149(arg1, !arg0, arg0, var3, var4);
        class391.method2537(var3, 46, var4, arg1);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3015(String arg0, int arg1) {
        if (arg1 > 95) {
            System.out.println("Error: " + class62.method685("\n", "%0a", 0, arg0));
            ++field7218;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZLwq;)V")
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field7211;
        if (arg1) {
            method3014(false, (class665) null);
        }
        super.field7937.method2271(arg2, 5180);
        super.field7937.method2280(2, arg0);
    }
}
