import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class459 extends class435 {

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
    private static boolean field6592 = false;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field6589;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private static int field6590;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    private static int field6591;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
    private int field6597;

    @OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
    private int field6599;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    private static int field6603;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    private int field6607;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    private int field6609;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    private static int field6613;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    private int field6616;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    private int field6617;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
    private boolean field6586;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Z")
    private boolean field6611;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[B")
    private static byte[] field6608;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "[B")
    private byte[] field6618;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[F")
    private static float[] field6587;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[F")
    private static float[] field6595;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[F")
    private static float[] field6596;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "[F")
    private static float[] field6598;

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "[F")
    private static float[] field6600;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "[F")
    private static float[] field6602;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[F")
    private float[] field6606;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "[F")
    private static float[] field6614;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "[I")
    private static int[] field6604;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "[I")
    private static int[] field6610;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "[I")
    private static int[] field6615;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[Lwda;")
    private static class442[] field6585;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[Lida;")
    private static class604[] field6612;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "[Ltfa;")
    private static class610[] field6593;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "[Lnaa;")
    public static class85[] field6605;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "[Z")
    private static boolean[] field6601;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[[B")
    private byte[][] field6594;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 13)
    public static final int method2662(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6590) {
            int var4 = 8 - field6590;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6608[field6591] >> field6590 & var5) << var2;
            field6590 = 0;
            field6591++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6608[field6591] >> field6590 & var3) << var2;
            field6590 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I)Ltk;", line = 40)
    public final class95 method2663(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6618 == null) {
            this.field6588 = 0;
            this.field6606 = new float[field6603];
            this.field6618 = new byte[this.field6589];
            this.field6617 = 0;
            this.field6616 = 0;
        }
        while (this.field6616 < this.field6594.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2668(this.field6616);
            if (var3 != null) {
                int var4 = this.field6617;
                int var5 = var3.length;
                if (var5 > this.field6589 - var4) {
                    var5 = this.field6589 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6618[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6617;
                }
                this.field6617 = var4;
            }
            this.field6616++;
        }
        this.field6606 = null;
        byte[] var2 = this.field6618;
        this.field6618 = null;
        return new class95(this.field6597, var2, this.field6599, this.field6607, this.field6611);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B)V", line = 99)
    private final void method2664(byte[] arg0) {
        class465 var2 = new class465(arg0);
        this.field6597 = var2.method2691((byte) -67);
        this.field6589 = var2.method2691((byte) -67);
        this.field6599 = var2.method2691((byte) -67);
        this.field6607 = var2.method2691((byte) -67);
        if (this.field6607 < 0) {
            this.field6607 = ~this.field6607;
            this.field6611 = true;
        }
        int var3 = var2.method2691((byte) -67);
        this.field6594 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2705(-95);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2750(var7, -104, var5, 0);
            this.field6594[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvo;I)Lee;", line = 143)
    public static final class459 method2665(class345 arg0, int arg1) {
        if (method2669(arg0)) {
            byte[] var2 = arg0.method2086(1024, arg1);
            return var2 == null ? null : new class459(var2);
        } else {
            arg0.method2077(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V", line = 158)
    private static final void method2666(byte[] arg0, int arg1) {
        field6608 = arg0;
        field6591 = arg1;
        field6590 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)F", line = 166)
    public static final float method2667(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)[F", line = 179)
    private final float[] method2668(int arg0) {
        method2666(this.field6594[arg0], 0);
        method2672();
        int var2 = method2662(class122.method983(field6604.length - 1, -257));
        boolean var3 = field6601[var2];
        int var4 = var3 ? field6603 : field6613;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2672() != 0;
            var6 = method2672() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6613 >> 2);
            var9 = (field6613 >> 2) + (var4 >> 2);
            var10 = field6613 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6613 >> 2);
            var12 = (field6613 >> 2) + (var4 - (var4 >> 2));
            var13 = field6613 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class610 var14 = field6593[field6604[var2]];
        int var15 = var14.field8764;
        int var16 = var14.field8761[var15];
        boolean var17 = !field6612[var16].method3437();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field8763; var19++) {
            class442 var95 = field6585[var14.field8762[var19]];
            float[] var96 = field6600;
            var95.method2583(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field8764;
            int var21 = var14.field8761[var20];
            field6612[var21].method3438(field6600, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6600[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6600;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6602 : field6596;
            float[] var30 = var3 ? field6614 : field6595;
            float[] var31 = var3 ? field6598 : field6587;
            int[] var32 = var3 ? field6615 : field6610;
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
            int var35 = class122.method983(var4 - 1, -257);
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
                field6600[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6600[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6588 > 0) {
            int var49 = this.field6588 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6586) {
                for (int var50 = 0; var50 < this.field6609; var50++) {
                    int var51 = (this.field6588 >> 1) + var50;
                    var48[var50] += this.field6606[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6600[var52];
                }
            }
        }
        float[] var54 = this.field6606;
        this.field6606 = field6600;
        field6600 = var54;
        this.field6588 = var4;
        this.field6609 = var12 - (var4 >> 1);
        this.field6586 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvo;)Z", line = 594)
    private static final boolean method2669(class345 arg0) {
        if (!field6592) {
            byte[] var1 = arg0.method2081(-5, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2670(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B)V", line = 615)
    private static final void method2670(byte[] arg0) {
        method2666(arg0, 0);
        field6613 = 0x1 << method2662(4);
        field6603 = 0x1 << method2662(4);
        field6600 = new float[field6603];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6613 : field6603;
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
            int var25 = class122.method983(var17 - 1, -257);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class520.method3069(var25, 0, var26);
            }
            if (var1 == 0) {
                field6596 = var18;
                field6595 = var20;
                field6587 = var22;
                field6610 = var24;
            } else {
                field6602 = var18;
                field6614 = var20;
                field6598 = var22;
                field6615 = var24;
            }
        }
        int var2 = method2662(8) + 1;
        field6605 = new class85[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6605[var3] = new class85();
        }
        int var4 = method2662(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2662(16);
        }
        int var6 = method2662(6) + 1;
        field6612 = new class604[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6612[var7] = new class604();
        }
        int var8 = method2662(6) + 1;
        field6585 = new class442[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6585[var9] = new class442();
        }
        int var10 = method2662(6) + 1;
        field6593 = new class610[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6593[var11] = new class610();
        }
        int var12 = method2662(6) + 1;
        field6601 = new boolean[var12];
        field6604 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6601[var13] = method2672() != 0;
            method2662(16);
            method2662(16);
            field6604[var13] = method2662(8);
        }
        field6592 = true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvo;II)Lee;", line = 769)
    public static final class459 method2671(class345 arg0, int arg1, int arg2) {
        if (method2669(arg0)) {
            byte[] var3 = arg0.method2081(-123, arg2, arg1);
            return var3 == null ? null : new class459(var3);
        } else {
            arg0.method2089(arg1, -123, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()I", line = 790)
    public static final int method2672() {
        int var0 = field6608[field6591] >> field6590 & 0x1;
        field6590++;
        field6591 += field6590 >> 3;
        field6590 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V", line = 798)
    private class459(byte[] arg0) {
        this.method2664(arg0);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V", line = 804)
    public static void method2673() {
        field6608 = null;
        field6605 = null;
        field6612 = null;
        field6585 = null;
        field6593 = null;
        field6601 = null;
        field6604 = null;
        field6600 = null;
        field6596 = null;
        field6595 = null;
        field6587 = null;
        field6602 = null;
        field6614 = null;
        field6598 = null;
        field6610 = null;
        field6615 = null;
    }
}
