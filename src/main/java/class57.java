import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class57 extends class55 {

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "Z")
    private static boolean field602 = false;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
    private static int field586;

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
    private static int field590;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
    private static int field592;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    private static int field601;

    @OriginalMember(owner = "client!fw", name = "P", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!fw", name = "Q", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!fw", name = "S", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!fw", name = "T", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "Z")
    private boolean field587;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "Z")
    private boolean field589;

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "[B")
    private static byte[] field605;

    @OriginalMember(owner = "client!fw", name = "R", descriptor = "[B")
    private byte[] field608;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "[F")
    private float[] field578;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "[F")
    private static float[] field579;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "[F")
    private static float[] field580;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "[F")
    private static float[] field583;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "[F")
    private static float[] field584;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "[F")
    private static float[] field585;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "[F")
    private static float[] field596;

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "[F")
    private static float[] field604;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "[I")
    private static int[] field588;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "[I")
    private static int[] field594;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "[I")
    private static int[] field603;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "[Ltca;")
    private static class174[] field591;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "[Lek;")
    public static class508[] field582;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "[Ldr;")
    private static class720[] field598;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "[Lwga;")
    private static class748[] field599;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "[Z")
    private static boolean[] field600;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "[[B")
    private byte[][] field595;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([I)Lib;", line = 3)
    public final class155 method321(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field608 == null) {
            this.field581 = 0;
            this.field578 = new float[field601];
            this.field608 = new byte[this.field607];
            this.field610 = 0;
            this.field609 = 0;
        }
        while (this.field609 < this.field595.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method324(this.field609);
            if (var3 != null) {
                int var4 = this.field610;
                int var5 = var3.length;
                if (var5 > this.field607 - var4) {
                    var5 = this.field607 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field608[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field610;
                }
                this.field610 = var4;
            }
            this.field609++;
        }
        this.field578 = null;
        byte[] var2 = this.field608;
        this.field608 = null;
        return new class155(this.field577, var2, this.field593, this.field597, this.field587);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lni;)Z", line = 62)
    private static final boolean method322(class522 arg0) {
        if (!field602) {
            byte[] var1 = arg0.method2885(0, 0, false);
            if (var1 == null) {
                return false;
            }
            method332(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "()I", line = 81)
    public static final int method323() {
        int var0 = field605[field590] >> field592 & 0x1;
        field592++;
        field590 += field592 >> 3;
        field592 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)[F", line = 92)
    private final float[] method324(int arg0) {
        method330(this.field595[arg0], 0);
        method323();
        int var2 = method327(class185.method1043(field603.length - 1, (byte) 31));
        boolean var3 = field600[var2];
        int var4 = var3 ? field601 : field586;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method323() != 0;
            var6 = method323() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field586 >> 2);
            var9 = (field586 >> 2) + (var4 >> 2);
            var10 = field586 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field586 >> 2);
            var12 = (field586 >> 2) + (var4 - (var4 >> 2));
            var13 = field586 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class748 var14 = field599[field603[var2]];
        int var15 = var14.field10392;
        int var16 = var14.field10390[var15];
        boolean var17 = !field598[var16].method4046();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field10389; var19++) {
            class174 var95 = field591[var14.field10391[var19]];
            float[] var96 = field579;
            var95.method1000(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field10392;
            int var21 = var14.field10390[var20];
            field598[var21].method4049(field579, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field579[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field579;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field580 : field583;
            float[] var30 = var3 ? field585 : field596;
            float[] var31 = var3 ? field584 : field604;
            int[] var32 = var3 ? field588 : field594;
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
            int var35 = class185.method1043(var4 - 1, (byte) 31);
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
                field579[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field579[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field581 > 0) {
            int var49 = this.field581 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field589) {
                for (int var50 = 0; var50 < this.field606; var50++) {
                    int var51 = (this.field581 >> 1) + var50;
                    var48[var50] += this.field578[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field579[var52];
                }
            }
        }
        float[] var54 = this.field578;
        this.field578 = field579;
        field579 = var54;
        this.field581 = var4;
        this.field606 = var12 - (var4 >> 1);
        this.field589 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "()V", line = 506)
    public static void method325() {
        field605 = null;
        field582 = null;
        field598 = null;
        field591 = null;
        field599 = null;
        field600 = null;
        field603 = null;
        field579 = null;
        field583 = null;
        field596 = null;
        field604 = null;
        field580 = null;
        field585 = null;
        field584 = null;
        field594 = null;
        field588 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lni;I)Lfw;", line = 528)
    public static final class57 method326(class522 arg0, int arg1) {
        if (method322(arg0)) {
            byte[] var2 = arg0.method2873(arg1, 55);
            return var2 == null ? null : new class57(var2);
        } else {
            arg0.method2882(-88, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I", line = 545)
    public static final int method327(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field592) {
            int var4 = 8 - field592;
            int var5 = (0x1 << var4) - 1;
            var1 += (field605[field590] >> field592 & var5) << var2;
            field592 = 0;
            field590++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field605[field590] >> field592 & var3) << var2;
            field592 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)F", line = 577)
    public static final float method328(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lni;II)Lfw;", line = 593)
    public static final class57 method329(class522 arg0, int arg1, int arg2) {
        if (method322(arg0)) {
            byte[] var3 = arg0.method2885(arg2, arg1, false);
            return var3 == null ? null : new class57(var3);
        } else {
            arg0.method2891(arg2, arg1, -6329);
            return null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([BI)V", line = 607)
    private static final void method330(byte[] arg0, int arg1) {
        field605 = arg0;
        field590 = arg1;
        field592 = 0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([B)V", line = 617)
    private final void method331(byte[] arg0) {
        class611 var2 = new class611(arg0);
        this.field577 = var2.method3418(-2);
        this.field607 = var2.method3418(-2);
        this.field593 = var2.method3418(-2);
        this.field597 = var2.method3418(-2);
        if (this.field597 < 0) {
            this.field597 = ~this.field597;
            this.field587 = true;
        }
        int var3 = var2.method3418(-2);
        this.field595 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3428((byte) -101);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3389(var7, true, var5, 0);
            this.field595[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "([B)V", line = 660)
    private static final void method332(byte[] arg0) {
        method330(arg0, 0);
        field586 = 0x1 << method327(4);
        field601 = 0x1 << method327(4);
        field579 = new float[field601];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field586 : field601;
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
            int var25 = class185.method1043(var17 - 1, (byte) 31);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class234.method1396(var25, (byte) -9, var26);
            }
            if (var1 == 0) {
                field583 = var18;
                field596 = var20;
                field604 = var22;
                field594 = var24;
            } else {
                field580 = var18;
                field585 = var20;
                field584 = var22;
                field588 = var24;
            }
        }
        int var2 = method327(8) + 1;
        field582 = new class508[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field582[var3] = new class508();
        }
        int var4 = method327(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method327(16);
        }
        int var6 = method327(6) + 1;
        field598 = new class720[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field598[var7] = new class720();
        }
        int var8 = method327(6) + 1;
        field591 = new class174[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field591[var9] = new class174();
        }
        int var10 = method327(6) + 1;
        field599 = new class748[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field599[var11] = new class748();
        }
        int var12 = method327(6) + 1;
        field600 = new boolean[var12];
        field603 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field600[var13] = method323() != 0;
            method327(16);
            method327(16);
            field603[var13] = method327(8);
        }
        field602 = true;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "([B)V", line = 816)
    private class57(byte[] arg0) {
        this.method331(arg0);
    }
}
