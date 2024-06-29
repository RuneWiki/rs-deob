import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class194 {

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Z")
    private static boolean field591 = false;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    private static int field580;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    private static int field598;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    private static int field604;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private static int field607;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
    private boolean field585;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Z")
    private boolean field592;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "[B")
    private static byte[] field587;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "[B")
    private byte[] field612;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[F")
    private static float[] field579;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[F")
    private static float[] field582;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[F")
    private float[] field583;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[F")
    private static float[] field586;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[F")
    private static float[] field597;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[F")
    private static float[] field600;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "[F")
    private static float[] field602;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "[F")
    private static float[] field610;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    private static int[] field584;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
    private static int[] field589;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "[I")
    private static int[] field608;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "[Lqg;")
    public static class103[] field603;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "[Lab;")
    private static class145[] field593;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "[Laa;")
    private static class168[] field596;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "[Lfe;")
    private static class253[] field599;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "[Z")
    private static boolean[] field601;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "[[B")
    private byte[][] field606;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpk;II)Lfb;")
    public static final class29 method224(class99 arg0, int arg1, int arg2) {
        if (method227(arg0)) {
            byte[] var3 = arg0.method705(arg1, arg2, -1);
            return var3 == null ? null : new class29(var3);
        } else {
            arg0.method732(arg2, arg1, -9523);
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public static void method225() {
        field587 = null;
        field603 = null;
        field593 = null;
        field596 = null;
        field599 = null;
        field601 = null;
        field589 = null;
        field582 = null;
        field602 = null;
        field600 = null;
        field586 = null;
        field579 = null;
        field610 = null;
        field597 = null;
        field584 = null;
        field608 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([B)V")
    private static final void method226(byte[] arg0) {
        method230(arg0, 0);
        field598 = 0x1 << method234(4);
        field607 = 0x1 << method234(4);
        field582 = new float[field607];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field598 : field607;
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
            int var25 = class161.method1173(13691, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class227.method1623(115, var25, var26);
            }
            if (var1 == 0) {
                field602 = var18;
                field600 = var20;
                field586 = var22;
                field584 = var24;
            } else {
                field579 = var18;
                field610 = var20;
                field597 = var22;
                field608 = var24;
            }
        }
        int var2 = method234(8) + 1;
        field603 = new class103[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field603[var3] = new class103();
        }
        int var4 = method234(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method234(16);
        }
        int var6 = method234(6) + 1;
        field593 = new class145[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field593[var7] = new class145();
        }
        int var8 = method234(6) + 1;
        field596 = new class168[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field596[var9] = new class168();
        }
        int var10 = method234(6) + 1;
        field599 = new class253[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field599[var11] = new class253();
        }
        int var12 = method234(6) + 1;
        field601 = new boolean[var12];
        field589 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field601[var13] = method229() != 0;
            method234(16);
            method234(16);
            field589[var13] = method234(8);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpk;)Z")
    private static final boolean method227(class99 arg0) {
        if (!field591) {
            byte[] var1 = arg0.method705(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method226(var1);
            field591 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)[F")
    private final float[] method228(int arg0) {
        method230(this.field606[arg0], 0);
        method229();
        int var2 = method234(class161.method1173(13691, field589.length - 1));
        boolean var3 = field601[var2];
        int var4 = var3 ? field607 : field598;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method229() != 0;
            var6 = method229() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field598 >> 2);
            var9 = (field598 >> 2) + (var4 >> 2);
            var10 = field598 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field598 >> 2);
            var12 = (field598 >> 2) + (var4 - (var4 >> 2));
            var13 = field598 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class253 var14 = field599[field589[var2]];
        int var15 = var14.field4540;
        int var16 = var14.field4541[var15];
        boolean var17 = !field593[var16].method993();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4542; var19++) {
            class168 var95 = field596[var14.field4539[var19]];
            float[] var96 = field582;
            var95.method1208(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4540;
            int var21 = var14.field4541[var20];
            field593[var21].method991(field582, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field582[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field582;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field579 : field602;
            float[] var30 = var3 ? field610 : field600;
            float[] var31 = var3 ? field597 : field586;
            int[] var32 = var3 ? field608 : field584;
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
            int var35 = class161.method1173(13691, var4 - 1);
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
                field582[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field582[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field594 > 0) {
            int var49 = this.field594 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field592) {
                for (int var50 = 0; var50 < this.field590; var50++) {
                    int var51 = (this.field594 >> 1) + var50;
                    var48[var50] += this.field583[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field582[var52];
                }
            }
        }
        float[] var54 = this.field583;
        this.field583 = field582;
        field582 = var54;
        this.field594 = var4;
        this.field590 = var12 - (var4 >> 1);
        this.field592 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()I")
    public static final int method229() {
        int var0 = field587[field580] >> field604 & 0x1;
        field604++;
        field580 += field604 >> 3;
        field604 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([BI)V")
    private static final void method230(byte[] arg0, int arg1) {
        field587 = arg0;
        field580 = arg1;
        field604 = 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([I)Lme;")
    public final class222 method231(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field612 == null) {
            this.field594 = 0;
            this.field583 = new float[field607];
            this.field612 = new byte[this.field581];
            this.field609 = 0;
            this.field611 = 0;
        }
        while (this.field611 < this.field606.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method228(this.field611);
            if (var3 != null) {
                int var4 = this.field609;
                int var5 = var3.length;
                if (var5 > this.field581 - var4) {
                    var5 = this.field581 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field612[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field609;
                }
                this.field609 = var4;
            }
            this.field611++;
        }
        this.field583 = null;
        byte[] var2 = this.field612;
        this.field612 = null;
        return new class222(this.field605, var2, this.field595, this.field588, this.field585);
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)F")
    public static final float method232(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "([B)V")
    private final void method233(byte[] arg0) {
        class149 var2 = new class149(arg0);
        this.field605 = var2.method1076(65280);
        this.field581 = var2.method1076(65280);
        this.field595 = var2.method1076(65280);
        this.field588 = var2.method1076(65280);
        if (this.field588 < 0) {
            this.field588 = ~this.field588;
            this.field585 = true;
        }
        int var3 = var2.method1076(65280);
        this.field606 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1045((byte) 112);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1053((byte) 33, 0, var5, var7);
            this.field606[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)I")
    public static final int method234(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field604) {
            int var4 = 8 - field604;
            int var5 = (0x1 << var4) - 1;
            var1 += (field587[field580] >> field604 & var5) << var2;
            field604 = 0;
            field580++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field587[field580] >> field604 & var3) << var2;
            field604 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "([B)V")
    private class29(byte[] arg0) {
        this.method233(arg0);
    }
}
