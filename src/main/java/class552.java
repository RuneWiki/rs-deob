import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class552 {

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field7867 = -1;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lpr;")
    public static class407 field7869 = new class407(95, -1);

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "[I")
    public static int[] field7871 = new int[4096];

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field7872;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Loa;)V")
    public static final void method3110(class635 arg0) {
        for (int var1 = class472.field6593; var1 < class337.field4416; var1++) {
            for (int var2 = 0; var2 < class181.field2222; var2++) {
                for (int var3 = 0; var3 < class272.field3451; var3++) {
                    class287 var4 = class97.field1074[var1][var2][var3];
                    if (var4 != null) {
                        class244 var5 = var4.field3697;
                        class244 var6 = var4.field3690;
                        if (var5 != null && var5.method449((byte) -126)) {
                            class172.method1018(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method449((byte) -126)) {
                                class172.method1018(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method453(false, 0, false, 0, 0, var5, arg0);
                                var6.method448(-81);
                            }
                            var5.method448(-46);
                        }
                        for (class60 var7 = var4.field3680; var7 != null; var7 = var7.field623) {
                            class354 var9 = var7.field625;
                            if (var9 != null && var9.method449((byte) -126)) {
                                class172.method1018(arg0, var9, var1, var2, var3, var9.field4645 + 1 - var9.field4642, var9.field4639 - var9.field4648 + 1);
                                var9.method448(102);
                            }
                        }
                        class344 var8 = var4.field3686;
                        if (var8 != null && var8.method449((byte) -126)) {
                            class204.method1247(arg0, var8, var1, var2, var3);
                            var8.method448(78);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
    public static void method3111(boolean arg0) {
        field7872 = null;
        if (arg0) {
            field7867 = -111;
        }
        field7869 = null;
        field7871 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static final void method3112(int arg0) {
        class271.field3434 = new class382[class238.field3009.method1740((byte) 69)][];
        if (arg0 != -1) {
            method3110(null);
        }
        field7866++;
        class461.field6408 = new class382[class238.field3009.method1740((byte) 77)][];
        class485.field7070 = new boolean[class238.field3009.method1740((byte) 101)];
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field7868++;
        if (class628.field8912 == null) {
            return;
        }
        class292 var14 = null;
        if (arg6 < 0) {
            int var15 = -arg6 - 1;
            if (class90.field1038 == var15) {
                var14 = class377.field4914;
            } else {
                var14 = class362.field4726[var15];
            }
        } else {
            int var16 = arg6 - 1;
            class443 var17 = (class443) class392.field5223.method3234((byte) -39, (long) var16);
            if (var17 != null) {
                var14 = var17.field6107;
            }
        }
        if (var14 == null) {
            return;
        }
        class335 var18 = class195.field2339.method3729(arg12, (byte) 109);
        int var19;
        int var20;
        if (arg3 == 1 || arg3 == 3) {
            var20 = var18.field4322;
            var19 = var18.field4410;
        } else {
            var19 = var18.field4322;
            var20 = var18.field4410;
        }
        int var21 = (var20 >> 1) + arg10;
        int var22 = (var20 - arg2 >> 1) + arg10;
        int var23 = arg4 + (var19 >> 1);
        int var24 = (var19 + 1 >> 1) + arg4;
        class137 var25 = class628.field8912[arg5];
        int var26 = var25.method253(var21, var23) + var25.method253(var22, var23) - (-var25.method253(var21, var24) - var25.method253(var22, var24)) >> 2;
        class519 var27 = new class519();
        var27.field7416 = var14.field4638;
        var27.field7417 = arg12;
        var27.field7404 = arg4;
        if (arg7 > arg13) {
            int var28 = arg7;
            arg7 = arg13;
            arg13 = var28;
        }
        var27.field7419 = arg10;
        var27.field7412 = class469.field6549 + arg1;
        var27.field7401 = arg3;
        var27.field7411 = class469.field6549 + arg8;
        var27.field7408 = arg11;
        if (arg9 > arg0) {
            int var29 = arg9;
            arg9 = arg0;
            arg0 = var29;
        }
        var27.field7422 = arg7 + arg10;
        var27.field7414 = arg10 + arg13;
        var27.field7403 = (var27.field7419 << 9) + (var20 << 8);
        var27.field7415 = arg0 + arg4;
        var27.field7409 = (var27.field7404 << 9) + (var19 << 8);
        var27.field7402 = arg4 + arg9;
        var27.field7405 = var26;
        class520.field7440.method3164(var27, 256);
        var14.field3834 = var27;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7871[var0] = class233.method1354(813637996, var0);
        }
        field7873 = -1;
    }
}
