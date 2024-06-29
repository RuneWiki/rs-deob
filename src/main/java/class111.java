import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class111 extends class539 {

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "Z")
    private static boolean field1512 = false;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
    private static int field1502;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
    private static int field1508;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "I")
    private static int field1514;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!ju", name = "P", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!ju", name = "Q", descriptor = "I")
    private static int field1524;

    @OriginalMember(owner = "client!ju", name = "R", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!ju", name = "S", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!ju", name = "T", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "Z")
    private boolean field1503;

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "Z")
    private boolean field1520;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "[B")
    private static byte[] field1498;

    @OriginalMember(owner = "client!ju", name = "U", descriptor = "[B")
    private byte[] field1528;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[F")
    private static float[] field1495;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "[F")
    private static float[] field1497;

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "[F")
    private float[] field1504;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "[F")
    private static float[] field1507;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "[F")
    private static float[] field1513;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "[F")
    private static float[] field1518;

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "[F")
    private static float[] field1519;

    @OriginalMember(owner = "client!ju", name = "N", descriptor = "[F")
    private static float[] field1521;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "[I")
    private static int[] field1499;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "[I")
    private static int[] field1509;

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "[I")
    private static int[] field1510;

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "[Lvv;")
    public static class294[] field1506;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "[Lis;")
    private static class462[] field1505;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "[Lte;")
    private static class562[] field1516;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "[Lsfa;")
    private static class639[] field1511;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "[Z")
    private static boolean[] field1500;

    @OriginalMember(owner = "client!ju", name = "O", descriptor = "[[B")
    private byte[][] field1522;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([B)V")
    private static final void method826(byte[] arg0) {
        method837(arg0, 0);
        field1508 = 0x1 << method835(4);
        field1524 = 0x1 << method835(4);
        field1513 = new float[field1524];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1508 : field1524;
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
            int var25 = class565.method3125(-257, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class124.method885(var25, (byte) -84, var26);
            }
            if (var1 == 0) {
                field1495 = var18;
                field1507 = var20;
                field1518 = var22;
                field1509 = var24;
            } else {
                field1521 = var18;
                field1519 = var20;
                field1497 = var22;
                field1499 = var24;
            }
        }
        int var2 = method835(8) + 1;
        field1506 = new class294[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1506[var3] = new class294();
        }
        int var4 = method835(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method835(16);
        }
        int var6 = method835(6) + 1;
        field1516 = new class562[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1516[var7] = new class562();
        }
        int var8 = method835(6) + 1;
        field1511 = new class639[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1511[var9] = new class639();
        }
        int var10 = method835(6) + 1;
        field1505 = new class462[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1505[var11] = new class462();
        }
        int var12 = method835(6) + 1;
        field1500 = new boolean[var12];
        field1510 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1500[var13] = method827() != 0;
            method835(16);
            method835(16);
            field1510[var13] = method835(8);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()I")
    public static final int method827() {
        int var0 = field1498[field1514] >> field1502 & 0x1;
        field1502++;
        field1514 += field1502 >> 3;
        field1502 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)[F")
    private final float[] method828(int arg0) {
        method837(this.field1522[arg0], 0);
        method827();
        int var2 = method835(class565.method3125(-257, field1510.length - 1));
        boolean var3 = field1500[var2];
        int var4 = var3 ? field1524 : field1508;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method827() != 0;
            var6 = method827() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1508 >> 2);
            var9 = (field1508 >> 2) + (var4 >> 2);
            var10 = field1508 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1508 >> 2);
            var12 = (field1508 >> 2) + (var4 - (var4 >> 2));
            var13 = field1508 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class462 var14 = field1505[field1510[var2]];
        int var15 = var14.field6518;
        int var16 = var14.field6519[var15];
        boolean var17 = !field1516[var16].method3117();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6521; var19++) {
            class639 var95 = field1511[var14.field6520[var19]];
            float[] var96 = field1513;
            var95.method3564(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6518;
            int var21 = var14.field6519[var20];
            field1516[var21].method3113(field1513, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1513[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1513;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1521 : field1495;
            float[] var30 = var3 ? field1519 : field1507;
            float[] var31 = var3 ? field1497 : field1518;
            int[] var32 = var3 ? field1499 : field1509;
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
            int var35 = class565.method3125(-257, var4 - 1);
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
                field1513[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1513[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1523 > 0) {
            int var49 = this.field1523 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1503) {
                for (int var50 = 0; var50 < this.field1501; var50++) {
                    int var51 = (this.field1523 >> 1) + var50;
                    var48[var50] += this.field1504[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1513[var52];
                }
            }
        }
        float[] var54 = this.field1504;
        this.field1504 = field1513;
        field1513 = var54;
        this.field1523 = var4;
        this.field1501 = var12 - (var4 >> 1);
        this.field1503 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lpj;II)Lju;")
    public static final class111 method829(class132 arg0, int arg1, int arg2) {
        if (method832(arg0)) {
            byte[] var3 = arg0.method940(arg1, arg2, 0);
            return var3 == null ? null : new class111(var3);
        } else {
            arg0.method931((byte) 117, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([I)Lqr;")
    public final class59 method830(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1528 == null) {
            this.field1523 = 0;
            this.field1504 = new float[field1524];
            this.field1528 = new byte[this.field1525];
            this.field1526 = 0;
            this.field1527 = 0;
        }
        while (this.field1527 < this.field1522.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method828(this.field1527);
            if (var3 != null) {
                int var4 = this.field1526;
                int var5 = var3.length;
                if (var5 > this.field1525 - var4) {
                    var5 = this.field1525 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1528[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1526;
                }
                this.field1526 = var4;
            }
            this.field1527++;
        }
        this.field1504 = null;
        byte[] var2 = this.field1528;
        this.field1528 = null;
        return new class59(this.field1496, var2, this.field1515, this.field1517, this.field1520);
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "([B)V")
    private final void method831(byte[] arg0) {
        class96 var2 = new class96(arg0);
        this.field1496 = var2.method714(false);
        this.field1525 = var2.method714(false);
        this.field1515 = var2.method714(false);
        this.field1517 = var2.method714(false);
        if (this.field1517 < 0) {
            this.field1517 = ~this.field1517;
            this.field1520 = true;
        }
        int var3 = var2.method714(false);
        this.field1522 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method718(-126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method719(var7, var5, -7861, 0);
            this.field1522[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lpj;)Z")
    private static final boolean method832(class132 arg0) {
        if (!field1512) {
            byte[] var1 = arg0.method940(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method826(var1);
            field1512 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)F")
    public static final float method833(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lpj;I)Lju;")
    public static final class111 method834(class132 arg0, int arg1) {
        if (method832(arg0)) {
            byte[] var2 = arg0.method938(arg1, (byte) -53);
            return var2 == null ? null : new class111(var2);
        } else {
            arg0.method947(106, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)I")
    public static final int method835(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1502) {
            int var4 = 8 - field1502;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1498[field1514] >> field1502 & var5) << var2;
            field1502 = 0;
            field1514++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1498[field1514] >> field1502 & var3) << var2;
            field1502 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()V")
    public static void method836() {
        field1498 = null;
        field1506 = null;
        field1516 = null;
        field1511 = null;
        field1505 = null;
        field1500 = null;
        field1510 = null;
        field1513 = null;
        field1495 = null;
        field1507 = null;
        field1518 = null;
        field1521 = null;
        field1519 = null;
        field1497 = null;
        field1509 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([BI)V")
    private static final void method837(byte[] arg0, int arg1) {
        field1498 = arg0;
        field1514 = arg1;
        field1502 = 0;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "([B)V")
    private class111(byte[] arg0) {
        this.method831(arg0);
    }
}
