import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class542 extends class94 implements class49 {

    @OriginalMember(owner = "client!fda", name = "nb", descriptor = "B")
    private byte field7631;

    @OriginalMember(owner = "client!fda", name = "fb", descriptor = "Z")
    private boolean field7623;

    @OriginalMember(owner = "client!fda", name = "kb", descriptor = "B")
    private byte field7628;

    @OriginalMember(owner = "client!fda", name = "Z", descriptor = "Z")
    private boolean field7617;

    @OriginalMember(owner = "client!fda", name = "V", descriptor = "S")
    private short field7614;

    @OriginalMember(owner = "client!fda", name = "L", descriptor = "Z")
    private boolean field7604;

    @OriginalMember(owner = "client!fda", name = "X", descriptor = "Lha;")
    private class120 field7615;

    @OriginalMember(owner = "client!fda", name = "T", descriptor = "Lda;")
    private class473 field7612;

    @OriginalMember(owner = "client!fda", name = "J", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!fda", name = "K", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!fda", name = "N", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!fda", name = "O", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!fda", name = "P", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!fda", name = "Q", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!fda", name = "R", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!fda", name = "S", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!fda", name = "U", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!fda", name = "Y", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!fda", name = "ab", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!fda", name = "bb", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!fda", name = "cb", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!fda", name = "db", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!fda", name = "eb", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!fda", name = "gb", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!fda", name = "hb", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!fda", name = "ib", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!fda", name = "jb", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!fda", name = "lb", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!fda", name = "mb", descriptor = "Llf;")
    private class676 field7630;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lsea;B)I")
    public static final int method3046(class319 arg0, byte arg1) {
        ++field7613;
        int var2 = 120 / ((arg1 - -31) / 63);
        if (class428.field6081 != arg0) {
            if (class250.field3133 != arg0) {
                if (class239.field2967 == arg0) {
                    return 34165;
                } else if (class644.field9099 == arg0) {
                    return 260;
                } else if (class36.field371 == arg0) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "(Lr;I)Llf;")
    public final class676 method185(class564 arg0, int arg1) {
        ++field7621;
        if (arg1 < 42) {
            return null;
        } else {
            if (this.field7630 == null) {
                this.field7630 = class191.method1166(0, super.field5176, this.method3048(arg0, 0, 0), super.field5178, super.field5179);
            }
            return this.field7630;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lr;I)V")
    public final void method232(class564 arg0, int arg1) {
        ++field7605;
        Object var3 = null;
        class120 var5;
        if (this.field7615 == null && this.field7604) {
            class65 var4 = this.method3049(arg0, 262144, true, -108);
            var5 = var4 != null ? var4.field664 : null;
        } else {
            var5 = this.field7615;
            this.field7615 = null;
        }
        if (arg1 == 6905) {
            if (var5 != null) {
                class249.method1467(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)I")
    public final int method238(int arg0) {
        if (arg0 != 6518) {
            return -20;
        } else {
            ++field7619;
            return this.field7614 & 65535;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lr;Z)V")
    public final void method172(class564 arg0, boolean arg1) {
        ++field7603;
        if (arg1) {
            this.field7604 = false;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
    public final boolean method236(byte arg0) {
        if (arg0 >= -33) {
            return false;
        } else {
            ++field7624;
            return this.field7604;
        }
    }

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field7608;
        if (arg0 >= -103) {
            method3050(74, 109, 75);
        }
        return this.field7612 == null ? false : this.field7612.method1913();
    }

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)I")
    public final int method175(byte arg0) {
        if (arg0 <= 119) {
            this.method241((byte) 37);
        }
        ++field7627;
        return this.field7612 != null ? this.field7612.method1868() : 0;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIIII)V")
    public class542(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field7631 = (byte) arg11;
        this.field7623 = ~arg1.field9035 != -1 && !arg7;
        super.field5176 = arg6;
        this.field7628 = (byte) arg10;
        super.field5179 = arg4;
        this.field7617 = arg7;
        this.field7614 = (short) arg1.field9021;
        this.field7604 = arg0.method972() && arg1.field9067 && !this.field7617 && ~class639.field9075.method2720((byte) -107, class430.field6109) != -1;
        class65 var13 = this.method3049(arg0, 2048, this.field7604, -104);
        if (var13 != null) {
            this.field7615 = var13.field664;
            this.field7612 = var13.field665;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)I")
    public final int method237(boolean arg0) {
        ++field7602;
        return arg0 ? -126 : this.field7631;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field7609;
        class473 var5 = this.method3048(arg0, 131072, arg2);
        if (var5 != null) {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3047(int arg0, String arg1) {
        if (arg0 != -1) {
            method3046((class319) null, (byte) -36);
        }
        ++field7620;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; ++var5) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "(I)Z")
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            this.method177(-51);
        }
        ++field7607;
        return true;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lr;II)Lda;")
    private final class473 method3048(class564 arg0, int arg1, int arg2) {
        ++field7616;
        if (arg2 != 0) {
            method3050(68, -6, -49);
        }
        if (this.field7612 != null && arg0.method973(this.field7612.method1861(), arg1) == 0) {
            return this.field7612;
        } else {
            class65 var4 = this.method3049(arg0, arg1, false, -109);
            return var4 != null ? var4.field665 : null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)I")
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            this.method177(126);
        }
        ++field7622;
        return this.field7628;
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(Lr;I)Lwj;")
    public final class315 method182(class564 arg0, int arg1) {
        ++field7606;
        if (this.field7612 == null) {
            return null;
        } else {
            class490 var3 = arg0.method950();
            var3.method23(super.field969 + super.field5179, super.field5178, super.field973 + super.field5176);
            if (arg1 != 0) {
                this.method182((class564) null, -62);
            }
            class315 var4 = null;
            if (this.field7623) {
                var4 = class419.method2349((byte) 126, 1);
            }
            if (!class460.field6553) {
                this.field7612.method1914(var3, var4 != null ? var4.field3912[0] : null, 0);
            } else {
                this.field7612.method1875(var3, var4 != null ? var4.field3912[0] : null, class682.field9623, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)I")
    public final int method179(int arg0) {
        ++field7611;
        if (arg0 != 3370) {
            this.field7604 = true;
        }
        return this.field7612 == null ? 0 : this.field7612.method1869();
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lr;IZI)Lhi;")
    private final class65 method3049(class564 arg0, int arg1, boolean arg2, int arg3) {
        ++field7629;
        class638 var5 = class364.field4891.method2134(this.field7614 & 65535, true);
        if (arg3 > -93) {
            this.field7615 = null;
        }
        class274 var6;
        class274 var7;
        if (!this.field7617) {
            var6 = class385.field5193[super.field5169];
            if (super.field5169 < 3) {
                var7 = class385.field5193[super.field5169 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class385.field5193[0];
            var6 = class666.field9303[super.field5169];
        }
        return var5.method3584(super.field5179, super.field5178, arg0, super.field5176, var6, arg1, this.field7628, (byte) -91, arg2, this.field7631, var7);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)Z")
    public static final boolean method3050(int arg0, int arg1, int arg2) {
        if (arg0 != 4541) {
            return false;
        } else {
            ++field7618;
            return (2048 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)I")
    public static final int method3051(int arg0, int arg1) {
        return class383.field5172 != null ? class383.field5172[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(II)V")
    public static final void method3052(int arg0, int arg1) {
        ++field7625;
        class76 var2 = class3.method28(arg1, (byte) 42, arg0);
        var2.method406(-975503968);
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lr;I)V")
    public final void method230(class564 arg0, int arg1) {
        ++field7626;
        Object var3 = null;
        if (arg1 != 21670) {
            this.field7615 = null;
        }
        class120 var5;
        if (this.field7615 == null && this.field7604) {
            class65 var4 = this.method3049(arg0, 262144, true, -124);
            var5 = var4 != null ? var4.field664 : null;
        } else {
            var5 = this.field7615;
            this.field7615 = null;
        }
        if (var5 != null) {
            class254.method1500(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (this.field7612 != null) {
            this.field7612.method1872();
        }
        if (arg0 <= -51) {
            ++field7610;
        }
    }
}
