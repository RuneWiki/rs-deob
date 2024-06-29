import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class104 extends class109 {

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Z")
    private static boolean field2316 = false;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    private static int field2311;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    private static int field2314;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    private static int field2327;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    private int field2330;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    private int field2331;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    private static int field2332;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    private int field2336;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Z")
    private boolean field2320;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
    private boolean field2324;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "[B")
    private static byte[] field2307;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "[B")
    private byte[] field2335;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[F")
    private float[] field2304;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[F")
    private static float[] field2309;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[F")
    private static float[] field2310;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "[F")
    private static float[] field2313;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "[F")
    private static float[] field2315;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[F")
    private static float[] field2317;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[F")
    private static float[] field2319;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "[F")
    private static float[] field2323;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
    private static int[] field2306;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "[I")
    private static int[] field2318;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[I")
    private static int[] field2321;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "[Loe;")
    private static class139[] field2305;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "[Lud;")
    private static class192[] field2329;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[Lef;")
    public static class47[] field2308;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "[Lhg;")
    private static class77[] field2326;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[Z")
    private static boolean[] field2303;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "[[B")
    private byte[][] field2322;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public static void method769() {
        field2307 = null;
        field2308 = null;
        field2305 = null;
        field2329 = null;
        field2326 = null;
        field2303 = null;
        field2306 = null;
        field2310 = null;
        field2319 = null;
        field2313 = null;
        field2317 = null;
        field2323 = null;
        field2315 = null;
        field2309 = null;
        field2318 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([B)V")
    private final void method770(byte[] arg0) {
        class26 var2 = new class26(arg0);
        this.field2333 = var2.method240(8);
        this.field2312 = var2.method240(8);
        this.field2330 = var2.method240(8);
        this.field2328 = var2.method240(8);
        if (this.field2328 < 0) {
            this.field2328 = ~this.field2328;
            this.field2324 = true;
        }
        int var3 = var2.method240(8);
        this.field2322 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method221(-92);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method255((byte) -102, 0, var7, var5);
            this.field2322[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lag;II)Lkf;")
    public static final class104 method771(class8 arg0, int arg1, int arg2) {
        if (method777(arg0)) {
            byte[] var3 = arg0.method39(arg1, -1, arg2);
            return var3 == null ? null : new class104(var3);
        } else {
            arg0.method43(arg1, arg2, 46);
            return null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BI)V")
    private static final void method772(byte[] arg0, int arg1) {
        field2307 = arg0;
        field2314 = arg1;
        field2327 = 0;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)[F")
    private final float[] method773(int arg0) {
        method772(this.field2322[arg0], 0);
        method778();
        int var2 = method776(class174.method1161(true, field2306.length - 1));
        boolean var3 = field2303[var2];
        int var4 = var3 ? field2311 : field2332;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method778() != 0;
            var6 = method778() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2332 >> 2);
            var9 = (field2332 >> 2) + (var4 >> 2);
            var10 = field2332 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2332 >> 2);
            var12 = (field2332 >> 2) + (var4 - (var4 >> 2));
            var13 = field2332 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class77 var14 = field2326[field2306[var2]];
        int var15 = var14.field1812;
        int var16 = var14.field1810[var15];
        boolean var17 = !field2305[var16].method947();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1811; var19++) {
            class192 var95 = field2329[var14.field1813[var19]];
            float[] var96 = field2310;
            var95.method1259(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1812;
            int var21 = var14.field1810[var20];
            field2305[var21].method953(field2310, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2310[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2310;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2323 : field2319;
            float[] var30 = var3 ? field2315 : field2313;
            float[] var31 = var3 ? field2309 : field2317;
            int[] var32 = var3 ? field2321 : field2318;
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
            int var35 = class174.method1161(true, var4 - 1);
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
                field2310[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2310[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2325 > 0) {
            int var49 = this.field2325 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2320) {
                for (int var50 = 0; var50 < this.field2331; var50++) {
                    int var51 = (this.field2325 >> 1) + var50;
                    var48[var50] += this.field2304[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2310[var52];
                }
            }
        }
        float[] var54 = this.field2304;
        this.field2304 = field2310;
        field2310 = var54;
        this.field2325 = var4;
        this.field2331 = var12 - (var4 >> 1);
        this.field2320 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)F")
    public static final float method774(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([I)Lai;")
    public final class10 method775(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2335 == null) {
            this.field2325 = 0;
            this.field2304 = new float[field2311];
            this.field2335 = new byte[this.field2312];
            this.field2334 = 0;
            this.field2336 = 0;
        }
        while (this.field2336 < this.field2322.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method773(this.field2336);
            if (var3 != null) {
                int var4 = this.field2334;
                int var5 = var3.length;
                if (var5 > this.field2312 - var4) {
                    var5 = this.field2312 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2335[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2334;
                }
                this.field2334 = var4;
            }
            this.field2336++;
        }
        this.field2304 = null;
        byte[] var2 = this.field2335;
        this.field2335 = null;
        return new class10(this.field2333, var2, this.field2330, this.field2328, this.field2324);
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)I")
    public static final int method776(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2327) {
            int var4 = 8 - field2327;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2307[field2314] >> field2327 & var5) << var2;
            field2327 = 0;
            field2314++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2307[field2314] >> field2327 & var3) << var2;
            field2327 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lag;)Z")
    private static final boolean method777(class8 arg0) {
        if (!field2316) {
            byte[] var1 = arg0.method39(0, -1, 0);
            if (var1 == null) {
                return false;
            }
            method779(var1);
            field2316 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
    public static final int method778() {
        int var0 = field2307[field2314] >> field2327 & 0x1;
        field2327++;
        field2314 += field2327 >> 3;
        field2327 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    private class104(byte[] arg0) {
        this.method770(arg0);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "([B)V")
    private static final void method779(byte[] arg0) {
        method772(arg0, 0);
        field2332 = 0x1 << method776(4);
        field2311 = 0x1 << method776(4);
        field2310 = new float[field2311];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2332 : field2311;
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
            int var25 = class174.method1161(true, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class160.method1067(var25, var26, (byte) -21);
            }
            if (var1 == 0) {
                field2319 = var18;
                field2313 = var20;
                field2317 = var22;
                field2318 = var24;
            } else {
                field2323 = var18;
                field2315 = var20;
                field2309 = var22;
                field2321 = var24;
            }
        }
        int var2 = method776(8) + 1;
        field2308 = new class47[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2308[var3] = new class47();
        }
        int var4 = method776(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method776(16);
        }
        int var6 = method776(6) + 1;
        field2305 = new class139[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2305[var7] = new class139();
        }
        int var8 = method776(6) + 1;
        field2329 = new class192[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2329[var9] = new class192();
        }
        int var10 = method776(6) + 1;
        field2326 = new class77[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2326[var11] = new class77();
        }
        int var12 = method776(6) + 1;
        field2303 = new boolean[var12];
        field2306 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2303[var13] = method778() != 0;
            method776(16);
            method776(16);
            field2306[var13] = method776(8);
        }
    }
}
