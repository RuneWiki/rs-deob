import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class539 {

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "[F")
    private float[] field7883 = new float[16];

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Lhi;")
    private class141 field7878 = new class141(786336);

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    private int field7889 = class25.method164((byte) -50, 1600);

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "[I")
    private int[] field7893 = new int[1600];

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "[[Lrl;")
    private class517[][] field7892 = new class517[1600][64];

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "[[Lrl;")
    private class517[][] field7894 = new class517[64][768];

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "[I")
    private int[] field7895 = new int[64];

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "[I")
    private int[] field7896 = new int[8191];

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    private int field7897 = 0;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "[B")
    public static byte[] field7882 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lkn;")
    public static class530 field7876 = new class530("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
    public static int[] field7886 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Ltg;")
    private class157 field7891;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lgn;")
    public static class504 field7885;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Lff;")
    private class9 field7887;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lff;")
    private class9 field7888;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Lff;")
    private class9 field7890;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIIII)V", line = 3)
    public static final void method3166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 >= class392.field5514 && class518.field7624 >= arg1 && arg0 >= class392.field5514 && class518.field7624 >= arg0 && arg9 >= class392.field5514 && arg9 <= class518.field7624 && arg4 >= class392.field5514 && class518.field7624 >= arg4 && arg2 >= class303.field4422 && arg2 <= class353.field5062 && arg3 >= class303.field4422 && arg3 <= class353.field5062 && arg5 >= class303.field4422 && class353.field5062 >= arg5 && class303.field4422 <= arg6 && arg6 <= class353.field5062) {
            class342.method2036(arg1, arg9, arg6, arg4, arg5, arg2, -1, arg0, arg8, arg3);
        } else {
            class84.method611(arg0, arg2, arg6, arg1, arg4, arg5, arg9, 0, arg3, arg8);
        }
        field7875++;
        if (arg7 != -138859848) {
            field7886 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILih;)V", line = 20)
    public final void method3167(int arg0, class503 arg1) {
        field7880++;
        int var3 = -72 / ((-arg0 - 15) / 35);
        this.field7891 = arg1.method2923(24, true, 0, 196584, null);
        this.field7888 = new class9(this.field7891, 5126, 2, 0);
        this.field7887 = new class9(this.field7891, 5126, 3, 8);
        this.field7890 = new class9(this.field7891, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLih;)V", line = 35)
    private final void method3168(byte arg0, class503 arg1) {
        class261.field3857 = arg1.field7344;
        field7873++;
        arg1.method2986(-91);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2933(false, false);
        if (arg0 == 22) {
            arg1.method2995(-2, (byte) -127);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(ILih;)V", line = 53)
    private final void method3169(int arg0, class503 arg1) {
        arg1.method2933(true, false);
        field7877++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (arg0 == 14001 && class261.field3857 != arg1.field7344) {
            arg1.method299(class261.field3857);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 70)
    public static void method3170(byte arg0) {
        if (arg0 != -76) {
            method3173(81, (byte) -4, -60, -125);
        }
        field7876 = null;
        field7885 = null;
        field7882 = null;
        field7886 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lsj;ILih;)V", line = 88)
    public final void method3171(class324 arg0, int arg1, class503 arg2) {
        field7874++;
        if (arg2.field7360 == null) {
            return;
        }
        this.method3168((byte) 22, arg2);
        if (arg1 != 362631032) {
            this.field7890 = null;
        }
        float var4 = arg2.field7360.field4079;
        float var5 = arg2.field7360.field4061;
        float var6 = arg2.field7360.field4069;
        float var7 = arg2.field7360.field4091;
        try {
            int var10002;
            int var10004;
            class517[] var38;
            if (arg0.field4731) {
                int var26 = arg0.field4730 - arg0.field4732;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class25.method164((byte) -50, var26) + 1 - this.field7889;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class218 var28 = arg0.field4726.field228;
                class218 var29 = var28.field3163;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field7897 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7893[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7895[var34] = 0;
                    }
                    while (var28 != var29) {
                        class517 var35 = (class517) var29;
                        if (var32) {
                            var30 = var35.field7607;
                            var32 = false;
                            var31 = var35.field7611;
                        } else if (var35.field7607 != var30 || var35.field7611 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field7615 >> 12) * var6 + (float) (var35.field7616 >> 12) * var5 + (float) (var35.field7605 >> 12) * var4 + var7) - arg0.field4732 >> var27;
                        if (var36 < 1600) {
                            if (this.field7893[var36] >= 64) {
                                label145: {
                                    if (this.field7893[var36] == 64) {
                                        if (this.field7897 == 64) {
                                            break label145;
                                        }
                                        this.field7893[var36] += this.field7897++ + 1;
                                    }
                                    var38 = this.field7894[this.field7893[var36] - 1 - 64];
                                    var10002 = this.field7893[var36] - 65;
                                    var10004 = this.field7895[this.field7893[var36] - 65];
                                    this.field7895[var10002] = this.field7895[this.field7893[var36] - 65] + 1;
                                    var38[var10004] = var35;
                                }
                            } else {
                                this.field7892[var36][this.field7893[var36]++] = var35;
                            }
                        }
                        var29 = var29.field3163;
                    }
                    if (var30 < 0) {
                        arg2.method2968(null, -122);
                    } else {
                        arg2.method2968(arg2.field7291.method2404(-126, var30), -127);
                        arg2.method2999(arg2.field4246.method83(var30, 113).field3203, 99);
                    }
                    if (var31 && class261.field3857 != arg2.field7344) {
                        arg2.method299(class261.field3857);
                    } else if (arg2.field7344 != 1.0F) {
                        arg2.method299(1.0F);
                    }
                    this.method3172(var26, arg2, (byte) -112);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class218 var11 = arg0.field4726.field228;
                for (class218 var12 = var11.field3163; var12 != var11; var12 = var12.field3163) {
                    class517 var13 = (class517) var12;
                    int var14 = (int) ((float) (var13.field7615 >> 12) * var6 + (float) (var13.field7616 >> 12) * var5 + (float) (var13.field7605 >> 12) * var4 + var7);
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    this.field7896[var8++] = var14;
                    if (var10 < var14) {
                        var10 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class25.method164((byte) -50, var15) + 1 - this.field7889;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var16 = 0;
                    var15 += 2;
                }
                class218 var17 = var11.field3163;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field7897 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field7893[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field7895[var23] = 0;
                    }
                    while (var11 != var17) {
                        class517 var24 = (class517) var17;
                        if (var21) {
                            var20 = var24.field7611;
                            var21 = false;
                            var19 = var24.field7607;
                        }
                        if (var18 > 0 && (var24.field7607 != var19 || var24.field7611 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field7896[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field7893[var25] < 64) {
                                this.field7892[var25][this.field7893[var25]++] = var24;
                            } else {
                                label190: {
                                    if (this.field7893[var25] == 64) {
                                        if (this.field7897 == 64) {
                                            break label190;
                                        }
                                        this.field7893[var25] += this.field7897++ + 1;
                                    }
                                    var38 = this.field7894[this.field7893[var25] - 64 - 1];
                                    var10002 = this.field7893[var25] - 65;
                                    var10004 = this.field7895[this.field7893[var25] - 65];
                                    this.field7895[var10002] = this.field7895[this.field7893[var25] - 65] + 1;
                                    var38[var10004] = var24;
                                }
                            }
                        }
                        var17 = var17.field3163;
                    }
                    if (var19 >= 0) {
                        arg2.method2968(arg2.field7291.method2404(arg1 ^ 0xEA62B0BC, var19), -97);
                        arg2.method2999(arg2.field4246.method83(var19, 57).field3203, 90);
                    } else {
                        arg2.method2968(null, -105);
                    }
                    if (var20 && class261.field3857 != arg2.field7344) {
                        arg2.method299(class261.field3857);
                    } else if (arg2.field7344 != 1.0F) {
                        arg2.method299(1.0F);
                    }
                    this.method3172(var15, arg2, (byte) -119);
                }
            }
        } catch (Exception var37) {
        }
        this.method3169(14001, arg2);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILih;B)V", line = 373)
    private final void method3172(int arg0, class503 arg1, byte arg2) {
        OpenGL.glGetFloatv(2982, this.field7883, 0);
        field7881++;
        float var4 = this.field7883[0];
        float var5 = this.field7883[4];
        float var6 = this.field7883[8];
        float var7 = this.field7883[1];
        float var8 = this.field7883[5];
        float var9 = this.field7883[9];
        float var10 = var4 + var7;
        if (arg2 > -108) {
            method3173(4, (byte) 54, -58, -76);
        }
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7878.field5665 = 0;
        float var18 = var9 - var6;
        if (arg1.field7340) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field7893[var44] <= 64 ? this.field7893[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class517 var59 = this.field7892[var44][var46];
                        int var60 = var59.field7606;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7605 >> 12);
                        float var66 = (float) (var59.field7616 >> 12);
                        float var67 = (float) (var59.field7615 >> 12);
                        int var68 = var59.field7610 >> 12;
                        this.field7878.method886(0, 0.0F);
                        this.field7878.method886(0, 0.0F);
                        this.field7878.method886(0, (float) (-var68) * var10 + var65);
                        this.field7878.method886(0, (float) (-var68) * var11 + var66);
                        this.field7878.method886(0, (float) (-var68) * var12 + var67);
                        this.field7878.method2376((byte) 122, var61);
                        this.field7878.method2376((byte) 122, var62);
                        this.field7878.method2376((byte) 122, var63);
                        this.field7878.method2376((byte) 122, var64);
                        this.field7878.method886(0, 1.0F);
                        this.field7878.method886(0, 0.0F);
                        this.field7878.method886(0, (float) var68 * var13 + var65);
                        this.field7878.method886(0, (float) var68 * var14 + var66);
                        this.field7878.method886(0, (float) var68 * var15 + var67);
                        this.field7878.method2376((byte) 122, var61);
                        this.field7878.method2376((byte) 122, var62);
                        this.field7878.method2376((byte) 122, var63);
                        this.field7878.method2376((byte) 122, var64);
                        this.field7878.method886(0, 1.0F);
                        this.field7878.method886(0, 1.0F);
                        this.field7878.method886(0, (float) var68 * var10 + var65);
                        this.field7878.method886(0, (float) var68 * var11 + var66);
                        this.field7878.method886(0, (float) var68 * var12 + var67);
                        this.field7878.method2376((byte) 122, var61);
                        this.field7878.method2376((byte) 122, var62);
                        this.field7878.method2376((byte) 122, var63);
                        this.field7878.method2376((byte) 122, var64);
                        this.field7878.method886(0, 0.0F);
                        this.field7878.method886(0, 1.0F);
                        this.field7878.method886(0, (float) var68 * var16 + var65);
                        this.field7878.method886(0, (float) var68 * var17 + var66);
                        this.field7878.method886(0, (float) var68 * var18 + var67);
                        this.field7878.method2376((byte) 122, var61);
                        this.field7878.method2376((byte) 122, var62);
                        this.field7878.method2376((byte) 122, var63);
                        this.field7878.method2376((byte) 122, var64);
                    }
                    if (this.field7893[var44] > 64) {
                        int var47 = this.field7893[var44] - 1 - 64;
                        for (int var48 = this.field7895[var47] - 1; var48 >= 0; var48--) {
                            class517 var49 = this.field7894[var47][var48];
                            int var50 = var49.field7606;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7605 >> 12);
                            float var56 = (float) (var49.field7616 >> 12);
                            float var57 = (float) (var49.field7615 >> 12);
                            int var58 = var49.field7610 >> 12;
                            this.field7878.method886(0, 0.0F);
                            this.field7878.method886(0, 0.0F);
                            this.field7878.method886(0, (float) (-var58) * var10 + var55);
                            this.field7878.method886(0, (float) (-var58) * var11 + var56);
                            this.field7878.method886(0, (float) (-var58) * var12 + var57);
                            this.field7878.method2376((byte) 122, var51);
                            this.field7878.method2376((byte) 122, var52);
                            this.field7878.method2376((byte) 122, var53);
                            this.field7878.method2376((byte) 122, var54);
                            this.field7878.method886(0, 1.0F);
                            this.field7878.method886(0, 0.0F);
                            this.field7878.method886(0, (float) var58 * var13 + var55);
                            this.field7878.method886(0, (float) var58 * var14 + var56);
                            this.field7878.method886(0, (float) var58 * var15 + var57);
                            this.field7878.method2376((byte) 122, var51);
                            this.field7878.method2376((byte) 122, var52);
                            this.field7878.method2376((byte) 122, var53);
                            this.field7878.method2376((byte) 122, var54);
                            this.field7878.method886(0, 1.0F);
                            this.field7878.method886(0, 1.0F);
                            this.field7878.method886(0, (float) var58 * var10 + var55);
                            this.field7878.method886(0, (float) var58 * var11 + var56);
                            this.field7878.method886(0, (float) var58 * var12 + var57);
                            this.field7878.method2376((byte) 122, var51);
                            this.field7878.method2376((byte) 122, var52);
                            this.field7878.method2376((byte) 122, var53);
                            this.field7878.method2376((byte) 122, var54);
                            this.field7878.method886(0, 0.0F);
                            this.field7878.method886(0, 1.0F);
                            this.field7878.method886(0, (float) var58 * var16 + var55);
                            this.field7878.method886(0, (float) var58 * var17 + var56);
                            this.field7878.method886(0, (float) var58 * var18 + var57);
                            this.field7878.method2376((byte) 122, var51);
                            this.field7878.method2376((byte) 122, var52);
                            this.field7878.method2376((byte) 122, var53);
                            this.field7878.method2376((byte) 122, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field7893[var19] > 64 ? 64 : this.field7893[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class517 var34 = this.field7892[var19][var21];
                        int var35 = var34.field7606;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7605 >> 12);
                        float var41 = (float) (var34.field7616 >> 12);
                        float var42 = (float) (var34.field7615 >> 12);
                        int var43 = var34.field7610 >> 12;
                        this.field7878.method882(-1491643256, 0.0F);
                        this.field7878.method882(-1491643256, 0.0F);
                        this.field7878.method882(-1491643256, (float) (-var43) * var10 + var40);
                        this.field7878.method882(-1491643256, (float) (-var43) * var11 + var41);
                        this.field7878.method882(-1491643256, (float) (-var43) * var12 + var42);
                        this.field7878.method2376((byte) 122, var36);
                        this.field7878.method2376((byte) 122, var37);
                        this.field7878.method2376((byte) 122, var38);
                        this.field7878.method2376((byte) 122, var39);
                        this.field7878.method882(-1491643256, 1.0F);
                        this.field7878.method882(-1491643256, 0.0F);
                        this.field7878.method882(-1491643256, (float) var43 * var13 + var40);
                        this.field7878.method882(-1491643256, (float) var43 * var14 + var41);
                        this.field7878.method882(-1491643256, (float) var43 * var15 + var42);
                        this.field7878.method2376((byte) 122, var36);
                        this.field7878.method2376((byte) 122, var37);
                        this.field7878.method2376((byte) 122, var38);
                        this.field7878.method2376((byte) 122, var39);
                        this.field7878.method882(-1491643256, 1.0F);
                        this.field7878.method882(-1491643256, 1.0F);
                        this.field7878.method882(-1491643256, (float) var43 * var10 + var40);
                        this.field7878.method882(-1491643256, (float) var43 * var11 + var41);
                        this.field7878.method882(-1491643256, (float) var43 * var12 + var42);
                        this.field7878.method2376((byte) 122, var36);
                        this.field7878.method2376((byte) 122, var37);
                        this.field7878.method2376((byte) 122, var38);
                        this.field7878.method2376((byte) 122, var39);
                        this.field7878.method882(-1491643256, 0.0F);
                        this.field7878.method882(-1491643256, 1.0F);
                        this.field7878.method882(-1491643256, (float) var43 * var16 + var40);
                        this.field7878.method882(-1491643256, (float) var43 * var17 + var41);
                        this.field7878.method882(-1491643256, (float) var43 * var18 + var42);
                        this.field7878.method2376((byte) 122, var36);
                        this.field7878.method2376((byte) 122, var37);
                        this.field7878.method2376((byte) 122, var38);
                        this.field7878.method2376((byte) 122, var39);
                    }
                    if (this.field7893[var19] > 64) {
                        int var22 = this.field7893[var19] - 64 - 1;
                        for (int var23 = this.field7895[var22] - 1; var23 >= 0; var23--) {
                            class517 var24 = this.field7894[var22][var23];
                            int var25 = var24.field7606;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7605 >> 12);
                            float var31 = (float) (var24.field7616 >> 12);
                            float var32 = (float) (var24.field7615 >> 12);
                            int var33 = var24.field7610 >> 12;
                            this.field7878.method882(-1491643256, 0.0F);
                            this.field7878.method882(-1491643256, 0.0F);
                            this.field7878.method882(-1491643256, (float) (-var33) * var10 + var30);
                            this.field7878.method882(-1491643256, (float) (-var33) * var11 + var31);
                            this.field7878.method882(-1491643256, (float) (-var33) * var12 + var32);
                            this.field7878.method2376((byte) 122, var26);
                            this.field7878.method2376((byte) 122, var27);
                            this.field7878.method2376((byte) 122, var28);
                            this.field7878.method2376((byte) 122, var29);
                            this.field7878.method882(-1491643256, 1.0F);
                            this.field7878.method882(-1491643256, 0.0F);
                            this.field7878.method882(-1491643256, (float) var33 * var13 + var30);
                            this.field7878.method882(-1491643256, (float) var33 * var14 + var31);
                            this.field7878.method882(-1491643256, (float) var33 * var15 + var32);
                            this.field7878.method2376((byte) 122, var26);
                            this.field7878.method2376((byte) 122, var27);
                            this.field7878.method2376((byte) 122, var28);
                            this.field7878.method2376((byte) 122, var29);
                            this.field7878.method882(-1491643256, 1.0F);
                            this.field7878.method882(-1491643256, 1.0F);
                            this.field7878.method882(-1491643256, (float) var33 * var10 + var30);
                            this.field7878.method882(-1491643256, (float) var33 * var11 + var31);
                            this.field7878.method882(-1491643256, (float) var33 * var12 + var32);
                            this.field7878.method2376((byte) 122, var26);
                            this.field7878.method2376((byte) 122, var27);
                            this.field7878.method2376((byte) 122, var28);
                            this.field7878.method2376((byte) 122, var29);
                            this.field7878.method882(-1491643256, 0.0F);
                            this.field7878.method882(-1491643256, 1.0F);
                            this.field7878.method882(-1491643256, (float) var33 * var16 + var30);
                            this.field7878.method882(-1491643256, (float) var33 * var17 + var31);
                            this.field7878.method882(-1491643256, (float) var33 * var18 + var32);
                            this.field7878.method2376((byte) 122, var26);
                            this.field7878.method2376((byte) 122, var27);
                            this.field7878.method2376((byte) 122, var28);
                            this.field7878.method2376((byte) 122, var29);
                        }
                    }
                }
            }
        }
        if (this.field7878.field5665 != 0) {
            this.field7891.method466(24, this.field7878.field5665, this.field7878.field5663, -25990);
            arg1.method2939(this.field7888, null, 16063, this.field7890, this.field7887);
            arg1.method2916(0, this.field7878.field5665 / 24, 916736984, 7);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBII)I", line = 734)
    public static final int method3173(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 7) {
            field7885 = null;
        }
        field7884++;
        if (arg2 <= arg0) {
            return arg3 >= arg0 ? arg0 : arg3;
        } else {
            return arg2;
        }
    }
}
