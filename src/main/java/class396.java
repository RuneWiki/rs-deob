import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class396 extends class383 {

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "Z")
    private static boolean field5675 = false;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    private static int field5648;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    private int field5649;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    private static int field5651;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    private int field5654;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    private static int field5661;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    private int field5662;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    private int field5671;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    private static int field5672;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    private int field5676;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "Z")
    private boolean field5650;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "Z")
    private boolean field5660;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "[B")
    private static byte[] field5659;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "[B")
    private byte[] field5679;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "[F")
    private static float[] field5647;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "[F")
    private static float[] field5653;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "[F")
    private static float[] field5657;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "[F")
    private static float[] field5658;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "[F")
    private static float[] field5663;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "[F")
    private float[] field5668;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "[F")
    private static float[] field5670;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "[F")
    private static float[] field5673;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "[I")
    private static int[] field5655;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "[I")
    private static int[] field5667;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "[I")
    private static int[] field5674;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "[Lg;")
    private static class107[] field5656;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "[Lb;")
    private static class220[] field5666;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "[Lbp;")
    private static class263[] field5669;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "[Lpn;")
    public static class526[] field5665;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "[Z")
    private static boolean[] field5677;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "[[B")
    private byte[][] field5652;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "()V", line = 8)
    public static void method2352() {
        field5659 = null;
        field5665 = null;
        field5656 = null;
        field5669 = null;
        field5666 = null;
        field5677 = null;
        field5674 = null;
        field5647 = null;
        field5653 = null;
        field5663 = null;
        field5670 = null;
        field5673 = null;
        field5657 = null;
        field5658 = null;
        field5655 = null;
        field5667 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lqn;II)Lpu;", line = 31)
    public static final class396 method2353(class47 arg0, int arg1, int arg2) {
        if (method2356(arg0)) {
            byte[] var3 = arg0.method481(arg1, arg2, -114);
            return var3 == null ? null : new class396(var3);
        } else {
            arg0.method471(arg1, (byte) -87, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lqn;I)Lpu;", line = 47)
    public static final class396 method2354(class47 arg0, int arg1) {
        if (method2356(arg0)) {
            byte[] var2 = arg0.method457(arg1, -83);
            return var2 == null ? null : new class396(var2);
        } else {
            arg0.method486(false, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([BI)V", line = 62)
    private static final void method2355(byte[] arg0, int arg1) {
        field5659 = arg0;
        field5648 = arg1;
        field5661 = 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lqn;)Z", line = 68)
    private static final boolean method2356(class47 arg0) {
        if (!field5675) {
            byte[] var1 = arg0.method481(0, 0, -126);
            if (var1 == null) {
                return false;
            }
            method2361(var1);
            field5675 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([I)Ljc;", line = 87)
    public final class305 method2357(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5679 == null) {
            this.field5654 = 0;
            this.field5668 = new float[field5651];
            this.field5679 = new byte[this.field5662];
            this.field5678 = 0;
            this.field5680 = 0;
        }
        while (this.field5680 < this.field5652.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2358(this.field5680);
            if (var3 != null) {
                int var4 = this.field5678;
                int var5 = var3.length;
                if (var5 > this.field5662 - var4) {
                    var5 = this.field5662 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5679[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5678;
                }
                this.field5678 = var4;
            }
            this.field5680++;
        }
        this.field5668 = null;
        byte[] var2 = this.field5679;
        this.field5679 = null;
        return new class305(this.field5676, var2, this.field5664, this.field5671, this.field5650);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)[F", line = 148)
    private final float[] method2358(int arg0) {
        method2355(this.field5652[arg0], 0);
        method2359();
        int var2 = method2363(class135.method933(field5674.length - 1, 13634));
        boolean var3 = field5677[var2];
        int var4 = var3 ? field5651 : field5672;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2359() != 0;
            var6 = method2359() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5672 >> 2);
            var9 = (field5672 >> 2) + (var4 >> 2);
            var10 = field5672 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5672 >> 2);
            var12 = (field5672 >> 2) + (var4 - (var4 >> 2));
            var13 = field5672 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class220 var14 = field5666[field5674[var2]];
        int var15 = var14.field2798;
        int var16 = var14.field2797[var15];
        boolean var17 = !field5656[var16].method790();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2799; var19++) {
            class263 var95 = field5669[var14.field2796[var19]];
            float[] var96 = field5647;
            var95.method1570(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2798;
            int var21 = var14.field2797[var20];
            field5656[var21].method786(field5647, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5647[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5647;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5673 : field5653;
            float[] var30 = var3 ? field5657 : field5663;
            float[] var31 = var3 ? field5658 : field5670;
            int[] var32 = var3 ? field5667 : field5655;
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
            int var35 = class135.method933(var4 - 1, 13634);
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
                field5647[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5647[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5654 > 0) {
            int var49 = this.field5654 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5660) {
                for (int var50 = 0; var50 < this.field5649; var50++) {
                    int var51 = (this.field5654 >> 1) + var50;
                    var48[var50] += this.field5668[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5647[var52];
                }
            }
        }
        float[] var54 = this.field5668;
        this.field5668 = field5647;
        field5647 = var54;
        this.field5654 = var4;
        this.field5649 = var12 - (var4 >> 1);
        this.field5660 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "()I", line = 561)
    public static final int method2359() {
        int var0 = field5659[field5648] >> field5661 & 0x1;
        field5661++;
        field5648 += field5661 >> 3;
        field5661 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)F", line = 569)
    public static final float method2360(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([B)V", line = 582)
    private static final void method2361(byte[] arg0) {
        method2355(arg0, 0);
        field5672 = 0x1 << method2363(4);
        field5651 = 0x1 << method2363(4);
        field5647 = new float[field5651];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5672 : field5651;
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
            int var25 = class135.method933(var17 - 1, 13634);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class293.method1719(var25, (byte) 86, var26);
            }
            if (var1 == 0) {
                field5653 = var18;
                field5663 = var20;
                field5670 = var22;
                field5655 = var24;
            } else {
                field5673 = var18;
                field5657 = var20;
                field5658 = var22;
                field5667 = var24;
            }
        }
        int var2 = method2363(8) + 1;
        field5665 = new class526[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5665[var3] = new class526();
        }
        int var4 = method2363(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2363(16);
        }
        int var6 = method2363(6) + 1;
        field5656 = new class107[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5656[var7] = new class107();
        }
        int var8 = method2363(6) + 1;
        field5669 = new class263[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5669[var9] = new class263();
        }
        int var10 = method2363(6) + 1;
        field5666 = new class220[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5666[var11] = new class220();
        }
        int var12 = method2363(6) + 1;
        field5677 = new boolean[var12];
        field5674 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5677[var13] = method2359() != 0;
            method2363(16);
            method2363(16);
            field5674[var13] = method2363(8);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "([B)V", line = 740)
    private final void method2362(byte[] arg0) {
        class463 var2 = new class463(arg0);
        this.field5676 = var2.method2727(-93);
        this.field5662 = var2.method2727(-90);
        this.field5664 = var2.method2727(-102);
        this.field5671 = var2.method2727(-117);
        if (this.field5671 < 0) {
            this.field5671 = ~this.field5671;
            this.field5650 = true;
        }
        int var3 = var2.method2727(-93);
        this.field5652 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2737(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2735(var7, var5, 0, -447463096);
            this.field5652[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)I", line = 783)
    public static final int method2363(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5661) {
            int var4 = 8 - field5661;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5659[field5648] >> field5661 & var5) << var2;
            field5661 = 0;
            field5648++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5659[field5648] >> field5661 & var3) << var2;
            field5661 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "([B)V", line = 816)
    private class396(byte[] arg0) {
        this.method2362(arg0);
    }
}
