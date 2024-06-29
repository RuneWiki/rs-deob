import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class197 {

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "[F")
    private float[] field2840 = new float[16];

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Ljga;")
    private class128 field2846 = new class128(786336);

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    private int field2849 = class668.method3830((byte) -7, 1600);

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
    private int field2855 = 0;

    @OriginalMember(owner = "client!uw", name = "s", descriptor = "[[Lsm;")
    private class387[][] field2856 = new class387[1600][64];

    @OriginalMember(owner = "client!uw", name = "t", descriptor = "[I")
    private int[] field2857 = new int[8191];

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "[I")
    private int[] field2860 = new int[1600];

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "[[Lsm;")
    private class387[][] field2858 = new class387[64][768];

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "[I")
    private int[] field2859 = new int[64];

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "Lkea;")
    public static class77 field2845 = new class77(1);

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
    public static int[] field2850 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "Lhu;")
    private class227 field2853;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "Leca;")
    private class329 field2851;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "Leca;")
    private class329 field2852;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "Leca;")
    private class329 field2854;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lep;I)V")
    private final void method1324(class371 arg0, int arg1) {
        field2843++;
        class303.field3933 = arg0.field5046;
        arg0.method2118(arg1 - 16512);
        OpenGL.glDisable(arg1);
        OpenGL.glDisable(16385);
        arg0.method2192(arg1 ^ 0x405E, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Leda;BZZ)V")
    public static final void method1325(class14 arg0, byte arg1, boolean arg2, boolean arg3) {
        field2838++;
        int var4 = arg0.field194;
        int var5 = (int) arg0.field7166;
        arg0.method3065(-17363);
        if (arg3) {
            class295.method1736(var4, -1);
        }
        if (arg1 <= 39) {
            return;
        }
        class138.method892((byte) 111, var4);
        class712 var6 = class733.method4073(true, var5);
        if (var6 != null) {
            class116.method764(var6, -1176833464);
        }
        class501.method2992((byte) -50);
        if (!arg2 && class312.field4004 != -1) {
            class217.method1420(class312.field4004, 1, -6248);
        }
        class395 var7 = new class395(class426.field5894);
        for (class14 var8 = (class14) var7.method2406((byte) 12); var8 != null; var8 = (class14) var7.method2407(124)) {
            if (!var8.method3064(10343)) {
                var8 = (class14) var7.method2406((byte) 12);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field195 == 3) {
                int var9 = (int) var8.field7166;
                if ((var9 >>> 16) == var4) {
                    method1325(var8, (byte) 111, arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBLep;)V")
    private final void method1326(int arg0, byte arg1, class371 arg2) {
        class303.field3933 = arg2.field5046;
        field2844++;
        arg2.method2075((float) arg0, (byte) -128);
        arg2.method2125((byte) -43);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2192(107, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg1 <= 90) {
            this.field2849 = -71;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILep;Lev;)V")
    public final void method1327(int arg0, int arg1, class371 arg2, class347 arg3) {
        field2847++;
        if (arg2.field4979 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method1326(arg1, (byte) 100, arg2);
        } else {
            this.method1324(arg2, 16384);
        }
        float var5 = arg2.field4979.field6007;
        float var6 = arg2.field4979.field6008;
        float var7 = arg2.field4979.field6000;
        float var8 = arg2.field4979.field6001;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class467 var12 = arg3.field4410.field6953;
            if (arg0 != -28861) {
                this.method1326(-100, (byte) 101, null);
            }
            for (class467 var13 = var12.field6370; var13 != var12; var13 = var13.field6370) {
                class387 var14 = (class387) var13;
                int var15 = (int) ((float) (var14.field5404 >> 12) * var7 + (float) (var14.field5411 >> 12) * var6 + (float) (var14.field5402 >> 12) * var5 + var8);
                this.field2857[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class668.method3830((byte) -7, var16) + 1 - this.field2849;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class467 var19 = var12.field6370;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field2855 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2860[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2859[var24] = 0;
                }
                while (var12 != var19) {
                    class387 var25 = (class387) var19;
                    if (var22) {
                        var21 = var25.field5410;
                        var20 = var25.field5401;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field5401 != var20 || var25.field5410 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2857[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2860[var26] >= 64) {
                            label105: {
                                if (this.field2860[var26] == 64) {
                                    if (this.field2855 == 64) {
                                        break label105;
                                    }
                                    this.field2860[var26] += (this.field2855++) + 1;
                                }
                                this.field2858[this.field2860[var26] - 65][this.field2859[this.field2860[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field2856[var26][this.field2860[var26]++] = var25;
                        }
                    }
                    var19 = var19.field6370;
                }
                if (var20 >= 0) {
                    arg2.method2103((byte) 116, var20);
                } else {
                    arg2.method2103((byte) -19, -1);
                }
                if (var21 && class303.field3933 != arg2.field5046) {
                    arg2.method2132(class303.field3933);
                } else if (arg2.field5046 != 1.0F) {
                    arg2.method2132(1.0F);
                }
                this.method1328(arg2, var16, true);
            }
        } catch (Exception var27) {
        }
        this.method1331(arg2, arg0 ^ 0xFFFFCF42);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lep;IZ)V")
    private final void method1328(class371 arg0, int arg1, boolean arg2) {
        OpenGL.glGetFloatv(2982, this.field2840, 0);
        field2848++;
        float var4 = this.field2840[0];
        float var5 = this.field2840[4];
        float var6 = this.field2840[8];
        float var7 = this.field2840[1];
        float var8 = this.field2840[5];
        float var9 = this.field2840[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        if (!arg2) {
            this.field2852 = null;
        }
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field2846.field330 = 0;
        float var18 = var9 - var6;
        if (arg0.field4992) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field2860[var19] > 64 ? 64 : this.field2860[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class387 var34 = this.field2856[var19][var21];
                        int var35 = var34.field5407;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field5402 >> 12);
                        float var41 = (float) (var34.field5411 >> 12);
                        float var42 = (float) (var34.field5404 >> 12);
                        int var43 = var34.field5406 >> 12;
                        this.field2846.method821(0.0F, 856244488);
                        this.field2846.method821(0.0F, 856244488);
                        this.field2846.method821((float) (-var43) * var10 + var40, 856244488);
                        this.field2846.method821((float) (-var43) * var11 + var41, 856244488);
                        this.field2846.method821((float) (-var43) * var12 + var42, 856244488);
                        this.field2846.method184(var36, -77);
                        this.field2846.method184(var37, -95);
                        this.field2846.method184(var38, -113);
                        this.field2846.method184(var39, -41);
                        this.field2846.method821(1.0F, 856244488);
                        this.field2846.method821(0.0F, 856244488);
                        this.field2846.method821((float) var43 * var13 + var40, 856244488);
                        this.field2846.method821((float) var43 * var14 + var41, 856244488);
                        this.field2846.method821((float) var43 * var15 + var42, 856244488);
                        this.field2846.method184(var36, -120);
                        this.field2846.method184(var37, -100);
                        this.field2846.method184(var38, -75);
                        this.field2846.method184(var39, -123);
                        this.field2846.method821(1.0F, 856244488);
                        this.field2846.method821(1.0F, 856244488);
                        this.field2846.method821((float) var43 * var10 + var40, 856244488);
                        this.field2846.method821((float) var43 * var11 + var41, 856244488);
                        this.field2846.method821((float) var43 * var12 + var42, 856244488);
                        this.field2846.method184(var36, -124);
                        this.field2846.method184(var37, -81);
                        this.field2846.method184(var38, -50);
                        this.field2846.method184(var39, -119);
                        this.field2846.method821(0.0F, 856244488);
                        this.field2846.method821(1.0F, 856244488);
                        this.field2846.method821((float) var43 * var16 + var40, 856244488);
                        this.field2846.method821((float) var43 * var17 + var41, 856244488);
                        this.field2846.method821((float) var43 * var18 + var42, 856244488);
                        this.field2846.method184(var36, -58);
                        this.field2846.method184(var37, -112);
                        this.field2846.method184(var38, -121);
                        this.field2846.method184(var39, -81);
                    }
                    if (this.field2860[var19] > 64) {
                        int var22 = this.field2860[var19] - 64 - 1;
                        for (int var23 = this.field2859[var22] - 1; var23 >= 0; var23--) {
                            class387 var24 = this.field2858[var22][var23];
                            int var25 = var24.field5407;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field5402 >> 12);
                            float var31 = (float) (var24.field5411 >> 12);
                            float var32 = (float) (var24.field5404 >> 12);
                            int var33 = var24.field5406 >> 12;
                            this.field2846.method821(0.0F, 856244488);
                            this.field2846.method821(0.0F, 856244488);
                            this.field2846.method821((float) (-var33) * var10 + var30, 856244488);
                            this.field2846.method821((float) (-var33) * var11 + var31, 856244488);
                            this.field2846.method821((float) (-var33) * var12 + var32, 856244488);
                            this.field2846.method184(var26, -35);
                            this.field2846.method184(var27, -36);
                            this.field2846.method184(var28, -62);
                            this.field2846.method184(var29, -83);
                            this.field2846.method821(1.0F, 856244488);
                            this.field2846.method821(0.0F, 856244488);
                            this.field2846.method821((float) var33 * var13 + var30, 856244488);
                            this.field2846.method821((float) var33 * var14 + var31, 856244488);
                            this.field2846.method821((float) var33 * var15 + var32, 856244488);
                            this.field2846.method184(var26, -125);
                            this.field2846.method184(var27, -34);
                            this.field2846.method184(var28, -107);
                            this.field2846.method184(var29, -118);
                            this.field2846.method821(1.0F, 856244488);
                            this.field2846.method821(1.0F, 856244488);
                            this.field2846.method821((float) var33 * var10 + var30, 856244488);
                            this.field2846.method821((float) var33 * var11 + var31, 856244488);
                            this.field2846.method821((float) var33 * var12 + var32, 856244488);
                            this.field2846.method184(var26, -79);
                            this.field2846.method184(var27, -111);
                            this.field2846.method184(var28, -73);
                            this.field2846.method184(var29, -98);
                            this.field2846.method821(0.0F, 856244488);
                            this.field2846.method821(1.0F, 856244488);
                            this.field2846.method821((float) var33 * var16 + var30, 856244488);
                            this.field2846.method821((float) var33 * var17 + var31, 856244488);
                            this.field2846.method821((float) var33 * var18 + var32, 856244488);
                            this.field2846.method184(var26, -81);
                            this.field2846.method184(var27, -120);
                            this.field2846.method184(var28, -62);
                            this.field2846.method184(var29, -99);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field2860[var44] <= 64 ? this.field2860[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class387 var59 = this.field2856[var44][var46];
                        int var60 = var59.field5407;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field5402 >> 12);
                        float var66 = (float) (var59.field5411 >> 12);
                        float var67 = (float) (var59.field5404 >> 12);
                        int var68 = var59.field5406 >> 12;
                        this.field2846.method820((byte) 89, 0.0F);
                        this.field2846.method820((byte) 125, 0.0F);
                        this.field2846.method820((byte) 125, (float) (-var68) * var10 + var65);
                        this.field2846.method820((byte) 96, (float) (-var68) * var11 + var66);
                        this.field2846.method820((byte) 86, (float) (-var68) * var12 + var67);
                        this.field2846.method184(var61, -55);
                        this.field2846.method184(var62, -119);
                        this.field2846.method184(var63, -108);
                        this.field2846.method184(var64, -82);
                        this.field2846.method820((byte) 88, 1.0F);
                        this.field2846.method820((byte) 110, 0.0F);
                        this.field2846.method820((byte) 106, (float) var68 * var13 + var65);
                        this.field2846.method820((byte) 115, (float) var68 * var14 + var66);
                        this.field2846.method820((byte) 105, (float) var68 * var15 + var67);
                        this.field2846.method184(var61, -113);
                        this.field2846.method184(var62, -114);
                        this.field2846.method184(var63, -108);
                        this.field2846.method184(var64, -112);
                        this.field2846.method820((byte) 94, 1.0F);
                        this.field2846.method820((byte) 109, 1.0F);
                        this.field2846.method820((byte) 109, (float) var68 * var10 + var65);
                        this.field2846.method820((byte) 120, (float) var68 * var11 + var66);
                        this.field2846.method820((byte) 101, (float) var68 * var12 + var67);
                        this.field2846.method184(var61, -45);
                        this.field2846.method184(var62, -75);
                        this.field2846.method184(var63, -37);
                        this.field2846.method184(var64, -127);
                        this.field2846.method820((byte) 103, 0.0F);
                        this.field2846.method820((byte) 85, 1.0F);
                        this.field2846.method820((byte) 121, (float) var68 * var16 + var65);
                        this.field2846.method820((byte) 75, (float) var68 * var17 + var66);
                        this.field2846.method820((byte) 97, (float) var68 * var18 + var67);
                        this.field2846.method184(var61, -122);
                        this.field2846.method184(var62, -80);
                        this.field2846.method184(var63, -29);
                        this.field2846.method184(var64, -35);
                    }
                    if (this.field2860[var44] > 64) {
                        int var47 = this.field2860[var44] - 1 - 64;
                        for (int var48 = this.field2859[var47] - 1; var48 >= 0; var48--) {
                            class387 var49 = this.field2858[var47][var48];
                            int var50 = var49.field5407;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field5402 >> 12);
                            float var56 = (float) (var49.field5411 >> 12);
                            float var57 = (float) (var49.field5404 >> 12);
                            int var58 = var49.field5406 >> 12;
                            this.field2846.method820((byte) 99, 0.0F);
                            this.field2846.method820((byte) 107, 0.0F);
                            this.field2846.method820((byte) 119, (float) (-var58) * var10 + var55);
                            this.field2846.method820((byte) 87, (float) (-var58) * var11 + var56);
                            this.field2846.method820((byte) 125, (float) (-var58) * var12 + var57);
                            this.field2846.method184(var51, -78);
                            this.field2846.method184(var52, -72);
                            this.field2846.method184(var53, -63);
                            this.field2846.method184(var54, -97);
                            this.field2846.method820((byte) 86, 1.0F);
                            this.field2846.method820((byte) 118, 0.0F);
                            this.field2846.method820((byte) 109, (float) var58 * var13 + var55);
                            this.field2846.method820((byte) 124, (float) var58 * var14 + var56);
                            this.field2846.method820((byte) 78, (float) var58 * var15 + var57);
                            this.field2846.method184(var51, -98);
                            this.field2846.method184(var52, -121);
                            this.field2846.method184(var53, -92);
                            this.field2846.method184(var54, -32);
                            this.field2846.method820((byte) 80, 1.0F);
                            this.field2846.method820((byte) 123, 1.0F);
                            this.field2846.method820((byte) 116, (float) var58 * var10 + var55);
                            this.field2846.method820((byte) 104, (float) var58 * var11 + var56);
                            this.field2846.method820((byte) 90, (float) var58 * var12 + var57);
                            this.field2846.method184(var51, -46);
                            this.field2846.method184(var52, -81);
                            this.field2846.method184(var53, -35);
                            this.field2846.method184(var54, -121);
                            this.field2846.method820((byte) 98, 0.0F);
                            this.field2846.method820((byte) 110, 1.0F);
                            this.field2846.method820((byte) 119, (float) var58 * var16 + var55);
                            this.field2846.method820((byte) 111, (float) var58 * var17 + var56);
                            this.field2846.method820((byte) 109, (float) var58 * var18 + var57);
                            this.field2846.method184(var51, -126);
                            this.field2846.method184(var52, -87);
                            this.field2846.method184(var53, -52);
                            this.field2846.method184(var54, -111);
                        }
                    }
                }
            }
        }
        if (this.field2846.field330 != 0) {
            this.field2853.method1471((byte) 100, 24, this.field2846.field330, this.field2846.field279);
            arg0.method2172(this.field2851, 32886, this.field2852, this.field2854, null);
            arg0.method2067(0, this.field2846.field330 / 24, (byte) -75, 7);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static void method1329(byte arg0) {
        int var1 = 70 % ((-arg0 - 60) / 38);
        field2845 = null;
        field2850 = null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B[BZ)V")
    public static final void method1330(byte arg0, byte[] arg1, boolean arg2) {
        if (class533.field7471 == null) {
            class533.field7471 = new class26(20000);
        }
        int var3 = 127 / ((4 - arg0) / 54);
        field2841++;
        class533.field7471.method155(0, arg1.length, arg1, 75);
        if (!arg2) {
            return;
        }
        class603.method3539(class533.field7471.field279, -3);
        class571.field8083 = new class183[class724.field10198];
        int var4 = 0;
        for (int var5 = class639.field9087; var5 <= class610.field8681; var5++) {
            class183 var6 = class50.method340(var5, (byte) -115);
            if (var6 != null) {
                class571.field8083[var4++] = var6;
            }
        }
        class539.field7543 = false;
        class387.field5414 = class224.method1457((byte) -62);
        class533.field7471 = null;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(Lep;I)V")
    private final void method1331(class371 arg0, int arg1) {
        arg0.method2192(99, true);
        field2839++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class303.field3933 != arg0.field5046) {
            arg0.method2132(class303.field3933);
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(Lep;I)V")
    public final void method1332(class371 arg0, int arg1) {
        field2842++;
        this.field2853 = arg0.method2144(196584, true, null, 24, -27);
        this.field2854 = new class329(this.field2853, 5126, 2, 0);
        this.field2852 = new class329(this.field2853, 5126, 3, 8);
        if (arg1 != -28441) {
            this.method1328(null, 57, false);
        }
        this.field2851 = new class329(this.field2853, 5121, 4, 20);
    }
}
