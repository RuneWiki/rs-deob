import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class214 extends class556 implements class457 {

    @OriginalMember(owner = "client!eq", name = "jb", descriptor = "Z")
    private boolean field2834 = false;

    @OriginalMember(owner = "client!eq", name = "nb", descriptor = "Ljfa;")
    public class292 field2838;

    @OriginalMember(owner = "client!eq", name = "ab", descriptor = "Z")
    private boolean field2825;

    @OriginalMember(owner = "client!eq", name = "rb", descriptor = "Lde;")
    public static class534 field2842 = new class534(64);

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!eq", name = "W", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!eq", name = "bb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!eq", name = "db", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!eq", name = "eb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!eq", name = "gb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!eq", name = "hb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!eq", name = "ib", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!eq", name = "kb", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!eq", name = "lb", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!eq", name = "mb", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!eq", name = "ob", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!eq", name = "pb", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!eq", name = "qb", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!eq", name = "sb", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!eq", name = "tb", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!eq", name = "ub", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!eq", name = "vb", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!eq", name = "fb", descriptor = "Lwg;")
    private class428 field2830;

    @OriginalMember(owner = "client!eq", name = "cb", descriptor = "Lnd;")
    public static class547 field2827;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "[Z")
    public static boolean[] field2818;

    @OriginalMember(owner = "client!eq", name = "Z", descriptor = "[[Z")
    public static boolean[][] field2824;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)I")
    public final int method743(int arg0) {
        ++field2833;
        if (arg0 != -30968) {
            this.method752((byte) 72, 47, (class60) null, 45);
        }
        return this.field2838.field3819;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field2845;
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        ++field2820;
        return arg0 > -22 ? null : this.field2830;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)Z")
    public final boolean method756(int arg0) {
        ++field2831;
        if (arg0 > -52) {
            this.method84(98);
        }
        return this.field2838.method1748(-27353);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field2823;
        class474 var3 = this.field2838.method1752(true, arg0, true, 2048, false);
        if (var3 == null) {
            return null;
        } else {
            int var4 = 46 % ((-39 - arg1) / 55);
            class631 var5 = arg0.method531();
            var5.method596(super.field5801, super.field5800, super.field5797);
            class635 var6 = class510.method2982(this.field2825, 0, 1);
            this.field2838.method1745(super.field7746, super.field7744, var5, true, var3, arg0, super.field7734, super.field7741, false);
            if (!class232.field3053) {
                var3.method250(var5, var6.field8760[0], 0);
            } else {
                var3.method255(var5, var6.field8760[0], class286.field3600, 0);
            }
            if (this.field2838.field3839 != null) {
                class741 var7 = this.field2838.field3839.method2969();
                if (class232.field3053) {
                    arg0.method545(var7, class286.field3600);
                } else {
                    arg0.method455(var7);
                }
            }
            this.field2834 = var3.method287() || this.field2838.field3839 != null;
            if (this.field2830 != null) {
                class654.method3675((byte) -116, this.field2830, var3, super.field5801, super.field5800, super.field5797);
            } else {
                this.field2830 = class43.method309(super.field5800, var3, super.field5797, super.field5801, -111);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
    public final void method746(byte arg0) {
        if (arg0 < 82) {
            this.method744((class60) null, 104);
        }
        ++field2840;
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        field2818 = null;
        field2827 = null;
        field2842 = null;
        field2824 = null;
        if (arg0 != 47) {
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field2819;
        if (arg0 != -69) {
            this.method756(-87);
        }
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)I")
    public final int method84(int arg0) {
        ++field2835;
        if (arg0 != 1027) {
            field2827 = null;
        }
        return this.field2838.method1744((byte) -20);
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        ++field2839;
        if (arg0 >= -41) {
            this.method758(false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)I")
    public final int method87(byte arg0) {
        if (arg0 != 121) {
            return -115;
        } else {
            ++field2829;
            return this.field2838.method1750(3);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILha;)V")
    public final void method761(int arg0, class60 arg1) {
        this.field2838.method1747(arg1, 10625);
        ++field2844;
        int var3 = 46 % ((arg0 - 63) / 51);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)I")
    public final int method745(byte arg0) {
        ++field2821;
        int var2 = -117 % ((-33 - arg0) / 56);
        return this.field2838.field3824;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lha;Lac;IIIIIZIIIIIII)V")
    public class214(class60 arg0, class543 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field7513 == -2, class417.method2336(arg12, arg13, 9218));
        this.field2838 = new class292(arg0, arg1, arg12, arg13, super.field5796, arg3, this, arg7, arg14);
        this.field2825 = ~arg1.field7550 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLtd;)V")
    public final void method1372(boolean arg0, class456 arg1) {
        if (arg0) {
            ++field2836;
            this.field2838.method1749(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field2843;
        class474 var5 = this.field2838.method1752(false, arg2, true, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 >= -41) {
                this.method758(true);
            }
            class631 var6 = arg2.method531();
            var6.method596(super.field5801, super.field5800, super.field5797);
            return !class232.field3053 ? var5.method258(arg1, arg3, var6, false, 0) : var5.method275(arg1, arg3, var6, false, 0, class286.field3600);
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        ++field2841;
        if (arg0 > -79) {
            this.method750(25, (class60) null);
        }
        return this.field2834;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILha;)V")
    public final void method760(int arg0, class60 arg1) {
        this.field2838.method1746(arg0 + 31509, arg1);
        ++field2832;
        if (arg0 != -31507) {
            field2828 = 95;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)Z")
    public static final boolean method1373(int arg0, int arg1, int arg2) {
        ++field2817;
        if (arg2 != 0) {
            return false;
        } else {
            return (arg0 & 393216) != 0 | class532.method3055(arg1, true, arg0) || class588.method3343(1248, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 != 30558) {
            field2842 = null;
        }
        ++field2837;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        ++field2846;
        class474 var3 = this.field2838.method1752(true, arg0, true, 262144, true);
        if (arg1 != 0) {
            this.method84(-101);
        }
        if (var3 != null) {
            class631 var4 = arg0.method531();
            var4.method596(super.field5801, super.field5800, super.field5797);
            this.field2838.method1745(super.field7746, super.field7744, var4, false, var3, arg0, super.field7734, super.field7741, false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
    public final int method758(boolean arg0) {
        ++field2826;
        if (!arg0) {
            this.method85(57);
        }
        return this.field2838.field3831;
    }
}
