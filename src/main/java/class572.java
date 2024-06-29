import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class572 {

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "Lhga;")
    public static class158 field8174 = new class158(112, -1);

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "Z")
    public static boolean field8175 = false;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "J")
    public static long field8176 = 0L;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "Lor;")
    public static class594 field8177 = new class594();

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8179 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field8180 = 0;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Ldh;")
    public static class295 field8178;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILor;IILr;)V")
    public static final void method3368(int arg0, class594 arg1, int arg2, int arg3, class167 arg4) {
        class167.field2803.method3474(22090);
        field8173++;
        if (class387.field6009 || arg2 != 9179409) {
            return;
        }
        for (class143 var5 = (class143) arg1.method3465((byte) -93); var5 != null; var5 = (class143) arg1.method3469(0)) {
            class257 var6 = class378.field5873.method3286(arg2 - 9149427, var5.field2408);
            if (class134.method1160(2, var6)) {
                boolean var7 = class370.method2446(-100, arg0, var6, var5, arg3, arg4);
                if (var7) {
                    class511.method3099(-2, arg4, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public static void method3369(int arg0) {
        field8178 = null;
        if (arg0 == 0) {
            field8177 = null;
            field8174 = null;
            field8179 = null;
        }
    }
}
