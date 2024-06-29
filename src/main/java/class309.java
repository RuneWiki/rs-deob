import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class309 extends class508 {

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
    private static boolean field3975 = false;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    private static int field3971;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    private static int field3972;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    private int field3973;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private static int field3974;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    private int field3980;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private static int field3995;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    private int field3998;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    private int field3999;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Z")
    private boolean field3983;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Z")
    private boolean field3991;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "[B")
    private static byte[] field3986;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "[B")
    private byte[] field3997;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[F")
    private static float[] field3969;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[F")
    private static float[] field3970;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[F")
    private static float[] field3981;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "[F")
    private static float[] field3985;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "[F")
    private static float[] field3988;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[F")
    private float[] field3989;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "[F")
    private static float[] field3993;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "[F")
    private static float[] field3996;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "[I")
    private static int[] field3968;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
    private static int[] field3979;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
    private static int[] field3994;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "[Ltm;")
    private static class399[] field3992;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[Loj;")
    private static class410[] field3976;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[Lws;")
    private static class435[] field3966;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "[Ljv;")
    public static class479[] field3982;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "[Z")
    private static boolean[] field3978;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[[B")
    private byte[][] field3967;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B)V", line = 5)
    private final void method1839(byte[] arg0) {
        class88 var2 = new class88(arg0);
        this.field3977 = var2.method578(89);
        this.field3980 = var2.method578(95);
        this.field3973 = var2.method578(104);
        this.field3987 = var2.method578(114);
        if (this.field3987 < 0) {
            this.field3987 = ~this.field3987;
            this.field3983 = true;
        }
        int var3 = var2.method578(107);
        this.field3967 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method617(2);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method596(30576, 0, var7, var5);
            this.field3967[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldn;II)Lbb;", line = 56)
    public static final class309 method1840(class201 arg0, int arg1, int arg2) {
        if (method1850(arg0)) {
            byte[] var3 = arg0.method1313((byte) -112, arg1, arg2);
            return var3 == null ? null : new class309(var3);
        } else {
            arg0.method1317(0, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 72)
    public static final int method1841(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3995) {
            int var4 = 8 - field3995;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3986[field3972] >> field3995 & var5) << var2;
            field3995 = 0;
            field3972++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3986[field3972] >> field3995 & var3) << var2;
            field3995 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)F", line = 100)
    public static final float method1842(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldn;I)Lbb;", line = 115)
    public static final class309 method1843(class201 arg0, int arg1) {
        if (method1850(arg0)) {
            byte[] var2 = arg0.method1320(arg1, 1);
            return var2 == null ? null : new class309(var2);
        } else {
            arg0.method1294(arg1, (byte) -124);
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([I)Leb;", line = 130)
    public final class59 method1844(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3997 == null) {
            this.field3990 = 0;
            this.field3989 = new float[field3971];
            this.field3997 = new byte[this.field3980];
            this.field3998 = 0;
            this.field3999 = 0;
        }
        while (this.field3999 < this.field3967.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1847(this.field3999);
            if (var3 != null) {
                int var4 = this.field3998;
                int var5 = var3.length;
                if (var5 > this.field3980 - var4) {
                    var5 = this.field3980 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3997[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3998;
                }
                this.field3998 = var4;
            }
            this.field3999++;
        }
        this.field3989 = null;
        byte[] var2 = this.field3997;
        this.field3997 = null;
        return new class59(this.field3977, var2, this.field3973, this.field3987, this.field3983);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 193)
    public static void method1845() {
        field3986 = null;
        field3982 = null;
        field3966 = null;
        field3992 = null;
        field3976 = null;
        field3978 = null;
        field3994 = null;
        field3969 = null;
        field3993 = null;
        field3985 = null;
        field3970 = null;
        field3988 = null;
        field3996 = null;
        field3981 = null;
        field3979 = null;
        field3968 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I", line = 214)
    public static final int method1846() {
        int var0 = field3986[field3972] >> field3995 & 0x1;
        field3995++;
        field3972 += field3995 >> 3;
        field3995 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)[F", line = 229)
    private final float[] method1847(int arg0) {
        method1849(this.field3967[arg0], 0);
        method1846();
        int var2 = method1841(class487.method2909((byte) -91, field3994.length - 1));
        boolean var3 = field3978[var2];
        int var4 = var3 ? field3971 : field3974;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1846() != 0;
            var6 = method1846() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3974 >> 2);
            var9 = (field3974 >> 2) + (var4 >> 2);
            var10 = field3974 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3974 >> 2);
            var12 = (field3974 >> 2) + (var4 - (var4 >> 2));
            var13 = field3974 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class410 var14 = field3976[field3994[var2]];
        int var15 = var14.field5481;
        int var16 = var14.field5480[var15];
        boolean var17 = !field3966[var16].method2561();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5482; var19++) {
            class399 var95 = field3992[var14.field5483[var19]];
            float[] var96 = field3969;
            var95.method2374(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5481;
            int var21 = var14.field5480[var20];
            field3966[var21].method2563(field3969, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3969[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3969;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3988 : field3993;
            float[] var30 = var3 ? field3996 : field3985;
            float[] var31 = var3 ? field3981 : field3970;
            int[] var32 = var3 ? field3968 : field3979;
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
            int var35 = class487.method2909((byte) -91, var4 - 1);
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
                field3969[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3969[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3990 > 0) {
            int var49 = this.field3990 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3991) {
                for (int var50 = 0; var50 < this.field3984; var50++) {
                    int var51 = (this.field3990 >> 1) + var50;
                    var48[var50] += this.field3989[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3969[var52];
                }
            }
        }
        float[] var54 = this.field3989;
        this.field3989 = field3969;
        field3969 = var54;
        this.field3990 = var4;
        this.field3984 = var12 - (var4 >> 1);
        this.field3991 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "([B)V", line = 644)
    private static final void method1848(byte[] arg0) {
        method1849(arg0, 0);
        field3974 = 0x1 << method1841(4);
        field3971 = 0x1 << method1841(4);
        field3969 = new float[field3971];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3974 : field3971;
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
            int var25 = class487.method2909((byte) -91, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class421.method2483(var26, var25, (byte) -111);
            }
            if (var1 == 0) {
                field3993 = var18;
                field3985 = var20;
                field3970 = var22;
                field3979 = var24;
            } else {
                field3988 = var18;
                field3996 = var20;
                field3981 = var22;
                field3968 = var24;
            }
        }
        int var2 = method1841(8) + 1;
        field3982 = new class479[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3982[var3] = new class479();
        }
        int var4 = method1841(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1841(16);
        }
        int var6 = method1841(6) + 1;
        field3966 = new class435[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3966[var7] = new class435();
        }
        int var8 = method1841(6) + 1;
        field3992 = new class399[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3992[var9] = new class399();
        }
        int var10 = method1841(6) + 1;
        field3976 = new class410[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3976[var11] = new class410();
        }
        int var12 = method1841(6) + 1;
        field3978 = new boolean[var12];
        field3994 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3978[var13] = method1846() != 0;
            method1841(16);
            method1841(16);
            field3994[var13] = method1841(8);
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V", line = 797)
    private class309(byte[] arg0) {
        this.method1839(arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BI)V", line = 802)
    private static final void method1849(byte[] arg0, int arg1) {
        field3986 = arg0;
        field3972 = arg1;
        field3995 = 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldn;)Z", line = 808)
    private static final boolean method1850(class201 arg0) {
        if (!field3975) {
            byte[] var1 = arg0.method1313((byte) -104, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1848(var1);
            field3975 = true;
        }
        return true;
    }
}
