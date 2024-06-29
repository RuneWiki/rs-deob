import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class540 extends class17 {

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    private int field7905 = 4;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    private int field7907 = 4;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field7902 = new String[200];

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V", line = 3)
    public static final void method3174(int arg0) {
        ++field7904;
        class187.method1190(class471.field6573, 101);
        ++class408.field5783;
        if (class508.field7531 && class532.field7810) {
            if (arg0 != 2) {
                method3175((String) null, -80);
            }
            int var1 = class22.field277.method1192(true);
            int var2 = class22.field277.method1194(36);
            int var3 = var2 - class403.field5714;
            int var4 = var1 - class454.field6370;
            if (var4 < class536.field7848) {
                var4 = class536.field7848;
            }
            if (~var3 > ~class413.field5842) {
                var3 = class413.field5842;
            }
            if (~(class536.field7848 + class147.field1965.field2113) > ~(class471.field6573.field2113 + var4)) {
                var4 = class536.field7848 + class147.field1965.field2113 + -class471.field6573.field2113;
            }
            if (~(class413.field5842 - -class147.field1965.field2033) > ~(class471.field6573.field2033 + var3)) {
                var3 = -class471.field6573.field2033 + class147.field1965.field2033 + class413.field5842;
            }
            int var5 = class147.field1965.field2141 + var4 + -class536.field7848;
            int var6 = class147.field1965.field2111 + var3 - class413.field5842;
            if (!class22.field277.method1195(arg0 + 98)) {
                if (class172.field2487) {
                    class235.method1439(-121);
                    if (class471.field6573.field2012 != null) {
                        class389 var7 = new class389();
                        var7.field5468 = var5;
                        var7.field5473 = class76.field991;
                        var7.field5466 = class471.field6573.field2012;
                        var7.field5457 = class471.field6573;
                        var7.field5465 = var6;
                        class495.method2866(var7);
                    }
                    if (class76.field991 != null && client.method1295(class471.field6573) != null) {
                        class474.method2738(class471.field6573, class76.field991, (byte) -89);
                    }
                } else if ((~class234.field3409 == -2 || class172.method1079((byte) -128)) && class37.field408 > 2) {
                    class184.method1165(arg0 ^ 9, class403.field5714 - -class513.field7576, class454.field6370 - -class469.field6557);
                } else if (class195.method1231(0)) {
                    class184.method1165(42, class513.field7576 + class403.field5714, class454.field6370 - -class469.field6557);
                }
                class471.field6573 = null;
            } else {
                if (class471.field6573.field2081 < class408.field5783) {
                    int var8 = var4 - class469.field6557;
                    int var9 = -class513.field7576 + var3;
                    if (~class471.field6573.field2041 > ~var8 || -class471.field6573.field2041 > var8 || var9 > class471.field6573.field2041 || ~var9 > ~(-class471.field6573.field2041)) {
                        class172.field2487 = true;
                    }
                }
                if (class471.field6573.field2021 != null && class172.field2487) {
                    class389 var10 = new class389();
                    var10.field5468 = var5;
                    var10.field5457 = class471.field6573;
                    var10.field5465 = var6;
                    var10.field5466 = class471.field6573.field2021;
                    class495.method2866(var10);
                }
            }
        } else {
            if (~class408.field5783 < -2) {
                class471.field6573 = null;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 119)
    public static final int method3175(String arg0, int arg1) {
        if (arg1 != 1) {
            field7898 = -120;
        }
        ++field7901;
        return 1 + arg0.length();
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 130)
    public static void method3176(boolean arg0) {
        if (arg0) {
            method3175((String) null, 67);
        }
        field7902 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method27(int arg0, int arg1) {
        ++field7899;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = class530.field7763 / this.field7905;
            int var5 = class178.field2556 / this.field7907;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method88(0, -4526, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method88(class178.field2556 * var7 / var5, -4526, 0);
            }
            for (int var8 = 0; ~class530.field7763 < ~var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class530.field7763 * var9 / var4];
                }
            }
        }
        return arg1 <= 53 ? null : var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)Z", line = 198)
    public static final boolean method3177(int arg0, byte arg1, int arg2) {
        if (arg1 > -42) {
            return true;
        } else {
            ++field7900;
            if (~arg2 == -12) {
                arg2 = 10;
            }
            class270 var3 = class377.field5338.method1901(50, arg0);
            if (arg2 >= 5 && ~arg2 >= -9) {
                arg2 = 4;
            }
            return var3.method1707((byte) 29, arg2);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZBI)V", line = 221)
    public static final void method3178(int arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        class368.method2169(arg4, arg1, arg2, 0, (byte) 76, class20.field239.length - 1, arg0);
        ++field7908;
        class160.field2372 = 0;
        int var5 = -57 % ((-25 - arg3) / 45);
        class260.field3845 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lwm;II)V", line = 234)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field7903;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field7907 = arg0.method2357((byte) 113);
            }
        } else {
            this.field7905 = arg0.method2357((byte) 123);
        }
        if (arg2 != 5159) {
            method3176(true);
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 343)
    public class540() {
        super(1, false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I", line = 273)
    public final int[][] method89(int arg0, byte arg1) {
        ++field7906;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            field7902 = null;
        }
        if (super.field201.field4431) {
            int var4 = class530.field7763 / this.field7905;
            int var5 = class178.field2556 / this.field7907;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method91(0, 0, class178.field2556 * var6 / var5);
            } else {
                var7 = this.method91(0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class530.field7763 > var14; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class530.field7763 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }
}
