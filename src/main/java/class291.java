import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class291 extends class672 implements class484 {

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "Z")
    private boolean field4266 = false;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "Lnia;")
    public class671 field4262;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Z")
    private boolean field4256;

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "Lfba;")
    public static class27 field4253 = new class27(60, 4);

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!gf", name = "jb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!gf", name = "kb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!gf", name = "lb", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!gf", name = "mb", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!gf", name = "nb", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!gf", name = "ob", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "Lrn;")
    private class281 field4250;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        ++field4264;
        if (arg0 < 108) {
            field4258 = -59;
        }
        return this.field4262.field9334;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public final void method903(int arg0) {
        ++field4271;
        if (arg0 != -772) {
            this.field4256 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        ++field4270;
        if (!arg0) {
            this.method1866(70, (class520) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "(I)V")
    public static final void method1864(int arg0) {
        ++field4259;
        if (arg0 == 293) {
            class699.field9728.method3743(arg0 + -285);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field4248;
        return !arg0 ? -127 : this.field4262.method3811((byte) 110);
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field4268;
        if (arg0) {
            field4253 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        int var2 = -115 % ((-7 - arg0) / 60);
        ++field4255;
        return this.field4262.method3820((byte) 107);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        ++field4261;
        if (arg0 > 52) {
            class496 var3 = this.field4262.method3815(-779, 262144, arg1, true, true);
            if (var3 != null) {
                class326 var4 = arg1.method514();
                var4.method1869(super.field5742, super.field5741, super.field5746);
                this.field4262.method3818(super.field9364, var3, super.field9360, super.field9368, super.field9371, 0, false, var4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILqe;Lbr;Lgj;Lha;III)V")
    public static final void method1865(int arg0, int arg1, class492 arg2, class413 arg3, class660 arg4, class65 arg5, int arg6, int arg7, int arg8) {
        ++field4273;
        int var9 = -(arg0 / 2) + arg1 + -5;
        int var10 = arg6 + 2;
        if (arg3.field5653 != 0) {
            arg5.method436(var9, arg0 + 10, arg3.field5653, var10, true, -var10 + arg6 - (-(arg4.method3767() * arg8) + -1));
        }
        if (arg3.field5645 != 0) {
            arg5.method540(arg4.method3767() * arg8 + -var10 + arg6 + 1, var9, 25951, arg3.field5645, var10, arg0 + 10);
        }
        int var11 = arg3.field5642;
        if (arg2.field6974 && ~arg3.field5611 != 0) {
            var11 = arg3.field5611;
        }
        for (int var12 = 0; arg8 > var12; ++var12) {
            String var13 = class132.field1988[var12];
            if (~(arg8 + -1) < ~var12) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg4.method3765(arg5, var13, arg1, arg6, var11, true);
            arg6 += arg4.method3767();
        }
        if (arg7 != -20007) {
            field4258 = -12;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        ++field4251;
        if (!arg0) {
            field4253 = null;
        }
        return this.field4262.field9341;
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        int var2 = -123 % ((arg0 - 11) / 35);
        ++field4269;
        return this.field4266;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field4263;
        class496 var3 = this.field4262.method3815(-779, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -30514) {
                this.method1866(-62, (class520) null);
            }
            class326 var4 = arg0.method514();
            var4.method1869(super.field5742, super.field5741, super.field5746);
            class495 var5 = class86.method652(this.field4256, arg1 + 30514, 1);
            this.field4262.method3818(super.field9364, var3, super.field9360, super.field9368, super.field9371, 0, true, var4, arg0);
            if (!class576.field8120) {
                var3.method88(var4, var5.field7067[0], 0);
            } else {
                var3.method106(var4, var5.field7067[0], class740.field10205, 0);
            }
            if (this.field4262.field9352 != null) {
                class296 var6 = this.field4262.field9352.method3450();
                if (!class576.field8120) {
                    arg0.method504(var6);
                } else {
                    arg0.method541(var6, class740.field10205);
                }
            }
            this.field4266 = var3.method121() || this.field4262.field9352 != null;
            if (this.field4250 == null) {
                this.field4250 = class490.method2922((byte) 116, super.field5742, var3, super.field5746, super.field5741);
            } else {
                class546.method3268(var3, super.field5742, this.field4250, 82, super.field5746, super.field5741);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILmi;)V")
    public final void method1866(int arg0, class520 arg1) {
        if (arg0 != 0) {
            this.method905(true, (class421) null, -55, 2, 33, (class65) null, 2);
        }
        ++field4260;
        this.field4262.method3819(arg1, -1);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        ++field4274;
        return arg0 != 24853 ? 88 : this.field4262.field9332;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        ++field4267;
        int var3 = 68 % ((arg0 - 4) / 39);
        this.field4262.method3810(arg1, (byte) -4);
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            this.method910(false);
        }
        ++field4272;
        return this.field4262.method3821(1);
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIIIIIII)V")
    public class291(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4091 == 1, class104.method734(arg12, 0, arg13));
        this.field4262 = new class671(arg0, arg1, arg12, arg13, super.field5755, arg3, this, arg7, arg14);
        this.field4256 = arg1.field4149 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        ++field4252;
        if (arg1 < 50) {
            this.field4266 = false;
        }
        return this.field4250;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        ++field4257;
        if (arg0 > -107) {
            method1865(-50, -53, (class492) null, (class413) null, (class660) null, (class65) null, 7, 106, -69);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field4249;
        class496 var5 = this.field4262.method3815(-779, 131072, arg3, false, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -17458) {
                this.method902(19, 123, 90, (class65) null);
            }
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return !class576.field8120 ? var5.method95(arg0, arg2, var6, false, 0) : var5.method77(arg0, arg2, var6, false, 0, class740.field10205);
        }
    }

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "(B)V")
    public static void method1867(byte arg0) {
        if (arg0 != -124) {
            field4253 = null;
        }
        field4253 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        this.field4262.method3817(arg1, false);
        ++field4254;
        int var3 = 72 % ((arg0 - -19) / 48);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        if (arg2 != 0) {
            this.method917(45);
        }
        ++field4265;
        throw new IllegalStateException();
    }
}
