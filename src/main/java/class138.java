import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class138 extends class119 {

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Z")
    private static boolean field2605 = false;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    private static int field2582;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    private int field2583;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    private static int field2585;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    private static int field2596;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    private static int field2607;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Z")
    private boolean field2595;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Z")
    private boolean field2611;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[B")
    private static byte[] field2594;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "[B")
    private byte[] field2615;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[F")
    private static float[] field2589;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[F")
    private static float[] field2590;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "[F")
    private static float[] field2593;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[F")
    private static float[] field2598;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[F")
    private static float[] field2600;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "[F")
    private static float[] field2608;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "[F")
    private static float[] field2609;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "[F")
    private float[] field2610;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "[I")
    private static int[] field2584;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[I")
    private static int[] field2588;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "[I")
    private static int[] field2613;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[Lrb;")
    private static class156[] field2606;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[Lcb;")
    private static class23[] field2591;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[Lfd;")
    private static class52[] field2587;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "[Ljd;")
    public static class86[] field2586;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[Z")
    private static boolean[] field2592;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[[B")
    private byte[][] field2601;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([B)V")
    private static final void method935(byte[] arg0) {
        method941(arg0, 0);
        field2585 = 0x1 << method944(4);
        field2582 = 0x1 << method944(4);
        field2593 = new float[field2582];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2585 : field2582;
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
            int var25 = class53.method373(30, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class157.method1057((byte) 48, var26, var25);
            }
            if (var1 == 0) {
                field2600 = var18;
                field2590 = var20;
                field2598 = var22;
                field2613 = var24;
            } else {
                field2609 = var18;
                field2608 = var20;
                field2589 = var22;
                field2588 = var24;
            }
        }
        int var2 = method944(8) + 1;
        field2586 = new class86[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2586[var3] = new class86();
        }
        int var4 = method944(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method944(16);
        }
        int var6 = method944(6) + 1;
        field2587 = new class52[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2587[var7] = new class52();
        }
        int var8 = method944(6) + 1;
        field2606 = new class156[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2606[var9] = new class156();
        }
        int var10 = method944(6) + 1;
        field2591 = new class23[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2591[var11] = new class23();
        }
        int var12 = method944(6) + 1;
        field2592 = new boolean[var12];
        field2584 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2592[var13] = method938() != 0;
            method944(16);
            method944(16);
            field2584[var13] = method944(8);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)[F")
    private final float[] method936(int arg0) {
        method941(this.field2601[arg0], 0);
        method938();
        int var2 = method944(class53.method373(24, field2584.length - 1));
        boolean var3 = field2592[var2];
        int var4 = var3 ? field2582 : field2585;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method938() != 0;
            var6 = method938() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2585 >> 2);
            var9 = (field2585 >> 2) + (var4 >> 2);
            var10 = field2585 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2585 >> 2);
            var12 = (field2585 >> 2) + (var4 - (var4 >> 2));
            var13 = field2585 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class23 var14 = field2591[field2584[var2]];
        int var15 = var14.field357;
        int var16 = var14.field358[var15];
        boolean var17 = !field2587[var16].method367();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field356; var19++) {
            class156 var95 = field2606[var14.field355[var19]];
            float[] var96 = field2593;
            var95.method1054(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field357;
            int var21 = var14.field358[var20];
            field2587[var21].method364(field2593, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2593[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2593;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2609 : field2600;
            float[] var30 = var3 ? field2608 : field2590;
            float[] var31 = var3 ? field2589 : field2598;
            int[] var32 = var3 ? field2588 : field2613;
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
            int var35 = class53.method373(-77, var4 - 1);
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
                field2593[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2593[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2583 > 0) {
            int var49 = this.field2583 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2611) {
                for (int var50 = 0; var50 < this.field2597; var50++) {
                    int var51 = (this.field2583 >> 1) + var50;
                    var48[var50] += this.field2610[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2593[var52];
                }
            }
        }
        float[] var54 = this.field2610;
        this.field2610 = field2593;
        field2593 = var54;
        this.field2583 = var4;
        this.field2597 = var12 - (var4 >> 1);
        this.field2611 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lc;II)Lpb;")
    public static final class138 method937(class21 arg0, int arg1, int arg2) {
        if (method940(arg0)) {
            byte[] var3 = arg0.method159((byte) -37, arg2, arg1);
            return var3 == null ? null : new class138(var3);
        } else {
            arg0.method150(arg2, arg1, -79);
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
    public static final int method938() {
        int var0 = field2594[field2596] >> field2607 & 0x1;
        field2607++;
        field2596 += field2607 >> 3;
        field2607 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "([B)V")
    private final void method939(byte[] arg0) {
        class114 var2 = new class114(arg0);
        this.field2603 = var2.method761(255);
        this.field2604 = var2.method761(255);
        this.field2599 = var2.method761(255);
        this.field2602 = var2.method761(255);
        if (this.field2602 < 0) {
            this.field2602 = ~this.field2602;
            this.field2595 = true;
        }
        int var3 = var2.method761(255);
        this.field2601 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method767(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method776(var5, var7, 0, (byte) -48);
            this.field2601[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lc;)Z")
    private static final boolean method940(class21 arg0) {
        if (!field2605) {
            byte[] var1 = arg0.method159((byte) -17, 0, 0);
            if (var1 == null) {
                return false;
            }
            method935(var1);
            field2605 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
    private static final void method941(byte[] arg0, int arg1) {
        field2594 = arg0;
        field2596 = arg1;
        field2607 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([I)Lqe;")
    public final class150 method942(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2615 == null) {
            this.field2583 = 0;
            this.field2610 = new float[field2582];
            this.field2615 = new byte[this.field2604];
            this.field2614 = 0;
            this.field2612 = 0;
        }
        while (this.field2612 < this.field2601.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method936(this.field2612);
            if (var3 != null) {
                int var4 = this.field2614;
                int var5 = var3.length;
                if (var5 > this.field2604 - var4) {
                    var5 = this.field2604 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2615[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2614;
                }
                this.field2614 = var4;
            }
            this.field2612++;
        }
        this.field2610 = null;
        byte[] var2 = this.field2615;
        this.field2615 = null;
        return new class150(this.field2603, var2, this.field2599, this.field2602, this.field2595);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
    public static void method943() {
        field2594 = null;
        field2586 = null;
        field2587 = null;
        field2606 = null;
        field2591 = null;
        field2592 = null;
        field2584 = null;
        field2593 = null;
        field2600 = null;
        field2590 = null;
        field2598 = null;
        field2609 = null;
        field2608 = null;
        field2589 = null;
        field2613 = null;
        field2588 = null;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)I")
    public static final int method944(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2607) {
            int var4 = 8 - field2607;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2594[field2596] >> field2607 & var5) << var2;
            field2607 = 0;
            field2596++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2594[field2596] >> field2607 & var3) << var2;
            field2607 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)F")
    public static final float method945(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "([B)V")
    private class138(byte[] arg0) {
        this.method939(arg0);
    }
}
