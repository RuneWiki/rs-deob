import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class206 extends class94 {

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
    public boolean field3212 = false;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    private int field3224 = 0;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public int field3214 = 0;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    private int field3231 = 0;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    private int field3226 = 0;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "B")
    private byte field3239 = 0;

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "B")
    private byte field3242 = 0;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "[I")
    private int[] field3236;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[I")
    public int[] field3215;

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "[I")
    public int[] field3233;

    @OriginalMember(owner = "client!pl", name = "gb", descriptor = "[I")
    private int[] field3252;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[S")
    private short[] field3210;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "[S")
    private short[] field3227;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "[S")
    private short[] field3241;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[S")
    private short[] field3218;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "[F")
    private float[] field3238;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "[F")
    private float[] field3244;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "[S")
    private short[] field3230;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "[B")
    private byte[] field3211;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "[S")
    private short[] field3216;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "[S")
    private short[] field3243;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "[S")
    private short[] field3225;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "[S")
    private short[] field3222;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "[B")
    private byte[] field3228;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[S")
    private short[] field3213;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "Lgj;")
    public class246 field3219;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Lwc;")
    public class112 field3209;

    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "Lwc;")
    private class112 field3248;

    @OriginalMember(owner = "client!pl", name = "fb", descriptor = "Lwc;")
    private class112 field3251;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "Lwc;")
    private class112 field3245;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Lwc;")
    private class112 field3208;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "S")
    private short field3232;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "S")
    private short field3217;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "[S")
    private short[] field3221;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "[I")
    private int[] field3235;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "Laj;")
    private static class1 field3220 = new class1(10000);

    @OriginalMember(owner = "client!pl", name = "eb", descriptor = "Lpl;")
    private static class206 field3250 = new class206();

    @OriginalMember(owner = "client!pl", name = "hb", descriptor = "Lpl;")
    private static class206 field3253 = new class206();

    @OriginalMember(owner = "client!pl", name = "ib", descriptor = "Lpl;")
    private static class206 field3254 = new class206();

    @OriginalMember(owner = "client!pl", name = "jb", descriptor = "Lpl;")
    private static class206 field3255 = new class206();

    @OriginalMember(owner = "client!pl", name = "kb", descriptor = "Lpl;")
    private static class206 field3256 = new class206();

    @OriginalMember(owner = "client!pl", name = "lb", descriptor = "Lpl;")
    private static class206 field3257 = new class206();

    @OriginalMember(owner = "client!pl", name = "ob", descriptor = "[I")
    private static int[] field3260 = new int[1];

    @OriginalMember(owner = "client!pl", name = "qb", descriptor = "Z")
    private static boolean field3262 = false;

    @OriginalMember(owner = "client!pl", name = "pb", descriptor = "[I")
    private static int[] field3261 = new int[1];

    @OriginalMember(owner = "client!pl", name = "mb", descriptor = "F")
    private static float field3258;

    @OriginalMember(owner = "client!pl", name = "nb", descriptor = "F")
    private static float field3259;

    @OriginalMember(owner = "client!pl", name = "rb", descriptor = "F")
    private static float field3263;

    @OriginalMember(owner = "client!pl", name = "sb", descriptor = "F")
    private static float field3264;

    @OriginalMember(owner = "client!pl", name = "ub", descriptor = "F")
    private static float field3266;

    @OriginalMember(owner = "client!pl", name = "xb", descriptor = "F")
    private static float field3269;

    @OriginalMember(owner = "client!pl", name = "tb", descriptor = "I")
    private static int field3265;

    @OriginalMember(owner = "client!pl", name = "vb", descriptor = "I")
    private static int field3267;

    @OriginalMember(owner = "client!pl", name = "wb", descriptor = "I")
    private static int field3268;

    @OriginalMember(owner = "client!pl", name = "db", descriptor = "Lvg;")
    private class279 field3249;

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "Ll;")
    private class312 field3237;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3240;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "[J")
    private static long[] field3229;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "[[I")
    private int[][] field3234;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "[[I")
    private int[][] field3247;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "()I", line = 5)
    public final int method758() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3674;
    }

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "()V", line = 12)
    public final void method1493() {
        if (this.field3227 == null) {
            this.method747();
            return;
        }
        for (int var1 = 0; var1 < this.field3214; var1++) {
            int var2 = this.field3233[var1];
            this.field3233[var1] = this.field3215[var1];
            this.field3215[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3224; var3++) {
            short var4 = this.field3241[var3];
            this.field3241[var3] = this.field3227[var3];
            this.field3227[var3] = (short) (-var4);
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lwk;)Lwk;", line = 49)
    public final class186 method1494(class186 arg0) {
        if (this.field3224 == 0) {
            return null;
        }
        if (!this.field3219.field3668) {
            this.method1503();
        }
        int var2;
        int var3;
        if (class261.field3881 > 0) {
            var2 = this.field3219.field3669 - (class261.field3881 * this.field3219.field3667 >> 8) >> 3;
            var3 = this.field3219.field3672 - (class261.field3881 * this.field3219.field3671 >> 8) >> 3;
        } else {
            var2 = this.field3219.field3669 - (class261.field3881 * this.field3219.field3671 >> 8) >> 3;
            var3 = this.field3219.field3672 - (class261.field3881 * this.field3219.field3667 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class261.field3882 > 0) {
            var4 = this.field3219.field3670 - (class261.field3882 * this.field3219.field3667 >> 8) >> 3;
            var5 = this.field3219.field3674 - (class261.field3882 * this.field3219.field3671 >> 8) >> 3;
        } else {
            var4 = this.field3219.field3670 - (class261.field3882 * this.field3219.field3671 >> 8) >> 3;
            var5 = this.field3219.field3674 - (class261.field3882 * this.field3219.field3667 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class186 var8;
        if (arg0 == null || arg0.field2939.length < var6 * var7) {
            var8 = new class186(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3066 = arg0.field3065 = var6;
            arg0.field3070 = arg0.field3064 = var7;
            arg0.method1355();
        }
        var8.field3063 = var2;
        var8.field3067 = var4;
        if (field3260.length < this.field3224) {
            field3260 = new int[this.field3224];
            field3261 = new int[this.field3224];
        }
        for (int var9 = 0; var9 < this.field3231; var9++) {
            int var10 = (this.field3215[var9] - (this.field3246[var9] * class261.field3881 >> 8) >> 3) - var2;
            int var11 = (this.field3233[var9] - (this.field3246[var9] * class261.field3882 >> 8) >> 3) - var4;
            int var12 = this.field3236[var9];
            int var13 = this.field3236[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3221[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3260[var15] = var10;
                field3261[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3226; var16++) {
            if (this.field3211[var16] <= 128) {
                short var17 = this.field3216[var16];
                short var18 = this.field3243[var16];
                short var19 = this.field3225[var16];
                int var20 = field3260[var17];
                int var21 = field3260[var18];
                int var22 = field3260[var19];
                int var23 = field3261[var17];
                int var24 = field3261[var18];
                int var25 = field3261[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class40.method356(var8.field2939, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)Z", line = 174)
    private final boolean method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII[FIF)V", line = 190)
    private static final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field3263 = var16;
        field3264 = var17;
    }

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "()I", line = 233)
    public final int method1497() {
        return this.field3217;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 4534)
    private class206() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lvi;IIZ)V", line = 4537)
    public class206(class7 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field172];
        this.field3236 = new int[arg0.field181 + 1];
        for (int var6 = 0; var6 < arg0.field172; var6++) {
            if ((arg0.field145 == null || arg0.field145[var6] != 2) && (arg0.field177 == null || arg0.field177[var6] == -1 || !class40.field614.method262(108, arg0.field177[var6] & 0xFFFF))) {
                var5[this.field3226++] = var6;
                this.field3236[arg0.field159[var6]]++;
                this.field3236[arg0.field191[var6]]++;
                this.field3236[arg0.field157[var6]]++;
            }
        }
        long[] var7 = new long[this.field3226];
        for (int var8 = 0; var8 < this.field3226; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field177 != null) {
                var14 = arg0.field177[var9];
                if (var14 != -1) {
                    var12 = class40.field614.method257(var14 & 0xFFFF, 255);
                    var13 = class40.field614.method260(var14 & 0xFFFF, (byte) -117);
                }
            }
            boolean var15 = arg0.field184 != null && arg0.field184[var9] != 0 || var14 != -1 && !class40.field614.method258(var14 & 0xFFFF, 100);
            if ((arg3 || var15) && arg0.field175 != null) {
                var10 += arg0.field175[var9] << 17;
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
        class11.method164(var5, var7, -27);
        this.field3214 = arg0.field181;
        this.field3231 = arg0.field151;
        this.field3215 = arg0.field180;
        this.field3246 = arg0.field169;
        this.field3233 = arg0.field167;
        this.field3252 = arg0.field165;
        this.field3210 = arg0.field161;
        int var20 = this.field3226 * 3;
        this.field3227 = new short[var20];
        this.field3223 = new short[var20];
        this.field3241 = new short[var20];
        this.field3218 = new short[var20];
        this.field3238 = new float[var20];
        this.field3244 = new float[var20];
        this.field3230 = new short[this.field3226];
        this.field3211 = new byte[this.field3226];
        this.field3216 = new short[this.field3226];
        this.field3243 = new short[this.field3226];
        this.field3225 = new short[this.field3226];
        this.field3222 = new short[this.field3226];
        if (arg0.field185 != null) {
            this.field3228 = new byte[this.field3226];
        }
        if (arg0.field155 != null) {
            this.field3213 = new short[this.field3226];
        }
        this.field3219 = new class246();
        this.field3209 = new class112();
        this.field3248 = new class112();
        if (class229.field3531) {
            this.field3251 = new class112();
        }
        this.field3245 = new class112();
        this.field3208 = new class112();
        this.field3232 = (short) arg1;
        this.field3217 = (short) arg2;
        this.field3221 = new short[var20];
        field3229 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field3231; var22++) {
            int var23 = this.field3236[var22];
            this.field3236[var22] = var21;
            var21 += var23;
        }
        this.field3236[this.field3231] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field193 != null) {
            int var28 = arg0.field152;
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
            for (int var36 = 0; var36 < this.field3226; var36++) {
                int var37 = var5[var36];
                if (arg0.field193[var37] != -1) {
                    int var38 = arg0.field193[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field159[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field191[var37];
                        } else {
                            var40 = arg0.field157[var37];
                        }
                        int var41 = arg0.field180[var40];
                        int var42 = arg0.field169[var40];
                        int var43 = arg0.field167[var40];
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
                byte var45 = arg0.field166[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field143[var44];
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
                        var49 = 64.0F / (float) (arg0.field189[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field143[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field189[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field147[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field143[var44] / 1024.0F;
                        var49 = (float) arg0.field189[var44] / 1024.0F;
                        var48 = (float) arg0.field147[var44] / 1024.0F;
                    }
                    var27[var44] = method1501(arg0.field144[var44], arg0.field171[var44], arg0.field182[var44], arg0.field168[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3226; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field156[var51] & 0xFFFF;
            short var53;
            if (arg0.field177 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field177[var51];
            }
            int var54;
            if (arg0.field193 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field193[var51];
            }
            int var55;
            if (arg0.field184 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field184[var51] & 0xFF;
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
                    byte var65 = arg0.field166[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field159[var51];
                        int var67 = arg0.field191[var51];
                        int var68 = arg0.field157[var51];
                        short var69 = arg0.field144[var54];
                        short var70 = arg0.field171[var54];
                        short var71 = arg0.field182[var54];
                        float var72 = (float) arg0.field180[var69];
                        float var73 = (float) arg0.field169[var69];
                        float var74 = (float) arg0.field167[var69];
                        float var75 = (float) arg0.field180[var70] - var72;
                        float var76 = (float) arg0.field169[var70] - var73;
                        float var77 = (float) arg0.field167[var70] - var74;
                        float var78 = (float) arg0.field180[var71] - var72;
                        float var79 = (float) arg0.field169[var71] - var73;
                        float var80 = (float) arg0.field167[var71] - var74;
                        float var81 = (float) arg0.field180[var66] - var72;
                        float var82 = (float) arg0.field169[var66] - var73;
                        float var83 = (float) arg0.field167[var66] - var74;
                        float var84 = (float) arg0.field180[var67] - var72;
                        float var85 = (float) arg0.field169[var67] - var73;
                        float var86 = (float) arg0.field167[var67] - var74;
                        float var87 = (float) arg0.field180[var68] - var72;
                        float var88 = (float) arg0.field169[var68] - var73;
                        float var89 = (float) arg0.field167[var68] - var74;
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
                        int var101 = arg0.field159[var51];
                        int var102 = arg0.field191[var51];
                        int var103 = arg0.field157[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field150[var54];
                        float var109 = (float) arg0.field179[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field147[var54] & 0xFFFF) / 1024.0F;
                            method1518(arg0.field180[var101], arg0.field169[var101], arg0.field167[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3259;
                            var57 = field3269;
                            method1518(arg0.field180[var102], arg0.field169[var102], arg0.field167[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3259;
                            var59 = field3269;
                            method1518(arg0.field180[var103], arg0.field169[var103], arg0.field167[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3259;
                            var61 = field3269;
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
                            float var112 = (float) arg0.field194[var54] / 256.0F;
                            float var113 = (float) arg0.field162[var54] / 256.0F;
                            int var114 = arg0.field180[var102] - arg0.field180[var101];
                            int var115 = arg0.field169[var102] - arg0.field169[var101];
                            int var116 = arg0.field167[var102] - arg0.field167[var101];
                            int var117 = arg0.field180[var103] - arg0.field180[var101];
                            int var118 = arg0.field169[var103] - arg0.field169[var101];
                            int var119 = arg0.field167[var103] - arg0.field167[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field143[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field189[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field147[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1525(var126, var127, var128);
                            method1520(arg0.field180[var101], arg0.field169[var101], arg0.field167[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3258;
                            var57 = field3266;
                            method1520(arg0.field180[var102], arg0.field169[var102], arg0.field167[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3258;
                            var59 = field3266;
                            method1520(arg0.field180[var103], arg0.field169[var103], arg0.field167[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3258;
                            var61 = field3266;
                        } else if (var65 == 3) {
                            method1496(arg0.field180[var101], arg0.field169[var101], arg0.field167[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3263;
                            var57 = field3264;
                            method1496(arg0.field180[var102], arg0.field169[var102], arg0.field167[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3263;
                            var59 = field3264;
                            method1496(arg0.field180[var103], arg0.field169[var103], arg0.field167[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3263;
                            var61 = field3264;
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
            arg0.method135();
            byte var129;
            if (arg0.field145 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field145[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field159[var51];
                class158 var133 = arg0.field183[var132];
                this.field3216[var50] = this.method1508(arg0, var132, var130, var133.field2577, var133.field2580, var133.field2581, var133.field2579, var56, var57);
                int var134 = arg0.field191[var51];
                class158 var135 = arg0.field183[var134];
                this.field3243[var50] = this.method1508(arg0, var134, (long) var62 + var130, var135.field2577, var135.field2580, var135.field2581, var135.field2579, var58, var59);
                int var136 = arg0.field157[var51];
                class158 var137 = arg0.field183[var136];
                this.field3225[var50] = this.method1508(arg0, var136, (long) var63 + var130, var137.field2577, var137.field2580, var137.field2581, var137.field2579, var60, var61);
            } else if (var129 == 1) {
                class232 var138 = arg0.field187[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3538 > 0 ? 1024 : 2048) + (var138.field3539 + 256 << 12) + (var138.field3534 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3216[var50] = this.method1508(arg0, arg0.field159[var51], var139, var138.field3538, var138.field3539, var138.field3534, 0, var56, var57);
                this.field3243[var50] = this.method1508(arg0, arg0.field191[var51], (long) var62 + var139, var138.field3538, var138.field3539, var138.field3534, 0, var58, var59);
                this.field3225[var50] = this.method1508(arg0, arg0.field157[var51], (long) var63 + var139, var138.field3538, var138.field3539, var138.field3534, 0, var60, var61);
            }
            if (arg0.field177 == null) {
                this.field3222[var50] = -1;
            } else {
                this.field3222[var50] = arg0.field177[var51];
            }
            if (this.field3228 != null) {
                this.field3228[var50] = (byte) arg0.field185[var51];
            }
            this.field3230[var50] = arg0.field156[var51];
            if (arg0.field184 != null) {
                this.field3211[var50] = arg0.field184[var51];
            }
            if (arg0.field155 != null) {
                this.field3213[var50] = arg0.field155[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3226; var143++) {
            short var144 = this.field3222[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3235 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3226; var147++) {
            short var148 = this.field3222[var147];
            if (var146 != var148) {
                this.field3235[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3235[var145] = this.field3226;
        field3229 = null;
        this.field3227 = method1498(this.field3227, this.field3224);
        this.field3223 = method1498(this.field3223, this.field3224);
        this.field3241 = method1498(this.field3241, this.field3224);
        this.field3218 = method1498(this.field3218, this.field3224);
        this.field3238 = method1500(this.field3238, this.field3224);
        this.field3244 = method1500(this.field3244, this.field3224);
    }

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "()V", line = 243)
    public final void method749() {
        for (int var1 = 0; var1 < this.field3214; var1++) {
            this.field3215[var1] = -this.field3215[var1];
            this.field3233[var1] = -this.field3233[var1];
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 256)
    public final void method772(int arg0) {
        int var2 = class40.field612[arg0];
        int var3 = class40.field619[arg0];
        for (int var4 = 0; var4 < this.field3214; var4++) {
            int var5 = this.field3233[var4] * var2 + this.field3215[var4] * var3 >> 16;
            this.field3233[var4] = this.field3233[var4] * var3 - this.field3215[var4] * var2 >> 16;
            this.field3215[var4] = var5;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([SI)[S", line = 280)
    private static final short[] method1498(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class330.method2312(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 286)
    public final void method752(int arg0) {
        int var2 = class40.field612[arg0];
        int var3 = class40.field619[arg0];
        for (int var4 = 0; var4 < this.field3214; var4++) {
            int var5 = this.field3246[var4] * var3 - this.field3233[var4] * var2 >> 16;
            this.field3233[var4] = this.field3246[var4] * var2 + this.field3233[var4] * var3 >> 16;
            this.field3246[var4] = var5;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "()V", line = 308)
    private final void method1499() {
        GL var1 = class162.field2654;
        if (this.field3226 == 0) {
            return;
        }
        if (this.field3242 != 0) {
            this.method1515(true, !this.field3209.field1819 && (this.field3242 & 0x1) != 0, !this.field3248.field1819 && (this.field3242 & 0x2) != 0, this.field3251 != null && !this.field3251.field1819 && (this.field3242 & 0x4) != 0, false);
        }
        this.method1515(false, !this.field3209.field1819, !this.field3248.field1819, this.field3251 != null && !this.field3251.field1819, !this.field3245.field1819);
        if (!this.field3208.field1819) {
            this.method1513();
        }
        if (this.field3239 != 0) {
            if ((this.field3239 & 0x1) != 0) {
                this.field3215 = null;
                this.field3246 = null;
                this.field3233 = null;
                this.field3221 = null;
                this.field3236 = null;
            }
            if ((this.field3239 & 0x2) != 0) {
                this.field3230 = null;
                this.field3211 = null;
            }
            if ((this.field3239 & 0x4) != 0) {
                this.field3227 = null;
                this.field3223 = null;
                this.field3241 = null;
                this.field3218 = null;
            }
            if ((this.field3239 & 0x8) != 0) {
                this.field3238 = null;
                this.field3244 = null;
            }
            if ((this.field3239 & 0x10) != 0) {
                this.field3216 = null;
                this.field3243 = null;
                this.field3225 = null;
            }
            this.field3239 = 0;
        }
        class312 var2 = null;
        if (this.field3209.field1817 != null) {
            this.field3209.field1817.method2199();
            var2 = this.field3209.field1817;
            var1.glVertexPointer(3, 5126, this.field3209.field1816, (long) this.field3209.field1820);
        }
        if (this.field3248.field1817 != null) {
            if (this.field3248.field1817 != var2) {
                this.field3248.field1817.method2199();
                var2 = this.field3248.field1817;
            }
            var1.glColorPointer(4, 5121, this.field3248.field1816, (long) this.field3248.field1820);
        }
        if (class229.field3531 && this.field3251.field1817 != null) {
            if (this.field3251.field1817 != var2) {
                this.field3251.field1817.method2199();
                var2 = this.field3251.field1817;
            }
            var1.glNormalPointer(5126, this.field3251.field1816, (long) this.field3251.field1820);
        }
        if (this.field3245.field1817 != null) {
            if (this.field3245.field1817 != var2) {
                this.field3245.field1817.method2199();
                class312 var3 = this.field3245.field1817;
            }
            var1.glTexCoordPointer(2, 5126, this.field3245.field1816, (long) this.field3245.field1820);
        }
        if (this.field3208.field1817 != null) {
            this.field3208.field1817.method2200();
        }
        if (this.field3209.field1817 == null || this.field3248.field1817 == null || class229.field3531 && this.field3251.field1817 == null || this.field3245.field1817 == null) {
            if (class162.field2639) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3209.field1817 == null) {
                this.field3209.field1813.position(this.field3209.field1820);
                var1.glVertexPointer(3, 5126, this.field3209.field1816, this.field3209.field1813);
            }
            if (this.field3248.field1817 == null) {
                this.field3248.field1813.position(this.field3248.field1820);
                var1.glColorPointer(4, 5121, this.field3248.field1816, this.field3248.field1813);
            }
            if (class229.field3531 && this.field3251.field1817 == null) {
                this.field3251.field1813.position(this.field3251.field1820);
                var1.glNormalPointer(5126, this.field3251.field1816, this.field3251.field1813);
            }
            if (this.field3245.field1817 == null) {
                this.field3245.field1813.position(this.field3245.field1820);
                var1.glTexCoordPointer(2, 5126, this.field3245.field1816, this.field3245.field1813);
            }
        }
        if (this.field3208.field1817 == null && class162.field2639) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3235.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3235[var5];
            int var7 = this.field3235[var5 + 1];
            short var8 = this.field3222[var6];
            if (var8 == -1) {
                class162.method1219(-1);
                class102.method830(0, 14804, 0);
            } else {
                class40.field614.method259(var8 & 0xFFFF, 255);
            }
            if (this.field3208.field1817 == null) {
                this.field3208.field1813.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3208.field1813);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "()V", line = 482)
    public final void method748() {
        for (int var1 = 0; var1 < this.field3214; var1++) {
            int var2 = this.field3215[var1];
            this.field3215[var1] = this.field3233[var1];
            this.field3233[var1] = -var2;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)V", line = 498)
    public final void method757(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3214; var4++) {
            this.field3215[var4] += arg0;
            this.field3246[var4] += arg1;
            this.field3233[var4] += arg2;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([FI)[F", line = 512)
    private static final float[] method1500(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class330.method2310(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIIIZI[I)V", line = 518)
    public final void method759(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field3267 = 0;
            field3265 = 0;
            field3268 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3234.length) {
                    int[] var16 = this.field3234[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3210 == null || (arg6 & this.field3210[var18]) != 0) {
                            field3267 += this.field3215[var18];
                            field3265 += this.field3246[var18];
                            field3268 += this.field3233[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field3267 = field3267 / var13 + var10;
                field3265 = field3265 / var13 + var11;
                field3268 = field3268 / var13 + var12;
                field3262 = true;
            } else {
                field3267 = var10;
                field3265 = var11;
                field3268 = var12;
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
                if (var26 < this.field3234.length) {
                    int[] var27 = this.field3234[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3210 == null || (arg6 & this.field3210[var29]) != 0) {
                            this.field3215[var29] += var22;
                            this.field3246[var29] += var23;
                            this.field3233[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field3234.length) {
                        int[] var92 = this.field3234[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field3210 == null || (arg6 & this.field3210[var94]) != 0) {
                                this.field3215[var94] -= field3267;
                                this.field3246[var94] -= field3265;
                                this.field3233[var94] -= field3268;
                                if (arg4 != 0) {
                                    int var95 = class40.field612[arg4];
                                    int var96 = class40.field619[arg4];
                                    int var97 = this.field3246[var94] * var95 + this.field3215[var94] * var96 + 32767 >> 16;
                                    this.field3246[var94] = this.field3246[var94] * var96 + 32767 - this.field3215[var94] * var95 >> 16;
                                    this.field3215[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class40.field612[arg2];
                                    int var99 = class40.field619[arg2];
                                    int var100 = this.field3246[var94] * var99 + 32767 - this.field3233[var94] * var98 >> 16;
                                    this.field3233[var94] = this.field3246[var94] * var98 + this.field3233[var94] * var99 + 32767 >> 16;
                                    this.field3246[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class40.field612[arg3];
                                    int var102 = class40.field619[arg3];
                                    int var103 = this.field3233[var94] * var101 + this.field3215[var94] * var102 + 32767 >> 16;
                                    this.field3233[var94] = this.field3233[var94] * var102 + 32767 - this.field3215[var94] * var101 >> 16;
                                    this.field3215[var94] = var103;
                                }
                                this.field3215[var94] += field3267;
                                this.field3246[var94] += field3265;
                                this.field3233[var94] += field3268;
                            }
                        }
                    }
                }
                if (arg5 && this.field3227 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field3234.length) {
                            int[] var106 = this.field3234[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field3210 == null || (arg6 & this.field3210[var108]) != 0) {
                                    int var109 = this.field3236[var108];
                                    int var110 = this.field3236[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field3221[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class40.field612[arg4];
                                            int var114 = class40.field619[arg4];
                                            int var115 = this.field3227[var112] * var114 + this.field3223[var112] * var113 + 32767 >> 16;
                                            this.field3223[var112] = (short) (this.field3223[var112] * var114 + 32767 - this.field3227[var112] * var113 >> 16);
                                            this.field3227[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class40.field612[arg2];
                                            int var117 = class40.field619[arg2];
                                            int var118 = this.field3223[var112] * var117 + 32767 - this.field3241[var112] * var116 >> 16;
                                            this.field3241[var112] = (short) (this.field3241[var112] * var117 + this.field3223[var112] * var116 + 32767 >> 16);
                                            this.field3223[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class40.field612[arg3];
                                            int var120 = class40.field619[arg3];
                                            int var121 = this.field3241[var112] * var119 + this.field3227[var112] * var120 + 32767 >> 16;
                                            this.field3241[var112] = (short) (this.field3241[var112] * var120 + 32767 - this.field3227[var112] * var119 >> 16);
                                            this.field3227[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3251 != null) {
                        this.field3251.field1819 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field3262) {
                    int var36 = arg7[6] * field3268 + arg7[0] * field3267 + arg7[3] * field3265 + 16384 >> 15;
                    int var37 = arg7[7] * field3268 + arg7[1] * field3267 + arg7[4] * field3265 + 16384 >> 15;
                    int var38 = arg7[8] * field3268 + arg7[2] * field3267 + arg7[5] * field3265 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field3267 = var39;
                    field3265 = var40;
                    field3268 = var41;
                    field3262 = false;
                }
                int[] var42 = new int[9];
                int var43 = class40.field619[arg2] >> 1;
                int var44 = class40.field612[arg2] >> 1;
                int var45 = class40.field619[arg3] >> 1;
                int var46 = class40.field612[arg3] >> 1;
                int var47 = class40.field619[arg4] >> 1;
                int var48 = class40.field612[arg4] >> 1;
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
                int var51 = var42[2] * -field3268 + var42[0] * -field3267 + var42[1] * -field3265 + 16384 >> 15;
                int var52 = var42[5] * -field3268 + var42[3] * -field3267 + var42[4] * -field3265 + 16384 >> 15;
                int var53 = var42[8] * -field3268 + var42[6] * -field3267 + var42[7] * -field3265 + 16384 >> 15;
                int var54 = field3267 + var51;
                int var55 = field3265 + var52;
                int var56 = field3268 + var53;
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
                    if (var80 < this.field3234.length) {
                        int[] var81 = this.field3234[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field3210 == null || (arg6 & this.field3210[var83]) != 0) {
                                int var84 = this.field3233[var83] * var68[2] + this.field3246[var83] * var68[1] + this.field3215[var83] * var68[0] + 16384 >> 15;
                                int var85 = this.field3233[var83] * var68[5] + this.field3246[var83] * var68[4] + this.field3215[var83] * var68[3] + 16384 >> 15;
                                int var86 = this.field3233[var83] * var68[8] + this.field3246[var83] * var68[7] + this.field3215[var83] * var68[6] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field3215[var83] = var87;
                                this.field3246[var83] = var88;
                                this.field3233[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3234.length) {
                        int[] var174 = this.field3234[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3210 == null || (arg6 & this.field3210[var176]) != 0) {
                                this.field3215[var176] -= field3267;
                                this.field3246[var176] -= field3265;
                                this.field3233[var176] -= field3268;
                                this.field3215[var176] = this.field3215[var176] * arg2 >> 7;
                                this.field3246[var176] = this.field3246[var176] * arg3 >> 7;
                                this.field3233[var176] = this.field3233[var176] * arg4 >> 7;
                                this.field3215[var176] += field3267;
                                this.field3246[var176] += field3265;
                                this.field3233[var176] += field3268;
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
                if (field3262) {
                    int var128 = arg7[6] * field3268 + arg7[0] * field3267 + arg7[3] * field3265 + 16384 >> 15;
                    int var129 = arg7[7] * field3268 + arg7[1] * field3267 + arg7[4] * field3265 + 16384 >> 15;
                    int var130 = arg7[8] * field3268 + arg7[2] * field3267 + arg7[5] * field3265 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field3267 = var131;
                    field3265 = var132;
                    field3268 = var133;
                    field3262 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field3267 * var134 + 16384 >> 15;
                int var138 = -field3265 * var135 + 16384 >> 15;
                int var139 = -field3268 * var136 + 16384 >> 15;
                int var140 = field3267 + var137;
                int var141 = field3265 + var138;
                int var142 = field3268 + var139;
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
                    if (var162 < this.field3234.length) {
                        int[] var163 = this.field3234[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field3210 == null || (arg6 & this.field3210[var165]) != 0) {
                                int var166 = this.field3233[var165] * var150[2] + this.field3246[var165] * var150[1] + this.field3215[var165] * var150[0] + 16384 >> 15;
                                int var167 = this.field3233[var165] * var150[5] + this.field3246[var165] * var150[4] + this.field3215[var165] * var150[3] + 16384 >> 15;
                                int var168 = this.field3233[var165] * var150[8] + this.field3246[var165] * var150[7] + this.field3215[var165] * var150[6] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field3215[var165] = var169;
                                this.field3246[var165] = var170;
                                this.field3233[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3247 != null && this.field3211 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field3247.length) {
                        int[] var179 = this.field3247[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field3213 == null || (arg6 & this.field3213[var181]) != 0) {
                                int var182 = (this.field3211[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field3211[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field3248.field1819 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3247 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field3247.length) {
                    int[] var185 = this.field3247[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field3213 == null || (arg6 & this.field3213[var187]) != 0) {
                            int var188 = this.field3230[var187] & 0xFFFF;
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
                            this.field3230[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field3248.field1819 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIFFF)[F", line = 1310)
    private static final float[] method1501(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
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

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "()I", line = 1375)
    public final int method137() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3671;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(SS)V", line = 1383)
    public final void method1502(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3226; var3++) {
            if (this.field3222[var3] == arg0) {
                this.field3222[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class40.field614.method250((byte) -115, arg0 & 0xFFFF);
            var5 = class40.field614.method253(255, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class40.field614.method250((byte) -115, arg1 & 0xFFFF);
            var7 = class40.field614.method253(255, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3248.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Leh;", line = 1418)
    public final class179 method114(int arg0, int arg1, int arg2) {
        this.field3212 = false;
        if (this.field3249 != null) {
            this.field3227 = this.field3249.field4374;
            this.field3223 = this.field3249.field4376;
            this.field3241 = this.field3249.field4377;
            this.field3218 = this.field3249.field4375;
            this.field3249 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "()I", line = 1431)
    public final int method746() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3667;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 1439)
    public final void method745(int arg0) {
        int var2 = class40.field612[arg0];
        int var3 = class40.field619[arg0];
        for (int var4 = 0; var4 < this.field3214; var4++) {
            int var5 = this.field3246[var4] * var2 + this.field3215[var4] * var3 >> 16;
            this.field3246[var4] = this.field3246[var4] * var3 - this.field3215[var4] * var2 >> 16;
            this.field3215[var4] = var5;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "()V", line = 1463)
    private final void method1503() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3231; var9++) {
            int var10 = this.field3215[var9];
            int var11 = this.field3246[var9];
            int var12 = this.field3233[var9];
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
        this.field3219.field3669 = (short) var1;
        this.field3219.field3672 = (short) var4;
        this.field3219.field3671 = (short) var2;
        this.field3219.field3667 = (short) var5;
        this.field3219.field3670 = (short) var3;
        this.field3219.field3674 = (short) var6;
        this.field3219.field3673 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3219.field3668 = true;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 1533)
    public final void method1504(int arg0) {
        if (this.field3227 == null) {
            this.method772(arg0);
            return;
        }
        int var2 = class40.field612[arg0];
        int var3 = class40.field619[arg0];
        for (int var4 = 0; var4 < this.field3214; var4++) {
            int var5 = this.field3233[var4] * var2 + this.field3215[var4] * var3 >> 16;
            this.field3233[var4] = this.field3233[var4] * var3 - this.field3215[var4] * var2 >> 16;
            this.field3215[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3224; var6++) {
            int var7 = this.field3241[var6] * var2 + this.field3227[var6] * var3 >> 16;
            this.field3241[var6] = (short) (this.field3241[var6] * var3 - this.field3227[var6] * var2 >> 16);
            this.field3227[var6] = (short) var7;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "()Z", line = 1576)
    public final boolean method115() {
        return this.field3212 && this.field3215 != null && this.field3227 != null;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(ZZZ)Lie;", line = 1584)
    public final class94 method764(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1522(arg0, arg1, arg2, field3255, field3254);
    }

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "()I", line = 1587)
    public final int method771() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3670;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(ZZZ)Lie;", line = 1594)
    public final class94 method769(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1522(arg0, arg1, arg2, field3257, field3256);
    }

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "()I", line = 1601)
    public final int method753() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3673;
    }

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "()V", line = 1607)
    public final void method1505() {
        if (this.field3227 == null) {
            this.method749();
            return;
        }
        for (int var1 = 0; var1 < this.field3214; var1++) {
            this.field3215[var1] = -this.field3215[var1];
            this.field3233[var1] = -this.field3233[var1];
        }
        for (int var2 = 0; var2 < this.field3224; var2++) {
            this.field3227[var2] = (short) (-this.field3227[var2]);
            this.field3241[var2] = (short) (-this.field3241[var2]);
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILpl;[[I[[IIII)V", line = 1640)
    public final void method1506(int arg0, int arg1, class206 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3219.field3668) {
            arg2.method1503();
        }
        int var9 = arg2.field3219.field3669 + arg5;
        int var10 = arg2.field3219.field3672 + arg5;
        int var11 = arg2.field3219.field3670 + arg7;
        int var12 = arg2.field3219.field3674 + arg7;
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
            for (int var17 = 0; var17 < this.field3231; var17++) {
                int var18 = this.field3215[var17] + arg5;
                int var19 = this.field3233[var17] + arg7;
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
            short var27 = arg2.field3219.field3671;
            for (int var28 = 0; var28 < this.field3231; var28++) {
                int var29 = (this.field3246[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3215[var28] + arg5;
                    int var31 = this.field3233[var28] + arg7;
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
            this.method762(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3219.field3667 - arg2.field3219.field3671;
            for (int var42 = 0; var42 < this.field3231; var42++) {
                int var43 = this.field3215[var42] + arg5;
                int var44 = this.field3233[var42] + arg7;
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
            int var52 = arg2.field3219.field3667 - arg2.field3219.field3671;
            for (int var53 = 0; var53 < this.field3231; var53++) {
                int var54 = this.field3215[var53] + arg5;
                int var55 = this.field3233[var53] + arg7;
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
        this.field3209.field1819 = false;
        this.field3219.field3668 = false;
    }

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "()I", line = 1837)
    public final int method754() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3672;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 1844)
    public final void method1507(int arg0) {
        this.field3232 = (short) arg0;
        this.field3248.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lvi;IJIIIIFF)S", line = 1852)
    private final short method1508(class7 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3236[arg1];
        int var12 = this.field3236[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3221[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3229[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3221[var13] = (short) (this.field3224 + 1);
        field3229[var13] = arg2;
        this.field3227[this.field3224] = (short) arg3;
        this.field3223[this.field3224] = (short) arg4;
        this.field3241[this.field3224] = (short) arg5;
        this.field3218[this.field3224] = (short) arg6;
        this.field3238[this.field3224] = arg7;
        this.field3244[this.field3224] = arg8;
        return (short) (this.field3224++);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZZZZZZZ)Lpl;", line = 1888)
    public final class206 method1509(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class206 var12 = new class206();
        var12.field3214 = this.field3214;
        var12.field3231 = this.field3231;
        var12.field3224 = this.field3224;
        var12.field3226 = this.field3226;
        if (arg0) {
            var12.field3215 = this.field3215;
            var12.field3233 = this.field3233;
        } else {
            var12.field3215 = class130.method1010(this.field3215, 4096);
            var12.field3233 = class130.method1010(this.field3233, 4096);
        }
        if (arg1) {
            var12.field3246 = this.field3246;
        } else {
            var12.field3246 = class130.method1010(this.field3246, 4096);
        }
        if (arg0 && arg1) {
            var12.field3209 = this.field3209;
            var12.field3219 = this.field3219;
        } else {
            var12.field3209 = new class112();
            var12.field3219 = new class246();
        }
        if (arg2) {
            var12.field3230 = this.field3230;
        } else {
            var12.field3230 = class214.method1557(this.field3230, 2294);
        }
        if (arg3) {
            var12.field3211 = this.field3211;
        } else {
            var12.field3211 = class71.method576(this.field3211, (byte) 71);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class229.field3531) {
            var12.field3248 = new class112();
        } else {
            var12.field3248 = this.field3248;
        }
        if (arg5) {
            var12.field3227 = this.field3227;
            var12.field3223 = this.field3223;
            var12.field3241 = this.field3241;
            var12.field3218 = this.field3218;
        } else {
            var12.field3227 = class214.method1557(this.field3227, 2294);
            var12.field3223 = class214.method1557(this.field3223, 2294);
            var12.field3241 = class214.method1557(this.field3241, 2294);
            var12.field3218 = class214.method1557(this.field3218, 2294);
        }
        if (!class229.field3531) {
            var12.field3251 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3251 = this.field3251;
        } else {
            var12.field3251 = new class112();
        }
        if (arg8) {
            var12.field3238 = this.field3238;
            var12.field3244 = this.field3244;
            var12.field3245 = this.field3245;
        } else {
            var12.field3238 = class213.method1548(-100, this.field3238);
            var12.field3244 = class213.method1548(124, this.field3244);
            var12.field3245 = new class112();
        }
        if (arg9) {
            var12.field3216 = this.field3216;
            var12.field3243 = this.field3243;
            var12.field3225 = this.field3225;
            var12.field3208 = this.field3208;
        } else {
            var12.field3216 = class214.method1557(this.field3216, 2294);
            var12.field3243 = class214.method1557(this.field3243, 2294);
            var12.field3225 = class214.method1557(this.field3225, 2294);
            var12.field3208 = new class112();
        }
        if (arg10) {
            var12.field3222 = this.field3222;
        } else {
            var12.field3222 = class214.method1557(this.field3222, 2294);
        }
        var12.field3252 = this.field3252;
        var12.field3234 = this.field3234;
        var12.field3228 = this.field3228;
        var12.field3247 = this.field3247;
        var12.field3235 = this.field3235;
        var12.field3221 = this.field3221;
        var12.field3236 = this.field3236;
        var12.field3232 = this.field3232;
        var12.field3217 = this.field3217;
        var12.field3210 = this.field3210;
        var12.field3213 = this.field3213;
        return var12;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZZZ)V", line = 2026)
    public final void method1510(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3242 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3224 != 0) {
            if (arg6) {
                boolean var8 = !this.field3248.field1819 && (arg1 || arg2 && !class229.field3531);
                this.method1515(false, !this.field3209.field1819 && arg0, var8, this.field3251 != null && !this.field3251.field1819 && arg2, !this.field3245.field1819 && arg3);
                if (!this.field3208.field1819 && arg4 && arg1) {
                    this.method1513();
                }
            }
            if (arg0) {
                if (this.field3209.field1819) {
                    if (!this.field3219.field3668) {
                        this.method1503();
                    }
                    this.field3215 = null;
                    this.field3246 = null;
                    this.field3233 = null;
                    this.field3221 = null;
                    this.field3236 = null;
                } else {
                    this.field3239 = (byte) (this.field3239 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3248.field1819) {
                    this.field3230 = null;
                    this.field3211 = null;
                } else {
                    this.field3239 = (byte) (this.field3239 | 0x2);
                }
            }
            if (arg2 && class229.field3531) {
                if (this.field3251.field1819) {
                    this.field3227 = null;
                    this.field3223 = null;
                    this.field3241 = null;
                    this.field3218 = null;
                } else {
                    this.field3239 = (byte) (this.field3239 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3245.field1819) {
                    this.field3238 = null;
                    this.field3244 = null;
                } else {
                    this.field3239 = (byte) (this.field3239 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3208.field1819 && this.field3248.field1819) {
                    this.field3216 = null;
                    this.field3243 = null;
                    this.field3225 = null;
                } else {
                    this.field3239 = (byte) (this.field3239 | 0x10);
                }
            }
            if (arg5) {
                this.field3252 = null;
                this.field3228 = null;
                this.field3234 = (int[][]) null;
                this.field3247 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIIIZ)V", line = 2122)
    public final void method763(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3267 = 0;
            field3265 = 0;
            field3268 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3234.length) {
                    int[] var14 = this.field3234[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3267 += this.field3215[var16];
                        field3265 += this.field3246[var16];
                        field3268 += this.field3233[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3267 = field3267 / var11 + var8;
                field3265 = field3265 / var11 + var9;
                field3268 = field3268 / var11 + var10;
            } else {
                field3267 = var8;
                field3265 = var9;
                field3268 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3234.length) {
                    int[] var22 = this.field3234[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3215[var24] += var17;
                        this.field3246[var24] += var18;
                        this.field3233[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3234.length) {
                    int[] var27 = this.field3234[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3215[var29] -= field3267;
                        this.field3246[var29] -= field3265;
                        this.field3233[var29] -= field3268;
                        if (arg4 != 0) {
                            int var30 = class40.field612[arg4];
                            int var31 = class40.field619[arg4];
                            int var32 = this.field3246[var29] * var30 + this.field3215[var29] * var31 + 32767 >> 16;
                            this.field3246[var29] = this.field3246[var29] * var31 + 32767 - this.field3215[var29] * var30 >> 16;
                            this.field3215[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class40.field612[arg2];
                            int var34 = class40.field619[arg2];
                            int var35 = this.field3246[var29] * var34 + 32767 - this.field3233[var29] * var33 >> 16;
                            this.field3233[var29] = this.field3246[var29] * var33 + this.field3233[var29] * var34 + 32767 >> 16;
                            this.field3246[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class40.field612[arg3];
                            int var37 = class40.field619[arg3];
                            int var38 = this.field3233[var29] * var36 + this.field3215[var29] * var37 + 32767 >> 16;
                            this.field3233[var29] = this.field3233[var29] * var37 + 32767 - this.field3215[var29] * var36 >> 16;
                            this.field3215[var29] = var38;
                        }
                        this.field3215[var29] += field3267;
                        this.field3246[var29] += field3265;
                        this.field3233[var29] += field3268;
                    }
                }
            }
            if (arg5 && this.field3227 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3234.length) {
                        int[] var41 = this.field3234[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3236[var43];
                            int var45 = this.field3236[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3221[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class40.field612[arg4];
                                    int var49 = class40.field619[arg4];
                                    int var50 = this.field3227[var47] * var49 + this.field3223[var47] * var48 + 32767 >> 16;
                                    this.field3223[var47] = (short) (this.field3223[var47] * var49 + 32767 - this.field3227[var47] * var48 >> 16);
                                    this.field3227[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class40.field612[arg2];
                                    int var52 = class40.field619[arg2];
                                    int var53 = this.field3223[var47] * var52 + 32767 - this.field3241[var47] * var51 >> 16;
                                    this.field3241[var47] = (short) (this.field3241[var47] * var52 + this.field3223[var47] * var51 + 32767 >> 16);
                                    this.field3223[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class40.field612[arg3];
                                    int var55 = class40.field619[arg3];
                                    int var56 = this.field3241[var47] * var54 + this.field3227[var47] * var55 + 32767 >> 16;
                                    this.field3241[var47] = (short) (this.field3241[var47] * var55 + 32767 - this.field3227[var47] * var54 >> 16);
                                    this.field3227[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3251 != null) {
                    this.field3251.field1819 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3234.length) {
                    int[] var59 = this.field3234[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3215[var61] -= field3267;
                        this.field3246[var61] -= field3265;
                        this.field3233[var61] -= field3268;
                        this.field3215[var61] = this.field3215[var61] * arg2 >> 7;
                        this.field3246[var61] = this.field3246[var61] * arg3 >> 7;
                        this.field3233[var61] = this.field3233[var61] * arg4 >> 7;
                        this.field3215[var61] += field3267;
                        this.field3246[var61] += field3265;
                        this.field3233[var61] += field3268;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3247 != null && this.field3211 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field3247.length) {
                        int[] var64 = this.field3247[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field3211[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field3211[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field3248.field1819 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field3247 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field3247.length) {
                    int[] var70 = this.field3247[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field3230[var72] & 0xFFFF;
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
                        this.field3230[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field3248.field1819 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "()I", line = 2529)
    public final int method755() {
        if (!this.field3219.field3668) {
            this.method1503();
        }
        return this.field3219.field3669;
    }

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "()V", line = 2535)
    public static final void method1511() {
        field3250 = new class206();
        field3253 = new class206();
        field3254 = new class206();
        field3255 = new class206();
        field3256 = new class206();
        field3257 = new class206();
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(SS)V", line = 2546)
    public final void method1512(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3226; var3++) {
            if (this.field3230[var3] == arg0) {
                this.field3230[var3] = arg1;
            }
        }
        this.field3248.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "()V", line = 2562)
    private final void method1513() {
        if (field3220.field34.length < this.field3226 * 12) {
            field3220 = new class1((this.field3226 + 100) * 12);
        } else {
            field3220.field48 = 0;
        }
        if (class162.field2624) {
            for (int var1 = 0; var1 < this.field3226; var1++) {
                field3220.method11(this.field3216[var1], 31932);
                field3220.method11(this.field3243[var1], 31932);
                field3220.method11(this.field3225[var1], 31932);
            }
        } else {
            for (int var2 = 0; var2 < this.field3226; var2++) {
                field3220.method13(true, this.field3216[var2]);
                field3220.method13(true, this.field3243[var2]);
                field3220.method13(true, this.field3225[var2]);
            }
        }
        if (!class162.field2639) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3220.field48);
            var5.put(field3220.field34, 0, field3220.field48);
            var5.flip();
            this.field3208.field1819 = true;
            this.field3208.field1813 = var5;
            this.field3208.field1817 = null;
            return;
        }
        class312 var3 = new class312();
        ByteBuffer var4 = ByteBuffer.wrap(field3220.field34, 0, field3220.field48);
        var3.method2202(var4);
        this.field3208.field1819 = true;
        this.field3208.field1813 = null;
        this.field3208.field1817 = var3;
    }

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "()I", line = 2620)
    public final int method1514() {
        return this.field3232;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Leh;IIIZ)V", line = 2624)
    public final void method104(class179 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class206 var6 = (class206) arg0;
        if (this.field3226 == 0 || var6.field3226 == 0) {
            return;
        }
        int var7 = var6.field3231;
        int[] var8 = var6.field3215;
        int[] var9 = var6.field3246;
        int[] var10 = var6.field3233;
        short[] var11 = var6.field3227;
        short[] var12 = var6.field3223;
        short[] var13 = var6.field3241;
        short[] var14 = var6.field3218;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3249 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3249.field4374;
            var16 = this.field3249.field4376;
            var17 = this.field3249.field4377;
            var18 = this.field3249.field4375;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3249 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3249.field4374;
            var20 = var6.field3249.field4376;
            var21 = var6.field3249.field4377;
            var22 = var6.field3249.field4375;
        }
        int[] var23 = var6.field3236;
        short[] var24 = var6.field3221;
        if (!var6.field3219.field3668) {
            var6.method1503();
        }
        short var25 = var6.field3219.field3671;
        short var26 = var6.field3219.field3667;
        short var27 = var6.field3219.field3669;
        short var28 = var6.field3219.field3672;
        short var29 = var6.field3219.field3670;
        short var30 = var6.field3219.field3674;
        for (int var31 = 0; var31 < this.field3231; var31++) {
            int var32 = this.field3246[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3215[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3233[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3236[var31];
                        int var37 = this.field3236[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3221[var38] - 1;
                            if (var35 == -1 || this.field3218[var35] != 0) {
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
                                            this.field3249 = new class279();
                                            var15 = this.field3249.field4374 = class214.method1557(this.field3227, 2294);
                                            var16 = this.field3249.field4376 = class214.method1557(this.field3223, 2294);
                                            var17 = this.field3249.field4377 = class214.method1557(this.field3241, 2294);
                                            var18 = this.field3249.field4375 = class214.method1557(this.field3218, 2294);
                                        }
                                        if (var19 == null) {
                                            class279 var44 = var6.field3249 = new class279();
                                            var19 = var44.field4374 = class214.method1557(var11, 2294);
                                            var20 = var44.field4376 = class214.method1557(var12, 2294);
                                            var21 = var44.field4377 = class214.method1557(var13, 2294);
                                            var22 = var44.field4375 = class214.method1557(var14, 2294);
                                        }
                                        short var45 = this.field3227[var35];
                                        short var46 = this.field3223[var35];
                                        short var47 = this.field3241[var35];
                                        short var48 = this.field3218[var35];
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
                                        int var57 = this.field3236[var31];
                                        int var58 = this.field3236[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3221[var59] - 1;
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

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZZZ)V", line = 2865)
    private final void method1515(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3209.field1820 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3248.field1820 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3251.field1820 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3245.field1820 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3220.field34.length < this.field3224 * var6) {
            field3220 = new class1((this.field3224 + 100) * var6);
        } else {
            field3220.field48 = 0;
        }
        if (arg1) {
            if (class162.field2624) {
                for (int var7 = 0; var7 < this.field3231; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3215[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3246[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3233[var7]);
                    int var11 = this.field3236[var7];
                    int var12 = this.field3236[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3221[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3220.field48 = var6 * var14;
                        field3220.method11(var8, 31932);
                        field3220.method11(var9, 31932);
                        field3220.method11(var10, 31932);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3231; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3215[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3246[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3233[var15]);
                    int var19 = this.field3236[var15];
                    int var20 = this.field3236[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3221[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3220.field48 = var6 * var22;
                        field3220.method13(true, var16);
                        field3220.method13(true, var17);
                        field3220.method13(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class229.field3531) {
                for (int var42 = 0; var42 < this.field3226; var42++) {
                    int var43 = method1521(this.field3230[var42], this.field3222[var42], this.field3232, this.field3211[var42]);
                    field3220.field48 = this.field3216[var42] * var6 + this.field3248.field1820;
                    field3220.method11(var43, 31932);
                    field3220.field48 = this.field3243[var42] * var6 + this.field3248.field1820;
                    field3220.method11(var43, 31932);
                    field3220.field48 = this.field3225[var42] * var6 + this.field3248.field1820;
                    field3220.method11(var43, 31932);
                }
            } else {
                int var23 = (int) class261.field3876[0];
                int var24 = (int) class261.field3876[1];
                int var25 = (int) class261.field3876[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3232 * 1.3F);
                int var28 = this.field3217 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3226; var29++) {
                    short var30 = this.field3216[var29];
                    short var31 = this.field3218[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3241[var30] * var25 + this.field3227[var30] * var23 + this.field3223[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3241[var30] * var25 + this.field3227[var30] * var23 + this.field3223[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3218[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3243[var29];
                    short var34 = this.field3218[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3241[var33] * var25 + this.field3227[var33] * var23 + this.field3223[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3241[var33] * var25 + this.field3227[var33] * var23 + this.field3223[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3218[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3225[var29];
                    short var37 = this.field3218[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3241[var36] * var25 + this.field3227[var36] * var23 + this.field3223[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3241[var36] * var25 + this.field3227[var36] * var23 + this.field3223[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3218[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1521(this.field3230[var29], this.field3222[var29], var32, this.field3211[var29]);
                    int var40 = method1521(this.field3230[var29], this.field3222[var29], var35, this.field3211[var29]);
                    int var41 = method1521(this.field3230[var29], this.field3222[var29], var38, this.field3211[var29]);
                    field3220.field48 = var6 * var30 + this.field3248.field1820;
                    field3220.method11(var39, 31932);
                    field3220.field48 = var6 * var33 + this.field3248.field1820;
                    field3220.method11(var40, 31932);
                    field3220.field48 = var6 * var36 + this.field3248.field1820;
                    field3220.method11(var41, 31932);
                }
                this.field3227 = null;
                this.field3223 = null;
                this.field3241 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3217;
            float var45 = 3.0F / (float) (this.field3217 / 2 + this.field3217);
            field3220.field48 = this.field3251.field1820;
            if (class162.field2624) {
                for (int var46 = 0; var46 < this.field3224; var46++) {
                    short var47 = this.field3218[var46];
                    if (var47 == 0) {
                        field3220.method64((float) this.field3227[var46] * var45, (byte) 41);
                        field3220.method64((float) this.field3223[var46] * var45, (byte) 41);
                        field3220.method64((float) this.field3241[var46] * var45, (byte) 41);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3220.method64((float) this.field3227[var46] * var48, (byte) 41);
                        field3220.method64((float) this.field3223[var46] * var48, (byte) 41);
                        field3220.method64((float) this.field3241[var46] * var48, (byte) 41);
                    }
                    field3220.field48 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3224; var49++) {
                    short var50 = this.field3218[var49];
                    if (var50 == 0) {
                        field3220.method5(15852, (float) this.field3227[var49] * var45);
                        field3220.method5(15852, (float) this.field3223[var49] * var45);
                        field3220.method5(15852, (float) this.field3241[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3220.method5(15852, (float) this.field3227[var49] * var51);
                        field3220.method5(15852, (float) this.field3223[var49] * var51);
                        field3220.method5(15852, (float) this.field3241[var49] * var51);
                    }
                    field3220.field48 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3220.field48 = this.field3245.field1820;
            if (class162.field2624) {
                for (int var52 = 0; var52 < this.field3224; var52++) {
                    field3220.method64(this.field3238[var52], (byte) 41);
                    field3220.method64(this.field3244[var52], (byte) 41);
                    field3220.field48 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3224; var53++) {
                    field3220.method5(15852, this.field3238[var53]);
                    field3220.method5(15852, this.field3244[var53]);
                    field3220.field48 += var6 - 8;
                }
            }
        }
        field3220.field48 = this.field3224 * var6;
        if (arg0) {
            if (class162.field2640) {
                ByteBuffer var54 = ByteBuffer.wrap(field3220.field34, 0, field3220.field48);
                if (this.field3237 == null) {
                    this.field3237 = new class312(true);
                    this.field3237.method2202(var54);
                } else {
                    this.field3237.method2203(var54);
                }
                if (arg1) {
                    this.field3209.field1819 = true;
                    this.field3209.field1813 = null;
                    this.field3209.field1817 = this.field3237;
                    this.field3209.field1816 = var6;
                }
                if (arg2) {
                    this.field3248.field1819 = true;
                    this.field3248.field1813 = null;
                    this.field3248.field1817 = this.field3237;
                    this.field3248.field1816 = var6;
                }
                if (arg3) {
                    this.field3251.field1819 = true;
                    this.field3251.field1813 = null;
                    this.field3251.field1817 = this.field3237;
                    this.field3251.field1816 = var6;
                }
                if (arg4) {
                    this.field3245.field1819 = true;
                    this.field3245.field1813 = null;
                    this.field3245.field1817 = this.field3237;
                    this.field3245.field1816 = var6;
                }
            } else {
                if (field3240 == null || field3240.capacity() < field3220.field48) {
                    field3240 = ByteBuffer.allocateDirect(var6 * 100 + field3220.field48);
                } else {
                    field3240.clear();
                }
                field3240.put(field3220.field34, 0, field3220.field48);
                field3240.flip();
                if (arg1) {
                    this.field3209.field1819 = true;
                    this.field3209.field1813 = field3240;
                    this.field3209.field1817 = null;
                    this.field3209.field1816 = var6;
                }
                if (arg2) {
                    this.field3248.field1819 = true;
                    this.field3248.field1813 = field3240;
                    this.field3209.field1817 = null;
                    this.field3248.field1816 = var6;
                }
                if (arg3) {
                    this.field3251.field1819 = true;
                    this.field3251.field1813 = field3240;
                    this.field3251.field1817 = null;
                    this.field3251.field1816 = var6;
                }
                if (arg4) {
                    this.field3245.field1819 = true;
                    this.field3245.field1813 = field3240;
                    this.field3245.field1817 = null;
                    this.field3245.field1816 = var6;
                }
            }
        } else if (class162.field2639) {
            class312 var55 = new class312();
            ByteBuffer var56 = ByteBuffer.wrap(field3220.field34, 0, field3220.field48);
            var55.method2202(var56);
            if (arg1) {
                this.field3209.field1819 = true;
                this.field3209.field1813 = null;
                this.field3209.field1817 = var55;
                this.field3209.field1816 = var6;
            }
            if (arg2) {
                this.field3248.field1819 = true;
                this.field3248.field1813 = null;
                this.field3248.field1817 = var55;
                this.field3248.field1816 = var6;
            }
            if (arg3) {
                this.field3251.field1819 = true;
                this.field3251.field1813 = null;
                this.field3251.field1817 = var55;
                this.field3251.field1816 = var6;
            }
            if (arg4) {
                this.field3245.field1819 = true;
                this.field3245.field1813 = null;
                this.field3245.field1817 = var55;
                this.field3245.field1816 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3220.field48);
            var57.put(field3220.field34, 0, field3220.field48);
            var57.flip();
            if (arg1) {
                this.field3209.field1819 = true;
                this.field3209.field1813 = var57;
                this.field3209.field1817 = null;
                this.field3209.field1816 = var6;
            }
            if (arg2) {
                this.field3248.field1819 = true;
                this.field3248.field1813 = var57;
                this.field3209.field1817 = null;
                this.field3248.field1816 = var6;
            }
            if (arg3) {
                this.field3251.field1819 = true;
                this.field3251.field1813 = var57;
                this.field3251.field1817 = null;
                this.field3251.field1816 = var6;
            }
            if (arg4) {
                this.field3245.field1819 = true;
                this.field3245.field1813 = var57;
                this.field3245.field1817 = null;
                this.field3245.field1816 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(III)V", line = 3395)
    public final void method761(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3214; var4++) {
            this.field3215[var4] = this.field3215[var4] * arg0 >> 7;
            this.field3246[var4] = this.field3246[var4] * arg1 >> 7;
            this.field3233[var4] = this.field3233[var4] * arg2 >> 7;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "()Z", line = 3410)
    public final boolean method767() {
        if (this.field3234 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3214; var1++) {
            this.field3215[var1] <<= 0x4;
            this.field3246[var1] <<= 0x4;
            this.field3233[var1] <<= 0x4;
        }
        field3267 = 0;
        field3265 = 0;
        field3268 = 0;
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "()V", line = 3432)
    public static void method1516() {
        field3229 = null;
        field3220 = null;
        field3240 = null;
        field3250 = null;
        field3253 = null;
        field3254 = null;
        field3255 = null;
        field3256 = null;
        field3257 = null;
        field3260 = null;
        field3261 = null;
    }

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "()V", line = 3448)
    public final void method1517() {
        if (this.field3227 == null) {
            this.method748();
            return;
        }
        for (int var1 = 0; var1 < this.field3214; var1++) {
            int var2 = this.field3215[var1];
            this.field3215[var1] = this.field3233[var1];
            this.field3233[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3224; var3++) {
            short var4 = this.field3227[var3];
            this.field3227[var3] = this.field3241[var3];
            this.field3241[var3] = (short) (-var4);
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3485)
    private static final void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field3259 = var16;
        field3269 = var17;
    }

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "()V", line = 3529)
    public final void method1519() {
        int var10002;
        if (this.field3252 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3214; var3++) {
                int var4 = this.field3252[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3234 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3234[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3214) {
                int var7 = this.field3252[var6] & 0xFF;
                this.field3234[var7][var1[var7]++] = var6++;
            }
            this.field3252 = null;
        }
        if (this.field3228 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3226; var10++) {
            int var11 = this.field3228[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3247 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3247[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3226) {
            int var14 = this.field3228[var13] & 0xFF;
            this.field3247[var14][var8[var14]++] = var13++;
        }
        this.field3228 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZ)Lie;", line = 3628)
    public final class94 method743(boolean arg0, boolean arg1, boolean arg2) {
        return this.method1522(arg0, arg1, arg2, field3253, field3250);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 3631)
    private static final void method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field3258 = var18;
        field3266 = var19;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIJ)V", line = 3709)
    public final void method756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field3224 == 0) {
            return;
        }
        GL var10 = class162.field2654;
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
        this.method1499();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ISIB)I", line = 3733)
    private static final int method1521(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class40.field606[class271.method1923(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class40.field614.method250((byte) -115, arg1 & 0xFFFF);
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
            int var9 = class40.field614.method253(255, arg1 & 0xFFFF);
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

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)V", line = 3792)
    public final void method766(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3267 = 0;
            field3265 = 0;
            field3268 = 0;
            for (int var6 = 0; var6 < this.field3214; var6++) {
                field3267 += this.field3215[var6];
                field3265 += this.field3246[var6];
                field3268 += this.field3233[var6];
                var5++;
            }
            if (var5 > 0) {
                field3267 = field3267 / var5 + arg1;
                field3265 = field3265 / var5 + arg2;
                field3268 = field3268 / var5 + arg3;
            } else {
                field3267 = arg1;
                field3265 = arg2;
                field3268 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3214; var7++) {
                this.field3215[var7] += arg1;
                this.field3246[var7] += arg2;
                this.field3233[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3214; var8++) {
                this.field3215[var8] -= field3267;
                this.field3246[var8] -= field3265;
                this.field3233[var8] -= field3268;
                if (arg3 != 0) {
                    int var9 = class40.field612[arg3];
                    int var10 = class40.field619[arg3];
                    int var11 = this.field3246[var8] * var9 + this.field3215[var8] * var10 + 32767 >> 16;
                    this.field3246[var8] = this.field3246[var8] * var10 + 32767 - this.field3215[var8] * var9 >> 16;
                    this.field3215[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class40.field612[arg1];
                    int var13 = class40.field619[arg1];
                    int var14 = this.field3246[var8] * var13 + 32767 - this.field3233[var8] * var12 >> 16;
                    this.field3233[var8] = this.field3246[var8] * var12 + this.field3233[var8] * var13 + 32767 >> 16;
                    this.field3246[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class40.field612[arg2];
                    int var16 = class40.field619[arg2];
                    int var17 = this.field3233[var8] * var15 + this.field3215[var8] * var16 + 32767 >> 16;
                    this.field3233[var8] = this.field3233[var8] * var16 + 32767 - this.field3215[var8] * var15 >> 16;
                    this.field3215[var8] = var17;
                }
                this.field3215[var8] += field3267;
                this.field3246[var8] += field3265;
                this.field3233[var8] += field3268;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3214; var18++) {
                this.field3215[var18] -= field3267;
                this.field3246[var18] -= field3265;
                this.field3233[var18] -= field3268;
                this.field3215[var18] = this.field3215[var18] * arg1 / 128;
                this.field3246[var18] = this.field3246[var18] * arg2 / 128;
                this.field3233[var18] = this.field3233[var18] * arg3 / 128;
                this.field3215[var18] += field3267;
                this.field3246[var18] += field3265;
                this.field3233[var18] += field3268;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3226; var19++) {
                int var20 = (this.field3211[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3211[var19] = (byte) var20;
            }
            this.field3248.field1819 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field3226; var21++) {
                int var22 = this.field3230[var21] & 0xFFFF;
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
                this.field3230[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field3248.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "()V", line = 3996)
    public final void method747() {
        for (int var1 = 0; var1 < this.field3214; var1++) {
            int var2 = this.field3233[var1];
            this.field3233[var1] = this.field3215[var1];
            this.field3215[var1] = -var2;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZZLpl;Lpl;)Lie;", line = 4011)
    private final class94 method1522(boolean arg0, boolean arg1, boolean arg2, class206 arg3, class206 arg4) {
        arg3.field3214 = this.field3214;
        arg3.field3231 = this.field3231;
        arg3.field3224 = this.field3224;
        arg3.field3226 = this.field3226;
        arg3.field3232 = this.field3232;
        arg3.field3217 = this.field3217;
        arg3.field3242 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field3215 == null || arg3.field3215.length < this.field3214) {
            arg3.field3215 = new int[this.field3214 + 100];
            arg3.field3246 = new int[this.field3214 + 100];
            arg3.field3233 = new int[this.field3214 + 100];
        }
        for (int var6 = 0; var6 < this.field3214; var6++) {
            arg3.field3215[var6] = this.field3215[var6];
            arg3.field3246[var6] = this.field3246[var6];
            arg3.field3233[var6] = this.field3233[var6];
        }
        if (arg3.field3209 == null) {
            arg3.field3209 = new class112();
        }
        arg3.field3209.field1819 = false;
        if (arg3.field3219 == null) {
            arg3.field3219 = new class246();
        }
        arg3.field3219.field3668 = false;
        if (arg0) {
            arg3.field3211 = this.field3211;
        } else {
            if (arg4.field3211 == null || arg4.field3211.length < this.field3226) {
                arg4.field3211 = new byte[this.field3226 + 100];
            }
            arg3.field3211 = arg4.field3211;
            for (int var7 = 0; var7 < this.field3226; var7++) {
                arg3.field3211[var7] = this.field3211[var7];
            }
        }
        if (arg1) {
            arg3.field3230 = this.field3230;
        } else {
            if (arg4.field3230 == null || arg4.field3230.length < this.field3226) {
                arg4.field3230 = new short[this.field3226 + 100];
            }
            arg3.field3230 = arg4.field3230;
            for (int var8 = 0; var8 < this.field3226; var8++) {
                arg3.field3230[var8] = this.field3230[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field3248 = this.field3248;
        } else {
            if (arg4.field3248 == null) {
                arg4.field3248 = new class112();
            }
            arg3.field3248 = arg4.field3248;
            arg3.field3248.field1819 = false;
        }
        if (arg2 || this.field3227 == null) {
            arg3.field3227 = this.field3227;
            arg3.field3223 = this.field3223;
            arg3.field3241 = this.field3241;
            arg3.field3218 = this.field3218;
            arg3.field3251 = this.field3251;
        } else {
            if (arg4.field3227 == null || arg4.field3227.length < this.field3224) {
                arg4.field3227 = new short[this.field3224 + 100];
                arg4.field3223 = new short[this.field3224 + 100];
                arg4.field3241 = new short[this.field3224 + 100];
                arg4.field3218 = new short[this.field3224 + 100];
            }
            arg3.field3227 = arg4.field3227;
            arg3.field3223 = arg4.field3223;
            arg3.field3241 = arg4.field3241;
            arg3.field3218 = arg4.field3218;
            for (int var9 = 0; var9 < this.field3224; var9++) {
                arg3.field3227[var9] = this.field3227[var9];
                arg3.field3223[var9] = this.field3223[var9];
                arg3.field3241[var9] = this.field3241[var9];
                arg3.field3218[var9] = this.field3218[var9];
            }
            if (class229.field3531) {
                if (arg4.field3251 == null) {
                    arg4.field3251 = new class112();
                }
                arg3.field3251 = arg4.field3251;
                arg3.field3251.field1819 = false;
            } else {
                arg3.field3251 = null;
            }
        }
        arg3.field3238 = this.field3238;
        arg3.field3244 = this.field3244;
        arg3.field3252 = this.field3252;
        arg3.field3234 = this.field3234;
        arg3.field3216 = this.field3216;
        arg3.field3243 = this.field3243;
        arg3.field3225 = this.field3225;
        arg3.field3222 = this.field3222;
        arg3.field3228 = this.field3228;
        arg3.field3247 = this.field3247;
        arg3.field3245 = this.field3245;
        arg3.field3208 = this.field3208;
        arg3.field3235 = this.field3235;
        arg3.field3221 = this.field3221;
        arg3.field3236 = this.field3236;
        arg3.field1524 = this.field1524;
        arg3.field3210 = this.field3210;
        arg3.field3213 = this.field3213;
        return arg3;
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V", line = 4163)
    public final void method1523(int arg0) {
        this.field3217 = (short) arg0;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "()V", line = 4171)
    public final void method744() {
        for (int var1 = 0; var1 < this.field3214; var1++) {
            this.field3215[var1] = this.field3215[var1] + 7 >> 4;
            this.field3246[var1] = this.field3246[var1] + 7 >> 4;
            this.field3233[var1] = this.field3233[var1] + 7 >> 4;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "()V", line = 4186)
    public final void method1524() {
        for (int var1 = 0; var1 < this.field3214; var1++) {
            this.field3233[var1] = -this.field3233[var1];
        }
        if (this.field3241 != null) {
            for (int var2 = 0; var2 < this.field3224; var2++) {
                this.field3241[var2] = (short) (-this.field3241[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3226; var3++) {
            short var4 = this.field3216[var3];
            this.field3216[var3] = this.field3225[var3];
            this.field3225[var3] = var4;
        }
        this.field3219.field3668 = false;
        this.field3209.field1819 = false;
        if (this.field3251 != null) {
            this.field3251.field1819 = false;
        }
        this.field3208.field1819 = false;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(FFF)I", line = 4223)
    private static final int method1525(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIJILrb;)V", line = 4257)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10) {
        if (this.field3224 == 0) {
            return;
        }
        if (!this.field3219.field3668) {
            this.method1503();
        }
        short var13 = this.field3219.field3673;
        short var14 = this.field3219.field3671;
        short var15 = this.field3219.field3667;
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
        if (var21 / var18 <= class8.field198) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class179.field2851) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class149.field2428) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class323.field5064) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class40.field612[arg0];
            var27 = class40.field619[arg0];
        }
        if (arg8 > 0L && class342.field5301 && var19 > 0) {
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
            if (class109.field1784 >= var28 && class109.field1784 <= var29 && class106.field1745 >= var30 && class106.field1745 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field3219.field3669;
                short var37 = this.field3219.field3672;
                short var38 = this.field3219.field3670;
                short var39 = this.field3219.field3674;
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
                if (class109.field1784 >= var32 && class109.field1784 <= var33 && class106.field1745 >= var34 && class106.field1745 <= var35) {
                    if (this.field1524) {
                        class255.field3760[class79.field1236++] = arg8;
                    } else {
                        if (field3260.length < this.field3224) {
                            field3260 = new int[this.field3224];
                            field3261 = new int[this.field3224];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field3231) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field3226) {
                                        break label118;
                                    }
                                    short var80 = this.field3216[var79];
                                    short var81 = this.field3243[var79];
                                    short var82 = this.field3225[var79];
                                    if (this.method1495(class109.field1784, class106.field1745, field3261[var80], field3261[var81], field3261[var82], field3260[var80], field3260[var81], field3260[var82])) {
                                        class255.field3760[class79.field1236++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field3215[var59];
                            int var61 = this.field3246[var59];
                            int var62 = this.field3233[var59];
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
                            int var75 = this.field3236[var59];
                            int var76 = this.field3236[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field3221[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field3260[var78] = var73;
                                field3261[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class162.field2654;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1499();
        var83.glPopMatrix();
    }
}
