import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class283 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[F")
    private float[] field4340 = new float[16];

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Ldca;")
    private class186 field4343 = new class186(786336);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    private int field4345 = class305.method2009(1600, (byte) 63);

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "[[Lqja;")
    private class324[][] field4355 = new class324[64][768];

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    private int field4354 = 0;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[[Lqja;")
    private class324[][] field4352 = new class324[1600][64];

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
    private int[] field4356 = new int[64];

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "[I")
    private int[] field4353 = new int[8191];

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "[I")
    private int[] field4357 = new int[1600];

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Ljo;")
    public static class351 field4347 = new class351(86, -1);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "Lkb;")
    private class717 field4348;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Lkb;")
    private class717 field4350;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lkb;")
    private class717 field4351;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lic;")
    private class726 field4349;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLkv;I)V")
    private final void method1907(byte arg0, class280 arg1, int arg2) {
        class709.field9994 = arg1.field4248;
        field4341++;
        if (arg0 != 57) {
            this.method1909(null, -32);
        }
        arg1.method1895((float) arg2, (byte) -80);
        arg1.method1900(-1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1826(false, -84);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkv;Lhea;IB)V")
    public final void method1908(class280 arg0, class443 arg1, int arg2, byte arg3) {
        field4346++;
        if (arg0.field4192 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method1907((byte) 57, arg0, arg2);
        } else {
            this.method1910((byte) 69, arg0);
        }
        float var5 = arg0.field4192.field10030;
        float var6 = arg0.field4192.field10032;
        float var7 = arg0.field4192.field10044;
        float var8 = arg0.field4192.field10037;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class214 var12 = arg1.field6311.field1864;
            for (class214 var13 = var12.field3084; var13 != var12; var13 = var13.field3084) {
                class324 var14 = (class324) var13;
                int var15 = (int) ((float) (var14.field4855 >> 12) * var7 + (float) (var14.field4857 >> 12) * var6 + (float) (var14.field4854 >> 12) * var5 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field4353[var9++] = var15;
            }
            int var16 = var11 - var10;
            if (arg3 != 110) {
                this.method1909(null, 109);
            }
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class305.method2009(var16, (byte) 63) + 1 - this.field4345;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class214 var19 = var12.field3084;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4354 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4357[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4356[var24] = 0;
                }
                while (var12 != var19) {
                    class324 var25 = (class324) var19;
                    if (var22) {
                        var21 = var25.field4856;
                        var22 = false;
                        var20 = var25.field4853;
                    }
                    if (var18 > 0 && (var25.field4853 != var20 || var21 != var25.field4856)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4353[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4357[var26] < 64) {
                            this.field4352[var26][this.field4357[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field4357[var26] == 64) {
                                    if (this.field4354 == 64) {
                                        break label106;
                                    }
                                    this.field4357[var26] += this.field4354++ + 1;
                                }
                                this.field4355[this.field4357[var26] - 64 - 1][this.field4356[this.field4357[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field3084;
                }
                if (var20 >= 0) {
                    arg0.method1873((byte) 23, var20);
                } else {
                    arg0.method1873((byte) 23, -1);
                }
                if (var21 && class709.field9994 != arg0.field4248) {
                    arg0.method506(class709.field9994);
                } else if (arg0.field4248 != 1.0F) {
                    arg0.method506(1.0F);
                }
                this.method1912(arg0, (byte) 15, var16);
            }
        } catch (Exception var27) {
        }
        this.method1909(arg0, 8);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkv;I)V")
    private final void method1909(class280 arg0, int arg1) {
        arg0.method1826(true, -92);
        field4342++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class709.field9994 != arg0.field4248) {
            arg0.method506(class709.field9994);
        }
        if (arg1 != 8) {
            this.method1910((byte) 7, null);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLkv;)V")
    private final void method1910(byte arg0, class280 arg1) {
        field4344++;
        class709.field9994 = arg1.field4248;
        int var3 = 61 % (-arg0 / 60);
        arg1.method1827((byte) 28);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1826(false, -99);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4347 = null;
        if (arg0 != 53) {
            field4347 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lkv;BI)V")
    private final void method1912(class280 arg0, byte arg1, int arg2) {
        field4339++;
        OpenGL.glGetFloatv(2982, this.field4340, 0);
        float var4 = this.field4340[0];
        float var5 = this.field4340[4];
        float var6 = this.field4340[8];
        float var7 = this.field4340[1];
        float var8 = this.field4340[5];
        float var9 = this.field4340[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        if (arg1 != 15) {
            this.field4355 = null;
        }
        float var17 = var8 - var5;
        this.field4343.field1521 = 0;
        float var18 = var9 - var6;
        if (arg0.field4230) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field4357[var44] <= 64 ? this.field4357[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class324 var59 = this.field4352[var44][var46];
                        int var60 = var59.field4861;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field4854 >> 12);
                        float var66 = (float) (var59.field4857 >> 12);
                        float var67 = (float) (var59.field4855 >> 12);
                        int var68 = var59.field4860 >> 12;
                        this.field4343.method1383((byte) -116, 0.0F);
                        this.field4343.method1383((byte) 101, 0.0F);
                        this.field4343.method1383((byte) 77, (float) (-var68) * var10 + var65);
                        this.field4343.method1383((byte) -120, (float) (-var68) * var11 + var66);
                        this.field4343.method1383((byte) -116, (float) (-var68) * var12 + var67);
                        this.field4343.method851((byte) -2, var61);
                        this.field4343.method851((byte) -2, var62);
                        this.field4343.method851((byte) -2, var63);
                        this.field4343.method851((byte) -2, var64);
                        this.field4343.method1383((byte) -123, 1.0F);
                        this.field4343.method1383((byte) -124, 0.0F);
                        this.field4343.method1383((byte) 51, (float) var68 * var13 + var65);
                        this.field4343.method1383((byte) 77, (float) var68 * var14 + var66);
                        this.field4343.method1383((byte) 101, (float) var68 * var15 + var67);
                        this.field4343.method851((byte) -2, var61);
                        this.field4343.method851((byte) -2, var62);
                        this.field4343.method851((byte) -2, var63);
                        this.field4343.method851((byte) -2, var64);
                        this.field4343.method1383((byte) -114, 1.0F);
                        this.field4343.method1383((byte) -127, 1.0F);
                        this.field4343.method1383((byte) -125, (float) var68 * var10 + var65);
                        this.field4343.method1383((byte) -123, (float) var68 * var11 + var66);
                        this.field4343.method1383((byte) 71, (float) var68 * var12 + var67);
                        this.field4343.method851((byte) -2, var61);
                        this.field4343.method851((byte) -2, var62);
                        this.field4343.method851((byte) -2, var63);
                        this.field4343.method851((byte) -2, var64);
                        this.field4343.method1383((byte) 20, 0.0F);
                        this.field4343.method1383((byte) 96, 1.0F);
                        this.field4343.method1383((byte) 101, (float) var68 * var16 + var65);
                        this.field4343.method1383((byte) -124, (float) var68 * var17 + var66);
                        this.field4343.method1383((byte) 47, (float) var68 * var18 + var67);
                        this.field4343.method851((byte) -2, var61);
                        this.field4343.method851((byte) -2, var62);
                        this.field4343.method851((byte) -2, var63);
                        this.field4343.method851((byte) -2, var64);
                    }
                    if (this.field4357[var44] > 64) {
                        int var47 = this.field4357[var44] - 1 - 64;
                        for (int var48 = this.field4356[var47] - 1; var48 >= 0; var48--) {
                            class324 var49 = this.field4355[var47][var48];
                            int var50 = var49.field4861;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field4854 >> 12);
                            float var56 = (float) (var49.field4857 >> 12);
                            float var57 = (float) (var49.field4855 >> 12);
                            int var58 = var49.field4860 >> 12;
                            this.field4343.method1383((byte) 73, 0.0F);
                            this.field4343.method1383((byte) -124, 0.0F);
                            this.field4343.method1383((byte) 58, (float) (-var58) * var10 + var55);
                            this.field4343.method1383((byte) -120, (float) (-var58) * var11 + var56);
                            this.field4343.method1383((byte) -117, (float) (-var58) * var12 + var57);
                            this.field4343.method851((byte) -2, var51);
                            this.field4343.method851((byte) -2, var52);
                            this.field4343.method851((byte) -2, var53);
                            this.field4343.method851((byte) -2, var54);
                            this.field4343.method1383((byte) -125, 1.0F);
                            this.field4343.method1383((byte) 124, 0.0F);
                            this.field4343.method1383((byte) -115, (float) var58 * var13 + var55);
                            this.field4343.method1383((byte) 61, (float) var58 * var14 + var56);
                            this.field4343.method1383((byte) -125, (float) var58 * var15 + var57);
                            this.field4343.method851((byte) -2, var51);
                            this.field4343.method851((byte) -2, var52);
                            this.field4343.method851((byte) -2, var53);
                            this.field4343.method851((byte) -2, var54);
                            this.field4343.method1383((byte) 34, 1.0F);
                            this.field4343.method1383((byte) 66, 1.0F);
                            this.field4343.method1383((byte) -113, (float) var58 * var10 + var55);
                            this.field4343.method1383((byte) 12, (float) var58 * var11 + var56);
                            this.field4343.method1383((byte) -114, (float) var58 * var12 + var57);
                            this.field4343.method851((byte) -2, var51);
                            this.field4343.method851((byte) -2, var52);
                            this.field4343.method851((byte) -2, var53);
                            this.field4343.method851((byte) -2, var54);
                            this.field4343.method1383((byte) -123, 0.0F);
                            this.field4343.method1383((byte) -119, 1.0F);
                            this.field4343.method1383((byte) 9, (float) var58 * var16 + var55);
                            this.field4343.method1383((byte) 57, (float) var58 * var17 + var56);
                            this.field4343.method1383((byte) -127, (float) var58 * var18 + var57);
                            this.field4343.method851((byte) -2, var51);
                            this.field4343.method851((byte) -2, var52);
                            this.field4343.method851((byte) -2, var53);
                            this.field4343.method851((byte) -2, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field4357[var19] > 64 ? 64 : this.field4357[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class324 var34 = this.field4352[var19][var21];
                        int var35 = var34.field4861;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field4854 >> 12);
                        float var41 = (float) (var34.field4857 >> 12);
                        float var42 = (float) (var34.field4855 >> 12);
                        int var43 = var34.field4860 >> 12;
                        this.field4343.method1381(0.0F, 3);
                        this.field4343.method1381(0.0F, arg1 ^ 0xC);
                        this.field4343.method1381((float) (-var43) * var10 + var40, 3);
                        this.field4343.method1381((float) (-var43) * var11 + var41, arg1 ^ 0xC);
                        this.field4343.method1381((float) (-var43) * var12 + var42, arg1 + -12);
                        this.field4343.method851((byte) -2, var36);
                        this.field4343.method851((byte) -2, var37);
                        this.field4343.method851((byte) -2, var38);
                        this.field4343.method851((byte) -2, var39);
                        this.field4343.method1381(1.0F, 3);
                        this.field4343.method1381(0.0F, 3);
                        this.field4343.method1381((float) var43 * var13 + var40, 3);
                        this.field4343.method1381((float) var43 * var14 + var41, arg1 ^ 0xC);
                        this.field4343.method1381((float) var43 * var15 + var42, 3);
                        this.field4343.method851((byte) -2, var36);
                        this.field4343.method851((byte) -2, var37);
                        this.field4343.method851((byte) -2, var38);
                        this.field4343.method851((byte) -2, var39);
                        this.field4343.method1381(1.0F, 3);
                        this.field4343.method1381(1.0F, arg1 ^ 0xC);
                        this.field4343.method1381((float) var43 * var10 + var40, 3);
                        this.field4343.method1381((float) var43 * var11 + var41, 3);
                        this.field4343.method1381((float) var43 * var12 + var42, 3);
                        this.field4343.method851((byte) -2, var36);
                        this.field4343.method851((byte) -2, var37);
                        this.field4343.method851((byte) -2, var38);
                        this.field4343.method851((byte) -2, var39);
                        this.field4343.method1381(0.0F, 3);
                        this.field4343.method1381(1.0F, arg1 ^ 0xC);
                        this.field4343.method1381((float) var43 * var16 + var40, 3);
                        this.field4343.method1381((float) var43 * var17 + var41, 3);
                        this.field4343.method1381((float) var43 * var18 + var42, 3);
                        this.field4343.method851((byte) -2, var36);
                        this.field4343.method851((byte) -2, var37);
                        this.field4343.method851((byte) -2, var38);
                        this.field4343.method851((byte) -2, var39);
                    }
                    if (this.field4357[var19] > 64) {
                        int var22 = this.field4357[var19] - 1 - 64;
                        for (int var23 = this.field4356[var22] - 1; var23 >= 0; var23--) {
                            class324 var24 = this.field4355[var22][var23];
                            int var25 = var24.field4861;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field4854 >> 12);
                            float var31 = (float) (var24.field4857 >> 12);
                            float var32 = (float) (var24.field4855 >> 12);
                            int var33 = var24.field4860 >> 12;
                            this.field4343.method1381(0.0F, 3);
                            this.field4343.method1381(0.0F, 3);
                            this.field4343.method1381((float) (-var33) * var10 + var30, 3);
                            this.field4343.method1381((float) (-var33) * var11 + var31, 3);
                            this.field4343.method1381((float) (-var33) * var12 + var32, 3);
                            this.field4343.method851((byte) -2, var26);
                            this.field4343.method851((byte) -2, var27);
                            this.field4343.method851((byte) -2, var28);
                            this.field4343.method851((byte) -2, var29);
                            this.field4343.method1381(1.0F, 3);
                            this.field4343.method1381(0.0F, arg1 - 12);
                            this.field4343.method1381((float) var33 * var13 + var30, arg1 + -12);
                            this.field4343.method1381((float) var33 * var14 + var31, 3);
                            this.field4343.method1381((float) var33 * var15 + var32, 3);
                            this.field4343.method851((byte) -2, var26);
                            this.field4343.method851((byte) -2, var27);
                            this.field4343.method851((byte) -2, var28);
                            this.field4343.method851((byte) -2, var29);
                            this.field4343.method1381(1.0F, 3);
                            this.field4343.method1381(1.0F, 3);
                            this.field4343.method1381((float) var33 * var10 + var30, arg1 ^ 0xC);
                            this.field4343.method1381((float) var33 * var11 + var31, 3);
                            this.field4343.method1381((float) var33 * var12 + var32, 3);
                            this.field4343.method851((byte) -2, var26);
                            this.field4343.method851((byte) -2, var27);
                            this.field4343.method851((byte) -2, var28);
                            this.field4343.method851((byte) -2, var29);
                            this.field4343.method1381(0.0F, 3);
                            this.field4343.method1381(1.0F, arg1 - 12);
                            this.field4343.method1381((float) var33 * var16 + var30, arg1 ^ 0xC);
                            this.field4343.method1381((float) var33 * var17 + var31, 3);
                            this.field4343.method1381((float) var33 * var18 + var32, arg1 ^ 0xC);
                            this.field4343.method851((byte) -2, var26);
                            this.field4343.method851((byte) -2, var27);
                            this.field4343.method851((byte) -2, var28);
                            this.field4343.method851((byte) -2, var29);
                        }
                    }
                }
            }
        }
        if (this.field4343.field1521 != 0) {
            this.field4349.method3073(this.field4343.field1556, this.field4343.field1521, 24, arg1 ^ 0x58);
            arg0.method1865(this.field4351, 32888, this.field4348, this.field4350, null);
            arg0.method1856(0, true, 7, this.field4343.field1521 / 24);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILkv;)V")
    public final void method1913(int arg0, class280 arg1) {
        field4338++;
        this.field4349 = arg1.method1881(196584, null, 12486, 24, true);
        this.field4348 = new class717(this.field4349, 5126, 2, 0);
        this.field4351 = new class717(this.field4349, 5126, 3, 8);
        if (arg0 >= 20) {
            this.field4350 = new class717(this.field4349, 5121, 4, 20);
        }
    }
}
