import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class148 extends class44 {

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public int field2795 = 0;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "B")
    public byte field2804 = 0;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field2798 = 0;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "Z")
    private boolean field2838 = false;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "[I")
    public int[] field2824;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "[I")
    public int[] field2833;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "[I")
    public int[] field2811;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
    private int[] field2836;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
    public int[] field2816;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
    public int[] field2803;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "[B")
    public byte[] field2831;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "[B")
    public byte[] field2840;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "[B")
    public byte[] field2793;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
    private int[] field2815;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[S")
    public short[] field2799;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[B")
    public byte[] field2812;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "[S")
    public short[] field2828;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "[B")
    public byte[] field2832;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[S")
    public short[] field2796;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "[S")
    public short[] field2834;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[S")
    public short[] field2822;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "[S")
    private short[] field2817;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "[S")
    private short[] field2809;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "[S")
    private short[] field2823;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[B")
    private byte[] field2839;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "[B")
    private byte[] field2810;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[B")
    private byte[] field2797;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "[B")
    private byte[] field2814;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[B")
    private byte[] field2807;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[[I")
    public int[][] field2794;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[[I")
    public int[][] field2813;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "[Lhc;")
    public class79[] field2837;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "[Lsb;")
    public class190[] field2820;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "[Lhc;")
    public class79[] field2808;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "S")
    public short field2830;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "S")
    public short field2805;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    private static int field2806 = 0;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
    private static int[] field2829 = class199.field3640;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
    private static int[] field2801 = class199.field3624;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "[I")
    private static int[] field2835 = new int[10000];

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "[I")
    private static int[] field2841 = new int[10000];

    @OriginalMember(owner = "client!o", name = "v", descriptor = "S")
    private short field2800;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "S")
    private short field2802;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "S")
    private short field2818;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "S")
    private short field2819;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "S")
    private short field2825;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "S")
    private short field2827;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()Lo;")
    public final class148 method934() {
        class148 var1 = new class148();
        if (this.field2831 != null) {
            var1.field2831 = new byte[this.field2795];
            for (int var2 = 0; var2 < this.field2795; var2++) {
                var1.field2831[var2] = this.field2831[var2];
            }
        }
        var1.field2798 = this.field2798;
        var1.field2795 = this.field2795;
        var1.field2821 = this.field2821;
        var1.field2824 = this.field2824;
        var1.field2833 = this.field2833;
        var1.field2811 = this.field2811;
        var1.field2816 = this.field2816;
        var1.field2803 = this.field2803;
        var1.field2826 = this.field2826;
        var1.field2840 = this.field2840;
        var1.field2793 = this.field2793;
        var1.field2812 = this.field2812;
        var1.field2828 = this.field2828;
        var1.field2799 = this.field2799;
        var1.field2804 = this.field2804;
        var1.field2832 = this.field2832;
        var1.field2796 = this.field2796;
        var1.field2834 = this.field2834;
        var1.field2822 = this.field2822;
        var1.field2817 = this.field2817;
        var1.field2809 = this.field2809;
        var1.field2823 = this.field2823;
        var1.field2839 = this.field2839;
        var1.field2810 = this.field2810;
        var1.field2797 = this.field2797;
        var1.field2814 = this.field2814;
        var1.field2807 = this.field2807;
        var1.field2836 = this.field2836;
        var1.field2815 = this.field2815;
        var1.field2794 = this.field2794;
        var1.field2813 = this.field2813;
        var1.field2837 = this.field2837;
        var1.field2820 = this.field2820;
        var1.field2830 = this.field2830;
        var1.field2805 = this.field2805;
        return var1;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public final void method935() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2824[var1] = -this.field2824[var1];
            this.field2811[var1] = -this.field2811[var1];
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method333(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class148 var6 = (class148) arg0;
        var6.method956();
        var6.method940();
        field2806++;
        int var7 = 0;
        int[] var8 = var6.field2824;
        int var9 = var6.field2798;
        for (int var10 = 0; var10 < this.field2798; var10++) {
            class79 var13 = this.field2837[var10];
            if (var13.field1524 != 0) {
                int var14 = this.field2833[var10] - arg2;
                if (var14 >= var6.field2802 && var14 <= var6.field2827) {
                    int var15 = this.field2824[var10] - arg1;
                    if (var15 >= var6.field2800 && var15 <= var6.field2819) {
                        int var16 = this.field2811[var10] - arg3;
                        if (var16 >= var6.field2818 && var16 <= var6.field2825) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class79 var18 = var6.field2837[var17];
                                if (var8[var17] == var15 && var6.field2811[var17] == var16 && var6.field2833[var17] == var14 && var18.field1524 != 0) {
                                    if (this.field2808 == null) {
                                        this.field2808 = new class79[this.field2798];
                                    }
                                    if (var6.field2808 == null) {
                                        var6.field2808 = new class79[var9];
                                    }
                                    class79 var19 = this.field2808[var10];
                                    if (var19 == null) {
                                        var19 = this.field2808[var10] = new class79(var13);
                                    }
                                    class79 var20 = var6.field2808[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2808[var17] = new class79(var18);
                                    }
                                    var19.field1521 += var18.field1521;
                                    var19.field1526 += var18.field1526;
                                    var19.field1525 += var18.field1525;
                                    var19.field1524 += var18.field1524;
                                    var20.field1521 += var13.field1521;
                                    var20.field1526 += var13.field1526;
                                    var20.field1525 += var13.field1525;
                                    var20.field1524 += var13.field1524;
                                    var7++;
                                    field2841[var10] = field2806;
                                    field2835[var17] = field2806;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2795; var11++) {
            if (field2841[this.field2816[var11]] == field2806 && field2841[this.field2803[var11]] == field2806 && field2841[this.field2826[var11]] == field2806) {
                if (this.field2831 == null) {
                    this.field2831 = new byte[this.field2795];
                }
                this.field2831[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2795; var12++) {
            if (field2835[var6.field2816[var12]] == field2806 && field2835[var6.field2803[var12]] == field2806 && field2835[var6.field2826[var12]] == field2806) {
                if (var6.field2831 == null) {
                    var6.field2831 = new byte[var6.field2795];
                }
                var6.field2831[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([[IIIIZIZ)Lo;")
    public final class148 method936(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        this.method956();
        int var8 = this.field2800 + arg1;
        int var9 = this.field2819 + arg1;
        int var10 = this.field2818 + arg3;
        int var11 = this.field2825 + arg3;
        if (var8 < 0 || var9 + 128 >> 7 >= arg0.length || var10 < 0 || var11 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var12 = var8 >> 7;
        int var13 = var9 + 127 >> 7;
        int var14 = var10 >> 7;
        int var15 = var11 + 127 >> 7;
        if (arg0[var12][var14] == arg2 && arg0[var13][var14] == arg2 && arg0[var12][var15] == arg2 && arg0[var13][var15] == arg2) {
            return this;
        }
        class148 var16;
        if (arg4) {
            var16 = new class148();
            var16.field2798 = this.field2798;
            var16.field2795 = this.field2795;
            var16.field2821 = this.field2821;
            var16.field2824 = this.field2824;
            var16.field2811 = this.field2811;
            var16.field2816 = this.field2816;
            var16.field2803 = this.field2803;
            var16.field2826 = this.field2826;
            var16.field2831 = this.field2831;
            var16.field2840 = this.field2840;
            var16.field2793 = this.field2793;
            var16.field2812 = this.field2812;
            var16.field2828 = this.field2828;
            var16.field2799 = this.field2799;
            var16.field2804 = this.field2804;
            var16.field2832 = this.field2832;
            var16.field2796 = this.field2796;
            var16.field2834 = this.field2834;
            var16.field2822 = this.field2822;
            var16.field2817 = this.field2817;
            var16.field2809 = this.field2809;
            var16.field2823 = this.field2823;
            var16.field2839 = this.field2839;
            var16.field2810 = this.field2810;
            var16.field2797 = this.field2797;
            var16.field2814 = this.field2814;
            var16.field2807 = this.field2807;
            var16.field2836 = this.field2836;
            var16.field2815 = this.field2815;
            var16.field2794 = this.field2794;
            var16.field2813 = this.field2813;
            var16.field2830 = this.field2830;
            var16.field2805 = this.field2805;
            var16.field2837 = this.field2837;
            var16.field2820 = this.field2820;
            var16.field2808 = this.field2808;
            var16.field2833 = new int[var16.field2798];
        } else {
            var16 = this;
        }
        if (arg5 == 0) {
            for (int var17 = 0; var17 < var16.field2798; var17++) {
                int var18 = this.field2824[var17] + arg1;
                int var19 = this.field2811[var17] + arg3;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg0[var22][var23] + arg0[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg0[var22][var23 + 1] + arg0[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                var16.field2833[var17] = this.field2833[var17] + var26 - arg2;
            }
        } else {
            for (int var27 = 0; var27 < var16.field2798; var27++) {
                int var28 = (this.field2833[var27] << 16) / this.field2802;
                if (var28 < arg5) {
                    int var29 = this.field2824[var27] + arg1;
                    int var30 = this.field2811[var27] + arg3;
                    int var31 = var29 & 0x7F;
                    int var32 = var30 & 0x7F;
                    int var33 = var29 >> 7;
                    int var34 = var30 >> 7;
                    int var35 = (128 - var31) * arg0[var33][var34] + arg0[var33 + 1][var34] * var31 >> 7;
                    int var36 = (128 - var31) * arg0[var33][var34 + 1] + arg0[var33 + 1][var34 + 1] * var31 >> 7;
                    int var37 = (128 - var32) * var35 + var32 * var36 >> 7;
                    var16.field2833[var27] = (var37 - arg2) * (arg5 - var28) / arg5 + this.field2833[var27];
                } else {
                    var16.field2833[var27] = this.field2833[var27];
                }
            }
        }
        if (arg6) {
            var16.method946();
        } else {
            this.field2838 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()Z")
    public final boolean method331() {
        return true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
    public final int method87() {
        if (!this.field2838) {
            this.method956();
        }
        return this.field2802;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
    public final void method937(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2798; var4++) {
            this.field2824[var4] += arg0;
            this.field2833[var4] += arg1;
            this.field2811[var4] += arg2;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([B)V")
    private final void method938(byte[] arg0) {
        class109 var2 = new class109(arg0);
        class109 var3 = new class109(arg0);
        class109 var4 = new class109(arg0);
        class109 var5 = new class109(arg0);
        class109 var6 = new class109(arg0);
        class109 var7 = new class109(arg0);
        class109 var8 = new class109(arg0);
        var2.field2053 = arg0.length - 23;
        int var9 = var2.method675(2);
        int var10 = var2.method675(2);
        int var11 = var2.method662((byte) -106);
        int var12 = var2.method662((byte) -95);
        int var13 = var2.method662((byte) -97);
        int var14 = var2.method662((byte) -114);
        int var15 = var2.method662((byte) -121);
        int var16 = var2.method662((byte) -124);
        int var17 = var2.method662((byte) -106);
        int var18 = var2.method675(2);
        int var19 = var2.method675(2);
        int var20 = var2.method675(2);
        int var21 = var2.method675(2);
        int var22 = var2.method675(2);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2832 = new byte[var11];
            var2.field2053 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2832[var26] = var2.method661(255);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2798 = var9;
        this.field2795 = var10;
        this.field2821 = var11;
        this.field2824 = new int[var9];
        this.field2833 = new int[var9];
        this.field2811 = new int[var9];
        this.field2816 = new int[var10];
        this.field2803 = new int[var10];
        this.field2826 = new int[var10];
        if (var17 == 1) {
            this.field2836 = new int[var9];
        }
        if (var12 == 1) {
            this.field2831 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2840 = new byte[var10];
        } else {
            this.field2804 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2793 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2815 = new int[var10];
        }
        if (var16 == 1) {
            this.field2799 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2812 = new byte[var10];
        }
        this.field2828 = new short[var10];
        if (var11 > 0) {
            this.field2796 = new short[var11];
            this.field2834 = new short[var11];
            this.field2822 = new short[var11];
            if (var24 > 0) {
                this.field2817 = new short[var24];
                this.field2809 = new short[var24];
                this.field2823 = new short[var24];
                this.field2839 = new byte[var24];
                this.field2810 = new byte[var24];
                this.field2797 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2814 = new byte[var25];
                this.field2807 = new byte[var25];
            }
        }
        var2.field2053 = var11;
        var3.field2053 = var44;
        var4.field2053 = var46;
        var5.field2053 = var48;
        var6.field2053 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; var67++) {
            int var81 = var2.method662((byte) -118);
            int var82 = 0;
            if ((var81 & 0x1) != 0) {
                var82 = var3.method697(127);
            }
            int var83 = 0;
            if ((var81 & 0x2) != 0) {
                var83 = var4.method697(127);
            }
            int var84 = 0;
            if ((var81 & 0x4) != 0) {
                var84 = var5.method697(127);
            }
            this.field2824[var67] = var64 + var82;
            this.field2833[var67] = var65 + var83;
            this.field2811[var67] = var66 + var84;
            var64 = this.field2824[var67];
            var65 = this.field2833[var67];
            var66 = this.field2811[var67];
            if (var17 == 1) {
                this.field2836[var67] = var6.method662((byte) -125);
            }
        }
        var2.field2053 = var42;
        var3.field2053 = var31;
        var4.field2053 = var34;
        var5.field2053 = var37;
        var6.field2053 = var35;
        var7.field2053 = var40;
        var8.field2053 = var39;
        for (int var68 = 0; var68 < var10; var68++) {
            this.field2828[var68] = (short) var2.method675(2);
            if (var12 == 1) {
                this.field2831[var68] = var3.method661(255);
            }
            if (var13 == 255) {
                this.field2840[var68] = var4.method661(255);
            }
            if (var14 == 1) {
                this.field2793[var68] = var5.method661(255);
            }
            if (var15 == 1) {
                this.field2815[var68] = var6.method662((byte) -124);
            }
            if (var16 == 1) {
                this.field2799[var68] = (short) (var7.method675(2) - 1);
            }
            if (this.field2812 != null) {
                if (this.field2799[var68] == -1) {
                    this.field2812[var68] = -1;
                } else {
                    this.field2812[var68] = (byte) (var8.method662((byte) -127) - 1);
                }
            }
        }
        var2.field2053 = var33;
        var3.field2053 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; var73++) {
            int var77 = var3.method662((byte) -118);
            if (var77 == 1) {
                var69 = var2.method697(127) + var72;
                var70 = var2.method697(127) + var69;
                var71 = var2.method697(127) + var70;
                var72 = var71;
                this.field2816[var73] = var69;
                this.field2803[var73] = var70;
                this.field2826[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method697(127) + var72;
                var72 = var71;
                this.field2816[var73] = var69;
                this.field2803[var73] = var70;
                this.field2826[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method697(127) + var72;
                var72 = var71;
                this.field2816[var73] = var69;
                this.field2803[var73] = var70;
                this.field2826[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method697(127) + var72;
                var72 = var71;
                this.field2816[var73] = var69;
                this.field2803[var73] = var80;
                this.field2826[var73] = var71;
            }
        }
        var2.field2053 = var50;
        var3.field2053 = var52;
        var4.field2053 = var54;
        var5.field2053 = var56;
        var6.field2053 = var58;
        var7.field2053 = var60;
        for (int var74 = 0; var74 < var11; var74++) {
            int var76 = this.field2832[var74] & 0xFF;
            if (var76 == 0) {
                this.field2796[var74] = (short) var2.method675(2);
                this.field2834[var74] = (short) var2.method675(2);
                this.field2822[var74] = (short) var2.method675(2);
            }
            if (var76 == 1) {
                this.field2796[var74] = (short) var3.method675(2);
                this.field2834[var74] = (short) var3.method675(2);
                this.field2822[var74] = (short) var3.method675(2);
                this.field2817[var74] = (short) var4.method675(2);
                this.field2809[var74] = (short) var4.method675(2);
                this.field2823[var74] = (short) var4.method675(2);
                this.field2839[var74] = var5.method661(255);
                this.field2810[var74] = var6.method661(255);
                this.field2797[var74] = var7.method661(255);
            }
            if (var76 == 2) {
                this.field2796[var74] = (short) var3.method675(2);
                this.field2834[var74] = (short) var3.method675(2);
                this.field2822[var74] = (short) var3.method675(2);
                this.field2817[var74] = (short) var4.method675(2);
                this.field2809[var74] = (short) var4.method675(2);
                this.field2823[var74] = (short) var4.method675(2);
                this.field2839[var74] = var5.method661(255);
                this.field2810[var74] = var6.method661(255);
                this.field2797[var74] = var7.method661(255);
                this.field2814[var74] = var7.method661(255);
                this.field2807[var74] = var7.method661(255);
            }
            if (var76 == 3) {
                this.field2796[var74] = (short) var3.method675(2);
                this.field2834[var74] = (short) var3.method675(2);
                this.field2822[var74] = (short) var3.method675(2);
                this.field2817[var74] = (short) var4.method675(2);
                this.field2809[var74] = (short) var4.method675(2);
                this.field2823[var74] = (short) var4.method675(2);
                this.field2839[var74] = var5.method661(255);
                this.field2810[var74] = var6.method661(255);
                this.field2797[var74] = var7.method661(255);
            }
        }
        var2.field2053 = var62;
        int var75 = var2.method662((byte) -112);
        if (var75 != 0) {
            var2.method675(2);
            var2.method675(2);
            var2.method675(2);
            var2.method710(28908);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lab;II)Lo;")
    public static final class148 method939(class3 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method33(-29616, arg1, arg2);
        return var3 == null ? null : new class148(var3);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()V")
    public final void method940() {
        if (this.field2837 != null) {
            return;
        }
        this.field2837 = new class79[this.field2798];
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2837[var1] = new class79();
        }
        for (int var2 = 0; var2 < this.field2795; var2++) {
            int var3 = this.field2816[var2];
            int var4 = this.field2803[var2];
            int var5 = this.field2826[var2];
            int var6 = this.field2824[var4] - this.field2824[var3];
            int var7 = this.field2833[var4] - this.field2833[var3];
            int var8 = this.field2811[var4] - this.field2811[var3];
            int var9 = this.field2824[var5] - this.field2824[var3];
            int var10 = this.field2833[var5] - this.field2833[var3];
            int var11 = this.field2811[var5] - this.field2811[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2831 == null) {
                var19 = 0;
            } else {
                var19 = this.field2831[var2];
            }
            if (var19 == 0) {
                class79 var20 = this.field2837[var3];
                var20.field1521 += var16;
                var20.field1526 += var17;
                var20.field1525 += var18;
                var20.field1524++;
                class79 var21 = this.field2837[var4];
                var21.field1521 += var16;
                var21.field1526 += var17;
                var21.field1525 += var18;
                var21.field1524++;
                class79 var22 = this.field2837[var5];
                var22.field1521 += var16;
                var22.field1526 += var17;
                var22.field1525 += var18;
                var22.field1524++;
            } else if (var19 == 1) {
                if (this.field2820 == null) {
                    this.field2820 = new class190[this.field2795];
                }
                class190 var23 = this.field2820[var2] = new class190();
                var23.field3508 = var16;
                var23.field3506 = var17;
                var23.field3501 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()V")
    public final void method941() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2811[var1] = -this.field2811[var1];
        }
        for (int var2 = 0; var2 < this.field2795; var2++) {
            int var3 = this.field2816[var2];
            this.field2816[var2] = this.field2826[var2];
            this.field2826[var2] = var3;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Lob;")
    public final class150 method942(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class150(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "()V")
    public final void method943() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            int var2 = this.field2824[var1];
            this.field2824[var1] = this.field2811[var1];
            this.field2811[var1] = -var2;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III)V")
    public final void method944(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2798; var4++) {
            this.field2824[var4] = this.field2824[var4] * arg0 / 128;
            this.field2833[var4] = this.field2833[var4] * arg1 / 128;
            this.field2811[var4] = this.field2811[var4] * arg2 / 128;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "()V")
    public static void method945() {
        field2841 = null;
        field2835 = null;
        field2829 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "()V")
    private final void method946() {
        this.field2837 = null;
        this.field2808 = null;
        this.field2820 = null;
        this.field2838 = false;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "()V")
    public final void method947() {
        int var10002;
        if (this.field2836 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2798; var3++) {
                int var7 = this.field2836[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2794 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2794[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2798) {
                int var6 = this.field2836[var5];
                this.field2794[var6][var1[var6]++] = var5++;
            }
            this.field2836 = null;
        }
        if (this.field2815 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2795; var10++) {
            int var14 = this.field2815[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2813 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2813[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2795) {
            int var13 = this.field2815[var12];
            this.field2813[var13][var8[var13]++] = var12++;
        }
        this.field2815 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(SS)V")
    public final void method948(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2795; var3++) {
            if (this.field2828[var3] == arg0) {
                this.field2828[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIII)Lee;")
    public final class49 method949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class150(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "([B)V")
    private final void method950(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class109 var4 = new class109(arg0);
        class109 var5 = new class109(arg0);
        class109 var6 = new class109(arg0);
        class109 var7 = new class109(arg0);
        class109 var8 = new class109(arg0);
        var4.field2053 = arg0.length - 18;
        int var9 = var4.method675(2);
        int var10 = var4.method675(2);
        int var11 = var4.method662((byte) -120);
        int var12 = var4.method662((byte) -117);
        int var13 = var4.method662((byte) -93);
        int var14 = var4.method662((byte) -108);
        int var15 = var4.method662((byte) -113);
        int var16 = var4.method662((byte) -90);
        int var17 = var4.method675(2);
        int var18 = var4.method675(2);
        int var19 = var4.method675(2);
        int var20 = var4.method675(2);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2798 = var9;
        this.field2795 = var10;
        this.field2821 = var11;
        this.field2824 = new int[var9];
        this.field2833 = new int[var9];
        this.field2811 = new int[var9];
        this.field2816 = new int[var10];
        this.field2803 = new int[var10];
        this.field2826 = new int[var10];
        if (var11 > 0) {
            this.field2832 = new byte[var11];
            this.field2796 = new short[var11];
            this.field2834 = new short[var11];
            this.field2822 = new short[var11];
        }
        if (var16 == 1) {
            this.field2836 = new int[var9];
        }
        if (var12 == 1) {
            this.field2831 = new byte[var10];
            this.field2812 = new byte[var10];
            this.field2799 = new short[var10];
        }
        if (var13 == 255) {
            this.field2840 = new byte[var10];
        } else {
            this.field2804 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2793 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2815 = new int[var10];
        }
        this.field2828 = new short[var10];
        var4.field2053 = var21;
        var5.field2053 = var36;
        var6.field2053 = var38;
        var7.field2053 = var40;
        var8.field2053 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method662((byte) -118);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method697(127);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method697(127);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method697(127);
            }
            this.field2824[var46] = var43 + var63;
            this.field2833[var46] = var44 + var64;
            this.field2811[var46] = var45 + var65;
            var43 = this.field2824[var46];
            var44 = this.field2833[var46];
            var45 = this.field2811[var46];
            if (var16 == 1) {
                this.field2836[var46] = var8.method662((byte) -83);
            }
        }
        var4.field2053 = var32;
        var5.field2053 = var28;
        var6.field2053 = var26;
        var7.field2053 = var30;
        var8.field2053 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2828[var47] = (short) var4.method675(2);
            if (var12 == 1) {
                int var61 = var5.method662((byte) -124);
                if ((var61 & 0x1) == 1) {
                    this.field2831[var47] = 1;
                    var2 = true;
                } else {
                    this.field2831[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2812[var47] = (byte) (var61 >> 2);
                    this.field2799[var47] = this.field2828[var47];
                    this.field2828[var47] = 127;
                    if (this.field2799[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2812[var47] = -1;
                    this.field2799[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2840[var47] = var6.method661(255);
            }
            if (var14 == 1) {
                this.field2793[var47] = var7.method661(255);
            }
            if (var15 == 1) {
                this.field2815[var47] = var8.method662((byte) -124);
            }
        }
        var4.field2053 = var25;
        var5.field2053 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method662((byte) -93);
            if (var57 == 1) {
                var48 = var4.method697(127) + var51;
                var49 = var4.method697(127) + var48;
                var50 = var4.method697(127) + var49;
                var51 = var50;
                this.field2816[var52] = var48;
                this.field2803[var52] = var49;
                this.field2826[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method697(127) + var51;
                var51 = var50;
                this.field2816[var52] = var48;
                this.field2803[var52] = var49;
                this.field2826[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method697(127) + var51;
                var51 = var50;
                this.field2816[var52] = var48;
                this.field2803[var52] = var49;
                this.field2826[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method697(127) + var51;
                var51 = var50;
                this.field2816[var52] = var48;
                this.field2803[var52] = var60;
                this.field2826[var52] = var50;
            }
        }
        var4.field2053 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2832[var53] = 0;
            this.field2796[var53] = (short) var4.method675(2);
            this.field2834[var53] = (short) var4.method675(2);
            this.field2822[var53] = (short) var4.method675(2);
        }
        if (this.field2812 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2812[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2796[var56] & 0xFFFF) == this.field2816[var55] && (this.field2834[var56] & 0xFFFF) == this.field2803[var55] && (this.field2822[var56] & 0xFFFF) == this.field2826[var55]) {
                        this.field2812[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2812 = null;
            }
        }
        if (!var3) {
            this.field2799 = null;
        }
        if (!var2) {
            this.field2831 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lo;I)I")
    private final int method951(class148 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2824[arg1];
        int var5 = arg0.field2833[arg1];
        int var6 = arg0.field2811[arg1];
        for (int var7 = 0; var7 < this.field2798; var7++) {
            if (this.field2824[var7] == var4 && this.field2833[var7] == var5 && this.field2811[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2824[this.field2798] = var4;
            this.field2833[this.field2798] = var5;
            this.field2811[this.field2798] = var6;
            if (arg0.field2836 != null) {
                this.field2836[this.field2798] = arg0.field2836[arg1];
            }
            var3 = this.field2798++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(SS)V")
    public final void method952(short arg0, short arg1) {
        if (this.field2799 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2795; var3++) {
            if (this.field2799[var3] == arg0) {
                this.field2799[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Le;")
    public final class44 method329(int arg0, int arg1, int arg2) {
        return this.method949(this.field2830, this.field2805, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "()V")
    public final void method953() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            int var2 = this.field2811[var1];
            this.field2811[var1] = this.field2824[var1];
            this.field2824[var1] = -var2;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method954(int arg0) {
        int var2 = field2829[arg0];
        int var3 = field2801[arg0];
        for (int var4 = 0; var4 < this.field2798; var4++) {
            int var5 = this.field2824[var4] * var3 + this.field2811[var4] * var2 >> 16;
            this.field2811[var4] = this.field2811[var4] * var3 - this.field2824[var4] * var2 >> 16;
            this.field2824[var4] = var5;
        }
        this.method946();
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "()V")
    public final void method955() {
        this.field2836 = null;
        this.field2815 = null;
        this.field2794 = null;
        this.field2813 = null;
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "()V")
    private final void method956() {
        if (this.field2838) {
            return;
        }
        this.field2838 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2798; var7++) {
            int var8 = this.field2824[var7];
            int var9 = this.field2833[var7];
            int var10 = this.field2811[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2800 = (short) var1;
        this.field2819 = (short) var4;
        this.field2802 = (short) var2;
        this.field2827 = (short) var5;
        this.field2818 = (short) var3;
        this.field2825 = (short) var6;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    private class148() {
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
    private class148(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method938(arg0);
        } else {
            this.method950(arg0);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([Lo;I)V")
    public class148(class148[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2798 = 0;
        this.field2795 = 0;
        this.field2821 = 0;
        this.field2804 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class148 var15 = arg0[var9];
            if (var15 != null) {
                this.field2798 += var15.field2798;
                this.field2795 += var15.field2795;
                this.field2821 += var15.field2821;
                if (var15.field2840 == null) {
                    if (this.field2804 == -1) {
                        this.field2804 = var15.field2804;
                    }
                    if (this.field2804 != var15.field2804) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2831 != null;
                var5 |= var15.field2793 != null;
                var6 |= var15.field2815 != null;
                var7 |= var15.field2799 != null;
                var8 |= var15.field2812 != null;
            }
        }
        this.field2824 = new int[this.field2798];
        this.field2833 = new int[this.field2798];
        this.field2811 = new int[this.field2798];
        this.field2836 = new int[this.field2798];
        this.field2816 = new int[this.field2795];
        this.field2803 = new int[this.field2795];
        this.field2826 = new int[this.field2795];
        if (var3) {
            this.field2831 = new byte[this.field2795];
        }
        if (var4) {
            this.field2840 = new byte[this.field2795];
        }
        if (var5) {
            this.field2793 = new byte[this.field2795];
        }
        if (var6) {
            this.field2815 = new int[this.field2795];
        }
        if (var7) {
            this.field2799 = new short[this.field2795];
        }
        if (var8) {
            this.field2812 = new byte[this.field2795];
        }
        this.field2828 = new short[this.field2795];
        if (this.field2821 > 0) {
            this.field2832 = new byte[this.field2821];
            this.field2796 = new short[this.field2821];
            this.field2834 = new short[this.field2821];
            this.field2822 = new short[this.field2821];
            this.field2817 = new short[this.field2821];
            this.field2809 = new short[this.field2821];
            this.field2823 = new short[this.field2821];
            this.field2839 = new byte[this.field2821];
            this.field2810 = new byte[this.field2821];
            this.field2797 = new byte[this.field2821];
            this.field2814 = new byte[this.field2821];
            this.field2807 = new byte[this.field2821];
        }
        this.field2798 = 0;
        this.field2795 = 0;
        this.field2821 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class148 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2795; var12++) {
                    if (var3 && var11.field2831 != null) {
                        this.field2831[this.field2795] = var11.field2831[var12];
                    }
                    if (var4) {
                        if (var11.field2840 == null) {
                            this.field2840[this.field2795] = var11.field2804;
                        } else {
                            this.field2840[this.field2795] = var11.field2840[var12];
                        }
                    }
                    if (var5 && var11.field2793 != null) {
                        this.field2793[this.field2795] = var11.field2793[var12];
                    }
                    if (var6 && var11.field2815 != null) {
                        this.field2815[this.field2795] = var11.field2815[var12];
                    }
                    if (var7) {
                        if (var11.field2799 == null) {
                            this.field2799[this.field2795] = -1;
                        } else {
                            this.field2799[this.field2795] = var11.field2799[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2812 == null || var11.field2812[var12] == -1) {
                            this.field2812[this.field2795] = -1;
                        } else {
                            this.field2812[this.field2795] = (byte) (var11.field2812[var12] + this.field2821);
                        }
                    }
                    this.field2828[this.field2795] = var11.field2828[var12];
                    this.field2816[this.field2795] = this.method951(var11, var11.field2816[var12]);
                    this.field2803[this.field2795] = this.method951(var11, var11.field2803[var12]);
                    this.field2826[this.field2795] = this.method951(var11, var11.field2826[var12]);
                    this.field2795++;
                }
                for (int var13 = 0; var13 < var11.field2821; var13++) {
                    byte var14 = this.field2832[this.field2821] = var11.field2832[var13];
                    if (var14 == 0) {
                        this.field2796[this.field2821] = (short) this.method951(var11, var11.field2796[var13]);
                        this.field2834[this.field2821] = (short) this.method951(var11, var11.field2834[var13]);
                        this.field2822[this.field2821] = (short) this.method951(var11, var11.field2822[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2796[this.field2821] = var11.field2796[var13];
                        this.field2834[this.field2821] = var11.field2834[var13];
                        this.field2822[this.field2821] = var11.field2822[var13];
                        this.field2817[this.field2821] = var11.field2817[var13];
                        this.field2809[this.field2821] = var11.field2809[var13];
                        this.field2823[this.field2821] = var11.field2823[var13];
                        this.field2839[this.field2821] = var11.field2839[var13];
                        this.field2810[this.field2821] = var11.field2810[var13];
                        this.field2797[this.field2821] = var11.field2797[var13];
                    }
                    if (var14 == 2) {
                        this.field2814[this.field2821] = var11.field2814[var13];
                        this.field2807[this.field2821] = var11.field2807[var13];
                    }
                    this.field2821++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lo;ZZZZ)V")
    public class148(class148 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2798 = arg0.field2798;
        this.field2795 = arg0.field2795;
        this.field2821 = arg0.field2821;
        if (arg1) {
            this.field2824 = arg0.field2824;
            this.field2833 = arg0.field2833;
            this.field2811 = arg0.field2811;
        } else {
            this.field2824 = new int[this.field2798];
            this.field2833 = new int[this.field2798];
            this.field2811 = new int[this.field2798];
            for (int var6 = 0; var6 < this.field2798; var6++) {
                this.field2824[var6] = arg0.field2824[var6];
                this.field2833[var6] = arg0.field2833[var6];
                this.field2811[var6] = arg0.field2811[var6];
            }
        }
        if (arg2) {
            this.field2828 = arg0.field2828;
        } else {
            this.field2828 = new short[this.field2795];
            for (int var7 = 0; var7 < this.field2795; var7++) {
                this.field2828[var7] = arg0.field2828[var7];
            }
        }
        if (arg3 || arg0.field2799 == null) {
            this.field2799 = arg0.field2799;
        } else {
            this.field2799 = new short[this.field2795];
            for (int var8 = 0; var8 < this.field2795; var8++) {
                this.field2799[var8] = arg0.field2799[var8];
            }
        }
        if (arg4) {
            this.field2793 = arg0.field2793;
        } else {
            this.field2793 = new byte[this.field2795];
            if (arg0.field2793 == null) {
                for (int var9 = 0; var9 < this.field2795; var9++) {
                    this.field2793[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2795; var10++) {
                    this.field2793[var10] = arg0.field2793[var10];
                }
            }
        }
        this.field2816 = arg0.field2816;
        this.field2803 = arg0.field2803;
        this.field2826 = arg0.field2826;
        this.field2831 = arg0.field2831;
        this.field2840 = arg0.field2840;
        this.field2812 = arg0.field2812;
        this.field2804 = arg0.field2804;
        this.field2832 = arg0.field2832;
        this.field2796 = arg0.field2796;
        this.field2834 = arg0.field2834;
        this.field2822 = arg0.field2822;
        this.field2817 = arg0.field2817;
        this.field2809 = arg0.field2809;
        this.field2823 = arg0.field2823;
        this.field2839 = arg0.field2839;
        this.field2810 = arg0.field2810;
        this.field2797 = arg0.field2797;
        this.field2814 = arg0.field2814;
        this.field2807 = arg0.field2807;
        this.field2836 = arg0.field2836;
        this.field2815 = arg0.field2815;
        this.field2794 = arg0.field2794;
        this.field2813 = arg0.field2813;
        this.field2837 = arg0.field2837;
        this.field2820 = arg0.field2820;
        this.field2808 = arg0.field2808;
        this.field2830 = arg0.field2830;
        this.field2805 = arg0.field2805;
    }
}
