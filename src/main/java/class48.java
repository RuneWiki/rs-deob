import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class48 extends class455 implements class113 {

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "B")
    private byte field735;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "Z")
    private boolean field746;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Z")
    private boolean field729;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "S")
    private short field737;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "B")
    private byte field749;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "B")
    private byte field748;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Z")
    private boolean field744;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Lva;")
    private class327 field728;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Lss;")
    private class283 field740;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Liu;")
    public static class390 field727 = new class390(78, 8);

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "B")
    public static byte field741;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIILeq;)Luq;", line = 3)
    private final class107 method358(boolean arg0, int arg1, int arg2, class134 arg3) {
        if (arg1 != -22818) {
            this.field748 = -69;
        }
        ++field750;
        class486 var5 = class114.field1471.method2132((byte) 124, this.field737 & 65535);
        class441 var6;
        class441 var7;
        if (!this.field746) {
            if (~this.field735 > -4) {
                var6 = class459.field6685[this.field735 + 1];
            } else {
                var6 = null;
            }
            var7 = class459.field6685[this.field735];
        } else {
            var7 = class178.field2562[this.field735];
            var6 = class459.field6685[0];
        }
        return var5.method2836(var6, var7, super.field6633, super.field6625, arg2, super.field6639, this.field748, arg0, this.field749, arg3, (byte) 63);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I", line = 34)
    public final int method359(int arg0) {
        ++field726;
        if (arg0 != 13228) {
            this.method370((byte) 93);
        }
        return this.field749;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Leq;Z)V", line = 45)
    public final void method360(class134 arg0, boolean arg1) {
        ++field732;
        if (!arg1) {
            this.method362((byte) 60);
        }
        Object var3 = null;
        class283 var5;
        if (this.field740 == null && this.field744) {
            class107 var4 = this.method358(true, -22818, 262144, arg0);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field740;
            this.field740 = null;
        }
        if (var5 != null) {
            class458.method2666(var5, this.field735, super.field6633, super.field6625, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Leq;I)V", line = 85)
    public final void method361(class134 arg0, int arg1) {
        ++field745;
        if (arg1 != -1) {
            this.method363((class134) null, 3, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I", line = 96)
    public final int method362(byte arg0) {
        if (arg0 != -72) {
            return 88;
        } else {
            ++field739;
            return this.field748;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Leq;IB)Lva;", line = 112)
    private final class327 method363(class134 arg0, int arg1, byte arg2) {
        ++field734;
        if (this.field728 != null && arg0.method819(this.field728.method200(), arg1) == 0) {
            return this.field728;
        } else if (arg2 != -121) {
            return null;
        } else {
            class107 var4 = this.method358(false, arg2 + -22697, arg1, arg0);
            return var4 == null ? null : var4.field1435;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Leq;Z)Lgl;", line = 132)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field742;
        if (this.field728 == null) {
            return null;
        } else {
            class33 var3 = arg0.method830();
            var3.method278(super.field6633 + super.field6627, super.field6639, super.field6635 + super.field6625);
            if (arg1) {
                this.method370((byte) 89);
            }
            class408 var4 = null;
            if (this.field729) {
                var4 = class118.method675(-123, 1);
            }
            this.field728.method191(var3, var4 == null ? null : var4.field5983[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILeq;BI)Z", line = 162)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        ++field747;
        int var5 = 124 % ((-23 - arg2) / 38);
        class327 var6 = this.method363(arg1, 131072, (byte) -121);
        if (var6 != null) {
            class33 var7 = arg1.method830();
            var7.method278(super.field6633, super.field6639, super.field6625);
            return var6.method184(arg0, arg3, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V", line = 182)
    public static void method366(byte arg0) {
        field727 = null;
        if (arg0 != 60) {
            method366((byte) 8);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILeq;Z)Lva;", line = 194)
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        ++field733;
        if (!arg2) {
            this.field749 = -24;
        }
        return this.method363(arg1, arg0, (byte) -121);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 205)
    public final void method368(int arg0) {
        ++field738;
        if (this.field728 != null) {
            this.field728.method167();
        }
        if (arg0 != 5894) {
            this.method360((class134) null, false);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I", line = 220)
    public final int method369(byte arg0) {
        if (arg0 < 24) {
            field727 = null;
        }
        ++field736;
        return 65535 & this.field737;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Leq;Lhn;IIIIZIIIII)V", line = 232)
    public class48(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class167.method1054((byte) -119, arg10, arg11));
        this.field735 = (byte) arg2;
        super.field6633 = arg3;
        this.field746 = arg6;
        this.field729 = arg1.field7041 != 0 && !arg6;
        super.field6625 = arg5;
        this.field737 = (short) arg1.field7046;
        this.field749 = (byte) arg11;
        this.field748 = (byte) arg10;
        this.field744 = arg0.method761() && arg1.field7091 && !this.field746 && ~class118.field1533.field6901 != -1;
        class107 var13 = this.method358(this.field744, -22818, 2048, arg0);
        if (var13 != null) {
            this.field728 = var13.field1435;
            this.field740 = var13.field1436;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I", line = 256)
    public final int method370(byte arg0) {
        ++field731;
        if (arg0 > -3) {
            this.field735 = 5;
        }
        return this.field728 != null ? this.field728.method195() : 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z", line = 268)
    public final boolean method371(boolean arg0) {
        if (arg0) {
            field741 = -15;
        }
        ++field730;
        return this.field744;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLeq;)V", line = 280)
    public final void method372(byte arg0, class134 arg1) {
        ++field743;
        Object var3 = null;
        class283 var5;
        if (this.field740 == null && this.field744) {
            class107 var4 = this.method358(true, -22818, 262144, arg1);
            var5 = var4 != null ? var4.field1436 : null;
        } else {
            var5 = this.field740;
            this.field740 = null;
        }
        if (var5 != null) {
            class484.method2821(var5, this.field735, super.field6633, super.field6625, (boolean[]) null);
        }
        if (arg0 > -49) {
            field741 = -90;
        }
    }
}
