import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class494 extends class5 {

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "Z")
    private static boolean field7289 = false;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    private int field7276;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    private static int field7279;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    private int field7280;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    private static int field7284;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "I")
    private static int field7291;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    private int field7292;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    private int field7293;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    private int field7295;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    private static int field7302;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    private int field7305;

    @OriginalMember(owner = "client!jm", name = "Q", descriptor = "I")
    private int field7306;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Z")
    private boolean field7275;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Z")
    private boolean field7277;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "[B")
    private byte[] field7297;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "[B")
    private static byte[] field7300;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[F")
    private float[] field7274;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "[F")
    private static float[] field7281;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "[F")
    private static float[] field7283;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "[F")
    private static float[] field7285;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "[F")
    private static float[] field7286;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "[F")
    private static float[] field7298;

    @OriginalMember(owner = "client!jm", name = "L", descriptor = "[F")
    private static float[] field7301;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "[F")
    private static float[] field7303;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    private static int[] field7278;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
    private static int[] field7290;

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "[I")
    private static int[] field7296;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "[Lvv;")
    private static class217[] field7294;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "[Lku;")
    private static class260[] field7282;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "[Lfi;")
    private static class396[] field7287;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "[Lpe;")
    public static class440[] field7299;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "[Z")
    private static boolean[] field7304;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[[B")
    private byte[][] field7273;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V")
    public static void method2940() {
        field7300 = null;
        field7299 = null;
        field7282 = null;
        field7294 = null;
        field7287 = null;
        field7304 = null;
        field7296 = null;
        field7303 = null;
        field7286 = null;
        field7283 = null;
        field7301 = null;
        field7281 = null;
        field7285 = null;
        field7298 = null;
        field7290 = null;
        field7278 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)F")
    public static final float method2941(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)[F")
    private final float[] method2942(int arg0) {
        method2949(this.field7273[arg0], 0);
        method2950();
        int var2 = method2948(class542.method3194(-128, field7296.length - 1));
        boolean var3 = field7304[var2];
        int var4 = var3 ? field7302 : field7279;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2950() != 0;
            var6 = method2950() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7279 >> 2);
            var9 = (field7279 >> 2) + (var4 >> 2);
            var10 = field7279 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7279 >> 2);
            var12 = (field7279 >> 2) + (var4 - (var4 >> 2));
            var13 = field7279 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class396 var14 = field7287[field7296[var2]];
        int var15 = var14.field6052;
        int var16 = var14.field6053[var15];
        boolean var17 = !field7282[var16].method1682();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6054; var19++) {
            class217 var95 = field7294[var14.field6051[var19]];
            float[] var96 = field7303;
            var95.method1480(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6052;
            int var21 = var14.field6053[var20];
            field7282[var21].method1686(field7303, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7303[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7303;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7281 : field7286;
            float[] var30 = var3 ? field7285 : field7283;
            float[] var31 = var3 ? field7298 : field7301;
            int[] var32 = var3 ? field7278 : field7290;
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
            int var35 = class542.method3194(-77, var4 - 1);
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
                field7303[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7303[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7293 > 0) {
            int var49 = this.field7293 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7275) {
                for (int var50 = 0; var50 < this.field7276; var50++) {
                    int var51 = (this.field7293 >> 1) + var50;
                    var48[var50] += this.field7274[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7303[var52];
                }
            }
        }
        float[] var54 = this.field7274;
        this.field7274 = field7303;
        field7303 = var54;
        this.field7293 = var4;
        this.field7276 = var12 - (var4 >> 1);
        this.field7275 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Luu;)Z")
    private static final boolean method2943(class191 arg0) {
        if (!field7289) {
            byte[] var1 = arg0.method1281(0, 0, 97);
            if (var1 == null) {
                return false;
            }
            method2944(var1);
            field7289 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([B)V")
    private static final void method2944(byte[] arg0) {
        method2949(arg0, 0);
        field7279 = 0x1 << method2948(4);
        field7302 = 0x1 << method2948(4);
        field7303 = new float[field7302];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7279 : field7302;
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
            int var25 = class542.method3194(126, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class448.method2739((byte) 35, var26, var25);
            }
            if (var1 == 0) {
                field7286 = var18;
                field7283 = var20;
                field7301 = var22;
                field7290 = var24;
            } else {
                field7281 = var18;
                field7285 = var20;
                field7298 = var22;
                field7278 = var24;
            }
        }
        int var2 = method2948(8) + 1;
        field7299 = new class440[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7299[var3] = new class440();
        }
        int var4 = method2948(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2948(16);
        }
        int var6 = method2948(6) + 1;
        field7282 = new class260[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7282[var7] = new class260();
        }
        int var8 = method2948(6) + 1;
        field7294 = new class217[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7294[var9] = new class217();
        }
        int var10 = method2948(6) + 1;
        field7287 = new class396[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7287[var11] = new class396();
        }
        int var12 = method2948(6) + 1;
        field7304 = new boolean[var12];
        field7296 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7304[var13] = method2950() != 0;
            method2948(16);
            method2948(16);
            field7296[var13] = method2948(8);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "([B)V")
    private final void method2945(byte[] arg0) {
        class164 var2 = new class164(arg0);
        this.field7280 = var2.method1099(-110);
        this.field7295 = var2.method1099(-106);
        this.field7292 = var2.method1099(119);
        this.field7288 = var2.method1099(-107);
        if (this.field7288 < 0) {
            this.field7288 = ~this.field7288;
            this.field7277 = true;
        }
        int var3 = var2.method1099(120);
        this.field7273 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1087(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1109(var7, (byte) 23, 0, var5);
            this.field7273[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Luu;II)Ljm;")
    public static final class494 method2946(class191 arg0, int arg1, int arg2) {
        if (method2943(arg0)) {
            byte[] var3 = arg0.method1281(arg1, arg2, 105);
            return var3 == null ? null : new class494(var3);
        } else {
            arg0.method1271(arg2, arg1, -15606);
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([I)Ljp;")
    public final class242 method2947(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7297 == null) {
            this.field7293 = 0;
            this.field7274 = new float[field7302];
            this.field7297 = new byte[this.field7295];
            this.field7305 = 0;
            this.field7306 = 0;
        }
        while (this.field7306 < this.field7273.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2942(this.field7306);
            if (var3 != null) {
                int var4 = this.field7305;
                int var5 = var3.length;
                if (var5 > this.field7295 - var4) {
                    var5 = this.field7295 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7297[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7305;
                }
                this.field7305 = var4;
            }
            this.field7306++;
        }
        this.field7274 = null;
        byte[] var2 = this.field7297;
        this.field7297 = null;
        return new class242(this.field7280, var2, this.field7292, this.field7288, this.field7277);
    }

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "(I)I")
    public static final int method2948(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7284) {
            int var4 = 8 - field7284;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7300[field7291] >> field7284 & var5) << var2;
            field7284 = 0;
            field7291++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7300[field7291] >> field7284 & var3) << var2;
            field7284 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)V")
    private static final void method2949(byte[] arg0, int arg1) {
        field7300 = arg0;
        field7291 = arg1;
        field7284 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([B)V")
    private class494(byte[] arg0) {
        this.method2945(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()I")
    public static final int method2950() {
        int var0 = field7300[field7291] >> field7284 & 0x1;
        field7284++;
        field7291 += field7284 >> 3;
        field7284 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Luu;I)Ljm;")
    public static final class494 method2951(class191 arg0, int arg1) {
        if (method2943(arg0)) {
            byte[] var2 = arg0.method1289(arg1, 122);
            return var2 == null ? null : new class494(var2);
        } else {
            arg0.method1288(arg1, 18555);
            return null;
        }
    }
}
