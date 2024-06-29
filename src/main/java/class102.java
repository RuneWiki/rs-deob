import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class32 {

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "Z")
    private static boolean field2493 = false;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    private static int field2471;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    private int field2475;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    private int field2487;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    private static int field2492;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    private static int field2495;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field2496;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    private static int field2501;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Z")
    private boolean field2480;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Z")
    private boolean field2483;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "[B")
    private static byte[] field2489;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "[B")
    private byte[] field2498;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "[F")
    private float[] field2469;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "[F")
    private static float[] field2477;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "[F")
    private static float[] field2479;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "[F")
    private static float[] field2482;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "[F")
    private static float[] field2486;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "[F")
    private static float[] field2494;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "[F")
    private static float[] field2497;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "[F")
    private static float[] field2499;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "[I")
    private static int[] field2484;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "[I")
    private static int[] field2490;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
    private static int[] field2491;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "[Lbb;")
    private static class10[] field2478;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[Lsf;")
    private static class131[] field2476;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[Lbf;")
    private static class14[] field2473;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "[Lhf;")
    public static class55[] field2485;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "[Z")
    private static boolean[] field2474;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[[B")
    private byte[][] field2481;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)[F")
    private final float[] method840(int arg0) {
        method846(this.field2481[arg0], 0);
        method843();
        int var2 = method850(class47.method327(field2490.length - 1, (byte) 50));
        boolean var3 = field2474[var2];
        int var4 = var3 ? field2495 : field2492;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method843() != 0;
            var6 = method843() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2492 >> 2);
            var9 = (field2492 >> 2) + (var4 >> 2);
            var10 = field2492 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2492 >> 2);
            var12 = (field2492 >> 2) + (var4 - (var4 >> 2));
            var13 = field2492 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class10 var14 = field2478[field2490[var2]];
        int var15 = var14.field182;
        int var16 = var14.field181[var15];
        boolean var17 = !field2473[var16].method86();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field179; var19++) {
            class131 var95 = field2476[var14.field180[var19]];
            float[] var96 = field2494;
            var95.method979(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field182;
            int var21 = var14.field181[var20];
            field2473[var21].method88(field2494, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2494[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2494;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2486 : field2499;
            float[] var30 = var3 ? field2479 : field2477;
            float[] var31 = var3 ? field2497 : field2482;
            int[] var32 = var3 ? field2491 : field2484;
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
            int var35 = class47.method327(var4 - 1, (byte) 121);
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
                field2494[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2494[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2472 > 0) {
            int var49 = this.field2472 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2480) {
                for (int var50 = 0; var50 < this.field2488; var50++) {
                    int var51 = (this.field2472 >> 1) + var50;
                    var48[var50] += this.field2469[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2494[var52];
                }
            }
        }
        float[] var54 = this.field2469;
        this.field2469 = field2494;
        field2494 = var54;
        this.field2472 = var4;
        this.field2488 = var12 - (var4 >> 1);
        this.field2480 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lla;II)Loe;")
    public static final class102 method841(class77 arg0, int arg1, int arg2) {
        if (method849(arg0)) {
            byte[] var3 = arg0.method585(arg1, 85, arg2);
            return var3 == null ? null : new class102(var3);
        } else {
            arg0.method594(arg1, 1429, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
    public static void method842() {
        field2489 = null;
        field2485 = null;
        field2473 = null;
        field2476 = null;
        field2478 = null;
        field2474 = null;
        field2490 = null;
        field2494 = null;
        field2499 = null;
        field2477 = null;
        field2482 = null;
        field2486 = null;
        field2479 = null;
        field2497 = null;
        field2484 = null;
        field2491 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()I")
    public static final int method843() {
        int var0 = field2489[field2501] >> field2471 & 0x1;
        field2471++;
        field2501 += field2471 >> 3;
        field2471 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([B)V")
    private static final void method844(byte[] arg0) {
        method846(arg0, 0);
        field2492 = 0x1 << method850(4);
        field2495 = 0x1 << method850(4);
        field2494 = new float[field2495];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2492 : field2495;
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
            int var25 = class47.method327(var17 - 1, (byte) 68);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class141.method1053(var26, -1, var25);
            }
            if (var1 == 0) {
                field2499 = var18;
                field2477 = var20;
                field2482 = var22;
                field2484 = var24;
            } else {
                field2486 = var18;
                field2479 = var20;
                field2497 = var22;
                field2491 = var24;
            }
        }
        int var2 = method850(8) + 1;
        field2485 = new class55[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2485[var3] = new class55();
        }
        int var4 = method850(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method850(16);
        }
        int var6 = method850(6) + 1;
        field2473 = new class14[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2473[var7] = new class14();
        }
        int var8 = method850(6) + 1;
        field2476 = new class131[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2476[var9] = new class131();
        }
        int var10 = method850(6) + 1;
        field2478 = new class10[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2478[var11] = new class10();
        }
        int var12 = method850(6) + 1;
        field2474 = new boolean[var12];
        field2490 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2474[var13] = method843() != 0;
            method850(16);
            method850(16);
            field2490[var13] = method850(8);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([B)V")
    private final void method845(byte[] arg0) {
        class95 var2 = new class95(arg0);
        this.field2475 = var2.method740((byte) -70);
        this.field2468 = var2.method740((byte) 38);
        this.field2470 = var2.method740((byte) -69);
        this.field2487 = var2.method740((byte) 91);
        if (this.field2487 < 0) {
            this.field2487 = ~this.field2487;
            this.field2483 = true;
        }
        int var3 = var2.method740((byte) -108);
        this.field2481 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method790((byte) 73);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method751(110, var7, var5, 0);
            this.field2481[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BI)V")
    private static final void method846(byte[] arg0, int arg1) {
        field2489 = arg0;
        field2501 = arg1;
        field2471 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([I)Lpe;")
    public final class109 method847(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2498 == null) {
            this.field2472 = 0;
            this.field2469 = new float[field2495];
            this.field2498 = new byte[this.field2468];
            this.field2496 = 0;
            this.field2500 = 0;
        }
        while (this.field2500 < this.field2481.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method840(this.field2500);
            if (var3 != null) {
                int var4 = this.field2496;
                int var5 = var3.length;
                if (var5 > this.field2468 - var4) {
                    var5 = this.field2468 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2498[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2496;
                }
                this.field2496 = var4;
            }
            this.field2500++;
        }
        this.field2469 = null;
        byte[] var2 = this.field2498;
        this.field2498 = null;
        return new class109(this.field2475, var2, this.field2470, this.field2487, this.field2483);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)F")
    public static final float method848(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lla;)Z")
    private static final boolean method849(class77 arg0) {
        if (!field2493) {
            byte[] var1 = arg0.method585(0, 115, 0);
            if (var1 == null) {
                return false;
            }
            method844(var1);
            field2493 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "([B)V")
    private class102(byte[] arg0) {
        this.method845(arg0);
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)I")
    public static final int method850(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2471) {
            int var4 = 8 - field2471;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2489[field2501] >> field2471 & var5) << var2;
            field2471 = 0;
            field2501++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2489[field2501] >> field2471 & var3) << var2;
            field2471 += arg0;
        }
        return var1;
    }
}
