import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class127 extends class106 {

    @OriginalMember(owner = "client!li", name = "D", descriptor = "Z")
    private static boolean field2277 = false;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    private static int field2266;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    private int field2270;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    private int field2273;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    private static int field2275;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    private static int field2282;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    private int field2289;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private static int field2292;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
    private boolean field2286;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "Z")
    private boolean field2288;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[B")
    private static byte[] field2271;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "[B")
    private byte[] field2296;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[F")
    private static float[] field2264;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[F")
    private static float[] field2267;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[F")
    private float[] field2274;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "[F")
    private static float[] field2278;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "[F")
    private static float[] field2279;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[F")
    private static float[] field2280;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "[F")
    private static float[] field2281;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "[F")
    private static float[] field2293;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "[I")
    private static int[] field2268;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "[I")
    private static int[] field2283;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "[I")
    private static int[] field2294;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "[Lne;")
    private static class143[] field2284;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "[Led;")
    private static class49[] field2287;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "[Lfg;")
    public static class62[] field2285;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "[Lia;")
    private static class88[] field2276;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[Z")
    private static boolean[] field2269;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "[[B")
    private byte[][] field2290;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lsd;)Z")
    private static final boolean method763(class192 arg0) {
        if (!field2277) {
            byte[] var1 = arg0.method1208(0, (byte) 119, 0);
            if (var1 == null) {
                return false;
            }
            method767(var1);
            field2277 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([I)Lmg;")
    public final class135 method764(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2296 == null) {
            this.field2270 = 0;
            this.field2274 = new float[field2282];
            this.field2296 = new byte[this.field2289];
            this.field2297 = 0;
            this.field2295 = 0;
        }
        while (this.field2295 < this.field2290.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method769(this.field2295);
            if (var3 != null) {
                int var4 = this.field2297;
                int var5 = var3.length;
                if (var5 > this.field2289 - var4) {
                    var5 = this.field2289 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2296[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2297;
                }
                this.field2297 = var4;
            }
            this.field2295++;
        }
        this.field2274 = null;
        byte[] var2 = this.field2296;
        this.field2296 = null;
        return new class135(this.field2265, var2, this.field2291, this.field2272, this.field2286);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lsd;II)Lli;")
    public static final class127 method765(class192 arg0, int arg1, int arg2) {
        if (method763(arg0)) {
            byte[] var3 = arg0.method1208(arg2, (byte) 116, arg1);
            return var3 == null ? null : new class127(var3);
        } else {
            arg0.method1187(-1, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public static void method766() {
        field2271 = null;
        field2285 = null;
        field2276 = null;
        field2287 = null;
        field2284 = null;
        field2269 = null;
        field2294 = null;
        field2281 = null;
        field2293 = null;
        field2264 = null;
        field2280 = null;
        field2267 = null;
        field2279 = null;
        field2278 = null;
        field2283 = null;
        field2268 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([B)V")
    private static final void method767(byte[] arg0) {
        method771(arg0, 0);
        field2275 = 0x1 << method768(4);
        field2282 = 0x1 << method768(4);
        field2281 = new float[field2282];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2275 : field2282;
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
            int var25 = class152.method1003(var17 - 1, (byte) 46);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class74.method481(var26, 0, var25);
            }
            if (var1 == 0) {
                field2293 = var18;
                field2264 = var20;
                field2280 = var22;
                field2283 = var24;
            } else {
                field2267 = var18;
                field2279 = var20;
                field2278 = var22;
                field2268 = var24;
            }
        }
        int var2 = method768(8) + 1;
        field2285 = new class62[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2285[var3] = new class62();
        }
        int var4 = method768(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method768(16);
        }
        int var6 = method768(6) + 1;
        field2276 = new class88[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2276[var7] = new class88();
        }
        int var8 = method768(6) + 1;
        field2287 = new class49[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2287[var9] = new class49();
        }
        int var10 = method768(6) + 1;
        field2284 = new class143[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2284[var11] = new class143();
        }
        int var12 = method768(6) + 1;
        field2269 = new boolean[var12];
        field2294 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2269[var13] = method770() != 0;
            method768(16);
            method768(16);
            field2294[var13] = method768(8);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
    public static final int method768(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2292) {
            int var4 = 8 - field2292;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2271[field2266] >> field2292 & var5) << var2;
            field2292 = 0;
            field2266++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2271[field2266] >> field2292 & var3) << var2;
            field2292 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)[F")
    private final float[] method769(int arg0) {
        method771(this.field2290[arg0], 0);
        method770();
        int var2 = method768(class152.method1003(field2294.length - 1, (byte) 0));
        boolean var3 = field2269[var2];
        int var4 = var3 ? field2282 : field2275;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method770() != 0;
            var6 = method770() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2275 >> 2);
            var9 = (field2275 >> 2) + (var4 >> 2);
            var10 = field2275 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2275 >> 2);
            var12 = (field2275 >> 2) + (var4 - (var4 >> 2));
            var13 = field2275 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class143 var14 = field2284[field2294[var2]];
        int var15 = var14.field2594;
        int var16 = var14.field2596[var15];
        boolean var17 = !field2276[var16].method564();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2595; var19++) {
            class49 var95 = field2287[var14.field2597[var19]];
            float[] var96 = field2281;
            var95.method348(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2594;
            int var21 = var14.field2596[var20];
            field2276[var21].method565(field2281, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2281[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2281;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2267 : field2293;
            float[] var30 = var3 ? field2279 : field2264;
            float[] var31 = var3 ? field2278 : field2280;
            int[] var32 = var3 ? field2268 : field2283;
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
            int var35 = class152.method1003(var4 - 1, (byte) -113);
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
                field2281[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2281[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2270 > 0) {
            int var49 = this.field2270 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2288) {
                for (int var50 = 0; var50 < this.field2273; var50++) {
                    int var51 = (this.field2270 >> 1) + var50;
                    var48[var50] += this.field2274[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2281[var52];
                }
            }
        }
        float[] var54 = this.field2274;
        this.field2274 = field2281;
        field2281 = var54;
        this.field2270 = var4;
        this.field2273 = var12 - (var4 >> 1);
        this.field2288 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
    public static final int method770() {
        int var0 = field2271[field2266] >> field2292 & 0x1;
        field2292++;
        field2266 += field2292 >> 3;
        field2292 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BI)V")
    private static final void method771(byte[] arg0, int arg1) {
        field2271 = arg0;
        field2266 = arg1;
        field2292 = 0;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "([B)V")
    private final void method772(byte[] arg0) {
        class229 var2 = new class229(arg0);
        this.field2265 = var2.method1437(425528536);
        this.field2289 = var2.method1437(425528536);
        this.field2291 = var2.method1437(425528536);
        this.field2272 = var2.method1437(425528536);
        if (this.field2272 < 0) {
            this.field2272 = ~this.field2272;
            this.field2286 = true;
        }
        int var3 = var2.method1437(425528536);
        this.field2290 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1475(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1456(0, (byte) 87, var5, var7);
            this.field2290[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    private class127(byte[] arg0) {
        this.method772(arg0);
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)F")
    public static final float method773(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
