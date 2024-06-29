import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class547 {

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "Lns;")
    public class627 field7718 = new class627();

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "[I")
    public static int[] field7707 = new int[1000];

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "Lmq;")
    public static class78 field7714 = new class78(107, 17);

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!qia", name = "s", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "Lns;")
    private class627 field7722;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lqia;I)V")
    public final void method3108(class547 arg0, int arg1) {
        field7712++;
        if (arg1 > -88) {
            this.field7718 = null;
        }
        this.method3121(arg0, this.field7718.field8744, 8693);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lns;I)V")
    public final void method3109(class627 arg0, int arg1) {
        field7715++;
        if (arg1 < 113) {
            return;
        }
        if (arg0.field8742 != null) {
            arg0.method3426((byte) -73);
        }
        arg0.field8744 = this.field7718.field8744;
        arg0.field8742 = this.field7718;
        arg0.field8742.field8744 = arg0;
        arg0.field8744.field8742 = arg0;
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lns;I)V")
    public final void method3110(class627 arg0, int arg1) {
        field7716++;
        if (arg0.field8742 != null) {
            arg0.method3426((byte) -96);
        }
        arg0.field8742 = this.field7718.field8742;
        arg0.field8744 = this.field7718;
        arg0.field8742.field8744 = arg0;
        if (arg1 != 1) {
            this.field7718 = null;
        }
        arg0.field8744.field8742 = arg0;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)Lns;")
    public final class627 method3111(int arg0) {
        field7719++;
        class627 var2 = this.field7718.field8744;
        if (arg0 < 50) {
            return null;
        } else if (this.field7718 == var2) {
            this.field7722 = null;
            return null;
        } else {
            this.field7722 = var2.field8744;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
    public final boolean method3112(int arg0) {
        if (arg0 != -4) {
            this.method3108(null, -6);
        }
        field7708++;
        return this.field7718.field8744 == this.field7718;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILnl;Z)V")
    public static final void method3113(int arg0, class681 arg1, boolean arg2) {
        if (arg0 != 6) {
            return;
        }
        field7711++;
        class761.field10601.method1281(28305, arg1);
        if (arg2) {
            class325.method1918(class761.field10601, class1.field2, arg1, arg0 - 961, class107.field1327, class250.field3179);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V")
    public final void method3114(boolean arg0) {
        while (true) {
            class627 var2 = this.field7718.field8744;
            if (this.field7718 == var2) {
                field7705++;
                if (!arg0) {
                    return;
                }
                this.field7722 = null;
                return;
            }
            var2.method3426((byte) -96);
        }
    }

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)Lns;")
    public final class627 method3115(int arg0) {
        field7720++;
        if (arg0 != 1210318848) {
            this.method3112(-12);
        }
        class627 var2 = this.field7718.field8744;
        if (this.field7718 == var2) {
            return null;
        } else {
            var2.method3426((byte) -58);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "(I)Lns;")
    public final class627 method3116(int arg0) {
        field7713++;
        class627 var2 = this.field7722;
        if (this.field7718 == var2) {
            this.field7722 = null;
            return null;
        } else {
            this.field7722 = var2.field8744;
            return arg0 > -34 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBIIIIIIIILrl;)Z")
    public static final boolean method3117(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class685 arg10) {
        field7721++;
        int var11 = arg6;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg7 - var14;
        class673.field9171[var13][var14] = 99;
        if (arg1 >= -23) {
            field7707 = null;
        }
        class293.field3824[var13][var14] = 0;
        byte var17 = 0;
        class36.field540[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class635.field8803[var10001] = arg7;
        int[][] var19 = arg10.field9700;
        while (var26 != var18) {
            var12 = class635.field8803[var18];
            var11 = class36.field540[var18];
            int var20 = var11 - arg10.field9685;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var12 - arg10.field9679;
            if (arg4 == -4) {
                if (arg2 == var11 && arg3 == var12) {
                    class197.field2538 = var11;
                    class570.field7944 = var12;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class406.method2409((byte) -116, arg0, var11, arg9, 1, arg2, arg3, 1, var12)) {
                    class197.field2538 = var11;
                    class570.field7944 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg10.method3797(1, arg9, arg3, var12, arg0, 1, arg8, arg2, (byte) 117, var11)) {
                    class570.field7944 = var12;
                    class197.field2538 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg10.method3802(arg2, var11, true, arg0, arg8, arg3, 1, arg9, var12)) {
                    class570.field7944 = var12;
                    class197.field2538 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg10.method3808(var12, 1, -99, arg2, arg4, arg5, var11, arg3)) {
                    class197.field2538 = var11;
                    class570.field7944 = var12;
                    return true;
                }
            } else if (arg10.method3801(var12, arg2, arg4, 1, arg5, arg3, var11, (byte) 121)) {
                class197.field2538 = var11;
                class570.field7944 = var12;
                return true;
            }
            int var25 = class293.field3824[var21][var22] + 1;
            if (var21 > 0 && class673.field9171[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class36.field540[var26] = var11 - 1;
                class635.field8803[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class673.field9171[var21 - 1][var22] = 2;
                class293.field3824[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class673.field9171[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12;
                class673.field9171[var21 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class293.field3824[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class673.field9171[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class36.field540[var26] = var11;
                class635.field8803[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class673.field9171[var21][var22 - 1] = 1;
                class293.field3824[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class673.field9171[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class36.field540[var26] = var11;
                class635.field8803[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class673.field9171[var21][var22 + 1] = 4;
                class293.field3824[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class673.field9171[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class36.field540[var26] = var11 - 1;
                class635.field8803[var26] = var12 - 1;
                class673.field9171[var21 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class293.field3824[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class673.field9171[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class673.field9171[var21 + 1][var22 - 1] = 9;
                class293.field3824[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class673.field9171[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class36.field540[var26] = var11 - 1;
                class635.field8803[var26] = var12 + 1;
                class673.field9171[var21 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class293.field3824[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class673.field9171[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class36.field540[var26] = var11 + 1;
                class635.field8803[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class673.field9171[var21 + 1][var22 + 1] = 12;
                class293.field3824[var21 + 1][var22 + 1] = var25;
            }
        }
        class197.field2538 = var11;
        class570.field7944 = var12;
        return false;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public static void method3118(byte arg0) {
        field7714 = null;
        if (arg0 < 83) {
            method3113(-127, null, false);
        }
        field7707 = null;
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
    public class547() {
        this.field7718.field8742 = this.field7718;
        this.field7718.field8744 = this.field7718;
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Z)Lns;")
    public final class627 method3119(boolean arg0) {
        field7710++;
        if (!arg0) {
            return null;
        }
        class627 var2 = this.field7718.field8742;
        if (this.field7718 == var2) {
            this.field7722 = null;
            return null;
        } else {
            this.field7722 = var2.field8742;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)Lns;")
    public final class627 method3120(byte arg0) {
        field7709++;
        class627 var2 = this.field7722;
        if (this.field7718 == var2) {
            this.field7722 = null;
            return null;
        }
        if (arg0 <= 92) {
            field7707 = null;
        }
        this.field7722 = var2.field8742;
        return var2;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lqia;Lns;I)V")
    private final void method3121(class547 arg0, class627 arg1, int arg2) {
        if (arg2 != 8693) {
            this.method3122(-64);
        }
        field7717++;
        class627 var4 = this.field7718.field8742;
        this.field7718.field8742 = arg1.field8742;
        arg1.field8742.field8744 = this.field7718;
        if (this.field7718 != arg1) {
            arg1.field8742 = arg0.field7718.field8742;
            arg1.field8742.field8744 = arg1;
            var4.field8744 = arg0.field7718;
            arg0.field7718.field8742 = var4;
        }
    }

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "(I)I")
    public final int method3122(int arg0) {
        field7723++;
        int var2 = 0;
        class627 var3 = this.field7718.field8744;
        if (arg0 != 667) {
            field7714 = null;
        }
        while (this.field7718 != var3) {
            var2++;
            var3 = var3.field8744;
        }
        return var2;
    }
}
