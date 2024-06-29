import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class181 extends class287 {

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Z")
    private static boolean field3018 = false;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    private static int field3013;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    private static int field3019;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    private int field3020;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    private int field3029;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    private static int field3033;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    private static int field3035;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    private int field3044;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Z")
    private boolean field3014;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "Z")
    private boolean field3023;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "[B")
    private static byte[] field3039;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "[B")
    private byte[] field3046;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[F")
    private static float[] field3015;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "[F")
    private static float[] field3021;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "[F")
    private static float[] field3022;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "[F")
    private static float[] field3024;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "[F")
    private static float[] field3025;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "[F")
    private static float[] field3032;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "[F")
    private float[] field3040;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "[F")
    private static float[] field3041;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "[I")
    private static int[] field3017;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "[I")
    private static int[] field3037;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "[I")
    private static int[] field3038;

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[Lc;")
    private static class126[] field3027;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "[Lrd;")
    private static class208[] field3043;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "[Lpe;")
    public static class271[] field3036;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[Lfa;")
    private static class273[] field3026;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "[Z")
    private static boolean[] field3034;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "[[B")
    private byte[][] field3031;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()I", line = 5)
    public static final int method1340() {
        int var0 = field3039[field3019] >> field3035 & 0x1;
        field3035++;
        field3019 += field3035 >> 3;
        field3035 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)F", line = 23)
    public static final float method1341(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([B)V", line = 37)
    private final void method1342(byte[] arg0) {
        class170 var2 = new class170(arg0);
        this.field3030 = var2.method1233((byte) -77);
        this.field3016 = var2.method1233((byte) -77);
        this.field3042 = var2.method1233((byte) -77);
        this.field3029 = var2.method1233((byte) -77);
        if (this.field3029 < 0) {
            this.field3029 = ~this.field3029;
            this.field3014 = true;
        }
        int var3 = var2.method1233((byte) -77);
        this.field3031 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1221(124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1243(var5, 128, 0, var7);
            this.field3031[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([I)Luc;", line = 80)
    public final class107 method1343(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3046 == null) {
            this.field3020 = 0;
            this.field3040 = new float[field3033];
            this.field3046 = new byte[this.field3016];
            this.field3044 = 0;
            this.field3045 = 0;
        }
        while (this.field3045 < this.field3031.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1350(this.field3045);
            if (var2 != null) {
                int var3 = this.field3044;
                int var4 = var2.length;
                if (var4 > this.field3016 - var3) {
                    var4 = this.field3016 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field3046[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field3044;
                }
                this.field3044 = var3;
            }
            this.field3045++;
        }
        this.field3040 = null;
        byte[] var7 = this.field3046;
        this.field3046 = null;
        return new class107(this.field3030, var7, this.field3042, this.field3029, this.field3014);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "([B)V", line = 144)
    private static final void method1344(byte[] arg0) {
        method1346(arg0, 0);
        field3013 = 0x1 << method1349(4);
        field3033 = 0x1 << method1349(4);
        field3021 = new float[field3033];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field3013 : field3033;
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
            int var13 = class167.method1179(var5 - 1, -127);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class183.method1359(var14, var13, -31247);
            }
            if (var1 == 0) {
                field3032 = var6;
                field3041 = var8;
                field3025 = var10;
                field3038 = var12;
            } else {
                field3015 = var6;
                field3024 = var8;
                field3022 = var10;
                field3037 = var12;
            }
        }
        int var15 = method1349(8) + 1;
        field3036 = new class271[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field3036[var16] = new class271();
        }
        int var17 = method1349(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1349(16);
        }
        int var19 = method1349(6) + 1;
        field3043 = new class208[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field3043[var20] = new class208();
        }
        int var21 = method1349(6) + 1;
        field3026 = new class273[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field3026[var22] = new class273();
        }
        int var23 = method1349(6) + 1;
        field3027 = new class126[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field3027[var24] = new class126();
        }
        int var25 = method1349(6) + 1;
        field3034 = new boolean[var25];
        field3017 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field3034[var26] = method1340() != 0;
            method1349(16);
            method1349(16);
            field3017[var26] = method1349(8);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lme;)Z", line = 295)
    private static final boolean method1345(class295 arg0) {
        if (!field3018) {
            byte[] var1 = arg0.method2042(0, 0, (byte) -126);
            if (var1 == null) {
                return false;
            }
            method1344(var1);
            field3018 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BI)V", line = 311)
    private static final void method1346(byte[] arg0, int arg1) {
        field3039 = arg0;
        field3019 = arg1;
        field3035 = 0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lme;II)Lvk;", line = 316)
    public static final class181 method1347(class295 arg0, int arg1, int arg2) {
        if (method1345(arg0)) {
            byte[] var3 = arg0.method2042(arg1, arg2, (byte) -128);
            return var3 == null ? null : new class181(var3);
        } else {
            arg0.method2035(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()V", line = 339)
    public static void method1348() {
        field3039 = null;
        field3036 = null;
        field3043 = null;
        field3026 = null;
        field3027 = null;
        field3034 = null;
        field3017 = null;
        field3021 = null;
        field3032 = null;
        field3041 = null;
        field3025 = null;
        field3015 = null;
        field3024 = null;
        field3022 = null;
        field3038 = null;
        field3037 = null;
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)I", line = 358)
    public static final int method1349(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3035) {
            int var3 = 8 - field3035;
            int var4 = (0x1 << var3) - 1;
            var1 += (field3039[field3019] >> field3035 & var4) << var2;
            field3035 = 0;
            field3019++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field3039[field3019] >> field3035 & var5) << var2;
            field3035 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)[F", line = 386)
    private final float[] method1350(int arg0) {
        method1346(this.field3031[arg0], 0);
        method1340();
        int var2 = method1349(class167.method1179(field3017.length - 1, 76));
        boolean var3 = field3034[var2];
        int var4 = var3 ? field3033 : field3013;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1340() != 0;
            var6 = method1340() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3013 >> 2);
            var9 = (field3013 >> 2) + (var4 >> 2);
            var10 = field3013 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3013 >> 2);
            var12 = (field3013 >> 2) + (var4 - (var4 >> 2));
            var13 = field3013 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class126 var14 = field3027[field3017[var2]];
        int var15 = var14.field2080;
        int var16 = var14.field2079[var15];
        boolean var17 = !field3043[var16].method1467();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2077; var19++) {
            class273 var20 = field3026[var14.field2078[var19]];
            float[] var21 = field3021;
            var20.method1916(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2080;
            int var23 = var14.field2079[var22];
            field3043[var23].method1469(field3021, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field3021[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field3021;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field3015 : field3032;
            float[] var32 = var3 ? field3024 : field3041;
            float[] var33 = var3 ? field3022 : field3025;
            int[] var34 = var3 ? field3037 : field3038;
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
            int var47 = class167.method1179(var4 - 1, 43);
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
                field3021[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3021[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field3020 > 0) {
            int var91 = this.field3020 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field3023) {
                for (int var92 = 0; var92 < this.field3028; var92++) {
                    int var93 = (this.field3020 >> 1) + var92;
                    var90[var92] += this.field3040[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field3021[var94];
                }
            }
        }
        float[] var96 = this.field3040;
        this.field3040 = field3021;
        field3021 = var96;
        this.field3020 = var4;
        this.field3028 = var12 - (var4 >> 1);
        this.field3023 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V", line = 800)
    private class181(byte[] arg0) {
        this.method1342(arg0);
    }
}
