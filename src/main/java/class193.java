import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class193 extends class227 {

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public int field3137 = 0;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "B")
    private byte field3142 = 0;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    private int field3150 = 0;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Z")
    public boolean field3151 = false;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "B")
    private byte field3164 = 0;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    private int field3169 = 0;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "[I")
    private int[] field3153;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[I")
    public int[] field3136;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
    public int[] field3134;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "[I")
    public int[] field3161;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[I")
    private int[] field3154;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "[S")
    private short[] field3167;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "[S")
    private short[] field3139;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[S")
    private short[] field3138;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "[S")
    private short[] field3155;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[F")
    private float[] field3146;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[F")
    private float[] field3143;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "[S")
    private short[] field3166;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[B")
    private byte[] field3144;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "[S")
    private short[] field3152;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[S")
    private short[] field3132;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "[S")
    private short[] field3149;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "[S")
    private short[] field3160;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[B")
    private byte[] field3157;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Lka;")
    public class178 field3165;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lhb;")
    public class32 field3131;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "Lhb;")
    private class32 field3147;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lhb;")
    private class32 field3141;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lhb;")
    private class32 field3135;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "Lhb;")
    private class32 field3145;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "S")
    private short field3158;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "S")
    private short field3148;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "[S")
    private short[] field3156;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "[I")
    private int[] field3163;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "Lpb;")
    private static class70 field3168 = new class70(10000);

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "Lbg;")
    private static class193 field3170 = new class193();

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "Lbg;")
    private static class193 field3173 = new class193();

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "Lbg;")
    private static class193 field3174 = new class193();

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "Lbg;")
    private static class193 field3175 = new class193();

    @OriginalMember(owner = "client!bg", name = "ob", descriptor = "[I")
    private static int[] field3186 = new int[1];

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "[I")
    private static int[] field3182 = new int[1];

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "F")
    private static float field3176;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "F")
    private static float field3177;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "F")
    private static float field3178;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "F")
    private static float field3179;

    @OriginalMember(owner = "client!bg", name = "mb", descriptor = "F")
    private static float field3184;

    @OriginalMember(owner = "client!bg", name = "nb", descriptor = "F")
    private static float field3185;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "I")
    private static int field3180;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "I")
    private static int field3181;

    @OriginalMember(owner = "client!bg", name = "lb", descriptor = "I")
    private static int field3183;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lhj;")
    private class28 field3140;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lnf;")
    private class61 field3133;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3172;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "[J")
    private static long[] field3159;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "[[I")
    private int[][] field3162;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "[[I")
    private int[][] field3171;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "()V", line = 5)
    public final void method1331() {
        if (this.field3167 == null) {
            this.method1356();
            return;
        }
        for (int var1 = 0; var1 < this.field3137; var1++) {
            int var2 = this.field3161[var1];
            this.field3161[var1] = this.field3136[var1];
            this.field3136[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3150; var3++) {
            short var4 = this.field3138[var3];
            this.field3138[var3] = this.field3167[var3];
            this.field3167[var3] = (short) (-var4);
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 45)
    public final void method1332() {
        for (int var1 = 0; var1 < this.field3137; var1++) {
            int var2 = this.field3136[var1];
            this.field3136[var1] = this.field3161[var1];
            this.field3161[var1] = -var2;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)V", line = 59)
    private final void method1333(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3183 = 0;
            field3180 = 0;
            field3181 = 0;
            for (int var6 = 0; var6 < this.field3137; var6++) {
                field3183 += this.field3136[var6];
                field3180 += this.field3134[var6];
                field3181 += this.field3161[var6];
                var5++;
            }
            if (var5 > 0) {
                field3183 = field3183 / var5 + arg1;
                field3180 = field3180 / var5 + arg2;
                field3181 = field3181 / var5 + arg3;
            } else {
                field3183 = arg1;
                field3180 = arg2;
                field3181 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3137; var7++) {
                this.field3136[var7] += arg1;
                this.field3134[var7] += arg2;
                this.field3161[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3137; var8++) {
                this.field3136[var8] -= field3183;
                this.field3134[var8] -= field3180;
                this.field3161[var8] -= field3181;
                if (arg3 != 0) {
                    int var9 = class283.field4877[arg3];
                    int var10 = class283.field4870[arg3];
                    int var11 = this.field3136[var8] * var10 + this.field3134[var8] * var9 + 32767 >> 16;
                    this.field3134[var8] = this.field3134[var8] * var10 + 32767 - this.field3136[var8] * var9 >> 16;
                    this.field3136[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class283.field4877[arg1];
                    int var13 = class283.field4870[arg1];
                    int var14 = this.field3134[var8] * var13 + 32767 - this.field3161[var8] * var12 >> 16;
                    this.field3161[var8] = this.field3161[var8] * var13 + this.field3134[var8] * var12 + 32767 >> 16;
                    this.field3134[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class283.field4877[arg2];
                    int var16 = class283.field4870[arg2];
                    int var17 = this.field3161[var8] * var15 + this.field3136[var8] * var16 + 32767 >> 16;
                    this.field3161[var8] = this.field3161[var8] * var16 + 32767 - this.field3136[var8] * var15 >> 16;
                    this.field3136[var8] = var17;
                }
                this.field3136[var8] += field3183;
                this.field3134[var8] += field3180;
                this.field3161[var8] += field3181;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3137; var18++) {
                this.field3136[var18] -= field3183;
                this.field3134[var18] -= field3180;
                this.field3161[var18] -= field3181;
                this.field3136[var18] = this.field3136[var18] * arg1 / 128;
                this.field3134[var18] = this.field3134[var18] * arg2 / 128;
                this.field3161[var18] = this.field3161[var18] * arg3 / 128;
                this.field3136[var18] += field3183;
                this.field3134[var18] += field3180;
                this.field3161[var18] += field3181;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3169; var19++) {
                int var20 = (this.field3144[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3144[var19] = (byte) var20;
            }
            this.field3147.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 214)
    public final void method1334(int arg0) {
        int var2 = class283.field4877[arg0];
        int var3 = class283.field4870[arg0];
        for (int var4 = 0; var4 < this.field3137; var4++) {
            int var5 = this.field3134[var4] * var3 - this.field3161[var4] * var2 >> 16;
            this.field3161[var4] = this.field3161[var4] * var3 + this.field3134[var4] * var2 >> 16;
            this.field3134[var4] = var5;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII[FFIF)V", line = 233)
    private static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field3184 = var16;
        field3179 = var17;
    }

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "()V", line = 279)
    public final void method1336() {
        for (int var1 = 0; var1 < this.field3137; var1++) {
            this.field3136[var1] = -this.field3136[var1];
            this.field3161[var1] = -this.field3161[var1];
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "()I", line = 292)
    public final int method1337() {
        return this.field3158;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "()I", line = 295)
    public final int method1338() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2910;
    }

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "()I", line = 304)
    public final int method1339() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2913;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V", line = 310)
    public final void method1340(int arg0) {
        if (this.field3167 == null) {
            this.method1349(arg0);
            return;
        }
        int var2 = class283.field4877[arg0];
        int var3 = class283.field4870[arg0];
        for (int var4 = 0; var4 < this.field3137; var4++) {
            int var5 = this.field3161[var4] * var2 + this.field3136[var4] * var3 >> 16;
            this.field3161[var4] = this.field3161[var4] * var3 - this.field3136[var4] * var2 >> 16;
            this.field3136[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3150; var6++) {
            int var7 = this.field3167[var6] * var3 + this.field3138[var6] * var2 >> 16;
            this.field3138[var6] = (short) (this.field3138[var6] * var3 - this.field3167[var6] * var2 >> 16);
            this.field3167[var6] = (short) var7;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "()V", line = 353)
    private final void method1341() {
        GL var1 = class281.field4839;
        if (this.field3169 == 0) {
            return;
        }
        if (this.field3164 != 0) {
            this.method1371(true, !this.field3131.field523 && (this.field3164 & 0x1) != 0, !this.field3147.field523 && (this.field3164 & 0x2) != 0, this.field3141 != null && !this.field3141.field523 && (this.field3164 & 0x4) != 0, false);
        }
        this.method1371(false, !this.field3131.field523, !this.field3147.field523, this.field3141 != null && !this.field3141.field523, !this.field3135.field523);
        if (!this.field3145.field523) {
            this.method1369();
        }
        if (this.field3142 != 0) {
            if ((this.field3142 & 0x1) != 0) {
                this.field3136 = null;
                this.field3134 = null;
                this.field3161 = null;
                this.field3156 = null;
                this.field3153 = null;
            }
            if ((this.field3142 & 0x2) != 0) {
                this.field3166 = null;
                this.field3144 = null;
            }
            if ((this.field3142 & 0x4) != 0) {
                this.field3167 = null;
                this.field3139 = null;
                this.field3138 = null;
                this.field3155 = null;
            }
            if ((this.field3142 & 0x8) != 0) {
                this.field3146 = null;
                this.field3143 = null;
            }
            if ((this.field3142 & 0x10) != 0) {
                this.field3152 = null;
                this.field3132 = null;
                this.field3149 = null;
            }
            this.field3142 = 0;
        }
        class28 var2 = null;
        if (this.field3131.field518 != null) {
            this.field3131.field518.method154();
            var2 = this.field3131.field518;
            var1.glVertexPointer(3, 5126, this.field3131.field522, (long) this.field3131.field510);
        }
        if (this.field3147.field518 != null) {
            if (this.field3147.field518 != var2) {
                this.field3147.field518.method154();
                var2 = this.field3147.field518;
            }
            var1.glColorPointer(4, 5121, this.field3147.field522, (long) this.field3147.field510);
        }
        if (class114.field1921 && this.field3141.field518 != null) {
            if (this.field3141.field518 != var2) {
                this.field3141.field518.method154();
                var2 = this.field3141.field518;
            }
            var1.glNormalPointer(5126, this.field3141.field522, (long) this.field3141.field510);
        }
        if (this.field3135.field518 != null) {
            if (this.field3135.field518 != var2) {
                this.field3135.field518.method154();
                class28 var3 = this.field3135.field518;
            }
            var1.glTexCoordPointer(2, 5126, this.field3135.field522, (long) this.field3135.field510);
        }
        if (this.field3145.field518 != null) {
            this.field3145.field518.method155();
        }
        if (this.field3131.field518 == null || this.field3147.field518 == null || class114.field1921 && this.field3141.field518 == null || this.field3135.field518 == null) {
            if (class281.field4820) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3131.field518 == null) {
                this.field3131.field516.position(this.field3131.field510);
                var1.glVertexPointer(3, 5126, this.field3131.field522, this.field3131.field516);
            }
            if (this.field3147.field518 == null) {
                this.field3147.field516.position(this.field3147.field510);
                var1.glColorPointer(4, 5121, this.field3147.field522, this.field3147.field516);
            }
            if (class114.field1921 && this.field3141.field518 == null) {
                this.field3141.field516.position(this.field3141.field510);
                var1.glNormalPointer(5126, this.field3141.field522, this.field3141.field516);
            }
            if (this.field3135.field518 == null) {
                this.field3135.field516.position(this.field3135.field510);
                var1.glTexCoordPointer(2, 5126, this.field3135.field522, this.field3135.field516);
            }
        }
        if (this.field3145.field518 == null && class281.field4820) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3163.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3163[var5];
            int var7 = this.field3163[var5 + 1];
            short var8 = this.field3160[var6];
            if (var8 == -1) {
                class281.method1953(-1);
                class256.method1795(0, 0, -536);
            } else {
                class283.field4866.method995(-13854, var8 & 0xFFFF);
            }
            if (this.field3145.field518 == null) {
                this.field3145.field516.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3145.field516);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILbg;[[I[[IIII)V", line = 524)
    public final void method1342(int arg0, int arg1, class193 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3165.field2907) {
            arg2.method1358();
        }
        int var9 = arg2.field3165.field2911 + arg5;
        int var10 = arg2.field3165.field2913 + arg5;
        int var11 = arg2.field3165.field2909 + arg7;
        int var12 = arg2.field3165.field2910 + arg7;
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
            for (int var17 = 0; var17 < this.field3137; var17++) {
                int var18 = this.field3136[var17] + arg5;
                int var19 = this.field3161[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3134[var17] = this.field3134[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3165.field2912;
            for (int var28 = 0; var28 < this.field3137; var28++) {
                int var29 = (this.field3134[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3136[var28] + arg5;
                    int var31 = this.field3161[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3134[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1573(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3165.field2908 - arg2.field3165.field2912;
            for (int var42 = 0; var42 < this.field3137; var42++) {
                int var43 = this.field3136[var42] + arg5;
                int var44 = this.field3161[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3134[var42] = var51 + this.field3134[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3165.field2908 - arg2.field3165.field2912;
            for (int var53 = 0; var53 < this.field3137; var53++) {
                int var54 = this.field3136[var53] + arg5;
                int var55 = this.field3161[var53] + arg7;
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
                this.field3134[var53] = ((this.field3134[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3131.field523 = false;
        this.field3165.field2907 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([FI)[F", line = 722)
    private static final float[] method1343(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class36.method215(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lmf;ILmf;I[IZ)V", line = 727)
    public final void method1344(class42 arg0, int arg1, class42 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1381(arg0, arg1, arg5);
            return;
        }
        class207 var7 = arg0.field664[arg1];
        class207 var8 = arg2.field664[arg3];
        class25 var9 = var7.field3556;
        for (int var10 = 0; var10 < this.field3137; var10++) {
            this.field3136[var10] <<= 0x4;
            this.field3134[var10] <<= 0x4;
            this.field3161[var10] <<= 0x4;
        }
        field3183 = 0;
        field3180 = 0;
        field3181 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field3550; var13++) {
            short var14 = var7.field3548[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field387[var14] == 0) {
                if (var7.field3552[var13] != -1) {
                    this.method1375(0, var9.field391[var7.field3552[var13]], 0, 0, 0, arg5);
                }
                this.method1375(var9.field387[var14], var9.field391[var14], var7.field3547[var13], var7.field3555[var13], var7.field3559[var13], arg5);
            }
        }
        field3183 = 0;
        field3180 = 0;
        field3181 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field3550; var17++) {
            short var18 = var8.field3548[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field387[var18] == 0) {
                if (var8.field3552[var17] != -1) {
                    this.method1375(0, var9.field391[var8.field3552[var17]], 0, 0, 0, arg5);
                }
                this.method1375(var9.field387[var18], var9.field391[var18], var8.field3547[var17], var8.field3555[var17], var8.field3559[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3137; var19++) {
            this.field3136[var19] >>= 0x4;
            this.field3134[var19] >>= 0x4;
            this.field3161[var19] >>= 0x4;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "()I", line = 822)
    public final int method1345() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2909;
    }

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "()V", line = 831)
    public final void method1346() {
        for (int var1 = 0; var1 < this.field3137; var1++) {
            this.field3161[var1] = -this.field3161[var1];
        }
        if (this.field3138 != null) {
            for (int var2 = 0; var2 < this.field3150; var2++) {
                this.field3138[var2] = (short) (-this.field3138[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3169; var3++) {
            short var4 = this.field3152[var3];
            this.field3152[var3] = this.field3149[var3];
            this.field3149[var3] = var4;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
        this.field3145.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "()V", line = 867)
    public final void method1347() {
        if (this.field3167 == null) {
            this.method1332();
            return;
        }
        for (int var1 = 0; var1 < this.field3137; var1++) {
            int var2 = this.field3136[var1];
            this.field3136[var1] = this.field3161[var1];
            this.field3161[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3150; var3++) {
            short var4 = this.field3167[var3];
            this.field3167[var3] = this.field3138[var3];
            this.field3138[var3] = (short) (-var4);
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "()V", line = 906)
    public final void method1348() {
        if (this.field3167 == null) {
            this.method1336();
            return;
        }
        for (int var1 = 0; var1 < this.field3137; var1++) {
            this.field3136[var1] = -this.field3136[var1];
            this.field3161[var1] = -this.field3161[var1];
        }
        for (int var2 = 0; var2 < this.field3150; var2++) {
            this.field3167[var2] = (short) (-this.field3167[var2]);
            this.field3138[var2] = (short) (-this.field3138[var2]);
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 940)
    public final void method1349(int arg0) {
        int var2 = class283.field4877[arg0];
        int var3 = class283.field4870[arg0];
        for (int var4 = 0; var4 < this.field3137; var4++) {
            int var5 = this.field3161[var4] * var2 + this.field3136[var4] * var3 >> 16;
            this.field3161[var4] = this.field3161[var4] * var3 - this.field3136[var4] * var2 >> 16;
            this.field3136[var4] = var5;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIJ)V", line = 959)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3150 == 0) {
            return;
        }
        if (!this.field3165.field2907) {
            this.method1358();
        }
        short var11 = this.field3165.field2906;
        short var12 = this.field3165.field2912;
        short var13 = this.field3165.field2908;
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
        if (var19 / var16 <= class298.field5095) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class261.field4430) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class95.field1637) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class295.field5067) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class283.field4877[arg0];
            var25 = class283.field4870[arg0];
        }
        if (arg8 > 0L && class82.field1323 && var17 > 0) {
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
            if (class92.field1585 >= var26 && class92.field1585 <= var27 && class112.field1891 >= var28 && class112.field1891 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3165.field2911;
                short var35 = this.field3165.field2913;
                short var36 = this.field3165.field2909;
                short var37 = this.field3165.field2910;
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
                if (class92.field1585 >= var30 && class92.field1585 <= var31 && class112.field1891 >= var32 && class112.field1891 <= var33) {
                    if (this.field3774) {
                        class294.field5042[class153.field2611++] = arg8;
                    } else {
                        if (field3186.length < this.field3150) {
                            field3186 = new int[this.field3150];
                            field3182 = new int[this.field3150];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3137) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3169) {
                                        break label118;
                                    }
                                    short var78 = this.field3152[var77];
                                    short var79 = this.field3132[var77];
                                    short var80 = this.field3149[var77];
                                    if (this.method1383(class92.field1585, class112.field1891, field3182[var78], field3182[var79], field3182[var80], field3186[var78], field3186[var79], field3186[var80])) {
                                        class294.field5042[class153.field2611++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3136[var57];
                            int var59 = this.field3134[var57];
                            int var60 = this.field3161[var57];
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
                            int var73 = this.field3153[var57];
                            int var74 = this.field3153[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3156[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3186[var76] = var71;
                                field3182[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class281.field4839;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1341();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "()I", line = 1228)
    public final int method1350() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2906;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(FFF)I", line = 1235)
    private static final int method1351(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(III)V", line = 1271)
    public final void method1352(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3137; var4++) {
            this.field3136[var4] = this.field3136[var4] * arg0 >> 7;
            this.field3134[var4] = this.field3134[var4] * arg1 >> 7;
            this.field3161[var4] = this.field3161[var4] * arg2 >> 7;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V", line = 1286)
    public final void method1353(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3137; var4++) {
            this.field3136[var4] += arg0;
            this.field3134[var4] += arg1;
            this.field3161[var4] += arg2;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Llb;IJIIIIFF)S", line = 1303)
    private final short method1354(class200 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3153[arg1];
        int var12 = this.field3153[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3156[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3159[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3156[var13] = (short) (this.field3150 + 1);
        field3159[var13] = arg2;
        this.field3167[this.field3150] = (short) arg3;
        this.field3139[this.field3150] = (short) arg4;
        this.field3138[this.field3150] = (short) arg5;
        this.field3155[this.field3150] = (short) arg6;
        this.field3146[this.field3150] = arg7;
        this.field3143[this.field3150] = arg8;
        return (short) (this.field3150++);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZLbg;Lbg;)Lof;", line = 1339)
    private final class227 method1355(boolean arg0, boolean arg1, class193 arg2, class193 arg3) {
        arg2.field3137 = this.field3137;
        arg2.field3150 = this.field3150;
        arg2.field3169 = this.field3169;
        arg2.field3158 = this.field3158;
        arg2.field3148 = this.field3148;
        arg2.field3164 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3136 == null || arg2.field3136.length < this.field3137) {
            arg2.field3136 = new int[this.field3137 + 100];
            arg2.field3134 = new int[this.field3137 + 100];
            arg2.field3161 = new int[this.field3137 + 100];
        }
        for (int var5 = 0; var5 < this.field3137; var5++) {
            arg2.field3136[var5] = this.field3136[var5];
            arg2.field3134[var5] = this.field3134[var5];
            arg2.field3161[var5] = this.field3161[var5];
        }
        if (arg2.field3131 == null) {
            arg2.field3131 = new class32();
        }
        arg2.field3131.field523 = false;
        if (arg2.field3165 == null) {
            arg2.field3165 = new class178();
        }
        arg2.field3165.field2907 = false;
        if (arg0) {
            arg2.field3144 = this.field3144;
            arg2.field3147 = this.field3147;
        } else {
            if (arg3.field3144 == null || arg3.field3144.length < this.field3169) {
                arg3.field3144 = new byte[this.field3169 + 100];
            }
            arg2.field3144 = arg3.field3144;
            for (int var6 = 0; var6 < this.field3169; var6++) {
                arg2.field3144[var6] = this.field3144[var6];
            }
            if (arg3.field3147 == null) {
                arg3.field3147 = new class32();
            }
            arg2.field3147 = arg3.field3147;
            arg2.field3147.field523 = false;
        }
        if (arg1) {
            arg2.field3167 = this.field3167;
            arg2.field3139 = this.field3139;
            arg2.field3138 = this.field3138;
            arg2.field3155 = this.field3155;
            arg2.field3141 = this.field3141;
        } else {
            if (arg3.field3167 == null || arg3.field3167.length < this.field3150) {
                arg3.field3167 = new short[this.field3150 + 100];
                arg3.field3139 = new short[this.field3150 + 100];
                arg3.field3138 = new short[this.field3150 + 100];
                arg3.field3155 = new short[this.field3150 + 100];
            }
            arg2.field3167 = arg3.field3167;
            arg2.field3139 = arg3.field3139;
            arg2.field3138 = arg3.field3138;
            arg2.field3155 = arg3.field3155;
            for (int var7 = 0; var7 < this.field3150; var7++) {
                arg2.field3167[var7] = this.field3167[var7];
                arg2.field3139[var7] = this.field3139[var7];
                arg2.field3138[var7] = this.field3138[var7];
                arg2.field3155[var7] = this.field3155[var7];
            }
            if (class114.field1921) {
                if (arg3.field3141 == null) {
                    arg3.field3141 = new class32();
                }
                arg2.field3141 = arg3.field3141;
                arg2.field3141.field523 = false;
            } else {
                arg2.field3141 = null;
            }
        }
        arg2.field3146 = this.field3146;
        arg2.field3143 = this.field3143;
        arg2.field3154 = this.field3154;
        arg2.field3171 = this.field3171;
        arg2.field3166 = this.field3166;
        arg2.field3152 = this.field3152;
        arg2.field3132 = this.field3132;
        arg2.field3149 = this.field3149;
        arg2.field3160 = this.field3160;
        arg2.field3157 = this.field3157;
        arg2.field3162 = this.field3162;
        arg2.field3135 = this.field3135;
        arg2.field3145 = this.field3145;
        arg2.field3163 = this.field3163;
        arg2.field3156 = this.field3156;
        arg2.field3153 = this.field3153;
        arg2.field3774 = this.field3774;
        return arg2;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 3736)
    private class193() {
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Llb;IIZ)V", line = 3738)
    public class193(class200 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3467];
        this.field3153 = new int[arg0.field3463 + 1];
        for (int var6 = 0; var6 < arg0.field3467; var6++) {
            if ((arg0.field3452 == null || arg0.field3452[var6] != 2) && (arg0.field3440 == null || arg0.field3440[var6] == -1 || !class283.field4866.method973((byte) 114, arg0.field3440[var6] & 0xFFFF))) {
                var5[this.field3169++] = var6;
                this.field3153[arg0.field3458[var6]]++;
                this.field3153[arg0.field3465[var6]]++;
                this.field3153[arg0.field3473[var6]]++;
            }
        }
        long[] var7 = new long[this.field3169];
        for (int var8 = 0; var8 < this.field3169; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3440 != null) {
                var14 = arg0.field3440[var9];
                if (var14 != -1) {
                    var12 = class283.field4866.method979(186, var14 & 0xFFFF);
                    var13 = class283.field4866.method989(var14 & 0xFFFF, (byte) -119);
                }
            }
            boolean var15 = arg0.field3462 != null && arg0.field3462[var9] != 0 || var14 != -1 && !class283.field4866.method980(-124, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field3456 != null) {
                var10 += arg0.field3456[var9] << 17;
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
        class97.method765((byte) 40, var5, var7);
        this.field3137 = arg0.field3463;
        this.field3136 = arg0.field3435;
        this.field3134 = arg0.field3442;
        this.field3161 = arg0.field3430;
        this.field3154 = arg0.field3437;
        int var20 = this.field3169 * 3;
        this.field3167 = new short[var20];
        this.field3139 = new short[var20];
        this.field3138 = new short[var20];
        this.field3155 = new short[var20];
        this.field3146 = new float[var20];
        this.field3143 = new float[var20];
        this.field3166 = new short[this.field3169];
        this.field3144 = new byte[this.field3169];
        this.field3152 = new short[this.field3169];
        this.field3132 = new short[this.field3169];
        this.field3149 = new short[this.field3169];
        this.field3160 = new short[this.field3169];
        if (arg0.field3451 != null) {
            this.field3157 = new byte[this.field3169];
        }
        this.field3165 = new class178();
        this.field3131 = new class32();
        this.field3147 = new class32();
        if (class114.field1921) {
            this.field3141 = new class32();
        }
        this.field3135 = new class32();
        this.field3145 = new class32();
        this.field3158 = (short) arg1;
        this.field3148 = (short) arg2;
        this.field3156 = new short[var20];
        field3159 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3463; var22++) {
            int var23 = this.field3153[var22];
            this.field3153[var22] = var21;
            var21 += var23;
        }
        this.field3153[arg0.field3463] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3477 != null) {
            int var28 = arg0.field3471;
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
            for (int var36 = 0; var36 < this.field3169; var36++) {
                int var37 = var5[var36];
                if (arg0.field3477[var37] != -1) {
                    int var38 = arg0.field3477[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3458[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3465[var37];
                        } else {
                            var40 = arg0.field3473[var37];
                        }
                        int var41 = arg0.field3435[var40];
                        int var42 = arg0.field3442[var40];
                        int var43 = arg0.field3430[var40];
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
                byte var45 = arg0.field3433[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3431[var44];
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
                        var49 = 64.0F / (float) (arg0.field3449[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3431[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3449[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3432[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3431[var44] / 1024.0F;
                        var49 = (float) arg0.field3449[var44] / 1024.0F;
                        var48 = (float) arg0.field3432[var44] / 1024.0F;
                    }
                    var27[var44] = method1370(arg0.field3445[var44], arg0.field3439[var44], arg0.field3455[var44], arg0.field3444[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3169; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3461[var51] & 0xFFFF;
            short var53;
            if (arg0.field3440 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3440[var51];
            }
            int var54;
            if (arg0.field3477 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3477[var51];
            }
            int var55;
            if (arg0.field3462 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3462[var51] & 0xFF;
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
                    byte var65 = arg0.field3433[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3458[var51];
                        int var67 = arg0.field3465[var51];
                        int var68 = arg0.field3473[var51];
                        short var69 = arg0.field3445[var54];
                        short var70 = arg0.field3439[var54];
                        short var71 = arg0.field3455[var54];
                        float var72 = (float) arg0.field3435[var69];
                        float var73 = (float) arg0.field3442[var69];
                        float var74 = (float) arg0.field3430[var69];
                        float var75 = (float) arg0.field3435[var70] - var72;
                        float var76 = (float) arg0.field3442[var70] - var73;
                        float var77 = (float) arg0.field3430[var70] - var74;
                        float var78 = (float) arg0.field3435[var71] - var72;
                        float var79 = (float) arg0.field3442[var71] - var73;
                        float var80 = (float) arg0.field3430[var71] - var74;
                        float var81 = (float) arg0.field3435[var66] - var72;
                        float var82 = (float) arg0.field3442[var66] - var73;
                        float var83 = (float) arg0.field3430[var66] - var74;
                        float var84 = (float) arg0.field3435[var67] - var72;
                        float var85 = (float) arg0.field3442[var67] - var73;
                        float var86 = (float) arg0.field3430[var67] - var74;
                        float var87 = (float) arg0.field3435[var68] - var72;
                        float var88 = (float) arg0.field3442[var68] - var73;
                        float var89 = (float) arg0.field3430[var68] - var74;
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
                        int var101 = arg0.field3458[var51];
                        int var102 = arg0.field3465[var51];
                        int var103 = arg0.field3473[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3474[var54];
                        float var109 = (float) arg0.field3448[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3432[var54] & 0xFFFF) / 1024.0F;
                            method1335(arg0.field3435[var101], arg0.field3442[var101], arg0.field3430[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3184;
                            var57 = field3179;
                            method1335(arg0.field3435[var102], arg0.field3442[var102], arg0.field3430[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3184;
                            var59 = field3179;
                            method1335(arg0.field3435[var103], arg0.field3442[var103], arg0.field3430[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3184;
                            var61 = field3179;
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
                            float var112 = (float) arg0.field3446[var54] / 256.0F;
                            float var113 = (float) arg0.field3457[var54] / 256.0F;
                            int var114 = arg0.field3435[var102] - arg0.field3435[var101];
                            int var115 = arg0.field3442[var102] - arg0.field3442[var101];
                            int var116 = arg0.field3430[var102] - arg0.field3430[var101];
                            int var117 = arg0.field3435[var103] - arg0.field3435[var101];
                            int var118 = arg0.field3442[var103] - arg0.field3442[var101];
                            int var119 = arg0.field3430[var103] - arg0.field3430[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3431[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3449[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3432[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1351(var126, var127, var128);
                            method1379(arg0.field3435[var101], arg0.field3442[var101], arg0.field3430[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3176;
                            var57 = field3178;
                            method1379(arg0.field3435[var102], arg0.field3442[var102], arg0.field3430[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3176;
                            var59 = field3178;
                            method1379(arg0.field3435[var103], arg0.field3442[var103], arg0.field3430[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3176;
                            var61 = field3178;
                        } else if (var65 == 3) {
                            method1366(arg0.field3435[var101], arg0.field3442[var101], arg0.field3430[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3185;
                            var57 = field3177;
                            method1366(arg0.field3435[var102], arg0.field3442[var102], arg0.field3430[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3185;
                            var59 = field3177;
                            method1366(arg0.field3435[var103], arg0.field3442[var103], arg0.field3430[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3185;
                            var61 = field3177;
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
            arg0.method1454();
            byte var129;
            if (arg0.field3452 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3452[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3458[var51];
                class205 var133 = arg0.field3475[var132];
                this.field3152[var50] = this.method1354(arg0, var132, var130, var133.field3517, var133.field3518, var133.field3520, var133.field3524, var56, var57);
                int var134 = arg0.field3465[var51];
                class205 var135 = arg0.field3475[var134];
                this.field3132[var50] = this.method1354(arg0, var134, (long) var62 + var130, var135.field3517, var135.field3518, var135.field3520, var135.field3524, var58, var59);
                int var136 = arg0.field3473[var51];
                class205 var137 = arg0.field3475[var136];
                this.field3149[var50] = this.method1354(arg0, var136, (long) var63 + var130, var137.field3517, var137.field3518, var137.field3520, var137.field3524, var60, var61);
            } else if (var129 == 1) {
                class147 var138 = arg0.field3472[var51];
                long var139 = (long) ((var54 << 2) + (var138.field2492 > 0 ? 1024 : 2048) + (var138.field2491 + 256 << 12) + (var138.field2495 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3152[var50] = this.method1354(arg0, arg0.field3458[var51], var139, var138.field2492, var138.field2491, var138.field2495, 0, var56, var57);
                this.field3132[var50] = this.method1354(arg0, arg0.field3465[var51], (long) var62 + var139, var138.field2492, var138.field2491, var138.field2495, 0, var58, var59);
                this.field3149[var50] = this.method1354(arg0, arg0.field3473[var51], (long) var63 + var139, var138.field2492, var138.field2491, var138.field2495, 0, var60, var61);
            }
            if (arg0.field3440 == null) {
                this.field3160[var50] = -1;
            } else {
                this.field3160[var50] = arg0.field3440[var51];
            }
            if (this.field3157 != null) {
                this.field3157[var50] = (byte) arg0.field3451[var51];
            }
            this.field3166[var50] = arg0.field3461[var51];
            if (arg0.field3462 != null) {
                this.field3144[var50] = arg0.field3462[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3169; var143++) {
            short var144 = this.field3160[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3163 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3169; var147++) {
            short var148 = this.field3160[var147];
            if (var146 != var148) {
                this.field3163[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3163[var145] = this.field3169;
        field3159 = null;
        this.field3167 = method1380(this.field3167, this.field3150);
        this.field3139 = method1380(this.field3139, this.field3150);
        this.field3138 = method1380(this.field3138, this.field3150);
        this.field3155 = method1380(this.field3155, this.field3150);
        this.field3146 = method1343(this.field3146, this.field3150);
        this.field3143 = method1343(this.field3143, this.field3150);
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "()V", line = 1469)
    public final void method1356() {
        for (int var1 = 0; var1 < this.field3137; var1++) {
            int var2 = this.field3161[var1];
            this.field3161[var1] = this.field3136[var1];
            this.field3136[var1] = -var2;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V", line = 1483)
    public final void method1357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3150 == 0) {
            return;
        }
        GL var8 = class281.field4839;
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
        this.method1341();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "()V", line = 1507)
    private final void method1358() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3137; var9++) {
            int var10 = this.field3136[var9];
            int var11 = this.field3134[var9];
            int var12 = this.field3161[var9];
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
        this.field3165.field2911 = (short) var1;
        this.field3165.field2913 = (short) var4;
        this.field3165.field2912 = (short) var2;
        this.field3165.field2908 = (short) var5;
        this.field3165.field2909 = (short) var3;
        this.field3165.field2910 = (short) var6;
        this.field3165.field2906 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3165.field2907 = true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lme;IIIZ)V", line = 1580)
    public final void method1261(class177 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class193 var6 = (class193) arg0;
        if (this.field3169 == 0 || var6.field3169 == 0) {
            return;
        }
        int var7 = var6.field3137;
        int[] var8 = var6.field3136;
        int[] var9 = var6.field3134;
        int[] var10 = var6.field3161;
        short[] var11 = var6.field3167;
        short[] var12 = var6.field3139;
        short[] var13 = var6.field3138;
        short[] var14 = var6.field3155;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3133 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3133.field947;
            var16 = this.field3133.field948;
            var17 = this.field3133.field945;
            var18 = this.field3133.field946;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3133 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3133.field947;
            var20 = var6.field3133.field948;
            var21 = var6.field3133.field945;
            var22 = var6.field3133.field946;
        }
        int[] var23 = var6.field3153;
        short[] var24 = var6.field3156;
        if (!var6.field3165.field2907) {
            var6.method1358();
        }
        short var25 = var6.field3165.field2912;
        short var26 = var6.field3165.field2908;
        short var27 = var6.field3165.field2911;
        short var28 = var6.field3165.field2913;
        short var29 = var6.field3165.field2909;
        short var30 = var6.field3165.field2910;
        for (int var31 = 0; var31 < this.field3137; var31++) {
            int var32 = this.field3134[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3136[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3161[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3153[var31];
                        int var37 = this.field3153[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3156[var38] - 1;
                            if (var35 == -1 || this.field3155[var35] != 0) {
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
                                            this.field3133 = new class61();
                                            var15 = this.field3133.field947 = class103.method796(7897, this.field3167);
                                            var16 = this.field3133.field948 = class103.method796(7897, this.field3139);
                                            var17 = this.field3133.field945 = class103.method796(7897, this.field3138);
                                            var18 = this.field3133.field946 = class103.method796(7897, this.field3155);
                                        }
                                        if (var19 == null) {
                                            class61 var44 = var6.field3133 = new class61();
                                            var19 = var44.field947 = class103.method796(7897, var11);
                                            var20 = var44.field948 = class103.method796(7897, var12);
                                            var21 = var44.field945 = class103.method796(7897, var13);
                                            var22 = var44.field946 = class103.method796(7897, var14);
                                        }
                                        short var45 = this.field3167[var35];
                                        short var46 = this.field3139[var35];
                                        short var47 = this.field3138[var35];
                                        short var48 = this.field3155[var35];
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
                                        int var57 = this.field3153[var31];
                                        int var58 = this.field3153[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3156[var59] - 1;
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

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "()I", line = 1817)
    public final int method1359() {
        return this.field3148;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZ)Lof;", line = 1820)
    public final class227 method1360(boolean arg0, boolean arg1) {
        return this.method1355(arg0, arg1, field3175, field3174);
    }

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "()V", line = 1824)
    public final void method1361() {
        int var10002;
        if (this.field3154 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3137; var3++) {
                int var4 = this.field3154[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3171 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3171[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3137) {
                int var7 = this.field3154[var6] & 0xFF;
                this.field3171[var7][var1[var7]++] = var6++;
            }
            this.field3154 = null;
        }
        if (this.field3157 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3169; var10++) {
            int var11 = this.field3157[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3162 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3162[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3169) {
            int var14 = this.field3157[var13] & 0xFF;
            this.field3162[var14][var8[var14]++] = var13++;
        }
        this.field3157 = null;
    }

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "()V", line = 1916)
    public static void method1362() {
        field3159 = null;
        field3168 = null;
        field3172 = null;
        field3170 = null;
        field3173 = null;
        field3174 = null;
        field3175 = null;
        field3186 = null;
        field3182 = null;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "()I", line = 1930)
    public final int method1363() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2911;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ISIB)I", line = 1938)
    private static final int method1364(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class283.field4865[class267.method1860(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class283.field4866.method986(arg1 & 0xFFFF, -127);
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
            int var9 = class283.field4866.method983(arg1 & 0xFFFF, 40);
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

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "()V", line = 1996)
    public static final void method1365() {
        field3170 = new class193();
        field3173 = new class193();
        field3174 = new class193();
        field3175 = new class193();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIII[FIF)V", line = 2002)
    private static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field3185 = var16;
        field3177 = var17;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(SS)V", line = 2048)
    public final void method1367(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3169; var3++) {
            if (this.field3160[var3] == arg0) {
                this.field3160[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class283.field4866.method986(arg0 & 0xFFFF, 84);
            var5 = class283.field4866.method983(arg0 & 0xFFFF, 40);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class283.field4866.method986(arg1 & 0xFFFF, -112);
            var7 = class283.field4866.method983(arg1 & 0xFFFF, 40);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3147.field523 = false;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ldm;)Ldm;", line = 2083)
    public final class273 method1368(class273 arg0) {
        if (this.field3150 == 0) {
            return null;
        }
        if (!this.field3165.field2907) {
            this.method1358();
        }
        int var2;
        int var3;
        if (class272.field4684 > 0) {
            var2 = this.field3165.field2911 - (class272.field4684 * this.field3165.field2908 >> 8) >> 3;
            var3 = this.field3165.field2913 - (class272.field4684 * this.field3165.field2912 >> 8) >> 3;
        } else {
            var2 = this.field3165.field2911 - (class272.field4684 * this.field3165.field2912 >> 8) >> 3;
            var3 = this.field3165.field2913 - (class272.field4684 * this.field3165.field2908 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class272.field4694 > 0) {
            var4 = this.field3165.field2909 - (class272.field4694 * this.field3165.field2908 >> 8) >> 3;
            var5 = this.field3165.field2910 - (class272.field4694 * this.field3165.field2912 >> 8) >> 3;
        } else {
            var4 = this.field3165.field2909 - (class272.field4694 * this.field3165.field2912 >> 8) >> 3;
            var5 = this.field3165.field2910 - (class272.field4694 * this.field3165.field2908 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class273 var8;
        if (arg0 == null || arg0.field4696.length < var6 * var7) {
            var8 = new class273(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field75 = arg0.field70 = var6;
            arg0.field73 = arg0.field74 = var7;
            arg0.method1909();
        }
        var8.field69 = var2;
        var8.field68 = var4;
        if (field3186.length < this.field3150) {
            field3186 = new int[this.field3150];
            field3182 = new int[this.field3150];
        }
        for (int var9 = 0; var9 < this.field3137; var9++) {
            int var10 = (this.field3136[var9] - (this.field3134[var9] * class272.field4684 >> 8) >> 3) - var2;
            int var11 = (this.field3161[var9] - (this.field3134[var9] * class272.field4694 >> 8) >> 3) - var4;
            int var12 = this.field3153[var9];
            int var13 = this.field3153[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3156[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3186[var15] = var10;
                field3182[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3169; var16++) {
            if (this.field3144[var16] <= 128) {
                short var17 = this.field3152[var16];
                short var18 = this.field3132[var16];
                short var19 = this.field3149[var16];
                int var20 = field3186[var17];
                int var21 = field3186[var18];
                int var22 = field3186[var19];
                int var23 = field3182[var17];
                int var24 = field3182[var18];
                int var25 = field3182[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class283.method2003(var8.field4696, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "()V", line = 2206)
    private final void method1369() {
        if (field3168.field1066.length < this.field3150 * 12) {
            field3168 = new class70((this.field3150 + 100) * 12);
        } else {
            field3168.field1068 = 0;
        }
        if (class281.field4816) {
            for (int var1 = 0; var1 < this.field3169; var1++) {
                field3168.method436(this.field3152[var1], -18820);
                field3168.method436(this.field3132[var1], -18820);
                field3168.method436(this.field3149[var1], -18820);
            }
        } else {
            for (int var2 = 0; var2 < this.field3169; var2++) {
                field3168.method450(this.field3152[var2], 119);
                field3168.method450(this.field3132[var2], -68);
                field3168.method450(this.field3149[var2], 118);
            }
        }
        if (!class281.field4820) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3168.field1068);
            var5.put(field3168.field1066, 0, field3168.field1068);
            var5.flip();
            this.field3145.field523 = true;
            this.field3145.field516 = var5;
            this.field3145.field518 = null;
            return;
        }
        class28 var3 = new class28();
        ByteBuffer var4 = ByteBuffer.wrap(field3168.field1066, 0, field3168.field1068);
        var3.method156(var4);
        this.field3145.field523 = true;
        this.field3145.field516 = null;
        this.field3145.field518 = var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIFFF)[F", line = 2265)
    private static final float[] method1370(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZZZZ)V", line = 2344)
    private final void method1371(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3131.field510 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3147.field510 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3141.field510 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3135.field510 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3168.field1066.length < this.field3150 * var6) {
            field3168 = new class70((this.field3150 + 100) * var6);
        } else {
            field3168.field1068 = 0;
        }
        if (arg1) {
            if (class281.field4816) {
                for (int var7 = 0; var7 < this.field3137; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3136[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3134[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3161[var7]);
                    int var11 = this.field3153[var7];
                    int var12 = this.field3153[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3156[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3168.field1068 = var6 * var14;
                        field3168.method436(var8, -18820);
                        field3168.method436(var9, -18820);
                        field3168.method436(var10, -18820);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3137; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3136[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3134[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3161[var15]);
                    int var19 = this.field3153[var15];
                    int var20 = this.field3153[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3156[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3168.field1068 = var6 * var22;
                        field3168.method450(var16, 118);
                        field3168.method450(var17, 0);
                        field3168.method450(var18, -51);
                    }
                }
            }
        }
        if (arg2) {
            if (class114.field1921) {
                for (int var42 = 0; var42 < this.field3169; var42++) {
                    int var43 = method1364(this.field3166[var42], this.field3160[var42], this.field3158, this.field3144[var42]);
                    field3168.field1068 = this.field3152[var42] * var6 + this.field3147.field510;
                    field3168.method436(var43, -18820);
                    field3168.field1068 = this.field3132[var42] * var6 + this.field3147.field510;
                    field3168.method436(var43, -18820);
                    field3168.field1068 = this.field3149[var42] * var6 + this.field3147.field510;
                    field3168.method436(var43, -18820);
                }
            } else {
                int var23 = (int) class272.field4683[0];
                int var24 = (int) class272.field4683[1];
                int var25 = (int) class272.field4683[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3158 * 1.3F);
                int var28 = this.field3148 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3169; var29++) {
                    short var30 = this.field3152[var29];
                    short var31 = this.field3155[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3138[var30] * var25 + this.field3167[var30] * var23 + this.field3139[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3138[var30] * var25 + this.field3167[var30] * var23 + this.field3139[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3155[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3132[var29];
                    short var34 = this.field3155[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3138[var33] * var25 + this.field3167[var33] * var23 + this.field3139[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3138[var33] * var25 + this.field3167[var33] * var23 + this.field3139[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3155[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3149[var29];
                    short var37 = this.field3155[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3138[var36] * var25 + this.field3167[var36] * var23 + this.field3139[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3138[var36] * var25 + this.field3167[var36] * var23 + this.field3139[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3155[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1364(this.field3166[var29], this.field3160[var29], var32, this.field3144[var29]);
                    int var40 = method1364(this.field3166[var29], this.field3160[var29], var35, this.field3144[var29]);
                    int var41 = method1364(this.field3166[var29], this.field3160[var29], var38, this.field3144[var29]);
                    field3168.field1068 = var6 * var30 + this.field3147.field510;
                    field3168.method436(var39, -18820);
                    field3168.field1068 = var6 * var33 + this.field3147.field510;
                    field3168.method436(var40, -18820);
                    field3168.field1068 = var6 * var36 + this.field3147.field510;
                    field3168.method436(var41, -18820);
                }
                this.field3167 = null;
                this.field3139 = null;
                this.field3138 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3148;
            float var45 = 3.0F / (float) (this.field3148 / 2 + this.field3148);
            field3168.field1068 = this.field3141.field510;
            if (class281.field4816) {
                for (int var46 = 0; var46 < this.field3150; var46++) {
                    short var47 = this.field3155[var46];
                    if (var47 == 0) {
                        field3168.method428((float) this.field3167[var46] * var45, (byte) -121);
                        field3168.method428((float) this.field3139[var46] * var45, (byte) -128);
                        field3168.method428((float) this.field3138[var46] * var45, (byte) -120);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3168.method428((float) this.field3167[var46] * var48, (byte) -126);
                        field3168.method428((float) this.field3139[var46] * var48, (byte) -124);
                        field3168.method428((float) this.field3138[var46] * var48, (byte) -119);
                    }
                    field3168.field1068 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3150; var49++) {
                    short var50 = this.field3155[var49];
                    if (var50 == 0) {
                        field3168.method475((byte) -61, (float) this.field3167[var49] * var45);
                        field3168.method475((byte) -61, (float) this.field3139[var49] * var45);
                        field3168.method475((byte) -61, (float) this.field3138[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3168.method475((byte) -61, (float) this.field3167[var49] * var51);
                        field3168.method475((byte) -61, (float) this.field3139[var49] * var51);
                        field3168.method475((byte) -61, (float) this.field3138[var49] * var51);
                    }
                    field3168.field1068 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3168.field1068 = this.field3135.field510;
            if (class281.field4816) {
                for (int var52 = 0; var52 < this.field3150; var52++) {
                    field3168.method428(this.field3146[var52], (byte) -126);
                    field3168.method428(this.field3143[var52], (byte) -128);
                    field3168.field1068 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3150; var53++) {
                    field3168.method475((byte) -61, this.field3146[var53]);
                    field3168.method475((byte) -61, this.field3143[var53]);
                    field3168.field1068 += var6 - 8;
                }
            }
        }
        field3168.field1068 = this.field3150 * var6;
        if (arg0) {
            if (class281.field4822) {
                ByteBuffer var54 = ByteBuffer.wrap(field3168.field1066, 0, field3168.field1068);
                if (this.field3140 == null) {
                    this.field3140 = new class28(true);
                    this.field3140.method156(var54);
                } else {
                    this.field3140.method153(var54);
                }
                if (arg1) {
                    this.field3131.field523 = true;
                    this.field3131.field516 = null;
                    this.field3131.field518 = this.field3140;
                    this.field3131.field522 = var6;
                }
                if (arg2) {
                    this.field3147.field523 = true;
                    this.field3147.field516 = null;
                    this.field3147.field518 = this.field3140;
                    this.field3147.field522 = var6;
                }
                if (arg3) {
                    this.field3141.field523 = true;
                    this.field3141.field516 = null;
                    this.field3141.field518 = this.field3140;
                    this.field3141.field522 = var6;
                }
                if (arg4) {
                    this.field3135.field523 = true;
                    this.field3135.field516 = null;
                    this.field3135.field518 = this.field3140;
                    this.field3135.field522 = var6;
                }
            } else {
                if (field3172 == null || field3172.capacity() < field3168.field1068) {
                    field3172 = ByteBuffer.allocateDirect(var6 * 100 + field3168.field1068);
                } else {
                    field3172.clear();
                }
                field3172.put(field3168.field1066, 0, field3168.field1068);
                field3172.flip();
                if (arg1) {
                    this.field3131.field523 = true;
                    this.field3131.field516 = field3172;
                    this.field3131.field518 = null;
                    this.field3131.field522 = var6;
                }
                if (arg2) {
                    this.field3147.field523 = true;
                    this.field3147.field516 = field3172;
                    this.field3131.field518 = null;
                    this.field3147.field522 = var6;
                }
                if (arg3) {
                    this.field3141.field523 = true;
                    this.field3141.field516 = field3172;
                    this.field3141.field518 = null;
                    this.field3141.field522 = var6;
                }
                if (arg4) {
                    this.field3135.field523 = true;
                    this.field3135.field516 = field3172;
                    this.field3135.field518 = null;
                    this.field3135.field522 = var6;
                }
            }
        } else if (class281.field4820) {
            class28 var55 = new class28();
            ByteBuffer var56 = ByteBuffer.wrap(field3168.field1066, 0, field3168.field1068);
            var55.method156(var56);
            if (arg1) {
                this.field3131.field523 = true;
                this.field3131.field516 = null;
                this.field3131.field518 = var55;
                this.field3131.field522 = var6;
            }
            if (arg2) {
                this.field3147.field523 = true;
                this.field3147.field516 = null;
                this.field3147.field518 = var55;
                this.field3147.field522 = var6;
            }
            if (arg3) {
                this.field3141.field523 = true;
                this.field3141.field516 = null;
                this.field3141.field518 = var55;
                this.field3141.field522 = var6;
            }
            if (arg4) {
                this.field3135.field523 = true;
                this.field3135.field516 = null;
                this.field3135.field518 = var55;
                this.field3135.field522 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3168.field1068);
            var57.put(field3168.field1066, 0, field3168.field1068);
            var57.flip();
            if (arg1) {
                this.field3131.field523 = true;
                this.field3131.field516 = var57;
                this.field3131.field518 = null;
                this.field3131.field522 = var6;
            }
            if (arg2) {
                this.field3147.field523 = true;
                this.field3147.field516 = var57;
                this.field3131.field518 = null;
                this.field3147.field522 = var6;
            }
            if (arg3) {
                this.field3141.field523 = true;
                this.field3141.field516 = var57;
                this.field3141.field518 = null;
                this.field3141.field522 = var6;
            }
            if (arg4) {
                this.field3135.field523 = true;
                this.field3135.field516 = var57;
                this.field3135.field518 = null;
                this.field3135.field522 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lme;", line = 2872)
    public final class177 method1263(int arg0, int arg1, int arg2) {
        this.field3151 = false;
        if (this.field3133 != null) {
            this.field3167 = this.field3133.field947;
            this.field3139 = this.field3133.field948;
            this.field3138 = this.field3133.field945;
            this.field3155 = this.field3133.field946;
            this.field3133 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V", line = 2885)
    public final void method1372(int arg0) {
        this.field3158 = (short) arg0;
        this.field3147.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZZ)Lof;", line = 2891)
    public final class227 method1373(boolean arg0, boolean arg1) {
        return this.method1355(arg0, arg1, field3173, field3170);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lmf;I)V", line = 2894)
    public final void method1374(class42 arg0, int arg1) {
        if (this.field3171 == null || arg1 == -1) {
            return;
        }
        class207 var3 = arg0.field664[arg1];
        class25 var4 = var3.field3556;
        field3183 = 0;
        field3180 = 0;
        field3181 = 0;
        for (int var5 = 0; var5 < var3.field3550; var5++) {
            short var6 = var3.field3548[var5];
            if (var4.field381[var6]) {
                if (var3.field3552[var5] != -1) {
                    this.method1333(0, 0, 0, 0);
                }
                this.method1333(var4.field387[var6], var3.field3547[var5], var3.field3555[var5], var3.field3559[var5]);
            }
        }
        this.field3131.field523 = false;
        this.field3165.field2907 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[IIIIZ)V", line = 2930)
    private final void method1375(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3183 = 0;
            field3180 = 0;
            field3181 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3171.length) {
                    int[] var14 = this.field3171[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3183 += this.field3136[var16];
                        field3180 += this.field3134[var16];
                        field3181 += this.field3161[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3183 = field3183 / var11 + var8;
                field3180 = field3180 / var11 + var9;
                field3181 = field3181 / var11 + var10;
            } else {
                field3183 = var8;
                field3180 = var9;
                field3181 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3171.length) {
                    int[] var22 = this.field3171[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3136[var24] += var17;
                        this.field3134[var24] += var18;
                        this.field3161[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3171.length) {
                    int[] var27 = this.field3171[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3136[var29] -= field3183;
                        this.field3134[var29] -= field3180;
                        this.field3161[var29] -= field3181;
                        if (arg4 != 0) {
                            int var30 = class283.field4877[arg4];
                            int var31 = class283.field4870[arg4];
                            int var32 = this.field3136[var29] * var31 + this.field3134[var29] * var30 + 32767 >> 16;
                            this.field3134[var29] = this.field3134[var29] * var31 + 32767 - this.field3136[var29] * var30 >> 16;
                            this.field3136[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class283.field4877[arg2];
                            int var34 = class283.field4870[arg2];
                            int var35 = this.field3134[var29] * var34 + 32767 - this.field3161[var29] * var33 >> 16;
                            this.field3161[var29] = this.field3161[var29] * var34 + this.field3134[var29] * var33 + 32767 >> 16;
                            this.field3134[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class283.field4877[arg3];
                            int var37 = class283.field4870[arg3];
                            int var38 = this.field3161[var29] * var36 + this.field3136[var29] * var37 + 32767 >> 16;
                            this.field3161[var29] = this.field3161[var29] * var37 + 32767 - this.field3136[var29] * var36 >> 16;
                            this.field3136[var29] = var38;
                        }
                        this.field3136[var29] += field3183;
                        this.field3134[var29] += field3180;
                        this.field3161[var29] += field3181;
                    }
                }
            }
            if (arg5 && this.field3167 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3171.length) {
                        int[] var41 = this.field3171[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3153[var43];
                            int var45 = this.field3153[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3156[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class283.field4877[arg4];
                                    int var49 = class283.field4870[arg4];
                                    int var50 = this.field3167[var47] * var49 + this.field3139[var47] * var48 + 32767 >> 16;
                                    this.field3139[var47] = (short) (this.field3139[var47] * var49 + 32767 - this.field3167[var47] * var48 >> 16);
                                    this.field3167[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class283.field4877[arg2];
                                    int var52 = class283.field4870[arg2];
                                    int var53 = this.field3139[var47] * var52 + 32767 - this.field3138[var47] * var51 >> 16;
                                    this.field3138[var47] = (short) (this.field3139[var47] * var51 + this.field3138[var47] * var52 + 32767 >> 16);
                                    this.field3139[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class283.field4877[arg3];
                                    int var55 = class283.field4870[arg3];
                                    int var56 = this.field3167[var47] * var55 + this.field3138[var47] * var54 + 32767 >> 16;
                                    this.field3138[var47] = (short) (this.field3138[var47] * var55 + 32767 - this.field3167[var47] * var54 >> 16);
                                    this.field3167[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3141 != null) {
                    this.field3141.field523 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3171.length) {
                    int[] var59 = this.field3171[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3136[var61] -= field3183;
                        this.field3134[var61] -= field3180;
                        this.field3161[var61] -= field3181;
                        this.field3136[var61] = this.field3136[var61] * arg2 >> 7;
                        this.field3134[var61] = this.field3134[var61] * arg3 >> 7;
                        this.field3161[var61] = this.field3161[var61] * arg4 >> 7;
                        this.field3136[var61] += field3183;
                        this.field3134[var61] += field3180;
                        this.field3161[var61] += field3181;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3162 != null && this.field3144 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3162.length) {
                    int[] var64 = this.field3162[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3144[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3144[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3147.field523 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()I", line = 3275)
    public final int method176() {
        if (!this.field3165.field2907) {
            this.method1358();
        }
        return this.field3165.field2912;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V", line = 3282)
    public final void method1376(int arg0) {
        int var2 = class283.field4877[arg0];
        int var3 = class283.field4870[arg0];
        for (int var4 = 0; var4 < this.field3137; var4++) {
            int var5 = this.field3136[var4] * var3 + this.field3134[var4] * var2 >> 16;
            this.field3134[var4] = this.field3134[var4] * var3 - this.field3136[var4] * var2 >> 16;
            this.field3136[var4] = var5;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(SS)V", line = 3303)
    public final void method1377(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3169; var3++) {
            if (this.field3166[var3] == arg0) {
                this.field3166[var3] = arg1;
            }
        }
        this.field3147.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZZZZZZZZZZ)Lbg;", line = 3319)
    public final class193 method1378(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class193 var12 = new class193();
        var12.field3137 = this.field3137;
        var12.field3150 = this.field3150;
        var12.field3169 = this.field3169;
        if (arg0) {
            var12.field3136 = this.field3136;
            var12.field3161 = this.field3161;
        } else {
            var12.field3136 = class153.method1125(this.field3136, (byte) 86);
            var12.field3161 = class153.method1125(this.field3161, (byte) 85);
        }
        if (arg1) {
            var12.field3134 = this.field3134;
        } else {
            var12.field3134 = class153.method1125(this.field3134, (byte) 112);
        }
        if (arg0 && arg1) {
            var12.field3131 = this.field3131;
            var12.field3165 = this.field3165;
        } else {
            var12.field3131 = new class32();
            var12.field3165 = new class178();
        }
        if (arg2) {
            var12.field3166 = this.field3166;
        } else {
            var12.field3166 = class103.method796(7897, this.field3166);
        }
        if (arg3) {
            var12.field3144 = this.field3144;
        } else {
            var12.field3144 = class255.method1788((byte) -128, this.field3144);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class114.field1921) {
            var12.field3147 = new class32();
        } else {
            var12.field3147 = this.field3147;
        }
        if (arg5) {
            var12.field3167 = this.field3167;
            var12.field3139 = this.field3139;
            var12.field3138 = this.field3138;
            var12.field3155 = this.field3155;
        } else {
            var12.field3167 = class103.method796(7897, this.field3167);
            var12.field3139 = class103.method796(7897, this.field3139);
            var12.field3138 = class103.method796(7897, this.field3138);
            var12.field3155 = class103.method796(7897, this.field3155);
        }
        if (!class114.field1921) {
            var12.field3141 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3141 = this.field3141;
        } else {
            var12.field3141 = new class32();
        }
        if (arg8) {
            var12.field3146 = this.field3146;
            var12.field3143 = this.field3143;
            var12.field3135 = this.field3135;
        } else {
            var12.field3146 = class155.method1144(this.field3146, true);
            var12.field3143 = class155.method1144(this.field3143, true);
            var12.field3135 = new class32();
        }
        if (arg9) {
            var12.field3152 = this.field3152;
            var12.field3132 = this.field3132;
            var12.field3149 = this.field3149;
            var12.field3145 = this.field3145;
        } else {
            var12.field3152 = class103.method796(7897, this.field3152);
            var12.field3132 = class103.method796(7897, this.field3132);
            var12.field3149 = class103.method796(7897, this.field3149);
            var12.field3145 = new class32();
        }
        if (arg10) {
            var12.field3160 = this.field3160;
        } else {
            var12.field3160 = class103.method796(7897, this.field3160);
        }
        var12.field3154 = this.field3154;
        var12.field3171 = this.field3171;
        var12.field3157 = this.field3157;
        var12.field3162 = this.field3162;
        var12.field3163 = this.field3163;
        var12.field3156 = this.field3156;
        var12.field3153 = this.field3153;
        var12.field3158 = this.field3158;
        var12.field3148 = this.field3148;
        return var12;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3462)
    private static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field3176 = var18;
        field3178 = var19;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()Z", line = 3540)
    public final boolean method1264() {
        return this.field3151 && this.field3136 != null && this.field3167 != null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([SI)[S", line = 3548)
    private static final short[] method1380(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class36.method219(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lmf;IZ)V", line = 3554)
    public final void method1381(class42 arg0, int arg1, boolean arg2) {
        if (this.field3171 == null || arg1 == -1) {
            return;
        }
        class207 var4 = arg0.field664[arg1];
        class25 var5 = var4.field3556;
        for (int var6 = 0; var6 < this.field3137; var6++) {
            this.field3136[var6] <<= 0x4;
            this.field3134[var6] <<= 0x4;
            this.field3161[var6] <<= 0x4;
        }
        field3183 = 0;
        field3180 = 0;
        field3181 = 0;
        for (int var7 = 0; var7 < var4.field3550; var7++) {
            short var8 = var4.field3548[var7];
            if (var4.field3552[var7] != -1) {
                this.method1375(0, var5.field391[var4.field3552[var7]], 0, 0, 0, arg2);
            }
            this.method1375(var5.field387[var8], var5.field391[var8], var4.field3547[var7], var4.field3555[var7], var4.field3559[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3137; var9++) {
            this.field3136[var9] >>= 0x4;
            this.field3134[var9] >>= 0x4;
            this.field3161[var9] >>= 0x4;
        }
        this.field3165.field2907 = false;
        this.field3131.field523 = false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZZZZZZ)V", line = 3607)
    public final void method1382(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3164 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3150 != 0) {
            if (arg6) {
                boolean var8 = !this.field3147.field523 && (arg1 || arg2 && !class114.field1921);
                this.method1371(false, !this.field3131.field523 && arg0, var8, this.field3141 != null && !this.field3141.field523 && arg2, !this.field3135.field523 && arg3);
                if (!this.field3145.field523 && arg4 && arg1) {
                    this.method1369();
                }
            }
            if (arg0) {
                if (this.field3131.field523) {
                    this.field3136 = null;
                    this.field3134 = null;
                    this.field3161 = null;
                    this.field3156 = null;
                    this.field3153 = null;
                } else {
                    this.field3142 = (byte) (this.field3142 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3147.field523) {
                    this.field3166 = null;
                    this.field3144 = null;
                } else {
                    this.field3142 = (byte) (this.field3142 | 0x2);
                }
            }
            if (arg2 && class114.field1921) {
                if (this.field3141.field523) {
                    this.field3167 = null;
                    this.field3139 = null;
                    this.field3138 = null;
                    this.field3155 = null;
                } else {
                    this.field3142 = (byte) (this.field3142 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3135.field523) {
                    this.field3146 = null;
                    this.field3143 = null;
                } else {
                    this.field3142 = (byte) (this.field3142 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3145.field523 && this.field3147.field523) {
                    this.field3152 = null;
                    this.field3132 = null;
                    this.field3149 = null;
                } else {
                    this.field3142 = (byte) (this.field3142 | 0x10);
                }
            }
            if (arg5) {
                this.field3154 = null;
                this.field3157 = null;
                this.field3171 = (int[][]) null;
                this.field3162 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)Z", line = 3719)
    private final boolean method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)V", line = 4484)
    public final void method1384(int arg0) {
        this.field3148 = (short) arg0;
        if (this.field3141 != null) {
            this.field3141.field523 = false;
        }
    }
}
