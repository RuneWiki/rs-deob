import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class363 extends class260 {

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Z")
    private static boolean field5312 = false;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    private static int field5305;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    private int field5307;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    private static int field5311;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    private int field5320;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    private int field5322;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    private static int field5325;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    private static int field5327;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    private int field5328;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    private int field5331;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Z")
    private boolean field5306;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Z")
    private boolean field5318;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "[B")
    private byte[] field5329;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[B")
    private static byte[] field5333;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[F")
    private static float[] field5301;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "[F")
    private static float[] field5302;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "[F")
    private static float[] field5303;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[F")
    private float[] field5304;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "[F")
    private static float[] field5310;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "[F")
    private static float[] field5316;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "[F")
    private static float[] field5324;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "[F")
    private static float[] field5330;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "[I")
    private static int[] field5314;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[I")
    private static int[] field5326;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "[I")
    private static int[] field5332;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[Lik;")
    private static class139[] field5321;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "[Lak;")
    private static class232[] field5317;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[Lrp;")
    private static class301[] field5315;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "[Lms;")
    public static class530[] field5313;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[Z")
    private static boolean[] field5308;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "[[B")
    private byte[][] field5319;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()I")
    public static final int method2185() {
        int var0 = field5333[field5311] >> field5305 & 0x1;
        field5305++;
        field5311 += field5305 >> 3;
        field5305 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)F")
    public static final float method2186(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([B)V")
    private final void method2187(byte[] arg0) {
        class391 var2 = new class391(arg0);
        this.field5322 = var2.method2361((byte) -56);
        this.field5309 = var2.method2361((byte) -56);
        this.field5323 = var2.method2361((byte) -56);
        this.field5320 = var2.method2361((byte) -56);
        if (this.field5320 < 0) {
            this.field5320 = ~this.field5320;
            this.field5306 = true;
        }
        int var3 = var2.method2361((byte) -56);
        this.field5319 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2348(-2);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2362(var5, var7, 0, (byte) -54);
            this.field5319[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "([B)V")
    private static final void method2188(byte[] arg0) {
        method2190(arg0, 0);
        field5327 = 0x1 << method2193(4);
        field5325 = 0x1 << method2193(4);
        field5303 = new float[field5325];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5327 : field5325;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class285.method1698(-76, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class64.method543(8525, var26, var25);
            }
            if (var1 == 0) {
                field5301 = var18;
                field5310 = var20;
                field5302 = var22;
                field5326 = var24;
            } else {
                field5316 = var18;
                field5330 = var20;
                field5324 = var22;
                field5332 = var24;
            }
        }
        int var2 = method2193(8) + 1;
        field5313 = new class530[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5313[var3] = new class530();
        }
        int var4 = method2193(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2193(16);
        }
        int var6 = method2193(6) + 1;
        field5317 = new class232[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5317[var7] = new class232();
        }
        int var8 = method2193(6) + 1;
        field5321 = new class139[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5321[var9] = new class139();
        }
        int var10 = method2193(6) + 1;
        field5315 = new class301[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5315[var11] = new class301();
        }
        int var12 = method2193(6) + 1;
        field5308 = new boolean[var12];
        field5314 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5308[var13] = method2185() != 0;
            method2193(16);
            method2193(16);
            field5314[var13] = method2193(8);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lmg;I)Lum;")
    public static final class363 method2189(class101 arg0, int arg1) {
        if (method2192(arg0)) {
            byte[] var2 = arg0.method742(arg1, 1);
            return var2 == null ? null : new class363(var2);
        } else {
            arg0.method747(arg1, (byte) -68);
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BI)V")
    private static final void method2190(byte[] arg0, int arg1) {
        field5333 = arg0;
        field5311 = arg1;
        field5305 = 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([I)Lck;")
    public final class452 method2191(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5329 == null) {
            this.field5307 = 0;
            this.field5304 = new float[field5325];
            this.field5329 = new byte[this.field5309];
            this.field5331 = 0;
            this.field5328 = 0;
        }
        while (this.field5328 < this.field5319.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2195(this.field5328);
            if (var3 != null) {
                int var4 = this.field5331;
                int var5 = var3.length;
                if (var5 > this.field5309 - var4) {
                    var5 = this.field5309 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5329[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5331;
                }
                this.field5331 = var4;
            }
            this.field5328++;
        }
        this.field5304 = null;
        byte[] var2 = this.field5329;
        this.field5329 = null;
        return new class452(this.field5322, var2, this.field5323, this.field5320, this.field5306);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lmg;)Z")
    private static final boolean method2192(class101 arg0) {
        if (!field5312) {
            byte[] var1 = arg0.method727(0, 0, -114);
            if (var1 == null) {
                return false;
            }
            method2188(var1);
            field5312 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
    public static final int method2193(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5305) {
            int var4 = 8 - field5305;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5333[field5311] >> field5305 & var5) << var2;
            field5305 = 0;
            field5311++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5333[field5311] >> field5305 & var3) << var2;
            field5305 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "([B)V")
    private class363(byte[] arg0) {
        this.method2187(arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lmg;II)Lum;")
    public static final class363 method2194(class101 arg0, int arg1, int arg2) {
        if (method2192(arg0)) {
            byte[] var3 = arg0.method727(arg2, arg1, -108);
            return var3 == null ? null : new class363(var3);
        } else {
            arg0.method729(arg1, arg2, -8410);
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)[F")
    private final float[] method2195(int arg0) {
        method2190(this.field5319[arg0], 0);
        method2185();
        int var2 = method2193(class285.method1698(-66, field5314.length - 1));
        boolean var3 = field5308[var2];
        int var4 = var3 ? field5325 : field5327;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2185() != 0;
            var6 = method2185() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5327 >> 2);
            var9 = (field5327 >> 2) + (var4 >> 2);
            var10 = field5327 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5327 >> 2);
            var12 = (field5327 >> 2) + (var4 - (var4 >> 2));
            var13 = field5327 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class301 var14 = field5315[field5314[var2]];
        int var15 = var14.field4137;
        int var16 = var14.field4135[var15];
        boolean var17 = !field5317[var16].method1430();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4134; var19++) {
            class139 var95 = field5321[var14.field4136[var19]];
            float[] var96 = field5303;
            var95.method936(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4137;
            int var21 = var14.field4135[var20];
            field5317[var21].method1433(field5303, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5303[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5303;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5316 : field5301;
            float[] var30 = var3 ? field5330 : field5310;
            float[] var31 = var3 ? field5324 : field5302;
            int[] var32 = var3 ? field5332 : field5326;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class285.method1698(-116, var4 - 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field5303[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5303[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5307 > 0) {
            int var49 = this.field5307 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5318) {
                for (int var50 = 0; var50 < this.field5300; var50++) {
                    int var51 = (this.field5307 >> 1) + var50;
                    var48[var50] += this.field5304[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5303[var52];
                }
            }
        }
        float[] var54 = this.field5304;
        this.field5304 = field5303;
        field5303 = var54;
        this.field5307 = var4;
        this.field5300 = var12 - (var4 >> 1);
        this.field5318 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()V")
    public static void method2196() {
        field5333 = null;
        field5313 = null;
        field5317 = null;
        field5321 = null;
        field5315 = null;
        field5308 = null;
        field5314 = null;
        field5303 = null;
        field5301 = null;
        field5310 = null;
        field5302 = null;
        field5316 = null;
        field5330 = null;
        field5324 = null;
        field5326 = null;
        field5332 = null;
    }
}
