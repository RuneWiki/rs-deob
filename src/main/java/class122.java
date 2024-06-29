import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class122 extends class130 {

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "I")
    public int field2809 = 0;

    @OriginalMember(owner = "client!rd", name = "Db", descriptor = "[[B")
    private byte[][] field2825 = new byte[256][];

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "[I")
    private int[] field2801;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "[I")
    private int[] field2794;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "[I")
    private int[] field2817;

    @OriginalMember(owner = "client!rd", name = "Ab", descriptor = "[I")
    private int[] field2822;

    @OriginalMember(owner = "client!rd", name = "zb", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lid;")
    private static class60 field2798 = class11.method72(")4col", (byte) 112);

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "Lid;")
    private static class60 field2799 = class11.method72(")4str", (byte) 122);

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "Lid;")
    private static class60 field2808 = class11.method72("col=", (byte) 102);

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lid;")
    private static class60 field2802 = class11.method72("str", (byte) 127);

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "Lid;")
    private static class60 field2814 = class11.method72(")4u", (byte) 109);

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "Lid;")
    private static class60 field2813 = class11.method72("u", (byte) 106);

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lid;")
    private static class60 field2797 = class11.method72(")4shad", (byte) -30);

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    private static int field2796 = 0;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lid;")
    private static class60 field2800 = class11.method72("u=", (byte) 110);

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lid;")
    private static class60 field2816 = class11.method72("gt", (byte) -128);

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "I")
    private static int field2805 = 0;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
    private static int field2812 = 0;

    @OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
    private static int field2823 = 0;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "Lid;")
    private static class60 field2811 = class11.method72("str=", (byte) 110);

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "Lid;")
    private static class60 field2806 = class11.method72("shad=", (byte) 110);

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
    private static int field2803 = -1;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "Lid;")
    private static class60 field2819 = class11.method72("img=", (byte) -81);

    @OriginalMember(owner = "client!rd", name = "Cb", descriptor = "I")
    private static int field2824 = -1;

    @OriginalMember(owner = "client!rd", name = "yb", descriptor = "Lid;")
    private static class60 field2820 = class11.method72("lt", (byte) 109);

    @OriginalMember(owner = "client!rd", name = "Eb", descriptor = "Lid;")
    private static class60 field2826 = class11.method72("shad", (byte) -93);

    @OriginalMember(owner = "client!rd", name = "Fb", descriptor = "I")
    private static int field2827 = -1;

    @OriginalMember(owner = "client!rd", name = "Hb", descriptor = "I")
    private static int field2829 = -1;

    @OriginalMember(owner = "client!rd", name = "Gb", descriptor = "Lid;")
    private static class60 field2828 = class11.method72("br", (byte) -30);

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    private static int field2815 = 256;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "Ljava/util/Random;")
    private static Random field2804 = new Random();

    @OriginalMember(owner = "client!rd", name = "Ib", descriptor = "[Lid;")
    private static class60[] field2830 = new class60[100];

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "[B")
    private byte[] field2807;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "[I")
    private int[] field2810;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "[Le;")
    public static class29[] field2818;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;)I")
    public final int method946(class60 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field1474; var5++) {
            int var6 = arg0.field1453[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class60 var7 = arg0.method427(var5, -52, var2 + 1);
                    var2 = -1;
                    if (var7.method451(field2820, 11207)) {
                        var6 = 60;
                    } else {
                        if (!var7.method451(field2816, 11207)) {
                            if (var7.method450((byte) -100, field2819)) {
                                try {
                                    int var8 = var7.method421(4, 0).method424(-108);
                                    var4 += field2818[var8].field694;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field2810[var6];
                    if (this.field2807 != null && var3 != -1) {
                        var4 += this.field2807[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;IIII)V")
    public final void method947(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method960(arg3, arg4);
            this.method951(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;I)I")
    public final int method948(class60 arg0, int arg1) {
        int var3 = this.method963(arg0, new int[] { arg1 }, field2830);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method946(field2830[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([B)V")
    private final void method949(byte[] arg0) {
        this.field2810 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field2810.length; var2++) {
                this.field2810[var2] = arg0[var2] & 0xFF;
            }
            this.field2809 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field2810[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field2807 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field2807[(var13 << 8) + var14] = (byte) method955(var9, var11, var6, this.field2810, var5, var13, var14);
                    }
                }
            }
        }
        this.field2809 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method950(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;II)V")
    private final void method951(class60 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2809;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field1474; var7++) {
            int var8 = arg0.field1453[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class60 var9 = arg0.method427(var7, -78, var5 + 1);
                    var5 = -1;
                    if (var9.method451(field2820, 11207)) {
                        var8 = 60;
                    } else {
                        if (!var9.method451(field2816, 11207)) {
                            if (var9.method450((byte) 88, field2819)) {
                                try {
                                    int var10 = var9.method421(4, 0).method424(-94);
                                    class29 var11 = field2818[var10];
                                    var11.method224(arg1, this.field2809 + var4 - var11.field697);
                                    arg1 += var11.field694;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method954(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field2807 != null && var6 != -1) {
                        arg1 += this.field2807[(var6 << 8) + var8];
                    }
                    int var12 = this.field2817[var8];
                    int var13 = this.field2822[var8];
                    if (var8 == 32) {
                        if (field2823 > 0) {
                            field2796 += field2823;
                            arg1 += field2796 >> 8;
                            field2796 &= 0xFF;
                        }
                    } else if (field2815 == 256) {
                        if (field2829 != -1) {
                            method964(this.field2825[var8], this.field2801[var8] + arg1 + 1, this.field2794[var8] + var4 + 1, var12, var13, field2829);
                        }
                        this.method377(this.field2825[var8], this.field2801[var8] + arg1, this.field2794[var8] + var4, var12, var13, field2812);
                    } else {
                        if (field2829 != -1) {
                            method958(this.field2825[var8], this.field2801[var8] + arg1 + 1, this.field2794[var8] + var4 + 1, var12, var13, field2829, field2815);
                        }
                        this.method378(this.field2825[var8], this.field2801[var8] + arg1, this.field2794[var8] + var4, var12, var13, field2812, field2815);
                    }
                    int var14 = this.field2810[var8];
                    if (field2803 != -1) {
                        class130.method1025(arg1, (int) ((double) this.field2809 * 0.7D) + var4, var14, field2803);
                    }
                    if (field2827 != -1) {
                        class130.method1025(arg1, this.field2809 + var4 + 1, var14, field2827);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;IIIIII)V")
    public final void method952(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method960(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1474];
        for (int var11 = 0; var11 < arg0.field1474; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method969(arg0, arg1 - this.method946(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;IIIIIIIII)I")
    public final int method953(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method960(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field2809;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field2821 + this.field2795 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method963(arg0, var11, field2830);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2821 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2821 - this.field2795 - (var12 - 1) * arg9) / 2 + this.field2821 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2795 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2821 - this.field2795 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2821 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method951(field2830[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method951(field2830[var15], arg1 + (arg3 - this.method946(field2830[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method951(field2830[var15], arg1 + arg3 - this.method946(field2830[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method951(field2830[var15], arg1, var13);
            } else {
                this.method967(field2830[var15], arg3);
                this.method951(field2830[var15], arg1, var13);
                field2823 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lid;)V")
    private final void method954(class60 arg0) {
        try {
            if (arg0.method450((byte) 104, field2808)) {
                field2812 = arg0.method421(4, 0).method429((byte) -101, 16);
                return;
            }
            if (arg0.method451(field2798, 11207)) {
                field2812 = field2805;
                return;
            }
            if (arg0.method450((byte) 83, field2811)) {
                field2803 = arg0.method421(4, 0).method429((byte) -42, 16);
                return;
            }
            if (arg0.method451(field2802, 11207)) {
                field2803 = 8388608;
                return;
            }
            if (arg0.method451(field2799, 11207)) {
                field2803 = -1;
                return;
            }
            if (arg0.method450((byte) 103, field2800)) {
                field2827 = arg0.method421(2, 0).method429((byte) -112, 16);
                return;
            }
            if (arg0.method451(field2813, 11207)) {
                field2827 = 0;
                return;
            }
            if (arg0.method451(field2814, 11207)) {
                field2827 = -1;
                return;
            }
            if (arg0.method450((byte) 109, field2806)) {
                field2829 = arg0.method421(5, 0).method429((byte) -53, 16);
                return;
            }
            if (arg0.method451(field2826, 11207)) {
                field2829 = 0;
                return;
            }
            if (arg0.method451(field2797, 11207)) {
                field2829 = field2824;
                return;
            }
            if (arg0.method451(field2828, 11207)) {
                this.method960(field2805, field2824);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method955(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lid;IIII)V")
    public final void method956(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method960(arg3, arg4);
            this.method951(arg0, arg1 - this.method946(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BIIIIII)V")
    public abstract void method378(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lid;I)I")
    public final int method957(class60 arg0, int arg1) {
        return this.method963(arg0, new int[] { arg1 }, field2830);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BIIIII)V")
    public abstract void method377(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([BIIIIII)V")
    private static final void method958(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class130.field2958 * arg2 + arg1;
        int var8 = class130.field2958 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class130.field2962) {
            int var11 = class130.field2962 - arg2;
            arg4 -= var11;
            arg2 = class130.field2962;
            var10 += arg3 * var11;
            var7 += class130.field2958 * var11;
        }
        if (arg2 + arg4 > class130.field2961) {
            arg4 -= arg2 + arg4 - class130.field2961;
        }
        if (arg1 < class130.field2960) {
            int var12 = class130.field2960 - arg1;
            arg3 -= var12;
            arg1 = class130.field2960;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class130.field2963) {
            int var13 = arg1 + arg3 - class130.field2963;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method950(class130.field2959, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method959(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
    private final void method960(int arg0, int arg1) {
        field2803 = -1;
        field2827 = -1;
        field2824 = arg1;
        field2829 = arg1;
        field2805 = arg0;
        field2812 = arg0;
        field2815 = 256;
        field2823 = 0;
        field2796 = 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;IIIII)V")
    public final void method961(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method960(arg3, arg4);
        int[] var7 = new int[arg0.field1474];
        for (int var8 = 0; var8 < arg0.field1474; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method969(arg0, arg1 - this.method946(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Lid;)Lid;")
    public static final class60 method962(class60 arg0) {
        int var1 = arg0.method447((byte) 39);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1453[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class60 var4 = new class60();
        var4.field1474 = var1 + var2;
        var4.field1453 = new byte[var4.field1474];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1453[var6];
            if (var7 == 60) {
                var4.field1453[var5++] = 60;
                var4.field1453[var5++] = 108;
                var4.field1453[var5++] = 116;
                var4.field1453[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1453[var5++] = 60;
                var4.field1453[var5++] = 103;
                var4.field1453[var5++] = 116;
                var4.field1453[var5++] = 62;
            } else {
                var4.field1453[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;[I[Lid;)I")
    private final int method963(class60 arg0, int[] arg1, class60[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class60 var6 = class78.method637(100, (byte) -116);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method447((byte) 39);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method418(var14, (byte) -84);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class60 var16 = arg0.method427(var14, -111, var10 + 1);
                    var10 = -1;
                    var6.method441((byte) 31, 60);
                    var6.method437(var16, 122);
                    var6.method441((byte) -84, 62);
                    if (var16.method451(field2828, 11207)) {
                        arg2[var12++] = var6.method427(var6.method447((byte) 39), -90, var5);
                        var5 = var6.method447((byte) 39);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method451(field2820, 11207)) {
                        var4 += this.method971(60);
                        if (this.field2807 != null && var11 != -1) {
                            var4 += this.field2807[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method451(field2816, 11207)) {
                        var4 += this.method971(62);
                        if (this.field2807 != null && var11 != -1) {
                            var4 += this.field2807[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method450((byte) -118, field2819)) {
                        try {
                            int var17 = var16.method421(4, 0).method424(-101);
                            var4 += field2818[var17].field694;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method441((byte) -82, var15);
                        var4 += this.method971(var15);
                        if (this.field2807 != null && var11 != -1) {
                            var4 += this.field2807[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method447((byte) 39);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method427(var7 - var9, -122, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method447((byte) 39);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method447((byte) 39) > var5) {
            arg2[var12++] = var6.method427(var6.method447((byte) 39), -121, var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([BIIIII)V")
    private static final void method964(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class130.field2958 * arg2 + arg1;
        int var7 = class130.field2958 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class130.field2962) {
            int var10 = class130.field2962 - arg2;
            arg4 -= var10;
            arg2 = class130.field2962;
            var9 += arg3 * var10;
            var6 += class130.field2958 * var10;
        }
        if (arg2 + arg4 > class130.field2961) {
            arg4 -= arg2 + arg4 - class130.field2961;
        }
        if (arg1 < class130.field2960) {
            int var11 = class130.field2960 - arg1;
            arg3 -= var11;
            arg1 = class130.field2960;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class130.field2963) {
            int var12 = arg1 + arg3 - class130.field2963;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method959(class130.field2959, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lid;IIIII)V")
    public final void method965(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method960(arg3, arg4);
        field2804.setSeed((long) arg5);
        field2815 = (field2804.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1474];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1474; var9++) {
            var7[var9] = var8;
            if ((field2804.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method969(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Lid;IIII)V")
    public final void method966(class60 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method960(arg3, arg4);
            this.method951(arg0, arg1 - this.method946(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Lid;I)V")
    private final void method967(class60 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method447((byte) 39); var5++) {
            int var6 = arg0.method418(var5, (byte) 105);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field2823 = (arg1 - this.method946(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
    public static void method968() {
        field2820 = null;
        field2816 = null;
        field2819 = null;
        field2828 = null;
        field2808 = null;
        field2798 = null;
        field2800 = null;
        field2813 = null;
        field2814 = null;
        field2806 = null;
        field2826 = null;
        field2797 = null;
        field2811 = null;
        field2802 = null;
        field2799 = null;
        field2818 = null;
        field2804 = null;
        field2830 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lid;II[I[I)V")
    private final void method969(class60 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field2809;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field1474; var10++) {
            int var11 = arg0.field1453[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class60 var12 = arg0.method427(var10, -126, var7 + 1);
                    var7 = -1;
                    if (var12.method451(field2820, 11207)) {
                        var11 = 60;
                    } else {
                        if (!var12.method451(field2816, 11207)) {
                            if (var12.method450((byte) -109, field2819)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method421(4, 0).method424(-43);
                                    class29 var16 = field2818[var15];
                                    var16.method224(arg1 + var13, this.field2809 + var6 - var16.field697 + var14);
                                    arg1 += var16.field694;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method954(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field2807 != null && var8 != -1) {
                        arg1 += this.field2807[(var8 << 8) + var11];
                    }
                    int var17 = this.field2817[var11];
                    int var18 = this.field2822[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field2823 > 0) {
                            field2796 += field2823;
                            arg1 += field2796 >> 8;
                            field2796 &= 0xFF;
                        }
                    } else if (field2815 == 256) {
                        if (field2829 != -1) {
                            method964(this.field2825[var11], this.field2801[var11] + arg1 + var19 + 1, this.field2794[var11] + var6 + 1 + var20, var17, var18, field2829);
                        }
                        this.method377(this.field2825[var11], this.field2801[var11] + arg1 + var19, this.field2794[var11] + var6 + var20, var17, var18, field2812);
                    } else {
                        if (field2829 != -1) {
                            method958(this.field2825[var11], this.field2801[var11] + arg1 + var19 + 1, this.field2794[var11] + var6 + 1 + var20, var17, var18, field2829, field2815);
                        }
                        this.method378(this.field2825[var11], this.field2801[var11] + arg1 + var19, this.field2794[var11] + var6 + var20, var17, var18, field2812, field2815);
                    }
                    int var21 = this.field2810[var11];
                    if (field2803 != -1) {
                        class130.method1025(arg1, (int) ((double) this.field2809 * 0.7D) + var6, var21, field2803);
                    }
                    if (field2827 != -1) {
                        class130.method1025(arg1, this.field2809 + var6, var21, field2827);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(Lid;IIIII)V")
    public final void method970(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method960(arg3, arg4);
        int[] var7 = new int[arg0.field1474];
        int[] var8 = new int[arg0.field1474];
        for (int var9 = 0; var9 < arg0.field1474; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method969(arg0, arg1 - this.method946(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
    private final int method971(int arg0) {
        return this.field2810[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class122(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field2801 = arg1;
        this.field2794 = arg2;
        this.field2817 = arg3;
        this.field2822 = arg4;
        this.method949(arg0);
        this.field2825 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2794[var10] < var8 && this.field2822[var10] != 0) {
                var8 = this.field2794[var10];
            }
            if (this.field2822[var10] + this.field2794[var10] > var9) {
                var9 = this.field2822[var10] + this.field2794[var10];
            }
        }
        this.field2821 = this.field2809 - var8;
        this.field2795 = var9 - this.field2809;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
    public class122(byte[] arg0) {
        this.method949(arg0);
    }
}
