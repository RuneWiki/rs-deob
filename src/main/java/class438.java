import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class438 extends class206 {

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "Z")
    private static boolean field6451 = false;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    private int field6433;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    private int field6434;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    private static int field6437;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    private static int field6441;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    private int field6444;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    private static int field6449;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    private static int field6452;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    private int field6456;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    private int field6458;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
    private int field6460;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "Z")
    private boolean field6432;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "Z")
    private boolean field6457;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "[B")
    private static byte[] field6430;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "[B")
    private byte[] field6459;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "[F")
    private static float[] field6427;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "[F")
    private static float[] field6429;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "[F")
    private static float[] field6431;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "[F")
    private static float[] field6438;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "[F")
    private static float[] field6442;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "[F")
    private static float[] field6443;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "[F")
    private static float[] field6454;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "[F")
    private float[] field6455;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "[I")
    private static int[] field6439;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "[I")
    private static int[] field6445;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "[I")
    private static int[] field6450;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "[Lra;")
    private static class119[] field6428;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "[Lle;")
    private static class323[] field6453;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "[Lou;")
    public static class631[] field6436;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "[Lfm;")
    private static class764[] field6447;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "[Z")
    private static boolean[] field6435;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "[[B")
    private byte[][] field6440;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([B)V", line = 15)
    private final void method3363(byte[] arg0) {
        class163 var2 = new class163(arg0);
        this.field6448 = var2.method1453((byte) 119);
        this.field6433 = var2.method1453((byte) 86);
        this.field6444 = var2.method1453((byte) 80);
        this.field6434 = var2.method1453((byte) 112);
        if (this.field6434 < 0) {
            this.field6434 = ~this.field6434;
            this.field6432 = true;
        }
        int var3 = var2.method1453((byte) 110);
        this.field6440 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1455((byte) 62);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1413(var7, -16385, var5, 0);
            this.field6440[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I", line = 58)
    public static final int method3364(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6452) {
            int var4 = 8 - field6452;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6430[field6441] >> field6452 & var5) << var2;
            field6452 = 0;
            field6441++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6430[field6441] >> field6452 & var3) << var2;
            field6452 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([BI)V", line = 87)
    private static final void method3365(byte[] arg0, int arg1) {
        field6430 = arg0;
        field6441 = arg1;
        field6452 = 0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([I)Lps;", line = 96)
    public final class105 method3366(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6459 == null) {
            this.field6456 = 0;
            this.field6455 = new float[field6449];
            this.field6459 = new byte[this.field6433];
            this.field6458 = 0;
            this.field6460 = 0;
        }
        while (this.field6460 < this.field6440.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3372(this.field6460);
            if (var3 != null) {
                int var4 = this.field6458;
                int var5 = var3.length;
                if (var5 > this.field6433 - var4) {
                    var5 = this.field6433 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6459[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6458;
                }
                this.field6458 = var4;
            }
            this.field6460++;
        }
        this.field6455 = null;
        byte[] var2 = this.field6459;
        this.field6459 = null;
        return new class105(this.field6448, var2, this.field6444, this.field6434, this.field6432);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lla;I)Lnv;", line = 155)
    public static final class438 method3367(class476 arg0, int arg1) {
        if (method3374(arg0)) {
            byte[] var2 = arg0.method3638(-115, arg1);
            return var2 == null ? null : new class438(var2);
        } else {
            arg0.method3618(arg1, 72);
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)F", line = 172)
    public static final float method3368(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "([B)V", line = 186)
    private static final void method3369(byte[] arg0) {
        method3365(arg0, 0);
        field6437 = 0x1 << method3364(4);
        field6449 = 0x1 << method3364(4);
        field6438 = new float[field6449];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6437 : field6449;
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
            int var25 = class54.method410((byte) -114, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class385.method3076(var26, var25, (byte) -58);
            }
            if (var1 == 0) {
                field6429 = var18;
                field6454 = var20;
                field6442 = var22;
                field6445 = var24;
            } else {
                field6427 = var18;
                field6431 = var20;
                field6443 = var22;
                field6439 = var24;
            }
        }
        int var2 = method3364(8) + 1;
        field6436 = new class631[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6436[var3] = new class631();
        }
        int var4 = method3364(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3364(16);
        }
        int var6 = method3364(6) + 1;
        field6447 = new class764[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6447[var7] = new class764();
        }
        int var8 = method3364(6) + 1;
        field6428 = new class119[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6428[var9] = new class119();
        }
        int var10 = method3364(6) + 1;
        field6453 = new class323[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6453[var11] = new class323();
        }
        int var12 = method3364(6) + 1;
        field6435 = new boolean[var12];
        field6450 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6435[var13] = method3373() != 0;
            method3364(16);
            method3364(16);
            field6450[var13] = method3364(8);
        }
        field6451 = true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "()V", line = 342)
    public static void method3370() {
        field6430 = null;
        field6436 = null;
        field6447 = null;
        field6428 = null;
        field6453 = null;
        field6435 = null;
        field6450 = null;
        field6438 = null;
        field6429 = null;
        field6454 = null;
        field6442 = null;
        field6427 = null;
        field6431 = null;
        field6443 = null;
        field6445 = null;
        field6439 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lla;II)Lnv;", line = 369)
    public static final class438 method3371(class476 arg0, int arg1, int arg2) {
        if (method3374(arg0)) {
            byte[] var3 = arg0.method3632(arg1, arg2, -5);
            return var3 == null ? null : new class438(var3);
        } else {
            arg0.method3621(arg2, -125, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)[F", line = 383)
    private final float[] method3372(int arg0) {
        method3365(this.field6440[arg0], 0);
        method3373();
        int var2 = method3364(class54.method410((byte) -101, field6450.length - 1));
        boolean var3 = field6435[var2];
        int var4 = var3 ? field6449 : field6437;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3373() != 0;
            var6 = method3373() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6437 >> 2);
            var9 = (field6437 >> 2) + (var4 >> 2);
            var10 = field6437 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6437 >> 2);
            var12 = (field6437 >> 2) + (var4 - (var4 >> 2));
            var13 = field6437 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class323 var14 = field6453[field6450[var2]];
        int var15 = var14.field5088;
        int var16 = var14.field5091[var15];
        boolean var17 = !field6447[var16].method5525();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5090; var19++) {
            class119 var95 = field6428[var14.field5089[var19]];
            float[] var96 = field6438;
            var95.method1041(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5088;
            int var21 = var14.field5091[var20];
            field6447[var21].method5528(field6438, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6438[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6438;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6427 : field6429;
            float[] var30 = var3 ? field6431 : field6454;
            float[] var31 = var3 ? field6443 : field6442;
            int[] var32 = var3 ? field6439 : field6445;
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
            int var35 = class54.method410((byte) -100, var4 - 1);
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
                field6438[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6438[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6456 > 0) {
            int var49 = this.field6456 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6457) {
                for (int var50 = 0; var50 < this.field6446; var50++) {
                    int var51 = (this.field6456 >> 1) + var50;
                    var48[var50] += this.field6455[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6438[var52];
                }
            }
        }
        float[] var54 = this.field6455;
        this.field6455 = field6438;
        field6438 = var54;
        this.field6456 = var4;
        this.field6446 = var12 - (var4 >> 1);
        this.field6457 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "()I", line = 796)
    public static final int method3373() {
        int var0 = field6430[field6441] >> field6452 & 0x1;
        field6452++;
        field6441 += field6452 >> 3;
        field6452 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lla;)Z", line = 804)
    private static final boolean method3374(class476 arg0) {
        if (!field6451) {
            byte[] var1 = arg0.method3632(0, 0, -125);
            if (var1 == null) {
                return false;
            }
            method3369(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "([B)V", line = 817)
    private class438(byte[] arg0) {
        this.method3363(arg0);
    }
}
