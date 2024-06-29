import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class654 extends class324 {

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Z")
    private static boolean field9399 = false;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    private int field9398;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    private int field9403;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    private int field9405;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    private static int field9413;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    private int field9414;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    private static int field9419;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "I")
    private int field9422;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
    private static int field9423;

    @OriginalMember(owner = "client!rw", name = "L", descriptor = "I")
    private static int field9426;

    @OriginalMember(owner = "client!rw", name = "Q", descriptor = "I")
    private int field9430;

    @OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
    private int field9431;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "Z")
    private boolean field9402;

    @OriginalMember(owner = "client!rw", name = "N", descriptor = "Z")
    private boolean field9427;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "[B")
    private static byte[] field9404;

    @OriginalMember(owner = "client!rw", name = "O", descriptor = "[B")
    private byte[] field9428;

    @OriginalMember(owner = "client!rw", name = "m", descriptor = "[F")
    private static float[] field9401;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "[F")
    private static float[] field9407;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "[F")
    private static float[] field9415;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "[F")
    private static float[] field9416;

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "[F")
    private float[] field9417;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "[F")
    private static float[] field9418;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "[F")
    private static float[] field9421;

    @OriginalMember(owner = "client!rw", name = "P", descriptor = "[F")
    private static float[] field9429;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
    private static int[] field9408;

    @OriginalMember(owner = "client!rw", name = "J", descriptor = "[I")
    private static int[] field9424;

    @OriginalMember(owner = "client!rw", name = "K", descriptor = "[I")
    private static int[] field9425;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[Lkt;")
    public static class138[] field9412;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "[Lsr;")
    private static class214[] field9410;

    @OriginalMember(owner = "client!rw", name = "l", descriptor = "[Lur;")
    private static class466[] field9400;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[Luo;")
    private static class500[] field9411;

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "[Z")
    private static boolean[] field9409;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "[[B")
    private byte[][] field9420;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkea;)Z", line = 8)
    private static final boolean method3724(class203 arg0) {
        if (!field9399) {
            byte[] var1 = arg0.method1286(0, 0, (byte) -49);
            if (var1 == null) {
                return false;
            }
            method3732(var1);
            field9399 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkea;I)Lrw;", line = 25)
    public static final class654 method3725(class203 arg0, int arg1) {
        if (method3724(arg0)) {
            byte[] var2 = arg0.method1308((byte) -128, arg1);
            return var2 == null ? null : new class654(var2);
        } else {
            arg0.method1311(arg1, (byte) -93);
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "()I", line = 41)
    public static final int method3726() {
        int var0 = field9404[field9426] >> field9413 & 0x1;
        field9413++;
        field9426 += field9413 >> 3;
        field9413 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F", line = 50)
    public static final float method3727(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)[F", line = 62)
    private final float[] method3728(int arg0) {
        method3735(this.field9420[arg0], 0);
        method3726();
        int var2 = method3729(class112.method688((byte) -121, field9424.length - 1));
        boolean var3 = field9409[var2];
        int var4 = var3 ? field9419 : field9423;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3726() != 0;
            var6 = method3726() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field9423 >> 2);
            var9 = (field9423 >> 2) + (var4 >> 2);
            var10 = field9423 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field9423 >> 2);
            var12 = (field9423 >> 2) + (var4 - (var4 >> 2));
            var13 = field9423 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class500 var14 = field9411[field9424[var2]];
        int var15 = var14.field7286;
        int var16 = var14.field7287[var15];
        boolean var17 = !field9410[var16].method1412();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7284; var19++) {
            class466 var95 = field9400[var14.field7285[var19]];
            float[] var96 = field9407;
            var95.method2850(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7286;
            int var21 = var14.field7287[var20];
            field9410[var21].method1408(field9407, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field9407[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field9407;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field9429 : field9416;
            float[] var30 = var3 ? field9415 : field9418;
            float[] var31 = var3 ? field9421 : field9401;
            int[] var32 = var3 ? field9408 : field9425;
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
            int var35 = class112.method688((byte) -121, var4 - 1);
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
                field9407[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field9407[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field9406 > 0) {
            int var49 = this.field9406 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field9402) {
                for (int var50 = 0; var50 < this.field9403; var50++) {
                    int var51 = (this.field9406 >> 1) + var50;
                    var48[var50] += this.field9417[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field9407[var52];
                }
            }
        }
        float[] var54 = this.field9417;
        this.field9417 = field9407;
        field9407 = var54;
        this.field9406 = var4;
        this.field9403 = var12 - (var4 >> 1);
        this.field9402 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)I", line = 486)
    public static final int method3729(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field9413) {
            int var4 = 8 - field9413;
            int var5 = (0x1 << var4) - 1;
            var1 += (field9404[field9426] >> field9413 & var5) << var2;
            field9413 = 0;
            field9426++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field9404[field9426] >> field9413 & var3) << var2;
            field9413 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "()V", line = 516)
    public static void method3730() {
        field9404 = null;
        field9412 = null;
        field9410 = null;
        field9400 = null;
        field9411 = null;
        field9409 = null;
        field9424 = null;
        field9407 = null;
        field9416 = null;
        field9418 = null;
        field9401 = null;
        field9429 = null;
        field9415 = null;
        field9421 = null;
        field9425 = null;
        field9408 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([B)V", line = 538)
    private final void method3731(byte[] arg0) {
        class194 var2 = new class194(arg0);
        this.field9398 = var2.method1178(-230315992);
        this.field9422 = var2.method1178(-230315992);
        this.field9414 = var2.method1178(-230315992);
        this.field9405 = var2.method1178(-230315992);
        if (this.field9405 < 0) {
            this.field9405 = ~this.field9405;
            this.field9427 = true;
        }
        int var3 = var2.method1178(-230315992);
        this.field9420 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1177(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1200(var7, (byte) -104, 0, var5);
            this.field9420[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "([B)V", line = 582)
    private static final void method3732(byte[] arg0) {
        method3735(arg0, 0);
        field9423 = 0x1 << method3729(4);
        field9419 = 0x1 << method3729(4);
        field9407 = new float[field9419];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field9423 : field9419;
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
            int var25 = class112.method688((byte) -122, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class52.method288(var26, 76, var25);
            }
            if (var1 == 0) {
                field9416 = var18;
                field9418 = var20;
                field9401 = var22;
                field9425 = var24;
            } else {
                field9429 = var18;
                field9415 = var20;
                field9421 = var22;
                field9408 = var24;
            }
        }
        int var2 = method3729(8) + 1;
        field9412 = new class138[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field9412[var3] = new class138();
        }
        int var4 = method3729(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3729(16);
        }
        int var6 = method3729(6) + 1;
        field9410 = new class214[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field9410[var7] = new class214();
        }
        int var8 = method3729(6) + 1;
        field9400 = new class466[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field9400[var9] = new class466();
        }
        int var10 = method3729(6) + 1;
        field9411 = new class500[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field9411[var11] = new class500();
        }
        int var12 = method3729(6) + 1;
        field9409 = new boolean[var12];
        field9424 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field9409[var13] = method3726() != 0;
            method3729(16);
            method3729(16);
            field9424[var13] = method3729(8);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([I)Lte;", line = 734)
    public final class534 method3733(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field9428 == null) {
            this.field9406 = 0;
            this.field9417 = new float[field9419];
            this.field9428 = new byte[this.field9422];
            this.field9430 = 0;
            this.field9431 = 0;
        }
        while (this.field9431 < this.field9420.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3728(this.field9431);
            if (var3 != null) {
                int var4 = this.field9430;
                int var5 = var3.length;
                if (var5 > this.field9422 - var4) {
                    var5 = this.field9422 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field9428[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field9430;
                }
                this.field9430 = var4;
            }
            this.field9431++;
        }
        this.field9417 = null;
        byte[] var2 = this.field9428;
        this.field9428 = null;
        return new class534(this.field9398, var2, this.field9414, this.field9405, this.field9427);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lkea;II)Lrw;", line = 793)
    public static final class654 method3734(class203 arg0, int arg1, int arg2) {
        if (method3724(arg0)) {
            byte[] var3 = arg0.method1286(arg2, arg1, (byte) -49);
            return var3 == null ? null : new class654(var3);
        } else {
            arg0.method1284(arg1, (byte) 52, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([BI)V", line = 810)
    private static final void method3735(byte[] arg0, int arg1) {
        field9404 = arg0;
        field9426 = arg1;
        field9413 = 0;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "([B)V", line = 815)
    private class654(byte[] arg0) {
        this.method3731(arg0);
    }
}
