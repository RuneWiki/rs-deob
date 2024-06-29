import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class74 extends class35 {

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Z")
    private static boolean field1018 = false;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    private static int field1001;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    private static int field1009;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    private static int field1014;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    private static int field992;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Z")
    private boolean field990;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
    private boolean field996;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "[B")
    private byte[] field1019;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "[B")
    private static byte[] field993;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "[F")
    private static float[] field1003;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[F")
    private static float[] field1006;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "[F")
    private float[] field1007;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[F")
    private static float[] field1012;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "[F")
    private static float[] field1021;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[F")
    private static float[] field1023;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "[F")
    private static float[] field994;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[F")
    private static float[] field998;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
    private static int[] field1016;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
    private static int[] field995;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "[Lut;")
    public static class139[] field1020;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[Loi;")
    private static class159[] field1002;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "[Lwd;")
    private static class243[] field1000;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "[Lgt;")
    private static class61[] field1013;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "[Z")
    private static boolean[] field1022;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "[[B")
    private byte[][] field991;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public static void method633() {
        field993 = null;
        field1020 = null;
        field1013 = null;
        field1002 = null;
        field1000 = null;
        field1022 = null;
        field1016 = null;
        field998 = null;
        field1021 = null;
        field994 = null;
        field1012 = null;
        field1003 = null;
        field1023 = null;
        field1006 = null;
        field995 = null;
        field999 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lui;II)Lm;")
    public static final class74 method634(class451 arg0, int arg1, int arg2) {
        if (method639(arg0)) {
            byte[] var3 = arg0.method2691(arg2, arg1, 0);
            return var3 == null ? null : new class74(var3);
        } else {
            arg0.method2680(arg2, arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)I")
    public static final int method635(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1009) {
            int var4 = 8 - field1009;
            int var5 = (0x1 << var4) - 1;
            var1 += (field993[field1014] >> field1009 & var5) << var2;
            field1009 = 0;
            field1014++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field993[field1014] >> field1009 & var3) << var2;
            field1009 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BI)V")
    private static final void method636(byte[] arg0, int arg1) {
        field993 = arg0;
        field1014 = arg1;
        field1009 = 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([B)V")
    private final void method637(byte[] arg0) {
        class446 var2 = new class446(arg0);
        this.field997 = var2.method2604(68);
        this.field1011 = var2.method2604(57);
        this.field1010 = var2.method2604(-112);
        this.field1008 = var2.method2604(44);
        if (this.field1008 < 0) {
            this.field1008 = ~this.field1008;
            this.field990 = true;
        }
        int var3 = var2.method2604(-128);
        this.field991 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2628(49152);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2589(var5, 0, 97, var7);
            this.field991[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)F")
    public static final float method638(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lui;)Z")
    private static final boolean method639(class451 arg0) {
        if (!field1018) {
            byte[] var1 = arg0.method2691(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method643(var1);
            field1018 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)[F")
    private final float[] method640(int arg0) {
        method636(this.field991[arg0], 0);
        method642();
        int var2 = method635(class331.method2031(126, field1016.length - 1));
        boolean var3 = field1022[var2];
        int var4 = var3 ? field992 : field1001;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method642() != 0;
            var6 = method642() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1001 >> 2);
            var9 = (field1001 >> 2) + (var4 >> 2);
            var10 = field1001 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1001 >> 2);
            var12 = (field1001 >> 2) + (var4 - (var4 >> 2));
            var13 = field1001 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class243 var14 = field1000[field1016[var2]];
        int var15 = var14.field3492;
        int var16 = var14.field3493[var15];
        boolean var17 = !field1013[var16].method470();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3491; var19++) {
            class159 var95 = field1002[var14.field3494[var19]];
            float[] var96 = field998;
            var95.method1083(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3492;
            int var21 = var14.field3493[var20];
            field1013[var21].method476(field998, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field998[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field998;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1003 : field1021;
            float[] var30 = var3 ? field1023 : field994;
            float[] var31 = var3 ? field1006 : field1012;
            int[] var32 = var3 ? field999 : field995;
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
            int var35 = class331.method2031(121, var4 - 1);
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
                field998[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field998[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1005 > 0) {
            int var49 = this.field1005 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field996) {
                for (int var50 = 0; var50 < this.field1004; var50++) {
                    int var51 = (this.field1005 >> 1) + var50;
                    var48[var50] += this.field1007[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field998[var52];
                }
            }
        }
        float[] var54 = this.field1007;
        this.field1007 = field998;
        field998 = var54;
        this.field1005 = var4;
        this.field1004 = var12 - (var4 >> 1);
        this.field996 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([I)Luk;")
    public final class328 method641(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1019 == null) {
            this.field1005 = 0;
            this.field1007 = new float[field992];
            this.field1019 = new byte[this.field1011];
            this.field1015 = 0;
            this.field1017 = 0;
        }
        while (this.field1017 < this.field991.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method640(this.field1017);
            if (var3 != null) {
                int var4 = this.field1015;
                int var5 = var3.length;
                if (var5 > this.field1011 - var4) {
                    var5 = this.field1011 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1019[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1015;
                }
                this.field1015 = var4;
            }
            this.field1017++;
        }
        this.field1007 = null;
        byte[] var2 = this.field1019;
        this.field1019 = null;
        return new class328(this.field997, var2, this.field1010, this.field1008, this.field990);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "([B)V")
    private class74(byte[] arg0) {
        this.method637(arg0);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
    public static final int method642() {
        int var0 = field993[field1014] >> field1009 & 0x1;
        field1009++;
        field1014 += field1009 >> 3;
        field1009 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "([B)V")
    private static final void method643(byte[] arg0) {
        method636(arg0, 0);
        field1001 = 0x1 << method635(4);
        field992 = 0x1 << method635(4);
        field998 = new float[field992];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1001 : field992;
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
            int var25 = class331.method2031(123, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class137.method959(-61, var26, var25);
            }
            if (var1 == 0) {
                field1021 = var18;
                field994 = var20;
                field1012 = var22;
                field995 = var24;
            } else {
                field1003 = var18;
                field1023 = var20;
                field1006 = var22;
                field999 = var24;
            }
        }
        int var2 = method635(8) + 1;
        field1020 = new class139[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1020[var3] = new class139();
        }
        int var4 = method635(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method635(16);
        }
        int var6 = method635(6) + 1;
        field1013 = new class61[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1013[var7] = new class61();
        }
        int var8 = method635(6) + 1;
        field1002 = new class159[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1002[var9] = new class159();
        }
        int var10 = method635(6) + 1;
        field1000 = new class243[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1000[var11] = new class243();
        }
        int var12 = method635(6) + 1;
        field1022 = new boolean[var12];
        field1016 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1022[var13] = method642() != 0;
            method635(16);
            method635(16);
            field1016[var13] = method635(8);
        }
    }
}
