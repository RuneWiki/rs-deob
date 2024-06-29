import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class154 {

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
    public static boolean field2314 = false;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "F")
    public static float field2311;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Loa;")
    public static class596 field2312;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZIZIIB)V")
    public static final void method1005(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        int var7 = -10 % ((-arg6 - 49) / 41);
        field2313++;
        if (arg0 >= arg5) {
            return;
        }
        int var8 = (arg0 + arg5) / 2;
        int var9 = arg0;
        class212 var10 = class35.field749[var8];
        class35.field749[var8] = class35.field749[arg5];
        class35.field749[arg5] = var10;
        for (int var11 = arg0; var11 < arg5; var11++) {
            if (class113.method794(arg2, (byte) 110, arg4, arg1, var10, class35.field749[var11], arg3) <= 0) {
                class212 var12 = class35.field749[var11];
                class35.field749[var11] = class35.field749[var9];
                class35.field749[var9++] = var12;
            }
        }
        class35.field749[arg5] = class35.field749[var9];
        class35.field749[var9] = var10;
        method1005(arg0, arg1, arg2, arg3, arg4, var9 - 1, (byte) -99);
        method1005(var9 + 1, arg1, arg2, arg3, arg4, arg5, (byte) -107);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static void method1006(byte arg0) {
        field2312 = null;
        if (arg0 != 104) {
            method1005(124, false, 29, true, 62, 33, (byte) 95);
        }
    }
}
