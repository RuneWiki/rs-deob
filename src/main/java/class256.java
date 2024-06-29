import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class256 extends class206 {

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Z")
    private static boolean field4303 = false;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field4286;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    private static int field4291;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    private static int field4295;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field4298;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private static int field4307;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    private static int field4310;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    private int field4315;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Z")
    private boolean field4299;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "Z")
    private boolean field4301;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[B")
    private static byte[] field4289;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[B")
    private byte[] field4314;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[F")
    private static float[] field4285;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[F")
    private static float[] field4288;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[F")
    private static float[] field4297;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "[F")
    private static float[] field4304;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[F")
    private static float[] field4305;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "[F")
    private static float[] field4308;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[F")
    private float[] field4309;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "[F")
    private static float[] field4311;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[I")
    private static int[] field4287;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    private static int[] field4300;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "[I")
    private static int[] field4312;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[Lld;")
    private static class114[] field4292;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[Ldi;")
    private static class142[] field4290;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "[Lck;")
    private static class224[] field4313;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[Lb;")
    public static class56[] field4283;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[Z")
    private static boolean[] field4302;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[[B")
    private byte[][] field4294;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 8)
    public static void method1824() {
        field4289 = null;
        field4283 = null;
        field4290 = null;
        field4292 = null;
        field4313 = null;
        field4302 = null;
        field4287 = null;
        field4285 = null;
        field4297 = null;
        field4311 = null;
        field4304 = null;
        field4305 = null;
        field4288 = null;
        field4308 = null;
        field4300 = null;
        field4312 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([B)V", line = 27)
    private static final void method1825(byte[] arg0) {
        method1834(arg0, 0);
        field4291 = 0x1 << method1826(4);
        field4295 = 0x1 << method1826(4);
        field4285 = new float[field4295];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4291 : field4295;
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
            int var13 = class60.method500(120, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class189.method1431(var14, (byte) 42, var13);
            }
            if (var1 == 0) {
                field4297 = var6;
                field4311 = var8;
                field4304 = var10;
                field4300 = var12;
            } else {
                field4305 = var6;
                field4288 = var8;
                field4308 = var10;
                field4312 = var12;
            }
        }
        int var15 = method1826(8) + 1;
        field4283 = new class56[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4283[var16] = new class56();
        }
        int var17 = method1826(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1826(16);
        }
        int var19 = method1826(6) + 1;
        field4290 = new class142[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4290[var20] = new class142();
        }
        int var21 = method1826(6) + 1;
        field4292 = new class114[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4292[var22] = new class114();
        }
        int var23 = method1826(6) + 1;
        field4313 = new class224[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4313[var24] = new class224();
        }
        int var25 = method1826(6) + 1;
        field4302 = new boolean[var25];
        field4287 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4302[var26] = method1829() != 0;
            method1826(16);
            method1826(16);
            field4287[var26] = method1826(8);
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)I", line = 182)
    public static final int method1826(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4307) {
            int var3 = 8 - field4307;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4289[field4310] >> field4307 & var4) << var2;
            field4307 = 0;
            field4310++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4289[field4310] >> field4307 & var5) << var2;
            field4307 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lcb;)Z", line = 210)
    private static final boolean method1827(class267 arg0) {
        if (!field4303) {
            byte[] var1 = arg0.method1911(0, 0, -62);
            if (var1 == null) {
                return false;
            }
            method1825(var1);
            field4303 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([B)V", line = 225)
    private final void method1828(byte[] arg0) {
        class60 var2 = new class60(arg0);
        this.field4306 = var2.method505(255);
        this.field4298 = var2.method505(255);
        this.field4286 = var2.method505(255);
        this.field4293 = var2.method505(255);
        if (this.field4293 < 0) {
            this.field4293 = ~this.field4293;
            this.field4301 = true;
        }
        int var3 = var2.method505(255);
        this.field4294 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method501(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method512(var5, 91, var7, 0);
            this.field4294[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I", line = 274)
    public static final int method1829() {
        int var0 = field4289[field4310] >> field4307 & 0x1;
        field4307++;
        field4310 += field4307 >> 3;
        field4307 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lcb;II)Lw;", line = 281)
    public static final class256 method1830(class267 arg0, int arg1, int arg2) {
        if (method1827(arg0)) {
            byte[] var3 = arg0.method1911(arg1, arg2, -49);
            return var3 == null ? null : new class256(var3);
        } else {
            arg0.method1900((byte) 109, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)F", line = 298)
    public static final float method1831(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([I)Ltd;", line = 309)
    public final class227 method1832(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4314 == null) {
            this.field4284 = 0;
            this.field4309 = new float[field4295];
            this.field4314 = new byte[this.field4298];
            this.field4315 = 0;
            this.field4316 = 0;
        }
        while (this.field4316 < this.field4294.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1833(this.field4316);
            if (var2 != null) {
                int var3 = this.field4315;
                int var4 = var2.length;
                if (var4 > this.field4298 - var3) {
                    var4 = this.field4298 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4314[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4315;
                }
                this.field4315 = var3;
            }
            this.field4316++;
        }
        this.field4309 = null;
        byte[] var7 = this.field4314;
        this.field4314 = null;
        return new class227(this.field4306, var7, this.field4286, this.field4293, this.field4301);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)[F", line = 371)
    private final float[] method1833(int arg0) {
        method1834(this.field4294[arg0], 0);
        method1829();
        int var2 = method1826(class60.method500(102, field4287.length - 1));
        boolean var3 = field4302[var2];
        int var4 = var3 ? field4295 : field4291;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1829() != 0;
            var6 = method1829() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4291 >> 2);
            var9 = (field4291 >> 2) + (var4 >> 2);
            var10 = field4291 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4291 >> 2);
            var12 = (field4291 >> 2) + (var4 - (var4 >> 2));
            var13 = field4291 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class224 var14 = field4313[field4287[var2]];
        int var15 = var14.field3797;
        int var16 = var14.field3796[var15];
        boolean var17 = !field4290[var16].method1102();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3799; var19++) {
            class114 var20 = field4292[var14.field3798[var19]];
            float[] var21 = field4285;
            var20.method880(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3797;
            int var23 = var14.field3796[var22];
            field4290[var23].method1100(field4285, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4285[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4285;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4305 : field4297;
            float[] var32 = var3 ? field4288 : field4311;
            float[] var33 = var3 ? field4308 : field4304;
            int[] var34 = var3 ? field4312 : field4300;
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
            int var47 = class60.method500(-56, var4 - 1);
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
                field4285[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4285[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4284 > 0) {
            int var91 = this.field4284 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4299) {
                for (int var92 = 0; var92 < this.field4296; var92++) {
                    int var93 = (this.field4284 >> 1) + var92;
                    var90[var92] += this.field4309[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4285[var94];
                }
            }
        }
        float[] var96 = this.field4309;
        this.field4309 = field4285;
        field4285 = var96;
        this.field4284 = var4;
        this.field4296 = var12 - (var4 >> 1);
        this.field4299 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)V", line = 785)
    private static final void method1834(byte[] arg0, int arg1) {
        field4289 = arg0;
        field4310 = arg1;
        field4307 = 0;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B)V", line = 802)
    private class256(byte[] arg0) {
        this.method1828(arg0);
    }
}
