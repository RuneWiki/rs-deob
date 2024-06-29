import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class332 extends class306 implements class143 {

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "Z")
    private boolean field4827;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "Z")
    private boolean field4815;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "B")
    private byte field4798;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "S")
    private short field4809;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "B")
    private byte field4806;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Z")
    private boolean field4816;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "B")
    private byte field4818;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "Z")
    private boolean field4823;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "Lo;")
    private class21 field4817;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "Lni;")
    public class305 field4813;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "Lub;")
    public static class15 field4822 = new class15(260);

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "Lpm;")
    public static class349 field4829 = new class349("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "[Lpk;")
    public static class109[] field4830 = new class109[128];

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "Lvj;")
    public static class256 field4831;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILlf;)Lva;")
    public static final class289 method2174(int arg0, class130 arg1) {
        if (arg0 != -12155) {
            return null;
        } else {
            ++field4800;
            return new class289(arg1.method844(698527688), arg1.method844(arg0 ^ -698515635), arg1.method844(698527688), arg1.method844(698527688), arg1.method839((byte) -92), arg1.method837(true));
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
    public final int method603(byte arg0) {
        if (arg0 != -62) {
            this.method608(true);
        }
        ++field4819;
        return this.field4818;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILvq;)V")
    public final void method605(int arg0, class269 arg1) {
        ++field4810;
        if (arg0 != 29929) {
            this.method602((byte) -37);
        }
        Object var3 = null;
        class21 var5;
        if (this.field4817 == null && this.field4823) {
            class266 var4 = this.method2178(131072, 65536, arg1, true);
            var5 = var4 != null ? var4.field3904 : null;
        } else {
            var5 = this.field4817;
            this.field4817 = null;
        }
        if (var5 != null) {
            class129.method793(var5, this.field4806, super.field4463, super.field4466, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILvq;)Lni;")
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 > -19) {
            this.field4798 = 71;
        }
        ++field4826;
        return this.method2177(arg2, arg1, (byte) -45);
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
    public static void method2175(byte arg0) {
        field4830 = null;
        field4831 = null;
        field4829 = null;
        if (arg0 != -120) {
            field4822 = null;
        }
        field4822 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvq;I)V")
    public final void method604(class269 arg0, int arg1) {
        ++field4824;
        int var3 = 59 / ((87 - arg1) / 34);
        Object var4 = null;
        class21 var6;
        if (this.field4817 == null && this.field4823) {
            class266 var5 = this.method2178(131072, 65536, arg0, true);
            var6 = var5 != null ? var5.field3904 : null;
        } else {
            var6 = this.field4817;
            this.field4817 = null;
        }
        if (var6 != null) {
            class428.method2669(var6, this.field4806, super.field4463, super.field4466, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
    public static int method2176(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 > -62) {
            field4822 = null;
        }
        ++field4825;
        if (this.field4813 != null) {
            this.field4813.method204();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field4802;
        int var5 = -105 / ((19 - arg3) / 45);
        class305 var6 = this.method2177(arg0, 65536, (byte) -45);
        if (var6 != null) {
            class154 var7 = arg0.method884();
            var7.method1133(super.field4463, super.field4457, super.field4466);
            return var6.method209(arg1, arg2, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvq;IB)Lni;")
    private final class305 method2177(class269 arg0, int arg1, byte arg2) {
        ++field4828;
        if (arg2 != -45) {
            this.method610(26);
        }
        if (this.field4813 != null && arg0.method944(this.field4813.method247(), arg1) == 0) {
            return this.field4813;
        } else {
            class266 var4 = this.method2178(arg1, 65536, arg0, false);
            return var4 != null ? var4.field3906 : null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg2 instanceof class103) {
            class103 var8 = (class103) arg2;
            if (this.field4813 != null && var8.field1313 != null) {
                this.field4813.method232(var8.field1313, arg4, arg6, arg3, arg1);
            }
        } else if (arg2 instanceof class332) {
            class332 var9 = (class332) arg2;
            if (this.field4813 != null && var9.field4813 != null) {
                this.field4813.method232(var9.field4813, arg4, arg6, arg3, arg1);
            }
        }
        int var10 = 88 / ((12 - arg5) / 40);
        ++field4803;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILvq;Z)Lsl;")
    private final class266 method2178(int arg0, int arg1, class269 arg2, boolean arg3) {
        ++field4821;
        class282 var5 = class398.method2496(-126, 65535 & this.field4809);
        class92 var6;
        class92 var7;
        if (!this.field4815) {
            if (this.field4806 >= 3) {
                var6 = null;
            } else {
                var6 = class126.field1734[this.field4806 + 1];
            }
            var7 = class126.field1734[this.field4806];
        } else {
            var7 = class241.field3567[this.field4806];
            var6 = class126.field1734[0];
        }
        if (arg1 != 65536) {
            this.field4818 = -80;
        }
        return var5.method1936(-14268, arg0, super.field4466, var7, this.field4798 != 11 ? this.field4818 : 4 - -this.field4818, ~this.field4798 == -12 ? 10 : this.field4798, super.field4463, arg2, arg3, var6, super.field4457);
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static final void method2179(int arg0) {
        int var1 = 66 / (arg0 / 60);
        class317.field4652.method102((byte) -105);
        ++field4801;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIZIIIIIIZ)V")
    public class332(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4109 == -2, class433.method2703(arg13, arg12, true));
        this.field4827 = ~arg1.field4036 != -1 && !arg7;
        this.field4815 = arg7;
        this.field4798 = (byte) arg12;
        this.field4809 = (short) arg1.field4094;
        this.field4806 = (byte) arg3;
        this.field4816 = arg14;
        this.field4818 = (byte) arg13;
        this.field4823 = arg0.method891() && arg1.field4107 && !this.field4815 && class194.field2802 != 0;
        int var16 = 1024;
        if (this.field4816) {
            var16 |= 32768;
        }
        class266 var17 = this.method2178(var16, 65536, arg0, this.field4823);
        if (var17 != null) {
            this.field4817 = var17.field3904;
            this.field4813 = var17.field3906;
            if (this.field4816) {
                this.field4813 = this.field4813.method200((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)I")
    public final int method2180(int arg0) {
        ++field4814;
        if (arg0 < 80) {
            this.field4815 = true;
        }
        return this.field4813 != null ? this.field4813.method239() / 4 : 15;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        if (arg0 < -56) {
            this.field4816 = false;
            ++field4799;
            if (this.field4813 != null) {
                this.field4813.method233(-32769 & this.field4813.method247());
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field4808;
        if (this.field4813 == null) {
            return null;
        } else {
            class154 var3 = arg1.method884();
            var3.method1133(super.field4463, super.field4457, super.field4466);
            int var4 = 32 % ((-8 - arg0) / 51);
            class316 var5 = null;
            if (this.field4827) {
                var5 = class105.method616(-15465, 1);
            }
            this.field4813.method230(var3, var5 == null ? null : var5.field4631[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)Z")
    public final boolean method608(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field4820;
            return this.field4823;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        ++field4807;
        if (arg0 != -439) {
            this.method614(108, 116, (class269) null);
        }
        return this.field4816;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    public static final void method2181(int arg0) {
        class344.method2262();
        if (arg0 == -2548) {
            ++field4812;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)I")
    public final int method602(byte arg0) {
        if (arg0 > -33) {
            method2175((byte) -22);
        }
        ++field4804;
        return this.field4798;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)I")
    public final int method775(int arg0) {
        ++field4805;
        if (arg0 != 3) {
            return 65;
        } else {
            return this.field4813 != null ? this.field4813.method221() : 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 <= 11) {
            this.method599(19);
        }
        ++field4797;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)I")
    public final int method599(int arg0) {
        ++field4811;
        return arg0 != -10450 ? 50 : 65535 & this.field4809;
    }
}
