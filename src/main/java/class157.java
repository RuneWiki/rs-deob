import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class157 extends class95 {

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public int field2797 = 0;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
    private boolean field2796 = false;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public int field2798 = 0;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "B")
    public byte field2825 = 0;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "[I")
    public int[] field2843;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
    public int[] field2799;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "[I")
    public int[] field2806;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "[I")
    private int[] field2816;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "[I")
    public int[] field2839;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
    public int[] field2804;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "[I")
    public int[] field2807;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "[B")
    public byte[] field2828;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[B")
    public byte[] field2831;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "[B")
    public byte[] field2817;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "[S")
    public short[] field2826;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "[S")
    public short[] field2841;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[B")
    public byte[] field2813;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "[B")
    public byte[] field2844;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "[S")
    public short[] field2803;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "[S")
    public short[] field2822;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "[S")
    public short[] field2842;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[S")
    private short[] field2808;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "[S")
    private short[] field2812;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[S")
    private short[] field2820;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[B")
    private byte[] field2801;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "[B")
    private byte[] field2834;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "[B")
    private byte[] field2827;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "[B")
    private byte[] field2835;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "[B")
    private byte[] field2830;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "[[I")
    public int[][] field2829;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[[I")
    public int[][] field2805;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[Lee;")
    public class268[] field2819;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[Lwg;")
    public class170[] field2802;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "[Lee;")
    public class268[] field2800;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "S")
    public short field2821;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "S")
    public short field2823;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[I")
    private static int[] field2815 = new int[10000];

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "[I")
    private static int[] field2811 = class150.field2670;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "[I")
    private static int[] field2810 = new int[10000];

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[I")
    private static int[] field2840 = class150.field2676;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    private static int field2838 = 0;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "S")
    private short field2814;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "S")
    private short field2818;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "S")
    private short field2824;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "S")
    private short field2832;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "S")
    private short field2833;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "S")
    private short field2836;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[IIIIII)V")
    private final void method1089(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1090(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1090(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1090(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1090(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1109(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1098(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1103(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[III)I")
    private static final int method1090(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
    public final void method1091() {
        int var10002;
        if (this.field2816 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2798; var3++) {
                int var7 = this.field2816[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2829 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2829[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2798) {
                int var6 = this.field2816[var5];
                this.field2829[var6][var1[var6]++] = var5++;
            }
            this.field2816 = null;
        }
        if (this.field2837 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2797; var10++) {
            int var14 = this.field2837[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2805 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2805[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2797) {
            int var13 = this.field2837[var12];
            this.field2805[var13][var8[var13]++] = var12++;
        }
        this.field2837 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(SS)V")
    public final void method1092(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2797; var3++) {
            if (this.field2826[var3] == arg0) {
                this.field2826[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIBSB)I")
    public final int method1093(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2839[this.field2797] = arg0;
        this.field2804[this.field2797] = arg1;
        this.field2807[this.field2797] = arg2;
        this.field2828[this.field2797] = arg3;
        this.field2813[this.field2797] = -1;
        this.field2826[this.field2797] = arg4;
        this.field2841[this.field2797] = -1;
        this.field2817[this.field2797] = arg5;
        return this.field2797++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lmb;I)I")
    private final int method1094(class157 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2843[arg1];
        int var5 = arg0.field2799[arg1];
        int var6 = arg0.field2806[arg1];
        for (int var7 = 0; var7 < this.field2798; var7++) {
            if (this.field2843[var7] == var4 && this.field2799[var7] == var5 && this.field2806[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2843[this.field2798] = var4;
            this.field2799[this.field2798] = var5;
            this.field2806[this.field2798] = var6;
            if (arg0.field2816 != null) {
                this.field2816[this.field2798] = arg0.field2816[arg1];
            }
            var3 = this.field2798++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()Lmb;")
    public final class157 method1095() {
        class157 var1 = new class157();
        if (this.field2828 != null) {
            var1.field2828 = new byte[this.field2797];
            for (int var2 = 0; var2 < this.field2797; var2++) {
                var1.field2828[var2] = this.field2828[var2];
            }
        }
        var1.field2798 = this.field2798;
        var1.field2797 = this.field2797;
        var1.field2809 = this.field2809;
        var1.field2843 = this.field2843;
        var1.field2799 = this.field2799;
        var1.field2806 = this.field2806;
        var1.field2839 = this.field2839;
        var1.field2804 = this.field2804;
        var1.field2807 = this.field2807;
        var1.field2831 = this.field2831;
        var1.field2817 = this.field2817;
        var1.field2813 = this.field2813;
        var1.field2826 = this.field2826;
        var1.field2841 = this.field2841;
        var1.field2825 = this.field2825;
        var1.field2844 = this.field2844;
        var1.field2803 = this.field2803;
        var1.field2822 = this.field2822;
        var1.field2842 = this.field2842;
        var1.field2808 = this.field2808;
        var1.field2812 = this.field2812;
        var1.field2820 = this.field2820;
        var1.field2801 = this.field2801;
        var1.field2834 = this.field2834;
        var1.field2827 = this.field2827;
        var1.field2835 = this.field2835;
        var1.field2830 = this.field2830;
        var1.field2816 = this.field2816;
        var1.field2837 = this.field2837;
        var1.field2829 = this.field2829;
        var1.field2805 = this.field2805;
        var1.field2819 = this.field2819;
        var1.field2802 = this.field2802;
        var1.field2821 = this.field2821;
        var1.field2823 = this.field2823;
        return var1;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
    public final void method1096() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2806[var1] = -this.field2806[var1];
        }
        for (int var2 = 0; var2 < this.field2797; var2++) {
            int var3 = this.field2839[var2];
            this.field2839[var2] = this.field2807[var2];
            this.field2807[var2] = var3;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
    public final void method1097(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2811[arg2];
            int var5 = field2840[arg2];
            for (int var6 = 0; var6 < this.field2798; var6++) {
                int var7 = this.field2843[var6] * var5 + this.field2799[var6] * var4 >> 16;
                this.field2799[var6] = this.field2799[var6] * var5 - this.field2843[var6] * var4 >> 16;
                this.field2843[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2811[arg0];
            int var9 = field2840[arg0];
            for (int var10 = 0; var10 < this.field2798; var10++) {
                int var11 = this.field2799[var10] * var9 - this.field2806[var10] * var8 >> 16;
                this.field2806[var10] = this.field2806[var10] * var9 + this.field2799[var10] * var8 >> 16;
                this.field2799[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2811[arg1];
        int var13 = field2840[arg1];
        for (int var14 = 0; var14 < this.field2798; var14++) {
            int var15 = this.field2843[var14] * var13 + this.field2806[var14] * var12 >> 16;
            this.field2806[var14] = this.field2806[var14] * var13 - this.field2843[var14] * var12 >> 16;
            this.field2843[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    private final void method1098(int arg0) {
        int var2 = field2811[arg0];
        int var3 = field2840[arg0];
        for (int var4 = 0; var4 < this.field2798; var4++) {
            int var5 = this.field2843[var4] * var3 + this.field2799[var4] * var2 >> 16;
            this.field2799[var4] = this.field2799[var4] * var3 - this.field2843[var4] * var2 >> 16;
            this.field2843[var4] = var5;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(SS)V")
    public final void method1099(short arg0, short arg1) {
        if (this.field2841 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2797; var3++) {
            if (this.field2841[var3] == arg0) {
                this.field2841[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)I")
    public final int method1100(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2798; var4++) {
            if (this.field2843[var4] == arg0 && this.field2799[var4] == arg1 && this.field2806[var4] == arg2) {
                return var4;
            }
        }
        this.field2843[this.field2798] = arg0;
        this.field2799[this.field2798] = arg1;
        this.field2806[this.field2798] = arg2;
        return this.field2798++;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()V")
    public final void method1101() {
        if (this.field2819 != null) {
            return;
        }
        this.field2819 = new class268[this.field2798];
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2819[var1] = new class268();
        }
        for (int var2 = 0; var2 < this.field2797; var2++) {
            int var3 = this.field2839[var2];
            int var4 = this.field2804[var2];
            int var5 = this.field2807[var2];
            int var6 = this.field2843[var4] - this.field2843[var3];
            int var7 = this.field2799[var4] - this.field2799[var3];
            int var8 = this.field2806[var4] - this.field2806[var3];
            int var9 = this.field2843[var5] - this.field2843[var3];
            int var10 = this.field2799[var5] - this.field2799[var3];
            int var11 = this.field2806[var5] - this.field2806[var3];
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
            if (this.field2828 == null) {
                var19 = 0;
            } else {
                var19 = this.field2828[var2];
            }
            if (var19 == 0) {
                class268 var20 = this.field2819[var3];
                var20.field4579 += var16;
                var20.field4581 += var17;
                var20.field4570 += var18;
                var20.field4569++;
                class268 var21 = this.field2819[var4];
                var21.field4579 += var16;
                var21.field4581 += var17;
                var21.field4570 += var18;
                var21.field4569++;
                class268 var22 = this.field2819[var5];
                var22.field4579 += var16;
                var22.field4581 += var17;
                var22.field4570 += var18;
                var22.field4569++;
            } else if (var19 == 1) {
                if (this.field2802 == null) {
                    this.field2802 = new class170[this.field2797];
                }
                class170 var23 = this.field2802[var2] = new class170();
                var23.field2980 = var16;
                var23.field2988 = var17;
                var23.field2977 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()Z")
    public final boolean method704() {
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(III)V")
    public final void method1102(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2798; var4++) {
            this.field2843[var4] = this.field2843[var4] * arg0 / 128;
            this.field2799[var4] = this.field2799[var4] * arg1 / 128;
            this.field2806[var4] = this.field2806[var4] * arg2 / 128;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(III)V")
    public final void method1103(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2798; var4++) {
            this.field2843[var4] += arg0;
            this.field2799[var4] += arg1;
            this.field2806[var4] += arg2;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()I")
    public final int method176() {
        if (!this.field2796) {
            this.method1105();
        }
        return this.field2832;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method1104(int arg0) {
        int var2 = field2811[arg0];
        int var3 = field2840[arg0];
        for (int var4 = 0; var4 < this.field2798; var4++) {
            int var5 = this.field2843[var4] * var3 + this.field2806[var4] * var2 >> 16;
            this.field2806[var4] = this.field2806[var4] * var3 - this.field2843[var4] * var2 >> 16;
            this.field2843[var4] = var5;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()V")
    private final void method1105() {
        if (this.field2796) {
            return;
        }
        this.field2796 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2798; var7++) {
            int var8 = this.field2843[var7];
            int var9 = this.field2799[var7];
            int var10 = this.field2806[var7];
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
        this.field2818 = (short) var1;
        this.field2836 = (short) var4;
        this.field2832 = (short) var2;
        this.field2833 = (short) var5;
        this.field2814 = (short) var3;
        this.field2824 = (short) var6;
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "()V")
    private final void method1106() {
        this.field2819 = null;
        this.field2800 = null;
        this.field2802 = null;
        this.field2796 = false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
    private final void method1107(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class32 var4 = new class32(arg0);
        class32 var5 = new class32(arg0);
        class32 var6 = new class32(arg0);
        class32 var7 = new class32(arg0);
        class32 var8 = new class32(arg0);
        var4.field647 = arg0.length - 18;
        int var9 = var4.method339(-16777216);
        int var10 = var4.method339(-16777216);
        int var11 = var4.method316((byte) 119);
        int var12 = var4.method316((byte) 119);
        int var13 = var4.method316((byte) 8);
        int var14 = var4.method316((byte) -57);
        int var15 = var4.method316((byte) -89);
        int var16 = var4.method316((byte) 121);
        int var17 = var4.method339(-16777216);
        int var18 = var4.method339(-16777216);
        int var19 = var4.method339(-16777216);
        int var20 = var4.method339(-16777216);
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
        this.field2797 = var10;
        this.field2809 = var11;
        this.field2843 = new int[var9];
        this.field2799 = new int[var9];
        this.field2806 = new int[var9];
        this.field2839 = new int[var10];
        this.field2804 = new int[var10];
        this.field2807 = new int[var10];
        if (var11 > 0) {
            this.field2844 = new byte[var11];
            this.field2803 = new short[var11];
            this.field2822 = new short[var11];
            this.field2842 = new short[var11];
        }
        if (var16 == 1) {
            this.field2816 = new int[var9];
        }
        if (var12 == 1) {
            this.field2828 = new byte[var10];
            this.field2813 = new byte[var10];
            this.field2841 = new short[var10];
        }
        if (var13 == 255) {
            this.field2831 = new byte[var10];
        } else {
            this.field2825 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2817 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2837 = new int[var10];
        }
        this.field2826 = new short[var10];
        var4.field647 = var21;
        var5.field647 = var36;
        var6.field647 = var38;
        var7.field647 = var40;
        var8.field647 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method316((byte) -42);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method323(85);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method323(95);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method323(105);
            }
            this.field2843[var46] = var43 + var63;
            this.field2799[var46] = var44 + var64;
            this.field2806[var46] = var45 + var65;
            var43 = this.field2843[var46];
            var44 = this.field2799[var46];
            var45 = this.field2806[var46];
            if (var16 == 1) {
                this.field2816[var46] = var8.method316((byte) -9);
            }
        }
        var4.field647 = var32;
        var5.field647 = var28;
        var6.field647 = var26;
        var7.field647 = var30;
        var8.field647 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2826[var47] = (short) var4.method339(-16777216);
            if (var12 == 1) {
                int var61 = var5.method316((byte) 2);
                if ((var61 & 0x1) == 1) {
                    this.field2828[var47] = 1;
                    var2 = true;
                } else {
                    this.field2828[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2813[var47] = (byte) (var61 >> 2);
                    this.field2841[var47] = this.field2826[var47];
                    this.field2826[var47] = 127;
                    if (this.field2841[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2813[var47] = -1;
                    this.field2841[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2831[var47] = var6.method325(-96);
            }
            if (var14 == 1) {
                this.field2817[var47] = var7.method325(-105);
            }
            if (var15 == 1) {
                this.field2837[var47] = var8.method316((byte) -89);
            }
        }
        var4.field647 = var25;
        var5.field647 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method316((byte) -26);
            if (var57 == 1) {
                var48 = var4.method323(86) + var51;
                var49 = var4.method323(26) + var48;
                var50 = var4.method323(56) + var49;
                var51 = var50;
                this.field2839[var52] = var48;
                this.field2804[var52] = var49;
                this.field2807[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method323(24) + var51;
                var51 = var50;
                this.field2839[var52] = var48;
                this.field2804[var52] = var49;
                this.field2807[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method323(99) + var51;
                var51 = var50;
                this.field2839[var52] = var48;
                this.field2804[var52] = var49;
                this.field2807[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method323(108) + var51;
                var51 = var50;
                this.field2839[var52] = var48;
                this.field2804[var52] = var60;
                this.field2807[var52] = var50;
            }
        }
        var4.field647 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2844[var53] = 0;
            this.field2803[var53] = (short) var4.method339(-16777216);
            this.field2822[var53] = (short) var4.method339(-16777216);
            this.field2842[var53] = (short) var4.method339(-16777216);
        }
        if (this.field2813 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2813[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2803[var56] & 0xFFFF) == this.field2839[var55] && (this.field2822[var56] & 0xFFFF) == this.field2804[var55] && (this.field2842[var56] & 0xFFFF) == this.field2807[var55]) {
                        this.field2813[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2813 = null;
            }
        }
        if (!var3) {
            this.field2841 = null;
        }
        if (!var2) {
            this.field2828 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "()V")
    public final void method1108() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            int var2 = this.field2806[var1];
            this.field2806[var1] = this.field2843[var1];
            this.field2843[var1] = -var2;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    private final void method1109(int arg0) {
        int var2 = field2811[arg0];
        int var3 = field2840[arg0];
        for (int var4 = 0; var4 < this.field2798; var4++) {
            int var5 = this.field2799[var4] * var3 - this.field2806[var4] * var2 >> 16;
            this.field2806[var4] = this.field2806[var4] * var3 + this.field2799[var4] * var2 >> 16;
            this.field2799[var4] = var5;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIII)Lqk;")
    public final class201 method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class18(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "([B)V")
    private final void method1111(byte[] arg0) {
        class32 var2 = new class32(arg0);
        class32 var3 = new class32(arg0);
        class32 var4 = new class32(arg0);
        class32 var5 = new class32(arg0);
        class32 var6 = new class32(arg0);
        class32 var7 = new class32(arg0);
        class32 var8 = new class32(arg0);
        var2.field647 = arg0.length - 23;
        int var9 = var2.method339(-16777216);
        int var10 = var2.method339(-16777216);
        int var11 = var2.method316((byte) -93);
        int var12 = var2.method316((byte) 97);
        int var13 = var2.method316((byte) 123);
        int var14 = var2.method316((byte) 126);
        int var15 = var2.method316((byte) -10);
        int var16 = var2.method316((byte) 109);
        int var17 = var2.method316((byte) -1);
        int var18 = var2.method339(-16777216);
        int var19 = var2.method339(-16777216);
        int var20 = var2.method339(-16777216);
        int var21 = var2.method339(-16777216);
        int var22 = var2.method339(-16777216);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2844 = new byte[var11];
            var2.field647 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2844[var26] = var2.method325(-119);
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
        this.field2797 = var10;
        this.field2809 = var11;
        this.field2843 = new int[var9];
        this.field2799 = new int[var9];
        this.field2806 = new int[var9];
        this.field2839 = new int[var10];
        this.field2804 = new int[var10];
        this.field2807 = new int[var10];
        if (var17 == 1) {
            this.field2816 = new int[var9];
        }
        if (var12 == 1) {
            this.field2828 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2831 = new byte[var10];
        } else {
            this.field2825 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2817 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2837 = new int[var10];
        }
        if (var16 == 1) {
            this.field2841 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2813 = new byte[var10];
        }
        this.field2826 = new short[var10];
        if (var11 > 0) {
            this.field2803 = new short[var11];
            this.field2822 = new short[var11];
            this.field2842 = new short[var11];
            if (var24 > 0) {
                this.field2808 = new short[var24];
                this.field2812 = new short[var24];
                this.field2820 = new short[var24];
                this.field2801 = new byte[var24];
                this.field2834 = new byte[var24];
                this.field2827 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2835 = new byte[var25];
                this.field2830 = new byte[var25];
            }
        }
        var2.field647 = var11;
        var3.field647 = var44;
        var4.field647 = var46;
        var5.field647 = var48;
        var6.field647 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method316((byte) 116);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method323(67);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method323(63);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method323(117);
            }
            this.field2843[var66] = var63 + var80;
            this.field2799[var66] = var64 + var81;
            this.field2806[var66] = var65 + var82;
            var63 = this.field2843[var66];
            var64 = this.field2799[var66];
            var65 = this.field2806[var66];
            if (var17 == 1) {
                this.field2816[var66] = var6.method316((byte) -58);
            }
        }
        var2.field647 = var42;
        var3.field647 = var31;
        var4.field647 = var34;
        var5.field647 = var37;
        var6.field647 = var35;
        var7.field647 = var40;
        var8.field647 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2826[var67] = (short) var2.method339(-16777216);
            if (var12 == 1) {
                this.field2828[var67] = var3.method325(-103);
            }
            if (var13 == 255) {
                this.field2831[var67] = var4.method325(63);
            }
            if (var14 == 1) {
                this.field2817[var67] = var5.method325(-95);
            }
            if (var15 == 1) {
                this.field2837[var67] = var6.method316((byte) -113);
            }
            if (var16 == 1) {
                this.field2841[var67] = (short) (var7.method339(-16777216) - 1);
            }
            if (this.field2813 != null) {
                if (this.field2841[var67] == -1) {
                    this.field2813[var67] = -1;
                } else {
                    this.field2813[var67] = (byte) (var8.method316((byte) 122) - 1);
                }
            }
        }
        var2.field647 = var33;
        var3.field647 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method316((byte) 105);
            if (var75 == 1) {
                var68 = var2.method323(123) + var71;
                var69 = var2.method323(44) + var68;
                var70 = var2.method323(28) + var69;
                var71 = var70;
                this.field2839[var72] = var68;
                this.field2804[var72] = var69;
                this.field2807[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method323(54) + var71;
                var71 = var70;
                this.field2839[var72] = var68;
                this.field2804[var72] = var69;
                this.field2807[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method323(41) + var71;
                var71 = var70;
                this.field2839[var72] = var68;
                this.field2804[var72] = var69;
                this.field2807[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method323(64) + var71;
                var71 = var70;
                this.field2839[var72] = var68;
                this.field2804[var72] = var78;
                this.field2807[var72] = var70;
            }
        }
        var2.field647 = var50;
        var3.field647 = var52;
        var4.field647 = var54;
        var5.field647 = var56;
        var6.field647 = var58;
        var7.field647 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2844[var73] & 0xFF;
            if (var74 == 0) {
                this.field2803[var73] = (short) var2.method339(-16777216);
                this.field2822[var73] = (short) var2.method339(-16777216);
                this.field2842[var73] = (short) var2.method339(-16777216);
            }
            if (var74 == 1) {
                this.field2803[var73] = (short) var3.method339(-16777216);
                this.field2822[var73] = (short) var3.method339(-16777216);
                this.field2842[var73] = (short) var3.method339(-16777216);
                this.field2808[var73] = (short) var4.method339(-16777216);
                this.field2812[var73] = (short) var4.method339(-16777216);
                this.field2820[var73] = (short) var4.method339(-16777216);
                this.field2801[var73] = var5.method325(93);
                this.field2834[var73] = var6.method325(94);
                this.field2827[var73] = var7.method325(89);
            }
            if (var74 == 2) {
                this.field2803[var73] = (short) var3.method339(-16777216);
                this.field2822[var73] = (short) var3.method339(-16777216);
                this.field2842[var73] = (short) var3.method339(-16777216);
                this.field2808[var73] = (short) var4.method339(-16777216);
                this.field2812[var73] = (short) var4.method339(-16777216);
                this.field2820[var73] = (short) var4.method339(-16777216);
                this.field2801[var73] = var5.method325(125);
                this.field2834[var73] = var6.method325(-121);
                this.field2827[var73] = var7.method325(57);
                this.field2835[var73] = var7.method325(-125);
                this.field2830[var73] = var7.method325(-116);
            }
            if (var74 == 3) {
                this.field2803[var73] = (short) var3.method339(-16777216);
                this.field2822[var73] = (short) var3.method339(-16777216);
                this.field2842[var73] = (short) var3.method339(-16777216);
                this.field2808[var73] = (short) var4.method339(-16777216);
                this.field2812[var73] = (short) var4.method339(-16777216);
                this.field2820[var73] = (short) var4.method339(-16777216);
                this.field2801[var73] = var5.method325(-116);
                this.field2834[var73] = var6.method325(48);
                this.field2827[var73] = var7.method325(110);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "()V")
    public static void method1112() {
        field2810 = null;
        field2815 = null;
        field2811 = null;
        field2840 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lqe;IIIZ)V")
    public final void method708(class95 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class157 var6 = (class157) arg0;
        var6.method1105();
        var6.method1101();
        field2838++;
        int var7 = 0;
        int[] var8 = var6.field2843;
        int var9 = var6.field2798;
        for (int var10 = 0; var10 < this.field2798; var10++) {
            class268 var13 = this.field2819[var10];
            if (var13.field4569 != 0) {
                int var14 = this.field2799[var10] - arg2;
                if (var14 >= var6.field2832 && var14 <= var6.field2833) {
                    int var15 = this.field2843[var10] - arg1;
                    if (var15 >= var6.field2818 && var15 <= var6.field2836) {
                        int var16 = this.field2806[var10] - arg3;
                        if (var16 >= var6.field2814 && var16 <= var6.field2824) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class268 var18 = var6.field2819[var17];
                                if (var8[var17] == var15 && var6.field2806[var17] == var16 && var6.field2799[var17] == var14 && var18.field4569 != 0) {
                                    if (this.field2800 == null) {
                                        this.field2800 = new class268[this.field2798];
                                    }
                                    if (var6.field2800 == null) {
                                        var6.field2800 = new class268[var9];
                                    }
                                    class268 var19 = this.field2800[var10];
                                    if (var19 == null) {
                                        var19 = this.field2800[var10] = new class268(var13);
                                    }
                                    class268 var20 = var6.field2800[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2800[var17] = new class268(var18);
                                    }
                                    var19.field4579 += var18.field4579;
                                    var19.field4581 += var18.field4581;
                                    var19.field4570 += var18.field4570;
                                    var19.field4569 += var18.field4569;
                                    var20.field4579 += var13.field4579;
                                    var20.field4581 += var13.field4581;
                                    var20.field4570 += var13.field4570;
                                    var20.field4569 += var13.field4569;
                                    var7++;
                                    field2810[var10] = field2838;
                                    field2815[var17] = field2838;
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
        for (int var11 = 0; var11 < this.field2797; var11++) {
            if (field2810[this.field2839[var11]] == field2838 && field2810[this.field2804[var11]] == field2838 && field2810[this.field2807[var11]] == field2838) {
                if (this.field2828 == null) {
                    this.field2828 = new byte[this.field2797];
                }
                this.field2828[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2797; var12++) {
            if (field2815[var6.field2839[var12]] == field2838 && field2815[var6.field2804[var12]] == field2838 && field2815[var6.field2807[var12]] == field2838) {
                if (var6.field2828 == null) {
                    var6.field2828 = new byte[var6.field2797];
                }
                var6.field2828[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "()V")
    public final void method1113() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            int var2 = this.field2843[var1];
            this.field2843[var1] = this.field2806[var1];
            this.field2806[var1] = -var2;
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(IIIII)Lff;")
    public final class18 method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class18(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "()V")
    public final void method1115() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            this.field2843[var1] = -this.field2843[var1];
            this.field2806[var1] = -this.field2806[var1];
        }
        this.method1106();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfa;II)Lmb;")
    public static final class157 method1116(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1645(true, arg2, arg1);
        return var3 == null ? null : new class157(var3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lmb;")
    public final class157 method1117(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1105();
        int var10 = this.field2818 + arg4;
        int var11 = this.field2836 + arg4;
        int var12 = this.field2814 + arg6;
        int var13 = this.field2824 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class157 var18;
        if (arg7) {
            var18 = new class157();
            var18.field2798 = this.field2798;
            var18.field2797 = this.field2797;
            var18.field2809 = this.field2809;
            var18.field2839 = this.field2839;
            var18.field2804 = this.field2804;
            var18.field2807 = this.field2807;
            var18.field2828 = this.field2828;
            var18.field2831 = this.field2831;
            var18.field2817 = this.field2817;
            var18.field2813 = this.field2813;
            var18.field2826 = this.field2826;
            var18.field2841 = this.field2841;
            var18.field2825 = this.field2825;
            var18.field2844 = this.field2844;
            var18.field2803 = this.field2803;
            var18.field2822 = this.field2822;
            var18.field2842 = this.field2842;
            var18.field2808 = this.field2808;
            var18.field2812 = this.field2812;
            var18.field2820 = this.field2820;
            var18.field2801 = this.field2801;
            var18.field2834 = this.field2834;
            var18.field2827 = this.field2827;
            var18.field2835 = this.field2835;
            var18.field2830 = this.field2830;
            var18.field2816 = this.field2816;
            var18.field2837 = this.field2837;
            var18.field2829 = this.field2829;
            var18.field2805 = this.field2805;
            var18.field2821 = this.field2821;
            var18.field2823 = this.field2823;
            var18.field2819 = this.field2819;
            var18.field2802 = this.field2802;
            var18.field2800 = this.field2800;
            if (arg0 == 3) {
                var18.field2843 = class19.method198(127, this.field2843);
                var18.field2799 = class19.method198(127, this.field2799);
                var18.field2806 = class19.method198(127, this.field2806);
            } else {
                var18.field2843 = this.field2843;
                var18.field2799 = new int[var18.field2798];
                var18.field2806 = this.field2806;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2798; var19++) {
                int var20 = this.field2843[var19] + arg4;
                int var21 = this.field2806[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2799[var19] = this.field2799[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2798; var29++) {
                int var30 = (this.field2799[var29] << 16) / this.field2832;
                if (var30 < arg1) {
                    int var31 = this.field2843[var29] + arg4;
                    int var32 = this.field2806[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2799[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2799[var29];
                } else {
                    var18.field2799[var29] = this.field2799[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1089(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2833 - this.field2832;
            for (int var43 = 0; var43 < this.field2798; var43++) {
                int var44 = this.field2843[var43] + arg4;
                int var45 = this.field2806[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2799[var43] = var52 + this.field2799[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2833 - this.field2832;
            for (int var54 = 0; var54 < this.field2798; var54++) {
                int var55 = this.field2843[var54] + arg4;
                int var56 = this.field2806[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2799[var54] = ((this.field2799[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1106();
        } else {
            this.field2796 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "()V")
    public final void method1118() {
        this.field2816 = null;
        this.field2837 = null;
        this.field2829 = null;
        this.field2805 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Lqe;")
    public final class95 method707(int arg0, int arg1, int arg2) {
        return this.method1110(this.field2821, this.field2823, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    private class157() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    private class157(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1111(arg0);
        } else {
            this.method1107(arg0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(III)V")
    public class157(int arg0, int arg1, int arg2) {
        this.field2843 = new int[arg0];
        this.field2799 = new int[arg0];
        this.field2806 = new int[arg0];
        this.field2816 = new int[arg0];
        this.field2839 = new int[arg1];
        this.field2804 = new int[arg1];
        this.field2807 = new int[arg1];
        this.field2828 = new byte[arg1];
        this.field2831 = new byte[arg1];
        this.field2817 = new byte[arg1];
        this.field2826 = new short[arg1];
        this.field2841 = new short[arg1];
        this.field2813 = new byte[arg1];
        this.field2837 = new int[arg1];
        if (arg2 > 0) {
            this.field2844 = new byte[arg2];
            this.field2803 = new short[arg2];
            this.field2822 = new short[arg2];
            this.field2842 = new short[arg2];
            this.field2808 = new short[arg2];
            this.field2812 = new short[arg2];
            this.field2820 = new short[arg2];
            this.field2801 = new byte[arg2];
            this.field2834 = new byte[arg2];
            this.field2827 = new byte[arg2];
            this.field2835 = new byte[arg2];
            this.field2830 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([Lmb;I)V")
    public class157(class157[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2798 = 0;
        this.field2797 = 0;
        this.field2809 = 0;
        this.field2825 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class157 var15 = arg0[var9];
            if (var15 != null) {
                this.field2798 += var15.field2798;
                this.field2797 += var15.field2797;
                this.field2809 += var15.field2809;
                if (var15.field2831 == null) {
                    if (this.field2825 == -1) {
                        this.field2825 = var15.field2825;
                    }
                    if (this.field2825 != var15.field2825) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2828 != null;
                var5 |= var15.field2817 != null;
                var6 |= var15.field2837 != null;
                var7 |= var15.field2841 != null;
                var8 |= var15.field2813 != null;
            }
        }
        this.field2843 = new int[this.field2798];
        this.field2799 = new int[this.field2798];
        this.field2806 = new int[this.field2798];
        this.field2816 = new int[this.field2798];
        this.field2839 = new int[this.field2797];
        this.field2804 = new int[this.field2797];
        this.field2807 = new int[this.field2797];
        if (var3) {
            this.field2828 = new byte[this.field2797];
        }
        if (var4) {
            this.field2831 = new byte[this.field2797];
        }
        if (var5) {
            this.field2817 = new byte[this.field2797];
        }
        if (var6) {
            this.field2837 = new int[this.field2797];
        }
        if (var7) {
            this.field2841 = new short[this.field2797];
        }
        if (var8) {
            this.field2813 = new byte[this.field2797];
        }
        this.field2826 = new short[this.field2797];
        if (this.field2809 > 0) {
            this.field2844 = new byte[this.field2809];
            this.field2803 = new short[this.field2809];
            this.field2822 = new short[this.field2809];
            this.field2842 = new short[this.field2809];
            this.field2808 = new short[this.field2809];
            this.field2812 = new short[this.field2809];
            this.field2820 = new short[this.field2809];
            this.field2801 = new byte[this.field2809];
            this.field2834 = new byte[this.field2809];
            this.field2827 = new byte[this.field2809];
            this.field2835 = new byte[this.field2809];
            this.field2830 = new byte[this.field2809];
        }
        this.field2798 = 0;
        this.field2797 = 0;
        this.field2809 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class157 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2797; var12++) {
                    if (var3 && var11.field2828 != null) {
                        this.field2828[this.field2797] = var11.field2828[var12];
                    }
                    if (var4) {
                        if (var11.field2831 == null) {
                            this.field2831[this.field2797] = var11.field2825;
                        } else {
                            this.field2831[this.field2797] = var11.field2831[var12];
                        }
                    }
                    if (var5 && var11.field2817 != null) {
                        this.field2817[this.field2797] = var11.field2817[var12];
                    }
                    if (var6 && var11.field2837 != null) {
                        this.field2837[this.field2797] = var11.field2837[var12];
                    }
                    if (var7) {
                        if (var11.field2841 == null) {
                            this.field2841[this.field2797] = -1;
                        } else {
                            this.field2841[this.field2797] = var11.field2841[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2813 == null || var11.field2813[var12] == -1) {
                            this.field2813[this.field2797] = -1;
                        } else {
                            this.field2813[this.field2797] = (byte) (var11.field2813[var12] + this.field2809);
                        }
                    }
                    this.field2826[this.field2797] = var11.field2826[var12];
                    this.field2839[this.field2797] = this.method1094(var11, var11.field2839[var12]);
                    this.field2804[this.field2797] = this.method1094(var11, var11.field2804[var12]);
                    this.field2807[this.field2797] = this.method1094(var11, var11.field2807[var12]);
                    this.field2797++;
                }
                for (int var13 = 0; var13 < var11.field2809; var13++) {
                    byte var14 = this.field2844[this.field2809] = var11.field2844[var13];
                    if (var14 == 0) {
                        this.field2803[this.field2809] = (short) this.method1094(var11, var11.field2803[var13]);
                        this.field2822[this.field2809] = (short) this.method1094(var11, var11.field2822[var13]);
                        this.field2842[this.field2809] = (short) this.method1094(var11, var11.field2842[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2803[this.field2809] = var11.field2803[var13];
                        this.field2822[this.field2809] = var11.field2822[var13];
                        this.field2842[this.field2809] = var11.field2842[var13];
                        this.field2808[this.field2809] = var11.field2808[var13];
                        this.field2812[this.field2809] = var11.field2812[var13];
                        this.field2820[this.field2809] = var11.field2820[var13];
                        this.field2801[this.field2809] = var11.field2801[var13];
                        this.field2834[this.field2809] = var11.field2834[var13];
                        this.field2827[this.field2809] = var11.field2827[var13];
                    }
                    if (var14 == 2) {
                        this.field2835[this.field2809] = var11.field2835[var13];
                        this.field2830[this.field2809] = var11.field2830[var13];
                    }
                    this.field2809++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lmb;ZZZZ)V")
    public class157(class157 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2798 = arg0.field2798;
        this.field2797 = arg0.field2797;
        this.field2809 = arg0.field2809;
        if (arg1) {
            this.field2843 = arg0.field2843;
            this.field2799 = arg0.field2799;
            this.field2806 = arg0.field2806;
        } else {
            this.field2843 = new int[this.field2798];
            this.field2799 = new int[this.field2798];
            this.field2806 = new int[this.field2798];
            for (int var6 = 0; var6 < this.field2798; var6++) {
                this.field2843[var6] = arg0.field2843[var6];
                this.field2799[var6] = arg0.field2799[var6];
                this.field2806[var6] = arg0.field2806[var6];
            }
        }
        if (arg2) {
            this.field2826 = arg0.field2826;
        } else {
            this.field2826 = new short[this.field2797];
            for (int var7 = 0; var7 < this.field2797; var7++) {
                this.field2826[var7] = arg0.field2826[var7];
            }
        }
        if (arg3 || arg0.field2841 == null) {
            this.field2841 = arg0.field2841;
        } else {
            this.field2841 = new short[this.field2797];
            for (int var8 = 0; var8 < this.field2797; var8++) {
                this.field2841[var8] = arg0.field2841[var8];
            }
        }
        if (arg4) {
            this.field2817 = arg0.field2817;
        } else {
            this.field2817 = new byte[this.field2797];
            if (arg0.field2817 == null) {
                for (int var9 = 0; var9 < this.field2797; var9++) {
                    this.field2817[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2797; var10++) {
                    this.field2817[var10] = arg0.field2817[var10];
                }
            }
        }
        this.field2839 = arg0.field2839;
        this.field2804 = arg0.field2804;
        this.field2807 = arg0.field2807;
        this.field2828 = arg0.field2828;
        this.field2831 = arg0.field2831;
        this.field2813 = arg0.field2813;
        this.field2825 = arg0.field2825;
        this.field2844 = arg0.field2844;
        this.field2803 = arg0.field2803;
        this.field2822 = arg0.field2822;
        this.field2842 = arg0.field2842;
        this.field2808 = arg0.field2808;
        this.field2812 = arg0.field2812;
        this.field2820 = arg0.field2820;
        this.field2801 = arg0.field2801;
        this.field2834 = arg0.field2834;
        this.field2827 = arg0.field2827;
        this.field2835 = arg0.field2835;
        this.field2830 = arg0.field2830;
        this.field2816 = arg0.field2816;
        this.field2837 = arg0.field2837;
        this.field2829 = arg0.field2829;
        this.field2805 = arg0.field2805;
        this.field2819 = arg0.field2819;
        this.field2802 = arg0.field2802;
        this.field2800 = arg0.field2800;
        this.field2821 = arg0.field2821;
        this.field2823 = arg0.field2823;
    }
}
