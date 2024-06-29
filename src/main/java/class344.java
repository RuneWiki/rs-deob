import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class344 {

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[F")
    private float[] field4406 = new float[16];

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ldd;")
    private class498 field4403 = new class498(786336);

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    private int field4410 = class135.method933(1600, 13634);

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    private int[] field4417 = new int[1600];

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "[[Lbd;")
    private class45[][] field4420 = new class45[1600][64];

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[[Lbd;")
    private class45[][] field4418 = new class45[64][768];

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    private int field4419 = 0;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    private int[] field4421 = new int[8191];

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
    private int[] field4422 = new int[64];

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lhd;")
    public static class523 field4404 = null;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lbe;")
    public static class29 field4405 = new class29(0);

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lkg;")
    public static class179 field4408 = new class179(8, 5);

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lap;")
    public static class335 field4416 = new class335("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Llc;")
    private class459 field4413;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Log;")
    private class460 field4412;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Log;")
    private class460 field4414;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Log;")
    private class460 field4415;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lug;Z)V")
    private final void method1974(class395 arg0, boolean arg1) {
        field4407++;
        if (!arg1) {
            this.field4421 = null;
        }
        class26.field380 = arg0.field5608;
        arg0.method2334(118);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2337(false, -128);
        arg0.method2349((byte) 75, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lug;I)V")
    public final void method1975(class395 arg0, int arg1) {
        field4400++;
        this.field4413 = arg0.method2269(true, (byte) -127, 196584, 24, null);
        this.field4414 = new class460(this.field4413, 5126, 2, 0);
        this.field4412 = new class460(this.field4413, 5126, 3, 8);
        this.field4415 = new class460(this.field4413, 5121, arg1, 20);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lug;I)V")
    private final void method1976(class395 arg0, int arg1) {
        if (arg1 != 0) {
            this.field4417 = null;
        }
        arg0.method2337(true, -126);
        field4399++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class26.field380 != arg0.field5608) {
            arg0.method282(class26.field380);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lug;II)V")
    private final void method1977(class395 arg0, int arg1, int arg2) {
        field4409++;
        OpenGL.glGetFloatv(2982, this.field4406, arg1);
        float var4 = this.field4406[0];
        float var5 = this.field4406[4];
        float var6 = this.field4406[8];
        float var7 = this.field4406[1];
        float var8 = this.field4406[5];
        float var9 = this.field4406[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field4403.field6631 = 0;
        float var18 = var9 - var6;
        if (arg0.field5593) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field4417[var44] > 64 ? 64 : this.field4417[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class45 var59 = this.field4420[var44][var46];
                        int var60 = var59.field529;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field536 >> class319.field4054);
                        float var66 = (float) (var59.field535 >> class319.field4054);
                        float var67 = (float) (var59.field530 >> class319.field4054);
                        int var68 = var59.field534 >> class319.field4054;
                        this.field4403.method3004(255, 0.0F);
                        this.field4403.method3004(255, 0.0F);
                        this.field4403.method3004(255, (float) (-var68) * var10 + var65);
                        this.field4403.method3004(arg1 + 255, (float) (-var68) * var11 + var66);
                        this.field4403.method3004(255, (float) (-var68) * var12 + var67);
                        this.field4403.method2729(var61, false);
                        this.field4403.method2729(var62, false);
                        this.field4403.method2729(var63, false);
                        this.field4403.method2729(var64, false);
                        this.field4403.method3004(255, 1.0F);
                        this.field4403.method3004(255, 0.0F);
                        this.field4403.method3004(255, (float) var68 * var13 + var65);
                        this.field4403.method3004(255, (float) var68 * var14 + var66);
                        this.field4403.method3004(255, (float) var68 * var15 + var67);
                        this.field4403.method2729(var61, false);
                        this.field4403.method2729(var62, false);
                        this.field4403.method2729(var63, false);
                        this.field4403.method2729(var64, false);
                        this.field4403.method3004(255, 1.0F);
                        this.field4403.method3004(255, 1.0F);
                        this.field4403.method3004(arg1 + 255, (float) var68 * var10 + var65);
                        this.field4403.method3004(255, (float) var68 * var11 + var66);
                        this.field4403.method3004(arg1 ^ 0xFF, (float) var68 * var12 + var67);
                        this.field4403.method2729(var61, false);
                        this.field4403.method2729(var62, false);
                        this.field4403.method2729(var63, false);
                        this.field4403.method2729(var64, false);
                        this.field4403.method3004(255, 0.0F);
                        this.field4403.method3004(255, 1.0F);
                        this.field4403.method3004(255, (float) var68 * var16 + var65);
                        this.field4403.method3004(arg1 + 255, (float) var68 * var17 + var66);
                        this.field4403.method3004(255, (float) var68 * var18 + var67);
                        this.field4403.method2729(var61, false);
                        this.field4403.method2729(var62, false);
                        this.field4403.method2729(var63, false);
                        this.field4403.method2729(var64, false);
                    }
                    if (this.field4417[var44] > 64) {
                        int var47 = this.field4417[var44] - 64 - 1;
                        for (int var48 = this.field4422[var47] - 1; var48 >= 0; var48--) {
                            class45 var49 = this.field4418[var47][var48];
                            int var50 = var49.field529;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field536 >> class319.field4054);
                            float var56 = (float) (var49.field535 >> class319.field4054);
                            float var57 = (float) (var49.field530 >> class319.field4054);
                            int var58 = var49.field534 >> class319.field4054;
                            this.field4403.method3004(arg1 + 255, 0.0F);
                            this.field4403.method3004(255, 0.0F);
                            this.field4403.method3004(255, (float) (-var58) * var10 + var55);
                            this.field4403.method3004(arg1 ^ 0xFF, (float) (-var58) * var11 + var56);
                            this.field4403.method3004(255, (float) (-var58) * var12 + var57);
                            this.field4403.method2729(var51, false);
                            this.field4403.method2729(var52, false);
                            this.field4403.method2729(var53, false);
                            this.field4403.method2729(var54, false);
                            this.field4403.method3004(255, 1.0F);
                            this.field4403.method3004(255, 0.0F);
                            this.field4403.method3004(255, (float) var58 * var13 + var55);
                            this.field4403.method3004(255, (float) var58 * var14 + var56);
                            this.field4403.method3004(255, (float) var58 * var15 + var57);
                            this.field4403.method2729(var51, false);
                            this.field4403.method2729(var52, false);
                            this.field4403.method2729(var53, false);
                            this.field4403.method2729(var54, false);
                            this.field4403.method3004(arg1 ^ 0xFF, 1.0F);
                            this.field4403.method3004(255, 1.0F);
                            this.field4403.method3004(255, (float) var58 * var10 + var55);
                            this.field4403.method3004(255, (float) var58 * var11 + var56);
                            this.field4403.method3004(arg1 + 255, (float) var58 * var12 + var57);
                            this.field4403.method2729(var51, false);
                            this.field4403.method2729(var52, false);
                            this.field4403.method2729(var53, false);
                            this.field4403.method2729(var54, false);
                            this.field4403.method3004(255, 0.0F);
                            this.field4403.method3004(255, 1.0F);
                            this.field4403.method3004(255, (float) var58 * var16 + var55);
                            this.field4403.method3004(255, (float) var58 * var17 + var56);
                            this.field4403.method3004(255, (float) var58 * var18 + var57);
                            this.field4403.method2729(var51, false);
                            this.field4403.method2729(var52, false);
                            this.field4403.method2729(var53, false);
                            this.field4403.method2729(var54, false);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field4417[var19] > 64 ? 64 : this.field4417[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class45 var34 = this.field4420[var19][var21];
                        int var35 = var34.field529;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field536 >> class319.field4054);
                        float var41 = (float) (var34.field535 >> class319.field4054);
                        float var42 = (float) (var34.field530 >> class319.field4054);
                        int var43 = var34.field534 >> class319.field4054;
                        this.field4403.method3003(0.0F, -51);
                        this.field4403.method3003(0.0F, -51);
                        this.field4403.method3003((float) (-var43) * var10 + var40, -51);
                        this.field4403.method3003((float) (-var43) * var11 + var41, -51);
                        this.field4403.method3003((float) (-var43) * var12 + var42, -51);
                        this.field4403.method2729(var36, false);
                        this.field4403.method2729(var37, false);
                        this.field4403.method2729(var38, false);
                        this.field4403.method2729(var39, false);
                        this.field4403.method3003(1.0F, arg1 - 51);
                        this.field4403.method3003(0.0F, arg1 ^ 0xFFFFFFCD);
                        this.field4403.method3003((float) var43 * var13 + var40, -51);
                        this.field4403.method3003((float) var43 * var14 + var41, -51);
                        this.field4403.method3003((float) var43 * var15 + var42, -51);
                        this.field4403.method2729(var36, false);
                        this.field4403.method2729(var37, false);
                        this.field4403.method2729(var38, false);
                        this.field4403.method2729(var39, false);
                        this.field4403.method3003(1.0F, -51);
                        this.field4403.method3003(1.0F, -51);
                        this.field4403.method3003((float) var43 * var10 + var40, -51);
                        this.field4403.method3003((float) var43 * var11 + var41, arg1 ^ 0xFFFFFFCD);
                        this.field4403.method3003((float) var43 * var12 + var42, arg1 + -51);
                        this.field4403.method2729(var36, false);
                        this.field4403.method2729(var37, false);
                        this.field4403.method2729(var38, false);
                        this.field4403.method2729(var39, false);
                        this.field4403.method3003(0.0F, arg1 - 51);
                        this.field4403.method3003(1.0F, -51);
                        this.field4403.method3003((float) var43 * var16 + var40, -51);
                        this.field4403.method3003((float) var43 * var17 + var41, -51);
                        this.field4403.method3003((float) var43 * var18 + var42, -51);
                        this.field4403.method2729(var36, false);
                        this.field4403.method2729(var37, false);
                        this.field4403.method2729(var38, false);
                        this.field4403.method2729(var39, false);
                    }
                    if (this.field4417[var19] > 64) {
                        int var22 = this.field4417[var19] - 65;
                        for (int var23 = this.field4422[var22] - 1; var23 >= 0; var23--) {
                            class45 var24 = this.field4418[var22][var23];
                            int var25 = var24.field529;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field536 >> class319.field4054);
                            float var31 = (float) (var24.field535 >> class319.field4054);
                            float var32 = (float) (var24.field530 >> class319.field4054);
                            int var33 = var24.field534 >> class319.field4054;
                            this.field4403.method3003(0.0F, -51);
                            this.field4403.method3003(0.0F, -51);
                            this.field4403.method3003((float) (-var33) * var10 + var30, arg1 ^ 0xFFFFFFCD);
                            this.field4403.method3003((float) (-var33) * var11 + var31, -51);
                            this.field4403.method3003((float) (-var33) * var12 + var32, -51);
                            this.field4403.method2729(var26, false);
                            this.field4403.method2729(var27, false);
                            this.field4403.method2729(var28, false);
                            this.field4403.method2729(var29, false);
                            this.field4403.method3003(1.0F, -51);
                            this.field4403.method3003(0.0F, -51);
                            this.field4403.method3003((float) var33 * var13 + var30, -51);
                            this.field4403.method3003((float) var33 * var14 + var31, -51);
                            this.field4403.method3003((float) var33 * var15 + var32, -51);
                            this.field4403.method2729(var26, false);
                            this.field4403.method2729(var27, false);
                            this.field4403.method2729(var28, false);
                            this.field4403.method2729(var29, false);
                            this.field4403.method3003(1.0F, arg1 ^ 0xFFFFFFCD);
                            this.field4403.method3003(1.0F, arg1 - 51);
                            this.field4403.method3003((float) var33 * var10 + var30, -51);
                            this.field4403.method3003((float) var33 * var11 + var31, arg1 ^ 0xFFFFFFCD);
                            this.field4403.method3003((float) var33 * var12 + var32, -51);
                            this.field4403.method2729(var26, false);
                            this.field4403.method2729(var27, false);
                            this.field4403.method2729(var28, false);
                            this.field4403.method2729(var29, false);
                            this.field4403.method3003(0.0F, -51);
                            this.field4403.method3003(1.0F, -51);
                            this.field4403.method3003((float) var33 * var16 + var30, -51);
                            this.field4403.method3003((float) var33 * var17 + var31, -51);
                            this.field4403.method3003((float) var33 * var18 + var32, -51);
                            this.field4403.method2729(var26, false);
                            this.field4403.method2729(var27, false);
                            this.field4403.method2729(var28, false);
                            this.field4403.method2729(var29, false);
                        }
                    }
                }
            }
        }
        if (this.field4403.field6631 != 0) {
            this.field4413.method971(this.field4403.field6618, 24, this.field4403.field6631, (byte) -105);
            arg0.method2295(this.field4414, this.field4412, this.field4415, false, null);
            arg0.method2316((byte) 41, 7, 0, this.field4403.field6631 / 24);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)I")
    public static final int method1978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4401++;
        if (arg3 != -1) {
            field4408 = null;
        }
        int var5 = arg1 & 0xF;
        int var6 = var5 < 8 ? arg2 : arg0;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg4) : arg0;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lug;BLfm;)V")
    public final void method1979(class395 arg0, byte arg1, class517 arg2) {
        field4402++;
        if (arg0.field5606 == null) {
            return;
        }
        this.method1974(arg0, true);
        float var4 = arg0.field5606.field3038;
        if (arg1 != -53) {
            return;
        }
        float var5 = arg0.field5606.field3035;
        float var6 = arg0.field5606.field3012;
        float var7 = arg0.field5606.field3016;
        try {
            if (arg2.field7493) {
                int var8 = arg2.field7491 - arg2.field7492;
                int var9;
                if ((var8 + 2) > 1600) {
                    var9 = class135.method933(var8, arg1 + 13687) + 1 - this.field4410;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var9 = 0;
                    var8 += 2;
                }
                class169 var10 = arg2.field7487.field3985;
                class169 var11 = var10.field2165;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field4419 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field4417[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field4422[var16] = 0;
                    }
                    while (var10 != var11) {
                        class45 var17 = (class45) var11;
                        if (var14) {
                            var12 = var17.field532;
                            var14 = false;
                            var13 = var17.field537;
                        } else if (var17.field532 != var12 || var17.field537 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field530 >> class319.field4054) * var6 + (float) (var17.field536 >> class319.field4054) * var4 + (float) (var17.field535 >> class319.field4054) * var5 + var7) - arg2.field7492 >> var9;
                        if (var18 < 1600) {
                            if (this.field4417[var18] >= 64) {
                                label191: {
                                    if (this.field4417[var18] == 64) {
                                        if (this.field4419 == 64) {
                                            break label191;
                                        }
                                        this.field4417[var18] += this.field4419++ + 1;
                                    }
                                    this.field4418[this.field4417[var18] - 64 - 1][this.field4422[this.field4417[var18] - 64 - 1]++] = var17;
                                }
                            } else {
                                this.field4420[var18][this.field4417[var18]++] = var17;
                            }
                        }
                        var11 = var11.field2165;
                    }
                    if (var12 >= 0) {
                        arg0.method2322(arg0.field5483.method1606(var12, 6408), 14);
                        arg0.method2305(7681, arg0.field502.method1642(var12, 127).field1786);
                    } else {
                        arg0.method2322(null, 14);
                    }
                    if (var13 && class26.field380 != arg0.field5608) {
                        arg0.method282(class26.field380);
                    } else if (arg0.field5608 != 1.0F) {
                        arg0.method282(1.0F);
                    }
                    this.method1977(arg0, 0, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class169 var22 = arg2.field7487.field3985;
                for (class169 var23 = var22.field2165; var23 != var22; var23 = var23.field2165) {
                    class45 var24 = (class45) var23;
                    int var25 = (int) ((float) (var24.field530 >> class319.field4054) * var6 + (float) (var24.field536 >> class319.field4054) * var4 + (float) (var24.field535 >> class319.field4054) * var5 + var7);
                    this.field4421[var19++] = var25;
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    if (var25 < var20) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class135.method933(var26, 13634) + 1 - this.field4410;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class169 var29 = var22.field2165;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field4419 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field4417[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field4422[var34] = 0;
                    }
                    while (var22 != var29) {
                        class45 var35 = (class45) var29;
                        if (var32) {
                            var30 = var35.field532;
                            var31 = var35.field537;
                            var32 = false;
                        }
                        if (var28 > 0 && (var35.field532 != var30 || var31 != var35.field537)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field4421[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field4417[var36] < 64) {
                                this.field4420[var36][this.field4417[var36]++] = var35;
                            } else {
                                label142: {
                                    if (this.field4417[var36] == 64) {
                                        if (this.field4419 == 64) {
                                            break label142;
                                        }
                                        this.field4417[var36] += this.field4419++ + 1;
                                    }
                                    this.field4418[this.field4417[var36] - 64 - 1][this.field4422[this.field4417[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field2165;
                    }
                    if (var30 < 0) {
                        arg0.method2322(null, arg1 ^ 0xFFFFFFC5);
                    } else {
                        arg0.method2322(arg0.field5483.method1606(var30, 6408), arg1 + 67);
                        arg0.method2305(7681, arg0.field502.method1642(var30, 121).field1786);
                    }
                    if (var31 && class26.field380 != arg0.field5608) {
                        arg0.method282(class26.field380);
                    } else if (arg0.field5608 != 1.0F) {
                        arg0.method282(1.0F);
                    }
                    this.method1977(arg0, 0, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method1976(arg0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1980(int arg0) {
        field4404 = null;
        field4405 = null;
        field4416 = null;
        field4408 = null;
        if (arg0 > -48) {
            method1978(88, 56, 41, 2, 72);
        }
    }
}
