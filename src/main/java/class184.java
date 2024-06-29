import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class184 extends class249 {

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Z")
    private static boolean field3193 = false;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    private static int field3195;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    private static int field3206;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private static int field3207;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    private static int field3210;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Z")
    private boolean field3191;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Z")
    private boolean field3192;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "[B")
    private static byte[] field3198;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "[B")
    private byte[] field3214;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[F")
    private static float[] field3184;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "[F")
    private static float[] field3185;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "[F")
    private static float[] field3186;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "[F")
    private static float[] field3194;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "[F")
    private static float[] field3196;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[F")
    private static float[] field3200;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[F")
    private float[] field3202;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "[F")
    private static float[] field3204;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    private static int[] field3189;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "[I")
    private static int[] field3197;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "[I")
    private static int[] field3205;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[Lkd;")
    private static class104[] field3188;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "[Lwi;")
    private static class172[] field3209;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "[Loi;")
    public static class28[] field3187;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[Loc;")
    private static class69[] field3190;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[Z")
    private static boolean[] field3199;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "[[B")
    private byte[][] field3182;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lff;)Z")
    private static final boolean method1293(class3 arg0) {
        if (!field3193) {
            byte[] var1 = arg0.method23(0, 103, 0);
            if (var1 == null) {
                return false;
            }
            method1302(var1);
            field3193 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([I)Lvh;")
    public final class131 method1294(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3214 == null) {
            this.field3201 = 0;
            this.field3202 = new float[field3195];
            this.field3214 = new byte[this.field3208];
            this.field3213 = 0;
            this.field3215 = 0;
        }
        while (this.field3215 < this.field3182.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1301(this.field3215);
            if (var3 != null) {
                int var4 = this.field3213;
                int var5 = var3.length;
                if (var5 > this.field3208 - var4) {
                    var5 = this.field3208 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3214[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3213;
                }
                this.field3213 = var4;
            }
            this.field3215++;
        }
        this.field3202 = null;
        byte[] var2 = this.field3214;
        this.field3214 = null;
        return new class131(this.field3183, var2, this.field3211, this.field3203, this.field3191);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
    public static final int method1295(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3207) {
            int var4 = 8 - field3207;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3198[field3210] >> field3207 & var5) << var2;
            field3207 = 0;
            field3210++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3198[field3210] >> field3207 & var3) << var2;
            field3207 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
    public static void method1296() {
        field3198 = null;
        field3187 = null;
        field3209 = null;
        field3188 = null;
        field3190 = null;
        field3199 = null;
        field3189 = null;
        field3196 = null;
        field3194 = null;
        field3204 = null;
        field3186 = null;
        field3185 = null;
        field3184 = null;
        field3200 = null;
        field3205 = null;
        field3197 = null;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
    public static final int method1297() {
        int var0 = field3198[field3210] >> field3207 & 0x1;
        field3207++;
        field3210 += field3207 >> 3;
        field3207 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([B)V")
    private final void method1298(byte[] arg0) {
        class239 var2 = new class239(arg0);
        this.field3183 = var2.method1617((byte) -43);
        this.field3208 = var2.method1617((byte) -43);
        this.field3211 = var2.method1617((byte) -43);
        this.field3203 = var2.method1617((byte) -43);
        if (this.field3203 < 0) {
            this.field3203 = ~this.field3203;
            this.field3191 = true;
        }
        int var3 = var2.method1617((byte) -43);
        this.field3182 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1651(4139);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1630(var5, (byte) 0, var7, 0);
            this.field3182[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)F")
    public static final float method1299(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lff;II)Lod;")
    public static final class184 method1300(class3 arg0, int arg1, int arg2) {
        if (method1293(arg0)) {
            byte[] var3 = arg0.method23(arg2, 103, arg1);
            return var3 == null ? null : new class184(var3);
        } else {
            arg0.method29(arg1, arg2, (byte) 126);
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)[F")
    private final float[] method1301(int arg0) {
        method1303(this.field3182[arg0], 0);
        method1297();
        int var2 = method1295(class91.method643(field3189.length - 1, 39));
        boolean var3 = field3199[var2];
        int var4 = var3 ? field3195 : field3206;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1297() != 0;
            var6 = method1297() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3206 >> 2);
            var9 = (field3206 >> 2) + (var4 >> 2);
            var10 = field3206 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3206 >> 2);
            var12 = (field3206 >> 2) + (var4 - (var4 >> 2));
            var13 = field3206 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class69 var14 = field3190[field3189[var2]];
        int var15 = var14.field1195;
        int var16 = var14.field1196[var15];
        boolean var17 = !field3209[var16].method1231();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1194; var19++) {
            class104 var95 = field3188[var14.field1193[var19]];
            float[] var96 = field3196;
            var95.method780(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1195;
            int var21 = var14.field1196[var20];
            field3209[var21].method1228(field3196, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3196[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3196;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3185 : field3194;
            float[] var30 = var3 ? field3184 : field3204;
            float[] var31 = var3 ? field3200 : field3186;
            int[] var32 = var3 ? field3197 : field3205;
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
            int var35 = class91.method643(var4 - 1, 39);
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
                field3196[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3196[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3201 > 0) {
            int var49 = this.field3201 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3192) {
                for (int var50 = 0; var50 < this.field3212; var50++) {
                    int var51 = (this.field3201 >> 1) + var50;
                    var48[var50] += this.field3202[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3196[var52];
                }
            }
        }
        float[] var54 = this.field3202;
        this.field3202 = field3196;
        field3196 = var54;
        this.field3201 = var4;
        this.field3212 = var12 - (var4 >> 1);
        this.field3192 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "([B)V")
    private static final void method1302(byte[] arg0) {
        method1303(arg0, 0);
        field3206 = 0x1 << method1295(4);
        field3195 = 0x1 << method1295(4);
        field3196 = new float[field3195];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3206 : field3195;
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
            int var25 = class91.method643(var17 - 1, 39);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class89.method632(var26, var25, (byte) 114);
            }
            if (var1 == 0) {
                field3194 = var18;
                field3204 = var20;
                field3186 = var22;
                field3205 = var24;
            } else {
                field3185 = var18;
                field3184 = var20;
                field3200 = var22;
                field3197 = var24;
            }
        }
        int var2 = method1295(8) + 1;
        field3187 = new class28[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3187[var3] = new class28();
        }
        int var4 = method1295(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1295(16);
        }
        int var6 = method1295(6) + 1;
        field3209 = new class172[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3209[var7] = new class172();
        }
        int var8 = method1295(6) + 1;
        field3188 = new class104[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3188[var9] = new class104();
        }
        int var10 = method1295(6) + 1;
        field3190 = new class69[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3190[var11] = new class69();
        }
        int var12 = method1295(6) + 1;
        field3199 = new boolean[var12];
        field3189 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3199[var13] = method1297() != 0;
            method1295(16);
            method1295(16);
            field3189[var13] = method1295(8);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BI)V")
    private static final void method1303(byte[] arg0, int arg1) {
        field3198 = arg0;
        field3210 = arg1;
        field3207 = 0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
    private class184(byte[] arg0) {
        this.method1298(arg0);
    }
}
