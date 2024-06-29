import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class154 extends class274 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2357 = "cyan:";

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "[I")
    public static int[] field2354;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[B")
    public static byte[][][] field2356;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static final void method1033(int arg0) {
        field2355++;
        class214.field3305 = 0;
        class17.field269 = 0;
        class273.method1838(false);
        class217.method1441((byte) 2);
        class206.method1378((byte) 14);
        for (int var1 = 0; var1 < class214.field3305; var1++) {
            int var3 = class296.field4675[var1];
            if (class267.field4256 != class72.field1144[var3].field4161) {
                if (class72.field1144[var3].field518.method1447(0)) {
                    class186.method1250(true, class72.field1144[var3]);
                }
                class72.field1144[var3].method259((class217) null, -2308);
                class72.field1144[var3] = null;
            }
        }
        if (class79.field1329 != class239.field3692.field588) {
            throw new RuntimeException("gnp1 pos:" + class239.field3692.field588 + " psize:" + class79.field1329);
        }
        for (int var2 = arg0; var2 < class62.field1006; var2++) {
            if (class72.field1144[class198.field3113[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class62.field1006);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static final void method1034(boolean arg0) {
        class130.field2023.method1782(108);
        field2350++;
        if (!arg0) {
            method1037(47, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class243 var20 = new class243(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class255.field3907[var21][arg1][arg2] == null) {
                    class255.field3907[var21][arg1][arg2] = new class23(var21, arg1, arg2);
                }
            }
            class255.field3907[arg0][arg1][arg2].field347 = var20;
        } else if (arg3 == 1) {
            class243 var22 = new class243(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class255.field3907[var23][arg1][arg2] == null) {
                    class255.field3907[var23][arg1][arg2] = new class23(var23, arg1, arg2);
                }
            }
            class255.field3907[arg0][arg1][arg2].field347 = var22;
        } else {
            class199 var24 = new class199(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class255.field3907[var25][arg1][arg2] == null) {
                    class255.field3907[var25][arg1][arg2] = new class23(var25, arg1, arg2);
                }
            }
            class255.field3907[arg0][arg1][arg2].field342 = var24;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2357 = null;
        int var1 = 100 / ((-arg0 - 91) / 32);
        field2354 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
    public static final void method1037(int arg0, byte arg1) {
        field2351++;
        int var2 = -67 % ((arg1 - 67) / 41);
        if (arg0 == -1 || !class142.field2184[arg0]) {
            return;
        }
        class143.field2217.method1177(0, arg0);
        if (class261.field4006[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class261.field4006[arg0].length; var4++) {
            if (class261.field4006[arg0][var4] != null) {
                if (class261.field4006[arg0][var4].field2937 == 2) {
                    var3 = false;
                } else {
                    class261.field4006[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class261.field4006[arg0] = null;
        }
        class142.field2184[arg0] = false;
    }
}
