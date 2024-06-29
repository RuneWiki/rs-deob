import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class513 extends class28 {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
    private static boolean field6935 = false;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    private int field6909;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    private static int field6911;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    private int field6912;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    private int field6915;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field6932;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private static int field6933;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field6934;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field6937;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    private static int field6939;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    private static int field6940;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    private int field6941;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Z")
    private boolean field6925;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Z")
    private boolean field6928;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[B")
    private static byte[] field6908;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[B")
    private byte[] field6936;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[F")
    private static float[] field6916;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[F")
    private static float[] field6919;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[F")
    private static float[] field6920;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[F")
    private float[] field6922;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "[F")
    private static float[] field6926;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "[F")
    private static float[] field6929;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "[F")
    private static float[] field6931;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[F")
    private static float[] field6938;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[I")
    private static int[] field6910;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
    private static int[] field6917;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "[I")
    private static int[] field6927;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[Lip;")
    public static class178[] field6923;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[Lqq;")
    private static class17[] field6914;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "[Lsc;")
    private static class616[] field6930;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "[Ltj;")
    private static class670[] field6913;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[Z")
    private static boolean[] field6918;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[[B")
    private byte[][] field6924;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 10)
    public static void method2901() {
        field6908 = null;
        field6923 = null;
        field6914 = null;
        field6913 = null;
        field6930 = null;
        field6918 = null;
        field6917 = null;
        field6938 = null;
        field6931 = null;
        field6920 = null;
        field6919 = null;
        field6916 = null;
        field6929 = null;
        field6926 = null;
        field6927 = null;
        field6910 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpq;I)Lva;", line = 36)
    public static final class513 method2902(class159 arg0, int arg1) {
        if (method2911(arg0)) {
            byte[] var2 = arg0.method1082((byte) 33, arg1);
            return var2 == null ? null : new class513(var2);
        } else {
            arg0.method1086((byte) 120, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)I", line = 54)
    public static final int method2903(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6940) {
            int var4 = 8 - field6940;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6908[field6911] >> field6940 & var5) << var2;
            field6940 = 0;
            field6911++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6908[field6911] >> field6940 & var3) << var2;
            field6940 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B)V", line = 81)
    private static final void method2904(byte[] arg0) {
        method2912(arg0, 0);
        field6939 = 0x1 << method2903(4);
        field6933 = 0x1 << method2903(4);
        field6938 = new float[field6933];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6939 : field6933;
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
            int var25 = class335.method2138(var17 - 1, 36161);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class502.method2827(var26, var25, 31);
            }
            if (var1 == 0) {
                field6931 = var18;
                field6920 = var20;
                field6919 = var22;
                field6927 = var24;
            } else {
                field6916 = var18;
                field6929 = var20;
                field6926 = var22;
                field6910 = var24;
            }
        }
        int var2 = method2903(8) + 1;
        field6923 = new class178[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6923[var3] = new class178();
        }
        int var4 = method2903(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2903(16);
        }
        int var6 = method2903(6) + 1;
        field6914 = new class17[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6914[var7] = new class17();
        }
        int var8 = method2903(6) + 1;
        field6913 = new class670[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6913[var9] = new class670();
        }
        int var10 = method2903(6) + 1;
        field6930 = new class616[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6930[var11] = new class616();
        }
        int var12 = method2903(6) + 1;
        field6918 = new boolean[var12];
        field6917 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6918[var13] = method2908() != 0;
            method2903(16);
            method2903(16);
            field6917[var13] = method2903(8);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I)Lmda;", line = 233)
    public final class53 method2905(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6936 == null) {
            this.field6934 = 0;
            this.field6922 = new float[field6933];
            this.field6936 = new byte[this.field6921];
            this.field6937 = 0;
            this.field6941 = 0;
        }
        while (this.field6941 < this.field6924.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2909(this.field6941);
            if (var3 != null) {
                int var4 = this.field6937;
                int var5 = var3.length;
                if (var5 > this.field6921 - var4) {
                    var5 = this.field6921 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6936[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6937;
                }
                this.field6937 = var4;
            }
            this.field6941++;
        }
        this.field6922 = null;
        byte[] var2 = this.field6936;
        this.field6936 = null;
        return new class53(this.field6912, var2, this.field6932, this.field6909, this.field6925);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpq;II)Lva;", line = 294)
    public static final class513 method2906(class159 arg0, int arg1, int arg2) {
        if (method2911(arg0)) {
            byte[] var3 = arg0.method1087(arg1, arg2, 1);
            return var3 == null ? null : new class513(var3);
        } else {
            arg0.method1081((byte) 95, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B)V", line = 309)
    private final void method2907(byte[] arg0) {
        class138 var2 = new class138(arg0);
        this.field6912 = var2.method943(-80);
        this.field6921 = var2.method943(-114);
        this.field6932 = var2.method943(-103);
        this.field6909 = var2.method943(-78);
        if (this.field6909 < 0) {
            this.field6909 = ~this.field6909;
            this.field6925 = true;
        }
        int var3 = var2.method943(-108);
        this.field6924 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method957((byte) -91);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method934(8, 0, var5, var7);
            this.field6924[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I", line = 356)
    public static final int method2908() {
        int var0 = field6908[field6911] >> field6940 & 0x1;
        field6940++;
        field6911 += field6940 >> 3;
        field6940 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)[F", line = 363)
    private final float[] method2909(int arg0) {
        method2912(this.field6924[arg0], 0);
        method2908();
        int var2 = method2903(class335.method2138(field6917.length - 1, 36161));
        boolean var3 = field6918[var2];
        int var4 = var3 ? field6933 : field6939;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2908() != 0;
            var6 = method2908() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6939 >> 2);
            var9 = (field6939 >> 2) + (var4 >> 2);
            var10 = field6939 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6939 >> 2);
            var12 = (field6939 >> 2) + (var4 - (var4 >> 2));
            var13 = field6939 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class616 var14 = field6930[field6917[var2]];
        int var15 = var14.field8400;
        int var16 = var14.field8401[var15];
        boolean var17 = !field6914[var16].method91();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field8398; var19++) {
            class670 var95 = field6913[var14.field8399[var19]];
            float[] var96 = field6938;
            var95.method3715(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field8400;
            int var21 = var14.field8401[var20];
            field6914[var21].method89(field6938, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6938[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6938;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6916 : field6931;
            float[] var30 = var3 ? field6929 : field6920;
            float[] var31 = var3 ? field6926 : field6919;
            int[] var32 = var3 ? field6910 : field6927;
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
            int var35 = class335.method2138(var4 - 1, 36161);
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
                field6938[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6938[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6934 > 0) {
            int var49 = this.field6934 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6928) {
                for (int var50 = 0; var50 < this.field6915; var50++) {
                    int var51 = (this.field6934 >> 1) + var50;
                    var48[var50] += this.field6922[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6938[var52];
                }
            }
        }
        float[] var54 = this.field6922;
        this.field6922 = field6938;
        field6938 = var54;
        this.field6934 = var4;
        this.field6915 = var12 - (var4 >> 1);
        this.field6928 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)F", line = 776)
    public static final float method2910(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpq;)Z", line = 789)
    private static final boolean method2911(class159 arg0) {
        if (!field6935) {
            byte[] var1 = arg0.method1087(0, 0, 1);
            if (var1 == null) {
                return false;
            }
            method2904(var1);
            field6935 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V", line = 803)
    private class513(byte[] arg0) {
        this.method2907(arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)V", line = 818)
    private static final void method2912(byte[] arg0, int arg1) {
        field6908 = arg0;
        field6911 = arg1;
        field6940 = 0;
    }
}
