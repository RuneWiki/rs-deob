import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class715 extends class13 {

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Llf;")
    public class238 field9745;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Z")
    public static boolean field9742 = false;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Lof;")
    public static class622 field9743;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLcea;)V", line = 7)
    public static final void method3983(byte arg0, class215 arg1) {
        field9746++;
        for (int var2 = 0; var2 < class399.field5900; var2++) {
            int var4 = arg1.method1530(-127);
            int var5 = arg1.method1478(842397944);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class349.field4876[var4] != null) {
                class349.field4876[var4].field2398 = var5;
            }
        }
        int var3 = -75 / ((53 - arg0) / 48);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 37)
    public static final void method3984(int arg0, String[] arg1) {
        if (arg0 != 0) {
            return;
        }
        field9744++;
        if (arg1.length <= 1) {
            class257.field3711 = class257.field3711 + arg1[0];
            class697.field9411 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class355.method2228("Pausing for " + var3 + " seconds...", -109);
                class216.field3136 = arg1;
                class343.field4811 = var2 + 1;
                class698.field9437 = (long) (var3 * 1000) + class554.method3190(-104);
                return;
            }
            class257.field3711 = arg1[var2];
            class241.method1673(false, 0);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Llf;)V", line = 84)
    public class715(class238 arg0) {
        this.field9745 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 95)
    public static void method3985(boolean arg0) {
        if (arg0) {
            field9742 = true;
        }
        field9743 = null;
    }
}
