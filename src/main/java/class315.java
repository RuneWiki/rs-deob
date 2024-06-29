import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class315 extends class273 {

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Z")
    private static boolean field5457 = false;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    private static int field5451;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    private int field5454;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    private static int field5456;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    private int field5458;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    private int field5463;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    private static int field5464;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    private static int field5466;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    private int field5469;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    private int field5474;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    private int field5476;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
    private int field5480;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    private int field5483;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Z")
    private boolean field5471;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Z")
    private boolean field5473;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "[B")
    private static byte[] field5477;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "[B")
    private byte[] field5481;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[F")
    private float[] field5453;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "[F")
    private static float[] field5455;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[F")
    private static float[] field5459;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "[F")
    private static float[] field5460;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "[F")
    private static float[] field5467;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "[F")
    private static float[] field5472;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "[F")
    private static float[] field5475;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "[F")
    private static float[] field5482;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[I")
    private static int[] field5452;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "[I")
    private static int[] field5461;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "[I")
    private static int[] field5479;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "[Llc;")
    private static class165[] field5465;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "[Ldj;")
    private static class326[] field5470;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[Lhb;")
    private static class35[] field5450;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "[Lkc;")
    public static class36[] field5462;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "[Z")
    private static boolean[] field5478;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "[[B")
    private byte[][] field5468;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([B)V", line = 9)
    private static final void method2196(byte[] arg0) {
        method2199(arg0, 0);
        field5456 = 0x1 << method2197(4);
        field5466 = 0x1 << method2197(4);
        field5467 = new float[field5466];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field5456 : field5466;
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
            int var13 = class191.method1264((byte) 91, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class163.method1093(var13, var14, true);
            }
            if (var1 == 0) {
                field5472 = var6;
                field5455 = var8;
                field5482 = var10;
                field5452 = var12;
            } else {
                field5459 = var6;
                field5460 = var8;
                field5475 = var10;
                field5479 = var12;
            }
        }
        int var15 = method2197(8) + 1;
        field5462 = new class36[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field5462[var16] = new class36();
        }
        int var17 = method2197(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2197(16);
        }
        int var19 = method2197(6) + 1;
        field5450 = new class35[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field5450[var20] = new class35();
        }
        int var21 = method2197(6) + 1;
        field5465 = new class165[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field5465[var22] = new class165();
        }
        int var23 = method2197(6) + 1;
        field5470 = new class326[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field5470[var24] = new class326();
        }
        int var25 = method2197(6) + 1;
        field5478 = new boolean[var25];
        field5461 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field5478[var26] = method2204() != 0;
            method2197(16);
            method2197(16);
            field5461[var26] = method2197(8);
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I", line = 161)
    public static final int method2197(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5451) {
            int var3 = 8 - field5451;
            int var4 = (0x1 << var3) - 1;
            var1 += (field5477[field5464] >> field5451 & var4) << var2;
            field5451 = 0;
            field5464++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field5477[field5464] >> field5451 & var5) << var2;
            field5451 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "([B)V", line = 190)
    private final void method2198(byte[] arg0) {
        class291 var2 = new class291(arg0);
        this.field5469 = var2.method1969((byte) -16);
        this.field5476 = var2.method1969((byte) -16);
        this.field5474 = var2.method1969((byte) -16);
        this.field5463 = var2.method1969((byte) -16);
        if (this.field5463 < 0) {
            this.field5463 = ~this.field5463;
            this.field5471 = true;
        }
        int var3 = var2.method1969((byte) -16);
        this.field5468 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2011(-102);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1975(0, (byte) 63, var5, var7);
            this.field5468[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([BI)V", line = 233)
    private static final void method2199(byte[] arg0, int arg1) {
        field5477 = arg0;
        field5464 = arg1;
        field5451 = 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([I)Lgm;", line = 238)
    public final class292 method2200(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5481 == null) {
            this.field5458 = 0;
            this.field5453 = new float[field5466];
            this.field5481 = new byte[this.field5476];
            this.field5483 = 0;
            this.field5480 = 0;
        }
        while (this.field5480 < this.field5468.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2201(this.field5480);
            if (var2 != null) {
                int var3 = this.field5483;
                int var4 = var2.length;
                if (var4 > this.field5476 - var3) {
                    var4 = this.field5476 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field5481[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field5483;
                }
                this.field5483 = var3;
            }
            this.field5480++;
        }
        this.field5453 = null;
        byte[] var7 = this.field5481;
        this.field5481 = null;
        return new class292(this.field5469, var7, this.field5474, this.field5463, this.field5471);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)[F", line = 296)
    private final float[] method2201(int arg0) {
        method2199(this.field5468[arg0], 0);
        method2204();
        int var2 = method2197(class191.method1264((byte) 91, field5461.length - 1));
        boolean var3 = field5478[var2];
        int var4 = var3 ? field5466 : field5456;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2204() != 0;
            var6 = method2204() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5456 >> 2);
            var9 = (field5456 >> 2) + (var4 >> 2);
            var10 = field5456 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5456 >> 2);
            var12 = (field5456 >> 2) + (var4 - (var4 >> 2));
            var13 = field5456 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class326 var14 = field5470[field5461[var2]];
        int var15 = var14.field5678;
        int var16 = var14.field5676[var15];
        boolean var17 = !field5450[var16].method258();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5677; var19++) {
            class165 var20 = field5465[var14.field5679[var19]];
            float[] var21 = field5467;
            var20.method1101(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5678;
            int var23 = var14.field5676[var22];
            field5450[var23].method261(field5467, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field5467[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field5467;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field5459 : field5472;
            float[] var32 = var3 ? field5460 : field5455;
            float[] var33 = var3 ? field5475 : field5482;
            int[] var34 = var3 ? field5479 : field5452;
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
            int var47 = class191.method1264((byte) 91, var4 - 1);
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
                field5467[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5467[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field5458 > 0) {
            int var91 = this.field5458 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field5473) {
                for (int var92 = 0; var92 < this.field5454; var92++) {
                    int var93 = (this.field5458 >> 1) + var92;
                    var90[var92] += this.field5453[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field5467[var94];
                }
            }
        }
        float[] var96 = this.field5453;
        this.field5453 = field5467;
        field5467 = var96;
        this.field5458 = var4;
        this.field5454 = var12 - (var4 >> 1);
        this.field5473 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 717)
    public static void method2202() {
        field5477 = null;
        field5462 = null;
        field5450 = null;
        field5465 = null;
        field5470 = null;
        field5478 = null;
        field5461 = null;
        field5467 = null;
        field5472 = null;
        field5455 = null;
        field5482 = null;
        field5459 = null;
        field5460 = null;
        field5475 = null;
        field5452 = null;
        field5479 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lah;)Z", line = 742)
    private static final boolean method2203(class205 arg0) {
        if (!field5457) {
            byte[] var1 = arg0.method1381(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2196(var1);
            field5457 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()I", line = 757)
    public static final int method2204() {
        int var0 = field5477[field5464] >> field5451 & 0x1;
        field5451++;
        field5464 += field5451 >> 3;
        field5451 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lah;II)Lsi;", line = 768)
    public static final class315 method2205(class205 arg0, int arg1, int arg2) {
        if (method2203(arg0)) {
            byte[] var3 = arg0.method1381(arg1, arg2, 0);
            return var3 == null ? null : new class315(var3);
        } else {
            arg0.method1369(arg2, (byte) -117, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "([B)V", line = 788)
    private class315(byte[] arg0) {
        this.method2198(arg0);
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(I)F", line = 798)
    public static final float method2206(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
