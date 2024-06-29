import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class532 extends class108 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "Z")
    private static boolean field7430 = false;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    private int field7405;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    private int field7410;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    private int field7412;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    private static int field7414;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    private int field7417;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    private int field7418;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private static int field7421;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    private int field7428;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    private int field7431;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    private static int field7432;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    private static int field7434;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Z")
    private boolean field7404;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Z")
    private boolean field7429;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "[B")
    private static byte[] field7426;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "[B")
    private byte[] field7433;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[F")
    private static float[] field7403;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "[F")
    private static float[] field7406;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "[F")
    private static float[] field7408;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "[F")
    private static float[] field7413;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[F")
    private float[] field7415;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[F")
    private static float[] field7420;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "[F")
    private static float[] field7422;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "[F")
    private static float[] field7424;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
    private static int[] field7411;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "[I")
    private static int[] field7427;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "[I")
    private static int[] field7436;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "[Lpw;")
    private static class196[] field7409;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "[Lso;")
    public static class253[] field7407;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[Lqm;")
    private static class346[] field7416;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lmt;")
    private static class625[] field7419;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "[Z")
    private static boolean[] field7423;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[[B")
    private byte[][] field7425;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgp;I)Lnl;", line = 4)
    public static final class532 method2997(class561 arg0, int arg1) {
        if (method3003(arg0)) {
            byte[] var2 = arg0.method3177(0, arg1);
            return var2 == null ? null : new class532(var2);
        } else {
            arg0.method3186((byte) 57, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B)V", line = 30)
    private final void method2998(byte[] arg0) {
        class268 var2 = new class268(arg0);
        this.field7410 = var2.method1748(-117);
        this.field7405 = var2.method1748(100);
        this.field7412 = var2.method1748(125);
        this.field7418 = var2.method1748(119);
        if (this.field7418 < 0) {
            this.field7418 = ~this.field7418;
            this.field7404 = true;
        }
        int var3 = var2.method1748(91);
        this.field7425 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1738(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1695(var7, (byte) -52, var5, 0);
            this.field7425[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 73)
    public static void method2999() {
        field7426 = null;
        field7407 = null;
        field7419 = null;
        field7409 = null;
        field7416 = null;
        field7423 = null;
        field7427 = null;
        field7408 = null;
        field7403 = null;
        field7424 = null;
        field7420 = null;
        field7406 = null;
        field7413 = null;
        field7422 = null;
        field7436 = null;
        field7411 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([I)Lar;", line = 95)
    public final class4 method3000(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7433 == null) {
            this.field7417 = 0;
            this.field7415 = new float[field7432];
            this.field7433 = new byte[this.field7405];
            this.field7435 = 0;
            this.field7431 = 0;
        }
        while (this.field7431 < this.field7425.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3004(this.field7431);
            if (var3 != null) {
                int var4 = this.field7435;
                int var5 = var3.length;
                if (var5 > this.field7405 - var4) {
                    var5 = this.field7405 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7433[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7435;
                }
                this.field7435 = var4;
            }
            this.field7431++;
        }
        this.field7415 = null;
        byte[] var2 = this.field7433;
        this.field7433 = null;
        return new class4(this.field7410, var2, this.field7412, this.field7418, this.field7404);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)F", line = 154)
    public static final float method3001(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()I", line = 167)
    public static final int method3002() {
        int var0 = field7426[field7434] >> field7414 & 0x1;
        field7414++;
        field7434 += field7414 >> 3;
        field7414 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgp;)Z", line = 175)
    private static final boolean method3003(class561 arg0) {
        if (!field7430) {
            byte[] var1 = arg0.method3175(0, (byte) -53, 0);
            if (var1 == null) {
                return false;
            }
            method3007(var1);
            field7430 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)[F", line = 189)
    private final float[] method3004(int arg0) {
        method3006(this.field7425[arg0], 0);
        method3002();
        int var2 = method3005(class211.method1380(field7427.length - 1, (byte) 115));
        boolean var3 = field7423[var2];
        int var4 = var3 ? field7432 : field7421;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3002() != 0;
            var6 = method3002() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7421 >> 2);
            var9 = (field7421 >> 2) + (var4 >> 2);
            var10 = field7421 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7421 >> 2);
            var12 = (field7421 >> 2) + (var4 - (var4 >> 2));
            var13 = field7421 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class346 var14 = field7416[field7427[var2]];
        int var15 = var14.field4951;
        int var16 = var14.field4952[var15];
        boolean var17 = !field7419[var16].method3542();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4950; var19++) {
            class196 var95 = field7409[var14.field4949[var19]];
            float[] var96 = field7408;
            var95.method1288(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4951;
            int var21 = var14.field4952[var20];
            field7419[var21].method3546(field7408, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7408[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7408;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7406 : field7403;
            float[] var30 = var3 ? field7413 : field7424;
            float[] var31 = var3 ? field7422 : field7420;
            int[] var32 = var3 ? field7411 : field7436;
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
            int var35 = class211.method1380(var4 - 1, (byte) 121);
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
                field7408[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7408[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7417 > 0) {
            int var49 = this.field7417 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7429) {
                for (int var50 = 0; var50 < this.field7428; var50++) {
                    int var51 = (this.field7417 >> 1) + var50;
                    var48[var50] += this.field7415[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7408[var52];
                }
            }
        }
        float[] var54 = this.field7415;
        this.field7415 = field7408;
        field7408 = var54;
        this.field7417 = var4;
        this.field7428 = var12 - (var4 >> 1);
        this.field7429 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I", line = 610)
    public static final int method3005(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7414) {
            int var4 = 8 - field7414;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7426[field7434] >> field7414 & var5) << var2;
            field7414 = 0;
            field7434++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7426[field7434] >> field7414 & var3) << var2;
            field7414 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BI)V", line = 639)
    private static final void method3006(byte[] arg0, int arg1) {
        field7426 = arg0;
        field7434 = arg1;
        field7414 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "([B)V", line = 645)
    private static final void method3007(byte[] arg0) {
        method3006(arg0, 0);
        field7421 = 0x1 << method3005(4);
        field7432 = 0x1 << method3005(4);
        field7408 = new float[field7432];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7421 : field7432;
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
            int var25 = class211.method1380(var17 - 1, (byte) -16);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class248.method1572(var25, var26, (byte) 74);
            }
            if (var1 == 0) {
                field7403 = var18;
                field7424 = var20;
                field7420 = var22;
                field7436 = var24;
            } else {
                field7406 = var18;
                field7413 = var20;
                field7422 = var22;
                field7411 = var24;
            }
        }
        int var2 = method3005(8) + 1;
        field7407 = new class253[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7407[var3] = new class253();
        }
        int var4 = method3005(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3005(16);
        }
        int var6 = method3005(6) + 1;
        field7419 = new class625[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7419[var7] = new class625();
        }
        int var8 = method3005(6) + 1;
        field7409 = new class196[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7409[var9] = new class196();
        }
        int var10 = method3005(6) + 1;
        field7416 = new class346[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7416[var11] = new class346();
        }
        int var12 = method3005(6) + 1;
        field7423 = new boolean[var12];
        field7427 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7423[var13] = method3002() != 0;
            method3005(16);
            method3005(16);
            field7427[var13] = method3005(8);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V", line = 795)
    private class532(byte[] arg0) {
        this.method2998(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgp;II)Lnl;", line = 802)
    public static final class532 method3008(class561 arg0, int arg1, int arg2) {
        if (method3003(arg0)) {
            byte[] var3 = arg0.method3175(arg2, (byte) -53, arg1);
            return var3 == null ? null : new class532(var3);
        } else {
            arg0.method3187(arg2, (byte) 76, arg1);
            return null;
        }
    }
}
