import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class188 extends class79 {

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Z")
    private static boolean field2954 = false;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    private static int field2958;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    private static int field2960;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private static int field2961;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    private int field2962;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    private int field2967;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    private static int field2970;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "Z")
    private boolean field2957;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
    private boolean field2959;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[B")
    private static byte[] field2947;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "[B")
    private byte[] field2976;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "[F")
    private static float[] field2943;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[F")
    private static float[] field2944;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "[F")
    private static float[] field2945;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "[F")
    private static float[] field2946;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[F")
    private static float[] field2949;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "[F")
    private float[] field2951;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[F")
    private static float[] field2955;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[F")
    private static float[] field2964;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "[I")
    private static int[] field2952;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[I")
    private static int[] field2956;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "[I")
    private static int[] field2963;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "[Lbi;")
    private static class148[] field2968;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "[Lpk;")
    private static class192[] field2973;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "[Lek;")
    private static class194[] field2948;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[Lfe;")
    public static class83[] field2966;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "[Z")
    private static boolean[] field2953;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "[[B")
    private byte[][] field2972;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lva;II)Lni;", line = 3)
    public static final class188 method1184(class36 arg0, int arg1, int arg2) {
        if (method1193(arg0)) {
            byte[] var3 = arg0.method261(-1, arg1, arg2);
            return var3 == null ? null : new class188(var3);
        } else {
            arg0.method265(arg1, arg2, (byte) -116);
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I", line = 20)
    public static final int method1185(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2960) {
            int var3 = 8 - field2960;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2947[field2958] >> field2960 & var4) << var2;
            field2960 = 0;
            field2958++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2947[field2958] >> field2960 & var5) << var2;
            field2960 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)[F", line = 49)
    private final float[] method1186(int arg0) {
        method1189(this.field2972[arg0], 0);
        method1188();
        int var2 = method1185(class200.method1276(62, field2956.length - 1));
        boolean var3 = field2953[var2];
        int var4 = var3 ? field2970 : field2961;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1188() != 0;
            var6 = method1188() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2961 >> 2);
            var9 = (field2961 >> 2) + (var4 >> 2);
            var10 = field2961 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2961 >> 2);
            var12 = (field2961 >> 2) + (var4 - (var4 >> 2));
            var13 = field2961 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class148 var14 = field2968[field2956[var2]];
        int var15 = var14.field2373;
        int var16 = var14.field2372[var15];
        boolean var17 = !field2948[var16].method1247();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2374; var19++) {
            class192 var20 = field2973[var14.field2371[var19]];
            float[] var21 = field2955;
            var20.method1238(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2373;
            int var23 = var14.field2372[var22];
            field2948[var23].method1243(field2955, var4 >> 1);
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
            float[] var31 = var3 ? field2949 : field2945;
            float[] var32 = var3 ? field2943 : field2944;
            float[] var33 = var3 ? field2964 : field2946;
            int[] var34 = var3 ? field2963 : field2952;
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
            int var47 = class200.method1276(105, var4 - 1);
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
        if (this.field2965 > 0) {
            int var91 = this.field2965 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2959) {
                for (int var92 = 0; var92 < this.field2962; var92++) {
                    int var93 = (this.field2965 >> 1) + var92;
                    var90[var92] += this.field2951[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2955[var94];
                }
            }
        }
        float[] var96 = this.field2951;
        this.field2951 = field2955;
        field2955 = var96;
        this.field2965 = var4;
        this.field2962 = var12 - (var4 >> 1);
        this.field2959 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([B)V", line = 467)
    private final void method1187(byte[] arg0) {
        class3 var2 = new class3(arg0);
        this.field2971 = var2.method71(-668527048);
        this.field2950 = var2.method71(-668527048);
        this.field2969 = var2.method71(-668527048);
        this.field2967 = var2.method71(-668527048);
        if (this.field2967 < 0) {
            this.field2967 = ~this.field2967;
            this.field2957 = true;
        }
        int var3 = var2.method71(-668527048);
        this.field2972 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method64((byte) 79);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method53(var7, -91, 0, var5);
            this.field2972[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()I", line = 524)
    public static final int method1188() {
        int var0 = field2947[field2958] >> field2960 & 0x1;
        field2960++;
        field2958 += field2960 >> 3;
        field2960 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BI)V", line = 531)
    private static final void method1189(byte[] arg0, int arg1) {
        field2947 = arg0;
        field2958 = arg1;
        field2960 = 0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "([B)V", line = 539)
    private static final void method1190(byte[] arg0) {
        method1189(arg0, 0);
        field2961 = 0x1 << method1185(4);
        field2970 = 0x1 << method1185(4);
        field2955 = new float[field2970];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2961 : field2970;
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
            int var13 = class200.method1276(110, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class50.method390(var14, var13, 21399);
            }
            if (var1 == 0) {
                field2945 = var6;
                field2944 = var8;
                field2946 = var10;
                field2952 = var12;
            } else {
                field2949 = var6;
                field2943 = var8;
                field2964 = var10;
                field2963 = var12;
            }
        }
        int var15 = method1185(8) + 1;
        field2966 = new class83[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2966[var16] = new class83();
        }
        int var17 = method1185(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1185(16);
        }
        int var19 = method1185(6) + 1;
        field2948 = new class194[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2948[var20] = new class194();
        }
        int var21 = method1185(6) + 1;
        field2973 = new class192[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2973[var22] = new class192();
        }
        int var23 = method1185(6) + 1;
        field2968 = new class148[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2968[var24] = new class148();
        }
        int var25 = method1185(6) + 1;
        field2953 = new boolean[var25];
        field2956 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2953[var26] = method1188() != 0;
            method1185(16);
            method1185(16);
            field2956[var26] = method1185(8);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([I)Lph;", line = 696)
    public final class34 method1191(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2976 == null) {
            this.field2965 = 0;
            this.field2951 = new float[field2970];
            this.field2976 = new byte[this.field2950];
            this.field2974 = 0;
            this.field2975 = 0;
        }
        while (this.field2975 < this.field2972.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1186(this.field2975);
            if (var2 != null) {
                int var3 = this.field2974;
                int var4 = var2.length;
                if (var4 > this.field2950 - var3) {
                    var4 = this.field2950 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2976[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2974;
                }
                this.field2974 = var3;
            }
            this.field2975++;
        }
        this.field2951 = null;
        byte[] var7 = this.field2976;
        this.field2976 = null;
        return new class34(this.field2971, var7, this.field2969, this.field2967, this.field2957);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V", line = 755)
    public static void method1192() {
        field2947 = null;
        field2966 = null;
        field2948 = null;
        field2973 = null;
        field2968 = null;
        field2953 = null;
        field2956 = null;
        field2955 = null;
        field2945 = null;
        field2944 = null;
        field2946 = null;
        field2949 = null;
        field2943 = null;
        field2964 = null;
        field2952 = null;
        field2963 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lva;)Z", line = 773)
    private static final boolean method1193(class36 arg0) {
        if (!field2954) {
            byte[] var1 = arg0.method261(-1, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1190(var1);
            field2954 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)F", line = 792)
    public static final float method1194(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V", line = 803)
    private class188(byte[] arg0) {
        this.method1187(arg0);
    }
}
