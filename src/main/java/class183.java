import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class183 extends class280 {

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "B")
    private byte field2781 = 0;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "Z")
    private boolean field2807 = false;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field2792 = 0;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public int field2801 = 0;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "[I")
    public int[] field2790;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "[I")
    public int[] field2804;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "[I")
    public int[] field2787;

    @OriginalMember(owner = "client!ch", name = "kb", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    public int[] field2789;

    @OriginalMember(owner = "client!ch", name = "hb", descriptor = "[I")
    public int[] field2823;

    @OriginalMember(owner = "client!ch", name = "db", descriptor = "[I")
    public int[] field2819;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "[B")
    public byte[] field2806;

    @OriginalMember(owner = "client!ch", name = "eb", descriptor = "[B")
    public byte[] field2820;

    @OriginalMember(owner = "client!ch", name = "S", descriptor = "[B")
    public byte[] field2808;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[S")
    public short[] field2799;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[S")
    public short[] field2782;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[B")
    public byte[] field2783;

    @OriginalMember(owner = "client!ch", name = "ab", descriptor = "[I")
    public int[] field2816;

    @OriginalMember(owner = "client!ch", name = "Y", descriptor = "[B")
    public byte[] field2814;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "[S")
    public short[] field2798;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[S")
    public short[] field2784;

    @OriginalMember(owner = "client!ch", name = "X", descriptor = "[S")
    public short[] field2813;

    @OriginalMember(owner = "client!ch", name = "cb", descriptor = "[S")
    public short[] field2818;

    @OriginalMember(owner = "client!ch", name = "lb", descriptor = "[S")
    public short[] field2827;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[S")
    public short[] field2780;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[B")
    public byte[] field2785;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[B")
    public byte[] field2805;

    @OriginalMember(owner = "client!ch", name = "bb", descriptor = "[B")
    public byte[] field2817;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[B")
    public byte[] field2779;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "[B")
    public byte[] field2797;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    private static int field2791 = 0;

    @OriginalMember(owner = "client!ch", name = "U", descriptor = "[I")
    private static int[] field2810 = class229.field3806;

    @OriginalMember(owner = "client!ch", name = "V", descriptor = "[I")
    private static int[] field2811 = new int[10000];

    @OriginalMember(owner = "client!ch", name = "Z", descriptor = "[I")
    private static int[] field2815 = class229.field3805;

    @OriginalMember(owner = "client!ch", name = "jb", descriptor = "[I")
    private static int[] field2825 = new int[10000];

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "S")
    private short field2794;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "S")
    private short field2795;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "S")
    private short field2802;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "S")
    private short field2803;

    @OriginalMember(owner = "client!ch", name = "W", descriptor = "S")
    private short field2812;

    @OriginalMember(owner = "client!ch", name = "fb", descriptor = "S")
    private short field2821;

    @OriginalMember(owner = "client!ch", name = "gb", descriptor = "S")
    private short field2822;

    @OriginalMember(owner = "client!ch", name = "ib", descriptor = "S")
    private short field2824;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[Ltc;")
    public class138[] field2788;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "[Llb;")
    public class214[] field2786;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[Llb;")
    public class214[] field2793;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "[[I")
    public int[][] field2800;

    @OriginalMember(owner = "client!ch", name = "T", descriptor = "[[I")
    public int[][] field2809;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()I", line = 14)
    public final int method248() {
        if (!this.field2807) {
            this.method1201();
        }
        return this.field2822;
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "()V", line = 31)
    public final void method1189() {
        if (this.field2793 != null) {
            return;
        }
        this.field2793 = new class214[this.field2801];
        for (int var1 = 0; var1 < this.field2801; var1++) {
            this.field2793[var1] = new class214();
        }
        for (int var2 = 0; var2 < this.field2792; var2++) {
            int var3 = this.field2789[var2];
            int var4 = this.field2823[var2];
            int var5 = this.field2819[var2];
            int var6 = this.field2790[var4] - this.field2790[var3];
            int var7 = this.field2804[var4] - this.field2804[var3];
            int var8 = this.field2787[var4] - this.field2787[var3];
            int var9 = this.field2790[var5] - this.field2790[var3];
            int var10 = this.field2804[var5] - this.field2804[var3];
            int var11 = this.field2787[var5] - this.field2787[var3];
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
            if (this.field2806 == null) {
                var19 = 0;
            } else {
                var19 = this.field2806[var2];
            }
            if (var19 == 0) {
                class214 var20 = this.field2793[var3];
                var20.field3395 += var16;
                var20.field3396 += var17;
                var20.field3403 += var18;
                var20.field3401++;
                class214 var21 = this.field2793[var4];
                var21.field3395 += var16;
                var21.field3396 += var17;
                var21.field3403 += var18;
                var21.field3401++;
                class214 var22 = this.field2793[var5];
                var22.field3395 += var16;
                var22.field3396 += var17;
                var22.field3403 += var18;
                var22.field3401++;
            } else if (var19 == 1) {
                if (this.field2788 == null) {
                    this.field2788 = new class138[this.field2792];
                }
                class138 var23 = this.field2788[var2] = new class138();
                var23.field2050 = var16;
                var23.field2044 = var17;
                var23.field2046 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 1453)
    private class183() {
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V", line = 1455)
    private class183(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1197(arg0);
        } else {
            this.method1196(arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(III)V", line = 1462)
    public class183(int arg0, int arg1, int arg2) {
        this.field2790 = new int[arg0];
        this.field2804 = new int[arg0];
        this.field2787 = new int[arg0];
        this.field2826 = new int[arg0];
        this.field2789 = new int[arg1];
        this.field2823 = new int[arg1];
        this.field2819 = new int[arg1];
        this.field2806 = new byte[arg1];
        this.field2820 = new byte[arg1];
        this.field2808 = new byte[arg1];
        this.field2799 = new short[arg1];
        this.field2782 = new short[arg1];
        this.field2783 = new byte[arg1];
        this.field2816 = new int[arg1];
        if (arg2 > 0) {
            this.field2814 = new byte[arg2];
            this.field2798 = new short[arg2];
            this.field2784 = new short[arg2];
            this.field2813 = new short[arg2];
            this.field2818 = new short[arg2];
            this.field2827 = new short[arg2];
            this.field2780 = new short[arg2];
            this.field2785 = new byte[arg2];
            this.field2805 = new byte[arg2];
            this.field2817 = new byte[arg2];
            this.field2779 = new byte[arg2];
            this.field2797 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([Lch;I)V", line = 1494)
    public class183(class183[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2801 = 0;
        this.field2792 = 0;
        this.field2796 = 0;
        this.field2781 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class183 var10 = arg0[var9];
            if (var10 != null) {
                this.field2801 += var10.field2801;
                this.field2792 += var10.field2792;
                this.field2796 += var10.field2796;
                if (var10.field2820 == null) {
                    if (this.field2781 == -1) {
                        this.field2781 = var10.field2781;
                    }
                    if (this.field2781 != var10.field2781) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field2806 != null;
                var5 |= var10.field2808 != null;
                var6 |= var10.field2816 != null;
                var7 |= var10.field2782 != null;
                var8 |= var10.field2783 != null;
            }
        }
        this.field2790 = new int[this.field2801];
        this.field2804 = new int[this.field2801];
        this.field2787 = new int[this.field2801];
        this.field2826 = new int[this.field2801];
        this.field2789 = new int[this.field2792];
        this.field2823 = new int[this.field2792];
        this.field2819 = new int[this.field2792];
        if (var3) {
            this.field2806 = new byte[this.field2792];
        }
        if (var4) {
            this.field2820 = new byte[this.field2792];
        }
        if (var5) {
            this.field2808 = new byte[this.field2792];
        }
        if (var6) {
            this.field2816 = new int[this.field2792];
        }
        if (var7) {
            this.field2782 = new short[this.field2792];
        }
        if (var8) {
            this.field2783 = new byte[this.field2792];
        }
        this.field2799 = new short[this.field2792];
        if (this.field2796 > 0) {
            this.field2814 = new byte[this.field2796];
            this.field2798 = new short[this.field2796];
            this.field2784 = new short[this.field2796];
            this.field2813 = new short[this.field2796];
            this.field2818 = new short[this.field2796];
            this.field2827 = new short[this.field2796];
            this.field2780 = new short[this.field2796];
            this.field2785 = new byte[this.field2796];
            this.field2805 = new byte[this.field2796];
            this.field2817 = new byte[this.field2796];
            this.field2779 = new byte[this.field2796];
            this.field2797 = new byte[this.field2796];
        }
        this.field2801 = 0;
        this.field2792 = 0;
        this.field2796 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class183 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field2792; var13++) {
                    if (var3 && var12.field2806 != null) {
                        this.field2806[this.field2792] = var12.field2806[var13];
                    }
                    if (var4) {
                        if (var12.field2820 == null) {
                            this.field2820[this.field2792] = var12.field2781;
                        } else {
                            this.field2820[this.field2792] = var12.field2820[var13];
                        }
                    }
                    if (var5 && var12.field2808 != null) {
                        this.field2808[this.field2792] = var12.field2808[var13];
                    }
                    if (var6 && var12.field2816 != null) {
                        this.field2816[this.field2792] = var12.field2816[var13];
                    }
                    if (var7) {
                        if (var12.field2782 == null) {
                            this.field2782[this.field2792] = -1;
                        } else {
                            this.field2782[this.field2792] = var12.field2782[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field2783 == null || var12.field2783[var13] == -1) {
                            this.field2783[this.field2792] = -1;
                        } else {
                            this.field2783[this.field2792] = (byte) (var12.field2783[var13] + this.field2796);
                        }
                    }
                    this.field2799[this.field2792] = var12.field2799[var13];
                    this.field2789[this.field2792] = this.method1204(var12, var12.field2789[var13]);
                    this.field2823[this.field2792] = this.method1204(var12, var12.field2823[var13]);
                    this.field2819[this.field2792] = this.method1204(var12, var12.field2819[var13]);
                    this.field2792++;
                }
                for (int var14 = 0; var14 < var12.field2796; var14++) {
                    byte var15 = this.field2814[this.field2796] = var12.field2814[var14];
                    if (var15 == 0) {
                        this.field2798[this.field2796] = (short) this.method1204(var12, var12.field2798[var14]);
                        this.field2784[this.field2796] = (short) this.method1204(var12, var12.field2784[var14]);
                        this.field2813[this.field2796] = (short) this.method1204(var12, var12.field2813[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field2798[this.field2796] = var12.field2798[var14];
                        this.field2784[this.field2796] = var12.field2784[var14];
                        this.field2813[this.field2796] = var12.field2813[var14];
                        this.field2818[this.field2796] = var12.field2818[var14];
                        this.field2827[this.field2796] = var12.field2827[var14];
                        this.field2780[this.field2796] = var12.field2780[var14];
                        this.field2785[this.field2796] = var12.field2785[var14];
                        this.field2805[this.field2796] = var12.field2805[var14];
                        this.field2817[this.field2796] = var12.field2817[var14];
                    }
                    if (var15 == 2) {
                        this.field2779[this.field2796] = var12.field2779[var14];
                        this.field2797[this.field2796] = var12.field2797[var14];
                    }
                    this.field2796++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)V", line = 150)
    public final void method1190(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2801; var4++) {
            this.field2790[var4] += arg0;
            this.field2804[var4] += arg1;
            this.field2787[var4] += arg2;
        }
        this.method1191();
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "()V", line = 169)
    private final void method1191() {
        this.field2793 = null;
        this.field2786 = null;
        this.field2788 = null;
        this.field2807 = false;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "()V", line = 177)
    public final void method1192() {
        int var10002;
        if (this.field2826 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2801; var3++) {
                int var4 = this.field2826[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2809 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2809[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2801) {
                int var7 = this.field2826[var6];
                this.field2809[var7][var1[var7]++] = var6++;
            }
            this.field2826 = null;
        }
        if (this.field2816 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2792; var10++) {
            int var11 = this.field2816[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2800 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2800[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2792) {
            int var14 = this.field2816[var13];
            this.field2800[var14][var8[var14]++] = var13++;
        }
        this.field2816 = null;
    }

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "()V", line = 269)
    public static void method1193() {
        field2825 = null;
        field2811 = null;
        field2815 = null;
        field2810 = null;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(IIIII)Lqi;", line = 275)
    public final class227 method1194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class227(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIJ)V", line = 278)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()Z", line = 283)
    public final boolean method1059() {
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(SS)V", line = 286)
    public final void method1195(short arg0, short arg1) {
        if (this.field2782 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2792; var3++) {
            if (this.field2782[var3] == arg0) {
                this.field2782[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([B)V", line = 307)
    private final void method1196(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class221 var4 = new class221(arg0);
        class221 var5 = new class221(arg0);
        class221 var6 = new class221(arg0);
        class221 var7 = new class221(arg0);
        class221 var8 = new class221(arg0);
        var4.field3610 = arg0.length - 18;
        int var9 = var4.method1524((byte) 81);
        int var10 = var4.method1524((byte) 66);
        int var11 = var4.method1509(true);
        int var12 = var4.method1509(true);
        int var13 = var4.method1509(true);
        int var14 = var4.method1509(true);
        int var15 = var4.method1509(true);
        int var16 = var4.method1509(true);
        int var17 = var4.method1524((byte) 73);
        int var18 = var4.method1524((byte) 68);
        int var19 = var4.method1524((byte) 73);
        int var20 = var4.method1524((byte) 116);
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
        this.field2801 = var9;
        this.field2792 = var10;
        this.field2796 = var11;
        this.field2790 = new int[var9];
        this.field2804 = new int[var9];
        this.field2787 = new int[var9];
        this.field2789 = new int[var10];
        this.field2823 = new int[var10];
        this.field2819 = new int[var10];
        if (var11 > 0) {
            this.field2814 = new byte[var11];
            this.field2798 = new short[var11];
            this.field2784 = new short[var11];
            this.field2813 = new short[var11];
        }
        if (var16 == 1) {
            this.field2826 = new int[var9];
        }
        if (var12 == 1) {
            this.field2806 = new byte[var10];
            this.field2783 = new byte[var10];
            this.field2782 = new short[var10];
        }
        if (var13 == 255) {
            this.field2820 = new byte[var10];
        } else {
            this.field2781 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2808 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2816 = new int[var10];
        }
        this.field2799 = new short[var10];
        var4.field3610 = var21;
        var5.field3610 = var36;
        var6.field3610 = var38;
        var7.field3610 = var40;
        var8.field3610 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method1509(true);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method1529(-1);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method1529(-1);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method1529(-1);
            }
            this.field2790[var46] = var43 + var48;
            this.field2804[var46] = var44 + var49;
            this.field2787[var46] = var45 + var50;
            var43 = this.field2790[var46];
            var44 = this.field2804[var46];
            var45 = this.field2787[var46];
            if (var16 == 1) {
                this.field2826[var46] = var8.method1509(true);
            }
        }
        var4.field3610 = var32;
        var5.field3610 = var28;
        var6.field3610 = var26;
        var7.field3610 = var30;
        var8.field3610 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2799[var51] = (short) var4.method1524((byte) 123);
            if (var12 == 1) {
                int var52 = var5.method1509(true);
                if ((var52 & 0x1) == 1) {
                    this.field2806[var51] = 1;
                    var2 = true;
                } else {
                    this.field2806[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2783[var51] = (byte) (var52 >> 2);
                    this.field2782[var51] = this.field2799[var51];
                    this.field2799[var51] = 127;
                    if (this.field2782[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2783[var51] = -1;
                    this.field2782[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2820[var51] = var6.method1543(false);
            }
            if (var14 == 1) {
                this.field2808[var51] = var7.method1543(false);
            }
            if (var15 == 1) {
                this.field2816[var51] = var8.method1509(true);
            }
        }
        var4.field3610 = var25;
        var5.field3610 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method1509(true);
            if (var58 == 1) {
                var53 = var4.method1529(-1) + var56;
                var54 = var4.method1529(-1) + var53;
                var55 = var4.method1529(-1) + var54;
                var56 = var55;
                this.field2789[var57] = var53;
                this.field2823[var57] = var54;
                this.field2819[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method1529(-1) + var56;
                var56 = var55;
                this.field2789[var57] = var53;
                this.field2823[var57] = var54;
                this.field2819[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method1529(-1) + var56;
                var56 = var55;
                this.field2789[var57] = var53;
                this.field2823[var57] = var54;
                this.field2819[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method1529(-1) + var56;
                var56 = var55;
                this.field2789[var57] = var53;
                this.field2823[var57] = var61;
                this.field2819[var57] = var55;
            }
        }
        var4.field3610 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2814[var62] = 0;
            this.field2798[var62] = (short) var4.method1524((byte) 113);
            this.field2784[var62] = (short) var4.method1524((byte) 113);
            this.field2813[var62] = (short) var4.method1524((byte) 125);
        }
        if (this.field2783 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2783[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2798[var65] & 0xFFFF) == this.field2789[var64] && (this.field2784[var65] & 0xFFFF) == this.field2823[var64] && (this.field2813[var65] & 0xFFFF) == this.field2819[var64]) {
                        this.field2783[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2783 = null;
            }
        }
        if (!var3) {
            this.field2782 = null;
        }
        if (!var2) {
            this.field2806 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "([B)V", line = 651)
    private final void method1197(byte[] arg0) {
        class221 var2 = new class221(arg0);
        class221 var3 = new class221(arg0);
        class221 var4 = new class221(arg0);
        class221 var5 = new class221(arg0);
        class221 var6 = new class221(arg0);
        class221 var7 = new class221(arg0);
        class221 var8 = new class221(arg0);
        var2.field3610 = arg0.length - 23;
        int var9 = var2.method1524((byte) 92);
        int var10 = var2.method1524((byte) 103);
        int var11 = var2.method1509(true);
        int var12 = var2.method1509(true);
        int var13 = var2.method1509(true);
        int var14 = var2.method1509(true);
        int var15 = var2.method1509(true);
        int var16 = var2.method1509(true);
        int var17 = var2.method1509(true);
        int var18 = var2.method1524((byte) 116);
        int var19 = var2.method1524((byte) 119);
        int var20 = var2.method1524((byte) 125);
        int var21 = var2.method1524((byte) 38);
        int var22 = var2.method1524((byte) 101);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2814 = new byte[var11];
            var2.field3610 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2814[var26] = var2.method1543(false);
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
        this.field2801 = var9;
        this.field2792 = var10;
        this.field2796 = var11;
        this.field2790 = new int[var9];
        this.field2804 = new int[var9];
        this.field2787 = new int[var9];
        this.field2789 = new int[var10];
        this.field2823 = new int[var10];
        this.field2819 = new int[var10];
        if (var17 == 1) {
            this.field2826 = new int[var9];
        }
        if (var12 == 1) {
            this.field2806 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2820 = new byte[var10];
        } else {
            this.field2781 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2808 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2816 = new int[var10];
        }
        if (var16 == 1) {
            this.field2782 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2783 = new byte[var10];
        }
        this.field2799 = new short[var10];
        if (var11 > 0) {
            this.field2798 = new short[var11];
            this.field2784 = new short[var11];
            this.field2813 = new short[var11];
            if (var24 > 0) {
                this.field2818 = new short[var24];
                this.field2827 = new short[var24];
                this.field2780 = new short[var24];
                this.field2785 = new byte[var24];
                this.field2805 = new byte[var24];
                this.field2817 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2779 = new byte[var25];
                this.field2797 = new byte[var25];
            }
        }
        var2.field3610 = var11;
        var3.field3610 = var44;
        var4.field3610 = var46;
        var5.field3610 = var48;
        var6.field3610 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method1509(true);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method1529(-1);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method1529(-1);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method1529(-1);
            }
            this.field2790[var66] = var63 + var68;
            this.field2804[var66] = var64 + var69;
            this.field2787[var66] = var65 + var70;
            var63 = this.field2790[var66];
            var64 = this.field2804[var66];
            var65 = this.field2787[var66];
            if (var17 == 1) {
                this.field2826[var66] = var6.method1509(true);
            }
        }
        var2.field3610 = var42;
        var3.field3610 = var31;
        var4.field3610 = var34;
        var5.field3610 = var37;
        var6.field3610 = var35;
        var7.field3610 = var40;
        var8.field3610 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field2799[var71] = (short) var2.method1524((byte) 94);
            if (var12 == 1) {
                this.field2806[var71] = var3.method1543(false);
            }
            if (var13 == 255) {
                this.field2820[var71] = var4.method1543(false);
            }
            if (var14 == 1) {
                this.field2808[var71] = var5.method1543(false);
            }
            if (var15 == 1) {
                this.field2816[var71] = var6.method1509(true);
            }
            if (var16 == 1) {
                this.field2782[var71] = (short) (var7.method1524((byte) 68) - 1);
            }
            if (this.field2783 != null) {
                if (this.field2782[var71] == -1) {
                    this.field2783[var71] = -1;
                } else {
                    this.field2783[var71] = (byte) (var8.method1509(true) - 1);
                }
            }
        }
        var2.field3610 = var33;
        var3.field3610 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method1509(true);
            if (var77 == 1) {
                var72 = var2.method1529(-1) + var75;
                var73 = var2.method1529(-1) + var72;
                var74 = var2.method1529(-1) + var73;
                var75 = var74;
                this.field2789[var76] = var72;
                this.field2823[var76] = var73;
                this.field2819[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method1529(-1) + var75;
                var75 = var74;
                this.field2789[var76] = var72;
                this.field2823[var76] = var73;
                this.field2819[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method1529(-1) + var75;
                var75 = var74;
                this.field2789[var76] = var72;
                this.field2823[var76] = var73;
                this.field2819[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method1529(-1) + var75;
                var75 = var74;
                this.field2789[var76] = var72;
                this.field2823[var76] = var80;
                this.field2819[var76] = var74;
            }
        }
        var2.field3610 = var50;
        var3.field3610 = var52;
        var4.field3610 = var54;
        var5.field3610 = var56;
        var6.field3610 = var58;
        var7.field3610 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field2814[var81] & 0xFF;
            if (var82 == 0) {
                this.field2798[var81] = (short) var2.method1524((byte) 108);
                this.field2784[var81] = (short) var2.method1524((byte) 97);
                this.field2813[var81] = (short) var2.method1524((byte) 42);
            }
            if (var82 == 1) {
                this.field2798[var81] = (short) var3.method1524((byte) 111);
                this.field2784[var81] = (short) var3.method1524((byte) 65);
                this.field2813[var81] = (short) var3.method1524((byte) 56);
                this.field2818[var81] = (short) var4.method1524((byte) 111);
                this.field2827[var81] = (short) var4.method1524((byte) 44);
                this.field2780[var81] = (short) var4.method1524((byte) 110);
                this.field2785[var81] = var5.method1543(false);
                this.field2805[var81] = var6.method1543(false);
                this.field2817[var81] = var7.method1543(false);
            }
            if (var82 == 2) {
                this.field2798[var81] = (short) var3.method1524((byte) 50);
                this.field2784[var81] = (short) var3.method1524((byte) 78);
                this.field2813[var81] = (short) var3.method1524((byte) 62);
                this.field2818[var81] = (short) var4.method1524((byte) 90);
                this.field2827[var81] = (short) var4.method1524((byte) 76);
                this.field2780[var81] = (short) var4.method1524((byte) 61);
                this.field2785[var81] = var5.method1543(false);
                this.field2805[var81] = var6.method1543(false);
                this.field2817[var81] = var7.method1543(false);
                this.field2779[var81] = var7.method1543(false);
                this.field2797[var81] = var7.method1543(false);
            }
            if (var82 == 3) {
                this.field2798[var81] = (short) var3.method1524((byte) 49);
                this.field2784[var81] = (short) var3.method1524((byte) 121);
                this.field2813[var81] = (short) var3.method1524((byte) 103);
                this.field2818[var81] = (short) var4.method1524((byte) 82);
                this.field2827[var81] = (short) var4.method1524((byte) 58);
                this.field2780[var81] = (short) var4.method1524((byte) 83);
                this.field2785[var81] = var5.method1543(false);
                this.field2805[var81] = var6.method1543(false);
                this.field2817[var81] = var7.method1543(false);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(IIIII)Lkl;", line = 1076)
    public final class34 method1198(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class160 var6 = new class160(this, arg0, arg1, true);
        var6.method1034();
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIBSB)I", line = 1085)
    public final int method1199(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2789[this.field2792] = arg0;
        this.field2823[this.field2792] = arg1;
        this.field2819[this.field2792] = arg2;
        this.field2806[this.field2792] = arg3;
        this.field2783[this.field2792] = -1;
        this.field2799[this.field2792] = arg4;
        this.field2782[this.field2792] = -1;
        this.field2808[this.field2792] = arg5;
        return this.field2792++;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(III)I", line = 1098)
    public final int method1200(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2801; var4++) {
            if (this.field2790[var4] == arg0 && this.field2804[var4] == arg1 && this.field2787[var4] == arg2) {
                return var4;
            }
        }
        this.field2790[this.field2801] = arg0;
        this.field2804[this.field2801] = arg1;
        this.field2787[this.field2801] = arg2;
        return this.field2801++;
    }

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "()V", line = 1116)
    private final void method1201() {
        if (this.field2807) {
            return;
        }
        this.field2807 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2801; var7++) {
            int var8 = this.field2790[var7];
            int var9 = this.field2804[var7];
            int var10 = this.field2787[var7];
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
        this.field2794 = (short) var1;
        this.field2821 = (short) var4;
        this.field2822 = (short) var2;
        this.field2803 = (short) var5;
        this.field2802 = (short) var3;
        this.field2795 = (short) var6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lni;II)Lch;", line = 1177)
    public static final class183 method1202(class202 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1342(106, arg1, arg2);
        return var3 == null ? null : new class183(var3);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(SS)V", line = 1190)
    public final void method1203(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2792; var3++) {
            if (this.field2799[var3] == arg0) {
                this.field2799[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lkb;", line = 1205)
    public final class280 method1030(int arg0, int arg1, int arg2) {
        return this.method1198(this.field2812, this.field2824, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lkb;IIIZ)V", line = 1214)
    public final void method1026(class280 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class183 var6 = (class183) arg0;
        var6.method1201();
        var6.method1189();
        field2791++;
        int var7 = 0;
        int[] var8 = var6.field2790;
        int var9 = var6.field2801;
        for (int var10 = 0; var10 < this.field2801; var10++) {
            class214 var11 = this.field2793[var10];
            if (var11.field3401 != 0) {
                int var12 = this.field2804[var10] - arg2;
                if (var12 >= var6.field2822 && var12 <= var6.field2803) {
                    int var13 = this.field2790[var10] - arg1;
                    if (var13 >= var6.field2794 && var13 <= var6.field2821) {
                        int var14 = this.field2787[var10] - arg3;
                        if (var14 >= var6.field2802 && var14 <= var6.field2795) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class214 var16 = var6.field2793[var15];
                                if (var8[var15] == var13 && var6.field2787[var15] == var14 && var6.field2804[var15] == var12 && var16.field3401 != 0) {
                                    if (this.field2786 == null) {
                                        this.field2786 = new class214[this.field2801];
                                    }
                                    if (var6.field2786 == null) {
                                        var6.field2786 = new class214[var9];
                                    }
                                    class214 var17 = this.field2786[var10];
                                    if (var17 == null) {
                                        var17 = this.field2786[var10] = new class214(var11);
                                    }
                                    class214 var18 = var6.field2786[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2786[var15] = new class214(var16);
                                    }
                                    var17.field3395 += var16.field3395;
                                    var17.field3396 += var16.field3396;
                                    var17.field3403 += var16.field3403;
                                    var17.field3401 += var16.field3401;
                                    var18.field3395 += var11.field3395;
                                    var18.field3396 += var11.field3396;
                                    var18.field3403 += var11.field3403;
                                    var18.field3401 += var11.field3401;
                                    var7++;
                                    field2825[var10] = field2791;
                                    field2811[var15] = field2791;
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
        for (int var19 = 0; var19 < this.field2792; var19++) {
            if (field2825[this.field2789[var19]] == field2791 && field2825[this.field2823[var19]] == field2791 && field2825[this.field2819[var19]] == field2791) {
                if (this.field2806 == null) {
                    this.field2806 = new byte[this.field2792];
                }
                this.field2806[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2792; var20++) {
            if (field2811[var6.field2789[var20]] == field2791 && field2811[var6.field2823[var20]] == field2791 && field2811[var6.field2819[var20]] == field2791) {
                if (var6.field2806 == null) {
                    var6.field2806 = new byte[var6.field2792];
                }
                var6.field2806[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lch;I)I", line = 1350)
    private final int method1204(class183 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2790[arg1];
        int var5 = arg0.field2804[arg1];
        int var6 = arg0.field2787[arg1];
        for (int var7 = 0; var7 < this.field2801; var7++) {
            if (this.field2790[var7] == var4 && this.field2804[var7] == var5 && this.field2787[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2790[this.field2801] = var4;
            this.field2804[this.field2801] = var5;
            this.field2787[this.field2801] = var6;
            if (arg0.field2826 != null) {
                this.field2826[this.field2801] = arg0.field2826[arg1];
            }
            var3 = this.field2801++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(III)V", line = 1389)
    public final void method1205(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2815[arg2];
            int var5 = field2810[arg2];
            for (int var6 = 0; var6 < this.field2801; var6++) {
                int var7 = this.field2804[var6] * var4 + this.field2790[var6] * var5 >> 16;
                this.field2804[var6] = this.field2804[var6] * var5 - this.field2790[var6] * var4 >> 16;
                this.field2790[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2815[arg0];
            int var9 = field2810[arg0];
            for (int var10 = 0; var10 < this.field2801; var10++) {
                int var11 = this.field2804[var10] * var9 - this.field2787[var10] * var8 >> 16;
                this.field2787[var10] = this.field2804[var10] * var8 + this.field2787[var10] * var9 >> 16;
                this.field2804[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2815[arg1];
        int var13 = field2810[arg1];
        for (int var14 = 0; var14 < this.field2801; var14++) {
            int var15 = this.field2790[var14] * var13 + this.field2787[var14] * var12 >> 16;
            this.field2787[var14] = this.field2787[var14] * var13 - this.field2790[var14] * var12 >> 16;
            this.field2790[var14] = var15;
        }
    }
}
