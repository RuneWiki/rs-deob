import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class631 extends class43 implements class691 {

    @OriginalMember(owner = "client!ufa", name = "ib", descriptor = "Z")
    private boolean field9073;

    @OriginalMember(owner = "client!ufa", name = "N", descriptor = "Z")
    private boolean field9052;

    @OriginalMember(owner = "client!ufa", name = "R", descriptor = "B")
    private byte field9056;

    @OriginalMember(owner = "client!ufa", name = "Z", descriptor = "S")
    private short field9064;

    @OriginalMember(owner = "client!ufa", name = "T", descriptor = "Z")
    private boolean field9058;

    @OriginalMember(owner = "client!ufa", name = "kb", descriptor = "B")
    private byte field9075;

    @OriginalMember(owner = "client!ufa", name = "eb", descriptor = "Z")
    private boolean field9069;

    @OriginalMember(owner = "client!ufa", name = "Q", descriptor = "Lha;")
    private class54 field9055;

    @OriginalMember(owner = "client!ufa", name = "U", descriptor = "Lda;")
    public class55 field9059;

    @OriginalMember(owner = "client!ufa", name = "db", descriptor = "[Lwu;")
    public static class341[] field9068 = new class341[8];

    @OriginalMember(owner = "client!ufa", name = "sb", descriptor = "I")
    public static int field9083 = 0;

    @OriginalMember(owner = "client!ufa", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9063 = new Rectangle[100];

    @OriginalMember(owner = "client!ufa", name = "O", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!ufa", name = "P", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!ufa", name = "S", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!ufa", name = "V", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!ufa", name = "W", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!ufa", name = "X", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!ufa", name = "ab", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!ufa", name = "bb", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!ufa", name = "cb", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!ufa", name = "fb", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!ufa", name = "gb", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!ufa", name = "hb", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!ufa", name = "jb", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!ufa", name = "lb", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!ufa", name = "mb", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!ufa", name = "nb", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!ufa", name = "ob", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!ufa", name = "pb", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!ufa", name = "qb", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!ufa", name = "rb", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!ufa", name = "ub", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!ufa", name = "vb", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!ufa", name = "tb", descriptor = "Lsr;")
    private class229 field9084;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;Z)V")
    public final void method162(class165 arg0, boolean arg1) {
        ++field9085;
        if (arg1) {
            this.field9064 = -108;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IILr;)Lda;")
    private final class55 method3613(int arg0, int arg1, class165 arg2) {
        ++field9070;
        if (this.field9059 != null && ~arg2.method306(this.field9059.method118(), arg0) == -1) {
            return this.field9059;
        } else {
            int var4 = -20 % ((arg1 - -48) / 47);
            class528 var5 = this.method3616(false, arg0, arg2, (byte) -6);
            return var5 == null ? null : var5.field7718;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIIIIIIZ)V")
    public class631(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3025 == 1, class257.method1567((byte) -128, arg12, arg13));
        this.field9073 = arg14;
        this.field9052 = arg1.field3029 != 0 && !arg7;
        this.field9056 = (byte) arg12;
        this.field9064 = (short) arg1.field3056;
        this.field9058 = arg7;
        super.field535 = (byte) arg3;
        this.field9075 = (byte) arg13;
        this.field9069 = arg0.method215() && arg1.field3097 && !this.field9058 && ~class221.field2851.method1844(class375.field5039, true) != -1;
        int var16 = 2048;
        if (this.field9073) {
            var16 |= 65536;
        }
        class528 var17 = this.method3616(this.field9069, var16, arg0, (byte) -6);
        if (var17 != null) {
            this.field9055 = var17.field7717;
            this.field9059 = var17.field7718;
            if (this.field9073) {
                this.field9059 = this.field9059.method97((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        ++field9074;
        if (arg0 != 4378) {
            this.field9058 = true;
        }
        return 65535 & this.field9064;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLr;)V")
    public final void method1073(byte arg0, class165 arg1) {
        ++field9081;
        if (arg0 != 73) {
            this.method1072(85);
        }
        Object var3 = null;
        class54 var5;
        if (this.field9055 == null && this.field9069) {
            class528 var4 = this.method3616(true, 262144, arg1, (byte) -6);
            var5 = var4 != null ? var4.field7717 : null;
        } else {
            var5 = this.field9055;
            this.field9055 = null;
        }
        if (var5 != null) {
            class122.method855(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "(I)V")
    public static void method3614(int arg0) {
        field9068 = null;
        if (arg0 <= -93) {
            field9063 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 32249) {
            this.method3616(true, -28, (class165) null, (byte) -101);
        }
        ++field9057;
        return this.field9059 != null ? this.field9059.method65() : 0;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
    public final int method1067(byte arg0) {
        int var2 = -55 % ((-1 - arg0) / 37);
        ++field9053;
        return this.field9075;
    }

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = 85 / ((arg0 - 35) / 54);
        ++field9077;
        this.field9073 = false;
        if (this.field9059 != null) {
            this.field9059.method98(-65537 & this.field9059.method118());
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -20) {
            this.field9052 = false;
        }
        ++field9086;
        class55 var5 = this.method3613(131072, 31, arg0);
        if (var5 != null) {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return class547.field7943 ? var5.method124(arg1, arg2, var6, false, class676.field9693) : var5.method129(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)V")
    public final void method1071(int arg0) {
        ++field9076;
        if (this.field9059 != null) {
            this.field9059.method114();
        }
        if (arg0 != -31121) {
            field9082 = 82;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (!(arg5 instanceof class421)) {
            if (arg5 instanceof class631) {
                class631 var8 = (class631) arg5;
                if (this.field9059 != null && var8.field9059 != null) {
                    this.field9059.method59(var8.field9059, arg6, arg1, arg0, arg2);
                }
            }
        } else {
            class421 var9 = (class421) arg5;
            if (this.field9059 != null && var9.field5976 != null) {
                this.field9059.method59(var9.field5976, arg6, arg1, arg0, arg2);
            }
        }
        if (arg4 < 113) {
            this.method172((byte) -64);
        }
        ++field9080;
    }

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "(I)Z")
    public final boolean method175(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field9062;
            return true;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "(B)I")
    public final int method172(byte arg0) {
        if (arg0 != -117) {
            this.method167((byte) -73);
        }
        ++field9067;
        return this.field9059 == null ? 0 : this.field9059.method72();
    }

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "(B)I")
    public final int method3615(byte arg0) {
        ++field9060;
        if (arg0 <= 107) {
            return -51;
        } else {
            return this.field9059 != null ? this.field9059.method83() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZILr;B)Lfe;")
    private final class528 method3616(boolean arg0, int arg1, class165 arg2, byte arg3) {
        ++field9072;
        if (arg3 != -6) {
            return null;
        } else {
            class232 var5 = class37.field703.method807(0, 65535 & this.field9064);
            class37 var6;
            class37 var7;
            if (this.field9058) {
                var6 = class399.field5631[0];
                var7 = class340.field4500[super.field535];
            } else {
                if (~super.field535 > -4) {
                    var6 = class399.field5631[super.field535 + 1];
                } else {
                    var6 = null;
                }
                var7 = class399.field5631[super.field535];
            }
            return var5.method1417(false, super.field531, arg2, ~this.field9056 == -12 ? 10 : this.field9056, var6, arg1, arg0, super.field530, super.field527, this.field9056 != 11 ? this.field9075 : 4 - -this.field9075, var7);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;B)Llt;")
    public final class626 method170(class165 arg0, byte arg1) {
        ++field9066;
        if (this.field9059 == null) {
            return null;
        } else {
            class394 var3 = arg0.method315();
            if (arg1 != -2) {
                field9082 = 119;
            }
            var3.method712(super.field530, super.field527, super.field531);
            class626 var4 = null;
            if (this.field9052) {
                var4 = class547.method3208(1, -16660);
            }
            if (!class547.field7943) {
                this.field9059.method67(var3, var4 == null ? null : var4.field8985[0], 0);
            } else {
                this.field9059.method122(var3, var4 == null ? null : var4.field8985[0], class676.field9693, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Z")
    public final boolean method1069(int arg0) {
        ++field9079;
        if (arg0 != 17819) {
            field9083 = 88;
        }
        return this.field9069;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        if (arg0 != -24359) {
            field9063 = null;
        }
        ++field9054;
        return this.field9056;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILr;)V")
    public final void method1068(int arg0, class165 arg1) {
        if (arg0 >= -22) {
            this.method1072(85);
        }
        ++field9061;
        Object var3 = null;
        class54 var5;
        if (this.field9055 == null && this.field9069) {
            class528 var4 = this.method3616(true, 262144, arg1, (byte) -6);
            var5 = var4 != null ? var4.field7717 : null;
        } else {
            var5 = this.field9055;
            this.field9055 = null;
        }
        if (var5 != null) {
            class30.method389(var5, super.field535, super.field530, super.field531, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "(B)Z")
    public final boolean method165(byte arg0) {
        ++field9078;
        if (arg0 > -21) {
            this.field9052 = true;
        }
        return this.field9059 == null ? false : this.field9059.method112();
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(BLr;)Lsr;")
    public final class229 method161(byte arg0, class165 arg1) {
        if (arg0 < 100) {
            this.method175(8);
        }
        ++field9071;
        if (this.field9084 == null) {
            this.field9084 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, this.method3613(0, -102, arg1));
        }
        return this.field9084;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        ++field9065;
        return arg0 != 118 ? true : this.field9073;
    }

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field9063[var0] = new Rectangle();
        }
    }
}
