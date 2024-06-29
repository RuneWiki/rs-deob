import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class243 extends class239 {

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    private final int field4202;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private final int field4201;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    private final int field4217;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    private final int field4209;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
    private final int field4214;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    private final int field4204;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    private final int field4207;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    private final int field4213;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lia;")
    private static class257 field4200 = class28.method234(122, "Started 3d library");

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "[J")
    public static long[] field4216 = new long[200];

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lia;")
    public static class257 field4203 = field4200;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "[I")
    public static int[] field4218 = new int[5];

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Lme;")
    public static class44 field4206 = null;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public static int field4212 = 128;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Lia;")
    public static class257 field4211 = class28.method234(-57, "sl_back");

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[[[I")
    public static int[][][] field4208;

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4202 = arg0;
        this.field4201 = arg6;
        this.field4217 = arg1;
        this.field4209 = arg3;
        this.field4214 = arg7;
        this.field4204 = arg4;
        this.field4207 = arg5;
        this.field4213 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIILij;Lij;IIJ)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, class166 arg4, class166 arg5, int arg6, int arg7, long arg8) {
        if (arg4 != null || arg5 != null) {
            class8 var10 = new class8();
            var10.field170 = arg8;
            var10.field176 = arg1 * 128 + 64;
            var10.field165 = arg2 * 128 + 64;
            var10.field173 = arg3;
            var10.field172 = arg4;
            var10.field169 = arg5;
            var10.field171 = arg6;
            var10.field161 = arg7;
            for (int var11 = arg0; var11 >= 0; --var11) {
                if (class75.field1463[var11][arg1][arg2] == null) {
                    class75.field1463[var11][arg1][arg2] = new class177(var11, arg1, arg2);
                }
            }
            class75.field1463[arg0][arg1][arg2].field3024 = var10;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lij;III)V")
    public static final void method1592(class166 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class140.field2491) {
            class177 var4 = class75.field1463[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3016 != null && var4.field3016.field2075.method493()) {
                arg0.method518(var4.field3016.field2075, 128, 0, 0, true);
            }
        }
        if (arg3 < class140.field2491) {
            class177 var5 = class75.field1463[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3016 != null && var5.field3016.field2075.method493()) {
                arg0.method518(var5.field3016.field2075, 0, 0, 128, true);
            }
        }
        if (arg2 < class140.field2491 && arg3 < class73.field1427) {
            class177 var6 = class75.field1463[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3016 != null && var6.field3016.field2075.method493()) {
                arg0.method518(var6.field3016.field2075, 128, 0, 128, true);
            }
        }
        if (arg2 < class140.field2491 && arg3 > 0) {
            class177 var7 = class75.field1463[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3016 != null && var7.field3016.field2075.method493()) {
                arg0.method518(var7.field3016.field2075, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class58 var20 = new class58(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class75.field1463[var21][arg1][arg2] == null) {
                    class75.field1463[var21][arg1][arg2] = new class177(var21, arg1, arg2);
                }
            }
            class75.field1463[arg0][arg1][arg2].field3032 = var20;
        } else if (arg3 != 1) {
            class122 var24 = new class122(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class75.field1463[var25][arg1][arg2] == null) {
                    class75.field1463[var25][arg1][arg2] = new class177(var25, arg1, arg2);
                }
            }
            class75.field1463[arg0][arg1][arg2].field3007 = var24;
        } else {
            class58 var22 = new class58(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class75.field1463[var23][arg1][arg2] == null) {
                    class75.field1463[var23][arg1][arg2] = new class177(var23, arg1, arg2);
                }
            }
            class75.field1463[arg0][arg1][arg2].field3032 = var22;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V")
    public final void method242(int arg0, byte arg1, int arg2) {
        ++field4215;
        if (arg1 > -10) {
            this.method240((byte) -80, -25, -25);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)V")
    public final void method240(byte arg0, int arg1, int arg2) {
        ++field4220;
        int var4 = this.field4217 * arg1 >> 12;
        int var5 = this.field4213 * arg2 >> 12;
        int var6 = this.field4209 * arg1 >> 12;
        int var7 = this.field4202 * arg2 >> 12;
        int var8 = this.field4204 * arg2 >> 12;
        int var9 = this.field4201 * arg2 >> 12;
        int var10 = this.field4207 * arg1 >> 12;
        if (arg0 != -15) {
            method1595(-26, -100, 75);
        }
        int var11 = this.field4214 * arg1 >> 12;
        class185.method1261(var7, var8, super.field4102, var10, (byte) 90, var5, var4, var6, var11, var9);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1594(int arg0) {
        field4203 = null;
        field4211 = null;
        if (arg0 == 200) {
            field4200 = null;
            field4208 = null;
            field4218 = null;
            field4206 = null;
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Lke;")
    public static final class8 method1595(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3024;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1596(int arg0, int arg1, int arg2, int arg3) {
        if (!class42.method332(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class175.method1188(var4 + 1, field4208[arg0][arg1][arg2] + arg3, var5 + 1) && class175.method1188(var4 + 128 - 1, field4208[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class175.method1188(var4 + 128 - 1, field4208[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class175.method1188(var4 + 1, field4208[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public final void method241(int arg0, int arg1, int arg2) {
        int var4 = -29 / ((62 - arg1) / 40);
        ++field4219;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)[Lfe;")
    public static final class155[] method1597(boolean arg0) {
        class155[] var1 = new class155[class135.field2421];
        for (int var2 = 0; var2 < class135.field2421; ++var2) {
            var1[var2] = new class155(class20.field427, class9.field184, class57.field1212[var2], class154.field2701[var2], class72.field1411[var2], class193.field3287[var2], class137.field2454[var2], class3.field92);
        }
        if (!arg0) {
            method1597(true);
        }
        class126.method875(!arg0);
        ++field4210;
        return var1;
    }
}
