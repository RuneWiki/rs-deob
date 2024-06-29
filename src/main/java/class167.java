import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class167 extends class164 {

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "B")
    private byte field3193 = 0;

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
    private int field3203 = 0;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "[I")
    private int[] field3200;

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "[I")
    private int[] field3205;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
    private int[] field3195;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "[B")
    private byte[] field3196;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "[B")
    private byte[] field3190;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "[I")
    private int[] field3191;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "[I")
    private int[] field3192;

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "[I")
    private int[] field3204;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[S")
    private short[] field3189;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "[I")
    private int[] field3194;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "[I")
    private int[] field3201;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "[I")
    private int[] field3198;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "[B")
    private byte[] field3197;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "Lsd;")
    private static class167 field3199 = new class167();

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "[B")
    private static byte[] field3202 = new byte[1];

    @OriginalMember(owner = "client!sd", name = "yb", descriptor = "Lsd;")
    private static class167 field3206 = new class167();

    @OriginalMember(owner = "client!sd", name = "Db", descriptor = "[I")
    private static int[] field3211 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Ib", descriptor = "[I")
    private static int[] field3216 = new int[2000];

    @OriginalMember(owner = "client!sd", name = "Cb", descriptor = "[I")
    private static int[] field3210 = new int[12];

    @OriginalMember(owner = "client!sd", name = "Eb", descriptor = "[I")
    private static int[] field3212 = new int[1600];

    @OriginalMember(owner = "client!sd", name = "Nb", descriptor = "[Z")
    private static boolean[] field3221 = new boolean[4096];

    @OriginalMember(owner = "client!sd", name = "Rb", descriptor = "[[I")
    private static int[][] field3225 = new int[12][2000];

    @OriginalMember(owner = "client!sd", name = "Sb", descriptor = "[I")
    private static int[] field3226 = new int[2000];

    @OriginalMember(owner = "client!sd", name = "Hb", descriptor = "[I")
    private static int[] field3215 = new int[10];

    @OriginalMember(owner = "client!sd", name = "Mb", descriptor = "[Z")
    private static boolean[] field3220 = new boolean[4096];

    @OriginalMember(owner = "client!sd", name = "Vb", descriptor = "[I")
    private static int[] field3229 = new int[10];

    @OriginalMember(owner = "client!sd", name = "Gb", descriptor = "[I")
    private static int[] field3214 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Ub", descriptor = "[I")
    private static int[] field3228 = class113.field2111;

    @OriginalMember(owner = "client!sd", name = "Pb", descriptor = "[I")
    private static int[] field3223 = new int[12];

    @OriginalMember(owner = "client!sd", name = "Lb", descriptor = "[B")
    private static byte[] field3219 = new byte[1];

    @OriginalMember(owner = "client!sd", name = "Qb", descriptor = "[I")
    private static int[] field3224 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Ab", descriptor = "[I")
    private static int[] field3208 = class113.field2124;

    @OriginalMember(owner = "client!sd", name = "Tb", descriptor = "[I")
    private static int[] field3227 = new int[10];

    @OriginalMember(owner = "client!sd", name = "Bb", descriptor = "[I")
    private static int[] field3209 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[I")
    private static int[] field3217 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Yb", descriptor = "[I")
    private static int[] field3232 = new int[4096];

    @OriginalMember(owner = "client!sd", name = "Wb", descriptor = "[[I")
    private static int[][] field3230 = new int[1600][512];

    @OriginalMember(owner = "client!sd", name = "Fb", descriptor = "[I")
    private static int[] field3213 = class113.field2126;

    @OriginalMember(owner = "client!sd", name = "Xb", descriptor = "[I")
    private static int[] field3231 = class113.field2120;

    @OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
    private static int field3207;

    @OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
    private static int field3218;

    @OriginalMember(owner = "client!sd", name = "Ob", descriptor = "I")
    private static int field3222;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)Lsa;")
    public final class164 method1088(boolean arg0) {
        if (!arg0 && field3202.length < super.field3143) {
            field3202 = new byte[super.field3143 + 100];
        }
        return this.method1110(arg0, field3199, field3202);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
    public final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.method1093();
            int var8 = class113.field2121;
            int var9 = class113.field2112;
            int var10 = field3208[arg0];
            int var11 = field3231[arg0];
            int var12 = field3208[arg1];
            int var13 = field3231[arg1];
            int var14 = field3208[arg2];
            int var15 = field3231[arg2];
            int var16 = field3208[arg3];
            int var17 = field3231[arg3];
            int var18 = arg5 * var16 + arg6 * var17 >> 16;
            for (int var19 = 0; var19 < super.field3139; ++var19) {
                int var20 = super.field3149[var19];
                int var21 = super.field3137[var19];
                int var22 = super.field3152[var19];
                if (arg2 != 0) {
                    int var23 = var14 * var21 + var15 * var20 >> 16;
                    var21 = var15 * var21 - var14 * var20 >> 16;
                    var20 = var23;
                }
                if (arg0 != 0) {
                    int var24 = var11 * var21 - var10 * var22 >> 16;
                    var22 = var10 * var21 + var11 * var22 >> 16;
                    var21 = var24;
                }
                if (arg1 != 0) {
                    int var25 = var12 * var22 + var13 * var20 >> 16;
                    var22 = var13 * var22 - var12 * var20 >> 16;
                    var20 = var25;
                }
                int var26 = arg4 + var20;
                int var27 = arg5 + var21;
                int var28 = arg6 + var22;
                int var29 = var17 * var27 - var16 * var28 >> 16;
                int var30 = var16 * var27 + var17 * var28 >> 16;
                field3211[var19] = var30 - var18;
                field3217[var19] = (var26 << 9) / var30 + var8;
                field3209[var19] = (var29 << 9) / var30 + var9;
                if (this.field3203 > 0) {
                    field3224[var19] = var26;
                    field3214[var19] = var29;
                    field3232[var19] = var30;
                }
            }
            this.method1109(false, false, 0, super.field3142, super.field3142 << 1);
        } catch (RuntimeException var32) {
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)Lsa;")
    public final class164 method1087(boolean arg0) {
        if (!arg0 && field3219.length < super.field3143) {
            field3219 = new byte[super.field3143 + 100];
        }
        return this.method1110(arg0, field3206, field3219);
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)I")
    private static final int method1104(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIIIZI)Lsa;")
    public final class164 method1091(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1093();
        int var7 = super.field3135 + arg1;
        int var8 = super.field3136 + arg1;
        int var9 = super.field3148 + arg3;
        int var10 = super.field3150 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class167 var15;
                if (arg4) {
                    var15 = new class167();
                    var15.field3139 = super.field3139;
                    var15.field3143 = super.field3143;
                    var15.field3203 = this.field3203;
                    var15.field3149 = super.field3149;
                    var15.field3152 = super.field3152;
                    var15.field3200 = this.field3200;
                    var15.field3205 = this.field3205;
                    var15.field3195 = this.field3195;
                    var15.field3191 = this.field3191;
                    var15.field3192 = this.field3192;
                    var15.field3204 = this.field3204;
                    var15.field3196 = this.field3196;
                    var15.field3190 = this.field3190;
                    var15.field3197 = this.field3197;
                    var15.field3189 = this.field3189;
                    var15.field3193 = this.field3193;
                    var15.field3194 = this.field3194;
                    var15.field3201 = this.field3201;
                    var15.field3198 = this.field3198;
                    var15.field3153 = super.field3153;
                    var15.field3141 = super.field3141;
                    var15.field3132 = super.field3132;
                    var15.field3137 = new int[var15.field3139];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3139; ++var16) {
                        int var17 = super.field3149[var16] + arg1;
                        int var18 = super.field3152[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3137[var16] = super.field3137[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3139; ++var26) {
                        int var27 = (super.field3137[var26] << 16) / super.field2341;
                        if (var27 < arg5) {
                            int var28 = super.field3149[var26] + arg1;
                            int var29 = super.field3152[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3137[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + super.field3137[var26];
                        } else {
                            var15.field3137[var26] = super.field3137[var26];
                        }
                    }
                }
                super.field3154 = false;
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsa;)Lsa;")
    public final class164 method1105(class164 arg0) {
        return new class167(new class167[] { this, (class167) arg0 }, 2);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lud;ILud;I[I)V")
    public final void method1092(class185 arg0, int arg1, class185 arg2, int arg3, int[] arg4) {
        if (arg1 != -1) {
            if (arg4 != null && arg3 != -1) {
                class90 var6 = arg0.field3525[arg1];
                class90 var7 = arg2.field3525[arg3];
                class166 var8 = var6.field1585;
                field3218 = 0;
                field3207 = 0;
                field3222 = 0;
                byte var9 = 0;
                int var17 = var9 + 1;
                int var10 = arg4[var9];
                for (int var11 = 0; var11 < var6.field1588; ++var11) {
                    int var16 = var6.field1579[var11];
                    while (var16 > var10) {
                        var10 = arg4[var17++];
                    }
                    if (var10 != var16 || var8.field3185[var16] == 0) {
                        this.method1113(var8.field3185[var16], var8.field3179[var16], var6.field1584[var11], var6.field1583[var11], var6.field1578[var11]);
                    }
                }
                field3218 = 0;
                field3207 = 0;
                field3222 = 0;
                byte var12 = 0;
                int var18 = var12 + 1;
                int var13 = arg4[var12];
                for (int var14 = 0; var14 < var7.field1588; ++var14) {
                    int var15 = var7.field1579[var14];
                    while (var15 > var13) {
                        var13 = arg4[var18++];
                    }
                    if (var13 == var15 || var8.field3185[var15] == 0) {
                        this.method1113(var8.field3185[var15], var8.field3179[var15], var7.field1584[var14], var7.field1583[var14], var7.field1578[var14]);
                    }
                }
                super.field3154 = false;
            } else {
                this.method1084(arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
    private final void method1106(int arg0) {
        if (field3221[arg0]) {
            this.method1107(arg0);
        } else {
            int var2 = this.field3200[arg0];
            int var3 = this.field3205[arg0];
            int var4 = this.field3195[arg0];
            class113.field2117 = field3220[arg0];
            if (this.field3190 == null) {
                class113.field2119 = 0;
            } else {
                class113.field2119 = this.field3190[arg0] & 255;
            }
            if (this.field3189 != null && this.field3189[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (this.field3197 != null && this.field3197[arg0] != -1) {
                    int var5 = this.field3197[arg0] & 255;
                    var6 = this.field3194[var5];
                    var7 = this.field3201[var5];
                    var8 = this.field3198[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (this.field3204[arg0] == -1) {
                    class113.method757(field3209[var2], field3209[var3], field3209[var4], field3217[var2], field3217[var3], field3217[var4], this.field3191[arg0], this.field3191[arg0], this.field3191[arg0], field3224[var6], field3224[var7], field3224[var8], field3214[var6], field3214[var7], field3214[var8], field3232[var6], field3232[var7], field3232[var8], this.field3189[arg0]);
                } else {
                    class113.method757(field3209[var2], field3209[var3], field3209[var4], field3217[var2], field3217[var3], field3217[var4], this.field3191[arg0], this.field3192[arg0], this.field3204[arg0], field3224[var6], field3224[var7], field3224[var8], field3214[var6], field3214[var7], field3214[var8], field3232[var6], field3232[var7], field3232[var8], this.field3189[arg0]);
                }
            } else if (this.field3204[arg0] == -1) {
                class113.method758(field3209[var2], field3209[var3], field3209[var4], field3217[var2], field3217[var3], field3217[var4], field3213[this.field3191[arg0]]);
            } else {
                class113.method744(field3209[var2], field3209[var3], field3209[var4], field3217[var2], field3217[var3], field3217[var4], this.field3191[arg0], this.field3192[arg0], this.field3204[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
    private final void method1107(int arg0) {
        int var2 = class113.field2121;
        int var3 = class113.field2112;
        int var4 = 0;
        int var5 = this.field3200[arg0];
        int var6 = this.field3205[arg0];
        int var7 = this.field3195[arg0];
        int var8 = field3232[var5];
        int var9 = field3232[var6];
        int var10 = field3232[var7];
        if (this.field3190 == null) {
            class113.field2119 = 0;
        } else {
            class113.field2119 = this.field3190[arg0] & 255;
        }
        if (var8 >= 50) {
            field3227[var4] = field3217[var5];
            field3215[var4] = field3209[var5];
            field3229[var4++] = this.field3191[arg0];
        } else {
            int var11 = field3224[var5];
            int var12 = field3214[var5];
            int var13 = this.field3191[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field3228[var10 - var8];
                field3227[var4] = (((field3224[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3204[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field3228[var9 - var8];
                field3227[var4] = (((field3224[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3192[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field3227[var4] = field3217[var6];
            field3215[var4] = field3209[var6];
            field3229[var4++] = this.field3192[arg0];
        } else {
            int var16 = field3224[var6];
            int var17 = field3214[var6];
            int var18 = this.field3192[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field3228[var8 - var9];
                field3227[var4] = (((field3224[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3191[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field3228[var10 - var9];
                field3227[var4] = (((field3224[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3204[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field3227[var4] = field3217[var7];
            field3215[var4] = field3209[var7];
            field3229[var4++] = this.field3204[arg0];
        } else {
            int var21 = field3224[var7];
            int var22 = field3214[var7];
            int var23 = this.field3204[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field3228[var9 - var10];
                field3227[var4] = (((field3224[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3192[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field3228[var8 - var10];
                field3227[var4] = (((field3224[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
                field3215[var4] = (((field3214[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
                field3229[var4++] = ((this.field3191[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field3227[0];
        int var27 = field3227[1];
        int var28 = field3227[2];
        int var29 = field3215[0];
        int var30 = field3215[1];
        int var31 = field3215[2];
        class113.field2117 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class113.field2125 || var27 > class113.field2125 || var28 > class113.field2125) {
                class113.field2117 = true;
            }
            if (this.field3189 != null && this.field3189[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field3197 != null && this.field3197[arg0] != -1) {
                    int var32 = this.field3197[arg0] & 255;
                    var33 = this.field3194[var32];
                    var34 = this.field3201[var32];
                    var35 = this.field3198[var32];
                } else {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                }
                if (this.field3204[arg0] == -1) {
                    class113.method757(var29, var30, var31, var26, var27, var28, this.field3191[arg0], this.field3191[arg0], this.field3191[arg0], field3224[var33], field3224[var34], field3224[var35], field3214[var33], field3214[var34], field3214[var35], field3232[var33], field3232[var34], field3232[var35], this.field3189[arg0]);
                } else {
                    class113.method757(var29, var30, var31, var26, var27, var28, field3229[0], field3229[1], field3229[2], field3224[var33], field3224[var34], field3224[var35], field3214[var33], field3214[var34], field3214[var35], field3232[var33], field3232[var34], field3232[var35], this.field3189[arg0]);
                }
            } else if (this.field3204[arg0] == -1) {
                class113.method758(var29, var30, var31, var26, var27, var28, field3213[this.field3191[arg0]]);
            } else {
                class113.method744(var29, var30, var31, var26, var27, var28, field3229[0], field3229[1], field3229[2]);
            }
        }
        if (var4 == 4) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > class113.field2125 || var27 > class113.field2125 || var28 > class113.field2125 || field3227[3] < 0 || field3227[3] > class113.field2125) {
                class113.field2117 = true;
            }
            if (this.field3189 == null || this.field3189[arg0] == -1) {
                if (this.field3204[arg0] == -1) {
                    int var41 = field3213[this.field3191[arg0]];
                    class113.method758(var29, var30, var31, var26, var27, var28, var41);
                    class113.method758(var29, var31, field3215[3], var26, var28, field3227[3], var41);
                    return;
                }
                class113.method744(var29, var30, var31, var26, var27, var28, field3229[0], field3229[1], field3229[2]);
                class113.method744(var29, var31, field3215[3], var26, var28, field3227[3], field3229[0], field3229[2], field3229[3]);
                return;
            }
            int var37;
            int var38;
            int var39;
            if (this.field3197 != null && this.field3197[arg0] != -1) {
                int var36 = this.field3197[arg0] & 255;
                var37 = this.field3194[var36];
                var38 = this.field3201[var36];
                var39 = this.field3198[var36];
            } else {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            }
            short var40 = this.field3189[arg0];
            if (this.field3204[arg0] == -1) {
                class113.method757(var29, var30, var31, var26, var27, var28, this.field3191[arg0], this.field3191[arg0], this.field3191[arg0], field3224[var37], field3224[var38], field3224[var39], field3214[var37], field3214[var38], field3214[var39], field3232[var37], field3232[var38], field3232[var39], var40);
                class113.method757(var29, var31, field3215[3], var26, var28, field3227[3], this.field3191[arg0], this.field3191[arg0], this.field3191[arg0], field3224[var37], field3224[var38], field3224[var39], field3214[var37], field3214[var38], field3214[var39], field3232[var37], field3232[var38], field3232[var39], var40);
                return;
            }
            class113.method757(var29, var30, var31, var26, var27, var28, field3229[0], field3229[1], field3229[2], field3224[var37], field3224[var38], field3224[var39], field3214[var37], field3214[var38], field3214[var39], field3232[var37], field3232[var38], field3232[var39], var40);
            class113.method757(var29, var31, field3215[3], var26, var28, field3227[3], field3229[0], field3229[2], field3229[3], field3224[var37], field3224[var38], field3224[var39], field3214[var37], field3214[var38], field3214[var39], field3232[var37], field3232[var38], field3232[var39], var40);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lud;I)V")
    public final void method1084(class185 arg0, int arg1) {
        if (super.field3153 != null) {
            if (arg1 != -1) {
                class90 var3 = arg0.field3525[arg1];
                class166 var4 = var3.field1585;
                field3218 = 0;
                field3207 = 0;
                field3222 = 0;
                for (int var5 = 0; var5 < var3.field1588; ++var5) {
                    int var6 = var3.field1579[var5];
                    this.method1113(var4.field3185[var6], var4.field3179[var6], var3.field1584[var5], var3.field1583[var5], var3.field1578[var5]);
                }
                super.field3154 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z")
    private final boolean method1108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZIII)V")
    private final void method1109(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 1600) {
            for (int var6 = 0; var6 < arg4; ++var6) {
                field3212[var6] = 0;
            }
            for (int var7 = 0; var7 < super.field3143; ++var7) {
                if (this.field3204[var7] != -2) {
                    int var32 = this.field3200[var7];
                    int var33 = this.field3205[var7];
                    int var34 = this.field3195[var7];
                    int var35 = field3217[var32];
                    int var36 = field3217[var33];
                    int var37 = field3217[var34];
                    if (!arg0 || var35 != -5000 && var36 != -5000 && var37 != -5000) {
                        if (arg1 && this.method1108(class164.field3138, class164.field3146, field3209[var32], field3209[var33], field3209[var34], var35, var36, var37)) {
                            class164.field3134[class164.field3133++] = arg2;
                            arg1 = false;
                        }
                        if ((field3209[var34] - field3209[var33]) * (var35 - var36) - (field3209[var32] - field3209[var33]) * (var37 - var36) > 0) {
                            field3221[var7] = false;
                            if (var35 >= 0 && var36 >= 0 && var37 >= 0 && var35 <= class113.field2125 && var36 <= class113.field2125 && var37 <= class113.field2125) {
                                field3220[var7] = false;
                            } else {
                                field3220[var7] = true;
                            }
                            int var57 = (field3211[var32] + field3211[var33] + field3211[var34]) / 3 + arg3;
                            field3230[var57][field3212[var57]++] = var7;
                        }
                    } else {
                        int var38 = field3224[var32];
                        int var39 = field3224[var33];
                        int var40 = field3224[var34];
                        int var41 = field3214[var32];
                        int var42 = field3214[var33];
                        int var43 = field3214[var34];
                        int var44 = field3232[var32];
                        int var45 = field3232[var33];
                        int var46 = field3232[var34];
                        int var47 = var38 - var39;
                        int var48 = var40 - var39;
                        int var49 = var41 - var42;
                        int var50 = var43 - var42;
                        int var51 = var44 - var45;
                        int var52 = var46 - var45;
                        int var53 = var49 * var52 - var50 * var51;
                        int var54 = var48 * var51 - var47 * var52;
                        int var55 = var47 * var50 - var48 * var49;
                        if (var45 * var55 + var39 * var53 + var42 * var54 > 0) {
                            field3221[var7] = true;
                            int var56 = (field3211[var32] + field3211[var33] + field3211[var34]) / 3 + arg3;
                            field3230[var56][field3212[var56]++] = var7;
                        }
                    }
                }
            }
            if (this.field3196 == null) {
                for (int var8 = arg4 - 1; var8 >= 0; --var8) {
                    int var9 = field3212[var8];
                    if (var9 > 0) {
                        int[] var10 = field3230[var8];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            this.method1106(var10[var11]);
                        }
                    }
                }
            } else {
                for (int var12 = 0; var12 < 12; ++var12) {
                    field3210[var12] = 0;
                    field3223[var12] = 0;
                }
                for (int var13 = arg4 - 1; var13 >= 0; --var13) {
                    int var26 = field3212[var13];
                    if (var26 > 0) {
                        int[] var27 = field3230[var13];
                        for (int var28 = 0; var28 < var26; ++var28) {
                            int var29 = var27[var28];
                            byte var30 = this.field3196[var29];
                            int var31 = field3210[var30]++;
                            field3225[var30][var31] = var29;
                            if (var30 < 10) {
                                field3223[var30] += var13;
                            } else if (var30 == 10) {
                                field3226[var31] = var13;
                            } else {
                                field3216[var31] = var13;
                            }
                        }
                    }
                }
                int var14 = 0;
                if (field3210[1] > 0 || field3210[2] > 0) {
                    var14 = (field3223[1] + field3223[2]) / (field3210[1] + field3210[2]);
                }
                int var15 = 0;
                if (field3210[3] > 0 || field3210[4] > 0) {
                    var15 = (field3223[3] + field3223[4]) / (field3210[3] + field3210[4]);
                }
                int var16 = 0;
                if (field3210[6] > 0 || field3210[8] > 0) {
                    var16 = (field3223[6] + field3223[8]) / (field3210[6] + field3210[8]);
                }
                int var17 = 0;
                int var18 = field3210[10];
                int[] var19 = field3225[10];
                int[] var20 = field3226;
                if (var17 == var18) {
                    var17 = 0;
                    var18 = field3210[11];
                    var19 = field3225[11];
                    var20 = field3216;
                }
                int var21;
                if (var17 < var18) {
                    var21 = var20[var17];
                } else {
                    var21 = -1000;
                }
                for (int var22 = 0; var22 < 10; ++var22) {
                    while (var22 == 0 && var21 > var14) {
                        this.method1106(var19[var17++]);
                        if (var17 == var18 && field3225[11] != var19) {
                            var17 = 0;
                            var18 = field3210[11];
                            var19 = field3225[11];
                            var20 = field3216;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 3 && var21 > var15) {
                        this.method1106(var19[var17++]);
                        if (var17 == var18 && field3225[11] != var19) {
                            var17 = 0;
                            var18 = field3210[11];
                            var19 = field3225[11];
                            var20 = field3216;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    while (var22 == 5 && var21 > var16) {
                        this.method1106(var19[var17++]);
                        if (var17 == var18 && field3225[11] != var19) {
                            var17 = 0;
                            var18 = field3210[11];
                            var19 = field3225[11];
                            var20 = field3216;
                        }
                        if (var17 < var18) {
                            var21 = var20[var17];
                        } else {
                            var21 = -1000;
                        }
                    }
                    int var23 = field3210[var22];
                    int[] var24 = field3225[var22];
                    for (int var25 = 0; var25 < var23; ++var25) {
                        this.method1106(var24[var25]);
                    }
                }
                while (var21 != -1000) {
                    this.method1106(var19[var17++]);
                    if (var17 == var18 && field3225[11] != var19) {
                        var17 = 0;
                        var19 = field3225[11];
                        var18 = field3210[11];
                        var20 = field3216;
                    }
                    if (var17 < var18) {
                        var21 = var20[var17];
                    } else {
                        var21 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLsd;[B)Lsd;")
    private final class167 method1110(boolean arg0, class167 arg1, byte[] arg2) {
        arg1.field3139 = super.field3139;
        arg1.field3143 = super.field3143;
        arg1.field3203 = this.field3203;
        if (arg1.field3149 == null || arg1.field3149.length < super.field3139) {
            arg1.field3149 = new int[super.field3139 + 100];
            arg1.field3137 = new int[super.field3139 + 100];
            arg1.field3152 = new int[super.field3139 + 100];
        }
        for (int var4 = 0; var4 < super.field3139; ++var4) {
            arg1.field3149[var4] = super.field3149[var4];
            arg1.field3137[var4] = super.field3137[var4];
            arg1.field3152[var4] = super.field3152[var4];
        }
        if (arg0) {
            arg1.field3190 = this.field3190;
        } else {
            arg1.field3190 = arg2;
            if (this.field3190 == null) {
                for (int var5 = 0; var5 < super.field3143; ++var5) {
                    arg1.field3190[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < super.field3143; ++var6) {
                    arg1.field3190[var6] = this.field3190[var6];
                }
            }
        }
        arg1.field3200 = this.field3200;
        arg1.field3205 = this.field3205;
        arg1.field3195 = this.field3195;
        arg1.field3191 = this.field3191;
        arg1.field3192 = this.field3192;
        arg1.field3204 = this.field3204;
        arg1.field3196 = this.field3196;
        arg1.field3197 = this.field3197;
        arg1.field3189 = this.field3189;
        arg1.field3193 = this.field3193;
        arg1.field3194 = this.field3194;
        arg1.field3201 = this.field3201;
        arg1.field3198 = this.field3198;
        arg1.field3153 = super.field3153;
        arg1.field3141 = super.field3141;
        arg1.field3132 = super.field3132;
        arg1.field3154 = false;
        return arg1;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "()V")
    public static void method1111() {
        field3199 = null;
        field3202 = null;
        field3206 = null;
        field3219 = null;
        field3220 = null;
        field3221 = null;
        field3217 = null;
        field3209 = null;
        field3211 = null;
        field3224 = null;
        field3214 = null;
        field3232 = null;
        field3212 = null;
        field3230 = null;
        field3210 = null;
        field3225 = null;
        field3226 = null;
        field3216 = null;
        field3223 = null;
        field3227 = null;
        field3215 = null;
        field3229 = null;
        field3208 = null;
        field3231 = null;
        field3213 = null;
        field3228 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method1093();
            int var9 = class113.field2121;
            int var10 = class113.field2112;
            int var11 = field3208[arg0];
            int var12 = field3231[arg0];
            int var13 = field3208[arg1];
            int var14 = field3231[arg1];
            int var15 = field3208[arg2];
            int var16 = field3231[arg2];
            int var17 = field3208[arg3];
            int var18 = field3231[arg3];
            int var19 = arg5 * var17 + arg6 * var18 >> 16;
            for (int var20 = 0; var20 < super.field3139; ++var20) {
                int var21 = super.field3149[var20];
                int var22 = super.field3137[var20];
                int var23 = super.field3152[var20];
                if (arg2 != 0) {
                    int var24 = var15 * var22 + var16 * var21 >> 16;
                    var22 = var16 * var22 - var15 * var21 >> 16;
                    var21 = var24;
                }
                if (arg0 != 0) {
                    int var25 = var12 * var22 - var11 * var23 >> 16;
                    var23 = var11 * var22 + var12 * var23 >> 16;
                    var22 = var25;
                }
                if (arg1 != 0) {
                    int var26 = var13 * var23 + var14 * var21 >> 16;
                    var23 = var14 * var23 - var13 * var21 >> 16;
                    var21 = var26;
                }
                int var27 = arg4 + var21;
                int var28 = arg5 + var22;
                int var29 = arg6 + var23;
                int var30 = var18 * var28 - var17 * var29 >> 16;
                int var31 = var17 * var28 + var18 * var29 >> 16;
                field3211[var20] = var31 - var19;
                field3217[var20] = (var27 << 9) / arg7 + var9;
                field3209[var20] = (var30 << 9) / arg7 + var10;
                if (this.field3203 > 0) {
                    field3224[var20] = var27;
                    field3214[var20] = var30;
                    field3232[var20] = var31;
                }
            }
            this.method1109(false, false, 0, super.field3142, super.field3142 << 1);
        } catch (RuntimeException var33) {
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!super.field3154) {
            this.method1093();
        }
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = (super.field3147 * arg1 + super.field3144 * arg2 >> 16) + var11;
        if (var12 > 50) {
            int var13 = (-super.field3144 * arg2 + super.field2341 * arg1 >> 16) + var11;
            if (var13 < 3500) {
                int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
                int var15 = super.field3144 + var14 << 9;
                if (var15 / var12 > class113.field2116) {
                    int var16 = var14 - super.field3144 << 9;
                    if (var16 / var12 < class113.field2127) {
                        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
                        int var18 = (super.field3147 * arg2 + super.field3144 * arg1 >> 16) + var17 << 9;
                        if (var18 / var12 > class113.field2115) {
                            int var19 = (-super.field3144 * arg1 + super.field2341 * arg2 >> 16) + var17 << 9;
                            if (var19 / var12 < class113.field2118) {
                                boolean var20 = false;
                                boolean var21 = var13 <= 50;
                                boolean var22 = var21 || this.field3203 > 0;
                                int var23 = class113.field2121;
                                int var24 = class113.field2112;
                                int var25 = 0;
                                int var26 = 0;
                                if (arg0 != 0) {
                                    var25 = field3208[arg0];
                                    var26 = field3231[arg0];
                                }
                                boolean var27 = false;
                                if (arg8 > 0 && class164.field3145 && var13 > 0) {
                                    int var28;
                                    int var29;
                                    if (var14 > 0) {
                                        var28 = var16 / var12;
                                        var29 = var15 / var13;
                                    } else {
                                        var28 = var16 / var13;
                                        var29 = var15 / var12;
                                    }
                                    int var30;
                                    int var31;
                                    if (var17 > 0) {
                                        var30 = var19 / var12;
                                        var31 = var18 / var13;
                                    } else {
                                        var30 = var19 / var13;
                                        var31 = var18 / var12;
                                    }
                                    int var32 = class164.field3138 - class113.field2121;
                                    int var33 = class164.field3146 - class113.field2112;
                                    if (var32 >= var28 && var32 <= var29 && var33 >= var30 && var33 <= var31) {
                                        int var34 = 999999;
                                        int var35 = -999999;
                                        int var36 = 999999;
                                        int var37 = -999999;
                                        int[] var38 = new int[] { super.field3135, super.field3136, super.field3135, super.field3136, super.field3135, super.field3136, super.field3135, super.field3136 };
                                        int[] var39 = new int[] { super.field3148, super.field3148, super.field3150, super.field3150, super.field3148, super.field3148, super.field3150, super.field3150 };
                                        int[] var40 = new int[] { super.field2341, super.field2341, super.field2341, super.field2341, super.field3147, super.field3147, super.field3147, super.field3147 };
                                        for (int var41 = 0; var41 < 8; ++var41) {
                                            int var42 = var38[var41];
                                            int var43 = var40[var41];
                                            int var44 = var39[var41];
                                            if (arg0 != 0) {
                                                int var45 = var25 * var44 + var26 * var42 >> 16;
                                                var44 = var26 * var44 - var25 * var42 >> 16;
                                                var42 = var45;
                                            }
                                            int var46 = arg5 + var42;
                                            int var47 = arg6 + var43;
                                            int var48 = arg7 + var44;
                                            int var49 = arg3 * var48 + arg4 * var46 >> 16;
                                            int var50 = arg4 * var48 - arg3 * var46 >> 16;
                                            int var52 = arg2 * var47 - arg1 * var50 >> 16;
                                            int var53 = arg1 * var47 + arg2 * var50 >> 16;
                                            if (var53 > 0) {
                                                int var55 = (var49 << 9) / var53;
                                                int var56 = (var52 << 9) / var53;
                                                if (var55 < var34) {
                                                    var34 = var55;
                                                }
                                                if (var55 > var35) {
                                                    var35 = var55;
                                                }
                                                if (var56 < var36) {
                                                    var36 = var56;
                                                }
                                                if (var56 > var37) {
                                                    var37 = var56;
                                                }
                                            }
                                        }
                                        if (var32 >= var34 && var32 <= var35 && var33 >= var36 && var33 <= var37) {
                                            if (super.field3132) {
                                                class164.field3134[class164.field3133++] = arg8;
                                            } else {
                                                var27 = true;
                                            }
                                        }
                                    }
                                }
                                for (int var57 = 0; var57 < super.field3139; ++var57) {
                                    int var58 = super.field3149[var57];
                                    int var59 = super.field3137[var57];
                                    int var60 = super.field3152[var57];
                                    if (arg0 != 0) {
                                        int var61 = var25 * var60 + var26 * var58 >> 16;
                                        var60 = var26 * var60 - var25 * var58 >> 16;
                                        var58 = var61;
                                    }
                                    int var62 = arg5 + var58;
                                    int var63 = arg6 + var59;
                                    int var64 = arg7 + var60;
                                    int var65 = arg3 * var64 + arg4 * var62 >> 16;
                                    int var66 = arg4 * var64 - arg3 * var62 >> 16;
                                    int var68 = arg2 * var63 - arg1 * var66 >> 16;
                                    int var69 = arg1 * var63 + arg2 * var66 >> 16;
                                    field3211[var57] = var69 - var11;
                                    if (var69 >= 50) {
                                        field3217[var57] = (var65 << 9) / var69 + var23;
                                        field3209[var57] = (var68 << 9) / var69 + var24;
                                    } else {
                                        field3217[var57] = -5000;
                                        var20 = true;
                                    }
                                    if (var22) {
                                        field3224[var57] = var65;
                                        field3214[var57] = var68;
                                        field3232[var57] = var69;
                                    }
                                }
                                try {
                                    this.method1109(var20, var27, arg8, var11 - var13, var12 - var13 + 2);
                                } catch (Exception var71) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
    private static final int method1112(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class167() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IIII)V")
    private final void method1113(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            field3218 = 0;
            field3207 = 0;
            field3222 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = arg1[var8];
                if (var9 < super.field3153.length) {
                    int[] var10 = super.field3153[var9];
                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        int var12 = var10[var11];
                        field3218 += super.field3149[var12];
                        field3207 += super.field3137[var12];
                        field3222 += super.field3152[var12];
                        ++var7;
                    }
                }
            }
            if (var7 > 0) {
                field3218 = field3218 / var7 + arg2;
                field3207 = field3207 / var7 + arg3;
                field3222 = field3222 / var7 + arg4;
            } else {
                field3218 = arg2;
                field3207 = arg3;
                field3222 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; ++var13) {
                int var14 = arg1[var13];
                if (var14 < super.field3153.length) {
                    int[] var15 = super.field3153[var14];
                    for (int var16 = 0; var16 < var15.length; ++var16) {
                        int var17 = var15[var16];
                        super.field3149[var17] += arg2;
                        super.field3137[var17] += arg3;
                        super.field3152[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; ++var18) {
                int var19 = arg1[var18];
                if (var19 < super.field3153.length) {
                    int[] var20 = super.field3153[var19];
                    for (int var21 = 0; var21 < var20.length; ++var21) {
                        int var22 = var20[var21];
                        super.field3149[var22] -= field3218;
                        super.field3137[var22] -= field3207;
                        super.field3152[var22] -= field3222;
                        int var23 = (arg2 & 255) * 8;
                        int var24 = (arg3 & 255) * 8;
                        int var25 = (arg4 & 255) * 8;
                        if (var25 != 0) {
                            int var26 = field3208[var25];
                            int var27 = field3231[var25];
                            int var28 = super.field3149[var22] * var27 + super.field3137[var22] * var26 + 32767 >> 16;
                            super.field3137[var22] = super.field3137[var22] * var27 - super.field3149[var22] * var26 + 32767 >> 16;
                            super.field3149[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field3208[var23];
                            int var30 = field3231[var23];
                            int var31 = super.field3137[var22] * var30 - super.field3152[var22] * var29 + 32767 >> 16;
                            super.field3152[var22] = super.field3152[var22] * var30 + super.field3137[var22] * var29 + 32767 >> 16;
                            super.field3137[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field3208[var24];
                            int var33 = field3231[var24];
                            int var34 = super.field3152[var22] * var32 + super.field3149[var22] * var33 + 32767 >> 16;
                            super.field3152[var22] = super.field3152[var22] * var33 - super.field3149[var22] * var32 + 32767 >> 16;
                            super.field3149[var22] = var34;
                        }
                        super.field3149[var22] += field3218;
                        super.field3137[var22] += field3207;
                        super.field3152[var22] += field3222;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; ++var35) {
                int var36 = arg1[var35];
                if (var36 < super.field3153.length) {
                    int[] var37 = super.field3153[var36];
                    for (int var38 = 0; var38 < var37.length; ++var38) {
                        int var39 = var37[var38];
                        super.field3149[var39] -= field3218;
                        super.field3137[var39] -= field3207;
                        super.field3152[var39] -= field3222;
                        super.field3149[var39] = super.field3149[var39] * arg2 / 128;
                        super.field3137[var39] = super.field3137[var39] * arg3 / 128;
                        super.field3152[var39] = super.field3152[var39] * arg4 / 128;
                        super.field3149[var39] += field3218;
                        super.field3137[var39] += field3207;
                        super.field3152[var39] += field3222;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (super.field3141 != null && this.field3190 != null) {
                for (int var40 = 0; var40 < var6; ++var40) {
                    int var41 = arg1[var40];
                    if (var41 < super.field3141.length) {
                        int[] var42 = super.field3141[var41];
                        for (int var43 = 0; var43 < var42.length; ++var43) {
                            int var44 = var42[var43];
                            int var45 = (this.field3190[var44] & 255) + arg2 * 8;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                            this.field3190[var44] = (byte) var45;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lmc;IIIII)V")
    public class167(class112 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.method728();
        arg0.method738();
        super.field3139 = arg0.field2088;
        super.field3149 = arg0.field2096;
        super.field3137 = arg0.field2077;
        super.field3152 = arg0.field2066;
        super.field3143 = arg0.field2068;
        this.field3200 = arg0.field2075;
        this.field3205 = arg0.field2108;
        this.field3195 = arg0.field2082;
        this.field3196 = arg0.field2076;
        this.field3190 = arg0.field2069;
        this.field3193 = arg0.field2073;
        super.field3153 = arg0.field2093;
        super.field3141 = arg0.field2100;
        int var7 = (int) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        int var8 = arg2 * var7 >> 8;
        this.field3191 = new int[super.field3143];
        this.field3192 = new int[super.field3143];
        this.field3204 = new int[super.field3143];
        if (arg0.field2087 != null) {
            this.field3189 = new short[super.field3143];
            for (int var9 = 0; var9 < super.field3143; ++var9) {
                short var10 = arg0.field2087[var9];
                if (var10 != -1 && class113.field2122.method204(false, var10)) {
                    this.field3189[var9] = var10;
                } else {
                    this.field3189[var9] = -1;
                }
            }
        } else {
            this.field3189 = null;
        }
        if (arg0.field2062 > 0 && arg0.field2083 != null) {
            int[] var11 = new int[arg0.field2062];
            for (int var12 = 0; var12 < super.field3143; ++var12) {
                if (arg0.field2083[var12] != -1) {
                    ++var11[arg0.field2083[var12] & 255];
                }
            }
            this.field3203 = 0;
            for (int var13 = 0; var13 < arg0.field2062; ++var13) {
                if (var11[var13] > 0 && arg0.field2104[var13] == 0) {
                    ++this.field3203;
                }
            }
            this.field3194 = new int[this.field3203];
            this.field3201 = new int[this.field3203];
            this.field3198 = new int[this.field3203];
            int var14 = 0;
            for (int var15 = 0; var15 < arg0.field2062; ++var15) {
                if (var11[var15] > 0 && arg0.field2104[var15] == 0) {
                    this.field3194[var14] = arg0.field2080[var15] & 65535;
                    this.field3201[var14] = arg0.field2098[var15] & 65535;
                    this.field3198[var14] = arg0.field2074[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            this.field3197 = new byte[super.field3143];
            for (int var16 = 0; var16 < super.field3143; ++var16) {
                if (arg0.field2083[var16] != -1) {
                    this.field3197[var16] = (byte) var11[arg0.field2083[var16] & 255];
                    if (this.field3197[var16] == -1 && this.field3189 != null) {
                        this.field3189[var16] = -1;
                    }
                } else {
                    this.field3197[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < super.field3143; ++var17) {
            byte var18;
            if (arg0.field2097 == null) {
                var18 = 0;
            } else {
                var18 = arg0.field2097[var17];
            }
            byte var19;
            if (arg0.field2069 == null) {
                var19 = 0;
            } else {
                var19 = arg0.field2069[var17];
            }
            short var20;
            if (this.field3189 == null) {
                var20 = -1;
            } else {
                var20 = this.field3189[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class61 var28 = arg0.field2085[var17];
                        int var29 = (var28.field1035 * arg5 + var28.field1044 * arg4 + var28.field1043 * arg3) / (var8 / 2 + var8) + arg1;
                        this.field3191[var17] = method1112(arg0.field2109[var17] & 65535, var29);
                        this.field3204[var17] = -1;
                    } else if (var18 == 3) {
                        this.field3191[var17] = 128;
                        this.field3204[var17] = -1;
                    } else {
                        this.field3204[var17] = -2;
                    }
                } else {
                    int var21 = arg0.field2109[var17] & 65535;
                    class98 var22;
                    if (arg0.field2070 != null && arg0.field2070[this.field3200[var17]] != null) {
                        var22 = arg0.field2070[this.field3200[var17]];
                    } else {
                        var22 = arg0.field2105[this.field3200[var17]];
                    }
                    int var23 = (var22.field1817 * arg5 + var22.field1814 * arg3 + var22.field1801 * arg4) / (var22.field1807 * var8) + arg1;
                    this.field3191[var17] = method1112(var21, var23);
                    class98 var24;
                    if (arg0.field2070 != null && arg0.field2070[this.field3205[var17]] != null) {
                        var24 = arg0.field2070[this.field3205[var17]];
                    } else {
                        var24 = arg0.field2105[this.field3205[var17]];
                    }
                    int var25 = (var24.field1817 * arg5 + var24.field1814 * arg3 + var24.field1801 * arg4) / (var24.field1807 * var8) + arg1;
                    this.field3192[var17] = method1112(var21, var25);
                    class98 var26;
                    if (arg0.field2070 != null && arg0.field2070[this.field3195[var17]] != null) {
                        var26 = arg0.field2070[this.field3195[var17]];
                    } else {
                        var26 = arg0.field2105[this.field3195[var17]];
                    }
                    int var27 = (var26.field1817 * arg5 + var26.field1814 * arg3 + var26.field1801 * arg4) / (var26.field1807 * var8) + arg1;
                    this.field3204[var17] = method1112(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class61 var36 = arg0.field2085[var17];
                    int var37 = (var36.field1035 * arg5 + var36.field1044 * arg4 + var36.field1043 * arg3) / (var8 / 2 + var8) + arg1;
                    this.field3191[var17] = method1104(var37);
                    this.field3204[var17] = -1;
                } else {
                    this.field3204[var17] = -2;
                }
            } else {
                class98 var30;
                if (arg0.field2070 != null && arg0.field2070[this.field3200[var17]] != null) {
                    var30 = arg0.field2070[this.field3200[var17]];
                } else {
                    var30 = arg0.field2105[this.field3200[var17]];
                }
                int var31 = (var30.field1817 * arg5 + var30.field1814 * arg3 + var30.field1801 * arg4) / (var30.field1807 * var8) + arg1;
                this.field3191[var17] = method1104(var31);
                class98 var32;
                if (arg0.field2070 != null && arg0.field2070[this.field3205[var17]] != null) {
                    var32 = arg0.field2070[this.field3205[var17]];
                } else {
                    var32 = arg0.field2105[this.field3205[var17]];
                }
                int var33 = (var32.field1817 * arg5 + var32.field1814 * arg3 + var32.field1801 * arg4) / (var32.field1807 * var8) + arg1;
                this.field3192[var17] = method1104(var33);
                class98 var34;
                if (arg0.field2070 != null && arg0.field2070[this.field3195[var17]] != null) {
                    var34 = arg0.field2070[this.field3195[var17]];
                } else {
                    var34 = arg0.field2105[this.field3195[var17]];
                }
                int var35 = (var34.field1817 * arg5 + var34.field1814 * arg3 + var34.field1801 * arg4) / (var34.field1807 * var8) + arg1;
                this.field3204[var17] = method1104(var35);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([Lsd;I)V")
    private class167(class167[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        super.field3139 = 0;
        super.field3143 = 0;
        this.field3203 = 0;
        this.field3193 = -1;
        for (int var7 = 0; var7 < arg1; ++var7) {
            class167 var13 = arg0[var7];
            if (var13 != null) {
                super.field3139 += var13.field3139;
                super.field3143 += var13.field3143;
                this.field3203 += var13.field3203;
                if (var13.field3196 != null) {
                    var3 = true;
                } else {
                    if (this.field3193 == -1) {
                        this.field3193 = var13.field3193;
                    }
                    if (this.field3193 != var13.field3193) {
                        var3 = true;
                    }
                }
                var4 |= var13.field3190 != null;
                var5 |= var13.field3189 != null;
                var6 |= var13.field3197 != null;
            }
        }
        super.field3149 = new int[super.field3139];
        super.field3137 = new int[super.field3139];
        super.field3152 = new int[super.field3139];
        this.field3200 = new int[super.field3143];
        this.field3205 = new int[super.field3143];
        this.field3195 = new int[super.field3143];
        this.field3191 = new int[super.field3143];
        this.field3192 = new int[super.field3143];
        this.field3204 = new int[super.field3143];
        if (var3) {
            this.field3196 = new byte[super.field3143];
        }
        if (var4) {
            this.field3190 = new byte[super.field3143];
        }
        if (var5) {
            this.field3189 = new short[super.field3143];
        }
        if (var6) {
            this.field3197 = new byte[super.field3143];
        }
        if (this.field3203 > 0) {
            this.field3194 = new int[this.field3203];
            this.field3201 = new int[this.field3203];
            this.field3198 = new int[this.field3203];
        }
        super.field3139 = 0;
        super.field3143 = 0;
        this.field3203 = 0;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class167 var9 = arg0[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < var9.field3143; ++var10) {
                    this.field3200[super.field3143] = var9.field3200[var10] + super.field3139;
                    this.field3205[super.field3143] = var9.field3205[var10] + super.field3139;
                    this.field3195[super.field3143] = var9.field3195[var10] + super.field3139;
                    this.field3191[super.field3143] = var9.field3191[var10];
                    this.field3192[super.field3143] = var9.field3192[var10];
                    this.field3204[super.field3143] = var9.field3204[var10];
                    if (var3) {
                        if (var9.field3196 != null) {
                            this.field3196[super.field3143] = var9.field3196[var10];
                        } else {
                            this.field3196[super.field3143] = var9.field3193;
                        }
                    }
                    if (var4 && var9.field3190 != null) {
                        this.field3190[super.field3143] = var9.field3190[var10];
                    }
                    if (var5) {
                        if (var9.field3189 != null) {
                            this.field3189[super.field3143] = var9.field3189[var10];
                        } else {
                            this.field3189[super.field3143] = -1;
                        }
                    }
                    if (var6) {
                        if (var9.field3197 != null && var9.field3197[var10] != -1) {
                            this.field3197[super.field3143] = (byte) (var9.field3197[var10] + this.field3203);
                        } else {
                            this.field3197[super.field3143] = -1;
                        }
                    }
                    ++super.field3143;
                }
                for (int var11 = 0; var11 < var9.field3203; ++var11) {
                    this.field3194[this.field3203] = var9.field3194[var11] + super.field3139;
                    this.field3201[this.field3203] = var9.field3201[var11] + super.field3139;
                    this.field3198[this.field3203] = var9.field3198[var11] + super.field3139;
                    ++this.field3203;
                }
                for (int var12 = 0; var12 < var9.field3139; ++var12) {
                    super.field3149[super.field3139] = var9.field3149[var12];
                    super.field3137[super.field3139] = var9.field3137[var12];
                    super.field3152[super.field3139] = var9.field3152[var12];
                    ++super.field3139;
                }
            }
        }
    }
}
