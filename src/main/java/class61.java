import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class61 extends class65 {

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "Z")
    private static boolean field951 = false;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    private static int field947;

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!kda", name = "s", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!kda", name = "t", descriptor = "I")
    private static int field955;

    @OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
    private static int field956;

    @OriginalMember(owner = "client!kda", name = "y", descriptor = "I")
    private static int field960;

    @OriginalMember(owner = "client!kda", name = "z", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!kda", name = "L", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!kda", name = "O", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!kda", name = "P", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "Z")
    private boolean field966;

    @OriginalMember(owner = "client!kda", name = "M", descriptor = "Z")
    private boolean field974;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "[B")
    private static byte[] field949;

    @OriginalMember(owner = "client!kda", name = "Q", descriptor = "[B")
    private byte[] field978;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "[F")
    private static float[] field946;

    @OriginalMember(owner = "client!kda", name = "v", descriptor = "[F")
    private float[] field957;

    @OriginalMember(owner = "client!kda", name = "w", descriptor = "[F")
    private static float[] field958;

    @OriginalMember(owner = "client!kda", name = "C", descriptor = "[F")
    private static float[] field964;

    @OriginalMember(owner = "client!kda", name = "F", descriptor = "[F")
    private static float[] field967;

    @OriginalMember(owner = "client!kda", name = "K", descriptor = "[F")
    private static float[] field972;

    @OriginalMember(owner = "client!kda", name = "N", descriptor = "[F")
    private static float[] field975;

    @OriginalMember(owner = "client!kda", name = "R", descriptor = "[F")
    private static float[] field979;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "[I")
    private static int[] field948;

    @OriginalMember(owner = "client!kda", name = "B", descriptor = "[I")
    private static int[] field963;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "[I")
    private static int[] field970;

    @OriginalMember(owner = "client!kda", name = "x", descriptor = "[Lcha;")
    private static class278[] field959;

    @OriginalMember(owner = "client!kda", name = "r", descriptor = "[Lhm;")
    public static class415[] field953;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "[Lbv;")
    private static class480[] field969;

    @OriginalMember(owner = "client!kda", name = "D", descriptor = "[Lpf;")
    private static class728[] field965;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "[Z")
    private static boolean[] field968;

    @OriginalMember(owner = "client!kda", name = "A", descriptor = "[[B")
    private byte[][] field962;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "()I")
    public static final int method598() {
        int var0 = field949[field960] >> field955 & 0x1;
        field955++;
        field960 += field955 >> 3;
        field955 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([I)Lso;")
    public final class538 method599(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field978 == null) {
            this.field952 = 0;
            this.field957 = new float[field947];
            this.field978 = new byte[this.field971];
            this.field977 = 0;
            this.field976 = 0;
        }
        while (this.field976 < this.field962.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method605(this.field976);
            if (var3 != null) {
                int var4 = this.field977;
                int var5 = var3.length;
                if (var5 > this.field971 - var4) {
                    var5 = this.field971 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field978[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field977;
                }
                this.field977 = var4;
            }
            this.field976++;
        }
        this.field957 = null;
        byte[] var2 = this.field978;
        this.field978 = null;
        return new class538(this.field961, var2, this.field954, this.field950, this.field974);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)F")
    public static final float method600(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([B)V")
    private static final void method601(byte[] arg0) {
        method603(arg0, 0);
        field956 = 0x1 << method608(4);
        field947 = 0x1 << method608(4);
        field972 = new float[field947];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field956 : field947;
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
            int var25 = class730.method4052(var17 - 1, -22);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class151.method1154(var25, -311570175, var26);
            }
            if (var1 == 0) {
                field967 = var18;
                field979 = var20;
                field958 = var22;
                field948 = var24;
            } else {
                field975 = var18;
                field964 = var20;
                field946 = var22;
                field970 = var24;
            }
        }
        int var2 = method608(8) + 1;
        field953 = new class415[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field953[var3] = new class415();
        }
        int var4 = method608(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method608(16);
        }
        int var6 = method608(6) + 1;
        field965 = new class728[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field965[var7] = new class728();
        }
        int var8 = method608(6) + 1;
        field959 = new class278[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field959[var9] = new class278();
        }
        int var10 = method608(6) + 1;
        field969 = new class480[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field969[var11] = new class480();
        }
        int var12 = method608(6) + 1;
        field968 = new boolean[var12];
        field963 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field968[var13] = method598() != 0;
            method608(16);
            method608(16);
            field963[var13] = method608(8);
        }
        field951 = true;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "([B)V")
    private final void method602(byte[] arg0) {
        class301 var2 = new class301(arg0);
        this.field961 = var2.method1934(-2);
        this.field971 = var2.method1934(-2);
        this.field954 = var2.method1934(-2);
        this.field950 = var2.method1934(-2);
        if (this.field950 < 0) {
            this.field950 = ~this.field950;
            this.field974 = true;
        }
        int var3 = var2.method1934(-2);
        this.field962 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1987(-21);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1936(0, 10046, var5, var7);
            this.field962[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([BI)V")
    private static final void method603(byte[] arg0, int arg1) {
        field949 = arg0;
        field960 = arg1;
        field955 = 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lla;)Z")
    private static final boolean method604(class422 arg0) {
        if (!field951) {
            byte[] var1 = arg0.method2624(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method601(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)[F")
    private final float[] method605(int arg0) {
        method603(this.field962[arg0], 0);
        method598();
        int var2 = method608(class730.method4052(field963.length - 1, 120));
        boolean var3 = field968[var2];
        int var4 = var3 ? field947 : field956;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method598() != 0;
            var6 = method598() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field956 >> 2);
            var9 = (field956 >> 2) + (var4 >> 2);
            var10 = field956 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field956 >> 2);
            var12 = (field956 >> 2) + (var4 - (var4 >> 2));
            var13 = field956 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class480 var14 = field969[field963[var2]];
        int var15 = var14.field6943;
        int var16 = var14.field6946[var15];
        boolean var17 = !field965[var16].method4020();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6944; var19++) {
            class278 var95 = field959[var14.field6945[var19]];
            float[] var96 = field972;
            var95.method1817(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6943;
            int var21 = var14.field6946[var20];
            field965[var21].method4023(field972, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field972[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field972;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field975 : field967;
            float[] var30 = var3 ? field964 : field979;
            float[] var31 = var3 ? field946 : field958;
            int[] var32 = var3 ? field970 : field948;
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
            int var35 = class730.method4052(var4 - 1, -44);
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
                field972[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field972[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field952 > 0) {
            int var49 = this.field952 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field966) {
                for (int var50 = 0; var50 < this.field973; var50++) {
                    int var51 = (this.field952 >> 1) + var50;
                    var48[var50] += this.field957[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field972[var52];
                }
            }
        }
        float[] var54 = this.field957;
        this.field957 = field972;
        field972 = var54;
        this.field952 = var4;
        this.field973 = var12 - (var4 >> 1);
        this.field966 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "()V")
    public static void method606() {
        field949 = null;
        field953 = null;
        field965 = null;
        field959 = null;
        field969 = null;
        field968 = null;
        field963 = null;
        field972 = null;
        field967 = null;
        field979 = null;
        field958 = null;
        field975 = null;
        field964 = null;
        field946 = null;
        field948 = null;
        field970 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lla;II)Lkda;")
    public static final class61 method607(class422 arg0, int arg1, int arg2) {
        if (method604(arg0)) {
            byte[] var3 = arg0.method2624(0, arg1, arg2);
            return var3 == null ? null : new class61(var3);
        } else {
            arg0.method2640(arg1, arg2, 123);
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
    public static final int method608(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field955) {
            int var4 = 8 - field955;
            int var5 = (0x1 << var4) - 1;
            var1 += (field949[field960] >> field955 & var5) << var2;
            field955 = 0;
            field960++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field949[field960] >> field955 & var3) << var2;
            field955 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lla;I)Lkda;")
    public static final class61 method609(class422 arg0, int arg1) {
        if (method604(arg0)) {
            byte[] var2 = arg0.method2633(true, arg1);
            return var2 == null ? null : new class61(var2);
        } else {
            arg0.method2621(arg1, -28975);
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([B)V")
    private class61(byte[] arg0) {
        this.method602(arg0);
    }
}
