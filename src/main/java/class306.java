import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class306 extends class568 {

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "Z")
    private static boolean field4935 = false;

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "I")
    private int field4936;

    @OriginalMember(owner = "client!gga", name = "S", descriptor = "I")
    private static int field4941;

    @OriginalMember(owner = "client!gga", name = "y", descriptor = "I")
    private int field4942;

    @OriginalMember(owner = "client!gga", name = "H", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!gga", name = "O", descriptor = "I")
    private static int field4951;

    @OriginalMember(owner = "client!gga", name = "P", descriptor = "I")
    private int field4952;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    private static int field4955;

    @OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
    private static int field4957;

    @OriginalMember(owner = "client!gga", name = "M", descriptor = "I")
    private int field4960;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!gga", name = "Q", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!gga", name = "x", descriptor = "Z")
    private boolean field4937;

    @OriginalMember(owner = "client!gga", name = "w", descriptor = "Z")
    private boolean field4949;

    @OriginalMember(owner = "client!gga", name = "v", descriptor = "[B")
    private static byte[] field4934;

    @OriginalMember(owner = "client!gga", name = "B", descriptor = "[B")
    private byte[] field4964;

    @OriginalMember(owner = "client!gga", name = "A", descriptor = "[F")
    private float[] field4938;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "[F")
    private static float[] field4940;

    @OriginalMember(owner = "client!gga", name = "n", descriptor = "[F")
    private static float[] field4948;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "[F")
    private static float[] field4950;

    @OriginalMember(owner = "client!gga", name = "N", descriptor = "[F")
    private static float[] field4953;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "[F")
    private static float[] field4956;

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "[F")
    private static float[] field4958;

    @OriginalMember(owner = "client!gga", name = "C", descriptor = "[F")
    private static float[] field4961;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "[I")
    private static int[] field4943;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "[I")
    private static int[] field4944;

    @OriginalMember(owner = "client!gga", name = "K", descriptor = "[I")
    private static int[] field4947;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "[Lig;")
    public static class255[] field4954;

    @OriginalMember(owner = "client!gga", name = "T", descriptor = "[Ltc;")
    private static class371[] field4966;

    @OriginalMember(owner = "client!gga", name = "R", descriptor = "[Lij;")
    private static class446[] field4939;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "[Liba;")
    private static class557[] field4945;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "[Z")
    private static boolean[] field4959;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "[[B")
    private byte[][] field4962;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lgda;)Z", line = 3)
    private static final boolean method2625(class58 arg0) {
        if (!field4935) {
            byte[] var1 = arg0.method604((byte) -123, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2632(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BI)V", line = 18)
    private static final void method2626(byte[] arg0, int arg1) {
        field4934 = arg0;
        field4955 = arg1;
        field4957 = 0;
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(I)F", line = 29)
    public static final float method2627(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([B)V", line = 41)
    private final void method2628(byte[] arg0) {
        class176 var2 = new class176(arg0);
        this.field4952 = var2.method1622(-18712);
        this.field4933 = var2.method1622(-18712);
        this.field4942 = var2.method1622(-18712);
        this.field4936 = var2.method1622(-18712);
        if (this.field4936 < 0) {
            this.field4936 = ~this.field4936;
            this.field4949 = true;
        }
        int var3 = var2.method1622(-18712);
        this.field4962 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1645((byte) -112);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1651(var7, 128, 0, var5);
            this.field4962[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)[F", line = 92)
    private final float[] method2629(int arg0) {
        method2626(this.field4962[arg0], 0);
        method2634();
        int var2 = method2635(class349.method2911(-103, field4943.length - 1));
        boolean var3 = field4959[var2];
        int var4 = var3 ? field4941 : field4951;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2634() != 0;
            var6 = method2634() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4951 >> 2);
            var9 = (field4951 >> 2) + (var4 >> 2);
            var10 = field4951 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4951 >> 2);
            var12 = (field4951 >> 2) + (var4 - (var4 >> 2));
            var13 = field4951 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class446 var14 = field4939[field4943[var2]];
        int var15 = var14.field6933;
        int var16 = var14.field6934[var15];
        boolean var17 = !field4966[var16].method3052();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6931; var19++) {
            class557 var95 = field4945[var14.field6932[var19]];
            float[] var96 = field4956;
            var95.method4111(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6933;
            int var21 = var14.field6934[var20];
            field4966[var21].method3050(field4956, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4956[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4956;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4950 : field4961;
            float[] var30 = var3 ? field4940 : field4953;
            float[] var31 = var3 ? field4948 : field4958;
            int[] var32 = var3 ? field4947 : field4944;
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
            int var35 = class349.method2911(-115, var4 - 1);
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
                field4956[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4956[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4946 > 0) {
            int var49 = this.field4946 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4937) {
                for (int var50 = 0; var50 < this.field4960; var50++) {
                    int var51 = (this.field4946 >> 1) + var50;
                    var48[var50] += this.field4938[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4956[var52];
                }
            }
        }
        float[] var54 = this.field4938;
        this.field4938 = field4956;
        field4956 = var54;
        this.field4946 = var4;
        this.field4960 = var12 - (var4 >> 1);
        this.field4937 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lgda;II)Lgga;", line = 507)
    public static final class306 method2630(class58 arg0, int arg1, int arg2) {
        if (method2625(arg0)) {
            byte[] var3 = arg0.method604((byte) -121, arg2, arg1);
            return var3 == null ? null : new class306(var3);
        } else {
            arg0.method586(arg1, -25034, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([I)Ljg;", line = 521)
    public final class357 method2631(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4964 == null) {
            this.field4946 = 0;
            this.field4938 = new float[field4941];
            this.field4964 = new byte[this.field4933];
            this.field4963 = 0;
            this.field4965 = 0;
        }
        while (this.field4965 < this.field4962.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2629(this.field4965);
            if (var3 != null) {
                int var4 = this.field4963;
                int var5 = var3.length;
                if (var5 > this.field4933 - var4) {
                    var5 = this.field4933 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4964[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4963;
                }
                this.field4963 = var4;
            }
            this.field4965++;
        }
        this.field4938 = null;
        byte[] var2 = this.field4964;
        this.field4964 = null;
        return new class357(this.field4952, var2, this.field4942, this.field4936, this.field4949);
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "([B)V", line = 579)
    private static final void method2632(byte[] arg0) {
        method2626(arg0, 0);
        field4951 = 0x1 << method2635(4);
        field4941 = 0x1 << method2635(4);
        field4956 = new float[field4941];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4951 : field4941;
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
            int var25 = class349.method2911(-94, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class595.method4358(var25, (byte) 117, var26);
            }
            if (var1 == 0) {
                field4961 = var18;
                field4953 = var20;
                field4958 = var22;
                field4944 = var24;
            } else {
                field4950 = var18;
                field4940 = var20;
                field4948 = var22;
                field4947 = var24;
            }
        }
        int var2 = method2635(8) + 1;
        field4954 = new class255[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4954[var3] = new class255();
        }
        int var4 = method2635(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2635(16);
        }
        int var6 = method2635(6) + 1;
        field4966 = new class371[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4966[var7] = new class371();
        }
        int var8 = method2635(6) + 1;
        field4945 = new class557[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4945[var9] = new class557();
        }
        int var10 = method2635(6) + 1;
        field4939 = new class446[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4939[var11] = new class446();
        }
        int var12 = method2635(6) + 1;
        field4959 = new boolean[var12];
        field4943 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4959[var13] = method2634() != 0;
            method2635(16);
            method2635(16);
            field4943[var13] = method2635(8);
        }
        field4935 = true;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lgda;I)Lgga;", line = 734)
    public static final class306 method2633(class58 arg0, int arg1) {
        if (method2625(arg0)) {
            byte[] var2 = arg0.method587(arg1, true);
            return var2 == null ? null : new class306(var2);
        } else {
            arg0.method595(-2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "()I", line = 754)
    public static final int method2634() {
        int var0 = field4934[field4955] >> field4957 & 0x1;
        field4957++;
        field4955 += field4957 >> 3;
        field4957 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I", line = 763)
    public static final int method2635(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4957) {
            int var4 = 8 - field4957;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4934[field4955] >> field4957 & var5) << var2;
            field4957 = 0;
            field4955++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4934[field4955] >> field4957 & var3) << var2;
            field4957 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "([B)V", line = 798)
    private class306(byte[] arg0) {
        this.method2628(arg0);
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "()V", line = 804)
    public static void method2636() {
        field4934 = null;
        field4954 = null;
        field4966 = null;
        field4945 = null;
        field4939 = null;
        field4959 = null;
        field4943 = null;
        field4956 = null;
        field4961 = null;
        field4953 = null;
        field4958 = null;
        field4950 = null;
        field4940 = null;
        field4948 = null;
        field4944 = null;
        field4947 = null;
    }
}
