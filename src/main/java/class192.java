import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class192 extends class12 {

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Z")
    private static boolean field3436 = false;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    private static int field3414;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    private static int field3417;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    private static int field3420;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    private static int field3421;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    private int field3423;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    private int field3427;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    private int field3432;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
    private int field3447;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Z")
    private boolean field3416;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Z")
    private boolean field3422;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "[B")
    private static byte[] field3430;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "[B")
    private byte[] field3446;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[F")
    private static float[] field3418;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[F")
    private float[] field3425;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "[F")
    private static float[] field3426;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "[F")
    private static float[] field3428;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "[F")
    private static float[] field3429;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "[F")
    private static float[] field3438;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[F")
    private static float[] field3441;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "[F")
    private static float[] field3442;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "[I")
    private static int[] field3433;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "[I")
    private static int[] field3434;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
    private static int[] field3440;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "[Lki;")
    public static class118[] field3439;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[Lbd;")
    private static class16[] field3419;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Lrb;")
    private static class188[] field3443;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "[Lda;")
    private static class35[] field3431;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[Z")
    private static boolean[] field3437;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[[B")
    private byte[][] field3424;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)V")
    private static final void method1280(byte[] arg0, int arg1) {
        field3430 = arg0;
        field3417 = arg1;
        field3414 = 0;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)[F")
    private final float[] method1281(int arg0) {
        method1280(this.field3424[arg0], 0);
        method1289();
        int var2 = method1285(class31.method265(-257, field3434.length - 1));
        boolean var3 = field3437[var2];
        int var4 = var3 ? field3420 : field3421;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1289() != 0;
            var6 = method1289() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3421 >> 2);
            var9 = (field3421 >> 2) + (var4 >> 2);
            var10 = field3421 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3421 >> 2);
            var12 = (field3421 >> 2) + (var4 - (var4 >> 2));
            var13 = field3421 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class188 var14 = field3443[field3434[var2]];
        int var15 = var14.field3357;
        int var16 = var14.field3358[var15];
        boolean var17 = !field3431[var16].method312();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3355; var19++) {
            class16 var95 = field3419[var14.field3356[var19]];
            float[] var96 = field3418;
            var95.method165(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3357;
            int var21 = var14.field3358[var20];
            field3431[var21].method307(field3418, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3418[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3418;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3426 : field3438;
            float[] var30 = var3 ? field3428 : field3441;
            float[] var31 = var3 ? field3442 : field3429;
            int[] var32 = var3 ? field3433 : field3440;
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
            int var35 = class31.method265(-257, var4 - 1);
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
                field3418[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3418[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3427 > 0) {
            int var49 = this.field3427 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3416) {
                for (int var50 = 0; var50 < this.field3435; var50++) {
                    int var51 = (this.field3427 >> 1) + var50;
                    var48[var50] += this.field3425[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3418[var52];
                }
            }
        }
        float[] var54 = this.field3425;
        this.field3425 = field3418;
        field3418 = var54;
        this.field3427 = var4;
        this.field3435 = var12 - (var4 >> 1);
        this.field3416 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([I)Lpd;")
    public final class168 method1282(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3446 == null) {
            this.field3427 = 0;
            this.field3425 = new float[field3420];
            this.field3446 = new byte[this.field3415];
            this.field3447 = 0;
            this.field3445 = 0;
        }
        while (this.field3445 < this.field3424.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1281(this.field3445);
            if (var3 != null) {
                int var4 = this.field3447;
                int var5 = var3.length;
                if (var5 > this.field3415 - var4) {
                    var5 = this.field3415 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3446[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3447;
                }
                this.field3447 = var4;
            }
            this.field3445++;
        }
        this.field3425 = null;
        byte[] var2 = this.field3446;
        this.field3446 = null;
        return new class168(this.field3423, var2, this.field3432, this.field3444, this.field3422);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
    public static void method1283() {
        field3430 = null;
        field3439 = null;
        field3431 = null;
        field3419 = null;
        field3443 = null;
        field3437 = null;
        field3434 = null;
        field3418 = null;
        field3438 = null;
        field3441 = null;
        field3429 = null;
        field3426 = null;
        field3428 = null;
        field3442 = null;
        field3440 = null;
        field3433 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
    private static final void method1284(byte[] arg0) {
        method1280(arg0, 0);
        field3421 = 0x1 << method1285(4);
        field3420 = 0x1 << method1285(4);
        field3418 = new float[field3420];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3421 : field3420;
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
            int var25 = class31.method265(-257, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class182.method1256(var26, (byte) 14, var25);
            }
            if (var1 == 0) {
                field3438 = var18;
                field3441 = var20;
                field3429 = var22;
                field3440 = var24;
            } else {
                field3426 = var18;
                field3428 = var20;
                field3442 = var22;
                field3433 = var24;
            }
        }
        int var2 = method1285(8) + 1;
        field3439 = new class118[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3439[var3] = new class118();
        }
        int var4 = method1285(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1285(16);
        }
        int var6 = method1285(6) + 1;
        field3431 = new class35[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3431[var7] = new class35();
        }
        int var8 = method1285(6) + 1;
        field3419 = new class16[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3419[var9] = new class16();
        }
        int var10 = method1285(6) + 1;
        field3443 = new class188[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3443[var11] = new class188();
        }
        int var12 = method1285(6) + 1;
        field3437 = new boolean[var12];
        field3434 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3437[var13] = method1289() != 0;
            method1285(16);
            method1285(16);
            field3434[var13] = method1285(8);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
    public static final int method1285(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3414) {
            int var4 = 8 - field3414;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3430[field3417] >> field3414 & var5) << var2;
            field3414 = 0;
            field3417++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3430[field3417] >> field3414 & var3) << var2;
            field3414 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lai;)Z")
    private static final boolean method1286(class10 arg0) {
        if (!field3436) {
            byte[] var1 = arg0.method104(-24, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1284(var1);
            field3436 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)F")
    public static final float method1287(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([B)V")
    private final void method1288(byte[] arg0) {
        class145 var2 = new class145(arg0);
        this.field3423 = var2.method1018(-1068451600);
        this.field3415 = var2.method1018(-1068451600);
        this.field3432 = var2.method1018(-1068451600);
        this.field3444 = var2.method1018(-1068451600);
        if (this.field3444 < 0) {
            this.field3444 = ~this.field3444;
            this.field3422 = true;
        }
        int var3 = var2.method1018(-1068451600);
        this.field3424 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method998(88);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1022(-15020, var5, 0, var7);
            this.field3424[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
    public static final int method1289() {
        int var0 = field3430[field3417] >> field3414 & 0x1;
        field3414++;
        field3417 += field3414 >> 3;
        field3414 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lai;II)Lrf;")
    public static final class192 method1290(class10 arg0, int arg1, int arg2) {
        if (method1286(arg0)) {
            byte[] var3 = arg0.method104(-95, arg1, arg2);
            return var3 == null ? null : new class192(var3);
        } else {
            arg0.method109(12769, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
    private class192(byte[] arg0) {
        this.method1288(arg0);
    }
}
