import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class235 extends class190 {

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Z")
    private static boolean field4011 = false;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    private static int field3993;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    private static int field3996;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    private int field3998;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "I")
    private int field4000;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    private static int field4005;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    private static int field4007;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    private int field4014;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Z")
    private boolean field3995;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Z")
    private boolean field4001;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "[B")
    private static byte[] field4006;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "[B")
    private byte[] field4019;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "[F")
    private static float[] field3989;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "[F")
    private float[] field3991;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "[F")
    private static float[] field3994;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "[F")
    private static float[] field3997;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "[F")
    private static float[] field3999;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "[F")
    private static float[] field4002;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "[F")
    private static float[] field4009;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "[F")
    private static float[] field4010;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
    private static int[] field3988;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "[I")
    private static int[] field4004;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "[I")
    private static int[] field4008;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[Lda;")
    private static class160[] field3992;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "[Ljj;")
    public static class210[] field4013;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "[Lnd;")
    private static class215[] field4003;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "[Lwh;")
    private static class231[] field4016;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "[Z")
    private static boolean[] field4018;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "[[B")
    private byte[][] field4015;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public static final int method1515() {
        int var0 = field4006[field4007] >> field3996 & 0x1;
        field3996++;
        field4007 += field3996 >> 3;
        field3996 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)[F")
    private final float[] method1516(int arg0) {
        method1520(this.field4015[arg0], 0);
        method1515();
        int var2 = method1519(class153.method1011(field4004.length - 1, -1953808724));
        boolean var3 = field4018[var2];
        int var4 = var3 ? field3993 : field4005;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1515() != 0;
            var6 = method1515() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4005 >> 2);
            var9 = (field4005 >> 2) + (var4 >> 2);
            var10 = field4005 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4005 >> 2);
            var12 = (field4005 >> 2) + (var4 - (var4 >> 2));
            var13 = field4005 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class160 var14 = field3992[field4004[var2]];
        int var15 = var14.field2753;
        int var16 = var14.field2755[var15];
        boolean var17 = !field4003[var16].method1390();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2754; var19++) {
            class231 var95 = field4016[var14.field2752[var19]];
            float[] var96 = field4010;
            var95.method1493(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2753;
            int var21 = var14.field2755[var20];
            field4003[var21].method1386(field4010, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4010[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4010;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3994 : field3999;
            float[] var30 = var3 ? field3989 : field3997;
            float[] var31 = var3 ? field4009 : field4002;
            int[] var32 = var3 ? field3988 : field4008;
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
            int var35 = class153.method1011(var4 - 1, -1953808724);
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
                field4010[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4010[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3998 > 0) {
            int var49 = this.field3998 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4001) {
                for (int var50 = 0; var50 < this.field4012; var50++) {
                    int var51 = (this.field3998 >> 1) + var50;
                    var48[var50] += this.field3991[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4010[var52];
                }
            }
        }
        float[] var54 = this.field3991;
        this.field3991 = field4010;
        field4010 = var54;
        this.field3998 = var4;
        this.field4012 = var12 - (var4 >> 1);
        this.field4001 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public static void method1517() {
        field4006 = null;
        field4013 = null;
        field4003 = null;
        field4016 = null;
        field3992 = null;
        field4018 = null;
        field4004 = null;
        field4010 = null;
        field3999 = null;
        field3997 = null;
        field4002 = null;
        field3994 = null;
        field3989 = null;
        field4009 = null;
        field4008 = null;
        field3988 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([I)Lkh;")
    public final class220 method1518(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4019 == null) {
            this.field3998 = 0;
            this.field3991 = new float[field3993];
            this.field4019 = new byte[this.field3990];
            this.field4017 = 0;
            this.field4020 = 0;
        }
        while (this.field4020 < this.field4015.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1516(this.field4020);
            if (var3 != null) {
                int var4 = this.field4017;
                int var5 = var3.length;
                if (var5 > this.field3990 - var4) {
                    var5 = this.field3990 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4019[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4017;
                }
                this.field4017 = var4;
            }
            this.field4020++;
        }
        this.field3991 = null;
        byte[] var2 = this.field4019;
        this.field4019 = null;
        return new class220(this.field4000, var2, this.field4014, this.field3987, this.field3995);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)I")
    public static final int method1519(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3996) {
            int var4 = 8 - field3996;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4006[field4007] >> field3996 & var5) << var2;
            field3996 = 0;
            field4007++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4006[field4007] >> field3996 & var3) << var2;
            field3996 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([BI)V")
    private static final void method1520(byte[] arg0, int arg1) {
        field4006 = arg0;
        field4007 = arg1;
        field3996 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B)V")
    private final void method1521(byte[] arg0) {
        class112 var2 = new class112(arg0);
        this.field4000 = var2.method769((byte) -86);
        this.field3990 = var2.method769((byte) -86);
        this.field4014 = var2.method769((byte) -86);
        this.field3987 = var2.method769((byte) -86);
        if (this.field3987 < 0) {
            this.field3987 = ~this.field3987;
            this.field3995 = true;
        }
        int var3 = var2.method769((byte) -86);
        this.field4015 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method758(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method754(0, -4, var5, var7);
            this.field4015[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)F")
    public static final float method1522(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "([B)V")
    private static final void method1523(byte[] arg0) {
        method1520(arg0, 0);
        field4005 = 0x1 << method1519(4);
        field3993 = 0x1 << method1519(4);
        field4010 = new float[field3993];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4005 : field3993;
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
            int var25 = class153.method1011(var17 - 1, -1953808724);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class129.method873(var25, 0, var26);
            }
            if (var1 == 0) {
                field3999 = var18;
                field3997 = var20;
                field4002 = var22;
                field4008 = var24;
            } else {
                field3994 = var18;
                field3989 = var20;
                field4009 = var22;
                field3988 = var24;
            }
        }
        int var2 = method1519(8) + 1;
        field4013 = new class210[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4013[var3] = new class210();
        }
        int var4 = method1519(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1519(16);
        }
        int var6 = method1519(6) + 1;
        field4003 = new class215[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4003[var7] = new class215();
        }
        int var8 = method1519(6) + 1;
        field4016 = new class231[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4016[var9] = new class231();
        }
        int var10 = method1519(6) + 1;
        field3992 = new class160[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3992[var11] = new class160();
        }
        int var12 = method1519(6) + 1;
        field4018 = new boolean[var12];
        field4004 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4018[var13] = method1515() != 0;
            method1519(16);
            method1519(16);
            field4004[var13] = method1519(8);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loe;)Z")
    private static final boolean method1524(class256 arg0) {
        if (!field4011) {
            byte[] var1 = arg0.method1712(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method1523(var1);
            field4011 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Loe;II)Li;")
    public static final class235 method1525(class256 arg0, int arg1, int arg2) {
        if (method1524(arg0)) {
            byte[] var3 = arg0.method1712(arg2, arg1, -1);
            return var3 == null ? null : new class235(var3);
        } else {
            arg0.method1707(-1, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
    private class235(byte[] arg0) {
        this.method1521(arg0);
    }
}
