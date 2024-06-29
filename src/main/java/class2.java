import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class176 {

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
    private static boolean field17 = false;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    private static int field10;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    private static int field11;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    private static int field12;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    private int field25;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    private static int field37;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Z")
    private boolean field26;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Z")
    private boolean field34;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
    private static byte[] field21;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[B")
    private byte[] field40;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "[F")
    private static float[] field13;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[F")
    private static float[] field14;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "[F")
    private static float[] field23;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[F")
    private static float[] field27;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[F")
    private static float[] field32;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[F")
    private static float[] field36;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[F")
    private static float[] field8;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[F")
    private float[] field9;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
    private static int[] field15;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
    private static int[] field20;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "[I")
    private static int[] field31;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[Lnb;")
    public static class119[] field29;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[Lqb;")
    private static class146[] field33;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[Lfe;")
    private static class53[] field19;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "[Lga;")
    private static class58[] field30;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "[Z")
    private static boolean[] field22;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "[[B")
    private byte[][] field35;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljc;)Z")
    private static final boolean method6(class85 arg0) {
        if (!field17) {
            byte[] var1 = arg0.method745(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method14(var1);
            field17 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljc;II)Laa;")
    public static final class2 method7(class85 arg0, int arg1, int arg2) {
        if (method6(arg0)) {
            byte[] var3 = arg0.method745(arg1, arg2, 0);
            return var3 == null ? null : new class2(var3);
        } else {
            arg0.method757(0, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BI)V")
    private static final void method8(byte[] arg0, int arg1) {
        field21 = arg0;
        field37 = arg1;
        field12 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public static final int method9() {
        int var0 = field21[field37] >> field12 & 0x1;
        field12++;
        field37 += field12 >> 3;
        field12 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)Lnc;")
    public final class120 method10(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field40 == null) {
            this.field25 = 0;
            this.field9 = new float[field11];
            this.field40 = new byte[this.field24];
            this.field41 = 0;
            this.field39 = 0;
        }
        while (this.field39 < this.field35.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method11(this.field39);
            if (var3 != null) {
                int var4 = this.field41;
                int var5 = var3.length;
                if (var5 > this.field24 - var4) {
                    var5 = this.field24 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field40[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field41;
                }
                this.field41 = var4;
            }
            this.field39++;
        }
        this.field9 = null;
        byte[] var2 = this.field40;
        this.field40 = null;
        return new class120(this.field16, var2, this.field28, this.field18, this.field34);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)[F")
    private final float[] method11(int arg0) {
        method8(this.field35[arg0], 0);
        method9();
        int var2 = method12(class41.method369(field15.length - 1, 0));
        boolean var3 = field22[var2];
        int var4 = var3 ? field11 : field10;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method9() != 0;
            var6 = method9() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field10 >> 2);
            var9 = (field10 >> 2) + (var4 >> 2);
            var10 = field10 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field10 >> 2);
            var12 = (field10 >> 2) + (var4 - (var4 >> 2));
            var13 = field10 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class146 var14 = field33[field15[var2]];
        int var15 = var14.field3094;
        int var16 = var14.field3095[var15];
        boolean var17 = !field19[var16].method524();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3096; var19++) {
            class58 var95 = field30[var14.field3093[var19]];
            float[] var96 = field8;
            var95.method552(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3094;
            int var21 = var14.field3095[var20];
            field19[var21].method520(field8, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field13 : field14;
            float[] var30 = var3 ? field36 : field23;
            float[] var31 = var3 ? field32 : field27;
            int[] var32 = var3 ? field20 : field31;
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
            int var35 = class41.method369(var4 - 1, 0);
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
                field8[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field25 > 0) {
            int var49 = this.field25 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field26) {
                for (int var50 = 0; var50 < this.field38; var50++) {
                    int var51 = (this.field25 >> 1) + var50;
                    var48[var50] += this.field9[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8[var52];
                }
            }
        }
        float[] var54 = this.field9;
        this.field9 = field8;
        field8 = var54;
        this.field25 = var4;
        this.field38 = var12 - (var4 >> 1);
        this.field26 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
    public static final int method12(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field12) {
            int var4 = 8 - field12;
            int var5 = (0x1 << var4) - 1;
            var1 += (field21[field37] >> field12 & var5) << var2;
            field12 = 0;
            field37++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field21[field37] >> field12 & var3) << var2;
            field12 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)F")
    public static final float method13(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V")
    private static final void method14(byte[] arg0) {
        method8(arg0, 0);
        field10 = 0x1 << method12(4);
        field11 = 0x1 << method12(4);
        field8 = new float[field11];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field10 : field11;
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
            int var25 = class41.method369(var17 - 1, 0);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class10.method130(var25, -1, var26);
            }
            if (var1 == 0) {
                field14 = var18;
                field23 = var20;
                field27 = var22;
                field31 = var24;
            } else {
                field13 = var18;
                field36 = var20;
                field32 = var22;
                field20 = var24;
            }
        }
        int var2 = method12(8) + 1;
        field29 = new class119[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field29[var3] = new class119();
        }
        int var4 = method12(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method12(16);
        }
        int var6 = method12(6) + 1;
        field19 = new class53[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field19[var7] = new class53();
        }
        int var8 = method12(6) + 1;
        field30 = new class58[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field30[var9] = new class58();
        }
        int var10 = method12(6) + 1;
        field33 = new class146[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field33[var11] = new class146();
        }
        int var12 = method12(6) + 1;
        field22 = new boolean[var12];
        field15 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field22[var13] = method9() != 0;
            method12(16);
            method12(16);
            field15[var13] = method12(8);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "([B)V")
    private final void method15(byte[] arg0) {
        class3 var2 = new class3(arg0);
        this.field16 = var2.method56(-1);
        this.field24 = var2.method56(-1);
        this.field28 = var2.method56(-1);
        this.field18 = var2.method56(-1);
        if (this.field18 < 0) {
            this.field18 = ~this.field18;
            this.field34 = true;
        }
        int var3 = var2.method56(-1);
        this.field35 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method64(31790);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method71(var5, -26252, 0, var7);
            this.field35[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
    public static void method16() {
        field21 = null;
        field29 = null;
        field19 = null;
        field30 = null;
        field33 = null;
        field22 = null;
        field15 = null;
        field8 = null;
        field14 = null;
        field23 = null;
        field27 = null;
        field13 = null;
        field36 = null;
        field32 = null;
        field31 = null;
        field20 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V")
    private class2(byte[] arg0) {
        this.method15(arg0);
    }
}
