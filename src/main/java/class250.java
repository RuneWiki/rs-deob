import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class250 extends class107 {

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Z")
    private static boolean field4389 = false;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    private static int field4386;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "I")
    private int field4404;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    private static int field4407;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    private static int field4408;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    private static int field4409;

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    private int field4411;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    private int field4412;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Z")
    private boolean field4390;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "Z")
    private boolean field4398;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "[B")
    private static byte[] field4395;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "[B")
    private byte[] field4416;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "[F")
    private static float[] field4385;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "[F")
    private static float[] field4388;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[F")
    private float[] field4392;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[F")
    private static float[] field4393;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "[F")
    private static float[] field4406;

    @OriginalMember(owner = "client!tj", name = "X", descriptor = "[F")
    private static float[] field4410;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "[F")
    private static float[] field4413;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "[F")
    private static float[] field4414;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "[I")
    private static int[] field4396;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[I")
    private static int[] field4402;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "[I")
    private static int[] field4403;

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "[Lgk;")
    private static class148[] field4415;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[Lbc;")
    private static class165[] field4391;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "[Lme;")
    private static class206[] field4394;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "[Ldk;")
    public static class253[] field4399;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "[Z")
    private static boolean[] field4400;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "[[B")
    private byte[][] field4401;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([I)Lci;")
    public final class224 method1696(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4416 == null) {
            this.field4397 = 0;
            this.field4392 = new float[field4408];
            this.field4416 = new byte[this.field4387];
            this.field4412 = 0;
            this.field4411 = 0;
        }
        while (this.field4411 < this.field4401.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1706(this.field4411);
            if (var3 != null) {
                int var4 = this.field4412;
                int var5 = var3.length;
                if (var5 > this.field4387 - var4) {
                    var5 = this.field4387 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4416[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4412;
                }
                this.field4412 = var4;
            }
            this.field4411++;
        }
        this.field4392 = null;
        byte[] var2 = this.field4416;
        this.field4416 = null;
        return new class224(this.field4383, var2, this.field4405, this.field4404, this.field4390);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BI)V")
    private static final void method1697(byte[] arg0, int arg1) {
        field4395 = arg0;
        field4409 = arg1;
        field4407 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)F")
    public static final float method1698(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lu;)Z")
    private static final boolean method1699(class111 arg0) {
        if (!field4389) {
            byte[] var1 = arg0.method828(0, (byte) 105, 0);
            if (var1 == null) {
                return false;
            }
            method1700(var1);
            field4389 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([B)V")
    private static final void method1700(byte[] arg0) {
        method1697(arg0, 0);
        field4386 = 0x1 << method1703(4);
        field4408 = 0x1 << method1703(4);
        field4388 = new float[field4408];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4386 : field4408;
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
            int var25 = class6.method25(-128, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class233.method1621((byte) 122, var26, var25);
            }
            if (var1 == 0) {
                field4393 = var18;
                field4385 = var20;
                field4414 = var22;
                field4403 = var24;
            } else {
                field4410 = var18;
                field4406 = var20;
                field4413 = var22;
                field4396 = var24;
            }
        }
        int var2 = method1703(8) + 1;
        field4399 = new class253[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4399[var3] = new class253();
        }
        int var4 = method1703(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1703(16);
        }
        int var6 = method1703(6) + 1;
        field4394 = new class206[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4394[var7] = new class206();
        }
        int var8 = method1703(6) + 1;
        field4415 = new class148[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4415[var9] = new class148();
        }
        int var10 = method1703(6) + 1;
        field4391 = new class165[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4391[var11] = new class165();
        }
        int var12 = method1703(6) + 1;
        field4400 = new boolean[var12];
        field4402 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4400[var13] = method1704() != 0;
            method1703(16);
            method1703(16);
            field4402[var13] = method1703(8);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "([B)V")
    private final void method1701(byte[] arg0) {
        class121 var2 = new class121(arg0);
        this.field4383 = var2.method865((byte) 8);
        this.field4387 = var2.method865((byte) 8);
        this.field4405 = var2.method865((byte) 8);
        this.field4404 = var2.method865((byte) 8);
        if (this.field4404 < 0) {
            this.field4404 = ~this.field4404;
            this.field4390 = true;
        }
        int var3 = var2.method865((byte) 8);
        this.field4401 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method897(-65);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method916(true, 0, var7, var5);
            this.field4401[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
    public static void method1702() {
        field4395 = null;
        field4399 = null;
        field4394 = null;
        field4415 = null;
        field4391 = null;
        field4400 = null;
        field4402 = null;
        field4388 = null;
        field4393 = null;
        field4385 = null;
        field4414 = null;
        field4410 = null;
        field4406 = null;
        field4413 = null;
        field4403 = null;
        field4396 = null;
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)I")
    public static final int method1703(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4407) {
            int var4 = 8 - field4407;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4395[field4409] >> field4407 & var5) << var2;
            field4407 = 0;
            field4409++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4395[field4409] >> field4407 & var3) << var2;
            field4407 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()I")
    public static final int method1704() {
        int var0 = field4395[field4409] >> field4407 & 0x1;
        field4407++;
        field4409 += field4407 >> 3;
        field4407 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lu;II)Ltj;")
    public static final class250 method1705(class111 arg0, int arg1, int arg2) {
        if (method1699(arg0)) {
            byte[] var3 = arg0.method828(arg1, (byte) 119, arg2);
            return var3 == null ? null : new class250(var3);
        } else {
            arg0.method807(arg1, arg2, -128);
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([B)V")
    private class250(byte[] arg0) {
        this.method1701(arg0);
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)[F")
    private final float[] method1706(int arg0) {
        method1697(this.field4401[arg0], 0);
        method1704();
        int var2 = method1703(class6.method25(-128, field4402.length - 1));
        boolean var3 = field4400[var2];
        int var4 = var3 ? field4408 : field4386;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1704() != 0;
            var6 = method1704() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4386 >> 2);
            var9 = (field4386 >> 2) + (var4 >> 2);
            var10 = field4386 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4386 >> 2);
            var12 = (field4386 >> 2) + (var4 - (var4 >> 2));
            var13 = field4386 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class165 var14 = field4391[field4402[var2]];
        int var15 = var14.field2695;
        int var16 = var14.field2694[var15];
        boolean var17 = !field4394[var16].method1420();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2693; var19++) {
            class148 var95 = field4415[var14.field2692[var19]];
            float[] var96 = field4388;
            var95.method1073(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2695;
            int var21 = var14.field2694[var20];
            field4394[var21].method1422(field4388, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4388[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4388;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4410 : field4393;
            float[] var30 = var3 ? field4406 : field4385;
            float[] var31 = var3 ? field4413 : field4414;
            int[] var32 = var3 ? field4396 : field4403;
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
            int var35 = class6.method25(-121, var4 - 1);
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
                field4388[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4388[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4397 > 0) {
            int var49 = this.field4397 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4398) {
                for (int var50 = 0; var50 < this.field4384; var50++) {
                    int var51 = (this.field4397 >> 1) + var50;
                    var48[var50] += this.field4392[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4388[var52];
                }
            }
        }
        float[] var54 = this.field4392;
        this.field4392 = field4388;
        field4388 = var54;
        this.field4397 = var4;
        this.field4384 = var12 - (var4 >> 1);
        this.field4398 = var17;
        return var48;
    }
}
