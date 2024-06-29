import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class687 extends class524 implements class691 {

    @OriginalMember(owner = "client!kn", name = "kb", descriptor = "S")
    private short field9812;

    @OriginalMember(owner = "client!kn", name = "X", descriptor = "Z")
    private boolean field9799;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "B")
    private byte field9790;

    @OriginalMember(owner = "client!kn", name = "bb", descriptor = "Z")
    private boolean field9803;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "Z")
    private boolean field9796;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "Z")
    private boolean field9794;

    @OriginalMember(owner = "client!kn", name = "pb", descriptor = "Lha;")
    private class54 field9817;

    @OriginalMember(owner = "client!kn", name = "jb", descriptor = "Lda;")
    private class55 field9811;

    @OriginalMember(owner = "client!kn", name = "eb", descriptor = "Lwaa;")
    public static class652 field9806 = new class652(8);

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!kn", name = "V", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!kn", name = "W", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!kn", name = "ab", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!kn", name = "cb", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!kn", name = "db", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!kn", name = "fb", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!kn", name = "gb", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!kn", name = "hb", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!kn", name = "ib", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!kn", name = "lb", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!kn", name = "mb", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!kn", name = "nb", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!kn", name = "ob", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!kn", name = "qb", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!kn", name = "rb", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "Lsr;")
    private class229 field9792;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "(I)V")
    public static void method3886(int arg0) {
        if (arg0 > -95) {
            field9806 = null;
        }
        field9806 = null;
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(B)Z")
    public final boolean method165(byte arg0) {
        ++field9809;
        if (arg0 >= -21) {
            this.method166((class165) null, 23, 82, -77);
        }
        return this.field9811 == null ? false : this.field9811.method112();
    }

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)Z")
    public final boolean method175(int arg0) {
        if (arg0 != 0) {
            this.field9803 = false;
        }
        ++field9797;
        return true;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        ++field9814;
        if (arg0 != 118) {
            this.method167((byte) -59);
        }
        return this.field9803;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method166(class165 arg0, int arg1, int arg2, int arg3) {
        ++field9804;
        if (arg3 > -20) {
            this.field9792 = null;
        }
        class55 var5 = this.method3890((byte) -77, arg0, 131072);
        if (var5 != null) {
            class394 var6 = arg0.method315();
            var6.method712(super.field530, super.field527, super.field531);
            return !class547.field7943 ? var5.method129(arg1, arg2, var6, false) : var5.method124(arg1, arg2, var6, false, class676.field9693);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)I")
    public final int method1067(byte arg0) {
        ++field9801;
        int var2 = 18 / ((-1 - arg0) / 37);
        return this.field9790;
    }

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        int var2 = 30 / ((arg0 - 35) / 54);
        this.field9803 = false;
        ++field9798;
        if (this.field9811 != null) {
            this.field9811.method98(this.field9811.method118() & -65537);
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        ++field9791;
        if (arg0 != 4378) {
            method3886(80);
        }
        return 65535 & this.field9812;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z")
    public final boolean method1069(int arg0) {
        ++field9816;
        if (arg0 != 17819) {
            this.method169(-57, 29, true, (class165) null, 26, (class20) null, 89);
        }
        return this.field9794;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLr;)V")
    public final void method1073(byte arg0, class165 arg1) {
        if (arg0 == 73) {
            ++field9807;
            Object var3 = null;
            class54 var5;
            if (this.field9817 == null && this.field9794) {
                class528 var4 = this.method3889(262144, arg0 ^ 33, arg1, true);
                var5 = var4 == null ? null : var4.field7717;
            } else {
                var5 = this.field9817;
                this.field9817 = null;
            }
            if (var5 != null) {
                class122.method855(var5, super.field535, super.field530, super.field531, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method3887(String arg0, byte arg1, int arg2) {
        ++field9793;
        class233 var3 = class7.method44(arg2, 2, -1);
        var3.method1422(0);
        var3.field3119 = arg0;
        if (arg1 < 117) {
            method3886(-103);
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
    public final void method1071(int arg0) {
        ++field9802;
        if (this.field9811 != null) {
            this.field9811.method114();
        }
        if (arg0 != -31121) {
            this.field9803 = true;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lr;Lfga;IIIIIZIZ)V")
    public class687(class165 arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field3042);
        this.field9812 = (short) arg1.field3056;
        this.field9799 = arg1.field3029 != 0 && !arg7;
        this.field9790 = (byte) arg8;
        super.field530 = arg4;
        this.field9803 = arg9;
        this.field9796 = arg7;
        super.field531 = arg6;
        this.field9794 = arg0.method215() && arg1.field3097 && !this.field9796 && class221.field2851.method1844(class375.field5039, true) != 0;
        int var11 = 2048;
        if (this.field9803) {
            var11 |= 65536;
        }
        class528 var12 = this.method3889(var11, 95, arg0, this.field9794);
        if (var12 != null) {
            this.field9817 = var12.field7717;
            this.field9811 = var12.field7718;
            if (this.field9803) {
                this.field9811 = this.field9811.method97((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I")
    public final int method1070(int arg0) {
        ++field9795;
        if (arg0 != -24359) {
            this.method165((byte) 57);
        }
        return 22;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 < 113) {
            this.field9817 = null;
        }
        ++field9815;
        if (arg5 instanceof class687) {
            class687 var8 = (class687) arg5;
            if (this.field9811 != null && var8.field9811 != null) {
                this.field9811.method59(var8.field9811, arg6, arg1, arg0, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)I")
    public final int method173(int arg0) {
        ++field9810;
        if (arg0 != 32249) {
            return 77;
        } else {
            return this.field9811 != null ? this.field9811.method65() : 0;
        }
    }

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "(I)V")
    public static final void method3888(int arg0) {
        if (arg0 != 1003) {
            method3888(-1);
        }
        class516.field7555 = new class17[class568.field8304.method3779(arg0 + -998)][];
        ++field9813;
        class362.field4821 = new class17[class568.field8304.method3779(5)][];
        class299.field4032 = new boolean[class568.field8304.method3779(arg0 ^ 1006)];
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILr;Z)Lfe;")
    private final class528 method3889(int arg0, int arg1, class165 arg2, boolean arg3) {
        ++field9800;
        class232 var5 = class37.field703.method807(0, 65535 & this.field9812);
        class37 var6;
        class37 var7;
        if (this.field9796) {
            var6 = class340.field4500[super.field535];
            var7 = class399.field5631[0];
        } else {
            var6 = class399.field5631[super.field535];
            if (super.field535 >= 3) {
                var7 = null;
            } else {
                var7 = class399.field5631[super.field535 + 1];
            }
        }
        if (arg1 <= 67) {
            this.method1067((byte) -63);
        }
        return var5.method1417(false, super.field531, arg2, 22, var7, arg0, arg3, super.field530, super.field527, this.field9790, var6);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(BLr;)Lsr;")
    public final class229 method161(byte arg0, class165 arg1) {
        if (this.field9792 == null) {
            this.field9792 = class430.method2587((byte) 77, super.field527, super.field531, super.field530, this.method3890((byte) 111, arg1, 0));
        }
        ++field9808;
        if (arg0 < 100) {
            this.method163(-114);
        }
        return this.field9792;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lr;Z)V")
    public final void method162(class165 arg0, boolean arg1) {
        ++field9789;
        if (arg1) {
            this.method1067((byte) 11);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILr;)V")
    public final void method1068(int arg0, class165 arg1) {
        ++field9819;
        Object var3 = null;
        class54 var5;
        if (this.field9817 == null && this.field9794) {
            class528 var4 = this.method3889(262144, 72, arg1, true);
            var5 = var4 == null ? null : var4.field7717;
        } else {
            var5 = this.field9817;
            this.field9817 = null;
        }
        if (arg0 < -22) {
            if (var5 != null) {
                class30.method389(var5, super.field535, super.field530, super.field531, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(B)I")
    public final int method172(byte arg0) {
        if (arg0 != -117) {
            this.method1067((byte) -42);
        }
        ++field9805;
        return this.field9811 != null ? this.field9811.method72() : 0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLr;I)Lda;")
    private final class55 method3890(byte arg0, class165 arg1, int arg2) {
        ++field9818;
        if (this.field9811 != null && arg1.method306(this.field9811.method118(), arg2) == 0) {
            return this.field9811;
        } else {
            class528 var4 = this.method3889(arg2, 112, arg1, false);
            int var5 = 28 / ((arg0 - -19) / 32);
            return var4 != null ? var4.field7718 : null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lr;B)Llt;")
    public final class626 method170(class165 arg0, byte arg1) {
        ++field9788;
        if (this.field9811 == null) {
            return null;
        } else {
            if (arg1 != -2) {
                this.method172((byte) -10);
            }
            class394 var3 = arg0.method315();
            var3.method712(super.field530, super.field527, super.field531);
            class626 var4 = null;
            if (this.field9799) {
                var4 = class547.method3208(1, arg1 ^ 16658);
            }
            if (!class547.field7943) {
                this.field9811.method67(var3, var4 == null ? null : var4.field8985[0], 0);
            } else {
                this.field9811.method122(var3, var4 != null ? var4.field8985[0] : null, class676.field9693, 0);
            }
            return var4;
        }
    }
}
