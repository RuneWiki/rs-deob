import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class211 extends class504 {

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "Z")
    private static boolean field3013 = false;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    private int field3018;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    private static int field3021;

    @OriginalMember(owner = "client!jda", name = "y", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!jda", name = "A", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
    private static int field3029;

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    private static int field3030;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    private static int field3034;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
    private int field3037;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Z")
    private boolean field3007;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "Z")
    private boolean field3017;

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "[B")
    private static byte[] field3022;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "[B")
    private byte[] field3040;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "[F")
    private static float[] field3009;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "[F")
    private float[] field3010;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "[F")
    private static float[] field3014;

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "[F")
    private static float[] field3024;

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "[F")
    private static float[] field3026;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "[F")
    private static float[] field3031;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "[F")
    private static float[] field3035;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "[F")
    private static float[] field3036;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "[I")
    private static int[] field3028;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "[I")
    private static int[] field3032;

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "[I")
    private static int[] field3033;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "[Lpq;")
    public static class181[] field3015;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "[Lbl;")
    private static class607[] field3016;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "[Lcj;")
    private static class650[] field3011;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "[Lwn;")
    private static class678[] field3012;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "[Z")
    private static boolean[] field3019;

    @OriginalMember(owner = "client!jda", name = "C", descriptor = "[[B")
    private byte[][] field3027;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([B)V")
    private static final void method1346(byte[] arg0) {
        method1350(arg0, 0);
        field3030 = 0x1 << method1347(4);
        field3021 = 0x1 << method1347(4);
        field3009 = new float[field3021];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3030 : field3021;
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
            int var25 = class364.method2153((byte) -27, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class50.method344(256, var25, var26);
            }
            if (var1 == 0) {
                field3014 = var18;
                field3026 = var20;
                field3036 = var22;
                field3032 = var24;
            } else {
                field3024 = var18;
                field3031 = var20;
                field3035 = var22;
                field3033 = var24;
            }
        }
        int var2 = method1347(8) + 1;
        field3015 = new class181[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3015[var3] = new class181();
        }
        int var4 = method1347(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1347(16);
        }
        int var6 = method1347(6) + 1;
        field3016 = new class607[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3016[var7] = new class607();
        }
        int var8 = method1347(6) + 1;
        field3011 = new class650[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3011[var9] = new class650();
        }
        int var10 = method1347(6) + 1;
        field3012 = new class678[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3012[var11] = new class678();
        }
        int var12 = method1347(6) + 1;
        field3019 = new boolean[var12];
        field3028 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3019[var13] = method1355() != 0;
            method1347(16);
            method1347(16);
            field3028[var13] = method1347(8);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
    public static final int method1347(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3034) {
            int var4 = 8 - field3034;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3022[field3029] >> field3034 & var5) << var2;
            field3034 = 0;
            field3029++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3022[field3029] >> field3034 & var3) << var2;
            field3034 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "()V")
    public static void method1348() {
        field3022 = null;
        field3015 = null;
        field3016 = null;
        field3011 = null;
        field3012 = null;
        field3019 = null;
        field3028 = null;
        field3009 = null;
        field3014 = null;
        field3026 = null;
        field3036 = null;
        field3024 = null;
        field3031 = null;
        field3035 = null;
        field3032 = null;
        field3033 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([I)Lfc;")
    public final class241 method1349(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3040 == null) {
            this.field3037 = 0;
            this.field3010 = new float[field3021];
            this.field3040 = new byte[this.field3018];
            this.field3039 = 0;
            this.field3038 = 0;
        }
        while (this.field3038 < this.field3027.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1357(this.field3038);
            if (var3 != null) {
                int var4 = this.field3039;
                int var5 = var3.length;
                if (var5 > this.field3018 - var4) {
                    var5 = this.field3018 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3040[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3039;
                }
                this.field3039 = var4;
            }
            this.field3038++;
        }
        this.field3010 = null;
        byte[] var2 = this.field3040;
        this.field3040 = null;
        return new class241(this.field3025, var2, this.field3023, this.field3020, this.field3007);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "([BI)V")
    private static final void method1350(byte[] arg0, int arg1) {
        field3022 = arg0;
        field3029 = arg1;
        field3034 = 0;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lbi;)Z")
    private static final boolean method1351(class449 arg0) {
        if (!field3013) {
            byte[] var1 = arg0.method2537(false, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1346(var1);
            field3013 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lbi;I)Ljda;")
    public static final class211 method1352(class449 arg0, int arg1) {
        if (method1351(arg0)) {
            byte[] var2 = arg0.method2531(arg1, 0);
            return var2 == null ? null : new class211(var2);
        } else {
            arg0.method2549(arg1, 3015);
            return null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "([B)V")
    private final void method1353(byte[] arg0) {
        class335 var2 = new class335(arg0);
        this.field3025 = var2.method2045(-98);
        this.field3018 = var2.method2045(-98);
        this.field3023 = var2.method2045(-98);
        this.field3020 = var2.method2045(-98);
        if (this.field3020 < 0) {
            this.field3020 = ~this.field3020;
            this.field3007 = true;
        }
        int var3 = var2.method2045(-98);
        this.field3027 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2034(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1985((byte) 0, var5, var7, 0);
            this.field3027[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lbi;II)Ljda;")
    public static final class211 method1354(class449 arg0, int arg1, int arg2) {
        if (method1351(arg0)) {
            byte[] var3 = arg0.method2537(false, arg1, arg2);
            return var3 == null ? null : new class211(var3);
        } else {
            arg0.method2538(false, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "()I")
    public static final int method1355() {
        int var0 = field3022[field3029] >> field3034 & 0x1;
        field3034++;
        field3029 += field3034 >> 3;
        field3034 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)F")
    public static final float method1356(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)[F")
    private final float[] method1357(int arg0) {
        method1350(this.field3027[arg0], 0);
        method1355();
        int var2 = method1347(class364.method2153((byte) -10, field3028.length - 1));
        boolean var3 = field3019[var2];
        int var4 = var3 ? field3021 : field3030;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1355() != 0;
            var6 = method1355() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3030 >> 2);
            var9 = (field3030 >> 2) + (var4 >> 2);
            var10 = field3030 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3030 >> 2);
            var12 = (field3030 >> 2) + (var4 - (var4 >> 2));
            var13 = field3030 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class678 var14 = field3012[field3028[var2]];
        int var15 = var14.field9572;
        int var16 = var14.field9575[var15];
        boolean var17 = !field3016[var16].method3335();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field9574; var19++) {
            class650 var95 = field3011[var14.field9573[var19]];
            float[] var96 = field3009;
            var95.method3563(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field9572;
            int var21 = var14.field9575[var20];
            field3016[var21].method3331(field3009, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3009[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3009;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3024 : field3014;
            float[] var30 = var3 ? field3031 : field3026;
            float[] var31 = var3 ? field3035 : field3036;
            int[] var32 = var3 ? field3033 : field3032;
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
            int var35 = class364.method2153((byte) -16, var4 - 1);
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
                field3009[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3009[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3037 > 0) {
            int var49 = this.field3037 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3017) {
                for (int var50 = 0; var50 < this.field3008; var50++) {
                    int var51 = (this.field3037 >> 1) + var50;
                    var48[var50] += this.field3010[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3009[var52];
                }
            }
        }
        float[] var54 = this.field3010;
        this.field3010 = field3009;
        field3009 = var54;
        this.field3037 = var4;
        this.field3008 = var12 - (var4 >> 1);
        this.field3017 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "([B)V")
    private class211(byte[] arg0) {
        this.method1353(arg0);
    }
}
