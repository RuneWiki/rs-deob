import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class357 extends class35 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Z")
    private static boolean field5072 = false;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field5074;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    private static int field5075;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    private int field5086;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    private static int field5089;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    private int field5093;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    private static int field5094;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    private static int field5095;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Z")
    private boolean field5085;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Z")
    private boolean field5092;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "[B")
    private static byte[] field5090;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "[B")
    private byte[] field5097;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[F")
    private static float[] field5065;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[F")
    private static float[] field5066;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[F")
    private static float[] field5067;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[F")
    private static float[] field5069;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[F")
    private static float[] field5071;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[F")
    private float[] field5073;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[F")
    private static float[] field5081;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "[F")
    private static float[] field5087;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    private static int[] field5068;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
    private static int[] field5070;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "[I")
    private static int[] field5078;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[Lfq;")
    public static class178[] field5082;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[Lkd;")
    private static class330[] field5091;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[Lcb;")
    private static class386[] field5077;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[Loh;")
    private static class430[] field5083;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[Z")
    private static boolean[] field5079;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[[B")
    private byte[][] field5080;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([B)V")
    private final void method2283(byte[] arg0) {
        class37 var2 = new class37(arg0);
        this.field5088 = var2.method278(107);
        this.field5076 = var2.method278(5);
        this.field5084 = var2.method278(-125);
        this.field5093 = var2.method278(77);
        if (this.field5093 < 0) {
            this.field5093 = ~this.field5093;
            this.field5085 = true;
        }
        int var3 = var2.method278(68);
        this.field5080 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method271((byte) 125);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method285(0, (byte) 121, var5, var7);
            this.field5080[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public static void method2284() {
        field5090 = null;
        field5082 = null;
        field5077 = null;
        field5091 = null;
        field5083 = null;
        field5079 = null;
        field5078 = null;
        field5081 = null;
        field5065 = null;
        field5067 = null;
        field5071 = null;
        field5066 = null;
        field5069 = null;
        field5087 = null;
        field5068 = null;
        field5070 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([I)Lhk;")
    public final class201 method2285(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5097 == null) {
            this.field5074 = 0;
            this.field5073 = new float[field5089];
            this.field5097 = new byte[this.field5076];
            this.field5096 = 0;
            this.field5098 = 0;
        }
        while (this.field5098 < this.field5080.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2287(this.field5098);
            if (var3 != null) {
                int var4 = this.field5096;
                int var5 = var3.length;
                if (var5 > this.field5076 - var4) {
                    var5 = this.field5076 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5097[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5096;
                }
                this.field5096 = var4;
            }
            this.field5098++;
        }
        this.field5073 = null;
        byte[] var2 = this.field5097;
        this.field5097 = null;
        return new class201(this.field5088, var2, this.field5084, this.field5093, this.field5085);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public static final int method2286() {
        int var0 = field5090[field5075] >> field5095 & 0x1;
        field5095++;
        field5075 += field5095 >> 3;
        field5095 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)[F")
    private final float[] method2287(int arg0) {
        method2291(this.field5080[arg0], 0);
        method2286();
        int var2 = method2293(class218.method1645((byte) -120, field5078.length - 1));
        boolean var3 = field5079[var2];
        int var4 = var3 ? field5089 : field5094;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2286() != 0;
            var6 = method2286() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5094 >> 2);
            var9 = (field5094 >> 2) + (var4 >> 2);
            var10 = field5094 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5094 >> 2);
            var12 = (field5094 >> 2) + (var4 - (var4 >> 2));
            var13 = field5094 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class430 var14 = field5083[field5078[var2]];
        int var15 = var14.field6218;
        int var16 = var14.field6216[var15];
        boolean var17 = !field5077[var16].method2448();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6217; var19++) {
            class330 var95 = field5091[var14.field6219[var19]];
            float[] var96 = field5081;
            var95.method2165(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6218;
            int var21 = var14.field6216[var20];
            field5077[var21].method2443(field5081, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5081[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5081;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5066 : field5065;
            float[] var30 = var3 ? field5069 : field5067;
            float[] var31 = var3 ? field5087 : field5071;
            int[] var32 = var3 ? field5070 : field5068;
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
            int var35 = class218.method1645((byte) -120, var4 - 1);
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
                field5081[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5081[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5074 > 0) {
            int var49 = this.field5074 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5092) {
                for (int var50 = 0; var50 < this.field5086; var50++) {
                    int var51 = (this.field5074 >> 1) + var50;
                    var48[var50] += this.field5073[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5081[var52];
                }
            }
        }
        float[] var54 = this.field5073;
        this.field5073 = field5081;
        field5081 = var54;
        this.field5074 = var4;
        this.field5086 = var12 - (var4 >> 1);
        this.field5092 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)F")
    public static final float method2288(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ldp;II)Lmd;")
    public static final class357 method2289(class174 arg0, int arg1, int arg2) {
        if (method2290(arg0)) {
            byte[] var3 = arg0.method1355(arg2, -12607, arg1);
            return var3 == null ? null : new class357(var3);
        } else {
            arg0.method1358(arg1, 93, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ldp;)Z")
    private static final boolean method2290(class174 arg0) {
        if (!field5072) {
            byte[] var1 = arg0.method1355(0, -12607, 0);
            if (var1 == null) {
                return false;
            }
            method2292(var1);
            field5072 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)V")
    private static final void method2291(byte[] arg0, int arg1) {
        field5090 = arg0;
        field5075 = arg1;
        field5095 = 0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "([B)V")
    private static final void method2292(byte[] arg0) {
        method2291(arg0, 0);
        field5094 = 0x1 << method2293(4);
        field5089 = 0x1 << method2293(4);
        field5081 = new float[field5089];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5094 : field5089;
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
            int var25 = class218.method1645((byte) -120, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class105.method939(var25, var26, (byte) 66);
            }
            if (var1 == 0) {
                field5065 = var18;
                field5067 = var20;
                field5071 = var22;
                field5068 = var24;
            } else {
                field5066 = var18;
                field5069 = var20;
                field5087 = var22;
                field5070 = var24;
            }
        }
        int var2 = method2293(8) + 1;
        field5082 = new class178[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5082[var3] = new class178();
        }
        int var4 = method2293(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2293(16);
        }
        int var6 = method2293(6) + 1;
        field5077 = new class386[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5077[var7] = new class386();
        }
        int var8 = method2293(6) + 1;
        field5091 = new class330[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5091[var9] = new class330();
        }
        int var10 = method2293(6) + 1;
        field5083 = new class430[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5083[var11] = new class430();
        }
        int var12 = method2293(6) + 1;
        field5079 = new boolean[var12];
        field5078 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5079[var13] = method2286() != 0;
            method2293(16);
            method2293(16);
            field5078[var13] = method2293(8);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
    private class357(byte[] arg0) {
        this.method2283(arg0);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I")
    public static final int method2293(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5095) {
            int var4 = 8 - field5095;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5090[field5075] >> field5095 & var5) << var2;
            field5095 = 0;
            field5075++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5090[field5075] >> field5095 & var3) << var2;
            field5095 += arg0;
        }
        return var1;
    }
}
