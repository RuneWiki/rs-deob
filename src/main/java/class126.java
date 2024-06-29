import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 extends class112 {

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    private int field2915 = 0;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "B")
    private byte field2912 = 0;

    @OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
    private int field2931 = 0;

    @OriginalMember(owner = "client!sa", name = "Fb", descriptor = "I")
    private int field2937 = 0;

    @OriginalMember(owner = "client!sa", name = "Pb", descriptor = "Z")
    private boolean field2947 = false;

    @OriginalMember(owner = "client!sa", name = "ub", descriptor = "[I")
    private int[] field2926;

    @OriginalMember(owner = "client!sa", name = "Ob", descriptor = "[I")
    private int[] field2946;

    @OriginalMember(owner = "client!sa", name = "Eb", descriptor = "[I")
    private int[] field2936;

    @OriginalMember(owner = "client!sa", name = "Jb", descriptor = "[I")
    private int[] field2941;

    @OriginalMember(owner = "client!sa", name = "Ab", descriptor = "[I")
    private int[] field2932;

    @OriginalMember(owner = "client!sa", name = "Lb", descriptor = "[I")
    private int[] field2943;

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "[I")
    private int[] field2922;

    @OriginalMember(owner = "client!sa", name = "Hb", descriptor = "[I")
    private int[] field2939;

    @OriginalMember(owner = "client!sa", name = "Mb", descriptor = "[I")
    private int[] field2944;

    @OriginalMember(owner = "client!sa", name = "Bb", descriptor = "[I")
    private int[] field2933;

    @OriginalMember(owner = "client!sa", name = "tb", descriptor = "[B")
    private byte[] field2925;

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "[B")
    private byte[] field2924;

    @OriginalMember(owner = "client!sa", name = "Db", descriptor = "[B")
    private byte[] field2935;

    @OriginalMember(owner = "client!sa", name = "vb", descriptor = "[B")
    private byte[] field2927;

    @OriginalMember(owner = "client!sa", name = "Gb", descriptor = "[I")
    private int[] field2938;

    @OriginalMember(owner = "client!sa", name = "wb", descriptor = "[S")
    private short[] field2928;

    @OriginalMember(owner = "client!sa", name = "yb", descriptor = "[[I")
    private int[][] field2930;

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "[[I")
    private int[][] field2923;

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "[Lfb;")
    private class38[] field2921;

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "[Lwc;")
    private class153[] field2919;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "[Lfb;")
    private class38[] field2917;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "S")
    public short field2911;

    @OriginalMember(owner = "client!sa", name = "xb", descriptor = "S")
    public short field2929;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    private static int field2918 = 0;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "[I")
    private static int[] field2914 = new int[10000];

    @OriginalMember(owner = "client!sa", name = "Cb", descriptor = "[I")
    private static int[] field2934 = new int[10000];

    @OriginalMember(owner = "client!sa", name = "Nb", descriptor = "[I")
    private static int[] field2945 = new int[128];

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    private int field2916;

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!sa", name = "Ib", descriptor = "I")
    private int field2940;

    @OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public final void method966(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2915; ++var4) {
            this.field2926[var4] += arg0;
            this.field2946[var4] += arg1;
            this.field2936[var4] += arg2;
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsa;Lsa;IIIZ)V")
    public static final void method967(class126 arg0, class126 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method976();
        arg0.method980();
        arg1.method976();
        arg1.method980();
        ++field2918;
        int var6 = 0;
        int[] var7 = arg1.field2926;
        int var8 = arg1.field2915;
        for (int var9 = 0; var9 < arg0.field2915; ++var9) {
            class38 var12 = arg0.field2921[var9];
            if (var12.field883 != 0) {
                int var13 = arg0.field2946[var9] - arg3;
                if (var13 <= arg1.field2940) {
                    int var14 = arg0.field2926[var9] - arg2;
                    if (var14 >= arg1.field2913 && var14 <= arg1.field2942) {
                        int var15 = arg0.field2936[var9] - arg4;
                        if (var15 >= arg1.field2916 && var15 <= arg1.field2920) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class38 var17 = arg1.field2921[var16];
                                if (var7[var16] == var14 && arg1.field2936[var16] == var15 && arg1.field2946[var16] == var13 && var17.field883 != 0) {
                                    if (arg0.field2917 == null) {
                                        arg0.field2917 = new class38[arg0.field2915];
                                    }
                                    if (arg1.field2917 == null) {
                                        arg1.field2917 = new class38[var8];
                                    }
                                    class38 var18 = arg0.field2917[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2917[var9] = new class38(var12);
                                    }
                                    class38 var19 = arg1.field2917[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2917[var16] = new class38(var17);
                                    }
                                    var18.field881 += var17.field881;
                                    var18.field895 += var17.field895;
                                    var18.field884 += var17.field884;
                                    var18.field883 += var17.field883;
                                    var19.field881 += var12.field881;
                                    var19.field895 += var12.field895;
                                    var19.field884 += var12.field884;
                                    var19.field883 += var12.field883;
                                    ++var6;
                                    field2914[var9] = field2918;
                                    field2934[var16] = field2918;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2937; ++var10) {
                if (field2914[arg0.field2941[var10]] == field2918 && field2914[arg0.field2932[var10]] == field2918 && field2914[arg0.field2943[var10]] == field2918) {
                    if (arg0.field2925 == null) {
                        arg0.field2925 = new byte[arg0.field2937];
                    }
                    arg0.field2925[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2937; ++var11) {
                if (field2934[arg1.field2941[var11]] == field2918 && field2934[arg1.field2932[var11]] == field2918 && field2934[arg1.field2943[var11]] == field2918) {
                    if (arg1.field2925 == null) {
                        arg1.field2925 = new byte[arg1.field2937];
                    }
                    arg1.field2925[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    private static final int method968(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
    public final void method969(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2915; ++var4) {
            this.field2926[var4] = this.field2926[var4] * arg0 / 128;
            this.field2946[var4] = this.field2946[var4] * arg1 / 128;
            this.field2936[var4] = this.field2936[var4] * arg2 / 128;
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    private final void method970() {
        int var10002;
        if (this.field2933 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2915; ++var3) {
                int var7 = this.field2933[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2930 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2930[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2915) {
                int var6 = this.field2933[var5];
                this.field2930[var6][var1[var6]++] = var5++;
            }
            this.field2933 = null;
        }
        if (this.field2938 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2937; ++var10) {
                int var14 = this.field2938[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2923 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2923[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2937) {
                int var13 = this.field2938[var12];
                this.field2923[var13][var8[var13]++] = var12++;
            }
            this.field2938 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()Lsa;")
    public final class126 method971() {
        class126 var1 = new class126();
        if (this.field2925 != null) {
            var1.field2925 = new byte[this.field2937];
            for (int var2 = 0; var2 < this.field2937; ++var2) {
                var1.field2925[var2] = this.field2925[var2];
            }
        }
        var1.field2915 = this.field2915;
        var1.field2937 = this.field2937;
        var1.field2931 = this.field2931;
        var1.field2926 = this.field2926;
        var1.field2946 = this.field2946;
        var1.field2936 = this.field2936;
        var1.field2941 = this.field2941;
        var1.field2932 = this.field2932;
        var1.field2943 = this.field2943;
        var1.field2935 = this.field2935;
        var1.field2927 = this.field2927;
        var1.field2924 = this.field2924;
        var1.field2928 = this.field2928;
        var1.field2912 = this.field2912;
        var1.field2922 = this.field2922;
        var1.field2939 = this.field2939;
        var1.field2944 = this.field2944;
        var1.field2933 = this.field2933;
        var1.field2938 = this.field2938;
        var1.field2930 = this.field2930;
        var1.field2923 = this.field2923;
        var1.field2921 = this.field2921;
        var1.field2919 = this.field2919;
        var1.field2911 = this.field2911;
        var1.field2929 = this.field2929;
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
    private final void method972() {
        this.field2921 = null;
        this.field2917 = null;
        this.field2919 = null;
        this.field2947 = false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(SS)V")
    public final void method973(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2937; ++var3) {
            if (this.field2928[var3] == arg0) {
                this.field2928[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lmd;II)Lsa;")
    public static final class126 method974(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method669(arg2, arg1, -21);
        return var3 == null ? null : new class126(var3);
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)I")
    private static final int method975(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field2945[arg0];
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
    private final void method976() {
        if (!this.field2947) {
            super.field2607 = 0;
            this.field2940 = 0;
            this.field2913 = 999999;
            this.field2942 = -999999;
            this.field2920 = -99999;
            this.field2916 = 99999;
            for (int var1 = 0; var1 < this.field2915; ++var1) {
                int var2 = this.field2926[var1];
                int var3 = this.field2946[var1];
                int var4 = this.field2936[var1];
                if (var2 < this.field2913) {
                    this.field2913 = var2;
                }
                if (var2 > this.field2942) {
                    this.field2942 = var2;
                }
                if (var4 < this.field2916) {
                    this.field2916 = var4;
                }
                if (var4 > this.field2920) {
                    this.field2920 = var4;
                }
                if (-var3 > super.field2607) {
                    super.field2607 = -var3;
                }
                if (var3 > this.field2940) {
                    this.field2940 = var3;
                }
            }
            this.field2947 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lsa;I)I")
    private final int method977(class126 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2926[arg1];
        int var5 = arg0.field2946[arg1];
        int var6 = arg0.field2936[arg1];
        for (int var7 = 0; var7 < this.field2915; ++var7) {
            if (this.field2926[var7] == var4 && this.field2946[var7] == var5 && this.field2936[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2926[this.field2915] = var4;
            this.field2946[this.field2915] = var5;
            this.field2936[this.field2915] = var6;
            if (arg0.field2933 != null) {
                this.field2933[this.field2915] = arg0.field2933[arg1];
            }
            var3 = this.field2915++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "()V")
    public final void method978() {
        for (int var1 = 0; var1 < this.field2915; ++var1) {
            int var2 = this.field2936[var1];
            this.field2936[var1] = this.field2926[var1];
            this.field2926[var1] = -var2;
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    public final void method979() {
        for (int var1 = 0; var1 < this.field2915; ++var1) {
            int var2 = this.field2926[var1];
            this.field2926[var1] = this.field2936[var1];
            this.field2936[var1] = -var2;
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "()V")
    public final void method980() {
        if (this.field2921 == null) {
            this.field2921 = new class38[this.field2915];
            for (int var1 = 0; var1 < this.field2915; ++var1) {
                this.field2921[var1] = new class38();
            }
            for (int var2 = 0; var2 < this.field2937; ++var2) {
                int var3 = this.field2941[var2];
                int var4 = this.field2932[var2];
                int var5 = this.field2943[var2];
                int var6 = this.field2926[var4] - this.field2926[var3];
                int var7 = this.field2946[var4] - this.field2946[var3];
                int var8 = this.field2936[var4] - this.field2936[var3];
                int var9 = this.field2926[var5] - this.field2926[var3];
                int var10 = this.field2946[var5] - this.field2946[var3];
                int var11 = this.field2936[var5] - this.field2936[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field2925 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2925[var2];
                }
                if (var19 == 0) {
                    class38 var20 = this.field2921[var3];
                    var20.field881 += var16;
                    var20.field895 += var17;
                    var20.field884 += var18;
                    ++var20.field883;
                    class38 var21 = this.field2921[var4];
                    var21.field881 += var16;
                    var21.field895 += var17;
                    var21.field884 += var18;
                    ++var21.field883;
                    class38 var22 = this.field2921[var5];
                    var22.field881 += var16;
                    var22.field895 += var17;
                    var22.field884 += var18;
                    ++var22.field883;
                } else if (var19 == 1) {
                    if (this.field2919 == null) {
                        this.field2919 = new class153[this.field2937];
                    }
                    class153 var23 = this.field2919[var2] = new class153();
                    var23.field3491 = var16;
                    var23.field3508 = var17;
                    var23.field3489 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "()V")
    public static void method981() {
        field2914 = null;
        field2934 = null;
        field2945 = null;
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "()V")
    public final void method982() {
        for (int var1 = 0; var1 < this.field2915; ++var1) {
            this.field2936[var1] = -this.field2936[var1];
        }
        for (int var2 = 0; var2 < this.field2937; ++var2) {
            int var3 = this.field2941[var2];
            this.field2941[var2] = this.field2943[var2];
            this.field2943[var2] = var3;
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZ)Lsa;")
    public final class126 method983(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class126 var6;
            if (arg4) {
                var6 = new class126();
                var6.field2915 = this.field2915;
                var6.field2937 = this.field2937;
                var6.field2931 = this.field2931;
                var6.field2926 = this.field2926;
                var6.field2936 = this.field2936;
                var6.field2941 = this.field2941;
                var6.field2932 = this.field2932;
                var6.field2943 = this.field2943;
                var6.field2925 = this.field2925;
                var6.field2935 = this.field2935;
                var6.field2927 = this.field2927;
                var6.field2924 = this.field2924;
                var6.field2928 = this.field2928;
                var6.field2912 = this.field2912;
                var6.field2922 = this.field2922;
                var6.field2939 = this.field2939;
                var6.field2944 = this.field2944;
                var6.field2933 = this.field2933;
                var6.field2938 = this.field2938;
                var6.field2930 = this.field2930;
                var6.field2923 = this.field2923;
                var6.field2911 = this.field2911;
                var6.field2929 = this.field2929;
                var6.field2946 = new int[var6.field2915];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field2915; ++var8) {
                int var9 = this.field2926[var8];
                int var10 = this.field2946[var8];
                int var11 = this.field2936[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field2946[var8] = var10 + var14 - var7;
            }
            var6.method972();
            return var6;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)Lda;")
    public final class23 method984(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method980();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class23 var8 = new class23();
        var8.field487 = new int[this.field2937];
        var8.field495 = new int[this.field2937];
        var8.field506 = new int[this.field2937];
        for (int var9 = 0; var9 < this.field2937; ++var9) {
            byte var10;
            if (this.field2925 == null) {
                var10 = 0;
            } else {
                var10 = this.field2925[var9];
            }
            if (this.field2924 != null && this.field2924[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class153 var17 = this.field2919[var9];
                        int var18 = (var17.field3489 * arg4 + var17.field3508 * arg3 + var17.field3491 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field487[var9] = method975(var18);
                        var8.field506[var9] = -1;
                    } else {
                        var8.field506[var9] = -2;
                    }
                } else {
                    class38 var11;
                    if (this.field2917 != null && this.field2917[this.field2941[var9]] != null) {
                        var11 = this.field2917[this.field2941[var9]];
                    } else {
                        var11 = this.field2921[this.field2941[var9]];
                    }
                    int var12 = (var11.field884 * arg4 + var11.field895 * arg3 + var11.field881 * arg2) / (var11.field883 * var7) + arg0;
                    var8.field487[var9] = method975(var12);
                    class38 var13;
                    if (this.field2917 != null && this.field2917[this.field2932[var9]] != null) {
                        var13 = this.field2917[this.field2932[var9]];
                    } else {
                        var13 = this.field2921[this.field2932[var9]];
                    }
                    int var14 = (var13.field884 * arg4 + var13.field895 * arg3 + var13.field881 * arg2) / (var13.field883 * var7) + arg0;
                    var8.field495[var9] = method975(var14);
                    class38 var15;
                    if (this.field2917 != null && this.field2917[this.field2943[var9]] != null) {
                        var15 = this.field2917[this.field2943[var9]];
                    } else {
                        var15 = this.field2921[this.field2943[var9]];
                    }
                    int var16 = (var15.field884 * arg4 + var15.field895 * arg3 + var15.field881 * arg2) / (var15.field883 * var7) + arg0;
                    var8.field506[var9] = method975(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class153 var26 = this.field2919[var9];
                    int var27 = (var26.field3489 * arg4 + var26.field3508 * arg3 + var26.field3491 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field487[var9] = method968(this.field2928[var9] & 65535, var27);
                    var8.field506[var9] = -1;
                } else {
                    var8.field506[var9] = -2;
                }
            } else {
                int var19 = this.field2928[var9] & 65535;
                class38 var20;
                if (this.field2917 != null && this.field2917[this.field2941[var9]] != null) {
                    var20 = this.field2917[this.field2941[var9]];
                } else {
                    var20 = this.field2921[this.field2941[var9]];
                }
                int var21 = (var20.field884 * arg4 + var20.field895 * arg3 + var20.field881 * arg2) / (var20.field883 * var7) + arg0;
                var8.field487[var9] = method968(var19, var21);
                class38 var22;
                if (this.field2917 != null && this.field2917[this.field2932[var9]] != null) {
                    var22 = this.field2917[this.field2932[var9]];
                } else {
                    var22 = this.field2921[this.field2932[var9]];
                }
                int var23 = (var22.field884 * arg4 + var22.field895 * arg3 + var22.field881 * arg2) / (var22.field883 * var7) + arg0;
                var8.field495[var9] = method968(var19, var23);
                class38 var24;
                if (this.field2917 != null && this.field2917[this.field2943[var9]] != null) {
                    var24 = this.field2917[this.field2943[var9]];
                } else {
                    var24 = this.field2921[this.field2943[var9]];
                }
                int var25 = (var24.field884 * arg4 + var24.field895 * arg3 + var24.field881 * arg2) / (var24.field883 * var7) + arg0;
                var8.field506[var9] = method968(var19, var25);
            }
        }
        this.method970();
        var8.field503 = this.field2915;
        var8.field492 = this.field2926;
        var8.field491 = this.field2946;
        var8.field519 = this.field2936;
        var8.field511 = this.field2937;
        var8.field488 = this.field2941;
        var8.field504 = this.field2932;
        var8.field502 = this.field2943;
        var8.field483 = this.field2935;
        var8.field505 = this.field2927;
        var8.field496 = this.field2924;
        if (var8.field496 != null) {
            var8.field494 = this.field2928;
        } else {
            var8.field494 = null;
        }
        var8.field493 = this.field2912;
        var8.field530 = this.field2931;
        var8.field507 = this.field2922;
        var8.field501 = this.field2939;
        var8.field499 = this.field2944;
        var8.field509 = this.field2930;
        var8.field484 = this.field2923;
        return var8;
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "()V")
    public final void method985() {
        for (int var1 = 0; var1 < this.field2915; ++var1) {
            this.field2926[var1] = -this.field2926[var1];
            this.field2936[var1] = -this.field2936[var1];
        }
        this.method972();
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    private class126() {
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([B)V")
    private class126(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2995 = arg0.length - 18;
        int var9 = var4.method1020(false);
        int var10 = var4.method1020(false);
        int var11 = var4.method1011(63);
        int var12 = var4.method1011(97);
        int var13 = var4.method1011(108);
        int var14 = var4.method1011(55);
        int var15 = var4.method1011(54);
        int var16 = var4.method1011(46);
        int var17 = var4.method1020(false);
        int var18 = var4.method1020(false);
        int var19 = var4.method1020(false);
        int var20 = var4.method1020(false);
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
        this.field2915 = var9;
        this.field2937 = var10;
        this.field2931 = var11;
        this.field2926 = new int[var9];
        this.field2946 = new int[var9];
        this.field2936 = new int[var9];
        this.field2941 = new int[var10];
        this.field2932 = new int[var10];
        this.field2943 = new int[var10];
        if (var11 > 0) {
            this.field2922 = new int[var11];
            this.field2939 = new int[var11];
            this.field2944 = new int[var11];
        }
        if (var16 == 1) {
            this.field2933 = new int[var9];
        }
        if (var12 == 1) {
            this.field2925 = new byte[var10];
            this.field2924 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2935 = new byte[var10];
        } else {
            this.field2912 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2927 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2938 = new int[var10];
        }
        this.field2928 = new short[var10];
        var4.field2995 = var21;
        var5.field2995 = var36;
        var6.field2995 = var38;
        var7.field2995 = var40;
        var8.field2995 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method1011(77);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method1021(65536);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method1021(65536);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method1021(65536);
            }
            this.field2926[var46] = var43 + var60;
            this.field2946[var46] = var44 + var61;
            this.field2936[var46] = var45 + var62;
            var43 = this.field2926[var46];
            var44 = this.field2946[var46];
            var45 = this.field2936[var46];
            if (var16 == 1) {
                this.field2933[var46] = var8.method1011(35);
            }
        }
        var4.field2995 = var32;
        var5.field2995 = var28;
        var6.field2995 = var26;
        var7.field2995 = var30;
        var8.field2995 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2928[var47] = (short) var4.method1020(false);
            if (var12 == 1) {
                int var58 = var5.method1011(92);
                if ((var58 & 1) == 1) {
                    this.field2925[var47] = 1;
                    var3 = true;
                } else {
                    this.field2925[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field2924[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field2924[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2935[var47] = var6.method996(4);
            }
            if (var14 == 1) {
                this.field2927[var47] = var7.method996(4);
            }
            if (var15 == 1) {
                this.field2938[var47] = var8.method1011(78);
            }
        }
        var4.field2995 = var25;
        var5.field2995 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method1011(59);
            if (var54 == 1) {
                var48 = var4.method1021(65536) + var51;
                var49 = var4.method1021(65536) + var48;
                var50 = var4.method1021(65536) + var49;
                var51 = var50;
                this.field2941[var52] = var48;
                this.field2932[var52] = var49;
                this.field2943[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method1021(65536) + var51;
                var51 = var50;
                this.field2941[var52] = var48;
                this.field2932[var52] = var49;
                this.field2943[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method1021(65536) + var51;
                var51 = var50;
                this.field2941[var52] = var48;
                this.field2932[var52] = var49;
                this.field2943[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method1021(65536) + var51;
                var51 = var50;
                this.field2941[var52] = var48;
                this.field2932[var52] = var57;
                this.field2943[var52] = var50;
            }
        }
        var4.field2995 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2922[var53] = var4.method1020(false);
            this.field2939[var53] = var4.method1020(false);
            this.field2944[var53] = var4.method1020(false);
        }
        if (!var2) {
            this.field2924 = null;
        }
        if (!var3) {
            this.field2925 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "([Lsa;I)V")
    public class126(class126[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field2915 = 0;
        this.field2937 = 0;
        this.field2931 = 0;
        this.field2912 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class126 var14 = arg0[var8];
            if (var14 != null) {
                this.field2915 += var14.field2915;
                this.field2937 += var14.field2937;
                this.field2931 += var14.field2931;
                if (var14.field2935 != null) {
                    var4 = true;
                } else {
                    if (this.field2912 == -1) {
                        this.field2912 = var14.field2912;
                    }
                    if (this.field2912 != var14.field2912) {
                        var4 = true;
                    }
                }
                var3 |= var14.field2925 != null;
                var5 |= var14.field2927 != null;
                var6 |= var14.field2938 != null;
                var7 |= var14.field2924 != null;
            }
        }
        this.field2926 = new int[this.field2915];
        this.field2946 = new int[this.field2915];
        this.field2936 = new int[this.field2915];
        this.field2933 = new int[this.field2915];
        this.field2941 = new int[this.field2937];
        this.field2932 = new int[this.field2937];
        this.field2943 = new int[this.field2937];
        if (this.field2931 > 0) {
            this.field2922 = new int[this.field2931];
            this.field2939 = new int[this.field2931];
            this.field2944 = new int[this.field2931];
        }
        if (var3) {
            this.field2925 = new byte[this.field2937];
        }
        if (var4) {
            this.field2935 = new byte[this.field2937];
        }
        if (var5) {
            this.field2927 = new byte[this.field2937];
        }
        if (var7) {
            this.field2924 = new byte[this.field2937];
        }
        if (var6) {
            this.field2938 = new int[this.field2937];
        }
        this.field2928 = new short[this.field2937];
        this.field2915 = 0;
        this.field2937 = 0;
        this.field2931 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class126 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2937; ++var12) {
                    if (var3 && var11.field2925 != null) {
                        this.field2925[this.field2937] = var11.field2925[var12];
                    }
                    if (var4) {
                        if (var11.field2935 != null) {
                            this.field2935[this.field2937] = var11.field2935[var12];
                        } else {
                            this.field2935[this.field2937] = var11.field2912;
                        }
                    }
                    if (var5 && var11.field2927 != null) {
                        this.field2927[this.field2937] = var11.field2927[var12];
                    }
                    if (var7) {
                        if (var11.field2924 != null && var11.field2924[var12] != -1) {
                            this.field2924[this.field2937] = (byte) (var11.field2924[var12] + var9);
                        } else {
                            this.field2924[this.field2937] = -1;
                        }
                    }
                    if (var6 && var11.field2938 != null) {
                        this.field2938[this.field2937] = var11.field2938[var12];
                    }
                    this.field2928[this.field2937] = var11.field2928[var12];
                    this.field2941[this.field2937] = this.method977(var11, var11.field2941[var12]);
                    this.field2932[this.field2937] = this.method977(var11, var11.field2932[var12]);
                    this.field2943[this.field2937] = this.method977(var11, var11.field2943[var12]);
                    ++this.field2937;
                }
                for (int var13 = 0; var13 < var11.field2931; ++var13) {
                    this.field2922[this.field2931] = this.method977(var11, var11.field2922[var13]);
                    this.field2939[this.field2931] = this.method977(var11, var11.field2939[var13]);
                    this.field2944[this.field2931] = this.method977(var11, var11.field2944[var13]);
                    ++this.field2931;
                }
                var9 += var11.field2931;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lsa;ZZZ)V")
    public class126(class126 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field2915 = arg0.field2915;
        this.field2937 = arg0.field2937;
        this.field2931 = arg0.field2931;
        if (arg1) {
            this.field2926 = arg0.field2926;
            this.field2946 = arg0.field2946;
            this.field2936 = arg0.field2936;
        } else {
            this.field2926 = new int[this.field2915];
            this.field2946 = new int[this.field2915];
            this.field2936 = new int[this.field2915];
            for (int var5 = 0; var5 < this.field2915; ++var5) {
                this.field2926[var5] = arg0.field2926[var5];
                this.field2946[var5] = arg0.field2946[var5];
                this.field2936[var5] = arg0.field2936[var5];
            }
        }
        if (arg2) {
            this.field2928 = arg0.field2928;
        } else {
            this.field2928 = new short[this.field2937];
            for (int var6 = 0; var6 < this.field2937; ++var6) {
                this.field2928[var6] = arg0.field2928[var6];
            }
        }
        if (arg3) {
            this.field2927 = arg0.field2927;
        } else {
            this.field2927 = new byte[this.field2937];
            if (arg0.field2927 == null) {
                for (int var7 = 0; var7 < this.field2937; ++var7) {
                    this.field2927[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field2937; ++var8) {
                    this.field2927[var8] = arg0.field2927[var8];
                }
            }
        }
        this.field2941 = arg0.field2941;
        this.field2932 = arg0.field2932;
        this.field2943 = arg0.field2943;
        this.field2925 = arg0.field2925;
        this.field2935 = arg0.field2935;
        this.field2924 = arg0.field2924;
        this.field2912 = arg0.field2912;
        this.field2922 = arg0.field2922;
        this.field2939 = arg0.field2939;
        this.field2944 = arg0.field2944;
        this.field2933 = arg0.field2933;
        this.field2938 = arg0.field2938;
        this.field2930 = arg0.field2930;
        this.field2923 = arg0.field2923;
        this.field2921 = arg0.field2921;
        this.field2919 = arg0.field2919;
        this.field2917 = arg0.field2917;
        this.field2911 = arg0.field2911;
        this.field2929 = arg0.field2929;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field2945[var0++] = 255;
        }
        while (var0 < 16) {
            field2945[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field2945[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field2945[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field2945[var0++] = var1--;
        }
    }
}
