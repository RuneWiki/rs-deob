import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class172 extends class401 {

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "Z")
    private static boolean field2498 = false;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    private static int field2483;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    private int field2484;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    private static int field2491;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    private int field2497;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    private int field2500;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    private static int field2505;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    private static int field2507;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!vp", name = "Q", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "I")
    private int field2513;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
    private boolean field2480;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Z")
    private boolean field2482;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "[B")
    private static byte[] field2494;

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "[B")
    private byte[] field2511;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "[F")
    private static float[] field2487;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[F")
    private static float[] field2488;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "[F")
    private static float[] field2489;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "[F")
    private float[] field2490;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "[F")
    private static float[] field2499;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "[F")
    private static float[] field2501;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "[F")
    private static float[] field2503;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "[F")
    private static float[] field2508;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "[I")
    private static int[] field2486;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "[I")
    private static int[] field2504;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "[I")
    private static int[] field2506;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "[Luu;")
    public static class258[] field2502;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lis;")
    private static class464[] field2495;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "[Lev;")
    private static class644[] field2496;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "[Lmo;")
    private static class695[] field2509;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "[Z")
    private static boolean[] field2485;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[[B")
    private byte[][] field2481;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)F")
    public static final float method1211(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()I")
    public static final int method1212() {
        int var0 = field2494[field2505] >> field2491 & 0x1;
        field2491++;
        field2505 += field2491 >> 3;
        field2491 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)[F")
    private final float[] method1213(int arg0) {
        method1218(this.field2481[arg0], 0);
        method1212();
        int var2 = method1219(class55.method457(24266, field2486.length - 1));
        boolean var3 = field2485[var2];
        int var4 = var3 ? field2507 : field2483;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1212() != 0;
            var6 = method1212() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2483 >> 2);
            var9 = (field2483 >> 2) + (var4 >> 2);
            var10 = field2483 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2483 >> 2);
            var12 = (field2483 >> 2) + (var4 - (var4 >> 2));
            var13 = field2483 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class464 var14 = field2495[field2486[var2]];
        int var15 = var14.field6387;
        int var16 = var14.field6389[var15];
        boolean var17 = !field2496[var16].method3587();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6386; var19++) {
            class695 var95 = field2509[var14.field6388[var19]];
            float[] var96 = field2488;
            var95.method3907(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6387;
            int var21 = var14.field6389[var20];
            field2496[var21].method3593(field2488, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2488[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2488;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2503 : field2487;
            float[] var30 = var3 ? field2508 : field2499;
            float[] var31 = var3 ? field2489 : field2501;
            int[] var32 = var3 ? field2504 : field2506;
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
            int var35 = class55.method457(24266, var4 - 1);
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
                field2488[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2488[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2484 > 0) {
            int var49 = this.field2484 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2482) {
                for (int var50 = 0; var50 < this.field2510; var50++) {
                    int var51 = (this.field2484 >> 1) + var50;
                    var48[var50] += this.field2490[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2488[var52];
                }
            }
        }
        float[] var54 = this.field2490;
        this.field2490 = field2488;
        field2488 = var54;
        this.field2484 = var4;
        this.field2510 = var12 - (var4 >> 1);
        this.field2482 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lsea;II)Lvp;")
    public static final class172 method1214(class648 arg0, int arg1, int arg2) {
        if (method1217(arg0)) {
            byte[] var3 = arg0.method3654(-15615, arg1, arg2);
            return var3 == null ? null : new class172(var3);
        } else {
            arg0.method3630(arg2, arg1, -120);
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([I)Lbu;")
    public final class19 method1215(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2511 == null) {
            this.field2484 = 0;
            this.field2490 = new float[field2507];
            this.field2511 = new byte[this.field2493];
            this.field2512 = 0;
            this.field2513 = 0;
        }
        while (this.field2513 < this.field2481.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1213(this.field2513);
            if (var3 != null) {
                int var4 = this.field2512;
                int var5 = var3.length;
                if (var5 > this.field2493 - var4) {
                    var5 = this.field2493 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2511[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2512;
                }
                this.field2512 = var4;
            }
            this.field2513++;
        }
        this.field2490 = null;
        byte[] var2 = this.field2511;
        this.field2511 = null;
        return new class19(this.field2500, var2, this.field2497, this.field2492, this.field2480);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lsea;I)Lvp;")
    public static final class172 method1216(class648 arg0, int arg1) {
        if (method1217(arg0)) {
            byte[] var2 = arg0.method3632(true, arg1);
            return var2 == null ? null : new class172(var2);
        } else {
            arg0.method3623(-110, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lsea;)Z")
    private static final boolean method1217(class648 arg0) {
        if (!field2498) {
            byte[] var1 = arg0.method3654(-15615, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1221(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)V")
    private static final void method1218(byte[] arg0, int arg1) {
        field2494 = arg0;
        field2505 = arg1;
        field2491 = 0;
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
    public static final int method1219(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2491) {
            int var4 = 8 - field2491;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2494[field2505] >> field2491 & var5) << var2;
            field2491 = 0;
            field2505++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2494[field2505] >> field2491 & var3) << var2;
            field2491 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()V")
    public static void method1220() {
        field2494 = null;
        field2502 = null;
        field2496 = null;
        field2509 = null;
        field2495 = null;
        field2485 = null;
        field2486 = null;
        field2488 = null;
        field2487 = null;
        field2499 = null;
        field2501 = null;
        field2503 = null;
        field2508 = null;
        field2489 = null;
        field2506 = null;
        field2504 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([B)V")
    private static final void method1221(byte[] arg0) {
        method1218(arg0, 0);
        field2483 = 0x1 << method1219(4);
        field2507 = 0x1 << method1219(4);
        field2488 = new float[field2507];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2483 : field2507;
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
            int var25 = class55.method457(24266, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class483.method2711(var26, var25, 120);
            }
            if (var1 == 0) {
                field2487 = var18;
                field2499 = var20;
                field2501 = var22;
                field2506 = var24;
            } else {
                field2503 = var18;
                field2508 = var20;
                field2489 = var22;
                field2504 = var24;
            }
        }
        int var2 = method1219(8) + 1;
        field2502 = new class258[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2502[var3] = new class258();
        }
        int var4 = method1219(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1219(16);
        }
        int var6 = method1219(6) + 1;
        field2496 = new class644[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2496[var7] = new class644();
        }
        int var8 = method1219(6) + 1;
        field2509 = new class695[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2509[var9] = new class695();
        }
        int var10 = method1219(6) + 1;
        field2495 = new class464[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2495[var11] = new class464();
        }
        int var12 = method1219(6) + 1;
        field2485 = new boolean[var12];
        field2486 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2485[var13] = method1212() != 0;
            method1219(16);
            method1219(16);
            field2486[var13] = method1219(8);
        }
        field2498 = true;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "([B)V")
    private final void method1222(byte[] arg0) {
        class501 var2 = new class501(arg0);
        this.field2500 = var2.method2840(false);
        this.field2493 = var2.method2840(false);
        this.field2497 = var2.method2840(false);
        this.field2492 = var2.method2840(false);
        if (this.field2492 < 0) {
            this.field2492 = ~this.field2492;
            this.field2480 = true;
        }
        int var3 = var2.method2840(false);
        this.field2481 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2874((byte) -75);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2857(var7, var5, (byte) 125, 0);
            this.field2481[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "([B)V")
    private class172(byte[] arg0) {
        this.method1222(arg0);
    }
}
