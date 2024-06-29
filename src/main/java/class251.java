import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class251 extends class141 {

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Z")
    private static boolean field4332 = false;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    private static int field4320;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    private int field4322;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    private int field4324;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    private static int field4336;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    private static int field4339;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    private static int field4341;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    private int field4347;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Z")
    private boolean field4333;

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
    private boolean field4345;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "[B")
    private static byte[] field4330;

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "[B")
    private byte[] field4351;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "[F")
    private static float[] field4326;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[F")
    private static float[] field4328;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[F")
    private static float[] field4331;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[F")
    private static float[] field4334;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "[F")
    private static float[] field4343;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "[F")
    private float[] field4344;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "[F")
    private static float[] field4346;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "[F")
    private static float[] field4348;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[I")
    private static int[] field4319;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
    private static int[] field4321;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "[I")
    private static int[] field4325;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[Lef;")
    public static class206[] field4318;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "[Lgi;")
    private static class299[] field4350;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "[Lki;")
    private static class313[] field4338;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[Lpg;")
    private static class322[] field4327;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "[Z")
    private static boolean[] field4340;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "[[B")
    private byte[][] field4335;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([I)Lvk;", line = 7)
    public final class154 method1799(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4351 == null) {
            this.field4322 = 0;
            this.field4344 = new float[field4339];
            this.field4351 = new byte[this.field4324];
            this.field4349 = 0;
            this.field4347 = 0;
        }
        while (this.field4347 < this.field4335.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1800(this.field4347);
            if (var2 != null) {
                int var3 = this.field4349;
                int var4 = var2.length;
                if (var4 > this.field4324 - var3) {
                    var4 = this.field4324 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4351[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4349;
                }
                this.field4349 = var3;
            }
            this.field4347++;
        }
        this.field4344 = null;
        byte[] var7 = this.field4351;
        this.field4351 = null;
        return new class154(this.field4342, var7, this.field4323, this.field4329, this.field4345);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)[F", line = 73)
    private final float[] method1800(int arg0) {
        method1803(this.field4335[arg0], 0);
        method1807();
        int var2 = method1805(class126.method889(field4319.length - 1, -1));
        boolean var3 = field4340[var2];
        int var4 = var3 ? field4339 : field4341;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1807() != 0;
            var6 = method1807() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4341 >> 2);
            var9 = (field4341 >> 2) + (var4 >> 2);
            var10 = field4341 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4341 >> 2);
            var12 = (field4341 >> 2) + (var4 - (var4 >> 2));
            var13 = field4341 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class322 var14 = field4327[field4319[var2]];
        int var15 = var14.field5540;
        int var16 = var14.field5539[var15];
        boolean var17 = !field4350[var16].method2070();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5541; var19++) {
            class313 var20 = field4338[var14.field5538[var19]];
            float[] var21 = field4348;
            var20.method2156(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5540;
            int var23 = var14.field5539[var22];
            field4350[var23].method2071(field4348, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4348[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4348;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4326 : field4343;
            float[] var32 = var3 ? field4328 : field4334;
            float[] var33 = var3 ? field4331 : field4346;
            int[] var34 = var3 ? field4321 : field4325;
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
            int var47 = class126.method889(var4 - 1, -1);
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
                field4348[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4348[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4322 > 0) {
            int var91 = this.field4322 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4333) {
                for (int var92 = 0; var92 < this.field4337; var92++) {
                    int var93 = (this.field4322 >> 1) + var92;
                    var90[var92] += this.field4344[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4348[var94];
                }
            }
        }
        float[] var96 = this.field4344;
        this.field4344 = field4348;
        field4348 = var96;
        this.field4322 = var4;
        this.field4337 = var12 - (var4 >> 1);
        this.field4333 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)F", line = 489)
    public static final float method1801(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lum;)Z", line = 503)
    private static final boolean method1802(class222 arg0) {
        if (!field4332) {
            byte[] var1 = arg0.method1577(0, 0, -29569);
            if (var1 == null) {
                return false;
            }
            method1804(var1);
            field4332 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BI)V", line = 518)
    private static final void method1803(byte[] arg0, int arg1) {
        field4330 = arg0;
        field4336 = arg1;
        field4320 = 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([B)V", line = 532)
    private static final void method1804(byte[] arg0) {
        method1803(arg0, 0);
        field4341 = 0x1 << method1805(4);
        field4339 = 0x1 << method1805(4);
        field4348 = new float[field4339];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4341 : field4339;
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
            int var13 = class126.method889(var5 - 1, -1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class202.method1417(true, var13, var14);
            }
            if (var1 == 0) {
                field4343 = var6;
                field4334 = var8;
                field4346 = var10;
                field4325 = var12;
            } else {
                field4326 = var6;
                field4328 = var8;
                field4331 = var10;
                field4321 = var12;
            }
        }
        int var15 = method1805(8) + 1;
        field4318 = new class206[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4318[var16] = new class206();
        }
        int var17 = method1805(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1805(16);
        }
        int var19 = method1805(6) + 1;
        field4350 = new class299[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4350[var20] = new class299();
        }
        int var21 = method1805(6) + 1;
        field4338 = new class313[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4338[var22] = new class313();
        }
        int var23 = method1805(6) + 1;
        field4327 = new class322[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4327[var24] = new class322();
        }
        int var25 = method1805(6) + 1;
        field4340 = new boolean[var25];
        field4319 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4340[var26] = method1807() != 0;
            method1805(16);
            method1805(16);
            field4319[var26] = method1805(8);
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)I", line = 689)
    public static final int method1805(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4320) {
            int var3 = 8 - field4320;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4330[field4336] >> field4320 & var4) << var2;
            field4320 = 0;
            field4336++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4330[field4336] >> field4320 & var5) << var2;
            field4320 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 716)
    public static void method1806() {
        field4330 = null;
        field4318 = null;
        field4350 = null;
        field4338 = null;
        field4327 = null;
        field4340 = null;
        field4319 = null;
        field4348 = null;
        field4343 = null;
        field4334 = null;
        field4346 = null;
        field4326 = null;
        field4328 = null;
        field4331 = null;
        field4325 = null;
        field4321 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V", line = 735)
    private class251(byte[] arg0) {
        this.method1809(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()I", line = 740)
    public static final int method1807() {
        int var0 = field4330[field4336] >> field4320 & 0x1;
        field4320++;
        field4336 += field4320 >> 3;
        field4320 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lum;II)Lul;", line = 749)
    public static final class251 method1808(class222 arg0, int arg1, int arg2) {
        if (method1802(arg0)) {
            byte[] var3 = arg0.method1577(arg1, arg2, -29569);
            return var3 == null ? null : new class251(var3);
        } else {
            arg0.method1587(arg1, arg2, (byte) 70);
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "([B)V", line = 764)
    private final void method1809(byte[] arg0) {
        class153 var2 = new class153(arg0);
        this.field4342 = var2.method1097((byte) -89);
        this.field4324 = var2.method1097((byte) -113);
        this.field4323 = var2.method1097((byte) -124);
        this.field4329 = var2.method1097((byte) -74);
        if (this.field4329 < 0) {
            this.field4329 = ~this.field4329;
            this.field4345 = true;
        }
        int var3 = var2.method1097((byte) -126);
        this.field4335 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1082(-27);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1093(0, var5, 112, var7);
            this.field4335[var4] = var7;
        }
    }
}
