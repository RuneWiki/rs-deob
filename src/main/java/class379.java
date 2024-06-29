import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class379 extends class445 {

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Z")
    private static boolean field5211 = false;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    private int field5201;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    private int field5202;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    private int field5205;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    private int field5206;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    private static int field5208;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    private static int field5215;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    private int field5217;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    private static int field5218;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    private static int field5219;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    private int field5227;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    private int field5231;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Z")
    private boolean field5210;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Z")
    private boolean field5228;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "[B")
    private static byte[] field5226;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "[B")
    private byte[] field5230;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[F")
    private static float[] field5207;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[F")
    private static float[] field5209;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[F")
    private static float[] field5212;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "[F")
    private static float[] field5214;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "[F")
    private static float[] field5221;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[F")
    private static float[] field5222;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "[F")
    private static float[] field5224;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "[F")
    private float[] field5229;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "[I")
    private static int[] field5199;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "[I")
    private static int[] field5213;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "[I")
    private static int[] field5225;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[Lp;")
    public static class131[] field5220;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lgt;")
    private static class290[] field5203;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[Lvd;")
    private static class29[] field5216;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "[Lpt;")
    private static class339[] field5223;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[Z")
    private static boolean[] field5204;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[[B")
    private byte[][] field5200;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)F", line = 5)
    public static final float method2320(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I", line = 18)
    public static final int method2321(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5208) {
            int var4 = 8 - field5208;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5226[field5218] >> field5208 & var5) << var2;
            field5208 = 0;
            field5218++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5226[field5218] >> field5208 & var3) << var2;
            field5208 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V", line = 45)
    private static final void method2322(byte[] arg0) {
        method2325(arg0, 0);
        field5219 = 0x1 << method2321(4);
        field5215 = 0x1 << method2321(4);
        field5209 = new float[field5215];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5219 : field5215;
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
            int var25 = class477.method2784((byte) 75, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class197.method1132(var26, var25, -46);
            }
            if (var1 == 0) {
                field5221 = var18;
                field5222 = var20;
                field5214 = var22;
                field5199 = var24;
            } else {
                field5224 = var18;
                field5212 = var20;
                field5207 = var22;
                field5225 = var24;
            }
        }
        int var2 = method2321(8) + 1;
        field5220 = new class131[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5220[var3] = new class131();
        }
        int var4 = method2321(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2321(16);
        }
        int var6 = method2321(6) + 1;
        field5216 = new class29[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5216[var7] = new class29();
        }
        int var8 = method2321(6) + 1;
        field5223 = new class339[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5223[var9] = new class339();
        }
        int var10 = method2321(6) + 1;
        field5203 = new class290[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5203[var11] = new class290();
        }
        int var12 = method2321(6) + 1;
        field5204 = new boolean[var12];
        field5213 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5204[var13] = method2330() != 0;
            method2321(16);
            method2321(16);
            field5213[var13] = method2321(8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)[F", line = 197)
    private final float[] method2323(int arg0) {
        method2325(this.field5200[arg0], 0);
        method2330();
        int var2 = method2321(class477.method2784((byte) 125, field5213.length - 1));
        boolean var3 = field5204[var2];
        int var4 = var3 ? field5215 : field5219;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2330() != 0;
            var6 = method2330() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5219 >> 2);
            var9 = (field5219 >> 2) + (var4 >> 2);
            var10 = field5219 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5219 >> 2);
            var12 = (field5219 >> 2) + (var4 - (var4 >> 2));
            var13 = field5219 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class290 var14 = field5203[field5213[var2]];
        int var15 = var14.field3905;
        int var16 = var14.field3902[var15];
        boolean var17 = !field5216[var16].method171();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3903; var19++) {
            class339 var95 = field5223[var14.field3904[var19]];
            float[] var96 = field5209;
            var95.method1930(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3905;
            int var21 = var14.field3902[var20];
            field5216[var21].method167(field5209, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5209[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5209;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5224 : field5221;
            float[] var30 = var3 ? field5212 : field5222;
            float[] var31 = var3 ? field5207 : field5214;
            int[] var32 = var3 ? field5225 : field5199;
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
            int var35 = class477.method2784((byte) 122, var4 - 1);
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
                field5209[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5209[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5217 > 0) {
            int var49 = this.field5217 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5210) {
                for (int var50 = 0; var50 < this.field5202; var50++) {
                    int var51 = (this.field5217 >> 1) + var50;
                    var48[var50] += this.field5229[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5209[var52];
                }
            }
        }
        float[] var54 = this.field5229;
        this.field5229 = field5209;
        field5209 = var54;
        this.field5217 = var4;
        this.field5202 = var12 - (var4 >> 1);
        this.field5210 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([B)V", line = 613)
    private final void method2324(byte[] arg0) {
        class32 var2 = new class32(arg0);
        this.field5227 = var2.method222(1024);
        this.field5205 = var2.method222(1024);
        this.field5206 = var2.method222(1024);
        this.field5201 = var2.method222(1024);
        if (this.field5201 < 0) {
            this.field5201 = ~this.field5201;
            this.field5228 = true;
        }
        int var3 = var2.method222(1024);
        this.field5200 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method201((byte) -116);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method185(var7, 0, var5, true);
            this.field5200[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)V", line = 659)
    private static final void method2325(byte[] arg0, int arg1) {
        field5226 = arg0;
        field5218 = arg1;
        field5208 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 664)
    public static void method2326() {
        field5226 = null;
        field5220 = null;
        field5216 = null;
        field5223 = null;
        field5203 = null;
        field5204 = null;
        field5213 = null;
        field5209 = null;
        field5221 = null;
        field5222 = null;
        field5214 = null;
        field5224 = null;
        field5212 = null;
        field5207 = null;
        field5199 = null;
        field5225 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([I)Ljn;", line = 682)
    public final class465 method2327(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5230 == null) {
            this.field5217 = 0;
            this.field5229 = new float[field5215];
            this.field5230 = new byte[this.field5205];
            this.field5231 = 0;
            this.field5232 = 0;
        }
        while (this.field5232 < this.field5200.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2323(this.field5232);
            if (var3 != null) {
                int var4 = this.field5231;
                int var5 = var3.length;
                if (var5 > this.field5205 - var4) {
                    var5 = this.field5205 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5230[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5231;
                }
                this.field5231 = var4;
            }
            this.field5232++;
        }
        this.field5229 = null;
        byte[] var2 = this.field5230;
        this.field5230 = null;
        return new class465(this.field5227, var2, this.field5206, this.field5201, this.field5228);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lr;II)Lpf;", line = 752)
    public static final class379 method2328(class110 arg0, int arg1, int arg2) {
        if (method2329(arg0)) {
            byte[] var3 = arg0.method702((byte) 63, arg2, arg1);
            return var3 == null ? null : new class379(var3);
        } else {
            arg0.method701(arg2, 13047, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lr;)Z", line = 767)
    private static final boolean method2329(class110 arg0) {
        if (!field5211) {
            byte[] var1 = arg0.method702((byte) -127, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2322(var1);
            field5211 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()I", line = 792)
    public static final int method2330() {
        int var0 = field5226[field5218] >> field5208 & 0x1;
        field5208++;
        field5218 += field5208 >> 3;
        field5208 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V", line = 803)
    private class379(byte[] arg0) {
        this.method2324(arg0);
    }
}
