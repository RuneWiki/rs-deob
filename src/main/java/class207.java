import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class207 extends class337 {

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Llc;")
    private class455 field2841;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Lgu;")
    private class757 field2849;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Lck;")
    private class733 field2854;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "[[F")
    private float[][] field2867;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[[F")
    private float[][] field2843;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "[[F")
    private float[][] field2856;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "Lmc;")
    private class234 field2839;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "Lqca;")
    private class333 field2859;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Lrda;")
    private class467 field2853;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "Lpm;")
    private class250 field2864;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lnk;")
    private class447 field2851;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Ldea;")
    private class375 field2842;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "Ldea;")
    private class375 field2865;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[I")
    public static int[] field2852 = null;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field2846 = -1;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field2861 = -1;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    private int field2866;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lbj;")
    public static class569 field2845;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "[Lpu;")
    public static class772[] field2858;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[[I")
    public static int[][] field2840;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V", line = 3)
    private final void method1395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2847++;
        long var8 = (long) arg6;
        int var10 = (arg5 << this.field2841.field4372) + arg0;
        int var11 = (arg1 << this.field2841.field4372) + arg2;
        int var12 = this.field2841.method2072((byte) 41, var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class337 var13 = this.field2853.method2616(var8, (byte) 110);
            if (var13 != null) {
                this.method1398(((class97) var13).field1310, (byte) 106);
                return;
            }
        }
        short var14 = (short) (this.field2866++);
        if (var8 != -1L) {
            this.field2853.method2619(new class97(var14), var8, -1);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg2 == 0) {
            var15 = this.field2867[arg3][arg4];
            var16 = this.field2856[arg3][arg4];
            var17 = this.field2843[arg3][arg4];
        } else if (this.field2841.field4369 == arg0 && arg2 == 0) {
            var15 = this.field2867[arg3 + 1][arg4];
            var17 = this.field2843[arg3 + 1][arg4];
            var16 = this.field2856[arg3 + 1][arg4];
        } else if (this.field2841.field4369 == arg0 && this.field2841.field4369 == arg2) {
            var17 = this.field2843[arg3 + 1][arg4 + 1];
            var16 = this.field2856[arg3 + 1][arg4 + 1];
            var15 = this.field2867[arg3 + 1][arg4 + 1];
        } else if (arg0 == 0 && this.field2841.field4369 == arg2) {
            var16 = this.field2856[arg3][arg4 + 1];
            var17 = this.field2843[arg3][arg4 + 1];
            var15 = this.field2867[arg3][arg4 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field2841.field4369;
            float var19 = (float) arg2 / (float) this.field2841.field4369;
            float var20 = this.field2843[arg3][arg4];
            float var21 = this.field2856[arg3][arg4];
            float var22 = this.field2867[arg3][arg4];
            float var23 = this.field2843[arg3 + 1][arg4];
            float var24 = this.field2856[arg3 + 1][arg4];
            float var25 = (this.field2843[arg3][arg4 + 1] - var20) * var18 + var20;
            float var26 = (this.field2856[arg3 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field2843[arg3 + 1][arg4 + 1] - var23) * var18 + var23;
            float var28 = (this.field2867[arg3][arg4 + 1] - var22) * var18 + var22;
            float var29 = (this.field2856[arg3][arg4 + 1] - var21) * var18 + var21;
            float var30 = this.field2867[arg3 + 1][arg4];
            float var31 = (this.field2867[arg3 + 1][arg4 + 1] - var30) * var18 + var30;
            var16 = (var26 - var29) * var19 + var29;
            var17 = (var27 - var25) * var19 + var25;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2849.method4121((byte) -124) - var10);
        float var33 = (float) (this.field2849.method4117(true) - var12);
        float var34 = (float) (this.field2849.method4123(arg6 + 22291) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field2849.method4122(126);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2849.method4124(false);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2854.field9865) {
            this.field2859.method1926((byte) -121, (float) var10);
            this.field2859.method1926((byte) 123, (float) var12);
            this.field2859.method1926((byte) -127, (float) var11);
        } else {
            this.field2859.method1923((float) var10, -2061505808);
            this.field2859.method1923((float) var12, -2061505808);
            this.field2859.method1923((float) var11, -2061505808);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2859.method1491(-129, var45);
        this.field2859.method1491(-129, var46);
        this.field2859.method1491(arg6 - 128, var47);
        this.field2859.method1491(-129, 255);
        this.method1398(var14, (byte) 57);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V", line = 171)
    public static final void method1396(int arg0, boolean arg1) {
        if (class601.field7648 == null) {
            class317.method1854(2);
        }
        field2844++;
        if (arg1) {
            class601.field7648.method1333(-96);
        }
        if (arg0 != 255) {
            field2845 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 197)
    public static void method1397(int arg0) {
        field2852 = null;
        field2845 = null;
        field2840 = null;
        int var1 = 80 / ((arg0 - 42) / 59);
        field2858 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(SB)V", line = 218)
    private final void method1398(short arg0, byte arg1) {
        if (this.field2854.field9865) {
            this.field2839.method1541(374, arg0);
        } else {
            this.field2839.method1514(arg0, (byte) -59);
        }
        int var3 = 39 % ((arg1 - 20) / 33);
        field2855++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[[ZIII)V", line = 247)
    public final void method1399(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field2850++;
        if (this.field2864 == null || this.field2848 > arg0 + arg3 || (arg3 - arg0) > this.field2857 || (arg0 + arg2) < this.field2863 || this.field2862 < (arg2 - arg0)) {
            return;
        }
        int var6 = this.field2863;
        if (arg4 != 13462) {
            return;
        }
        while (this.field2862 >= var6) {
            for (int var7 = this.field2848; var7 <= this.field2857; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (var8 > (-arg0) && arg0 > var8 && var9 > (-arg0) && arg0 > var9 && arg1[var8 + arg0][var9 + arg0]) {
                    this.field2854.method3921((int) (this.field2849.method4120(-6) * 255.0F) << 24, 7077);
                    this.field2854.method3947(this.field2842, null, this.field2865, null, 32886);
                    this.field2854.method3980(this.field2864, this.field2860, true, 4, 0);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lck;Llc;Lgu;[I)V", line = 305)
    public class207(class733 arg0, class455 arg1, class757 arg2, int[] arg3) {
        this.field2841 = arg1;
        this.field2849 = arg2;
        this.field2854 = arg0;
        int var5 = this.field2849.method4122(-118) - (arg1.field4369 >> 1);
        this.field2848 = this.field2849.method4121((byte) -124) - var5 >> arg1.field4372;
        this.field2857 = var5 + this.field2849.method4121((byte) -124) >> arg1.field4372;
        this.field2863 = this.field2849.method4123(22290) - var5 >> arg1.field4372;
        this.field2862 = var5 + this.field2849.method4123(22290) >> arg1.field4372;
        int var6 = this.field2857 + 1 - this.field2848;
        int var7 = this.field2862 + 1 - this.field2863;
        this.field2867 = new float[var6 + 1][var7 + 1];
        this.field2843 = new float[var6 + 1][var7 + 1];
        this.field2856 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field2863 + var8;
            if (var25 > 0 && this.field2841.field4371 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field2848 + var26;
                    if (var27 > 0 && var27 < (this.field2841.field4366 - 1)) {
                        int var28 = arg1.method2060(var25, -115, var27 + 1) - arg1.method2060(var25, -125, var27 - 1);
                        int var29 = arg1.method2060(var25 + 1, -115, var27) - arg1.method2060(var25 - 1, -111, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field2843[var26][var8] = (float) var28 * var30;
                        this.field2856[var26][var8] = var30 * -256.0F;
                        this.field2867[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2863; var10 <= this.field2862; var10++) {
            if (var10 >= 0 && var10 < arg1.field4371) {
                for (int var21 = this.field2848; var21 <= this.field2857; var21++) {
                    if (var21 >= 0 && arg1.field4366 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field5924[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field2860 += 3;
                                    }
                                }
                            } else {
                                this.field2860 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2857 - this.field2848;
            }
        }
        if (this.field2860 > 0) {
            this.field2839 = new class234(this.field2860 * 2);
            this.field2859 = new class333(this.field2860 * 16);
            this.field2853 = new class467(class483.method2714(this.field2860, (byte) -109));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field2863; var13 <= this.field2862; var13++) {
                if (var13 >= 0 && arg1.field4371 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field2848; var15 <= this.field2857; var15++) {
                        if (var15 >= 0 && var15 < arg1.field4366) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field5924[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field5926[var15][var13];
                                    int[] var19 = arg1.field5931[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1395(var18[var20], var13, var19[var20], var14, var12, var15, -1);
                                                var20++;
                                                this.method1395(var18[var20], var13, var19[var20], var14, var12, var15, -1);
                                                var20++;
                                                this.method1395(var18[var20], var13, var19[var20], var14, var12, var15, -1);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1395(0, var13, 0, var14, var12, var15, -1);
                                    this.method1395(arg1.field4369, var13, 0, var14, var12, var15, -1);
                                    this.method1395(0, var13, arg1.field4369, var14, var12, var15, -1);
                                } else if (var16 == 2) {
                                    this.method1395(arg1.field4369, var13, 0, var14, var12, var15, -1);
                                    this.method1395(arg1.field4369, var13, arg1.field4369, var14, var12, var15, -1);
                                    this.method1395(0, var13, 0, var14, var12, var15, -1);
                                } else if (var16 == 5) {
                                    this.method1395(arg1.field4369, var13, arg1.field4369, var14, var12, var15, -1);
                                    this.method1395(0, var13, arg1.field4369, var14, var12, var15, -1);
                                    this.method1395(arg1.field4369, var13, 0, var14, var12, var15, -1);
                                } else if (var16 == 4) {
                                    this.method1395(0, var13, arg1.field4369, var14, var12, var15, -1);
                                    this.method1395(0, var13, 0, var14, var12, var15, -1);
                                    this.method1395(arg1.field4369, var13, arg1.field4369, var14, var12, var15, -1);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field2857 - this.field2848;
                }
                var12++;
            }
            this.field2864 = this.field2854.method3981(5123, this.field2839.field3133, false, this.field2839.field3193, 13);
            this.field2851 = this.field2854.method3912(this.field2859.field3193, false, this.field2859.field3133, 16, 1365);
            this.field2842 = new class375(this.field2851, 5126, 3, 0);
            this.field2865 = new class375(this.field2851, 5121, 4, 12);
        } else {
            this.field2864 = null;
            this.field2851 = null;
            this.field2865 = null;
            this.field2842 = null;
        }
        this.field2839 = null;
        this.field2859 = null;
        this.field2843 = this.field2856 = this.field2867 = null;
        this.field2853 = null;
    }
}
