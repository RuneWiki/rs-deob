import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class480 implements class248 {

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "Z")
    private boolean field80;

    @OriginalMember(owner = "client!ro", name = "bb", descriptor = "Z")
    private boolean field96;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "B")
    private byte field75;

    @OriginalMember(owner = "client!ro", name = "W", descriptor = "Z")
    private boolean field91;

    @OriginalMember(owner = "client!ro", name = "T", descriptor = "B")
    private byte field88;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "S")
    private short field74;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "Z")
    private boolean field84;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "Lc;")
    private class121 field78;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "Lj;")
    private class377 field81;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "Lgr;")
    public static class296 field73 = new class296(0, 4);

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ro", name = "V", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ro", name = "X", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ro", name = "Z", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ro", name = "ab", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ro", name = "Y", descriptor = "Lrb;")
    public static class234 field93;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 <= 94) {
            this.field74 = -28;
        }
        ++field72;
        return this.field84;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        ++field82;
        if (arg1 > -111) {
            this.method26(37);
        }
        Object var3 = null;
        class377 var5;
        if (this.field81 == null && this.field84) {
            class95 var4 = this.method16(arg0, 262144, -1310, true);
            var5 = var4 == null ? null : var4.field1602;
        } else {
            var5 = this.field81;
            this.field81 = null;
        }
        if (var5 != null) {
            class13.method88(var5, this.field88, super.field7149, super.field7142, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLqa;)Lc;")
    private final class121 method10(int arg0, byte arg1, class162 arg2) {
        ++field69;
        int var4 = 100 / ((-38 - arg1) / 41);
        if (this.field78 != null && ~arg2.method255(this.field78.method889(), arg0) == -1) {
            return this.field78;
        } else {
            class95 var5 = this.method16(arg2, arg0, -1310, false);
            return var5 == null ? null : var5.field1606;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field85;
        if (~arg0 == ~arg4) {
            class390.method2410(arg3, arg1, arg5, 5126, arg4);
        } else {
            if (~class315.field4754 >= ~(-arg4 + arg1) && ~(arg1 - -arg4) >= ~class156.field2455 && ~(-arg0 + arg3) <= ~class70.field1213 && ~class389.field5859 <= ~(arg0 + arg3)) {
                class1.method4(arg1, arg0, arg3, arg5, -1, arg4);
            } else {
                class100.method745(arg0, arg1, arg3, arg4, true, arg5);
            }
            if (arg2 > -75) {
                method27(-122, -17);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        if (arg0 != 3765) {
            field93 = null;
        }
        ++field77;
        return 22;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field76;
        if (this.field78 == null) {
            return null;
        } else {
            class414 var3 = arg1.method240();
            var3.method868(super.field7149, super.field7139, super.field7142);
            class163 var4 = null;
            if (arg0) {
                this.method16((class162) null, 14, 53, false);
            }
            if (this.field91) {
                var4 = class483.method2876(1, 0);
            }
            this.field78.method927(var3, var4 == null ? null : var4.field2516[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field79;
        class121 var5 = this.method10(arg0, (byte) -101, arg1);
        if (var5 != null) {
            class414 var6 = arg1.method240();
            var6.method868(super.field7149, super.field7139, super.field7142);
            return var5.method924(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        ++field92;
        if (arg0 == -13300) {
            Object var3 = null;
            class377 var5;
            if (this.field81 == null && this.field84) {
                class95 var4 = this.method16(arg1, 262144, -1310, true);
                var5 = var4 == null ? null : var4.field1602;
            } else {
                var5 = this.field81;
                this.field81 = null;
            }
            if (var5 != null) {
                class254.method1633(var5, this.field88, super.field7149, super.field7142, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lqa;IIZ)Lmr;")
    private final class95 method16(class162 arg0, int arg1, int arg2, boolean arg3) {
        ++field90;
        if (arg2 != -1310) {
            this.field81 = null;
        }
        class79 var5 = class319.field4807.method2874(this.field74 & 65535, -17045);
        class35 var6;
        class35 var7;
        if (this.field96) {
            var6 = class335.field5061[this.field88];
            var7 = class43.field829[0];
        } else {
            if (~this.field88 > -4) {
                var7 = class43.field829[this.field88 + 1];
            } else {
                var7 = null;
            }
            var6 = class43.field829[this.field88];
        }
        return var5.method625(super.field7149, super.field7142, this.field75, var7, arg1, arg3, arg0, var6, 22, super.field7139, -1);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field70;
        int var2 = 100 % ((arg0 - -60) / 40);
        return 65535 & this.field74;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        ++field83;
        if (arg4 != -1) {
            field73 = null;
        }
        if (arg3 instanceof class2) {
            class2 var8 = (class2) arg3;
            if (this.field78 != null && var8.field78 != null) {
                this.field78.method928(var8.field78, arg0, arg6, arg5, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        ++field67;
        if (arg0 != -69) {
            this.field88 = 115;
        }
        return this.field75;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lqa;Lgm;IIIIZIZ)V")
    public class2(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field1353, arg1.field1356);
        super.field7149 = arg3;
        this.field80 = arg8;
        this.field96 = arg6;
        this.field75 = (byte) arg7;
        this.field91 = arg1.field1357 != 0 && !arg6;
        this.field88 = (byte) arg2;
        super.field7142 = arg5;
        this.field74 = (short) arg1.field1318;
        this.field84 = arg0.method226() && arg1.field1385 && !this.field96 && class443.field6623.method338(-4, class169.field2624) != 0;
        int var10 = 2048;
        if (this.field80) {
            var10 |= 65536;
        }
        class95 var11 = this.method16(arg0, var10, -1310, this.field84);
        if (var11 != null) {
            this.field78 = var11.field1606;
            this.field81 = var11.field1602;
            if (this.field80) {
                this.field78 = this.field78.method938((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Z")
    public static final boolean method20(int arg0, int arg1) {
        ++field87;
        if (arg0 != 7814) {
            method21((byte) -56);
        }
        return ~arg1 == -3 || ~arg1 == -4;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(B)V")
    public static void method21(byte arg0) {
        field93 = null;
        if (arg0 != 0) {
            method27(24, -110);
        }
        field73 = null;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        if (arg0 == -3) {
            ++field71;
            this.field80 = false;
            if (this.field78 != null) {
                this.field78.method906(this.field78.method889() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        ++field89;
        return arg1 != 17793 ? null : this.method10(arg2, (byte) 108, arg0);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        ++field94;
        if (arg0) {
            field73 = null;
        }
        return this.field80;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        int var3 = -33 / ((-45 - arg0) / 48);
        ++field68;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        if (this.field78 != null) {
            this.field78.method898();
        }
        ++field86;
        int var2 = 92 / ((arg0 - -46) / 44);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)Z")
    public static final boolean method27(int arg0, int arg1) {
        ++field95;
        if (arg0 != -45) {
            method21((byte) -128);
        }
        if (~arg1 != -49 && ~arg1 != -45 && ~arg1 != -4 && ~arg1 != -24 && ~arg1 != -3) {
            return arg1 == 13 || arg1 == 1010;
        } else {
            return true;
        }
    }
}
