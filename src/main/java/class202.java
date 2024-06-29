import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class202 extends class187 {

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Z")
    private static boolean field3030 = false;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int field3027;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    private static int field3031;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    private int field3034;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    private static int field3036;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    private static int field3041;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    private int field3053;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    private static int field3056;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Z")
    private boolean field3039;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Z")
    private boolean field3057;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[B")
    private static byte[] field3029;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[B")
    private byte[] field3060;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[F")
    private static float[] field3028;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[F")
    private static float[] field3033;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[F")
    private static float[] field3035;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "[F")
    private static float[] field3040;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[F")
    private static float[] field3046;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "[F")
    private static float[] field3048;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "[F")
    private static float[] field3050;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[F")
    private float[] field3052;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "[I")
    private static int[] field3037;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
    private static int[] field3043;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[I")
    private static int[] field3045;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[Lwh;")
    private static class134[] field3044;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[Lcg;")
    public static class1[] field3032;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "[Lcf;")
    private static class267[] field3047;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[Lih;")
    private static class341[] field3055;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "[Z")
    private static boolean[] field3051;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "[[B")
    private byte[][] field3038;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)Lb;", line = 4)
    public final class73 method1354(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3060 == null) {
            this.field3053 = 0;
            this.field3052 = new float[field3056];
            this.field3060 = new byte[this.field3054];
            this.field3059 = 0;
            this.field3058 = 0;
        }
        while (this.field3058 < this.field3038.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1364(this.field3058);
            if (var2 != null) {
                int var3 = this.field3059;
                int var4 = var2.length;
                if (var4 > this.field3054 - var3) {
                    var4 = this.field3054 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field3060[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field3059;
                }
                this.field3059 = var3;
            }
            this.field3058++;
        }
        this.field3052 = null;
        byte[] var7 = this.field3060;
        this.field3060 = null;
        return new class73(this.field3027, var7, this.field3049, this.field3042, this.field3039);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I", line = 76)
    public static final int method1355(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3031) {
            int var3 = 8 - field3031;
            int var4 = (0x1 << var3) - 1;
            var1 += (field3029[field3041] >> field3031 & var4) << var2;
            field3031 = 0;
            field3041++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field3029[field3041] >> field3031 & var5) << var2;
            field3031 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([B)V", line = 107)
    private final void method1356(byte[] arg0) {
        class303 var2 = new class303(arg0);
        this.field3027 = var2.method1996(-49);
        this.field3054 = var2.method1996(106);
        this.field3049 = var2.method1996(92);
        this.field3042 = var2.method1996(-67);
        if (this.field3042 < 0) {
            this.field3042 = ~this.field3042;
            this.field3039 = true;
        }
        int var3 = var2.method1996(124);
        this.field3038 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2043((byte) -114);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2009(21, 0, var5, var7);
            this.field3038[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I", line = 151)
    public static final int method1357() {
        int var0 = field3029[field3041] >> field3031 & 0x1;
        field3031++;
        field3041 += field3031 >> 3;
        field3031 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwf;)Z", line = 160)
    private static final boolean method1358(class306 arg0) {
        if (!field3030) {
            byte[] var1 = arg0.method2103(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1359(var1);
            field3030 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "([B)V", line = 176)
    private static final void method1359(byte[] arg0) {
        method1361(arg0, 0);
        field3036 = 0x1 << method1355(4);
        field3056 = 0x1 << method1355(4);
        field3040 = new float[field3056];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field3036 : field3056;
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
            int var13 = class116.method799(var5 - 1, (byte) -125);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class273.method1793(var14, var13, (byte) -116);
            }
            if (var1 == 0) {
                field3048 = var6;
                field3035 = var8;
                field3046 = var10;
                field3045 = var12;
            } else {
                field3033 = var6;
                field3050 = var8;
                field3028 = var10;
                field3043 = var12;
            }
        }
        int var15 = method1355(8) + 1;
        field3032 = new class1[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field3032[var16] = new class1();
        }
        int var17 = method1355(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1355(16);
        }
        int var19 = method1355(6) + 1;
        field3047 = new class267[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field3047[var20] = new class267();
        }
        int var21 = method1355(6) + 1;
        field3044 = new class134[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field3044[var22] = new class134();
        }
        int var23 = method1355(6) + 1;
        field3055 = new class341[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field3055[var24] = new class341();
        }
        int var25 = method1355(6) + 1;
        field3051 = new boolean[var25];
        field3037 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field3051[var26] = method1357() != 0;
            method1355(16);
            method1355(16);
            field3037[var26] = method1355(8);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V", line = 331)
    public static void method1360() {
        field3029 = null;
        field3032 = null;
        field3047 = null;
        field3044 = null;
        field3055 = null;
        field3051 = null;
        field3037 = null;
        field3040 = null;
        field3048 = null;
        field3035 = null;
        field3046 = null;
        field3033 = null;
        field3050 = null;
        field3028 = null;
        field3045 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)V", line = 349)
    private static final void method1361(byte[] arg0, int arg1) {
        field3029 = arg0;
        field3041 = arg1;
        field3031 = 0;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)F", line = 360)
    public static final float method1362(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwf;II)Lr;", line = 372)
    public static final class202 method1363(class306 arg0, int arg1, int arg2) {
        if (method1358(arg0)) {
            byte[] var3 = arg0.method2103(0, arg1, arg2);
            return var3 == null ? null : new class202(var3);
        } else {
            arg0.method2100(arg2, true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)[F", line = 392)
    private final float[] method1364(int arg0) {
        method1361(this.field3038[arg0], 0);
        method1357();
        int var2 = method1355(class116.method799(field3037.length - 1, (byte) -117));
        boolean var3 = field3051[var2];
        int var4 = var3 ? field3056 : field3036;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1357() != 0;
            var6 = method1357() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3036 >> 2);
            var9 = (field3036 >> 2) + (var4 >> 2);
            var10 = field3036 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3036 >> 2);
            var12 = (field3036 >> 2) + (var4 - (var4 >> 2));
            var13 = field3036 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class341 var14 = field3055[field3037[var2]];
        int var15 = var14.field5327;
        int var16 = var14.field5328[var15];
        boolean var17 = !field3047[var16].method1771();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5326; var19++) {
            class134 var20 = field3044[var14.field5325[var19]];
            float[] var21 = field3040;
            var20.method911(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5327;
            int var23 = var14.field5328[var22];
            field3047[var23].method1765(field3040, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field3040[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field3040;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field3033 : field3048;
            float[] var32 = var3 ? field3050 : field3035;
            float[] var33 = var3 ? field3028 : field3046;
            int[] var34 = var3 ? field3043 : field3045;
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
            int var47 = class116.method799(var4 - 1, (byte) -90);
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
                field3040[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3040[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field3053 > 0) {
            int var91 = this.field3053 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field3057) {
                for (int var92 = 0; var92 < this.field3034; var92++) {
                    int var93 = (this.field3053 >> 1) + var92;
                    var90[var92] += this.field3052[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field3040[var94];
                }
            }
        }
        float[] var96 = this.field3052;
        this.field3052 = field3040;
        field3040 = var96;
        this.field3053 = var4;
        this.field3034 = var12 - (var4 >> 1);
        this.field3057 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V", line = 803)
    private class202(byte[] arg0) {
        this.method1356(arg0);
    }
}
