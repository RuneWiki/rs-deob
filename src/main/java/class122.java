import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class122 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lsf;")
    public static class108 field2082 = class140.method973(255, "Cach-B");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2084 = 10;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Z")
    public static boolean field2079 = false;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lca;")
    public static class98 field2086 = null;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lg;")
    public static class162 field2081;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lvc;")
    public static class193 field2089;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lni;")
    public static class24 field2088;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 5)
    public static final void method852(int arg0) {
        field2083++;
        class143.field2525 = true;
        if (arg0 > -46) {
            method852(67);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILik;I)[Lt;", line = 17)
    public static final class257[] method853(int arg0, int arg1, class262 arg2, int arg3) {
        if (arg1 != 29772) {
            field2087 = -31;
        }
        field2090++;
        return class167.method1166(arg2, arg0, (byte) 91, arg3) ? class259.method1841(57) : null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 32)
    public static void method854(byte arg0) {
        field2082 = null;
        field2086 = null;
        if (arg0 >= 30) {
            field2088 = null;
            field2089 = null;
            field2081 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIII)V", line = 69)
    public static final void method855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2085++;
        for (int var6 = arg2; var6 <= (arg0 + arg2); var6++) {
            for (int var7 = arg5; var7 <= (arg5 + arg4); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class182.field3357[arg3][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg2; var8 < (arg0 + arg2); var8++) {
            for (int var9 = arg5; var9 < arg4 + arg5; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class278.field4883[arg3][var9][var8] = arg3 > 0 ? class278.field4883[arg3 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var10 = arg2 + 1; var10 < (arg0 + arg2); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class278.field4883[arg3][arg5][var10] = class278.field4883[arg3][arg5 - 1][var10];
                }
            }
        }
        if (arg1 != 1) {
            return;
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var11 = arg5 + 1; var11 < arg4 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class278.field4883[arg3][var11][arg2] = class278.field4883[arg3][var11][arg2 - 1];
                }
            }
        }
        if (arg5 < 0 || arg2 < 0 || arg5 >= 104 || arg2 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 > 0 && class278.field4883[arg3][arg5 - 1][arg2] != 0) {
                class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5 - 1][arg2];
            } else if (arg2 > 0 && class278.field4883[arg3][arg5][arg2 - 1] != 0) {
                class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5][arg2 - 1];
            } else if (arg5 > 0 && arg2 > 0 && class278.field4883[arg3][arg5 - 1][arg2 - 1] != 0) {
                class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5 - 1][arg2 - 1];
            }
        } else if (arg5 > 0 && class278.field4883[arg3 - 1][arg5 - 1][arg2] != class278.field4883[arg3][arg5 - 1][arg2]) {
            class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5 - 1][arg2];
        } else if (arg2 > 0 && class278.field4883[arg3 - 1][arg5][arg2 - 1] != class278.field4883[arg3][arg5][arg2 - 1]) {
            class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5][arg2 - 1];
        } else if (arg5 > 0 && arg2 > 0 && class278.field4883[arg3][arg5 - 1][arg2 - 1] != class278.field4883[arg3 - 1][arg5 - 1][arg2 - 1]) {
            class278.field4883[arg3][arg5][arg2] = class278.field4883[arg3][arg5 - 1][arg2 - 1];
        }
    }
}
