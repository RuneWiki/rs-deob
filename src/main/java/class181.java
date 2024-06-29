import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class181 extends class130 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Z")
    private static boolean field3435 = false;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    private int field3424;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    private static int field3426;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    private int field3427;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    private static int field3429;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    private static int field3434;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    private static int field3442;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    private int field3446;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
    private boolean field3417;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "Z")
    private boolean field3430;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[B")
    private static byte[] field3439;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[B")
    private byte[] field3444;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[F")
    private static float[] field3418;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[F")
    private static float[] field3419;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[F")
    private static float[] field3423;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[F")
    private static float[] field3425;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "[F")
    private static float[] field3431;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[F")
    private static float[] field3432;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "[F")
    private float[] field3437;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "[F")
    private static float[] field3438;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "[I")
    private static int[] field3415;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "[I")
    private static int[] field3420;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
    private static int[] field3436;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "[Lvh;")
    private static class197[] field3428;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[Lwc;")
    private static class201[] field3414;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[Lca;")
    public static class21[] field3441;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[Lfc;")
    private static class50[] field3416;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "[Z")
    private static boolean[] field3413;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "[[B")
    private byte[][] field3440;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lf;)Z")
    private static final boolean method1222(class47 arg0) {
        if (!field3435) {
            byte[] var1 = arg0.method353(0, 0, -125);
            if (var1 == null) {
                return false;
            }
            method1225(var1);
            field3435 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)V")
    private final void method1223(byte[] arg0) {
        class53 var2 = new class53(arg0);
        this.field3422 = var2.method419(-4);
        this.field3433 = var2.method419(-4);
        this.field3443 = var2.method419(-4);
        this.field3427 = var2.method419(-4);
        if (this.field3427 < 0) {
            this.field3427 = ~this.field3427;
            this.field3417 = true;
        }
        int var3 = var2.method419(-4);
        this.field3440 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method400(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method420(-1552680924, var7, 0, var5);
            this.field3440[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([I)Lbb;")
    public final class13 method1224(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3444 == null) {
            this.field3424 = 0;
            this.field3437 = new float[field3442];
            this.field3444 = new byte[this.field3433];
            this.field3446 = 0;
            this.field3445 = 0;
        }
        while (this.field3445 < this.field3440.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1229(this.field3445);
            if (var3 != null) {
                int var4 = this.field3446;
                int var5 = var3.length;
                if (var5 > this.field3433 - var4) {
                    var5 = this.field3433 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3444[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3446;
                }
                this.field3446 = var4;
            }
            this.field3445++;
        }
        this.field3437 = null;
        byte[] var2 = this.field3444;
        this.field3444 = null;
        return new class13(this.field3422, var2, this.field3443, this.field3427, this.field3417);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "([B)V")
    private static final void method1225(byte[] arg0) {
        method1232(arg0, 0);
        field3434 = 0x1 << method1226(4);
        field3442 = 0x1 << method1226(4);
        field3419 = new float[field3442];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3434 : field3442;
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
            int var25 = class98.method738(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class142.method975(var25, 100, var26);
            }
            if (var1 == 0) {
                field3432 = var18;
                field3423 = var20;
                field3418 = var22;
                field3436 = var24;
            } else {
                field3431 = var18;
                field3438 = var20;
                field3425 = var22;
                field3415 = var24;
            }
        }
        int var2 = method1226(8) + 1;
        field3441 = new class21[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3441[var3] = new class21();
        }
        int var4 = method1226(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1226(16);
        }
        int var6 = method1226(6) + 1;
        field3414 = new class201[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3414[var7] = new class201();
        }
        int var8 = method1226(6) + 1;
        field3428 = new class197[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3428[var9] = new class197();
        }
        int var10 = method1226(6) + 1;
        field3416 = new class50[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3416[var11] = new class50();
        }
        int var12 = method1226(6) + 1;
        field3413 = new boolean[var12];
        field3420 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3413[var13] = method1230() != 0;
            method1226(16);
            method1226(16);
            field3420[var13] = method1226(8);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)I")
    public static final int method1226(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3429) {
            int var4 = 8 - field3429;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3439[field3426] >> field3429 & var5) << var2;
            field3429 = 0;
            field3426++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3439[field3426] >> field3429 & var3) << var2;
            field3429 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)F")
    public static final float method1227(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lf;II)Lua;")
    public static final class181 method1228(class47 arg0, int arg1, int arg2) {
        if (method1222(arg0)) {
            byte[] var3 = arg0.method353(arg1, arg2, -68);
            return var3 == null ? null : new class181(var3);
        } else {
            arg0.method354(arg2, arg1, -63);
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)[F")
    private final float[] method1229(int arg0) {
        method1232(this.field3440[arg0], 0);
        method1230();
        int var2 = method1226(class98.method738(field3420.length - 1, false));
        boolean var3 = field3413[var2];
        int var4 = var3 ? field3442 : field3434;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1230() != 0;
            var6 = method1230() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3434 >> 2);
            var9 = (field3434 >> 2) + (var4 >> 2);
            var10 = field3434 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3434 >> 2);
            var12 = (field3434 >> 2) + (var4 - (var4 >> 2));
            var13 = field3434 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class50 var14 = field3416[field3420[var2]];
        int var15 = var14.field916;
        int var16 = var14.field917[var15];
        boolean var17 = !field3414[var16].method1325();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field914; var19++) {
            class197 var95 = field3428[var14.field915[var19]];
            float[] var96 = field3419;
            var95.method1305(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field916;
            int var21 = var14.field917[var20];
            field3414[var21].method1323(field3419, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3419[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3419;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3431 : field3432;
            float[] var30 = var3 ? field3438 : field3423;
            float[] var31 = var3 ? field3425 : field3418;
            int[] var32 = var3 ? field3415 : field3436;
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
            int var35 = class98.method738(var4 - 1, false);
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
                field3419[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3419[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3424 > 0) {
            int var49 = this.field3424 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3430) {
                for (int var50 = 0; var50 < this.field3421; var50++) {
                    int var51 = (this.field3424 >> 1) + var50;
                    var48[var50] += this.field3437[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3419[var52];
                }
            }
        }
        float[] var54 = this.field3437;
        this.field3437 = field3419;
        field3419 = var54;
        this.field3424 = var4;
        this.field3421 = var12 - (var4 >> 1);
        this.field3430 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
    public static final int method1230() {
        int var0 = field3439[field3426] >> field3429 & 0x1;
        field3429++;
        field3426 += field3429 >> 3;
        field3429 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public static void method1231() {
        field3439 = null;
        field3441 = null;
        field3414 = null;
        field3428 = null;
        field3416 = null;
        field3413 = null;
        field3420 = null;
        field3419 = null;
        field3432 = null;
        field3423 = null;
        field3418 = null;
        field3431 = null;
        field3438 = null;
        field3425 = null;
        field3436 = null;
        field3415 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([BI)V")
    private static final void method1232(byte[] arg0, int arg1) {
        field3439 = arg0;
        field3426 = arg1;
        field3429 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V")
    private class181(byte[] arg0) {
        this.method1223(arg0);
    }
}
