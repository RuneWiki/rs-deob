import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class360 extends class180 {

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Z")
    private static boolean field5032 = false;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    private int field5010;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    private static int field5013;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    private static int field5016;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    private static int field5022;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    private static int field5024;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    private int field5036;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    private int field5039;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    private int field5040;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Z")
    private boolean field5009;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Z")
    private boolean field5029;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[B")
    private static byte[] field5018;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "[B")
    private byte[] field5038;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "[F")
    private static float[] field5012;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[F")
    private static float[] field5014;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[F")
    private static float[] field5019;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[F")
    private static float[] field5020;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "[F")
    private static float[] field5030;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "[F")
    private float[] field5033;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "[F")
    private static float[] field5034;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "[F")
    private static float[] field5035;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "[I")
    private static int[] field5007;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
    private static int[] field5017;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
    private static int[] field5025;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "[Lro;")
    private static class151[] field5021;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "[Lic;")
    private static class186[] field5031;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "[Lea;")
    private static class316[] field5026;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "[Lkq;")
    public static class45[] field5028;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "[Z")
    private static boolean[] field5027;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "[[B")
    private byte[][] field5023;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lfc;)Z")
    private static final boolean method2155(class343 arg0) {
        if (!field5032) {
            byte[] var1 = arg0.method2029(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2157(var1);
            field5032 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)I")
    public static final int method2156(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5024) {
            int var4 = 8 - field5024;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5018[field5022] >> field5024 & var5) << var2;
            field5024 = 0;
            field5022++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5018[field5022] >> field5024 & var3) << var2;
            field5024 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([B)V")
    private static final void method2157(byte[] arg0) {
        method2162(arg0, 0);
        field5016 = 0x1 << method2156(4);
        field5013 = 0x1 << method2156(4);
        field5012 = new float[field5013];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5016 : field5013;
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
            int var25 = class138.method842(-257, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class36.method308(var26, (byte) 24, var25);
            }
            if (var1 == 0) {
                field5035 = var18;
                field5014 = var20;
                field5034 = var22;
                field5025 = var24;
            } else {
                field5020 = var18;
                field5019 = var20;
                field5030 = var22;
                field5017 = var24;
            }
        }
        int var2 = method2156(8) + 1;
        field5028 = new class45[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5028[var3] = new class45();
        }
        int var4 = method2156(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2156(16);
        }
        int var6 = method2156(6) + 1;
        field5026 = new class316[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5026[var7] = new class316();
        }
        int var8 = method2156(6) + 1;
        field5021 = new class151[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5021[var9] = new class151();
        }
        int var10 = method2156(6) + 1;
        field5031 = new class186[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5031[var11] = new class186();
        }
        int var12 = method2156(6) + 1;
        field5027 = new boolean[var12];
        field5007 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5027[var13] = method2159() != 0;
            method2156(16);
            method2156(16);
            field5007[var13] = method2156(8);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "([B)V")
    private final void method2158(byte[] arg0) {
        class425 var2 = new class425(arg0);
        this.field5008 = var2.method2502((byte) -86);
        this.field5011 = var2.method2502((byte) -86);
        this.field5015 = var2.method2502((byte) -86);
        this.field5010 = var2.method2502((byte) -86);
        if (this.field5010 < 0) {
            this.field5010 = ~this.field5010;
            this.field5009 = true;
        }
        int var3 = var2.method2502((byte) -86);
        this.field5023 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2503(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2507(var7, (byte) 61, 0, var5);
            this.field5023[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()I")
    public static final int method2159() {
        int var0 = field5018[field5022] >> field5024 & 0x1;
        field5024++;
        field5022 += field5024 >> 3;
        field5024 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)F")
    public static final float method2160(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)[F")
    private final float[] method2161(int arg0) {
        method2162(this.field5023[arg0], 0);
        method2159();
        int var2 = method2156(class138.method842(-257, field5007.length - 1));
        boolean var3 = field5027[var2];
        int var4 = var3 ? field5013 : field5016;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2159() != 0;
            var6 = method2159() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5016 >> 2);
            var9 = (field5016 >> 2) + (var4 >> 2);
            var10 = field5016 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5016 >> 2);
            var12 = (field5016 >> 2) + (var4 - (var4 >> 2));
            var13 = field5016 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class186 var14 = field5031[field5007[var2]];
        int var15 = var14.field2698;
        int var16 = var14.field2699[var15];
        boolean var17 = !field5026[var16].method1906();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2696; var19++) {
            class151 var95 = field5021[var14.field2697[var19]];
            float[] var96 = field5012;
            var95.method916(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2698;
            int var21 = var14.field2699[var20];
            field5026[var21].method1902(field5012, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5012[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5012;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5020 : field5035;
            float[] var30 = var3 ? field5019 : field5014;
            float[] var31 = var3 ? field5030 : field5034;
            int[] var32 = var3 ? field5017 : field5025;
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
            int var35 = class138.method842(-257, var4 - 1);
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
                field5012[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5012[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5037 > 0) {
            int var49 = this.field5037 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5029) {
                for (int var50 = 0; var50 < this.field5036; var50++) {
                    int var51 = (this.field5037 >> 1) + var50;
                    var48[var50] += this.field5033[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5012[var52];
                }
            }
        }
        float[] var54 = this.field5033;
        this.field5033 = field5012;
        field5012 = var54;
        this.field5037 = var4;
        this.field5036 = var12 - (var4 >> 1);
        this.field5029 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([BI)V")
    private static final void method2162(byte[] arg0, int arg1) {
        field5018 = arg0;
        field5022 = arg1;
        field5024 = 0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lfc;II)Lk;")
    public static final class360 method2163(class343 arg0, int arg1, int arg2) {
        if (method2155(arg0)) {
            byte[] var3 = arg0.method2029(arg1, arg2, 0);
            return var3 == null ? null : new class360(var3);
        } else {
            arg0.method2035(arg1, arg2, -5657);
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I)Lcu;")
    public final class144 method2164(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5038 == null) {
            this.field5037 = 0;
            this.field5033 = new float[field5013];
            this.field5038 = new byte[this.field5011];
            this.field5039 = 0;
            this.field5040 = 0;
        }
        while (this.field5040 < this.field5023.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2161(this.field5040);
            if (var3 != null) {
                int var4 = this.field5039;
                int var5 = var3.length;
                if (var5 > this.field5011 - var4) {
                    var5 = this.field5011 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5038[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5039;
                }
                this.field5039 = var4;
            }
            this.field5040++;
        }
        this.field5033 = null;
        byte[] var2 = this.field5038;
        this.field5038 = null;
        return new class144(this.field5008, var2, this.field5015, this.field5010, this.field5009);
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V")
    public static void method2165() {
        field5018 = null;
        field5028 = null;
        field5026 = null;
        field5021 = null;
        field5031 = null;
        field5027 = null;
        field5007 = null;
        field5012 = null;
        field5035 = null;
        field5014 = null;
        field5034 = null;
        field5020 = null;
        field5019 = null;
        field5030 = null;
        field5025 = null;
        field5017 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([B)V")
    private class360(byte[] arg0) {
        this.method2158(arg0);
    }
}
