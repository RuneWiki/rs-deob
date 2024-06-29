import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class140 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[F")
    private float[] field2212 = new float[16];

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Luf;")
    private class451 field2223 = new class451(786336);

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    private int field2227 = class384.method2276(112, 1600);

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    private int field2230 = 0;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "[I")
    private int[] field2232 = new int[8191];

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "[[Ldi;")
    private class128[][] field2231 = new class128[64][768];

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "[[Ldi;")
    private class128[][] field2234 = new class128[1600][64];

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "[I")
    private int[] field2235 = new int[64];

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "[I")
    private int[] field2233 = new int[1600];

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[Lcv;")
    public static class569[] field2217 = new class569[37];

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "Lcs;")
    private class345 field2228;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lim;")
    private class572 field2225;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lim;")
    private class572 field2226;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Lim;")
    private class572 field2229;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lrda;IB)V")
    private final void method1068(class663 arg0, int arg1, byte arg2) {
        field2218++;
        OpenGL.glGetFloatv(2982, this.field2212, 0);
        if (arg2 > -39) {
            method1076(27);
        }
        float var4 = this.field2212[0];
        float var5 = this.field2212[4];
        float var6 = this.field2212[8];
        float var7 = this.field2212[1];
        float var8 = this.field2212[5];
        float var9 = this.field2212[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field2223.field9419 = 0;
        float var18 = var9 - var6;
        if (arg0.field9021) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field2233[var19] <= 64 ? this.field2233[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class128 var34 = this.field2234[var19][var21];
                        int var35 = var34.field2113;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2110 >> 12);
                        float var41 = (float) (var34.field2107 >> 12);
                        float var42 = (float) (var34.field2111 >> 12);
                        int var43 = var34.field2112 >> 12;
                        this.field2223.method2574(115, 0.0F);
                        this.field2223.method2574(92, 0.0F);
                        this.field2223.method2574(32, (float) (-var43) * var10 + var40);
                        this.field2223.method2574(57, (float) (-var43) * var11 + var41);
                        this.field2223.method2574(48, (float) (-var43) * var12 + var42);
                        this.field2223.method3823(-61, var36);
                        this.field2223.method3823(-128, var37);
                        this.field2223.method3823(-68, var38);
                        this.field2223.method3823(-32, var39);
                        this.field2223.method2574(25, 1.0F);
                        this.field2223.method2574(91, 0.0F);
                        this.field2223.method2574(89, (float) var43 * var13 + var40);
                        this.field2223.method2574(58, (float) var43 * var14 + var41);
                        this.field2223.method2574(116, (float) var43 * var15 + var42);
                        this.field2223.method3823(-56, var36);
                        this.field2223.method3823(-58, var37);
                        this.field2223.method3823(-97, var38);
                        this.field2223.method3823(-111, var39);
                        this.field2223.method2574(124, 1.0F);
                        this.field2223.method2574(84, 1.0F);
                        this.field2223.method2574(75, (float) var43 * var10 + var40);
                        this.field2223.method2574(37, (float) var43 * var11 + var41);
                        this.field2223.method2574(72, (float) var43 * var12 + var42);
                        this.field2223.method3823(-106, var36);
                        this.field2223.method3823(-49, var37);
                        this.field2223.method3823(-80, var38);
                        this.field2223.method3823(-100, var39);
                        this.field2223.method2574(98, 0.0F);
                        this.field2223.method2574(107, 1.0F);
                        this.field2223.method2574(122, (float) var43 * var16 + var40);
                        this.field2223.method2574(115, (float) var43 * var17 + var41);
                        this.field2223.method2574(30, (float) var43 * var18 + var42);
                        this.field2223.method3823(-35, var36);
                        this.field2223.method3823(-51, var37);
                        this.field2223.method3823(-97, var38);
                        this.field2223.method3823(-51, var39);
                    }
                    if (this.field2233[var19] > 64) {
                        int var22 = this.field2233[var19] - 1 - 64;
                        for (int var23 = this.field2235[var22] - 1; var23 >= 0; var23--) {
                            class128 var24 = this.field2231[var22][var23];
                            int var25 = var24.field2113;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2110 >> 12);
                            float var31 = (float) (var24.field2107 >> 12);
                            float var32 = (float) (var24.field2111 >> 12);
                            int var33 = var24.field2112 >> 12;
                            this.field2223.method2574(126, 0.0F);
                            this.field2223.method2574(77, 0.0F);
                            this.field2223.method2574(61, (float) (-var33) * var10 + var30);
                            this.field2223.method2574(124, (float) (-var33) * var11 + var31);
                            this.field2223.method2574(54, (float) (-var33) * var12 + var32);
                            this.field2223.method3823(-107, var26);
                            this.field2223.method3823(-25, var27);
                            this.field2223.method3823(-101, var28);
                            this.field2223.method3823(-39, var29);
                            this.field2223.method2574(101, 1.0F);
                            this.field2223.method2574(32, 0.0F);
                            this.field2223.method2574(33, (float) var33 * var13 + var30);
                            this.field2223.method2574(47, (float) var33 * var14 + var31);
                            this.field2223.method2574(52, (float) var33 * var15 + var32);
                            this.field2223.method3823(-95, var26);
                            this.field2223.method3823(-41, var27);
                            this.field2223.method3823(-122, var28);
                            this.field2223.method3823(-50, var29);
                            this.field2223.method2574(72, 1.0F);
                            this.field2223.method2574(52, 1.0F);
                            this.field2223.method2574(56, (float) var33 * var10 + var30);
                            this.field2223.method2574(25, (float) var33 * var11 + var31);
                            this.field2223.method2574(88, (float) var33 * var12 + var32);
                            this.field2223.method3823(-117, var26);
                            this.field2223.method3823(-95, var27);
                            this.field2223.method3823(-47, var28);
                            this.field2223.method3823(-121, var29);
                            this.field2223.method2574(91, 0.0F);
                            this.field2223.method2574(97, 1.0F);
                            this.field2223.method2574(127, (float) var33 * var16 + var30);
                            this.field2223.method2574(41, (float) var33 * var17 + var31);
                            this.field2223.method2574(127, (float) var33 * var18 + var32);
                            this.field2223.method3823(-58, var26);
                            this.field2223.method3823(-40, var27);
                            this.field2223.method3823(-28, var28);
                            this.field2223.method3823(-84, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field2233[var44] > 64 ? 64 : this.field2233[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class128 var59 = this.field2234[var44][var46];
                        int var60 = var59.field2113;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2110 >> 12);
                        float var66 = (float) (var59.field2107 >> 12);
                        float var67 = (float) (var59.field2111 >> 12);
                        int var68 = var59.field2112 >> 12;
                        this.field2223.method2573(4440, 0.0F);
                        this.field2223.method2573(4440, 0.0F);
                        this.field2223.method2573(4440, (float) (-var68) * var10 + var65);
                        this.field2223.method2573(4440, (float) (-var68) * var11 + var66);
                        this.field2223.method2573(4440, (float) (-var68) * var12 + var67);
                        this.field2223.method3823(-58, var61);
                        this.field2223.method3823(-71, var62);
                        this.field2223.method3823(-20, var63);
                        this.field2223.method3823(-40, var64);
                        this.field2223.method2573(4440, 1.0F);
                        this.field2223.method2573(4440, 0.0F);
                        this.field2223.method2573(4440, (float) var68 * var13 + var65);
                        this.field2223.method2573(4440, (float) var68 * var14 + var66);
                        this.field2223.method2573(4440, (float) var68 * var15 + var67);
                        this.field2223.method3823(-21, var61);
                        this.field2223.method3823(-125, var62);
                        this.field2223.method3823(-97, var63);
                        this.field2223.method3823(-41, var64);
                        this.field2223.method2573(4440, 1.0F);
                        this.field2223.method2573(4440, 1.0F);
                        this.field2223.method2573(4440, (float) var68 * var10 + var65);
                        this.field2223.method2573(4440, (float) var68 * var11 + var66);
                        this.field2223.method2573(4440, (float) var68 * var12 + var67);
                        this.field2223.method3823(-127, var61);
                        this.field2223.method3823(-119, var62);
                        this.field2223.method3823(-67, var63);
                        this.field2223.method3823(-81, var64);
                        this.field2223.method2573(4440, 0.0F);
                        this.field2223.method2573(4440, 1.0F);
                        this.field2223.method2573(4440, (float) var68 * var16 + var65);
                        this.field2223.method2573(4440, (float) var68 * var17 + var66);
                        this.field2223.method2573(4440, (float) var68 * var18 + var67);
                        this.field2223.method3823(-46, var61);
                        this.field2223.method3823(-117, var62);
                        this.field2223.method3823(-28, var63);
                        this.field2223.method3823(-68, var64);
                    }
                    if (this.field2233[var44] > 64) {
                        int var47 = this.field2233[var44] - 65;
                        for (int var48 = this.field2235[var47] - 1; var48 >= 0; var48--) {
                            class128 var49 = this.field2231[var47][var48];
                            int var50 = var49.field2113;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2110 >> 12);
                            float var56 = (float) (var49.field2107 >> 12);
                            float var57 = (float) (var49.field2111 >> 12);
                            int var58 = var49.field2112 >> 12;
                            this.field2223.method2573(4440, 0.0F);
                            this.field2223.method2573(4440, 0.0F);
                            this.field2223.method2573(4440, (float) (-var58) * var10 + var55);
                            this.field2223.method2573(4440, (float) (-var58) * var11 + var56);
                            this.field2223.method2573(4440, (float) (-var58) * var12 + var57);
                            this.field2223.method3823(-64, var51);
                            this.field2223.method3823(-107, var52);
                            this.field2223.method3823(-50, var53);
                            this.field2223.method3823(-81, var54);
                            this.field2223.method2573(4440, 1.0F);
                            this.field2223.method2573(4440, 0.0F);
                            this.field2223.method2573(4440, (float) var58 * var13 + var55);
                            this.field2223.method2573(4440, (float) var58 * var14 + var56);
                            this.field2223.method2573(4440, (float) var58 * var15 + var57);
                            this.field2223.method3823(-41, var51);
                            this.field2223.method3823(-24, var52);
                            this.field2223.method3823(-52, var53);
                            this.field2223.method3823(-79, var54);
                            this.field2223.method2573(4440, 1.0F);
                            this.field2223.method2573(4440, 1.0F);
                            this.field2223.method2573(4440, (float) var58 * var10 + var55);
                            this.field2223.method2573(4440, (float) var58 * var11 + var56);
                            this.field2223.method2573(4440, (float) var58 * var12 + var57);
                            this.field2223.method3823(-42, var51);
                            this.field2223.method3823(-85, var52);
                            this.field2223.method3823(-119, var53);
                            this.field2223.method3823(-79, var54);
                            this.field2223.method2573(4440, 0.0F);
                            this.field2223.method2573(4440, 1.0F);
                            this.field2223.method2573(4440, (float) var58 * var16 + var55);
                            this.field2223.method2573(4440, (float) var58 * var17 + var56);
                            this.field2223.method2573(4440, (float) var58 * var18 + var57);
                            this.field2223.method3823(-110, var51);
                            this.field2223.method3823(-88, var52);
                            this.field2223.method3823(-112, var53);
                            this.field2223.method3823(-93, var54);
                        }
                    }
                }
            }
        }
        if (this.field2223.field9419 != 0) {
            this.field2228.method2063((byte) 77, this.field2223.field9419, 24, this.field2223.field9399);
            arg0.method3593(32886, this.field2226, this.field2225, null, this.field2229);
            arg0.method3626(7, 24873, this.field2223.field9419 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)V")
    public static final void method1069(int arg0, int arg1, int arg2, int arg3) {
        class701 var4 = class660.field8718[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class694 var5 = var4.field9737;
        class694 var6 = var4.field9735;
        if (var5 != null) {
            var5.field9660 = (short) (var5.field9660 * arg3 / (0x10 << field2224 - 7));
            var5.field9651 = (short) (var5.field9651 * arg3 / (0x10 << field2224 - 7));
        }
        if (var6 != null) {
            var6.field9660 = (short) (var6.field9660 * arg3 / (0x10 << field2224 - 7));
            var6.field9651 = (short) (var6.field9651 * arg3 / (0x10 << field2224 - 7));
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lrda;I)V")
    private final void method1070(class663 arg0, int arg1) {
        arg0.method3620(arg1 + 28985, true);
        field2219++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (arg1 != -28936) {
            this.field2212 = null;
        }
        if (class580.field7604 != arg0.field9027) {
            arg0.method486(class580.field7604);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILdh;ILha;ILpda;IILon;)V")
    public static final void method1071(int arg0, class325 arg1, int arg2, class59 arg3, int arg4, class630 arg5, int arg6, int arg7, class340 arg8) {
        field2220++;
        int var9 = arg4 - (arg0 / 2) - 5;
        int var10 = arg6 + 2;
        if (arg1.field4617 != 0) {
            arg3.method489(arg0 + 10, 19, arg6 + (arg7 * arg8.method2041()) + 1 - var10, var10, var9, arg1.field4617);
        }
        if (arg1.field4633 != 0) {
            arg3.method434(arg6 - (var10 - (arg7 * arg8.method2041()) - 1), arg1.field4633, arg0 + 10, 110, var10, var9);
        }
        int var11 = arg1.field4650;
        if (arg5.field8386 && arg1.field4623 != -1) {
            var11 = arg1.field4623;
        }
        if (arg2 != 9997) {
            method1075(false);
        }
        for (int var12 = 0; var12 < arg7; var12++) {
            String var13 = class557.field7343[var12];
            if ((arg7 - 1) > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg8.method2044(arg3, var13, arg4, arg6, var11, true);
            arg6 += arg8.method2041();
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Lrda;I)V")
    private final void method1072(class663 arg0, int arg1) {
        class580.field7604 = arg0.field9027;
        field2222++;
        arg0.method3613(-1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(arg1);
        arg0.method3620(40, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2221++;
        if (arg7 != -47) {
            method1073(-57, 101, -21, -124, 89, 42, 38, (byte) -120);
        }
        if (class261.field3632 <= arg2 && class209.field3090 >= arg0 && class380.field5289 <= arg5 && arg3 <= class431.field5944) {
            class532.method2964(arg2, arg6, arg1, arg3, arg0, -123, arg4, arg5);
        } else {
            class94.method703(arg6, arg4, arg0, arg3, arg5, arg1, arg7 ^ 0x7145, arg2);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(Lrda;I)V")
    public final void method1074(class663 arg0, int arg1) {
        field2214++;
        this.field2228 = arg0.method3619((byte) -41, 196584, true, 24, null);
        this.field2226 = new class572(this.field2228, 5126, 2, 0);
        this.field2225 = new class572(this.field2228, 5126, 3, 8);
        if (arg1 <= 88) {
            this.method1074(null, -74);
        }
        this.field2229 = new class572(this.field2228, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static final void method1075(boolean arg0) {
        field2215++;
        class127 var1 = class760.method4231(0, -874792672, 15);
        if (!arg0) {
            var1.method1002(-89);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2217 = null;
        if (arg0 != 1751) {
            method1071(-83, null, -2, null, 121, null, 32, -120, null);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Luj;ZLrda;I)V")
    public final void method1077(class388 arg0, boolean arg1, class663 arg2, int arg3) {
        field2216++;
        if (arg2.field8981 == null) {
            return;
        }
        if (arg3 < 0) {
            this.method1072(arg2, 16385);
        } else {
            this.method1078(arg2, (byte) 126, arg3);
        }
        float var5 = arg2.field8981.field4083;
        float var6 = arg2.field8981.field4099;
        float var7 = arg2.field8981.field4101;
        float var8 = arg2.field8981.field4105;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class324 var12 = arg0.field5411.field232;
            for (class324 var13 = var12.field4601; var13 != var12; var13 = var13.field4601) {
                class128 var14 = (class128) var13;
                int var15 = (int) ((float) (var14.field2111 >> 12) * var7 + (float) (var14.field2110 >> 12) * var5 + (float) (var14.field2107 >> 12) * var6 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field2232[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class384.method2276(93, var16) + 1 - this.field2227;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class324 var19 = var12.field4601;
            int var20 = -2;
            boolean var21 = arg1;
            boolean var22 = true;
            while (var12 != var19) {
                this.field2230 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2233[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2235[var24] = 0;
                }
                while (var12 != var19) {
                    class128 var25 = (class128) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field2114;
                        var20 = var25.field2115;
                    }
                    if (var18 > 0 && (var25.field2115 != var20 || var25.field2114 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2232[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2233[var26] < 64) {
                            this.field2234[var26][this.field2233[var26]++] = var25;
                        } else {
                            label102: {
                                if (this.field2233[var26] == 64) {
                                    if (this.field2230 == 64) {
                                        break label102;
                                    }
                                    this.field2233[var26] += this.field2230++ + 1;
                                }
                                class128[] var10000 = this.field2231[this.field2233[var26] - 65];
                                int var10002 = this.field2233[var26] - 65;
                                int var10004 = this.field2235[this.field2233[var26] - 65];
                                this.field2235[var10002] = this.field2235[this.field2233[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field4601;
                }
                if (var20 < 0) {
                    arg2.method3632(-1, (byte) -108);
                } else {
                    arg2.method3632(var20, (byte) -63);
                }
                if (var21 && class580.field7604 != arg2.field9027) {
                    arg2.method486(class580.field7604);
                } else if (arg2.field9027 != 1.0F) {
                    arg2.method486(1.0F);
                }
                this.method1068(arg2, var16, (byte) -96);
            }
        } catch (Exception var27) {
        }
        this.method1070(arg2, -28936);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lrda;BI)V")
    private final void method1078(class663 arg0, byte arg1, int arg2) {
        field2213++;
        class580.field7604 = arg0.field9027;
        arg0.method3617((float) arg2, false);
        arg0.method3604(-125);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3620(arg1 - 38, false);
        if (arg1 != 126) {
            method1069(-128, 115, -37, -128);
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
