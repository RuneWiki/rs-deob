import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class135 extends class130 {

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "Z")
    private static boolean field2032 = false;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    private int field2020;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    private int field2033;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    private static int field2035;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    private int field2038;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    private static int field2040;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    private int field2041;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    private static int field2044;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    private static int field2045;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    private int field2047;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "Z")
    private boolean field2027;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "Z")
    private boolean field2048;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "[B")
    private static byte[] field2022;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "[B")
    private byte[] field2053;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "[F")
    private static float[] field2024;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[F")
    private static float[] field2025;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "[F")
    private static float[] field2029;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "[F")
    private float[] field2030;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "[F")
    private static float[] field2034;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "[F")
    private static float[] field2036;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "[F")
    private static float[] field2049;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "[F")
    private static float[] field2050;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "[I")
    private static int[] field2028;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "[I")
    private static int[] field2031;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "[I")
    private static int[] field2039;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "[Lia;")
    private static class145[] field2023;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "[Lwu;")
    private static class419[] field2021;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "[Lhf;")
    public static class479[] field2042;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "[Lie;")
    private static class88[] field2037;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "[Z")
    private static boolean[] field2043;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "[[B")
    private byte[][] field2046;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I")
    public static final int method983(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2044) {
            int var4 = 8 - field2044;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2022[field2035] >> field2044 & var5) << var2;
            field2044 = 0;
            field2035++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2022[field2035] >> field2044 & var3) << var2;
            field2044 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)[F")
    private final float[] method984(int arg0) {
        method994(this.field2046[arg0], 0);
        method986();
        int var2 = method983(class347.method2236((byte) -16, field2039.length - 1));
        boolean var3 = field2043[var2];
        int var4 = var3 ? field2045 : field2040;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method986() != 0;
            var6 = method986() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2040 >> 2);
            var9 = (field2040 >> 2) + (var4 >> 2);
            var10 = field2040 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2040 >> 2);
            var12 = (field2040 >> 2) + (var4 - (var4 >> 2));
            var13 = field2040 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class88 var14 = field2037[field2039[var2]];
        int var15 = var14.field1433;
        int var16 = var14.field1431[var15];
        boolean var17 = !field2021[var16].method2614();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1432; var19++) {
            class145 var95 = field2023[var14.field1434[var19]];
            float[] var96 = field2029;
            var95.method1033(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1433;
            int var21 = var14.field1431[var20];
            field2021[var21].method2612(field2029, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2029[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2029;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2049 : field2034;
            float[] var30 = var3 ? field2050 : field2024;
            float[] var31 = var3 ? field2025 : field2036;
            int[] var32 = var3 ? field2031 : field2028;
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
            int var35 = class347.method2236((byte) -16, var4 - 1);
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
                field2029[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2029[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2033 > 0) {
            int var49 = this.field2033 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2048) {
                for (int var50 = 0; var50 < this.field2020; var50++) {
                    int var51 = (this.field2033 >> 1) + var50;
                    var48[var50] += this.field2030[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2029[var52];
                }
            }
        }
        float[] var54 = this.field2030;
        this.field2030 = field2029;
        field2029 = var54;
        this.field2033 = var4;
        this.field2020 = var12 - (var4 >> 1);
        this.field2048 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lum;)Z")
    private static final boolean method985(class83 arg0) {
        if (!field2032) {
            byte[] var1 = arg0.method731(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method990(var1);
            field2032 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "()I")
    public static final int method986() {
        int var0 = field2022[field2035] >> field2044 & 0x1;
        field2044++;
        field2035 += field2044 >> 3;
        field2044 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([I)Lrm;")
    public final class79 method987(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2053 == null) {
            this.field2033 = 0;
            this.field2030 = new float[field2045];
            this.field2053 = new byte[this.field2047];
            this.field2051 = 0;
            this.field2052 = 0;
        }
        while (this.field2052 < this.field2046.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method984(this.field2052);
            if (var3 != null) {
                int var4 = this.field2051;
                int var5 = var3.length;
                if (var5 > this.field2047 - var4) {
                    var5 = this.field2047 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2053[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2051;
                }
                this.field2051 = var4;
            }
            this.field2052++;
        }
        this.field2030 = null;
        byte[] var2 = this.field2053;
        this.field2053 = null;
        return new class79(this.field2041, var2, this.field2038, this.field2026, this.field2027);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "()V")
    public static void method988() {
        field2022 = null;
        field2042 = null;
        field2021 = null;
        field2023 = null;
        field2037 = null;
        field2043 = null;
        field2039 = null;
        field2029 = null;
        field2034 = null;
        field2024 = null;
        field2036 = null;
        field2049 = null;
        field2050 = null;
        field2025 = null;
        field2028 = null;
        field2031 = null;
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)F")
    public static final float method989(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([B)V")
    private static final void method990(byte[] arg0) {
        method994(arg0, 0);
        field2040 = 0x1 << method983(4);
        field2045 = 0x1 << method983(4);
        field2029 = new float[field2045];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2040 : field2045;
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
            int var25 = class347.method2236((byte) -16, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class52.method347(var25, 500, var26);
            }
            if (var1 == 0) {
                field2034 = var18;
                field2024 = var20;
                field2036 = var22;
                field2028 = var24;
            } else {
                field2049 = var18;
                field2050 = var20;
                field2025 = var22;
                field2031 = var24;
            }
        }
        int var2 = method983(8) + 1;
        field2042 = new class479[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2042[var3] = new class479();
        }
        int var4 = method983(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method983(16);
        }
        int var6 = method983(6) + 1;
        field2021 = new class419[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2021[var7] = new class419();
        }
        int var8 = method983(6) + 1;
        field2023 = new class145[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2023[var9] = new class145();
        }
        int var10 = method983(6) + 1;
        field2037 = new class88[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2037[var11] = new class88();
        }
        int var12 = method983(6) + 1;
        field2043 = new boolean[var12];
        field2039 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2043[var13] = method986() != 0;
            method983(16);
            method983(16);
            field2039[var13] = method983(8);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lum;I)Luo;")
    public static final class135 method991(class83 arg0, int arg1) {
        if (method985(arg0)) {
            byte[] var2 = arg0.method735(arg1, 0);
            return var2 == null ? null : new class135(var2);
        } else {
            arg0.method739((byte) -35, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lum;II)Luo;")
    public static final class135 method992(class83 arg0, int arg1, int arg2) {
        if (method985(arg0)) {
            byte[] var3 = arg0.method731(0, arg2, arg1);
            return var3 == null ? null : new class135(var3);
        } else {
            arg0.method758((byte) -102, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "([B)V")
    private final void method993(byte[] arg0) {
        class194 var2 = new class194(arg0);
        this.field2041 = var2.method1401(127);
        this.field2047 = var2.method1401(125);
        this.field2038 = var2.method1401(123);
        this.field2026 = var2.method1401(-98);
        if (this.field2026 < 0) {
            this.field2026 = ~this.field2026;
            this.field2027 = true;
        }
        int var3 = var2.method1401(123);
        this.field2046 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1337((byte) -113);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1338(0, var5, var7, 41);
            this.field2046[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([BI)V")
    private static final void method994(byte[] arg0, int arg1) {
        field2022 = arg0;
        field2035 = arg1;
        field2044 = 0;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([B)V")
    private class135(byte[] arg0) {
        this.method993(arg0);
    }
}
