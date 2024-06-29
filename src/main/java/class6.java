import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 extends class70 implements class196 {

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "B")
    private byte field103;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Z")
    private boolean field82;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Z")
    private boolean field100;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Z")
    private boolean field91;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "B")
    private byte field78;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "S")
    private short field97;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "B")
    private byte field98;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Z")
    private boolean field83;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Lj;")
    private class229 field90;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lc;")
    public class201 field88;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "[[I")
    public static int[][] field102 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lbw;")
    public static class20 field85;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[I")
    public static int[] field96;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method49(int arg0) {
        ++field105;
        return arg0 != 7 ? false : this.field100;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I", line = 16)
    public final int method50(int arg0) {
        ++field99;
        if (arg0 != 25707) {
            this.method62((byte) -60, (class496) null);
        }
        return 65535 & this.field97;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqa;I)Lpj;", line = 29)
    public final class507 method51(class496 arg0, int arg1) {
        ++field87;
        if (this.field88 == null) {
            return null;
        } else {
            class23 var3 = arg0.method1088();
            var3.method185(super.field966, super.field971, super.field968);
            class507 var4 = null;
            if (this.field82) {
                var4 = class82.method527(1, arg1 ^ -1761171765);
            }
            if (arg1 != -150) {
                this.method56(0, -69, 27, (class496) null);
            }
            this.field88.method318(var3, var4 == null ? null : var4.field7549[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V", line = 55)
    public static void method52(int arg0) {
        if (arg0 == -24805) {
            field96 = null;
            field102 = null;
            field85 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILqa;B)Lc;", line = 69)
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        ++field95;
        int var4 = 123 % ((-62 - arg2) / 39);
        return this.method54((byte) -83, arg0, arg1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BILqa;)Lc;", line = 79)
    private final class201 method54(byte arg0, int arg1, class496 arg2) {
        if (arg0 != -83) {
            this.method59((byte) -93);
        }
        ++field79;
        if (this.field88 != null && ~arg2.method1141(this.field88.method279(), arg1) == -1) {
            return this.field88;
        } else {
            class454 var4 = this.method65(false, arg1, arg2, 11);
            return var4 != null ? var4.field6670 : null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLqa;)V", line = 103)
    public final void method55(byte arg0, class496 arg1) {
        ++field94;
        Object var3 = null;
        if (arg0 > -31) {
            this.method57(107);
        }
        class229 var5;
        if (this.field90 == null && this.field83) {
            class454 var4 = this.method65(true, 262144, arg1, 11);
            var5 = var4 != null ? var4.field6667 : null;
        } else {
            var5 = this.field90;
            this.field90 = null;
        }
        if (var5 != null) {
            class457.method2753(var5, this.field98, super.field966, super.field968, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILqa;)Z", line = 133)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field84;
        if (arg1 != 3) {
            method52(101);
        }
        class201 var5 = this.method54((byte) -83, 131072, arg3);
        if (var5 != null) {
            class23 var6 = arg3.method1088();
            var6.method185(super.field966, super.field971, super.field968);
            return var5.method310(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 155)
    public final void method57(int arg0) {
        ++field93;
        this.field100 = false;
        if (arg0 != -5077) {
            this.method67(41, (class496) null);
        }
        if (this.field88 != null) {
            this.field88.method297(this.field88.method279() & -65537);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)Z", line = 171)
    public static final boolean method58(boolean arg0, int arg1, int arg2) {
        ++field106;
        if (arg0) {
            field102 = null;
        }
        return ~(2048 & arg1) != -1;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 190)
    public final void method59(byte arg0) {
        int var2 = 41 / ((arg0 - 27) / 63);
        if (this.field88 != null) {
            this.field88.method295();
        }
        ++field75;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z", line = 204)
    public final boolean method60(byte arg0) {
        if (arg0 > -108) {
            this.field98 = -22;
        }
        ++field101;
        return this.field83;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 216)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 == 118) {
            if (arg0 instanceof class6) {
                class6 var8 = (class6) arg0;
                if (this.field88 != null && var8.field88 != null) {
                    this.field88.method298(var8.field88, arg5, arg6, arg3, arg4);
                }
            } else if (arg0 instanceof class121) {
                class121 var9 = (class121) arg0;
                if (this.field88 != null && var9.field1745 != null) {
                    this.field88.method298(var9.field1745, arg5, arg6, arg3, arg4);
                }
            }
            ++field86;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(BLqa;)V", line = 252)
    public final void method62(byte arg0, class496 arg1) {
        ++field81;
        if (arg0 != -126) {
            this.method63((byte) -32);
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lqa;Leu;IIIIZIIZ)V", line = 262)
    public class6(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class494.method2939(true, arg8, arg7));
        this.field103 = (byte) arg7;
        super.field968 = arg5;
        this.field82 = ~arg1.field1886 != -1 && !arg6;
        this.field100 = arg9;
        super.field966 = arg3;
        this.field91 = arg6;
        this.field78 = (byte) arg8;
        this.field97 = (short) arg1.field1826;
        this.field98 = (byte) arg2;
        this.field83 = arg0.method1145() && arg1.field1884 && !this.field91 && class96.field1399.method2170(class441.field6563, true) != 0;
        int var11 = 2048;
        if (this.field100) {
            var11 |= 65536;
        }
        class454 var12 = this.method65(this.field83, var11, arg0, 11);
        if (var12 != null) {
            this.field90 = var12.field6667;
            this.field88 = var12.field6670;
            if (this.field100) {
                this.field88 = this.field88.method292((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I", line = 303)
    public final int method63(byte arg0) {
        if (arg0 != 63) {
            this.field90 = null;
        }
        ++field76;
        return this.field103;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 314)
    public static final void method64(int arg0, int arg1) {
        ++field104;
        class377 var2 = class99.method672(arg0, false, arg1);
        var2.method2339(-11688);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZILqa;I)Lfo;", line = 326)
    private final class454 method65(boolean arg0, int arg1, class496 arg2, int arg3) {
        ++field80;
        if (arg3 != 11) {
            this.field83 = true;
        }
        class130 var5 = class56.field755.method2031(107, this.field97 & 65535);
        class206 var6;
        class206 var7;
        if (!this.field91) {
            var6 = class204.field2871[this.field98];
            if (~this.field98 <= -4) {
                var7 = null;
            } else {
                var7 = class204.field2871[this.field98 + 1];
            }
        } else {
            var7 = class204.field2871[0];
            var6 = class187.field2632[this.field98];
        }
        return var5.method831(3, arg1, this.field103, super.field966, super.field968, this.field78, var6, var7, arg0, arg2, super.field971);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I", line = 358)
    public final int method66(int arg0) {
        ++field77;
        return arg0 != -7234 ? 108 : this.field78;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILqa;)V", line = 369)
    public final void method67(int arg0, class496 arg1) {
        ++field92;
        int var3 = 122 / ((arg0 - 59) / 60);
        Object var4 = null;
        class229 var6;
        if (this.field90 == null && this.field83) {
            class454 var5 = this.method65(true, 262144, arg1, 11);
            var6 = var5 == null ? null : var5.field6667;
        } else {
            var6 = this.field90;
            this.field90 = null;
        }
        if (var6 != null) {
            class220.method1489(var6, this.field98, super.field966, super.field968, (boolean[]) null);
        }
    }
}
