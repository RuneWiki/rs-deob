import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class201 extends class97 {

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
    private static boolean field3954 = false;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    private static int field3946;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    private static int field3947;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private static int field3957;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    private int field3960;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    private int field3972;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    private static int field3976;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Z")
    private boolean field3963;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Z")
    private boolean field3975;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[B")
    private static byte[] field3968;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "[B")
    private byte[] field3979;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[F")
    private static float[] field3948;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "[F")
    private static float[] field3949;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "[F")
    private static float[] field3950;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[F")
    private static float[] field3951;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "[F")
    private static float[] field3955;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[F")
    private static float[] field3958;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "[F")
    private static float[] field3961;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "[F")
    private float[] field3970;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "[I")
    private static int[] field3959;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "[I")
    private static int[] field3966;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[I")
    private static int[] field3973;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "[Llf;")
    private static class104[] field3967;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "[Lne;")
    private static class121[] field3962;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[Ltd;")
    public static class174[] field3965;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "[Li;")
    private static class72[] field3974;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "[Z")
    private static boolean[] field3971;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "[[B")
    private byte[][] field3969;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ldd;)Z")
    private static final boolean method1315(class32 arg0) {
        if (!field3954) {
            byte[] var1 = arg0.method215(0, 0, 1);
            if (var1 == null) {
                return false;
            }
            method1324(var1);
            field3954 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)F")
    public static final float method1316(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ldd;II)Lwd;")
    public static final class201 method1317(class32 arg0, int arg1, int arg2) {
        if (method1315(arg0)) {
            byte[] var3 = arg0.method215(arg2, arg1, 1);
            return var3 == null ? null : new class201(var3);
        } else {
            arg0.method199(-9350, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
    public static void method1318() {
        field3968 = null;
        field3965 = null;
        field3967 = null;
        field3974 = null;
        field3962 = null;
        field3971 = null;
        field3973 = null;
        field3951 = null;
        field3949 = null;
        field3948 = null;
        field3961 = null;
        field3955 = null;
        field3958 = null;
        field3950 = null;
        field3966 = null;
        field3959 = null;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)[F")
    private final float[] method1319(int arg0) {
        method1321(this.field3969[arg0], 0);
        method1323();
        int var2 = method1325(class160.method1155((byte) 24, field3973.length - 1));
        boolean var3 = field3971[var2];
        int var4 = var3 ? field3946 : field3947;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1323() != 0;
            var6 = method1323() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3947 >> 2);
            var9 = (field3947 >> 2) + (var4 >> 2);
            var10 = field3947 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3947 >> 2);
            var12 = (field3947 >> 2) + (var4 - (var4 >> 2));
            var13 = field3947 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class121 var14 = field3962[field3973[var2]];
        int var15 = var14.field2601;
        int var16 = var14.field2604[var15];
        boolean var17 = !field3967[var16].method847();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2603; var19++) {
            class72 var95 = field3974[var14.field2602[var19]];
            float[] var96 = field3951;
            var95.method576(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2601;
            int var21 = var14.field2604[var20];
            field3967[var21].method854(field3951, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3951[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3951;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3955 : field3949;
            float[] var30 = var3 ? field3958 : field3948;
            float[] var31 = var3 ? field3950 : field3961;
            int[] var32 = var3 ? field3959 : field3966;
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
            int var35 = class160.method1155((byte) 24, var4 - 1);
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
                field3951[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3951[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3964 > 0) {
            int var49 = this.field3964 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3975) {
                for (int var50 = 0; var50 < this.field3972; var50++) {
                    int var51 = (this.field3964 >> 1) + var50;
                    var48[var50] += this.field3970[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3951[var52];
                }
            }
        }
        float[] var54 = this.field3970;
        this.field3970 = field3951;
        field3951 = var54;
        this.field3964 = var4;
        this.field3972 = var12 - (var4 >> 1);
        this.field3975 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([I)Lih;")
    public final class79 method1320(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3979 == null) {
            this.field3964 = 0;
            this.field3970 = new float[field3946];
            this.field3979 = new byte[this.field3960];
            this.field3977 = 0;
            this.field3978 = 0;
        }
        while (this.field3978 < this.field3969.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1319(this.field3978);
            if (var3 != null) {
                int var4 = this.field3977;
                int var5 = var3.length;
                if (var5 > this.field3960 - var4) {
                    var5 = this.field3960 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3979[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3977;
                }
                this.field3977 = var4;
            }
            this.field3978++;
        }
        this.field3970 = null;
        byte[] var2 = this.field3979;
        this.field3979 = null;
        return new class79(this.field3952, var2, this.field3956, this.field3953, this.field3963);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)V")
    private static final void method1321(byte[] arg0, int arg1) {
        field3968 = arg0;
        field3957 = arg1;
        field3976 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([B)V")
    private final void method1322(byte[] arg0) {
        class66 var2 = new class66(arg0);
        this.field3952 = var2.method464(-107);
        this.field3960 = var2.method464(-124);
        this.field3956 = var2.method464(-97);
        this.field3953 = var2.method464(-96);
        if (this.field3953 < 0) {
            this.field3953 = ~this.field3953;
            this.field3963 = true;
        }
        int var3 = var2.method464(-88);
        this.field3969 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method509(121);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method499(0, var5, var7, (byte) -53);
            this.field3969[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()I")
    public static final int method1323() {
        int var0 = field3968[field3957] >> field3976 & 0x1;
        field3976++;
        field3957 += field3976 >> 3;
        field3976 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([B)V")
    private static final void method1324(byte[] arg0) {
        method1321(arg0, 0);
        field3947 = 0x1 << method1325(4);
        field3946 = 0x1 << method1325(4);
        field3951 = new float[field3946];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3947 : field3946;
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
            int var25 = class160.method1155((byte) 24, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class162.method1162(var26, (byte) 85, var25);
            }
            if (var1 == 0) {
                field3949 = var18;
                field3948 = var20;
                field3961 = var22;
                field3966 = var24;
            } else {
                field3955 = var18;
                field3958 = var20;
                field3950 = var22;
                field3959 = var24;
            }
        }
        int var2 = method1325(8) + 1;
        field3965 = new class174[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3965[var3] = new class174();
        }
        int var4 = method1325(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1325(16);
        }
        int var6 = method1325(6) + 1;
        field3967 = new class104[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3967[var7] = new class104();
        }
        int var8 = method1325(6) + 1;
        field3974 = new class72[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3974[var9] = new class72();
        }
        int var10 = method1325(6) + 1;
        field3962 = new class121[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3962[var11] = new class121();
        }
        int var12 = method1325(6) + 1;
        field3971 = new boolean[var12];
        field3973 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3971[var13] = method1323() != 0;
            method1325(16);
            method1325(16);
            field3973[var13] = method1325(8);
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
    public static final int method1325(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3976) {
            int var4 = 8 - field3976;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3968[field3957] >> field3976 & var5) << var2;
            field3976 = 0;
            field3957++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3968[field3957] >> field3976 & var3) << var2;
            field3976 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    private class201(byte[] arg0) {
        this.method1322(arg0);
    }
}
