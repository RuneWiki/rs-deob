import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class590 extends class159 {

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "Z")
    private static boolean field8068 = false;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    private int field8050;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    private static int field8055;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    private static int field8057;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    private int field8058;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    private int field8059;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    private int field8061;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    private static int field8062;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    private int field8066;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    private static int field8071;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    private int field8072;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    private int field8076;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    private int field8078;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Z")
    private boolean field8060;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "Z")
    private boolean field8067;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "[B")
    private static byte[] field8074;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "[B")
    private byte[] field8077;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "[F")
    private float[] field8046;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "[F")
    private static float[] field8049;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[F")
    private static float[] field8051;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "[F")
    private static float[] field8054;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "[F")
    private static float[] field8056;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "[F")
    private static float[] field8064;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "[F")
    private static float[] field8073;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "[F")
    private static float[] field8075;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
    private static int[] field8052;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "[I")
    private static int[] field8053;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "[I")
    private static int[] field8069;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "[Lei;")
    private static class190[] field8070;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "[Lta;")
    private static class225[] field8063;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "[Lvn;")
    private static class331[] field8047;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "[Lufa;")
    public static class707[] field8048;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[Z")
    private static boolean[] field8045;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "[[B")
    private byte[][] field8065;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Luq;II)Lwm;", line = 8)
    public static final class590 method3313(class172 arg0, int arg1, int arg2) {
        if (method3318(arg0)) {
            byte[] var3 = arg0.method1188(arg1, -18047, arg2);
            return var3 == null ? null : new class590(var3);
        } else {
            arg0.method1174(arg1, arg2, 1);
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BI)V", line = 23)
    private static final void method3314(byte[] arg0, int arg1) {
        field8074 = arg0;
        field8071 = arg1;
        field8062 = 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([I)Lpv;", line = 32)
    public final class78 method3315(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8077 == null) {
            this.field8072 = 0;
            this.field8046 = new float[field8057];
            this.field8077 = new byte[this.field8066];
            this.field8078 = 0;
            this.field8076 = 0;
        }
        while (this.field8076 < this.field8065.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3322(this.field8076);
            if (var3 != null) {
                int var4 = this.field8078;
                int var5 = var3.length;
                if (var5 > this.field8066 - var4) {
                    var5 = this.field8066 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8077[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8078;
                }
                this.field8078 = var4;
            }
            this.field8076++;
        }
        this.field8046 = null;
        byte[] var2 = this.field8077;
        this.field8077 = null;
        return new class78(this.field8059, var2, this.field8058, this.field8050, this.field8060);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)F", line = 91)
    public static final float method3316(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()I", line = 115)
    public static final int method3317() {
        int var0 = field8074[field8071] >> field8062 & 0x1;
        field8062++;
        field8071 += field8062 >> 3;
        field8062 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Luq;)Z", line = 122)
    private static final boolean method3318(class172 arg0) {
        if (!field8068) {
            byte[] var1 = arg0.method1188(0, -18047, 0);
            if (var1 == null) {
                return false;
            }
            method3320(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V", line = 135)
    public static void method3319() {
        field8074 = null;
        field8048 = null;
        field8047 = null;
        field8070 = null;
        field8063 = null;
        field8045 = null;
        field8053 = null;
        field8051 = null;
        field8054 = null;
        field8073 = null;
        field8064 = null;
        field8056 = null;
        field8075 = null;
        field8049 = null;
        field8052 = null;
        field8069 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([B)V", line = 157)
    private static final void method3320(byte[] arg0) {
        method3314(arg0, 0);
        field8055 = 0x1 << method3324(4);
        field8057 = 0x1 << method3324(4);
        field8051 = new float[field8057];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field8055 : field8057;
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
            int var25 = class436.method2617(var17 - 1, 4);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class433.method2584(var25, (byte) 109, var26);
            }
            if (var1 == 0) {
                field8054 = var18;
                field8073 = var20;
                field8064 = var22;
                field8052 = var24;
            } else {
                field8056 = var18;
                field8075 = var20;
                field8049 = var22;
                field8069 = var24;
            }
        }
        int var2 = method3324(8) + 1;
        field8048 = new class707[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field8048[var3] = new class707();
        }
        int var4 = method3324(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3324(16);
        }
        int var6 = method3324(6) + 1;
        field8047 = new class331[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field8047[var7] = new class331();
        }
        int var8 = method3324(6) + 1;
        field8070 = new class190[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field8070[var9] = new class190();
        }
        int var10 = method3324(6) + 1;
        field8063 = new class225[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field8063[var11] = new class225();
        }
        int var12 = method3324(6) + 1;
        field8045 = new boolean[var12];
        field8053 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8045[var13] = method3317() != 0;
            method3324(16);
            method3324(16);
            field8053[var13] = method3324(8);
        }
        field8068 = true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Luq;I)Lwm;", line = 309)
    public static final class590 method3321(class172 arg0, int arg1) {
        if (method3318(arg0)) {
            byte[] var2 = arg0.method1176(arg1, 81);
            return var2 == null ? null : new class590(var2);
        } else {
            arg0.method1185(arg1, 9330);
            return null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)[F", line = 326)
    private final float[] method3322(int arg0) {
        method3314(this.field8065[arg0], 0);
        method3317();
        int var2 = method3324(class436.method2617(field8053.length - 1, 4));
        boolean var3 = field8045[var2];
        int var4 = var3 ? field8057 : field8055;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3317() != 0;
            var6 = method3317() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field8055 >> 2);
            var9 = (field8055 >> 2) + (var4 >> 2);
            var10 = field8055 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field8055 >> 2);
            var12 = (field8055 >> 2) + (var4 - (var4 >> 2));
            var13 = field8055 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class225 var14 = field8063[field8053[var2]];
        int var15 = var14.field2919;
        int var16 = var14.field2920[var15];
        boolean var17 = !field8047[var16].method2144();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2918; var19++) {
            class190 var95 = field8070[var14.field2917[var19]];
            float[] var96 = field8051;
            var95.method1264(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2919;
            int var21 = var14.field2920[var20];
            field8047[var21].method2145(field8051, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8051[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8051;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field8056 : field8054;
            float[] var30 = var3 ? field8075 : field8073;
            float[] var31 = var3 ? field8049 : field8064;
            int[] var32 = var3 ? field8069 : field8052;
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
            int var35 = class436.method2617(var4 - 1, 4);
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
                field8051[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8051[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8072 > 0) {
            int var49 = this.field8072 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field8067) {
                for (int var50 = 0; var50 < this.field8061; var50++) {
                    int var51 = (this.field8072 >> 1) + var50;
                    var48[var50] += this.field8046[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8051[var52];
                }
            }
        }
        float[] var54 = this.field8046;
        this.field8046 = field8051;
        field8051 = var54;
        this.field8072 = var4;
        this.field8061 = var12 - (var4 >> 1);
        this.field8067 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([B)V", line = 743)
    private class590(byte[] arg0) {
        this.method3323(arg0);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "([B)V", line = 748)
    private final void method3323(byte[] arg0) {
        class254 var2 = new class254(arg0);
        this.field8059 = var2.method1672(-16516);
        this.field8066 = var2.method1672(-16516);
        this.field8058 = var2.method1672(-16516);
        this.field8050 = var2.method1672(-16516);
        if (this.field8050 < 0) {
            this.field8050 = ~this.field8050;
            this.field8060 = true;
        }
        int var3 = var2.method1672(-16516);
        this.field8065 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1731((byte) 64);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1735(0, -126, var7, var5);
            this.field8065[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I", line = 796)
    public static final int method3324(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field8062) {
            int var4 = 8 - field8062;
            int var5 = (0x1 << var4) - 1;
            var1 += (field8074[field8071] >> field8062 & var5) << var2;
            field8062 = 0;
            field8071++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field8074[field8071] >> field8062 & var3) << var2;
            field8062 += arg0;
        }
        return var1;
    }
}
