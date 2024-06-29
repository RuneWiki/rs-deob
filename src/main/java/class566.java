import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class566 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
    public static int[] field7442 = new int[1];

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lhda;")
    public static class752 field7444 = new class752(26, 0);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lft;")
    public static class3 field7445;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 3)
    public static void method3127(byte arg0) {
        field7442 = null;
        if (arg0 < -23) {
            field7445 = null;
            field7444 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIIIIIIII)Z", line = 26)
    public static final boolean method3128(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7443++;
        if (!class442.method2547(arg3, arg1, arg9, -12825)) {
            return false;
        }
        int var10 = class352.field4953[2];
        int var11 = class352.field4953[1];
        int var12 = class352.field4953[0];
        if (!class442.method2547(arg7, arg2, arg8, -12825)) {
            return false;
        }
        int var13 = class352.field4953[2];
        if (arg0) {
            method3128(false, 75, -56, -31, 27, -38, -1, -78, 93, 19);
        }
        int var14 = class352.field4953[0];
        int var15 = class352.field4953[1];
        if (class442.method2547(arg5, arg4, arg6, -12825)) {
            int var16 = class352.field4953[2];
            int var17 = class352.field4953[1];
            int var18 = class352.field4953[0];
            return class532.method2967(var13, var15, var12, -13221, var11, var17, var18, var14, var10, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)J")
    public abstract long method783(int arg0);
}
