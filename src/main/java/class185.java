import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class185 {

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[F")
    private float[] field2837 = new float[16];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lsd;")
    private class268 field2835 = new class268(786336);

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private int field2845 = class347.method2236((byte) -16, 1600);

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[I")
    private int[] field2850 = new int[8191];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
    private int[] field2848 = new int[64];

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[[Lij;")
    private class471[][] field2847 = new class471[1600][64];

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "[[Lij;")
    private class471[][] field2849 = new class471[64][768];

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    private int field2851 = 0;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
    private int[] field2852 = new int[1600];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljp;")
    public static class55 field2830 = new class55(18, 14);

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lrp;")
    public static class277 field2836 = new class277(0);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lpu;")
    public static class179 field2838 = new class179("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2842 = new String[5];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lpu;")
    public static class179 field2840 = new class179("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lql;")
    private class121 field2841;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lks;")
    public static class23 field2846;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lpp;")
    private class387 field2839;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lpp;")
    private class387 field2843;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lpp;")
    private class387 field2844;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ltt;Z)V")
    public final void method1289(class249 arg0, boolean arg1) {
        this.field2841 = arg0.method1735(null, arg1, 24, 196584, 32);
        field2834++;
        this.field2844 = new class387(this.field2841, 5126, 2, 0);
        this.field2843 = new class387(this.field2841, 5126, 3, 8);
        this.field2839 = new class387(this.field2841, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1290(int arg0) {
        field2842 = null;
        field2838 = null;
        field2836 = null;
        field2846 = null;
        if (arg0 > -37) {
            field2846 = null;
        }
        field2830 = null;
        field2840 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lvm;Ltt;B)V")
    public final void method1291(class320 arg0, class249 arg1, byte arg2) {
        field2832++;
        int var4 = -55 / ((arg2 + 12) / 49);
        if (arg1.field3948 == null) {
            return;
        }
        this.method1294(arg1, -1176);
        float var5 = arg1.field3948.field7214;
        float var6 = arg1.field3948.field7221;
        float var7 = arg1.field3948.field7237;
        float var8 = arg1.field3948.field7229;
        try {
            if (arg0.field4853) {
                int var9 = arg0.field4848 - arg0.field4849;
                int var10;
                if (var9 + 2 > 1600) {
                    var10 = class347.method2236((byte) -16, var9) + 1 - this.field2845;
                    var9 = (var9 >> var10) + 2;
                } else {
                    var9 += 2;
                    var10 = 0;
                }
                class354 var11 = arg0.field4847.field3169;
                class354 var12 = var11.field5238;
                int var13 = -2;
                boolean var14 = true;
                boolean var15 = true;
                while (var11 != var12) {
                    this.field2851 = 0;
                    for (int var16 = 0; var16 < var9; var16++) {
                        this.field2852[var16] = 0;
                    }
                    for (int var17 = 0; var17 < 64; var17++) {
                        this.field2848[var17] = 0;
                    }
                    while (var11 != var12) {
                        class471 var18 = (class471) var12;
                        if (var15) {
                            var15 = false;
                            var14 = var18.field6914;
                            var13 = var18.field6918;
                        } else if (var18.field6918 != var13 || var14 != var18.field6914) {
                            var15 = true;
                            break;
                        }
                        int var19 = (int) ((float) (var18.field6920 >> 12) * var7 + (float) (var18.field6919 >> 12) * var6 + (float) (var18.field6911 >> 12) * var5 + var8) - arg0.field4849 >> var10;
                        if (var19 < 1600) {
                            if (this.field2852[var19] >= 64) {
                                label192: {
                                    if (this.field2852[var19] == 64) {
                                        if (this.field2851 == 64) {
                                            break label192;
                                        }
                                        this.field2852[var19] += this.field2851++ + 1;
                                    }
                                    this.field2849[this.field2852[var19] - 1 - 64][this.field2848[this.field2852[var19] - 64 - 1]++] = var18;
                                }
                            } else {
                                this.field2847[var19][this.field2852[var19]++] = var18;
                            }
                        }
                        var12 = var12.field5238;
                    }
                    if (var13 >= 0) {
                        arg1.method1749(25752, arg1.field3903.method2776(var13, 64));
                        arg1.method1734(-119, arg1.field4588.method938(28923, var13).field6158);
                    } else {
                        arg1.method1749(25752, null);
                    }
                    if (var14 && class33.field396 != arg1.field3965) {
                        arg1.method502(class33.field396);
                    } else if (arg1.field3965 != 1.0F) {
                        arg1.method502(1.0F);
                    }
                    this.method1293(var9, arg1, 1);
                }
            } else {
                int var20 = 0;
                int var21 = Integer.MAX_VALUE;
                int var22 = 0;
                class354 var23 = arg0.field4847.field3169;
                for (class354 var24 = var23.field5238; var24 != var23; var24 = var24.field5238) {
                    class471 var25 = (class471) var24;
                    int var26 = (int) ((float) (var25.field6920 >> 12) * var7 + (float) (var25.field6919 >> 12) * var6 + (float) (var25.field6911 >> 12) * var5 + var8);
                    this.field2850[var20++] = var26;
                    if (var22 < var26) {
                        var22 = var26;
                    }
                    if (var21 > var26) {
                        var21 = var26;
                    }
                }
                int var27 = var22 - var21;
                int var28;
                if ((var27 + 2) > 1600) {
                    var28 = class347.method2236((byte) -16, var27) + 1 - this.field2845;
                    var27 = (var27 >> var28) + 2;
                } else {
                    var27 += 2;
                    var28 = 0;
                }
                class354 var29 = var23.field5238;
                int var30 = 0;
                int var31 = -2;
                boolean var32 = true;
                boolean var33 = true;
                while (var23 != var29) {
                    this.field2851 = 0;
                    for (int var34 = 0; var34 < var27; var34++) {
                        this.field2852[var34] = 0;
                    }
                    for (int var35 = 0; var35 < 64; var35++) {
                        this.field2848[var35] = 0;
                    }
                    while (var23 != var29) {
                        class471 var36 = (class471) var29;
                        if (var33) {
                            var32 = var36.field6914;
                            var31 = var36.field6918;
                            var33 = false;
                        }
                        if (var30 > 0 && (var36.field6918 != var31 || var32 != var36.field6914)) {
                            var33 = true;
                            break;
                        }
                        int var37 = this.field2850[var30++] - var21 >> var28;
                        if (var37 < 1600) {
                            if (this.field2852[var37] >= 64) {
                                label142: {
                                    if (this.field2852[var37] == 64) {
                                        if (this.field2851 == 64) {
                                            break label142;
                                        }
                                        this.field2852[var37] += this.field2851++ + 1;
                                    }
                                    this.field2849[this.field2852[var37] - 1 - 64][this.field2848[this.field2852[var37] - 1 - 64]++] = var36;
                                }
                            } else {
                                this.field2847[var37][this.field2852[var37]++] = var36;
                            }
                        }
                        var29 = var29.field5238;
                    }
                    if (var31 < 0) {
                        arg1.method1749(25752, null);
                    } else {
                        arg1.method1749(25752, arg1.field3903.method2776(var31, 64));
                        arg1.method1734(-122, arg1.field4588.method938(28923, var31).field6158);
                    }
                    if (var32 && class33.field396 != arg1.field3965) {
                        arg1.method502(class33.field396);
                    } else if (arg1.field3965 != 1.0F) {
                        arg1.method502(1.0F);
                    }
                    this.method1293(var27, arg1, 1);
                }
            }
        } catch (Exception var38) {
        }
        this.method1292(arg1, 16385);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ltt;I)V")
    private final void method1292(class249 arg0, int arg1) {
        arg0.method1706(-74, true);
        field2833++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class33.field396 != arg0.field3965) {
            arg0.method502(class33.field396);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILtt;I)V")
    private final void method1293(int arg0, class249 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field2837, 0);
        field2829++;
        float var4 = this.field2837[0];
        float var5 = this.field2837[4];
        float var6 = this.field2837[8];
        float var7 = this.field2837[arg2];
        float var8 = this.field2837[5];
        float var9 = this.field2837[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field2835.field2982 = 0;
        if (arg1.field3990) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field2852[var19] > 64 ? 64 : this.field2852[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class471 var34 = this.field2847[var19][var21];
                        int var35 = var34.field6908;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6911 >> 12);
                        float var41 = (float) (var34.field6919 >> 12);
                        float var42 = (float) (var34.field6920 >> 12);
                        int var43 = var34.field6910 >> 12;
                        this.field2835.method1857(false, 0.0F);
                        this.field2835.method1857(false, 0.0F);
                        this.field2835.method1857(false, (float) (-var43) * var10 + var40);
                        this.field2835.method1857(false, (float) (-var43) * var11 + var41);
                        this.field2835.method1857(false, (float) (-var43) * var12 + var42);
                        this.field2835.method1381(var36, (byte) 82);
                        this.field2835.method1381(var37, (byte) 121);
                        this.field2835.method1381(var38, (byte) 120);
                        this.field2835.method1381(var39, (byte) 83);
                        this.field2835.method1857(false, 1.0F);
                        this.field2835.method1857(false, 0.0F);
                        this.field2835.method1857(false, (float) var43 * var13 + var40);
                        this.field2835.method1857(false, (float) var43 * var14 + var41);
                        this.field2835.method1857(false, (float) var43 * var15 + var42);
                        this.field2835.method1381(var36, (byte) 126);
                        this.field2835.method1381(var37, (byte) 96);
                        this.field2835.method1381(var38, (byte) 101);
                        this.field2835.method1381(var39, (byte) 113);
                        this.field2835.method1857(false, 1.0F);
                        this.field2835.method1857(false, 1.0F);
                        this.field2835.method1857(false, (float) var43 * var10 + var40);
                        this.field2835.method1857(false, (float) var43 * var11 + var41);
                        this.field2835.method1857(false, (float) var43 * var12 + var42);
                        this.field2835.method1381(var36, (byte) 95);
                        this.field2835.method1381(var37, (byte) 96);
                        this.field2835.method1381(var38, (byte) 88);
                        this.field2835.method1381(var39, (byte) 92);
                        this.field2835.method1857(false, 0.0F);
                        this.field2835.method1857(false, 1.0F);
                        this.field2835.method1857(false, (float) var43 * var16 + var40);
                        this.field2835.method1857(false, (float) var43 * var17 + var41);
                        this.field2835.method1857(false, (float) var43 * var18 + var42);
                        this.field2835.method1381(var36, (byte) 83);
                        this.field2835.method1381(var37, (byte) 83);
                        this.field2835.method1381(var38, (byte) 88);
                        this.field2835.method1381(var39, (byte) 96);
                    }
                    if (this.field2852[var19] > 64) {
                        int var22 = this.field2852[var19] - 64 - 1;
                        for (int var23 = this.field2848[var22] - 1; var23 >= 0; var23--) {
                            class471 var24 = this.field2849[var22][var23];
                            int var25 = var24.field6908;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6911 >> 12);
                            float var31 = (float) (var24.field6919 >> 12);
                            float var32 = (float) (var24.field6920 >> 12);
                            int var33 = var24.field6910 >> 12;
                            this.field2835.method1857(false, 0.0F);
                            this.field2835.method1857(false, 0.0F);
                            this.field2835.method1857(false, (float) (-var33) * var10 + var30);
                            this.field2835.method1857(false, (float) (-var33) * var11 + var31);
                            this.field2835.method1857(false, (float) (-var33) * var12 + var32);
                            this.field2835.method1381(var26, (byte) 117);
                            this.field2835.method1381(var27, (byte) 103);
                            this.field2835.method1381(var28, (byte) 121);
                            this.field2835.method1381(var29, (byte) 126);
                            this.field2835.method1857(false, 1.0F);
                            this.field2835.method1857(false, 0.0F);
                            this.field2835.method1857(false, (float) var33 * var13 + var30);
                            this.field2835.method1857(false, (float) var33 * var14 + var31);
                            this.field2835.method1857(false, (float) var33 * var15 + var32);
                            this.field2835.method1381(var26, (byte) 127);
                            this.field2835.method1381(var27, (byte) 121);
                            this.field2835.method1381(var28, (byte) 79);
                            this.field2835.method1381(var29, (byte) 86);
                            this.field2835.method1857(false, 1.0F);
                            this.field2835.method1857(false, 1.0F);
                            this.field2835.method1857(false, (float) var33 * var10 + var30);
                            this.field2835.method1857(false, (float) var33 * var11 + var31);
                            this.field2835.method1857(false, (float) var33 * var12 + var32);
                            this.field2835.method1381(var26, (byte) 123);
                            this.field2835.method1381(var27, (byte) 118);
                            this.field2835.method1381(var28, (byte) 117);
                            this.field2835.method1381(var29, (byte) 86);
                            this.field2835.method1857(false, 0.0F);
                            this.field2835.method1857(false, 1.0F);
                            this.field2835.method1857(false, (float) var33 * var16 + var30);
                            this.field2835.method1857(false, (float) var33 * var17 + var31);
                            this.field2835.method1857(false, (float) var33 * var18 + var32);
                            this.field2835.method1381(var26, (byte) 100);
                            this.field2835.method1381(var27, (byte) 100);
                            this.field2835.method1381(var28, (byte) 79);
                            this.field2835.method1381(var29, (byte) 105);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field2852[var44] > 64 ? 64 : this.field2852[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class471 var59 = this.field2847[var44][var46];
                        int var60 = var59.field6908;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6911 >> 12);
                        float var66 = (float) (var59.field6919 >> 12);
                        float var67 = (float) (var59.field6920 >> 12);
                        int var68 = var59.field6910 >> 12;
                        this.field2835.method1859(0.0F, 0);
                        this.field2835.method1859(0.0F, 0);
                        this.field2835.method1859((float) (-var68) * var10 + var65, 0);
                        this.field2835.method1859((float) (-var68) * var11 + var66, 0);
                        this.field2835.method1859((float) (-var68) * var12 + var67, 0);
                        this.field2835.method1381(var61, (byte) 108);
                        this.field2835.method1381(var62, (byte) 86);
                        this.field2835.method1381(var63, (byte) 80);
                        this.field2835.method1381(var64, (byte) 100);
                        this.field2835.method1859(1.0F, arg2 - 1);
                        this.field2835.method1859(0.0F, 0);
                        this.field2835.method1859((float) var68 * var13 + var65, arg2 ^ 0x1);
                        this.field2835.method1859((float) var68 * var14 + var66, 0);
                        this.field2835.method1859((float) var68 * var15 + var67, 0);
                        this.field2835.method1381(var61, (byte) 82);
                        this.field2835.method1381(var62, (byte) 84);
                        this.field2835.method1381(var63, (byte) 108);
                        this.field2835.method1381(var64, (byte) 99);
                        this.field2835.method1859(1.0F, arg2 ^ 0x1);
                        this.field2835.method1859(1.0F, 0);
                        this.field2835.method1859((float) var68 * var10 + var65, 0);
                        this.field2835.method1859((float) var68 * var11 + var66, 0);
                        this.field2835.method1859((float) var68 * var12 + var67, 0);
                        this.field2835.method1381(var61, (byte) 127);
                        this.field2835.method1381(var62, (byte) 121);
                        this.field2835.method1381(var63, (byte) 108);
                        this.field2835.method1381(var64, (byte) 117);
                        this.field2835.method1859(0.0F, 0);
                        this.field2835.method1859(1.0F, 0);
                        this.field2835.method1859((float) var68 * var16 + var65, arg2 ^ 0x1);
                        this.field2835.method1859((float) var68 * var17 + var66, 0);
                        this.field2835.method1859((float) var68 * var18 + var67, 0);
                        this.field2835.method1381(var61, (byte) 93);
                        this.field2835.method1381(var62, (byte) 106);
                        this.field2835.method1381(var63, (byte) 121);
                        this.field2835.method1381(var64, (byte) 83);
                    }
                    if (this.field2852[var44] > 64) {
                        int var47 = this.field2852[var44] - 64 - 1;
                        for (int var48 = this.field2848[var47] - 1; var48 >= 0; var48--) {
                            class471 var49 = this.field2849[var47][var48];
                            int var50 = var49.field6908;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6911 >> 12);
                            float var56 = (float) (var49.field6919 >> 12);
                            float var57 = (float) (var49.field6920 >> 12);
                            int var58 = var49.field6910 >> 12;
                            this.field2835.method1859(0.0F, 0);
                            this.field2835.method1859(0.0F, arg2 - 1);
                            this.field2835.method1859((float) (-var58) * var10 + var55, 0);
                            this.field2835.method1859((float) (-var58) * var11 + var56, arg2 + -1);
                            this.field2835.method1859((float) (-var58) * var12 + var57, arg2 ^ 0x1);
                            this.field2835.method1381(var51, (byte) 83);
                            this.field2835.method1381(var52, (byte) 82);
                            this.field2835.method1381(var53, (byte) 102);
                            this.field2835.method1381(var54, (byte) 122);
                            this.field2835.method1859(1.0F, 0);
                            this.field2835.method1859(0.0F, 0);
                            this.field2835.method1859((float) var58 * var13 + var55, 0);
                            this.field2835.method1859((float) var58 * var14 + var56, 0);
                            this.field2835.method1859((float) var58 * var15 + var57, arg2 ^ 0x1);
                            this.field2835.method1381(var51, (byte) 98);
                            this.field2835.method1381(var52, (byte) 96);
                            this.field2835.method1381(var53, (byte) 92);
                            this.field2835.method1381(var54, (byte) 94);
                            this.field2835.method1859(1.0F, 0);
                            this.field2835.method1859(1.0F, 0);
                            this.field2835.method1859((float) var58 * var10 + var55, 0);
                            this.field2835.method1859((float) var58 * var11 + var56, 0);
                            this.field2835.method1859((float) var58 * var12 + var57, arg2 ^ 0x1);
                            this.field2835.method1381(var51, (byte) 104);
                            this.field2835.method1381(var52, (byte) 106);
                            this.field2835.method1381(var53, (byte) 115);
                            this.field2835.method1381(var54, (byte) 86);
                            this.field2835.method1859(0.0F, 0);
                            this.field2835.method1859(1.0F, 0);
                            this.field2835.method1859((float) var58 * var16 + var55, 0);
                            this.field2835.method1859((float) var58 * var17 + var56, 0);
                            this.field2835.method1859((float) var58 * var18 + var57, 0);
                            this.field2835.method1381(var51, (byte) 100);
                            this.field2835.method1381(var52, (byte) 86);
                            this.field2835.method1381(var53, (byte) 123);
                            this.field2835.method1381(var54, (byte) 88);
                        }
                    }
                }
            }
        }
        if (this.field2835.field2982 != 0) {
            this.field2841.method903(this.field2835.field2982, 24, 11907, this.field2835.field2973);
            arg1.method1748(this.field2839, this.field2844, null, 0, this.field2843);
            arg1.method1707(true, this.field2835.field2982 / 24, 0, 7);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Ltt;I)V")
    private final void method1294(class249 arg0, int arg1) {
        if (arg1 != -1176) {
            field2842 = null;
        }
        class33.field396 = arg0.field3965;
        field2831++;
        arg0.method1724(-28440);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1706(-109, false);
        arg0.method1725(-125, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
