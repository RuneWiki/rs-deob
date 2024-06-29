import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class84 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[I")
    private int[] field1146;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lrm;")
    public static class184 field1148 = new class184(4);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "F")
    public static float field1149;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lcf;")
    public static class275 field1151;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JB)V", line = 6)
    public static final void method609(long arg0, byte arg1) {
        field1143++;
        if (arg0 == 0L) {
            return;
        }
        class139.field2216++;
        class183.field2965.method1947((byte) 124, 98);
        if (arg1 > -91) {
            field1151 = (class275) null;
        }
        class183.field2965.method53((byte) 118, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 22)
    public static void method610(int arg0) {
        field1151 = null;
        if (arg0 == 13424) {
            field1148 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V", line = 37)
    public static final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class197 var10 = null;
        field1147++;
        class197 var11 = (class197) class68.field959.method22((byte) 122);
        int var12 = 90 % ((arg6 - 12) / 33);
        while (var11 != null) {
            if (var11.field3155 == arg8 && var11.field3158 == arg0 && var11.field3149 == arg9 && var11.field3147 == arg4) {
                var10 = var11;
                break;
            }
            var11 = (class197) class68.field959.method26((byte) -117);
        }
        if (var10 == null) {
            var10 = new class197();
            var10.field3158 = arg0;
            var10.field3147 = arg4;
            var10.field3155 = arg8;
            var10.field3149 = arg9;
            class317.method2223(var10, (byte) -78);
            class68.field959.method19(var10, -1058);
        }
        var10.field3152 = arg3;
        var10.field3148 = arg1;
        var10.field3153 = arg5;
        var10.field3144 = arg2;
        var10.field3142 = arg7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBI)V", line = 77)
    public static final void method612(int arg0, byte arg1, int arg2) {
        int var3 = class204.field3233 * arg2 >> 8;
        if (arg1 != -95) {
            field1151 = (class275) null;
        }
        field1145++;
        if (arg0 == -1 && !class4.field43) {
            class144.method1068(arg1 ^ 0xFFFFFF5E);
        } else if (arg0 != -1 && (class149.field2331 != arg0 || !class65.method519(arg1 ^ 0xFFFFFFD4)) && var3 != 0 && !class4.field43) {
            class305.method2113(false, 2, arg0, 0, 0, var3, class249.field3913);
        }
        class149.field2331 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([I)V", line = 104)
    public class84(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field1146 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field1146[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1146[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1146[var5 + var5] = arg0[var4];
            this.field1146[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)I", line = 147)
    public final int method613(boolean arg0, int arg1) {
        if (!arg0) {
            return -43;
        }
        int var3 = (this.field1146.length >> 1) - 1;
        field1144++;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field1146[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1146[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
