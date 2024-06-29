import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class3 extends class165 {

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
    private static boolean field41 = false;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    private static int field34;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    private static int field38;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    private static int field43;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    private static int field46;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!an", name = "W", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Z")
    private boolean field35;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "Z")
    private boolean field51;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "[B")
    private static byte[] field50;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "[B")
    private byte[] field67;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[F")
    private float[] field37;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "[F")
    private static float[] field44;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "[F")
    private static float[] field48;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "[F")
    private static float[] field49;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "[F")
    private static float[] field57;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "[F")
    private static float[] field58;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "[F")
    private static float[] field61;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "[F")
    private static float[] field62;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[I")
    private static int[] field40;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "[I")
    private static int[] field53;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "[I")
    private static int[] field63;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "[Lvn;")
    private static class107[] field45;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "[Lpa;")
    public static class148[] field52;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "[Lej;")
    private static class239[] field54;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "[Ltg;")
    private static class41[] field59;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[Z")
    private static boolean[] field39;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "[[B")
    private byte[][] field47;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([B)V", line = 6)
    private static final void method13(byte[] arg0) {
        method14(arg0, 0);
        field46 = 0x1 << method20(4);
        field34 = 0x1 << method20(4);
        field57 = new float[field34];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field46 : field34;
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
            int var13 = class197.method1448(var5 - 1, -606);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class139.method1030(var13, (byte) 14, var14);
            }
            if (var1 == 0) {
                field44 = var6;
                field49 = var8;
                field61 = var10;
                field53 = var12;
            } else {
                field58 = var6;
                field62 = var8;
                field48 = var10;
                field63 = var12;
            }
        }
        int var15 = method20(8) + 1;
        field52 = new class148[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field52[var16] = new class148();
        }
        int var17 = method20(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method20(16);
        }
        int var19 = method20(6) + 1;
        field54 = new class239[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field54[var20] = new class239();
        }
        int var21 = method20(6) + 1;
        field59 = new class41[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field59[var22] = new class41();
        }
        int var23 = method20(6) + 1;
        field45 = new class107[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field45[var24] = new class107();
        }
        int var25 = method20(6) + 1;
        field39 = new boolean[var25];
        field40 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field39[var26] = method22() != 0;
            method20(16);
            method20(16);
            field40[var26] = method20(8);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)V", line = 158)
    private static final void method14(byte[] arg0, int arg1) {
        field50 = arg0;
        field43 = arg1;
        field38 = 0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lak;)Z", line = 163)
    private static final boolean method15(class172 arg0) {
        if (!field41) {
            byte[] var1 = arg0.method1287(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method13(var1);
            field41 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V", line = 181)
    public static void method16() {
        field50 = null;
        field52 = null;
        field54 = null;
        field59 = null;
        field45 = null;
        field39 = null;
        field40 = null;
        field57 = null;
        field44 = null;
        field49 = null;
        field61 = null;
        field58 = null;
        field62 = null;
        field48 = null;
        field53 = null;
        field63 = null;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)F", line = 202)
    public static final float method17(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "([B)V", line = 225)
    private final void method18(byte[] arg0) {
        class44 var2 = new class44(arg0);
        this.field64 = var2.method238((byte) 82);
        this.field55 = var2.method238((byte) 82);
        this.field60 = var2.method238((byte) 82);
        this.field42 = var2.method238((byte) 82);
        if (this.field42 < 0) {
            this.field42 = ~this.field42;
            this.field35 = true;
        }
        int var3 = var2.method238((byte) 82);
        this.field47 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method286((byte) -74);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method259(354643112, var7, 0, var5);
            this.field47[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)[F", line = 270)
    private final float[] method19(int arg0) {
        method14(this.field47[arg0], 0);
        method22();
        int var2 = method20(class197.method1448(field40.length - 1, -606));
        boolean var3 = field39[var2];
        int var4 = var3 ? field34 : field46;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method22() != 0;
            var6 = method22() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field46 >> 2);
            var9 = (field46 >> 2) + (var4 >> 2);
            var10 = field46 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field46 >> 2);
            var12 = (field46 >> 2) + (var4 - (var4 >> 2));
            var13 = field46 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class107 var14 = field45[field40[var2]];
        int var15 = var14.field1582;
        int var16 = var14.field1580[var15];
        boolean var17 = !field54[var16].method1715();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1583; var19++) {
            class41 var20 = field59[var14.field1581[var19]];
            float[] var21 = field57;
            var20.method211(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1582;
            int var23 = var14.field1580[var22];
            field54[var23].method1720(field57, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field57[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field57;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field58 : field44;
            float[] var32 = var3 ? field62 : field49;
            float[] var33 = var3 ? field48 : field61;
            int[] var34 = var3 ? field63 : field53;
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
            int var47 = class197.method1448(var4 - 1, -606);
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
                field57[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field57[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field36 > 0) {
            int var91 = this.field36 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field51) {
                for (int var92 = 0; var92 < this.field56; var92++) {
                    int var93 = (this.field36 >> 1) + var92;
                    var90[var92] += this.field37[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field57[var94];
                }
            }
        }
        float[] var96 = this.field37;
        this.field37 = field57;
        field57 = var96;
        this.field36 = var4;
        this.field56 = var12 - (var4 >> 1);
        this.field51 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)I", line = 685)
    public static final int method20(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field38) {
            int var3 = 8 - field38;
            int var4 = (0x1 << var3) - 1;
            var1 += (field50[field43] >> field38 & var4) << var2;
            field38 = 0;
            field43++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field50[field43] >> field38 & var5) << var2;
            field38 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lak;II)Lan;", line = 719)
    public static final class3 method21(class172 arg0, int arg1, int arg2) {
        if (method15(arg0)) {
            byte[] var3 = arg0.method1287(arg2, arg1, -1);
            return var3 == null ? null : new class3(var3);
        } else {
            arg0.method1269(arg2, arg1, (byte) -28);
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()I", line = 735)
    public static final int method22() {
        int var0 = field50[field43] >> field38 & 0x1;
        field38++;
        field43 += field38 >> 3;
        field38 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([I)Lom;", line = 742)
    public final class125 method23(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field67 == null) {
            this.field36 = 0;
            this.field37 = new float[field34];
            this.field67 = new byte[this.field55];
            this.field65 = 0;
            this.field66 = 0;
        }
        while (this.field66 < this.field47.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method19(this.field66);
            if (var2 != null) {
                int var3 = this.field65;
                int var4 = var2.length;
                if (var4 > this.field55 - var3) {
                    var4 = this.field55 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field67[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field65;
                }
                this.field65 = var3;
            }
            this.field66++;
        }
        this.field37 = null;
        byte[] var7 = this.field67;
        this.field67 = null;
        return new class125(this.field64, var7, this.field60, this.field42, this.field35);
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V", line = 802)
    private class3(byte[] arg0) {
        this.method18(arg0);
    }
}
