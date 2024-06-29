import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class259 extends class120 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    private static boolean field4174 = false;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    private static int field4178;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    private int field4186;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    private static int field4188;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    private int field4192;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private static int field4194;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private static int field4197;

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Z")
    private boolean field4187;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Z")
    private boolean field4193;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[B")
    private static byte[] field4183;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "[B")
    private byte[] field4204;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[F")
    private static float[] field4175;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[F")
    private static float[] field4176;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "[F")
    private float[] field4177;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[F")
    private static float[] field4182;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[F")
    private static float[] field4185;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "[F")
    private static float[] field4195;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "[F")
    private static float[] field4199;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "[F")
    private static float[] field4201;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[I")
    private static int[] field4179;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[I")
    private static int[] field4181;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "[I")
    private static int[] field4189;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[Lsk;")
    public static class112[] field4190;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[Lv;")
    private static class150[] field4184;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[Log;")
    private static class220[] field4180;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "[Lvh;")
    private static class275[] field4198;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "[Z")
    private static boolean[] field4173;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "[[B")
    private byte[][] field4200;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([BI)V")
    private static final void method1774(byte[] arg0, int arg1) {
        field4183 = arg0;
        field4197 = arg1;
        field4188 = 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([B)V")
    private static final void method1775(byte[] arg0) {
        method1774(arg0, 0);
        field4178 = 0x1 << method1777(4);
        field4194 = 0x1 << method1777(4);
        field4199 = new float[field4194];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4178 : field4194;
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
            int var25 = class161.method1106((byte) -45, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class243.method1639(var26, var25, true);
            }
            if (var1 == 0) {
                field4176 = var18;
                field4175 = var20;
                field4195 = var22;
                field4179 = var24;
            } else {
                field4182 = var18;
                field4201 = var20;
                field4185 = var22;
                field4181 = var24;
            }
        }
        int var2 = method1777(8) + 1;
        field4190 = new class112[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4190[var3] = new class112();
        }
        int var4 = method1777(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1777(16);
        }
        int var6 = method1777(6) + 1;
        field4180 = new class220[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4180[var7] = new class220();
        }
        int var8 = method1777(6) + 1;
        field4184 = new class150[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4184[var9] = new class150();
        }
        int var10 = method1777(6) + 1;
        field4198 = new class275[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4198[var11] = new class275();
        }
        int var12 = method1777(6) + 1;
        field4173 = new boolean[var12];
        field4189 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4173[var13] = method1781() != 0;
            method1777(16);
            method1777(16);
            field4189[var13] = method1777(8);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)Lu;")
    public final class119 method1776(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4204 == null) {
            this.field4191 = 0;
            this.field4177 = new float[field4194];
            this.field4204 = new byte[this.field4192];
            this.field4206 = 0;
            this.field4205 = 0;
        }
        while (this.field4205 < this.field4200.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1784(this.field4205);
            if (var3 != null) {
                int var4 = this.field4206;
                int var5 = var3.length;
                if (var5 > this.field4192 - var4) {
                    var5 = this.field4192 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4204[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4206;
                }
                this.field4206 = var4;
            }
            this.field4205++;
        }
        this.field4177 = null;
        byte[] var2 = this.field4204;
        this.field4204 = null;
        return new class119(this.field4202, var2, this.field4196, this.field4203, this.field4187);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)I")
    public static final int method1777(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4188) {
            int var4 = 8 - field4188;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4183[field4197] >> field4188 & var5) << var2;
            field4188 = 0;
            field4197++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4183[field4197] >> field4188 & var3) << var2;
            field4188 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public static void method1778() {
        field4183 = null;
        field4190 = null;
        field4180 = null;
        field4184 = null;
        field4198 = null;
        field4173 = null;
        field4189 = null;
        field4199 = null;
        field4176 = null;
        field4175 = null;
        field4195 = null;
        field4182 = null;
        field4201 = null;
        field4185 = null;
        field4179 = null;
        field4181 = null;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)F")
    public static final float method1779(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([B)V")
    private final void method1780(byte[] arg0) {
        class25 var2 = new class25(arg0);
        this.field4202 = var2.method214((byte) 44);
        this.field4192 = var2.method214((byte) 44);
        this.field4196 = var2.method214((byte) 44);
        this.field4203 = var2.method214((byte) 44);
        if (this.field4203 < 0) {
            this.field4203 = ~this.field4203;
            this.field4187 = true;
        }
        int var3 = var2.method214((byte) 44);
        this.field4200 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method201(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method185(0, var7, var5, -56);
            this.field4200[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public static final int method1781() {
        int var0 = field4183[field4197] >> field4188 & 0x1;
        field4188++;
        field4197 += field4188 >> 3;
        field4188 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ldl;)Z")
    private static final boolean method1782(class123 arg0) {
        if (!field4174) {
            byte[] var1 = arg0.method807((byte) 114, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1775(var1);
            field4174 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ldl;II)Lmi;")
    public static final class259 method1783(class123 arg0, int arg1, int arg2) {
        if (method1782(arg0)) {
            byte[] var3 = arg0.method807((byte) 80, arg2, arg1);
            return var3 == null ? null : new class259(var3);
        } else {
            arg0.method835(arg1, 0, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)[F")
    private final float[] method1784(int arg0) {
        method1774(this.field4200[arg0], 0);
        method1781();
        int var2 = method1777(class161.method1106((byte) -96, field4189.length - 1));
        boolean var3 = field4173[var2];
        int var4 = var3 ? field4194 : field4178;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1781() != 0;
            var6 = method1781() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4178 >> 2);
            var9 = (field4178 >> 2) + (var4 >> 2);
            var10 = field4178 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4178 >> 2);
            var12 = (field4178 >> 2) + (var4 - (var4 >> 2));
            var13 = field4178 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class275 var14 = field4198[field4189[var2]];
        int var15 = var14.field4389;
        int var16 = var14.field4388[var15];
        boolean var17 = !field4180[var16].method1485();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4386; var19++) {
            class150 var95 = field4184[var14.field4387[var19]];
            float[] var96 = field4199;
            var95.method1003(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4389;
            int var21 = var14.field4388[var20];
            field4180[var21].method1488(field4199, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4199[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4199;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4182 : field4176;
            float[] var30 = var3 ? field4201 : field4175;
            float[] var31 = var3 ? field4185 : field4195;
            int[] var32 = var3 ? field4181 : field4179;
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
            int var35 = class161.method1106((byte) -73, var4 - 1);
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
                field4199[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4199[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4191 > 0) {
            int var49 = this.field4191 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4193) {
                for (int var50 = 0; var50 < this.field4186; var50++) {
                    int var51 = (this.field4191 >> 1) + var50;
                    var48[var50] += this.field4177[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4199[var52];
                }
            }
        }
        float[] var54 = this.field4177;
        this.field4177 = field4199;
        field4199 = var54;
        this.field4191 = var4;
        this.field4186 = var12 - (var4 >> 1);
        this.field4193 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V")
    private class259(byte[] arg0) {
        this.method1780(arg0);
    }
}
