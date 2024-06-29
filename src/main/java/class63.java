import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class63 extends class320 {

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
    private static boolean field983 = false;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    private int field968;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    private static int field971;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    private int field974;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    private static int field980;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    private static int field987;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    private static int field990;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Z")
    private boolean field973;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Z")
    private boolean field984;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[B")
    private static byte[] field979;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "[B")
    private byte[] field995;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "[F")
    private static float[] field967;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[F")
    private static float[] field969;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "[F")
    private static float[] field976;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "[F")
    private float[] field978;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "[F")
    private static float[] field985;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[F")
    private static float[] field986;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "[F")
    private static float[] field989;

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "[F")
    private static float[] field996;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
    private static int[] field965;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[I")
    private static int[] field975;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
    private static int[] field977;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[Lkn;")
    private static class216[] field970;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "[Lmd;")
    private static class274[] field991;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "[Lec;")
    public static class46[] field981;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "[Lfm;")
    private static class54[] field988;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "[Z")
    private static boolean[] field997;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "[[B")
    private byte[][] field982;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()V", line = 3)
    public static void method591() {
        field979 = null;
        field981 = null;
        field988 = null;
        field991 = null;
        field970 = null;
        field997 = null;
        field977 = null;
        field967 = null;
        field969 = null;
        field996 = null;
        field989 = null;
        field976 = null;
        field986 = null;
        field985 = null;
        field975 = null;
        field965 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcg;)Z", line = 34)
    private static final boolean method592(class49 arg0) {
        if (!field983) {
            byte[] var1 = arg0.method441(false, 0, 0);
            if (var1 == null) {
                return false;
            }
            method593(var1);
            field983 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([B)V", line = 50)
    private static final void method593(byte[] arg0) {
        method599(arg0, 0);
        field971 = 0x1 << method601(4);
        field980 = 0x1 << method601(4);
        field967 = new float[field980];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field971 : field980;
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
            int var13 = class272.method1857((byte) 124, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class15.method154(var14, (byte) -83, var13);
            }
            if (var1 == 0) {
                field969 = var6;
                field996 = var8;
                field989 = var10;
                field975 = var12;
            } else {
                field976 = var6;
                field986 = var8;
                field985 = var10;
                field965 = var12;
            }
        }
        int var15 = method601(8) + 1;
        field981 = new class46[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field981[var16] = new class46();
        }
        int var17 = method601(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method601(16);
        }
        int var19 = method601(6) + 1;
        field988 = new class54[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field988[var20] = new class54();
        }
        int var21 = method601(6) + 1;
        field991 = new class274[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field991[var22] = new class274();
        }
        int var23 = method601(6) + 1;
        field970 = new class216[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field970[var24] = new class216();
        }
        int var25 = method601(6) + 1;
        field997 = new boolean[var25];
        field977 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field997[var26] = method597() != 0;
            method601(16);
            method601(16);
            field977[var26] = method601(8);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lcg;II)Lbj;", line = 209)
    public static final class63 method594(class49 arg0, int arg1, int arg2) {
        if (method592(arg0)) {
            byte[] var3 = arg0.method441(false, arg1, arg2);
            return var3 == null ? null : new class63(var3);
        } else {
            arg0.method429(arg2, arg1, 104);
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)F", line = 225)
    public static final float method595(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([I)Lri;", line = 246)
    public final class76 method596(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field995 == null) {
            this.field992 = 0;
            this.field978 = new float[field980];
            this.field995 = new byte[this.field966];
            this.field993 = 0;
            this.field994 = 0;
        }
        while (this.field994 < this.field982.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method598(this.field994);
            if (var2 != null) {
                int var3 = this.field993;
                int var4 = var2.length;
                if (var4 > this.field966 - var3) {
                    var4 = this.field966 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field995[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field993;
                }
                this.field993 = var3;
            }
            this.field994++;
        }
        this.field978 = null;
        byte[] var7 = this.field995;
        this.field995 = null;
        return new class76(this.field968, var7, this.field974, this.field972, this.field973);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I", line = 305)
    public static final int method597() {
        int var0 = field979[field990] >> field987 & 0x1;
        field987++;
        field990 += field987 >> 3;
        field987 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)[F", line = 314)
    private final float[] method598(int arg0) {
        method599(this.field982[arg0], 0);
        method597();
        int var2 = method601(class272.method1857((byte) -125, field977.length - 1));
        boolean var3 = field997[var2];
        int var4 = var3 ? field980 : field971;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method597() != 0;
            var6 = method597() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field971 >> 2);
            var9 = (field971 >> 2) + (var4 >> 2);
            var10 = field971 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field971 >> 2);
            var12 = (field971 >> 2) + (var4 - (var4 >> 2));
            var13 = field971 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class216 var14 = field970[field977[var2]];
        int var15 = var14.field3619;
        int var16 = var14.field3622[var15];
        boolean var17 = !field988[var16].method490();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3620; var19++) {
            class274 var20 = field991[var14.field3621[var19]];
            float[] var21 = field967;
            var20.method1880(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3619;
            int var23 = var14.field3622[var22];
            field988[var23].method485(field967, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field967[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field967;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field976 : field969;
            float[] var32 = var3 ? field986 : field996;
            float[] var33 = var3 ? field985 : field989;
            int[] var34 = var3 ? field965 : field975;
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
            int var47 = class272.method1857((byte) -90, var4 - 1);
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
                field967[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field967[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field992 > 0) {
            int var91 = this.field992 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field984) {
                for (int var92 = 0; var92 < this.field964; var92++) {
                    int var93 = (this.field992 >> 1) + var92;
                    var90[var92] += this.field978[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field967[var94];
                }
            }
        }
        float[] var96 = this.field978;
        this.field978 = field967;
        field967 = var96;
        this.field992 = var4;
        this.field964 = var12 - (var4 >> 1);
        this.field984 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "([B)V", line = 725)
    private class63(byte[] arg0) {
        this.method600(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V", line = 730)
    private static final void method599(byte[] arg0, int arg1) {
        field979 = arg0;
        field990 = arg1;
        field987 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "([B)V", line = 736)
    private final void method600(byte[] arg0) {
        class336 var2 = new class336(arg0);
        this.field968 = var2.method2338((byte) 98);
        this.field966 = var2.method2338((byte) 36);
        this.field974 = var2.method2338((byte) 79);
        this.field972 = var2.method2338((byte) 73);
        if (this.field972 < 0) {
            this.field972 = ~this.field972;
            this.field973 = true;
        }
        int var3 = var2.method2338((byte) 73);
        this.field982 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2364(-9069);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2342(var5, 0, var7, false);
            this.field982[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I", line = 782)
    public static final int method601(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field987) {
            int var3 = 8 - field987;
            int var4 = (0x1 << var3) - 1;
            var1 += (field979[field990] >> field987 & var4) << var2;
            field987 = 0;
            field990++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field979[field990] >> field987 & var5) << var2;
            field987 += arg0;
        }
        return var1;
    }
}
