import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class17 extends class376 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Z")
    private static boolean field208 = false;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    private static int field207;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    private static int field209;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    private static int field213;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    private static int field226;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "Z")
    private boolean field219;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "Z")
    private boolean field221;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "[B")
    private static byte[] field217;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "[B")
    private byte[] field236;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "[F")
    private static float[] field210;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[F")
    private static float[] field215;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "[F")
    private static float[] field223;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "[F")
    private float[] field225;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "[F")
    private static float[] field229;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "[F")
    private static float[] field232;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "[F")
    private static float[] field235;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "[F")
    private static float[] field237;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "[I")
    private static int[] field211;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "[I")
    private static int[] field227;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "[I")
    private static int[] field233;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "[Leq;")
    private static class116[] field230;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[Len;")
    public static class174[] field212;

    @OriginalMember(owner = "client!an", name = "E", descriptor = "[Lij;")
    private static class242[] field224;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "[Lai;")
    private static class355[] field228;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "[Z")
    private static boolean[] field222;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[[B")
    private byte[][] field214;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)V")
    private static final void method95(byte[] arg0, int arg1) {
        field217 = arg0;
        field207 = arg1;
        field209 = 0;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
    public static final int method96(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field209) {
            int var4 = 8 - field209;
            int var5 = (0x1 << var4) - 1;
            var1 += (field217[field207] >> field209 & var5) << var2;
            field209 = 0;
            field207++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field217[field207] >> field209 & var3) << var2;
            field209 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
    public static void method97() {
        field217 = null;
        field212 = null;
        field230 = null;
        field224 = null;
        field228 = null;
        field222 = null;
        field227 = null;
        field235 = null;
        field229 = null;
        field215 = null;
        field237 = null;
        field210 = null;
        field232 = null;
        field223 = null;
        field211 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)[F")
    private final float[] method98(int arg0) {
        method95(this.field214[arg0], 0);
        method103();
        int var2 = method96(class82.method584(true, field227.length - 1));
        boolean var3 = field222[var2];
        int var4 = var3 ? field226 : field213;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method103() != 0;
            var6 = method103() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field213 >> 2);
            var9 = (field213 >> 2) + (var4 >> 2);
            var10 = field213 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field213 >> 2);
            var12 = (field213 >> 2) + (var4 - (var4 >> 2));
            var13 = field213 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class355 var14 = field228[field227[var2]];
        int var15 = var14.field5006;
        int var16 = var14.field5008[var15];
        boolean var17 = !field230[var16].method765();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5005; var19++) {
            class242 var95 = field224[var14.field5007[var19]];
            float[] var96 = field235;
            var95.method1524(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5006;
            int var21 = var14.field5008[var20];
            field230[var21].method760(field235, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field235[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field235;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field210 : field229;
            float[] var30 = var3 ? field232 : field215;
            float[] var31 = var3 ? field223 : field237;
            int[] var32 = var3 ? field233 : field211;
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
            int var35 = class82.method584(true, var4 - 1);
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
                field235[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field235[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field220 > 0) {
            int var49 = this.field220 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field221) {
                for (int var50 = 0; var50 < this.field206; var50++) {
                    int var51 = (this.field220 >> 1) + var50;
                    var48[var50] += this.field225[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field235[var52];
                }
            }
        }
        float[] var54 = this.field225;
        this.field225 = field235;
        field235 = var54;
        this.field220 = var4;
        this.field206 = var12 - (var4 >> 1);
        this.field221 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lqj;II)Lan;")
    public static final class17 method99(class296 arg0, int arg1, int arg2) {
        if (method104(arg0)) {
            byte[] var3 = arg0.method1920(arg2, false, arg1);
            return var3 == null ? null : new class17(var3);
        } else {
            arg0.method1897(arg1, -98, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([B)V")
    private static final void method100(byte[] arg0) {
        method95(arg0, 0);
        field213 = 0x1 << method96(4);
        field226 = 0x1 << method96(4);
        field235 = new float[field226];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field213 : field226;
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
            int var25 = class82.method584(true, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class389.method2545(true, var25, var26);
            }
            if (var1 == 0) {
                field229 = var18;
                field215 = var20;
                field237 = var22;
                field211 = var24;
            } else {
                field210 = var18;
                field232 = var20;
                field223 = var22;
                field233 = var24;
            }
        }
        int var2 = method96(8) + 1;
        field212 = new class174[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field212[var3] = new class174();
        }
        int var4 = method96(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method96(16);
        }
        int var6 = method96(6) + 1;
        field230 = new class116[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field230[var7] = new class116();
        }
        int var8 = method96(6) + 1;
        field224 = new class242[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field224[var9] = new class242();
        }
        int var10 = method96(6) + 1;
        field228 = new class355[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field228[var11] = new class355();
        }
        int var12 = method96(6) + 1;
        field222 = new boolean[var12];
        field227 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field222[var13] = method103() != 0;
            method96(16);
            method96(16);
            field227[var13] = method96(8);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "([B)V")
    private final void method101(byte[] arg0) {
        class371 var2 = new class371(arg0);
        this.field231 = var2.method2413((byte) -30);
        this.field234 = var2.method2413((byte) -30);
        this.field216 = var2.method2413((byte) -30);
        this.field218 = var2.method2413((byte) -30);
        if (this.field218 < 0) {
            this.field218 = ~this.field218;
            this.field219 = true;
        }
        int var3 = var2.method2413((byte) -30);
        this.field214 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2429(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2427(var7, 0, 0, var5);
            this.field214[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)F")
    public static final float method102(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "()I")
    public static final int method103() {
        int var0 = field217[field207] >> field209 & 0x1;
        field209++;
        field207 += field209 >> 3;
        field209 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lqj;)Z")
    private static final boolean method104(class296 arg0) {
        if (!field208) {
            byte[] var1 = arg0.method1920(0, false, 0);
            if (var1 == null) {
                return false;
            }
            method100(var1);
            field208 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V")
    private class17(byte[] arg0) {
        this.method101(arg0);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([I)Leg;")
    public final class56 method105(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field236 == null) {
            this.field220 = 0;
            this.field225 = new float[field226];
            this.field236 = new byte[this.field234];
            this.field238 = 0;
            this.field239 = 0;
        }
        while (this.field239 < this.field214.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method98(this.field239);
            if (var3 != null) {
                int var4 = this.field238;
                int var5 = var3.length;
                if (var5 > this.field234 - var4) {
                    var5 = this.field234 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field236[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field238;
                }
                this.field238 = var4;
            }
            this.field239++;
        }
        this.field225 = null;
        byte[] var2 = this.field236;
        this.field236 = null;
        return new class56(this.field231, var2, this.field216, this.field218, this.field219);
    }
}
