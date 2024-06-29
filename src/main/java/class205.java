import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class205 extends class264 {

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field3230 = 0;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field3245 = 0;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public int field3260 = 0;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "Z")
    private boolean field3233 = false;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "B")
    public byte field3273 = 0;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
    public int[] field3228;

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "[I")
    public int[] field3271;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[I")
    public int[] field3243;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "[I")
    public int[] field3269;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[I")
    public int[] field3238;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "[I")
    public int[] field3262;

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "[I")
    public int[] field3275;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[B")
    public byte[] field3264;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "[B")
    public byte[] field3232;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "[B")
    public byte[] field3237;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "[S")
    public short[] field3265;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "[S")
    public short[] field3255;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "[B")
    public byte[] field3253;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "[I")
    public int[] field3274;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "[B")
    public byte[] field3272;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "[S")
    public short[] field3252;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "[S")
    public short[] field3250;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "[S")
    public short[] field3227;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[S")
    private short[] field3267;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "[S")
    private short[] field3270;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "[S")
    private short[] field3277;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[B")
    private byte[] field3239;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "[B")
    private byte[] field3261;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "[B")
    private byte[] field3229;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[B")
    private byte[] field3244;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[B")
    private byte[] field3251;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[S")
    public short[] field3231;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "[S")
    public short[] field3235;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "[[I")
    public int[][] field3266;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "[[I")
    public int[][] field3268;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "[Lwi;")
    public class181[] field3263;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[Lrg;")
    public class255[] field3258;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "[Lwi;")
    public class181[] field3276;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "S")
    public short field3254;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "S")
    public short field3256;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    private static int[] field3242 = new int[10000];

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    private static int field3247 = 0;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "[I")
    private static int[] field3234 = class174.field2753;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "[I")
    private static int[] field3249 = class174.field2759;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[I")
    private static int[] field3240 = new int[10000];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "S")
    private short field3226;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "S")
    private short field3236;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "S")
    private short field3241;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "S")
    private short field3248;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "S")
    private short field3257;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "S")
    private short field3259;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    private final void method1419(int arg0) {
        int var2 = field3234[arg0];
        int var3 = field3249[arg0];
        for (int var4 = 0; var4 < this.field3230; var4++) {
            int var5 = this.field3271[var4] * var3 - this.field3243[var4] * var2 >> 16;
            this.field3243[var4] = this.field3271[var4] * var2 + this.field3243[var4] * var3 >> 16;
            this.field3271[var4] = var5;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
    public final void method1420(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3230; var4++) {
            this.field3228[var4] += arg0;
            this.field3271[var4] += arg1;
            this.field3243[var4] += arg2;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIII)Lwl;")
    public final class158 method1421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()V")
    public final void method1422() {
        for (int var1 = 0; var1 < this.field3230; var1++) {
            int var2 = this.field3243[var1];
            this.field3243[var1] = this.field3228[var1];
            this.field3228[var1] = -var2;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lpb;IIIZ)V")
    public final void method1423(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class205 var6 = (class205) arg0;
        var6.method1450();
        var6.method1431();
        field3247++;
        int var7 = 0;
        int[] var8 = var6.field3228;
        int var9 = var6.field3245;
        for (int var10 = 0; var10 < this.field3245; var10++) {
            class181 var13 = this.field3263[var10];
            if (var13.field2889 != 0) {
                int var14 = this.field3271[var10] - arg2;
                if (var14 >= var6.field3259 && var14 <= var6.field3226) {
                    int var15 = this.field3228[var10] - arg1;
                    if (var15 >= var6.field3241 && var15 <= var6.field3248) {
                        int var16 = this.field3243[var10] - arg3;
                        if (var16 >= var6.field3257 && var16 <= var6.field3236) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class181 var18 = var6.field3263[var17];
                                if (var8[var17] == var15 && var6.field3243[var17] == var16 && var6.field3271[var17] == var14 && var18.field2889 != 0) {
                                    if (this.field3276 == null) {
                                        this.field3276 = new class181[this.field3245];
                                    }
                                    if (var6.field3276 == null) {
                                        var6.field3276 = new class181[var9];
                                    }
                                    class181 var19 = this.field3276[var10];
                                    if (var19 == null) {
                                        var19 = this.field3276[var10] = new class181(var13);
                                    }
                                    class181 var20 = var6.field3276[var17];
                                    if (var20 == null) {
                                        var20 = var6.field3276[var17] = new class181(var18);
                                    }
                                    var19.field2880 += var18.field2880;
                                    var19.field2879 += var18.field2879;
                                    var19.field2882 += var18.field2882;
                                    var19.field2889 += var18.field2889;
                                    var20.field2880 += var13.field2880;
                                    var20.field2879 += var13.field2879;
                                    var20.field2882 += var13.field2882;
                                    var20.field2889 += var13.field2889;
                                    var7++;
                                    field3242[var10] = field3247;
                                    field3240[var17] = field3247;
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
        for (int var11 = 0; var11 < this.field3260; var11++) {
            if (field3242[this.field3238[var11]] == field3247 && field3242[this.field3262[var11]] == field3247 && field3242[this.field3275[var11]] == field3247) {
                if (this.field3264 == null) {
                    this.field3264 = new byte[this.field3260];
                }
                this.field3264[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field3260; var12++) {
            if (field3240[var6.field3238[var12]] == field3247 && field3240[var6.field3262[var12]] == field3247 && field3240[var6.field3275[var12]] == field3247) {
                if (var6.field3264 == null) {
                    var6.field3264 = new byte[var6.field3260];
                }
                var6.field3264[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([[III)I")
    private static final int method1424(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lbf;IS)I")
    private final int method1425(class205 arg0, int arg1, short arg2) {
        int var4 = arg0.field3228[arg1];
        int var5 = arg0.field3271[arg1];
        int var6 = arg0.field3243[arg1];
        for (int var7 = 0; var7 < this.field3230; var7++) {
            if (this.field3228[var7] == var4 && this.field3271[var7] == var5 && this.field3243[var7] == var6) {
                this.field3231[var7] |= arg2;
                return var7;
            }
        }
        this.field3228[this.field3230] = var4;
        this.field3271[this.field3230] = var5;
        this.field3243[this.field3230] = var6;
        this.field3231[this.field3230] = arg2;
        if (arg0.field3269 != null) {
            this.field3269[this.field3230] = arg0.field3269[arg1];
        }
        return this.field3230++;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final void method1426(int arg0) {
        int var2 = field3234[arg0];
        int var3 = field3249[arg0];
        for (int var4 = 0; var4 < this.field3230; var4++) {
            int var5 = this.field3243[var4] * var2 + this.field3228[var4] * var3 >> 16;
            this.field3243[var4] = this.field3243[var4] * var3 - this.field3228[var4] * var2 >> 16;
            this.field3228[var4] = var5;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
    public final void method1427() {
        for (int var1 = 0; var1 < this.field3230; var1++) {
            this.field3228[var1] = -this.field3228[var1];
            this.field3243[var1] = -this.field3243[var1];
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
    public final void method1428() {
        int var10002;
        if (this.field3269 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3230; var3++) {
                int var7 = this.field3269[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3266 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field3266[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3230) {
                int var6 = this.field3269[var5];
                this.field3266[var6][var1[var6]++] = var5++;
            }
            this.field3269 = null;
        }
        if (this.field3274 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3260; var10++) {
            int var14 = this.field3274[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field3268 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field3268[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field3260) {
            int var13 = this.field3274[var12];
            this.field3268[var13][var8[var13]++] = var12++;
        }
        this.field3274 = null;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "()V")
    private final void method1429() {
        this.field3263 = null;
        this.field3276 = null;
        this.field3258 = null;
        this.field3233 = false;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(IIIII)Lb;")
    public final class125 method1430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class125(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "()V")
    public final void method1431() {
        if (this.field3263 != null) {
            return;
        }
        this.field3263 = new class181[this.field3245];
        for (int var1 = 0; var1 < this.field3245; var1++) {
            this.field3263[var1] = new class181();
        }
        for (int var2 = 0; var2 < this.field3260; var2++) {
            int var3 = this.field3238[var2];
            int var4 = this.field3262[var2];
            int var5 = this.field3275[var2];
            int var6 = this.field3228[var4] - this.field3228[var3];
            int var7 = this.field3271[var4] - this.field3271[var3];
            int var8 = this.field3243[var4] - this.field3243[var3];
            int var9 = this.field3228[var5] - this.field3228[var3];
            int var10 = this.field3271[var5] - this.field3271[var3];
            int var11 = this.field3243[var5] - this.field3243[var3];
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
            if (this.field3264 == null) {
                var19 = 0;
            } else {
                var19 = this.field3264[var2];
            }
            if (var19 == 0) {
                class181 var20 = this.field3263[var3];
                var20.field2880 += var16;
                var20.field2879 += var17;
                var20.field2882 += var18;
                var20.field2889++;
                class181 var21 = this.field3263[var4];
                var21.field2880 += var16;
                var21.field2879 += var17;
                var21.field2882 += var18;
                var21.field2889++;
                class181 var22 = this.field3263[var5];
                var22.field2880 += var16;
                var22.field2879 += var17;
                var22.field2882 += var18;
                var22.field2889++;
            } else if (var19 == 1) {
                if (this.field3258 == null) {
                    this.field3258 = new class255[this.field3260];
                }
                class255 var23 = this.field3258[var2] = new class255();
                var23.field4136 = var16;
                var23.field4138 = var17;
                var23.field4137 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    private final void method1432(int arg0) {
        int var2 = field3234[arg0];
        int var3 = field3249[arg0];
        for (int var4 = 0; var4 < this.field3230; var4++) {
            int var5 = this.field3271[var4] * var2 + this.field3228[var4] * var3 >> 16;
            this.field3271[var4] = this.field3271[var4] * var3 - this.field3228[var4] * var2 >> 16;
            this.field3228[var4] = var5;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)I")
    public final int method1433(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3230; var4++) {
            if (this.field3228[var4] == arg0 && this.field3271[var4] == arg1 && this.field3243[var4] == arg2) {
                return var4;
            }
        }
        this.field3228[this.field3230] = arg0;
        this.field3271[this.field3230] = arg1;
        this.field3243[this.field3230] = arg2;
        this.field3245 = ++this.field3230;
        return this.field3230 - 1;
    }

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "()Lbf;")
    public final class205 method1434() {
        class205 var1 = new class205();
        if (this.field3264 != null) {
            var1.field3264 = new byte[this.field3260];
            for (int var2 = 0; var2 < this.field3260; var2++) {
                var1.field3264[var2] = this.field3264[var2];
            }
        }
        var1.field3230 = this.field3230;
        var1.field3245 = this.field3245;
        var1.field3260 = this.field3260;
        var1.field3246 = this.field3246;
        var1.field3228 = this.field3228;
        var1.field3271 = this.field3271;
        var1.field3243 = this.field3243;
        var1.field3238 = this.field3238;
        var1.field3262 = this.field3262;
        var1.field3275 = this.field3275;
        var1.field3232 = this.field3232;
        var1.field3237 = this.field3237;
        var1.field3253 = this.field3253;
        var1.field3265 = this.field3265;
        var1.field3255 = this.field3255;
        var1.field3273 = this.field3273;
        var1.field3272 = this.field3272;
        var1.field3252 = this.field3252;
        var1.field3250 = this.field3250;
        var1.field3227 = this.field3227;
        var1.field3267 = this.field3267;
        var1.field3270 = this.field3270;
        var1.field3277 = this.field3277;
        var1.field3239 = this.field3239;
        var1.field3261 = this.field3261;
        var1.field3229 = this.field3229;
        var1.field3244 = this.field3244;
        var1.field3251 = this.field3251;
        var1.field3269 = this.field3269;
        var1.field3274 = this.field3274;
        var1.field3266 = this.field3266;
        var1.field3268 = this.field3268;
        var1.field3263 = this.field3263;
        var1.field3258 = this.field3258;
        var1.field3254 = this.field3254;
        var1.field3256 = this.field3256;
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
    private final void method1435(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class96 var4 = new class96(arg0);
        class96 var5 = new class96(arg0);
        class96 var6 = new class96(arg0);
        class96 var7 = new class96(arg0);
        class96 var8 = new class96(arg0);
        var4.field1228 = arg0.length - 18;
        int var9 = var4.method549(255);
        int var10 = var4.method549(255);
        int var11 = var4.method584(255);
        int var12 = var4.method584(255);
        int var13 = var4.method584(255);
        int var14 = var4.method584(255);
        int var15 = var4.method584(255);
        int var16 = var4.method584(255);
        int var17 = var4.method549(255);
        int var18 = var4.method549(255);
        int var19 = var4.method549(255);
        int var20 = var4.method549(255);
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
        this.field3230 = var9;
        this.field3260 = var10;
        this.field3246 = var11;
        this.field3228 = new int[var9];
        this.field3271 = new int[var9];
        this.field3243 = new int[var9];
        this.field3238 = new int[var10];
        this.field3262 = new int[var10];
        this.field3275 = new int[var10];
        if (var11 > 0) {
            this.field3272 = new byte[var11];
            this.field3252 = new short[var11];
            this.field3250 = new short[var11];
            this.field3227 = new short[var11];
        }
        if (var16 == 1) {
            this.field3269 = new int[var9];
        }
        if (var12 == 1) {
            this.field3264 = new byte[var10];
            this.field3253 = new byte[var10];
            this.field3255 = new short[var10];
        }
        if (var13 == 255) {
            this.field3232 = new byte[var10];
        } else {
            this.field3273 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3237 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3274 = new int[var10];
        }
        this.field3265 = new short[var10];
        var4.field1228 = var21;
        var5.field1228 = var36;
        var6.field1228 = var38;
        var7.field1228 = var40;
        var8.field1228 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method584(255);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method565(-114);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method565(-91);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method565(-97);
            }
            this.field3228[var46] = var43 + var63;
            this.field3271[var46] = var44 + var64;
            this.field3243[var46] = var45 + var65;
            var43 = this.field3228[var46];
            var44 = this.field3271[var46];
            var45 = this.field3243[var46];
            if (var16 == 1) {
                this.field3269[var46] = var8.method584(255);
            }
        }
        var4.field1228 = var32;
        var5.field1228 = var28;
        var6.field1228 = var26;
        var7.field1228 = var30;
        var8.field1228 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field3265[var47] = (short) var4.method549(255);
            if (var12 == 1) {
                int var61 = var5.method584(255);
                if ((var61 & 0x1) == 1) {
                    this.field3264[var47] = 1;
                    var2 = true;
                } else {
                    this.field3264[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field3253[var47] = (byte) (var61 >> 2);
                    this.field3255[var47] = this.field3265[var47];
                    this.field3265[var47] = 127;
                    if (this.field3255[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3253[var47] = -1;
                    this.field3255[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3232[var47] = var6.method587(-54);
            }
            if (var14 == 1) {
                this.field3237[var47] = var7.method587(107);
            }
            if (var15 == 1) {
                this.field3274[var47] = var8.method584(255);
            }
        }
        this.field3245 = -1;
        var4.field1228 = var25;
        var5.field1228 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method584(255);
            if (var57 == 1) {
                var48 = var4.method565(-111) + var51;
                var49 = var4.method565(-84) + var48;
                var50 = var4.method565(-102) + var49;
                var51 = var50;
                this.field3238[var52] = var48;
                this.field3262[var52] = var49;
                this.field3275[var52] = var50;
                if (var48 > this.field3245) {
                    this.field3245 = var48;
                }
                if (var49 > this.field3245) {
                    this.field3245 = var49;
                }
                if (var50 > this.field3245) {
                    this.field3245 = var50;
                }
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method565(-77) + var51;
                var51 = var50;
                this.field3238[var52] = var48;
                this.field3262[var52] = var49;
                this.field3275[var52] = var50;
                if (var50 > this.field3245) {
                    this.field3245 = var50;
                }
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method565(-108) + var51;
                var51 = var50;
                this.field3238[var52] = var48;
                this.field3262[var52] = var49;
                this.field3275[var52] = var50;
                if (var50 > this.field3245) {
                    this.field3245 = var50;
                }
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method565(-105) + var51;
                var51 = var50;
                this.field3238[var52] = var48;
                this.field3262[var52] = var60;
                this.field3275[var52] = var50;
                if (var50 > this.field3245) {
                    this.field3245 = var50;
                }
            }
        }
        this.field3245++;
        var4.field1228 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field3272[var53] = 0;
            this.field3252[var53] = (short) var4.method549(255);
            this.field3250[var53] = (short) var4.method549(255);
            this.field3227[var53] = (short) var4.method549(255);
        }
        if (this.field3253 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field3253[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field3252[var56] & 0xFFFF) == this.field3238[var55] && (this.field3250[var56] & 0xFFFF) == this.field3262[var55] && (this.field3227[var56] & 0xFFFF) == this.field3275[var55]) {
                        this.field3253[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3253 = null;
            }
        }
        if (!var3) {
            this.field3255 = null;
        }
        if (!var2) {
            this.field3264 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lpb;")
    public final class264 method1436(int arg0, int arg1, int arg2) {
        return this.method1421(this.field3254, this.field3256, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "()V")
    public final void method1437() {
        for (int var1 = 0; var1 < this.field3230; var1++) {
            int var2 = this.field3228[var1];
            this.field3228[var1] = this.field3243[var1];
            this.field3243[var1] = -var2;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(SS)V")
    public final void method1438(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3260; var3++) {
            if (this.field3265[var3] == arg0) {
                this.field3265[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I[[IIIIZZ)Lbf;")
    public final class205 method1439(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1450();
        int var10 = this.field3241 + arg4;
        int var11 = this.field3248 + arg4;
        int var12 = this.field3257 + arg6;
        int var13 = this.field3236 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length) {
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
        class205 var18;
        if (arg7) {
            var18 = new class205();
            var18.field3230 = this.field3230;
            var18.field3245 = this.field3245;
            var18.field3260 = this.field3260;
            var18.field3246 = this.field3246;
            var18.field3238 = this.field3238;
            var18.field3262 = this.field3262;
            var18.field3275 = this.field3275;
            var18.field3264 = this.field3264;
            var18.field3232 = this.field3232;
            var18.field3237 = this.field3237;
            var18.field3253 = this.field3253;
            var18.field3265 = this.field3265;
            var18.field3255 = this.field3255;
            var18.field3273 = this.field3273;
            var18.field3272 = this.field3272;
            var18.field3252 = this.field3252;
            var18.field3250 = this.field3250;
            var18.field3227 = this.field3227;
            var18.field3267 = this.field3267;
            var18.field3270 = this.field3270;
            var18.field3277 = this.field3277;
            var18.field3239 = this.field3239;
            var18.field3261 = this.field3261;
            var18.field3229 = this.field3229;
            var18.field3244 = this.field3244;
            var18.field3251 = this.field3251;
            var18.field3269 = this.field3269;
            var18.field3274 = this.field3274;
            var18.field3266 = this.field3266;
            var18.field3268 = this.field3268;
            var18.field3254 = this.field3254;
            var18.field3256 = this.field3256;
            var18.field3263 = this.field3263;
            var18.field3258 = this.field3258;
            var18.field3276 = this.field3276;
            if (arg0 == 3) {
                var18.field3228 = class238.method1681((byte) 64, this.field3228);
                var18.field3271 = class238.method1681((byte) 118, this.field3271);
                var18.field3243 = class238.method1681((byte) 93, this.field3243);
            } else {
                var18.field3228 = this.field3228;
                var18.field3271 = new int[var18.field3230];
                var18.field3243 = this.field3243;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3245; var19++) {
                int var30 = this.field3228[var19] + arg4;
                int var31 = this.field3243[var19] + arg6;
                int var32 = var30 & 0x7F;
                int var33 = var31 & 0x7F;
                int var34 = var30 >> 7;
                int var35 = var31 >> 7;
                int var36 = (128 - var32) * arg2[var34][var35] + arg2[var34 + 1][var35] * var32 >> 7;
                int var37 = (128 - var32) * arg2[var34][var35 + 1] + arg2[var34 + 1][var35 + 1] * var32 >> 7;
                int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                var18.field3271[var19] = this.field3271[var19] + var38 - arg5;
            }
            for (int var20 = var18.field3245; var20 < var18.field3230; var20++) {
                int var21 = this.field3228[var20] + arg4;
                int var22 = this.field3243[var20] + arg6;
                int var23 = var21 & 0x7F;
                int var24 = var22 & 0x7F;
                int var25 = var21 >> 7;
                int var26 = var22 >> 7;
                if (var25 >= 0 && var25 < arg2.length - 1 && var26 >= 0 && var26 < arg2[0].length - 1) {
                    int var27 = (128 - var23) * arg2[var25][var26] + arg2[var25 + 1][var26] * var23 >> 7;
                    int var28 = (128 - var23) * arg2[var25][var26 + 1] + arg2[var25 + 1][var26 + 1] * var23 >> 7;
                    int var29 = (128 - var24) * var27 + var24 * var28 >> 7;
                    var18.field3271[var20] = this.field3271[var20] + var29 - arg5;
                }
            }
        } else if (arg0 == 2) {
            for (int var39 = 0; var39 < var18.field3245; var39++) {
                int var51 = (this.field3271[var39] << 16) / this.field3259;
                if (var51 < arg1) {
                    int var52 = this.field3228[var39] + arg4;
                    int var53 = this.field3243[var39] + arg6;
                    int var54 = var52 & 0x7F;
                    int var55 = var53 & 0x7F;
                    int var56 = var52 >> 7;
                    int var57 = var53 >> 7;
                    int var58 = (128 - var54) * arg2[var56][var57] + arg2[var56 + 1][var57] * var54 >> 7;
                    int var59 = (128 - var54) * arg2[var56][var57 + 1] + arg2[var56 + 1][var57 + 1] * var54 >> 7;
                    int var60 = (128 - var55) * var58 + var55 * var59 >> 7;
                    var18.field3271[var39] = (arg1 - var51) * (var60 - arg5) / arg1 + this.field3271[var39];
                } else {
                    var18.field3271[var39] = this.field3271[var39];
                }
            }
            for (int var40 = var18.field3245; var40 < var18.field3230; var40++) {
                int var41 = (this.field3271[var40] << 16) / this.field3259;
                if (var41 < arg1) {
                    int var42 = this.field3228[var40] + arg4;
                    int var43 = this.field3243[var40] + arg6;
                    int var44 = var42 & 0x7F;
                    int var45 = var43 & 0x7F;
                    int var46 = var42 >> 7;
                    int var47 = var43 >> 7;
                    if (var46 >= 0 && var46 < arg2.length - 1 && var47 >= 0 && var47 < arg2[0].length - 1) {
                        int var48 = (128 - var44) * arg2[var46][var47] + arg2[var46 + 1][var47] * var44 >> 7;
                        int var49 = (128 - var44) * arg2[var46][var47 + 1] + arg2[var46 + 1][var47 + 1] * var44 >> 7;
                        int var50 = (128 - var45) * var48 + var45 * var49 >> 7;
                        var18.field3271[var40] = (arg1 - var41) * (var50 - arg5) / arg1 + this.field3271[var40];
                    }
                } else {
                    var18.field3271[var40] = this.field3271[var40];
                }
            }
        } else if (arg0 == 3) {
            int var61 = (arg1 & 0xFF) * 4;
            int var62 = (arg1 >> 8 & 0xFF) * 4;
            var18.method1441(arg2, arg4, arg5, arg6, var61, var62);
        } else if (arg0 == 4) {
            int var63 = this.field3226 - this.field3259;
            for (int var64 = 0; var64 < this.field3245; var64++) {
                int var75 = this.field3228[var64] + arg4;
                int var76 = this.field3243[var64] + arg6;
                int var77 = var75 & 0x7F;
                int var78 = var76 & 0x7F;
                int var79 = var75 >> 7;
                int var80 = var76 >> 7;
                int var81 = (128 - var77) * arg3[var79][var80] + arg3[var79 + 1][var80] * var77 >> 7;
                int var82 = (128 - var77) * arg3[var79][var80 + 1] + arg3[var79 + 1][var80 + 1] * var77 >> 7;
                int var83 = (128 - var78) * var81 + var78 * var82 >> 7;
                var18.field3271[var64] = var83 + this.field3271[var64] + var63 - arg5;
            }
            for (int var65 = var18.field3245; var65 < var18.field3230; var65++) {
                int var66 = this.field3228[var65] + arg4;
                int var67 = this.field3243[var65] + arg6;
                int var68 = var66 & 0x7F;
                int var69 = var67 & 0x7F;
                int var70 = var66 >> 7;
                int var71 = var67 >> 7;
                if (var70 >= 0 && var70 < arg3.length - 1 && var71 >= 0 && var71 < arg3[0].length - 1) {
                    int var72 = (128 - var68) * arg3[var70][var71] + arg3[var70 + 1][var71] * var68 >> 7;
                    int var73 = (128 - var68) * arg3[var70][var71 + 1] + arg3[var70 + 1][var71 + 1] * var68 >> 7;
                    int var74 = (128 - var69) * var72 + var69 * var73 >> 7;
                    var18.field3271[var65] = var74 + this.field3271[var65] + var63 - arg5;
                }
            }
        } else if (arg0 == 5) {
            int var84 = this.field3226 - this.field3259;
            for (int var85 = 0; var85 < this.field3245; var85++) {
                int var100 = this.field3228[var85] + arg4;
                int var101 = this.field3243[var85] + arg6;
                int var102 = var100 & 0x7F;
                int var103 = var101 & 0x7F;
                int var104 = var100 >> 7;
                int var105 = var101 >> 7;
                int var106 = (128 - var102) * arg2[var104][var105] + arg2[var104 + 1][var105] * var102 >> 7;
                int var107 = (128 - var102) * arg2[var104][var105 + 1] + arg2[var104 + 1][var105 + 1] * var102 >> 7;
                int var108 = (128 - var103) * var106 + var103 * var107 >> 7;
                int var109 = (128 - var102) * arg3[var104][var105] + arg3[var104 + 1][var105] * var102 >> 7;
                int var110 = (128 - var102) * arg3[var104][var105 + 1] + arg3[var104 + 1][var105 + 1] * var102 >> 7;
                int var111 = (128 - var103) * var109 + var103 * var110 >> 7;
                int var112 = var108 - var111;
                var18.field3271[var85] = ((this.field3271[var85] << 8) / var84 * var112 >> 8) - (arg5 - var108);
            }
            for (int var86 = var18.field3245; var86 < var18.field3230; var86++) {
                int var87 = this.field3228[var86] + arg4;
                int var88 = this.field3243[var86] + arg6;
                int var89 = var87 & 0x7F;
                int var90 = var88 & 0x7F;
                int var91 = var87 >> 7;
                int var92 = var88 >> 7;
                if (var91 >= 0 && var91 < arg2.length - 1 && var91 < arg3.length - 1 && var92 >= 0 && var92 < arg2[0].length - 1 && var92 < arg3[0].length - 1) {
                    int var93 = (128 - var89) * arg2[var91][var92] + arg2[var91 + 1][var92] * var89 >> 7;
                    int var94 = (128 - var89) * arg2[var91][var92 + 1] + arg2[var91 + 1][var92 + 1] * var89 >> 7;
                    int var95 = (128 - var90) * var93 + var90 * var94 >> 7;
                    int var96 = (128 - var89) * arg3[var91][var92] + arg3[var91 + 1][var92] * var89 >> 7;
                    int var97 = (128 - var89) * arg3[var91][var92 + 1] + arg3[var91 + 1][var92 + 1] * var89 >> 7;
                    int var98 = (128 - var90) * var96 + var90 * var97 >> 7;
                    int var99 = var95 - var98;
                    var18.field3271[var86] = ((this.field3271[var86] << 8) / var84 * var99 >> 8) - (arg5 - var95);
                }
            }
        }
        if (arg8) {
            var18.method1429();
        } else {
            this.field3233 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()Z")
    public final boolean method1440() {
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([[IIIIII)V")
    private final void method1441(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1424(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1424(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1424(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1424(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1419(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1432(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1420(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "()V")
    public final void method1442() {
        for (int var1 = 0; var1 < this.field3230; var1++) {
            this.field3243[var1] = -this.field3243[var1];
        }
        for (int var2 = 0; var2 < this.field3260; var2++) {
            int var3 = this.field3238[var2];
            this.field3238[var2] = this.field3275[var2];
            this.field3275[var2] = var3;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([B)V")
    private final void method1443(byte[] arg0) {
        class96 var2 = new class96(arg0);
        class96 var3 = new class96(arg0);
        class96 var4 = new class96(arg0);
        class96 var5 = new class96(arg0);
        class96 var6 = new class96(arg0);
        class96 var7 = new class96(arg0);
        class96 var8 = new class96(arg0);
        var2.field1228 = arg0.length - 23;
        int var9 = var2.method549(255);
        int var10 = var2.method549(255);
        int var11 = var2.method584(255);
        int var12 = var2.method584(255);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method584(255);
        int var16 = var2.method584(255);
        int var17 = var2.method584(255);
        int var18 = var2.method584(255);
        int var19 = var2.method584(255);
        int var20 = var2.method549(255);
        int var21 = var2.method549(255);
        int var22 = var2.method549(255);
        int var23 = var2.method549(255);
        int var24 = var2.method549(255);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field3272 = new byte[var11];
            var2.field1228 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field3272[var28] = var2.method587(34);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field3230 = var9;
        this.field3260 = var10;
        this.field3246 = var11;
        this.field3228 = new int[var9];
        this.field3271 = new int[var9];
        this.field3243 = new int[var9];
        this.field3238 = new int[var10];
        this.field3262 = new int[var10];
        this.field3275 = new int[var10];
        if (var19 == 1) {
            this.field3269 = new int[var9];
        }
        if (var13) {
            this.field3264 = new byte[var10];
        }
        if (var15 == 255) {
            this.field3232 = new byte[var10];
        } else {
            this.field3273 = (byte) var15;
        }
        if (var16 == 1) {
            this.field3237 = new byte[var10];
        }
        if (var17 == 1) {
            this.field3274 = new int[var10];
        }
        if (var18 == 1) {
            this.field3255 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field3253 = new byte[var10];
        }
        this.field3265 = new short[var10];
        if (var11 > 0) {
            this.field3252 = new short[var11];
            this.field3250 = new short[var11];
            this.field3227 = new short[var11];
            if (var26 > 0) {
                this.field3267 = new short[var26];
                this.field3270 = new short[var26];
                this.field3277 = new short[var26];
                this.field3239 = new byte[var26];
                this.field3261 = new byte[var26];
                this.field3229 = new byte[var26];
            }
            if (var27 > 0) {
                this.field3244 = new byte[var27];
                this.field3251 = new byte[var27];
            }
        }
        var2.field1228 = var11;
        var3.field1228 = var46;
        var4.field1228 = var48;
        var5.field1228 = var50;
        var6.field1228 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method584(255);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method565(-92);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method565(-111);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method565(-125);
            }
            this.field3228[var69] = var66 + var85;
            this.field3271[var69] = var67 + var86;
            this.field3243[var69] = var68 + var87;
            var66 = this.field3228[var69];
            var67 = this.field3271[var69];
            var68 = this.field3243[var69];
            if (var19 == 1) {
                this.field3269[var69] = var6.method584(255);
            }
        }
        var2.field1228 = var44;
        var3.field1228 = var33;
        var4.field1228 = var36;
        var5.field1228 = var39;
        var6.field1228 = var37;
        var7.field1228 = var42;
        var8.field1228 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field3265[var70] = (short) var2.method549(255);
            if (var13) {
                this.field3264[var70] = var3.method587(110);
            }
            if (var15 == 255) {
                this.field3232[var70] = var4.method587(-85);
            }
            if (var16 == 1) {
                this.field3237[var70] = var5.method587(118);
            }
            if (var17 == 1) {
                this.field3274[var70] = var6.method584(255);
            }
            if (var18 == 1) {
                this.field3255[var70] = (short) (var7.method549(255) - 1);
            }
            if (this.field3253 != null) {
                if (this.field3255[var70] == -1) {
                    this.field3253[var70] = -1;
                } else {
                    this.field3253[var70] = (byte) (var8.method584(255) - 1);
                }
            }
        }
        this.field3245 = -1;
        var2.field1228 = var35;
        var3.field1228 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method584(255);
            if (var80 == 1) {
                var71 = var2.method565(-79) + var74;
                var72 = var2.method565(-79) + var71;
                var73 = var2.method565(-105) + var72;
                var74 = var73;
                this.field3238[var75] = var71;
                this.field3262[var75] = var72;
                this.field3275[var75] = var73;
                if (var71 > this.field3245) {
                    this.field3245 = var71;
                }
                if (var72 > this.field3245) {
                    this.field3245 = var72;
                }
                if (var73 > this.field3245) {
                    this.field3245 = var73;
                }
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method565(-102) + var74;
                var74 = var73;
                this.field3238[var75] = var71;
                this.field3262[var75] = var72;
                this.field3275[var75] = var73;
                if (var73 > this.field3245) {
                    this.field3245 = var73;
                }
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method565(-90) + var74;
                var74 = var73;
                this.field3238[var75] = var71;
                this.field3262[var75] = var72;
                this.field3275[var75] = var73;
                if (var73 > this.field3245) {
                    this.field3245 = var73;
                }
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method565(-119) + var74;
                var74 = var73;
                this.field3238[var75] = var71;
                this.field3262[var75] = var83;
                this.field3275[var75] = var73;
                if (var73 > this.field3245) {
                    this.field3245 = var73;
                }
            }
        }
        this.field3245++;
        var2.field1228 = var52;
        var3.field1228 = var54;
        var4.field1228 = var56;
        var5.field1228 = var58;
        var6.field1228 = var60;
        var7.field1228 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field3272[var76] & 0xFF;
            if (var79 == 0) {
                this.field3252[var76] = (short) var2.method549(255);
                this.field3250[var76] = (short) var2.method549(255);
                this.field3227[var76] = (short) var2.method549(255);
            }
            if (var79 == 1) {
                this.field3252[var76] = (short) var3.method549(255);
                this.field3250[var76] = (short) var3.method549(255);
                this.field3227[var76] = (short) var3.method549(255);
                this.field3267[var76] = (short) var4.method549(255);
                this.field3270[var76] = (short) var4.method549(255);
                this.field3277[var76] = (short) var4.method549(255);
                this.field3239[var76] = var5.method587(110);
                this.field3261[var76] = var6.method587(-67);
                this.field3229[var76] = var7.method587(119);
            }
            if (var79 == 2) {
                this.field3252[var76] = (short) var3.method549(255);
                this.field3250[var76] = (short) var3.method549(255);
                this.field3227[var76] = (short) var3.method549(255);
                this.field3267[var76] = (short) var4.method549(255);
                this.field3270[var76] = (short) var4.method549(255);
                this.field3277[var76] = (short) var4.method549(255);
                this.field3239[var76] = var5.method587(-64);
                this.field3261[var76] = var6.method587(121);
                this.field3229[var76] = var7.method587(-91);
                this.field3244[var76] = var7.method587(122);
                this.field3251[var76] = var7.method587(120);
            }
            if (var79 == 3) {
                this.field3252[var76] = (short) var3.method549(255);
                this.field3250[var76] = (short) var3.method549(255);
                this.field3227[var76] = (short) var3.method549(255);
                this.field3267[var76] = (short) var4.method549(255);
                this.field3270[var76] = (short) var4.method549(255);
                this.field3277[var76] = (short) var4.method549(255);
                this.field3239[var76] = var5.method587(-80);
                this.field3261[var76] = var6.method587(123);
                this.field3229[var76] = var7.method587(17);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1228 = var64;
        int var77 = var2.method584(255);
        if (var77 > 0) {
            var2.field1228 += var77 * 4;
        }
        int var78 = var2.method584(255);
        if (var78 > 0) {
            var2.field1228 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Leh;II)Lbf;")
    public static final class205 method1444(class137 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method928(arg1, (byte) 115, arg2);
        return var3 == null ? null : new class205(var3);
    }

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "()V")
    public final void method1445() {
        this.field3269 = null;
        this.field3274 = null;
        this.field3266 = null;
        this.field3268 = null;
    }

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "()V")
    public static void method1446() {
        field3242 = null;
        field3240 = null;
        field3234 = null;
        field3249 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBSB)I")
    public final int method1447(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3238[this.field3260] = arg0;
        this.field3262[this.field3260] = arg1;
        this.field3275[this.field3260] = arg2;
        this.field3264[this.field3260] = arg3;
        this.field3253[this.field3260] = -1;
        this.field3265[this.field3260] = arg4;
        this.field3255[this.field3260] = -1;
        this.field3237[this.field3260] = arg5;
        return this.field3260++;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(III)V")
    public final void method1448(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3234[arg2];
            int var5 = field3249[arg2];
            for (int var6 = 0; var6 < this.field3230; var6++) {
                int var7 = this.field3271[var6] * var4 + this.field3228[var6] * var5 >> 16;
                this.field3271[var6] = this.field3271[var6] * var5 - this.field3228[var6] * var4 >> 16;
                this.field3228[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3234[arg0];
            int var9 = field3249[arg0];
            for (int var10 = 0; var10 < this.field3230; var10++) {
                int var11 = this.field3271[var10] * var9 - this.field3243[var10] * var8 >> 16;
                this.field3243[var10] = this.field3271[var10] * var8 + this.field3243[var10] * var9 >> 16;
                this.field3271[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3234[arg1];
        int var13 = field3249[arg1];
        for (int var14 = 0; var14 < this.field3230; var14++) {
            int var15 = this.field3243[var14] * var12 + this.field3228[var14] * var13 >> 16;
            this.field3243[var14] = this.field3243[var14] * var13 - this.field3228[var14] * var12 >> 16;
            this.field3228[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(SS)V")
    public final void method1449(short arg0, short arg1) {
        if (this.field3255 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3260; var3++) {
            if (this.field3255[var3] == arg0) {
                this.field3255[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "()V")
    private final void method1450() {
        if (this.field3233) {
            return;
        }
        this.field3233 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3245; var7++) {
            int var8 = this.field3228[var7];
            int var9 = this.field3271[var7];
            int var10 = this.field3243[var7];
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
        this.field3241 = (short) var1;
        this.field3248 = (short) var4;
        this.field3259 = (short) var2;
        this.field3226 = (short) var5;
        this.field3257 = (short) var3;
        this.field3236 = (short) var6;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(III)V")
    public final void method1451(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3230; var4++) {
            this.field3228[var4] = this.field3228[var4] * arg0 / 128;
            this.field3271[var4] = this.field3271[var4] * arg1 / 128;
            this.field3243[var4] = this.field3243[var4] * arg2 / 128;
        }
        this.method1429();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method102() {
        if (!this.field3233) {
            this.method1450();
        }
        return this.field3259;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    private class205() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
    private class205(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1443(arg0);
        } else {
            this.method1435(arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(III)V")
    public class205(int arg0, int arg1, int arg2) {
        this.field3228 = new int[arg0];
        this.field3271 = new int[arg0];
        this.field3243 = new int[arg0];
        this.field3269 = new int[arg0];
        this.field3238 = new int[arg1];
        this.field3262 = new int[arg1];
        this.field3275 = new int[arg1];
        this.field3264 = new byte[arg1];
        this.field3232 = new byte[arg1];
        this.field3237 = new byte[arg1];
        this.field3265 = new short[arg1];
        this.field3255 = new short[arg1];
        this.field3253 = new byte[arg1];
        this.field3274 = new int[arg1];
        if (arg2 > 0) {
            this.field3272 = new byte[arg2];
            this.field3252 = new short[arg2];
            this.field3250 = new short[arg2];
            this.field3227 = new short[arg2];
            this.field3267 = new short[arg2];
            this.field3270 = new short[arg2];
            this.field3277 = new short[arg2];
            this.field3239 = new byte[arg2];
            this.field3261 = new byte[arg2];
            this.field3229 = new byte[arg2];
            this.field3244 = new byte[arg2];
            this.field3251 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([Lbf;I)V")
    public class205(class205[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3230 = 0;
        this.field3260 = 0;
        this.field3246 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field3273 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class205 var25 = arg0[var11];
            if (var25 != null) {
                this.field3230 += var25.field3230;
                this.field3260 += var25.field3260;
                this.field3246 += var25.field3246;
                if (var25.field3232 == null) {
                    if (this.field3273 == -1) {
                        this.field3273 = var25.field3273;
                    }
                    if (this.field3273 != var25.field3273) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var25.field3264 != null;
                var5 |= var25.field3237 != null;
                var6 |= var25.field3274 != null;
                var7 |= var25.field3255 != null;
                var8 |= var25.field3253 != null;
            }
        }
        this.field3228 = new int[this.field3230];
        this.field3271 = new int[this.field3230];
        this.field3243 = new int[this.field3230];
        this.field3269 = new int[this.field3230];
        this.field3231 = new short[this.field3230];
        this.field3238 = new int[this.field3260];
        this.field3262 = new int[this.field3260];
        this.field3275 = new int[this.field3260];
        if (var3) {
            this.field3264 = new byte[this.field3260];
        }
        if (var4) {
            this.field3232 = new byte[this.field3260];
        }
        if (var5) {
            this.field3237 = new byte[this.field3260];
        }
        if (var6) {
            this.field3274 = new int[this.field3260];
        }
        if (var7) {
            this.field3255 = new short[this.field3260];
        }
        if (var8) {
            this.field3253 = new byte[this.field3260];
        }
        this.field3265 = new short[this.field3260];
        this.field3235 = new short[this.field3260];
        if (this.field3246 > 0) {
            this.field3272 = new byte[this.field3246];
            this.field3252 = new short[this.field3246];
            this.field3250 = new short[this.field3246];
            this.field3227 = new short[this.field3246];
            this.field3267 = new short[this.field3246];
            this.field3270 = new short[this.field3246];
            this.field3277 = new short[this.field3246];
            this.field3239 = new byte[this.field3246];
            this.field3261 = new byte[this.field3246];
            this.field3229 = new byte[this.field3246];
            this.field3244 = new byte[this.field3246];
            this.field3251 = new byte[this.field3246];
        }
        this.field3230 = 0;
        this.field3260 = 0;
        this.field3246 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var22 = (short) (0x1 << var14);
            class205 var23 = arg0[var14];
            if (var23 != null) {
                for (int var24 = 0; var24 < var23.field3260; var24++) {
                    if (var3 && var23.field3264 != null) {
                        this.field3264[this.field3260] = var23.field3264[var24];
                    }
                    if (var4) {
                        if (var23.field3232 == null) {
                            this.field3232[this.field3260] = var23.field3273;
                        } else {
                            this.field3232[this.field3260] = var23.field3232[var24];
                        }
                    }
                    if (var5 && var23.field3237 != null) {
                        this.field3237[this.field3260] = var23.field3237[var24];
                    }
                    if (var6 && var23.field3274 != null) {
                        this.field3274[this.field3260] = var23.field3274[var24];
                    }
                    if (var7) {
                        if (var23.field3255 == null) {
                            this.field3255[this.field3260] = -1;
                        } else {
                            this.field3255[this.field3260] = var23.field3255[var24];
                        }
                    }
                    this.field3265[this.field3260] = var23.field3265[var24];
                    this.field3235[this.field3260] = var22;
                    this.field3238[this.field3260] = this.method1425(var23, var23.field3238[var24], var22);
                    this.field3262[this.field3260] = this.method1425(var23, var23.field3262[var24], var22);
                    this.field3275[this.field3260] = this.method1425(var23, var23.field3275[var24], var22);
                    this.field3260++;
                }
            }
        }
        int var15 = 0;
        this.field3245 = this.field3230;
        for (int var16 = 0; var16 < arg1; var16++) {
            class205 var17 = arg0[var16];
            short var18 = (short) (0x1 << var16);
            if (var17 != null) {
                for (int var19 = 0; var19 < var17.field3260; var19++) {
                    if (var8) {
                        this.field3253[var15++] = (byte) (var17.field3253 == null || var17.field3253[var19] == -1 ? -1 : var17.field3253[var19] + this.field3246);
                    }
                }
                for (int var20 = 0; var20 < var17.field3246; var20++) {
                    byte var21 = this.field3272[this.field3246] = var17.field3272[var20];
                    if (var21 == 0) {
                        this.field3252[this.field3246] = (short) this.method1425(var17, var17.field3252[var20], var18);
                        this.field3250[this.field3246] = (short) this.method1425(var17, var17.field3250[var20], var18);
                        this.field3227[this.field3246] = (short) this.method1425(var17, var17.field3227[var20], var18);
                    }
                    if (var21 >= 1 && var21 <= 3) {
                        this.field3252[this.field3246] = var17.field3252[var20];
                        this.field3250[this.field3246] = var17.field3250[var20];
                        this.field3227[this.field3246] = var17.field3227[var20];
                        this.field3267[this.field3246] = var17.field3267[var20];
                        this.field3270[this.field3246] = var17.field3270[var20];
                        this.field3277[this.field3246] = var17.field3277[var20];
                        this.field3239[this.field3246] = var17.field3239[var20];
                        this.field3261[this.field3246] = var17.field3261[var20];
                        this.field3229[this.field3246] = var17.field3229[var20];
                    }
                    if (var21 == 2) {
                        this.field3244[this.field3246] = var17.field3244[var20];
                        this.field3251[this.field3246] = var17.field3251[var20];
                    }
                    this.field3246++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lbf;ZZZZ)V")
    public class205(class205 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3230 = arg0.field3230;
        this.field3245 = arg0.field3245;
        this.field3260 = arg0.field3260;
        this.field3246 = arg0.field3246;
        if (arg1) {
            this.field3228 = arg0.field3228;
            this.field3271 = arg0.field3271;
            this.field3243 = arg0.field3243;
        } else {
            this.field3228 = new int[this.field3230];
            this.field3271 = new int[this.field3230];
            this.field3243 = new int[this.field3230];
            for (int var6 = 0; var6 < this.field3230; var6++) {
                this.field3228[var6] = arg0.field3228[var6];
                this.field3271[var6] = arg0.field3271[var6];
                this.field3243[var6] = arg0.field3243[var6];
            }
        }
        if (arg2) {
            this.field3265 = arg0.field3265;
        } else {
            this.field3265 = new short[this.field3260];
            for (int var7 = 0; var7 < this.field3260; var7++) {
                this.field3265[var7] = arg0.field3265[var7];
            }
        }
        if (arg3 || arg0.field3255 == null) {
            this.field3255 = arg0.field3255;
        } else {
            this.field3255 = new short[this.field3260];
            for (int var8 = 0; var8 < this.field3260; var8++) {
                this.field3255[var8] = arg0.field3255[var8];
            }
        }
        if (arg4) {
            this.field3237 = arg0.field3237;
        } else {
            this.field3237 = new byte[this.field3260];
            if (arg0.field3237 == null) {
                for (int var9 = 0; var9 < this.field3260; var9++) {
                    this.field3237[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3260; var10++) {
                    this.field3237[var10] = arg0.field3237[var10];
                }
            }
        }
        this.field3238 = arg0.field3238;
        this.field3262 = arg0.field3262;
        this.field3275 = arg0.field3275;
        this.field3264 = arg0.field3264;
        this.field3232 = arg0.field3232;
        this.field3253 = arg0.field3253;
        this.field3273 = arg0.field3273;
        this.field3272 = arg0.field3272;
        this.field3252 = arg0.field3252;
        this.field3250 = arg0.field3250;
        this.field3227 = arg0.field3227;
        this.field3267 = arg0.field3267;
        this.field3270 = arg0.field3270;
        this.field3277 = arg0.field3277;
        this.field3239 = arg0.field3239;
        this.field3261 = arg0.field3261;
        this.field3229 = arg0.field3229;
        this.field3244 = arg0.field3244;
        this.field3251 = arg0.field3251;
        this.field3269 = arg0.field3269;
        this.field3274 = arg0.field3274;
        this.field3266 = arg0.field3266;
        this.field3268 = arg0.field3268;
        this.field3263 = arg0.field3263;
        this.field3258 = arg0.field3258;
        this.field3276 = arg0.field3276;
        this.field3254 = arg0.field3254;
        this.field3256 = arg0.field3256;
    }
}
