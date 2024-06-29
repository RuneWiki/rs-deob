import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class187 extends class71 {

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Z")
    private static boolean field2545 = false;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    private int field2547;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    private static int field2552;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "I")
    private static int field2561;

    @OriginalMember(owner = "client!kba", name = "A", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!kba", name = "B", descriptor = "I")
    private static int field2563;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
    private int field2570;

    @OriginalMember(owner = "client!kba", name = "N", descriptor = "I")
    private static int field2575;

    @OriginalMember(owner = "client!kba", name = "P", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!kba", name = "Q", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!kba", name = "H", descriptor = "Z")
    private boolean field2569;

    @OriginalMember(owner = "client!kba", name = "M", descriptor = "Z")
    private boolean field2574;

    @OriginalMember(owner = "client!kba", name = "L", descriptor = "[B")
    private static byte[] field2573;

    @OriginalMember(owner = "client!kba", name = "O", descriptor = "[B")
    private byte[] field2576;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "[F")
    private static float[] field2546;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "[F")
    private static float[] field2551;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "[F")
    private static float[] field2553;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "[F")
    private float[] field2554;

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "[F")
    private static float[] field2557;

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "[F")
    private static float[] field2566;

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "[F")
    private static float[] field2568;

    @OriginalMember(owner = "client!kba", name = "K", descriptor = "[F")
    private static float[] field2572;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
    private static int[] field2550;

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "[I")
    private static int[] field2559;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "[I")
    private static int[] field2560;

    @OriginalMember(owner = "client!kba", name = "F", descriptor = "[Ldba;")
    private static class295[] field2567;

    @OriginalMember(owner = "client!kba", name = "J", descriptor = "[Lbfa;")
    private static class576[] field2571;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "[Lwaa;")
    public static class624[] field2555;

    @OriginalMember(owner = "client!kba", name = "C", descriptor = "[Lnaa;")
    private static class632[] field2564;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "[Z")
    private static boolean[] field2558;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "[[B")
    private byte[][] field2556;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Luu;II)Lkba;", line = 3)
    public static final class187 method1166(class237 arg0, int arg1, int arg2) {
        if (method1173(arg0)) {
            byte[] var3 = arg0.method1572(arg1, 0, arg2);
            return var3 == null ? null : new class187(var3);
        } else {
            arg0.method1570(-2, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Luu;I)Lkba;", line = 22)
    public static final class187 method1167(class237 arg0, int arg1) {
        if (method1173(arg0)) {
            byte[] var2 = arg0.method1583(arg1, -94);
            return var2 == null ? null : new class187(var2);
        } else {
            arg0.method1578(arg1, (byte) -81);
            return null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)[F", line = 36)
    private final float[] method1168(int arg0) {
        method1175(this.field2556[arg0], 0);
        method1171();
        int var2 = method1176(class200.method1219(field2560.length - 1, 8));
        boolean var3 = field2558[var2];
        int var4 = var3 ? field2561 : field2563;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1171() != 0;
            var6 = method1171() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2563 >> 2);
            var9 = (field2563 >> 2) + (var4 >> 2);
            var10 = field2563 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2563 >> 2);
            var12 = (field2563 >> 2) + (var4 - (var4 >> 2));
            var13 = field2563 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class576 var14 = field2571[field2560[var2]];
        int var15 = var14.field7929;
        int var16 = var14.field7928[var15];
        boolean var17 = !field2564[var16].method3542();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7926; var19++) {
            class295 var95 = field2567[var14.field7927[var19]];
            float[] var96 = field2546;
            var95.method1946(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7929;
            int var21 = var14.field7928[var20];
            field2564[var21].method3548(field2546, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2546[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2546;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2566 : field2568;
            float[] var30 = var3 ? field2572 : field2553;
            float[] var31 = var3 ? field2551 : field2557;
            int[] var32 = var3 ? field2559 : field2550;
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
            int var35 = class200.method1219(var4 - 1, 8);
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
                field2546[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2546[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2548 > 0) {
            int var49 = this.field2548 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2574) {
                for (int var50 = 0; var50 < this.field2547; var50++) {
                    int var51 = (this.field2548 >> 1) + var50;
                    var48[var50] += this.field2554[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2546[var52];
                }
            }
        }
        float[] var54 = this.field2554;
        this.field2554 = field2546;
        field2546 = var54;
        this.field2548 = var4;
        this.field2547 = var12 - (var4 >> 1);
        this.field2574 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)F", line = 449)
    public static final float method1169(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "()V", line = 460)
    public static void method1170() {
        field2573 = null;
        field2555 = null;
        field2564 = null;
        field2567 = null;
        field2571 = null;
        field2558 = null;
        field2560 = null;
        field2546 = null;
        field2568 = null;
        field2553 = null;
        field2557 = null;
        field2566 = null;
        field2572 = null;
        field2551 = null;
        field2550 = null;
        field2559 = null;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "()I", line = 482)
    public static final int method1171() {
        int var0 = field2573[field2575] >> field2552 & 0x1;
        field2552++;
        field2575 += field2552 >> 3;
        field2552 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "([B)V", line = 495)
    private final void method1172(byte[] arg0) {
        class63 var2 = new class63(arg0);
        this.field2570 = var2.method457(-14532);
        this.field2562 = var2.method457(-14532);
        this.field2565 = var2.method457(-14532);
        this.field2549 = var2.method457(-14532);
        if (this.field2549 < 0) {
            this.field2549 = ~this.field2549;
            this.field2569 = true;
        }
        int var3 = var2.method457(-14532);
        this.field2556 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method505((byte) -119);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method449(0, var5, var7, (byte) -124);
            this.field2556[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Luu;)Z", line = 541)
    private static final boolean method1173(class237 arg0) {
        if (!field2545) {
            byte[] var1 = arg0.method1572(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1174(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "([B)V", line = 568)
    private static final void method1174(byte[] arg0) {
        method1175(arg0, 0);
        field2563 = 0x1 << method1176(4);
        field2561 = 0x1 << method1176(4);
        field2546 = new float[field2561];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2563 : field2561;
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
            int var25 = class200.method1219(var17 - 1, 8);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class750.method4167(var25, 0, var26);
            }
            if (var1 == 0) {
                field2568 = var18;
                field2553 = var20;
                field2557 = var22;
                field2550 = var24;
            } else {
                field2566 = var18;
                field2572 = var20;
                field2551 = var22;
                field2559 = var24;
            }
        }
        int var2 = method1176(8) + 1;
        field2555 = new class624[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2555[var3] = new class624();
        }
        int var4 = method1176(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1176(16);
        }
        int var6 = method1176(6) + 1;
        field2564 = new class632[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2564[var7] = new class632();
        }
        int var8 = method1176(6) + 1;
        field2567 = new class295[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2567[var9] = new class295();
        }
        int var10 = method1176(6) + 1;
        field2571 = new class576[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2571[var11] = new class576();
        }
        int var12 = method1176(6) + 1;
        field2558 = new boolean[var12];
        field2560 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2558[var13] = method1171() != 0;
            method1176(16);
            method1176(16);
            field2560[var13] = method1176(8);
        }
        field2545 = true;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "([BI)V", line = 721)
    private static final void method1175(byte[] arg0, int arg1) {
        field2573 = arg0;
        field2575 = arg1;
        field2552 = 0;
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)I", line = 727)
    public static final int method1176(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2552) {
            int var4 = 8 - field2552;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2573[field2575] >> field2552 & var5) << var2;
            field2552 = 0;
            field2575++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2573[field2575] >> field2552 & var3) << var2;
            field2552 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "([B)V", line = 757)
    private class187(byte[] arg0) {
        this.method1172(arg0);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "([I)Lwo;", line = 766)
    public final class695 method1177(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2576 == null) {
            this.field2548 = 0;
            this.field2554 = new float[field2561];
            this.field2576 = new byte[this.field2562];
            this.field2577 = 0;
            this.field2578 = 0;
        }
        while (this.field2578 < this.field2556.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1168(this.field2578);
            if (var3 != null) {
                int var4 = this.field2577;
                int var5 = var3.length;
                if (var5 > this.field2562 - var4) {
                    var5 = this.field2562 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2576[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2577;
                }
                this.field2577 = var4;
            }
            this.field2578++;
        }
        this.field2554 = null;
        byte[] var2 = this.field2576;
        this.field2576 = null;
        return new class695(this.field2570, var2, this.field2565, this.field2549, this.field2569);
    }
}
