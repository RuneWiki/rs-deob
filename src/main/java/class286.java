import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class286 extends class249 implements class246 {

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "Z")
    private boolean field3726;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "Z")
    private boolean field3730;

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "Z")
    private boolean field3749;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "B")
    private byte field3734;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "B")
    private byte field3727;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "S")
    private short field3743;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "Z")
    private boolean field3722;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "Lr;")
    private class521 field3750;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "Lk;")
    private class88 field3736;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "[I")
    public static int[] field3728 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public static int field3724 = -1;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "[I")
    public static int[] field3739 = new int[1024];

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "Z")
    public static boolean field3748 = false;

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "I")
    public static int field3753 = -1;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "Lud;")
    private class119 field3732;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field3737;
        if (arg0 != -29185) {
            method1775(68);
        }
        return 22;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field3741;
        if (arg1 != 0) {
            this.field3736 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lqa;II)Lr;")
    private final class521 method1774(class167 arg0, int arg1, int arg2) {
        ++field3746;
        if (this.field3750 != null && ~arg0.method921(this.field3750.method1601(), arg1) == -1) {
            return this.field3750;
        } else {
            class433 var4 = this.method1776(arg1, false, arg0, arg2);
            return var4 == null ? null : var4.field5896;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = 127 / ((4 - arg0) / 47);
        if (this.field3732 == null) {
            this.field3732 = class82.method459(this.method1774(arg1, 0, 65535), super.field3122, super.field3132, super.field3126, (byte) -101);
        }
        ++field3725;
        return this.field3732;
    }

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field3739 = null;
        field3728 = null;
        if (arg0 != -27362) {
            method1775(-14);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        ++field3745;
        Object var3 = null;
        class88 var5;
        if (this.field3736 == null && this.field3722) {
            class433 var4 = this.method1776(262144, true, arg1, 65535);
            var5 = var4 == null ? null : var4.field5897;
        } else {
            var5 = this.field3736;
            this.field3736 = null;
        }
        if (var5 != null) {
            class443.method2572(var5, this.field3727, super.field3126, super.field3122, (boolean[]) null);
        }
        if (arg0 != 22132) {
            this.field3722 = true;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZLqa;I)Lvq;")
    private final class433 method1776(int arg0, boolean arg1, class167 arg2, int arg3) {
        ++field3752;
        class137 var5 = class626.field9084.method1093(0, this.field3743 & arg3);
        class544 var6;
        class544 var7;
        if (this.field3726) {
            var6 = class353.field4949[this.field3727];
            var7 = class50.field672[0];
        } else {
            var6 = class50.field672[this.field3727];
            if (~this.field3727 <= -4) {
                var7 = null;
            } else {
                var7 = class50.field672[this.field3727 + 1];
            }
        }
        return var5.method731(super.field3122, var6, super.field3126, 22, arg0, arg2, super.field3132, -15988, var7, this.field3734, arg1);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field3740;
        return arg0 != 1901 ? -43 : this.field3734;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field3735;
        return arg1 != 30307 ? null : this.method1774(arg2, arg0, 65535);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        ++field3742;
        if (arg0 != -17817) {
            this.field3726 = true;
        }
        return this.field3743 & 65535;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field3731;
        if (this.field3750 == null) {
            return null;
        } else {
            class105 var3 = arg1.method964();
            var3.method361(super.field3126, super.field3132, super.field3122);
            int var4 = -23 / ((arg0 - -30) / 63);
            class541 var5 = null;
            if (this.field3749) {
                var5 = class296.method1818(16711680, 1);
            }
            this.field3750.method1595(var3, var5 == null ? null : var5.field7564[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field3751;
        if (arg0 != -1) {
            field3728 = null;
        }
        return this.field3730;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        this.field3730 = false;
        ++field3729;
        if (arg0 != 52) {
            this.field3743 = 16;
        }
        if (this.field3750 != null) {
            this.field3750.method1583(-65537 & this.field3750.method1601());
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg6 instanceof class286) {
            class286 var8 = (class286) arg6;
            if (this.field3750 != null && var8.field3750 != null) {
                this.field3750.method1573(var8.field3750, arg4, arg2, arg0, arg5);
            }
        }
        ++field3738;
        if (arg1 < 67) {
            this.method1776(82, true, (class167) null, -103);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field3723;
        class521 var5 = this.method1774(arg2, 131072, 65535);
        if (var5 != null) {
            class105 var6 = arg2.method964();
            var6.method361(super.field3126, super.field3132, super.field3122);
            return var5.method1598(arg0, arg1, var6, false);
        } else {
            if (arg3 >= -35) {
                this.method54(22, 97, -126, (class167) null, 117, true, (class239) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lqa;Lbu;IIIIZIZ)V")
    public class286(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1677, arg1.field1735, arg1.field1667);
        super.field3126 = arg3;
        super.field3122 = arg5;
        this.field3726 = arg6;
        this.field3730 = arg8;
        this.field3749 = ~arg1.field1749 != -1 && !arg6;
        this.field3734 = (byte) arg7;
        this.field3727 = (byte) arg2;
        this.field3743 = (short) arg1.field1679;
        this.field3722 = arg0.method951() && arg1.field1725 && !this.field3726 && class501.field6954.method3159(class428.field5845, true) != 0;
        int var10 = 2048;
        if (this.field3730) {
            var10 |= 65536;
        }
        class433 var11 = this.method1776(var10, this.field3722, arg0, 65535);
        if (var11 != null) {
            this.field3750 = var11.field5896;
            this.field3736 = var11.field5897;
            if (this.field3730) {
                this.field3750 = this.field3750.method1607((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (this.field3750 != null) {
            this.field3750.method1588();
        }
        ++field3744;
        int var2 = -122 / ((arg0 - -4) / 41);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        if (arg1 != -9785) {
            this.field3749 = false;
        }
        ++field3733;
        Object var3 = null;
        class88 var5;
        if (this.field3736 == null && this.field3722) {
            class433 var4 = this.method1776(262144, true, arg0, 65535);
            var5 = var4 != null ? var4.field5897 : null;
        } else {
            var5 = this.field3736;
            this.field3736 = null;
        }
        if (var5 != null) {
            class68.method388(var5, this.field3727, super.field3126, super.field3122, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        int var2 = 77 % ((arg0 - -20) / 32);
        ++field3747;
        return this.field3722;
    }
}
