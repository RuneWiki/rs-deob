import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class74 extends class337 {

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "Z")
    private static boolean field997 = false;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    private static int field1004;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    private static int field1006;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    private static int field1017;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
    private static int field1021;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "Z")
    private boolean field1011;

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "Z")
    private boolean field1026;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "[B")
    private static byte[] field1010;

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "[B")
    private byte[] field1030;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "[F")
    private static float[] field1001;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "[F")
    private static float[] field1002;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "[F")
    private static float[] field1003;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "[F")
    private float[] field1008;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "[F")
    private static float[] field1013;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "[F")
    private static float[] field1018;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "[F")
    private static float[] field1023;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "[F")
    private static float[] field1025;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "[I")
    private static int[] field1014;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "[I")
    private static int[] field998;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "[I")
    private static int[] field999;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "[Lbga;")
    private static class180[] field1000;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "[Liaa;")
    public static class267[] field1007;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "[Lsga;")
    private static class677[] field1009;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "[Lffa;")
    private static class707[] field1022;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "[Z")
    private static boolean[] field1019;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "[[B")
    private byte[][] field1012;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)F")
    public static final float method434(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lwm;I)Llea;")
    public static final class74 method435(class30 arg0, int arg1) {
        if (method441(arg0)) {
            byte[] var2 = arg0.method148((byte) -127, arg1);
            return var2 == null ? null : new class74(var2);
        } else {
            arg0.method130(-2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([B)V")
    private static final void method436(byte[] arg0) {
        method443(arg0, 0);
        field1017 = 0x1 << method438(4);
        field1021 = 0x1 << method438(4);
        field1001 = new float[field1021];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1017 : field1021;
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
            int var25 = class194.method1347(var17 - 1, true);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class740.method4024(var25, var26, -46);
            }
            if (var1 == 0) {
                field1025 = var18;
                field1018 = var20;
                field1002 = var22;
                field999 = var24;
            } else {
                field1003 = var18;
                field1013 = var20;
                field1023 = var22;
                field1014 = var24;
            }
        }
        int var2 = method438(8) + 1;
        field1007 = new class267[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1007[var3] = new class267();
        }
        int var4 = method438(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method438(16);
        }
        int var6 = method438(6) + 1;
        field1022 = new class707[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1022[var7] = new class707();
        }
        int var8 = method438(6) + 1;
        field1009 = new class677[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1009[var9] = new class677();
        }
        int var10 = method438(6) + 1;
        field1000 = new class180[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1000[var11] = new class180();
        }
        int var12 = method438(6) + 1;
        field1019 = new boolean[var12];
        field998 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1019[var13] = method437() != 0;
            method438(16);
            method438(16);
            field998[var13] = method438(8);
        }
        field997 = true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()I")
    public static final int method437() {
        int var0 = field1010[field1004] >> field1006 & 0x1;
        field1006++;
        field1004 += field1006 >> 3;
        field1006 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)I")
    public static final int method438(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1006) {
            int var4 = 8 - field1006;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1010[field1004] >> field1006 & var5) << var2;
            field1006 = 0;
            field1004++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1010[field1004] >> field1006 & var3) << var2;
            field1006 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)[F")
    private final float[] method439(int arg0) {
        method443(this.field1012[arg0], 0);
        method437();
        int var2 = method438(class194.method1347(field998.length - 1, true));
        boolean var3 = field1019[var2];
        int var4 = var3 ? field1021 : field1017;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method437() != 0;
            var6 = method437() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1017 >> 2);
            var9 = (field1017 >> 2) + (var4 >> 2);
            var10 = field1017 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1017 >> 2);
            var12 = (field1017 >> 2) + (var4 - (var4 >> 2));
            var13 = field1017 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class180 var14 = field1000[field998[var2]];
        int var15 = var14.field2459;
        int var16 = var14.field2461[var15];
        boolean var17 = !field1022[var16].method3822();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2462; var19++) {
            class677 var95 = field1009[var14.field2460[var19]];
            float[] var96 = field1001;
            var95.method3640(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2459;
            int var21 = var14.field2461[var20];
            field1022[var21].method3824(field1001, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1001[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1001;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1003 : field1025;
            float[] var30 = var3 ? field1013 : field1018;
            float[] var31 = var3 ? field1023 : field1002;
            int[] var32 = var3 ? field1014 : field999;
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
            int var35 = class194.method1347(var4 - 1, true);
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
                field1001[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1001[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1015 > 0) {
            int var49 = this.field1015 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1011) {
                for (int var50 = 0; var50 < this.field1016; var50++) {
                    int var51 = (this.field1015 >> 1) + var50;
                    var48[var50] += this.field1008[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1001[var52];
                }
            }
        }
        float[] var54 = this.field1008;
        this.field1008 = field1001;
        field1001 = var54;
        this.field1015 = var4;
        this.field1016 = var12 - (var4 >> 1);
        this.field1011 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lwm;II)Llea;")
    public static final class74 method440(class30 arg0, int arg1, int arg2) {
        if (method441(arg0)) {
            byte[] var3 = arg0.method139(arg1, (byte) -94, arg2);
            return var3 == null ? null : new class74(var3);
        } else {
            arg0.method127((byte) 120, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lwm;)Z")
    private static final boolean method441(class30 arg0) {
        if (!field997) {
            byte[] var1 = arg0.method139(0, (byte) -94, 0);
            if (var1 == null) {
                return false;
            }
            method436(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "([B)V")
    private final void method442(byte[] arg0) {
        class234 var2 = new class234(arg0);
        this.field1005 = var2.method1497((byte) 90);
        this.field1027 = var2.method1497((byte) 113);
        this.field1024 = var2.method1497((byte) 87);
        this.field1020 = var2.method1497((byte) 91);
        if (this.field1020 < 0) {
            this.field1020 = ~this.field1020;
            this.field1026 = true;
        }
        int var3 = var2.method1497((byte) 121);
        this.field1012 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1509(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1495(var5, 0, (byte) -127, var7);
            this.field1012[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([BI)V")
    private static final void method443(byte[] arg0, int arg1) {
        field1010 = arg0;
        field1004 = arg1;
        field1006 = 0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([I)Lnga;")
    public final class701 method444(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1030 == null) {
            this.field1015 = 0;
            this.field1008 = new float[field1021];
            this.field1030 = new byte[this.field1027];
            this.field1028 = 0;
            this.field1029 = 0;
        }
        while (this.field1029 < this.field1012.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method439(this.field1029);
            if (var3 != null) {
                int var4 = this.field1028;
                int var5 = var3.length;
                if (var5 > this.field1027 - var4) {
                    var5 = this.field1027 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1030[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1028;
                }
                this.field1028 = var4;
            }
            this.field1029++;
        }
        this.field1008 = null;
        byte[] var2 = this.field1030;
        this.field1030 = null;
        return new class701(this.field1005, var2, this.field1024, this.field1020, this.field1026);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "()V")
    public static void method445() {
        field1010 = null;
        field1007 = null;
        field1022 = null;
        field1009 = null;
        field1000 = null;
        field1019 = null;
        field998 = null;
        field1001 = null;
        field1025 = null;
        field1018 = null;
        field1002 = null;
        field1003 = null;
        field1013 = null;
        field1023 = null;
        field999 = null;
        field1014 = null;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "([B)V")
    private class74(byte[] arg0) {
        this.method442(arg0);
    }
}
