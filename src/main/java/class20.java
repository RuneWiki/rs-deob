import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class20 extends class89 {

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Z")
    private static boolean field507 = false;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    private static int field504;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    private static int field517;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    private static int field528;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    private static int field530;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Z")
    private boolean field505;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Z")
    private boolean field513;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[B")
    private static byte[] field502;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "[B")
    private byte[] field534;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[F")
    private static float[] field508;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "[F")
    private static float[] field510;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "[F")
    private static float[] field512;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[F")
    private static float[] field518;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "[F")
    private float[] field523;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "[F")
    private static float[] field527;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "[F")
    private static float[] field529;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[F")
    private static float[] field532;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
    private static int[] field509;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
    private static int[] field516;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "[I")
    private static int[] field525;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "[Lna;")
    private static class142[] field522;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "[Lof;")
    private static class158[] field521;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "[Lt;")
    private static class204[] field526;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[Ldb;")
    public static class35[] field519;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "[Z")
    private static boolean[] field520;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "[[B")
    private byte[][] field524;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Leh;)Z")
    private static final boolean method137(class52 arg0) {
        if (!field507) {
            byte[] var1 = arg0.method342(0, 0, (byte) -40);
            if (var1 == null) {
                return false;
            }
            method138(var1);
            field507 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([B)V")
    private static final void method138(byte[] arg0) {
        method139(arg0, 0);
        field517 = 0x1 << method142(4);
        field528 = 0x1 << method142(4);
        field527 = new float[field528];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field517 : field528;
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
            int var25 = class30.method198((byte) -126, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class130.method830(var25, (byte) -74, var26);
            }
            if (var1 == 0) {
                field518 = var18;
                field532 = var20;
                field510 = var22;
                field525 = var24;
            } else {
                field508 = var18;
                field512 = var20;
                field529 = var22;
                field516 = var24;
            }
        }
        int var2 = method142(8) + 1;
        field519 = new class35[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field519[var3] = new class35();
        }
        int var4 = method142(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method142(16);
        }
        int var6 = method142(6) + 1;
        field526 = new class204[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field526[var7] = new class204();
        }
        int var8 = method142(6) + 1;
        field521 = new class158[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field521[var9] = new class158();
        }
        int var10 = method142(6) + 1;
        field522 = new class142[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field522[var11] = new class142();
        }
        int var12 = method142(6) + 1;
        field520 = new boolean[var12];
        field509 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field520[var13] = method144() != 0;
            method142(16);
            method142(16);
            field509[var13] = method142(8);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI)V")
    private static final void method139(byte[] arg0, int arg1) {
        field502 = arg0;
        field504 = arg1;
        field530 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Leh;II)Lbi;")
    public static final class20 method140(class52 arg0, int arg1, int arg2) {
        if (method137(arg0)) {
            byte[] var3 = arg0.method342(arg2, arg1, (byte) -83);
            return var3 == null ? null : new class20(var3);
        } else {
            arg0.method360(arg1, (byte) -42, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "([B)V")
    private final void method141(byte[] arg0) {
        class185 var2 = new class185(arg0);
        this.field515 = var2.method1231(-4898);
        this.field531 = var2.method1231(-4898);
        this.field511 = var2.method1231(-4898);
        this.field506 = var2.method1231(-4898);
        if (this.field506 < 0) {
            this.field506 = ~this.field506;
            this.field505 = true;
        }
        int var3 = var2.method1231(-4898);
        this.field524 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1243(3);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1254(0, var5, (byte) 120, var7);
            this.field524[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
    public static final int method142(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field530) {
            int var4 = 8 - field530;
            int var5 = (0x1 << var4) - 1;
            var1 += (field502[field504] >> field530 & var5) << var2;
            field530 = 0;
            field504++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field502[field504] >> field530 & var3) << var2;
            field530 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    public static void method143() {
        field502 = null;
        field519 = null;
        field526 = null;
        field521 = null;
        field522 = null;
        field520 = null;
        field509 = null;
        field527 = null;
        field518 = null;
        field532 = null;
        field510 = null;
        field508 = null;
        field512 = null;
        field529 = null;
        field525 = null;
        field516 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
    public static final int method144() {
        int var0 = field502[field504] >> field530 & 0x1;
        field530++;
        field504 += field530 >> 3;
        field530 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[F")
    private final float[] method145(int arg0) {
        method139(this.field524[arg0], 0);
        method144();
        int var2 = method142(class30.method198((byte) -105, field509.length - 1));
        boolean var3 = field520[var2];
        int var4 = var3 ? field528 : field517;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method144() != 0;
            var6 = method144() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field517 >> 2);
            var9 = (field517 >> 2) + (var4 >> 2);
            var10 = field517 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field517 >> 2);
            var12 = (field517 >> 2) + (var4 - (var4 >> 2));
            var13 = field517 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class142 var14 = field522[field509[var2]];
        int var15 = var14.field2589;
        int var16 = var14.field2588[var15];
        boolean var17 = !field526[var16].method1367();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2587; var19++) {
            class158 var95 = field521[var14.field2586[var19]];
            float[] var96 = field527;
            var95.method1025(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2589;
            int var21 = var14.field2588[var20];
            field526[var21].method1360(field527, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field527[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field527;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field508 : field518;
            float[] var30 = var3 ? field512 : field532;
            float[] var31 = var3 ? field529 : field510;
            int[] var32 = var3 ? field516 : field525;
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
            int var35 = class30.method198((byte) -126, var4 - 1);
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
                field527[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field527[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field514 > 0) {
            int var49 = this.field514 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field513) {
                for (int var50 = 0; var50 < this.field503; var50++) {
                    int var51 = (this.field514 >> 1) + var50;
                    var48[var50] += this.field523[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field527[var52];
                }
            }
        }
        float[] var54 = this.field523;
        this.field523 = field527;
        field527 = var54;
        this.field514 = var4;
        this.field503 = var12 - (var4 >> 1);
        this.field513 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)F")
    public static final float method146(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([I)Lcb;")
    public final class24 method147(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field534 == null) {
            this.field514 = 0;
            this.field523 = new float[field528];
            this.field534 = new byte[this.field531];
            this.field535 = 0;
            this.field533 = 0;
        }
        while (this.field533 < this.field524.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method145(this.field533);
            if (var3 != null) {
                int var4 = this.field535;
                int var5 = var3.length;
                if (var5 > this.field531 - var4) {
                    var5 = this.field531 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field534[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field535;
                }
                this.field535 = var4;
            }
            this.field533++;
        }
        this.field523 = null;
        byte[] var2 = this.field534;
        this.field534 = null;
        return new class24(this.field515, var2, this.field511, this.field506, this.field505);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
    private class20(byte[] arg0) {
        this.method141(arg0);
    }
}
