import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class42 extends class498 {

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "Z")
    private static boolean field462 = false;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    private static int field457;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    private static int field463;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    private static int field465;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    private static int field473;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!nr", name = "U", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "Z")
    private boolean field469;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "Z")
    private boolean field477;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "[B")
    private static byte[] field472;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "[B")
    private byte[] field486;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "[F")
    private static float[] field461;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "[F")
    private float[] field464;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "[F")
    private static float[] field467;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "[F")
    private static float[] field470;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "[F")
    private static float[] field474;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "[F")
    private static float[] field478;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "[F")
    private static float[] field480;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "[F")
    private static float[] field483;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "[I")
    private static int[] field455;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "[I")
    private static int[] field456;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "[I")
    private static int[] field468;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "[Lig;")
    private static class164[] field471;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "[Llv;")
    private static class313[] field459;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "[Lii;")
    public static class394[] field460;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "[Lmo;")
    private static class537[] field481;

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "[Z")
    private static boolean[] field484;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "[[B")
    private byte[][] field479;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Loi;I)Lnr;", line = 4)
    public static final class42 method238(class53 arg0, int arg1) {
        if (method249(arg0)) {
            byte[] var2 = arg0.method421(arg1, 1);
            return var2 == null ? null : new class42(var2);
        } else {
            arg0.method424(0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)F", line = 38)
    public static final float method239(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([B)V", line = 56)
    private static final void method240(byte[] arg0) {
        method247(arg0, 0);
        field473 = 0x1 << method243(4);
        field465 = 0x1 << method243(4);
        field474 = new float[field465];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field473 : field465;
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
            int var25 = class25.method164((byte) -50, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class463.method2691((byte) 115, var26, var25);
            }
            if (var1 == 0) {
                field470 = var18;
                field461 = var20;
                field480 = var22;
                field456 = var24;
            } else {
                field483 = var18;
                field467 = var20;
                field478 = var22;
                field455 = var24;
            }
        }
        int var2 = method243(8) + 1;
        field460 = new class394[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field460[var3] = new class394();
        }
        int var4 = method243(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method243(16);
        }
        int var6 = method243(6) + 1;
        field481 = new class537[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field481[var7] = new class537();
        }
        int var8 = method243(6) + 1;
        field459 = new class313[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field459[var9] = new class313();
        }
        int var10 = method243(6) + 1;
        field471 = new class164[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field471[var11] = new class164();
        }
        int var12 = method243(6) + 1;
        field484 = new boolean[var12];
        field468 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field484[var13] = method245() != 0;
            method243(16);
            method243(16);
            field468[var13] = method243(8);
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)[F", line = 208)
    private final float[] method241(int arg0) {
        method247(this.field479[arg0], 0);
        method245();
        int var2 = method243(class25.method164((byte) -50, field468.length - 1));
        boolean var3 = field484[var2];
        int var4 = var3 ? field465 : field473;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method245() != 0;
            var6 = method245() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field473 >> 2);
            var9 = (field473 >> 2) + (var4 >> 2);
            var10 = field473 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field473 >> 2);
            var12 = (field473 >> 2) + (var4 - (var4 >> 2));
            var13 = field473 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class164 var14 = field471[field468[var2]];
        int var15 = var14.field2422;
        int var16 = var14.field2419[var15];
        boolean var17 = !field481[var16].method3157();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2421; var19++) {
            class313 var95 = field459[var14.field2420[var19]];
            float[] var96 = field474;
            var95.method1889(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2422;
            int var21 = var14.field2419[var20];
            field481[var21].method3160(field474, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field474[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field474;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field483 : field470;
            float[] var30 = var3 ? field467 : field461;
            float[] var31 = var3 ? field478 : field480;
            int[] var32 = var3 ? field455 : field456;
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
            int var35 = class25.method164((byte) -50, var4 - 1);
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
                field474[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field474[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field476 > 0) {
            int var49 = this.field476 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field469) {
                for (int var50 = 0; var50 < this.field482; var50++) {
                    int var51 = (this.field476 >> 1) + var50;
                    var48[var50] += this.field464[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field474[var52];
                }
            }
        }
        float[] var54 = this.field464;
        this.field464 = field474;
        field474 = var54;
        this.field476 = var4;
        this.field482 = var12 - (var4 >> 1);
        this.field469 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([I)Lcj;", line = 620)
    public final class499 method242(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field486 == null) {
            this.field476 = 0;
            this.field464 = new float[field465];
            this.field486 = new byte[this.field466];
            this.field488 = 0;
            this.field487 = 0;
        }
        while (this.field487 < this.field479.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method241(this.field487);
            if (var3 != null) {
                int var4 = this.field488;
                int var5 = var3.length;
                if (var5 > this.field466 - var4) {
                    var5 = this.field466 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field486[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field488;
                }
                this.field488 = var4;
            }
            this.field487++;
        }
        this.field464 = null;
        byte[] var2 = this.field486;
        this.field486 = null;
        return new class499(this.field485, var2, this.field475, this.field458, this.field477);
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)I", line = 681)
    public static final int method243(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field457) {
            int var4 = 8 - field457;
            int var5 = (0x1 << var4) - 1;
            var1 += (field472[field463] >> field457 & var5) << var2;
            field457 = 0;
            field463++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field472[field463] >> field457 & var3) << var2;
            field457 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "([B)V", line = 709)
    private final void method244(byte[] arg0) {
        class403 var2 = new class403(arg0);
        this.field485 = var2.method2319((byte) 75);
        this.field466 = var2.method2319((byte) 87);
        this.field475 = var2.method2319((byte) 86);
        this.field458 = var2.method2319((byte) 79);
        if (this.field458 < 0) {
            this.field458 = ~this.field458;
            this.field477 = true;
        }
        int var3 = var2.method2319((byte) 88);
        this.field479 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2357((byte) 126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2379(var5, 90, var7, 0);
            this.field479[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()I", line = 756)
    public static final int method245() {
        int var0 = field472[field463] >> field457 & 0x1;
        field457++;
        field463 += field457 >> 3;
        field457 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Loi;II)Lnr;", line = 765)
    public static final class42 method246(class53 arg0, int arg1, int arg2) {
        if (method249(arg0)) {
            byte[] var3 = arg0.method426(arg1, (byte) 9, arg2);
            return var3 == null ? null : new class42(var3);
        } else {
            arg0.method448(arg2, arg1, 114);
            return null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)V", line = 779)
    private static final void method247(byte[] arg0, int arg1) {
        field472 = arg0;
        field463 = arg1;
        field457 = 0;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "([B)V", line = 783)
    private class42(byte[] arg0) {
        this.method244(arg0);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "()V", line = 790)
    public static void method248() {
        field472 = null;
        field460 = null;
        field481 = null;
        field459 = null;
        field471 = null;
        field484 = null;
        field468 = null;
        field474 = null;
        field470 = null;
        field461 = null;
        field480 = null;
        field483 = null;
        field467 = null;
        field478 = null;
        field456 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Loi;)Z", line = 809)
    private static final boolean method249(class53 arg0) {
        if (!field462) {
            byte[] var1 = arg0.method426(0, (byte) 9, 0);
            if (var1 == null) {
                return false;
            }
            method240(var1);
            field462 = true;
        }
        return true;
    }
}
