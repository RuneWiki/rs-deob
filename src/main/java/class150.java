import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class150 extends class80 {

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Z")
    private static boolean field2453 = false;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    private static int field2427;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private static int field2430;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    private static int field2431;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private static int field2433;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    private int field2435;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field2438;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    private int field2457;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Z")
    private boolean field2441;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Z")
    private boolean field2450;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "[B")
    private static byte[] field2444;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "[B")
    private byte[] field2456;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[F")
    private static float[] field2425;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[F")
    private static float[] field2434;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[F")
    private static float[] field2436;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[F")
    private static float[] field2439;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "[F")
    private static float[] field2442;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[F")
    private static float[] field2447;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "[F")
    private static float[] field2451;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[F")
    private float[] field2454;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
    private static int[] field2443;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[I")
    private static int[] field2449;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[I")
    private static int[] field2452;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "[Lch;")
    public static class104[] field2448;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "[Lak;")
    private static class21[] field2440;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "[Lbi;")
    private static class242[] field2446;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[Lgk;")
    private static class291[] field2437;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "[Z")
    private static boolean[] field2429;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[[B")
    private byte[][] field2432;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([B)V", line = 3)
    private static final void method1089(byte[] arg0) {
        method1097(arg0, 0);
        field2431 = 0x1 << method1091(4);
        field2427 = 0x1 << method1091(4);
        field2439 = new float[field2427];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2431 : field2427;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class185.method1302(var5 - 1, -92);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class273.method1891(var14, var13, (byte) 112);
            }
            if (var1 == 0) {
                field2442 = var6;
                field2451 = var8;
                field2436 = var10;
                field2443 = var12;
            } else {
                field2447 = var6;
                field2425 = var8;
                field2434 = var10;
                field2452 = var12;
            }
        }
        int var15 = method1091(8) + 1;
        field2448 = new class104[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2448[var16] = new class104();
        }
        int var17 = method1091(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1091(16);
        }
        int var19 = method1091(6) + 1;
        field2440 = new class21[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2440[var20] = new class21();
        }
        int var21 = method1091(6) + 1;
        field2446 = new class242[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2446[var22] = new class242();
        }
        int var23 = method1091(6) + 1;
        field2437 = new class291[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2437[var24] = new class291();
        }
        int var25 = method1091(6) + 1;
        field2429 = new boolean[var25];
        field2449 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2429[var26] = method1098() != 0;
            method1091(16);
            method1091(16);
            field2449[var26] = method1091(8);
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)F", line = 157)
    public static final float method1090(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)I", line = 172)
    public static final int method1091(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2433) {
            int var3 = 8 - field2433;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2444[field2430] >> field2433 & var4) << var2;
            field2433 = 0;
            field2430++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2444[field2430] >> field2433 & var5) << var2;
            field2433 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsi;)Z", line = 208)
    private static final boolean method1092(class66 arg0) {
        if (!field2453) {
            byte[] var1 = arg0.method523(-44, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1089(var1);
            field2453 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([I)Lqd;", line = 222)
    public final class182 method1093(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2456 == null) {
            this.field2426 = 0;
            this.field2454 = new float[field2427];
            this.field2456 = new byte[this.field2445];
            this.field2457 = 0;
            this.field2455 = 0;
        }
        while (this.field2455 < this.field2432.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1094(this.field2455);
            if (var2 != null) {
                int var3 = this.field2457;
                int var4 = var2.length;
                if (var4 > this.field2445 - var3) {
                    var4 = this.field2445 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2456[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2457;
                }
                this.field2457 = var3;
            }
            this.field2455++;
        }
        this.field2454 = null;
        byte[] var7 = this.field2456;
        this.field2456 = null;
        return new class182(this.field2424, var7, this.field2438, this.field2428, this.field2450);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)[F", line = 286)
    private final float[] method1094(int arg0) {
        method1097(this.field2432[arg0], 0);
        method1098();
        int var2 = method1091(class185.method1302(field2449.length - 1, -105));
        boolean var3 = field2429[var2];
        int var4 = var3 ? field2427 : field2431;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1098() != 0;
            var6 = method1098() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2431 >> 2);
            var9 = (field2431 >> 2) + (var4 >> 2);
            var10 = field2431 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2431 >> 2);
            var12 = (field2431 >> 2) + (var4 - (var4 >> 2));
            var13 = field2431 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class291 var14 = field2437[field2449[var2]];
        int var15 = var14.field4766;
        int var16 = var14.field4763[var15];
        boolean var17 = !field2440[var16].method124();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4764; var19++) {
            class242 var20 = field2446[var14.field4765[var19]];
            float[] var21 = field2439;
            var20.method1695(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field4766;
            int var23 = var14.field4763[var22];
            field2440[var23].method128(field2439, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2439[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2439;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2447 : field2442;
            float[] var32 = var3 ? field2425 : field2451;
            float[] var33 = var3 ? field2434 : field2436;
            int[] var34 = var3 ? field2452 : field2443;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class185.method1302(var4 - 1, -86);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field2439[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2439[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2426 > 0) {
            int var91 = this.field2426 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2441) {
                for (int var92 = 0; var92 < this.field2435; var92++) {
                    int var93 = (this.field2426 >> 1) + var92;
                    var90[var92] += this.field2454[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2439[var94];
                }
            }
        }
        float[] var96 = this.field2454;
        this.field2454 = field2439;
        field2439 = var96;
        this.field2426 = var4;
        this.field2435 = var12 - (var4 >> 1);
        this.field2441 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([B)V", line = 701)
    private final void method1095(byte[] arg0) {
        class164 var2 = new class164(arg0);
        this.field2424 = var2.method1191(31776);
        this.field2445 = var2.method1191(31776);
        this.field2438 = var2.method1191(31776);
        this.field2428 = var2.method1191(31776);
        if (this.field2428 < 0) {
            this.field2428 = ~this.field2428;
            this.field2450 = true;
        }
        int var3 = var2.method1191(31776);
        this.field2432 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1178(8);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1192(var5, var7, 0, 0);
            this.field2432[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 754)
    public static void method1096() {
        field2444 = null;
        field2448 = null;
        field2440 = null;
        field2446 = null;
        field2437 = null;
        field2429 = null;
        field2449 = null;
        field2439 = null;
        field2442 = null;
        field2451 = null;
        field2436 = null;
        field2447 = null;
        field2425 = null;
        field2434 = null;
        field2443 = null;
        field2452 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([BI)V", line = 774)
    private static final void method1097(byte[] arg0, int arg1) {
        field2444 = arg0;
        field2430 = arg1;
        field2433 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B)V", line = 778)
    private class150(byte[] arg0) {
        this.method1095(arg0);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I", line = 784)
    public static final int method1098() {
        int var0 = field2444[field2430] >> field2433 & 0x1;
        field2433++;
        field2430 += field2433 >> 3;
        field2433 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsi;II)Lab;", line = 796)
    public static final class150 method1099(class66 arg0, int arg1, int arg2) {
        if (method1092(arg0)) {
            byte[] var3 = arg0.method523(-65, arg2, arg1);
            return var3 == null ? null : new class150(var3);
        } else {
            arg0.method521(arg1, true, arg2);
            return null;
        }
    }
}
