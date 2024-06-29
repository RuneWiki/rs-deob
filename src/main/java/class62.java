import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class62 {

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static volatile int field819 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lkb;")
    public static class39 field820;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 5)
    public static void method419(int arg0) {
        field820 = null;
        if (arg0 != -1) {
            field815 = 91;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILkb;I)[Lug;", line = 21)
    public static final class321[] method420(int arg0, int arg1, class39 arg2, int arg3) {
        int var4 = 79 / ((-arg3 - 2) / 61);
        field818++;
        return class288.method2026(arg1, arg0, arg2, -45) ? class242.method1714(false) : null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIIII)V", line = 38)
    public static final void method421(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field817++;
        int var7 = class235.method1685(arg5, class235.field3735, class233.field3721, 124);
        int var8 = class235.method1685(arg2, class235.field3735, class233.field3721, 113);
        int var9 = class235.method1685(arg4, class231.field3697, class224.field3575, 104);
        int var10 = class235.method1685(arg1, class231.field3697, class224.field3575, 124);
        int var11 = class235.method1685(arg5 + arg6, class235.field3735, class233.field3721, 115);
        int var12 = class235.method1685(arg2 - arg6, class235.field3735, class233.field3721, arg0 + 63);
        for (int var13 = var7; var13 < var11; var13++) {
            class245.method1738(48, class310.field4841[var13], var10, var9, arg3);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class245.method1738(48, class310.field4841[var14], var10, var9, arg3);
        }
        if (arg0 != 57) {
            field820 = (class39) null;
        }
        int var15 = class235.method1685(arg4 + arg6, class231.field3697, class224.field3575, 117);
        int var16 = class235.method1685(arg1 - arg6, class231.field3697, class224.field3575, 120);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class310.field4841[var17];
            class245.method1738(48, var18, var15, var9, arg3);
            class245.method1738(48, var18, var10, var16, arg3);
        }
    }
}
