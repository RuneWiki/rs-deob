import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class82 extends class222 {

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lcf;")
    public class93 field1507;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[I")
    public static int[] field1505 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lwj;")
    public static class6 field1500 = new class6(0, 0);

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1513 = 0;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lcf;")
    public static class93 field1512 = class147.method1066("k", -48);

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lcf;")
    public static class93 field1509 = class147.method1066("::tele ", -48);

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "Lcf;")
    public static class93 field1514 = class147.method1066("Continuer", -48);

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Z")
    public static boolean field1511 = true;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "Lcf;")
    public static class93 field1510 = class147.method1066(",Mcran)2titre ouvert", -48);

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Lcf;")
    public static class93 field1516 = class147.method1066("cookiehost", -48);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)I")
    public static final int method573(byte arg0, int arg1) {
        field1504++;
        if (arg0 <= 81) {
            method576(121, -10, 4, 99, (class211) null, (class211) null, 127, -74, 38L);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1506++;
        if (arg0 == arg6) {
            class217.method1527(arg4, arg1, arg5, -70, arg0, arg3, arg2);
            return;
        }
        if (!arg7) {
            field1512 = null;
        }
        if ((arg1 - arg0) >= class277.field4967 && (arg0 + arg1) <= class147.field2593 && class26.field342 <= arg4 - arg6 && arg4 + arg6 <= class271.field4820) {
            class198.method1422(arg2, arg0, arg4, arg5, arg6, 123, arg3, arg1);
        } else {
            class58.method336(arg5, arg4, arg6, arg3, arg1, arg0, -9, arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            method574(62, -26, 2, -128, -50, -50, -22, true);
        }
        field1501++;
        if (arg6 >= class277.field4967 && arg4 <= class147.field2593 && class26.field342 <= arg0 && arg3 <= class271.field4820) {
            class143.method1040(88, arg7, arg5, arg4, arg3, arg2, arg6, arg0);
        } else {
            class164.method1184(118, arg4, arg6, arg5, arg0, arg3, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class82() {
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIILgl;Lgl;IIJ)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, class211 arg4, class211 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class70 var10 = new class70();
        var10.field1276 = arg8;
        var10.field1271 = arg1 * 128 + 64;
        var10.field1270 = arg2 * 128 + 64;
        var10.field1272 = arg3;
        var10.field1269 = arg4;
        var10.field1274 = arg5;
        var10.field1267 = arg6;
        var10.field1273 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class232.field4138[var11][arg1][arg2] == null) {
                class232.field4138[var11][arg1][arg2] = new class41(var11, arg1, arg2);
            }
        }
        class232.field4138[arg0][arg1][arg2].field643 = var10;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static void method577(int arg0) {
        field1516 = null;
        field1500 = null;
        field1510 = null;
        field1505 = null;
        if (arg0 == 0) {
            field1514 = null;
            field1512 = null;
            field1509 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIII)V")
    public static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 25157) {
            method576(-55, 16, 119, -119, (class211) null, (class211) null, -104, -126, -31L);
        }
        for (int var6 = arg1; var6 <= (arg1 + arg5); var6++) {
            for (int var11 = arg2; var11 <= (arg2 + arg0); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class227.field4071[arg3][var11][var6] = 127;
                }
            }
        }
        field1508++;
        for (int var7 = arg1; var7 < arg1 + arg5; var7++) {
            for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class233.field4151[arg3][var10][var7] = arg3 > 0 ? class233.field4151[arg3 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class233.field4151[arg3][arg2][var8] = class233.field4151[arg3][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg2 + 1; var9 < arg0 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class233.field4151[arg3][var9][arg1] = class233.field4151[arg3][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 <= 0 || class233.field4151[arg3][arg2 - 1][arg1] == 0) {
                if (arg1 > 0 && class233.field4151[arg3][arg2][arg1 - 1] != 0) {
                    class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2][arg1 - 1];
                    return;
                }
                if (arg2 > 0 && arg1 > 0 && class233.field4151[arg3][arg2 - 1][arg1 - 1] != 0) {
                    class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2 - 1][arg1];
        } else if (arg2 <= 0 || class233.field4151[arg3][arg2 - 1][arg1] == class233.field4151[arg3 - 1][arg2 - 1][arg1]) {
            if (arg1 > 0 && class233.field4151[arg3][arg2][arg1 - 1] != class233.field4151[arg3 - 1][arg2][arg1 - 1]) {
                class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && class233.field4151[arg3][arg2 - 1][arg1 - 1] != class233.field4151[arg3 - 1][arg2 - 1][arg1 - 1]) {
                class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2 - 1][arg1 - 1];
                return;
            }
        } else {
            class233.field4151[arg3][arg2][arg1] = class233.field4151[arg3][arg2 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lcf;)V")
    public class82(class93 arg0) {
        this.field1507 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZI)V")
    public static final void method579(int arg0, boolean arg1, int arg2) {
        field1502++;
        class141 var3 = class264.method1774(arg2, -6);
        int var4 = var3.field2463;
        if (!arg1) {
            return;
        }
        int var5 = var3.field2462;
        int var6 = var3.field2456;
        int var7 = class136.field2384[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class9.method40(17739, var4, class176.field3061[var4] & ~var8 | arg0 << var5 & var8);
    }
}
