import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class45 extends class570 implements class49 {

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "S")
    private short field447;

    @OriginalMember(owner = "client!jca", name = "E", descriptor = "Z")
    private boolean field440;

    @OriginalMember(owner = "client!jca", name = "X", descriptor = "Z")
    private boolean field459;

    @OriginalMember(owner = "client!jca", name = "Y", descriptor = "Z")
    private boolean field460;

    @OriginalMember(owner = "client!jca", name = "eb", descriptor = "B")
    private byte field466;

    @OriginalMember(owner = "client!jca", name = "S", descriptor = "Z")
    private boolean field454;

    @OriginalMember(owner = "client!jca", name = "O", descriptor = "Lha;")
    private class120 field450;

    @OriginalMember(owner = "client!jca", name = "gb", descriptor = "Lda;")
    private class473 field468;

    @OriginalMember(owner = "client!jca", name = "J", descriptor = "Lhb;")
    public static class347 field445 = new class347(0);

    @OriginalMember(owner = "client!jca", name = "db", descriptor = "Lib;")
    public static class14 field465 = new class14(9, 2);

    @OriginalMember(owner = "client!jca", name = "C", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!jca", name = "F", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!jca", name = "G", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!jca", name = "H", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!jca", name = "I", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!jca", name = "K", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!jca", name = "P", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!jca", name = "R", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!jca", name = "T", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!jca", name = "U", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!jca", name = "V", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!jca", name = "W", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!jca", name = "Z", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!jca", name = "ab", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!jca", name = "bb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!jca", name = "cb", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!jca", name = "fb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!jca", name = "hb", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!jca", name = "jb", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!jca", name = "ib", descriptor = "Llf;")
    private class676 field470;

    @OriginalMember(owner = "client!jca", name = "kb", descriptor = "[S")
    public static short[] field472;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)Z")
    public final boolean method180(int arg0) {
        ++field443;
        return arg0 == -1;
    }

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        ++field467;
        if (arg0 > -103) {
            this.field470 = null;
        }
        return this.field468 == null ? false : this.field468.method1913();
    }

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "(I)J")
    public static final long method229(int arg0) {
        if (arg0 != 5660) {
            method231(-116);
        }
        ++field451;
        return class386.field5208.method370(115);
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(Lr;I)V")
    public final void method230(class564 arg0, int arg1) {
        ++field455;
        Object var3 = null;
        class120 var5;
        if (this.field450 == null && this.field454) {
            class65 var4 = this.method240(arg0, 262144, arg1 + -19622, true);
            var5 = var4 == null ? null : var4.field664;
        } else {
            var5 = this.field450;
            this.field450 = null;
        }
        if (var5 != null) {
            class254.method1500(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
        if (arg1 != 21670) {
            this.method236((byte) -37);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lr;Z)V")
    public final void method172(class564 arg0, boolean arg1) {
        ++field439;
        if (arg1) {
            this.method240((class564) null, 82, 72, false);
        }
    }

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "(I)V")
    public static void method231(int arg0) {
        field472 = null;
        field465 = null;
        field445 = null;
        if (arg0 != 20658) {
            field445 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIILrb;Lr;Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        ++field444;
        if (arg2 != 2) {
            this.method179(121);
        }
        if (arg4 instanceof class45) {
            class45 var8 = (class45) arg4;
            if (this.field468 != null && var8.field468 != null) {
                this.field468.method1916(var8.field468, arg1, arg0, arg3, arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lr;I)V")
    public final void method232(class564 arg0, int arg1) {
        ++field453;
        Object var3 = null;
        class120 var5;
        if (this.field450 == null && this.field454) {
            class65 var4 = this.method240(arg0, 262144, 2048, true);
            var5 = var4 == null ? null : var4.field664;
        } else {
            var5 = this.field450;
            this.field450 = null;
        }
        if (var5 != null) {
            class249.method1467(var5, super.field5169, super.field5179, super.field5176, (boolean[]) null);
        }
        if (arg1 != 6905) {
            field445 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field456;
        class473 var5 = this.method233(arg2, arg0, 131072);
        if (var5 != null) {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(Lr;I)Lwj;")
    public final class315 method182(class564 arg0, int arg1) {
        ++field452;
        if (this.field468 == null) {
            return null;
        } else {
            class490 var3 = arg0.method950();
            var3.method23(super.field5179, super.field5178, super.field5176);
            class315 var4 = null;
            if (this.field460) {
                var4 = class419.method2349((byte) 122, 1);
            }
            if (arg1 != 0) {
                this.method236((byte) 27);
            }
            if (!class460.field6553) {
                this.field468.method1914(var3, var4 != null ? var4.field3912[0] : null, 0);
            } else {
                this.field468.method1875(var3, var4 == null ? null : var4.field3912[0], class682.field9623, 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILr;I)Lda;")
    private final class473 method233(int arg0, class564 arg1, int arg2) {
        ++field464;
        if (this.field468 != null && arg1.method973(this.field468.method1861(), arg2) == 0) {
            return this.field468;
        } else {
            if (arg0 != 0) {
                this.field447 = -1;
            }
            class65 var4 = this.method240(arg1, arg2, 2048, false);
            return var4 != null ? var4.field665 : null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public final void method234(int arg0) {
        if (arg0 >= -51) {
            this.field466 = -28;
        }
        ++field462;
        if (this.field468 != null) {
            this.field468.method1872();
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)Z")
    public final boolean method183(byte arg0) {
        int var2 = 96 / ((12 - arg0) / 62);
        ++field438;
        return this.field459;
    }

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "(I)V")
    public static final void method235(int arg0) {
        ++field463;
        class403.field5401.method88(61);
        if (arg0 > -27) {
            field472 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)Z")
    public final boolean method236(byte arg0) {
        ++field457;
        if (arg0 >= -33) {
            this.field450 = null;
        }
        return this.field454;
    }

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "(I)I")
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            return 53;
        } else {
            ++field469;
            return this.field468 == null ? 0 : this.field468.method1869();
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)I")
    public final int method237(boolean arg0) {
        if (arg0) {
            return -3;
        } else {
            ++field471;
            return this.field466;
        }
    }

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "(B)I")
    public final int method175(byte arg0) {
        if (arg0 <= 119) {
            this.method230((class564) null, 120);
        }
        ++field441;
        return this.field468 == null ? 0 : this.field468.method1868();
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I")
    public final int method238(int arg0) {
        ++field446;
        return arg0 != 6518 ? -3 : 65535 & this.field447;
    }

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "(I)V")
    public final void method170(int arg0) {
        this.field459 = false;
        if (arg0 >= 20) {
            ++field458;
            if (this.field468 != null) {
                this.field468.method1907(-65537 & this.field468.method1861());
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIZ)V")
    public class45(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9036);
        this.field447 = (short) arg1.field9021;
        this.field440 = arg7;
        super.field5176 = arg6;
        this.field459 = arg9;
        this.field460 = arg1.field9035 != 0 && !arg7;
        this.field466 = (byte) arg8;
        super.field5179 = arg4;
        this.field454 = arg0.method972() && arg1.field9067 && !this.field440 && class639.field9075.method2720((byte) -119, class430.field6109) != 0;
        int var11 = 2048;
        if (this.field459) {
            var11 |= 65536;
        }
        class65 var12 = this.method240(arg0, var11, 2048, this.field454);
        if (var12 != null) {
            this.field450 = var12.field664;
            this.field468 = var12.field665;
            if (this.field459) {
                this.field468 = this.field468.method1877((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        class188.field2148 = false;
        ++field448;
        class556.method3151(class598.field8426, class376.field5112, class200.field2357, arg0 ^ -68, class361.field4841);
        if (arg0 != -68) {
            method235(57);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lr;IIZ)Lhi;")
    private final class65 method240(class564 arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 2048) {
            this.field470 = null;
        }
        ++field442;
        class638 var5 = class364.field4891.method2134(this.field447 & 65535, true);
        class274 var6;
        class274 var7;
        if (this.field440) {
            var6 = class385.field5193[0];
            var7 = class666.field9303[super.field5169];
        } else {
            if (super.field5169 >= 3) {
                var6 = null;
            } else {
                var6 = class385.field5193[super.field5169 + 1];
            }
            var7 = class385.field5193[super.field5169];
        }
        return var5.method3584(super.field5179, super.field5178, arg0, super.field5176, var7, arg1, 22, (byte) -91, arg3, this.field466, var6);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)I")
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            this.method234(-60);
        }
        ++field449;
        return 22;
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(Lr;I)Llf;")
    public final class676 method185(class564 arg0, int arg1) {
        if (this.field470 == null) {
            this.field470 = class191.method1166(0, super.field5176, this.method233(0, arg0, 0), super.field5178, super.field5179);
        }
        if (arg1 <= 42) {
            this.field447 = -20;
        }
        ++field461;
        return this.field470;
    }
}
