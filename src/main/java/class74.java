import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class74 extends class80 {

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Z")
    private static boolean field1458 = false;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    private static int field1465;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    private static int field1470;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    private static int field1481;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    private static int field1484;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Z")
    private boolean field1456;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Z")
    private boolean field1482;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "[B")
    private static byte[] field1474;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "[B")
    private byte[] field1486;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[F")
    private static float[] field1459;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[F")
    private static float[] field1460;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "[F")
    private static float[] field1464;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "[F")
    private static float[] field1467;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[F")
    private static float[] field1469;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "[F")
    private static float[] field1475;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "[F")
    private static float[] field1477;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "[F")
    private float[] field1478;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[I")
    private static int[] field1463;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[I")
    private static int[] field1476;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "[I")
    private static int[] field1483;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "[Lgd;")
    private static class169[] field1466;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "[Lge;")
    private static class204[] field1468;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "[Lda;")
    public static class22[] field1479;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[Lqi;")
    private static class6[] field1455;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "[Z")
    private static boolean[] field1472;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "[[B")
    private byte[][] field1462;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)I")
    public static final int method524(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1465) {
            int var4 = 8 - field1465;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1474[field1481] >> field1465 & var5) << var2;
            field1465 = 0;
            field1481++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1474[field1481] >> field1465 & var3) << var2;
            field1465 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([B)V")
    private final void method525(byte[] arg0) {
        class249 var2 = new class249(arg0);
        this.field1473 = var2.method1652(-5528);
        this.field1461 = var2.method1652(-5528);
        this.field1480 = var2.method1652(-5528);
        this.field1454 = var2.method1652(-5528);
        if (this.field1454 < 0) {
            this.field1454 = ~this.field1454;
            this.field1482 = true;
        }
        int var3 = var2.method1652(-5528);
        this.field1462 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1677(-6677);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1665(0, 0, var5, var7);
            this.field1462[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lcj;II)Lq;")
    public static final class74 method526(class28 arg0, int arg1, int arg2) {
        if (method532(arg0)) {
            byte[] var3 = arg0.method135(arg2, 0, arg1);
            return var3 == null ? null : new class74(var3);
        } else {
            arg0.method141(arg1, arg2, (byte) -101);
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([I)Lk;")
    public final class177 method527(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1486 == null) {
            this.field1471 = 0;
            this.field1478 = new float[field1484];
            this.field1486 = new byte[this.field1461];
            this.field1485 = 0;
            this.field1487 = 0;
        }
        while (this.field1487 < this.field1462.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method529(this.field1487);
            if (var3 != null) {
                int var4 = this.field1485;
                int var5 = var3.length;
                if (var5 > this.field1461 - var4) {
                    var5 = this.field1461 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1486[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1485;
                }
                this.field1485 = var4;
            }
            this.field1487++;
        }
        this.field1478 = null;
        byte[] var2 = this.field1486;
        this.field1486 = null;
        return new class177(this.field1473, var2, this.field1480, this.field1454, this.field1482);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([BI)V")
    private static final void method528(byte[] arg0, int arg1) {
        field1474 = arg0;
        field1481 = arg1;
        field1465 = 0;
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)[F")
    private final float[] method529(int arg0) {
        method528(this.field1462[arg0], 0);
        method530();
        int var2 = method524(class29.method161(field1463.length - 1, (byte) 33));
        boolean var3 = field1472[var2];
        int var4 = var3 ? field1484 : field1470;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method530() != 0;
            var6 = method530() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1470 >> 2);
            var9 = (field1470 >> 2) + (var4 >> 2);
            var10 = field1470 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1470 >> 2);
            var12 = (field1470 >> 2) + (var4 - (var4 >> 2));
            var13 = field1470 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class6 var14 = field1455[field1463[var2]];
        int var15 = var14.field54;
        int var16 = var14.field57[var15];
        boolean var17 = !field1468[var16].method1323();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field55; var19++) {
            class169 var95 = field1466[var14.field56[var19]];
            float[] var96 = field1477;
            var95.method1158(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field54;
            int var21 = var14.field57[var20];
            field1468[var21].method1324(field1477, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1477[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1477;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1467 : field1459;
            float[] var30 = var3 ? field1469 : field1475;
            float[] var31 = var3 ? field1464 : field1460;
            int[] var32 = var3 ? field1476 : field1483;
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
            int var35 = class29.method161(var4 - 1, (byte) -114);
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
                field1477[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1477[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1471 > 0) {
            int var49 = this.field1471 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1456) {
                for (int var50 = 0; var50 < this.field1457; var50++) {
                    int var51 = (this.field1471 >> 1) + var50;
                    var48[var50] += this.field1478[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1477[var52];
                }
            }
        }
        float[] var54 = this.field1478;
        this.field1478 = field1477;
        field1477 = var54;
        this.field1471 = var4;
        this.field1457 = var12 - (var4 >> 1);
        this.field1456 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()I")
    public static final int method530() {
        int var0 = field1474[field1481] >> field1465 & 0x1;
        field1465++;
        field1481 += field1465 >> 3;
        field1465 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)F")
    public static final float method531(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lcj;)Z")
    private static final boolean method532(class28 arg0) {
        if (!field1458) {
            byte[] var1 = arg0.method135(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method533(var1);
            field1458 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "([B)V")
    private static final void method533(byte[] arg0) {
        method528(arg0, 0);
        field1470 = 0x1 << method524(4);
        field1484 = 0x1 << method524(4);
        field1477 = new float[field1484];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1470 : field1484;
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
            int var25 = class29.method161(var17 - 1, (byte) 75);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class176.method1185((byte) -88, var26, var25);
            }
            if (var1 == 0) {
                field1459 = var18;
                field1475 = var20;
                field1460 = var22;
                field1483 = var24;
            } else {
                field1467 = var18;
                field1469 = var20;
                field1464 = var22;
                field1476 = var24;
            }
        }
        int var2 = method524(8) + 1;
        field1479 = new class22[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1479[var3] = new class22();
        }
        int var4 = method524(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method524(16);
        }
        int var6 = method524(6) + 1;
        field1468 = new class204[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1468[var7] = new class204();
        }
        int var8 = method524(6) + 1;
        field1466 = new class169[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1466[var9] = new class169();
        }
        int var10 = method524(6) + 1;
        field1455 = new class6[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1455[var11] = new class6();
        }
        int var12 = method524(6) + 1;
        field1472 = new boolean[var12];
        field1463 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1472[var13] = method530() != 0;
            method524(16);
            method524(16);
            field1463[var13] = method524(8);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
    public static void method534() {
        field1474 = null;
        field1479 = null;
        field1468 = null;
        field1466 = null;
        field1455 = null;
        field1472 = null;
        field1463 = null;
        field1477 = null;
        field1459 = null;
        field1475 = null;
        field1460 = null;
        field1467 = null;
        field1469 = null;
        field1464 = null;
        field1483 = null;
        field1476 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "([B)V")
    private class74(byte[] arg0) {
        this.method525(arg0);
    }
}
