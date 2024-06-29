import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class105 extends class34 {

    @OriginalMember(owner = "client!c", name = "R", descriptor = "Z")
    private static boolean field2047 = false;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    private static int field2023;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    private static int field2039;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    private static int field2040;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    private int field2045;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    private static int field2048;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Z")
    private boolean field2022;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "Z")
    private boolean field2034;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "[B")
    private static byte[] field2019;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "[B")
    private byte[] field2051;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "[F")
    private static float[] field2020;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "[F")
    private float[] field2030;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[F")
    private static float[] field2032;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[F")
    private static float[] field2036;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "[F")
    private static float[] field2037;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "[F")
    private static float[] field2038;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "[F")
    private static float[] field2042;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "[F")
    private static float[] field2043;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "[I")
    private static int[] field2025;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "[I")
    private static int[] field2027;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
    private static int[] field2033;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[Lvf;")
    private static class101[] field2018;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "[Lnk;")
    private static class127[] field2041;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "[Leb;")
    private static class240[] field2046;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[Lpj;")
    public static class248[] field2021;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "[Z")
    private static boolean[] field2044;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "[[B")
    private byte[][] field2031;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([B)V")
    private static final void method711(byte[] arg0) {
        method713(arg0, 0);
        field2023 = 0x1 << method715(4);
        field2040 = 0x1 << method715(4);
        field2036 = new float[field2040];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2023 : field2040;
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
            int var25 = class147.method1027(false, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class115.method820(var26, var25, false);
            }
            if (var1 == 0) {
                field2043 = var18;
                field2037 = var20;
                field2020 = var22;
                field2033 = var24;
            } else {
                field2042 = var18;
                field2032 = var20;
                field2038 = var22;
                field2027 = var24;
            }
        }
        int var2 = method715(8) + 1;
        field2021 = new class248[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2021[var3] = new class248();
        }
        int var4 = method715(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method715(16);
        }
        int var6 = method715(6) + 1;
        field2041 = new class127[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2041[var7] = new class127();
        }
        int var8 = method715(6) + 1;
        field2046 = new class240[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2046[var9] = new class240();
        }
        int var10 = method715(6) + 1;
        field2018 = new class101[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2018[var11] = new class101();
        }
        int var12 = method715(6) + 1;
        field2044 = new boolean[var12];
        field2025 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2044[var13] = method717() != 0;
            method715(16);
            method715(16);
            field2025[var13] = method715(8);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)F")
    public static final float method712(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BI)V")
    private static final void method713(byte[] arg0, int arg1) {
        field2019 = arg0;
        field2039 = arg1;
        field2048 = 0;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I)Lsh;")
    public final class212 method714(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2051 == null) {
            this.field2026 = 0;
            this.field2030 = new float[field2040];
            this.field2051 = new byte[this.field2028];
            this.field2049 = 0;
            this.field2050 = 0;
        }
        while (this.field2050 < this.field2031.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method721(this.field2050);
            if (var3 != null) {
                int var4 = this.field2049;
                int var5 = var3.length;
                if (var5 > this.field2028 - var4) {
                    var5 = this.field2028 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2051[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2049;
                }
                this.field2049 = var4;
            }
            this.field2050++;
        }
        this.field2030 = null;
        byte[] var2 = this.field2051;
        this.field2051 = null;
        return new class212(this.field2024, var2, this.field2029, this.field2035, this.field2022);
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)I")
    public static final int method715(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2048) {
            int var4 = 8 - field2048;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2019[field2039] >> field2048 & var5) << var2;
            field2048 = 0;
            field2039++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2019[field2039] >> field2048 & var3) << var2;
            field2048 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "([B)V")
    private final void method716(byte[] arg0) {
        class106 var2 = new class106(arg0);
        this.field2024 = var2.method746((byte) -100);
        this.field2028 = var2.method746((byte) -100);
        this.field2029 = var2.method746((byte) -100);
        this.field2035 = var2.method746((byte) -100);
        if (this.field2035 < 0) {
            this.field2035 = ~this.field2035;
            this.field2022 = true;
        }
        int var3 = var2.method746((byte) -100);
        this.field2031 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method774((byte) 87);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method759(0, var7, var5, false);
            this.field2031[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
    public static final int method717() {
        int var0 = field2019[field2039] >> field2048 & 0x1;
        field2048++;
        field2039 += field2048 >> 3;
        field2048 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()V")
    public static void method718() {
        field2019 = null;
        field2021 = null;
        field2041 = null;
        field2046 = null;
        field2018 = null;
        field2044 = null;
        field2025 = null;
        field2036 = null;
        field2043 = null;
        field2037 = null;
        field2020 = null;
        field2042 = null;
        field2032 = null;
        field2038 = null;
        field2033 = null;
        field2027 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lsj;)Z")
    private static final boolean method719(class49 arg0) {
        if (!field2047) {
            byte[] var1 = arg0.method353(0, -23, 0);
            if (var1 == null) {
                return false;
            }
            method711(var1);
            field2047 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lsj;II)Lc;")
    public static final class105 method720(class49 arg0, int arg1, int arg2) {
        if (method719(arg0)) {
            byte[] var3 = arg0.method353(arg2, 109, arg1);
            return var3 == null ? null : new class105(var3);
        } else {
            arg0.method371(arg1, 20103, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)[F")
    private final float[] method721(int arg0) {
        method713(this.field2031[arg0], 0);
        method717();
        int var2 = method715(class147.method1027(false, field2025.length - 1));
        boolean var3 = field2044[var2];
        int var4 = var3 ? field2040 : field2023;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method717() != 0;
            var6 = method717() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2023 >> 2);
            var9 = (field2023 >> 2) + (var4 >> 2);
            var10 = field2023 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2023 >> 2);
            var12 = (field2023 >> 2) + (var4 - (var4 >> 2));
            var13 = field2023 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class101 var14 = field2018[field2025[var2]];
        int var15 = var14.field1951;
        int var16 = var14.field1950[var15];
        boolean var17 = !field2041[var16].method917();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1952; var19++) {
            class240 var95 = field2046[var14.field1949[var19]];
            float[] var96 = field2036;
            var95.method1660(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1951;
            int var21 = var14.field1950[var20];
            field2041[var21].method915(field2036, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2036[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2036;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2042 : field2043;
            float[] var30 = var3 ? field2032 : field2037;
            float[] var31 = var3 ? field2038 : field2020;
            int[] var32 = var3 ? field2027 : field2033;
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
            int var35 = class147.method1027(false, var4 - 1);
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
                field2036[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2036[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2026 > 0) {
            int var49 = this.field2026 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2034) {
                for (int var50 = 0; var50 < this.field2045; var50++) {
                    int var51 = (this.field2026 >> 1) + var50;
                    var48[var50] += this.field2030[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2036[var52];
                }
            }
        }
        float[] var54 = this.field2030;
        this.field2030 = field2036;
        field2036 = var54;
        this.field2026 = var4;
        this.field2045 = var12 - (var4 >> 1);
        this.field2034 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
    private class105(byte[] arg0) {
        this.method716(arg0);
    }
}
