import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class501 extends class197 implements class394 {

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Z")
    private boolean field7436 = false;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Lbba;")
    public class668 field7437;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Z")
    private boolean field7448;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Leh;")
    private class203 field7453;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "Z")
    public static boolean field7450;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(ILr;)V")
    public final void method625(int arg0, class98 arg1) {
        ++field7434;
        class397 var3 = this.field7437.method3758(true, 262144, arg1, true, true);
        if (arg0 <= 67) {
            this.field7448 = true;
        }
        if (var3 != null) {
            int var4 = super.field3155 >> 9;
            int var5 = super.field3154 >> 9;
            class152 var6 = arg1.method777();
            var6.method166(super.field3155, super.field3160, super.field3154);
            this.field7437.method3765(var5, false, arg1, -16, var4, var4, var6, var5, var3);
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lr;Lnf;IIIIIZIII)V")
    public class501(class98 arg0, class119 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class540.method3177(false, arg8, arg9));
        this.field7437 = new class668(arg0, arg1, arg8, arg9, super.field3158, arg3, this, arg7, arg10);
        this.field7448 = arg1.field1903 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "(I)I")
    public final int method626(int arg0) {
        ++field7456;
        if (arg0 != -32768) {
            this.method592(114);
        }
        return this.field7437.method3767(arg0 + 32890);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        if (arg0 > -102) {
            return -78;
        } else {
            ++field7451;
            return this.field7437.method3759((byte) 60);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        ++field7445;
        if (arg6 <= 22) {
            this.method590((class204) null, 26, false, (class98) null, 64, 88, (byte) 71);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lr;I)Lej;")
    public final class690 method627(class98 arg0, int arg1) {
        ++field7449;
        class397 var3 = this.field7437.method3758(true, 2048, arg0, true, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -7927) {
                this.method908(true);
            }
            class152 var4 = arg0.method777();
            var4.method166(super.field3155, super.field3160, super.field3154);
            class690 var5 = null;
            if (this.field7448) {
                var5 = class101.method849(-85, 1);
            }
            int var6 = super.field3155 >> 9;
            int var7 = super.field3154 >> 9;
            this.field7437.method3765(var7, true, arg0, 119, var6, var6, var4, var7, var3);
            if (class372.field5162) {
                var3.method448(var4, var5 != null ? var5.field9788[0] : null, class450.field6494, 0);
            } else {
                var3.method460(var4, var5 != null ? var5.field9788[0] : null, 0);
            }
            if (this.field7437.field9415 != null) {
                class272 var8 = this.field7437.field9415.method3581();
                if (!class372.field5162) {
                    arg0.method737(var8);
                } else {
                    arg0.method799(var8, class450.field6494);
                }
            }
            this.field7436 = var3.method449() || this.field7437.field9415 != null;
            if (this.field7453 != null) {
                class136.method1043(23175, var3, this.field7453, super.field3154, super.field3160, super.field3155);
            } else {
                this.field7453 = class420.method2486(super.field3155, super.field3160, super.field3154, var3, 22672);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(ILr;)Leh;")
    public final class203 method631(int arg0, class98 arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field7440;
            return this.field7453;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lr;B)V")
    public final void method911(class98 arg0, byte arg1) {
        if (arg1 != 31) {
            this.field7448 = false;
        }
        this.field7437.method3766(262144, arg0);
        ++field7446;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
    public final int method903(int arg0) {
        ++field7455;
        return arg0 <= 76 ? -114 : this.field7437.field9382;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
    public final int method904(int arg0) {
        ++field7454;
        if (arg0 != -15140) {
            this.method632(58, -112, (class98) null, (byte) 29);
        }
        return this.field7437.field9390;
    }

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        ++field7438;
        if (arg0 == 96) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        ++field7442;
        if (arg0 != -15258) {
            this.field7436 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I")
    public final int method907(boolean arg0) {
        ++field7444;
        return arg0 ? -87 : this.field7437.field9418;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public final void method902(int arg0) {
        ++field7441;
        if (arg0 != 27906) {
            this.method585(-65);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Z")
    public final boolean method908(boolean arg0) {
        ++field7443;
        if (arg0) {
            this.field7437 = null;
        }
        return this.field7437.method3761(-110);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        ++field7439;
        class397 var5 = this.field7437.method3758(true, 131072, arg2, false, false);
        int var6 = -125 % ((-75 - arg3) / 40);
        if (var5 == null) {
            return false;
        } else {
            class152 var7 = arg2.method777();
            var7.method166(super.field3155, super.field3160, super.field3154);
            return class372.field5162 ? var5.method482(arg0, arg1, var7, false, class450.field6494) : var5.method469(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)Z")
    public final boolean method630(int arg0) {
        ++field7447;
        int var2 = -68 % ((-59 - arg0) / 44);
        return this.field7436;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)Z")
    public final boolean method633(boolean arg0) {
        ++field7452;
        return !arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILr;)V")
    public final void method912(int arg0, class98 arg1) {
        ++field7435;
        this.field7437.method3762(arg1, (byte) -19);
        if (arg0 != 20280) {
            this.field7437 = null;
        }
    }
}
