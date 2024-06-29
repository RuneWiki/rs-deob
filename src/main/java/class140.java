import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class140 extends class103 {

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Z")
    private static boolean field2480 = false;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private int field2447;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    private static int field2449;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private static int field2453;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    private int field2461;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field2466;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    private static int field2470;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    private static int field2475;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    private int field2477;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    private int field2479;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Z")
    private boolean field2452;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Z")
    private boolean field2463;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "[B")
    private static byte[] field2464;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "[B")
    private byte[] field2476;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[F")
    private static float[] field2450;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[F")
    private static float[] field2451;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[F")
    private static float[] field2457;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[F")
    private static float[] field2462;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[F")
    private static float[] field2465;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "[F")
    private float[] field2471;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "[F")
    private static float[] field2474;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "[F")
    private static float[] field2478;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[I")
    private static int[] field2468;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "[I")
    private static int[] field2469;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[I")
    private static int[] field2473;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[Laj;")
    public static class132[] field2472;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[Lvc;")
    private static class198[] field2448;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "[Lnc;")
    private static class239[] field2460;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "[Lic;")
    private static class253[] field2456;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[Z")
    private static boolean[] field2458;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "[[B")
    private byte[][] field2454;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
    public static void method1003() {
        field2464 = null;
        field2472 = null;
        field2448 = null;
        field2460 = null;
        field2456 = null;
        field2458 = null;
        field2468 = null;
        field2462 = null;
        field2474 = null;
        field2451 = null;
        field2450 = null;
        field2478 = null;
        field2465 = null;
        field2457 = null;
        field2469 = null;
        field2473 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([B)V")
    private static final void method1004(byte[] arg0) {
        method1010(arg0, 0);
        field2470 = 0x1 << method1006(4);
        field2453 = 0x1 << method1006(4);
        field2462 = new float[field2453];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2470 : field2453;
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
            int var25 = client.method627(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class189.method1249(var26, 2, var25);
            }
            if (var1 == 0) {
                field2474 = var18;
                field2451 = var20;
                field2450 = var22;
                field2469 = var24;
            } else {
                field2478 = var18;
                field2465 = var20;
                field2457 = var22;
                field2473 = var24;
            }
        }
        int var2 = method1006(8) + 1;
        field2472 = new class132[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2472[var3] = new class132();
        }
        int var4 = method1006(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1006(16);
        }
        int var6 = method1006(6) + 1;
        field2448 = new class198[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2448[var7] = new class198();
        }
        int var8 = method1006(6) + 1;
        field2460 = new class239[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2460[var9] = new class239();
        }
        int var10 = method1006(6) + 1;
        field2456 = new class253[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2456[var11] = new class253();
        }
        int var12 = method1006(6) + 1;
        field2458 = new boolean[var12];
        field2468 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2458[var13] = method1009() != 0;
            method1006(16);
            method1006(16);
            field2468[var13] = method1006(8);
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)[F")
    private final float[] method1005(int arg0) {
        method1010(this.field2454[arg0], 0);
        method1009();
        int var2 = method1006(client.method627(0, field2468.length - 1));
        boolean var3 = field2458[var2];
        int var4 = var3 ? field2453 : field2470;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1009() != 0;
            var6 = method1009() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2470 >> 2);
            var9 = (field2470 >> 2) + (var4 >> 2);
            var10 = field2470 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2470 >> 2);
            var12 = (field2470 >> 2) + (var4 - (var4 >> 2));
            var13 = field2470 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class253 var14 = field2456[field2468[var2]];
        int var15 = var14.field4483;
        int var16 = var14.field4484[var15];
        boolean var17 = !field2448[var16].method1295();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4482; var19++) {
            class239 var95 = field2460[var14.field4481[var19]];
            float[] var96 = field2462;
            var95.method1578(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4483;
            int var21 = var14.field4484[var20];
            field2448[var21].method1294(field2462, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2462[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2462;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2478 : field2474;
            float[] var30 = var3 ? field2465 : field2451;
            float[] var31 = var3 ? field2457 : field2450;
            int[] var32 = var3 ? field2473 : field2469;
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
            int var35 = client.method627(0, var4 - 1);
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
                field2462[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2462[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2467 > 0) {
            int var49 = this.field2467 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2463) {
                for (int var50 = 0; var50 < this.field2461; var50++) {
                    int var51 = (this.field2467 >> 1) + var50;
                    var48[var50] += this.field2471[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2462[var52];
                }
            }
        }
        float[] var54 = this.field2471;
        this.field2471 = field2462;
        field2462 = var54;
        this.field2467 = var4;
        this.field2461 = var12 - (var4 >> 1);
        this.field2463 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)I")
    public static final int method1006(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2449) {
            int var4 = 8 - field2449;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2464[field2475] >> field2449 & var5) << var2;
            field2449 = 0;
            field2475++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2464[field2475] >> field2449 & var3) << var2;
            field2449 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([I)Lgj;")
    public final class128 method1007(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2476 == null) {
            this.field2467 = 0;
            this.field2471 = new float[field2453];
            this.field2476 = new byte[this.field2466];
            this.field2479 = 0;
            this.field2477 = 0;
        }
        while (this.field2477 < this.field2454.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1005(this.field2477);
            if (var3 != null) {
                int var4 = this.field2479;
                int var5 = var3.length;
                if (var5 > this.field2466 - var4) {
                    var5 = this.field2466 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2476[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2479;
                }
                this.field2479 = var4;
            }
            this.field2477++;
        }
        this.field2471 = null;
        byte[] var2 = this.field2476;
        this.field2476 = null;
        return new class128(this.field2447, var2, this.field2459, this.field2455, this.field2452);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lma;)Z")
    private static final boolean method1008(class105 arg0) {
        if (!field2480) {
            byte[] var1 = arg0.method775(0, 0, -24799);
            if (var1 == null) {
                return false;
            }
            method1004(var1);
            field2480 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()I")
    public static final int method1009() {
        int var0 = field2464[field2475] >> field2449 & 0x1;
        field2449++;
        field2475 += field2449 >> 3;
        field2449 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)V")
    private static final void method1010(byte[] arg0, int arg1) {
        field2464 = arg0;
        field2475 = arg1;
        field2449 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([B)V")
    private final void method1011(byte[] arg0) {
        class85 var2 = new class85(arg0);
        this.field2447 = var2.method568(19845);
        this.field2466 = var2.method568(19845);
        this.field2459 = var2.method568(19845);
        this.field2455 = var2.method568(19845);
        if (this.field2455 < 0) {
            this.field2455 = ~this.field2455;
            this.field2452 = true;
        }
        int var3 = var2.method568(19845);
        this.field2454 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method564((byte) 111);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method597(0, false, var5, var7);
            this.field2454[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)F")
    public static final float method1012(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lma;II)Lwd;")
    public static final class140 method1013(class105 arg0, int arg1, int arg2) {
        if (method1008(arg0)) {
            byte[] var3 = arg0.method775(arg1, arg2, -24799);
            return var3 == null ? null : new class140(var3);
        } else {
            arg0.method777((byte) -60, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    private class140(byte[] arg0) {
        this.method1011(arg0);
    }
}
