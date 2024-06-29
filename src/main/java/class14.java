import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class116 {

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
    private static boolean field278 = false;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    private static int field259;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    private static int field265;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    private static int field276;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    private static int field288;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "Z")
    private boolean field264;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Z")
    private boolean field283;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "[B")
    private static byte[] field284;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[B")
    private byte[] field290;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[F")
    private static float[] field266;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "[F")
    private static float[] field269;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "[F")
    private static float[] field271;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "[F")
    private static float[] field272;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "[F")
    private static float[] field277;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "[F")
    private float[] field281;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "[F")
    private static float[] field282;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[F")
    private static float[] field285;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
    private static int[] field261;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "[I")
    private static int[] field273;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
    private static int[] field275;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[Lua;")
    private static class140[] field280;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[Lfa;")
    private static class37[] field260;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[Ljd;")
    private static class66[] field287;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "[Lke;")
    public static class74[] field263;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[Z")
    private static boolean[] field258;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "[[B")
    private byte[][] field267;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public static final int method71(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field265) {
            int var4 = 8 - field265;
            int var5 = (0x1 << var4) - 1;
            var1 += (field284[field259] >> field265 & var5) << var2;
            field265 = 0;
            field259++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field284[field259] >> field265 & var3) << var2;
            field265 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public static final int method72() {
        int var0 = field284[field259] >> field265 & 0x1;
        field265++;
        field259 += field265 >> 3;
        field265 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
    public static void method73() {
        field284 = null;
        field263 = null;
        field260 = null;
        field287 = null;
        field280 = null;
        field258 = null;
        field273 = null;
        field269 = null;
        field277 = null;
        field272 = null;
        field271 = null;
        field266 = null;
        field282 = null;
        field285 = null;
        field275 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
    private static final void method74(byte[] arg0) {
        method80(arg0, 0);
        field288 = 0x1 << method71(4);
        field276 = 0x1 << method71(4);
        field269 = new float[field276];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field288 : field276;
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
            int var25 = class157.method1162(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class151.method1115((byte) -69, var25, var26);
            }
            if (var1 == 0) {
                field277 = var18;
                field272 = var20;
                field271 = var22;
                field275 = var24;
            } else {
                field266 = var18;
                field282 = var20;
                field285 = var22;
                field261 = var24;
            }
        }
        int var2 = method71(8) + 1;
        field263 = new class74[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field263[var3] = new class74();
        }
        int var4 = method71(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method71(16);
        }
        int var6 = method71(6) + 1;
        field260 = new class37[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field260[var7] = new class37();
        }
        int var8 = method71(6) + 1;
        field287 = new class66[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field287[var9] = new class66();
        }
        int var10 = method71(6) + 1;
        field280 = new class140[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field280[var11] = new class140();
        }
        int var12 = method71(6) + 1;
        field258 = new boolean[var12];
        field273 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field258[var13] = method72() != 0;
            method71(16);
            method71(16);
            field273[var13] = method71(8);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "([B)V")
    private final void method75(byte[] arg0) {
        class157 var2 = new class157(arg0);
        this.field286 = var2.method1175((byte) -110);
        this.field270 = var2.method1175((byte) -104);
        this.field262 = var2.method1175((byte) -90);
        this.field274 = var2.method1175((byte) -105);
        if (this.field274 < 0) {
            this.field274 = ~this.field274;
            this.field264 = true;
        }
        int var3 = var2.method1175((byte) -124);
        this.field267 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1194(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1168(var5, 0, var7, -1257469104);
            this.field267[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)[F")
    private final float[] method76(int arg0) {
        method80(this.field267[arg0], 0);
        method72();
        int var2 = method71(class157.method1162(field273.length - 1, false));
        boolean var3 = field258[var2];
        int var4 = var3 ? field276 : field288;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method72() != 0;
            var6 = method72() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field288 >> 2);
            var9 = (field288 >> 2) + (var4 >> 2);
            var10 = field288 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field288 >> 2);
            var12 = (field288 >> 2) + (var4 - (var4 >> 2));
            var13 = field288 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class140 var14 = field280[field273[var2]];
        int var15 = var14.field3114;
        int var16 = var14.field3112[var15];
        boolean var17 = !field260[var16].method289();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3111; var19++) {
            class66 var95 = field287[var14.field3113[var19]];
            float[] var96 = field269;
            var95.method534(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3114;
            int var21 = var14.field3112[var20];
            field260[var21].method283(field269, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field269[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field269;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field266 : field277;
            float[] var30 = var3 ? field282 : field272;
            float[] var31 = var3 ? field285 : field271;
            int[] var32 = var3 ? field261 : field275;
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
            int var35 = class157.method1162(var4 - 1, false);
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
                field269[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field269[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field279 > 0) {
            int var49 = this.field279 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field283) {
                for (int var50 = 0; var50 < this.field268; var50++) {
                    int var51 = (this.field279 >> 1) + var50;
                    var48[var50] += this.field281[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field269[var52];
                }
            }
        }
        float[] var54 = this.field281;
        this.field281 = field269;
        field269 = var54;
        this.field279 = var4;
        this.field268 = var12 - (var4 >> 1);
        this.field283 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([I)Lp;")
    public final class104 method77(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field290 == null) {
            this.field279 = 0;
            this.field281 = new float[field276];
            this.field290 = new byte[this.field270];
            this.field291 = 0;
            this.field289 = 0;
        }
        while (this.field289 < this.field267.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method76(this.field289);
            if (var3 != null) {
                int var4 = this.field291;
                int var5 = var3.length;
                if (var5 > this.field270 - var4) {
                    var5 = this.field270 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field290[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field291;
                }
                this.field291 = var4;
            }
            this.field289++;
        }
        this.field281 = null;
        byte[] var2 = this.field290;
        this.field290 = null;
        return new class104(this.field286, var2, this.field262, this.field274, this.field264);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ldd;)Z")
    private static final boolean method78(class26 arg0) {
        if (!field278) {
            byte[] var1 = arg0.method193(false, 0, 0);
            if (var1 == null) {
                return false;
            }
            method74(var1);
            field278 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ldd;II)Lbf;")
    public static final class14 method79(class26 arg0, int arg1, int arg2) {
        if (method78(arg0)) {
            byte[] var3 = arg0.method193(false, arg2, arg1);
            return var3 == null ? null : new class14(var3);
        } else {
            arg0.method182(arg1, arg2, 1);
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)V")
    private static final void method80(byte[] arg0, int arg1) {
        field284 = arg0;
        field259 = arg1;
        field265 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)F")
    public static final float method81(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
    private class14(byte[] arg0) {
        this.method75(arg0);
    }
}
