import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 extends class125 {

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Z")
    private static boolean field2902 = false;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    private static int field2913;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private static int field2918;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    private int field2921;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    private static int field2926;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private static int field2929;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field2931;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    private int field2932;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Z")
    private boolean field2907;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "Z")
    private boolean field2923;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "[B")
    private static byte[] field2915;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "[B")
    private byte[] field2930;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[F")
    private static float[] field2900;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[F")
    private static float[] field2904;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[F")
    private static float[] field2905;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[F")
    private static float[] field2908;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[F")
    private static float[] field2910;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "[F")
    private static float[] field2920;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "[F")
    private float[] field2924;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "[F")
    private static float[] field2933;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    private static int[] field2903;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[I")
    private static int[] field2912;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "[I")
    private static int[] field2919;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[Lwf;")
    private static class159[] field2914;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Lcd;")
    private static class19[] field2922;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "[Ljd;")
    private static class66[] field2917;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "[Ll;")
    public static class76[] field2925;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "[Z")
    private static boolean[] field2901;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[[B")
    private byte[][] field2916;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([I)Lre;")
    public final class123 method985(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2930 == null) {
            this.field2921 = 0;
            this.field2924 = new float[field2913];
            this.field2930 = new byte[this.field2911];
            this.field2932 = 0;
            this.field2931 = 0;
        }
        while (this.field2931 < this.field2916.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method995(this.field2931);
            if (var3 != null) {
                int var4 = this.field2932;
                int var5 = var3.length;
                if (var5 > this.field2911 - var4) {
                    var5 = this.field2911 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2930[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2932;
                }
                this.field2932 = var4;
            }
            this.field2931++;
        }
        this.field2924 = null;
        byte[] var2 = this.field2930;
        this.field2930 = null;
        return new class123(this.field2927, var2, this.field2928, this.field2906, this.field2907);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
    public static final int method986() {
        int var0 = field2915[field2918] >> field2926 & 0x1;
        field2926++;
        field2918 += field2926 >> 3;
        field2926 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V")
    public static void method987() {
        field2915 = null;
        field2925 = null;
        field2914 = null;
        field2922 = null;
        field2917 = null;
        field2901 = null;
        field2903 = null;
        field2933 = null;
        field2908 = null;
        field2910 = null;
        field2920 = null;
        field2905 = null;
        field2900 = null;
        field2904 = null;
        field2919 = null;
        field2912 = null;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)F")
    public static final float method988(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
    private static final void method989(byte[] arg0) {
        method990(arg0, 0);
        field2929 = 0x1 << method994(4);
        field2913 = 0x1 << method994(4);
        field2933 = new float[field2913];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2929 : field2913;
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
            int var25 = class67.method454(-109, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class112.method823(var25, 1, var26);
            }
            if (var1 == 0) {
                field2908 = var18;
                field2910 = var20;
                field2920 = var22;
                field2919 = var24;
            } else {
                field2905 = var18;
                field2900 = var20;
                field2904 = var22;
                field2912 = var24;
            }
        }
        int var2 = method994(8) + 1;
        field2925 = new class76[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2925[var3] = new class76();
        }
        int var4 = method994(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method994(16);
        }
        int var6 = method994(6) + 1;
        field2914 = new class159[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2914[var7] = new class159();
        }
        int var8 = method994(6) + 1;
        field2922 = new class19[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2922[var9] = new class19();
        }
        int var10 = method994(6) + 1;
        field2917 = new class66[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2917[var11] = new class66();
        }
        int var12 = method994(6) + 1;
        field2901 = new boolean[var12];
        field2903 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2901[var13] = method986() != 0;
            method994(16);
            method994(16);
            field2903[var13] = method994(8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
    private static final void method990(byte[] arg0, int arg1) {
        field2915 = arg0;
        field2918 = arg1;
        field2926 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lc;)Z")
    private static final boolean method991(class15 arg0) {
        if (!field2902) {
            byte[] var1 = arg0.method114((byte) -34, 0, 0);
            if (var1 == null) {
                return false;
            }
            method989(var1);
            field2902 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lc;II)Lsc;")
    public static final class128 method992(class15 arg0, int arg1, int arg2) {
        if (method991(arg0)) {
            byte[] var3 = arg0.method114((byte) 96, arg1, arg2);
            return var3 == null ? null : new class128(var3);
        } else {
            arg0.method118(arg1, 104, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([B)V")
    private final void method993(byte[] arg0) {
        class138 var2 = new class138(arg0);
        this.field2927 = var2.method1062(1809568712);
        this.field2911 = var2.method1062(1809568712);
        this.field2928 = var2.method1062(1809568712);
        this.field2906 = var2.method1062(1809568712);
        if (this.field2906 < 0) {
            this.field2906 = ~this.field2906;
            this.field2907 = true;
        }
        int var3 = var2.method1062(1809568712);
        this.field2916 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1055(113);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1076(var5, 16711680, 0, var7);
            this.field2916[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
    public static final int method994(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2926) {
            int var4 = 8 - field2926;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2915[field2918] >> field2926 & var5) << var2;
            field2926 = 0;
            field2918++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2915[field2918] >> field2926 & var3) << var2;
            field2926 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)[F")
    private final float[] method995(int arg0) {
        method990(this.field2916[arg0], 0);
        method986();
        int var2 = method994(class67.method454(-102, field2903.length - 1));
        boolean var3 = field2901[var2];
        int var4 = var3 ? field2913 : field2929;
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
            var8 = (var4 >> 2) - (field2929 >> 2);
            var9 = (field2929 >> 2) + (var4 >> 2);
            var10 = field2929 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2929 >> 2);
            var12 = (field2929 >> 2) + (var4 - (var4 >> 2));
            var13 = field2929 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class66 var14 = field2917[field2903[var2]];
        int var15 = var14.field1495;
        int var16 = var14.field1494[var15];
        boolean var17 = !field2914[var16].method1228();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1492; var19++) {
            class19 var95 = field2922[var14.field1493[var19]];
            float[] var96 = field2933;
            var95.method151(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1495;
            int var21 = var14.field1494[var20];
            field2914[var21].method1227(field2933, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2933[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2933;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2905 : field2908;
            float[] var30 = var3 ? field2900 : field2910;
            float[] var31 = var3 ? field2904 : field2920;
            int[] var32 = var3 ? field2912 : field2919;
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
            int var35 = class67.method454(-119, var4 - 1);
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
                field2933[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2933[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2921 > 0) {
            int var49 = this.field2921 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2923) {
                for (int var50 = 0; var50 < this.field2909; var50++) {
                    int var51 = (this.field2921 >> 1) + var50;
                    var48[var50] += this.field2924[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2933[var52];
                }
            }
        }
        float[] var54 = this.field2924;
        this.field2924 = field2933;
        field2933 = var54;
        this.field2921 = var4;
        this.field2909 = var12 - (var4 >> 1);
        this.field2923 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
    private class128(byte[] arg0) {
        this.method993(arg0);
    }
}
