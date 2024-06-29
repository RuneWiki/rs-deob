import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class376 extends class423 implements class267 {

    @OriginalMember(owner = "client!up", name = "V", descriptor = "B")
    private byte field5783;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "Z")
    private boolean field5780;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "Z")
    private boolean field5758;

    @OriginalMember(owner = "client!up", name = "bb", descriptor = "Z")
    private boolean field5789;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "S")
    private short field5787;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "B")
    private byte field5761;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "B")
    private byte field5771;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "Z")
    private boolean field5784;

    @OriginalMember(owner = "client!up", name = "U", descriptor = "Le;")
    public class536 field5782;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "Li;")
    private class521 field5772;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "F")
    public static float field5767 = 0.0F;

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
    public static int field5786 = 0;

    @OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!up", name = "X", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!up", name = "cb", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!up", name = "db", descriptor = "Lla;")
    public static class299 field5791;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "[Lli;")
    public static class135[] field5778;

    @OriginalMember(owner = "client!up", name = "eb", descriptor = "[Lo;")
    public static class139[] field5792;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        if (arg0 > -95) {
            this.method100(true);
        }
        ++field5759;
        return this.field5784;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        ++field5765;
        Object var3 = null;
        class521 var5;
        if (this.field5772 == null && this.field5784) {
            class445 var4 = this.method2436(true, (byte) -67, 262144, arg1);
            var5 = var4 != null ? var4.field6913 : null;
        } else {
            var5 = this.field5772;
            this.field5772 = null;
        }
        if (arg0 != -6682) {
            field5791 = null;
        }
        if (var5 != null) {
            class174.method1090(var5, this.field5783, super.field6417, super.field6410, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            this.method97(70, (class497) null);
        }
        ++field5762;
        return this.field5758;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 < 53) {
            this.method2436(true, (byte) 32, -113, (class497) null);
        }
        ++field5777;
        return this.field5771;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(B)I")
    public final int method2432(byte arg0) {
        if (arg0 != -26) {
            field5786 = -120;
        }
        ++field5763;
        return this.field5782 == null ? 15 : this.field5782.method289() / 4;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lza;Loq;IIIIIZIIIIIIZ)V")
    public class376(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2114 == 1, class88.method604((byte) 103, arg12, arg13));
        this.field5783 = (byte) arg3;
        this.field5780 = arg1.field2079 != 0 && !arg7;
        this.field5758 = arg14;
        this.field5789 = arg7;
        this.field5787 = (short) arg1.field2082;
        this.field5761 = (byte) arg13;
        this.field5771 = (byte) arg12;
        this.field5784 = arg0.method1279() && arg1.field2122 && !this.field5789 && ~class141.field1911.method2603((byte) 122, class452.field7013) != -1;
        int var16 = 2048;
        if (this.field5758) {
            var16 |= 65536;
        }
        class445 var17 = this.method2436(this.field5784, (byte) -94, var16, arg0);
        if (var17 != null) {
            this.field5782 = var17.field6911;
            this.field5772 = var17.field6913;
            if (this.field5758) {
                this.field5782 = this.field5782.method329((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
    public static final void method2433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5764;
        class462.field7105 = arg0;
        class178.field2609 = arg4;
        if (arg3 != 0) {
            field5767 = -0.03608392F;
        }
        class222.field3750 = arg2;
        class460.field7096 = arg1;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 != -1) {
            this.method107(false, (class497) null, -28);
        }
        ++field5757;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (this.field5782 != null) {
            this.field5782.method303();
        }
        if (!arg0) {
            ++field5785;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        if (arg6 instanceof class153) {
            class153 var8 = (class153) arg6;
            if (this.field5782 != null && var8.field2027 != null) {
                this.field5782.method268(var8.field2027, arg5, arg0, arg2, arg3);
            }
        } else if (arg6 instanceof class376) {
            class376 var9 = (class376) arg6;
            if (this.field5782 != null && var9.field5782 != null) {
                this.field5782.method268(var9.field5782, arg5, arg0, arg2, arg3);
            }
        }
        ++field5773;
        int var10 = -90 % ((27 - arg4) / 32);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field5774;
        if (this.field5782 == null) {
            return null;
        } else {
            class205 var3 = arg1.method1231();
            var3.method158(super.field6417, super.field6412, super.field6410);
            class514 var4 = null;
            if (this.field5780) {
                var4 = class104.method706(arg0 ^ 2, 1);
            }
            if (arg0 != 2) {
                return null;
            } else {
                this.field5782.method295(var3, var4 == null ? null : var4.field7629[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        ++field5779;
        return arg0 ? null : this.method2437(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        ++field5775;
        Object var3 = null;
        class521 var5;
        if (this.field5772 == null && this.field5784) {
            class445 var4 = this.method2436(true, (byte) -19, 262144, arg0);
            var5 = var4 == null ? null : var4.field6913;
        } else {
            var5 = this.field5772;
            this.field5772 = null;
        }
        if (arg1 != 26768) {
            field5767 = 0.7068712F;
        }
        if (var5 != null) {
            class220.method1611(var5, this.field5783, super.field6417, super.field6410, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        if (arg0 != 18) {
            this.field5761 = -73;
        }
        ++field5769;
        return this.field5761;
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(B)V")
    public static void method2434(byte arg0) {
        field5791 = null;
        if (arg0 < 48) {
            method2434((byte) 103);
        }
        field5792 = null;
        field5778 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        if (arg0 < 87) {
            return -90;
        } else {
            ++field5790;
            return this.field5787 & 65535;
        }
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public static final void method2435(int arg0) {
        for (int var1 = arg0; ~class378.field5815 < ~var1; ++var1) {
            int var2 = class81.field1198[var1];
            class38 var3 = (class38) class365.field5659.method1122((byte) 59, (long) var2);
            if (var3 != null) {
                class378 var4 = var3.field378;
                class372.method2420(false, var4.field5809.field2809, var4);
            }
        }
        ++field5766;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBILza;)Loh;")
    private final class445 method2436(boolean arg0, byte arg1, int arg2, class497 arg3) {
        ++field5776;
        class156 var5 = class454.field7029.method3002(-1, 65535 & this.field5787);
        if (arg1 >= -14) {
            this.method97(-85, (class497) null);
        }
        class223 var6;
        class223 var7;
        if (this.field5789) {
            var6 = class244.field3956[0];
            var7 = class103.field1520[this.field5783];
        } else {
            if (~this.field5783 > -4) {
                var6 = class244.field3956[this.field5783 + 1];
            } else {
                var6 = null;
            }
            var7 = class244.field3956[this.field5783];
        }
        return var5.method958(arg0, super.field6412, super.field6410, arg2, var6, this.field5771 != 11 ? this.field5771 : 10, super.field6417, (byte) -126, var7, arg3, ~this.field5771 == -12 ? this.field5761 + 4 : this.field5761);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field5760;
        if (arg1 != 32689) {
            this.method2437((class497) null, 63, -56);
        }
        class536 var5 = this.method2437(arg3, 131072, arg1 + -32689);
        if (var5 != null) {
            class205 var6 = arg3.method1231();
            var6.method158(super.field6417, super.field6412, super.field6410);
            return var5.method298(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field5770;
        if (arg0 != 287) {
            this.field5758 = false;
        }
        this.field5758 = false;
        if (this.field5782 != null) {
            this.field5782.method290(this.field5782.method308() & -65537);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lza;II)Le;")
    private final class536 method2437(class497 arg0, int arg1, int arg2) {
        ++field5756;
        if (arg2 != 0) {
            this.method107(true, (class497) null, 43);
        }
        if (this.field5782 != null && arg0.method1299(this.field5782.method308(), arg1) == 0) {
            return this.field5782;
        } else {
            class445 var4 = this.method2436(false, (byte) -93, arg1, arg0);
            return var4 != null ? var4.field6911 : null;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)I")
    public final int method1596(boolean arg0) {
        ++field5768;
        if (!arg0) {
            return 107;
        } else {
            return this.field5782 != null ? this.field5782.method305() : 0;
        }
    }

    static {
        new class213("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field5788 = 1400;
    }
}
