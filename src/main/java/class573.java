import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class573 {

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "[F")
    private float[] field8322 = new float[16];

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Lbca;")
    private class449 field8317 = new class449(786336);

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    private int field8329 = class341.method2115(27279, 1600);

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "[I")
    private int[] field8330 = new int[64];

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "[I")
    private int[] field8333 = new int[8191];

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "[I")
    private int[] field8332 = new int[1600];

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    private int field8334 = 0;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "[[Lan;")
    private class169[][] field8331 = new class169[1600][64];

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "[[Lan;")
    private class169[][] field8335 = new class169[64][768];

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "[I")
    public static int[] field8320 = new int[25];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "Lgv;")
    private class39 field8325;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lgv;")
    private class39 field8326;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lgv;")
    private class39 field8327;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "Lfba;")
    private class558 field8328;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 7)
    public static void method3291(byte arg0) {
        field8320 = null;
        if (arg0 != -82) {
            field8320 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLuca;)V", line = 21)
    private final void method3292(byte arg0, class287 arg1) {
        field8323++;
        class597.field8647 = arg1.field4121;
        if (arg0 >= -46) {
            this.method3297(null, 21, 111);
        }
        arg1.method1730((byte) 90);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1694((byte) 99, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V", line = 37)
    public static final void method3293(byte arg0) {
        class129.field1856.method3719(true);
        if (arg0 != 102) {
            method3291((byte) -23);
        }
        field8316++;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILuo;ILuca;)V", line = 49)
    public final void method3294(int arg0, class620 arg1, int arg2, class287 arg3) {
        field8315++;
        if (arg3.field4052 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method3298(arg0, arg3, 16384);
        } else {
            this.method3292((byte) -79, arg3);
        }
        float var5 = arg3.field4052.field2649;
        float var6 = arg3.field4052.field2668;
        float var7 = arg3.field4052.field2671;
        float var8 = arg3.field4052.field2679;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class400 var12 = arg1.field8978.field6446;
            for (class400 var13 = var12.field6020; var13 != var12; var13 = var13.field6020) {
                class169 var14 = (class169) var13;
                int var15 = (int) ((float) (var14.field2393 >> 12) * var7 + (float) (var14.field2395 >> 12) * var5 + (float) (var14.field2386 >> 12) * var6 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field8333[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (arg2 >= var16 + 2) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = 1 - (this.field8329 - class341.method2115(arg2 ^ 0x6CCF, var16));
                var16 = (var16 >> var17) + 2;
            }
            class400 var18 = var12.field6020;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field8334 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field8332[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field8330[var24] = 0;
                }
                while (var12 != var18) {
                    class169 var25 = (class169) var18;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field2394;
                        var20 = var25.field2392;
                    }
                    if (var19 > 0 && (var25.field2392 != var20 || var25.field2394 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field8333[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field8332[var26] < 64) {
                            this.field8331[var26][this.field8332[var26]++] = var25;
                        } else {
                            label102: {
                                if (this.field8332[var26] == 64) {
                                    if (this.field8334 == 64) {
                                        break label102;
                                    }
                                    this.field8332[var26] += this.field8334++ + 1;
                                }
                                this.field8335[this.field8332[var26] - 64 - 1][this.field8330[this.field8332[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field6020;
                }
                if (var20 < 0) {
                    arg3.method1761(-1, 260);
                } else {
                    arg3.method1761(var20, 260);
                }
                if (var21 && class597.field8647 != arg3.field4121) {
                    arg3.method711(class597.field8647);
                } else if (arg3.field4121 != 1.0F) {
                    arg3.method711(1.0F);
                }
                this.method3297(arg3, var16, arg2 ^ 0xFFFFF986);
            }
        } catch (Exception var27) {
        }
        this.method3296(arg2 + 14785, arg3);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 211)
    public static final void method3295(int arg0) {
        class61.method379((byte) -101, false);
        if (arg0 < 114) {
            return;
        }
        field8318++;
        if (class340.field5001 >= 0 && class340.field5001 != 0) {
            class409.method2509(512, class340.field5001);
            class340.field5001 = -1;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILuca;)V", line = 234)
    private final void method3296(int arg0, class287 arg1) {
        arg1.method1694((byte) 94, true);
        field8324++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg0);
        if (class597.field8647 != arg1.field4121) {
            arg1.method711(class597.field8647);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Luca;II)V", line = 250)
    private final void method3297(class287 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field8322, 0);
        field8314++;
        float var4 = this.field8322[0];
        float var5 = this.field8322[4];
        float var6 = this.field8322[8];
        float var7 = this.field8322[1];
        float var8 = this.field8322[5];
        float var9 = this.field8322[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        if (arg2 > -8) {
            this.field8332 = null;
        }
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8317.field7956 = 0;
        float var18 = var9 - var6;
        if (arg0.field4060) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field8332[var19] > 64 ? 64 : this.field8332[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class169 var34 = this.field8331[var19][var21];
                        int var35 = var34.field2384;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2395 >> 12);
                        float var41 = (float) (var34.field2386 >> 12);
                        float var42 = (float) (var34.field2393 >> 12);
                        int var43 = var34.field2391 >> 12;
                        this.field8317.method2651(874114616, 0.0F);
                        this.field8317.method2651(874114616, 0.0F);
                        this.field8317.method2651(874114616, (float) (-var43) * var10 + var40);
                        this.field8317.method2651(874114616, (float) (-var43) * var11 + var41);
                        this.field8317.method2651(874114616, (float) (-var43) * var12 + var42);
                        this.field8317.method3110(var36, 90);
                        this.field8317.method3110(var37, 68);
                        this.field8317.method3110(var38, 45);
                        this.field8317.method3110(var39, 49);
                        this.field8317.method2651(874114616, 1.0F);
                        this.field8317.method2651(874114616, 0.0F);
                        this.field8317.method2651(874114616, (float) var43 * var13 + var40);
                        this.field8317.method2651(874114616, (float) var43 * var14 + var41);
                        this.field8317.method2651(874114616, (float) var43 * var15 + var42);
                        this.field8317.method3110(var36, 36);
                        this.field8317.method3110(var37, 103);
                        this.field8317.method3110(var38, 73);
                        this.field8317.method3110(var39, 61);
                        this.field8317.method2651(874114616, 1.0F);
                        this.field8317.method2651(874114616, 1.0F);
                        this.field8317.method2651(874114616, (float) var43 * var10 + var40);
                        this.field8317.method2651(874114616, (float) var43 * var11 + var41);
                        this.field8317.method2651(874114616, (float) var43 * var12 + var42);
                        this.field8317.method3110(var36, 34);
                        this.field8317.method3110(var37, 123);
                        this.field8317.method3110(var38, 73);
                        this.field8317.method3110(var39, 100);
                        this.field8317.method2651(874114616, 0.0F);
                        this.field8317.method2651(874114616, 1.0F);
                        this.field8317.method2651(874114616, (float) var43 * var16 + var40);
                        this.field8317.method2651(874114616, (float) var43 * var17 + var41);
                        this.field8317.method2651(874114616, (float) var43 * var18 + var42);
                        this.field8317.method3110(var36, 37);
                        this.field8317.method3110(var37, 92);
                        this.field8317.method3110(var38, 66);
                        this.field8317.method3110(var39, 110);
                    }
                    if (this.field8332[var19] > 64) {
                        int var22 = this.field8332[var19] - 1 - 64;
                        for (int var23 = this.field8330[var22] - 1; var23 >= 0; var23--) {
                            class169 var24 = this.field8335[var22][var23];
                            int var25 = var24.field2384;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2395 >> 12);
                            float var31 = (float) (var24.field2386 >> 12);
                            float var32 = (float) (var24.field2393 >> 12);
                            int var33 = var24.field2391 >> 12;
                            this.field8317.method2651(874114616, 0.0F);
                            this.field8317.method2651(874114616, 0.0F);
                            this.field8317.method2651(874114616, (float) (-var33) * var10 + var30);
                            this.field8317.method2651(874114616, (float) (-var33) * var11 + var31);
                            this.field8317.method2651(874114616, (float) (-var33) * var12 + var32);
                            this.field8317.method3110(var26, 126);
                            this.field8317.method3110(var27, 126);
                            this.field8317.method3110(var28, 110);
                            this.field8317.method3110(var29, 51);
                            this.field8317.method2651(874114616, 1.0F);
                            this.field8317.method2651(874114616, 0.0F);
                            this.field8317.method2651(874114616, (float) var33 * var13 + var30);
                            this.field8317.method2651(874114616, (float) var33 * var14 + var31);
                            this.field8317.method2651(874114616, (float) var33 * var15 + var32);
                            this.field8317.method3110(var26, 33);
                            this.field8317.method3110(var27, 90);
                            this.field8317.method3110(var28, 101);
                            this.field8317.method3110(var29, 41);
                            this.field8317.method2651(874114616, 1.0F);
                            this.field8317.method2651(874114616, 1.0F);
                            this.field8317.method2651(874114616, (float) var33 * var10 + var30);
                            this.field8317.method2651(874114616, (float) var33 * var11 + var31);
                            this.field8317.method2651(874114616, (float) var33 * var12 + var32);
                            this.field8317.method3110(var26, 63);
                            this.field8317.method3110(var27, 32);
                            this.field8317.method3110(var28, 67);
                            this.field8317.method3110(var29, 107);
                            this.field8317.method2651(874114616, 0.0F);
                            this.field8317.method2651(874114616, 1.0F);
                            this.field8317.method2651(874114616, (float) var33 * var16 + var30);
                            this.field8317.method2651(874114616, (float) var33 * var17 + var31);
                            this.field8317.method2651(874114616, (float) var33 * var18 + var32);
                            this.field8317.method3110(var26, 99);
                            this.field8317.method3110(var27, 87);
                            this.field8317.method3110(var28, 79);
                            this.field8317.method3110(var29, 127);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field8332[var44] <= 64 ? this.field8332[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class169 var59 = this.field8331[var44][var46];
                        int var60 = var59.field2384;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2395 >> 12);
                        float var66 = (float) (var59.field2386 >> 12);
                        float var67 = (float) (var59.field2393 >> 12);
                        int var68 = var59.field2391 >> 12;
                        this.field8317.method2650(929234520, 0.0F);
                        this.field8317.method2650(929234520, 0.0F);
                        this.field8317.method2650(929234520, (float) (-var68) * var10 + var65);
                        this.field8317.method2650(929234520, (float) (-var68) * var11 + var66);
                        this.field8317.method2650(929234520, (float) (-var68) * var12 + var67);
                        this.field8317.method3110(var61, 116);
                        this.field8317.method3110(var62, 91);
                        this.field8317.method3110(var63, 104);
                        this.field8317.method3110(var64, 62);
                        this.field8317.method2650(929234520, 1.0F);
                        this.field8317.method2650(929234520, 0.0F);
                        this.field8317.method2650(929234520, (float) var68 * var13 + var65);
                        this.field8317.method2650(929234520, (float) var68 * var14 + var66);
                        this.field8317.method2650(929234520, (float) var68 * var15 + var67);
                        this.field8317.method3110(var61, 44);
                        this.field8317.method3110(var62, 90);
                        this.field8317.method3110(var63, 62);
                        this.field8317.method3110(var64, 86);
                        this.field8317.method2650(929234520, 1.0F);
                        this.field8317.method2650(929234520, 1.0F);
                        this.field8317.method2650(929234520, (float) var68 * var10 + var65);
                        this.field8317.method2650(929234520, (float) var68 * var11 + var66);
                        this.field8317.method2650(929234520, (float) var68 * var12 + var67);
                        this.field8317.method3110(var61, 84);
                        this.field8317.method3110(var62, 95);
                        this.field8317.method3110(var63, 75);
                        this.field8317.method3110(var64, 73);
                        this.field8317.method2650(929234520, 0.0F);
                        this.field8317.method2650(929234520, 1.0F);
                        this.field8317.method2650(929234520, (float) var68 * var16 + var65);
                        this.field8317.method2650(929234520, (float) var68 * var17 + var66);
                        this.field8317.method2650(929234520, (float) var68 * var18 + var67);
                        this.field8317.method3110(var61, 120);
                        this.field8317.method3110(var62, 126);
                        this.field8317.method3110(var63, 53);
                        this.field8317.method3110(var64, 75);
                    }
                    if (this.field8332[var44] > 64) {
                        int var47 = this.field8332[var44] - 64 - 1;
                        for (int var48 = this.field8330[var47] - 1; var48 >= 0; var48--) {
                            class169 var49 = this.field8335[var47][var48];
                            int var50 = var49.field2384;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2395 >> 12);
                            float var56 = (float) (var49.field2386 >> 12);
                            float var57 = (float) (var49.field2393 >> 12);
                            int var58 = var49.field2391 >> 12;
                            this.field8317.method2650(929234520, 0.0F);
                            this.field8317.method2650(929234520, 0.0F);
                            this.field8317.method2650(929234520, (float) (-var58) * var10 + var55);
                            this.field8317.method2650(929234520, (float) (-var58) * var11 + var56);
                            this.field8317.method2650(929234520, (float) (-var58) * var12 + var57);
                            this.field8317.method3110(var51, 125);
                            this.field8317.method3110(var52, 43);
                            this.field8317.method3110(var53, 51);
                            this.field8317.method3110(var54, 127);
                            this.field8317.method2650(929234520, 1.0F);
                            this.field8317.method2650(929234520, 0.0F);
                            this.field8317.method2650(929234520, (float) var58 * var13 + var55);
                            this.field8317.method2650(929234520, (float) var58 * var14 + var56);
                            this.field8317.method2650(929234520, (float) var58 * var15 + var57);
                            this.field8317.method3110(var51, 86);
                            this.field8317.method3110(var52, 43);
                            this.field8317.method3110(var53, 108);
                            this.field8317.method3110(var54, 93);
                            this.field8317.method2650(929234520, 1.0F);
                            this.field8317.method2650(929234520, 1.0F);
                            this.field8317.method2650(929234520, (float) var58 * var10 + var55);
                            this.field8317.method2650(929234520, (float) var58 * var11 + var56);
                            this.field8317.method2650(929234520, (float) var58 * var12 + var57);
                            this.field8317.method3110(var51, 60);
                            this.field8317.method3110(var52, 101);
                            this.field8317.method3110(var53, 115);
                            this.field8317.method3110(var54, 71);
                            this.field8317.method2650(929234520, 0.0F);
                            this.field8317.method2650(929234520, 1.0F);
                            this.field8317.method2650(929234520, (float) var58 * var16 + var55);
                            this.field8317.method2650(929234520, (float) var58 * var17 + var56);
                            this.field8317.method2650(929234520, (float) var58 * var18 + var57);
                            this.field8317.method3110(var51, 90);
                            this.field8317.method3110(var52, 124);
                            this.field8317.method3110(var53, 109);
                            this.field8317.method3110(var54, 42);
                        }
                    }
                }
            }
        }
        if (this.field8317.field7956 != 0) {
            this.field8328.method2988(24, -10884, this.field8317.field7952, this.field8317.field7956);
            arg0.method1714(this.field8327, -1, null, this.field8325, this.field8326);
            arg0.method1754(0, (byte) -127, this.field8317.field7956 / 24, 7);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILuca;I)V", line = 609)
    private final void method3298(int arg0, class287 arg1, int arg2) {
        field8321++;
        class597.field8647 = arg1.field4121;
        arg1.method1691((float) arg0, true);
        arg1.method1712(false);
        OpenGL.glDisable(arg2);
        OpenGL.glDisable(16385);
        arg1.method1694((byte) 125, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLuca;)V", line = 632)
    public final void method3299(boolean arg0, class287 arg1) {
        field8319++;
        this.field8328 = arg1.method1753(24, null, 196584, arg0, -11863);
        this.field8327 = new class39(this.field8328, 5126, 2, 0);
        this.field8326 = new class39(this.field8328, 5126, 3, 8);
        this.field8325 = new class39(this.field8328, 5121, 4, 20);
    }
}
