import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class244 extends class183 {

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
    private static boolean field3486 = false;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    private int field3489;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    private int field3490;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    private static int field3492;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    private int field3496;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    private static int field3498;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    private static int field3503;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    private static int field3507;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "Z")
    private boolean field3505;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "Z")
    private boolean field3508;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "[B")
    private static byte[] field3502;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "[B")
    private byte[] field3517;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "[F")
    private static float[] field3487;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "[F")
    private static float[] field3493;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[F")
    private static float[] field3494;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "[F")
    private float[] field3509;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "[F")
    private static float[] field3510;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "[F")
    private static float[] field3513;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "[F")
    private static float[] field3515;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "[F")
    private static float[] field3516;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "[I")
    private static int[] field3497;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "[I")
    private static int[] field3511;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "[I")
    private static int[] field3512;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "[Lol;")
    private static class118[] field3499;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "[Lal;")
    private static class14[] field3491;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "[Lmd;")
    public static class331[] field3504;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "[Ls;")
    private static class335[] field3501;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "[Z")
    private static boolean[] field3506;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "[[B")
    private byte[][] field3488;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([I)Lcc;", line = 3)
    public final class87 method1673(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3517 == null) {
            this.field3490 = 0;
            this.field3509 = new float[field3492];
            this.field3517 = new byte[this.field3496];
            this.field3519 = 0;
            this.field3518 = 0;
        }
        while (this.field3518 < this.field3488.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1678(this.field3518);
            if (var2 != null) {
                int var3 = this.field3519;
                int var4 = var2.length;
                if (var4 > this.field3496 - var3) {
                    var4 = this.field3496 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field3517[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field3519;
                }
                this.field3519 = var3;
            }
            this.field3518++;
        }
        this.field3509 = null;
        byte[] var7 = this.field3517;
        this.field3517 = null;
        return new class87(this.field3489, var7, this.field3500, this.field3514, this.field3508);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkm;II)Lnm;", line = 65)
    public static final class244 method1674(class133 arg0, int arg1, int arg2) {
        if (method1682(arg0)) {
            byte[] var3 = arg0.method955(arg1, arg2, -21853);
            return var3 == null ? null : new class244(var3);
        } else {
            arg0.method975((byte) 55, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)F", line = 84)
    public static final float method1675(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 100)
    public static void method1676() {
        field3502 = null;
        field3504 = null;
        field3491 = null;
        field3499 = null;
        field3501 = null;
        field3506 = null;
        field3512 = null;
        field3493 = null;
        field3487 = null;
        field3516 = null;
        field3515 = null;
        field3513 = null;
        field3510 = null;
        field3494 = null;
        field3511 = null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()I", line = 119)
    public static final int method1677() {
        int var0 = field3502[field3498] >> field3507 & 0x1;
        field3507++;
        field3498 += field3507 >> 3;
        field3507 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)[F", line = 128)
    private final float[] method1678(int arg0) {
        method1680(this.field3488[arg0], 0);
        method1677();
        int var2 = method1679(class130.method933(field3512.length - 1, 2));
        boolean var3 = field3506[var2];
        int var4 = var3 ? field3492 : field3503;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1677() != 0;
            var6 = method1677() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3503 >> 2);
            var9 = (field3503 >> 2) + (var4 >> 2);
            var10 = field3503 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3503 >> 2);
            var12 = (field3503 >> 2) + (var4 - (var4 >> 2));
            var13 = field3503 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class335 var14 = field3501[field3512[var2]];
        int var15 = var14.field5055;
        int var16 = var14.field5052[var15];
        boolean var17 = !field3491[var16].method89();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5053; var19++) {
            class118 var20 = field3499[var14.field5054[var19]];
            float[] var21 = field3493;
            var20.method864(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5055;
            int var23 = var14.field5052[var22];
            field3491[var23].method94(field3493, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field3493[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field3493;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field3513 : field3487;
            float[] var32 = var3 ? field3510 : field3516;
            float[] var33 = var3 ? field3494 : field3515;
            int[] var34 = var3 ? field3497 : field3511;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class130.method933(var4 - 1, 2);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field3493[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3493[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field3490 > 0) {
            int var91 = this.field3490 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field3505) {
                for (int var92 = 0; var92 < this.field3495; var92++) {
                    int var93 = (this.field3490 >> 1) + var92;
                    var90[var92] += this.field3509[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field3493[var94];
                }
            }
        }
        float[] var96 = this.field3509;
        this.field3509 = field3493;
        field3493 = var96;
        this.field3490 = var4;
        this.field3495 = var12 - (var4 >> 1);
        this.field3505 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I", line = 546)
    public static final int method1679(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3507) {
            int var3 = 8 - field3507;
            int var4 = (0x1 << var3) - 1;
            var1 += (field3502[field3498] >> field3507 & var4) << var2;
            field3507 = 0;
            field3498++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field3502[field3498] >> field3507 & var5) << var2;
            field3507 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)V", line = 575)
    private static final void method1680(byte[] arg0, int arg1) {
        field3502 = arg0;
        field3498 = arg1;
        field3507 = 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([B)V", line = 585)
    private final void method1681(byte[] arg0) {
        class316 var2 = new class316(arg0);
        this.field3489 = var2.method2172((byte) 71);
        this.field3496 = var2.method2172((byte) 71);
        this.field3500 = var2.method2172((byte) 71);
        this.field3514 = var2.method2172((byte) 71);
        if (this.field3514 < 0) {
            this.field3514 = ~this.field3514;
            this.field3508 = true;
        }
        int var3 = var2.method2172((byte) 71);
        this.field3488 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2219(16448);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2207(var7, var5, (byte) 109, 0);
            this.field3488[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lkm;)Z", line = 627)
    private static final boolean method1682(class133 arg0) {
        if (!field3486) {
            byte[] var1 = arg0.method955(0, 0, -21853);
            if (var1 == null) {
                return false;
            }
            method1683(var1);
            field3486 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "([B)V", line = 651)
    private static final void method1683(byte[] arg0) {
        method1680(arg0, 0);
        field3503 = 0x1 << method1679(4);
        field3492 = 0x1 << method1679(4);
        field3493 = new float[field3492];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field3503 : field3492;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class130.method933(var5 - 1, 2);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class271.method1872(var13, false, var14);
            }
            if (var1 == 0) {
                field3487 = var6;
                field3516 = var8;
                field3515 = var10;
                field3511 = var12;
            } else {
                field3513 = var6;
                field3510 = var8;
                field3494 = var10;
                field3497 = var12;
            }
        }
        int var15 = method1679(8) + 1;
        field3504 = new class331[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field3504[var16] = new class331();
        }
        int var17 = method1679(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1679(16);
        }
        int var19 = method1679(6) + 1;
        field3491 = new class14[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field3491[var20] = new class14();
        }
        int var21 = method1679(6) + 1;
        field3499 = new class118[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field3499[var22] = new class118();
        }
        int var23 = method1679(6) + 1;
        field3501 = new class335[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field3501[var24] = new class335();
        }
        int var25 = method1679(6) + 1;
        field3506 = new boolean[var25];
        field3512 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field3506[var26] = method1677() != 0;
            method1679(16);
            method1679(16);
            field3512[var26] = method1679(8);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V", line = 803)
    private class244(byte[] arg0) {
        this.method1681(arg0);
    }
}
