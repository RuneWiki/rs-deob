import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class442 extends class672 implements class484 {

    @OriginalMember(owner = "client!ep", name = "Y", descriptor = "S")
    private short field6008;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "Z")
    private boolean field5999;

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "B")
    private byte field6003;

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "B")
    private byte field6001;

    @OriginalMember(owner = "client!ep", name = "qb", descriptor = "Z")
    private boolean field6026;

    @OriginalMember(owner = "client!ep", name = "fb", descriptor = "Z")
    private boolean field6015;

    @OriginalMember(owner = "client!ep", name = "cb", descriptor = "Z")
    private boolean field6012;

    @OriginalMember(owner = "client!ep", name = "db", descriptor = "Lka;")
    public class496 field6013;

    @OriginalMember(owner = "client!ep", name = "ib", descriptor = "Lr;")
    private class194 field6018;

    @OriginalMember(owner = "client!ep", name = "eb", descriptor = "Lfba;")
    public static class27 field6014 = new class27(57, 2);

    @OriginalMember(owner = "client!ep", name = "tb", descriptor = "I")
    public static int field6029 = 0;

    @OriginalMember(owner = "client!ep", name = "wb", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!ep", name = "ub", descriptor = "D")
    public static double field6030;

    @OriginalMember(owner = "client!ep", name = "yb", descriptor = "F")
    public static float field6034;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ep", name = "V", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ep", name = "W", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!ep", name = "X", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ep", name = "Z", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!ep", name = "ab", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!ep", name = "bb", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!ep", name = "gb", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ep", name = "hb", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ep", name = "jb", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ep", name = "kb", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ep", name = "lb", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ep", name = "mb", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ep", name = "nb", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!ep", name = "ob", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!ep", name = "pb", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!ep", name = "rb", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!ep", name = "sb", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!ep", name = "vb", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!ep", name = "xb", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!ep", name = "zb", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!ep", name = "U", descriptor = "Lrn;")
    private class281 field6004;

    @OriginalMember(owner = "client!ep", name = "Ab", descriptor = "Lrr;")
    public static class381 field6036;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field6020;
        class496 var5 = this.method2634((byte) -116, arg3, 131072);
        if (arg1 != -17458) {
            return true;
        } else if (var5 != null) {
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return !class576.field8120 ? var5.method95(arg0, arg2, var6, false, 0) : var5.method77(arg0, arg2, var6, false, 0, class740.field10205);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field6011;
        if (this.field6013 == null) {
            return null;
        } else {
            class326 var3 = arg0.method514();
            var3.method1869(super.field5742, super.field5741, super.field5746);
            class495 var4 = class86.method652(this.field6015, 0, 1);
            if (arg1 != -30514) {
                this.method1484(121);
            }
            if (!class576.field8120) {
                this.field6013.method88(var3, var4.field7067[0], 0);
            } else {
                this.field6013.method106(var3, var4.field7067[0], class740.field10205, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        ++field6021;
        return arg0 != 24853 ? -75 : 65535 & this.field6008;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        ++field6028;
        Object var3 = null;
        class194 var5;
        if (this.field6018 == null && this.field6012) {
            class547 var4 = this.method2636(-3975, arg1, 262144, true);
            var5 = var4 != null ? var4.field7863 : null;
        } else {
            var5 = this.field6018;
            this.field6018 = null;
        }
        if (var5 != null) {
            class46.method336(var5, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
        int var6 = -75 / ((arg0 - 4) / 39);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lqfa;I)V")
    public static final void method2632(class106 arg0, int arg1) {
        ++field6023;
        if (class330.field4578 == null) {
            class621 var2 = new class621();
            byte[] var3 = var2.method3583(16, 40, 128, 128);
            class330.field4578 = class211.method1448(var3, false, 1908068769);
        }
        if (class519.field7337 == null) {
            class150 var4 = new class150();
            byte[] var5 = var4.method1042(128, 16, 128, 10);
            class519.field7337 = class211.method1448(var5, false, arg1 ^ 1908068641);
        }
        class199 var6 = arg0.field1438;
        if (var6.method1372(arg1 ^ arg1) && class619.field8653 == null) {
            byte[] var7 = class95.method695(0.6F, 16.0F, 128, 4.0F, new class170(419684), true, 16, 128, 4.0F, 0.5F, 8);
            class619.field8653 = class211.method1448(var7, false, 1908068769);
        }
    }

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6014 = null;
        if (arg0 != 0) {
            field6036 = null;
        }
        field6036 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLha;I)Lka;")
    private final class496 method2634(byte arg0, class65 arg1, int arg2) {
        if (arg0 >= -62) {
            this.field6012 = false;
        }
        ++field6010;
        if (this.field6013 != null && arg1.method512(this.field6013.method68(), arg2) == 0) {
            return this.field6013;
        } else {
            class547 var4 = this.method2636(-3975, arg1, arg2, false);
            return var4 == null ? null : var4.field7866;
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            return 24;
        } else {
            ++field6022;
            return this.field6013 != null ? this.field6013.method75() : 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        ++field6025;
        if (arg0 > -107) {
            method2635(-62, 71, 31, -2, -7, 56);
        }
        if (this.field6013 != null) {
            this.field6013.method107();
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        ++field6027;
        int var2 = 31 / ((-7 - arg0) / 60);
        return this.field6012;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(Z)Z")
    public final boolean method910(boolean arg0) {
        if (!arg0) {
            field6032 = -18;
        }
        ++field6000;
        return this.field6026;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIIIIIIZ)V")
    public class442(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4091 == -2, class774.method4265(arg12, 1, arg13));
        super.field5749 = (byte) arg3;
        this.field6008 = (short) arg1.field4100;
        this.field5999 = arg7;
        this.field6003 = (byte) arg13;
        this.field6001 = (byte) arg12;
        this.field6026 = arg14;
        this.field6015 = ~arg1.field4149 != -1 && !arg7;
        this.field6012 = arg0.method483() && arg1.field4115 && !this.field5999 && ~class21.field353.field10062.method4001(-111) != -1;
        int var16 = 2048;
        if (this.field6026) {
            var16 |= 65536;
        }
        class547 var17 = this.method2636(-3975, arg0, var16, this.field6012);
        if (var17 != null) {
            this.field6013 = var17.field7866;
            this.field6018 = var17.field7863;
            if (this.field6026) {
                this.field6013 = this.field6013.method93((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        if (this.field6004 == null) {
            this.field6004 = class490.method2922((byte) 113, super.field5742, this.method2634((byte) -122, arg0, 0), super.field5746, super.field5741);
        }
        ++field6035;
        if (arg1 <= 50) {
            this.field6015 = true;
        }
        return this.field6004;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field5998;
        if (this.field6013 != null) {
            return !this.field6013.method72();
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V")
    public static final void method2635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class21.field353.field10061.method2896(-105) != -1 && arg3 != 0 && ~class565.field8020 > -51 && ~arg4 != 0) {
            class262.field3842[class565.field8020++] = new class481((byte) 1, arg4, arg3, arg2, arg0, 0, arg5, (class421) null);
        }
        ++field6016;
        if (arg1 > -56) {
            method2633(57);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLje;IIILha;I)V")
    public final void method905(boolean arg0, class421 arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6) {
        ++field6009;
        if (!(arg1 instanceof class658)) {
            if (arg1 instanceof class442) {
                class442 var8 = (class442) arg1;
                if (this.field6013 != null && var8.field6013 != null) {
                    this.field6013.method67(var8.field6013, arg4, arg6, arg3, arg0);
                }
            }
        } else {
            class658 var9 = (class658) arg1;
            if (this.field6013 != null && var9.field9181 != null) {
                this.field6013.method67(var9.field9181, arg4, arg6, arg3, arg0);
            }
        }
        if (arg2 != 0) {
            this.field6026 = false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        ++field6019;
        Object var3 = null;
        class194 var5;
        if (this.field6018 == null && this.field6012) {
            class547 var4 = this.method2636(-3975, arg1, 262144, true);
            var5 = var4 != null ? var4.field7863 : null;
        } else {
            var5 = this.field6018;
            this.field6018 = null;
        }
        if (var5 != null) {
            class759.method4223(var5, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
        int var6 = 33 % ((-19 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V")
    public final void method903(int arg0) {
        if (arg0 != -772) {
            method2635(-48, 79, -118, -86, -80, 50);
        }
        ++field6024;
        this.field6026 = false;
        if (this.field6013 != null) {
            this.field6013.method111(-65537 & this.field6013.method68());
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        ++field6033;
        return arg0 < 108 ? -59 : this.field6003;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        if (arg0 <= 52) {
            field6029 = -62;
        }
        ++field6031;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILha;IZ)Lbaa;")
    private final class547 method2636(int arg0, class65 arg1, int arg2, boolean arg3) {
        ++field6002;
        class282 var5 = class277.field4038.method3919(true, 65535 & this.field6008);
        if (arg0 != -3975) {
            this.method910(false);
        }
        class294 var6;
        class294 var7;
        if (!this.field5999) {
            if (super.field5749 < 3) {
                var6 = class411.field5572[super.field5749 + 1];
            } else {
                var6 = null;
            }
            var7 = class411.field5572[super.field5749];
        } else {
            var6 = class411.field5572[0];
            var7 = class774.field10642[super.field5749];
        }
        return var5.method1827((byte) 88, this.field6001 == 11 ? 10 : this.field6001, arg2, (class520) null, arg1, var6, var7, arg3, super.field5742, super.field5741, super.field5746, this.field6001 != 11 ? this.field6003 : this.field6003 + 4);
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "(B)I")
    public final int method2637(byte arg0) {
        ++field6007;
        if (arg0 != -79) {
            field6032 = 109;
        }
        return this.field6013 == null ? 15 : this.field6013.method100() / 4;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        ++field6005;
        int var2 = 95 / ((11 - arg0) / 35);
        return this.field6013 != null ? this.field6013.method121() : false;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
    public static final void method2638(int arg0, int arg1, int arg2) {
        boolean var3 = class767.field10562[0][arg1][arg2] != null && class767.field10562[0][arg1][arg2].field583 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class767.field10562[var4][arg1][arg2] == null) {
                class46 var5 = class767.field10562[var4][arg1][arg2] = new class46(var4);
                if (var3) {
                    ++var5.field585;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        if (!arg0) {
            this.method916(false);
        }
        ++field6017;
        return this.field6001;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        if (!arg0) {
            return 5;
        } else {
            ++field6006;
            return this.field6013 == null ? 0 : this.field6013.method118();
        }
    }
}
