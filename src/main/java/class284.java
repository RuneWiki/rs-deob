import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class284 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    public static boolean field3960 = false;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ljava/lang/Object;")
    public static volatile Object field3964 = null;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "[B")
    public static byte[] field3962 = new byte[520];

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lla;")
    public static class423 field3965;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lla;")
    public static class423 field3966;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[I")
    public static int[] field3961;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method1816(byte arg0) {
        field3965 = null;
        field3962 = null;
        field3961 = null;
        field3966 = null;
        if (arg0 > 26) {
            field3964 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIZIBZ)V")
    public static final void method1817(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 != -96) {
            method1817(23, 24, -37, true, 45, (byte) 63, false);
        }
        field3963++;
        if (arg2 <= arg4) {
            return;
        }
        int var7 = (arg2 + arg4) / 2;
        int var8 = arg4;
        class592 var9 = class537.field7803[var7];
        class537.field7803[var7] = class537.field7803[arg2];
        class537.field7803[arg2] = var9;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (class485.method2963(arg3, arg6, arg1, var9, (byte) -119, class537.field7803[var10], arg0) <= 0) {
                class592 var11 = class537.field7803[var10];
                class537.field7803[var10] = class537.field7803[var8];
                class537.field7803[var8++] = var11;
            }
        }
        class537.field7803[arg2] = class537.field7803[var8];
        class537.field7803[var8] = var9;
        method1817(arg0, arg1, var8 - 1, arg3, arg4, (byte) -96, arg6);
        method1817(arg0, arg1, arg2, arg3, var8 + 1, (byte) -96, arg6);
    }
}
