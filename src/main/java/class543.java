import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class543 extends class766 {

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "Z")
    private static boolean field7524 = false;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    private int field7506;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    private int field7517;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    private static int field7518;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    private int field7525;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "I")
    private static int field7529;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
    private static int field7530;

    @OriginalMember(owner = "client!rw", name = "N", descriptor = "I")
    private static int field7532;

    @OriginalMember(owner = "client!rw", name = "O", descriptor = "I")
    private int field7533;

    @OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!rw", name = "S", descriptor = "I")
    private int field7536;

    @OriginalMember(owner = "client!rw", name = "U", descriptor = "I")
    private int field7538;

    @OriginalMember(owner = "client!rw", name = "V", descriptor = "I")
    private int field7539;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "Z")
    private boolean field7512;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "Z")
    private boolean field7519;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "[B")
    private static byte[] field7527;

    @OriginalMember(owner = "client!rw", name = "T", descriptor = "[B")
    private byte[] field7537;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "[F")
    private static float[] field7508;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "[F")
    private static float[] field7511;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[F")
    private static float[] field7516;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "[F")
    private static float[] field7520;

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "[F")
    private static float[] field7521;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "[F")
    private static float[] field7522;

    @OriginalMember(owner = "client!rw", name = "M", descriptor = "[F")
    private static float[] field7531;

    @OriginalMember(owner = "client!rw", name = "P", descriptor = "[F")
    private float[] field7534;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "[I")
    private static int[] field7509;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "[I")
    private static int[] field7510;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
    private static int[] field7528;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "[Lgba;")
    private static class525[] field7507;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "[Lvs;")
    public static class534[] field7523;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "[Lvia;")
    private static class625[] field7513;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "[Lgea;")
    private static class66[] field7526;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[Z")
    private static boolean[] field7515;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "[[B")
    private byte[][] field7514;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "()I", line = 4)
    public static final int method3134() {
        int var0 = field7527[field7532] >> field7530 & 0x1;
        field7530++;
        field7532 += field7530 >> 3;
        field7530 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F", line = 15)
    public static final float method3135(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)[F", line = 27)
    private final float[] method3136(int arg0) {
        method3143(this.field7514[arg0], 0);
        method3134();
        int var2 = method3142(class269.method1718(field7510.length - 1, 0));
        boolean var3 = field7515[var2];
        int var4 = var3 ? field7529 : field7518;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3134() != 0;
            var6 = method3134() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7518 >> 2);
            var9 = (field7518 >> 2) + (var4 >> 2);
            var10 = field7518 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7518 >> 2);
            var12 = (field7518 >> 2) + (var4 - (var4 >> 2));
            var13 = field7518 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class525 var14 = field7507[field7510[var2]];
        int var15 = var14.field7334;
        int var16 = var14.field7333[var15];
        boolean var17 = !field7513[var16].method3575();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7336; var19++) {
            class66 var95 = field7526[var14.field7335[var19]];
            float[] var96 = field7522;
            var95.method656(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7334;
            int var21 = var14.field7333[var20];
            field7513[var21].method3577(field7522, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7522[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7522;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7520 : field7508;
            float[] var30 = var3 ? field7521 : field7516;
            float[] var31 = var3 ? field7531 : field7511;
            int[] var32 = var3 ? field7509 : field7528;
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
            int var35 = class269.method1718(var4 - 1, 0);
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
                field7522[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7522[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7536 > 0) {
            int var49 = this.field7536 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7512) {
                for (int var50 = 0; var50 < this.field7525; var50++) {
                    int var51 = (this.field7536 >> 1) + var50;
                    var48[var50] += this.field7534[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7522[var52];
                }
            }
        }
        float[] var54 = this.field7534;
        this.field7534 = field7522;
        field7522 = var54;
        this.field7536 = var4;
        this.field7525 = var12 - (var4 >> 1);
        this.field7512 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([B)V", line = 440)
    private final void method3137(byte[] arg0) {
        class431 var2 = new class431(arg0);
        this.field7506 = var2.method2526(17);
        this.field7535 = var2.method2526(17);
        this.field7517 = var2.method2526(17);
        this.field7533 = var2.method2526(17);
        if (this.field7533 < 0) {
            this.field7533 = ~this.field7533;
            this.field7519 = true;
        }
        int var3 = var2.method2526(17);
        this.field7514 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2557(14929);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2530(-29, var7, 0, var5);
            this.field7514[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lgga;)Z", line = 489)
    private static final boolean method3138(class513 arg0) {
        if (!field7524) {
            byte[] var1 = arg0.method3019(0, 0, 105);
            if (var1 == null) {
                return false;
            }
            method3144(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lgga;II)Lrw;", line = 503)
    public static final class543 method3139(class513 arg0, int arg1, int arg2) {
        if (method3138(arg0)) {
            byte[] var3 = arg0.method3019(arg1, arg2, 127);
            return var3 == null ? null : new class543(var3);
        } else {
            arg0.method2987(arg1, 0, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lgga;I)Lrw;", line = 520)
    public static final class543 method3140(class513 arg0, int arg1) {
        if (method3138(arg0)) {
            byte[] var2 = arg0.method2988(arg1, 0);
            return var2 == null ? null : new class543(var2);
        } else {
            arg0.method3005(arg1, (byte) -69);
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([I)Lud;", line = 537)
    public final class101 method3141(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7537 == null) {
            this.field7536 = 0;
            this.field7534 = new float[field7529];
            this.field7537 = new byte[this.field7535];
            this.field7539 = 0;
            this.field7538 = 0;
        }
        while (this.field7538 < this.field7514.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3136(this.field7538);
            if (var3 != null) {
                int var4 = this.field7539;
                int var5 = var3.length;
                if (var5 > this.field7535 - var4) {
                    var5 = this.field7535 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7537[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7539;
                }
                this.field7539 = var4;
            }
            this.field7538++;
        }
        this.field7534 = null;
        byte[] var2 = this.field7537;
        this.field7537 = null;
        return new class101(this.field7506, var2, this.field7517, this.field7533, this.field7519);
    }

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)I", line = 601)
    public static final int method3142(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7530) {
            int var4 = 8 - field7530;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7527[field7532] >> field7530 & var5) << var2;
            field7530 = 0;
            field7532++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7527[field7532] >> field7530 & var3) << var2;
            field7530 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V", line = 637)
    private static final void method3143(byte[] arg0, int arg1) {
        field7527 = arg0;
        field7532 = arg1;
        field7530 = 0;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "([B)V", line = 646)
    private static final void method3144(byte[] arg0) {
        method3143(arg0, 0);
        field7518 = 0x1 << method3142(4);
        field7529 = 0x1 << method3142(4);
        field7522 = new float[field7529];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7518 : field7529;
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
            int var25 = class269.method1718(var17 - 1, 0);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class125.method1081(var25, var26, 0);
            }
            if (var1 == 0) {
                field7508 = var18;
                field7516 = var20;
                field7511 = var22;
                field7528 = var24;
            } else {
                field7520 = var18;
                field7521 = var20;
                field7531 = var22;
                field7509 = var24;
            }
        }
        int var2 = method3142(8) + 1;
        field7523 = new class534[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7523[var3] = new class534();
        }
        int var4 = method3142(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3142(16);
        }
        int var6 = method3142(6) + 1;
        field7513 = new class625[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7513[var7] = new class625();
        }
        int var8 = method3142(6) + 1;
        field7526 = new class66[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7526[var9] = new class66();
        }
        int var10 = method3142(6) + 1;
        field7507 = new class525[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7507[var11] = new class525();
        }
        int var12 = method3142(6) + 1;
        field7515 = new boolean[var12];
        field7510 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7515[var13] = method3134() != 0;
            method3142(16);
            method3142(16);
            field7510[var13] = method3142(8);
        }
        field7524 = true;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "()V", line = 798)
    public static void method3145() {
        field7527 = null;
        field7523 = null;
        field7513 = null;
        field7526 = null;
        field7507 = null;
        field7515 = null;
        field7510 = null;
        field7522 = null;
        field7508 = null;
        field7516 = null;
        field7511 = null;
        field7520 = null;
        field7521 = null;
        field7531 = null;
        field7528 = null;
        field7509 = null;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "([B)V", line = 817)
    private class543(byte[] arg0) {
        this.method3137(arg0);
    }
}
