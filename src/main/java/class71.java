import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class71 extends class179 {

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Z")
    private static boolean field1243 = false;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    private static int field1235;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private static int field1236;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    private static int field1241;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    private static int field1242;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Z")
    private boolean field1249;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "Z")
    private boolean field1251;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[B")
    private static byte[] field1232;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "[B")
    private byte[] field1265;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[F")
    private static float[] field1233;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[F")
    private static float[] field1237;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[F")
    private static float[] field1240;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "[F")
    private static float[] field1245;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "[F")
    private static float[] field1246;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "[F")
    private float[] field1250;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "[F")
    private static float[] field1253;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "[F")
    private static float[] field1257;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "[I")
    private static int[] field1244;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "[I")
    private static int[] field1247;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "[I")
    private static int[] field1259;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "[Lsa;")
    private static class130[] field1248;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lek;")
    public static class335[] field1252;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "[Lof;")
    private static class422[] field1258;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "[Lwf;")
    private static class84[] field1255;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "[Z")
    private static boolean[] field1238;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "[[B")
    private byte[][] field1262;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BI)V", line = 4)
    private static final void method518(byte[] arg0, int arg1) {
        field1232 = arg0;
        field1241 = arg1;
        field1235 = 0;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)I", line = 11)
    public static final int method519(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1235) {
            int var4 = 8 - field1235;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1232[field1241] >> field1235 & var5) << var2;
            field1235 = 0;
            field1241++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1232[field1241] >> field1235 & var3) << var2;
            field1235 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()I", line = 41)
    public static final int method520() {
        int var0 = field1232[field1241] >> field1235 & 0x1;
        field1235++;
        field1241 += field1235 >> 3;
        field1235 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()V", line = 54)
    public static void method521() {
        field1232 = null;
        field1252 = null;
        field1258 = null;
        field1248 = null;
        field1255 = null;
        field1238 = null;
        field1244 = null;
        field1246 = null;
        field1237 = null;
        field1253 = null;
        field1245 = null;
        field1257 = null;
        field1240 = null;
        field1233 = null;
        field1259 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Llt;I)Ljj;", line = 73)
    public static final class71 method522(class458 arg0, int arg1) {
        if (method529(arg0)) {
            byte[] var2 = arg0.method2734(arg1, (byte) 78);
            return var2 == null ? null : new class71(var2);
        } else {
            arg0.method2729(arg1, -9055);
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)F", line = 88)
    public static final float method523(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Llt;II)Ljj;", line = 100)
    public static final class71 method524(class458 arg0, int arg1, int arg2) {
        if (method529(arg0)) {
            byte[] var3 = arg0.method2715(arg2, arg1, false);
            return var3 == null ? null : new class71(var3);
        } else {
            arg0.method2721((byte) 120, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([I)Lgu;", line = 125)
    public final class393 method525(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1265 == null) {
            this.field1261 = 0;
            this.field1250 = new float[field1236];
            this.field1265 = new byte[this.field1234];
            this.field1264 = 0;
            this.field1263 = 0;
        }
        while (this.field1263 < this.field1262.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method527(this.field1263);
            if (var3 != null) {
                int var4 = this.field1264;
                int var5 = var3.length;
                if (var5 > this.field1234 - var4) {
                    var5 = this.field1234 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1265[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1264;
                }
                this.field1264 = var4;
            }
            this.field1263++;
        }
        this.field1250 = null;
        byte[] var2 = this.field1265;
        this.field1265 = null;
        return new class393(this.field1254, var2, this.field1256, this.field1239, this.field1251);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([B)V", line = 184)
    private final void method526(byte[] arg0) {
        class40 var2 = new class40(arg0);
        this.field1254 = var2.method255((byte) 96);
        this.field1234 = var2.method255((byte) 96);
        this.field1256 = var2.method255((byte) 96);
        this.field1239 = var2.method255((byte) 96);
        if (this.field1239 < 0) {
            this.field1239 = ~this.field1239;
            this.field1251 = true;
        }
        int var3 = var2.method255((byte) 96);
        this.field1262 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method257((byte) 69);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method273(0, 49152, var7, var5);
            this.field1262[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)[F", line = 228)
    private final float[] method527(int arg0) {
        method518(this.field1262[arg0], 0);
        method520();
        int var2 = method519(class402.method2383(-96, field1244.length - 1));
        boolean var3 = field1238[var2];
        int var4 = var3 ? field1236 : field1242;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method520() != 0;
            var6 = method520() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1242 >> 2);
            var9 = (field1242 >> 2) + (var4 >> 2);
            var10 = field1242 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1242 >> 2);
            var12 = (field1242 >> 2) + (var4 - (var4 >> 2));
            var13 = field1242 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class84 var14 = field1255[field1244[var2]];
        int var15 = var14.field1422;
        int var16 = var14.field1419[var15];
        boolean var17 = !field1258[var16].method2465();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1421; var19++) {
            class130 var95 = field1248[var14.field1420[var19]];
            float[] var96 = field1246;
            var95.method871(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1422;
            int var21 = var14.field1419[var20];
            field1258[var21].method2469(field1246, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1246[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1246;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1257 : field1237;
            float[] var30 = var3 ? field1240 : field1253;
            float[] var31 = var3 ? field1233 : field1245;
            int[] var32 = var3 ? field1247 : field1259;
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
            int var35 = class402.method2383(115, var4 - 1);
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
                field1246[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1246[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1261 > 0) {
            int var49 = this.field1261 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1249) {
                for (int var50 = 0; var50 < this.field1260; var50++) {
                    int var51 = (this.field1261 >> 1) + var50;
                    var48[var50] += this.field1250[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1246[var52];
                }
            }
        }
        float[] var54 = this.field1250;
        this.field1250 = field1246;
        field1246 = var54;
        this.field1261 = var4;
        this.field1260 = var12 - (var4 >> 1);
        this.field1249 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "([B)V", line = 640)
    private static final void method528(byte[] arg0) {
        method518(arg0, 0);
        field1242 = 0x1 << method519(4);
        field1236 = 0x1 << method519(4);
        field1246 = new float[field1236];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1242 : field1236;
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
            int var25 = class402.method2383(115, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class401.method2382(var26, var25, false);
            }
            if (var1 == 0) {
                field1237 = var18;
                field1253 = var20;
                field1245 = var22;
                field1259 = var24;
            } else {
                field1257 = var18;
                field1240 = var20;
                field1233 = var22;
                field1247 = var24;
            }
        }
        int var2 = method519(8) + 1;
        field1252 = new class335[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1252[var3] = new class335();
        }
        int var4 = method519(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method519(16);
        }
        int var6 = method519(6) + 1;
        field1258 = new class422[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1258[var7] = new class422();
        }
        int var8 = method519(6) + 1;
        field1248 = new class130[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1248[var9] = new class130();
        }
        int var10 = method519(6) + 1;
        field1255 = new class84[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1255[var11] = new class84();
        }
        int var12 = method519(6) + 1;
        field1238 = new boolean[var12];
        field1244 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1238[var13] = method520() != 0;
            method519(16);
            method519(16);
            field1244[var13] = method519(8);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Llt;)Z", line = 795)
    private static final boolean method529(class458 arg0) {
        if (!field1243) {
            byte[] var1 = arg0.method2715(0, 0, false);
            if (var1 == null) {
                return false;
            }
            method528(var1);
            field1243 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "([B)V", line = 816)
    private class71(byte[] arg0) {
        this.method526(arg0);
    }
}
