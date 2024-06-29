import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class128 extends class129 {

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
    private static boolean field2419 = false;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    private int field2400;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    private static int field2401;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    private int field2403;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    private static int field2408;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private static int field2411;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    private int field2417;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
    private int field2418;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    private static int field2420;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Z")
    private boolean field2397;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "Z")
    private boolean field2427;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "[B")
    private static byte[] field2416;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "[B")
    private byte[] field2428;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[F")
    private static float[] field2402;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[F")
    private static float[] field2404;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[F")
    private float[] field2405;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[F")
    private static float[] field2406;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "[F")
    private static float[] field2415;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[F")
    private static float[] field2421;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "[F")
    private static float[] field2422;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "[F")
    private static float[] field2423;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "[I")
    private static int[] field2409;

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
    private static int[] field2425;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "[I")
    private static int[] field2426;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "[Llf;")
    private static class115[] field2414;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[Lbe;")
    public static class16[] field2412;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[Lda;")
    private static class32[] field2398;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "[Lei;")
    private static class50[] field2410;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[Z")
    private static boolean[] field2407;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[[B")
    private byte[][] field2399;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([BI)V")
    private static final void method811(byte[] arg0, int arg1) {
        field2416 = arg0;
        field2401 = arg1;
        field2411 = 0;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)[F")
    private final float[] method812(int arg0) {
        method811(this.field2399[arg0], 0);
        method818();
        int var2 = method819(class191.method1273((byte) -113, field2409.length - 1));
        boolean var3 = field2407[var2];
        int var4 = var3 ? field2420 : field2408;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method818() != 0;
            var6 = method818() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2408 >> 2);
            var9 = (field2408 >> 2) + (var4 >> 2);
            var10 = field2408 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2408 >> 2);
            var12 = (field2408 >> 2) + (var4 - (var4 >> 2));
            var13 = field2408 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class32 var14 = field2398[field2409[var2]];
        int var15 = var14.field716;
        int var16 = var14.field715[var15];
        boolean var17 = !field2410[var16].method346();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field713; var19++) {
            class115 var95 = field2414[var14.field714[var19]];
            float[] var96 = field2404;
            var95.method706(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field716;
            int var21 = var14.field715[var20];
            field2410[var21].method345(field2404, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2404[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2404;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2402 : field2421;
            float[] var30 = var3 ? field2422 : field2406;
            float[] var31 = var3 ? field2423 : field2415;
            int[] var32 = var3 ? field2426 : field2425;
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
            int var35 = class191.method1273((byte) -109, var4 - 1);
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
                field2404[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2404[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2424 > 0) {
            int var49 = this.field2424 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2397) {
                for (int var50 = 0; var50 < this.field2403; var50++) {
                    int var51 = (this.field2424 >> 1) + var50;
                    var48[var50] += this.field2405[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2404[var52];
                }
            }
        }
        float[] var54 = this.field2405;
        this.field2405 = field2404;
        field2404 = var54;
        this.field2424 = var4;
        this.field2403 = var12 - (var4 >> 1);
        this.field2397 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)F")
    public static final float method813(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([B)V")
    private final void method814(byte[] arg0) {
        class121 var2 = new class121(arg0);
        this.field2417 = var2.method776(66);
        this.field2413 = var2.method776(113);
        this.field2418 = var2.method776(-95);
        this.field2400 = var2.method776(-44);
        if (this.field2400 < 0) {
            this.field2400 = ~this.field2400;
            this.field2427 = true;
        }
        int var3 = var2.method776(-46);
        this.field2399 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method751((byte) 83);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method770(49152, var7, 0, var5);
            this.field2399[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)Loc;")
    public final class142 method815(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2428 == null) {
            this.field2424 = 0;
            this.field2405 = new float[field2420];
            this.field2428 = new byte[this.field2413];
            this.field2429 = 0;
            this.field2430 = 0;
        }
        while (this.field2430 < this.field2399.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method812(this.field2430);
            if (var3 != null) {
                int var4 = this.field2429;
                int var5 = var3.length;
                if (var5 > this.field2413 - var4) {
                    var5 = this.field2413 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2428[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2429;
                }
                this.field2429 = var4;
            }
            this.field2430++;
        }
        this.field2405 = null;
        byte[] var2 = this.field2428;
        this.field2428 = null;
        return new class142(this.field2417, var2, this.field2418, this.field2400, this.field2427);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method816() {
        field2416 = null;
        field2412 = null;
        field2410 = null;
        field2414 = null;
        field2398 = null;
        field2407 = null;
        field2409 = null;
        field2404 = null;
        field2421 = null;
        field2406 = null;
        field2415 = null;
        field2402 = null;
        field2422 = null;
        field2423 = null;
        field2425 = null;
        field2426 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lbc;)Z")
    private static final boolean method817(class14 arg0) {
        if (!field2419) {
            byte[] var1 = arg0.method142(0, 0, (byte) 2);
            if (var1 == null) {
                return false;
            }
            method820(var1);
            field2419 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public static final int method818() {
        int var0 = field2416[field2401] >> field2411 & 0x1;
        field2411++;
        field2401 += field2411 >> 3;
        field2411 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)I")
    public static final int method819(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2411) {
            int var4 = 8 - field2411;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2416[field2401] >> field2411 & var5) << var2;
            field2411 = 0;
            field2401++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2416[field2401] >> field2411 & var3) << var2;
            field2411 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([B)V")
    private static final void method820(byte[] arg0) {
        method811(arg0, 0);
        field2408 = 0x1 << method819(4);
        field2420 = 0x1 << method819(4);
        field2404 = new float[field2420];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2408 : field2420;
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
            int var25 = class191.method1273((byte) -122, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class167.method1081(var25, (byte) -65, var26);
            }
            if (var1 == 0) {
                field2421 = var18;
                field2406 = var20;
                field2415 = var22;
                field2425 = var24;
            } else {
                field2402 = var18;
                field2422 = var20;
                field2423 = var22;
                field2426 = var24;
            }
        }
        int var2 = method819(8) + 1;
        field2412 = new class16[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2412[var3] = new class16();
        }
        int var4 = method819(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method819(16);
        }
        int var6 = method819(6) + 1;
        field2410 = new class50[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2410[var7] = new class50();
        }
        int var8 = method819(6) + 1;
        field2414 = new class115[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2414[var9] = new class115();
        }
        int var10 = method819(6) + 1;
        field2398 = new class32[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2398[var11] = new class32();
        }
        int var12 = method819(6) + 1;
        field2407 = new boolean[var12];
        field2409 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2407[var13] = method818() != 0;
            method819(16);
            method819(16);
            field2409[var13] = method819(8);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lbc;II)Lmi;")
    public static final class128 method821(class14 arg0, int arg1, int arg2) {
        if (method817(arg0)) {
            byte[] var3 = arg0.method142(arg1, arg2, (byte) 2);
            return var3 == null ? null : new class128(var3);
        } else {
            arg0.method134(true, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V")
    private class128(byte[] arg0) {
        this.method814(arg0);
    }
}
