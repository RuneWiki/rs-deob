import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class255 extends class441 implements class143 {

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "B")
    private byte field3796;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "B")
    private byte field3771;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "B")
    private byte field3789;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "Z")
    private boolean field3799;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "S")
    private short field3782;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "Z")
    private boolean field3793;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "Z")
    private boolean field3798;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Lni;")
    private class305 field3788;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Lo;")
    private class21 field3780;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field3777 = 0;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3774 = 0;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "Z")
    public static boolean field3795 = false;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "Ltj;")
    public static class108 field3784;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "[S")
    public static short[] field3779;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lvq;I)V")
    public final void method604(class269 arg0, int arg1) {
        ++field3794;
        int var3 = -18 % ((arg1 - 87) / 34);
        Object var4 = null;
        class21 var6;
        if (this.field3780 == null && this.field3798) {
            class266 var5 = this.method1769(true, -4, arg0, 131072);
            var6 = var5 != null ? var5.field3904 : null;
        } else {
            var6 = this.field3780;
            this.field3780 = null;
        }
        if (var6 != null) {
            class428.method2669(var6, this.field3771, super.field6309, super.field6303, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)I")
    public final int method1766(byte arg0) {
        ++field3783;
        if (arg0 != 50) {
            return -33;
        } else {
            return this.field3788 != null ? this.field3788.method221() : 0;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field3776;
        int var5 = 122 / ((arg3 - 19) / 45);
        class305 var6 = this.method1767(arg0, (byte) 115, 65536);
        if (var6 != null) {
            class154 var7 = arg0.method884();
            var7.method1133(super.field6309, super.field6308, super.field6303);
            return var6.method209(arg1, arg2, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lvq;BI)Lni;")
    private final class305 method1767(class269 arg0, byte arg1, int arg2) {
        ++field3770;
        if (this.field3788 != null && arg0.method944(this.field3788.method247(), arg2) == 0) {
            return this.field3788;
        } else {
            if (arg1 <= 94) {
                this.method1766((byte) -47);
            }
            class266 var4 = this.method1769(false, -4, arg0, arg2);
            return var4 != null ? var4.field3906 : null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILvq;)V")
    public final void method605(int arg0, class269 arg1) {
        ++field3773;
        Object var3 = null;
        class21 var5;
        if (this.field3780 == null && this.field3798) {
            class266 var4 = this.method1769(true, -4, arg1, 131072);
            var5 = var4 != null ? var4.field3904 : null;
        } else {
            var5 = this.field3780;
            this.field3780 = null;
        }
        if (var5 != null) {
            class129.method793(var5, this.field3771, super.field6309, super.field6303, (boolean[]) null);
        }
        if (arg0 != 29929) {
            this.method1769(true, -21, (class269) null, 13);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
    public final boolean method608(boolean arg0) {
        if (arg0) {
            this.method600(-108);
        }
        ++field3790;
        return this.field3798;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILvq;)Lni;")
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 >= -19) {
            this.method22((class269) null, (byte) -70);
        }
        ++field3797;
        return this.method1767(arg2, (byte) 101, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 >= 11) {
            ++field3785;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field3786;
        if (this.field3788 == null) {
            return null;
        } else {
            class154 var3 = arg1.method884();
            int var4 = -122 % ((-8 - arg0) / 51);
            var3.method1133(super.field6309 + super.field6304, super.field6308, super.field6305 + super.field6303);
            class316 var5 = null;
            if (this.field3799) {
                var5 = class105.method616(-15465, 1);
            }
            this.field3788.method230(var3, var5 == null ? null : var5.field4631[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lvq;Lbi;IIIIZIIIII)V")
    public class255(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class106.method625(-128, arg11, arg10));
        super.field6309 = (short) arg3;
        this.field3796 = (byte) arg11;
        this.field3771 = (byte) arg2;
        this.field3789 = (byte) arg10;
        this.field3799 = ~arg1.field4036 != -1 && !arg6;
        super.field6303 = (short) arg5;
        this.field3782 = (short) arg1.field4094;
        this.field3793 = arg6;
        this.field3798 = arg0.method891() && arg1.field4107 && !this.field3793 && ~class194.field2802 != -1;
        class266 var13 = this.method1769(this.field3798, -4, arg0, 1024);
        if (var13 != null) {
            this.field3788 = var13.field3906;
            this.field3780 = var13.field3904;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I")
    public final int method602(byte arg0) {
        if (arg0 > -33) {
            return -35;
        } else {
            ++field3778;
            return this.field3789;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 >= -62) {
            this.field3793 = true;
        }
        if (this.field3788 != null) {
            this.field3788.method204();
        }
        ++field3792;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
    public final int method599(int arg0) {
        ++field3791;
        if (arg0 != -10450) {
            this.method599(12);
        }
        return this.field3782 & 65535;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
    public final int method603(byte arg0) {
        ++field3781;
        return arg0 != -62 ? -82 : this.field3796;
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public static void method1768(int arg0) {
        if (arg0 <= 16) {
            method1768(68);
        }
        field3784 = null;
        field3779 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZILvq;I)Lsl;")
    private final class266 method1769(boolean arg0, int arg1, class269 arg2, int arg3) {
        ++field3775;
        if (arg1 != -4) {
            field3772 = -38;
        }
        class282 var5 = class398.method2496(-120, 65535 & this.field3782);
        class92 var6;
        class92 var7;
        if (this.field3793) {
            var6 = class241.field3567[this.field3771];
            var7 = class126.field1734[0];
        } else {
            if (~this.field3771 > -4) {
                var7 = class126.field1734[this.field3771 + 1];
            } else {
                var7 = null;
            }
            var6 = class126.field1734[this.field3771];
        }
        return var5.method1936(arg1 ^ 14264, arg3, super.field6303, var6, this.field3796, this.field3789, super.field6309, arg2, arg0, var7, super.field6308);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)V")
    public static final void method1770(byte arg0) {
        if (arg0 != 6) {
            field3772 = -77;
        }
        class409.field5867 = null;
        class376.field5351 = null;
        ++field3787;
        class413.field5909 = null;
        class324.field4716 = null;
        class341.field4937 = null;
        class103.field1302 = null;
        class13.field187 = null;
        class310.field4499 = null;
    }

    static {
        new class349("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
    }
}
