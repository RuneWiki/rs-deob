import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class155 extends class134 {

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
    private static boolean field2461 = false;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    private static int field2440;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    private static int field2444;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    private int field2446;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    private int field2450;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    private int field2460;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    private static int field2463;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    private static int field2468;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    private int field2469;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    private boolean field2442;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "Z")
    private boolean field2447;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[B")
    private static byte[] field2465;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "[B")
    private byte[] field2467;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[F")
    private static float[] field2437;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[F")
    private static float[] field2439;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "[F")
    private static float[] field2441;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "[F")
    private static float[] field2448;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "[F")
    private static float[] field2451;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "[F")
    private static float[] field2455;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "[F")
    private float[] field2458;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "[F")
    private static float[] field2462;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
    private static int[] field2443;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "[I")
    private static int[] field2452;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "[I")
    private static int[] field2457;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[Loj;")
    private static class167[] field2436;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[Lrd;")
    private static class289[] field2438;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "[Lof;")
    public static class290[] field2445;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "[Loi;")
    private static class83[] field2456;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[Z")
    private static boolean[] field2449;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "[[B")
    private byte[][] field2459;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)[F")
    private final float[] method1019(int arg0) {
        method1029(this.field2459[arg0], 0);
        method1022();
        int var2 = method1023(class241.method1685((byte) -120, field2457.length - 1));
        boolean var3 = field2449[var2];
        int var4 = var3 ? field2444 : field2463;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1022() != 0;
            var6 = method1022() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2463 >> 2);
            var9 = (field2463 >> 2) + (var4 >> 2);
            var10 = field2463 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2463 >> 2);
            var12 = (field2463 >> 2) + (var4 - (var4 >> 2));
            var13 = field2463 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class167 var14 = field2436[field2457[var2]];
        int var15 = var14.field2618;
        int var16 = var14.field2619[var15];
        boolean var17 = !field2438[var16].method2032();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2616; var19++) {
            class83 var95 = field2456[var14.field2617[var19]];
            float[] var96 = field2441;
            var95.method560(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2618;
            int var21 = var14.field2619[var20];
            field2438[var21].method2025(field2441, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2441[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2441;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2439 : field2455;
            float[] var30 = var3 ? field2462 : field2451;
            float[] var31 = var3 ? field2437 : field2448;
            int[] var32 = var3 ? field2443 : field2452;
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
            int var35 = class241.method1685((byte) -108, var4 - 1);
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
                field2441[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2441[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2453 > 0) {
            int var49 = this.field2453 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2442) {
                for (int var50 = 0; var50 < this.field2460; var50++) {
                    int var51 = (this.field2453 >> 1) + var50;
                    var48[var50] += this.field2458[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2441[var52];
                }
            }
        }
        float[] var54 = this.field2458;
        this.field2458 = field2441;
        field2441 = var54;
        this.field2453 = var4;
        this.field2460 = var12 - (var4 >> 1);
        this.field2442 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([B)V")
    private final void method1020(byte[] arg0) {
        class202 var2 = new class202(arg0);
        this.field2450 = var2.method1440(20404);
        this.field2454 = var2.method1440(20404);
        this.field2464 = var2.method1440(20404);
        this.field2446 = var2.method1440(20404);
        if (this.field2446 < 0) {
            this.field2446 = ~this.field2446;
            this.field2447 = true;
        }
        int var3 = var2.method1440(20404);
        this.field2459 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1420((byte) 0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1418(var5, (byte) -115, 0, var7);
            this.field2459[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
    public static void method1021() {
        field2465 = null;
        field2445 = null;
        field2438 = null;
        field2456 = null;
        field2436 = null;
        field2449 = null;
        field2457 = null;
        field2441 = null;
        field2455 = null;
        field2451 = null;
        field2448 = null;
        field2439 = null;
        field2462 = null;
        field2437 = null;
        field2452 = null;
        field2443 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I")
    public static final int method1022() {
        int var0 = field2465[field2440] >> field2468 & 0x1;
        field2468++;
        field2440 += field2468 >> 3;
        field2468 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)I")
    public static final int method1023(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2468) {
            int var4 = 8 - field2468;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2465[field2440] >> field2468 & var5) << var2;
            field2468 = 0;
            field2440++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2465[field2440] >> field2468 & var3) << var2;
            field2468 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "([B)V")
    private static final void method1024(byte[] arg0) {
        method1029(arg0, 0);
        field2463 = 0x1 << method1023(4);
        field2444 = 0x1 << method1023(4);
        field2441 = new float[field2444];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2463 : field2444;
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
            int var25 = class241.method1685((byte) -118, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class261.method1809(var25, var26, false);
            }
            if (var1 == 0) {
                field2455 = var18;
                field2451 = var20;
                field2448 = var22;
                field2452 = var24;
            } else {
                field2439 = var18;
                field2462 = var20;
                field2437 = var22;
                field2443 = var24;
            }
        }
        int var2 = method1023(8) + 1;
        field2445 = new class290[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2445[var3] = new class290();
        }
        int var4 = method1023(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1023(16);
        }
        int var6 = method1023(6) + 1;
        field2438 = new class289[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2438[var7] = new class289();
        }
        int var8 = method1023(6) + 1;
        field2456 = new class83[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2456[var9] = new class83();
        }
        int var10 = method1023(6) + 1;
        field2436 = new class167[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2436[var11] = new class167();
        }
        int var12 = method1023(6) + 1;
        field2449 = new boolean[var12];
        field2457 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2449[var13] = method1022() != 0;
            method1023(16);
            method1023(16);
            field2457[var13] = method1023(8);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([I)Luc;")
    public final class39 method1025(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2467 == null) {
            this.field2453 = 0;
            this.field2458 = new float[field2444];
            this.field2467 = new byte[this.field2454];
            this.field2469 = 0;
            this.field2466 = 0;
        }
        while (this.field2466 < this.field2459.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1019(this.field2466);
            if (var3 != null) {
                int var4 = this.field2469;
                int var5 = var3.length;
                if (var5 > this.field2454 - var4) {
                    var5 = this.field2454 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2467[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2469;
                }
                this.field2469 = var4;
            }
            this.field2466++;
        }
        this.field2458 = null;
        byte[] var2 = this.field2467;
        this.field2467 = null;
        return new class39(this.field2450, var2, this.field2464, this.field2446, this.field2447);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lfa;II)Lqj;")
    public static final class155 method1026(class273 arg0, int arg1, int arg2) {
        if (method1028(arg0)) {
            byte[] var3 = arg0.method1877(arg2, arg1, (byte) 127);
            return var3 == null ? null : new class155(var3);
        } else {
            arg0.method1898(arg1, arg2, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)F")
    public static final float method1027(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lfa;)Z")
    private static final boolean method1028(class273 arg0) {
        if (!field2461) {
            byte[] var1 = arg0.method1877(0, 0, (byte) 38);
            if (var1 == null) {
                return false;
            }
            method1024(var1);
            field2461 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([B)V")
    private class155(byte[] arg0) {
        this.method1020(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)V")
    private static final void method1029(byte[] arg0, int arg1) {
        field2465 = arg0;
        field2440 = arg1;
        field2468 = 0;
    }
}
