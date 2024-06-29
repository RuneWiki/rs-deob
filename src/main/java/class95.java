import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Z")
    private static boolean field2429 = false;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    private int field2402;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    private int field2403;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    private static int field2410;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private static int field2416;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    private static int field2417;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    private static int field2424;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    private static int field2427;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    private static int field2430;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    private static boolean field2401;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
    private boolean field2407;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[B")
    private static byte[] field2413;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[F")
    private static float[] field2408;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[F")
    private static float[] field2409;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[F")
    private static float[] field2414;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[F")
    private static float[] field2415;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[F")
    private static float[] field2419;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[F")
    private static float[] field2422;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[F")
    private static float[] field2423;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[F")
    private static float[] field2426;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    private static int[] field2400;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    private static int[] field2405;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[I")
    private static int[] field2425;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[Lt;")
    private static class130[] field2412;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[Lfd;")
    private static class40[] field2411;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lac;")
    private static class4[] field2406;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[Lkf;")
    public static class75[] field2420;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[Z")
    private static boolean[] field2421;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[[B")
    private byte[][] field2418;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public static final int method783(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2427) {
            int var4 = 8 - field2427;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2413[field2416] >> field2427 & var5) << var2;
            field2427 = 0;
            field2416++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2413[field2416] >> field2427 & var3) << var2;
            field2427 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
    private static final void method784(byte[] arg0) {
        method790(arg0, 0);
        field2424 = 0x1 << method783(4);
        field2417 = 0x1 << method783(4);
        field2426 = new float[field2417];
        field2414 = new float[field2417];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2424 : field2417;
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
            int var25 = class51.method416(-3176, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class38.method300(var26, var25, 0);
            }
            if (var1 == 0) {
                field2419 = var18;
                field2423 = var20;
                field2422 = var22;
                field2425 = var24;
            } else {
                field2408 = var18;
                field2415 = var20;
                field2409 = var22;
                field2405 = var24;
            }
        }
        int var2 = method783(8) + 1;
        field2420 = new class75[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2420[var3] = new class75();
        }
        int var4 = method783(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method783(16);
        }
        int var6 = method783(6) + 1;
        field2412 = new class130[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2412[var7] = new class130();
        }
        int var8 = method783(6) + 1;
        field2411 = new class40[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2411[var9] = new class40();
        }
        int var10 = method783(6) + 1;
        field2406 = new class4[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2406[var11] = new class4();
        }
        int var12 = method783(6) + 1;
        field2421 = new boolean[var12];
        field2400 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2421[var13] = method788() != 0;
            method783(16);
            method783(16);
            field2400[var13] = method783(8);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
    public static void method785() {
        field2413 = null;
        field2420 = null;
        field2412 = null;
        field2411 = null;
        field2406 = null;
        field2421 = null;
        field2400 = null;
        field2414 = null;
        field2426 = null;
        field2419 = null;
        field2423 = null;
        field2422 = null;
        field2408 = null;
        field2415 = null;
        field2409 = null;
        field2425 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "([B)V")
    private final void method786(byte[] arg0) {
        class114 var2 = new class114(arg0);
        this.field2402 = var2.method973(-126);
        this.field2403 = var2.method973(-128);
        this.field2428 = var2.method973(-119);
        this.field2404 = var2.method973(-122);
        if (this.field2404 < 0) {
            this.field2404 = ~this.field2404;
            this.field2407 = true;
        }
        int var3 = var2.method973(-120);
        this.field2418 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method957((byte) 19);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method955(0, -101, var7, var5);
            this.field2418[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)[F")
    private final float[] method787(int arg0) {
        method790(this.field2418[arg0], 0);
        method788();
        int var2 = method783(class51.method416(-3176, field2400.length - 1));
        boolean var3 = field2421[var2];
        int var4 = var3 ? field2417 : field2424;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method788() != 0;
            var6 = method788() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2424 >> 2);
            var9 = (field2424 >> 2) + (var4 >> 2);
            var10 = field2424 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2424 >> 2);
            var12 = (field2424 >> 2) + (var4 - (var4 >> 2));
            var13 = field2424 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class4 var14 = field2406[field2400[var2]];
        int var15 = var14.field170;
        int var16 = var14.field172[var15];
        boolean var17 = !field2412[var16].method1085();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field171; var19++) {
            class40 var95 = field2411[var14.field173[var19]];
            float[] var96 = field2426;
            var95.method305(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field170;
            int var21 = var14.field172[var20];
            field2412[var21].method1092(field2426, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2426[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2426;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2408 : field2419;
            float[] var30 = var3 ? field2415 : field2423;
            float[] var31 = var3 ? field2409 : field2422;
            int[] var32 = var3 ? field2405 : field2425;
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
            int var35 = class51.method416(-3176, var4 - 1);
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
                field2426[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2426[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field2430 > 0) {
            int var49 = field2430 + var4 >> 2;
            var48 = new float[var49];
            if (!field2401) {
                for (int var50 = 0; var50 < field2410; var50++) {
                    int var51 = (field2430 >> 1) + var50;
                    var48[var50] += field2414[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2426[var52];
                }
            }
        }
        float[] var54 = field2414;
        field2414 = field2426;
        field2426 = var54;
        field2430 = var4;
        field2410 = var12 - (var4 >> 1);
        field2401 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
    public static final int method788() {
        int var0 = field2413[field2416] >> field2427 & 0x1;
        field2427++;
        field2416 += field2427 >> 3;
        field2427 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lq;)Z")
    private static final boolean method789(class111 arg0) {
        if (!field2429) {
            byte[] var1 = arg0.method898((byte) -105, 0, 0);
            if (var1 == null) {
                return false;
            }
            method784(var1);
            field2429 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
    private static final void method790(byte[] arg0, int arg1) {
        field2413 = arg0;
        field2416 = arg1;
        field2427 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)F")
    public static final float method791(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lq;II)Lne;")
    public static final class95 method792(class111 arg0, int arg1, int arg2) {
        if (method789(arg0)) {
            byte[] var3 = arg0.method898((byte) -44, arg2, arg1);
            return var3 == null ? null : new class95(var3);
        } else {
            arg0.method909(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()Lpd;")
    public final class108 method793() {
        field2430 = 0;
        byte[] var1 = new byte[this.field2403];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2418.length; var3++) {
            float[] var4 = this.method787(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field2403 - var2) {
                    var5 = this.field2403 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class108(this.field2402, var1, this.field2428, this.field2404, this.field2407);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    private class95(byte[] arg0) {
        this.method786(arg0);
    }
}
