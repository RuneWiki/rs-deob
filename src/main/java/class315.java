import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class315 extends class179 {

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field4947 = 0;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Lgj;")
    public static class257 field4945 = new class257();

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Z")
    public static boolean field4949 = false;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Lpj;")
    public class205 field4942;

    @OriginalMember(owner = "client!j", name = "W", descriptor = "Lpa;")
    public static class2 field4948;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "[B")
    public byte[] field4938;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIZI)Lpd;", line = 6)
    public static final class3 method2222(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) arg4 & 0xFFFFL << 16 | (long) arg2 << 48 & 0xFFFF000000000000L | ((long) arg1 & 0xFFFFL) << 32 | (long) arg0 & 0xFFFFL;
        field4946++;
        class3 var7 = (class3) class148.field2356.method380(0, var5);
        if (var7 != null) {
            return var7;
        }
        class269[] var8 = null;
        class271 var9 = class242.method1712(arg0, arg3);
        if (var9.field4263 != null) {
            var8 = new class269[var9.field4263.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class184 var11 = class342.method2349((byte) -91, var9.field4263[var10]);
                var8[var10] = new class269(var11.field2775, var11.field2770, var11.field2773, var11.field2765, var11.field2762, var11.field2768, var11.field2761, var11.field2774);
            }
        }
        class3 var12 = new class3(var9.field4261, var8, var9.field4262, arg2, arg1, arg4);
        class148.field2356.method377(var5, var12, -1);
        return var12;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 47)
    public static void method2223(int arg0) {
        field4948 = null;
        field4945 = null;
        if (arg0 != -11371) {
            field4950 = -69;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V", line = 60)
    public static final void method2224(byte arg0, int arg1) {
        field4937++;
        if (arg1 == -1 || !class251.field3975[arg1]) {
            return;
        }
        class127.field1861.method107(arg1, -2);
        if (class232.field3512[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class232.field3512[arg1].length; var3++) {
            if (class232.field3512[arg1][var3] != null) {
                if (class232.field3512[arg1][var3].field5107 == 2) {
                    var2 = false;
                } else {
                    class232.field3512[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class232.field3512[arg1] = null;
        }
        class251.field3975[arg1] = false;
        if (arg0 > -58) {
            method2226(107, -117, 6, -22, -105, 5, -89, -31, 61, 75, 72, -78, 66, -38, -26, 60, 42, 14, -29, 63);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)[B", line = 106)
    public final byte[] method1238(byte arg0) {
        if (arg0 != -107) {
            field4949 = false;
        }
        field4943++;
        if (this.field2683) {
            throw new RuntimeException();
        }
        return this.field4938;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)V", line = 124)
    public static final void method2225(int arg0, boolean arg1) {
        field4944++;
        if (arg1) {
            method2224((byte) 52, 126);
        }
        class279 var2 = class147.method1085(arg0, -19443, 1);
        var2.method1996(!arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I", line = 140)
    public final int method1235(boolean arg0) {
        field4940++;
        if (this.field2683) {
            return 0;
        } else if (arg0) {
            return 82;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 154)
    public static final void method2226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class33 var20 = new class33(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class194.field2947[var21][arg1][arg2] == null) {
                    class194.field2947[var21][arg1][arg2] = new class196(var21, arg1, arg2);
                }
            }
            class194.field2947[arg0][arg1][arg2].field2997 = var20;
        } else if (arg3 == 1) {
            class33 var22 = new class33(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class194.field2947[var23][arg1][arg2] == null) {
                    class194.field2947[var23][arg1][arg2] = new class196(var23, arg1, arg2);
                }
            }
            class194.field2947[arg0][arg1][arg2].field2997 = var22;
        } else {
            class51 var24 = new class51(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class194.field2947[var25][arg1][arg2] == null) {
                    class194.field2947[var25][arg1][arg2] = new class196(var25, arg1, arg2);
                }
            }
            class194.field2947[arg0][arg1][arg2].field2987 = var24;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lnk;BII)Lfe;", line = 204)
    public static final class270 method2227(class16 arg0, byte arg1, int arg2, int arg3) {
        field4941++;
        if (arg1 != -100) {
            field4948 = (class2) null;
        }
        return class102.method648(arg3, -1000000000, arg2, arg0) ? class353.method2444(arg1 + 99) : null;
    }
}
