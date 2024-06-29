import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class176 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lui;")
    public static class236 field3079 = new class236(8);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "[I")
    public static int[] field3085 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
    public static int[] field3086 = new int[2];

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[[S")
    public static short[][] field3088 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lqe;")
    public static class168 field3083 = class66.method448("Spieler kann nicht gefunden werden: ", 75);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lgd;")
    public static class65 field3084;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "[Lgd;")
    public static class65[] field3087;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[[[B")
    public static byte[][][] field3081;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZB)V")
    public static final void method1160(boolean arg0, byte arg1) {
        class62.field844 = arg0;
        field3082++;
        class227.field3868 = !class119.method816((byte) 116);
        if (arg1 != 68) {
            method1164(-25);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([IIIIII)V")
    public static final void method1161(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class177 var6 = class254.field4395[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class146 var7 = var6.field3097;
        if (var7 != null) {
            int var8 = var7.field2547;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class141 var10 = var6.field3096;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2490;
        int var12 = var10.field2487;
        int var13 = var10.field2477;
        int var14 = var10.field2471;
        int[] var15 = class51.field685[var11];
        int[] var16 = class16.field137[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field3085 = null;
        field3081 = null;
        field3086 = null;
        if (arg0 != 7690) {
            return;
        }
        field3084 = null;
        field3087 = null;
        field3079 = null;
        field3088 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class146 var20 = new class146(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class254.field4395[var21][arg1][arg2] == null) {
                    class254.field4395[var21][arg1][arg2] = new class177(var21, arg1, arg2);
                }
            }
            class254.field4395[arg0][arg1][arg2].field3097 = var20;
        } else if (arg3 == 1) {
            class146 var22 = new class146(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class254.field4395[var23][arg1][arg2] == null) {
                    class254.field4395[var23][arg1][arg2] = new class177(var23, arg1, arg2);
                }
            }
            class254.field4395[arg0][arg1][arg2].field3097 = var22;
        } else {
            class141 var24 = new class141(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class254.field4395[var25][arg1][arg2] == null) {
                    class254.field4395[var25][arg1][arg2] = new class177(var25, arg1, arg2);
                }
            }
            class254.field4395[arg0][arg1][arg2].field3096 = var24;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method1164(int arg0) {
        field3080++;
        class71.field1081++;
        if (arg0 <= 80) {
            return;
        }
        class87.field1348.method672(1, 238);
        for (class114 var1 = (class114) field3079.method1536(56); var1 != null; var1 = (class114) field3079.method1534(-21389)) {
            if (var1.field1857 == 0) {
                class158.method1032(var1, (byte) -128, true);
            }
        }
        if (class211.field3644 != null) {
            class65.method443(class211.field3644, 0);
            class211.field3644 = null;
        }
    }
}
