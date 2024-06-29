import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class16 extends class128 {

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Z")
    private static boolean field170 = false;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private static int field168;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    private static int field171;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private static int field172;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    private static int field186;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Z")
    private boolean field189;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "Z")
    private boolean field194;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "[B")
    private byte[] field199;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "[B")
    private static byte[] field200;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[F")
    private static float[] field174;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[F")
    private static float[] field175;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[F")
    private static float[] field181;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "[F")
    private static float[] field182;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "[F")
    private static float[] field185;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "[F")
    private static float[] field188;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[F")
    private static float[] field190;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "[F")
    private float[] field196;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
    private static int[] field179;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "[I")
    private static int[] field183;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
    private static int[] field191;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "[Lje;")
    private static class113[] field193;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Ljc;")
    private static class284[] field167;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[Llh;")
    public static class58[] field192;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "[Lbe;")
    private static class91[] field178;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[Z")
    private static boolean[] field177;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[[B")
    private byte[][] field195;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)I")
    public static final int method75(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field172) {
            int var4 = 8 - field172;
            int var5 = (0x1 << var4) - 1;
            var1 += (field200[field171] >> field172 & var5) << var2;
            field172 = 0;
            field171++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field200[field171] >> field172 & var3) << var2;
            field172 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BI)V")
    private static final void method76(byte[] arg0, int arg1) {
        field200 = arg0;
        field171 = arg1;
        field172 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([B)V")
    private static final void method77(byte[] arg0) {
        method76(arg0, 0);
        field168 = 0x1 << method75(4);
        field186 = 0x1 << method75(4);
        field174 = new float[field186];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field168 : field186;
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
            int var25 = class47.method336(var17 - 1, 20541);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class270.method1813(var25, true, var26);
            }
            if (var1 == 0) {
                field185 = var18;
                field181 = var20;
                field190 = var22;
                field191 = var24;
            } else {
                field188 = var18;
                field175 = var20;
                field182 = var22;
                field179 = var24;
            }
        }
        int var2 = method75(8) + 1;
        field192 = new class58[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field192[var3] = new class58();
        }
        int var4 = method75(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method75(16);
        }
        int var6 = method75(6) + 1;
        field193 = new class113[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field193[var7] = new class113();
        }
        int var8 = method75(6) + 1;
        field178 = new class91[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field178[var9] = new class91();
        }
        int var10 = method75(6) + 1;
        field167 = new class284[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field167[var11] = new class284();
        }
        int var12 = method75(6) + 1;
        field177 = new boolean[var12];
        field183 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field177[var13] = method82() != 0;
            method75(16);
            method75(16);
            field183[var13] = method75(8);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ldk;II)Lae;")
    public static final class16 method78(class251 arg0, int arg1, int arg2) {
        if (method85(arg0)) {
            byte[] var3 = arg0.method1680(arg2, arg1, -92);
            return var3 == null ? null : new class16(var3);
        } else {
            arg0.method1693(3943, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I)Lqj;")
    public final class248 method79(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field199 == null) {
            this.field187 = 0;
            this.field196 = new float[field186];
            this.field199 = new byte[this.field173];
            this.field198 = 0;
            this.field197 = 0;
        }
        while (this.field197 < this.field195.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method84(this.field197);
            if (var3 != null) {
                int var4 = this.field198;
                int var5 = var3.length;
                if (var5 > this.field173 - var4) {
                    var5 = this.field173 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field199[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field198;
                }
                this.field198 = var4;
            }
            this.field197++;
        }
        this.field196 = null;
        byte[] var2 = this.field199;
        this.field199 = null;
        return new class248(this.field180, var2, this.field184, this.field169, this.field194);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([B)V")
    private final void method80(byte[] arg0) {
        class162 var2 = new class162(arg0);
        this.field180 = var2.method1157(65280);
        this.field173 = var2.method1157(65280);
        this.field184 = var2.method1157(65280);
        this.field169 = var2.method1157(65280);
        if (this.field169 < 0) {
            this.field169 = ~this.field169;
            this.field194 = true;
        }
        int var3 = var2.method1157(65280);
        this.field195 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1133((byte) 53);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1136(var5, var7, -116, 0);
            this.field195[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
    public static void method81() {
        field200 = null;
        field192 = null;
        field193 = null;
        field178 = null;
        field167 = null;
        field177 = null;
        field183 = null;
        field174 = null;
        field185 = null;
        field181 = null;
        field190 = null;
        field188 = null;
        field175 = null;
        field182 = null;
        field191 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()I")
    public static final int method82() {
        int var0 = field200[field171] >> field172 & 0x1;
        field172++;
        field171 += field172 >> 3;
        field172 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)F")
    public static final float method83(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)[F")
    private final float[] method84(int arg0) {
        method76(this.field195[arg0], 0);
        method82();
        int var2 = method75(class47.method336(field183.length - 1, 20541));
        boolean var3 = field177[var2];
        int var4 = var3 ? field186 : field168;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method82() != 0;
            var6 = method82() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field168 >> 2);
            var9 = (field168 >> 2) + (var4 >> 2);
            var10 = field168 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field168 >> 2);
            var12 = (field168 >> 2) + (var4 - (var4 >> 2));
            var13 = field168 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class284 var14 = field167[field183[var2]];
        int var15 = var14.field4516;
        int var16 = var14.field4515[var15];
        boolean var17 = !field193[var16].method792();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4513; var19++) {
            class91 var95 = field178[var14.field4514[var19]];
            float[] var96 = field174;
            var95.method615(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4516;
            int var21 = var14.field4515[var20];
            field193[var21].method793(field174, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field174[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field174;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field188 : field185;
            float[] var30 = var3 ? field175 : field181;
            float[] var31 = var3 ? field182 : field190;
            int[] var32 = var3 ? field179 : field191;
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
            int var35 = class47.method336(var4 - 1, 20541);
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
                field174[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field174[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field187 > 0) {
            int var49 = this.field187 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field189) {
                for (int var50 = 0; var50 < this.field176; var50++) {
                    int var51 = (this.field187 >> 1) + var50;
                    var48[var50] += this.field196[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field174[var52];
                }
            }
        }
        float[] var54 = this.field196;
        this.field196 = field174;
        field174 = var54;
        this.field187 = var4;
        this.field176 = var12 - (var4 >> 1);
        this.field189 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ldk;)Z")
    private static final boolean method85(class251 arg0) {
        if (!field170) {
            byte[] var1 = arg0.method1680(0, 0, -117);
            if (var1 == null) {
                return false;
            }
            method77(var1);
            field170 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "([B)V")
    private class16(byte[] arg0) {
        this.method80(arg0);
    }
}
