import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class556 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[F")
    private float[] field7668 = new float[16];

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lmh;")
    private class541 field7667 = new class541(786336);

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field7673 = class98.method703(1600, 0);

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
    private int[] field7677 = new int[1600];

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "[I")
    private int[] field7681 = new int[8191];

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "[[Lmca;")
    private class28[][] field7679 = new class28[64][768];

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[I")
    private int[] field7680 = new int[64];

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field7682 = 0;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[[Lmca;")
    private class28[][] field7678 = new class28[1600][64];

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lh;")
    public static class571 field7665 = new class571(8);

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lej;")
    public static class104 field7670 = new class104("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lnw;")
    public static class503 field7671 = new class503(8);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lqd;")
    private class381 field7676;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Ldd;")
    private class603 field7672;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ldd;")
    private class603 field7674;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Ldd;")
    private class603 field7675;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method3152(int arg0) {
        field7665 = null;
        field7671 = null;
        field7670 = null;
        if (arg0 != 3) {
            field7665 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgi;II)V")
    private final void method3153(class583 arg0, int arg1, int arg2) {
        field7666++;
        OpenGL.glGetFloatv(2982, this.field7668, 0);
        float var4 = this.field7668[0];
        float var5 = this.field7668[4];
        float var6 = this.field7668[8];
        float var7 = this.field7668[1];
        float var8 = this.field7668[5];
        float var9 = this.field7668[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field7667.field165 = 0;
        if (arg0.field8254) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7677[var19] > 64 ? 64 : this.field7677[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class28 var34 = this.field7678[var19][var21];
                        int var35 = var34.field480;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field468 >> 12);
                        float var41 = (float) (var34.field478 >> 12);
                        float var42 = (float) (var34.field479 >> 12);
                        int var43 = var34.field475 >> 12;
                        this.field7667.method3100(0.0F, -794787512);
                        this.field7667.method3100(0.0F, arg1 ^ 0xD0A0814F);
                        this.field7667.method3100((float) (-var43) * var10 + var40, -794787512);
                        this.field7667.method3100((float) (-var43) * var11 + var41, -794787512);
                        this.field7667.method3100((float) (-var43) * var12 + var42, -794787512);
                        this.field7667.method108((byte) -128, var36);
                        this.field7667.method108((byte) -128, var37);
                        this.field7667.method108((byte) -128, var38);
                        this.field7667.method108((byte) -128, var39);
                        this.field7667.method3100(1.0F, -794787512);
                        this.field7667.method3100(0.0F, -794787512);
                        this.field7667.method3100((float) var43 * var13 + var40, -794787512);
                        this.field7667.method3100((float) var43 * var14 + var41, arg1 ^ 0xD0A0814F);
                        this.field7667.method3100((float) var43 * var15 + var42, -794787512);
                        this.field7667.method108((byte) -128, var36);
                        this.field7667.method108((byte) -128, var37);
                        this.field7667.method108((byte) -128, var38);
                        this.field7667.method108((byte) -128, var39);
                        this.field7667.method3100(1.0F, arg1 ^ 0xD0A0814F);
                        this.field7667.method3100(1.0F, -794787512);
                        this.field7667.method3100((float) var43 * var10 + var40, -794787512);
                        this.field7667.method3100((float) var43 * var11 + var41, -794787512);
                        this.field7667.method3100((float) var43 * var12 + var42, -794787512);
                        this.field7667.method108((byte) -128, var36);
                        this.field7667.method108((byte) -128, var37);
                        this.field7667.method108((byte) -128, var38);
                        this.field7667.method108((byte) -128, var39);
                        this.field7667.method3100(0.0F, -794787512);
                        this.field7667.method3100(1.0F, -794787512);
                        this.field7667.method3100((float) var43 * var16 + var40, arg1 ^ 0xD0A0814F);
                        this.field7667.method3100((float) var43 * var17 + var41, -794787512);
                        this.field7667.method3100((float) var43 * var18 + var42, -794787512);
                        this.field7667.method108((byte) -128, var36);
                        this.field7667.method108((byte) -128, var37);
                        this.field7667.method108((byte) -128, var38);
                        this.field7667.method108((byte) -128, var39);
                    }
                    if (this.field7677[var19] > 64) {
                        int var22 = this.field7677[var19] - 64 - 1;
                        for (int var23 = this.field7680[var22] - 1; var23 >= 0; var23--) {
                            class28 var24 = this.field7679[var22][var23];
                            int var25 = var24.field480;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field468 >> 12);
                            float var31 = (float) (var24.field478 >> 12);
                            float var32 = (float) (var24.field479 >> 12);
                            int var33 = var24.field475 >> 12;
                            this.field7667.method3100(0.0F, -794787512);
                            this.field7667.method3100(0.0F, -794787512);
                            this.field7667.method3100((float) (-var33) * var10 + var30, -794787512);
                            this.field7667.method3100((float) (-var33) * var11 + var31, -794787512);
                            this.field7667.method3100((float) (-var33) * var12 + var32, -794787512);
                            this.field7667.method108((byte) -128, var26);
                            this.field7667.method108((byte) -128, var27);
                            this.field7667.method108((byte) -128, var28);
                            this.field7667.method108((byte) -128, var29);
                            this.field7667.method3100(1.0F, -794787512);
                            this.field7667.method3100(0.0F, -794787512);
                            this.field7667.method3100((float) var33 * var13 + var30, -794787512);
                            this.field7667.method3100((float) var33 * var14 + var31, arg1 ^ 0xD0A0814F);
                            this.field7667.method3100((float) var33 * var15 + var32, -794787512);
                            this.field7667.method108((byte) -128, var26);
                            this.field7667.method108((byte) -128, var27);
                            this.field7667.method108((byte) -128, var28);
                            this.field7667.method108((byte) -128, var29);
                            this.field7667.method3100(1.0F, -794787512);
                            this.field7667.method3100(1.0F, arg1 - 794787519);
                            this.field7667.method3100((float) var33 * var10 + var30, -794787512);
                            this.field7667.method3100((float) var33 * var11 + var31, -794787512);
                            this.field7667.method3100((float) var33 * var12 + var32, -794787512);
                            this.field7667.method108((byte) -128, var26);
                            this.field7667.method108((byte) -128, var27);
                            this.field7667.method108((byte) -128, var28);
                            this.field7667.method108((byte) -128, var29);
                            this.field7667.method3100(0.0F, arg1 ^ 0xD0A0814F);
                            this.field7667.method3100(1.0F, -794787512);
                            this.field7667.method3100((float) var33 * var16 + var30, -794787512);
                            this.field7667.method3100((float) var33 * var17 + var31, -794787512);
                            this.field7667.method3100((float) var33 * var18 + var32, arg1 ^ 0xD0A0814F);
                            this.field7667.method108((byte) -128, var26);
                            this.field7667.method108((byte) -128, var27);
                            this.field7667.method108((byte) -128, var28);
                            this.field7667.method108((byte) -128, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7677[var44] > 64 ? 64 : this.field7677[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class28 var59 = this.field7678[var44][var46];
                        int var60 = var59.field480;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field468 >> 12);
                        float var66 = (float) (var59.field478 >> 12);
                        float var67 = (float) (var59.field479 >> 12);
                        int var68 = var59.field475 >> 12;
                        this.field7667.method3101((byte) 117, 0.0F);
                        this.field7667.method3101((byte) 53, 0.0F);
                        this.field7667.method3101((byte) 93, (float) (-var68) * var10 + var65);
                        this.field7667.method3101((byte) 112, (float) (-var68) * var11 + var66);
                        this.field7667.method3101((byte) 56, (float) (-var68) * var12 + var67);
                        this.field7667.method108((byte) -128, var61);
                        this.field7667.method108((byte) -128, var62);
                        this.field7667.method108((byte) -128, var63);
                        this.field7667.method108((byte) -128, var64);
                        this.field7667.method3101((byte) 123, 1.0F);
                        this.field7667.method3101((byte) 59, 0.0F);
                        this.field7667.method3101((byte) 62, (float) var68 * var13 + var65);
                        this.field7667.method3101((byte) 70, (float) var68 * var14 + var66);
                        this.field7667.method3101((byte) 95, (float) var68 * var15 + var67);
                        this.field7667.method108((byte) -128, var61);
                        this.field7667.method108((byte) -128, var62);
                        this.field7667.method108((byte) -128, var63);
                        this.field7667.method108((byte) -128, var64);
                        this.field7667.method3101((byte) 111, 1.0F);
                        this.field7667.method3101((byte) 125, 1.0F);
                        this.field7667.method3101((byte) 99, (float) var68 * var10 + var65);
                        this.field7667.method3101((byte) 117, (float) var68 * var11 + var66);
                        this.field7667.method3101((byte) 117, (float) var68 * var12 + var67);
                        this.field7667.method108((byte) -128, var61);
                        this.field7667.method108((byte) -128, var62);
                        this.field7667.method108((byte) -128, var63);
                        this.field7667.method108((byte) -128, var64);
                        this.field7667.method3101((byte) 113, 0.0F);
                        this.field7667.method3101((byte) 110, 1.0F);
                        this.field7667.method3101((byte) 118, (float) var68 * var16 + var65);
                        this.field7667.method3101((byte) 125, (float) var68 * var17 + var66);
                        this.field7667.method3101((byte) 92, (float) var68 * var18 + var67);
                        this.field7667.method108((byte) -128, var61);
                        this.field7667.method108((byte) -128, var62);
                        this.field7667.method108((byte) -128, var63);
                        this.field7667.method108((byte) -128, var64);
                    }
                    if (this.field7677[var44] > 64) {
                        int var47 = this.field7677[var44] - 1 - 64;
                        for (int var48 = this.field7680[var47] - 1; var48 >= 0; var48--) {
                            class28 var49 = this.field7679[var47][var48];
                            int var50 = var49.field480;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field468 >> 12);
                            float var56 = (float) (var49.field478 >> 12);
                            float var57 = (float) (var49.field479 >> 12);
                            int var58 = var49.field475 >> 12;
                            this.field7667.method3101((byte) 82, 0.0F);
                            this.field7667.method3101((byte) 75, 0.0F);
                            this.field7667.method3101((byte) 112, (float) (-var58) * var10 + var55);
                            this.field7667.method3101((byte) 118, (float) (-var58) * var11 + var56);
                            this.field7667.method3101((byte) 63, (float) (-var58) * var12 + var57);
                            this.field7667.method108((byte) -128, var51);
                            this.field7667.method108((byte) -128, var52);
                            this.field7667.method108((byte) -128, var53);
                            this.field7667.method108((byte) -128, var54);
                            this.field7667.method3101((byte) 78, 1.0F);
                            this.field7667.method3101((byte) 84, 0.0F);
                            this.field7667.method3101((byte) 88, (float) var58 * var13 + var55);
                            this.field7667.method3101((byte) 105, (float) var58 * var14 + var56);
                            this.field7667.method3101((byte) 64, (float) var58 * var15 + var57);
                            this.field7667.method108((byte) -128, var51);
                            this.field7667.method108((byte) -128, var52);
                            this.field7667.method108((byte) -128, var53);
                            this.field7667.method108((byte) -128, var54);
                            this.field7667.method3101((byte) 87, 1.0F);
                            this.field7667.method3101((byte) 112, 1.0F);
                            this.field7667.method3101((byte) 85, (float) var58 * var10 + var55);
                            this.field7667.method3101((byte) 65, (float) var58 * var11 + var56);
                            this.field7667.method3101((byte) 90, (float) var58 * var12 + var57);
                            this.field7667.method108((byte) -128, var51);
                            this.field7667.method108((byte) -128, var52);
                            this.field7667.method108((byte) -128, var53);
                            this.field7667.method108((byte) -128, var54);
                            this.field7667.method3101((byte) 78, 0.0F);
                            this.field7667.method3101((byte) 102, 1.0F);
                            this.field7667.method3101((byte) 92, (float) var58 * var16 + var55);
                            this.field7667.method3101((byte) 79, (float) var58 * var17 + var56);
                            this.field7667.method3101((byte) 63, (float) var58 * var18 + var57);
                            this.field7667.method108((byte) -128, var51);
                            this.field7667.method108((byte) -128, var52);
                            this.field7667.method108((byte) -128, var53);
                            this.field7667.method108((byte) -128, var54);
                        }
                    }
                }
            }
        }
        if (arg1 != 7) {
            this.method3158(null, false);
        }
        if (this.field7667.field165 != 0) {
            this.field7676.method2019(this.field7667.field165, this.field7667.field138, 24, 12766);
            arg0.method3380(this.field7672, null, this.field7675, 15097, this.field7674);
            arg0.method3342(0, this.field7667.field165 / 24, 20986, 7);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static final int method3154(int arg0, int arg1) {
        field7662++;
        int var2 = arg0 & 0x3F;
        if (arg1 >= -122) {
            method3152(63);
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgi;I)V")
    private final void method3155(class583 arg0, int arg1) {
        arg0.method3331(true, -25107);
        field7663++;
        if (arg1 >= -43) {
            this.field7673 = -24;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class22.field327 != arg0.field8245) {
            arg0.method1295(class22.field327);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgi;Z)V")
    public final void method3156(class583 arg0, boolean arg1) {
        field7661++;
        this.field7676 = arg0.method3400(24, -70, arg1, 196584, null);
        this.field7674 = new class603(this.field7676, 5126, 2, 0);
        this.field7675 = new class603(this.field7676, 5126, 3, 8);
        this.field7672 = new class603(this.field7676, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILhp;Lgi;)V")
    public final void method3157(int arg0, class274 arg1, class583 arg2) {
        field7660++;
        if (arg2.field8321 == null) {
            return;
        }
        this.method3158(arg2, false);
        float var4 = arg2.field8321.field3727;
        float var5 = arg2.field8321.field3730;
        if (arg0 != 0) {
            this.method3156(null, false);
        }
        float var6 = arg2.field8321.field3717;
        float var7 = arg2.field8321.field3720;
        try {
            if (arg1.field3803) {
                int var26 = arg1.field3804 - arg1.field3805;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class98.method703(var26, arg0) + 1 - this.field7673;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class590 var28 = arg1.field3798.field3267;
                class590 var29 = var28.field8428;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field7682 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7677[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7680[var34] = 0;
                    }
                    while (var28 != var29) {
                        class28 var35 = (class28) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field481;
                            var30 = var35.field469;
                        } else if (var35.field469 != var30 || var35.field481 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field479 >> 12) * var6 + (float) (var35.field478 >> 12) * var5 + (float) (var35.field468 >> 12) * var4 + var7) - arg1.field3805 >> var27;
                        if (var36 < 1600) {
                            if (this.field7677[var36] >= 64) {
                                label144: {
                                    if (this.field7677[var36] == 64) {
                                        if (this.field7682 == 64) {
                                            break label144;
                                        }
                                        this.field7677[var36] += this.field7682++ + 1;
                                    }
                                    this.field7679[this.field7677[var36] - 64 - 1][this.field7680[this.field7677[var36] - 1 - 64]++] = var35;
                                }
                            } else {
                                this.field7678[var36][this.field7677[var36]++] = var35;
                            }
                        }
                        var29 = var29.field8428;
                    }
                    if (var30 >= 0) {
                        arg2.method3408(var30, (byte) 123);
                    } else {
                        arg2.method3408(-1, (byte) 78);
                    }
                    if (var31 && class22.field327 != arg2.field8245) {
                        arg2.method1295(class22.field327);
                    } else if (arg2.field8245 != 1.0F) {
                        arg2.method1295(1.0F);
                    }
                    this.method3153(arg2, 7, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class590 var11 = arg1.field3798.field3267;
                for (class590 var12 = var11.field8428; var12 != var11; var12 = var12.field8428) {
                    class28 var13 = (class28) var12;
                    int var14 = (int) ((float) (var13.field479 >> 12) * var6 + (float) (var13.field478 >> 12) * var5 + (float) (var13.field468 >> 12) * var4 + var7);
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    this.field7681[var8++] = var14;
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class98.method703(var15, 0) + 1 - this.field7673;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var16 = 0;
                    var15 += 2;
                }
                class590 var17 = var11.field8428;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field7682 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field7677[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field7680[var23] = 0;
                    }
                    while (var11 != var17) {
                        class28 var24 = (class28) var17;
                        if (var21) {
                            var19 = var24.field469;
                            var20 = var24.field481;
                            var21 = false;
                        }
                        if (var18 > 0 && (var24.field469 != var19 || var24.field481 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field7681[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field7677[var25] >= 64) {
                                label189: {
                                    if (this.field7677[var25] == 64) {
                                        if (this.field7682 == 64) {
                                            break label189;
                                        }
                                        this.field7677[var25] += this.field7682++ + 1;
                                    }
                                    this.field7679[this.field7677[var25] - 64 - 1][this.field7680[this.field7677[var25] - 1 - 64]++] = var24;
                                }
                            } else {
                                this.field7678[var25][this.field7677[var25]++] = var24;
                            }
                        }
                        var17 = var17.field8428;
                    }
                    if (var19 < 0) {
                        arg2.method3408(-1, (byte) 48);
                    } else {
                        arg2.method3408(var19, (byte) 34);
                    }
                    if (var20 && class22.field327 != arg2.field8245) {
                        arg2.method1295(class22.field327);
                    } else if (arg2.field8245 != 1.0F) {
                        arg2.method1295(1.0F);
                    }
                    this.method3153(arg2, arg0 ^ 0x7, var15);
                }
            }
        } catch (Exception var37) {
        }
        this.method3155(arg2, -122);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lgi;Z)V")
    private final void method3158(class583 arg0, boolean arg1) {
        class22.field327 = arg0.field8245;
        field7664++;
        arg0.method3329(8);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3331(arg1, -25107);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
