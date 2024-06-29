import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class204 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lij;")
    private static class50 field3386 = class78.method578(122, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lij;")
    public static class50 field3392 = field3386;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lij;")
    private static class50 field3391 = class78.method578(121, "Loaded update list");

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lij;")
    public static class50 field3389 = field3391;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
    public static final int method1376(int arg0, int arg1, int arg2) {
        field3388++;
        if (arg0 < 33) {
            field3389 = null;
        }
        int var3 = class220.method1509(arg1 + 45365, 4, arg2 + 91923, 0) + ((class220.method1509(arg1 + 10294, 2, arg2 + 37821, 0) + -128 >> 1) - -(class220.method1509(arg1, 1, arg2, 0) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3389 = null;
        if (arg0 != -1) {
            field3394 = 37;
        }
        field3391 = null;
        field3386 = null;
        field3392 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3393++;
        if (arg1 == arg3) {
            class124.method897(arg0, arg1, (byte) 28, arg4, arg6, arg2, arg5);
            return;
        }
        if (arg7 != 29736) {
            field3386 = null;
        }
        if ((arg5 - arg1) >= class177.field2953 && arg1 + arg5 <= class224.field3773 && class100.field1855 <= arg4 - arg3 && class97.field1816 >= arg3 + arg4) {
            class211.method1412(arg1, arg2, arg6, arg3, arg5, arg4, -947238911, arg0);
        } else {
            class20.method151(arg0, arg2, arg5, arg6, arg3, arg4, -29824, arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg4 + arg5; var6++) {
            for (int var11 = arg1; var11 <= (arg1 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class196.field3250[arg0][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg5; var7 < (arg4 + arg5); var7++) {
            for (int var10 = arg1; var10 < (arg1 + arg3); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class245.field4257[arg0][var10][var7] = arg0 <= 0 ? 0 : class245.field4257[arg0 - 1][var10][var7];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var8 = arg5 + 1; var8 < arg4 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class245.field4257[arg0][arg1][var8] = class245.field4257[arg0][arg1 - 1][var8];
                }
            }
        }
        field3387++;
        if (~arg5 < arg2 && arg5 < 104) {
            for (int var9 = arg1 + 1; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class245.field4257[arg0][var9][arg5] = class245.field4257[arg0][var9][arg5 - 1];
                }
            }
        }
        if (arg1 < 0 || arg5 < 0 || arg1 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 > 0 && class245.field4257[arg0][arg1 - 1][arg5] != 0) {
                class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1 - 1][arg5];
                return;
            }
            if (arg5 <= 0 || class245.field4257[arg0][arg1][arg5 - 1] == 0) {
                if (arg1 > 0 && arg5 > 0 && class245.field4257[arg0][arg1 - 1][arg5 - 1] != 0) {
                    class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1][arg5 - 1];
        } else if (arg1 <= 0 || class245.field4257[arg0 - 1][arg1 - 1][arg5] == class245.field4257[arg0][arg1 - 1][arg5]) {
            if (arg5 > 0 && class245.field4257[arg0 - 1][arg1][arg5 - 1] != class245.field4257[arg0][arg1][arg5 - 1]) {
                class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1][arg5 - 1];
                return;
            }
            if (arg1 > 0 && arg5 > 0 && class245.field4257[arg0 - 1][arg1 - 1][arg5 - 1] != class245.field4257[arg0][arg1 - 1][arg5 - 1]) {
                class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1 - 1][arg5 - 1];
                return;
            }
        } else {
            class245.field4257[arg0][arg1][arg5] = class245.field4257[arg0][arg1 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILaa;IJIIII)Z")
    public static final boolean method1380(int arg0, int arg1, int arg2, int arg3, class16 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class45.method342(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static final void method1381(int arg0) {
        class19.field398 = null;
        class84.field1624 = null;
        field3390++;
        class203.field3374 = null;
        class223.field3762 = 0;
        class237.field4012 = null;
        class250.field4332 = null;
        class210.field3483 = null;
        class201.field3311 = null;
        class184.field3024 = null;
        class161.field2766 = null;
        class153.field2679 = null;
        class101.field1863.method680((byte) -68);
        class172.field2858.method680((byte) -68);
        if (arg0 < 4) {
            field3391 = null;
        }
        class25.field546 = null;
        class24.field531 = null;
        class236.field3964 = null;
        class206.field3422 = null;
        class231.field3863 = null;
        class199.field3285 = null;
        class221.field3707 = null;
        class209.field3468 = null;
        class41.field750 = null;
    }
}
