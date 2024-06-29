import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class270 {

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "[F")
    private float[] field3412 = new float[16];

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "Lwb;")
    private class552 field3410 = new class552(786336);

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    private int field3418 = class233.method1468(1600, (byte) -37);

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "[[Lej;")
    private class744[][] field3421 = new class744[64][768];

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    private int field3422 = 0;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "[I")
    private int[] field3424 = new int[64];

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "[I")
    private int[] field3425 = new int[1600];

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "[I")
    private int[] field3423 = new int[8191];

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "[[Lej;")
    private class744[][] field3427 = new class744[1600][64];

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "Lmq;")
    public static class78 field3414 = new class78(9, -1);

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "Lus;")
    public static class328 field3420 = new class328(60, 2);

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Lur;")
    private class355 field3417;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "Lac;")
    public static class712 field3426;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "Lqe;")
    private class88 field3415;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "Lqe;")
    private class88 field3416;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "Lqe;")
    private class88 field3419;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Leq;IILcd;)V")
    public final void method1616(class357 arg0, int arg1, int arg2, class603 arg3) {
        field3405++;
        if (arg0.field4987 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method1622(arg0, -757082420, arg2);
        } else {
            this.method1620(arg0, arg1 ^ 0x2286);
        }
        float var5 = arg0.field4987.field9776;
        float var6 = arg0.field4987.field9764;
        float var7 = arg0.field4987.field9756;
        float var8 = arg0.field4987.field9774;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class297 var12 = arg3.field8363.field4479;
            if (arg1 != 8902) {
                this.method1622(null, -127, 52);
            }
            for (class297 var13 = var12.field3857; var13 != var12; var13 = var13.field3857) {
                class744 var14 = (class744) var13;
                int var15 = (int) ((float) (var14.field10387 >> 12) * var7 + (float) (var14.field10388 >> 12) * var6 + (float) (var14.field10383 >> 12) * var5 + var8);
                this.field3423[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class233.method1468(var16, (byte) -37) + 1 - this.field3418;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            class297 var18 = var12.field3857;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field3422 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3425[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3424[var24] = 0;
                }
                while (var12 != var18) {
                    class744 var25 = (class744) var18;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field10384;
                        var20 = var25.field10385;
                    }
                    if (var19 > 0 && (var25.field10385 != var20 || var25.field10384 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3423[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3425[var26] < 64) {
                            this.field3427[var26][this.field3425[var26]++] = var25;
                        } else {
                            label101: {
                                if (this.field3425[var26] == 64) {
                                    if (this.field3422 == 64) {
                                        break label101;
                                    }
                                    this.field3425[var26] += this.field3422++ + 1;
                                }
                                this.field3421[this.field3425[var26] - 64 - 1][this.field3424[this.field3425[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field3857;
                }
                if (var20 >= 0) {
                    arg0.method2140(0, var20);
                } else {
                    arg0.method2140(0, -1);
                }
                if (var21 && class218.field2772 != arg0.field5052) {
                    arg0.method139(class218.field2772);
                } else if (arg0.field5052 != 1.0F) {
                    arg0.method139(1.0F);
                }
                this.method1617(arg0, var16, (byte) 111);
            }
        } catch (Exception var27) {
        }
        this.method1618((byte) 90, arg0);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Leq;IB)V")
    private final void method1617(class357 arg0, int arg1, byte arg2) {
        int var4 = 9 / ((arg2 - 73) / 35);
        OpenGL.glGetFloatv(2982, this.field3412, 0);
        field3413++;
        float var5 = this.field3412[0];
        float var6 = this.field3412[4];
        float var7 = this.field3412[8];
        float var8 = this.field3412[1];
        float var9 = this.field3412[5];
        float var10 = this.field3412[9];
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field3410.field2354 = 0;
        float var19 = var10 - var7;
        if (arg0.field5025) {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                int var46 = this.field3425[var45] > 64 ? 64 : this.field3425[var45];
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class744 var60 = this.field3427[var45][var47];
                        int var61 = var60.field10380;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field10383 >> 12);
                        float var67 = (float) (var60.field10388 >> 12);
                        float var68 = (float) (var60.field10387 >> 12);
                        int var69 = var60.field10379 >> 12;
                        this.field3410.method3144(0.0F, false);
                        this.field3410.method3144(0.0F, false);
                        this.field3410.method3144((float) (-var69) * var11 + var66, false);
                        this.field3410.method3144((float) (-var69) * var12 + var67, false);
                        this.field3410.method3144((float) (-var69) * var13 + var68, false);
                        this.field3410.method1141(var62, 28);
                        this.field3410.method1141(var63, 109);
                        this.field3410.method1141(var64, 121);
                        this.field3410.method1141(var65, 107);
                        this.field3410.method3144(1.0F, false);
                        this.field3410.method3144(0.0F, false);
                        this.field3410.method3144((float) var69 * var14 + var66, false);
                        this.field3410.method3144((float) var69 * var15 + var67, false);
                        this.field3410.method3144((float) var69 * var16 + var68, false);
                        this.field3410.method1141(var62, 88);
                        this.field3410.method1141(var63, -71);
                        this.field3410.method1141(var64, 42);
                        this.field3410.method1141(var65, -98);
                        this.field3410.method3144(1.0F, false);
                        this.field3410.method3144(1.0F, false);
                        this.field3410.method3144((float) var69 * var11 + var66, false);
                        this.field3410.method3144((float) var69 * var12 + var67, false);
                        this.field3410.method3144((float) var69 * var13 + var68, false);
                        this.field3410.method1141(var62, -60);
                        this.field3410.method1141(var63, 81);
                        this.field3410.method1141(var64, -124);
                        this.field3410.method1141(var65, -126);
                        this.field3410.method3144(0.0F, false);
                        this.field3410.method3144(1.0F, false);
                        this.field3410.method3144((float) var69 * var17 + var66, false);
                        this.field3410.method3144((float) var69 * var18 + var67, false);
                        this.field3410.method3144((float) var69 * var19 + var68, false);
                        this.field3410.method1141(var62, 119);
                        this.field3410.method1141(var63, 127);
                        this.field3410.method1141(var64, -105);
                        this.field3410.method1141(var65, 38);
                    }
                    if (this.field3425[var45] > 64) {
                        int var48 = this.field3425[var45] - 1 - 64;
                        for (int var49 = this.field3424[var48] - 1; var49 >= 0; var49--) {
                            class744 var50 = this.field3421[var48][var49];
                            int var51 = var50.field10380;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field10383 >> 12);
                            float var57 = (float) (var50.field10388 >> 12);
                            float var58 = (float) (var50.field10387 >> 12);
                            int var59 = var50.field10379 >> 12;
                            this.field3410.method3144(0.0F, false);
                            this.field3410.method3144(0.0F, false);
                            this.field3410.method3144((float) (-var59) * var11 + var56, false);
                            this.field3410.method3144((float) (-var59) * var12 + var57, false);
                            this.field3410.method3144((float) (-var59) * var13 + var58, false);
                            this.field3410.method1141(var52, -94);
                            this.field3410.method1141(var53, 78);
                            this.field3410.method1141(var54, 55);
                            this.field3410.method1141(var55, -121);
                            this.field3410.method3144(1.0F, false);
                            this.field3410.method3144(0.0F, false);
                            this.field3410.method3144((float) var59 * var14 + var56, false);
                            this.field3410.method3144((float) var59 * var15 + var57, false);
                            this.field3410.method3144((float) var59 * var16 + var58, false);
                            this.field3410.method1141(var52, 62);
                            this.field3410.method1141(var53, 27);
                            this.field3410.method1141(var54, 40);
                            this.field3410.method1141(var55, -116);
                            this.field3410.method3144(1.0F, false);
                            this.field3410.method3144(1.0F, false);
                            this.field3410.method3144((float) var59 * var11 + var56, false);
                            this.field3410.method3144((float) var59 * var12 + var57, false);
                            this.field3410.method3144((float) var59 * var13 + var58, false);
                            this.field3410.method1141(var52, 46);
                            this.field3410.method1141(var53, 72);
                            this.field3410.method1141(var54, -93);
                            this.field3410.method1141(var55, 127);
                            this.field3410.method3144(0.0F, false);
                            this.field3410.method3144(1.0F, false);
                            this.field3410.method3144((float) var59 * var17 + var56, false);
                            this.field3410.method3144((float) var59 * var18 + var57, false);
                            this.field3410.method3144((float) var59 * var19 + var58, false);
                            this.field3410.method1141(var52, 71);
                            this.field3410.method1141(var53, -102);
                            this.field3410.method1141(var54, 127);
                            this.field3410.method1141(var55, -109);
                        }
                    }
                }
            }
        } else {
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = this.field3425[var20] <= 64 ? this.field3425[var20] : 64;
                if (var21 > 0) {
                    for (int var22 = var21 - 1; var22 >= 0; var22--) {
                        class744 var35 = this.field3427[var20][var22];
                        int var36 = var35.field10380;
                        byte var37 = (byte) (var36 >> 16);
                        byte var38 = (byte) (var36 >> 8);
                        byte var39 = (byte) var36;
                        byte var40 = (byte) (var36 >>> 24);
                        float var41 = (float) (var35.field10383 >> 12);
                        float var42 = (float) (var35.field10388 >> 12);
                        float var43 = (float) (var35.field10387 >> 12);
                        int var44 = var35.field10379 >> 12;
                        this.field3410.method3145(0.0F, -1);
                        this.field3410.method3145(0.0F, -1);
                        this.field3410.method3145((float) (-var44) * var11 + var41, -1);
                        this.field3410.method3145((float) (-var44) * var12 + var42, -1);
                        this.field3410.method3145((float) (-var44) * var13 + var43, -1);
                        this.field3410.method1141(var37, 71);
                        this.field3410.method1141(var38, -97);
                        this.field3410.method1141(var39, 66);
                        this.field3410.method1141(var40, 51);
                        this.field3410.method3145(1.0F, -1);
                        this.field3410.method3145(0.0F, -1);
                        this.field3410.method3145((float) var44 * var14 + var41, -1);
                        this.field3410.method3145((float) var44 * var15 + var42, -1);
                        this.field3410.method3145((float) var44 * var16 + var43, -1);
                        this.field3410.method1141(var37, -86);
                        this.field3410.method1141(var38, 60);
                        this.field3410.method1141(var39, 99);
                        this.field3410.method1141(var40, 73);
                        this.field3410.method3145(1.0F, -1);
                        this.field3410.method3145(1.0F, -1);
                        this.field3410.method3145((float) var44 * var11 + var41, -1);
                        this.field3410.method3145((float) var44 * var12 + var42, -1);
                        this.field3410.method3145((float) var44 * var13 + var43, -1);
                        this.field3410.method1141(var37, -113);
                        this.field3410.method1141(var38, 126);
                        this.field3410.method1141(var39, -86);
                        this.field3410.method1141(var40, -106);
                        this.field3410.method3145(0.0F, -1);
                        this.field3410.method3145(1.0F, -1);
                        this.field3410.method3145((float) var44 * var17 + var41, -1);
                        this.field3410.method3145((float) var44 * var18 + var42, -1);
                        this.field3410.method3145((float) var44 * var19 + var43, -1);
                        this.field3410.method1141(var37, 97);
                        this.field3410.method1141(var38, 110);
                        this.field3410.method1141(var39, -122);
                        this.field3410.method1141(var40, -67);
                    }
                    if (this.field3425[var20] > 64) {
                        int var23 = this.field3425[var20] - 64 - 1;
                        for (int var24 = this.field3424[var23] - 1; var24 >= 0; var24--) {
                            class744 var25 = this.field3421[var23][var24];
                            int var26 = var25.field10380;
                            byte var27 = (byte) (var26 >> 16);
                            byte var28 = (byte) (var26 >> 8);
                            byte var29 = (byte) var26;
                            byte var30 = (byte) (var26 >>> 24);
                            float var31 = (float) (var25.field10383 >> 12);
                            float var32 = (float) (var25.field10388 >> 12);
                            float var33 = (float) (var25.field10387 >> 12);
                            int var34 = var25.field10379 >> 12;
                            this.field3410.method3145(0.0F, -1);
                            this.field3410.method3145(0.0F, -1);
                            this.field3410.method3145((float) (-var34) * var11 + var31, -1);
                            this.field3410.method3145((float) (-var34) * var12 + var32, -1);
                            this.field3410.method3145((float) (-var34) * var13 + var33, -1);
                            this.field3410.method1141(var27, 87);
                            this.field3410.method1141(var28, -127);
                            this.field3410.method1141(var29, -118);
                            this.field3410.method1141(var30, -77);
                            this.field3410.method3145(1.0F, -1);
                            this.field3410.method3145(0.0F, -1);
                            this.field3410.method3145((float) var34 * var14 + var31, -1);
                            this.field3410.method3145((float) var34 * var15 + var32, -1);
                            this.field3410.method3145((float) var34 * var16 + var33, -1);
                            this.field3410.method1141(var27, 77);
                            this.field3410.method1141(var28, -52);
                            this.field3410.method1141(var29, 98);
                            this.field3410.method1141(var30, -107);
                            this.field3410.method3145(1.0F, -1);
                            this.field3410.method3145(1.0F, -1);
                            this.field3410.method3145((float) var34 * var11 + var31, -1);
                            this.field3410.method3145((float) var34 * var12 + var32, -1);
                            this.field3410.method3145((float) var34 * var13 + var33, -1);
                            this.field3410.method1141(var27, -73);
                            this.field3410.method1141(var28, -100);
                            this.field3410.method1141(var29, -60);
                            this.field3410.method1141(var30, 114);
                            this.field3410.method3145(0.0F, -1);
                            this.field3410.method3145(1.0F, -1);
                            this.field3410.method3145((float) var34 * var17 + var31, -1);
                            this.field3410.method3145((float) var34 * var18 + var32, -1);
                            this.field3410.method3145((float) var34 * var19 + var33, -1);
                            this.field3410.method1141(var27, -128);
                            this.field3410.method1141(var28, -56);
                            this.field3410.method1141(var29, -51);
                            this.field3410.method1141(var30, 109);
                        }
                    }
                }
            }
        }
        if (this.field3410.field2354 != 0) {
            this.field3417.method2109(this.field3410.field2325, (byte) -75, this.field3410.field2354, 24);
            arg0.method2181(null, this.field3415, this.field3419, this.field3416, 15063);
            arg0.method2133((byte) 35, 7, this.field3410.field2354 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLeq;)V")
    private final void method1618(byte arg0, class357 arg1) {
        arg1.method2125(arg0 ^ 0x5A, true);
        if (arg0 != 90) {
            this.field3424 = null;
        }
        field3411++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class218.field2772 != arg1.field5052) {
            arg1.method139(class218.field2772);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field3426 = null;
        if (arg0 != 16385) {
            field3408 = 58;
        }
        field3420 = null;
        field3414 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Leq;I)V")
    private final void method1620(class357 arg0, int arg1) {
        field3406++;
        class218.field2772 = arg0.field5052;
        arg0.method2126(1);
        OpenGL.glDisable(16384);
        if (arg1 != 64) {
            this.method1618((byte) -100, null);
        }
        OpenGL.glDisable(16385);
        arg0.method2125(0, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lkha;ZILjava/awt/Canvas;Ld;)Lha;")
    public static final class454 method1621(class687 arg0, boolean arg1, int arg2, Canvas arg3, class96 arg4) {
        field3404++;
        if (!class162.method1002(arg1)) {
            throw new RuntimeException("");
        } else if (class10.method50("jaggl", (byte) -72)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class221 var8 = new class221(var5, arg3, var6, arg4, arg0, arg2);
            var8.method3788(262144);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Leq;II)V")
    private final void method1622(class357 arg0, int arg1, int arg2) {
        class218.field2772 = arg0.field5052;
        if (arg1 != -757082420) {
            this.field3416 = null;
        }
        field3407++;
        arg0.method2147((byte) 112, (float) arg2);
        arg0.method2164(true);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2125(0, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(Leq;I)V")
    public final void method1623(class357 arg0, int arg1) {
        this.field3417 = arg0.method2180(24, 196584, null, true, true);
        field3409++;
        this.field3416 = new class88(this.field3417, 5126, 2, 0);
        this.field3415 = new class88(this.field3417, 5126, 3, 8);
        int var3 = 82 % ((arg1 + 57) / 35);
        this.field3419 = new class88(this.field3417, 5121, 4, 20);
    }
}
