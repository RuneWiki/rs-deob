import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class249 extends class134 {

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Llf;")
    public static class437 field3273 = new class437();

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field3276 = -1;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Leo;")
    public static class367 field3278 = new class367();

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "Lcq;")
    public static class72 field3280 = new class72("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lcq;")
    public static class72 field3281 = new class72("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "B")
    public byte field3270;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lbg;")
    public class242 field3275;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    public static int[] field3283;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I", line = 3)
    public final int method871(int arg0) {
        ++field3274;
        if (arg0 != 255) {
            method1622(66, (class285) null);
        }
        return this.field3275 == null ? 0 : this.field3275.field3211 * 100 / (this.field3275.field3188.length + -this.field3270);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZLjava/lang/String;)Z", line = 20)
    public static final boolean method1620(boolean arg0, String arg1) {
        ++field3271;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class332.field4536; ++var2) {
                if (arg1.equalsIgnoreCase(class107.field1275[var2])) {
                    return true;
                }
            }
            if (!arg0) {
                method1620(false, (String) null);
            }
            return arg1.equalsIgnoreCase(class143.field1684.field1480);
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 50)
    public static void method1621(int arg0) {
        field3283 = null;
        field3278 = null;
        field3280 = null;
        if (arg0 == -1) {
            field3281 = null;
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILwo;)V", line = 66)
    public static final void method1622(int arg0, class285 arg1) {
        if (arg0 == 0) {
            ++field3277;
            class157.field1831 = arg1;
            class157.field1831.method1821(-110, 35);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)[B", line = 81)
    public final byte[] method873(int arg0) {
        ++field3268;
        if (arg0 != -256) {
            this.method873(-125);
        }
        if (!super.field1539 && ~this.field3275.field3211 <= ~(this.field3275.field3188.length + -this.field3270)) {
            return this.field3275.field3188;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3272;
        if (arg3 != 0) {
            field3283 = null;
        }
        if (~class118.field1356 <= ~arg5 && ~arg4 <= ~class53.field624) {
            boolean var6;
            if (~class295.field3937 < ~arg0) {
                arg0 = class295.field3937;
                var6 = false;
            } else if (~arg0 >= ~class427.field5844) {
                var6 = true;
            } else {
                var6 = false;
                arg0 = class427.field5844;
            }
            boolean var7;
            if (arg1 >= class295.field3937) {
                if (class427.field5844 < arg1) {
                    arg1 = class427.field5844;
                    var7 = false;
                } else {
                    var7 = true;
                }
            } else {
                arg1 = class295.field3937;
                var7 = false;
            }
            if (arg5 >= class53.field624) {
                class384.method2394(arg2, 105, class228.field2877[arg5++], arg1, arg0);
            } else {
                arg5 = class53.field624;
            }
            if (~class118.field1356 > ~arg4) {
                arg4 = class118.field1356;
            } else {
                class384.method2394(arg2, 122, class228.field2877[arg4--], arg1, arg0);
            }
            if (var6 && var7) {
                for (int var8 = arg5; ~arg4 <= ~var8; ++var8) {
                    int[] var9 = class228.field2877[var8];
                    var9[arg0] = var9[arg1] = arg2;
                }
                return;
            }
            if (var6) {
                for (int var10 = arg5; arg4 >= var10; ++var10) {
                    class228.field2877[var10][arg0] = arg2;
                }
                return;
            }
            if (var7) {
                for (int var11 = arg5; ~var11 >= ~arg4; ++var11) {
                    class228.field2877[var11][arg1] = arg2;
                }
                return;
            }
        }
    }
}
