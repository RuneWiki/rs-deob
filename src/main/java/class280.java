import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class280 extends class217 {

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Z")
    private static boolean field4307 = false;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private static int field4299;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    private static int field4312;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private static int field4315;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    private int field4321;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    private static int field4327;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    private int field4330;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
    private boolean field4310;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Z")
    private boolean field4317;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[B")
    private static byte[] field4314;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[B")
    private byte[] field4328;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[F")
    private static float[] field4302;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[F")
    private static float[] field4303;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "[F")
    private static float[] field4306;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "[F")
    private static float[] field4308;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[F")
    private static float[] field4309;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "[F")
    private static float[] field4313;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[F")
    private float[] field4319;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[F")
    private static float[] field4326;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    private static int[] field4304;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "[I")
    private static int[] field4311;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    private static int[] field4325;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[Lch;")
    private static class139[] field4301;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[Lll;")
    private static class157[] field4300;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[Lfg;")
    private static class214[] field4298;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Li;")
    public static class215[] field4297;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[Z")
    private static boolean[] field4318;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "[[B")
    private byte[][] field4324;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I", line = 5)
    public static final int method1967() {
        int var0 = field4314[field4299] >> field4312 & 0x1;
        field4312++;
        field4299 += field4312 >> 3;
        field4312 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 18)
    public static void method1968() {
        field4314 = null;
        field4297 = null;
        field4301 = null;
        field4300 = null;
        field4298 = null;
        field4318 = null;
        field4304 = null;
        field4306 = null;
        field4313 = null;
        field4326 = null;
        field4309 = null;
        field4303 = null;
        field4308 = null;
        field4302 = null;
        field4311 = null;
        field4325 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)F", line = 49)
    public static final float method1969(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BI)V", line = 60)
    private static final void method1970(byte[] arg0, int arg1) {
        field4314 = arg0;
        field4299 = arg1;
        field4312 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([B)V", line = 69)
    private final void method1971(byte[] arg0) {
        class35 var2 = new class35(arg0);
        this.field4323 = var2.method299(-93);
        this.field4321 = var2.method299(-109);
        this.field4316 = var2.method299(-111);
        this.field4320 = var2.method299(-82);
        if (this.field4320 < 0) {
            this.field4320 = ~this.field4320;
            this.field4310 = true;
        }
        int var3 = var2.method299(-117);
        this.field4324 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method273(65280);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method275(false, var7, var5, 0);
            this.field4324[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I", line = 113)
    public static final int method1972(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4312) {
            int var3 = 8 - field4312;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4314[field4299] >> field4312 & var4) << var2;
            field4312 = 0;
            field4299++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4314[field4299] >> field4312 & var5) << var2;
            field4312 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([B)V", line = 144)
    private static final void method1973(byte[] arg0) {
        method1970(arg0, 0);
        field4327 = 0x1 << method1972(4);
        field4315 = 0x1 << method1972(4);
        field4306 = new float[field4315];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4327 : field4315;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class149.method1105(-121, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class105.method808(var14, (byte) 112, var13);
            }
            if (var1 == 0) {
                field4313 = var6;
                field4326 = var8;
                field4309 = var10;
                field4311 = var12;
            } else {
                field4303 = var6;
                field4308 = var8;
                field4302 = var10;
                field4325 = var12;
            }
        }
        int var15 = method1972(8) + 1;
        field4297 = new class215[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4297[var16] = new class215();
        }
        int var17 = method1972(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1972(16);
        }
        int var19 = method1972(6) + 1;
        field4301 = new class139[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4301[var20] = new class139();
        }
        int var21 = method1972(6) + 1;
        field4300 = new class157[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4300[var22] = new class157();
        }
        int var23 = method1972(6) + 1;
        field4298 = new class214[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4298[var24] = new class214();
        }
        int var25 = method1972(6) + 1;
        field4318 = new boolean[var25];
        field4304 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4318[var26] = method1967() != 0;
            method1972(16);
            method1972(16);
            field4304[var26] = method1972(8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I)Lik;", line = 296)
    public final class259 method1974(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4328 == null) {
            this.field4305 = 0;
            this.field4319 = new float[field4315];
            this.field4328 = new byte[this.field4321];
            this.field4329 = 0;
            this.field4330 = 0;
        }
        while (this.field4330 < this.field4324.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1975(this.field4330);
            if (var2 != null) {
                int var3 = this.field4329;
                int var4 = var2.length;
                if (var4 > this.field4321 - var3) {
                    var4 = this.field4321 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4328[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4329;
                }
                this.field4329 = var3;
            }
            this.field4330++;
        }
        this.field4319 = null;
        byte[] var7 = this.field4328;
        this.field4328 = null;
        return new class259(this.field4323, var7, this.field4316, this.field4320, this.field4310);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)[F", line = 356)
    private final float[] method1975(int arg0) {
        method1970(this.field4324[arg0], 0);
        method1967();
        int var2 = method1972(class149.method1105(-123, field4304.length - 1));
        boolean var3 = field4318[var2];
        int var4 = var3 ? field4315 : field4327;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1967() != 0;
            var6 = method1967() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4327 >> 2);
            var9 = (field4327 >> 2) + (var4 >> 2);
            var10 = field4327 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4327 >> 2);
            var12 = (field4327 >> 2) + (var4 - (var4 >> 2));
            var13 = field4327 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class214 var14 = field4298[field4304[var2]];
        int var15 = var14.field3395;
        int var16 = var14.field3394[var15];
        boolean var17 = !field4301[var16].method1053();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3392; var19++) {
            class157 var20 = field4300[var14.field3393[var19]];
            float[] var21 = field4306;
            var20.method1139(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3395;
            int var23 = var14.field3394[var22];
            field4301[var23].method1057(field4306, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4306[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4306;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4303 : field4313;
            float[] var32 = var3 ? field4308 : field4326;
            float[] var33 = var3 ? field4302 : field4309;
            int[] var34 = var3 ? field4325 : field4311;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class149.method1105(-125, var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field4306[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4306[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4305 > 0) {
            int var91 = this.field4305 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4317) {
                for (int var92 = 0; var92 < this.field4322; var92++) {
                    int var93 = (this.field4305 >> 1) + var92;
                    var90[var92] += this.field4319[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4306[var94];
                }
            }
        }
        float[] var96 = this.field4319;
        this.field4319 = field4306;
        field4306 = var96;
        this.field4305 = var4;
        this.field4322 = var12 - (var4 >> 1);
        this.field4317 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llb;)Z", line = 771)
    private static final boolean method1976(class211 arg0) {
        if (!field4307) {
            byte[] var1 = arg0.method1507(0, (byte) -126, 0);
            if (var1 == null) {
                return false;
            }
            method1973(var1);
            field4307 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llb;II)Lae;", line = 785)
    public static final class280 method1977(class211 arg0, int arg1, int arg2) {
        if (method1976(arg0)) {
            byte[] var3 = arg0.method1507(arg2, (byte) -128, arg1);
            return var3 == null ? null : new class280(var3);
        } else {
            arg0.method1506(-118, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V", line = 801)
    private class280(byte[] arg0) {
        this.method1971(arg0);
    }
}
