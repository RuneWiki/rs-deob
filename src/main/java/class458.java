import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class458 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[F")
    private float[] field5997 = new float[16];

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lph;")
    private class703 field6005 = new class703(786336);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    private int field6011 = class127.method924(12, 1600);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[[Lfu;")
    private class66[][] field6012 = new class66[64][768];

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
    private int[] field6016 = new int[64];

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    private int[] field6015 = new int[1600];

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
    private int[] field6014 = new int[8191];

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field6017 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[[Lfu;")
    private class66[][] field6013 = new class66[1600][64];

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field5999 = 0;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lra;")
    public static class361 field6006 = new class361(34, 8);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "F")
    public static float field6004;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lsj;")
    private class373 field6007;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lvv;")
    private class414 field6008;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lvv;")
    private class414 field6009;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lvv;")
    private class414 field6010;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILji;I)V")
    private final void method2574(int arg0, class622 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5997, 0);
        field6002++;
        float var4 = this.field5997[0];
        float var5 = this.field5997[4];
        float var6 = this.field5997[8];
        if (arg0 != -25353) {
            return;
        }
        float var7 = this.field5997[1];
        float var8 = this.field5997[5];
        float var9 = this.field5997[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field6005.field5367 = 0;
        if (arg1.field8631) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field6015[var19] > 64 ? 64 : this.field6015[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class66 var34 = this.field6013[var19][var21];
                        int var35 = var34.field902;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field899 >> 12);
                        float var41 = (float) (var34.field894 >> 12);
                        float var42 = (float) (var34.field895 >> 12);
                        int var43 = var34.field903 >> 12;
                        this.field6005.method3847(0.0F, 107);
                        this.field6005.method3847(0.0F, -42);
                        this.field6005.method3847((float) (-var43) * var10 + var40, 106);
                        this.field6005.method3847((float) (-var43) * var11 + var41, arg0 + 25470);
                        this.field6005.method3847((float) (-var43) * var12 + var42, arg0 ^ 0xFFFF9C81);
                        this.field6005.method2352(true, var36);
                        this.field6005.method2352(true, var37);
                        this.field6005.method2352(true, var38);
                        this.field6005.method2352(true, var39);
                        this.field6005.method3847(1.0F, arg0 ^ 0x636F);
                        this.field6005.method3847(0.0F, -128);
                        this.field6005.method3847((float) var43 * var13 + var40, 100);
                        this.field6005.method3847((float) var43 * var14 + var41, -38);
                        this.field6005.method3847((float) var43 * var15 + var42, arg0 + 25347);
                        this.field6005.method2352(true, var36);
                        this.field6005.method2352(true, var37);
                        this.field6005.method2352(true, var38);
                        this.field6005.method2352(true, var39);
                        this.field6005.method3847(1.0F, 110);
                        this.field6005.method3847(1.0F, arg0 + 25347);
                        this.field6005.method3847((float) var43 * var10 + var40, 107);
                        this.field6005.method3847((float) var43 * var11 + var41, 107);
                        this.field6005.method3847((float) var43 * var12 + var42, -33);
                        this.field6005.method2352(true, var36);
                        this.field6005.method2352(true, var37);
                        this.field6005.method2352(true, var38);
                        this.field6005.method2352(true, var39);
                        this.field6005.method3847(0.0F, 101);
                        this.field6005.method3847(1.0F, -3);
                        this.field6005.method3847((float) var43 * var16 + var40, -93);
                        this.field6005.method3847((float) var43 * var17 + var41, 105);
                        this.field6005.method3847((float) var43 * var18 + var42, -102);
                        this.field6005.method2352(true, var36);
                        this.field6005.method2352(true, var37);
                        this.field6005.method2352(true, var38);
                        this.field6005.method2352(true, var39);
                    }
                    if (this.field6015[var19] > 64) {
                        int var22 = this.field6015[var19] - 65;
                        for (int var23 = this.field6016[var22] - 1; var23 >= 0; var23--) {
                            class66 var24 = this.field6012[var22][var23];
                            int var25 = var24.field902;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field899 >> 12);
                            float var31 = (float) (var24.field894 >> 12);
                            float var32 = (float) (var24.field895 >> 12);
                            int var33 = var24.field903 >> 12;
                            this.field6005.method3847(0.0F, -66);
                            this.field6005.method3847(0.0F, 123);
                            this.field6005.method3847((float) (-var33) * var10 + var30, 100);
                            this.field6005.method3847((float) (-var33) * var11 + var31, -44);
                            this.field6005.method3847((float) (-var33) * var12 + var32, arg0 + 25477);
                            this.field6005.method2352(true, var26);
                            this.field6005.method2352(true, var27);
                            this.field6005.method2352(true, var28);
                            this.field6005.method2352(true, var29);
                            this.field6005.method3847(1.0F, arg0 + 25455);
                            this.field6005.method3847(0.0F, -13);
                            this.field6005.method3847((float) var33 * var13 + var30, 97);
                            this.field6005.method3847((float) var33 * var14 + var31, -39);
                            this.field6005.method3847((float) var33 * var15 + var32, 113);
                            this.field6005.method2352(true, var26);
                            this.field6005.method2352(true, var27);
                            this.field6005.method2352(true, var28);
                            this.field6005.method2352(true, var29);
                            this.field6005.method3847(1.0F, arg0 + 25308);
                            this.field6005.method3847(1.0F, -45);
                            this.field6005.method3847((float) var33 * var10 + var30, -33);
                            this.field6005.method3847((float) var33 * var11 + var31, 100);
                            this.field6005.method3847((float) var33 * var12 + var32, 124);
                            this.field6005.method2352(true, var26);
                            this.field6005.method2352(true, var27);
                            this.field6005.method2352(true, var28);
                            this.field6005.method2352(true, var29);
                            this.field6005.method3847(0.0F, -28);
                            this.field6005.method3847(1.0F, 117);
                            this.field6005.method3847((float) var33 * var16 + var30, 118);
                            this.field6005.method3847((float) var33 * var17 + var31, 114);
                            this.field6005.method3847((float) var33 * var18 + var32, -96);
                            this.field6005.method2352(true, var26);
                            this.field6005.method2352(true, var27);
                            this.field6005.method2352(true, var28);
                            this.field6005.method2352(true, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field6015[var44] <= 64 ? this.field6015[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class66 var59 = this.field6013[var44][var46];
                        int var60 = var59.field902;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field899 >> 12);
                        float var66 = (float) (var59.field894 >> 12);
                        float var67 = (float) (var59.field895 >> 12);
                        int var68 = var59.field903 >> 12;
                        this.field6005.method3846(0.0F, -83);
                        this.field6005.method3846(0.0F, -51);
                        this.field6005.method3846((float) (-var68) * var10 + var65, -44);
                        this.field6005.method3846((float) (-var68) * var11 + var66, -111);
                        this.field6005.method3846((float) (-var68) * var12 + var67, -25);
                        this.field6005.method2352(true, var61);
                        this.field6005.method2352(true, var62);
                        this.field6005.method2352(true, var63);
                        this.field6005.method2352(true, var64);
                        this.field6005.method3846(1.0F, arg0 + 25305);
                        this.field6005.method3846(0.0F, arg0 ^ 0x6315);
                        this.field6005.method3846((float) var68 * var13 + var65, -65);
                        this.field6005.method3846((float) var68 * var14 + var66, arg0 + 25269);
                        this.field6005.method3846((float) var68 * var15 + var67, -110);
                        this.field6005.method2352(true, var61);
                        this.field6005.method2352(true, var62);
                        this.field6005.method2352(true, var63);
                        this.field6005.method2352(true, var64);
                        this.field6005.method3846(1.0F, -96);
                        this.field6005.method3846(1.0F, -47);
                        this.field6005.method3846((float) var68 * var10 + var65, arg0 + 25233);
                        this.field6005.method3846((float) var68 * var11 + var66, -128);
                        this.field6005.method3846((float) var68 * var12 + var67, -32);
                        this.field6005.method2352(true, var61);
                        this.field6005.method2352(true, var62);
                        this.field6005.method2352(true, var63);
                        this.field6005.method2352(true, var64);
                        this.field6005.method3846(0.0F, -70);
                        this.field6005.method3846(1.0F, -75);
                        this.field6005.method3846((float) var68 * var16 + var65, -61);
                        this.field6005.method3846((float) var68 * var17 + var66, -73);
                        this.field6005.method3846((float) var68 * var18 + var67, -103);
                        this.field6005.method2352(true, var61);
                        this.field6005.method2352(true, var62);
                        this.field6005.method2352(true, var63);
                        this.field6005.method2352(true, var64);
                    }
                    if (this.field6015[var44] > 64) {
                        int var47 = this.field6015[var44] - 64 - 1;
                        for (int var48 = this.field6016[var47] - 1; var48 >= 0; var48--) {
                            class66 var49 = this.field6012[var47][var48];
                            int var50 = var49.field902;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field899 >> 12);
                            float var56 = (float) (var49.field894 >> 12);
                            float var57 = (float) (var49.field895 >> 12);
                            int var58 = var49.field903 >> 12;
                            this.field6005.method3846(0.0F, -95);
                            this.field6005.method3846(0.0F, -87);
                            this.field6005.method3846((float) (-var58) * var10 + var55, -103);
                            this.field6005.method3846((float) (-var58) * var11 + var56, -83);
                            this.field6005.method3846((float) (-var58) * var12 + var57, -31);
                            this.field6005.method2352(true, var51);
                            this.field6005.method2352(true, var52);
                            this.field6005.method2352(true, var53);
                            this.field6005.method2352(true, var54);
                            this.field6005.method3846(1.0F, -85);
                            this.field6005.method3846(0.0F, -116);
                            this.field6005.method3846((float) var58 * var13 + var55, -103);
                            this.field6005.method3846((float) var58 * var14 + var56, -92);
                            this.field6005.method3846((float) var58 * var15 + var57, -88);
                            this.field6005.method2352(true, var51);
                            this.field6005.method2352(true, var52);
                            this.field6005.method2352(true, var53);
                            this.field6005.method2352(true, var54);
                            this.field6005.method3846(1.0F, -46);
                            this.field6005.method3846(1.0F, arg0 ^ 0x6374);
                            this.field6005.method3846((float) var58 * var10 + var55, -123);
                            this.field6005.method3846((float) var58 * var11 + var56, -113);
                            this.field6005.method3846((float) var58 * var12 + var57, -64);
                            this.field6005.method2352(true, var51);
                            this.field6005.method2352(true, var52);
                            this.field6005.method2352(true, var53);
                            this.field6005.method2352(true, var54);
                            this.field6005.method3846(0.0F, -49);
                            this.field6005.method3846(1.0F, -63);
                            this.field6005.method3846((float) var58 * var16 + var55, -90);
                            this.field6005.method3846((float) var58 * var17 + var56, -29);
                            this.field6005.method3846((float) var58 * var18 + var57, arg0 ^ 0x6302);
                            this.field6005.method2352(true, var51);
                            this.field6005.method2352(true, var52);
                            this.field6005.method2352(true, var53);
                            this.field6005.method2352(true, var54);
                        }
                    }
                }
            }
        }
        if (this.field6005.field5367 != 0) {
            this.field6007.method2141(this.field6005.field5367, 89, this.field6005.field5393, 24);
            arg1.method3420(this.field6008, this.field6009, true, null, this.field6010);
            arg1.method3461(this.field6005.field5367 / 24, 7, (byte) -40, 0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILji;)V")
    private final void method2575(int arg0, class622 arg1) {
        arg1.method3424(true, -32);
        field6003++;
        if (arg0 <= 117) {
            return;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class484.field6448 != arg1.field8712) {
            arg1.method360(class484.field6448);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method2576(int arg0) {
        if (arg0 <= 103) {
            field6006 = null;
        }
        field6006 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLji;)V")
    private final void method2577(boolean arg0, class622 arg1) {
        if (!arg0) {
            return;
        }
        field6001++;
        class484.field6448 = arg1.field8712;
        arg1.method3434((byte) 104);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method3424(false, -32);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public static final void method2578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5996++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg4 * arg4;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        if (arg1 != -2) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class165.field2061 <= arg5 && class99.field1309 >= arg5) {
            int var20 = class650.method3574(class641.field8924, class265.field3552, arg3 + arg4, arg1 ^ 0xFFFFFF8A);
            int var21 = class650.method3574(class641.field8924, class265.field3552, arg3 - arg4, -54);
            class349.method2008(var20, (byte) 74, class213.field2746[arg5], var21, arg0);
        }
        int var22 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class165.field2061 <= var24 && class99.field1309 >= var23) {
                int var25 = class650.method3574(class641.field8924, class265.field3552, arg3 + var6, -76);
                int var26 = class650.method3574(class641.field8924, class265.field3552, arg3 - var6, 6);
                if (var23 >= class165.field2061) {
                    class349.method2008(var25, (byte) 62, class213.field2746[var23], var26, arg0);
                }
                if (class99.field1309 >= var24) {
                    class349.method2008(var25, (byte) 41, class213.field2746[var24], var26, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lqu;Lji;I)V")
    public final void method2579(class282 arg0, class622 arg1, int arg2) {
        field6000++;
        if (arg1.field8697 == null) {
            return;
        }
        this.method2577(true, arg1);
        float var4 = arg1.field8697.field291;
        float var5 = arg1.field8697.field313;
        int var6 = -38 / ((-arg2 - 58) / 42);
        float var7 = arg1.field8697.field298;
        float var8 = arg1.field8697.field293;
        try {
            if (arg0.field3677) {
                int var27 = arg0.field3674 - arg0.field3676;
                int var28;
                if (var27 + 2 <= 1600) {
                    var27 += 2;
                    var28 = 0;
                } else {
                    var28 = class127.method924(12, var27) + 1 - this.field6011;
                    var27 = (var27 >> var28) + 2;
                }
                class154 var29 = arg0.field3673.field7895;
                class154 var30 = var29.field1956;
                int var31 = -2;
                boolean var32 = true;
                boolean var33 = true;
                while (var29 != var30) {
                    this.field6017 = 0;
                    for (int var34 = 0; var34 < var27; var34++) {
                        this.field6015[var34] = 0;
                    }
                    for (int var35 = 0; var35 < 64; var35++) {
                        this.field6016[var35] = 0;
                    }
                    while (var29 != var30) {
                        class66 var36 = (class66) var30;
                        if (var33) {
                            var32 = var36.field892;
                            var33 = false;
                            var31 = var36.field905;
                        } else if (var36.field905 != var31 || var36.field892 != var32) {
                            var33 = true;
                            break;
                        }
                        int var37 = (int) ((float) (var36.field895 >> 12) * var7 + (float) (var36.field899 >> 12) * var4 + (float) (var36.field894 >> 12) * var5 + var8) - arg0.field3676 >> var28;
                        if (var37 < 1600) {
                            if (this.field6015[var37] < 64) {
                                this.field6013[var37][this.field6015[var37]++] = var36;
                            } else {
                                label140: {
                                    if (this.field6015[var37] == 64) {
                                        if (this.field6017 == 64) {
                                            break label140;
                                        }
                                        this.field6015[var37] += this.field6017++ + 1;
                                    }
                                    this.field6012[this.field6015[var37] - 64 - 1][this.field6016[this.field6015[var37] - 64 - 1]++] = var36;
                                }
                            }
                        }
                        var30 = var30.field1956;
                    }
                    if (var31 < 0) {
                        arg1.method3459((byte) 81, -1);
                    } else {
                        arg1.method3459((byte) -110, var31);
                    }
                    if (var32 && class484.field6448 != arg1.field8712) {
                        arg1.method360(class484.field6448);
                    } else if (arg1.field8712 != 1.0F) {
                        arg1.method360(1.0F);
                    }
                    this.method2574(-25353, arg1, var27);
                }
            } else {
                int var9 = 0;
                int var10 = Integer.MAX_VALUE;
                int var11 = 0;
                class154 var12 = arg0.field3673.field7895;
                for (class154 var13 = var12.field1956; var13 != var12; var13 = var13.field1956) {
                    class66 var14 = (class66) var13;
                    int var15 = (int) ((float) (var14.field895 >> 12) * var7 + (float) (var14.field899 >> 12) * var4 + (float) (var14.field894 >> 12) * var5 + var8);
                    if (var10 > var15) {
                        var10 = var15;
                    }
                    if (var11 < var15) {
                        var11 = var15;
                    }
                    this.field6014[var9++] = var15;
                }
                int var16 = var11 - var10;
                int var17;
                if (var16 + 2 > 1600) {
                    var17 = class127.method924(12, var16) + 1 - this.field6011;
                    var16 = (var16 >> var17) + 2;
                } else {
                    var17 = 0;
                    var16 += 2;
                }
                class154 var18 = var12.field1956;
                int var19 = 0;
                int var20 = -2;
                boolean var21 = true;
                boolean var22 = true;
                while (var12 != var18) {
                    this.field6017 = 0;
                    for (int var23 = 0; var23 < var16; var23++) {
                        this.field6015[var23] = 0;
                    }
                    for (int var24 = 0; var24 < 64; var24++) {
                        this.field6016[var24] = 0;
                    }
                    while (var12 != var18) {
                        class66 var25 = (class66) var18;
                        if (var22) {
                            var20 = var25.field905;
                            var22 = false;
                            var21 = var25.field892;
                        }
                        if (var19 > 0 && (var25.field905 != var20 || var21 != var25.field892)) {
                            var22 = true;
                            break;
                        }
                        int var26 = this.field6014[var19++] - var10 >> var17;
                        if (var26 < 1600) {
                            if (this.field6015[var26] < 64) {
                                this.field6013[var26][this.field6015[var26]++] = var25;
                            } else {
                                label185: {
                                    if (this.field6015[var26] == 64) {
                                        if (this.field6017 == 64) {
                                            break label185;
                                        }
                                        this.field6015[var26] += this.field6017++ + 1;
                                    }
                                    this.field6012[this.field6015[var26] - 64 - 1][this.field6016[this.field6015[var26] - 1 - 64]++] = var25;
                                }
                            }
                        }
                        var18 = var18.field1956;
                    }
                    if (var20 < 0) {
                        arg1.method3459((byte) -109, -1);
                    } else {
                        arg1.method3459((byte) -122, var20);
                    }
                    if (var21 && class484.field6448 != arg1.field8712) {
                        arg1.method360(class484.field6448);
                    } else if (arg1.field8712 != 1.0F) {
                        arg1.method360(1.0F);
                    }
                    this.method2574(-25353, arg1, var16);
                }
            }
        } catch (Exception var38) {
        }
        this.method2575(123, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILji;)V")
    public final void method2580(int arg0, class622 arg1) {
        this.field6007 = arg1.method3433(196584, false, true, null, 24);
        field5998++;
        this.field6009 = new class414(this.field6007, arg0, 2, 0);
        this.field6010 = new class414(this.field6007, 5126, 3, 8);
        this.field6008 = new class414(this.field6007, 5121, 4, 20);
    }
}
