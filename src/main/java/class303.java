import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class303 {

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
    private int[] field3936 = new int[8191];

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "[[Lsm;")
    private class387[][] field3938 = new class387[1600][64];

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    private int field3942 = 0;

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "[[Lsm;")
    private class387[][] field3945 = new class387[64][768];

    @OriginalMember(owner = "client!qia", name = "o", descriptor = "[I")
    private int[] field3946 = new int[1600];

    @OriginalMember(owner = "client!qia", name = "q", descriptor = "[I")
    private int[] field3948 = new int[64];

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "Ldha;")
    private class732 field3932;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "Llk;")
    private class251 field3943;

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "Llk;")
    private class251 field3944;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Lho;")
    private class212 field3940;

    @OriginalMember(owner = "client!qia", name = "p", descriptor = "Lfha;")
    public static class522 field3947 = new class522();

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "F")
    public static float field3933;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qia", name = "r", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!qia", name = "s", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lpga;Lev;II)V")
    public final void method1774(class492 arg0, class347 arg1, int arg2, int arg3) {
        field3941++;
        if (arg0.field6801 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method1781(arg0, arg2, 393168);
        } else {
            this.method1777(arg0, (byte) 108);
        }
        float var5 = arg0.field6801.field2332;
        float var6 = arg0.field6801.field2339;
        float var7 = arg0.field6801.field2331;
        float var8 = arg0.field6801.field2328;
        try {
            int var9 = arg3;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class467 var12 = arg1.field4410.field6953;
            for (class467 var13 = var12.field6370; var13 != var12; var13 = var13.field6370) {
                class387 var14 = (class387) var13;
                int var15 = (int) ((float) (var14.field5404 >> 12) * var7 + (float) (var14.field5411 >> 12) * var6 + (float) (var14.field5402 >> 12) * var5 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field3936[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class668.method3830((byte) -7, var16) + 1 - class497.field6969;
                var16 = (var16 >> var17) + 2;
            }
            class467 var18 = var12.field6370;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field3942 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3946[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3948[var24] = 0;
                }
                while (var12 != var18) {
                    class387 var25 = (class387) var18;
                    if (var22) {
                        var20 = var25.field5401;
                        var21 = var25.field5410;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field5401 != var20 || var21 != var25.field5410)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3936[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3946[var26] >= 64) {
                            label102: {
                                if (this.field3946[var26] == 64) {
                                    if (this.field3942 == 64) {
                                        break label102;
                                    }
                                    this.field3946[var26] += this.field3942++ + 1;
                                }
                                this.field3945[this.field3946[var26] - 64 - 1][this.field3948[this.field3946[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field3938[var26][this.field3946[var26]++] = var25;
                        }
                    }
                    var18 = var18.field6370;
                }
                arg0.method2951(true, false, false, var20 >= 0 ? var20 : -1);
                if (var21 && class626.field8943 != arg0.field6850) {
                    arg0.method2132(class626.field8943);
                } else if (arg0.field6850 != 1.0F) {
                    arg0.method2132(1.0F);
                }
                this.method1780(arg0, 1795829836, var16);
            }
        } catch (Exception var27) {
        }
        this.method1776(arg0, (byte) 122);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public static void method1775(byte arg0) {
        field3947 = null;
        if (arg0 >= -22) {
            method1775((byte) 37);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lpga;B)V")
    private final void method1776(class492 arg0, byte arg1) {
        arg0.method2885(true, 85);
        if (arg1 < 118) {
            return;
        }
        field3934++;
        arg0.method2943(-20954, true);
        if (class626.field8943 != arg0.field6850) {
            arg0.method2132(class626.field8943);
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lpga;B)V")
    private final void method1777(class492 arg0, byte arg1) {
        class626.field8943 = arg0.field6850;
        field3935++;
        arg0.method2914(arg1 - 100);
        arg0.method2943(-20954, false);
        if (arg1 == 108) {
            arg0.method2885(false, 86);
            arg0.method2886(357957308);
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public final void method1778(int arg0) {
        if (arg0 == 27694) {
            this.field3943.method1398(false);
            field3950++;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLpga;)V")
    public final void method1779(byte arg0, class492 arg1) {
        this.field3943.method1591(-17230, 786336, 24);
        int var3 = 72 % ((1 - arg0) / 43);
        field3939++;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lpga;II)V")
    private final void method1780(class492 arg0, int arg1, int arg2) {
        field3949++;
        int var4 = 0;
        class173 var5 = arg0.method2934(arg1 - 1795829876);
        float var6 = var5.field2372;
        float var7 = var5.field2352;
        float var8 = var5.field2370;
        float var9 = var5.field2378;
        float var10 = var5.field2364;
        float var11 = var5.field2335;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        if (arg1 != 1795829836) {
            return;
        }
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field3943.method1590((byte) 64, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2917(var21, false);
        if (Stream.method2541()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field3946[var48] > 64 ? 64 : this.field3946[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class387 var63 = this.field3938[var48][var50];
                        int var64 = var63.field5407;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field5402 >> 12);
                        float var70 = (float) (var63.field5411 >> 12);
                        float var71 = (float) (var63.field5404 >> 12);
                        int var72 = var63.field5406 >> 12;
                        var22.method2552((float) (-var72) * var12 + var69);
                        var22.method2552((float) (-var72) * var13 + var70);
                        var22.method2552((float) (-var72) * var14 + var71);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var65, var66, var67, var68);
                        } else {
                            var22.method2543(var65, var66, var67, var68);
                        }
                        var22.method2552(0.0F);
                        var22.method2552(0.0F);
                        var22.method2552((float) var72 * var15 + var69);
                        var22.method2552((float) var72 * var16 + var70);
                        var22.method2552((float) var72 * var17 + var71);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var65, var66, var67, var68);
                        } else {
                            var22.method2543(var65, var66, var67, var68);
                        }
                        var22.method2552(1.0F);
                        var22.method2552(0.0F);
                        var22.method2552((float) var72 * var12 + var69);
                        var22.method2552((float) var72 * var13 + var70);
                        var22.method2552((float) var72 * var14 + var71);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var65, var66, var67, var68);
                        } else {
                            var22.method2543(var65, var66, var67, var68);
                        }
                        var22.method2552(1.0F);
                        var22.method2552(1.0F);
                        var22.method2552((float) var72 * var18 + var69);
                        var22.method2552((float) var72 * var19 + var70);
                        var22.method2552((float) var72 * var20 + var71);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var65, var66, var67, var68);
                        } else {
                            var22.method2543(var65, var66, var67, var68);
                        }
                        var22.method2552(0.0F);
                        var4++;
                        var22.method2552(1.0F);
                    }
                    if (this.field3946[var48] > 64) {
                        int var51 = this.field3946[var48] - 64 - 1;
                        for (int var52 = this.field3948[var51] - 1; var52 >= 0; var52--) {
                            class387 var53 = this.field3945[var51][var52];
                            int var54 = var53.field5407;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field5402 >> 12);
                            float var60 = (float) (var53.field5411 >> 12);
                            float var61 = (float) (var53.field5404 >> 12);
                            int var62 = var53.field5406 >> 12;
                            var22.method2552((float) (-var62) * var12 + var59);
                            var22.method2552((float) (-var62) * var13 + var60);
                            var22.method2552((float) (-var62) * var14 + var61);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var55, var56, var57, var58);
                            } else {
                                var22.method2543(var55, var56, var57, var58);
                            }
                            var22.method2552(0.0F);
                            var22.method2552(0.0F);
                            var22.method2552((float) var62 * var15 + var59);
                            var22.method2552((float) var62 * var16 + var60);
                            var22.method2552((float) var62 * var17 + var61);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var55, var56, var57, var58);
                            } else {
                                var22.method2543(var55, var56, var57, var58);
                            }
                            var22.method2552(1.0F);
                            var22.method2552(0.0F);
                            var22.method2552((float) var62 * var12 + var59);
                            var22.method2552((float) var62 * var13 + var60);
                            var22.method2552((float) var62 * var14 + var61);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var55, var56, var57, var58);
                            } else {
                                var22.method2543(var55, var56, var57, var58);
                            }
                            var22.method2552(1.0F);
                            var22.method2552(1.0F);
                            var22.method2552((float) var62 * var18 + var59);
                            var22.method2552((float) var62 * var19 + var60);
                            var22.method2552((float) var62 * var20 + var61);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var55, var56, var57, var58);
                            } else {
                                var22.method2543(var55, var56, var57, var58);
                            }
                            var22.method2552(0.0F);
                            var22.method2552(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field3946[var23] <= 64 ? this.field3946[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class387 var38 = this.field3938[var23][var25];
                        int var39 = var38.field5407;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field5402 >> 12);
                        float var45 = (float) (var38.field5411 >> 12);
                        float var46 = (float) (var38.field5404 >> 12);
                        int var47 = var38.field5406 >> 12;
                        var22.method2550((float) (-var47) * var12 + var44);
                        var22.method2550((float) (-var47) * var13 + var45);
                        var22.method2550((float) (-var47) * var14 + var46);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var40, var41, var42, var43);
                        } else {
                            var22.method2543(var40, var41, var42, var43);
                        }
                        var22.method2550(0.0F);
                        var22.method2550(0.0F);
                        var22.method2550((float) var47 * var15 + var44);
                        var22.method2550((float) var47 * var16 + var45);
                        var22.method2550((float) var47 * var17 + var46);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var40, var41, var42, var43);
                        } else {
                            var22.method2543(var40, var41, var42, var43);
                        }
                        var22.method2550(1.0F);
                        var22.method2550(0.0F);
                        var22.method2550((float) var47 * var12 + var44);
                        var22.method2550((float) var47 * var13 + var45);
                        var22.method2550((float) var47 * var14 + var46);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var40, var41, var42, var43);
                        } else {
                            var22.method2543(var40, var41, var42, var43);
                        }
                        var22.method2550(1.0F);
                        var22.method2550(1.0F);
                        var22.method2550((float) var47 * var18 + var44);
                        var22.method2550((float) var47 * var19 + var45);
                        var22.method2550((float) var47 * var20 + var46);
                        if (arg0.field6886 == 0) {
                            var22.method2546(var40, var41, var42, var43);
                        } else {
                            var22.method2543(var40, var41, var42, var43);
                        }
                        var22.method2550(0.0F);
                        var22.method2550(1.0F);
                        var4++;
                    }
                    if (this.field3946[var23] > 64) {
                        int var26 = this.field3946[var23] - 1 - 64;
                        for (int var27 = this.field3948[var26] - 1; var27 >= 0; var27--) {
                            class387 var28 = this.field3945[var26][var27];
                            int var29 = var28.field5407;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field5402 >> 12);
                            float var35 = (float) (var28.field5411 >> 12);
                            float var36 = (float) (var28.field5404 >> 12);
                            int var37 = var28.field5406 >> 12;
                            var22.method2550((float) (-var37) * var12 + var34);
                            var22.method2550((float) (-var37) * var13 + var35);
                            var22.method2550((float) (-var37) * var14 + var36);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var30, var31, var32, var33);
                            } else {
                                var22.method2543(var30, var31, var32, var33);
                            }
                            var22.method2550(0.0F);
                            var22.method2550(0.0F);
                            var22.method2550((float) var37 * var15 + var34);
                            var22.method2550((float) var37 * var16 + var35);
                            var22.method2550((float) var37 * var17 + var36);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var30, var31, var32, var33);
                            } else {
                                var22.method2543(var30, var31, var32, var33);
                            }
                            var22.method2550(1.0F);
                            var22.method2550(0.0F);
                            var22.method2550((float) var37 * var12 + var34);
                            var22.method2550((float) var37 * var13 + var35);
                            var22.method2550((float) var37 * var14 + var36);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var30, var31, var32, var33);
                            } else {
                                var22.method2543(var30, var31, var32, var33);
                            }
                            var22.method2550(1.0F);
                            var22.method2550(1.0F);
                            var22.method2550((float) var37 * var18 + var34);
                            var22.method2550((float) var37 * var19 + var35);
                            var22.method2550((float) var37 * var20 + var36);
                            if (arg0.field6886 == 0) {
                                var22.method2546(var30, var31, var32, var33);
                            } else {
                                var22.method2543(var30, var31, var32, var33);
                            }
                            var22.method2550(0.0F);
                            var22.method2550(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2551();
        if (this.field3943.method1592(-14952)) {
            arg0.method564(0, this.field3943, false);
            arg0.method564(1, this.field3944, false);
            arg0.method565(false, this.field3932);
            arg0.method612(class756.field10497, 0, 0, true, var4 * 4, this.field3940, var4 * 2);
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lpga;II)V")
    private final void method1781(class492 arg0, int arg1, int arg2) {
        field3937++;
        if (arg2 != 393168) {
            method1775((byte) -80);
        }
        class626.field8943 = arg0.field6850;
        arg0.method2932((float) arg1, arg2 ^ 0x5BA98);
        arg0.method2952(-120);
        arg0.method2943(arg2 - 414122, false);
        arg0.method2885(false, arg2 - 393045);
        arg0.method2886(arg2 ^ 0x1550016C);
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lpga;)V")
    public class303(class492 arg0) {
        this.field3932 = arg0.method573(0, new class378[] { new class378(new class91[] { class91.field1226, class91.field1230, class91.field1232 }), new class378(class91.field1229) });
        this.field3943 = arg0.method638((byte) -76, true);
        this.field3944 = arg0.method638((byte) -84, false);
        this.field3944.method1591(-17230, 393168, 12);
        this.field3940 = arg0.method634(false, true);
        this.field3940.method1399(49146, true);
        Buffer var2 = this.field3940.method1401(true, 102);
        if (var2 != null) {
            Stream var3 = arg0.method2917(var2, false);
            if (Stream.method2541()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2554(var7);
                    var3.method2554(var7 + 1);
                    var3.method2554(var7 + 2);
                    var3.method2554(var7 + 2);
                    var3.method2554(var7 + 3);
                    var3.method2554(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2544(var5);
                    var3.method2544(var5 + 1);
                    var3.method2544(var5 + 2);
                    var3.method2544(var5 + 2);
                    var3.method2544(var5 + 3);
                    var3.method2544(var5);
                }
            }
            var3.method2551();
            this.field3940.method1400(false);
        }
        Buffer var8 = this.field3944.method1590((byte) 64, true);
        if (var8 != null) {
            Stream var9 = arg0.method2917(var8, false);
            if (Stream.method2541()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2552(0.0F);
                    var9.method2552(-1.0F);
                    var9.method2552(0.0F);
                    var9.method2552(0.0F);
                    var9.method2552(-1.0F);
                    var9.method2552(0.0F);
                    var9.method2552(0.0F);
                    var9.method2552(-1.0F);
                    var9.method2552(0.0F);
                    var9.method2552(0.0F);
                    var9.method2552(-1.0F);
                    var9.method2552(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2550(0.0F);
                    var9.method2550(-1.0F);
                    var9.method2550(0.0F);
                    var9.method2550(0.0F);
                    var9.method2550(-1.0F);
                    var9.method2550(0.0F);
                    var9.method2550(0.0F);
                    var9.method2550(-1.0F);
                    var9.method2550(0.0F);
                    var9.method2550(0.0F);
                    var9.method2550(-1.0F);
                    var9.method2550(0.0F);
                }
            }
            var9.method2551();
            this.field3944.method1592(-14952);
        }
    }
}
