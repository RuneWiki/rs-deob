import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class218 extends class151 {

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "B")
    private byte field3231 = 0;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "B")
    private byte field3213 = 0;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public int field3228 = 0;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    private int field3235 = 0;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    private int field3248 = 0;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "Z")
    public boolean field3240 = false;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "[I")
    private int[] field3233;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "[I")
    public int[] field3244;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
    public int[] field3214;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "[I")
    private int[] field3229;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "[S")
    private short[] field3227;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[Lfd;")
    public class219[] field3216;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "[Lbb;")
    public class103[] field3241;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "[S")
    private short[] field3239;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[S")
    private short[] field3215;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[S")
    private short[] field3209;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "[S")
    private short[] field3238;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[F")
    private float[] field3221;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "[F")
    private float[] field3249;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "[S")
    private short[] field3226;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[B")
    private byte[] field3218;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "[S")
    private short[] field3207;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[S")
    private short[] field3217;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "[S")
    private short[] field3230;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "[B")
    private byte[] field3234;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "[S")
    private short[] field3219;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Lcd;")
    public class282 field3208;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "Lom;")
    public class184 field3222;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "Lom;")
    private class184 field3251;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Lom;")
    private class184 field3237;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Lom;")
    private class184 field3211;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "Lom;")
    private class184 field3236;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "S")
    private short field3232;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "S")
    private short field3242;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "[S")
    private short[] field3212;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
    private int[] field3220;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Lsb;")
    private static class190 field3210 = new class190(10000);

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "Lhi;")
    private static class218 field3252 = new class218();

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "Lhi;")
    private static class218 field3253 = new class218();

    @OriginalMember(owner = "client!hi", name = "gb", descriptor = "Lhi;")
    private static class218 field3254 = new class218();

    @OriginalMember(owner = "client!hi", name = "hb", descriptor = "Lhi;")
    private static class218 field3255 = new class218();

    @OriginalMember(owner = "client!hi", name = "ib", descriptor = "Lhi;")
    private static class218 field3256 = new class218();

    @OriginalMember(owner = "client!hi", name = "jb", descriptor = "Lhi;")
    private static class218 field3257 = new class218();

    @OriginalMember(owner = "client!hi", name = "pb", descriptor = "[I")
    private static int[] field3263 = new int[1];

    @OriginalMember(owner = "client!hi", name = "mb", descriptor = "Z")
    private static boolean field3260 = false;

    @OriginalMember(owner = "client!hi", name = "ub", descriptor = "[I")
    private static int[] field3268 = new int[1];

    @OriginalMember(owner = "client!hi", name = "nb", descriptor = "F")
    private static float field3261;

    @OriginalMember(owner = "client!hi", name = "ob", descriptor = "F")
    private static float field3262;

    @OriginalMember(owner = "client!hi", name = "qb", descriptor = "F")
    private static float field3264;

    @OriginalMember(owner = "client!hi", name = "sb", descriptor = "F")
    private static float field3266;

    @OriginalMember(owner = "client!hi", name = "tb", descriptor = "F")
    private static float field3267;

    @OriginalMember(owner = "client!hi", name = "vb", descriptor = "F")
    private static float field3269;

    @OriginalMember(owner = "client!hi", name = "kb", descriptor = "I")
    private static int field3258;

    @OriginalMember(owner = "client!hi", name = "lb", descriptor = "I")
    private static int field3259;

    @OriginalMember(owner = "client!hi", name = "rb", descriptor = "I")
    private static int field3265;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Lch;")
    private class115 field3225;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Li;")
    private class350 field3206;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3247;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "[J")
    private static long[] field3245;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "[[I")
    private int[][] field3224;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "[[I")
    private int[][] field3243;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "()V", line = 5)
    public final void method1568() {
        if (this.field3239 == null) {
            this.method1069();
            return;
        }
        for (int var1 = 0; var1 < this.field3228; var1++) {
            this.field3244[var1] = -this.field3244[var1];
            this.field3214[var1] = -this.field3214[var1];
        }
        for (int var2 = 0; var2 < this.field3248; var2++) {
            this.field3239[var2] = (short) (-this.field3239[var2]);
            this.field3209[var2] = (short) (-this.field3209[var2]);
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([FI)[F", line = 39)
    private static final float[] method1569(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class84.method691(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII[FIF)V", line = 46)
    private static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field3264 = var16;
        field3262 = var17;
    }

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "()V", line = 89)
    public static final void method1571() {
        field3252 = new class218();
        field3253 = new class218();
        field3254 = new class218();
        field3255 = new class218();
        field3256 = new class218();
        field3257 = new class218();
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 98)
    public final void method1572(int arg0) {
        if (this.field3239 == null) {
            this.method1068(arg0);
            return;
        }
        int var2 = class345.field5339[arg0];
        int var3 = class345.field5343[arg0];
        for (int var4 = 0; var4 < this.field3228; var4++) {
            int var5 = this.field3244[var4] * var3 + this.field3214[var4] * var2 >> 16;
            this.field3214[var4] = this.field3214[var4] * var3 - this.field3244[var4] * var2 >> 16;
            this.field3244[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3248; var6++) {
            int var7 = this.field3239[var6] * var3 + this.field3209[var6] * var2 >> 16;
            this.field3209[var6] = (short) (this.field3209[var6] * var3 - this.field3239[var6] * var2 >> 16);
            this.field3239[var6] = (short) var7;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 140)
    public final void method1079(int arg0) {
        int var2 = class345.field5339[arg0];
        int var3 = class345.field5343[arg0];
        for (int var4 = 0; var4 < this.field3228; var4++) {
            int var5 = this.field3246[var4] * var3 - this.field3214[var4] * var2 >> 16;
            this.field3214[var4] = this.field3246[var4] * var2 + this.field3214[var4] * var3 >> 16;
            this.field3246[var4] = var5;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "()V", line = 160)
    private final void method1573() {
        if (field3210.field2718.length < this.field3250 * 12) {
            field3210 = new class190((this.field3250 + 100) * 12);
        } else {
            field3210.field2776 = 0;
        }
        if (class141.field2056) {
            for (int var1 = 0; var1 < this.field3250; var1++) {
                field3210.method1354(this.field3207[var1], (byte) -14);
                field3210.method1354(this.field3217[var1], (byte) -24);
                field3210.method1354(this.field3223[var1], (byte) 118);
            }
        } else {
            for (int var2 = 0; var2 < this.field3250; var2++) {
                field3210.method1335(this.field3207[var2], 840118768);
                field3210.method1335(this.field3217[var2], 840118768);
                field3210.method1335(this.field3223[var2], 840118768);
            }
        }
        if (!class141.field2032) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3210.field2776);
            var5.put(field3210.field2718, 0, field3210.field2776);
            var5.flip();
            this.field3236.field2640 = true;
            this.field3236.field2645 = var5;
            this.field3236.field2643 = null;
            return;
        }
        class115 var3 = new class115();
        ByteBuffer var4 = ByteBuffer.wrap(field3210.field2718, 0, field3210.field2776);
        var3.method864(var4);
        this.field3236.field2640 = true;
        this.field3236.field2645 = null;
        this.field3236.field2643 = var3;
    }

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "()I", line = 218)
    public final int method1574() {
        return this.field3242;
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "()I", line = 221)
    public final int method1074() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4286;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Lh;", line = 227)
    public final class111 method404(int arg0, int arg1, int arg2) {
        this.field3240 = false;
        if (this.field3206 != null) {
            this.field3239 = this.field3206.field5410;
            this.field3215 = this.field3206.field5411;
            this.field3209 = this.field3206.field5408;
            this.field3238 = this.field3206.field5409;
            this.field3206 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 240)
    private static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field3267 = var18;
        field3266 = var19;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V", line = 319)
    public final void method1576(int arg0) {
        this.field3242 = (short) arg0;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "()V", line = 327)
    public static void method1577() {
        field3245 = null;
        field3210 = null;
        field3247 = null;
        field3252 = null;
        field3253 = null;
        field3254 = null;
        field3255 = null;
        field3256 = null;
        field3257 = null;
        field3268 = null;
        field3263 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 340)
    public final void method1073(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3258 = 0;
            field3259 = 0;
            field3265 = 0;
            for (int var6 = 0; var6 < this.field3228; var6++) {
                field3258 += this.field3244[var6];
                field3259 += this.field3246[var6];
                field3265 += this.field3214[var6];
                var5++;
            }
            if (var5 > 0) {
                field3258 = field3258 / var5 + arg1;
                field3259 = field3259 / var5 + arg2;
                field3265 = field3265 / var5 + arg3;
            } else {
                field3258 = arg1;
                field3259 = arg2;
                field3265 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3228; var7++) {
                this.field3244[var7] += arg1;
                this.field3246[var7] += arg2;
                this.field3214[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3228; var8++) {
                this.field3244[var8] -= field3258;
                this.field3246[var8] -= field3259;
                this.field3214[var8] -= field3265;
                if (arg3 != 0) {
                    int var9 = class345.field5339[arg3];
                    int var10 = class345.field5343[arg3];
                    int var11 = this.field3246[var8] * var9 + this.field3244[var8] * var10 + 32767 >> 16;
                    this.field3246[var8] = this.field3246[var8] * var10 + 32767 - this.field3244[var8] * var9 >> 16;
                    this.field3244[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class345.field5339[arg1];
                    int var13 = class345.field5343[arg1];
                    int var14 = this.field3246[var8] * var13 + 32767 - this.field3214[var8] * var12 >> 16;
                    this.field3214[var8] = this.field3246[var8] * var12 + this.field3214[var8] * var13 + 32767 >> 16;
                    this.field3246[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class345.field5339[arg2];
                    int var16 = class345.field5343[arg2];
                    int var17 = this.field3244[var8] * var16 + this.field3214[var8] * var15 + 32767 >> 16;
                    this.field3214[var8] = this.field3214[var8] * var16 + 32767 - this.field3244[var8] * var15 >> 16;
                    this.field3244[var8] = var17;
                }
                this.field3244[var8] += field3258;
                this.field3246[var8] += field3259;
                this.field3214[var8] += field3265;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3228; var18++) {
                this.field3244[var18] -= field3258;
                this.field3246[var18] -= field3259;
                this.field3214[var18] -= field3265;
                this.field3244[var18] = this.field3244[var18] * arg1 / 128;
                this.field3246[var18] = this.field3246[var18] * arg2 / 128;
                this.field3214[var18] = this.field3214[var18] * arg3 / 128;
                this.field3244[var18] += field3258;
                this.field3246[var18] += field3259;
                this.field3214[var18] += field3265;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3250; var19++) {
                int var20 = (this.field3218[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3218[var19] = (byte) var20;
            }
            this.field3251.field2640 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field3250; var21++) {
                int var22 = this.field3226[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field3226[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field3251.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 535)
    public final void method1068(int arg0) {
        int var2 = class345.field5339[arg0];
        int var3 = class345.field5343[arg0];
        for (int var4 = 0; var4 < this.field3228; var4++) {
            int var5 = this.field3244[var4] * var3 + this.field3214[var4] * var2 >> 16;
            this.field3214[var4] = this.field3214[var4] * var3 - this.field3244[var4] * var2 >> 16;
            this.field3244[var4] = var5;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "()V", line = 554)
    public final void method1578() {
        if (this.field3239 == null) {
            this.method1070();
            return;
        }
        for (int var1 = 0; var1 < this.field3228; var1++) {
            int var2 = this.field3214[var1];
            this.field3214[var1] = this.field3244[var1];
            this.field3244[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3248; var3++) {
            short var4 = this.field3209[var3];
            this.field3209[var3] = this.field3239[var3];
            this.field3239[var3] = (short) (-var4);
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "()V", line = 592)
    public final void method1579() {
        if (this.field3239 == null) {
            this.method1092();
            return;
        }
        for (int var1 = 0; var1 < this.field3228; var1++) {
            int var2 = this.field3244[var1];
            this.field3244[var1] = this.field3214[var1];
            this.field3214[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3248; var3++) {
            short var4 = this.field3239[var3];
            this.field3239[var3] = this.field3209[var3];
            this.field3209[var3] = (short) (-var4);
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZ)V", line = 631)
    private final void method1580(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3222.field2639 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3251.field2639 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3237.field2639 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3211.field2639 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3210.field2718.length < this.field3248 * var6) {
            field3210 = new class190((this.field3248 + 100) * var6);
        } else {
            field3210.field2776 = 0;
        }
        if (arg1) {
            if (class141.field2056) {
                for (int var7 = 0; var7 < this.field3235; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3244[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3246[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3214[var7]);
                    int var11 = this.field3233[var7];
                    int var12 = this.field3233[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3212[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3210.field2776 = var6 * var14;
                        field3210.method1354(var8, (byte) 117);
                        field3210.method1354(var9, (byte) 127);
                        field3210.method1354(var10, (byte) 106);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3235; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3244[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3246[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3214[var15]);
                    int var19 = this.field3233[var15];
                    int var20 = this.field3233[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3212[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3210.field2776 = var6 * var22;
                        field3210.method1335(var16, 840118768);
                        field3210.method1335(var17, 840118768);
                        field3210.method1335(var18, 840118768);
                    }
                }
            }
        }
        if (arg2) {
            if (class98.field1379) {
                for (int var42 = 0; var42 < this.field3250; var42++) {
                    int var43 = method1592(this.field3226[var42], this.field3230[var42], this.field3232, this.field3218[var42]);
                    field3210.field2776 = this.field3207[var42] * var6 + this.field3251.field2639;
                    field3210.method1354(var43, (byte) -101);
                    field3210.field2776 = this.field3217[var42] * var6 + this.field3251.field2639;
                    field3210.method1354(var43, (byte) 116);
                    field3210.field2776 = this.field3223[var42] * var6 + this.field3251.field2639;
                    field3210.method1354(var43, (byte) 124);
                }
            } else {
                int var23 = (int) class222.field3330[0];
                int var24 = (int) class222.field3330[1];
                int var25 = (int) class222.field3330[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3232 * 1.3F);
                int var28 = this.field3242 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3250; var29++) {
                    short var30 = this.field3207[var29];
                    short var31 = this.field3238[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3209[var30] * var25 + this.field3239[var30] * var23 + this.field3215[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3209[var30] * var25 + this.field3239[var30] * var23 + this.field3215[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3238[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3217[var29];
                    short var34 = this.field3238[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3209[var33] * var25 + this.field3239[var33] * var23 + this.field3215[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3209[var33] * var25 + this.field3239[var33] * var23 + this.field3215[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3238[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3223[var29];
                    short var37 = this.field3238[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3209[var36] * var25 + this.field3239[var36] * var23 + this.field3215[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3209[var36] * var25 + this.field3239[var36] * var23 + this.field3215[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3238[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1592(this.field3226[var29], this.field3230[var29], var32, this.field3218[var29]);
                    int var40 = method1592(this.field3226[var29], this.field3230[var29], var35, this.field3218[var29]);
                    int var41 = method1592(this.field3226[var29], this.field3230[var29], var38, this.field3218[var29]);
                    field3210.field2776 = var6 * var30 + this.field3251.field2639;
                    field3210.method1354(var39, (byte) -16);
                    field3210.field2776 = var6 * var33 + this.field3251.field2639;
                    field3210.method1354(var40, (byte) -30);
                    field3210.field2776 = var6 * var36 + this.field3251.field2639;
                    field3210.method1354(var41, (byte) 124);
                }
                this.field3239 = null;
                this.field3215 = null;
                this.field3209 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3242;
            float var45 = 3.0F / (float) (this.field3242 / 2 + this.field3242);
            field3210.field2776 = this.field3237.field2639;
            if (class141.field2056) {
                for (int var46 = 0; var46 < this.field3248; var46++) {
                    short var47 = this.field3238[var46];
                    if (var47 == 0) {
                        field3210.method1328((byte) 126, (float) this.field3239[var46] * var45);
                        field3210.method1328((byte) 59, (float) this.field3215[var46] * var45);
                        field3210.method1328((byte) 81, (float) this.field3209[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3210.method1328((byte) 69, (float) this.field3239[var46] * var48);
                        field3210.method1328((byte) 62, (float) this.field3215[var46] * var48);
                        field3210.method1328((byte) 115, (float) this.field3209[var46] * var48);
                    }
                    field3210.field2776 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3248; var49++) {
                    short var50 = this.field3238[var49];
                    if (var50 == 0) {
                        field3210.method1318((float) this.field3239[var49] * var45, (byte) -39);
                        field3210.method1318((float) this.field3215[var49] * var45, (byte) -39);
                        field3210.method1318((float) this.field3209[var49] * var45, (byte) -39);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3210.method1318((float) this.field3239[var49] * var51, (byte) -39);
                        field3210.method1318((float) this.field3215[var49] * var51, (byte) -39);
                        field3210.method1318((float) this.field3209[var49] * var51, (byte) -39);
                    }
                    field3210.field2776 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3210.field2776 = this.field3211.field2639;
            if (class141.field2056) {
                for (int var52 = 0; var52 < this.field3248; var52++) {
                    field3210.method1328((byte) 107, this.field3221[var52]);
                    field3210.method1328((byte) 97, this.field3249[var52]);
                    field3210.field2776 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3248; var53++) {
                    field3210.method1318(this.field3221[var53], (byte) -39);
                    field3210.method1318(this.field3249[var53], (byte) -39);
                    field3210.field2776 += var6 - 8;
                }
            }
        }
        field3210.field2776 = this.field3248 * var6;
        if (arg0) {
            if (class141.field2050) {
                ByteBuffer var54 = ByteBuffer.wrap(field3210.field2718, 0, field3210.field2776);
                if (this.field3225 == null) {
                    this.field3225 = new class115(true);
                    this.field3225.method864(var54);
                } else {
                    this.field3225.method862(var54);
                }
                if (arg1) {
                    this.field3222.field2640 = true;
                    this.field3222.field2645 = null;
                    this.field3222.field2643 = this.field3225;
                    this.field3222.field2641 = var6;
                }
                if (arg2) {
                    this.field3251.field2640 = true;
                    this.field3251.field2645 = null;
                    this.field3251.field2643 = this.field3225;
                    this.field3251.field2641 = var6;
                }
                if (arg3) {
                    this.field3237.field2640 = true;
                    this.field3237.field2645 = null;
                    this.field3237.field2643 = this.field3225;
                    this.field3237.field2641 = var6;
                }
                if (arg4) {
                    this.field3211.field2640 = true;
                    this.field3211.field2645 = null;
                    this.field3211.field2643 = this.field3225;
                    this.field3211.field2641 = var6;
                }
            } else {
                if (field3247 == null || field3247.capacity() < field3210.field2776) {
                    field3247 = ByteBuffer.allocateDirect(var6 * 100 + field3210.field2776);
                } else {
                    field3247.clear();
                }
                field3247.put(field3210.field2718, 0, field3210.field2776);
                field3247.flip();
                if (arg1) {
                    this.field3222.field2640 = true;
                    this.field3222.field2645 = field3247;
                    this.field3222.field2643 = null;
                    this.field3222.field2641 = var6;
                }
                if (arg2) {
                    this.field3251.field2640 = true;
                    this.field3251.field2645 = field3247;
                    this.field3222.field2643 = null;
                    this.field3251.field2641 = var6;
                }
                if (arg3) {
                    this.field3237.field2640 = true;
                    this.field3237.field2645 = field3247;
                    this.field3237.field2643 = null;
                    this.field3237.field2641 = var6;
                }
                if (arg4) {
                    this.field3211.field2640 = true;
                    this.field3211.field2645 = field3247;
                    this.field3211.field2643 = null;
                    this.field3211.field2641 = var6;
                }
            }
        } else if (class141.field2032) {
            class115 var55 = new class115();
            ByteBuffer var56 = ByteBuffer.wrap(field3210.field2718, 0, field3210.field2776);
            var55.method864(var56);
            if (arg1) {
                this.field3222.field2640 = true;
                this.field3222.field2645 = null;
                this.field3222.field2643 = var55;
                this.field3222.field2641 = var6;
            }
            if (arg2) {
                this.field3251.field2640 = true;
                this.field3251.field2645 = null;
                this.field3251.field2643 = var55;
                this.field3251.field2641 = var6;
            }
            if (arg3) {
                this.field3237.field2640 = true;
                this.field3237.field2645 = null;
                this.field3237.field2643 = var55;
                this.field3237.field2641 = var6;
            }
            if (arg4) {
                this.field3211.field2640 = true;
                this.field3211.field2645 = null;
                this.field3211.field2643 = var55;
                this.field3211.field2641 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3210.field2776);
            var57.put(field3210.field2718, 0, field3210.field2776);
            var57.flip();
            if (arg1) {
                this.field3222.field2640 = true;
                this.field3222.field2645 = var57;
                this.field3222.field2643 = null;
                this.field3222.field2641 = var6;
            }
            if (arg2) {
                this.field3251.field2640 = true;
                this.field3251.field2645 = var57;
                this.field3222.field2643 = null;
                this.field3251.field2641 = var6;
            }
            if (arg3) {
                this.field3237.field2640 = true;
                this.field3237.field2645 = var57;
                this.field3237.field2643 = null;
                this.field3237.field2641 = var6;
            }
            if (arg4) {
                this.field3211.field2640 = true;
                this.field3211.field2645 = var57;
                this.field3211.field2643 = null;
                this.field3211.field2641 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()I", line = 1160)
    public final int method1067() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4281;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZ)Lhc;", line = 1172)
    public final class151 method1077(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1593(arg0, arg1, arg2, field3257, field3256);
    }

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "()I", line = 1175)
    public final int method1080() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4283;
    }

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "()Z", line = 1181)
    public final boolean method1081() {
        if (this.field3224 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3228; var1++) {
            this.field3244[var1] <<= 0x4;
            this.field3246[var1] <<= 0x4;
            this.field3214[var1] <<= 0x4;
        }
        field3258 = 0;
        field3259 = 0;
        field3265 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([SI)[S", line = 1202)
    private static final short[] method1581(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class84.method686(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lh;IIIZ)V", line = 1209)
    public final void method386(class111 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class218 var6 = (class218) arg0;
        if (this.field3250 == 0 || var6.field3250 == 0) {
            return;
        }
        int var7 = var6.field3235;
        int[] var8 = var6.field3244;
        int[] var9 = var6.field3246;
        int[] var10 = var6.field3214;
        short[] var11 = var6.field3239;
        short[] var12 = var6.field3215;
        short[] var13 = var6.field3209;
        short[] var14 = var6.field3238;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3206 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3206.field5410;
            var16 = this.field3206.field5411;
            var17 = this.field3206.field5408;
            var18 = this.field3206.field5409;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3206 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3206.field5410;
            var20 = var6.field3206.field5411;
            var21 = var6.field3206.field5408;
            var22 = var6.field3206.field5409;
        }
        int[] var23 = var6.field3233;
        short[] var24 = var6.field3212;
        if (!var6.field3208.field4282) {
            var6.method1599();
        }
        short var25 = var6.field3208.field4288;
        short var26 = var6.field3208.field4284;
        short var27 = var6.field3208.field4281;
        short var28 = var6.field3208.field4286;
        short var29 = var6.field3208.field4283;
        short var30 = var6.field3208.field4285;
        for (int var31 = 0; var31 < this.field3235; var31++) {
            int var32 = this.field3246[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3244[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3214[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3233[var31];
                        int var37 = this.field3233[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3212[var38] - 1;
                            if (var35 == -1 || this.field3238[var35] != 0) {
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
                                            this.field3206 = new class350();
                                            var15 = this.field3206.field5410 = class65.method541(this.field3239, 0);
                                            var16 = this.field3206.field5411 = class65.method541(this.field3215, 0);
                                            var17 = this.field3206.field5408 = class65.method541(this.field3209, 0);
                                            var18 = this.field3206.field5409 = class65.method541(this.field3238, 0);
                                        }
                                        if (var19 == null) {
                                            class350 var44 = var6.field3206 = new class350();
                                            var19 = var44.field5410 = class65.method541(var11, 0);
                                            var20 = var44.field5411 = class65.method541(var12, 0);
                                            var21 = var44.field5408 = class65.method541(var13, 0);
                                            var22 = var44.field5409 = class65.method541(var14, 0);
                                        }
                                        short var45 = this.field3239[var35];
                                        short var46 = this.field3215[var35];
                                        short var47 = this.field3209[var35];
                                        short var48 = this.field3238[var35];
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
                                        int var57 = this.field3233[var31];
                                        int var58 = this.field3233[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3212[var59] - 1;
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

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILhi;[[I[[IIII)V", line = 1446)
    public final void method1582(int arg0, int arg1, class218 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3208.field4282) {
            arg2.method1599();
        }
        int var9 = arg2.field3208.field4281 + arg5;
        int var10 = arg2.field3208.field4286 + arg5;
        int var11 = arg2.field3208.field4283 + arg7;
        int var12 = arg2.field3208.field4285 + arg7;
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
            for (int var17 = 0; var17 < this.field3235; var17++) {
                int var18 = this.field3244[var17] + arg5;
                int var19 = this.field3214[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3246[var17] = this.field3246[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3208.field4288;
            for (int var28 = 0; var28 < this.field3235; var28++) {
                int var29 = (this.field3246[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3244[var28] + arg5;
                    int var31 = this.field3214[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3246[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1065(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3208.field4284 - arg2.field3208.field4288;
            for (int var42 = 0; var42 < this.field3235; var42++) {
                int var43 = this.field3244[var42] + arg5;
                int var44 = this.field3214[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3246[var42] = var51 + this.field3246[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3208.field4284 - arg2.field3208.field4288;
            for (int var53 = 0; var53 < this.field3235; var53++) {
                int var54 = this.field3244[var53] + arg5;
                int var55 = this.field3214[var53] + arg7;
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
                this.field3246[var53] = ((this.field3246[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3222.field2640 = false;
        this.field3208.field4282 = false;
    }

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "()V", line = 1646)
    public final void method1583() {
        for (int var1 = 0; var1 < this.field3228; var1++) {
            this.field3214[var1] = -this.field3214[var1];
        }
        if (this.field3209 != null) {
            for (int var2 = 0; var2 < this.field3248; var2++) {
                this.field3209[var2] = (short) (-this.field3209[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3250; var3++) {
            short var4 = this.field3207[var3];
            this.field3207[var3] = this.field3223[var3];
            this.field3223[var3] = var4;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
        if (this.field3237 != null) {
            this.field3237.field2640 = false;
        }
        this.field3236.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()I", line = 1684)
    public final int method371() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4288;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwi;)Lwi;", line = 1691)
    public final class234 method1584(class234 arg0) {
        if (this.field3248 == 0) {
            return null;
        }
        if (!this.field3208.field4282) {
            this.method1599();
        }
        int var2;
        int var3;
        if (class222.field3329 > 0) {
            var2 = this.field3208.field4281 - (class222.field3329 * this.field3208.field4284 >> 8) >> 3;
            var3 = this.field3208.field4286 - (class222.field3329 * this.field3208.field4288 >> 8) >> 3;
        } else {
            var2 = this.field3208.field4281 - (class222.field3329 * this.field3208.field4288 >> 8) >> 3;
            var3 = this.field3208.field4286 - (class222.field3329 * this.field3208.field4284 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class222.field3336 > 0) {
            var4 = this.field3208.field4283 - (class222.field3336 * this.field3208.field4284 >> 8) >> 3;
            var5 = this.field3208.field4285 - (class222.field3336 * this.field3208.field4288 >> 8) >> 3;
        } else {
            var4 = this.field3208.field4283 - (class222.field3336 * this.field3208.field4288 >> 8) >> 3;
            var5 = this.field3208.field4285 - (class222.field3336 * this.field3208.field4284 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class234 var8;
        if (arg0 == null || arg0.field3528.length < var6 * var7) {
            var8 = new class234(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3719 = arg0.field3715 = var6;
            arg0.field3713 = arg0.field3716 = var7;
            arg0.method1745();
        }
        var8.field3708 = var2;
        var8.field3711 = var4;
        if (field3268.length < this.field3248) {
            field3268 = new int[this.field3248];
            field3263 = new int[this.field3248];
        }
        for (int var9 = 0; var9 < this.field3235; var9++) {
            int var10 = (this.field3244[var9] - (this.field3246[var9] * class222.field3329 >> 8) >> 3) - var2;
            int var11 = (this.field3214[var9] - (this.field3246[var9] * class222.field3336 >> 8) >> 3) - var4;
            int var12 = this.field3233[var9];
            int var13 = this.field3233[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3212[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3268[var15] = var10;
                field3263[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3250; var16++) {
            if (this.field3218[var16] <= 128) {
                short var17 = this.field3207[var16];
                short var18 = this.field3217[var16];
                short var19 = this.field3223[var16];
                int var20 = field3268[var17];
                int var21 = field3268[var18];
                int var22 = field3268[var19];
                int var23 = field3263[var17];
                int var24 = field3263[var18];
                int var25 = field3263[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class345.method2419(var8.field3528, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V", line = 1815)
    public final void method1090(int arg0) {
        int var2 = class345.field5339[arg0];
        int var3 = class345.field5343[arg0];
        for (int var4 = 0; var4 < this.field3228; var4++) {
            int var5 = this.field3246[var4] * var2 + this.field3244[var4] * var3 >> 16;
            this.field3246[var4] = this.field3246[var4] * var3 - this.field3244[var4] * var2 >> 16;
            this.field3244[var4] = var5;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IIIIZ)V", line = 1838)
    public final void method1084(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3258 = 0;
            field3259 = 0;
            field3265 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3224.length) {
                    int[] var14 = this.field3224[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3258 += this.field3244[var16];
                        field3259 += this.field3246[var16];
                        field3265 += this.field3214[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3258 = field3258 / var11 + var8;
                field3259 = field3259 / var11 + var9;
                field3265 = field3265 / var11 + var10;
            } else {
                field3258 = var8;
                field3259 = var9;
                field3265 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3224.length) {
                    int[] var22 = this.field3224[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3244[var24] += var17;
                        this.field3246[var24] += var18;
                        this.field3214[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3224.length) {
                    int[] var27 = this.field3224[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3244[var29] -= field3258;
                        this.field3246[var29] -= field3259;
                        this.field3214[var29] -= field3265;
                        if (arg4 != 0) {
                            int var30 = class345.field5339[arg4];
                            int var31 = class345.field5343[arg4];
                            int var32 = this.field3246[var29] * var30 + this.field3244[var29] * var31 + 32767 >> 16;
                            this.field3246[var29] = this.field3246[var29] * var31 + 32767 - this.field3244[var29] * var30 >> 16;
                            this.field3244[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class345.field5339[arg2];
                            int var34 = class345.field5343[arg2];
                            int var35 = this.field3246[var29] * var34 + 32767 - this.field3214[var29] * var33 >> 16;
                            this.field3214[var29] = this.field3246[var29] * var33 + this.field3214[var29] * var34 + 32767 >> 16;
                            this.field3246[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class345.field5339[arg3];
                            int var37 = class345.field5343[arg3];
                            int var38 = this.field3244[var29] * var37 + this.field3214[var29] * var36 + 32767 >> 16;
                            this.field3214[var29] = this.field3214[var29] * var37 + 32767 - this.field3244[var29] * var36 >> 16;
                            this.field3244[var29] = var38;
                        }
                        this.field3244[var29] += field3258;
                        this.field3246[var29] += field3259;
                        this.field3214[var29] += field3265;
                    }
                }
            }
            if (arg5 && this.field3239 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3224.length) {
                        int[] var41 = this.field3224[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3233[var43];
                            int var45 = this.field3233[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3212[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class345.field5339[arg4];
                                    int var49 = class345.field5343[arg4];
                                    int var50 = this.field3239[var47] * var49 + this.field3215[var47] * var48 + 32767 >> 16;
                                    this.field3215[var47] = (short) (this.field3215[var47] * var49 + 32767 - this.field3239[var47] * var48 >> 16);
                                    this.field3239[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class345.field5339[arg2];
                                    int var52 = class345.field5343[arg2];
                                    int var53 = this.field3215[var47] * var52 + 32767 - this.field3209[var47] * var51 >> 16;
                                    this.field3209[var47] = (short) (this.field3215[var47] * var51 + this.field3209[var47] * var52 + 32767 >> 16);
                                    this.field3215[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class345.field5339[arg3];
                                    int var55 = class345.field5343[arg3];
                                    int var56 = this.field3239[var47] * var55 + this.field3209[var47] * var54 + 32767 >> 16;
                                    this.field3209[var47] = (short) (this.field3209[var47] * var55 + 32767 - this.field3239[var47] * var54 >> 16);
                                    this.field3239[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3237 != null) {
                    this.field3237.field2640 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3224.length) {
                    int[] var59 = this.field3224[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3244[var61] -= field3258;
                        this.field3246[var61] -= field3259;
                        this.field3214[var61] -= field3265;
                        this.field3244[var61] = this.field3244[var61] * arg2 >> 7;
                        this.field3246[var61] = this.field3246[var61] * arg3 >> 7;
                        this.field3214[var61] = this.field3214[var61] * arg4 >> 7;
                        this.field3244[var61] += field3258;
                        this.field3246[var61] += field3259;
                        this.field3214[var61] += field3265;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3243 != null && this.field3218 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field3243.length) {
                        int[] var64 = this.field3243[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field3218[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field3218[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field3251.field2640 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3243 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field3243.length) {
                    int[] var70 = this.field3243[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field3226[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field3226[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field3251.field2640 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZZZZZZZ)Lhi;", line = 2249)
    public final class218 method1585(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class218 var12 = new class218();
        var12.field3228 = this.field3228;
        var12.field3235 = this.field3235;
        var12.field3248 = this.field3248;
        var12.field3250 = this.field3250;
        if (arg0) {
            var12.field3244 = this.field3244;
            var12.field3214 = this.field3214;
        } else {
            var12.field3244 = class213.method1535(this.field3244, false);
            var12.field3214 = class213.method1535(this.field3214, false);
        }
        if (arg1) {
            var12.field3246 = this.field3246;
        } else {
            var12.field3246 = class213.method1535(this.field3246, false);
        }
        if (arg0 && arg1) {
            var12.field3222 = this.field3222;
            var12.field3208 = this.field3208;
        } else {
            var12.field3222 = new class184();
            var12.field3208 = new class282();
        }
        if (arg2) {
            var12.field3226 = this.field3226;
        } else {
            var12.field3226 = class65.method541(this.field3226, 0);
        }
        if (arg3) {
            var12.field3218 = this.field3218;
        } else {
            var12.field3218 = class273.method2001((byte) -20, this.field3218);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class98.field1379) {
            var12.field3251 = new class184();
        } else {
            var12.field3251 = this.field3251;
        }
        if (arg5) {
            var12.field3239 = this.field3239;
            var12.field3215 = this.field3215;
            var12.field3209 = this.field3209;
            var12.field3238 = this.field3238;
        } else {
            var12.field3239 = class65.method541(this.field3239, 0);
            var12.field3215 = class65.method541(this.field3215, 0);
            var12.field3209 = class65.method541(this.field3209, 0);
            var12.field3238 = class65.method541(this.field3238, 0);
        }
        if (!class98.field1379) {
            var12.field3237 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3237 = this.field3237;
        } else {
            var12.field3237 = new class184();
        }
        if (arg8) {
            var12.field3221 = this.field3221;
            var12.field3249 = this.field3249;
            var12.field3211 = this.field3211;
        } else {
            var12.field3221 = class127.method942(72, this.field3221);
            var12.field3249 = class127.method942(92, this.field3249);
            var12.field3211 = new class184();
        }
        if (arg9) {
            var12.field3207 = this.field3207;
            var12.field3217 = this.field3217;
            var12.field3223 = this.field3223;
            var12.field3236 = this.field3236;
        } else {
            var12.field3207 = class65.method541(this.field3207, 0);
            var12.field3217 = class65.method541(this.field3217, 0);
            var12.field3223 = class65.method541(this.field3223, 0);
            var12.field3236 = new class184();
        }
        if (arg10) {
            var12.field3230 = this.field3230;
        } else {
            var12.field3230 = class65.method541(this.field3230, 0);
        }
        var12.field3229 = this.field3229;
        var12.field3224 = this.field3224;
        var12.field3234 = this.field3234;
        var12.field3243 = this.field3243;
        var12.field3220 = this.field3220;
        var12.field3212 = this.field3212;
        var12.field3233 = this.field3233;
        var12.field3232 = this.field3232;
        var12.field3242 = this.field3242;
        var12.field3216 = this.field3216;
        var12.field3241 = this.field3241;
        var12.field3227 = this.field3227;
        var12.field3219 = this.field3219;
        return var12;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)Z", line = 2391)
    private final boolean method1586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "()V", line = 2409)
    public final void method1071() {
        for (int var1 = 0; var1 < this.field3228; var1++) {
            this.field3244[var1] = this.field3244[var1] + 7 >> 4;
            this.field3246[var1] = this.field3246[var1] + 7 >> 4;
            this.field3214[var1] = this.field3214[var1] + 7 >> 4;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ltk;IJIIIIFF)S", line = 2423)
    private final short method1587(class46 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3233[arg1];
        int var12 = this.field3233[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3212[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3245[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3212[var13] = (short) (this.field3248 + 1);
        field3245[var13] = arg2;
        this.field3239[this.field3248] = (short) arg3;
        this.field3215[this.field3248] = (short) arg4;
        this.field3209[this.field3248] = (short) arg5;
        this.field3238[this.field3248] = (short) arg6;
        this.field3221[this.field3248] = arg7;
        this.field3249[this.field3248] = arg8;
        return (short) (this.field3248++);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIFFF)[F", line = 2459)
    private static final float[] method1588(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "()I", line = 2525)
    public final int method1088() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4285;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZZZZZ)V", line = 2532)
    public final void method1589(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3231 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3248 != 0) {
            if (arg6) {
                boolean var8 = !this.field3251.field2640 && (arg1 || arg2 && !class98.field1379);
                this.method1580(false, !this.field3222.field2640 && arg0, var8, this.field3237 != null && !this.field3237.field2640 && arg2, !this.field3211.field2640 && arg3);
                if (!this.field3236.field2640 && arg4 && arg1) {
                    this.method1573();
                }
            }
            if (arg0) {
                if (this.field3222.field2640) {
                    if (!this.field3208.field4282) {
                        this.method1599();
                    }
                    this.field3244 = null;
                    this.field3246 = null;
                    this.field3214 = null;
                    this.field3212 = null;
                    this.field3233 = null;
                } else {
                    this.field3213 = (byte) (this.field3213 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3251.field2640) {
                    this.field3226 = null;
                    this.field3218 = null;
                } else {
                    this.field3213 = (byte) (this.field3213 | 0x2);
                }
            }
            if (arg2 && class98.field1379) {
                if (this.field3237.field2640) {
                    this.field3239 = null;
                    this.field3215 = null;
                    this.field3209 = null;
                    this.field3238 = null;
                } else {
                    this.field3213 = (byte) (this.field3213 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3211.field2640) {
                    this.field3221 = null;
                    this.field3249 = null;
                } else {
                    this.field3213 = (byte) (this.field3213 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3236.field2640 && this.field3251.field2640) {
                    this.field3207 = null;
                    this.field3217 = null;
                    this.field3223 = null;
                } else {
                    this.field3213 = (byte) (this.field3213 | 0x10);
                }
            }
            if (arg5) {
                this.field3229 = null;
                this.field3234 = null;
                this.field3224 = (int[][]) null;
                this.field3243 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "()I", line = 2628)
    public final int method1590() {
        return this.field3232;
    }

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "()I", line = 2631)
    public final int method1086() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4287;
    }

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "()V", line = 2638)
    private final void method1591() {
        GL var1 = class141.field2025;
        if (this.field3250 == 0) {
            return;
        }
        if (this.field3231 != 0) {
            this.method1580(true, !this.field3222.field2640 && (this.field3231 & 0x1) != 0, !this.field3251.field2640 && (this.field3231 & 0x2) != 0, this.field3237 != null && !this.field3237.field2640 && (this.field3231 & 0x4) != 0, false);
        }
        this.method1580(false, !this.field3222.field2640, !this.field3251.field2640, this.field3237 != null && !this.field3237.field2640, !this.field3211.field2640);
        if (!this.field3236.field2640) {
            this.method1573();
        }
        if (this.field3213 != 0) {
            if ((this.field3213 & 0x1) != 0) {
                this.field3244 = null;
                this.field3246 = null;
                this.field3214 = null;
                this.field3212 = null;
                this.field3233 = null;
            }
            if ((this.field3213 & 0x2) != 0) {
                this.field3226 = null;
                this.field3218 = null;
            }
            if ((this.field3213 & 0x4) != 0) {
                this.field3239 = null;
                this.field3215 = null;
                this.field3209 = null;
                this.field3238 = null;
            }
            if ((this.field3213 & 0x8) != 0) {
                this.field3221 = null;
                this.field3249 = null;
            }
            if ((this.field3213 & 0x10) != 0) {
                this.field3207 = null;
                this.field3217 = null;
                this.field3223 = null;
            }
            this.field3213 = 0;
        }
        class115 var2 = null;
        if (this.field3222.field2643 != null) {
            this.field3222.field2643.method861();
            var2 = this.field3222.field2643;
            var1.glVertexPointer(3, 5126, this.field3222.field2641, (long) this.field3222.field2639);
        }
        if (this.field3251.field2643 != null) {
            if (this.field3251.field2643 != var2) {
                this.field3251.field2643.method861();
                var2 = this.field3251.field2643;
            }
            var1.glColorPointer(4, 5121, this.field3251.field2641, (long) this.field3251.field2639);
        }
        if (class98.field1379 && this.field3237.field2643 != null) {
            if (this.field3237.field2643 != var2) {
                this.field3237.field2643.method861();
                var2 = this.field3237.field2643;
            }
            var1.glNormalPointer(5126, this.field3237.field2641, (long) this.field3237.field2639);
        }
        if (this.field3211.field2643 != null) {
            if (this.field3211.field2643 != var2) {
                this.field3211.field2643.method861();
                class115 var3 = this.field3211.field2643;
            }
            var1.glTexCoordPointer(2, 5126, this.field3211.field2641, (long) this.field3211.field2639);
        }
        if (this.field3236.field2643 != null) {
            this.field3236.field2643.method863();
        }
        if (this.field3222.field2643 == null || this.field3251.field2643 == null || class98.field1379 && this.field3237.field2643 == null || this.field3211.field2643 == null) {
            if (class141.field2032) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3222.field2643 == null) {
                this.field3222.field2645.position(this.field3222.field2639);
                var1.glVertexPointer(3, 5126, this.field3222.field2641, this.field3222.field2645);
            }
            if (this.field3251.field2643 == null) {
                this.field3251.field2645.position(this.field3251.field2639);
                var1.glColorPointer(4, 5121, this.field3251.field2641, this.field3251.field2645);
            }
            if (class98.field1379 && this.field3237.field2643 == null) {
                this.field3237.field2645.position(this.field3237.field2639);
                var1.glNormalPointer(5126, this.field3237.field2641, this.field3237.field2645);
            }
            if (this.field3211.field2643 == null) {
                this.field3211.field2645.position(this.field3211.field2639);
                var1.glTexCoordPointer(2, 5126, this.field3211.field2641, this.field3211.field2645);
            }
        }
        if (this.field3236.field2643 == null && class141.field2032) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3220.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3220[var5];
            int var7 = this.field3220[var5 + 1];
            short var8 = this.field3230[var6];
            if (var8 == -1) {
                class141.method1000(-1);
                class2.method9(0, 10691, 0);
            } else {
                class345.field5336.method583(var8 & 0xFFFF, 64);
            }
            if (this.field3236.field2643 == null) {
                this.field3236.field2645.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3236.field2645);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ISIB)I", line = 2810)
    private static final int method1592(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class345.field5349[class317.method2221(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class345.field5336.method581(arg1 & 0xFFFF, (byte) -89);
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
            int var9 = class345.field5336.method592(arg1 & 0xFFFF, -70);
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

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 4552)
    private class218() {
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ltk;IIZ)V", line = 4558)
    public class218(class46 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field672];
        this.field3233 = new int[arg0.field656 + 1];
        for (int var6 = 0; var6 < arg0.field672; var6++) {
            if ((arg0.field667 == null || arg0.field667[var6] != 2) && (arg0.field663 == null || arg0.field663[var6] == -1 || !class345.field5336.method576(255, arg0.field663[var6] & 0xFFFF))) {
                var5[this.field3250++] = var6;
                this.field3233[arg0.field671[var6]]++;
                this.field3233[arg0.field687[var6]]++;
                this.field3233[arg0.field681[var6]]++;
            }
        }
        long[] var7 = new long[this.field3250];
        for (int var8 = 0; var8 < this.field3250; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field663 != null) {
                var14 = arg0.field663[var9];
                if (var14 != -1) {
                    var12 = class345.field5336.method586(var14 & 0xFFFF, 13078);
                    var13 = class345.field5336.method564(1, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field653 != null && arg0.field653[var9] != 0 || var14 != -1 && !class345.field5336.method578(127, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field655 != null) {
                var10 += arg0.field655[var9] << 17;
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
        class41.method306(-1, var7, var5);
        this.field3228 = arg0.field656;
        this.field3235 = arg0.field674;
        this.field3244 = arg0.field693;
        this.field3246 = arg0.field703;
        this.field3214 = arg0.field650;
        this.field3229 = arg0.field699;
        this.field3227 = arg0.field700;
        this.field3216 = arg0.field662;
        this.field3241 = arg0.field664;
        int var20 = this.field3250 * 3;
        this.field3239 = new short[var20];
        this.field3215 = new short[var20];
        this.field3209 = new short[var20];
        this.field3238 = new short[var20];
        this.field3221 = new float[var20];
        this.field3249 = new float[var20];
        this.field3226 = new short[this.field3250];
        this.field3218 = new byte[this.field3250];
        this.field3207 = new short[this.field3250];
        this.field3217 = new short[this.field3250];
        this.field3223 = new short[this.field3250];
        this.field3230 = new short[this.field3250];
        if (arg0.field697 != null) {
            this.field3234 = new byte[this.field3250];
        }
        if (arg0.field684 != null) {
            this.field3219 = new short[this.field3250];
        }
        this.field3208 = new class282();
        this.field3222 = new class184();
        this.field3251 = new class184();
        if (class98.field1379) {
            this.field3237 = new class184();
        }
        this.field3211 = new class184();
        this.field3236 = new class184();
        this.field3232 = (short) arg1;
        this.field3242 = (short) arg2;
        this.field3212 = new short[var20];
        field3245 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field3235; var22++) {
            int var23 = this.field3233[var22];
            this.field3233[var22] = var21;
            var21 += var23;
        }
        this.field3233[this.field3235] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field677 != null) {
            int var28 = arg0.field657;
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
            for (int var36 = 0; var36 < this.field3250; var36++) {
                int var37 = var5[var36];
                if (arg0.field677[var37] != -1) {
                    int var38 = arg0.field677[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field671[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field687[var37];
                        } else {
                            var40 = arg0.field681[var37];
                        }
                        int var41 = arg0.field693[var40];
                        int var42 = arg0.field703[var40];
                        int var43 = arg0.field650[var40];
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
                byte var45 = arg0.field686[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field692[var44];
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
                        var49 = 64.0F / (float) (arg0.field685[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field692[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field685[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field659[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field692[var44] / 1024.0F;
                        var49 = (float) arg0.field685[var44] / 1024.0F;
                        var48 = (float) arg0.field659[var44] / 1024.0F;
                    }
                    var27[var44] = method1588(arg0.field701[var44], arg0.field679[var44], arg0.field658[var44], arg0.field691[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3250; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field670[var51] & 0xFFFF;
            short var53;
            if (arg0.field663 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field663[var51];
            }
            int var54;
            if (arg0.field677 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field677[var51];
            }
            int var55;
            if (arg0.field653 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field653[var51] & 0xFF;
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
                    byte var65 = arg0.field686[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field671[var51];
                        int var67 = arg0.field687[var51];
                        int var68 = arg0.field681[var51];
                        short var69 = arg0.field701[var54];
                        short var70 = arg0.field679[var54];
                        short var71 = arg0.field658[var54];
                        float var72 = (float) arg0.field693[var69];
                        float var73 = (float) arg0.field703[var69];
                        float var74 = (float) arg0.field650[var69];
                        float var75 = (float) arg0.field693[var70] - var72;
                        float var76 = (float) arg0.field703[var70] - var73;
                        float var77 = (float) arg0.field650[var70] - var74;
                        float var78 = (float) arg0.field693[var71] - var72;
                        float var79 = (float) arg0.field703[var71] - var73;
                        float var80 = (float) arg0.field650[var71] - var74;
                        float var81 = (float) arg0.field693[var66] - var72;
                        float var82 = (float) arg0.field703[var66] - var73;
                        float var83 = (float) arg0.field650[var66] - var74;
                        float var84 = (float) arg0.field693[var67] - var72;
                        float var85 = (float) arg0.field703[var67] - var73;
                        float var86 = (float) arg0.field650[var67] - var74;
                        float var87 = (float) arg0.field693[var68] - var72;
                        float var88 = (float) arg0.field703[var68] - var73;
                        float var89 = (float) arg0.field650[var68] - var74;
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
                        int var101 = arg0.field671[var51];
                        int var102 = arg0.field687[var51];
                        int var103 = arg0.field681[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field678[var54];
                        float var109 = (float) arg0.field696[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field659[var54] & 0xFFFF) / 1024.0F;
                            method1600(arg0.field693[var101], arg0.field703[var101], arg0.field650[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3269;
                            var57 = field3261;
                            method1600(arg0.field693[var102], arg0.field703[var102], arg0.field650[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3269;
                            var59 = field3261;
                            method1600(arg0.field693[var103], arg0.field703[var103], arg0.field650[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3269;
                            var61 = field3261;
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
                            float var112 = (float) arg0.field695[var54] / 256.0F;
                            float var113 = (float) arg0.field668[var54] / 256.0F;
                            int var114 = arg0.field693[var102] - arg0.field693[var101];
                            int var115 = arg0.field703[var102] - arg0.field703[var101];
                            int var116 = arg0.field650[var102] - arg0.field650[var101];
                            int var117 = arg0.field693[var103] - arg0.field693[var101];
                            int var118 = arg0.field703[var103] - arg0.field703[var101];
                            int var119 = arg0.field650[var103] - arg0.field650[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field692[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field685[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field659[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1598(var126, var127, var128);
                            method1575(arg0.field693[var101], arg0.field703[var101], arg0.field650[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3267;
                            var57 = field3266;
                            method1575(arg0.field693[var102], arg0.field703[var102], arg0.field650[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3267;
                            var59 = field3266;
                            method1575(arg0.field693[var103], arg0.field703[var103], arg0.field650[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3267;
                            var61 = field3266;
                        } else if (var65 == 3) {
                            method1570(arg0.field693[var101], arg0.field703[var101], arg0.field650[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3264;
                            var57 = field3262;
                            method1570(arg0.field693[var102], arg0.field703[var102], arg0.field650[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3264;
                            var59 = field3262;
                            method1570(arg0.field693[var103], arg0.field703[var103], arg0.field650[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3264;
                            var61 = field3262;
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
            arg0.method382();
            byte var129;
            if (arg0.field667 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field667[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field671[var51];
                class232 var133 = arg0.field680[var132];
                this.field3207[var50] = this.method1587(arg0, var132, var130, var133.field3506, var133.field3502, var133.field3507, var133.field3500, var56, var57);
                int var134 = arg0.field687[var51];
                class232 var135 = arg0.field680[var134];
                this.field3217[var50] = this.method1587(arg0, var134, (long) var62 + var130, var135.field3506, var135.field3502, var135.field3507, var135.field3500, var58, var59);
                int var136 = arg0.field681[var51];
                class232 var137 = arg0.field680[var136];
                this.field3223[var50] = this.method1587(arg0, var136, (long) var63 + var130, var137.field3506, var137.field3502, var137.field3507, var137.field3500, var60, var61);
            } else if (var129 == 1) {
                class62 var138 = arg0.field673[var51];
                long var139 = (long) ((var54 << 2) + (var138.field912 > 0 ? 1024 : 2048) + (var138.field908 + 256 << 12) + (var138.field903 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3207[var50] = this.method1587(arg0, arg0.field671[var51], var139, var138.field912, var138.field908, var138.field903, 0, var56, var57);
                this.field3217[var50] = this.method1587(arg0, arg0.field687[var51], (long) var62 + var139, var138.field912, var138.field908, var138.field903, 0, var58, var59);
                this.field3223[var50] = this.method1587(arg0, arg0.field681[var51], (long) var63 + var139, var138.field912, var138.field908, var138.field903, 0, var60, var61);
            }
            if (arg0.field663 == null) {
                this.field3230[var50] = -1;
            } else {
                this.field3230[var50] = arg0.field663[var51];
            }
            if (this.field3234 != null) {
                this.field3234[var50] = (byte) arg0.field697[var51];
            }
            this.field3226[var50] = arg0.field670[var51];
            if (arg0.field653 != null) {
                this.field3218[var50] = arg0.field653[var51];
            }
            if (arg0.field684 != null) {
                this.field3219[var50] = arg0.field684[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3250; var143++) {
            short var144 = this.field3230[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3220 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3250; var147++) {
            short var148 = this.field3230[var147];
            if (var146 != var148) {
                this.field3220[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3220[var145] = this.field3250;
        field3245 = null;
        this.field3239 = method1581(this.field3239, this.field3248);
        this.field3215 = method1581(this.field3215, this.field3248);
        this.field3209 = method1581(this.field3209, this.field3248);
        this.field3238 = method1581(this.field3238, this.field3248);
        this.field3221 = method1569(this.field3221, this.field3248);
        this.field3249 = method1569(this.field3249, this.field3248);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIJ)V", line = 2873)
    public final void method1085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field3248 == 0) {
            return;
        }
        GL var10 = class141.field2025;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1591();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZZLhi;Lhi;)Lhc;", line = 2896)
    private final class151 method1593(boolean arg0, boolean arg1, boolean arg2, class218 arg3, class218 arg4) {
        arg3.field3228 = this.field3228;
        arg3.field3235 = this.field3235;
        arg3.field3248 = this.field3248;
        arg3.field3250 = this.field3250;
        arg3.field3232 = this.field3232;
        arg3.field3242 = this.field3242;
        arg3.field3231 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field3244 == null || arg3.field3244.length < this.field3228) {
            arg3.field3244 = new int[this.field3228 + 100];
            arg3.field3246 = new int[this.field3228 + 100];
            arg3.field3214 = new int[this.field3228 + 100];
        }
        for (int var6 = 0; var6 < this.field3228; var6++) {
            arg3.field3244[var6] = this.field3244[var6];
            arg3.field3246[var6] = this.field3246[var6];
            arg3.field3214[var6] = this.field3214[var6];
        }
        if (arg3.field3222 == null) {
            arg3.field3222 = new class184();
        }
        arg3.field3222.field2640 = false;
        if (arg3.field3208 == null) {
            arg3.field3208 = new class282();
        }
        arg3.field3208.field4282 = false;
        if (arg0) {
            arg3.field3218 = this.field3218;
        } else {
            if (arg4.field3218 == null || arg4.field3218.length < this.field3250) {
                arg4.field3218 = new byte[this.field3250 + 100];
            }
            arg3.field3218 = arg4.field3218;
            for (int var7 = 0; var7 < this.field3250; var7++) {
                arg3.field3218[var7] = this.field3218[var7];
            }
        }
        if (arg1) {
            arg3.field3226 = this.field3226;
        } else {
            if (arg4.field3226 == null || arg4.field3226.length < this.field3250) {
                arg4.field3226 = new short[this.field3250 + 100];
            }
            arg3.field3226 = arg4.field3226;
            for (int var8 = 0; var8 < this.field3250; var8++) {
                arg3.field3226[var8] = this.field3226[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field3251 = this.field3251;
        } else {
            if (arg4.field3251 == null) {
                arg4.field3251 = new class184();
            }
            arg3.field3251 = arg4.field3251;
            arg3.field3251.field2640 = false;
        }
        if (arg2 || this.field3239 == null) {
            arg3.field3239 = this.field3239;
            arg3.field3215 = this.field3215;
            arg3.field3209 = this.field3209;
            arg3.field3238 = this.field3238;
            arg3.field3237 = this.field3237;
        } else {
            if (arg4.field3239 == null || arg4.field3239.length < this.field3248) {
                arg4.field3239 = new short[this.field3248 + 100];
                arg4.field3215 = new short[this.field3248 + 100];
                arg4.field3209 = new short[this.field3248 + 100];
                arg4.field3238 = new short[this.field3248 + 100];
            }
            arg3.field3239 = arg4.field3239;
            arg3.field3215 = arg4.field3215;
            arg3.field3209 = arg4.field3209;
            arg3.field3238 = arg4.field3238;
            for (int var9 = 0; var9 < this.field3248; var9++) {
                arg3.field3239[var9] = this.field3239[var9];
                arg3.field3215[var9] = this.field3215[var9];
                arg3.field3209[var9] = this.field3209[var9];
                arg3.field3238[var9] = this.field3238[var9];
            }
            if (class98.field1379) {
                if (arg4.field3237 == null) {
                    arg4.field3237 = new class184();
                }
                arg3.field3237 = arg4.field3237;
                arg3.field3237.field2640 = false;
            } else {
                arg3.field3237 = null;
            }
        }
        arg3.field3221 = this.field3221;
        arg3.field3249 = this.field3249;
        arg3.field3229 = this.field3229;
        arg3.field3224 = this.field3224;
        arg3.field3207 = this.field3207;
        arg3.field3217 = this.field3217;
        arg3.field3223 = this.field3223;
        arg3.field3230 = this.field3230;
        arg3.field3234 = this.field3234;
        arg3.field3243 = this.field3243;
        arg3.field3211 = this.field3211;
        arg3.field3236 = this.field3236;
        arg3.field3220 = this.field3220;
        arg3.field3212 = this.field3212;
        arg3.field3233 = this.field3233;
        arg3.field2188 = this.field2188;
        arg3.field3227 = this.field3227;
        arg3.field3219 = this.field3219;
        arg3.field3216 = this.field3216;
        arg3.field3241 = this.field3241;
        return arg3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(SS)V", line = 3054)
    public final void method1594(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3250; var3++) {
            if (this.field3226[var3] == arg0) {
                this.field3226[var3] = arg1;
            }
        }
        this.field3251.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)V", line = 3068)
    public final void method1091(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3228; var4++) {
            this.field3244[var4] += arg0;
            this.field3246[var4] += arg1;
            this.field3214[var4] += arg2;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "()V", line = 3088)
    public final void method1595() {
        int var10002;
        if (this.field3229 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3228; var3++) {
                int var4 = this.field3229[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3224 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3224[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3228) {
                int var7 = this.field3229[var6] & 0xFF;
                this.field3224[var7][var1[var7]++] = var6++;
            }
            this.field3229 = null;
        }
        if (this.field3234 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3250; var10++) {
            int var11 = this.field3234[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3243 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3243[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3250) {
            int var14 = this.field3234[var13] & 0xFF;
            this.field3243[var14][var8[var14]++] = var13++;
        }
        this.field3234 = null;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()V", line = 3188)
    public final void method1069() {
        for (int var1 = 0; var1 < this.field3228; var1++) {
            this.field3244[var1] = -this.field3244[var1];
            this.field3214[var1] = -this.field3214[var1];
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)V", line = 3202)
    public final void method1596(int arg0) {
        this.field3232 = (short) arg0;
        this.field3251.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()Z", line = 3206)
    public final boolean method390() {
        return this.field3240 && this.field3244 != null && this.field3239 != null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[IIIIZI[I)V", line = 3211)
    public final void method1072(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field3258 = 0;
            field3259 = 0;
            field3265 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3224.length) {
                    int[] var16 = this.field3224[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3227 == null || (arg6 & this.field3227[var18]) != 0) {
                            field3258 += this.field3244[var18];
                            field3259 += this.field3246[var18];
                            field3265 += this.field3214[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field3258 = field3258 / var13 + var10;
                field3259 = field3259 / var13 + var11;
                field3265 = field3265 / var13 + var12;
                field3260 = true;
            } else {
                field3258 = var10;
                field3259 = var11;
                field3265 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3224.length) {
                    int[] var27 = this.field3224[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3227 == null || (arg6 & this.field3227[var29]) != 0) {
                            this.field3244[var29] += var22;
                            this.field3246[var29] += var23;
                            this.field3214[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field3224.length) {
                        int[] var92 = this.field3224[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field3227 == null || (arg6 & this.field3227[var94]) != 0) {
                                this.field3244[var94] -= field3258;
                                this.field3246[var94] -= field3259;
                                this.field3214[var94] -= field3265;
                                if (arg4 != 0) {
                                    int var95 = class345.field5339[arg4];
                                    int var96 = class345.field5343[arg4];
                                    int var97 = this.field3246[var94] * var95 + this.field3244[var94] * var96 + 32767 >> 16;
                                    this.field3246[var94] = this.field3246[var94] * var96 + 32767 - this.field3244[var94] * var95 >> 16;
                                    this.field3244[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class345.field5339[arg2];
                                    int var99 = class345.field5343[arg2];
                                    int var100 = this.field3246[var94] * var99 + 32767 - this.field3214[var94] * var98 >> 16;
                                    this.field3214[var94] = this.field3246[var94] * var98 + this.field3214[var94] * var99 + 32767 >> 16;
                                    this.field3246[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class345.field5339[arg3];
                                    int var102 = class345.field5343[arg3];
                                    int var103 = this.field3244[var94] * var102 + this.field3214[var94] * var101 + 32767 >> 16;
                                    this.field3214[var94] = this.field3214[var94] * var102 + 32767 - this.field3244[var94] * var101 >> 16;
                                    this.field3244[var94] = var103;
                                }
                                this.field3244[var94] += field3258;
                                this.field3246[var94] += field3259;
                                this.field3214[var94] += field3265;
                            }
                        }
                    }
                }
                if (arg5 && this.field3239 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field3224.length) {
                            int[] var106 = this.field3224[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field3227 == null || (arg6 & this.field3227[var108]) != 0) {
                                    int var109 = this.field3233[var108];
                                    int var110 = this.field3233[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field3212[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class345.field5339[arg4];
                                            int var114 = class345.field5343[arg4];
                                            int var115 = this.field3239[var112] * var114 + this.field3215[var112] * var113 + 32767 >> 16;
                                            this.field3215[var112] = (short) (this.field3215[var112] * var114 + 32767 - this.field3239[var112] * var113 >> 16);
                                            this.field3239[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class345.field5339[arg2];
                                            int var117 = class345.field5343[arg2];
                                            int var118 = this.field3215[var112] * var117 + 32767 - this.field3209[var112] * var116 >> 16;
                                            this.field3209[var112] = (short) (this.field3215[var112] * var116 + this.field3209[var112] * var117 + 32767 >> 16);
                                            this.field3215[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class345.field5339[arg3];
                                            int var120 = class345.field5343[arg3];
                                            int var121 = this.field3239[var112] * var120 + this.field3209[var112] * var119 + 32767 >> 16;
                                            this.field3209[var112] = (short) (this.field3209[var112] * var120 + 32767 - this.field3239[var112] * var119 >> 16);
                                            this.field3239[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3237 != null) {
                        this.field3237.field2640 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field3260) {
                    int var36 = arg7[6] * field3265 + arg7[0] * field3258 + arg7[3] * field3259 + 16384 >> 15;
                    int var37 = arg7[7] * field3265 + arg7[1] * field3258 + arg7[4] * field3259 + 16384 >> 15;
                    int var38 = arg7[8] * field3265 + arg7[2] * field3258 + arg7[5] * field3259 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field3258 = var39;
                    field3259 = var40;
                    field3265 = var41;
                    field3260 = false;
                }
                int[] var42 = new int[9];
                int var43 = class345.field5343[arg2] >> 1;
                int var44 = class345.field5339[arg2] >> 1;
                int var45 = class345.field5343[arg3] >> 1;
                int var46 = class345.field5339[arg3] >> 1;
                int var47 = class345.field5343[arg4] >> 1;
                int var48 = class345.field5339[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field3265 + var42[0] * -field3258 + var42[1] * -field3259 + 16384 >> 15;
                int var52 = var42[5] * -field3265 + var42[3] * -field3258 + var42[4] * -field3259 + 16384 >> 15;
                int var53 = var42[8] * -field3265 + var42[6] * -field3258 + var42[7] * -field3259 + 16384 >> 15;
                int var54 = field3258 + var51;
                int var55 = field3259 + var52;
                int var56 = field3265 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field3224.length) {
                        int[] var81 = this.field3224[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field3227 == null || (arg6 & this.field3227[var83]) != 0) {
                                int var84 = this.field3214[var83] * var68[2] + this.field3246[var83] * var68[1] + this.field3244[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field3214[var83] * var68[5] + this.field3246[var83] * var68[4] + this.field3244[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field3214[var83] * var68[8] + this.field3246[var83] * var68[7] + this.field3244[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field3244[var83] = var87;
                                this.field3246[var83] = var88;
                                this.field3214[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3224.length) {
                        int[] var174 = this.field3224[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3227 == null || (arg6 & this.field3227[var176]) != 0) {
                                this.field3244[var176] -= field3258;
                                this.field3246[var176] -= field3259;
                                this.field3214[var176] -= field3265;
                                this.field3244[var176] = this.field3244[var176] * arg2 >> 7;
                                this.field3246[var176] = this.field3246[var176] * arg3 >> 7;
                                this.field3214[var176] = this.field3214[var176] * arg4 >> 7;
                                this.field3244[var176] += field3258;
                                this.field3246[var176] += field3259;
                                this.field3214[var176] += field3265;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field3260) {
                    int var128 = arg7[6] * field3265 + arg7[0] * field3258 + arg7[3] * field3259 + 16384 >> 15;
                    int var129 = arg7[7] * field3265 + arg7[1] * field3258 + arg7[4] * field3259 + 16384 >> 15;
                    int var130 = arg7[8] * field3265 + arg7[2] * field3258 + arg7[5] * field3259 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field3258 = var131;
                    field3259 = var132;
                    field3265 = var133;
                    field3260 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field3258 * var134 + 16384 >> 15;
                int var138 = -field3259 * var135 + 16384 >> 15;
                int var139 = -field3265 * var136 + 16384 >> 15;
                int var140 = field3258 + var137;
                int var141 = field3259 + var138;
                int var142 = field3265 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field3224.length) {
                        int[] var163 = this.field3224[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field3227 == null || (arg6 & this.field3227[var165]) != 0) {
                                int var166 = this.field3214[var165] * var150[2] + this.field3246[var165] * var150[1] + this.field3244[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field3214[var165] * var150[5] + this.field3246[var165] * var150[4] + this.field3244[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field3214[var165] * var150[8] + this.field3246[var165] * var150[7] + this.field3244[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field3244[var165] = var169;
                                this.field3246[var165] = var170;
                                this.field3214[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3243 != null && this.field3218 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field3243.length) {
                        int[] var179 = this.field3243[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field3219 == null || (arg6 & this.field3219[var181]) != 0) {
                                int var182 = (this.field3218[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field3218[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field3251.field2640 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3243 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field3243.length) {
                    int[] var185 = this.field3243[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field3219 == null || (arg6 & this.field3219[var187]) != 0) {
                            int var188 = this.field3226[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field3226[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field3251.field2640 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 4002)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        if (this.field3248 == 0) {
            return;
        }
        if (!this.field3208.field4282) {
            this.method1599();
        }
        short var13 = this.field3208.field4287;
        short var14 = this.field3208.field4288;
        short var15 = this.field3208.field4284;
        if (arg10 != null) {
            arg10.method1115(arg0, arg9, arg5, arg6, arg7);
        }
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class16.field277) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class320.field4815) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class92.field1289) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class279.field4240) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class345.field5339[arg0];
            var27 = class345.field5343[arg0];
        }
        if (arg8 > 0L && class76.field1118 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class108.field1557 >= var28 && class108.field1557 <= var29 && class56.field825 >= var30 && class56.field825 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field3208.field4281;
                short var37 = this.field3208.field4286;
                short var38 = this.field3208.field4283;
                short var39 = this.field3208.field4285;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class108.field1557 >= var32 && class108.field1557 <= var33 && class56.field825 >= var34 && class56.field825 <= var35) {
                    if (this.field2188) {
                        class95.field1327[class192.field2799++] = arg8;
                    } else {
                        if (field3268.length < this.field3248) {
                            field3268 = new int[this.field3248];
                            field3263 = new int[this.field3248];
                        }
                        int var59 = 0;
                        label124: while (true) {
                            if (var59 >= this.field3235) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field3250) {
                                        break label124;
                                    }
                                    short var80 = this.field3207[var79];
                                    short var81 = this.field3217[var79];
                                    short var82 = this.field3223[var79];
                                    if (this.method1586(class108.field1557, class56.field825, field3263[var80], field3263[var81], field3263[var82], field3268[var80], field3268[var81], field3268[var82])) {
                                        class95.field1327[class192.field2799++] = arg8;
                                        break label124;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field3244[var59];
                            int var61 = this.field3246[var59];
                            int var62 = this.field3214[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field3233[var59];
                            int var76 = this.field3233[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field3212[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field3268[var78] = var73;
                                field3263[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class141.field2025;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1591();
        var83.glPopMatrix();
        if (arg10 != null) {
            arg10.method1112(arg0, arg1, arg2, arg3, arg4, arg9, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(ZZZ)Lhc;", line = 4284)
    public final class151 method1082(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1593(arg0, arg1, arg2, field3255, field3254);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(ZZZ)Lhc;", line = 4288)
    public final class151 method1083(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1593(arg0, arg1, arg2, field3253, field3252);
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "()I", line = 4293)
    public final int method1078() {
        if (!this.field3208.field4282) {
            this.method1599();
        }
        return this.field3208.field4284;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(SS)V", line = 4302)
    public final void method1597(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3250; var3++) {
            if (this.field3230[var3] == arg0) {
                this.field3230[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class345.field5336.method581(arg0 & 0xFFFF, (byte) -78);
            var5 = class345.field5336.method592(arg0 & 0xFFFF, -98);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class345.field5336.method581(arg1 & 0xFFFF, (byte) -4);
            var7 = class345.field5336.method592(arg1 & 0xFFFF, -73);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3251.field2640 = false;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V", line = 4338)
    public final void method1089(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3228; var4++) {
            this.field3244[var4] = this.field3244[var4] * arg0 >> 7;
            this.field3246[var4] = this.field3246[var4] * arg1 >> 7;
            this.field3214[var4] = this.field3214[var4] * arg2 >> 7;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(FFF)I", line = 4355)
    private static final int method1598(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()V", line = 4391)
    public final void method1070() {
        for (int var1 = 0; var1 < this.field3228; var1++) {
            int var2 = this.field3214[var1];
            this.field3214[var1] = this.field3244[var1];
            this.field3244[var1] = -var2;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "()V", line = 4408)
    public final void method1092() {
        for (int var1 = 0; var1 < this.field3228; var1++) {
            int var2 = this.field3244[var1];
            this.field3244[var1] = this.field3214[var1];
            this.field3214[var1] = -var2;
        }
        this.field3208.field4282 = false;
        this.field3222.field2640 = false;
    }

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "()V", line = 4427)
    private final void method1599() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3235; var9++) {
            int var10 = this.field3244[var9];
            int var11 = this.field3246[var9];
            int var12 = this.field3214[var9];
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
        this.field3208.field4281 = (short) var1;
        this.field3208.field4286 = (short) var4;
        this.field3208.field4288 = (short) var2;
        this.field3208.field4284 = (short) var5;
        this.field3208.field4283 = (short) var3;
        this.field3208.field4285 = (short) var6;
        this.field3208.field4287 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3208.field4282 = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII[FFIF)V", line = 4496)
    private static final void method1600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field3269 = var16;
        field3261 = var17;
    }
}
