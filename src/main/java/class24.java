import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class210 {

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Z")
    private static boolean field571 = false;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    private static int field546;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private static int field548;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private static int field562;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private static int field564;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Z")
    private boolean field565;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Z")
    private boolean field572;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "[B")
    private static byte[] field563;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "[B")
    private byte[] field575;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[F")
    private static float[] field542;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[F")
    private static float[] field544;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "[F")
    private static float[] field550;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[F")
    private static float[] field551;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "[F")
    private static float[] field553;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[F")
    private static float[] field555;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "[F")
    private float[] field560;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "[F")
    private static float[] field567;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "[I")
    private static int[] field558;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
    private static int[] field559;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "[I")
    private static int[] field570;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "[Llb;")
    private static class109[] field547;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[Lpb;")
    private static class145[] field554;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[Lsh;")
    private static class178[] field543;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "[Ltb;")
    public static class181[] field545;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "[Z")
    private static boolean[] field569;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "[[B")
    private byte[][] field556;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)F")
    public static final float method148(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lnh;II)Lcc;")
    public static final class24 method149(class133 arg0, int arg1, int arg2) {
        if (method153(arg0)) {
            byte[] var3 = arg0.method899((byte) 87, arg1, arg2);
            return var3 == null ? null : new class24(var3);
        } else {
            arg0.method893(arg2, (byte) 56, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
    public static final int method150(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field548) {
            int var4 = 8 - field548;
            int var5 = (0x1 << var4) - 1;
            var1 += (field563[field564] >> field548 & var5) << var2;
            field548 = 0;
            field564++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field563[field564] >> field548 & var3) << var2;
            field548 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V")
    private final void method151(byte[] arg0) {
        class70 var2 = new class70(arg0);
        this.field566 = var2.method453(28);
        this.field557 = var2.method453(112);
        this.field561 = var2.method453(22);
        this.field549 = var2.method453(42);
        if (this.field549 < 0) {
            this.field549 = ~this.field549;
            this.field565 = true;
        }
        int var3 = var2.method453(82);
        this.field556 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method443(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method416(-2, var5, 0, var7);
            this.field556[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
    public static final int method152() {
        int var0 = field563[field564] >> field548 & 0x1;
        field548++;
        field564 += field548 >> 3;
        field548 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lnh;)Z")
    private static final boolean method153(class133 arg0) {
        if (!field571) {
            byte[] var1 = arg0.method899((byte) 87, 0, 0);
            if (var1 == null) {
                return false;
            }
            method154(var1);
            field571 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "([B)V")
    private static final void method154(byte[] arg0) {
        method155(arg0, 0);
        field546 = 0x1 << method150(4);
        field562 = 0x1 << method150(4);
        field542 = new float[field562];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field546 : field562;
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
            int var25 = class130.method860((byte) 90, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class90.method595(var26, var25, 4851);
            }
            if (var1 == 0) {
                field555 = var18;
                field544 = var20;
                field553 = var22;
                field570 = var24;
            } else {
                field567 = var18;
                field550 = var20;
                field551 = var22;
                field558 = var24;
            }
        }
        int var2 = method150(8) + 1;
        field545 = new class181[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field545[var3] = new class181();
        }
        int var4 = method150(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method150(16);
        }
        int var6 = method150(6) + 1;
        field543 = new class178[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field543[var7] = new class178();
        }
        int var8 = method150(6) + 1;
        field554 = new class145[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field554[var9] = new class145();
        }
        int var10 = method150(6) + 1;
        field547 = new class109[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field547[var11] = new class109();
        }
        int var12 = method150(6) + 1;
        field569 = new boolean[var12];
        field559 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field569[var13] = method152() != 0;
            method150(16);
            method150(16);
            field559[var13] = method150(8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)V")
    private static final void method155(byte[] arg0, int arg1) {
        field563 = arg0;
        field564 = arg1;
        field548 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
    public static void method156() {
        field563 = null;
        field545 = null;
        field543 = null;
        field554 = null;
        field547 = null;
        field569 = null;
        field559 = null;
        field542 = null;
        field555 = null;
        field544 = null;
        field553 = null;
        field567 = null;
        field550 = null;
        field551 = null;
        field570 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I)Lvf;")
    public final class203 method157(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field575 == null) {
            this.field568 = 0;
            this.field560 = new float[field562];
            this.field575 = new byte[this.field557];
            this.field574 = 0;
            this.field573 = 0;
        }
        while (this.field573 < this.field556.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method158(this.field573);
            if (var3 != null) {
                int var4 = this.field574;
                int var5 = var3.length;
                if (var5 > this.field557 - var4) {
                    var5 = this.field557 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field575[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field574;
                }
                this.field574 = var4;
            }
            this.field573++;
        }
        this.field560 = null;
        byte[] var2 = this.field575;
        this.field575 = null;
        return new class203(this.field566, var2, this.field561, this.field549, this.field565);
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)[F")
    private final float[] method158(int arg0) {
        method155(this.field556[arg0], 0);
        method152();
        int var2 = method150(class130.method860((byte) -57, field559.length - 1));
        boolean var3 = field569[var2];
        int var4 = var3 ? field562 : field546;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method152() != 0;
            var6 = method152() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field546 >> 2);
            var9 = (field546 >> 2) + (var4 >> 2);
            var10 = field546 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field546 >> 2);
            var12 = (field546 >> 2) + (var4 - (var4 >> 2));
            var13 = field546 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class109 var14 = field547[field559[var2]];
        int var15 = var14.field2239;
        int var16 = var14.field2236[var15];
        boolean var17 = !field543[var16].method1174();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2237; var19++) {
            class145 var95 = field554[var14.field2238[var19]];
            float[] var96 = field542;
            var95.method953(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2239;
            int var21 = var14.field2236[var20];
            field543[var21].method1170(field542, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field542[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field542;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field567 : field555;
            float[] var30 = var3 ? field550 : field544;
            float[] var31 = var3 ? field551 : field553;
            int[] var32 = var3 ? field558 : field570;
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
            int var35 = class130.method860((byte) 91, var4 - 1);
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
                field542[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field542[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field568 > 0) {
            int var49 = this.field568 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field572) {
                for (int var50 = 0; var50 < this.field552; var50++) {
                    int var51 = (this.field568 >> 1) + var50;
                    var48[var50] += this.field560[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field542[var52];
                }
            }
        }
        float[] var54 = this.field560;
        this.field560 = field542;
        field542 = var54;
        this.field568 = var4;
        this.field552 = var12 - (var4 >> 1);
        this.field572 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
    private class24(byte[] arg0) {
        this.method151(arg0);
    }
}
