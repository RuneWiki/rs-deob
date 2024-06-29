import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class674 {

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "F")
    public static float field161;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field157;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)V", line = 3)
    public final void method187(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            super.field9506 = arg0;
            ++field159;
            super.field9498 = arg3;
            super.field9502 = arg1;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IF)V", line = 16)
    public final void method188(int arg0, float arg1) {
        if (arg0 > 71) {
            super.field9504 = arg1;
            ++field162;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 28)
    public static final void method189(int arg0) {
        if (arg0 != -307) {
            field157 = null;
        }
        if (class525.field7663.toLowerCase().indexOf("microsoft") == -1) {
            class49.field664[47] = 73;
            class49.field664[61] = 27;
            class49.field664[44] = 71;
            class49.field664[46] = 72;
            class49.field664[93] = 43;
            if (class525.field7661 != null) {
                class49.field664[520] = 59;
                class49.field664[222] = 58;
                class49.field664[192] = 28;
            } else {
                class49.field664[192] = 58;
                class49.field664[222] = 59;
            }
            class49.field664[91] = 42;
            class49.field664[45] = 26;
            class49.field664[59] = 57;
            class49.field664[92] = 74;
        } else {
            class49.field664[190] = 72;
            class49.field664[188] = 71;
            class49.field664[222] = 59;
            class49.field664[219] = 42;
            class49.field664[186] = 57;
            class49.field664[192] = 58;
            class49.field664[221] = 43;
            class49.field664[187] = 27;
            class49.field664[191] = 73;
            class49.field664[223] = 28;
            class49.field664[220] = 74;
            class49.field664[189] = 26;
        }
        ++field163;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 78)
    public static void method190(boolean arg0) {
        field157 = null;
        if (!arg0) {
            field157 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V", line = 90)
    public static final void method191(int arg0, int arg1, int arg2) {
        ++field158;
        if (arg2 == 4272) {
            if (~class20.field332 != -1) {
                if (arg0 < 0) {
                    for (int var3 = 0; ~var3 > -17; ++var3) {
                        class255.field4052[var3] = arg1;
                    }
                } else {
                    class255.field4052[arg0] = arg1;
                }
            }
            class252.field4036.method204(arg1, arg0, 17849);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZIIIII)V", line = 124)
    public static final void method192(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~(arg2 ? class17.field282.field4875 : class17.field282.field4860) != -1 && ~arg3 != -1 && ~class275.field4413 > -51 && arg0 != -1) {
            class674.field9494[class275.field4413++] = new class681((byte) (arg2 ? 3 : 2), arg0, arg3, arg4, arg7, arg1, arg5, (class692) null);
        }
        if (arg6 > -108) {
            method190(false);
        }
        ++field164;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)V", line = 143)
    public static final void method193(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        if (var3 != null) {
            class200.method1554(var3.field4028);
            class200.method1554(var3.field4023);
            if (var3.field4028 != null) {
                var3.field4028 = null;
            }
            if (var3.field4023 != null) {
                var3.field4023 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIIIF)V", line = 158)
    public class9(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lsp;ZI)V", line = 163)
    public static final void method194(class589 arg0, boolean arg1, int arg2) {
        ++field160;
        if (~class52.field693 > -401) {
            class705 var3 = arg0.field8354;
            if (var3.field9912 != null) {
                var3 = var3.method3973(true, class539.field7869);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field9981) {
                String var4 = var3.field9921;
                if (var3.field9970 != 0) {
                    String var5 = class99.field1647 != class34.field500 ? class122.field2000.method1091(class135.field2206, arg2) : class122.field2002.method1091(class135.field2206, 1);
                    var4 = var4 + class502.method3055(class567.field8141.field4777, var3.field9970, 0) + " (" + var5 + var3.field9970 + ")";
                }
                if (class145.field2450 && !arg1) {
                    class638 var6 = ~class340.field5505 != 0 ? class610.field8680.method3566(class340.field5505, -14724) : null;
                    if ((class73.field918 & 2) != 0 && (var6 == null || var3.method3980(class340.field5505, var6.field8960, (byte) 95) != var6.field8960)) {
                        class652.method3758(0, -1, class523.field7609, class289.field4586 + " -> <col=ffff00>" + var4, true, 45, false, false, (long) arg0.field4197, 0, class558.field8067);
                        ++class664.field9239;
                    }
                }
                if (!arg1) {
                    String[] var7 = var3.field9910;
                    if (class247.field3946) {
                        var7 = class67.method713(var7, 0);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (var7[var8] != null && (~var3.field9918 == -1 || !var7[var8].equalsIgnoreCase(class122.field1995.method1091(class135.field2206, 1)))) {
                                byte var9 = 0;
                                int var10 = class95.field1486;
                                if (var8 == 0) {
                                    var9 = 25;
                                }
                                if (var8 == 1) {
                                    var9 = 4;
                                }
                                if (~var8 == -3) {
                                    var9 = 60;
                                }
                                if (var8 == 3) {
                                    var9 = 2;
                                }
                                if (var3.field9939 == var8) {
                                    var10 = var3.field9979;
                                }
                                if (~var8 == -5) {
                                    var9 = 46;
                                }
                                if (~var3.field9916 == ~var8) {
                                    var10 = var3.field9919;
                                }
                                class652.method3758(0, -1, var7[var8], "<col=ffff00>" + var4, true, var9, false, false, (long) arg0.field4197, 0, var7[var8].equalsIgnoreCase(class122.field1995.method1091(class135.field2206, 1)) ? var3.field9925 : var10);
                                ++class197.field3234;
                            }
                        }
                    }
                    if (var3.field9918 == 1 && var7 != null) {
                        for (int var11 = 4; ~var11 <= -1; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class122.field1995.method1091(class135.field2206, 1))) {
                                short var12 = 0;
                                if (~var3.field9970 < ~class567.field8141.field4777) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (var11 == 0) {
                                    var13 = 25;
                                }
                                if (var11 == 1) {
                                    var13 = 4;
                                }
                                if (var11 == 2) {
                                    var13 = 60;
                                }
                                if (var11 == 3) {
                                    var13 = 2;
                                }
                                if (~var11 == -5) {
                                    var13 = 46;
                                }
                                if (var13 != 0) {
                                    var13 += var12;
                                }
                                class652.method3758(0, -1, var7[var11], "<col=ffff00>" + var4, true, var13, false, false, (long) arg0.field4197, 0, var3.field9925);
                                ++class408.field6296;
                            }
                        }
                    }
                }
                ++class131.field2145;
                class652.method3758(0, -1, class122.field1994.method1091(class135.field2206, arg2), "<col=ffff00>" + var4, true, 1012, false, arg1, (long) arg0.field4197, 0, class163.field2751);
            }
        }
    }
}
