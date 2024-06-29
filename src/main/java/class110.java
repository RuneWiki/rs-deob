import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class16 {

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "Z")
    private static boolean field2485 = false;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    private static int field2462;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    private static int field2466;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    private int field2467;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    private static int field2470;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    private int field2472;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    private int field2475;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    private static int field2483;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "I")
    private int field2495;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Z")
    private boolean field2484;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "Z")
    private boolean field2487;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[B")
    private static byte[] field2468;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "[B")
    private byte[] field2494;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "[F")
    private static float[] field2473;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[F")
    private static float[] field2474;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[F")
    private float[] field2476;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "[F")
    private static float[] field2477;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[F")
    private static float[] field2478;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "[F")
    private static float[] field2479;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "[F")
    private static float[] field2482;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "[F")
    private static float[] field2486;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "[I")
    private static int[] field2469;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "[I")
    private static int[] field2489;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "[I")
    private static int[] field2491;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "[Lwd;")
    private static class157[] field2465;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "[Lf;")
    public static class36[] field2480;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "[Lhd;")
    private static class53[] field2481;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "[Lka;")
    private static class70[] field2463;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[Z")
    private static boolean[] field2471;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "[[B")
    private byte[][] field2492;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static void method862() {
        field2468 = null;
        field2480 = null;
        field2465 = null;
        field2463 = null;
        field2481 = null;
        field2471 = null;
        field2469 = null;
        field2478 = null;
        field2473 = null;
        field2479 = null;
        field2486 = null;
        field2482 = null;
        field2474 = null;
        field2477 = null;
        field2491 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()I")
    public static final int method863() {
        int var0 = field2468[field2466] >> field2483 & 0x1;
        field2483++;
        field2466 += field2483 >> 3;
        field2483 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BI)V")
    private static final void method864(byte[] arg0, int arg1) {
        field2468 = arg0;
        field2466 = arg1;
        field2483 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I")
    public static final int method865(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2483) {
            int var4 = 8 - field2483;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2468[field2466] >> field2483 & var5) << var2;
            field2483 = 0;
            field2466++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2468[field2466] >> field2483 & var3) << var2;
            field2483 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([I)Ls;")
    public final class125 method866(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2494 == null) {
            this.field2467 = 0;
            this.field2476 = new float[field2462];
            this.field2494 = new byte[this.field2475];
            this.field2493 = 0;
            this.field2495 = 0;
        }
        while (this.field2495 < this.field2492.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method868(this.field2495);
            if (var3 != null) {
                int var4 = this.field2493;
                int var5 = var3.length;
                if (var5 > this.field2475 - var4) {
                    var5 = this.field2475 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2494[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2493;
                }
                this.field2493 = var4;
            }
            this.field2495++;
        }
        this.field2476 = null;
        byte[] var2 = this.field2494;
        this.field2494 = null;
        return new class125(this.field2488, var2, this.field2464, this.field2490, this.field2487);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lfd;)Z")
    private static final boolean method867(class40 arg0) {
        if (!field2485) {
            byte[] var1 = arg0.method267((byte) -124, 0, 0);
            if (var1 == null) {
                return false;
            }
            method871(var1);
            field2485 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)[F")
    private final float[] method868(int arg0) {
        method864(this.field2492[arg0], 0);
        method863();
        int var2 = method865(class25.method173(field2469.length - 1, true));
        boolean var3 = field2471[var2];
        int var4 = var3 ? field2462 : field2470;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method863() != 0;
            var6 = method863() != 0;
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
        class53 var14 = field2481[field2469[var2]];
        int var15 = var14.field1046;
        int var16 = var14.field1048[var15];
        boolean var17 = !field2465[var16].method1211();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1047; var19++) {
            class70 var95 = field2463[var14.field1045[var19]];
            float[] var96 = field2478;
            var95.method510(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1046;
            int var21 = var14.field1048[var20];
            field2465[var21].method1207(field2478, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2478[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2478;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2482 : field2473;
            float[] var30 = var3 ? field2474 : field2479;
            float[] var31 = var3 ? field2477 : field2486;
            int[] var32 = var3 ? field2489 : field2491;
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
            int var35 = class25.method173(var4 - 1, true);
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
                field2478[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2478[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2467 > 0) {
            int var49 = this.field2467 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2484) {
                for (int var50 = 0; var50 < this.field2472; var50++) {
                    int var51 = (this.field2467 >> 1) + var50;
                    var48[var50] += this.field2476[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2478[var52];
                }
            }
        }
        float[] var54 = this.field2476;
        this.field2476 = field2478;
        field2478 = var54;
        this.field2467 = var4;
        this.field2472 = var12 - (var4 >> 1);
        this.field2484 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lfd;II)Lpf;")
    public static final class110 method869(class40 arg0, int arg1, int arg2) {
        if (method867(arg0)) {
            byte[] var3 = arg0.method267((byte) -124, arg2, arg1);
            return var3 == null ? null : new class110(var3);
        } else {
            arg0.method260(arg1, arg2, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)F")
    public static final float method870(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([B)V")
    private static final void method871(byte[] arg0) {
        method864(arg0, 0);
        field2470 = 0x1 << method865(4);
        field2462 = 0x1 << method865(4);
        field2478 = new float[field2462];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2470 : field2462;
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
            int var25 = class25.method173(var17 - 1, true);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class134.method1022(var26, (byte) -49, var25);
            }
            if (var1 == 0) {
                field2473 = var18;
                field2479 = var20;
                field2486 = var22;
                field2491 = var24;
            } else {
                field2482 = var18;
                field2474 = var20;
                field2477 = var22;
                field2489 = var24;
            }
        }
        int var2 = method865(8) + 1;
        field2480 = new class36[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2480[var3] = new class36();
        }
        int var4 = method865(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method865(16);
        }
        int var6 = method865(6) + 1;
        field2465 = new class157[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2465[var7] = new class157();
        }
        int var8 = method865(6) + 1;
        field2463 = new class70[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2463[var9] = new class70();
        }
        int var10 = method865(6) + 1;
        field2481 = new class53[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2481[var11] = new class53();
        }
        int var12 = method865(6) + 1;
        field2471 = new boolean[var12];
        field2469 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2471[var13] = method863() != 0;
            method865(16);
            method865(16);
            field2469[var13] = method865(8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([B)V")
    private final void method872(byte[] arg0) {
        class91 var2 = new class91(arg0);
        this.field2488 = var2.method631(-71);
        this.field2475 = var2.method631(-71);
        this.field2464 = var2.method631(-39);
        this.field2490 = var2.method631(-43);
        if (this.field2490 < 0) {
            this.field2490 = ~this.field2490;
            this.field2487 = true;
        }
        int var3 = var2.method631(-94);
        this.field2492 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method649(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method652(var7, 0, var5, -128);
            this.field2492[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V")
    private class110(byte[] arg0) {
        this.method872(arg0);
    }
}
