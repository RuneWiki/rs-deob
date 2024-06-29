import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 extends class5 {

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "Z")
    private static boolean field1369 = false;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    private static int field1353;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    private static int field1354;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    private static int field1378;

    @OriginalMember(owner = "client!hf", name = "lb", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!hf", name = "ob", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Z")
    private boolean field1355;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Z")
    private boolean field1367;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "[B")
    private static byte[] field1351;

    @OriginalMember(owner = "client!hf", name = "mb", descriptor = "[B")
    private byte[] field1382;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "[F")
    private static float[] field1356;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "[F")
    private static float[] field1359;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "[F")
    private static float[] field1362;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "[F")
    private static float[] field1363;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "[F")
    private static float[] field1366;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "[F")
    private static float[] field1370;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "[F")
    private float[] field1371;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "[F")
    private static float[] field1372;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
    private static int[] field1358;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[I")
    private static int[] field1361;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
    private static int[] field1365;

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "[Lpb;")
    private static class106[] field1379;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "[Lrd;")
    public static class122[] field1376;

    @OriginalMember(owner = "client!hf", name = "kb", descriptor = "[Le;")
    private static class29[] field1380;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[Led;")
    private static class33[] field1364;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "[Z")
    private static boolean[] field1375;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[[B")
    private byte[][] field1357;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)[F")
    private final float[] method422(int arg0) {
        method426(this.field1357[arg0], 0);
        method432();
        int var2 = method429(class135.method1013(field1361.length - 1, -128));
        boolean var3 = field1375[var2];
        int var4 = var3 ? field1353 : field1354;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method432() != 0;
            var6 = method432() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1354 >> 2);
            var9 = (field1354 >> 2) + (var4 >> 2);
            var10 = field1354 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1354 >> 2);
            var12 = (field1354 >> 2) + (var4 - (var4 >> 2));
            var13 = field1354 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class106 var14 = field1379[field1361[var2]];
        int var15 = var14.field2605;
        int var16 = var14.field2608[var15];
        boolean var17 = !field1380[var16].method219();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2606; var19++) {
            class33 var95 = field1364[var14.field2607[var19]];
            float[] var96 = field1359;
            var95.method251(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2605;
            int var21 = var14.field2608[var20];
            field1380[var21].method222(field1359, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1359[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1359;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1362 : field1363;
            float[] var30 = var3 ? field1372 : field1370;
            float[] var31 = var3 ? field1366 : field1356;
            int[] var32 = var3 ? field1365 : field1358;
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
            int var35 = class135.method1013(var4 - 1, -118);
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
                field1359[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1359[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1352 > 0) {
            int var49 = this.field1352 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1367) {
                for (int var50 = 0; var50 < this.field1373; var50++) {
                    int var51 = (this.field1352 >> 1) + var50;
                    var48[var50] += this.field1371[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1359[var52];
                }
            }
        }
        float[] var54 = this.field1371;
        this.field1371 = field1359;
        field1359 = var54;
        this.field1352 = var4;
        this.field1373 = var12 - (var4 >> 1);
        this.field1367 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([B)V")
    private final void method423(byte[] arg0) {
        class83 var2 = new class83(arg0);
        this.field1360 = var2.method641((byte) 73);
        this.field1381 = var2.method641((byte) 73);
        this.field1377 = var2.method641((byte) 73);
        this.field1368 = var2.method641((byte) 73);
        if (this.field1368 < 0) {
            this.field1368 = ~this.field1368;
            this.field1355 = true;
        }
        int var3 = var2.method641((byte) 73);
        this.field1357 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method638(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method675(0, (byte) -12, var5, var7);
            this.field1357[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lef;)Z")
    private static final boolean method424(class35 arg0) {
        if (!field1369) {
            byte[] var1 = arg0.method266(0, (byte) 105, 0);
            if (var1 == null) {
                return false;
            }
            method430(var1);
            field1369 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lef;II)Lhf;")
    public static final class55 method425(class35 arg0, int arg1, int arg2) {
        if (method424(arg0)) {
            byte[] var3 = arg0.method266(arg1, (byte) 124, arg2);
            return var3 == null ? null : new class55(var3);
        } else {
            arg0.method260((byte) -4, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BI)V")
    private static final void method426(byte[] arg0, int arg1) {
        field1351 = arg0;
        field1378 = arg1;
        field1374 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([I)Lnb;")
    public final class92 method427(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1382 == null) {
            this.field1352 = 0;
            this.field1371 = new float[field1353];
            this.field1382 = new byte[this.field1381];
            this.field1383 = 0;
            this.field1384 = 0;
        }
        while (this.field1384 < this.field1357.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method422(this.field1384);
            if (var3 != null) {
                int var4 = this.field1383;
                int var5 = var3.length;
                if (var5 > this.field1381 - var4) {
                    var5 = this.field1381 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1382[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1383;
                }
                this.field1383 = var4;
            }
            this.field1384++;
        }
        this.field1371 = null;
        byte[] var2 = this.field1382;
        this.field1382 = null;
        return new class92(this.field1360, var2, this.field1377, this.field1368, this.field1355);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)F")
    public static final float method428(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)I")
    public static final int method429(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1374) {
            int var4 = 8 - field1374;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1351[field1378] >> field1374 & var5) << var2;
            field1374 = 0;
            field1378++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1351[field1378] >> field1374 & var3) << var2;
            field1374 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "([B)V")
    private static final void method430(byte[] arg0) {
        method426(arg0, 0);
        field1354 = 0x1 << method429(4);
        field1353 = 0x1 << method429(4);
        field1359 = new float[field1353];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1354 : field1353;
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
            int var25 = class135.method1013(var17 - 1, 73);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class54.method419(-46, var26, var25);
            }
            if (var1 == 0) {
                field1363 = var18;
                field1370 = var20;
                field1356 = var22;
                field1358 = var24;
            } else {
                field1362 = var18;
                field1372 = var20;
                field1366 = var22;
                field1365 = var24;
            }
        }
        int var2 = method429(8) + 1;
        field1376 = new class122[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1376[var3] = new class122();
        }
        int var4 = method429(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method429(16);
        }
        int var6 = method429(6) + 1;
        field1380 = new class29[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1380[var7] = new class29();
        }
        int var8 = method429(6) + 1;
        field1364 = new class33[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1364[var9] = new class33();
        }
        int var10 = method429(6) + 1;
        field1379 = new class106[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1379[var11] = new class106();
        }
        int var12 = method429(6) + 1;
        field1375 = new boolean[var12];
        field1361 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1375[var13] = method432() != 0;
            method429(16);
            method429(16);
            field1361[var13] = method429(8);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V")
    public static void method431() {
        field1351 = null;
        field1376 = null;
        field1380 = null;
        field1364 = null;
        field1379 = null;
        field1375 = null;
        field1361 = null;
        field1359 = null;
        field1363 = null;
        field1370 = null;
        field1356 = null;
        field1362 = null;
        field1372 = null;
        field1366 = null;
        field1358 = null;
        field1365 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()I")
    public static final int method432() {
        int var0 = field1351[field1378] >> field1374 & 0x1;
        field1374++;
        field1378 += field1374 >> 3;
        field1374 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([B)V")
    private class55(byte[] arg0) {
        this.method423(arg0);
    }
}
