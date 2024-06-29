import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class553 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[F")
    private float[] field8132 = new float[16];

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lgt;")
    private class385 field8133 = new class385(786336);

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field8141 = class131.method739(1600, 4);

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
    private int[] field8145 = new int[8191];

    @OriginalMember(owner = "client!og", name = "q", descriptor = "[[Lsaa;")
    private class272[][] field8146 = new class272[64][768];

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    private int field8148 = 0;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "[[Lsaa;")
    private class272[][] field8147 = new class272[1600][64];

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
    private int[] field8150 = new int[1600];

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
    private int[] field8149 = new int[64];

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field8138 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lqo;")
    private class21 field8140;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lro;")
    private class2 field8142;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lro;")
    private class2 field8143;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Lro;")
    private class2 field8144;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmh;B)V")
    public final void method3234(class537 arg0, byte arg1) {
        if (arg1 != -95) {
            field8138 = -94;
        }
        this.field8140 = arg0.method3132(196584, 24, 1365, null, true);
        field8136++;
        this.field8143 = new class2(this.field8140, 5126, 2, 0);
        this.field8142 = new class2(this.field8140, 5126, 3, 8);
        this.field8144 = new class2(this.field8140, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILet;ILpa;Lqa;III)V")
    public static final void method3235(int arg0, int arg1, class509 arg2, int arg3, class309 arg4, class206 arg5, int arg6, int arg7, int arg8) {
        field8131++;
        class107 var9 = class450.field6233.method3245((byte) -119, arg0);
        if (var9 != null && var9.field1305 && var9.method621(false, class281.field3700)) {
            if (var9.field1309 != null) {
                int[] var10 = new int[var9.field1309.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class617.field8931 == 4) {
                        var13 = (int) class558.field8223 & 0x3FFF;
                    } else {
                        var13 = (int) class558.field8223 + class335.field4369 & 0x3FFF;
                    }
                    int var14 = class442.field6100[var13];
                    int var15 = class442.field6101[var13];
                    if (class617.field8931 != 4) {
                        var14 = var14 * 256 / (class194.field2354 + 256);
                        var15 = var15 * 256 / (class194.field2354 + 256);
                    }
                    var10[var11 * 2] = ((var9.field1309[var11 * 2] * 4 + arg1) * var15 + (var9.field1309[var11 * 2 + 1] * 4 + arg3) * var14 >> 15) + arg2.field7094 / 2 + arg8;
                    var10[var11 * 2 + 1] = arg2.field7059 / 2 + arg6 - ((var9.field1309[var11 * 2 + 1] * 4 + arg3) * var15 + -((var9.field1309[var11 * 2] * 4 + arg1) * var14) >> 15);
                }
                class186.method1018(arg5, var10, var9.field1324, arg2.field7177, arg2.field7091);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg5.method1178(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field1307, 1, arg4, arg8, arg6);
                }
                arg5.method1178(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field1307, 1, arg4, arg8, arg6);
            }
            class52 var16 = null;
            if (var9.field1317 != -1) {
                var16 = var9.method626(arg5, false, 1);
                if (var16 != null) {
                    class592.method3439(16383, arg4, arg2, arg8, arg6, arg3, arg1, var16);
                }
            }
            if (var9.field1335 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method290();
                }
                class90 var18 = class403.field5290;
                class216 var19 = class330.field4307;
                if (var9.field1340 == 1) {
                    var18 = class137.field1673;
                    var19 = class92.field1129;
                }
                if (var9.field1340 == 2) {
                    var18 = class459.field6320;
                    var19 = class410.field5340;
                }
                class523.method2974(var18, var19, arg8, var9.field1327, arg3, false, arg2, arg4, var9.field1335, var17, arg1, arg6);
            }
        }
        int var20 = 105 / ((25 - arg7) / 42);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmh;ZI)V")
    private final void method3236(class537 arg0, boolean arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field8132, 0);
        field8130++;
        float var4 = this.field8132[0];
        float var5 = this.field8132[4];
        if (arg1) {
            this.field8147 = null;
        }
        float var6 = this.field8132[8];
        float var7 = this.field8132[1];
        float var8 = this.field8132[5];
        float var9 = this.field8132[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8133.field4966 = 0;
        float var18 = var9 - var6;
        if (arg0.field7754) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field8150[var44] <= 64 ? this.field8150[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class272 var59 = this.field8147[var44][var46];
                        int var60 = var59.field3541;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3525 >> 12);
                        float var66 = (float) (var59.field3535 >> 12);
                        float var67 = (float) (var59.field3530 >> 12);
                        int var68 = var59.field3540 >> 12;
                        this.field8133.method2221(-128, 0.0F);
                        this.field8133.method2221(-128, 0.0F);
                        this.field8133.method2221(-128, (float) (-var68) * var10 + var65);
                        this.field8133.method2221(-128, (float) (-var68) * var11 + var66);
                        this.field8133.method2221(-128, (float) (-var68) * var12 + var67);
                        this.field8133.method2093(var61, -126);
                        this.field8133.method2093(var62, -101);
                        this.field8133.method2093(var63, -106);
                        this.field8133.method2093(var64, -118);
                        this.field8133.method2221(-128, 1.0F);
                        this.field8133.method2221(-128, 0.0F);
                        this.field8133.method2221(-128, (float) var68 * var13 + var65);
                        this.field8133.method2221(-128, (float) var68 * var14 + var66);
                        this.field8133.method2221(-128, (float) var68 * var15 + var67);
                        this.field8133.method2093(var61, -126);
                        this.field8133.method2093(var62, -124);
                        this.field8133.method2093(var63, -121);
                        this.field8133.method2093(var64, -120);
                        this.field8133.method2221(-128, 1.0F);
                        this.field8133.method2221(-128, 1.0F);
                        this.field8133.method2221(-128, (float) var68 * var10 + var65);
                        this.field8133.method2221(-128, (float) var68 * var11 + var66);
                        this.field8133.method2221(-128, (float) var68 * var12 + var67);
                        this.field8133.method2093(var61, -107);
                        this.field8133.method2093(var62, -110);
                        this.field8133.method2093(var63, -123);
                        this.field8133.method2093(var64, -101);
                        this.field8133.method2221(-128, 0.0F);
                        this.field8133.method2221(-128, 1.0F);
                        this.field8133.method2221(-128, (float) var68 * var16 + var65);
                        this.field8133.method2221(-128, (float) var68 * var17 + var66);
                        this.field8133.method2221(-128, (float) var68 * var18 + var67);
                        this.field8133.method2093(var61, -109);
                        this.field8133.method2093(var62, -114);
                        this.field8133.method2093(var63, -110);
                        this.field8133.method2093(var64, -101);
                    }
                    if (this.field8150[var44] > 64) {
                        int var47 = this.field8150[var44] - 65;
                        for (int var48 = this.field8149[var47] - 1; var48 >= 0; var48--) {
                            class272 var49 = this.field8146[var47][var48];
                            int var50 = var49.field3541;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3525 >> 12);
                            float var56 = (float) (var49.field3535 >> 12);
                            float var57 = (float) (var49.field3530 >> 12);
                            int var58 = var49.field3540 >> 12;
                            this.field8133.method2221(-128, 0.0F);
                            this.field8133.method2221(-128, 0.0F);
                            this.field8133.method2221(-128, (float) (-var58) * var10 + var55);
                            this.field8133.method2221(-128, (float) (-var58) * var11 + var56);
                            this.field8133.method2221(-128, (float) (-var58) * var12 + var57);
                            this.field8133.method2093(var51, -104);
                            this.field8133.method2093(var52, -121);
                            this.field8133.method2093(var53, -118);
                            this.field8133.method2093(var54, -125);
                            this.field8133.method2221(-128, 1.0F);
                            this.field8133.method2221(-128, 0.0F);
                            this.field8133.method2221(-128, (float) var58 * var13 + var55);
                            this.field8133.method2221(-128, (float) var58 * var14 + var56);
                            this.field8133.method2221(-128, (float) var58 * var15 + var57);
                            this.field8133.method2093(var51, -121);
                            this.field8133.method2093(var52, -103);
                            this.field8133.method2093(var53, -124);
                            this.field8133.method2093(var54, -103);
                            this.field8133.method2221(-128, 1.0F);
                            this.field8133.method2221(-128, 1.0F);
                            this.field8133.method2221(-128, (float) var58 * var10 + var55);
                            this.field8133.method2221(-128, (float) var58 * var11 + var56);
                            this.field8133.method2221(-128, (float) var58 * var12 + var57);
                            this.field8133.method2093(var51, -127);
                            this.field8133.method2093(var52, -121);
                            this.field8133.method2093(var53, -111);
                            this.field8133.method2093(var54, -114);
                            this.field8133.method2221(-128, 0.0F);
                            this.field8133.method2221(-128, 1.0F);
                            this.field8133.method2221(-128, (float) var58 * var16 + var55);
                            this.field8133.method2221(-128, (float) var58 * var17 + var56);
                            this.field8133.method2221(-128, (float) var58 * var18 + var57);
                            this.field8133.method2093(var51, -105);
                            this.field8133.method2093(var52, -127);
                            this.field8133.method2093(var53, -126);
                            this.field8133.method2093(var54, -118);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field8150[var19] > 64 ? 64 : this.field8150[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class272 var34 = this.field8147[var19][var21];
                        int var35 = var34.field3541;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3525 >> 12);
                        float var41 = (float) (var34.field3535 >> 12);
                        float var42 = (float) (var34.field3530 >> 12);
                        int var43 = var34.field3540 >> 12;
                        this.field8133.method2220(-80, 0.0F);
                        this.field8133.method2220(-124, 0.0F);
                        this.field8133.method2220(-56, (float) (-var43) * var10 + var40);
                        this.field8133.method2220(-82, (float) (-var43) * var11 + var41);
                        this.field8133.method2220(-121, (float) (-var43) * var12 + var42);
                        this.field8133.method2093(var36, -108);
                        this.field8133.method2093(var37, -104);
                        this.field8133.method2093(var38, -111);
                        this.field8133.method2093(var39, -122);
                        this.field8133.method2220(-102, 1.0F);
                        this.field8133.method2220(-106, 0.0F);
                        this.field8133.method2220(-76, (float) var43 * var13 + var40);
                        this.field8133.method2220(-62, (float) var43 * var14 + var41);
                        this.field8133.method2220(-105, (float) var43 * var15 + var42);
                        this.field8133.method2093(var36, -121);
                        this.field8133.method2093(var37, -102);
                        this.field8133.method2093(var38, -121);
                        this.field8133.method2093(var39, -116);
                        this.field8133.method2220(-86, 1.0F);
                        this.field8133.method2220(-69, 1.0F);
                        this.field8133.method2220(-71, (float) var43 * var10 + var40);
                        this.field8133.method2220(-78, (float) var43 * var11 + var41);
                        this.field8133.method2220(-92, (float) var43 * var12 + var42);
                        this.field8133.method2093(var36, -116);
                        this.field8133.method2093(var37, -119);
                        this.field8133.method2093(var38, -105);
                        this.field8133.method2093(var39, -122);
                        this.field8133.method2220(-75, 0.0F);
                        this.field8133.method2220(-86, 1.0F);
                        this.field8133.method2220(-79, (float) var43 * var16 + var40);
                        this.field8133.method2220(-76, (float) var43 * var17 + var41);
                        this.field8133.method2220(-66, (float) var43 * var18 + var42);
                        this.field8133.method2093(var36, -107);
                        this.field8133.method2093(var37, -110);
                        this.field8133.method2093(var38, -125);
                        this.field8133.method2093(var39, -101);
                    }
                    if (this.field8150[var19] > 64) {
                        int var22 = this.field8150[var19] - 1 - 64;
                        for (int var23 = this.field8149[var22] - 1; var23 >= 0; var23--) {
                            class272 var24 = this.field8146[var22][var23];
                            int var25 = var24.field3541;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3525 >> 12);
                            float var31 = (float) (var24.field3535 >> 12);
                            float var32 = (float) (var24.field3530 >> 12);
                            int var33 = var24.field3540 >> 12;
                            this.field8133.method2220(-54, 0.0F);
                            this.field8133.method2220(-94, 0.0F);
                            this.field8133.method2220(-102, (float) (-var33) * var10 + var30);
                            this.field8133.method2220(-104, (float) (-var33) * var11 + var31);
                            this.field8133.method2220(-90, (float) (-var33) * var12 + var32);
                            this.field8133.method2093(var26, -111);
                            this.field8133.method2093(var27, -113);
                            this.field8133.method2093(var28, -118);
                            this.field8133.method2093(var29, -104);
                            this.field8133.method2220(-121, 1.0F);
                            this.field8133.method2220(-74, 0.0F);
                            this.field8133.method2220(-62, (float) var33 * var13 + var30);
                            this.field8133.method2220(-111, (float) var33 * var14 + var31);
                            this.field8133.method2220(-73, (float) var33 * var15 + var32);
                            this.field8133.method2093(var26, -126);
                            this.field8133.method2093(var27, -107);
                            this.field8133.method2093(var28, -108);
                            this.field8133.method2093(var29, -117);
                            this.field8133.method2220(-102, 1.0F);
                            this.field8133.method2220(-72, 1.0F);
                            this.field8133.method2220(-57, (float) var33 * var10 + var30);
                            this.field8133.method2220(-118, (float) var33 * var11 + var31);
                            this.field8133.method2220(-73, (float) var33 * var12 + var32);
                            this.field8133.method2093(var26, -110);
                            this.field8133.method2093(var27, -124);
                            this.field8133.method2093(var28, -114);
                            this.field8133.method2093(var29, -127);
                            this.field8133.method2220(-85, 0.0F);
                            this.field8133.method2220(-86, 1.0F);
                            this.field8133.method2220(-128, (float) var33 * var16 + var30);
                            this.field8133.method2220(-112, (float) var33 * var17 + var31);
                            this.field8133.method2220(-113, (float) var33 * var18 + var32);
                            this.field8133.method2093(var26, -109);
                            this.field8133.method2093(var27, -101);
                            this.field8133.method2093(var28, -120);
                            this.field8133.method2093(var29, -127);
                        }
                    }
                }
            }
        }
        if (this.field8133.field4966 != 0) {
            this.field8140.method136(this.field8133.field4966, this.field8133.field4929, false, 24);
            arg0.method3131(this.field8143, this.field8144, (byte) -117, this.field8142, null);
            arg0.method3069(false, 0, 7, this.field8133.field4966 / 24);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)[B")
    public static final byte[] method3237(int arg0, byte arg1) {
        field8135++;
        class519 var2 = (class519) class390.field5157.method696(3, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class242.method1375(var7, false, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class519(var3);
            class390.field5157.method691((byte) 91, var2, (long) arg0);
        }
        return arg1 == -56 ? var2.field7304 : null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmh;Lka;B)V")
    public final void method3238(class537 arg0, class400 arg1, byte arg2) {
        field8134++;
        if (arg0.field7762 == null) {
            return;
        }
        this.method3240(arg0, (byte) -121);
        float var4 = arg0.field7762.field1383;
        float var5 = arg0.field7762.field1381;
        float var6 = arg0.field7762.field1409;
        float var7 = arg0.field7762.field1396;
        try {
            if (arg1.field5259) {
                int var26 = arg1.field5260 - arg1.field5258;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class131.method739(var26, 4) + 1 - this.field8141;
                    var26 = (var26 >> var27) + 2;
                }
                class412 var28 = arg1.field5256.field5442;
                class412 var29 = var28.field5353;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field8148 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field8150[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field8149[var34] = 0;
                    }
                    while (var28 != var29) {
                        class272 var35 = (class272) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field3534;
                            var31 = var35.field3532;
                        } else if (var35.field3534 != var30 || var35.field3532 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field3530 >> 12) * var6 + (float) (var35.field3535 >> 12) * var5 + (float) (var35.field3525 >> 12) * var4 + var7) - arg1.field5258 >> var27;
                        if (var36 < 1600) {
                            if (this.field8150[var36] < 64) {
                                this.field8147[var36][this.field8150[var36]++] = var35;
                            } else {
                                label200: {
                                    if (this.field8150[var36] == 64) {
                                        if (this.field8148 == 64) {
                                            break label200;
                                        }
                                        this.field8150[var36] += this.field8148++ + 1;
                                    }
                                    this.field8146[this.field8150[var36] - 64 - 1][this.field8149[this.field8150[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field5353;
                    }
                    if (var30 < 0) {
                        arg0.method3071(86, -1);
                    } else {
                        arg0.method3071(117, var30);
                    }
                    if (var31 && class437.field6022 != arg0.field7828) {
                        arg0.method1165(class437.field6022);
                    } else if (arg0.field7828 != 1.0F) {
                        arg0.method1165(1.0F);
                    }
                    this.method3236(arg0, false, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class412 var11 = arg1.field5256.field5442;
                for (class412 var12 = var11.field5353; var12 != var11; var12 = var12.field5353) {
                    class272 var13 = (class272) var12;
                    int var14 = (int) ((float) (var13.field3530 >> 12) * var6 + (float) (var13.field3535 >> 12) * var5 + (float) (var13.field3525 >> 12) * var4 + var7);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    this.field8145[var8++] = var14;
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var15 += 2;
                    var16 = 0;
                } else {
                    var16 = class131.method739(var15, 4) + 1 - this.field8141;
                    var15 = (var15 >> var16) + 2;
                }
                class412 var17 = var11.field5353;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field8148 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field8150[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field8149[var23] = 0;
                    }
                    while (var11 != var17) {
                        class272 var24 = (class272) var17;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field3532;
                            var19 = var24.field3534;
                        }
                        if (var18 > 0 && (var24.field3534 != var19 || var20 != var24.field3532)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field8145[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field8150[var25] < 64) {
                                this.field8147[var25][this.field8150[var25]++] = var24;
                            } else {
                                label151: {
                                    if (this.field8150[var25] == 64) {
                                        if (this.field8148 == 64) {
                                            break label151;
                                        }
                                        this.field8150[var25] += this.field8148++ + 1;
                                    }
                                    this.field8146[this.field8150[var25] - 64 - 1][this.field8149[this.field8150[var25] - 64 - 1]++] = var24;
                                }
                            }
                        }
                        var17 = var17.field5353;
                    }
                    if (var19 < 0) {
                        arg0.method3071(101, -1);
                    } else {
                        arg0.method3071(90, var19);
                    }
                    if (var20 && class437.field6022 != arg0.field7828) {
                        arg0.method1165(class437.field6022);
                    } else if (arg0.field7828 != 1.0F) {
                        arg0.method1165(1.0F);
                    }
                    this.method3236(arg0, false, var15);
                }
            }
            int var37 = 11 % ((-arg2 - 29) / 34);
        } catch (Exception var38) {
        }
        this.method3239((byte) 96, arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLmh;)V")
    private final void method3239(byte arg0, class537 arg1) {
        field8137++;
        arg1.method3101(true, 8);
        if (arg0 != 96) {
            return;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class437.field6022 != arg1.field7828) {
            arg1.method1165(class437.field6022);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Lmh;B)V")
    private final void method3240(class537 arg0, byte arg1) {
        field8139++;
        class437.field6022 = arg0.field7828;
        arg0.method3087(-98);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3101(false, 8);
        int var3 = 36 / ((7 - arg1) / 61);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
