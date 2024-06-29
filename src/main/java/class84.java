import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class84 extends class182 {

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "Z")
    private static boolean field1535 = false;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private static int field1532;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    private static int field1549;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    private static int field1550;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    private static int field1551;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Z")
    private boolean field1525;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Z")
    private boolean field1534;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[B")
    private static byte[] field1529;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "[B")
    private byte[] field1555;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[F")
    private static float[] field1527;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[F")
    private static float[] field1528;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[F")
    private static float[] field1530;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[F")
    private static float[] field1533;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "[F")
    private static float[] field1538;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "[F")
    private float[] field1540;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "[F")
    private static float[] field1541;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "[F")
    private static float[] field1552;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    private static int[] field1526;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
    private static int[] field1542;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[I")
    private static int[] field1544;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "[Lrd;")
    private static class157[] field1537;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[Luf;")
    private static class186[] field1539;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "[Lfc;")
    public static class50[] field1545;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[Lie;")
    private static class78[] field1524;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Z")
    private static boolean[] field1536;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "[[B")
    private byte[][] field1531;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)[F")
    private final float[] method500(int arg0) {
        method510(this.field1531[arg0], 0);
        method504();
        int var2 = method506(class147.method961(field1526.length - 1, 12482));
        boolean var3 = field1536[var2];
        int var4 = var3 ? field1550 : field1551;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method504() != 0;
            var6 = method504() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1551 >> 2);
            var9 = (field1551 >> 2) + (var4 >> 2);
            var10 = field1551 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1551 >> 2);
            var12 = (field1551 >> 2) + (var4 - (var4 >> 2));
            var13 = field1551 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class186 var14 = field1539[field1526[var2]];
        int var15 = var14.field3625;
        int var16 = var14.field3628[var15];
        boolean var17 = !field1524[var16].method472();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3626; var19++) {
            class157 var95 = field1537[var14.field3627[var19]];
            float[] var96 = field1538;
            var95.method1015(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3625;
            int var21 = var14.field3628[var20];
            field1524[var21].method477(field1538, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1538[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1538;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1541 : field1527;
            float[] var30 = var3 ? field1530 : field1533;
            float[] var31 = var3 ? field1552 : field1528;
            int[] var32 = var3 ? field1542 : field1544;
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
            int var35 = class147.method961(var4 - 1, 12482);
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
                field1538[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1538[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1547 > 0) {
            int var49 = this.field1547 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1534) {
                for (int var50 = 0; var50 < this.field1522; var50++) {
                    int var51 = (this.field1547 >> 1) + var50;
                    var48[var50] += this.field1540[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1538[var52];
                }
            }
        }
        float[] var54 = this.field1540;
        this.field1540 = field1538;
        field1538 = var54;
        this.field1547 = var4;
        this.field1522 = var12 - (var4 >> 1);
        this.field1534 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V")
    private final void method501(byte[] arg0) {
        class127 var2 = new class127(arg0);
        this.field1523 = var2.method814(8);
        this.field1543 = var2.method814(8);
        this.field1546 = var2.method814(8);
        this.field1548 = var2.method814(8);
        if (this.field1548 < 0) {
            this.field1548 = ~this.field1548;
            this.field1525 = true;
        }
        int var3 = var2.method814(8);
        this.field1531 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method819((byte) 22);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method786(419699672, var5, 0, var7);
            this.field1531[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([I)Ljb;")
    public final class83 method502(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1555 == null) {
            this.field1547 = 0;
            this.field1540 = new float[field1550];
            this.field1555 = new byte[this.field1543];
            this.field1554 = 0;
            this.field1553 = 0;
        }
        while (this.field1553 < this.field1531.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method500(this.field1553);
            if (var3 != null) {
                int var4 = this.field1554;
                int var5 = var3.length;
                if (var5 > this.field1543 - var4) {
                    var5 = this.field1543 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1555[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1554;
                }
                this.field1554 = var4;
            }
            this.field1553++;
        }
        this.field1540 = null;
        byte[] var2 = this.field1555;
        this.field1555 = null;
        return new class83(this.field1523, var2, this.field1546, this.field1548, this.field1525);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "([B)V")
    private static final void method503(byte[] arg0) {
        method510(arg0, 0);
        field1551 = 0x1 << method506(4);
        field1550 = 0x1 << method506(4);
        field1538 = new float[field1550];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1551 : field1550;
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
            int var25 = class147.method961(var17 - 1, 12482);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class80.method487(var25, var26, (byte) -124);
            }
            if (var1 == 0) {
                field1527 = var18;
                field1533 = var20;
                field1528 = var22;
                field1544 = var24;
            } else {
                field1541 = var18;
                field1530 = var20;
                field1552 = var22;
                field1542 = var24;
            }
        }
        int var2 = method506(8) + 1;
        field1545 = new class50[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1545[var3] = new class50();
        }
        int var4 = method506(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method506(16);
        }
        int var6 = method506(6) + 1;
        field1524 = new class78[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1524[var7] = new class78();
        }
        int var8 = method506(6) + 1;
        field1537 = new class157[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1537[var9] = new class157();
        }
        int var10 = method506(6) + 1;
        field1539 = new class186[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1539[var11] = new class186();
        }
        int var12 = method506(6) + 1;
        field1536 = new boolean[var12];
        field1526 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1536[var13] = method504() != 0;
            method506(16);
            method506(16);
            field1526[var13] = method506(8);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
    public static final int method504() {
        int var0 = field1529[field1532] >> field1549 & 0x1;
        field1549++;
        field1532 += field1549 >> 3;
        field1549 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)F")
    public static final float method505(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)I")
    public static final int method506(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1549) {
            int var4 = 8 - field1549;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1529[field1532] >> field1549 & var5) << var2;
            field1549 = 0;
            field1532++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1529[field1532] >> field1549 & var3) << var2;
            field1549 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lke;II)Ljc;")
    public static final class84 method507(class95 arg0, int arg1, int arg2) {
        if (method509(arg0)) {
            byte[] var3 = arg0.method552(arg2, arg1, 0);
            return var3 == null ? null : new class84(var3);
        } else {
            arg0.method567(arg2, 19406, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V")
    public static void method508() {
        field1529 = null;
        field1545 = null;
        field1524 = null;
        field1537 = null;
        field1539 = null;
        field1536 = null;
        field1526 = null;
        field1538 = null;
        field1527 = null;
        field1533 = null;
        field1528 = null;
        field1541 = null;
        field1530 = null;
        field1552 = null;
        field1544 = null;
        field1542 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lke;)Z")
    private static final boolean method509(class95 arg0) {
        if (!field1535) {
            byte[] var1 = arg0.method552(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method503(var1);
            field1535 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V")
    private class84(byte[] arg0) {
        this.method501(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V")
    private static final void method510(byte[] arg0, int arg1) {
        field1529 = arg0;
        field1532 = arg1;
        field1549 = 0;
    }
}
