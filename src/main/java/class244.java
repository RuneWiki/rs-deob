import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class244 extends class60 {

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Z")
    private static boolean field4263 = false;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    private static int field4238;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private static int field4255;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field4259;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    private static int field4260;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private static int field4261;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    private int field4269;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    private int field4270;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Z")
    private boolean field4237;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Z")
    private boolean field4264;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "[B")
    private static byte[] field4240;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "[B")
    private byte[] field4268;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[F")
    private static float[] field4241;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "[F")
    private static float[] field4243;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "[F")
    private float[] field4244;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "[F")
    private static float[] field4248;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[F")
    private static float[] field4253;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "[F")
    private static float[] field4256;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "[F")
    private static float[] field4257;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "[F")
    private static float[] field4258;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "[I")
    private static int[] field4249;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "[I")
    private static int[] field4250;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "[I")
    private static int[] field4267;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "[Lca;")
    private static class110[] field4242;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[Laj;")
    private static class158[] field4246;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[Lsc;")
    public static class259[] field4245;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[Lp;")
    private static class84[] field4247;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "[Z")
    private static boolean[] field4262;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "[[B")
    private byte[][] field4254;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([B)V")
    private final void method1622(byte[] arg0) {
        class226 var2 = new class226(arg0);
        this.field4251 = var2.method1478(-32053);
        this.field4266 = var2.method1478(-32053);
        this.field4265 = var2.method1478(-32053);
        this.field4252 = var2.method1478(-32053);
        if (this.field4252 < 0) {
            this.field4252 = ~this.field4252;
            this.field4237 = true;
        }
        int var3 = var2.method1478(-32053);
        this.field4254 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1471(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1435(var7, var5, (byte) -13, 0);
            this.field4254[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)[F")
    private final float[] method1623(int arg0) {
        method1630(this.field4254[arg0], 0);
        method1632();
        int var2 = method1629(class16.method79(3439, field4267.length - 1));
        boolean var3 = field4262[var2];
        int var4 = var3 ? field4238 : field4255;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1632() != 0;
            var6 = method1632() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4255 >> 2);
            var9 = (field4255 >> 2) + (var4 >> 2);
            var10 = field4255 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4255 >> 2);
            var12 = (field4255 >> 2) + (var4 - (var4 >> 2));
            var13 = field4255 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class158 var14 = field4246[field4267[var2]];
        int var15 = var14.field2689;
        int var16 = var14.field2688[var15];
        boolean var17 = !field4242[var16].method681();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2687; var19++) {
            class84 var95 = field4247[var14.field2690[var19]];
            float[] var96 = field4256;
            var95.method509(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2689;
            int var21 = var14.field2688[var20];
            field4242[var21].method684(field4256, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4256[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4256;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4241 : field4258;
            float[] var30 = var3 ? field4243 : field4257;
            float[] var31 = var3 ? field4253 : field4248;
            int[] var32 = var3 ? field4249 : field4250;
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
            int var35 = class16.method79(3439, var4 - 1);
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
                field4256[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4256[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4259 > 0) {
            int var49 = this.field4259 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4264) {
                for (int var50 = 0; var50 < this.field4239; var50++) {
                    int var51 = (this.field4259 >> 1) + var50;
                    var48[var50] += this.field4244[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4256[var52];
                }
            }
        }
        float[] var54 = this.field4244;
        this.field4244 = field4256;
        field4256 = var54;
        this.field4259 = var4;
        this.field4239 = var12 - (var4 >> 1);
        this.field4264 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public static void method1624() {
        field4240 = null;
        field4245 = null;
        field4242 = null;
        field4247 = null;
        field4246 = null;
        field4262 = null;
        field4267 = null;
        field4256 = null;
        field4258 = null;
        field4257 = null;
        field4248 = null;
        field4241 = null;
        field4243 = null;
        field4253 = null;
        field4250 = null;
        field4249 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([I)Lw;")
    public final class150 method1625(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4268 == null) {
            this.field4259 = 0;
            this.field4244 = new float[field4238];
            this.field4268 = new byte[this.field4266];
            this.field4270 = 0;
            this.field4269 = 0;
        }
        while (this.field4269 < this.field4254.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1623(this.field4269);
            if (var3 != null) {
                int var4 = this.field4270;
                int var5 = var3.length;
                if (var5 > this.field4266 - var4) {
                    var5 = this.field4266 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4268[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4270;
                }
                this.field4270 = var4;
            }
            this.field4269++;
        }
        this.field4244 = null;
        byte[] var2 = this.field4268;
        this.field4268 = null;
        return new class150(this.field4251, var2, this.field4265, this.field4252, this.field4237);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ln;II)Llg;")
    public static final class244 method1626(class138 arg0, int arg1, int arg2) {
        if (method1627(arg0)) {
            byte[] var3 = arg0.method884(arg2, 127, arg1);
            return var3 == null ? null : new class244(var3);
        } else {
            arg0.method870(arg2, (byte) -48, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ln;)Z")
    private static final boolean method1627(class138 arg0) {
        if (!field4263) {
            byte[] var1 = arg0.method884(0, -102, 0);
            if (var1 == null) {
                return false;
            }
            method1631(var1);
            field4263 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)F")
    public static final float method1628(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)I")
    public static final int method1629(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4260) {
            int var4 = 8 - field4260;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4240[field4261] >> field4260 & var5) << var2;
            field4260 = 0;
            field4261++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4240[field4261] >> field4260 & var3) << var2;
            field4260 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BI)V")
    private static final void method1630(byte[] arg0, int arg1) {
        field4240 = arg0;
        field4261 = arg1;
        field4260 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "([B)V")
    private static final void method1631(byte[] arg0) {
        method1630(arg0, 0);
        field4255 = 0x1 << method1629(4);
        field4238 = 0x1 << method1629(4);
        field4256 = new float[field4238];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4255 : field4238;
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
            int var25 = class16.method79(3439, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class140.method892(0, var26, var25);
            }
            if (var1 == 0) {
                field4258 = var18;
                field4257 = var20;
                field4248 = var22;
                field4250 = var24;
            } else {
                field4241 = var18;
                field4243 = var20;
                field4253 = var22;
                field4249 = var24;
            }
        }
        int var2 = method1629(8) + 1;
        field4245 = new class259[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4245[var3] = new class259();
        }
        int var4 = method1629(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1629(16);
        }
        int var6 = method1629(6) + 1;
        field4242 = new class110[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4242[var7] = new class110();
        }
        int var8 = method1629(6) + 1;
        field4247 = new class84[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4247[var9] = new class84();
        }
        int var10 = method1629(6) + 1;
        field4246 = new class158[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4246[var11] = new class158();
        }
        int var12 = method1629(6) + 1;
        field4262 = new boolean[var12];
        field4267 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4262[var13] = method1632() != 0;
            method1629(16);
            method1629(16);
            field4267[var13] = method1629(8);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
    public static final int method1632() {
        int var0 = field4240[field4261] >> field4260 & 0x1;
        field4260++;
        field4261 += field4260 >> 3;
        field4260 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "([B)V")
    private class244(byte[] arg0) {
        this.method1622(arg0);
    }
}
