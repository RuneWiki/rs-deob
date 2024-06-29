import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class741 {

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "F")
    public static float field15;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "J")
    public static long field17;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "Lvr;")
    private class147 field16;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lnb;Z)V", line = 7)
    public static final void method10(class319 arg0, boolean arg1) {
        for (int var2 = arg0.field4600; var2 <= arg0.field4595; ++var2) {
            for (int var3 = arg0.field4590; var3 <= arg0.field4585; ++var3) {
                class243 var4 = class626.field8501[arg0.field2250][var2][var3];
                if (var4 != null) {
                    class48 var5 = var4.field3272;
                    class48 var6 = null;
                    while (var5 != null) {
                        if (var5.field725 == arg0) {
                            if (var6 != null) {
                                var6.field726 = var5.field726;
                            } else {
                                var4.field3272 = var5.field726;
                            }
                            var5.method370(-25016);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field726;
                    }
                }
            }
        }
        if (!arg1) {
            class745.method4126(arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIZIIII)V", line = 55)
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field21;
        if (arg2 >= 512 && ~arg0 <= -513 && ~(class597.field8132 * 512 + -1024) <= ~arg2 && (class628.field8800 + -2) * 512 >= arg0) {
            int var10 = -arg1 + class783.method4338(arg7, arg2, -12040, arg0);
            if (arg5) {
                if (!class130.field1934) {
                    class334.field4865.method970(arg8, 0, 0);
                    class379.field5542.method526(class334.field4865);
                } else {
                    class577.method3223(true, (byte) -92);
                }
                if (!class200.field2658) {
                    class379.field5542.method455(arg2, var10, arg0, class744.field10277);
                } else {
                    class379.field5542.method527(arg2, var10, arg0, class330.field4773, class744.field10277);
                }
                if (class130.field1934) {
                    class668.method3716(-15443);
                } else {
                    class334.field4865.method970(-arg8, 0, 0);
                    class379.field5542.method526(class334.field4865);
                }
            }
        } else {
            class744.field10277[0] = class744.field10277[1] = -1;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 95)
    public static final void method12(int arg0, String arg1) {
        ++field18;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class194.method1339(18123, arg1);
            if (var2 != null) {
                for (int var3 = arg0; class5.field54 > var3; ++var3) {
                    String var4 = class255.field3798[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class194.method1339(arg0 ^ 18123, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class5.field54;
                        for (int var6 = var3; ~var6 > ~class5.field54; ++var6) {
                            class255.field3798[var6] = class255.field3798[var6 - -1];
                            class602.field8189[var6] = class602.field8189[var6 + 1];
                            class424.field6053[var6] = class424.field6053[var6 + 1];
                            class768.field10593[var6] = class768.field10593[var6 + 1];
                            class749.field10327[var6] = class749.field10327[var6 + 1];
                        }
                        ++class341.field4918;
                        class180.field2390 = class194.field2598;
                        class267 var7 = class545.method3099((byte) 122, class269.field3966, class310.field4466);
                        var7.field3938.method2380(65280, class469.method2769(arg1, (byte) 112));
                        var7.field3938.method2349(109, arg1);
                        class617.method3392(var7, true);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZII)V", line = 155)
    public final void method13(int arg0, boolean arg1, int arg2, int arg3) {
        ++field23;
        int var5 = this.method4103(2048) * super.field10222.field9033 / 10000;
        if (arg2 < 102) {
            this.method14(false, (byte) 30, 26, 91);
        }
        int[] var6 = new int[4];
        class379.field5542.method494(var6);
        class379.field5542.method456(arg3, arg0 + 2, arg3 + var5, super.field10222.field9025 + arg0);
        this.field16.method1111(arg3, arg0 + 2, super.field10222.field9033, super.field10222.field9025);
        class379.field5542.method456(var6[0], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Laj;Laj;Lk;)V", line = 178)
    public class3(class333 arg0, class333 arg1, class592 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZBII)V", line = 181)
    public final void method14(boolean arg0, byte arg1, int arg2, int arg3) {
        ++field20;
        class379.field5542.method538(arg2 + -2, arg3, super.field10222.field9033 - -4, super.field10222.field9025 - -2, ((class592) super.field10222).field7967, 0);
        int var5 = -61 % ((64 - arg1) / 35);
        class379.field5542.method538(arg2 + -1, arg3 + 1, super.field10222.field9033 + 2, super.field10222.field9025, 0, 0);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Z", line = 192)
    public final boolean method15(int arg0) {
        if (arg0 != 20662) {
            method12(98, (String) null);
        }
        ++field19;
        return !super.method15(arg0) ? false : super.field10223.method2104(arg0 + -20551, ((class592) super.field10222).field7962);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 207)
    public final void method16(int arg0) {
        super.method16(48);
        ++field22;
        if (arg0 >= 36) {
            this.field16 = class454.method2694(47, super.field10223, ((class592) super.field10222).field7962);
        }
    }
}
