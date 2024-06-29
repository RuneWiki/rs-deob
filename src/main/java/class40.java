import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class40 extends class529 {

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
    private static boolean field403 = false;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    private static int field404;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    private static int field410;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    private static int field419;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private static int field425;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
    private boolean field398;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Z")
    private boolean field408;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "[B")
    private static byte[] field415;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "[B")
    private byte[] field429;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[F")
    private static float[] field399;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[F")
    private static float[] field401;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[F")
    private static float[] field402;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "[F")
    private float[] field409;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[F")
    private static float[] field417;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[F")
    private static float[] field424;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "[F")
    private static float[] field427;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[F")
    private static float[] field428;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
    private static int[] field400;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
    private static int[] field411;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "[I")
    private static int[] field420;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[Lan;")
    public static class127[] field405;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "[Lew;")
    private static class173[] field407;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "[Lbu;")
    private static class412[] field413;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "[Lwl;")
    private static class99[] field416;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "[Z")
    private static boolean[] field423;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[[B")
    private byte[][] field421;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([I)Llf;")
    public final class391 method234(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field429 == null) {
            this.field414 = 0;
            this.field409 = new float[field410];
            this.field429 = new byte[this.field422];
            this.field431 = 0;
            this.field430 = 0;
        }
        while (this.field430 < this.field421.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method240(this.field430);
            if (var3 != null) {
                int var4 = this.field431;
                int var5 = var3.length;
                if (var5 > this.field422 - var4) {
                    var5 = this.field422 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field429[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field431;
                }
                this.field431 = var4;
            }
            this.field430++;
        }
        this.field409 = null;
        byte[] var2 = this.field429;
        this.field429 = null;
        return new class391(this.field406, var2, this.field426, this.field412, this.field408);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lmn;II)Lu;")
    public static final class40 method235(class162 arg0, int arg1, int arg2) {
        if (method239(arg0)) {
            byte[] var3 = arg0.method1004(arg1, false, arg2);
            return var3 == null ? null : new class40(var3);
        } else {
            arg0.method993(arg1, 1939, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([B)V")
    private static final void method236(byte[] arg0) {
        method245(arg0, 0);
        field425 = 0x1 << method244(4);
        field410 = 0x1 << method244(4);
        field401 = new float[field410];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field425 : field410;
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
            int var25 = class241.method1678(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class491.method3012(424462657, var25, var26);
            }
            if (var1 == 0) {
                field399 = var18;
                field428 = var20;
                field402 = var22;
                field400 = var24;
            } else {
                field427 = var18;
                field424 = var20;
                field417 = var22;
                field411 = var24;
            }
        }
        int var2 = method244(8) + 1;
        field405 = new class127[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field405[var3] = new class127();
        }
        int var4 = method244(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method244(16);
        }
        int var6 = method244(6) + 1;
        field416 = new class99[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field416[var7] = new class99();
        }
        int var8 = method244(6) + 1;
        field413 = new class412[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field413[var9] = new class412();
        }
        int var10 = method244(6) + 1;
        field407 = new class173[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field407[var11] = new class173();
        }
        int var12 = method244(6) + 1;
        field423 = new boolean[var12];
        field420 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field423[var13] = method242() != 0;
            method244(16);
            method244(16);
            field420[var13] = method244(8);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "([B)V")
    private final void method237(byte[] arg0) {
        class208 var2 = new class208(arg0);
        this.field406 = var2.method1436((byte) 116);
        this.field422 = var2.method1436((byte) 124);
        this.field426 = var2.method1436((byte) 92);
        this.field412 = var2.method1436((byte) 111);
        if (this.field412 < 0) {
            this.field412 = ~this.field412;
            this.field408 = true;
        }
        int var3 = var2.method1436((byte) 111);
        this.field421 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1445(-98);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1471(var5, true, var7, 0);
            this.field421[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lmn;I)Lu;")
    public static final class40 method238(class162 arg0, int arg1) {
        if (method239(arg0)) {
            byte[] var2 = arg0.method1010(arg1, (byte) 112);
            return var2 == null ? null : new class40(var2);
        } else {
            arg0.method1012(arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lmn;)Z")
    private static final boolean method239(class162 arg0) {
        if (!field403) {
            byte[] var1 = arg0.method1004(0, false, 0);
            if (var1 == null) {
                return false;
            }
            method236(var1);
            field403 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)[F")
    private final float[] method240(int arg0) {
        method245(this.field421[arg0], 0);
        method242();
        int var2 = method244(class241.method1678(field420.length - 1, false));
        boolean var3 = field423[var2];
        int var4 = var3 ? field410 : field425;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method242() != 0;
            var6 = method242() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field425 >> 2);
            var9 = (field425 >> 2) + (var4 >> 2);
            var10 = field425 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field425 >> 2);
            var12 = (field425 >> 2) + (var4 - (var4 >> 2));
            var13 = field425 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class173 var14 = field407[field420[var2]];
        int var15 = var14.field2528;
        int var16 = var14.field2529[var15];
        boolean var17 = !field416[var16].method666();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2530; var19++) {
            class412 var95 = field413[var14.field2527[var19]];
            float[] var96 = field401;
            var95.method2632(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2528;
            int var21 = var14.field2529[var20];
            field416[var21].method667(field401, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field401[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field401;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field427 : field399;
            float[] var30 = var3 ? field424 : field428;
            float[] var31 = var3 ? field417 : field402;
            int[] var32 = var3 ? field411 : field400;
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
            int var35 = class241.method1678(var4 - 1, false);
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
                field401[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field401[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field414 > 0) {
            int var49 = this.field414 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field398) {
                for (int var50 = 0; var50 < this.field418; var50++) {
                    int var51 = (this.field414 >> 1) + var50;
                    var48[var50] += this.field409[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field401[var52];
                }
            }
        }
        float[] var54 = this.field409;
        this.field409 = field401;
        field401 = var54;
        this.field414 = var4;
        this.field418 = var12 - (var4 >> 1);
        this.field398 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static void method241() {
        field415 = null;
        field405 = null;
        field416 = null;
        field413 = null;
        field407 = null;
        field423 = null;
        field420 = null;
        field401 = null;
        field399 = null;
        field428 = null;
        field402 = null;
        field427 = null;
        field424 = null;
        field417 = null;
        field400 = null;
        field411 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public static final int method242() {
        int var0 = field415[field419] >> field404 & 0x1;
        field404++;
        field419 += field404 >> 3;
        field404 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)F")
    public static final float method243(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
    public static final int method244(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field404) {
            int var4 = 8 - field404;
            int var5 = (0x1 << var4) - 1;
            var1 += (field415[field419] >> field404 & var5) << var2;
            field404 = 0;
            field419++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field415[field419] >> field404 & var3) << var2;
            field404 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)V")
    private static final void method245(byte[] arg0, int arg1) {
        field415 = arg0;
        field419 = arg1;
        field404 = 0;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
    private class40(byte[] arg0) {
        this.method237(arg0);
    }
}
