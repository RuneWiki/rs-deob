import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class162 extends class130 {

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Z")
    private static boolean field2599 = false;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    private static int field2601;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    private static int field2602;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private int field2605;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    private int field2609;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private static int field2614;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    private static int field2615;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    private int field2621;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field2623;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Z")
    private boolean field2597;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
    private boolean field2600;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "[B")
    private static byte[] field2611;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "[B")
    private byte[] field2622;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[F")
    private float[] field2593;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[F")
    private static float[] field2595;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[F")
    private static float[] field2596;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "[F")
    private static float[] field2603;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "[F")
    private static float[] field2604;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "[F")
    private static float[] field2607;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[F")
    private static float[] field2612;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "[F")
    private static float[] field2616;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[I")
    private static int[] field2590;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "[I")
    private static int[] field2591;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "[I")
    private static int[] field2617;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "[Lwe;")
    private static class170[] field2608;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "[Led;")
    public static class248[] field2610;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "[Ldd;")
    private static class2[] field2592;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[Lek;")
    private static class75[] field2598;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "[Z")
    private static boolean[] field2594;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "[[B")
    private byte[][] field2613;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
    public static final int method1013() {
        int var0 = field2611[field2602] >> field2614 & 0x1;
        field2614++;
        field2602 += field2614 >> 3;
        field2614 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)[F")
    private final float[] method1014(int arg0) {
        method1017(this.field2613[arg0], 0);
        method1013();
        int var2 = method1022(class194.method1279(field2617.length - 1, -120));
        boolean var3 = field2594[var2];
        int var4 = var3 ? field2601 : field2615;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1013() != 0;
            var6 = method1013() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2615 >> 2);
            var9 = (field2615 >> 2) + (var4 >> 2);
            var10 = field2615 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2615 >> 2);
            var12 = (field2615 >> 2) + (var4 - (var4 >> 2));
            var13 = field2615 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class2 var14 = field2592[field2617[var2]];
        int var15 = var14.field14;
        int var16 = var14.field15[var15];
        boolean var17 = !field2608[var16].method1110();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field16; var19++) {
            class75 var95 = field2598[var14.field17[var19]];
            float[] var96 = field2616;
            var95.method475(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field14;
            int var21 = var14.field15[var20];
            field2608[var21].method1112(field2616, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2616[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2616;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2612 : field2595;
            float[] var30 = var3 ? field2607 : field2596;
            float[] var31 = var3 ? field2604 : field2603;
            int[] var32 = var3 ? field2590 : field2591;
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
            int var35 = class194.method1279(var4 - 1, -97);
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
                field2616[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2616[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2620 > 0) {
            int var49 = this.field2620 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2597) {
                for (int var50 = 0; var50 < this.field2606; var50++) {
                    int var51 = (this.field2620 >> 1) + var50;
                    var48[var50] += this.field2593[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2616[var52];
                }
            }
        }
        float[] var54 = this.field2593;
        this.field2593 = field2616;
        field2616 = var54;
        this.field2620 = var4;
        this.field2606 = var12 - (var4 >> 1);
        this.field2597 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)F")
    public static final float method1015(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B)V")
    private final void method1016(byte[] arg0) {
        class56 var2 = new class56(arg0);
        this.field2618 = var2.method311(0);
        this.field2619 = var2.method311(0);
        this.field2605 = var2.method311(0);
        this.field2609 = var2.method311(0);
        if (this.field2609 < 0) {
            this.field2609 = ~this.field2609;
            this.field2600 = true;
        }
        int var3 = var2.method311(0);
        this.field2613 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method367(1);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method316(var5, var7, (byte) -110, 0);
            this.field2613[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)V")
    private static final void method1017(byte[] arg0, int arg1) {
        field2611 = arg0;
        field2602 = arg1;
        field2614 = 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbk;)Z")
    private static final boolean method1018(class136 arg0) {
        if (!field2599) {
            byte[] var1 = arg0.method842(0, (byte) -126, 0);
            if (var1 == null) {
                return false;
            }
            method1023(var1);
            field2599 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
    public static void method1019() {
        field2611 = null;
        field2610 = null;
        field2608 = null;
        field2598 = null;
        field2592 = null;
        field2594 = null;
        field2617 = null;
        field2616 = null;
        field2595 = null;
        field2596 = null;
        field2603 = null;
        field2612 = null;
        field2607 = null;
        field2604 = null;
        field2591 = null;
        field2590 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([I)Lfj;")
    public final class89 method1020(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2622 == null) {
            this.field2620 = 0;
            this.field2593 = new float[field2601];
            this.field2622 = new byte[this.field2619];
            this.field2623 = 0;
            this.field2621 = 0;
        }
        while (this.field2621 < this.field2613.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1014(this.field2621);
            if (var3 != null) {
                int var4 = this.field2623;
                int var5 = var3.length;
                if (var5 > this.field2619 - var4) {
                    var5 = this.field2619 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2622[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2623;
                }
                this.field2623 = var4;
            }
            this.field2621++;
        }
        this.field2593 = null;
        byte[] var2 = this.field2622;
        this.field2622 = null;
        return new class89(this.field2618, var2, this.field2605, this.field2609, this.field2600);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbk;II)Lpc;")
    public static final class162 method1021(class136 arg0, int arg1, int arg2) {
        if (method1018(arg0)) {
            byte[] var3 = arg0.method842(arg1, (byte) -102, arg2);
            return var3 == null ? null : new class162(var3);
        } else {
            arg0.method846(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
    public static final int method1022(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2614) {
            int var4 = 8 - field2614;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2611[field2602] >> field2614 & var5) << var2;
            field2614 = 0;
            field2602++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2611[field2602] >> field2614 & var3) << var2;
            field2614 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([B)V")
    private class162(byte[] arg0) {
        this.method1016(arg0);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "([B)V")
    private static final void method1023(byte[] arg0) {
        method1017(arg0, 0);
        field2615 = 0x1 << method1022(4);
        field2601 = 0x1 << method1022(4);
        field2616 = new float[field2601];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2615 : field2601;
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
            int var25 = class194.method1279(var17 - 1, -122);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class87.method548(var26, 1, var25);
            }
            if (var1 == 0) {
                field2595 = var18;
                field2596 = var20;
                field2603 = var22;
                field2591 = var24;
            } else {
                field2612 = var18;
                field2607 = var20;
                field2604 = var22;
                field2590 = var24;
            }
        }
        int var2 = method1022(8) + 1;
        field2610 = new class248[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2610[var3] = new class248();
        }
        int var4 = method1022(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1022(16);
        }
        int var6 = method1022(6) + 1;
        field2608 = new class170[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2608[var7] = new class170();
        }
        int var8 = method1022(6) + 1;
        field2598 = new class75[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2598[var9] = new class75();
        }
        int var10 = method1022(6) + 1;
        field2592 = new class2[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2592[var11] = new class2();
        }
        int var12 = method1022(6) + 1;
        field2594 = new boolean[var12];
        field2617 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2594[var13] = method1013() != 0;
            method1022(16);
            method1022(16);
            field2617[var13] = method1022(8);
        }
    }
}
