import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class299 extends class496 {

    @OriginalMember(owner = "client!av", name = "t", descriptor = "Z")
    private static boolean field4367 = false;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    private int field4360;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    private static int field4363;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    private static int field4365;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "I")
    private int field4368;

    @OriginalMember(owner = "client!av", name = "v", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!av", name = "w", descriptor = "I")
    private static int field4370;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    private int field4374;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "I")
    private static int field4376;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "I")
    private int field4378;

    @OriginalMember(owner = "client!av", name = "M", descriptor = "I")
    private int field4386;

    @OriginalMember(owner = "client!av", name = "N", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!av", name = "O", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "Z")
    private boolean field4362;

    @OriginalMember(owner = "client!av", name = "K", descriptor = "Z")
    private boolean field4384;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "[B")
    private static byte[] field4359;

    @OriginalMember(owner = "client!av", name = "P", descriptor = "[B")
    private byte[] field4389;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "[F")
    private static float[] field4358;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "[F")
    private static float[] field4361;

    @OriginalMember(owner = "client!av", name = "s", descriptor = "[F")
    private static float[] field4366;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "[F")
    private static float[] field4371;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "[F")
    private static float[] field4373;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "[F")
    private static float[] field4377;

    @OriginalMember(owner = "client!av", name = "H", descriptor = "[F")
    private static float[] field4381;

    @OriginalMember(owner = "client!av", name = "I", descriptor = "[F")
    private float[] field4382;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "[I")
    private static int[] field4356;

    @OriginalMember(owner = "client!av", name = "G", descriptor = "[I")
    private static int[] field4380;

    @OriginalMember(owner = "client!av", name = "L", descriptor = "[I")
    private static int[] field4385;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "[Lpk;")
    private static class101[] field4357;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "[Ltd;")
    private static class460[] field4364;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "[Ltm;")
    private static class485[] field4372;

    @OriginalMember(owner = "client!av", name = "B", descriptor = "[Lqj;")
    public static class503[] field4375;

    @OriginalMember(owner = "client!av", name = "F", descriptor = "[Z")
    private static boolean[] field4379;

    @OriginalMember(owner = "client!av", name = "J", descriptor = "[[B")
    private byte[][] field4383;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)[F", line = 4)
    private final float[] method1843(int arg0) {
        method1853(this.field4383[arg0], 0);
        method1844();
        int var2 = method1850(class552.method3233(-119, field4385.length - 1));
        boolean var3 = field4379[var2];
        int var4 = var3 ? field4376 : field4370;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1844() != 0;
            var6 = method1844() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4370 >> 2);
            var9 = (field4370 >> 2) + (var4 >> 2);
            var10 = field4370 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4370 >> 2);
            var12 = (field4370 >> 2) + (var4 - (var4 >> 2));
            var13 = field4370 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class101 var14 = field4357[field4385[var2]];
        int var15 = var14.field1279;
        int var16 = var14.field1281[var15];
        boolean var17 = !field4372[var16].method2940();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1280; var19++) {
            class460 var95 = field4364[var14.field1282[var19]];
            float[] var96 = field4377;
            var95.method2740(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1279;
            int var21 = var14.field1281[var20];
            field4372[var21].method2941(field4377, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4377[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4377;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4358 : field4371;
            float[] var30 = var3 ? field4373 : field4361;
            float[] var31 = var3 ? field4366 : field4381;
            int[] var32 = var3 ? field4356 : field4380;
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
            int var35 = class552.method3233(-1, var4 - 1);
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
                field4377[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4377[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4386 > 0) {
            int var49 = this.field4386 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4384) {
                for (int var50 = 0; var50 < this.field4360; var50++) {
                    int var51 = (this.field4386 >> 1) + var50;
                    var48[var50] += this.field4382[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4377[var52];
                }
            }
        }
        float[] var54 = this.field4382;
        this.field4382 = field4377;
        field4377 = var54;
        this.field4386 = var4;
        this.field4360 = var12 - (var4 >> 1);
        this.field4384 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "()I", line = 417)
    public static final int method1844() {
        int var0 = field4359[field4365] >> field4363 & 0x1;
        field4363++;
        field4365 += field4363 >> 3;
        field4363 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([B)V", line = 425)
    private static final void method1845(byte[] arg0) {
        method1853(arg0, 0);
        field4370 = 0x1 << method1850(4);
        field4376 = 0x1 << method1850(4);
        field4377 = new float[field4376];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4370 : field4376;
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
            int var25 = class552.method3233(-126, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class603.method3506(var26, (byte) 94, var25);
            }
            if (var1 == 0) {
                field4371 = var18;
                field4361 = var20;
                field4381 = var22;
                field4380 = var24;
            } else {
                field4358 = var18;
                field4373 = var20;
                field4366 = var22;
                field4356 = var24;
            }
        }
        int var2 = method1850(8) + 1;
        field4375 = new class503[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4375[var3] = new class503();
        }
        int var4 = method1850(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1850(16);
        }
        int var6 = method1850(6) + 1;
        field4372 = new class485[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4372[var7] = new class485();
        }
        int var8 = method1850(6) + 1;
        field4364 = new class460[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4364[var9] = new class460();
        }
        int var10 = method1850(6) + 1;
        field4357 = new class101[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4357[var11] = new class101();
        }
        int var12 = method1850(6) + 1;
        field4379 = new boolean[var12];
        field4385 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4379[var13] = method1844() != 0;
            method1850(16);
            method1850(16);
            field4385[var13] = method1850(8);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ldda;I)Lav;", line = 579)
    public static final class299 method1846(class597 arg0, int arg1) {
        if (method1847(arg0)) {
            byte[] var2 = arg0.method3469(arg1, 117);
            return var2 == null ? null : new class299(var2);
        } else {
            arg0.method3491(117, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ldda;)Z", line = 594)
    private static final boolean method1847(class597 arg0) {
        if (!field4367) {
            byte[] var1 = arg0.method3486((byte) -80, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1845(var1);
            field4367 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)F", line = 609)
    public static final float method1848(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([I)Lmca;", line = 625)
    public final class5 method1849(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4389 == null) {
            this.field4386 = 0;
            this.field4382 = new float[field4376];
            this.field4389 = new byte[this.field4378];
            this.field4388 = 0;
            this.field4387 = 0;
        }
        while (this.field4387 < this.field4383.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1843(this.field4387);
            if (var3 != null) {
                int var4 = this.field4388;
                int var5 = var3.length;
                if (var5 > this.field4378 - var4) {
                    var5 = this.field4378 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4389[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4388;
                }
                this.field4388 = var4;
            }
            this.field4387++;
        }
        this.field4382 = null;
        byte[] var2 = this.field4389;
        this.field4389 = null;
        return new class5(this.field4374, var2, this.field4368, this.field4369, this.field4362);
    }

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(I)I", line = 691)
    public static final int method1850(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4363) {
            int var4 = 8 - field4363;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4359[field4365] >> field4363 & var5) << var2;
            field4363 = 0;
            field4365++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4359[field4365] >> field4363 & var3) << var2;
            field4363 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "([B)V", line = 728)
    private final void method1851(byte[] arg0) {
        class428 var2 = new class428(arg0);
        this.field4374 = var2.method2589(-11179);
        this.field4378 = var2.method2589(-11179);
        this.field4368 = var2.method2589(-11179);
        this.field4369 = var2.method2589(-11179);
        if (this.field4369 < 0) {
            this.field4369 = ~this.field4369;
            this.field4362 = true;
        }
        int var3 = var2.method2589(-11179);
        this.field4383 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2561((byte) -54);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2575(28637, var5, var7, 0);
            this.field4383[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ldda;II)Lav;", line = 771)
    public static final class299 method1852(class597 arg0, int arg1, int arg2) {
        if (method1847(arg0)) {
            byte[] var3 = arg0.method3486((byte) -91, arg2, arg1);
            return var3 == null ? null : new class299(var3);
        } else {
            arg0.method3461(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([BI)V", line = 785)
    private static final void method1853(byte[] arg0, int arg1) {
        field4359 = arg0;
        field4365 = arg1;
        field4363 = 0;
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "()V", line = 796)
    public static void method1854() {
        field4359 = null;
        field4375 = null;
        field4372 = null;
        field4364 = null;
        field4357 = null;
        field4379 = null;
        field4385 = null;
        field4377 = null;
        field4371 = null;
        field4361 = null;
        field4381 = null;
        field4358 = null;
        field4373 = null;
        field4366 = null;
        field4380 = null;
        field4356 = null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "([B)V", line = 816)
    private class299(byte[] arg0) {
        this.method1851(arg0);
    }
}
