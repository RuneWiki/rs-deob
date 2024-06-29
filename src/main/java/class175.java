import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class175 extends class305 {

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "B")
    private byte field3130 = 0;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    public int field3133 = 0;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "B")
    private byte field3125 = 0;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    private int field3135 = 0;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    private int field3131 = 0;

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "Z")
    public boolean field3143 = false;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "[I")
    private int[] field3107;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "[I")
    public int[] field3120;

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "[I")
    public int[] field3138;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "[I")
    public int[] field3123;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "[I")
    private int[] field3134;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "[S")
    private short[] field3139;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "[S")
    private short[] field3118;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[S")
    private short[] field3109;

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "[S")
    private short[] field3137;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "[F")
    private float[] field3115;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "[F")
    private float[] field3105;

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "[S")
    private short[] field3142;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "[B")
    private byte[] field3121;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "[S")
    private short[] field3114;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "[S")
    private short[] field3129;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "[S")
    private short[] field3113;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "[S")
    private short[] field3106;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "[B")
    private byte[] field3119;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Laj;")
    public class183 field3128;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "Lfm;")
    public class118 field3140;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "Lfm;")
    private class118 field3124;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "Lfm;")
    private class118 field3136;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Lfm;")
    private class118 field3132;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Lfm;")
    private class118 field3110;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "S")
    private short field3126;

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "S")
    private short field3144;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[S")
    private short[] field3104;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "[I")
    private int[] field3122;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lva;")
    private static class235 field3108 = new class235(10000);

    @OriginalMember(owner = "client!nm", name = "fb", descriptor = "Lnm;")
    private static class175 field3145 = new class175();

    @OriginalMember(owner = "client!nm", name = "gb", descriptor = "Lnm;")
    private static class175 field3146 = new class175();

    @OriginalMember(owner = "client!nm", name = "hb", descriptor = "Lnm;")
    private static class175 field3147 = new class175();

    @OriginalMember(owner = "client!nm", name = "ib", descriptor = "Lnm;")
    private static class175 field3148 = new class175();

    @OriginalMember(owner = "client!nm", name = "pb", descriptor = "[I")
    private static int[] field3155 = new int[1];

    @OriginalMember(owner = "client!nm", name = "rb", descriptor = "[I")
    private static int[] field3157 = new int[1];

    @OriginalMember(owner = "client!nm", name = "jb", descriptor = "F")
    private static float field3149;

    @OriginalMember(owner = "client!nm", name = "kb", descriptor = "F")
    private static float field3150;

    @OriginalMember(owner = "client!nm", name = "nb", descriptor = "F")
    private static float field3153;

    @OriginalMember(owner = "client!nm", name = "qb", descriptor = "F")
    private static float field3156;

    @OriginalMember(owner = "client!nm", name = "sb", descriptor = "F")
    private static float field3158;

    @OriginalMember(owner = "client!nm", name = "tb", descriptor = "F")
    private static float field3159;

    @OriginalMember(owner = "client!nm", name = "lb", descriptor = "I")
    private static int field3151;

    @OriginalMember(owner = "client!nm", name = "mb", descriptor = "I")
    private static int field3152;

    @OriginalMember(owner = "client!nm", name = "ob", descriptor = "I")
    private static int field3154;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "Ldc;")
    private class141 field3117;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Lhk;")
    private class66 field3111;

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3141;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "[J")
    private static long[] field3116;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "[[I")
    private int[][] field3112;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "[[I")
    private int[][] field3127;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ISIB)I", line = 6)
    private static final int method1175(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class266.field4634[class89.method668(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class266.field4643.method192(0, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class266.field4643.method193(5296, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lpk;I)V", line = 64)
    public final void method643(class255 arg0, int arg1) {
        if (this.field3127 == null || arg1 == -1) {
            return;
        }
        class54 var3 = arg0.field4370[arg1];
        class260 var4 = var3.field855;
        field3151 = 0;
        field3154 = 0;
        field3152 = 0;
        for (int var5 = 0; var5 < var3.field857; var5++) {
            short var6 = var3.field858[var5];
            if (var4.field4529[var6]) {
                if (var3.field847[var5] != -1) {
                    this.method1205(0, 0, 0, 0);
                }
                this.method1205(var4.field4527[var6], var3.field851[var5], var3.field850[var5], var3.field856[var5]);
            }
        }
        this.field3140.field2087 = false;
        this.field3128.field3270 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([SI)[S", line = 101)
    private static final short[] method1176(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class275.method1934(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 107)
    public final void method1177(int arg0) {
        if (this.field3139 == null) {
            this.method640(arg0);
            return;
        }
        int var2 = class266.field4642[arg0];
        int var3 = class266.field4636[arg0];
        for (int var4 = 0; var4 < this.field3133; var4++) {
            int var5 = this.field3123[var4] * var2 + this.field3120[var4] * var3 >> 16;
            this.field3123[var4] = this.field3123[var4] * var3 - this.field3120[var4] * var2 >> 16;
            this.field3120[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3131; var6++) {
            int var7 = this.field3139[var6] * var3 + this.field3109[var6] * var2 >> 16;
            this.field3109[var6] = (short) (this.field3109[var6] * var3 - this.field3139[var6] * var2 >> 16);
            this.field3139[var6] = (short) var7;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIII)Z", line = 149)
    private final boolean method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZLnm;Lnm;)Li;", line = 165)
    private final class305 method1179(boolean arg0, boolean arg1, class175 arg2, class175 arg3) {
        arg2.field3133 = this.field3133;
        arg2.field3131 = this.field3131;
        arg2.field3135 = this.field3135;
        arg2.field3126 = this.field3126;
        arg2.field3144 = this.field3144;
        arg2.field3125 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3120 == null || arg2.field3120.length < this.field3133) {
            arg2.field3120 = new int[this.field3133 + 100];
            arg2.field3138 = new int[this.field3133 + 100];
            arg2.field3123 = new int[this.field3133 + 100];
        }
        for (int var5 = 0; var5 < this.field3133; var5++) {
            arg2.field3120[var5] = this.field3120[var5];
            arg2.field3138[var5] = this.field3138[var5];
            arg2.field3123[var5] = this.field3123[var5];
        }
        if (arg2.field3140 == null) {
            arg2.field3140 = new class118();
        }
        arg2.field3140.field2087 = false;
        if (arg2.field3128 == null) {
            arg2.field3128 = new class183();
        }
        arg2.field3128.field3270 = false;
        if (arg0) {
            arg2.field3121 = this.field3121;
            arg2.field3124 = this.field3124;
        } else {
            if (arg3.field3121 == null || arg3.field3121.length < this.field3135) {
                arg3.field3121 = new byte[this.field3135 + 100];
            }
            arg2.field3121 = arg3.field3121;
            for (int var6 = 0; var6 < this.field3135; var6++) {
                arg2.field3121[var6] = this.field3121[var6];
            }
            if (arg3.field3124 == null) {
                arg3.field3124 = new class118();
            }
            arg2.field3124 = arg3.field3124;
            arg2.field3124.field2087 = false;
        }
        if (arg1) {
            arg2.field3139 = this.field3139;
            arg2.field3118 = this.field3118;
            arg2.field3109 = this.field3109;
            arg2.field3137 = this.field3137;
            arg2.field3136 = this.field3136;
        } else {
            if (arg3.field3139 == null || arg3.field3139.length < this.field3131) {
                arg3.field3139 = new short[this.field3131 + 100];
                arg3.field3118 = new short[this.field3131 + 100];
                arg3.field3109 = new short[this.field3131 + 100];
                arg3.field3137 = new short[this.field3131 + 100];
            }
            arg2.field3139 = arg3.field3139;
            arg2.field3118 = arg3.field3118;
            arg2.field3109 = arg3.field3109;
            arg2.field3137 = arg3.field3137;
            for (int var7 = 0; var7 < this.field3131; var7++) {
                arg2.field3139[var7] = this.field3139[var7];
                arg2.field3118[var7] = this.field3118[var7];
                arg2.field3109[var7] = this.field3109[var7];
                arg2.field3137[var7] = this.field3137[var7];
            }
            if (class4.field62) {
                if (arg3.field3136 == null) {
                    arg3.field3136 = new class118();
                }
                arg2.field3136 = arg3.field3136;
                arg2.field3136.field2087 = false;
            } else {
                arg2.field3136 = null;
            }
        }
        arg2.field3115 = this.field3115;
        arg2.field3105 = this.field3105;
        arg2.field3134 = this.field3134;
        arg2.field3127 = this.field3127;
        arg2.field3142 = this.field3142;
        arg2.field3114 = this.field3114;
        arg2.field3129 = this.field3129;
        arg2.field3113 = this.field3113;
        arg2.field3106 = this.field3106;
        arg2.field3119 = this.field3119;
        arg2.field3112 = this.field3112;
        arg2.field3132 = this.field3132;
        arg2.field3110 = this.field3110;
        arg2.field3122 = this.field3122;
        arg2.field3104 = this.field3104;
        arg2.field3107 = this.field3107;
        arg2.field5192 = this.field5192;
        return arg2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([FI)[F", line = 291)
    private static final float[] method1180(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class275.method1928(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "()V", line = 296)
    public final void method1181() {
        if (this.field3139 == null) {
            this.method653();
            return;
        }
        for (int var1 = 0; var1 < this.field3133; var1++) {
            int var2 = this.field3123[var1];
            this.field3123[var1] = this.field3120[var1];
            this.field3120[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3131; var3++) {
            short var4 = this.field3109[var3];
            this.field3109[var3] = this.field3139[var3];
            this.field3139[var3] = (short) (-var4);
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "()I", line = 334)
    public final int method1182() {
        return this.field3126;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V", line = 340)
    public final void method637(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3133; var4++) {
            this.field3120[var4] += arg0;
            this.field3138[var4] += arg1;
            this.field3123[var4] += arg2;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII[FFIF)V", line = 353)
    private static final void method1183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3158 = var16;
        field3159 = var17;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()V", line = 399)
    public final void method653() {
        for (int var1 = 0; var1 < this.field3133; var1++) {
            int var2 = this.field3123[var1];
            this.field3123[var1] = this.field3120[var1];
            this.field3120[var1] = -var2;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILnm;[[I[[IIII)V", line = 413)
    public final void method1184(int arg0, int arg1, class175 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3128.field3270) {
            arg2.method1206();
        }
        int var9 = arg2.field3128.field3265 + arg5;
        int var10 = arg2.field3128.field3266 + arg5;
        int var11 = arg2.field3128.field3268 + arg7;
        int var12 = arg2.field3128.field3269 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3133; var17++) {
                int var18 = this.field3120[var17] + arg5;
                int var19 = this.field3123[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3138[var17] = this.field3138[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3128.field3271;
            for (int var28 = 0; var28 < this.field3133; var28++) {
                int var29 = (this.field3138[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3120[var28] + arg5;
                    int var31 = this.field3123[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3138[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method2133(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3128.field3267 - arg2.field3128.field3271;
            for (int var42 = 0; var42 < this.field3133; var42++) {
                int var43 = this.field3120[var42] + arg5;
                int var44 = this.field3123[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3138[var42] = var51 + this.field3138[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3128.field3267 - arg2.field3128.field3271;
            for (int var53 = 0; var53 < this.field3133; var53++) {
                int var54 = this.field3120[var53] + arg5;
                int var55 = this.field3123[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3138[var53] = ((this.field3138[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3140.field2087 = false;
        this.field3128.field3270 = false;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)V", line = 612)
    public final void method656(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3133; var4++) {
            this.field3120[var4] = this.field3120[var4] * arg0 >> 7;
            this.field3138[var4] = this.field3138[var4] * arg1 >> 7;
            this.field3123[var4] = this.field3123[var4] * arg2 >> 7;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZ)Li;", line = 625)
    public final class305 method648(boolean arg0, boolean arg1) {
        return this.method1179(arg0, arg1, field3148, field3147);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(ZZ)Li;", line = 628)
    public final class305 method669(boolean arg0, boolean arg1) {
        return this.method1179(arg0, arg1, field3146, field3145);
    }

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "()V", line = 631)
    public static final void method1185() {
        field3145 = new class175();
        field3146 = new class175();
        field3147 = new class175();
        field3148 = new class175();
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "()V", line = 639)
    public final void method654() {
        for (int var1 = 0; var1 < this.field3133; var1++) {
            this.field3120[var1] = -this.field3120[var1];
            this.field3123[var1] = -this.field3123[var1];
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(SS)V", line = 653)
    public final void method1186(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3135; var3++) {
            if (this.field3142[var3] == arg0) {
                this.field3142[var3] = arg1;
            }
        }
        this.field3124.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "()I", line = 665)
    public final int method644() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3265;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V", line = 674)
    public final void method1187(int arg0) {
        this.field3126 = (short) arg0;
        this.field3124.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()Z", line = 679)
    public final boolean method709() {
        return this.field3143 && this.field3120 != null && this.field3139 != null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lpk;ILpk;I[IZ)V", line = 685)
    public final void method670(class255 arg0, int arg1, class255 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method652(arg0, arg1, arg5);
            return;
        }
        class54 var7 = arg0.field4370[arg1];
        class54 var8 = arg2.field4370[arg3];
        class260 var9 = var7.field855;
        for (int var10 = 0; var10 < this.field3133; var10++) {
            this.field3120[var10] <<= 0x4;
            this.field3138[var10] <<= 0x4;
            this.field3123[var10] <<= 0x4;
        }
        field3151 = 0;
        field3154 = 0;
        field3152 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field857; var13++) {
            short var14 = var7.field858[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field4527[var14] == 0) {
                if (var7.field847[var13] != -1) {
                    this.method1195(0, var9.field4520[var7.field847[var13]], 0, 0, 0, arg5);
                }
                this.method1195(var9.field4527[var14], var9.field4520[var14], var7.field851[var13], var7.field850[var13], var7.field856[var13], arg5);
            }
        }
        field3151 = 0;
        field3154 = 0;
        field3152 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field857; var17++) {
            short var18 = var8.field858[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field4527[var18] == 0) {
                if (var8.field847[var17] != -1) {
                    this.method1195(0, var9.field4520[var8.field847[var17]], 0, 0, 0, arg5);
                }
                this.method1195(var9.field4527[var18], var9.field4520[var18], var8.field851[var17], var8.field850[var17], var8.field856[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3133; var19++) {
            this.field3120[var19] >>= 0x4;
            this.field3138[var19] >>= 0x4;
            this.field3123[var19] >>= 0x4;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "()V", line = 782)
    public static void method1188() {
        field3116 = null;
        field3108 = null;
        field3141 = null;
        field3145 = null;
        field3146 = null;
        field3147 = null;
        field3148 = null;
        field3157 = null;
        field3155 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lpk;IZ)V", line = 793)
    public final void method652(class255 arg0, int arg1, boolean arg2) {
        if (this.field3127 == null || arg1 == -1) {
            return;
        }
        class54 var4 = arg0.field4370[arg1];
        class260 var5 = var4.field855;
        for (int var6 = 0; var6 < this.field3133; var6++) {
            this.field3120[var6] <<= 0x4;
            this.field3138[var6] <<= 0x4;
            this.field3123[var6] <<= 0x4;
        }
        field3151 = 0;
        field3154 = 0;
        field3152 = 0;
        for (int var7 = 0; var7 < var4.field857; var7++) {
            short var8 = var4.field858[var7];
            if (var4.field847[var7] != -1) {
                this.method1195(0, var5.field4520[var4.field847[var7]], 0, 0, 0, arg2);
            }
            this.method1195(var5.field4527[var8], var5.field4520[var8], var4.field851[var7], var4.field850[var7], var4.field856[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3133; var9++) {
            this.field3120[var9] >>= 0x4;
            this.field3138[var9] >>= 0x4;
            this.field3123[var9] >>= 0x4;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V", line = 847)
    public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3131 == 0) {
            return;
        }
        GL var8 = class257.field4409;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1189();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "()V", line = 873)
    private final void method1189() {
        GL var1 = class257.field4409;
        if (this.field3135 == 0) {
            return;
        }
        if (this.field3125 != 0) {
            this.method1201(true, !this.field3140.field2087 && (this.field3125 & 0x1) != 0, !this.field3124.field2087 && (this.field3125 & 0x2) != 0, this.field3136 != null && !this.field3136.field2087 && (this.field3125 & 0x4) != 0, false);
        }
        this.method1201(false, !this.field3140.field2087, !this.field3124.field2087, this.field3136 != null && !this.field3136.field2087, !this.field3132.field2087);
        if (!this.field3110.field2087) {
            this.method1192();
        }
        if (this.field3130 != 0) {
            if ((this.field3130 & 0x1) != 0) {
                this.field3120 = null;
                this.field3138 = null;
                this.field3123 = null;
                this.field3104 = null;
                this.field3107 = null;
            }
            if ((this.field3130 & 0x2) != 0) {
                this.field3142 = null;
                this.field3121 = null;
            }
            if ((this.field3130 & 0x4) != 0) {
                this.field3139 = null;
                this.field3118 = null;
                this.field3109 = null;
                this.field3137 = null;
            }
            if ((this.field3130 & 0x8) != 0) {
                this.field3115 = null;
                this.field3105 = null;
            }
            if ((this.field3130 & 0x10) != 0) {
                this.field3114 = null;
                this.field3129 = null;
                this.field3113 = null;
            }
            this.field3130 = 0;
        }
        class66 var2 = null;
        if (this.field3140.field2098 != null) {
            this.field3140.field2098.method506();
            var2 = this.field3140.field2098;
            var1.glVertexPointer(3, 5126, this.field3140.field2091, (long) this.field3140.field2085);
        }
        if (this.field3124.field2098 != null) {
            if (this.field3124.field2098 != var2) {
                this.field3124.field2098.method506();
                var2 = this.field3124.field2098;
            }
            var1.glColorPointer(4, 5121, this.field3124.field2091, (long) this.field3124.field2085);
        }
        if (class4.field62 && this.field3136.field2098 != null) {
            if (this.field3136.field2098 != var2) {
                this.field3136.field2098.method506();
                var2 = this.field3136.field2098;
            }
            var1.glNormalPointer(5126, this.field3136.field2091, (long) this.field3136.field2085);
        }
        if (this.field3132.field2098 != null) {
            if (this.field3132.field2098 != var2) {
                this.field3132.field2098.method506();
                class66 var3 = this.field3132.field2098;
            }
            var1.glTexCoordPointer(2, 5126, this.field3132.field2091, (long) this.field3132.field2085);
        }
        if (this.field3110.field2098 != null) {
            this.field3110.field2098.method507();
        }
        if (this.field3140.field2098 == null || this.field3124.field2098 == null || class4.field62 && this.field3136.field2098 == null || this.field3132.field2098 == null) {
            if (class257.field4393) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3140.field2098 == null) {
                this.field3140.field2092.position(this.field3140.field2085);
                var1.glVertexPointer(3, 5126, this.field3140.field2091, this.field3140.field2092);
            }
            if (this.field3124.field2098 == null) {
                this.field3124.field2092.position(this.field3124.field2085);
                var1.glColorPointer(4, 5121, this.field3124.field2091, this.field3124.field2092);
            }
            if (class4.field62 && this.field3136.field2098 == null) {
                this.field3136.field2092.position(this.field3136.field2085);
                var1.glNormalPointer(5126, this.field3136.field2091, this.field3136.field2092);
            }
            if (this.field3132.field2098 == null) {
                this.field3132.field2092.position(this.field3132.field2085);
                var1.glTexCoordPointer(2, 5126, this.field3132.field2091, this.field3132.field2092);
            }
        }
        if (this.field3110.field2098 == null && class257.field4393) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3122.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3122[var5];
            int var7 = this.field3122[var5 + 1];
            short var8 = this.field3106[var6];
            if (var8 == -1) {
                class257.method1736(-1);
                class107.method795(0, 58, 0);
            } else {
                class266.field4643.method191(var8 & 0xFFFF, 255);
            }
            if (this.field3110.field2098 == null) {
                this.field3110.field2092.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3110.field2092);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lrk;", line = 1045)
    public final class123 method735(int arg0, int arg1, int arg2) {
        this.field3143 = false;
        if (this.field3117 != null) {
            this.field3139 = this.field3117.field2392;
            this.field3118 = this.field3117.field2395;
            this.field3109 = this.field3117.field2394;
            this.field3137 = this.field3117.field2393;
            this.field3117 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "()I", line = 1058)
    public final int method658() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3269;
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "()I", line = 1064)
    public final int method651() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3268;
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "()I", line = 1071)
    public final int method659() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3272;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lka;IJIIIIFF)S", line = 1083)
    private final short method1190(class97 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3107[arg1];
        int var12 = this.field3107[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3104[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3116[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3104[var13] = (short) (this.field3131 + 1);
        field3116[var13] = arg2;
        this.field3139[this.field3131] = (short) arg3;
        this.field3118[this.field3131] = (short) arg4;
        this.field3109[this.field3131] = (short) arg5;
        this.field3137[this.field3131] = (short) arg6;
        this.field3115[this.field3131] = arg7;
        this.field3105[this.field3131] = arg8;
        return (short) (this.field3131++);
    }

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "()I", line = 1121)
    public final int method1191() {
        return this.field3144;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 1125)
    public final void method640(int arg0) {
        int var2 = class266.field4642[arg0];
        int var3 = class266.field4636[arg0];
        for (int var4 = 0; var4 < this.field3133; var4++) {
            int var5 = this.field3123[var4] * var2 + this.field3120[var4] * var3 >> 16;
            this.field3123[var4] = this.field3123[var4] * var3 - this.field3120[var4] * var2 >> 16;
            this.field3120[var4] = var5;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "()V", line = 1144)
    private final void method1192() {
        if (field3108.field4066.length < this.field3131 * 12) {
            field3108 = new class235((this.field3131 + 100) * 12);
        } else {
            field3108.field4051 = 0;
        }
        if (class257.field4402) {
            for (int var1 = 0; var1 < this.field3135; var1++) {
                field3108.method1577(true, this.field3114[var1]);
                field3108.method1577(true, this.field3129[var1]);
                field3108.method1577(true, this.field3113[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field3135; var2++) {
                field3108.method1616(this.field3114[var2], (byte) 46);
                field3108.method1616(this.field3129[var2], (byte) 46);
                field3108.method1616(this.field3113[var2], (byte) 46);
            }
        }
        if (!class257.field4393) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3108.field4051);
            var5.put(field3108.field4066, 0, field3108.field4051);
            var5.flip();
            this.field3110.field2087 = true;
            this.field3110.field2092 = var5;
            this.field3110.field2098 = null;
            return;
        }
        class66 var3 = new class66();
        ByteBuffer var4 = ByteBuffer.wrap(field3108.field4066, 0, field3108.field4051);
        var3.method505(var4);
        this.field3110.field2087 = true;
        this.field3110.field2092 = null;
        this.field3110.field2098 = var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFF)I", line = 1207)
    private static final int method1193(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "()V", line = 1241)
    public final void method1194() {
        if (this.field3139 == null) {
            this.method654();
            return;
        }
        for (int var1 = 0; var1 < this.field3133; var1++) {
            this.field3120[var1] = -this.field3120[var1];
            this.field3123[var1] = -this.field3123[var1];
        }
        for (int var2 = 0; var2 < this.field3131; var2++) {
            this.field3139[var2] = (short) (-this.field3139[var2]);
            this.field3109[var2] = (short) (-this.field3109[var2]);
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[IIIIZ)V", line = 1276)
    private final void method1195(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3151 = 0;
            field3154 = 0;
            field3152 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3127.length) {
                    int[] var14 = this.field3127[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3151 += this.field3120[var16];
                        field3154 += this.field3138[var16];
                        field3152 += this.field3123[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3151 = field3151 / var11 + var8;
                field3154 = field3154 / var11 + var9;
                field3152 = field3152 / var11 + var10;
            } else {
                field3151 = var8;
                field3154 = var9;
                field3152 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3127.length) {
                    int[] var22 = this.field3127[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3120[var24] += var17;
                        this.field3138[var24] += var18;
                        this.field3123[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3127.length) {
                    int[] var27 = this.field3127[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3120[var29] -= field3151;
                        this.field3138[var29] -= field3154;
                        this.field3123[var29] -= field3152;
                        if (arg4 != 0) {
                            int var30 = class266.field4642[arg4];
                            int var31 = class266.field4636[arg4];
                            int var32 = this.field3138[var29] * var30 + this.field3120[var29] * var31 + 32767 >> 16;
                            this.field3138[var29] = this.field3138[var29] * var31 + 32767 - this.field3120[var29] * var30 >> 16;
                            this.field3120[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class266.field4642[arg2];
                            int var34 = class266.field4636[arg2];
                            int var35 = this.field3138[var29] * var34 + 32767 - this.field3123[var29] * var33 >> 16;
                            this.field3123[var29] = this.field3138[var29] * var33 + this.field3123[var29] * var34 + 32767 >> 16;
                            this.field3138[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class266.field4642[arg3];
                            int var37 = class266.field4636[arg3];
                            int var38 = this.field3123[var29] * var36 + this.field3120[var29] * var37 + 32767 >> 16;
                            this.field3123[var29] = this.field3123[var29] * var37 + 32767 - this.field3120[var29] * var36 >> 16;
                            this.field3120[var29] = var38;
                        }
                        this.field3120[var29] += field3151;
                        this.field3138[var29] += field3154;
                        this.field3123[var29] += field3152;
                    }
                }
            }
            if (arg5 && this.field3139 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3127.length) {
                        int[] var41 = this.field3127[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3107[var43];
                            int var45 = this.field3107[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3104[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class266.field4642[arg4];
                                    int var49 = class266.field4636[arg4];
                                    int var50 = this.field3139[var47] * var49 + this.field3118[var47] * var48 + 32767 >> 16;
                                    this.field3118[var47] = (short) (this.field3118[var47] * var49 + 32767 - this.field3139[var47] * var48 >> 16);
                                    this.field3139[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class266.field4642[arg2];
                                    int var52 = class266.field4636[arg2];
                                    int var53 = this.field3118[var47] * var52 + 32767 - this.field3109[var47] * var51 >> 16;
                                    this.field3109[var47] = (short) (this.field3118[var47] * var51 + this.field3109[var47] * var52 + 32767 >> 16);
                                    this.field3118[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class266.field4642[arg3];
                                    int var55 = class266.field4636[arg3];
                                    int var56 = this.field3139[var47] * var55 + this.field3109[var47] * var54 + 32767 >> 16;
                                    this.field3109[var47] = (short) (this.field3109[var47] * var55 + 32767 - this.field3139[var47] * var54 >> 16);
                                    this.field3139[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3136 != null) {
                    this.field3136.field2087 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3127.length) {
                    int[] var59 = this.field3127[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3120[var61] -= field3151;
                        this.field3138[var61] -= field3154;
                        this.field3123[var61] -= field3152;
                        this.field3120[var61] = this.field3120[var61] * arg2 >> 7;
                        this.field3138[var61] = this.field3138[var61] * arg3 >> 7;
                        this.field3123[var61] = this.field3123[var61] * arg4 >> 7;
                        this.field3120[var61] += field3151;
                        this.field3138[var61] += field3154;
                        this.field3123[var61] += field3152;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3112 != null && this.field3121 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3112.length) {
                    int[] var64 = this.field3112[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3121[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3121[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3124.field2087 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "()I", line = 1619)
    public final int method647() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3266;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 3661)
    private class175() {
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lka;IIZ)V", line = 3744)
    public class175(class97 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field1735];
        this.field3107 = new int[arg0.field1728 + 1];
        for (int var6 = 0; var6 < arg0.field1735; var6++) {
            if ((arg0.field1741 == null || arg0.field1741[var6] != 2) && (arg0.field1732 == null || arg0.field1732[var6] == -1 || !class266.field4643.method184(arg0.field1732[var6] & 0xFFFF, 0))) {
                var5[this.field3135++] = var6;
                this.field3107[arg0.field1698[var6]]++;
                this.field3107[arg0.field1719[var6]]++;
                this.field3107[arg0.field1723[var6]]++;
            }
        }
        long[] var7 = new long[this.field3135];
        for (int var8 = 0; var8 < this.field3135; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field1732 != null) {
                var14 = arg0.field1732[var9];
                if (var14 != -1) {
                    var12 = class266.field4643.method186((byte) 121, var14 & 0xFFFF);
                    var13 = class266.field4643.method187(var14 & 0xFFFF, -117);
                }
            }
            boolean var15 = arg0.field1739 != null && arg0.field1739[var9] != 0 || var14 != -1 && !class266.field4643.method194(false, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field1700 != null) {
                var10 += arg0.field1700[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class152.method1042((byte) 43, var5, var7);
        this.field3133 = arg0.field1728;
        this.field3120 = arg0.field1715;
        this.field3138 = arg0.field1705;
        this.field3123 = arg0.field1722;
        this.field3134 = arg0.field1725;
        int var20 = this.field3135 * 3;
        this.field3139 = new short[var20];
        this.field3118 = new short[var20];
        this.field3109 = new short[var20];
        this.field3137 = new short[var20];
        this.field3115 = new float[var20];
        this.field3105 = new float[var20];
        this.field3142 = new short[this.field3135];
        this.field3121 = new byte[this.field3135];
        this.field3114 = new short[this.field3135];
        this.field3129 = new short[this.field3135];
        this.field3113 = new short[this.field3135];
        this.field3106 = new short[this.field3135];
        if (arg0.field1702 != null) {
            this.field3119 = new byte[this.field3135];
        }
        this.field3128 = new class183();
        this.field3140 = new class118();
        this.field3124 = new class118();
        if (class4.field62) {
            this.field3136 = new class118();
        }
        this.field3132 = new class118();
        this.field3110 = new class118();
        this.field3126 = (short) arg1;
        this.field3144 = (short) arg2;
        this.field3104 = new short[var20];
        field3116 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field1728; var22++) {
            int var23 = this.field3107[var22];
            this.field3107[var22] = var21;
            var21 += var23;
        }
        this.field3107[arg0.field1728] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field1693 != null) {
            int var28 = arg0.field1709;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3135; var36++) {
                int var37 = var5[var36];
                if (arg0.field1693[var37] != -1) {
                    int var38 = arg0.field1693[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field1698[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field1719[var37];
                        } else {
                            var40 = arg0.field1723[var37];
                        }
                        int var41 = arg0.field1715[var40];
                        int var42 = arg0.field1705[var40];
                        int var43 = arg0.field1722[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field1737[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field1718[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field1701[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field1718[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field1701[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field1736[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field1718[var44] / 1024.0F;
                        var49 = (float) arg0.field1701[var44] / 1024.0F;
                        var48 = (float) arg0.field1736[var44] / 1024.0F;
                    }
                    var27[var44] = method1209(arg0.field1717[var44], arg0.field1721[var44], arg0.field1740[var44], arg0.field1712[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3135; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field1724[var51] & 0xFFFF;
            short var53;
            if (arg0.field1732 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field1732[var51];
            }
            int var54;
            if (arg0.field1693 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field1693[var51];
            }
            int var55;
            if (arg0.field1739 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field1739[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field1737[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field1698[var51];
                        int var67 = arg0.field1719[var51];
                        int var68 = arg0.field1723[var51];
                        short var69 = arg0.field1717[var54];
                        short var70 = arg0.field1721[var54];
                        short var71 = arg0.field1740[var54];
                        float var72 = (float) arg0.field1715[var69];
                        float var73 = (float) arg0.field1705[var69];
                        float var74 = (float) arg0.field1722[var69];
                        float var75 = (float) arg0.field1715[var70] - var72;
                        float var76 = (float) arg0.field1705[var70] - var73;
                        float var77 = (float) arg0.field1722[var70] - var74;
                        float var78 = (float) arg0.field1715[var71] - var72;
                        float var79 = (float) arg0.field1705[var71] - var73;
                        float var80 = (float) arg0.field1722[var71] - var74;
                        float var81 = (float) arg0.field1715[var66] - var72;
                        float var82 = (float) arg0.field1705[var66] - var73;
                        float var83 = (float) arg0.field1722[var66] - var74;
                        float var84 = (float) arg0.field1715[var67] - var72;
                        float var85 = (float) arg0.field1705[var67] - var73;
                        float var86 = (float) arg0.field1722[var67] - var74;
                        float var87 = (float) arg0.field1715[var68] - var72;
                        float var88 = (float) arg0.field1705[var68] - var73;
                        float var89 = (float) arg0.field1722[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field1698[var51];
                        int var102 = arg0.field1719[var51];
                        int var103 = arg0.field1723[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field1695[var54];
                        float var109 = (float) arg0.field1704[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field1736[var54] & 0xFFFF) / 1024.0F;
                            method1183(arg0.field1715[var101], arg0.field1705[var101], arg0.field1722[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3158;
                            var57 = field3159;
                            method1183(arg0.field1715[var102], arg0.field1705[var102], arg0.field1722[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3158;
                            var59 = field3159;
                            method1183(arg0.field1715[var103], arg0.field1705[var103], arg0.field1722[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3158;
                            var61 = field3159;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field1707[var54] / 256.0F;
                            float var113 = (float) arg0.field1713[var54] / 256.0F;
                            int var114 = arg0.field1715[var102] - arg0.field1715[var101];
                            int var115 = arg0.field1705[var102] - arg0.field1705[var101];
                            int var116 = arg0.field1722[var102] - arg0.field1722[var101];
                            int var117 = arg0.field1715[var103] - arg0.field1715[var101];
                            int var118 = arg0.field1705[var103] - arg0.field1705[var101];
                            int var119 = arg0.field1722[var103] - arg0.field1722[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field1718[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field1701[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field1736[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1193(var126, var127, var128);
                            method1208(arg0.field1715[var101], arg0.field1705[var101], arg0.field1722[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3156;
                            var57 = field3149;
                            method1208(arg0.field1715[var102], arg0.field1705[var102], arg0.field1722[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3156;
                            var59 = field3149;
                            method1208(arg0.field1715[var103], arg0.field1705[var103], arg0.field1722[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3156;
                            var61 = field3149;
                        } else if (var65 == 3) {
                            method1196(arg0.field1715[var101], arg0.field1705[var101], arg0.field1722[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3150;
                            var57 = field3153;
                            method1196(arg0.field1715[var102], arg0.field1705[var102], arg0.field1722[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3150;
                            var59 = field3153;
                            method1196(arg0.field1715[var103], arg0.field1705[var103], arg0.field1722[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3150;
                            var61 = field3153;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method740();
            byte var129;
            if (arg0.field1741 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field1741[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field1698[var51];
                class215 var133 = arg0.field1708[var132];
                this.field3114[var50] = this.method1190(arg0, var132, var130, var133.field3726, var133.field3734, var133.field3727, var133.field3735, var56, var57);
                int var134 = arg0.field1719[var51];
                class215 var135 = arg0.field1708[var134];
                this.field3129[var50] = this.method1190(arg0, var134, (long) var62 + var130, var135.field3726, var135.field3734, var135.field3727, var135.field3735, var58, var59);
                int var136 = arg0.field1723[var51];
                class215 var137 = arg0.field1708[var136];
                this.field3113[var50] = this.method1190(arg0, var136, (long) var63 + var130, var137.field3726, var137.field3734, var137.field3727, var137.field3735, var60, var61);
            } else if (var129 == 1) {
                class302 var138 = arg0.field1706[var51];
                long var139 = (long) ((var54 << 2) + (var138.field5160 > 0 ? 1024 : 2048) + (var138.field5162 + 256 << 12) + (var138.field5170 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3114[var50] = this.method1190(arg0, arg0.field1698[var51], var139, var138.field5160, var138.field5162, var138.field5170, 0, var56, var57);
                this.field3129[var50] = this.method1190(arg0, arg0.field1719[var51], (long) var62 + var139, var138.field5160, var138.field5162, var138.field5170, 0, var58, var59);
                this.field3113[var50] = this.method1190(arg0, arg0.field1723[var51], (long) var63 + var139, var138.field5160, var138.field5162, var138.field5170, 0, var60, var61);
            }
            if (arg0.field1732 == null) {
                this.field3106[var50] = -1;
            } else {
                this.field3106[var50] = arg0.field1732[var51];
            }
            if (this.field3119 != null) {
                this.field3119[var50] = (byte) arg0.field1702[var51];
            }
            this.field3142[var50] = arg0.field1724[var51];
            if (arg0.field1739 != null) {
                this.field3121[var50] = arg0.field1739[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3135; var143++) {
            short var144 = this.field3106[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3122 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3135; var147++) {
            short var148 = this.field3106[var147];
            if (var146 != var148) {
                this.field3122[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3122[var145] = this.field3135;
        field3116 = null;
        this.field3139 = method1176(this.field3139, this.field3131);
        this.field3118 = method1176(this.field3118, this.field3131);
        this.field3109 = method1176(this.field3109, this.field3131);
        this.field3137 = method1176(this.field3137, this.field3131);
        this.field3115 = method1180(this.field3115, this.field3131);
        this.field3105 = method1180(this.field3105, this.field3131);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII[FIF)V", line = 1631)
    private static final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3150 = var16;
        field3153 = var17;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZZZZZZ)V", line = 1679)
    public final void method1197(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3125 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3131 != 0) {
            if (arg6) {
                boolean var8 = !this.field3124.field2087 && (arg1 || arg2 && !class4.field62);
                this.method1201(false, !this.field3140.field2087 && arg0, var8, this.field3136 != null && !this.field3136.field2087 && arg2, !this.field3132.field2087 && arg3);
                if (!this.field3110.field2087 && arg4 && arg1) {
                    this.method1192();
                }
            }
            if (arg0) {
                if (this.field3140.field2087) {
                    this.field3120 = null;
                    this.field3138 = null;
                    this.field3123 = null;
                    this.field3104 = null;
                    this.field3107 = null;
                } else {
                    this.field3130 = (byte) (this.field3130 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3124.field2087) {
                    this.field3142 = null;
                    this.field3121 = null;
                } else {
                    this.field3130 = (byte) (this.field3130 | 0x2);
                }
            }
            if (arg2 && class4.field62) {
                if (this.field3136.field2087) {
                    this.field3139 = null;
                    this.field3118 = null;
                    this.field3109 = null;
                    this.field3137 = null;
                } else {
                    this.field3130 = (byte) (this.field3130 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3132.field2087) {
                    this.field3115 = null;
                    this.field3105 = null;
                } else {
                    this.field3130 = (byte) (this.field3130 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3110.field2087 && this.field3124.field2087) {
                    this.field3114 = null;
                    this.field3129 = null;
                    this.field3113 = null;
                } else {
                    this.field3130 = (byte) (this.field3130 | 0x10);
                }
            }
            if (arg5) {
                this.field3134 = null;
                this.field3119 = null;
                this.field3127 = (int[][]) null;
                this.field3112 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lrk;IIIZ)V", line = 1772)
    public final void method711(class123 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class175 var6 = (class175) arg0;
        if (this.field3135 == 0 || var6.field3135 == 0) {
            return;
        }
        int var7 = var6.field3133;
        int[] var8 = var6.field3120;
        int[] var9 = var6.field3138;
        int[] var10 = var6.field3123;
        short[] var11 = var6.field3139;
        short[] var12 = var6.field3118;
        short[] var13 = var6.field3109;
        short[] var14 = var6.field3137;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3117 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3117.field2392;
            var16 = this.field3117.field2395;
            var17 = this.field3117.field2394;
            var18 = this.field3117.field2393;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3117 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3117.field2392;
            var20 = var6.field3117.field2395;
            var21 = var6.field3117.field2394;
            var22 = var6.field3117.field2393;
        }
        int[] var23 = var6.field3107;
        short[] var24 = var6.field3104;
        if (!var6.field3128.field3270) {
            var6.method1206();
        }
        short var25 = var6.field3128.field3271;
        short var26 = var6.field3128.field3267;
        short var27 = var6.field3128.field3265;
        short var28 = var6.field3128.field3266;
        short var29 = var6.field3128.field3268;
        short var30 = var6.field3128.field3269;
        for (int var31 = 0; var31 < this.field3133; var31++) {
            int var32 = this.field3138[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3120[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3123[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3107[var31];
                        int var37 = this.field3107[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3104[var38] - 1;
                            if (var35 == -1 || this.field3137[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3117 = new class141();
                                            var15 = this.field3117.field2392 = class115.method862((byte) 94, this.field3139);
                                            var16 = this.field3117.field2395 = class115.method862((byte) 97, this.field3118);
                                            var17 = this.field3117.field2394 = class115.method862((byte) -83, this.field3109);
                                            var18 = this.field3117.field2393 = class115.method862((byte) -22, this.field3137);
                                        }
                                        if (var19 == null) {
                                            class141 var44 = var6.field3117 = new class141();
                                            var19 = var44.field2392 = class115.method862((byte) 81, var11);
                                            var20 = var44.field2395 = class115.method862((byte) 123, var12);
                                            var21 = var44.field2394 = class115.method862((byte) -50, var13);
                                            var22 = var44.field2393 = class115.method862((byte) -79, var14);
                                        }
                                        short var45 = this.field3139[var35];
                                        short var46 = this.field3118[var35];
                                        short var47 = this.field3109[var35];
                                        short var48 = this.field3137[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3107[var31];
                                        int var58 = this.field3107[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3104[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lvi;)Lvi;", line = 2012)
    public final class129 method1198(class129 arg0) {
        if (this.field3131 == 0) {
            return null;
        }
        if (!this.field3128.field3270) {
            this.method1206();
        }
        int var2;
        int var3;
        if (class304.field5180 > 0) {
            var2 = this.field3128.field3265 - (class304.field5180 * this.field3128.field3267 >> 8) >> 3;
            var3 = this.field3128.field3266 - (class304.field5180 * this.field3128.field3271 >> 8) >> 3;
        } else {
            var2 = this.field3128.field3265 - (class304.field5180 * this.field3128.field3271 >> 8) >> 3;
            var3 = this.field3128.field3266 - (class304.field5180 * this.field3128.field3267 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class304.field5184 > 0) {
            var4 = this.field3128.field3268 - (class304.field5184 * this.field3128.field3267 >> 8) >> 3;
            var5 = this.field3128.field3269 - (class304.field5184 * this.field3128.field3271 >> 8) >> 3;
        } else {
            var4 = this.field3128.field3268 - (class304.field5184 * this.field3128.field3271 >> 8) >> 3;
            var5 = this.field3128.field3269 - (class304.field5184 * this.field3128.field3267 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class129 var8;
        if (arg0 == null || arg0.field2281.length < var6 * var7) {
            var8 = new class129(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1944 = arg0.field1950 = var6;
            arg0.field1955 = arg0.field1948 = var7;
            arg0.method928();
        }
        var8.field1952 = var2;
        var8.field1953 = var4;
        if (field3157.length < this.field3131) {
            field3157 = new int[this.field3131];
            field3155 = new int[this.field3131];
        }
        for (int var9 = 0; var9 < this.field3133; var9++) {
            int var10 = (this.field3120[var9] - (this.field3138[var9] * class304.field5180 >> 8) >> 3) - var2;
            int var11 = (this.field3123[var9] - (this.field3138[var9] * class304.field5184 >> 8) >> 3) - var4;
            int var12 = this.field3107[var9];
            int var13 = this.field3107[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3104[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3157[var15] = var10;
                field3155[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3135; var16++) {
            if (this.field3121[var16] <= 128) {
                short var17 = this.field3114[var16];
                short var18 = this.field3129[var16];
                short var19 = this.field3113[var16];
                int var20 = field3157[var17];
                int var21 = field3157[var18];
                int var22 = field3157[var19];
                int var23 = field3155[var17];
                int var24 = field3155[var18];
                int var25 = field3155[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class266.method1868(var8.field2281, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "()V", line = 2137)
    public final void method1199() {
        for (int var1 = 0; var1 < this.field3133; var1++) {
            this.field3123[var1] = -this.field3123[var1];
        }
        if (this.field3109 != null) {
            for (int var2 = 0; var2 < this.field3131; var2++) {
                this.field3109[var2] = (short) (-this.field3109[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3135; var3++) {
            short var4 = this.field3114[var3];
            this.field3114[var3] = this.field3113[var3];
            this.field3113[var3] = var4;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
        this.field3110.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZZZZZZZZZZ)Lnm;", line = 2176)
    public final class175 method1200(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class175 var12 = new class175();
        var12.field3133 = this.field3133;
        var12.field3131 = this.field3131;
        var12.field3135 = this.field3135;
        if (arg0) {
            var12.field3120 = this.field3120;
            var12.field3123 = this.field3123;
        } else {
            var12.field3120 = class122.method892(this.field3120, 0);
            var12.field3123 = class122.method892(this.field3123, 0);
        }
        if (arg1) {
            var12.field3138 = this.field3138;
        } else {
            var12.field3138 = class122.method892(this.field3138, 0);
        }
        if (arg0 && arg1) {
            var12.field3140 = this.field3140;
            var12.field3128 = this.field3128;
        } else {
            var12.field3140 = new class118();
            var12.field3128 = new class183();
        }
        if (arg2) {
            var12.field3142 = this.field3142;
        } else {
            var12.field3142 = class115.method862((byte) -87, this.field3142);
        }
        if (arg3) {
            var12.field3121 = this.field3121;
        } else {
            var12.field3121 = class253.method1714((byte) -113, this.field3121);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class4.field62) {
            var12.field3124 = new class118();
        } else {
            var12.field3124 = this.field3124;
        }
        if (arg5) {
            var12.field3139 = this.field3139;
            var12.field3118 = this.field3118;
            var12.field3109 = this.field3109;
            var12.field3137 = this.field3137;
        } else {
            var12.field3139 = class115.method862((byte) -116, this.field3139);
            var12.field3118 = class115.method862((byte) 96, this.field3118);
            var12.field3109 = class115.method862((byte) -79, this.field3109);
            var12.field3137 = class115.method862((byte) -49, this.field3137);
        }
        if (!class4.field62) {
            var12.field3136 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3136 = this.field3136;
        } else {
            var12.field3136 = new class118();
        }
        if (arg8) {
            var12.field3115 = this.field3115;
            var12.field3105 = this.field3105;
            var12.field3132 = this.field3132;
        } else {
            var12.field3115 = class317.method2178(109, this.field3115);
            var12.field3105 = class317.method2178(-107, this.field3105);
            var12.field3132 = new class118();
        }
        if (arg9) {
            var12.field3114 = this.field3114;
            var12.field3129 = this.field3129;
            var12.field3113 = this.field3113;
            var12.field3110 = this.field3110;
        } else {
            var12.field3114 = class115.method862((byte) -114, this.field3114);
            var12.field3129 = class115.method862((byte) -127, this.field3129);
            var12.field3113 = class115.method862((byte) -82, this.field3113);
            var12.field3110 = new class118();
        }
        if (arg10) {
            var12.field3106 = this.field3106;
        } else {
            var12.field3106 = class115.method862((byte) 105, this.field3106);
        }
        var12.field3134 = this.field3134;
        var12.field3127 = this.field3127;
        var12.field3119 = this.field3119;
        var12.field3112 = this.field3112;
        var12.field3122 = this.field3122;
        var12.field3104 = this.field3104;
        var12.field3107 = this.field3107;
        var12.field3126 = this.field3126;
        var12.field3144 = this.field3144;
        return var12;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZZZZ)V", line = 2314)
    private final void method1201(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3140.field2085 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3124.field2085 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3136.field2085 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3132.field2085 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3108.field4066.length < this.field3131 * var6) {
            field3108 = new class235((this.field3131 + 100) * var6);
        } else {
            field3108.field4051 = 0;
        }
        if (arg1) {
            if (class257.field4402) {
                for (int var7 = 0; var7 < this.field3133; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3120[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3138[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3123[var7]);
                    int var11 = this.field3107[var7];
                    int var12 = this.field3107[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3104[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3108.field4051 = var6 * var14;
                        field3108.method1577(true, var8);
                        field3108.method1577(true, var9);
                        field3108.method1577(true, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3133; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3120[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3138[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3123[var15]);
                    int var19 = this.field3107[var15];
                    int var20 = this.field3107[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3104[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3108.field4051 = var6 * var22;
                        field3108.method1616(var16, (byte) 46);
                        field3108.method1616(var17, (byte) 46);
                        field3108.method1616(var18, (byte) 46);
                    }
                }
            }
        }
        if (arg2) {
            if (class4.field62) {
                for (int var42 = 0; var42 < this.field3135; var42++) {
                    int var43 = method1175(this.field3142[var42], this.field3106[var42], this.field3126, this.field3121[var42]);
                    field3108.field4051 = this.field3114[var42] * var6 + this.field3124.field2085;
                    field3108.method1577(true, var43);
                    field3108.field4051 = this.field3129[var42] * var6 + this.field3124.field2085;
                    field3108.method1577(true, var43);
                    field3108.field4051 = this.field3113[var42] * var6 + this.field3124.field2085;
                    field3108.method1577(true, var43);
                }
            } else {
                int var23 = (int) class304.field5189[0];
                int var24 = (int) class304.field5189[1];
                int var25 = (int) class304.field5189[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3126 * 1.3F);
                int var28 = this.field3144 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3135; var29++) {
                    short var30 = this.field3114[var29];
                    short var31 = this.field3137[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3109[var30] * var25 + this.field3139[var30] * var23 + this.field3118[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3109[var30] * var25 + this.field3139[var30] * var23 + this.field3118[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3137[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3129[var29];
                    short var34 = this.field3137[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3109[var33] * var25 + this.field3139[var33] * var23 + this.field3118[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3109[var33] * var25 + this.field3139[var33] * var23 + this.field3118[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3137[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3113[var29];
                    short var37 = this.field3137[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3109[var36] * var25 + this.field3139[var36] * var23 + this.field3118[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3109[var36] * var25 + this.field3139[var36] * var23 + this.field3118[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3137[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1175(this.field3142[var29], this.field3106[var29], var32, this.field3121[var29]);
                    int var40 = method1175(this.field3142[var29], this.field3106[var29], var35, this.field3121[var29]);
                    int var41 = method1175(this.field3142[var29], this.field3106[var29], var38, this.field3121[var29]);
                    field3108.field4051 = var6 * var30 + this.field3124.field2085;
                    field3108.method1577(true, var39);
                    field3108.field4051 = var6 * var33 + this.field3124.field2085;
                    field3108.method1577(true, var40);
                    field3108.field4051 = var6 * var36 + this.field3124.field2085;
                    field3108.method1577(true, var41);
                }
                this.field3139 = null;
                this.field3118 = null;
                this.field3109 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3144;
            float var45 = 3.0F / (float) (this.field3144 / 2 + this.field3144);
            field3108.field4051 = this.field3136.field2085;
            if (class257.field4402) {
                for (int var46 = 0; var46 < this.field3131; var46++) {
                    short var47 = this.field3137[var46];
                    if (var47 == 0) {
                        field3108.method1579((float) this.field3139[var46] * var45, -1890);
                        field3108.method1579((float) this.field3118[var46] * var45, -1890);
                        field3108.method1579((float) this.field3109[var46] * var45, -1890);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3108.method1579((float) this.field3139[var46] * var48, -1890);
                        field3108.method1579((float) this.field3118[var46] * var48, -1890);
                        field3108.method1579((float) this.field3109[var46] * var48, -1890);
                    }
                    field3108.field4051 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3131; var49++) {
                    short var50 = this.field3137[var49];
                    if (var50 == 0) {
                        field3108.method1581((byte) 119, (float) this.field3139[var49] * var45);
                        field3108.method1581((byte) 120, (float) this.field3118[var49] * var45);
                        field3108.method1581((byte) 121, (float) this.field3109[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3108.method1581((byte) -119, (float) this.field3139[var49] * var51);
                        field3108.method1581((byte) 121, (float) this.field3118[var49] * var51);
                        field3108.method1581((byte) 125, (float) this.field3109[var49] * var51);
                    }
                    field3108.field4051 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3108.field4051 = this.field3132.field2085;
            if (class257.field4402) {
                for (int var52 = 0; var52 < this.field3131; var52++) {
                    field3108.method1579(this.field3115[var52], -1890);
                    field3108.method1579(this.field3105[var52], -1890);
                    field3108.field4051 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3131; var53++) {
                    field3108.method1581((byte) 126, this.field3115[var53]);
                    field3108.method1581((byte) 26, this.field3105[var53]);
                    field3108.field4051 += var6 - 8;
                }
            }
        }
        field3108.field4051 = this.field3131 * var6;
        if (arg0) {
            if (class257.field4392) {
                ByteBuffer var54 = ByteBuffer.wrap(field3108.field4066, 0, field3108.field4051);
                if (this.field3111 == null) {
                    this.field3111 = new class66(true);
                    this.field3111.method505(var54);
                } else {
                    this.field3111.method503(var54);
                }
                if (arg1) {
                    this.field3140.field2087 = true;
                    this.field3140.field2092 = null;
                    this.field3140.field2098 = this.field3111;
                    this.field3140.field2091 = var6;
                }
                if (arg2) {
                    this.field3124.field2087 = true;
                    this.field3124.field2092 = null;
                    this.field3124.field2098 = this.field3111;
                    this.field3124.field2091 = var6;
                }
                if (arg3) {
                    this.field3136.field2087 = true;
                    this.field3136.field2092 = null;
                    this.field3136.field2098 = this.field3111;
                    this.field3136.field2091 = var6;
                }
                if (arg4) {
                    this.field3132.field2087 = true;
                    this.field3132.field2092 = null;
                    this.field3132.field2098 = this.field3111;
                    this.field3132.field2091 = var6;
                }
            } else {
                if (field3141 == null || field3141.capacity() < field3108.field4051) {
                    field3141 = ByteBuffer.allocateDirect(var6 * 100 + field3108.field4051);
                } else {
                    field3141.clear();
                }
                field3141.put(field3108.field4066, 0, field3108.field4051);
                field3141.flip();
                if (arg1) {
                    this.field3140.field2087 = true;
                    this.field3140.field2092 = field3141;
                    this.field3140.field2098 = null;
                    this.field3140.field2091 = var6;
                }
                if (arg2) {
                    this.field3124.field2087 = true;
                    this.field3124.field2092 = field3141;
                    this.field3140.field2098 = null;
                    this.field3124.field2091 = var6;
                }
                if (arg3) {
                    this.field3136.field2087 = true;
                    this.field3136.field2092 = field3141;
                    this.field3136.field2098 = null;
                    this.field3136.field2091 = var6;
                }
                if (arg4) {
                    this.field3132.field2087 = true;
                    this.field3132.field2092 = field3141;
                    this.field3132.field2098 = null;
                    this.field3132.field2091 = var6;
                }
            }
        } else if (class257.field4393) {
            class66 var55 = new class66();
            ByteBuffer var56 = ByteBuffer.wrap(field3108.field4066, 0, field3108.field4051);
            var55.method505(var56);
            if (arg1) {
                this.field3140.field2087 = true;
                this.field3140.field2092 = null;
                this.field3140.field2098 = var55;
                this.field3140.field2091 = var6;
            }
            if (arg2) {
                this.field3124.field2087 = true;
                this.field3124.field2092 = null;
                this.field3124.field2098 = var55;
                this.field3124.field2091 = var6;
            }
            if (arg3) {
                this.field3136.field2087 = true;
                this.field3136.field2092 = null;
                this.field3136.field2098 = var55;
                this.field3136.field2091 = var6;
            }
            if (arg4) {
                this.field3132.field2087 = true;
                this.field3132.field2092 = null;
                this.field3132.field2098 = var55;
                this.field3132.field2091 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3108.field4051);
            var57.put(field3108.field4066, 0, field3108.field4051);
            var57.flip();
            if (arg1) {
                this.field3140.field2087 = true;
                this.field3140.field2092 = var57;
                this.field3140.field2098 = null;
                this.field3140.field2091 = var6;
            }
            if (arg2) {
                this.field3124.field2087 = true;
                this.field3124.field2092 = var57;
                this.field3140.field2098 = null;
                this.field3124.field2091 = var6;
            }
            if (arg3) {
                this.field3136.field2087 = true;
                this.field3136.field2092 = var57;
                this.field3136.field2098 = null;
                this.field3136.field2091 = var6;
            }
            if (arg4) {
                this.field3132.field2087 = true;
                this.field3132.field2092 = var57;
                this.field3132.field2098 = null;
                this.field3132.field2091 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 2843)
    public final void method642(int arg0) {
        int var2 = class266.field4642[arg0];
        int var3 = class266.field4636[arg0];
        for (int var4 = 0; var4 < this.field3133; var4++) {
            int var5 = this.field3138[var4] * var2 + this.field3120[var4] * var3 >> 16;
            this.field3138[var4] = this.field3138[var4] * var3 - this.field3120[var4] * var2 >> 16;
            this.field3120[var4] = var5;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(SS)V", line = 2864)
    public final void method1202(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3135; var3++) {
            if (this.field3106[var3] == arg0) {
                this.field3106[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class266.field4643.method192(0, arg0 & 0xFFFF);
            var5 = class266.field4643.method193(5296, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class266.field4643.method192(0, arg1 & 0xFFFF);
            var7 = class266.field4643.method193(5296, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3124.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 2903)
    public final void method638(int arg0) {
        int var2 = class266.field4642[arg0];
        int var3 = class266.field4636[arg0];
        for (int var4 = 0; var4 < this.field3133; var4++) {
            int var5 = this.field3138[var4] * var3 - this.field3123[var4] * var2 >> 16;
            this.field3123[var4] = this.field3138[var4] * var2 + this.field3123[var4] * var3 >> 16;
            this.field3138[var4] = var5;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "()V", line = 2923)
    public final void method1203() {
        if (this.field3139 == null) {
            this.method645();
            return;
        }
        for (int var1 = 0; var1 < this.field3133; var1++) {
            int var2 = this.field3120[var1];
            this.field3120[var1] = this.field3123[var1];
            this.field3123[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3131; var3++) {
            short var4 = this.field3139[var3];
            this.field3139[var3] = this.field3109[var3];
            this.field3109[var3] = (short) (-var4);
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V", line = 2963)
    public final void method1204(int arg0) {
        this.field3144 = (short) arg0;
        if (this.field3136 != null) {
            this.field3136.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()I", line = 2969)
    public final int method361() {
        if (!this.field3128.field3270) {
            this.method1206();
        }
        return this.field3128.field3271;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V", line = 2979)
    private final void method1205(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3151 = 0;
            field3154 = 0;
            field3152 = 0;
            for (int var6 = 0; var6 < this.field3133; var6++) {
                field3151 += this.field3120[var6];
                field3154 += this.field3138[var6];
                field3152 += this.field3123[var6];
                var5++;
            }
            if (var5 > 0) {
                field3151 = field3151 / var5 + arg1;
                field3154 = field3154 / var5 + arg2;
                field3152 = field3152 / var5 + arg3;
            } else {
                field3151 = arg1;
                field3154 = arg2;
                field3152 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3133; var7++) {
                this.field3120[var7] += arg1;
                this.field3138[var7] += arg2;
                this.field3123[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3133; var8++) {
                this.field3120[var8] -= field3151;
                this.field3138[var8] -= field3154;
                this.field3123[var8] -= field3152;
                if (arg3 != 0) {
                    int var9 = class266.field4642[arg3];
                    int var10 = class266.field4636[arg3];
                    int var11 = this.field3138[var8] * var9 + this.field3120[var8] * var10 + 32767 >> 16;
                    this.field3138[var8] = this.field3138[var8] * var10 + 32767 - this.field3120[var8] * var9 >> 16;
                    this.field3120[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class266.field4642[arg1];
                    int var13 = class266.field4636[arg1];
                    int var14 = this.field3138[var8] * var13 + 32767 - this.field3123[var8] * var12 >> 16;
                    this.field3123[var8] = this.field3138[var8] * var12 + this.field3123[var8] * var13 + 32767 >> 16;
                    this.field3138[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class266.field4642[arg2];
                    int var16 = class266.field4636[arg2];
                    int var17 = this.field3123[var8] * var15 + this.field3120[var8] * var16 + 32767 >> 16;
                    this.field3123[var8] = this.field3123[var8] * var16 + 32767 - this.field3120[var8] * var15 >> 16;
                    this.field3120[var8] = var17;
                }
                this.field3120[var8] += field3151;
                this.field3138[var8] += field3154;
                this.field3123[var8] += field3152;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3133; var18++) {
                this.field3120[var18] -= field3151;
                this.field3138[var18] -= field3154;
                this.field3123[var18] -= field3152;
                this.field3120[var18] = this.field3120[var18] * arg1 / 128;
                this.field3138[var18] = this.field3138[var18] * arg2 / 128;
                this.field3123[var18] = this.field3123[var18] * arg3 / 128;
                this.field3120[var18] += field3151;
                this.field3138[var18] += field3154;
                this.field3123[var18] += field3152;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3135; var19++) {
                int var20 = (this.field3121[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3121[var19] = (byte) var20;
            }
            this.field3124.field2087 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "()V", line = 3134)
    private final void method1206() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3133; var9++) {
            int var10 = this.field3120[var9];
            int var11 = this.field3138[var9];
            int var12 = this.field3123[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3128.field3265 = (short) var1;
        this.field3128.field3266 = (short) var4;
        this.field3128.field3271 = (short) var2;
        this.field3128.field3267 = (short) var5;
        this.field3128.field3268 = (short) var3;
        this.field3128.field3269 = (short) var6;
        this.field3128.field3272 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3128.field3270 = true;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V", line = 3205)
    public final void method645() {
        for (int var1 = 0; var1 < this.field3133; var1++) {
            int var2 = this.field3120[var1];
            this.field3120[var1] = this.field3123[var1];
            this.field3123[var1] = -var2;
        }
        this.field3128.field3270 = false;
        this.field3140.field2087 = false;
    }

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "()V", line = 3220)
    public final void method1207() {
        int var10002;
        if (this.field3134 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3133; var3++) {
                int var4 = this.field3134[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3127 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3127[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3133) {
                int var7 = this.field3134[var6] & 0xFF;
                this.field3127[var7][var1[var7]++] = var6++;
            }
            this.field3134 = null;
        }
        if (this.field3119 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3135; var10++) {
            int var11 = this.field3119[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3112 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3112[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3135) {
            int var14 = this.field3119[var13] & 0xFF;
            this.field3112[var14][var8[var14]++] = var13++;
        }
        this.field3119 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIJ)V", line = 3312)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3131 == 0) {
            return;
        }
        if (!this.field3128.field3270) {
            this.method1206();
        }
        short var11 = this.field3128.field3272;
        short var12 = this.field3128.field3271;
        short var13 = this.field3128.field3267;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class193.field3411) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class313.field5321) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class301.field5153) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class280.field4815) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class266.field4642[arg0];
            var25 = class266.field4636[arg0];
        }
        if (arg8 > 0L && class75.field1308 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class164.field2774 >= var26 && class164.field2774 <= var27 && class59.field988 >= var28 && class59.field988 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3128.field3265;
                short var35 = this.field3128.field3266;
                short var36 = this.field3128.field3268;
                short var37 = this.field3128.field3269;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
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
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class164.field2774 >= var30 && class164.field2774 <= var31 && class59.field988 >= var32 && class59.field988 <= var33) {
                    if (this.field5192) {
                        class26.field318[class122.field2171++] = arg8;
                    } else {
                        if (field3157.length < this.field3131) {
                            field3157 = new int[this.field3131];
                            field3155 = new int[this.field3131];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3133) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3135) {
                                        break label118;
                                    }
                                    short var78 = this.field3114[var77];
                                    short var79 = this.field3129[var77];
                                    short var80 = this.field3113[var77];
                                    if (this.method1178(class164.field2774, class59.field988, field3155[var78], field3155[var79], field3155[var80], field3157[var78], field3157[var79], field3157[var80])) {
                                        class26.field318[class122.field2171++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3120[var57];
                            int var59 = this.field3138[var57];
                            int var60 = this.field3123[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field3107[var57];
                            int var74 = this.field3107[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3104[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3157[var76] = var71;
                                field3155[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class257.field4409;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1189();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3584)
    private static final void method1208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3156 = var18;
        field3149 = var19;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIFFF)[F", line = 3669)
    private static final float[] method1209(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }
}
