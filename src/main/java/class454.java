import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class454 extends class382 {

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    private int field6692 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field6694;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 3)
    public static void method2778(byte arg0) {
        int var1 = 22 % ((arg0 - 79) / 33);
        field6694 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lkd;ZB)V", line = 12)
    public static final void method2779(class282 arg0, boolean arg1, byte arg2) {
        ++field6688;
        if (class68.field969 < 400) {
            class348 var3 = arg0.field4008;
            String var4 = arg0.field3995;
            if (var3.field5076 != null) {
                var3 = var3.method2207(111, class83.field1160);
                if (var3 == null) {
                    return;
                }
                var4 = var3.field5069;
            }
            if (var3.field5058) {
                if (~arg0.field4009 != -1) {
                    String var5 = class373.field5652 == class199.field2993 ? class430.field6400.method2679(class650.field9160, 123) : class430.field6398.method2679(class650.field9160, 127);
                    var4 = var4 + class679.method3895(arg2 + -100, class130.field1749.field9524, arg0.field4009) + " (" + var5 + arg0.field4009 + ")";
                }
                if (arg2 != 100) {
                    method2779((class282) null, false, (byte) 117);
                }
                if (class282.field3986 && !arg1) {
                    class323 var6 = ~class616.field8673 != 0 ? class153.field2479.method1653(class616.field8673, (byte) -119) : null;
                    if (~(class295.field4202 & 2) != -1 && (var6 == null || var3.method2194((byte) 94, class616.field8673, var6.field4610) != var6.field4610)) {
                        class240.method1593(class298.field4229, 0, (byte) 106, false, (long) arg0.field6118, class488.field6984, false, -1, 22, 0, true, (long) arg0.field6118, class29.field278 + " -> <col=ffff00>" + var4);
                        ++class564.field8026;
                    }
                }
                if (!arg1) {
                    String[] var7 = var3.field5052;
                    if (class114.field1578) {
                        var7 = class131.method932((byte) -115, var7);
                    }
                    if (var7 != null) {
                        for (int var8 = 4; ~var8 <= -1; --var8) {
                            if (var7[var8] != null && (var3.field5073 == 0 || !var7[var8].equalsIgnoreCase(class430.field6393.method2679(class650.field9160, -85)))) {
                                byte var9 = 0;
                                if (var8 == 0) {
                                    var9 = 59;
                                }
                                int var10 = class164.field2593;
                                if (var8 == 1) {
                                    var9 = 19;
                                }
                                if (var8 == 2) {
                                    var9 = 13;
                                }
                                if (var8 == 3) {
                                    var9 = 25;
                                }
                                if (var8 == 4) {
                                    var9 = 20;
                                }
                                if (~var3.field5040 == ~var8) {
                                    var10 = var3.field5028;
                                }
                                if (~var3.field5057 == ~var8) {
                                    var10 = var3.field5084;
                                }
                                ++class291.field4156;
                                class240.method1593(var7[var8], 0, (byte) 120, false, (long) arg0.field6118, var7[var8].equalsIgnoreCase(class430.field6393.method2679(class650.field9160, 118)) ? var3.field5063 : var10, false, -1, var9, 0, true, (long) arg0.field6118, "<col=ffff00>" + var4);
                            }
                        }
                    }
                    if (var3.field5073 == 1 && var7 != null) {
                        for (int var11 = 4; var11 >= 0; --var11) {
                            if (var7[var11] != null && var7[var11].equalsIgnoreCase(class430.field6393.method2679(class650.field9160, 126))) {
                                short var12 = 0;
                                if (class130.field1749.field9524 < arg0.field4009) {
                                    var12 = 2000;
                                }
                                short var13 = 0;
                                if (~var11 == -1) {
                                    var13 = 59;
                                }
                                if (~var11 == -2) {
                                    var13 = 19;
                                }
                                if (var11 == 2) {
                                    var13 = 13;
                                }
                                if (var11 == 3) {
                                    var13 = 25;
                                }
                                if (~var11 == -5) {
                                    var13 = 20;
                                }
                                if (var13 != 0) {
                                    var13 += var12;
                                }
                                class240.method1593(var7[var11], 0, (byte) -70, false, (long) arg0.field6118, var3.field5063, false, -1, var13, 0, true, (long) arg0.field6118, "<col=ffff00>" + var4);
                                ++class601.field8506;
                            }
                        }
                    }
                }
                ++class478.field6936;
                class240.method1593(class430.field6392.method2679(class650.field9160, arg2 + -198), 0, (byte) 118, arg1, (long) arg0.field6118, class481.field6964, false, -1, 1004, 0, true, (long) arg0.field6118, "<col=ffff00>" + var4);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V", line = 176)
    public final void method1249(int arg0, boolean arg1) {
        ++field6691;
        int var3 = super.field5757.field1127.method3778(class291.field4165, super.field5755.method1504(), false) - -super.field5757.field1135;
        if (arg0 == 7620) {
            int var4 = super.field5757.field1129.method4065((byte) -125, super.field5755.method1514(), class344.field4988) - -super.field5757.field1125;
            super.field5755.method3147((float) (super.field5755.method1504() / 2 + var3), (float) (var4 + super.field5755.method1514() / 2), 4096, this.field6692);
            this.field6692 += ((class279) super.field5757).field3952;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lvd;Lmm;)V", line = 193)
    public class454(class39 arg0, class279 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIII)V", line = 197)
    public static final void method2780(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (-arg3 + arg5 >= class497.field7073 && arg3 + arg5 <= class391.field5895 && -arg3 + arg0 >= class166.field2622 && ~class432.field6446 <= ~(arg0 + arg3)) {
            class588.method3400(false, arg0, arg4, arg3, arg5, arg1, arg6);
        } else {
            class232.method1550(arg6, arg4, arg0, 0, arg1, arg5, arg3);
        }
        ++field6690;
        if (arg2) {
            field6694 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I", line = 214)
    public static final int method2781(int arg0, int arg1, int arg2) {
        if (arg0 >= -63) {
            method2779((class282) null, false, (byte) -16);
        }
        ++field6689;
        int var3 = class158.method1163(arg2 + -1, true, arg1 + -1) - (-class158.method1163(arg2 - 1, true, arg1 + 1) + -class158.method1163(arg2 + 1, true, arg1 + -1)) + class158.method1163(arg2 + 1, true, arg1 + 1);
        int var4 = class158.method1163(arg2, true, arg1 - 1) - -class158.method1163(arg2, true, arg1 + 1) - -class158.method1163(arg2 + -1, true, arg1) - -class158.method1163(arg2 - -1, true, arg1);
        int var5 = class158.method1163(arg2, true, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
