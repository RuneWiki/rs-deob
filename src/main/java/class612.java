import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class612 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[F")
    private float[] field8276 = new float[16];

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Luba;")
    private class453 field8272 = new class453(786336);

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    private int field8283 = class436.method2617(1600, 4);

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    private int field8285 = 0;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "[I")
    private int[] field8288 = new int[8191];

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
    private int[] field8287 = new int[64];

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "[I")
    private int[] field8286 = new int[1600];

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[[Lqca;")
    private class126[][] field8289 = new class126[64][768];

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[[Lqca;")
    private class126[][] field8284 = new class126[1600][64];

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[I")
    public static int[] field8274 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lhja;")
    public static class426 field8269 = new class426();

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "S")
    public static short field8278 = 1;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lut;")
    private class135 field8279;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Lut;")
    private class135 field8280;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lut;")
    private class135 field8282;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lot;")
    private class615 field8281;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILuq;IJZIIB)V")
    public static final void method3401(int arg0, class172 arg1, int arg2, long arg3, boolean arg4, int arg5, int arg6, byte arg7) {
        class122.field1694 = arg2;
        class445.field6406 = arg3;
        class348.field5049 = null;
        class786.field10798 = arg6;
        class709.field9701 = 10000;
        class458.field6542 = arg0;
        class289.field4115 = 1;
        field8275++;
        class765.field10514 = arg1;
        class100.field1451 = arg4;
        class460.field6563 = arg5;
        if (arg7 > -27) {
            method3407(-76, 22, -94, null);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Llf;I)V")
    private final void method3402(class250 arg0, int arg1) {
        field8268++;
        class151.field2055 = arg0.field3583;
        arg0.method1604(false);
        OpenGL.glDisable(16384);
        int var3 = -69 % ((58 - arg1) / 51);
        OpenGL.glDisable(16385);
        arg0.method1572(false, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILlf;Ltv;I)V")
    public final void method3403(int arg0, class250 arg1, class586 arg2, int arg3) {
        field8273++;
        if (arg1.field3545 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method3404(arg0 + 24249, arg3, arg1);
        } else {
            this.method3402(arg1, 112);
        }
        float var5 = arg1.field3545.field7953;
        float var6 = arg1.field3545.field7963;
        if (arg0 != -24125) {
            this.field8279 = null;
        }
        float var7 = arg1.field3545.field7955;
        float var8 = arg1.field3545.field7956;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class455 var12 = arg2.field7972.field4051;
            for (class455 var13 = var12.field6516; var13 != var12; var13 = var13.field6516) {
                class126 var14 = (class126) var13;
                int var15 = (int) ((float) (var14.field1730 >> 12) * var7 + (float) (var14.field1729 >> 12) * var6 + (float) (var14.field1725 >> 12) * var5 + var8);
                this.field8288[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = (class436.method2617(var16, 4) - this.field8283) + 1;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class455 var19 = var12.field6516;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field8285 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field8286[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field8287[var24] = 0;
                }
                while (var12 != var19) {
                    class126 var25 = (class126) var19;
                    if (var22) {
                        var21 = var25.field1728;
                        var20 = var25.field1733;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field1733 != var20 || var25.field1728 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field8288[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field8286[var26] >= 64) {
                            label98: {
                                if (this.field8286[var26] == 64) {
                                    if (this.field8285 == 64) {
                                        break label98;
                                    }
                                    this.field8286[var26] += this.field8285++ + 1;
                                }
                                this.field8289[this.field8286[var26] - 64 - 1][this.field8287[this.field8286[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field8284[var26][this.field8286[var26]++] = var25;
                        }
                    }
                    var19 = var19.field6516;
                }
                if (var20 < 0) {
                    arg1.method1580((byte) -52, -1);
                } else {
                    arg1.method1580((byte) -52, var20);
                }
                if (var21 && class151.field2055 != arg1.field3583) {
                    arg1.method468(class151.field2055);
                } else if (arg1.field3583 != 1.0F) {
                    arg1.method468(1.0F);
                }
                this.method3409((byte) 21, arg1, var16);
            }
        } catch (Exception var27) {
        }
        this.method3408(arg1, arg0 + 1810122505);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILlf;)V")
    private final void method3404(int arg0, int arg1, class250 arg2) {
        field8266++;
        class151.field2055 = arg2.field3583;
        arg2.method1622((float) arg1, (byte) 51);
        arg2.method1612(16);
        if (arg0 <= 111) {
            this.method3402(null, 123);
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method1572(false, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method3405(byte arg0) {
        field8269 = null;
        if (arg0 < 110) {
            method3401(124, null, -66, -77L, true, -45, -110, (byte) 105);
        }
        field8274 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Llf;I)V")
    public final void method3406(class250 arg0, int arg1) {
        this.field8281 = arg0.method1578((byte) 61, 196584, true, null, 24);
        field8267++;
        this.field8282 = new class135(this.field8281, 5126, 2, 0);
        this.field8280 = new class135(this.field8281, 5126, 3, 8);
        int var3 = -118 / ((arg1 + 46) / 33);
        this.field8279 = new class135(this.field8281, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3407(int arg0, int arg1, int arg2, Class arg3) {
        class194 var4 = class443.field6387[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class511 var5 = var4.field2525; var5 != null; var5 = var5.field7127) {
            class539 var6 = var5.field7126;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7466 == arg1 && var6.field7467 == arg2) {
                class115.method841(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Llf;I)V")
    private final void method3408(class250 arg0, int arg1) {
        field8271++;
        if (arg1 != 1810098380) {
            this.method3406(null, -9);
        }
        arg0.method1572(false, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class151.field2055 != arg0.field3583) {
            arg0.method468(class151.field2055);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLlf;I)V")
    private final void method3409(byte arg0, class250 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field8276, 0);
        field8270++;
        float var4 = this.field8276[0];
        float var5 = this.field8276[4];
        float var6 = this.field8276[8];
        float var7 = this.field8276[1];
        float var8 = this.field8276[5];
        float var9 = this.field8276[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8272.field3725 = 0;
        float var18 = var9 - var6;
        if (arg1.field3561) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field8286[var19] <= 64 ? this.field8286[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class126 var34 = this.field8284[var19][var21];
                        int var35 = var34.field1727;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1725 >> 12);
                        float var41 = (float) (var34.field1729 >> 12);
                        float var42 = (float) (var34.field1730 >> 12);
                        int var43 = var34.field1726 >> 12;
                        this.field8272.method2692(-98, 0.0F);
                        this.field8272.method2692(-84, 0.0F);
                        this.field8272.method2692(-127, (float) (-var43) * var10 + var40);
                        this.field8272.method2692(-61, (float) (-var43) * var11 + var41);
                        this.field8272.method2692(-101, (float) (-var43) * var12 + var42);
                        this.field8272.method1725(var36, arg0 + 83);
                        this.field8272.method1725(var37, 36);
                        this.field8272.method1725(var38, arg0 + 74);
                        this.field8272.method1725(var39, 20);
                        this.field8272.method2692(-94, 1.0F);
                        this.field8272.method2692(-66, 0.0F);
                        this.field8272.method2692(arg0 ^ 0xFFFFFFAA, (float) var43 * var13 + var40);
                        this.field8272.method2692(-65, (float) var43 * var14 + var41);
                        this.field8272.method2692(-79, (float) var43 * var15 + var42);
                        this.field8272.method1725(var36, arg0 ^ 0x5B);
                        this.field8272.method1725(var37, 29);
                        this.field8272.method1725(var38, arg0 ^ 0x7F);
                        this.field8272.method1725(var39, 124);
                        this.field8272.method2692(-69, 1.0F);
                        this.field8272.method2692(-104, 1.0F);
                        this.field8272.method2692(-92, (float) var43 * var10 + var40);
                        this.field8272.method2692(-108, (float) var43 * var11 + var41);
                        this.field8272.method2692(-124, (float) var43 * var12 + var42);
                        this.field8272.method1725(var36, arg0 + 40);
                        this.field8272.method1725(var37, 74);
                        this.field8272.method1725(var38, 47);
                        this.field8272.method1725(var39, 45);
                        this.field8272.method2692(-117, 0.0F);
                        this.field8272.method2692(-70, 1.0F);
                        this.field8272.method2692(-116, (float) var43 * var16 + var40);
                        this.field8272.method2692(arg0 - 90, (float) var43 * var17 + var41);
                        this.field8272.method2692(-96, (float) var43 * var18 + var42);
                        this.field8272.method1725(var36, 87);
                        this.field8272.method1725(var37, 45);
                        this.field8272.method1725(var38, 89);
                        this.field8272.method1725(var39, arg0 + 57);
                    }
                    if (this.field8286[var19] > 64) {
                        int var22 = this.field8286[var19] - 64 - 1;
                        for (int var23 = this.field8287[var22] - 1; var23 >= 0; var23--) {
                            class126 var24 = this.field8289[var22][var23];
                            int var25 = var24.field1727;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1725 >> 12);
                            float var31 = (float) (var24.field1729 >> 12);
                            float var32 = (float) (var24.field1730 >> 12);
                            int var33 = var24.field1726 >> 12;
                            this.field8272.method2692(arg0 ^ 0xFFFFFF86, 0.0F);
                            this.field8272.method2692(arg0 - 109, 0.0F);
                            this.field8272.method2692(-112, (float) (-var33) * var10 + var30);
                            this.field8272.method2692(-88, (float) (-var33) * var11 + var31);
                            this.field8272.method2692(-103, (float) (-var33) * var12 + var32);
                            this.field8272.method1725(var26, arg0 + 100);
                            this.field8272.method1725(var27, 55);
                            this.field8272.method1725(var28, 77);
                            this.field8272.method1725(var29, 30);
                            this.field8272.method2692(-75, 1.0F);
                            this.field8272.method2692(-105, 0.0F);
                            this.field8272.method2692(-123, (float) var33 * var13 + var30);
                            this.field8272.method2692(-117, (float) var33 * var14 + var31);
                            this.field8272.method2692(-83, (float) var33 * var15 + var32);
                            this.field8272.method1725(var26, 108);
                            this.field8272.method1725(var27, arg0 + 47);
                            this.field8272.method1725(var28, 92);
                            this.field8272.method1725(var29, 97);
                            this.field8272.method2692(-115, 1.0F);
                            this.field8272.method2692(-61, 1.0F);
                            this.field8272.method2692(arg0 ^ 0xFFFFFFAE, (float) var33 * var10 + var30);
                            this.field8272.method2692(-99, (float) var33 * var11 + var31);
                            this.field8272.method2692(arg0 - 142, (float) var33 * var12 + var32);
                            this.field8272.method1725(var26, 49);
                            this.field8272.method1725(var27, 32);
                            this.field8272.method1725(var28, arg0 ^ 0x25);
                            this.field8272.method1725(var29, 98);
                            this.field8272.method2692(-74, 0.0F);
                            this.field8272.method2692(-100, 1.0F);
                            this.field8272.method2692(-115, (float) var33 * var16 + var30);
                            this.field8272.method2692(-89, (float) var33 * var17 + var31);
                            this.field8272.method2692(arg0 ^ 0xFFFFFF97, (float) var33 * var18 + var32);
                            this.field8272.method1725(var26, arg0 + 71);
                            this.field8272.method1725(var27, 49);
                            this.field8272.method1725(var28, 64);
                            this.field8272.method1725(var29, 116);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field8286[var44] > 64 ? 64 : this.field8286[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class126 var59 = this.field8284[var44][var46];
                        int var60 = var59.field1727;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field1725 >> 12);
                        float var66 = (float) (var59.field1729 >> 12);
                        float var67 = (float) (var59.field1730 >> 12);
                        int var68 = var59.field1726 >> 12;
                        this.field8272.method2693(0.0F, -1001058736);
                        this.field8272.method2693(0.0F, -1001058736);
                        this.field8272.method2693((float) (-var68) * var10 + var65, -1001058736);
                        this.field8272.method2693((float) (-var68) * var11 + var66, -1001058736);
                        this.field8272.method2693((float) (-var68) * var12 + var67, -1001058736);
                        this.field8272.method1725(var61, 60);
                        this.field8272.method1725(var62, 126);
                        this.field8272.method1725(var63, 61);
                        this.field8272.method1725(var64, 24);
                        this.field8272.method2693(1.0F, -1001058736);
                        this.field8272.method2693(0.0F, -1001058736);
                        this.field8272.method2693((float) var68 * var13 + var65, -1001058736);
                        this.field8272.method2693((float) var68 * var14 + var66, -1001058736);
                        this.field8272.method2693((float) var68 * var15 + var67, -1001058736);
                        this.field8272.method1725(var61, 53);
                        this.field8272.method1725(var62, arg0 + 30);
                        this.field8272.method1725(var63, 72);
                        this.field8272.method1725(var64, 91);
                        this.field8272.method2693(1.0F, arg0 - 1001058757);
                        this.field8272.method2693(1.0F, -1001058736);
                        this.field8272.method2693((float) var68 * var10 + var65, arg0 ^ 0xC4550E45);
                        this.field8272.method2693((float) var68 * var11 + var66, arg0 ^ 0xC4550E45);
                        this.field8272.method2693((float) var68 * var12 + var67, -1001058736);
                        this.field8272.method1725(var61, 70);
                        this.field8272.method1725(var62, 89);
                        this.field8272.method1725(var63, 69);
                        this.field8272.method1725(var64, arg0 ^ 0x62);
                        this.field8272.method2693(0.0F, -1001058736);
                        this.field8272.method2693(1.0F, -1001058736);
                        this.field8272.method2693((float) var68 * var16 + var65, -1001058736);
                        this.field8272.method2693((float) var68 * var17 + var66, -1001058736);
                        this.field8272.method2693((float) var68 * var18 + var67, -1001058736);
                        this.field8272.method1725(var61, 25);
                        this.field8272.method1725(var62, 70);
                        this.field8272.method1725(var63, 73);
                        this.field8272.method1725(var64, 81);
                    }
                    if (this.field8286[var44] > 64) {
                        int var47 = this.field8286[var44] - 64 - 1;
                        for (int var48 = this.field8287[var47] - 1; var48 >= 0; var48--) {
                            class126 var49 = this.field8289[var47][var48];
                            int var50 = var49.field1727;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field1725 >> 12);
                            float var56 = (float) (var49.field1729 >> 12);
                            float var57 = (float) (var49.field1730 >> 12);
                            int var58 = var49.field1726 >> 12;
                            this.field8272.method2693(0.0F, -1001058736);
                            this.field8272.method2693(0.0F, -1001058736);
                            this.field8272.method2693((float) (-var58) * var10 + var55, -1001058736);
                            this.field8272.method2693((float) (-var58) * var11 + var56, -1001058736);
                            this.field8272.method2693((float) (-var58) * var12 + var57, -1001058736);
                            this.field8272.method1725(var51, arg0 ^ 0x5A);
                            this.field8272.method1725(var52, arg0 ^ 0x79);
                            this.field8272.method1725(var53, 20);
                            this.field8272.method1725(var54, arg0 + 45);
                            this.field8272.method2693(1.0F, arg0 ^ 0xC4550E45);
                            this.field8272.method2693(0.0F, arg0 - 1001058757);
                            this.field8272.method2693((float) var58 * var13 + var55, -1001058736);
                            this.field8272.method2693((float) var58 * var14 + var56, arg0 ^ 0xC4550E45);
                            this.field8272.method2693((float) var58 * var15 + var57, -1001058736);
                            this.field8272.method1725(var51, 39);
                            this.field8272.method1725(var52, 35);
                            this.field8272.method1725(var53, 79);
                            this.field8272.method1725(var54, 62);
                            this.field8272.method2693(1.0F, arg0 ^ 0xC4550E45);
                            this.field8272.method2693(1.0F, arg0 - 1001058757);
                            this.field8272.method2693((float) var58 * var10 + var55, -1001058736);
                            this.field8272.method2693((float) var58 * var11 + var56, -1001058736);
                            this.field8272.method2693((float) var58 * var12 + var57, arg0 + -1001058757);
                            this.field8272.method1725(var51, 39);
                            this.field8272.method1725(var52, 24);
                            this.field8272.method1725(var53, 113);
                            this.field8272.method1725(var54, 103);
                            this.field8272.method2693(0.0F, -1001058736);
                            this.field8272.method2693(1.0F, -1001058736);
                            this.field8272.method2693((float) var58 * var16 + var55, arg0 ^ 0xC4550E45);
                            this.field8272.method2693((float) var58 * var17 + var56, arg0 ^ 0xC4550E45);
                            this.field8272.method2693((float) var58 * var18 + var57, -1001058736);
                            this.field8272.method1725(var51, 125);
                            this.field8272.method1725(var52, 96);
                            this.field8272.method1725(var53, arg0 + 7);
                            this.field8272.method1725(var54, 30);
                        }
                    }
                }
            }
        }
        if (this.field8272.field3725 != 0) {
            this.field8281.method3417(this.field8272.field3789, 24, true, this.field8272.field3725);
            arg1.method1634(this.field8282, this.field8280, this.field8279, null, (byte) 11);
            arg1.method1563(arg0 ^ 0x5B, 7, 0, this.field8272.field3725 / 24);
        }
        if (arg0 != 21) {
            this.method3406(null, -4);
        }
    }
}
