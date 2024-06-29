import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class506 extends class281 {

    @OriginalMember(owner = "client!gh", name = "Xc", descriptor = "I")
    public int field6940 = -1;

    @OriginalMember(owner = "client!gh", name = "md", descriptor = "I")
    public int field6955 = 1;

    @OriginalMember(owner = "client!gh", name = "nd", descriptor = "I")
    public int field6956 = 1;

    @OriginalMember(owner = "client!gh", name = "gd", descriptor = "I")
    public int field6949 = -1;

    @OriginalMember(owner = "client!gh", name = "bd", descriptor = "[Ltm;")
    public static class618[] field6944 = new class618[75];

    @OriginalMember(owner = "client!gh", name = "Zc", descriptor = "Lin;")
    public static class380 field6942 = new class380(114, -1);

    @OriginalMember(owner = "client!gh", name = "Vc", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!gh", name = "Wc", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!gh", name = "Yc", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!gh", name = "ad", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!gh", name = "cd", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!gh", name = "dd", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!gh", name = "ed", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!gh", name = "fd", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!gh", name = "hd", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!gh", name = "jd", descriptor = "I")
    public int field6952;

    @OriginalMember(owner = "client!gh", name = "ld", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!gh", name = "od", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!gh", name = "pd", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!gh", name = "qd", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!gh", name = "rd", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!gh", name = "sd", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!gh", name = "td", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!gh", name = "ud", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!gh", name = "wd", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!gh", name = "vd", descriptor = "Lrf;")
    public class179 field6964;

    @OriginalMember(owner = "client!gh", name = "id", descriptor = "Lap;")
    public class499 field6951;

    @OriginalMember(owner = "client!gh", name = "kd", descriptor = "Ljava/lang/String;")
    public String field6953;

    @OriginalMember(owner = "client!gh", name = "xd", descriptor = "[Leea;")
    public static class187[] field6966;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(IB)Z", line = 3)
    public static final boolean method2959(int arg0, byte arg1) {
        ++field6959;
        if (~arg0 != -5 && arg0 != 52 && ~arg0 != -9 && arg0 != 46 && arg0 != 1008) {
            if (arg1 != -119) {
                return true;
            } else {
                return arg0 == 44 || ~arg0 == -1007;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)Z", line = 22)
    public final boolean method197(boolean arg0) {
        ++field6965;
        if (!arg0) {
            this.method194(-119, -25, 32, (class475) null, (class745) null, false, 114);
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIILha;)Z", line = 33)
    public final boolean method198(byte arg0, int arg1, int arg2, class475 arg3) {
        ++field6957;
        if (this.field6964 != null && this.method2963(arg3, 6672, 131072)) {
            class765 var5 = arg3.method457();
            int var6 = super.field4067.method1856(0);
            var5.method1561(var6);
            var5.method1558(super.field10347, super.field10358, super.field10350);
            boolean var7 = false;
            for (int var8 = 0; super.field4143.length > var8; ++var8) {
                if (super.field4143[var8] != null) {
                    boolean var10000;
                    label43: {
                        if (this.field6964.field2681 <= 0) {
                            label41: {
                                if (~this.field6964.field2699 == 0) {
                                    if (this.field6964.field2737 == 1) {
                                        break label41;
                                    }
                                    var10000 = false;
                                } else {
                                    if (this.field6964.field2699 == 1) {
                                        break label41;
                                    }
                                    var10000 = false;
                                }
                                if (!var10000) {
                                    var10000 = false;
                                    break label43;
                                }
                            }
                        }
                        var10000 = true;
                    }
                    boolean var9 = var10000;
                    boolean var10;
                    if (class765.field10581) {
                        var10 = super.field4143[var8].method584(arg1, arg2, var5, var9, this.field6964.field2681, class349.field4956);
                    } else {
                        var10 = super.field4143[var8].method589(arg1, arg2, var5, var9, this.field6964.field2681);
                    }
                    if (var10) {
                        var7 = true;
                        break;
                    }
                }
            }
            int var11 = -109 % ((arg0 - 51) / 51);
            super.field4143[0] = super.field4143[1] = super.field4143[2] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BLha;)Lmg;", line = 87)
    public final class248 method205(byte arg0, class475 arg1) {
        if (arg0 != 45) {
            method2961((byte) 62);
        }
        ++field6945;
        return null;
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)I", line = 102)
    public final int method2960(int arg0) {
        if (arg0 != -5102) {
            return -72;
        } else {
            ++field6947;
            return this.field6964 == null ? 0 : this.field6964.field2681;
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V", line = 121)
    public static void method2961(byte arg0) {
        if (arg0 <= 51) {
            field6942 = null;
        }
        field6966 = null;
        field6944 = null;
        field6942 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lha;I)Luh;", line = 134)
    public final class162 method204(class475 arg0, int arg1) {
        ++field6958;
        if (this.field6964 != null && this.method2963(arg0, 6672, 2048)) {
            class765 var3 = arg0.method457();
            int var4 = super.field4067.method1856(arg1 ^ arg1);
            var3.method1561(var4);
            class172 var5 = class514.field7096[super.field10361][super.field10347 >> class679.field9600][super.field10350 >> class679.field9600];
            if (var5 != null && var5.field2595 != null) {
                int var6 = -var5.field2595.field3005 + super.field4097;
                super.field4097 = (int) ((float) super.field4097 - (float) var6 / 10.0F);
            } else {
                super.field4097 = (int) ((float) super.field4097 - (float) super.field4097 / 10.0F);
            }
            var3.method1558(super.field10347, -super.field4097 + -20 + super.field10358, super.field10350);
            class31 var7 = this.method1783(true);
            class179 var8 = this.field6964.field2683 == null ? this.field6964 : this.field6964.method1304(class578.field8328, -25917);
            super.field4138 = false;
            class162 var9 = null;
            if (~class420.field5820.field9450.method3133(17539) == -2 && var8.field2724 && var7.field352) {
                class98 var10 = ~super.field4064 != 0 && super.field4124 == 0 ? class168.field2552.method3287(125, super.field4064) : null;
                class98 var11 = ~super.field4040 == 0 || super.field4109 && var10 != null ? null : class168.field2552.method3287(97, super.field4040);
                class233 var12 = class145.method1157(super.field4129, super.field4107, this.field6964.field2678 & 65535, var11 != null ? var11 : var10, var11 == null ? super.field4114 : super.field4122, -1, this.field6964.field2737, var4, super.field4123, 255 & this.field6964.field2707, this.field6964.field2685 & 65535, arg0, this.field6964.field2693 & 255, super.field4143[0]);
                if (var12 != null) {
                    var9 = class527.method3085(super.field4143.length - -1, this.method2966((byte) -107), 0);
                    super.field4138 = true;
                    arg0.method513(false);
                    if (!class765.field10581) {
                        var12.method575(var3, var9.field2500[super.field4143.length], 0);
                    } else {
                        var12.method546(var3, var9.field2500[super.field4143.length], class349.field4956, 0);
                    }
                    arg0.method513(true);
                }
            }
            var3.method1561(var4);
            var3.method1558(super.field10347, super.field10358 + -5 + -super.field4097, super.field10350);
            if (var9 == null) {
                var9 = class527.method3085(super.field4143.length, this.method2966((byte) -107), ~arg1);
            }
            this.method1786(arg1 + 1, false, var3, super.field4143, arg0);
            if (class765.field10581) {
                for (int var13 = 0; ~var13 > ~super.field4143.length; ++var13) {
                    if (super.field4143[var13] != null) {
                        super.field4143[var13].method546(var3, var9.field2500[var13], class349.field4956, 0);
                    }
                }
            } else {
                for (int var14 = 0; ~super.field4143.length < ~var14; ++var14) {
                    if (super.field4143[var14] != null) {
                        super.field4143[var14].method575(var3, var9.field2500[var14], 0);
                    }
                }
            }
            if (super.field4135 != null) {
                class667 var15 = super.field4135.method1346();
                if (!class765.field10581) {
                    arg0.method455(var15);
                } else {
                    arg0.method429(var15, class349.field4956);
                }
            }
            for (int var16 = 0; super.field4143.length > var16; ++var16) {
                if (super.field4143[var16] != null) {
                    super.field4138 |= super.field4143[var16].method558();
                }
            }
            super.field4143[0] = super.field4143[1] = super.field4143[2] = null;
            super.field4115 = class626.field8887;
            return var9;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIZ)V", line = 263)
    public final void method2962(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        super.field10361 = super.field10349 = (byte) arg0;
        ++field6963;
        if (class717.method3994(arg4 ^ -570450127, arg1, arg2)) {
            ++super.field10349;
        }
        if (super.field4064 != -1 && ~class168.field2552.method3287(74, super.field4064).field1397 == -2) {
            super.field4064 = -1;
            super.field4088 = null;
        }
        for (int var7 = 0; var7 < super.field4043.length; ++var7) {
            if (~super.field4043[var7].field8710 != 0) {
                class113 var11 = class620.field8760.method1832(arg4 ^ -570433258, super.field4043[var7].field8710);
                if (var11.field1650 && var11.field1628 != -1 && ~class168.field2552.method3287(84, var11.field1628).field1397 == -2) {
                    super.field4043[var7].field8710 = -1;
                }
            }
        }
        if (!arg5) {
            int var8 = -super.field4142[0] + arg1;
            int var9 = -super.field4136[0] + arg2;
            if (var8 >= -8 && var8 <= 8 && ~var9 <= 7 && ~var9 >= -9) {
                if (~super.field4141 > -10) {
                    ++super.field4141;
                }
                for (int var10 = super.field4141; var10 > 0; --var10) {
                    super.field4142[var10] = super.field4142[var10 + -1];
                    super.field4136[var10] = super.field4136[var10 + -1];
                    super.field4139[var10] = super.field4139[var10 - 1];
                }
                super.field4142[0] = arg1;
                super.field4136[0] = arg2;
                super.field4139[0] = 1;
                return;
            }
        }
        super.field4141 = 0;
        super.field4144 = 0;
        super.field4140 = 0;
        super.field4142[0] = arg1;
        super.field4136[0] = arg2;
        super.field10350 = (super.field4136[0] << 9) - -(arg3 << 8);
        super.field10347 = (super.field4142[0] << 9) + (arg3 << 8);
        if (arg4 != -570433240) {
            field6942 = null;
        }
        if (super.field4135 != null) {
            super.field4135.method1352();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lha;II)Z", line = 347)
    private final boolean method2963(class475 arg0, int arg1, int arg2) {
        ++field6943;
        int var4 = arg2;
        class31 var5 = this.method1783(true);
        class98 var6 = ~super.field4064 != 0 && ~super.field4124 == -1 ? class168.field2552.method3287(arg1 ^ 6722, super.field4064) : null;
        class98 var7 = ~super.field4040 == 0 || super.field4109 && var6 != null ? null : class168.field2552.method3287(arg1 + -6573, super.field4040);
        int var8 = var5.field356;
        int var9 = var5.field380;
        if (~var8 != -1 || var9 != 0 || var5.field373 != 0 || ~var5.field366 != -1) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field4046 != -1 && class594.field8494 >= super.field4092 && class594.field8494 < super.field4121;
        if (var10) {
            arg2 |= 524288;
        }
        int var11 = super.field4067.method1856(arg1 ^ arg1);
        class233 var12 = super.field4143[0] = this.field6964.method1305(super.field4048, super.field4122, 83, this.field6951, super.field4114, super.field4110, arg2, super.field4132, class150.field2404, super.field4077, super.field4080, super.field4125, var7, class168.field2552, arg0, var11, class578.field8328, var6);
        if (var12 == null) {
            return false;
        } else {
            super.field4044 = var12.method534();
            super.field4068 = var12.method544();
            this.method1792(-8835, var12);
            if (var8 == 0 && ~var9 == -1) {
                this.method1788((byte) 115, this.method209(true) << 9, 0, this.method209(true) << 9, 0, var11);
            } else {
                this.method1788((byte) 125, var9, var5.field360, var8, var5.field376, var11);
                if (~super.field4129 != -1) {
                    super.field4143[0].method550(super.field4129);
                }
                if (super.field4107 != 0) {
                    super.field4143[0].method543(super.field4107);
                }
                if (super.field4123 != 0) {
                    super.field4143[0].method568(0, super.field4123, 0);
                }
            }
            if (var10) {
                var12.method578(super.field4072, super.field4081, super.field4074, 255 & super.field4046);
            }
            this.method1787(var4, var11, (byte) 116, var9, arg0, var8, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)V", line = 408)
    public final void method2964(int arg0, boolean arg1, int arg2) {
        ++field6941;
        int var4 = super.field4142[0];
        int var5 = super.field4136[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var4;
            --var5;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (arg1) {
            if (~super.field4064 != 0 && class168.field2552.method3287(69, super.field4064).field1397 == 1) {
                super.field4064 = -1;
                super.field4088 = null;
            }
            if (~arg0 == -8) {
                --var4;
                ++var5;
            }
            for (int var6 = 0; ~var6 > ~super.field4043.length; ++var6) {
                if (~super.field4043[var6].field8710 != 0) {
                    class113 var8 = class620.field8760.method1832(16, super.field4043[var6].field8710);
                    if (var8.field1650 && ~var8.field1628 != 0 && class168.field2552.method3287(115, var8.field1628).field1397 == 1) {
                        super.field4043[var6].field8710 = -1;
                    }
                }
            }
            if (~super.field4141 > -10) {
                ++super.field4141;
            }
            for (int var7 = super.field4141; var7 > 0; --var7) {
                super.field4142[var7] = super.field4142[var7 + -1];
                super.field4136[var7] = super.field4136[var7 - 1];
                super.field4139[var7] = super.field4139[var7 + -1];
            }
            super.field4142[0] = var4;
            super.field4139[0] = (byte) arg2;
            super.field4136[0] = var5;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILha;Lnfa;ZI)V", line = 504)
    public final void method194(int arg0, int arg1, int arg2, class475 arg3, class745 arg4, boolean arg5, int arg6) {
        if (arg0 == -24659) {
            ++field6938;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILrf;)V", line = 515)
    public final void method2965(int arg0, class179 arg1) {
        this.field6964 = arg1;
        ++field6960;
        if (arg0 != 524288) {
            this.method2967(24);
        }
        if (this.field6964 != null) {
            this.field6953 = this.field6964.field2714;
            this.field6952 = this.field6964.field2705;
        }
        if (super.field4135 != null) {
            super.field4135.method1352();
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 539)
    public final int method1790(int arg0) {
        ++field6950;
        if (this.field6964.field2683 != null) {
            class179 var2 = this.field6964.method1304(class578.field8328, -25917);
            if (var2 != null && var2.field2747 != -1) {
                return var2.field2747;
            }
        }
        if (arg0 > -87) {
            return -18;
        } else {
            return ~this.field6964.field2747 != 0 ? this.field6964.field2747 : super.method1790(-109);
        }
    }

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "(I)I", line = 563)
    public final int method201(int arg0) {
        ++field6961;
        if (arg0 != -12286) {
            field6944 = null;
        }
        if (this.field6964.field2683 != null) {
            class179 var2 = this.field6964.method1304(class578.field8328, -25917);
            if (var2 != null && var2.field2688 != -1) {
                return var2.field2688;
            }
        }
        return this.field6964.field2688;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I", line = 584)
    public final int method200(byte arg0) {
        ++field6948;
        if (this.field6964.field2683 != null) {
            class179 var2 = this.field6964.method1304(class578.field8328, -25917);
            if (var2 != null && ~var2.field2694 != 0) {
                return var2.field2694;
            }
        }
        int var3 = -5 / ((-89 - arg0) / 37);
        return this.field6964.field2694;
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "(B)Z", line = 605)
    private final boolean method2966(byte arg0) {
        if (arg0 != -107) {
            this.method2964(-35, false, -22);
        }
        ++field6946;
        return this.field6964.field2720;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(ILha;)V", line = 616)
    public final void method192(int arg0, class475 arg1) {
        ++field6962;
        if (this.field6964 != null) {
            if (arg0 < 2) {
                this.method197(true);
            }
            if (super.field4145 || this.method2963(arg1, 6672, 0)) {
                class765 var3 = arg1.method457();
                var3.method1561(super.field4067.method1856(0));
                var3.method1558(super.field10347, super.field10358 + -20, super.field10350);
                this.method1786(0, super.field4145, var3, super.field4143, arg1);
                super.field4143[0] = super.field4143[1] = super.field4143[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "(I)Z", line = 648)
    public final boolean method2967(int arg0) {
        ++field6939;
        if (arg0 >= -86) {
            this.method2967(-117);
        }
        return this.field6964 != null;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V", line = 677)
    public final void method196(int arg0) {
        if (arg0 == -10382) {
            ++field6954;
            throw new IllegalStateException();
        }
    }
}
