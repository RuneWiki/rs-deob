import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class98 extends class171 {

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Z")
    private static boolean field1386 = false;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    private static int field1359;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    private static int field1376;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "I")
    private static int field1377;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    private static int field1383;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Z")
    private boolean field1360;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "Z")
    private boolean field1387;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[B")
    private static byte[] field1367;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "[B")
    private byte[] field1392;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "[F")
    private static float[] field1368;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "[F")
    private static float[] field1370;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "[F")
    private static float[] field1375;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "[F")
    private static float[] field1378;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "[F")
    private static float[] field1379;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "[F")
    private static float[] field1380;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "[F")
    private static float[] field1382;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "[F")
    private float[] field1388;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
    private static int[] field1364;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "[I")
    private static int[] field1372;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[I")
    private static int[] field1373;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[Lfk;")
    private static class14[] field1374;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "[Lda;")
    private static class190[] field1369;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "[Lsd;")
    public static class45[] field1384;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[Lph;")
    private static class80[] field1365;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[Z")
    private static boolean[] field1363;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "[[B")
    private byte[][] field1389;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)[F")
    private final float[] method644(int arg0) {
        method651(this.field1389[arg0], 0);
        method654();
        int var2 = method653(class123.method809(-18779, field1364.length - 1));
        boolean var3 = field1363[var2];
        int var4 = var3 ? field1377 : field1359;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method654() != 0;
            var6 = method654() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1359 >> 2);
            var9 = (field1359 >> 2) + (var4 >> 2);
            var10 = field1359 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1359 >> 2);
            var12 = (field1359 >> 2) + (var4 - (var4 >> 2));
            var13 = field1359 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class80 var14 = field1365[field1364[var2]];
        int var15 = var14.field1103;
        int var16 = var14.field1102[var15];
        boolean var17 = !field1369[var16].method1217();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1105; var19++) {
            class14 var95 = field1374[var14.field1104[var19]];
            float[] var96 = field1370;
            var95.method85(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1103;
            int var21 = var14.field1102[var20];
            field1369[var21].method1221(field1370, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1370[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1370;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1379 : field1378;
            float[] var30 = var3 ? field1375 : field1380;
            float[] var31 = var3 ? field1368 : field1382;
            int[] var32 = var3 ? field1372 : field1373;
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
            int var35 = class123.method809(-18779, var4 - 1);
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
                field1370[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1370[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1371 > 0) {
            int var49 = this.field1371 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1360) {
                for (int var50 = 0; var50 < this.field1385; var50++) {
                    int var51 = (this.field1371 >> 1) + var50;
                    var48[var50] += this.field1388[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1370[var52];
                }
            }
        }
        float[] var54 = this.field1388;
        this.field1388 = field1370;
        field1370 = var54;
        this.field1371 = var4;
        this.field1385 = var12 - (var4 >> 1);
        this.field1360 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)F")
    public static final float method645(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhc;)Z")
    private static final boolean method646(class235 arg0) {
        if (!field1386) {
            byte[] var1 = arg0.method1576(-60, 0, 0);
            if (var1 == null) {
                return false;
            }
            method652(var1);
            field1386 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V")
    private final void method647(byte[] arg0) {
        class224 var2 = new class224(arg0);
        this.field1366 = var2.method1483((byte) 46);
        this.field1361 = var2.method1483((byte) 46);
        this.field1362 = var2.method1483((byte) 46);
        this.field1381 = var2.method1483((byte) 46);
        if (this.field1381 < 0) {
            this.field1381 = ~this.field1381;
            this.field1387 = true;
        }
        int var3 = var2.method1483((byte) 46);
        this.field1389 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1453((byte) -128);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1468(5085, var5, 0, var7);
            this.field1389[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhc;II)Lla;")
    public static final class98 method648(class235 arg0, int arg1, int arg2) {
        if (method646(arg0)) {
            byte[] var3 = arg0.method1576(-57, arg1, arg2);
            return var3 == null ? null : new class98(var3);
        } else {
            arg0.method1564(2, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
    public static void method649() {
        field1367 = null;
        field1384 = null;
        field1369 = null;
        field1374 = null;
        field1365 = null;
        field1363 = null;
        field1364 = null;
        field1370 = null;
        field1378 = null;
        field1380 = null;
        field1382 = null;
        field1379 = null;
        field1375 = null;
        field1368 = null;
        field1373 = null;
        field1372 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I)Lec;")
    public final class24 method650(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1392 == null) {
            this.field1371 = 0;
            this.field1388 = new float[field1377];
            this.field1392 = new byte[this.field1361];
            this.field1391 = 0;
            this.field1390 = 0;
        }
        while (this.field1390 < this.field1389.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method644(this.field1390);
            if (var3 != null) {
                int var4 = this.field1391;
                int var5 = var3.length;
                if (var5 > this.field1361 - var4) {
                    var5 = this.field1361 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1392[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1391;
                }
                this.field1391 = var4;
            }
            this.field1390++;
        }
        this.field1388 = null;
        byte[] var2 = this.field1392;
        this.field1392 = null;
        return new class24(this.field1366, var2, this.field1362, this.field1381, this.field1387);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V")
    private static final void method651(byte[] arg0, int arg1) {
        field1367 = arg0;
        field1383 = arg1;
        field1376 = 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([B)V")
    private static final void method652(byte[] arg0) {
        method651(arg0, 0);
        field1359 = 0x1 << method653(4);
        field1377 = 0x1 << method653(4);
        field1370 = new float[field1377];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1359 : field1377;
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
            int var25 = class123.method809(-18779, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class215.method1398(var26, var25, 0);
            }
            if (var1 == 0) {
                field1378 = var18;
                field1380 = var20;
                field1382 = var22;
                field1373 = var24;
            } else {
                field1379 = var18;
                field1375 = var20;
                field1368 = var22;
                field1372 = var24;
            }
        }
        int var2 = method653(8) + 1;
        field1384 = new class45[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1384[var3] = new class45();
        }
        int var4 = method653(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method653(16);
        }
        int var6 = method653(6) + 1;
        field1369 = new class190[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1369[var7] = new class190();
        }
        int var8 = method653(6) + 1;
        field1374 = new class14[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1374[var9] = new class14();
        }
        int var10 = method653(6) + 1;
        field1365 = new class80[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1365[var11] = new class80();
        }
        int var12 = method653(6) + 1;
        field1363 = new boolean[var12];
        field1364 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1363[var13] = method654() != 0;
            method653(16);
            method653(16);
            field1364[var13] = method653(8);
        }
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)I")
    public static final int method653(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1376) {
            int var4 = 8 - field1376;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1367[field1383] >> field1376 & var5) << var2;
            field1376 = 0;
            field1383++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1367[field1383] >> field1376 & var3) << var2;
            field1376 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public static final int method654() {
        int var0 = field1367[field1383] >> field1376 & 0x1;
        field1376++;
        field1383 += field1376 >> 3;
        field1376 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
    private class98(byte[] arg0) {
        this.method647(arg0);
    }
}
