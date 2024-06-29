import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class197 extends class478 implements class278 {

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "B")
    private byte field2831;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "Z")
    private boolean field2809;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
    private short field2805;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "B")
    private byte field2815;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "B")
    private byte field2810;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "Z")
    private boolean field2830;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "Z")
    private boolean field2824;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "Z")
    private boolean field2806;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lmr;")
    private class173 field2817;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "Lab;")
    public class232 field2821;

    @OriginalMember(owner = "client!lg", name = "nb", descriptor = "[I")
    public static int[] field2835;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "Lcs;")
    public static class351 field2834;

    @OriginalMember(owner = "client!lg", name = "ob", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[I")
    public static int[] field2807;

    static {
        Math.sqrt(8192.0D);
        field2835 = new int[50];
        field2834 = new class351(59, 2);
        field2836 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)I", line = 5)
    public final int method205(byte arg0) {
        ++field2814;
        if (arg0 != 114) {
            this.method215(92);
        }
        return this.field2821 == null ? 0 : this.field2821.method55();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 16)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        ++field2829;
        if (arg6 == 59) {
            if (!(arg5 instanceof class323)) {
                if (arg5 instanceof class197) {
                    class197 var8 = (class197) arg5;
                    if (this.field2821 != null && var8.field2821 != null) {
                        this.field2821.method59(var8.field2821, arg0, arg2, arg4, arg3);
                        return;
                    }
                }
            } else {
                class323 var9 = (class323) arg5;
                if (this.field2821 == null || var9.field4448 == null) {
                    return;
                }
                this.field2821.method59(var9.field4448, arg0, arg2, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(Lkm;I)Lto;", line = 51)
    public final class370 method193(class487 arg0, int arg1) {
        ++field2812;
        if (this.field2821 == null) {
            return null;
        } else {
            class250 var3 = arg0.method1105();
            var3.method1382(super.field6765, super.field6755, super.field6746);
            class370 var4 = null;
            if (this.field2809) {
                var4 = class277.method1737((byte) 28, 1);
            }
            if (arg1 > -6) {
                field2835 = null;
            }
            this.field2821.method41(var3, var4 != null ? var4.field5233[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V", line = 76)
    public static void method1254(byte arg0) {
        field2807 = null;
        field2835 = null;
        if (arg0 != -7) {
            method1254((byte) -78);
        }
        field2834 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 88)
    public final void method202(byte arg0) {
        ++field2825;
        this.field2824 = false;
        if (this.field2821 != null) {
            this.field2821.method56(-32769 & this.field2821.method50());
        }
        if (arg0 < 42) {
            this.method205((byte) 69);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkm;II)Lab;", line = 102)
    public final class232 method208(class487 arg0, int arg1, int arg2) {
        int var4 = 0 / ((-12 - arg1) / 47);
        ++field2804;
        return this.method1256(-1, arg0, arg2);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkm;I)V", line = 114)
    public final void method216(class487 arg0, int arg1) {
        ++field2822;
        Object var3 = null;
        class173 var5;
        if (this.field2817 == null && this.field2806) {
            class172 var4 = this.method1255(28, true, arg0, 131072);
            var5 = var4 != null ? var4.field2554 : null;
        } else {
            var5 = this.field2817;
            this.field2817 = null;
        }
        if (var5 != null) {
            class199.method1265(var5, this.field2831, super.field6765, super.field6746, (boolean[]) null);
        }
        int var6 = 50 % ((arg1 - -12) / 60);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)I", line = 141)
    public final int method219(int arg0) {
        if (arg0 != -17942) {
            this.method205((byte) 107);
        }
        ++field2832;
        return this.field2815;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lkm;Lcj;IIIIIZIIIIIIZ)V", line = 155)
    public class197(class487 arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6729 == 1, class48.method376(arg12, 2597, arg13));
        this.field2831 = (byte) arg3;
        this.field2809 = ~arg1.field6681 != -1 && !arg7;
        this.field2805 = (short) arg1.field6705;
        this.field2815 = (byte) arg12;
        this.field2810 = (byte) arg13;
        this.field2830 = arg7;
        this.field2824 = arg14;
        this.field2806 = arg0.method1123() && arg1.field6697 && !this.field2830 && class47.field761 != 0;
        int var16 = 1024;
        if (this.field2824) {
            var16 |= 32768;
        }
        class172 var17 = this.method1255(115, this.field2806, arg0, var16);
        if (var17 != null) {
            this.field2817 = var17.field2554;
            this.field2821 = var17.field2549;
            if (this.field2824) {
                this.field2821 = this.field2821.method51((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)Z", line = 189)
    public final boolean method195(int arg0) {
        ++field2820;
        return arg0 < 91 ? true : this.field2824;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZLkm;I)Llt;", line = 204)
    private final class172 method1255(int arg0, boolean arg1, class487 arg2, int arg3) {
        ++field2816;
        int var5 = 19 / ((arg0 - -65) / 34);
        class475 var6 = class304.field4160.method2075(this.field2805 & 65535, false);
        class269 var7;
        class269 var8;
        if (this.field2830) {
            var7 = class366.field5215[0];
            var8 = class8.field166[this.field2831];
        } else {
            var8 = class366.field5215[this.field2831];
            if (this.field2831 >= 3) {
                var7 = null;
            } else {
                var7 = class366.field5215[this.field2831 + 1];
            }
        }
        return var6.method2793(var7, super.field6765, ~this.field2815 != -12 ? this.field2815 : 10, var8, ~this.field2815 != -12 ? this.field2810 : this.field2810 + 4, arg2, arg3, arg1, super.field6746, (byte) 80, super.field6755);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lkm;I)V", line = 233)
    public final void method218(class487 arg0, int arg1) {
        if (arg1 > -73) {
            this.method215(-57);
        }
        ++field2811;
        Object var3 = null;
        class173 var5;
        if (this.field2817 == null && this.field2806) {
            class172 var4 = this.method1255(70, true, arg0, 131072);
            var5 = var4 == null ? null : var4.field2554;
        } else {
            var5 = this.field2817;
            this.field2817 = null;
        }
        if (var5 != null) {
            class204.method1291(var5, this.field2831, super.field6765, super.field6746, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILkm;I)Lab;", line = 260)
    private final class232 method1256(int arg0, class487 arg1, int arg2) {
        ++field2808;
        if (arg0 != -1) {
            field2834 = null;
        }
        if (this.field2821 != null && ~arg1.method1102(this.field2821.method50(), arg2) == -1) {
            return this.field2821;
        } else {
            class172 var4 = this.method1255(-121, false, arg1, arg2);
            return var4 == null ? null : var4.field2549;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z", line = 282)
    public final boolean method214(int arg0) {
        ++field2813;
        if (arg0 < 24) {
            this.method214(-14);
        }
        return this.field2806;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 295)
    public final void method217(boolean arg0) {
        ++field2803;
        if (arg0) {
            this.method205((byte) -73);
        }
        if (this.field2821 != null) {
            this.field2821.method22();
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)I", line = 308)
    public final int method1257(byte arg0) {
        if (arg0 != 10) {
            return 13;
        } else {
            ++field2818;
            return this.field2821 != null ? this.field2821.method67() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)I", line = 321)
    public final int method211(boolean arg0) {
        ++field2819;
        if (!arg0) {
            method1254((byte) -26);
        }
        return 65535 & this.field2805;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lkm;I)V", line = 335)
    public final void method197(class487 arg0, int arg1) {
        int var3 = -18 / ((64 - arg1) / 59);
        ++field2827;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkm;BII)Z", line = 347)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field2828;
        class232 var5 = this.method1256(-1, arg0, 65536);
        if (var5 != null) {
            class250 var6 = arg0.method1105();
            var6.method1382(super.field6765, super.field6755, super.field6746);
            return var5.method75(arg3, arg2, var6, false);
        } else {
            return arg1 < 123 ? false : false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I", line = 376)
    public final int method215(int arg0) {
        ++field2826;
        if (arg0 != -11524) {
            this.method218((class487) null, 39);
        }
        return this.field2810;
    }
}
