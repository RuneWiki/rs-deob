import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class246 {

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[F")
    private float[] field3752 = new float[16];

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "Lka;")
    private class315 field3761 = new class315(786336);

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    private int field3763 = class402.method2383(123, 1600);

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "[I")
    private int[] field3767 = new int[64];

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "[I")
    private int[] field3768 = new int[8191];

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    private int field3770 = 0;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
    private int[] field3772 = new int[1600];

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "[[Lpa;")
    private class239[][] field3769 = new class239[64][768];

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "[[Lpa;")
    private class239[][] field3771 = new class239[1600][64];

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Loe;")
    public static class127 field3755 = new class127(20, 0);

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Leo;")
    private class186 field3766;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "Lot;")
    private class400 field3762;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "Lot;")
    private class400 field3764;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "Lot;")
    private class400 field3765;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lbl;II)V")
    private final void method1481(class442 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field3752, 0);
        field3749++;
        float var4 = this.field3752[0];
        float var5 = this.field3752[4];
        float var6 = this.field3752[8];
        float var7 = this.field3752[1];
        float var8 = this.field3752[5];
        float var9 = this.field3752[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field3761.field585 = 0;
        float var18 = var9 - var6;
        if (arg0.field6745) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field3772[var19] <= 64 ? this.field3772[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class239 var34 = this.field3771[var19][var21];
                        int var35 = var34.field3598;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3596 >> class305.field4630);
                        float var41 = (float) (var34.field3609 >> class305.field4630);
                        float var42 = (float) (var34.field3601 >> class305.field4630);
                        int var43 = var34.field3606 >> class305.field4630;
                        this.field3761.method1878((byte) -13, 0.0F);
                        this.field3761.method1878((byte) -119, 0.0F);
                        this.field3761.method1878((byte) -91, (float) (-var43) * var10 + var40);
                        this.field3761.method1878((byte) -97, (float) (-var43) * var11 + var41);
                        this.field3761.method1878((byte) -90, (float) (-var43) * var12 + var42);
                        this.field3761.method221(-1, var36);
                        this.field3761.method221(-1, var37);
                        this.field3761.method221(-1, var38);
                        this.field3761.method221(-1, var39);
                        this.field3761.method1878((byte) -126, 1.0F);
                        this.field3761.method1878((byte) 33, 0.0F);
                        this.field3761.method1878((byte) -99, (float) var43 * var13 + var40);
                        this.field3761.method1878((byte) -124, (float) var43 * var14 + var41);
                        this.field3761.method1878((byte) -1, (float) var43 * var15 + var42);
                        this.field3761.method221(-1, var36);
                        this.field3761.method221(-1, var37);
                        this.field3761.method221(-1, var38);
                        this.field3761.method221(-1, var39);
                        this.field3761.method1878((byte) 11, 1.0F);
                        this.field3761.method1878((byte) -118, 1.0F);
                        this.field3761.method1878((byte) -88, (float) var43 * var10 + var40);
                        this.field3761.method1878((byte) -115, (float) var43 * var11 + var41);
                        this.field3761.method1878((byte) 54, (float) var43 * var12 + var42);
                        this.field3761.method221(-1, var36);
                        this.field3761.method221(-1, var37);
                        this.field3761.method221(-1, var38);
                        this.field3761.method221(-1, var39);
                        this.field3761.method1878((byte) -13, 0.0F);
                        this.field3761.method1878((byte) -124, 1.0F);
                        this.field3761.method1878((byte) 52, (float) var43 * var16 + var40);
                        this.field3761.method1878((byte) 121, (float) var43 * var17 + var41);
                        this.field3761.method1878((byte) 94, (float) var43 * var18 + var42);
                        this.field3761.method221(-1, var36);
                        this.field3761.method221(-1, var37);
                        this.field3761.method221(-1, var38);
                        this.field3761.method221(-1, var39);
                    }
                    if (this.field3772[var19] > 64) {
                        int var22 = this.field3772[var19] - 64 - 1;
                        for (int var23 = this.field3767[var22] - 1; var23 >= 0; var23--) {
                            class239 var24 = this.field3769[var22][var23];
                            int var25 = var24.field3598;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3596 >> class305.field4630);
                            float var31 = (float) (var24.field3609 >> class305.field4630);
                            float var32 = (float) (var24.field3601 >> class305.field4630);
                            int var33 = var24.field3606 >> class305.field4630;
                            this.field3761.method1878((byte) 74, 0.0F);
                            this.field3761.method1878((byte) -116, 0.0F);
                            this.field3761.method1878((byte) 27, (float) (-var33) * var10 + var30);
                            this.field3761.method1878((byte) -108, (float) (-var33) * var11 + var31);
                            this.field3761.method1878((byte) 117, (float) (-var33) * var12 + var32);
                            this.field3761.method221(-1, var26);
                            this.field3761.method221(-1, var27);
                            this.field3761.method221(-1, var28);
                            this.field3761.method221(-1, var29);
                            this.field3761.method1878((byte) 85, 1.0F);
                            this.field3761.method1878((byte) -114, 0.0F);
                            this.field3761.method1878((byte) -12, (float) var33 * var13 + var30);
                            this.field3761.method1878((byte) 47, (float) var33 * var14 + var31);
                            this.field3761.method1878((byte) 108, (float) var33 * var15 + var32);
                            this.field3761.method221(-1, var26);
                            this.field3761.method221(-1, var27);
                            this.field3761.method221(-1, var28);
                            this.field3761.method221(-1, var29);
                            this.field3761.method1878((byte) -95, 1.0F);
                            this.field3761.method1878((byte) -96, 1.0F);
                            this.field3761.method1878((byte) -112, (float) var33 * var10 + var30);
                            this.field3761.method1878((byte) -87, (float) var33 * var11 + var31);
                            this.field3761.method1878((byte) -122, (float) var33 * var12 + var32);
                            this.field3761.method221(-1, var26);
                            this.field3761.method221(-1, var27);
                            this.field3761.method221(-1, var28);
                            this.field3761.method221(-1, var29);
                            this.field3761.method1878((byte) -101, 0.0F);
                            this.field3761.method1878((byte) -117, 1.0F);
                            this.field3761.method1878((byte) -110, (float) var33 * var16 + var30);
                            this.field3761.method1878((byte) 105, (float) var33 * var17 + var31);
                            this.field3761.method1878((byte) 50, (float) var33 * var18 + var32);
                            this.field3761.method221(-1, var26);
                            this.field3761.method221(-1, var27);
                            this.field3761.method221(-1, var28);
                            this.field3761.method221(-1, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field3772[var44] <= 64 ? this.field3772[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class239 var59 = this.field3771[var44][var46];
                        int var60 = var59.field3598;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3596 >> class305.field4630);
                        float var66 = (float) (var59.field3609 >> class305.field4630);
                        float var67 = (float) (var59.field3601 >> class305.field4630);
                        int var68 = var59.field3606 >> class305.field4630;
                        this.field3761.method1881((byte) -40, 0.0F);
                        this.field3761.method1881((byte) -40, 0.0F);
                        this.field3761.method1881((byte) -40, (float) (-var68) * var10 + var65);
                        this.field3761.method1881((byte) -40, (float) (-var68) * var11 + var66);
                        this.field3761.method1881((byte) -40, (float) (-var68) * var12 + var67);
                        this.field3761.method221(-1, var61);
                        this.field3761.method221(-1, var62);
                        this.field3761.method221(-1, var63);
                        this.field3761.method221(-1, var64);
                        this.field3761.method1881((byte) -40, 1.0F);
                        this.field3761.method1881((byte) -40, 0.0F);
                        this.field3761.method1881((byte) -40, (float) var68 * var13 + var65);
                        this.field3761.method1881((byte) -40, (float) var68 * var14 + var66);
                        this.field3761.method1881((byte) -40, (float) var68 * var15 + var67);
                        this.field3761.method221(-1, var61);
                        this.field3761.method221(-1, var62);
                        this.field3761.method221(-1, var63);
                        this.field3761.method221(-1, var64);
                        this.field3761.method1881((byte) -40, 1.0F);
                        this.field3761.method1881((byte) -40, 1.0F);
                        this.field3761.method1881((byte) -40, (float) var68 * var10 + var65);
                        this.field3761.method1881((byte) -40, (float) var68 * var11 + var66);
                        this.field3761.method1881((byte) -40, (float) var68 * var12 + var67);
                        this.field3761.method221(-1, var61);
                        this.field3761.method221(-1, var62);
                        this.field3761.method221(-1, var63);
                        this.field3761.method221(-1, var64);
                        this.field3761.method1881((byte) -40, 0.0F);
                        this.field3761.method1881((byte) -40, 1.0F);
                        this.field3761.method1881((byte) -40, (float) var68 * var16 + var65);
                        this.field3761.method1881((byte) -40, (float) var68 * var17 + var66);
                        this.field3761.method1881((byte) -40, (float) var68 * var18 + var67);
                        this.field3761.method221(-1, var61);
                        this.field3761.method221(-1, var62);
                        this.field3761.method221(-1, var63);
                        this.field3761.method221(-1, var64);
                    }
                    if (this.field3772[var44] > 64) {
                        int var47 = this.field3772[var44] - 64 - 1;
                        for (int var48 = this.field3767[var47] - 1; var48 >= 0; var48--) {
                            class239 var49 = this.field3769[var47][var48];
                            int var50 = var49.field3598;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3596 >> class305.field4630);
                            float var56 = (float) (var49.field3609 >> class305.field4630);
                            float var57 = (float) (var49.field3601 >> class305.field4630);
                            int var58 = var49.field3606 >> class305.field4630;
                            this.field3761.method1881((byte) -40, 0.0F);
                            this.field3761.method1881((byte) -40, 0.0F);
                            this.field3761.method1881((byte) -40, (float) (-var58) * var10 + var55);
                            this.field3761.method1881((byte) -40, (float) (-var58) * var11 + var56);
                            this.field3761.method1881((byte) -40, (float) (-var58) * var12 + var57);
                            this.field3761.method221(-1, var51);
                            this.field3761.method221(-1, var52);
                            this.field3761.method221(-1, var53);
                            this.field3761.method221(-1, var54);
                            this.field3761.method1881((byte) -40, 1.0F);
                            this.field3761.method1881((byte) -40, 0.0F);
                            this.field3761.method1881((byte) -40, (float) var58 * var13 + var55);
                            this.field3761.method1881((byte) -40, (float) var58 * var14 + var56);
                            this.field3761.method1881((byte) -40, (float) var58 * var15 + var57);
                            this.field3761.method221(-1, var51);
                            this.field3761.method221(-1, var52);
                            this.field3761.method221(-1, var53);
                            this.field3761.method221(-1, var54);
                            this.field3761.method1881((byte) -40, 1.0F);
                            this.field3761.method1881((byte) -40, 1.0F);
                            this.field3761.method1881((byte) -40, (float) var58 * var10 + var55);
                            this.field3761.method1881((byte) -40, (float) var58 * var11 + var56);
                            this.field3761.method1881((byte) -40, (float) var58 * var12 + var57);
                            this.field3761.method221(-1, var51);
                            this.field3761.method221(-1, var52);
                            this.field3761.method221(-1, var53);
                            this.field3761.method221(-1, var54);
                            this.field3761.method1881((byte) -40, 0.0F);
                            this.field3761.method1881((byte) -40, 1.0F);
                            this.field3761.method1881((byte) -40, (float) var58 * var16 + var55);
                            this.field3761.method1881((byte) -40, (float) var58 * var17 + var56);
                            this.field3761.method1881((byte) -40, (float) var58 * var18 + var57);
                            this.field3761.method221(-1, var51);
                            this.field3761.method221(-1, var52);
                            this.field3761.method221(-1, var53);
                            this.field3761.method221(-1, var54);
                        }
                    }
                }
            }
        }
        if (this.field3761.field585 != 0) {
            this.field3766.method1153(this.field3761.field536, this.field3761.field585, -2805, 24);
            arg0.method2646(null, this.field3765, -19887, this.field3762, this.field3764);
            arg0.method2652(7, (byte) -63, this.field3761.field585 / 24, 0);
        }
        if (arg2 >= -126) {
            this.field3772 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILbl;)V")
    private final void method1482(int arg0, class442 arg1) {
        field3751++;
        class143.field2321 = arg1.field6756;
        arg1.method2576(24997);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2598(30674, false);
        arg1.method2650((byte) -127, -2);
        if (arg0 != 30243) {
            this.field3769 = null;
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lbl;B)V")
    private final void method1483(class442 arg0, byte arg1) {
        arg0.method2598(30674, true);
        field3756++;
        OpenGL.glEnable(16384);
        int var3 = 93 / ((arg1 - 54) / 50);
        OpenGL.glEnable(16385);
        if (class143.field2321 != arg0.field6756) {
            arg0.method1995(class143.field2321);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Lbl;B)V")
    public final void method1484(class442 arg0, byte arg1) {
        this.field3766 = arg0.method2614(null, 196584, 24, true, -1);
        field3750++;
        this.field3765 = new class400(arg0, this.field3766, 5126, 2, 0);
        this.field3764 = new class400(arg0, this.field3766, 5126, 3, 8);
        if (arg1 < -31) {
            this.field3762 = new class400(arg0, this.field3766, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static void method1485(byte arg0) {
        field3755 = null;
        if (arg0 != -60) {
            method1488(false, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
    public static final void method1486(boolean arg0, int arg1) {
        field3753++;
        if (!arg0) {
            class64 var2 = class230.method1387(arg1, (byte) 40, 10);
            var2.method446(-20033);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLii;Lbl;)V")
    public final void method1487(byte arg0, class372 arg1, class442 arg2) {
        field3759++;
        if (arg2.field6780 == null) {
            return;
        }
        this.method1482(arg0 + 30303, arg2);
        float var4 = arg2.field6780.field477;
        float var5 = arg2.field6780.field472;
        float var6 = arg2.field6780.field467;
        float var7 = arg2.field6780.field456;
        try {
            if (arg1.field5449) {
                int var26 = arg1.field5451 - arg1.field5450;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class402.method2383(113, var26) + 1 - this.field3763;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class374 var28 = arg1.field5447.field2654;
                class374 var29 = var28.field5456;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field3770 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3772[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3767[var34] = 0;
                    }
                    while (var28 != var29) {
                        class239 var35 = (class239) var29;
                        if (var32) {
                            var30 = var35.field3604;
                            var31 = var35.field3600;
                            var32 = false;
                        } else if (var35.field3604 != var30 || var35.field3600 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field3601 >> class305.field4630) * var6 + (float) (var35.field3609 >> class305.field4630) * var5 + (float) (var35.field3596 >> class305.field4630) * var4 + var7) - arg1.field5450 >> var27;
                        if (var36 < 1600) {
                            if (this.field3772[var36] >= 64) {
                                label140: {
                                    if (this.field3772[var36] == 64) {
                                        if (this.field3770 == 64) {
                                            break label140;
                                        }
                                        this.field3772[var36] += this.field3770++ + 1;
                                    }
                                    this.field3769[this.field3772[var36] - 65][this.field3767[this.field3772[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field3771[var36][this.field3772[var36]++] = var35;
                            }
                        }
                        var29 = var29.field5456;
                    }
                    if (var30 >= 0) {
                        arg2.method2586(arg2.field6673.method513(var30, 0), false);
                        arg2.method2610(0, arg2.field4784.method59(var30, 21645).field738);
                    } else {
                        arg2.method2586(null, false);
                    }
                    if (var31 && class143.field2321 != arg2.field6756) {
                        arg2.method1995(class143.field2321);
                    } else if (arg2.field6756 != 1.0F) {
                        arg2.method1995(1.0F);
                    }
                    this.method1481(arg2, var26, -128);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class374 var11 = arg1.field5447.field2654;
                for (class374 var12 = var11.field5456; var12 != var11; var12 = var12.field5456) {
                    class239 var13 = (class239) var12;
                    int var14 = (int) ((float) (var13.field3601 >> class305.field4630) * var6 + (float) (var13.field3609 >> class305.field4630) * var5 + (float) (var13.field3596 >> class305.field4630) * var4 + var7);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    this.field3768[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class402.method2383(-37, var15) + 1 - this.field3763;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var16 = 0;
                    var15 += 2;
                }
                class374 var17 = var11.field5456;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field3770 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field3772[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field3767[var23] = 0;
                    }
                    while (var11 != var17) {
                        class239 var24 = (class239) var17;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field3600;
                            var19 = var24.field3604;
                        }
                        if (var18 > 0 && (var24.field3604 != var19 || var24.field3600 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field3768[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field3772[var25] < 64) {
                                this.field3771[var25][this.field3772[var25]++] = var24;
                            } else {
                                label185: {
                                    if (this.field3772[var25] == 64) {
                                        if (this.field3770 == 64) {
                                            break label185;
                                        }
                                        this.field3772[var25] += this.field3770++ + 1;
                                    }
                                    this.field3769[this.field3772[var25] - 64 - 1][this.field3767[this.field3772[var25] - 64 - 1]++] = var24;
                                }
                            }
                        }
                        var17 = var17.field5456;
                    }
                    if (var19 < 0) {
                        arg2.method2586(null, false);
                    } else {
                        arg2.method2586(arg2.field6673.method513(var19, 0), false);
                        arg2.method2610(arg0 + 60, arg2.field4784.method59(var19, 21645).field738);
                    }
                    if (var20 && class143.field2321 != arg2.field6756) {
                        arg2.method1995(class143.field2321);
                    } else if (arg2.field6756 != 1.0F) {
                        arg2.method1995(1.0F);
                    }
                    this.method1481(arg2, var15, arg0 ^ 0x45);
                }
            }
        } catch (Exception var37) {
        }
        this.method1483(arg2, (byte) -108);
        if (arg0 != -60) {
            this.method1487((byte) -56, null, null);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZB)V")
    public static final void method1488(boolean arg0, byte arg1) {
        class400.method2379((byte) -75, class474.field7236);
        if (arg1 != 45) {
            return;
        }
        class90.field1611++;
        field3754++;
        for (class394 var2 = (class394) class245.field3741.method2415((byte) 30); var2 != null; var2 = (class394) class245.field3741.method2416((byte) -126)) {
            if (!var2.method1124(-119)) {
                var2 = (class394) class245.field3741.method2415((byte) 73);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field5753 == 0) {
                class217.method1332(arg0, true, var2, arg1 ^ 0xFFFFD5AC);
            }
        }
        if (class198.field3118 != null) {
            class288.method1754(class198.field3118, arg1 ^ 0x2D);
            class198.field3118 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BB)Lwt;")
    public static final class195 method1489(byte[] arg0, byte arg1) {
        field3757++;
        class195 var2 = new class195();
        if (arg1 != 65) {
            field3758 = 85;
        }
        class40 var3 = new class40(arg0);
        var3.field585 = var3.field536.length - 2;
        int var4 = var3.method254((byte) -79);
        int var5 = var3.field536.length - var4 - 2 - 12;
        var3.field585 = var5;
        int var6 = var3.method255((byte) 96);
        var2.field3082 = var3.method254((byte) -102);
        var2.field3073 = var3.method254((byte) -41);
        var2.field3083 = var3.method254((byte) -105);
        var2.field3081 = var3.method254((byte) -41);
        int var7 = var3.method257((byte) 95);
        if (var7 > 0) {
            var2.field3080 = new class407[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method254((byte) -38);
                class407 var10 = new class407(class99.method749(var9, arg1 ^ 0xFFFFA287));
                var2.field3080[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method255((byte) 96);
                    int var12 = var3.method255((byte) 96);
                    var10.method2413((long) var11, arg1 ^ 0xFFFFFFBE, new class361(var12));
                }
            }
        }
        var3.field585 = 0;
        var2.field3088 = var3.method280(arg1 ^ 0x40);
        var2.field3074 = new int[var6];
        var2.field3079 = new String[var6];
        var2.field3078 = new int[var6];
        int var13 = 0;
        while (var3.field585 < var5) {
            int var14 = var3.method254((byte) -37);
            if (var14 == 3) {
                var2.field3079[var13] = var3.method239(true).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3074[var13] = var3.method257((byte) 101);
            } else {
                var2.field3074[var13] = var3.method255((byte) 96);
            }
            var2.field3078[var13++] = var14;
        }
        return var2;
    }
}
