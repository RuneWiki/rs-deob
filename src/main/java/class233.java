import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class233 extends class28 {

    @OriginalMember(owner = "client!a", name = "L", descriptor = "[B")
    public byte[] field4108;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field4105 = 0;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lvf;")
    public static class265 field4107 = class87.method582(-46, ")4a=");

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Lfl;")
    public static class192 field4104;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Lae;")
    public static class238 field4103;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "[Lck;")
    public static class201[] field4111;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class278 var20 = new class278(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class200.field3577[var21][arg1][arg2] == null) {
                    class200.field3577[var21][arg1][arg2] = new class137(var21, arg1, arg2);
                }
            }
            class200.field3577[arg0][arg1][arg2].field2505 = var20;
        } else if (arg3 == 1) {
            class278 var22 = new class278(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class200.field3577[var23][arg1][arg2] == null) {
                    class200.field3577[var23][arg1][arg2] = new class137(var23, arg1, arg2);
                }
            }
            class200.field3577[arg0][arg1][arg2].field2505 = var22;
        } else {
            class266 var24 = new class266(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class200.field3577[var25][arg1][arg2] == null) {
                    class200.field3577[var25][arg1][arg2] = new class137(var25, arg1, arg2);
                }
            }
            class200.field3577[arg0][arg1][arg2].field2497 = var24;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)I")
    public static final int method1570(int arg0, byte arg1, int arg2) {
        field4109++;
        int var3 = arg2 + (arg0 * 57);
        if (arg1 <= 41) {
            method1569(-98, -3, 112, 72, -51, 12, -32, -86, 100, -98, 3, -80, -115, -13, -122, -44, -102, -53, -20, 110);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        field4103 = null;
        if (arg0 != -45) {
            method1569(59, -58, 10, 1, 15, -35, -96, 99, 68, 92, -62, -20, 26, -118, 2, 44, -87, -46, -68, -31);
        }
        field4104 = null;
        field4111 = null;
        field4107 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V")
    public class233(byte[] arg0) {
        this.field4108 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method1572(int arg0, int arg1) {
        field4106++;
        if (arg1 != 789221) {
            field4110 = 31;
        }
        class1.field24.method1891(-23549, arg0);
    }
}
