import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class173 extends class86 {

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
    private static boolean field2939 = false;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    private int field2938;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    private static int field2944;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    private static int field2945;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    private static int field2947;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    private int field2954;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    private static int field2956;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    private int field2968;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
    private boolean field2943;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Z")
    private boolean field2951;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[B")
    private static byte[] field2962;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[B")
    private byte[] field2970;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "[F")
    private float[] field2940;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "[F")
    private static float[] field2942;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "[F")
    private static float[] field2946;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[F")
    private static float[] field2952;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "[F")
    private static float[] field2955;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "[F")
    private static float[] field2958;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "[F")
    private static float[] field2961;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "[F")
    private static float[] field2963;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
    private static int[] field2937;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "[I")
    private static int[] field2941;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "[I")
    private static int[] field2950;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "[Lag;")
    public static class106[] field2949;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "[Lad;")
    private static class120[] field2966;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "[Lpc;")
    private static class84[] field2960;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "[Lji;")
    private static class98[] field2964;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "[Z")
    private static boolean[] field2957;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "[[B")
    private byte[][] field2948;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)[F", line = 5)
    private final float[] method1122(int arg0) {
        method1132(this.field2948[arg0], 0);
        method1130();
        int var2 = method1128(class83.method538(field2950.length - 1, -948));
        boolean var3 = field2957[var2];
        int var4 = var3 ? field2944 : field2947;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1130() != 0;
            var6 = method1130() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2947 >> 2);
            var9 = (field2947 >> 2) + (var4 >> 2);
            var10 = field2947 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2947 >> 2);
            var12 = (field2947 >> 2) + (var4 - (var4 >> 2));
            var13 = field2947 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class120 var14 = field2966[field2950[var2]];
        int var15 = var14.field2011;
        int var16 = var14.field2013[var15];
        boolean var17 = !field2960[var16].method545();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2010; var19++) {
            class98 var20 = field2964[var14.field2012[var19]];
            float[] var21 = field2955;
            var20.method653(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2011;
            int var23 = var14.field2013[var22];
            field2960[var23].method541(field2955, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2955[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2955;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2961 : field2942;
            float[] var32 = var3 ? field2963 : field2952;
            float[] var33 = var3 ? field2946 : field2958;
            int[] var34 = var3 ? field2937 : field2941;
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
            int var47 = class83.method538(var4 - 1, -948);
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
                field2955[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2955[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2967 > 0) {
            int var91 = this.field2967 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2943) {
                for (int var92 = 0; var92 < this.field2965; var92++) {
                    int var93 = (this.field2967 >> 1) + var92;
                    var90[var92] += this.field2940[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2955[var94];
                }
            }
        }
        float[] var96 = this.field2940;
        this.field2940 = field2955;
        field2955 = var96;
        this.field2967 = var4;
        this.field2965 = var12 - (var4 >> 1);
        this.field2943 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)F", line = 419)
    public static final float method1123(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 439)
    public static void method1124() {
        field2962 = null;
        field2949 = null;
        field2960 = null;
        field2964 = null;
        field2966 = null;
        field2957 = null;
        field2950 = null;
        field2955 = null;
        field2942 = null;
        field2952 = null;
        field2958 = null;
        field2961 = null;
        field2963 = null;
        field2946 = null;
        field2941 = null;
        field2937 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I)Lhb;", line = 463)
    public final class32 method1125(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2970 == null) {
            this.field2967 = 0;
            this.field2940 = new float[field2944];
            this.field2970 = new byte[this.field2953];
            this.field2969 = 0;
            this.field2968 = 0;
        }
        while (this.field2968 < this.field2948.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1122(this.field2968);
            if (var2 != null) {
                int var3 = this.field2969;
                int var4 = var2.length;
                if (var4 > this.field2953 - var3) {
                    var4 = this.field2953 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2970[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2969;
                }
                this.field2969 = var3;
            }
            this.field2968++;
        }
        this.field2940 = null;
        byte[] var7 = this.field2970;
        this.field2970 = null;
        return new class32(this.field2938, var7, this.field2959, this.field2954, this.field2951);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([B)V", line = 525)
    private static final void method1126(byte[] arg0) {
        method1132(arg0, 0);
        field2947 = 0x1 << method1128(4);
        field2944 = 0x1 << method1128(4);
        field2955 = new float[field2944];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2947 : field2944;
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
            int var13 = class83.method538(var5 - 1, -948);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class91.method583(var14, 94, var13);
            }
            if (var1 == 0) {
                field2942 = var6;
                field2952 = var8;
                field2958 = var10;
                field2941 = var12;
            } else {
                field2961 = var6;
                field2963 = var8;
                field2946 = var10;
                field2937 = var12;
            }
        }
        int var15 = method1128(8) + 1;
        field2949 = new class106[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2949[var16] = new class106();
        }
        int var17 = method1128(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1128(16);
        }
        int var19 = method1128(6) + 1;
        field2960 = new class84[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2960[var20] = new class84();
        }
        int var21 = method1128(6) + 1;
        field2964 = new class98[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2964[var22] = new class98();
        }
        int var23 = method1128(6) + 1;
        field2966 = new class120[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2966[var24] = new class120();
        }
        int var25 = method1128(6) + 1;
        field2957 = new boolean[var25];
        field2950 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2957[var26] = method1130() != 0;
            method1128(16);
            method1128(16);
            field2950[var26] = method1128(8);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "([B)V", line = 678)
    private final void method1127(byte[] arg0) {
        class229 var2 = new class229(arg0);
        this.field2938 = var2.method1528(true);
        this.field2953 = var2.method1528(true);
        this.field2959 = var2.method1528(true);
        this.field2954 = var2.method1528(true);
        if (this.field2954 < 0) {
            this.field2954 = ~this.field2954;
            this.field2951 = true;
        }
        int var3 = var2.method1528(true);
        this.field2948 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1535((byte) 91);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1505((byte) 21, 0, var7, var5);
            this.field2948[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)I", line = 721)
    public static final int method1128(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2956) {
            int var3 = 8 - field2956;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2962[field2945] >> field2956 & var4) << var2;
            field2956 = 0;
            field2945++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2962[field2945] >> field2956 & var5) << var2;
            field2956 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lek;)Z", line = 751)
    private static final boolean method1129(class172 arg0) {
        if (!field2939) {
            byte[] var1 = arg0.method1107(0, 0, 117);
            if (var1 == null) {
                return false;
            }
            method1126(var1);
            field2939 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()I", line = 766)
    public static final int method1130() {
        int var0 = field2962[field2945] >> field2956 & 0x1;
        field2956++;
        field2945 += field2956 >> 3;
        field2956 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lek;II)Ldb;", line = 784)
    public static final class173 method1131(class172 arg0, int arg1, int arg2) {
        if (method1129(arg0)) {
            byte[] var3 = arg0.method1107(arg1, arg2, 117);
            return var3 == null ? null : new class173(var3);
        } else {
            arg0.method1110(arg1, -1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BI)V", line = 799)
    private static final void method1132(byte[] arg0, int arg1) {
        field2962 = arg0;
        field2945 = arg1;
        field2956 = 0;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([B)V", line = 803)
    private class173(byte[] arg0) {
        this.method1127(arg0);
    }
}
