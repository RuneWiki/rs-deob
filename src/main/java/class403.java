import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class403 extends class486 implements class246 {

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lej;")
    public class438 field5506;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Z")
    private boolean field5516;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field5520 = 0;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lud;")
    private class119 field5503;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field5509;
        class521 var3 = this.field5506.method2548(super.field6780, (byte) 125, true, false, super.field6787, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method964();
            var4.method361(super.field6787 + super.field6786, super.field6779, super.field6780 + super.field6777);
            int var5 = 43 % ((-30 - arg0) / 63);
            class541 var6 = null;
            if (this.field5516) {
                var6 = class296.method1818(16711680, 1);
            }
            if (this.field5506.field5950 != null) {
                class174 var7 = this.field5506.field5950.method1864();
                arg1.method947(var3, var7, var4, var6 != null ? var6.field7564[0] : null, 0);
            } else {
                var3.method1595(var4, var6 == null ? null : var6.field7564[0], 0);
            }
            if (this.field5503 == null) {
                this.field5503 = class82.method459(var3, super.field6780, super.field6779, super.field6787, (byte) -101);
            } else {
                class504.method2818(this.field5503, super.field6787, var3, super.field6779, super.field6780, (byte) 105);
            }
            int var8 = super.field6787 >> 9;
            int var9 = super.field6780 >> 9;
            this.field5506.method2555(var3, var9, true, var8, var9, var8, -1, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "(I)I")
    public final int method2135(int arg0) {
        if (arg0 != -1) {
            return 95;
        } else {
            ++field5512;
            return this.field5506.method2545(true);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field5502;
        int var3 = -123 % ((4 - arg0) / 47);
        return this.field5503;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIZIIIIII)V")
    public class403(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class419.method2486(4460, arg12, arg11));
        this.field5506 = new class438(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5516 = ~arg1.field1749 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 118 % ((-4 - arg0) / 41);
        ++field5513;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static final int method2409(int arg0, int arg1) {
        ++field5510;
        int var2 = 98 % ((arg1 - -58) / 39);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field5508;
        return arg0 != -29185 ? 56 : this.field5506.field5949;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 > -35) {
            this.field5506 = null;
        }
        ++field5518;
        class521 var5 = this.field5506.method2548(super.field6780, (byte) 121, false, false, super.field6787, 131072, arg2);
        if (var5 == null) {
            return false;
        } else {
            class105 var6 = arg2.method964();
            var6.method361(super.field6787 + super.field6786, super.field6779, super.field6780 - -super.field6777);
            return var5.method1598(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        ++field5514;
        if (arg0 != -17817) {
            this.field5506 = null;
        }
        return this.field5506.field5966;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        if (arg1 != 30307) {
            this.method52(-107);
        }
        ++field5515;
        return this.field5506.method2548(0, (byte) -32, false, false, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        ++field5519;
        int var2 = 47 / ((arg0 - -20) / 32);
        return this.field5506.method2553((byte) -73);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lfd;IIIIIIIIII)Z")
    public static final boolean method2410(class143 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5507;
        int var11 = arg7;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg7;
        int var16 = -var14 + arg9;
        class76.field1042[var13][var14] = 99;
        class296.field3838[var13][var14] = 0;
        byte var17 = 0;
        if (arg5 != 26128) {
            return false;
        } else {
            int var18 = 0;
            class599.field8663[var17] = arg7;
            byte var10001 = var17;
            int var26 = var17 + 1;
            class424.field5744[var10001] = arg9;
            int[][] var19 = arg0.field1833;
            while (~var26 != ~var18) {
                var11 = class599.field8663[var18];
                var12 = class424.field5744[var18];
                int var20 = -arg0.field1822 + var11;
                var18 = var18 - -1 & 4095;
                int var21 = -var15 + var11;
                int var22 = -var16 + var12;
                int var23 = -arg0.field1839 + var12;
                if (~arg6 != 3) {
                    if (arg6 != -3) {
                        if (arg6 != -2) {
                            if (~arg6 != 0) {
                                if (arg6 != 0 && arg6 != 1 && ~arg6 != -3 && arg6 != 3 && arg6 != 9) {
                                    if (arg0.method772(arg10, var12, var11, 0, 1, arg6, arg8, arg4)) {
                                        class54.field725 = var11;
                                        class95.field1284 = var12;
                                        return true;
                                    }
                                } else if (arg0.method775(1, arg10, var11, 18906, var12, arg8, arg6, arg4)) {
                                    class54.field725 = var11;
                                    class95.field1284 = var12;
                                    return true;
                                }
                            } else if (arg0.method784(arg3, arg2, var11, arg4, arg1, var12, arg8, arg5 ^ 26136, 1)) {
                                class54.field725 = var11;
                                class95.field1284 = var12;
                                return true;
                            }
                        } else if (arg0.method786(var12, arg8, arg1, arg3, 1, 1, (byte) 83, arg4, arg2, var11)) {
                            class95.field1284 = var12;
                            class54.field725 = var11;
                            return true;
                        }
                    } else if (class113.method610(88, 1, var12, 1, arg4, arg8, arg3, arg1, var11)) {
                        class54.field725 = var11;
                        class95.field1284 = var12;
                        return true;
                    }
                } else if (~arg8 == ~var11 && arg4 == var12) {
                    class54.field725 = var11;
                    class95.field1284 = var12;
                    return true;
                }
                int var25 = class296.field3838[var21][var22] + 1;
                if (var21 > 0 && ~class76.field1042[var21 + -1][var22] == -1 && (var19[var20 + -1][var23] & 1109655552) == 0) {
                    class599.field8663[var26] = var11 + -1;
                    class424.field5744[var26] = var12;
                    class76.field1042[var21 + -1][var22] = 2;
                    var26 = var26 + 1 & 4095;
                    class296.field3838[var21 + -1][var22] = var25;
                }
                if (~var21 > -128 && class76.field1042[var21 + 1][var22] == 0 && (1612972032 & var19[var20 - -1][var23]) == 0) {
                    class599.field8663[var26] = var11 + 1;
                    class424.field5744[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class76.field1042[var21 + 1][var22] = 8;
                    class296.field3838[var21 + 1][var22] = var25;
                }
                if (var22 > 0 && class76.field1042[var21][var22 + -1] == 0 && ~(var19[var20][var23 - 1] & 1084489728) == -1) {
                    class599.field8663[var26] = var11;
                    class424.field5744[var26] = var12 + -1;
                    class76.field1042[var21][var22 + -1] = 1;
                    var26 = 4095 & var26 + 1;
                    class296.field3838[var21][var22 + -1] = var25;
                }
                if (var22 < 127 && class76.field1042[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 1210318848) == 0) {
                    class599.field8663[var26] = var11;
                    class424.field5744[var26] = var12 + 1;
                    var26 = var26 + 1 & 4095;
                    class76.field1042[var21][var22 + 1] = 4;
                    class296.field3838[var21][var22 - -1] = var25;
                }
                if (~var21 < -1 && ~var22 < -1 && ~class76.field1042[var21 + -1][var22 - 1] == -1 && ~(1134821376 & var19[var20 + -1][var23 - 1]) == -1 && ~(1109655552 & var19[var20 + -1][var23]) == -1 && ~(var19[var20][var23 + -1] & 1084489728) == -1) {
                    class599.field8663[var26] = var11 + -1;
                    class424.field5744[var26] = var12 - 1;
                    var26 = var26 + 1 & 4095;
                    class76.field1042[var21 + -1][var22 - 1] = 3;
                    class296.field3838[var21 + -1][var22 + -1] = var25;
                }
                if (var21 < 127 && ~var22 < -1 && class76.field1042[var21 + 1][var22 - 1] == 0 && (1625554944 & var19[var20 + 1][var23 + -1]) == 0 && ~(var19[var20 + 1][var23] & 1612972032) == -1 && (var19[var20][var23 + -1] & 1084489728) == 0) {
                    class599.field8663[var26] = var11 + 1;
                    class424.field5744[var26] = var12 + -1;
                    class76.field1042[var21 + 1][var22 - 1] = 9;
                    var26 = var26 + 1 & 4095;
                    class296.field3838[var21 + 1][var22 + -1] = var25;
                }
                if (~var21 < -1 && ~var22 > -128 && class76.field1042[var21 + -1][var22 - -1] == 0 && (1310982144 & var19[var20 + -1][var23 - -1]) == 0 && ~(1109655552 & var19[var20 + -1][var23]) == -1 && ~(var19[var20][var23 + 1] & 1210318848) == -1) {
                    class599.field8663[var26] = var11 + -1;
                    class424.field5744[var26] = var12 + 1;
                    class76.field1042[var21 + -1][var22 - -1] = 6;
                    var26 = 4095 & var26 + 1;
                    class296.field3838[var21 - 1][var22 + 1] = var25;
                }
                if (~var21 > -128 && var22 < 127 && ~class76.field1042[var21 - -1][var22 - -1] == -1 && (2015625216 & var19[var20 - -1][var23 + 1]) == 0 && ~(var19[var20 + 1][var23] & 1612972032) == -1 && (1210318848 & var19[var20][var23 - -1]) == 0) {
                    class599.field8663[var26] = var11 - -1;
                    class424.field5744[var26] = var12 + 1;
                    class76.field1042[var21 - -1][var22 - -1] = 12;
                    var26 = var26 + 1 & 4095;
                    class296.field3838[var21 + 1][var22 + 1] = var25;
                }
            }
            class54.field725 = var11;
            class95.field1284 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 1901) {
            this.field5506 = null;
        }
        ++field5504;
        return this.field5506.field5980;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field5505;
        if (arg1 == 0) {
            class521 var3 = this.field5506.method2548(super.field6780, (byte) -53, true, false, super.field6787, 262144, arg0);
            if (var3 != null) {
                int var4 = super.field6787 >> 9;
                int var5 = super.field6780 >> 9;
                this.field5506.method2555(var3, var5, false, var4, var5, var4, ~arg1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        this.field5506.method2544(arg1, true);
        if (arg0 == 22132) {
            ++field5511;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        if (arg1 != -9785) {
            this.field5516 = true;
        }
        ++field5517;
        this.field5506.method2552((byte) 11, arg0);
    }
}
