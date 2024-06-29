import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class337 extends class486 implements class246 {

    @OriginalMember(owner = "client!ew", name = "W", descriptor = "B")
    private byte field4719;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "B")
    private byte field4711;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "Z")
    private boolean field4704;

    @OriginalMember(owner = "client!ew", name = "ab", descriptor = "S")
    private short field4723;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "B")
    private byte field4698;

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "Z")
    private boolean field4708;

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "Z")
    private boolean field4716;

    @OriginalMember(owner = "client!ew", name = "V", descriptor = "Lr;")
    private class521 field4718;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "Lk;")
    private class88 field4701;

    @OriginalMember(owner = "client!ew", name = "Z", descriptor = "[I")
    public static int[] field4722 = new int[200];

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "Lwg;")
    public static class58 field4706 = new class58(64);

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ew", name = "X", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ew", name = "Y", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "Lud;")
    private class119 field4707;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "(I)V")
    public static void method2133(int arg0) {
        if (arg0 < 17) {
            field4706 = null;
        }
        field4722 = null;
        field4706 = null;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        if (this.field4707 == null) {
            this.field4707 = class82.method459(this.method2134(arg1, 145, 0), super.field6780, super.field6779, super.field6787, (byte) -101);
        }
        int var3 = 105 / ((arg0 - 4) / 47);
        ++field4697;
        return this.field4707;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 1901) {
            this.field4704 = false;
        }
        ++field4717;
        return this.field4698;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        if (arg0 != 22132) {
            this.method2134((class167) null, 126, -121);
        }
        ++field4705;
        Object var3 = null;
        class88 var5;
        if (this.field4701 == null && this.field4716) {
            class433 var4 = this.method2136(262144, arg0 ^ 22130, true, arg1);
            var5 = var4 != null ? var4.field5897 : null;
        } else {
            var5 = this.field4701;
            this.field4701 = null;
        }
        if (var5 != null) {
            class443.method2572(var5, this.field4719, super.field6787, super.field6780, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        ++field4696;
        if (arg0 != -17817) {
            this.method2136(111, -77, true, (class167) null);
        }
        return this.field4723 & 65535;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field4710;
        if (arg1 != 0) {
            this.field4704 = false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field4721;
        if (this.field4718 == null) {
            return null;
        } else {
            int var3 = -89 / ((-30 - arg0) / 63);
            class105 var4 = arg1.method964();
            var4.method361(super.field6787 + super.field6786, super.field6779, super.field6780 + super.field6777);
            class541 var5 = null;
            if (this.field4708) {
                var5 = class296.method1818(16711680, 1);
            }
            this.field4718.method1595(var4, var5 != null ? var5.field7564[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        ++field4714;
        if (arg0 != -29185) {
            field4699 = -87;
        }
        return this.field4711;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        ++field4700;
        int var2 = -44 % ((arg0 - -20) / 32);
        return this.field4716;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lqa;II)Lr;")
    private final class521 method2134(class167 arg0, int arg1, int arg2) {
        if (arg1 != 145) {
            field4699 = -127;
        }
        ++field4713;
        if (this.field4718 != null && ~arg0.method921(this.field4718.method1601(), arg2) == -1) {
            return this.field4718;
        } else {
            class433 var4 = this.method2136(arg2, -112, false, arg0);
            return var4 == null ? null : var4.field5896;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field4715;
        if (arg1 != 30307) {
            this.method2136(113, 95, true, (class167) null);
        }
        return this.method2134(arg2, 145, arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        ++field4720;
        Object var3 = null;
        class88 var5;
        if (this.field4701 == null && this.field4716) {
            class433 var4 = this.method2136(262144, -118, true, arg0);
            var5 = var4 == null ? null : var4.field5897;
        } else {
            var5 = this.field4701;
            this.field4701 = null;
        }
        if (var5 != null) {
            class68.method388(var5, this.field4719, super.field6787, super.field6780, (boolean[]) null);
        }
        if (arg1 != -9785) {
            this.method2134((class167) null, 125, 71);
        }
    }

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)I")
    public final int method2135(int arg0) {
        if (arg0 != -1) {
            this.method2134((class167) null, -36, -126);
        }
        ++field4712;
        return this.field4718 == null ? 0 : this.field4718.method1579();
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (this.field4718 != null) {
            this.field4718.method1588();
        }
        ++field4703;
        int var2 = -27 % ((-4 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field4709;
        class521 var5 = this.method2134(arg2, 145, 131072);
        if (arg3 >= -35) {
            this.field4711 = 96;
        }
        if (var5 != null) {
            class105 var6 = arg2.method964();
            var6.method361(super.field6787, super.field6779, super.field6780);
            return var5.method1598(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZLqa;)Lvq;")
    private final class433 method2136(int arg0, int arg1, boolean arg2, class167 arg3) {
        ++field4702;
        class137 var5 = class626.field9084.method1093(0, 65535 & this.field4723);
        int var6 = -42 % ((arg1 - -52) / 53);
        class544 var7;
        class544 var8;
        if (this.field4704) {
            var7 = class50.field672[0];
            var8 = class353.field4949[this.field4719];
        } else {
            var8 = class50.field672[this.field4719];
            if (~this.field4719 <= -4) {
                var7 = null;
            } else {
                var7 = class50.field672[this.field4719 + 1];
            }
        }
        return var5.method731(super.field6780, var8, super.field6787, this.field4711, arg0, arg3, super.field6779, -15988, var7, this.field4698, arg2);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lqa;Lbu;IIIIZIIIII)V")
    public class337(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class592.method3421(arg10, arg11, (byte) 93));
        super.field6780 = arg5;
        this.field4719 = (byte) arg2;
        this.field4711 = (byte) arg10;
        this.field4704 = arg6;
        this.field4723 = (short) arg1.field1679;
        this.field4698 = (byte) arg11;
        super.field6787 = arg3;
        this.field4708 = ~arg1.field1749 != -1 && !arg6;
        this.field4716 = arg0.method951() && arg1.field1725 && !this.field4704 && ~class501.field6954.method3159(class428.field5845, true) != -1;
        class433 var13 = this.method2136(2048, -118, this.field4716, arg0);
        if (var13 != null) {
            this.field4718 = var13.field5896;
            this.field4701 = var13.field5897;
        }
    }
}
