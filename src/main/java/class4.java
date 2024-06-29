import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class4 extends class390 {

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    private static boolean field34 = false;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private static int field43;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    private static int field46;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private static int field53;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private static int field54;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    private int field60;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Z")
    private boolean field55;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Z")
    private boolean field62;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[B")
    private static byte[] field61;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[B")
    private byte[] field66;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[F")
    private static float[] field35;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "[F")
    private static float[] field42;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[F")
    private static float[] field48;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "[F")
    private static float[] field49;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "[F")
    private static float[] field50;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[F")
    private static float[] field56;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "[F")
    private float[] field57;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "[F")
    private static float[] field63;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "[I")
    private static int[] field38;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
    private static int[] field41;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "[I")
    private static int[] field58;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "[Lm;")
    private static class104[] field45;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "[Lud;")
    private static class23[] field47;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "[Lgn;")
    public static class419[] field59;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[Ltn;")
    private static class49[] field40;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[Z")
    private static boolean[] field51;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[[B")
    private byte[][] field39;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)F", line = 18)
    public static final float method17(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)[F", line = 33)
    private final float[] method18(int arg0) {
        method23(this.field39[arg0], 0);
        method27();
        int var2 = method26(class329.method2125(1, field38.length - 1));
        boolean var3 = field51[var2];
        int var4 = var3 ? field46 : field53;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method27() != 0;
            var6 = method27() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field53 >> 2);
            var9 = (field53 >> 2) + (var4 >> 2);
            var10 = field53 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field53 >> 2);
            var12 = (field53 >> 2) + (var4 - (var4 >> 2));
            var13 = field53 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class23 var14 = field47[field38[var2]];
        int var15 = var14.field404;
        int var16 = var14.field405[var15];
        boolean var17 = !field45[var16].method746();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field403; var19++) {
            class49 var95 = field40[var14.field406[var19]];
            float[] var96 = field63;
            var95.method420(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field404;
            int var21 = var14.field405[var20];
            field45[var21].method748(field63, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field63[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field63;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field42 : field50;
            float[] var30 = var3 ? field48 : field49;
            float[] var31 = var3 ? field35 : field56;
            int[] var32 = var3 ? field41 : field58;
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
            int var35 = class329.method2125(1, var4 - 1);
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
                field63[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field63[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field44 > 0) {
            int var49 = this.field44 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field62) {
                for (int var50 = 0; var50 < this.field33; var50++) {
                    int var51 = (this.field44 >> 1) + var50;
                    var48[var50] += this.field57[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field63[var52];
                }
            }
        }
        float[] var54 = this.field57;
        this.field57 = field63;
        field63 = var54;
        this.field44 = var4;
        this.field33 = var12 - (var4 >> 1);
        this.field62 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B)V", line = 447)
    private final void method19(byte[] arg0) {
        class11 var2 = new class11(arg0);
        this.field37 = var2.method185(25239);
        this.field60 = var2.method185(25239);
        this.field36 = var2.method185(25239);
        this.field52 = var2.method185(25239);
        if (this.field52 < 0) {
            this.field52 = ~this.field52;
            this.field55 = true;
        }
        int var3 = var2.method185(25239);
        this.field39 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method172((byte) 52);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method196(var7, var5, 255, 0);
            this.field39[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I)Lvj;", line = 489)
    public final class256 method20(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field66 == null) {
            this.field44 = 0;
            this.field57 = new float[field46];
            this.field66 = new byte[this.field60];
            this.field64 = 0;
            this.field65 = 0;
        }
        while (this.field65 < this.field39.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method18(this.field65);
            if (var3 != null) {
                int var4 = this.field64;
                int var5 = var3.length;
                if (var5 > this.field60 - var4) {
                    var5 = this.field60 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field66[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field64;
                }
                this.field64 = var4;
            }
            this.field65++;
        }
        this.field57 = null;
        byte[] var2 = this.field66;
        this.field66 = null;
        return new class256(this.field37, var2, this.field36, this.field52, this.field55);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()V", line = 549)
    public static void method21() {
        field61 = null;
        field59 = null;
        field45 = null;
        field40 = null;
        field47 = null;
        field51 = null;
        field38 = null;
        field63 = null;
        field50 = null;
        field49 = null;
        field56 = null;
        field42 = null;
        field48 = null;
        field35 = null;
        field58 = null;
        field41 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lnq;II)Lie;", line = 568)
    public static final class4 method22(class268 arg0, int arg1, int arg2) {
        if (method25(arg0)) {
            byte[] var3 = arg0.method1745(arg2, (byte) 124, arg1);
            return var3 == null ? null : new class4(var3);
        } else {
            arg0.method1765(false, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V", line = 583)
    private static final void method23(byte[] arg0, int arg1) {
        field61 = arg0;
        field43 = arg1;
        field54 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "([B)V", line = 598)
    private static final void method24(byte[] arg0) {
        method23(arg0, 0);
        field53 = 0x1 << method26(4);
        field46 = 0x1 << method26(4);
        field63 = new float[field46];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field53 : field46;
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
            int var25 = class329.method2125(1, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class21.method282(var25, var26, (byte) 110);
            }
            if (var1 == 0) {
                field50 = var18;
                field49 = var20;
                field56 = var22;
                field58 = var24;
            } else {
                field42 = var18;
                field48 = var20;
                field35 = var22;
                field41 = var24;
            }
        }
        int var2 = method26(8) + 1;
        field59 = new class419[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field59[var3] = new class419();
        }
        int var4 = method26(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method26(16);
        }
        int var6 = method26(6) + 1;
        field45 = new class104[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field45[var7] = new class104();
        }
        int var8 = method26(6) + 1;
        field40 = new class49[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field40[var9] = new class49();
        }
        int var10 = method26(6) + 1;
        field47 = new class23[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field47[var11] = new class23();
        }
        int var12 = method26(6) + 1;
        field51 = new boolean[var12];
        field38 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field51[var13] = method27() != 0;
            method26(16);
            method26(16);
            field38[var13] = method26(8);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lnq;)Z", line = 752)
    private static final boolean method25(class268 arg0) {
        if (!field34) {
            byte[] var1 = arg0.method1745(0, (byte) 31, 0);
            if (var1 == null) {
                return false;
            }
            method24(var1);
            field34 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I", line = 767)
    public static final int method26(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field54) {
            int var4 = 8 - field54;
            int var5 = (0x1 << var4) - 1;
            var1 += (field61[field43] >> field54 & var5) << var2;
            field54 = 0;
            field43++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field61[field43] >> field54 & var3) << var2;
            field54 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I", line = 797)
    public static final int method27() {
        int var0 = field61[field43] >> field54 & 0x1;
        field54++;
        field43 += field54 >> 3;
        field54 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V", line = 803)
    private class4(byte[] arg0) {
        this.method19(arg0);
    }
}
