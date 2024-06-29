import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class506 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[F")
    private float[] field6838 = new float[16];

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "Lkj;")
    private class457 field6835 = new class457(786336);

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field6847 = class335.method2138(1600, 36161);

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
    private int[] field6850 = new int[8191];

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    private int field6849 = 0;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "[I")
    private int[] field6851 = new int[64];

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "[[Lpl;")
    private class220[][] field6853 = new class220[64][768];

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "[[Lpl;")
    private class220[][] field6854 = new class220[1600][64];

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "[I")
    private int[] field6856 = new int[1600];

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Lcb;")
    public static class318 field6839 = new class318(57, 7);

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "[B")
    public static byte[] field6845 = new byte[520];

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Lvi;")
    public static class560 field6852 = new class560(20);

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Llp;")
    public static class270 field6858 = new class270(13, 0, 1, 0);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lcm;")
    private class158 field6843;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lcm;")
    private class158 field6846;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lcm;")
    private class158 field6848;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lav;")
    private class437 field6842;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILpea;)V")
    private final void method2857(int arg0, int arg1, class641 arg2) {
        OpenGL.glGetFloatv(2982, this.field6838, 0);
        field6836++;
        float var4 = this.field6838[0];
        float var5 = this.field6838[4];
        float var6 = this.field6838[8];
        float var7 = this.field6838[1];
        float var8 = this.field6838[5];
        if (arg0 != 64) {
            this.method2861(77, null);
        }
        float var9 = this.field6838[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field6835.field1745 = 0;
        float var18 = var9 - var6;
        if (arg2.field8968) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field6856[var44] > 64 ? 64 : this.field6856[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class220 var59 = this.field6854[var44][var46];
                        int var60 = var59.field2859;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2856 >> 12);
                        float var66 = (float) (var59.field2863 >> 12);
                        float var67 = (float) (var59.field2858 >> 12);
                        int var68 = var59.field2860 >> 12;
                        this.field6835.method2587(0.0F, -11186);
                        this.field6835.method2587(0.0F, -11186);
                        this.field6835.method2587((float) (-var68) * var10 + var65, -11186);
                        this.field6835.method2587((float) (-var68) * var11 + var66, arg0 + -11250);
                        this.field6835.method2587((float) (-var68) * var12 + var67, arg0 + -11250);
                        this.field6835.method951((byte) -82, var61);
                        this.field6835.method951((byte) -82, var62);
                        this.field6835.method951((byte) -82, var63);
                        this.field6835.method951((byte) -82, var64);
                        this.field6835.method2587(1.0F, -11186);
                        this.field6835.method2587(0.0F, -11186);
                        this.field6835.method2587((float) var68 * var13 + var65, -11186);
                        this.field6835.method2587((float) var68 * var14 + var66, -11186);
                        this.field6835.method2587((float) var68 * var15 + var67, -11186);
                        this.field6835.method951((byte) -82, var61);
                        this.field6835.method951((byte) -82, var62);
                        this.field6835.method951((byte) -82, var63);
                        this.field6835.method951((byte) -82, var64);
                        this.field6835.method2587(1.0F, -11186);
                        this.field6835.method2587(1.0F, -11186);
                        this.field6835.method2587((float) var68 * var10 + var65, -11186);
                        this.field6835.method2587((float) var68 * var11 + var66, -11186);
                        this.field6835.method2587((float) var68 * var12 + var67, arg0 + -11250);
                        this.field6835.method951((byte) -82, var61);
                        this.field6835.method951((byte) -82, var62);
                        this.field6835.method951((byte) -82, var63);
                        this.field6835.method951((byte) -82, var64);
                        this.field6835.method2587(0.0F, arg0 - 11250);
                        this.field6835.method2587(1.0F, -11186);
                        this.field6835.method2587((float) var68 * var16 + var65, arg0 + -11250);
                        this.field6835.method2587((float) var68 * var17 + var66, -11186);
                        this.field6835.method2587((float) var68 * var18 + var67, -11186);
                        this.field6835.method951((byte) -82, var61);
                        this.field6835.method951((byte) -82, var62);
                        this.field6835.method951((byte) -82, var63);
                        this.field6835.method951((byte) -82, var64);
                    }
                    if (this.field6856[var44] > 64) {
                        int var47 = this.field6856[var44] - 64 - 1;
                        for (int var48 = this.field6851[var47] - 1; var48 >= 0; var48--) {
                            class220 var49 = this.field6853[var47][var48];
                            int var50 = var49.field2859;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2856 >> 12);
                            float var56 = (float) (var49.field2863 >> 12);
                            float var57 = (float) (var49.field2858 >> 12);
                            int var58 = var49.field2860 >> 12;
                            this.field6835.method2587(0.0F, arg0 - 11250);
                            this.field6835.method2587(0.0F, -11186);
                            this.field6835.method2587((float) (-var58) * var10 + var55, -11186);
                            this.field6835.method2587((float) (-var58) * var11 + var56, -11186);
                            this.field6835.method2587((float) (-var58) * var12 + var57, arg0 ^ 0xFFFFD40E);
                            this.field6835.method951((byte) -82, var51);
                            this.field6835.method951((byte) -82, var52);
                            this.field6835.method951((byte) -82, var53);
                            this.field6835.method951((byte) -82, var54);
                            this.field6835.method2587(1.0F, -11186);
                            this.field6835.method2587(0.0F, -11186);
                            this.field6835.method2587((float) var58 * var13 + var55, -11186);
                            this.field6835.method2587((float) var58 * var14 + var56, -11186);
                            this.field6835.method2587((float) var58 * var15 + var57, -11186);
                            this.field6835.method951((byte) -82, var51);
                            this.field6835.method951((byte) -82, var52);
                            this.field6835.method951((byte) -82, var53);
                            this.field6835.method951((byte) -82, var54);
                            this.field6835.method2587(1.0F, arg0 - 11250);
                            this.field6835.method2587(1.0F, -11186);
                            this.field6835.method2587((float) var58 * var10 + var55, -11186);
                            this.field6835.method2587((float) var58 * var11 + var56, -11186);
                            this.field6835.method2587((float) var58 * var12 + var57, -11186);
                            this.field6835.method951((byte) -82, var51);
                            this.field6835.method951((byte) -82, var52);
                            this.field6835.method951((byte) -82, var53);
                            this.field6835.method951((byte) -82, var54);
                            this.field6835.method2587(0.0F, -11186);
                            this.field6835.method2587(1.0F, -11186);
                            this.field6835.method2587((float) var58 * var16 + var55, -11186);
                            this.field6835.method2587((float) var58 * var17 + var56, -11186);
                            this.field6835.method2587((float) var58 * var18 + var57, arg0 + -11250);
                            this.field6835.method951((byte) -82, var51);
                            this.field6835.method951((byte) -82, var52);
                            this.field6835.method951((byte) -82, var53);
                            this.field6835.method951((byte) -82, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field6856[var19] <= 64 ? this.field6856[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class220 var34 = this.field6854[var19][var21];
                        int var35 = var34.field2859;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2856 >> 12);
                        float var41 = (float) (var34.field2863 >> 12);
                        float var42 = (float) (var34.field2858 >> 12);
                        int var43 = var34.field2860 >> 12;
                        this.field6835.method2586(-26561, 0.0F);
                        this.field6835.method2586(-26561, 0.0F);
                        this.field6835.method2586(-26561, (float) (-var43) * var10 + var40);
                        this.field6835.method2586(arg0 ^ 0xFFFF987F, (float) (-var43) * var11 + var41);
                        this.field6835.method2586(-26561, (float) (-var43) * var12 + var42);
                        this.field6835.method951((byte) -82, var36);
                        this.field6835.method951((byte) -82, var37);
                        this.field6835.method951((byte) -82, var38);
                        this.field6835.method951((byte) -82, var39);
                        this.field6835.method2586(-26561, 1.0F);
                        this.field6835.method2586(-26561, 0.0F);
                        this.field6835.method2586(-26561, (float) var43 * var13 + var40);
                        this.field6835.method2586(arg0 - 26625, (float) var43 * var14 + var41);
                        this.field6835.method2586(-26561, (float) var43 * var15 + var42);
                        this.field6835.method951((byte) -82, var36);
                        this.field6835.method951((byte) -82, var37);
                        this.field6835.method951((byte) -82, var38);
                        this.field6835.method951((byte) -82, var39);
                        this.field6835.method2586(-26561, 1.0F);
                        this.field6835.method2586(-26561, 1.0F);
                        this.field6835.method2586(-26561, (float) var43 * var10 + var40);
                        this.field6835.method2586(arg0 ^ 0xFFFF987F, (float) var43 * var11 + var41);
                        this.field6835.method2586(-26561, (float) var43 * var12 + var42);
                        this.field6835.method951((byte) -82, var36);
                        this.field6835.method951((byte) -82, var37);
                        this.field6835.method951((byte) -82, var38);
                        this.field6835.method951((byte) -82, var39);
                        this.field6835.method2586(-26561, 0.0F);
                        this.field6835.method2586(-26561, 1.0F);
                        this.field6835.method2586(-26561, (float) var43 * var16 + var40);
                        this.field6835.method2586(-26561, (float) var43 * var17 + var41);
                        this.field6835.method2586(arg0 - 26625, (float) var43 * var18 + var42);
                        this.field6835.method951((byte) -82, var36);
                        this.field6835.method951((byte) -82, var37);
                        this.field6835.method951((byte) -82, var38);
                        this.field6835.method951((byte) -82, var39);
                    }
                    if (this.field6856[var19] > 64) {
                        int var22 = this.field6856[var19] - 1 - 64;
                        for (int var23 = this.field6851[var22] - 1; var23 >= 0; var23--) {
                            class220 var24 = this.field6853[var22][var23];
                            int var25 = var24.field2859;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2856 >> 12);
                            float var31 = (float) (var24.field2863 >> 12);
                            float var32 = (float) (var24.field2858 >> 12);
                            int var33 = var24.field2860 >> 12;
                            this.field6835.method2586(arg0 ^ 0xFFFF987F, 0.0F);
                            this.field6835.method2586(-26561, 0.0F);
                            this.field6835.method2586(-26561, (float) (-var33) * var10 + var30);
                            this.field6835.method2586(-26561, (float) (-var33) * var11 + var31);
                            this.field6835.method2586(-26561, (float) (-var33) * var12 + var32);
                            this.field6835.method951((byte) -82, var26);
                            this.field6835.method951((byte) -82, var27);
                            this.field6835.method951((byte) -82, var28);
                            this.field6835.method951((byte) -82, var29);
                            this.field6835.method2586(-26561, 1.0F);
                            this.field6835.method2586(-26561, 0.0F);
                            this.field6835.method2586(-26561, (float) var33 * var13 + var30);
                            this.field6835.method2586(arg0 ^ 0xFFFF987F, (float) var33 * var14 + var31);
                            this.field6835.method2586(-26561, (float) var33 * var15 + var32);
                            this.field6835.method951((byte) -82, var26);
                            this.field6835.method951((byte) -82, var27);
                            this.field6835.method951((byte) -82, var28);
                            this.field6835.method951((byte) -82, var29);
                            this.field6835.method2586(-26561, 1.0F);
                            this.field6835.method2586(arg0 - 26625, 1.0F);
                            this.field6835.method2586(arg0 - 26625, (float) var33 * var10 + var30);
                            this.field6835.method2586(-26561, (float) var33 * var11 + var31);
                            this.field6835.method2586(-26561, (float) var33 * var12 + var32);
                            this.field6835.method951((byte) -82, var26);
                            this.field6835.method951((byte) -82, var27);
                            this.field6835.method951((byte) -82, var28);
                            this.field6835.method951((byte) -82, var29);
                            this.field6835.method2586(-26561, 0.0F);
                            this.field6835.method2586(-26561, 1.0F);
                            this.field6835.method2586(-26561, (float) var33 * var16 + var30);
                            this.field6835.method2586(-26561, (float) var33 * var17 + var31);
                            this.field6835.method2586(-26561, (float) var33 * var18 + var32);
                            this.field6835.method951((byte) -82, var26);
                            this.field6835.method951((byte) -82, var27);
                            this.field6835.method951((byte) -82, var28);
                            this.field6835.method951((byte) -82, var29);
                        }
                    }
                }
            }
        }
        if (this.field6835.field1745 != 0) {
            this.field6842.method2513(this.field6835.field1745, this.field6835.field1712, 24, (byte) -123);
            arg2.method3567(null, arg0 - 64, this.field6848, this.field6843, this.field6846);
            arg2.method3507(0, this.field6835.field1745 / 24, 0, 7);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILfca;)Lfca;")
    public static final class188 method2858(int arg0, class188 arg1) {
        field6844++;
        if (arg0 != -2) {
            field6852 = null;
        }
        class188 var2 = client.method1407(arg1);
        if (var2 == null) {
            var2 = arg1.field2346;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lob;Lpea;B)V")
    public final void method2859(class309 arg0, class641 arg1, byte arg2) {
        field6857++;
        if (arg1.field9011 == null) {
            return;
        }
        this.method2861(10755, arg1);
        float var4 = arg1.field9011.field5270;
        if (arg2 != -22) {
            this.method2864(12, null);
        }
        float var5 = arg1.field9011.field5258;
        float var6 = arg1.field9011.field5267;
        float var7 = arg1.field9011.field5279;
        try {
            class220[] var10000;
            int var10002;
            int var10004;
            if (arg0.field4148) {
                int var26 = arg0.field4149 - arg0.field4147;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class335.method2138(var26, 36161) + 1 - this.field6847;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class204 var28 = arg0.field4141.field850;
                class204 var29 = var28.field2668;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field6849 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field6856[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field6851[var34] = 0;
                    }
                    while (var28 != var29) {
                        class220 var35 = (class220) var29;
                        if (var32) {
                            var31 = var35.field2865;
                            var32 = false;
                            var30 = var35.field2864;
                        } else if (var35.field2864 != var30 || var31 != var35.field2865) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field2858 >> 12) * var6 + (float) (var35.field2863 >> 12) * var5 + (float) (var35.field2856 >> 12) * var4 + var7) - arg0.field4147 >> var27;
                        if (var36 < 1600) {
                            if (this.field6856[var36] < 64) {
                                this.field6854[var36][this.field6856[var36]++] = var35;
                            } else {
                                label140: {
                                    if (this.field6856[var36] == 64) {
                                        if (this.field6849 == 64) {
                                            break label140;
                                        }
                                        this.field6856[var36] += this.field6849++ + 1;
                                    }
                                    var10000 = this.field6853[this.field6856[var36] - 64 - 1];
                                    var10002 = this.field6856[var36] - 65;
                                    var10004 = this.field6851[this.field6856[var36] - 65];
                                    this.field6851[var10002] = this.field6851[this.field6856[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            }
                        }
                        var29 = var29.field2668;
                    }
                    if (var30 >= 0) {
                        arg1.method3530(var30, 106);
                    } else {
                        arg1.method3530(-1, -112);
                    }
                    if (var31 && class43.field554 != arg1.field9004) {
                        arg1.method1986(class43.field554);
                    } else if (arg1.field9004 != 1.0F) {
                        arg1.method1986(1.0F);
                    }
                    this.method2857(64, var26, arg1);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class204 var11 = arg0.field4141.field850;
                for (class204 var12 = var11.field2668; var12 != var11; var12 = var12.field2668) {
                    class220 var13 = (class220) var12;
                    int var14 = (int) ((float) (var13.field2858 >> 12) * var6 + (float) (var13.field2863 >> 12) * var5 + (float) (var13.field2856 >> 12) * var4 + var7);
                    this.field6850[var8++] = var14;
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class335.method2138(var15, arg2 + 36183) + 1 - this.field6847;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var15 += 2;
                    var16 = 0;
                }
                class204 var17 = var11.field2668;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field6849 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field6856[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field6851[var23] = 0;
                    }
                    while (var11 != var17) {
                        class220 var24 = (class220) var17;
                        if (var21) {
                            var20 = var24.field2865;
                            var21 = false;
                            var19 = var24.field2864;
                        }
                        if (var18 > 0 && (var24.field2864 != var19 || var24.field2865 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field6850[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field6856[var25] < 64) {
                                this.field6854[var25][this.field6856[var25]++] = var24;
                            } else {
                                label184: {
                                    if (this.field6856[var25] == 64) {
                                        if (this.field6849 == 64) {
                                            break label184;
                                        }
                                        this.field6856[var25] += this.field6849++ + 1;
                                    }
                                    var10000 = this.field6853[this.field6856[var25] - 65];
                                    var10002 = this.field6856[var25] - 65;
                                    var10004 = this.field6851[this.field6856[var25] - 65];
                                    this.field6851[var10002] = this.field6851[this.field6856[var25] - 65] + 1;
                                    var10000[var10004] = var24;
                                }
                            }
                        }
                        var17 = var17.field2668;
                    }
                    if (var19 >= 0) {
                        arg1.method3530(var19, 106);
                    } else {
                        arg1.method3530(-1, 84);
                    }
                    if (var20 && class43.field554 != arg1.field9004) {
                        arg1.method1986(class43.field554);
                    } else if (arg1.field9004 != 1.0F) {
                        arg1.method1986(1.0F);
                    }
                    this.method2857(64, var15, arg1);
                }
            }
        } catch (Exception var37) {
        }
        this.method2863(arg1, false);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public static void method2860(boolean arg0) {
        field6839 = null;
        field6845 = null;
        field6858 = null;
        if (!arg0) {
            field6852 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILpea;)V")
    private final void method2861(int arg0, class641 arg1) {
        field6833++;
        class43.field554 = arg1.field9004;
        arg1.method3533((byte) 117);
        OpenGL.glDisable(16384);
        if (arg0 != 10755) {
            this.field6838 = null;
        }
        OpenGL.glDisable(16385);
        arg1.method3505(arg0 - 11538, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;ILpea;)Lpc;")
    public static final class216 method2862(int arg0, String arg1, int arg2, class641 arg3) {
        field6834++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg1);
        if (arg2 != 16686) {
            method2866(null, (byte) -14);
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class460.field6271, 0);
        if (class460.field6271[0] == 0) {
            if (class460.field6271[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class460.field6271, 1);
            if (class460.field6271[1] > 1) {
                byte[] var6 = new byte[class460.field6271[1]];
                OpenGL.glGetInfoLogARB(var4, class460.field6271[1], class460.field6271, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class460.field6271[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class216(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lpea;Z)V")
    private final void method2863(class641 arg0, boolean arg1) {
        if (arg1) {
            method2860(false);
        }
        arg0.method3505(-783, true);
        field6837++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class43.field554 != arg0.field9004) {
            arg0.method1986(class43.field554);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(ILpea;)V")
    public final void method2864(int arg0, class641 arg1) {
        if (arg0 != -1025) {
            this.field6849 = -113;
        }
        field6840++;
        this.field6842 = arg1.method3494(true, null, 24, arg0 ^ 0xFFFFE9FE, 196584);
        this.field6848 = new class158(this.field6842, 5126, 2, 0);
        this.field6843 = new class158(this.field6842, 5126, 3, 8);
        this.field6846 = new class158(this.field6842, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZILrq;)V")
    public static final void method2865(boolean arg0, int arg1, class39 arg2) {
        field6841++;
        class334 var3 = arg2.method242(arg1 ^ 0x16C8);
        if (arg2.field520 == 0) {
            arg2.field523 = 0;
            class224.field2917 = 0;
            class660.field9342 = -1;
            return;
        }
        if (arg2.field459 != -1 && arg2.field492 == 0) {
            class463 var4 = class77.field971.method776(arg2.field459, (byte) -84);
            if (arg2.field521 > 0 && var4.field6316 == 0) {
                class224.field2917 = 0;
                class660.field9342 = -1;
                arg2.field523++;
                return;
            }
            if (arg2.field521 <= 0 && var4.field6318 == 0) {
                arg2.field523++;
                class660.field9342 = -1;
                class224.field2917 = 0;
                return;
            }
        }
        if (arg2.field444 != -1 && class430.field5984 >= arg2.field473) {
            class328 var5 = class236.field3079.method1047(arg2.field444, (byte) -42);
            if (var5.field4811 && var5.field4797 != -1) {
                class463 var6 = class77.field971.method776(var5.field4797, (byte) -120);
                if (arg2.field521 > 0 && var6.field6316 == 0) {
                    class660.field9342 = -1;
                    arg2.field523++;
                    class224.field2917 = 0;
                    return;
                }
                if (arg2.field521 <= 0 && var6.field6318 == 0) {
                    class224.field2917 = 0;
                    class660.field9342 = -1;
                    arg2.field523++;
                    return;
                }
            }
        }
        if (arg2.field444 != -1 && arg2.field473 <= class430.field5984) {
            class328 var7 = class236.field3079.method1047(arg2.field444, (byte) 117);
            if (var7.field4811 && var7.field4797 != -1) {
                class463 var8 = class77.field971.method776(var7.field4797, (byte) -66);
                if (arg2.field521 > 0 && var8.field6316 == 0) {
                    class224.field2917 = 0;
                    class660.field9342 = -1;
                    arg2.field523++;
                    return;
                }
                if (arg2.field521 <= 0 && var8.field6318 == 0) {
                    arg2.field523++;
                    class660.field9342 = -1;
                    class224.field2917 = 0;
                    return;
                }
            }
        }
        int var9 = arg2.field3929;
        int var10 = arg2.field3917;
        int var11 = arg2.field526[arg2.field520 - 1] * 512 + arg2.method241(arg1 - 25747) * 256;
        int var12 = arg2.field516[arg2.field520 - 1] * 512 + (arg2.method241(-25747) * 256);
        if (var11 > var9) {
            if (var12 > var10) {
                arg2.method230(0, 10240);
            } else if (var12 < var10) {
                arg2.method230(arg1, 14336);
            } else {
                arg2.method230(0, 12288);
            }
        } else if (var11 >= var9) {
            if (var10 < var12) {
                arg2.method230(arg1, 8192);
            } else if (var12 < var10) {
                arg2.method230(arg1, 0);
            }
        } else if (var12 > var10) {
            arg2.method230(0, 6144);
        } else if (var12 < var10) {
            arg2.method230(arg1, 2048);
        } else {
            arg2.method230(0, 4096);
        }
        byte var13 = arg2.field517[arg2.field520 - 1];
        if (!arg0 && (var11 - var9) > 1024 || (var11 - var9) < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg2.field3917 = var12;
            arg2.field3929 = var11;
            arg2.method240(arg2.field488, 0, false);
            arg2.field520--;
            if (arg2.field521 > 0) {
                arg2.field521--;
            }
            class224.field2917 = 0;
            class660.field9342 = -1;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class676) {
            var15 = ((class676) arg2).field9594.field2524;
        }
        if (var15) {
            int var16 = arg2.field488 - arg2.field421.field2095;
            if (var16 != 0 && arg2.field430 == -1 && arg2.field474 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg2.field520 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg2.field520 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg2.field520 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg2.field520 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field523 > 0 && arg2.field520 > 1) {
            var14 = 32;
            arg2.field523--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (~var3.field4910 != arg1) {
            int var17 = var14 << 9;
            if (arg2.field520 == 1) {
                int var18 = arg2.field524 * arg2.field524;
                int var19 = (var11 >= arg2.field3929 ? var11 - arg2.field3929 : arg2.field3929 - var11) << 9;
                int var20 = (var12 < arg2.field3917 ? arg2.field3917 - var12 : var12 - arg2.field3917) << 9;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field4910 * 2 * var21;
                if (var22 < var18) {
                    arg2.field524 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg2.field524 -= var3.field4910;
                    if (arg2.field524 < 0) {
                        arg2.field524 = 0;
                    }
                } else if (var17 > arg2.field524) {
                    arg2.field524 += var3.field4910;
                    if (arg2.field524 > var17) {
                        arg2.field524 = var17;
                    }
                }
            } else if (arg2.field524 < var17) {
                arg2.field524 += var3.field4910;
                if (var17 < arg2.field524) {
                    arg2.field524 = var17;
                }
            } else if (arg2.field524 > 0) {
                arg2.field524 -= var3.field4910;
                if (arg2.field524 < 0) {
                    arg2.field524 = 0;
                }
            }
            var14 = arg2.field524 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class224.field2917 = 0;
        if (var9 == var11 && var10 == var12) {
            class660.field9342 = -1;
        } else {
            if (var11 > var9) {
                arg2.field3929 += var14;
                class224.field2917 |= 0x4;
                if (var11 < arg2.field3929) {
                    arg2.field3929 = var11;
                }
            } else if (var9 > var11) {
                class224.field2917 |= 0x8;
                arg2.field3929 -= var14;
                if (arg2.field3929 < var11) {
                    arg2.field3929 = var11;
                }
            }
            if (var12 > var10) {
                arg2.field3917 += var14;
                class224.field2917 |= 0x1;
                if (arg2.field3917 > var12) {
                    arg2.field3917 = var12;
                }
            } else if (var10 > var12) {
                class224.field2917 |= 0x2;
                arg2.field3917 -= var14;
                if (arg2.field3917 < var12) {
                    arg2.field3917 = var12;
                }
            }
            if (var14 < 32) {
                class660.field9342 = var13;
            } else {
                class660.field9342 = 2;
            }
        }
        if (arg2.field3929 == var11 && arg2.field3917 == var12) {
            if (arg2.field521 > 0) {
                arg2.field521--;
            }
            arg2.field520--;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([BB)Lxa;")
    public static final class424 method2866(byte[] arg0, byte arg1) {
        field6855++;
        try {
            Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var3 = new MediaTracker(class167.field2083);
            var3.addImage(var2, 0);
            var3.waitForAll();
            int var4 = var2.getWidth(class167.field2083);
            int var5 = var2.getHeight(class167.field2083);
            int[] var6 = new int[var4 * var5];
            int var7 = -39 % ((84 - arg1) / 38);
            PixelGrabber var8 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
            var8.grabPixels();
            return class9.field103.method1894(var6, 0, var4, var4, var5);
        } catch (InterruptedException var9) {
            return null;
        }
    }
}
