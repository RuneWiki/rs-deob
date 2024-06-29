import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class225 extends class207 {

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "Z")
    private static boolean field4087 = false;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    private static int field4065;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    private static int field4079;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    private static int field4084;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "I")
    private int field4085;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    private static int field4088;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    private int field4092;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "Z")
    private boolean field4071;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Z")
    private boolean field4083;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[B")
    private static byte[] field4061;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "[B")
    private byte[] field4093;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[F")
    private float[] field4063;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[F")
    private static float[] field4064;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "[F")
    private static float[] field4067;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "[F")
    private static float[] field4070;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[F")
    private static float[] field4072;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[F")
    private static float[] field4073;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "[F")
    private static float[] field4074;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "[F")
    private static float[] field4075;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[I")
    private static int[] field4062;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "[I")
    private static int[] field4081;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "[I")
    private static int[] field4082;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "[Lpb;")
    private static class123[] field4086;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "[Lih;")
    private static class196[] field4077;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "[Lka;")
    private static class245[] field4091;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "[Lqe;")
    public static class95[] field4076;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "[Z")
    private static boolean[] field4080;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "[[B")
    private byte[][] field4090;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([I)Lhe;")
    public final class19 method1576(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4093 == null) {
            this.field4068 = 0;
            this.field4063 = new float[field4084];
            this.field4093 = new byte[this.field4069];
            this.field4094 = 0;
            this.field4092 = 0;
        }
        while (this.field4092 < this.field4090.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1580(this.field4092);
            if (var3 != null) {
                int var4 = this.field4094;
                int var5 = var3.length;
                if (var5 > this.field4069 - var4) {
                    var5 = this.field4069 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4093[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4094;
                }
                this.field4094 = var4;
            }
            this.field4092++;
        }
        this.field4063 = null;
        byte[] var2 = this.field4093;
        this.field4093 = null;
        return new class19(this.field4066, var2, this.field4089, this.field4078, this.field4083);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbj;II)Lbg;")
    public static final class225 method1577(class151 arg0, int arg1, int arg2) {
        if (method1584(arg0)) {
            byte[] var3 = arg0.method1084((byte) -121, arg1, arg2);
            return var3 == null ? null : new class225(var3);
        } else {
            arg0.method1076(arg2, arg1, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)F")
    public static final float method1578(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([B)V")
    private static final void method1579(byte[] arg0) {
        method1582(arg0, 0);
        field4088 = 0x1 << method1583(4);
        field4084 = 0x1 << method1583(4);
        field4067 = new float[field4084];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4088 : field4084;
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
            int var25 = class57.method413((byte) -51, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class208.method1481((byte) 28, var25, var26);
            }
            if (var1 == 0) {
                field4073 = var18;
                field4075 = var20;
                field4064 = var22;
                field4082 = var24;
            } else {
                field4074 = var18;
                field4070 = var20;
                field4072 = var22;
                field4062 = var24;
            }
        }
        int var2 = method1583(8) + 1;
        field4076 = new class95[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4076[var3] = new class95();
        }
        int var4 = method1583(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1583(16);
        }
        int var6 = method1583(6) + 1;
        field4086 = new class123[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4086[var7] = new class123();
        }
        int var8 = method1583(6) + 1;
        field4091 = new class245[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4091[var9] = new class245();
        }
        int var10 = method1583(6) + 1;
        field4077 = new class196[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4077[var11] = new class196();
        }
        int var12 = method1583(6) + 1;
        field4080 = new boolean[var12];
        field4081 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4080[var13] = method1585() != 0;
            method1583(16);
            method1583(16);
            field4081[var13] = method1583(8);
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)[F")
    private final float[] method1580(int arg0) {
        method1582(this.field4090[arg0], 0);
        method1585();
        int var2 = method1583(class57.method413((byte) -79, field4081.length - 1));
        boolean var3 = field4080[var2];
        int var4 = var3 ? field4084 : field4088;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1585() != 0;
            var6 = method1585() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4088 >> 2);
            var9 = (field4088 >> 2) + (var4 >> 2);
            var10 = field4088 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4088 >> 2);
            var12 = (field4088 >> 2) + (var4 - (var4 >> 2));
            var13 = field4088 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class196 var14 = field4077[field4081[var2]];
        int var15 = var14.field3509;
        int var16 = var14.field3508[var15];
        boolean var17 = !field4086[var16].method879();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3510; var19++) {
            class245 var95 = field4091[var14.field3507[var19]];
            float[] var96 = field4067;
            var95.method1668(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3509;
            int var21 = var14.field3508[var20];
            field4086[var21].method876(field4067, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4067[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4067;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4074 : field4073;
            float[] var30 = var3 ? field4070 : field4075;
            float[] var31 = var3 ? field4072 : field4064;
            int[] var32 = var3 ? field4062 : field4082;
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
            int var35 = class57.method413((byte) -51, var4 - 1);
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
                field4067[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4067[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4068 > 0) {
            int var49 = this.field4068 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4071) {
                for (int var50 = 0; var50 < this.field4085; var50++) {
                    int var51 = (this.field4068 >> 1) + var50;
                    var48[var50] += this.field4063[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4067[var52];
                }
            }
        }
        float[] var54 = this.field4063;
        this.field4063 = field4067;
        field4067 = var54;
        this.field4068 = var4;
        this.field4085 = var12 - (var4 >> 1);
        this.field4071 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "([B)V")
    private final void method1581(byte[] arg0) {
        class200 var2 = new class200(arg0);
        this.field4066 = var2.method1386(-4603);
        this.field4069 = var2.method1386(-4603);
        this.field4089 = var2.method1386(-4603);
        this.field4078 = var2.method1386(-4603);
        if (this.field4078 < 0) {
            this.field4078 = ~this.field4078;
            this.field4083 = true;
        }
        int var3 = var2.method1386(-4603);
        this.field4090 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1408((byte) -108);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1425(0, var5, var7, -4);
            this.field4090[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BI)V")
    private static final void method1582(byte[] arg0, int arg1) {
        field4061 = arg0;
        field4065 = arg1;
        field4079 = 0;
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
    public static final int method1583(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4079) {
            int var4 = 8 - field4079;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4061[field4065] >> field4079 & var5) << var2;
            field4079 = 0;
            field4065++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4061[field4065] >> field4079 & var3) << var2;
            field4079 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbj;)Z")
    private static final boolean method1584(class151 arg0) {
        if (!field4087) {
            byte[] var1 = arg0.method1084((byte) -122, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1579(var1);
            field4087 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()I")
    public static final int method1585() {
        int var0 = field4061[field4065] >> field4079 & 0x1;
        field4079++;
        field4065 += field4079 >> 3;
        field4079 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
    private class225(byte[] arg0) {
        this.method1581(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V")
    public static void method1586() {
        field4061 = null;
        field4076 = null;
        field4086 = null;
        field4091 = null;
        field4077 = null;
        field4080 = null;
        field4081 = null;
        field4067 = null;
        field4073 = null;
        field4075 = null;
        field4064 = null;
        field4074 = null;
        field4070 = null;
        field4072 = null;
        field4082 = null;
        field4062 = null;
    }
}
