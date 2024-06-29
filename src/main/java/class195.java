import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class195 extends class535 {

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    private int field2816 = 8;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    private int field2825 = 1024;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    private int field2821 = 1024;

    @OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
    private int field2828 = 204;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!bq", name = "V", descriptor = "I")
    private int field2830 = 409;

    @OriginalMember(owner = "client!bq", name = "U", descriptor = "I")
    private int field2829 = 4;

    @OriginalMember(owner = "client!bq", name = "cb", descriptor = "I")
    private int field2837 = 81;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "Ldh;")
    public static class216 field2819 = new class216(12, 2);

    @OriginalMember(owner = "client!bq", name = "bb", descriptor = "Lbd;")
    public static class44 field2836 = new class44("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!bq", name = "db", descriptor = "Lft;")
    public static class4 field2838 = new class4(14, 1);

    @OriginalMember(owner = "client!bq", name = "eb", descriptor = "Lft;")
    public static class4 field2839 = new class4(15, 4);

    @OriginalMember(owner = "client!bq", name = "fb", descriptor = "Lft;")
    public static class4 field2840 = new class4(16, -2);

    @OriginalMember(owner = "client!bq", name = "gb", descriptor = "Lft;")
    public static class4 field2841 = new class4(17, 0);

    @OriginalMember(owner = "client!bq", name = "hb", descriptor = "Lft;")
    public static class4 field2842 = new class4(18, -2);

    @OriginalMember(owner = "client!bq", name = "ib", descriptor = "Lft;")
    public static class4 field2843 = new class4(19, -2);

    @OriginalMember(owner = "client!bq", name = "jb", descriptor = "Lft;")
    public static class4 field2844 = new class4(20, 6);

    @OriginalMember(owner = "client!bq", name = "kb", descriptor = "Lft;")
    public static class4 field2845 = new class4(21, 9);

    @OriginalMember(owner = "client!bq", name = "lb", descriptor = "Lft;")
    public static class4 field2846 = new class4(22, -2);

    @OriginalMember(owner = "client!bq", name = "mb", descriptor = "Lft;")
    public static class4 field2847 = new class4(23, 4);

    @OriginalMember(owner = "client!bq", name = "nb", descriptor = "Lft;")
    public static class4 field2848 = new class4(24, -1);

    @OriginalMember(owner = "client!bq", name = "ob", descriptor = "Lft;")
    public static class4 field2849 = new class4(25, -2);

    @OriginalMember(owner = "client!bq", name = "pb", descriptor = "Lft;")
    public static class4 field2850 = new class4(26, 0);

    @OriginalMember(owner = "client!bq", name = "qb", descriptor = "[Lft;")
    private static class4[] field2851 = new class4[32];

    @OriginalMember(owner = "client!bq", name = "sb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!bq", name = "rb", descriptor = "[[S")
    public static short[][] field2852;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!bq", name = "R", descriptor = "I")
    private int field2826;

    @OriginalMember(owner = "client!bq", name = "W", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!bq", name = "X", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!bq", name = "Y", descriptor = "I")
    private int field2833;

    @OriginalMember(owner = "client!bq", name = "ab", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "Lci;")
    public static class320 field2815;

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "[I")
    private int[] field2824;

    @OriginalMember(owner = "client!bq", name = "S", descriptor = "[[I")
    private int[][] field2827;

    @OriginalMember(owner = "client!bq", name = "Z", descriptor = "[[I")
    private int[][] field2834;

    static {
        class4[] var0 = class470.method2787((byte) -59);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field2851[var0[var1].field19] = var0[var1];
        }
        field2853 = 1338;
        field2852 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V", line = 135)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I", line = 11)
    public final int[] method65(int arg0, int arg1) {
        ++field2823;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int var4 = 0;
            int var5;
            for (var5 = class448.field6442[arg0] + this.field2820; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field2816 < ~var4 && var5 >= this.field2824[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field2824[var4];
            int var9 = this.field2824[var4 + -1];
            if (~var5 < ~(this.field2833 + var9) && -this.field2833 + var8 > var5) {
                for (int var10 = 0; var10 < class174.field2597; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field2825 : this.field2825;
                    int var13;
                    for (var13 = class539.field7939[var10] - -(this.field2826 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field2829 < ~var11 && var13 >= this.field2827[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2827[var6][var11];
                    int var16 = this.field2827[var6][var14];
                    if (var13 > this.field2833 + var16 && var15 - this.field2833 > var13) {
                        var3[var10] = this.field2834[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class282.method1821(var3, 0, class174.field2597, 0);
            }
        }
        if (arg1 != 1) {
            this.method66((byte) -74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V", line = 121)
    public static final void method1320(int arg0) {
        if (arg0 != -4097) {
            method1322(19, 45, -49);
        }
        ++field2817;
        if (class411.field5809 != 3) {
            class474.field6918 = class434.field6209;
        }
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V", line = 146)
    private final void method1321(int arg0) {
        ++field2835;
        Random var2 = new Random((long) this.field2816);
        this.field2833 = this.field2837 / 2;
        this.field2826 = 4096 / this.field2829;
        this.field2822 = 4096 / this.field2816;
        int var3 = this.field2826 / 2;
        this.field2834 = new int[this.field2816][this.field2829];
        this.field2824 = new int[this.field2816 - -1];
        int var4 = this.field2822 / 2;
        this.field2827 = new int[this.field2816][this.field2829 + 1];
        this.field2824[0] = 0;
        for (int var5 = 0; ~var5 > ~this.field2816; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2822;
                int var7 = (class392.method2360(Integer.MIN_VALUE, var2, 4096) + -2048) * this.field2828 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2824[var5] = this.field2824[var5 - 1] - -var8;
            }
            this.field2827[var5][0] = 0;
            for (int var9 = 0; this.field2829 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2826;
                    int var11 = (-2048 + class392.method2360(Integer.MIN_VALUE, var2, 4096)) * this.field2830 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2827[var5][var9] = this.field2827[var5][var9 + -1] + var12;
                }
                this.field2834[var5][var9] = ~this.field2821 >= -1 ? 4096 : 4096 + -class392.method2360(class288.method1845(arg0, -2147479552), var2, this.field2821);
            }
            this.field2827[var5][this.field2829] = 4096;
        }
        this.field2824[this.field2816] = arg0;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(III)Z", line = 212)
    public static final boolean method1322(int arg0, int arg1, int arg2) {
        ++field2818;
        if (~(2 & class234.field3497[1][arg0][arg1]) != -1) {
            return true;
        } else {
            return arg2 != 28946 ? false : false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(B)V", line = 227)
    public final void method66(byte arg0) {
        ++field2831;
        if (arg0 < 111) {
            this.method66((byte) 30);
        }
        this.method1321(4096);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILwn;I)V", line = 240)
    public final void method60(int arg0, class519 arg1, int arg2) {
        ++field2832;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field2821 = arg1.method3018(566990904);
                                    }
                                } else {
                                    this.field2837 = arg1.method3018(566990904);
                                }
                            } else {
                                this.field2820 = arg1.method3018(566990904);
                            }
                        } else {
                            this.field2825 = arg1.method3018(566990904);
                        }
                    } else {
                        this.field2828 = arg1.method3018(566990904);
                    }
                } else {
                    this.field2830 = arg1.method3018(566990904);
                }
            } else {
                this.field2816 = arg1.method3072((byte) -121);
            }
        } else {
            this.field2829 = arg1.method3072((byte) -123);
        }
        if (arg2 != -6232) {
            this.field2830 = -55;
        }
    }

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "(I)V", line = 328)
    public static void method1323(int arg0) {
        field2852 = null;
        field2839 = null;
        if (arg0 == 4096) {
            field2848 = null;
            field2819 = null;
            field2844 = null;
            field2842 = null;
            field2843 = null;
            field2847 = null;
            field2841 = null;
            field2836 = null;
            field2846 = null;
            field2838 = null;
            field2849 = null;
            field2840 = null;
            field2845 = null;
            field2851 = null;
            field2815 = null;
            field2850 = null;
        }
    }
}
