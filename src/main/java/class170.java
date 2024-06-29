import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class170 extends class161 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Z")
    private static boolean field2971 = false;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    private static int field2965;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    private static int field2973;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    private int field2974;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    private static int field2980;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private static int field2986;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    private int field2987;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    private int field2997;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Z")
    private boolean field2970;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Z")
    private boolean field2989;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[B")
    private static byte[] field2972;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "[B")
    private byte[] field2998;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "[F")
    private static float[] field2978;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "[F")
    private float[] field2979;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "[F")
    private static float[] field2981;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "[F")
    private static float[] field2982;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[F")
    private static float[] field2984;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[F")
    private static float[] field2990;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "[F")
    private static float[] field2992;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[F")
    private static float[] field2993;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    private static int[] field2967;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[I")
    private static int[] field2975;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "[I")
    private static int[] field2977;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[Lkg;")
    private static class135[] field2976;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lnj;")
    private static class141[] field2966;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "[Lhb;")
    private static class213[] field2988;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "[Lmd;")
    public static class218[] field2985;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[Z")
    private static boolean[] field2968;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "[[B")
    private byte[][] field2994;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([B)V")
    private final void method1180(byte[] arg0) {
        class25 var2 = new class25(arg0);
        this.field2969 = var2.method199((byte) -85);
        this.field2983 = var2.method199((byte) -85);
        this.field2974 = var2.method199((byte) -85);
        this.field2995 = var2.method199((byte) -85);
        if (this.field2995 < 0) {
            this.field2995 = ~this.field2995;
            this.field2970 = true;
        }
        int var3 = var2.method199((byte) -85);
        this.field2994 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method189((byte) -103);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method188(var7, 0, 3, var5);
            this.field2994[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)F")
    public static final float method1181(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
    public static final int method1182(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2973) {
            int var4 = 8 - field2973;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2972[field2980] >> field2973 & var5) << var2;
            field2973 = 0;
            field2980++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2972[field2980] >> field2973 & var3) << var2;
            field2973 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([B)V")
    private static final void method1183(byte[] arg0) {
        method1188(arg0, 0);
        field2986 = 0x1 << method1182(4);
        field2965 = 0x1 << method1182(4);
        field2984 = new float[field2965];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2986 : field2965;
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
            int var25 = class158.method1127(var17 - 1, (byte) -126);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class78.method570(var26, var25, true);
            }
            if (var1 == 0) {
                field2978 = var18;
                field2993 = var20;
                field2981 = var22;
                field2977 = var24;
            } else {
                field2992 = var18;
                field2982 = var20;
                field2990 = var22;
                field2967 = var24;
            }
        }
        int var2 = method1182(8) + 1;
        field2985 = new class218[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2985[var3] = new class218();
        }
        int var4 = method1182(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1182(16);
        }
        int var6 = method1182(6) + 1;
        field2988 = new class213[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2988[var7] = new class213();
        }
        int var8 = method1182(6) + 1;
        field2966 = new class141[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2966[var9] = new class141();
        }
        int var10 = method1182(6) + 1;
        field2976 = new class135[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2976[var11] = new class135();
        }
        int var12 = method1182(6) + 1;
        field2968 = new boolean[var12];
        field2975 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2968[var13] = method1190() != 0;
            method1182(16);
            method1182(16);
            field2975[var13] = method1182(8);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
    public static void method1184() {
        field2972 = null;
        field2985 = null;
        field2988 = null;
        field2966 = null;
        field2976 = null;
        field2968 = null;
        field2975 = null;
        field2984 = null;
        field2978 = null;
        field2993 = null;
        field2981 = null;
        field2992 = null;
        field2982 = null;
        field2990 = null;
        field2977 = null;
        field2967 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ltg;II)Lga;")
    public static final class170 method1185(class180 arg0, int arg1, int arg2) {
        if (method1186(arg0)) {
            byte[] var3 = arg0.method1258(arg1, arg2, (byte) 112);
            return var3 == null ? null : new class170(var3);
        } else {
            arg0.method1248((byte) 117, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ltg;)Z")
    private static final boolean method1186(class180 arg0) {
        if (!field2971) {
            byte[] var1 = arg0.method1258(0, 0, (byte) 126);
            if (var1 == null) {
                return false;
            }
            method1183(var1);
            field2971 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([I)Lei;")
    public final class171 method1187(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2998 == null) {
            this.field2987 = 0;
            this.field2979 = new float[field2965];
            this.field2998 = new byte[this.field2983];
            this.field2997 = 0;
            this.field2996 = 0;
        }
        while (this.field2996 < this.field2994.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1189(this.field2996);
            if (var3 != null) {
                int var4 = this.field2997;
                int var5 = var3.length;
                if (var5 > this.field2983 - var4) {
                    var5 = this.field2983 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2998[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2997;
                }
                this.field2997 = var4;
            }
            this.field2996++;
        }
        this.field2979 = null;
        byte[] var2 = this.field2998;
        this.field2998 = null;
        return new class171(this.field2969, var2, this.field2974, this.field2995, this.field2970);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([BI)V")
    private static final void method1188(byte[] arg0, int arg1) {
        field2972 = arg0;
        field2980 = arg1;
        field2973 = 0;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)[F")
    private final float[] method1189(int arg0) {
        method1188(this.field2994[arg0], 0);
        method1190();
        int var2 = method1182(class158.method1127(field2975.length - 1, (byte) -115));
        boolean var3 = field2968[var2];
        int var4 = var3 ? field2965 : field2986;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1190() != 0;
            var6 = method1190() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2986 >> 2);
            var9 = (field2986 >> 2) + (var4 >> 2);
            var10 = field2986 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2986 >> 2);
            var12 = (field2986 >> 2) + (var4 - (var4 >> 2));
            var13 = field2986 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class135 var14 = field2976[field2975[var2]];
        int var15 = var14.field2382;
        int var16 = var14.field2383[var15];
        boolean var17 = !field2988[var16].method1427();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2380; var19++) {
            class141 var95 = field2966[var14.field2381[var19]];
            float[] var96 = field2984;
            var95.method976(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2382;
            int var21 = var14.field2383[var20];
            field2988[var21].method1431(field2984, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2984[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2984;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2992 : field2978;
            float[] var30 = var3 ? field2982 : field2993;
            float[] var31 = var3 ? field2990 : field2981;
            int[] var32 = var3 ? field2967 : field2977;
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
            int var35 = class158.method1127(var4 - 1, (byte) -118);
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
                field2984[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2984[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2987 > 0) {
            int var49 = this.field2987 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2989) {
                for (int var50 = 0; var50 < this.field2991; var50++) {
                    int var51 = (this.field2987 >> 1) + var50;
                    var48[var50] += this.field2979[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2984[var52];
                }
            }
        }
        float[] var54 = this.field2979;
        this.field2979 = field2984;
        field2984 = var54;
        this.field2987 = var4;
        this.field2991 = var12 - (var4 >> 1);
        this.field2989 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()I")
    public static final int method1190() {
        int var0 = field2972[field2980] >> field2973 & 0x1;
        field2973++;
        field2980 += field2973 >> 3;
        field2973 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "([B)V")
    private class170(byte[] arg0) {
        this.method1180(arg0);
    }
}
