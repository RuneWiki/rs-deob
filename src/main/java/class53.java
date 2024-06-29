import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
    private static boolean field1406 = false;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    private static int field1387;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    private static int field1390;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private static int field1396;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    private static int field1398;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    private static int field1408;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private static int field1410;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Z")
    private boolean field1382;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Z")
    private static boolean field1397;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[B")
    private static byte[] field1411;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[F")
    private static float[] field1384;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[F")
    private static float[] field1386;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[F")
    private static float[] field1388;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[F")
    private static float[] field1391;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[F")
    private static float[] field1394;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[F")
    private static float[] field1399;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[F")
    private static float[] field1401;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[F")
    private static float[] field1403;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    private static int[] field1385;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[I")
    private static int[] field1407;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[I")
    private static int[] field1409;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[Lta;")
    public static class129[] field1392;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[Lic;")
    private static class59[] field1393;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[Laf;")
    private static class7[] field1400;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[Lle;")
    private static class81[] field1383;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "[Z")
    private static boolean[] field1412;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[[B")
    private byte[][] field1389;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lff;I)Lhd;")
    public static final class53 method415(class42 arg0, int arg1) {
        if (method420(arg0)) {
            byte[] var2 = arg0.method304(arg1, true);
            return var2 == null ? null : new class53(var2);
        } else {
            arg0.method326(3918, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()I")
    public static final int method416() {
        int var0 = field1411[field1387] >> field1398 & 0x1;
        field1398++;
        field1387 += field1398 >> 3;
        field1398 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([B)V")
    private static final void method417(byte[] arg0) {
        method418(arg0, 0);
        field1396 = 0x1 << method422(4);
        field1390 = 0x1 << method422(4);
        field1399 = new float[field1390];
        field1394 = new float[field1390];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1396 : field1390;
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
            int var25 = class68.method524(var17 - 1, (byte) -73);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class74.method557(var25, (byte) -45, var26);
            }
            if (var1 == 0) {
                field1388 = var18;
                field1401 = var20;
                field1384 = var22;
                field1409 = var24;
            } else {
                field1386 = var18;
                field1391 = var20;
                field1403 = var22;
                field1385 = var24;
            }
        }
        int var2 = method422(8) + 1;
        field1392 = new class129[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1392[var3] = new class129();
        }
        int var4 = method422(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method422(16);
        }
        int var6 = method422(6) + 1;
        field1383 = new class81[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1383[var7] = new class81();
        }
        int var8 = method422(6) + 1;
        field1393 = new class59[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1393[var9] = new class59();
        }
        int var10 = method422(6) + 1;
        field1400 = new class7[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1400[var11] = new class7();
        }
        int var12 = method422(6) + 1;
        field1412 = new boolean[var12];
        field1407 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1412[var13] = method416() != 0;
            method422(16);
            method422(16);
            field1407[var13] = method422(8);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)V")
    private static final void method418(byte[] arg0, int arg1) {
        field1411 = arg0;
        field1387 = arg1;
        field1398 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()Lqe;")
    public final class115 method419() {
        field1408 = 0;
        byte[] var1 = new byte[this.field1395];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1389.length; var3++) {
            float[] var4 = this.method425(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field1395 - var2) {
                    var5 = this.field1395 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class115(this.field1405, var1, this.field1402, this.field1404, this.field1382);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lff;)Z")
    private static final boolean method420(class42 arg0) {
        if (!field1406) {
            byte[] var1 = arg0.method315(0, true, 0);
            if (var1 == null) {
                return false;
            }
            method417(var1);
            field1406 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
    private class53(byte[] arg0) {
        this.method421(arg0);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "([B)V")
    private final void method421(byte[] arg0) {
        class148 var2 = new class148(arg0);
        this.field1405 = var2.method1104(true);
        this.field1395 = var2.method1104(true);
        this.field1402 = var2.method1104(true);
        this.field1404 = var2.method1104(true);
        if (this.field1404 < 0) {
            this.field1404 = ~this.field1404;
            this.field1382 = true;
        }
        int var3 = var2.method1104(true);
        this.field1389 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1137(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1103(var5, 119, var7, 0);
            this.field1389[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
    public static final int method422(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1398) {
            int var4 = 8 - field1398;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1411[field1387] >> field1398 & var5) << var2;
            field1398 = 0;
            field1387++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1411[field1387] >> field1398 & var3) << var2;
            field1398 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)F")
    public static final float method423(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
    public static void method424() {
        field1411 = null;
        field1392 = null;
        field1383 = null;
        field1393 = null;
        field1400 = null;
        field1412 = null;
        field1407 = null;
        field1394 = null;
        field1399 = null;
        field1388 = null;
        field1401 = null;
        field1384 = null;
        field1386 = null;
        field1391 = null;
        field1403 = null;
        field1409 = null;
        field1385 = null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)[F")
    private final float[] method425(int arg0) {
        method418(this.field1389[arg0], 0);
        method416();
        int var2 = method422(class68.method524(field1407.length - 1, (byte) -25));
        boolean var3 = field1412[var2];
        int var4 = var3 ? field1390 : field1396;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method416() != 0;
            var6 = method416() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1396 >> 2);
            var9 = (field1396 >> 2) + (var4 >> 2);
            var10 = field1396 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1396 >> 2);
            var12 = (field1396 >> 2) + (var4 - (var4 >> 2));
            var13 = field1396 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class7 var14 = field1400[field1407[var2]];
        int var15 = var14.field164;
        int var16 = var14.field165[var15];
        boolean var17 = !field1383[var16].method586();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field163; var19++) {
            class59 var95 = field1393[var14.field166[var19]];
            float[] var96 = field1399;
            var95.method449(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field164;
            int var21 = var14.field165[var20];
            field1383[var21].method589(field1399, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1399[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1399;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1386 : field1388;
            float[] var30 = var3 ? field1391 : field1401;
            float[] var31 = var3 ? field1403 : field1384;
            int[] var32 = var3 ? field1385 : field1409;
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
            int var35 = class68.method524(var4 - 1, (byte) -97);
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
                field1399[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1399[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field1408 > 0) {
            int var49 = field1408 + var4 >> 2;
            var48 = new float[var49];
            if (!field1397) {
                for (int var50 = 0; var50 < field1410; var50++) {
                    int var51 = (field1408 >> 1) + var50;
                    var48[var50] += field1394[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1399[var52];
                }
            }
        }
        float[] var54 = field1394;
        field1394 = field1399;
        field1399 = var54;
        field1408 = var4;
        field1410 = var12 - (var4 >> 1);
        field1397 = var17;
        return var48;
    }
}
