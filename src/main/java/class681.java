import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class681 {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "Lcb;")
    public static class631 field9631 = new class631(54, 6);

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field9632;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kv", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field9633;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method3798(int arg0, int arg1, int arg2, byte arg3) {
        field9630++;
        boolean var4 = true;
        class523 var5 = (class523) class486.method2948(arg0, arg2, arg1);
        if (var5 != null) {
            var4 &= class429.method2672(var5, 32);
        }
        class523 var6 = (class523) class140.method1093(arg0, arg2, arg1, field9633 == null ? (field9633 = method3801("tw")) : field9633);
        if (arg3 != -43) {
            return false;
        }
        if (var6 != null) {
            var4 &= class429.method2672(var6, 32);
        }
        class523 var7 = (class523) class558.method3243(arg0, arg2, arg1);
        if (var7 != null) {
            var4 &= class429.method2672(var7, 32);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public static void method3799(int arg0) {
        field9631 = null;
        int var1 = -12 % ((arg0 + 27) / 63);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ltg;IIBLha;)V")
    public static final void method3800(class605 arg0, int arg1, int arg2, byte arg3, class544 arg4) {
        field9632++;
        class508.field7390.method3465(0);
        if (class316.field4739 || arg3 <= 67) {
            return;
        }
        for (class302 var5 = (class302) arg0.method3463((byte) -50); var5 != null; var5 = (class302) arg0.method3469((byte) 107)) {
            class277 var6 = class729.field10206.method2550(var5.field4601, -46);
            if (class31.method159(false, var6)) {
                boolean var7 = class598.method3438(arg1, var6, arg2, var5, (byte) -95, arg4);
                if (var7) {
                    class713.method3945(arg4, var6, var5, 10);
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3801(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
