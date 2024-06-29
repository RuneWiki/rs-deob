import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class354 extends class276 {

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "Z")
    private static boolean field5514 = false;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    private int field5508;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    private static int field5510;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    private int field5513;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    private static int field5515;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    private static int field5517;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    private int field5521;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    private static int field5530;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    private int field5531;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    private int field5533;

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "I")
    private int field5538;

    @OriginalMember(owner = "client!bt", name = "T", descriptor = "I")
    private int field5539;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "Z")
    private boolean field5518;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "Z")
    private boolean field5520;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "[B")
    private static byte[] field5528;

    @OriginalMember(owner = "client!bt", name = "U", descriptor = "[B")
    private byte[] field5540;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "[F")
    private static float[] field5507;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "[F")
    private static float[] field5509;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "[F")
    private static float[] field5523;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "[F")
    private static float[] field5524;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "[F")
    private static float[] field5525;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "[F")
    private static float[] field5529;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "[F")
    private static float[] field5534;

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "[F")
    private float[] field5536;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "[I")
    private static int[] field5519;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "[I")
    private static int[] field5522;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "[I")
    private static int[] field5527;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "[Lef;")
    private static class133[] field5537;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "[Leh;")
    private static class152[] field5516;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "[Lmc;")
    private static class245[] field5512;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "[Luu;")
    public static class377[] field5526;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "[Z")
    private static boolean[] field5511;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "[[B")
    private byte[][] field5535;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lqs;)Z")
    private static final boolean method2267(class496 arg0) {
        if (!field5514) {
            byte[] var1 = arg0.method2926(0, -78, 0);
            if (var1 == null) {
                return false;
            }
            method2270(var1);
            field5514 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([B)V")
    private final void method2268(byte[] arg0) {
        class23 var2 = new class23(arg0);
        this.field5513 = var2.method143(-3230);
        this.field5533 = var2.method143(-3230);
        this.field5531 = var2.method143(-3230);
        this.field5532 = var2.method143(-3230);
        if (this.field5532 < 0) {
            this.field5532 = ~this.field5532;
            this.field5520 = true;
        }
        int var3 = var2.method143(-3230);
        this.field5535 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method126((byte) -117);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method128(var7, 0, 112, var5);
            this.field5535[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)F")
    public static final float method2269(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "([B)V")
    private static final void method2270(byte[] arg0) {
        method2278(arg0, 0);
        field5510 = 0x1 << method2272(4);
        field5530 = 0x1 << method2272(4);
        field5529 = new float[field5530];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5510 : field5530;
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
            int var25 = class54.method376(var17 - 1, 32238);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class266.method1777(var26, var25, 0);
            }
            if (var1 == 0) {
                field5507 = var18;
                field5509 = var20;
                field5534 = var22;
                field5527 = var24;
            } else {
                field5523 = var18;
                field5525 = var20;
                field5524 = var22;
                field5519 = var24;
            }
        }
        int var2 = method2272(8) + 1;
        field5526 = new class377[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5526[var3] = new class377();
        }
        int var4 = method2272(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2272(16);
        }
        int var6 = method2272(6) + 1;
        field5512 = new class245[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5512[var7] = new class245();
        }
        int var8 = method2272(6) + 1;
        field5537 = new class133[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5537[var9] = new class133();
        }
        int var10 = method2272(6) + 1;
        field5516 = new class152[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5516[var11] = new class152();
        }
        int var12 = method2272(6) + 1;
        field5511 = new boolean[var12];
        field5522 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5511[var13] = method2276() != 0;
            method2272(16);
            method2272(16);
            field5522[var13] = method2272(8);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()V")
    public static void method2271() {
        field5528 = null;
        field5526 = null;
        field5512 = null;
        field5537 = null;
        field5516 = null;
        field5511 = null;
        field5522 = null;
        field5529 = null;
        field5507 = null;
        field5509 = null;
        field5534 = null;
        field5523 = null;
        field5525 = null;
        field5524 = null;
        field5527 = null;
        field5519 = null;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)I")
    public static final int method2272(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5515) {
            int var4 = 8 - field5515;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5528[field5517] >> field5515 & var5) << var2;
            field5515 = 0;
            field5517++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5528[field5517] >> field5515 & var3) << var2;
            field5515 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)[F")
    private final float[] method2273(int arg0) {
        method2278(this.field5535[arg0], 0);
        method2276();
        int var2 = method2272(class54.method376(field5522.length - 1, 32238));
        boolean var3 = field5511[var2];
        int var4 = var3 ? field5530 : field5510;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2276() != 0;
            var6 = method2276() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5510 >> 2);
            var9 = (field5510 >> 2) + (var4 >> 2);
            var10 = field5510 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5510 >> 2);
            var12 = (field5510 >> 2) + (var4 - (var4 >> 2));
            var13 = field5510 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class152 var14 = field5516[field5522[var2]];
        int var15 = var14.field2430;
        int var16 = var14.field2427[var15];
        boolean var17 = !field5512[var16].method1667();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2428; var19++) {
            class133 var95 = field5537[var14.field2429[var19]];
            float[] var96 = field5529;
            var95.method1009(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2430;
            int var21 = var14.field2427[var20];
            field5512[var21].method1668(field5529, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5529[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5529;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5523 : field5507;
            float[] var30 = var3 ? field5525 : field5509;
            float[] var31 = var3 ? field5524 : field5534;
            int[] var32 = var3 ? field5519 : field5527;
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
            int var35 = class54.method376(var4 - 1, 32238);
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
                field5529[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5529[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5521 > 0) {
            int var49 = this.field5521 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5518) {
                for (int var50 = 0; var50 < this.field5508; var50++) {
                    int var51 = (this.field5521 >> 1) + var50;
                    var48[var50] += this.field5536[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5529[var52];
                }
            }
        }
        float[] var54 = this.field5536;
        this.field5536 = field5529;
        field5529 = var54;
        this.field5521 = var4;
        this.field5508 = var12 - (var4 >> 1);
        this.field5518 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([I)Lmg;")
    public final class168 method2274(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5540 == null) {
            this.field5521 = 0;
            this.field5536 = new float[field5530];
            this.field5540 = new byte[this.field5533];
            this.field5538 = 0;
            this.field5539 = 0;
        }
        while (this.field5539 < this.field5535.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2273(this.field5539);
            if (var3 != null) {
                int var4 = this.field5538;
                int var5 = var3.length;
                if (var5 > this.field5533 - var4) {
                    var5 = this.field5533 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5540[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5538;
                }
                this.field5538 = var4;
            }
            this.field5539++;
        }
        this.field5536 = null;
        byte[] var2 = this.field5540;
        this.field5540 = null;
        return new class168(this.field5513, var2, this.field5531, this.field5532, this.field5520);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lqs;I)Lbt;")
    public static final class354 method2275(class496 arg0, int arg1) {
        if (method2267(arg0)) {
            byte[] var2 = arg0.method2942(arg1, -10365);
            return var2 == null ? null : new class354(var2);
        } else {
            arg0.method2929(arg1, -65);
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "()I")
    public static final int method2276() {
        int var0 = field5528[field5517] >> field5515 & 0x1;
        field5515++;
        field5517 += field5515 >> 3;
        field5515 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lqs;II)Lbt;")
    public static final class354 method2277(class496 arg0, int arg1, int arg2) {
        if (method2267(arg0)) {
            byte[] var3 = arg0.method2926(arg2, -60, arg1);
            return var3 == null ? null : new class354(var3);
        } else {
            arg0.method2928(arg1, false, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([BI)V")
    private static final void method2278(byte[] arg0, int arg1) {
        field5528 = arg0;
        field5517 = arg1;
        field5515 = 0;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V")
    private class354(byte[] arg0) {
        this.method2268(arg0);
    }
}
