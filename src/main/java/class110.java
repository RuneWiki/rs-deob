import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class110 extends class513 {

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "Z")
    private static boolean field1564 = false;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
    private static int field1557;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    private static int field1573;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    private static int field1574;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    private static int field1578;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!qv", name = "S", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!qv", name = "T", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "Z")
    private boolean field1555;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "Z")
    private boolean field1567;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "[B")
    private static byte[] field1565;

    @OriginalMember(owner = "client!qv", name = "R", descriptor = "[B")
    private byte[] field1584;

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "[F")
    private static float[] field1559;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "[F")
    private static float[] field1561;

    @OriginalMember(owner = "client!qv", name = "u", descriptor = "[F")
    private static float[] field1563;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "[F")
    private static float[] field1566;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "[F")
    private static float[] field1572;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "[F")
    private float[] field1575;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "[F")
    private static float[] field1576;

    @OriginalMember(owner = "client!qv", name = "P", descriptor = "[F")
    private static float[] field1583;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "[I")
    private static int[] field1568;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "[I")
    private static int[] field1569;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "[I")
    private static int[] field1580;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "[Lbg;")
    private static class328[] field1571;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "[Lfba;")
    public static class348[] field1581;

    @OriginalMember(owner = "client!qv", name = "p", descriptor = "[Ltj;")
    private static class684[] field1558;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "[Lkl;")
    private static class709[] field1577;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "[Z")
    private static boolean[] field1562;

    @OriginalMember(owner = "client!qv", name = "n", descriptor = "[[B")
    private byte[][] field1556;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lwu;)Z", line = 3)
    private static final boolean method735(class557 arg0) {
        if (!field1564) {
            byte[] var1 = arg0.method3322(0, 0, (byte) 107);
            if (var1 == null) {
                return false;
            }
            method738(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([B)V", line = 23)
    private final void method736(byte[] arg0) {
        class26 var2 = new class26(arg0);
        this.field1570 = var2.method189(255);
        this.field1560 = var2.method189(255);
        this.field1582 = var2.method189(255);
        this.field1579 = var2.method189(255);
        if (this.field1579 < 0) {
            this.field1579 = ~this.field1579;
            this.field1567 = true;
        }
        int var3 = var2.method189(255);
        this.field1556 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method194((byte) 119);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method149(var7, 0, (byte) -85, var5);
            this.field1556[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([I)Laaa;", line = 68)
    public final class25 method737(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1584 == null) {
            this.field1554 = 0;
            this.field1575 = new float[field1574];
            this.field1584 = new byte[this.field1560];
            this.field1585 = 0;
            this.field1586 = 0;
        }
        while (this.field1586 < this.field1556.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method740(this.field1586);
            if (var3 != null) {
                int var4 = this.field1585;
                int var5 = var3.length;
                if (var5 > this.field1560 - var4) {
                    var5 = this.field1560 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1584[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1585;
                }
                this.field1585 = var4;
            }
            this.field1586++;
        }
        this.field1575 = null;
        byte[] var2 = this.field1584;
        this.field1584 = null;
        return new class25(this.field1570, var2, this.field1582, this.field1579, this.field1567);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "([B)V", line = 126)
    private static final void method738(byte[] arg0) {
        method745(arg0, 0);
        field1578 = 0x1 << method739(4);
        field1574 = 0x1 << method739(4);
        field1583 = new float[field1574];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1578 : field1574;
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
            int var25 = class668.method3830((byte) -7, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class55.method375(var26, var25, true);
            }
            if (var1 == 0) {
                field1566 = var18;
                field1561 = var20;
                field1576 = var22;
                field1580 = var24;
            } else {
                field1572 = var18;
                field1563 = var20;
                field1559 = var22;
                field1568 = var24;
            }
        }
        int var2 = method739(8) + 1;
        field1581 = new class348[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1581[var3] = new class348();
        }
        int var4 = method739(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method739(16);
        }
        int var6 = method739(6) + 1;
        field1558 = new class684[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1558[var7] = new class684();
        }
        int var8 = method739(6) + 1;
        field1577 = new class709[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1577[var9] = new class709();
        }
        int var10 = method739(6) + 1;
        field1571 = new class328[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1571[var11] = new class328();
        }
        int var12 = method739(6) + 1;
        field1562 = new boolean[var12];
        field1569 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1562[var13] = method741() != 0;
            method739(16);
            method739(16);
            field1569[var13] = method739(8);
        }
        field1564 = true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I", line = 283)
    public static final int method739(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1573) {
            int var4 = 8 - field1573;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1565[field1557] >> field1573 & var5) << var2;
            field1573 = 0;
            field1557++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1565[field1557] >> field1573 & var3) << var2;
            field1573 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)[F", line = 310)
    private final float[] method740(int arg0) {
        method745(this.field1556[arg0], 0);
        method741();
        int var2 = method739(class668.method3830((byte) -7, field1569.length - 1));
        boolean var3 = field1562[var2];
        int var4 = var3 ? field1574 : field1578;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method741() != 0;
            var6 = method741() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1578 >> 2);
            var9 = (field1578 >> 2) + (var4 >> 2);
            var10 = field1578 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1578 >> 2);
            var12 = (field1578 >> 2) + (var4 - (var4 >> 2));
            var13 = field1578 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class328 var14 = field1571[field1569[var2]];
        int var15 = var14.field4212;
        int var16 = var14.field4213[var15];
        boolean var17 = !field1558[var16].method3906();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4211; var19++) {
            class709 var95 = field1577[var14.field4210[var19]];
            float[] var96 = field1583;
            var95.method3988(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4212;
            int var21 = var14.field4213[var20];
            field1558[var21].method3909(field1583, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1583[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1583;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1572 : field1566;
            float[] var30 = var3 ? field1563 : field1561;
            float[] var31 = var3 ? field1559 : field1576;
            int[] var32 = var3 ? field1568 : field1580;
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
            int var35 = class668.method3830((byte) -7, var4 - 1);
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
                field1583[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1583[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1554 > 0) {
            int var49 = this.field1554 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1555) {
                for (int var50 = 0; var50 < this.field1553; var50++) {
                    int var51 = (this.field1554 >> 1) + var50;
                    var48[var50] += this.field1575[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1583[var52];
                }
            }
        }
        float[] var54 = this.field1575;
        this.field1575 = field1583;
        field1583 = var54;
        this.field1554 = var4;
        this.field1553 = var12 - (var4 >> 1);
        this.field1555 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()I", line = 726)
    public static final int method741() {
        int var0 = field1565[field1557] >> field1573 & 0x1;
        field1573++;
        field1557 += field1573 >> 3;
        field1573 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)F", line = 741)
    public static final float method742(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lwu;I)Lqv;", line = 752)
    public static final class110 method743(class557 arg0, int arg1) {
        if (method735(arg0)) {
            byte[] var2 = arg0.method3318(8941, arg1);
            return var2 == null ? null : new class110(var2);
        } else {
            arg0.method3340(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lwu;II)Lqv;", line = 774)
    public static final class110 method744(class557 arg0, int arg1, int arg2) {
        if (method735(arg0)) {
            byte[] var3 = arg0.method3322(arg1, arg2, (byte) 116);
            return var3 == null ? null : new class110(var3);
        } else {
            arg0.method3321(arg1, (byte) 112, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([BI)V", line = 788)
    private static final void method745(byte[] arg0, int arg1) {
        field1565 = arg0;
        field1557 = arg1;
        field1573 = 0;
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()V", line = 797)
    public static void method746() {
        field1565 = null;
        field1581 = null;
        field1558 = null;
        field1577 = null;
        field1571 = null;
        field1562 = null;
        field1569 = null;
        field1583 = null;
        field1566 = null;
        field1561 = null;
        field1576 = null;
        field1572 = null;
        field1563 = null;
        field1559 = null;
        field1580 = null;
        field1568 = null;
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "([B)V", line = 816)
    private class110(byte[] arg0) {
        this.method736(arg0);
    }
}
