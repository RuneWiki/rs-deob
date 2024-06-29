import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class347 extends class16 implements class143 {

    @OriginalMember(owner = "client!v", name = "R", descriptor = "Lwg;")
    public class245 field5072;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Z")
    private boolean field5064;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "[I")
    public static int[] field5058 = new int[32];

    @OriginalMember(owner = "client!v", name = "v", descriptor = "[I")
    public static int[] field5051 = new int[13];

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIZI)I")
    public static final int method2275(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field5061;
        class101 var4 = class438.method2729(arg2, arg3, arg0);
        if (var4 == null) {
            return 0;
        } else if (!arg0) {
            return -93;
        } else {
            return ~arg1 <= -1 && ~arg1 > ~var4.field1280.length ? var4.field1280[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILec;I)V")
    public static final void method2276(int arg0, class129 arg1, int arg2) {
        if (class226.field3375) {
            class226.field3375 = false;
            arg0 = 0;
        }
        if (arg2 != 0) {
            field5058 = null;
        }
        ++field5060;
        if (class105.field1351 == null || !class105.field1351.method790(10, arg1)) {
            class105.field1351 = arg1;
            class305.field4449 = class18.method107(arg2 ^ -16145);
            class392.field5511 = arg0;
            class447.field6389 = arg0;
            if (class447.field6389 != 0) {
                class230.field3407 = class352.field5115;
                class252.field3739 = class380.field5401;
                class127.field1767 = class319.field4674;
                class267.field3916 = class1.field6;
                class214.field3076 = class19.field257;
                class254.field3768 = class200.field2855;
                class197.field2824 = class147.field2202;
                class21.field270 = class167.field2379;
                class84.field1074 = class439.field6278;
                class423.field6038 = class69.field925;
                return;
            }
            class128.method780(false);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        ++field5071;
        if (arg0 >= -56) {
            this.field5072 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvq;I)V")
    public final void method604(class269 arg0, int arg1) {
        int var3 = -69 % ((arg1 - 87) / 34);
        ++field5073;
        this.field5072.method1708(arg0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 >= -62) {
            this.method610(-78);
        }
        ++field5065;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field5067;
        class305 var5 = this.field5072.method1714(super.field240, false, super.field241, arg0, 63, false, 65536);
        int var6 = -16 / ((arg3 - 19) / 45);
        if (var5 == null) {
            return false;
        } else {
            class154 var7 = arg0.method884();
            var7.method1133(super.field241, super.field244, super.field240);
            return var5.method209(arg1, arg2, var7, false);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lta;B)V")
    public static final void method2277(class117 arg0, byte arg1) {
        arg0.field1587 = null;
        if (arg1 != -90) {
            method2277((class117) null, (byte) 88);
        }
        ++field5070;
        if (~class311.field4572 > -21) {
            class32.field395.method1076(arg1 + 204, arg0);
            ++class311.field4572;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
    public final int method602(byte arg0) {
        ++field5062;
        if (arg0 > -33) {
            this.method602((byte) -60);
        }
        return this.field5072.field3653;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIIZI)V")
    public class347(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field4069, arg1.field4055);
        this.field5072 = new class245(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field5064 = ~arg1.field4036 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Z")
    public final boolean method608(boolean arg0) {
        if (arg0) {
            this.field5064 = true;
        }
        ++field5059;
        return this.field5072.method1706(80);
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static final void method2278(int arg0) {
        class26.method138(-13044);
        ++field5066;
        class390.field5490 = null;
        class148.field2215 = null;
        class267.field3916 = null;
        int var1 = -104 % ((arg0 - -54) / 57);
        class1.field6 = null;
        class216.field3118 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        int var3 = 56 / ((arg0 - -8) / 51);
        ++field5057;
        class305 var4 = this.field5072.method1714(super.field240, false, super.field241, arg1, 109, true, 1024);
        if (var4 == null) {
            return null;
        } else {
            class154 var5 = arg1.method884();
            var5.method1133(super.field241, super.field244, super.field240);
            class316 var6 = null;
            if (this.field5064) {
                var6 = class105.method616(-15465, 1);
            }
            if (this.field5072.field3652 != null) {
                class235 var7 = this.field5072.field3652.method2152();
                arg1.method1013(var4, var7, var5, var6 == null ? null : var6.field4631[0], 0);
            } else {
                var4.method230(var5, var6 != null ? var6.field4631[0] : null, 0);
            }
            this.field5072.method1705(true, super.field240 >> 7, super.field241 >> 7, super.field240 >> 7, arg1, super.field241 >> 7, var4, 7215);
            return var6;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
    public final int method599(int arg0) {
        if (arg0 != -10450) {
            field5058 = null;
        }
        ++field5053;
        return this.field5072.field3651;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILvq;)Lni;")
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        ++field5050;
        if (arg0 >= -19) {
            this.field5064 = false;
        }
        return this.field5072.method1714(0, false, 0, arg2, -69, false, arg1);
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public static void method2279(int arg0) {
        if (arg0 != -2133843993) {
            method2278(119);
        }
        field5051 = null;
        field5058 = null;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Lvl;")
    public static final class9 method2280(int arg0) {
        ++field5068;
        if (arg0 > -119) {
            method2276(121, (class129) null, -18);
        }
        try {
            return (class9) Class.forName("a").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        if (arg0 != -439) {
            field5058 = null;
        }
        ++field5054;
        return false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 58 / ((arg5 - 12) / 40);
        ++field5056;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILvq;)V")
    public final void method605(int arg0, class269 arg1) {
        ++field5063;
        this.field5072.method1703((byte) -38, arg1);
        if (arg0 != 29929) {
            method2280(64);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I")
    public final int method603(byte arg0) {
        if (arg0 != -62) {
            field5058 = null;
        }
        ++field5052;
        return this.field5072.field3640;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 < 11) {
            method2275(true, -22, false, 17);
        }
        ++field5055;
        class305 var3 = this.field5072.method1714(super.field240, true, super.field241, arg0, 108, true, 131072);
        if (var3 != null) {
            this.field5072.method1705(false, super.field240 >> 7, super.field241 >> 7, super.field240 >> 7, arg0, super.field241 >> 7, var3, 7215);
        }
    }
}
