import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class288 extends class154 {

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "Z")
    private static boolean field4958 = false;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field4948;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    private static int field4957;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    private int field4959;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    private static int field4960;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private static int field4964;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    private static int field4968;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    private int field4974;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    private int field4979;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Z")
    private boolean field4955;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Z")
    private boolean field4976;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "[B")
    private static byte[] field4971;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "[B")
    private byte[] field4978;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "[F")
    private static float[] field4950;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "[F")
    private static float[] field4954;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "[F")
    private static float[] field4961;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "[F")
    private float[] field4962;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "[F")
    private static float[] field4963;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "[F")
    private static float[] field4965;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "[F")
    private static float[] field4970;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "[F")
    private static float[] field4975;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "[I")
    private static int[] field4956;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
    private static int[] field4969;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "[I")
    private static int[] field4973;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "[Lcj;")
    private static class133[] field4972;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "[Lhc;")
    private static class136[] field4981;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "[Lt;")
    private static class270[] field4953;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "[Laa;")
    public static class33[] field4966;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[Z")
    private static boolean[] field4977;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "[[B")
    private byte[][] field4952;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I", line = 11)
    public static final int method2025(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4960) {
            int var3 = 8 - field4960;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4971[field4964] >> field4960 & var4) << var2;
            field4960 = 0;
            field4964++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4971[field4964] >> field4960 & var5) << var2;
            field4960 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lgb;)Z", line = 54)
    private static final boolean method2026(class213 arg0) {
        if (!field4958) {
            byte[] var1 = arg0.method1453(0, (byte) -82, 0);
            if (var1 == null) {
                return false;
            }
            method2028(var1);
            field4958 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lgb;II)Lai;", line = 68)
    public static final class288 method2027(class213 arg0, int arg1, int arg2) {
        if (method2026(arg0)) {
            byte[] var3 = arg0.method1453(arg1, (byte) -26, arg2);
            return var3 == null ? null : new class288(var3);
        } else {
            arg0.method1442(arg2, arg1, -19595);
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([B)V", line = 83)
    private static final void method2028(byte[] arg0) {
        method2032(arg0, 0);
        field4968 = 0x1 << method2025(4);
        field4957 = 0x1 << method2025(4);
        field4970 = new float[field4957];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4968 : field4957;
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
            int var13 = class231.method1545(1937408966, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class122.method896((byte) -115, var13, var14);
            }
            if (var1 == 0) {
                field4950 = var6;
                field4961 = var8;
                field4954 = var10;
                field4973 = var12;
            } else {
                field4963 = var6;
                field4965 = var8;
                field4975 = var10;
                field4969 = var12;
            }
        }
        int var15 = method2025(8) + 1;
        field4966 = new class33[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4966[var16] = new class33();
        }
        int var17 = method2025(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2025(16);
        }
        int var19 = method2025(6) + 1;
        field4953 = new class270[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4953[var20] = new class270();
        }
        int var21 = method2025(6) + 1;
        field4972 = new class133[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4972[var22] = new class133();
        }
        int var23 = method2025(6) + 1;
        field4981 = new class136[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4981[var24] = new class136();
        }
        int var25 = method2025(6) + 1;
        field4977 = new boolean[var25];
        field4956 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4977[var26] = method2033() != 0;
            method2025(16);
            method2025(16);
            field4956[var26] = method2025(8);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)F", line = 236)
    public static final float method2029(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "([B)V", line = 251)
    private final void method2030(byte[] arg0) {
        class235 var2 = new class235(arg0);
        this.field4949 = var2.method1611(-83);
        this.field4974 = var2.method1611(-103);
        this.field4967 = var2.method1611(111);
        this.field4959 = var2.method1611(-124);
        if (this.field4959 < 0) {
            this.field4959 = ~this.field4959;
            this.field4955 = true;
        }
        int var3 = var2.method1611(-65);
        this.field4952 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1589(101);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1596(295019472, var5, var7, 0);
            this.field4952[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()V", line = 296)
    public static void method2031() {
        field4971 = null;
        field4966 = null;
        field4953 = null;
        field4972 = null;
        field4981 = null;
        field4977 = null;
        field4956 = null;
        field4970 = null;
        field4950 = null;
        field4961 = null;
        field4954 = null;
        field4963 = null;
        field4965 = null;
        field4975 = null;
        field4973 = null;
        field4969 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([BI)V", line = 314)
    private static final void method2032(byte[] arg0, int arg1) {
        field4971 = arg0;
        field4964 = arg1;
        field4960 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()I", line = 320)
    public static final int method2033() {
        int var0 = field4971[field4964] >> field4960 & 0x1;
        field4960++;
        field4964 += field4960 >> 3;
        field4960 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([I)Lbd;", line = 327)
    public final class198 method2034(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4978 == null) {
            this.field4951 = 0;
            this.field4962 = new float[field4957];
            this.field4978 = new byte[this.field4974];
            this.field4979 = 0;
            this.field4980 = 0;
        }
        while (this.field4980 < this.field4952.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2035(this.field4980);
            if (var2 != null) {
                int var3 = this.field4979;
                int var4 = var2.length;
                if (var4 > this.field4974 - var3) {
                    var4 = this.field4974 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4978[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4979;
                }
                this.field4979 = var3;
            }
            this.field4980++;
        }
        this.field4962 = null;
        byte[] var7 = this.field4978;
        this.field4978 = null;
        return new class198(this.field4949, var7, this.field4967, this.field4959, this.field4955);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "([B)V", line = 389)
    private class288(byte[] arg0) {
        this.method2030(arg0);
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)[F", line = 393)
    private final float[] method2035(int arg0) {
        method2032(this.field4952[arg0], 0);
        method2033();
        int var2 = method2025(class231.method1545(1937408966, field4956.length - 1));
        boolean var3 = field4977[var2];
        int var4 = var3 ? field4957 : field4968;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2033() != 0;
            var6 = method2033() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4968 >> 2);
            var9 = (field4968 >> 2) + (var4 >> 2);
            var10 = field4968 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4968 >> 2);
            var12 = (field4968 >> 2) + (var4 - (var4 >> 2));
            var13 = field4968 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class136 var14 = field4981[field4956[var2]];
        int var15 = var14.field2330;
        int var16 = var14.field2329[var15];
        boolean var17 = !field4953[var16].method1903();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2328; var19++) {
            class133 var20 = field4972[var14.field2331[var19]];
            float[] var21 = field4970;
            var20.method947(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2330;
            int var23 = var14.field2329[var22];
            field4953[var23].method1905(field4970, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4970[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4970;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4963 : field4950;
            float[] var32 = var3 ? field4965 : field4961;
            float[] var33 = var3 ? field4975 : field4954;
            int[] var34 = var3 ? field4969 : field4973;
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
            int var47 = class231.method1545(1937408966, var4 - 1);
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
                field4970[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4970[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4951 > 0) {
            int var91 = this.field4951 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4976) {
                for (int var92 = 0; var92 < this.field4948; var92++) {
                    int var93 = (this.field4951 >> 1) + var92;
                    var90[var92] += this.field4962[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4970[var94];
                }
            }
        }
        float[] var96 = this.field4962;
        this.field4962 = field4970;
        field4970 = var96;
        this.field4951 = var4;
        this.field4948 = var12 - (var4 >> 1);
        this.field4976 = var17;
        return var90;
    }
}
