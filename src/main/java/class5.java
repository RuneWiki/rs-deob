import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class626 {

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Z")
    private static boolean field87 = false;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    private static int field73;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    private static int field78;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    private static int field85;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    private static int field90;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Z")
    private boolean field91;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Z")
    private boolean field94;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "[B")
    private byte[] field101;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[B")
    private static byte[] field75;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "[F")
    private static float[] field100;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[F")
    private static float[] field70;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[F")
    private static float[] field76;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[F")
    private static float[] field83;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "[F")
    private float[] field86;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[F")
    private static float[] field93;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "[F")
    private static float[] field97;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[F")
    private static float[] field98;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    private static int[] field72;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
    private static int[] field80;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[I")
    private static int[] field82;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "[Lvaa;")
    public static class466[] field95;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "[Lmia;")
    private static class61[] field89;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[Law;")
    private static class75[] field84;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[Ltt;")
    private static class91[] field96;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[Z")
    private static boolean[] field71;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[[B")
    private byte[][] field69;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Leq;)Z", line = 3)
    private static final boolean method21(class209 arg0) {
        if (!field87) {
            byte[] var1 = arg0.method1453(0, 74, 0);
            if (var1 == null) {
                return false;
            }
            method31(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I", line = 17)
    public static final int method22(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field85) {
            int var4 = 8 - field85;
            int var5 = (0x1 << var4) - 1;
            var1 += (field75[field78] >> field85 & var5) << var2;
            field85 = 0;
            field78++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field75[field78] >> field85 & var3) << var2;
            field85 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)F", line = 49)
    public static final float method23(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 65)
    public static void method24() {
        field75 = null;
        field95 = null;
        field84 = null;
        field89 = null;
        field96 = null;
        field71 = null;
        field80 = null;
        field98 = null;
        field100 = null;
        field76 = null;
        field97 = null;
        field93 = null;
        field83 = null;
        field70 = null;
        field72 = null;
        field82 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)[F", line = 92)
    private final float[] method25(int arg0) {
        method29(this.field69[arg0], 0);
        method26();
        int var2 = method22(class621.method3590(field80.length - 1, 4));
        boolean var3 = field71[var2];
        int var4 = var3 ? field73 : field90;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method26() != 0;
            var6 = method26() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field90 >> 2);
            var9 = (field90 >> 2) + (var4 >> 2);
            var10 = field90 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field90 >> 2);
            var12 = (field90 >> 2) + (var4 - (var4 >> 2));
            var13 = field90 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class91 var14 = field96[field80[var2]];
        int var15 = var14.field1612;
        int var16 = var14.field1613[var15];
        boolean var17 = !field84[var16].method753();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1610; var19++) {
            class61 var95 = field89[var14.field1611[var19]];
            float[] var96 = field98;
            var95.method669(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1612;
            int var21 = var14.field1613[var20];
            field84[var21].method754(field98, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field98[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field98;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field93 : field100;
            float[] var30 = var3 ? field83 : field76;
            float[] var31 = var3 ? field70 : field97;
            int[] var32 = var3 ? field82 : field72;
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
            int var35 = class621.method3590(var4 - 1, 4);
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
                field98[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field98[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field77 > 0) {
            int var49 = this.field77 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field91) {
                for (int var50 = 0; var50 < this.field79; var50++) {
                    int var51 = (this.field77 >> 1) + var50;
                    var48[var50] += this.field86[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field98[var52];
                }
            }
        }
        float[] var54 = this.field86;
        this.field86 = field98;
        field98 = var54;
        this.field77 = var4;
        this.field79 = var12 - (var4 >> 1);
        this.field91 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()I", line = 506)
    public static final int method26() {
        int var0 = field75[field78] >> field85 & 0x1;
        field85++;
        field78 += field85 >> 3;
        field85 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([I)Lcj;", line = 517)
    public final class690 method27(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field101 == null) {
            this.field77 = 0;
            this.field86 = new float[field73];
            this.field101 = new byte[this.field92];
            this.field102 = 0;
            this.field99 = 0;
        }
        while (this.field99 < this.field69.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method25(this.field99);
            if (var3 != null) {
                int var4 = this.field102;
                int var5 = var3.length;
                if (var5 > this.field92 - var4) {
                    var5 = this.field92 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field101[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field102;
                }
                this.field102 = var4;
            }
            this.field99++;
        }
        this.field86 = null;
        byte[] var2 = this.field101;
        this.field101 = null;
        return new class690(this.field74, var2, this.field88, this.field81, this.field94);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([B)V", line = 584)
    private final void method28(byte[] arg0) {
        class35 var2 = new class35(arg0);
        this.field74 = var2.method234((byte) -98);
        this.field92 = var2.method234((byte) -112);
        this.field88 = var2.method234((byte) -125);
        this.field81 = var2.method234((byte) -125);
        if (this.field81 < 0) {
            this.field81 = ~this.field81;
            this.field94 = true;
        }
        int var3 = var2.method234((byte) -106);
        this.field69 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method273(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method260(var7, 96, var5, 0);
            this.field69[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BI)V", line = 629)
    private static final void method29(byte[] arg0, int arg1) {
        field75 = arg0;
        field78 = arg1;
        field85 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Leq;II)Ldc;", line = 634)
    public static final class5 method30(class209 arg0, int arg1, int arg2) {
        if (method21(arg0)) {
            byte[] var3 = arg0.method1453(arg2, 39, arg1);
            return var3 == null ? null : new class5(var3);
        } else {
            arg0.method1469((byte) -114, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "([B)V", line = 650)
    private static final void method31(byte[] arg0) {
        method29(arg0, 0);
        field90 = 0x1 << method22(4);
        field73 = 0x1 << method22(4);
        field98 = new float[field73];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field90 : field73;
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
            int var25 = class621.method3590(var17 - 1, 4);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class19.method120(true, var26, var25);
            }
            if (var1 == 0) {
                field100 = var18;
                field76 = var20;
                field97 = var22;
                field72 = var24;
            } else {
                field93 = var18;
                field83 = var20;
                field70 = var22;
                field82 = var24;
            }
        }
        int var2 = method22(8) + 1;
        field95 = new class466[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field95[var3] = new class466();
        }
        int var4 = method22(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method22(16);
        }
        int var6 = method22(6) + 1;
        field84 = new class75[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field84[var7] = new class75();
        }
        int var8 = method22(6) + 1;
        field89 = new class61[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field89[var9] = new class61();
        }
        int var10 = method22(6) + 1;
        field96 = new class91[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field96[var11] = new class91();
        }
        int var12 = method22(6) + 1;
        field71 = new boolean[var12];
        field80 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field71[var13] = method26() != 0;
            method22(16);
            method22(16);
            field80[var13] = method22(8);
        }
        field87 = true;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V", line = 802)
    private class5(byte[] arg0) {
        this.method28(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Leq;I)Ldc;", line = 810)
    public static final class5 method32(class209 arg0, int arg1) {
        if (method21(arg0)) {
            byte[] var2 = arg0.method1478((byte) -72, arg1);
            return var2 == null ? null : new class5(var2);
        } else {
            arg0.method1472(-25711, arg1);
            return null;
        }
    }
}
