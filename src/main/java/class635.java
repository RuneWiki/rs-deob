import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class635 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[F")
    private float[] field8918 = new float[16];

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Ltba;")
    private class148 field8920 = new class148(786336);

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    private int field8926 = class622.method3610((byte) -127, 1600);

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[[Lgk;")
    private class440[][] field8931 = new class440[1600][64];

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
    private int[] field8930 = new int[8191];

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    private int field8932 = 0;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
    private int[] field8934 = new int[64];

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "[[Lgk;")
    private class440[][] field8935 = new class440[64][768];

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "[I")
    private int[] field8933 = new int[1600];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lvd;")
    private class36 field8927;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lmk;")
    private class51 field8925;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lmk;")
    private class51 field8928;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lmk;")
    private class51 field8929;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILer;)V", line = 4)
    public final void method3689(int arg0, class92 arg1) {
        this.field8927 = arg1.method898(24, true, 196584, -112, null);
        field8923++;
        int var3 = 12 / ((-arg0 - 46) / 49);
        this.field8928 = new class51(this.field8927, 5126, 2, 0);
        this.field8929 = new class51(this.field8927, 5126, 3, 8);
        this.field8925 = new class51(this.field8927, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", line = 21)
    public static final void method3690(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8) {
        field8919++;
        class360 var9 = class353.field5618[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class353.field5618[var10] = class353.field5618[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class360(arg8, arg3, arg0, arg7, arg6, arg1, arg4, arg2);
        } else {
            var9.method2408(arg1, arg3, arg7, arg4, arg0, arg2, 121, arg8, arg6);
        }
        class353.field5618[0] = var9;
        class78.field992 = class79.field997;
        class529.field7715++;
        if (arg5 == -23694) {
            ;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(ILer;)V", line = 50)
    private final void method3691(int arg0, class92 arg1) {
        class87.field1065 = arg1.field1451;
        field8921++;
        arg1.method843((byte) -22);
        OpenGL.glDisable(16384);
        if (arg0 == 0) {
            OpenGL.glDisable(16385);
            arg1.method877(false, -32);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILr;Lega;)I", line = 67)
    public static final int method3692(int arg0, class167 arg1, class661 arg2) {
        field8924++;
        if (arg0 <= 88) {
            method3690(null, null, null, 29, 112, 46, null, null, -14);
        }
        if (arg2.field9210 != -1) {
            return arg2.field9210;
        }
        if (arg2.field9201 != -1) {
            class258 var3 = arg1.field2812.method1610(18904, arg2.field9201);
            if (!var3.field4117) {
                return var3.field4120;
            }
        }
        return arg2.field9206;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZILer;)V", line = 92)
    private final void method3693(boolean arg0, int arg1, class92 arg2) {
        class87.field1065 = arg2.field1451;
        field8915++;
        arg2.method821(123, (float) arg1);
        if (!arg0) {
            method3695(false, -118, 27, -40, 80, false);
        }
        arg2.method855(-125);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method877(false, -32);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILer;)V", line = 109)
    private final void method3694(int arg0, int arg1, class92 arg2) {
        OpenGL.glGetFloatv(2982, this.field8918, 0);
        field8914++;
        float var4 = this.field8918[0];
        float var5 = this.field8918[4];
        float var6 = this.field8918[8];
        if (arg0 != -1) {
            return;
        }
        float var7 = this.field8918[1];
        float var8 = this.field8918[5];
        float var9 = this.field8918[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8920.field57 = 0;
        float var18 = var9 - var6;
        if (arg2.field1410) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field8933[var44] <= 64 ? this.field8933[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class440 var59 = this.field8931[var44][var46];
                        int var60 = var59.field6708;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6711 >> 12);
                        float var66 = (float) (var59.field6705 >> 12);
                        float var67 = (float) (var59.field6710 >> 12);
                        int var68 = var59.field6709 >> 12;
                        this.field8920.method1241((byte) -56, 0.0F);
                        this.field8920.method1241((byte) -56, 0.0F);
                        this.field8920.method1241((byte) -112, (float) (-var68) * var10 + var65);
                        this.field8920.method1241((byte) -92, (float) (-var68) * var11 + var66);
                        this.field8920.method1241((byte) -77, (float) (-var68) * var12 + var67);
                        this.field8920.method65(var61, -77);
                        this.field8920.method65(var62, -77);
                        this.field8920.method65(var63, -77);
                        this.field8920.method65(var64, arg0 - 76);
                        this.field8920.method1241((byte) -72, 1.0F);
                        this.field8920.method1241((byte) -72, 0.0F);
                        this.field8920.method1241((byte) -64, (float) var68 * var13 + var65);
                        this.field8920.method1241((byte) -109, (float) var68 * var14 + var66);
                        this.field8920.method1241((byte) -97, (float) var68 * var15 + var67);
                        this.field8920.method65(var61, arg0 - 76);
                        this.field8920.method65(var62, -77);
                        this.field8920.method65(var63, -77);
                        this.field8920.method65(var64, arg0 ^ 0x4C);
                        this.field8920.method1241((byte) -59, 1.0F);
                        this.field8920.method1241((byte) -117, 1.0F);
                        this.field8920.method1241((byte) -58, (float) var68 * var10 + var65);
                        this.field8920.method1241((byte) -77, (float) var68 * var11 + var66);
                        this.field8920.method1241((byte) -84, (float) var68 * var12 + var67);
                        this.field8920.method65(var61, -77);
                        this.field8920.method65(var62, -77);
                        this.field8920.method65(var63, -77);
                        this.field8920.method65(var64, arg0 ^ 0x4C);
                        this.field8920.method1241((byte) -125, 0.0F);
                        this.field8920.method1241((byte) -64, 1.0F);
                        this.field8920.method1241((byte) -107, (float) var68 * var16 + var65);
                        this.field8920.method1241((byte) -73, (float) var68 * var17 + var66);
                        this.field8920.method1241((byte) -63, (float) var68 * var18 + var67);
                        this.field8920.method65(var61, -77);
                        this.field8920.method65(var62, -77);
                        this.field8920.method65(var63, -77);
                        this.field8920.method65(var64, -77);
                    }
                    if (this.field8933[var44] > 64) {
                        int var47 = this.field8933[var44] - 65;
                        for (int var48 = this.field8934[var47] - 1; var48 >= 0; var48--) {
                            class440 var49 = this.field8935[var47][var48];
                            int var50 = var49.field6708;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6711 >> 12);
                            float var56 = (float) (var49.field6705 >> 12);
                            float var57 = (float) (var49.field6710 >> 12);
                            int var58 = var49.field6709 >> 12;
                            this.field8920.method1241((byte) -61, 0.0F);
                            this.field8920.method1241((byte) -83, 0.0F);
                            this.field8920.method1241((byte) -92, (float) (-var58) * var10 + var55);
                            this.field8920.method1241((byte) -115, (float) (-var58) * var11 + var56);
                            this.field8920.method1241((byte) -116, (float) (-var58) * var12 + var57);
                            this.field8920.method65(var51, arg0 ^ 0x4C);
                            this.field8920.method65(var52, -77);
                            this.field8920.method65(var53, arg0 ^ 0x4C);
                            this.field8920.method65(var54, -77);
                            this.field8920.method1241((byte) -67, 1.0F);
                            this.field8920.method1241((byte) -93, 0.0F);
                            this.field8920.method1241((byte) -68, (float) var58 * var13 + var55);
                            this.field8920.method1241((byte) -95, (float) var58 * var14 + var56);
                            this.field8920.method1241((byte) -84, (float) var58 * var15 + var57);
                            this.field8920.method65(var51, -77);
                            this.field8920.method65(var52, -77);
                            this.field8920.method65(var53, arg0 ^ 0x4C);
                            this.field8920.method65(var54, arg0 - 76);
                            this.field8920.method1241((byte) -87, 1.0F);
                            this.field8920.method1241((byte) -125, 1.0F);
                            this.field8920.method1241((byte) -89, (float) var58 * var10 + var55);
                            this.field8920.method1241((byte) -108, (float) var58 * var11 + var56);
                            this.field8920.method1241((byte) -67, (float) var58 * var12 + var57);
                            this.field8920.method65(var51, -77);
                            this.field8920.method65(var52, -77);
                            this.field8920.method65(var53, arg0 ^ 0x4C);
                            this.field8920.method65(var54, -77);
                            this.field8920.method1241((byte) -63, 0.0F);
                            this.field8920.method1241((byte) -103, 1.0F);
                            this.field8920.method1241((byte) -64, (float) var58 * var16 + var55);
                            this.field8920.method1241((byte) -92, (float) var58 * var17 + var56);
                            this.field8920.method1241((byte) -88, (float) var58 * var18 + var57);
                            this.field8920.method65(var51, arg0 - 76);
                            this.field8920.method65(var52, -77);
                            this.field8920.method65(var53, -77);
                            this.field8920.method65(var54, -77);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field8933[var19] > 64 ? 64 : this.field8933[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class440 var34 = this.field8931[var19][var21];
                        int var35 = var34.field6708;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6711 >> 12);
                        float var41 = (float) (var34.field6705 >> 12);
                        float var42 = (float) (var34.field6710 >> 12);
                        int var43 = var34.field6709 >> 12;
                        this.field8920.method1243(-63, 0.0F);
                        this.field8920.method1243(arg0 - 116, 0.0F);
                        this.field8920.method1243(-84, (float) (-var43) * var10 + var40);
                        this.field8920.method1243(-71, (float) (-var43) * var11 + var41);
                        this.field8920.method1243(-78, (float) (-var43) * var12 + var42);
                        this.field8920.method65(var36, -77);
                        this.field8920.method65(var37, -77);
                        this.field8920.method65(var38, arg0 ^ 0x4C);
                        this.field8920.method65(var39, -77);
                        this.field8920.method1243(arg0 ^ 0x5B, 1.0F);
                        this.field8920.method1243(-80, 0.0F);
                        this.field8920.method1243(-100, (float) var43 * var13 + var40);
                        this.field8920.method1243(arg0 ^ 0x43, (float) var43 * var14 + var41);
                        this.field8920.method1243(arg0 ^ 0x48, (float) var43 * var15 + var42);
                        this.field8920.method65(var36, -77);
                        this.field8920.method65(var37, -77);
                        this.field8920.method65(var38, arg0 - 76);
                        this.field8920.method65(var39, -77);
                        this.field8920.method1243(-114, 1.0F);
                        this.field8920.method1243(-83, 1.0F);
                        this.field8920.method1243(-83, (float) var43 * var10 + var40);
                        this.field8920.method1243(-112, (float) var43 * var11 + var41);
                        this.field8920.method1243(arg0 ^ 0x7A, (float) var43 * var12 + var42);
                        this.field8920.method65(var36, arg0 ^ 0x4C);
                        this.field8920.method65(var37, -77);
                        this.field8920.method65(var38, -77);
                        this.field8920.method65(var39, -77);
                        this.field8920.method1243(-71, 0.0F);
                        this.field8920.method1243(-120, 1.0F);
                        this.field8920.method1243(-110, (float) var43 * var16 + var40);
                        this.field8920.method1243(-105, (float) var43 * var17 + var41);
                        this.field8920.method1243(-96, (float) var43 * var18 + var42);
                        this.field8920.method65(var36, -77);
                        this.field8920.method65(var37, -77);
                        this.field8920.method65(var38, -77);
                        this.field8920.method65(var39, arg0 - 76);
                    }
                    if (this.field8933[var19] > 64) {
                        int var22 = this.field8933[var19] - 64 - 1;
                        for (int var23 = this.field8934[var22] - 1; var23 >= 0; var23--) {
                            class440 var24 = this.field8935[var22][var23];
                            int var25 = var24.field6708;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6711 >> 12);
                            float var31 = (float) (var24.field6705 >> 12);
                            float var32 = (float) (var24.field6710 >> 12);
                            int var33 = var24.field6709 >> 12;
                            this.field8920.method1243(-67, 0.0F);
                            this.field8920.method1243(-82, 0.0F);
                            this.field8920.method1243(-70, (float) (-var33) * var10 + var30);
                            this.field8920.method1243(-72, (float) (-var33) * var11 + var31);
                            this.field8920.method1243(-100, (float) (-var33) * var12 + var32);
                            this.field8920.method65(var26, -77);
                            this.field8920.method65(var27, -77);
                            this.field8920.method65(var28, -77);
                            this.field8920.method65(var29, -77);
                            this.field8920.method1243(-108, 1.0F);
                            this.field8920.method1243(arg0 - 103, 0.0F);
                            this.field8920.method1243(-68, (float) var33 * var13 + var30);
                            this.field8920.method1243(arg0 - 117, (float) var33 * var14 + var31);
                            this.field8920.method1243(-59, (float) var33 * var15 + var32);
                            this.field8920.method65(var26, -77);
                            this.field8920.method65(var27, -77);
                            this.field8920.method65(var28, arg0 ^ 0x4C);
                            this.field8920.method65(var29, -77);
                            this.field8920.method1243(-126, 1.0F);
                            this.field8920.method1243(arg0 - 123, 1.0F);
                            this.field8920.method1243(arg0 - 99, (float) var33 * var10 + var30);
                            this.field8920.method1243(-65, (float) var33 * var11 + var31);
                            this.field8920.method1243(arg0 - 66, (float) var33 * var12 + var32);
                            this.field8920.method65(var26, -77);
                            this.field8920.method65(var27, -77);
                            this.field8920.method65(var28, -77);
                            this.field8920.method65(var29, -77);
                            this.field8920.method1243(-59, 0.0F);
                            this.field8920.method1243(-111, 1.0F);
                            this.field8920.method1243(-113, (float) var33 * var16 + var30);
                            this.field8920.method1243(-79, (float) var33 * var17 + var31);
                            this.field8920.method1243(-118, (float) var33 * var18 + var32);
                            this.field8920.method65(var26, arg0 - 76);
                            this.field8920.method65(var27, arg0 - 76);
                            this.field8920.method65(var28, arg0 - 76);
                            this.field8920.method65(var29, arg0 ^ 0x4C);
                        }
                    }
                }
            }
        }
        if (this.field8920.field57 != 0) {
            this.field8927.method472((byte) 121, this.field8920.field96, 24, this.field8920.field57);
            arg2.method858(this.field8928, this.field8925, (byte) 112, this.field8929, null);
            arg2.method850(7, this.field8920.field57 / 24, 1, 0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIIZ)V", line = 463)
    public static final void method3695(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field8922++;
        if (class454.field6818 == null) {
            class627.field8857.method1355(arg1, arg3, arg2, arg4, -16777216, 1);
        } else if (class567.field8141.field9696 >= 0 && class567.field8141.field9696 < (class275.field4426 * 512) && class567.field8141.field9705 >= 0 && class567.field8141.field9705 < class417.field6374 * 512) {
            class607.field8632++;
            if (class567.field8141 != null && class567.field8141.field9696 + 256 - (class567.field8141.method1841(20744) * 256) >> 9 == class43.field599 && (class567.field8141.field9705 + 256 - class567.field8141.method1841(20744) * 256 >> 9) == class473.field7005) {
                class43.field599 = -1;
                class473.field7005 = -1;
                class354.method2380(100);
            }
            class393.method2548(67);
            if (!arg5) {
                class657.method3776(true);
            }
            class687.method3901(117);
            class673.method3848(arg1, true, arg4, -106, arg3, arg2);
            int var6 = class598.field8498;
            int var7 = class304.field4769;
            int var8 = class682.field9560;
            int var9 = class218.field3573;
            if (class126.field2062 == 1) {
                int var10 = (int) class162.field2746;
                if ((class677.field9529 >> 8) > var10) {
                    var10 = class677.field9529 >> 8;
                }
                if (class631.field8880[4] && (class683.field9585[4] + 128) > var10) {
                    var10 = class683.field9585[4] + 128;
                }
                int var11 = (int) class37.field514 + class373.field5837 & 0x3FFF;
                class402.method2584((var10 >> 3) * 3 + 600 << 2, class473.field7001, class686.field9621, var11, class202.method1568(class567.field8141.field9696, class423.field6439, class567.field8141.field9705, 2) - 200, var8, var10, (byte) 96);
            } else if (class126.field2062 == 4) {
                int var12 = (int) class162.field2746;
                if (var12 < class677.field9529 >> 8) {
                    var12 = class677.field9529 >> 8;
                }
                if (class631.field8880[4] && (class683.field9585[4] + 128) > var12) {
                    var12 = class683.field9585[4] + 128;
                }
                int var13 = (int) class37.field514 & 0x3FFF;
                class402.method2584((var12 >> 3) * 3 + 600 << 2, class473.field7001, class686.field9621, var13, class202.method1568(class664.field9238, class423.field6439, class204.field3333, 2) - 200, var8, var12, (byte) 97);
            } else if (class126.field2062 == 5) {
                class126.method1107(16185, var8);
            }
            int var14 = class675.field9521;
            int var15 = class607.field8638;
            int var16 = class412.field6318;
            int var17 = class13.field197;
            int var18 = class523.field7598;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class631.field8880[var19]) {
                    int var22 = (int) ((double) (class208.field3482[var19] * 2 + 1) * Math.random() + Math.sin((double) class592.field8409[var19] / 100.0D * (double) class97.field1542[var19]) * (double) class683.field9585[var19] - (double) class208.field3482[var19]);
                    if (var19 == 0) {
                        class675.field9521 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class607.field8638 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class523.field7598 = class523.field7598 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class412.field6318 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class13.field197 += var22;
                        if (class13.field197 < 1024) {
                            class13.field197 = 1024;
                        } else if (class13.field197 > 3072) {
                            class13.field197 = 3072;
                        }
                    }
                }
            }
            if (class675.field9521 < 0) {
                class675.field9521 = 0;
            }
            if (((class43.field597 << 9) - 1) < class675.field9521) {
                class675.field9521 = (class43.field597 << 9) - 1;
            }
            if (class412.field6318 < 0) {
                class412.field6318 = 0;
            }
            if ((class541.field7896 << 9) - 1 < class412.field6318) {
                class412.field6318 = (class541.field7896 << 9) - 1;
            }
            class544.method3291(111);
            class520.method3138(arg0);
            class627.field8857.method352(var7, var9, var7 + var6, var9 - -var8);
            class627.field8857.method136();
            int var20 = class528.field7707;
            if (class581.field8273 == null) {
                class627.field8857.method121(var20);
            } else {
                class581.field8273.method1147(var20, (byte) -128, class13.field197, class627.field8857, var9, class579.field8255 << 3, class523.field7598, var8, var6, var7);
            }
            class636.method3698(true);
            class183.field3093.method497(class675.field9521, class607.field8638, class412.field6318, -class13.field197 & 0x3FFF, -class523.field7598 & 0x3FFF, -class617.field8744 & 0x3FFF);
            class627.field8857.method346(class183.field3093);
            class627.field8857.method318(var6 / 2 + var7, var9 - -(var8 / 2), class331.field5132 << 1, class331.field5132 << 1);
            class218.method1625(class331.field5132 << 1, var6 / 2 + var7, var8 / 2 + var9, class331.field5132 << 1, (byte) 106);
            class252.method1795(class675.field9521, -class13.field197 & 0x3FFF, -class617.field8744 & 0x3FFF, class607.field8638, -class523.field7598 & 0x3FFF, 124, class412.field6318);
            byte var21 = class17.field282.method2095(class497.field7259, 9408) == 2 ? (byte) class607.field8632 : 1;
            class508.method3088(class562.field8084, class675.field9521, class607.field8638, class412.field6318, class428.field6538, class645.field9067, class680.field9541, class232.field3692, class16.field266, class257.field4077, class567.field8141.field9695 + 1, var21, class567.field8141.field9696 >> 9, class567.field8141.field9705 >> 9, !class17.field282.field4852, true);
            class636.method3698(true);
            if (class682.field9564 == 10) {
                class382.method2500(var7, 256, var6, (byte) -24, 256, var9, var8);
                class31.method441(var6, 256, var8, 256, var9, var7, -15003);
                class663.method3802(256, var8, false, var9, 256, var6, var7);
                class435.method2765(var7, var8, (byte) -55, var9, var6);
            }
            class246.method1757();
            class13.field197 = var17;
            class412.field6318 = var16;
            class675.field9521 = var14;
            class523.field7598 = var18;
            class607.field8638 = var15;
            if (class469.field6957 && class683.field9586.method2953((byte) 34) == 0) {
                class469.field6957 = false;
            }
            if (class469.field6957) {
                class627.field8857.method1355(var9, var7, var8, var6, -16777216, 1);
                class420.method2683(class573.field8183, -31593, class122.field1984.method1091(class135.field2206, 1), class627.field8857, class125.field2057, false);
            }
        } else {
            class627.field8857.method1355(arg1, arg3, arg2, arg4, -16777216, 1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltt;Ler;BI)V", line = 653)
    public final void method3696(class79 arg0, class92 arg1, byte arg2, int arg3) {
        field8917++;
        if (arg1.field1355 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method3693(true, arg3, arg1);
        } else {
            this.method3691(0, arg1);
        }
        int var5 = 79 / ((arg2 - 72) / 54);
        float var6 = arg1.field1355.field540;
        float var7 = arg1.field1355.field532;
        float var8 = arg1.field1355.field555;
        float var9 = arg1.field1355.field543;
        try {
            int var10 = 0;
            int var11 = Integer.MAX_VALUE;
            int var12 = 0;
            class253 var13 = arg0.field999.field4346;
            for (class253 var14 = var13.field4042; var14 != var13; var14 = var14.field4042) {
                class440 var15 = (class440) var14;
                int var16 = (int) ((float) (var15.field6710 >> 12) * var8 + (float) (var15.field6711 >> 12) * var6 + (float) (var15.field6705 >> 12) * var7 + var9);
                this.field8930[var10++] = var16;
                if (var11 > var16) {
                    var11 = var16;
                }
                if (var12 < var16) {
                    var12 = var16;
                }
            }
            int var17 = var12 - var11;
            int var18;
            if ((var17 + 2) > 1600) {
                var18 = class622.method3610((byte) -128, var17) + 1 - this.field8926;
                var17 = (var17 >> var18) + 2;
            } else {
                var18 = 0;
                var17 += 2;
            }
            class253 var19 = var13.field4042;
            int var20 = 0;
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var13 != var19) {
                this.field8932 = 0;
                for (int var24 = 0; var24 < var17; var24++) {
                    this.field8933[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field8934[var25] = 0;
                }
                while (var13 != var19) {
                    class440 var26 = (class440) var19;
                    if (var23) {
                        var23 = false;
                        var21 = var26.field6701;
                        var22 = var26.field6703;
                    }
                    if (var20 > 0 && (var26.field6701 != var21 || var26.field6703 != var22)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field8930[var20++] - var11 >> var18;
                    if (var27 < 1600) {
                        if (this.field8933[var27] >= 64) {
                            label107: {
                                if (this.field8933[var27] == 64) {
                                    if (this.field8932 == 64) {
                                        break label107;
                                    }
                                    this.field8933[var27] += (this.field8932++) + 1;
                                }
                                this.field8935[this.field8933[var27] - 65][this.field8934[this.field8933[var27] - 64 - 1]++] = var26;
                            }
                        } else {
                            this.field8931[var27][this.field8933[var27]++] = var26;
                        }
                    }
                    var19 = var19.field4042;
                }
                if (var21 >= 0) {
                    arg1.method887(2, var21);
                } else {
                    arg1.method887(2, -1);
                }
                if (var22 && class87.field1065 != arg1.field1451) {
                    arg1.method342(class87.field1065);
                } else if (arg1.field1451 != 1.0F) {
                    arg1.method342(1.0F);
                }
                this.method3694(-1, var17, arg1);
            }
        } catch (Exception var28) {
        }
        this.method3697(arg1, (byte) 56);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ler;B)V", line = 824)
    private final void method3697(class92 arg0, byte arg1) {
        arg0.method877(true, arg1 - 88);
        field8916++;
        if (arg1 != 56) {
            this.field8928 = null;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class87.field1065 != arg0.field1451) {
            arg0.method342(class87.field1065);
        }
    }
}
