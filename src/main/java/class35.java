import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class35 {

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "[I")
    public int[] field476 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "[I")
    public int[] field474 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "[I")
    public int[] field478 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "[I")
    private int[] field481 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "I")
    private int field473 = 0;

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "[I")
    private int[] field484 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "[I")
    private int[] field471 = new int[1500];

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Z")
    public static volatile boolean field470 = false;

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Lw;")
    private static class38 field482 = method219("loc)3dat", true);

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Z")
    public static boolean field479 = false;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "[B")
    public static byte[] field475;

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "[I")
    public static int[] field480;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(DIDD)I", line = 9)
    private final int method207(double arg0, int arg1, double arg2, double arg3) {
        double var8 = arg2;
        double var10 = arg2;
        double var12 = arg2;
        if (arg0 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg0 + 1.0D) * arg2;
            } else {
                var14 = arg0 + arg2 - arg0 * arg2;
            }
            double var16 = arg2 * 2.0D - var14;
            double var18 = arg3 + 0.3333333333333333D;
            if (arg3 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg3 + var16;
            } else if (arg3 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg3 * 3.0D < 2.0D) {
                var10 = (0.6666666666666666D - arg3) * (-var16 + var14) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var22 = arg3 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (0.6666666666666666D - var22) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-var18 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        if (arg1 != 3) {
            method218(null, 38);
        }
        int var25 = (int) (var10 * 256.0D);
        int var26 = (int) (var12 * 256.0D);
        return (var24 << 16) + ((var25 << 8) + var26);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIDIIIZII)V", line = 109)
    public final void method208(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        int var12 = arg2 - arg5;
        int var13 = arg4 - arg6;
        int var14 = (arg1 - arg0 << 16) / var12;
        int var15 = (arg9 - arg8 << 16) / var13;
        if (arg9 - arg8 < -arg6 + arg4) {
            return;
        }
        this.field473 = 0;
        if (arg7) {
            this.method208(-38, -59, 45, 0.5385073696045732D, 90, 45, -7, false, -68, 86);
        }
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class16.method88(var16 + arg6, arg5, (byte) -77);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var14 * var20 >> 16;
                    int var22 = (var20 + 1) * var14 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class3.method8(-76) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && !(arg3 > 6.2D)) {
                                }
                                class24.field339[var24 - 1].method121(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class24.field339[var24 - 1].method121(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class4.method16(-69);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIIIIIIIII)V", line = 223)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field473 == 0) {
            int var12 = arg4 - arg5;
            int var13 = arg1 - arg6;
            int var14 = (arg7 - arg2 << 16) / var12;
            int var15 = (arg0 - arg8 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 * var16 >> 16;
                int var18 = (var16 + 1) * var14 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class16.method88(var16 + arg5, arg6, (byte) -121);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class13.method56((byte) 81) & 0xFF;
                            if (var24 != 0) {
                                this.field484[this.field473] = var24 - 1;
                                this.field471[this.field473] = var19 / 2 + var17;
                                this.field481[this.field473] = var23 / 2 + var21;
                                this.field473++;
                            }
                        }
                        class4.method16(-67);
                    }
                }
            }
        }
        int var25 = 0;
        if (arg9 <= 59) {
            return;
        }
        while (this.field473 > var25) {
            if (class31.field400[this.field484[var25]] != null) {
                class31.field400[this.field484[var25]].method33(this.field471[var25] - 7, this.field481[var25] + -7);
            }
            var25++;
        }
        if (arg3 > 0) {
            for (int var26 = 0; var26 < this.field473; var26++) {
                if (this.field484[var26] == arg10) {
                    class31.field400[this.field484[var26]].method33(this.field471[var26] - 7, this.field481[var26] + -7);
                    if (arg3 % 10 < 5) {
                        class15.method75(this.field471[var26], this.field481[var26], 15, 16776960, 128);
                        class15.method75(this.field471[var26], this.field481[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field473 = 0;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIB)V", line = 342)
    private final void method210(int arg0, int arg1, byte arg2) {
        int var4 = arg0 >> 6;
        int var5 = arg1 >> 6;
        class6.field40 = new int[var4][var5][];
        class18.field180[3] = new byte[var4][var5][];
        if (arg2 < 57) {
            this.field473 = 3;
        }
        class18.field180[1] = new byte[var4][var5][];
        class18.field180[0] = new byte[var4][var5][];
        class18.field180[2] = new byte[var4][var5][];
        class18.field180[4] = new byte[var4][var5][];
        class3.field16 = new class36[var4][var5];
        class33.field420 = new class36[var4][var5];
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BIIIIIIII)V", line = 383)
    public final void method211(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg1 - arg2;
        if (arg0 != -84) {
            return;
        }
        int var11 = arg5 - arg7;
        int var12 = (arg8 - arg4 << 16) / var11;
        int var13 = (arg3 - arg6 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class16.method88(arg2 + var14, arg7, (byte) -43);
                int var18 = arg6 + var16;
                int var19 = arg6 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg4 + var21;
                        int var25 = arg4 + var22;
                        int var26 = class37.method228((byte) 98);
                        int var27 = class24.method157(255);
                        if (var26 == 0 && var27 == 0) {
                            class15.method80(var19, var24, var18 - var19, -var24 + var25, class4.method13(true));
                        } else {
                            byte var28 = class26.method164((byte) -56);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class15.method80(var19, var24, var17, var23, var26);
                            } else {
                                this.method216(126, class4.method13(true), var28 & 0x3, var23, var17, var29 >> 2, class15.field138, var26, class15.field139 * var24 + var19, true);
                            }
                            if (var27 > 0) {
                                byte var30 = class34.method201((byte) 113);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class15.method80(var19, var24, var17, var23, var27);
                                }
                                this.method216(127, class4.method13(true), var30 & 0x3, var23, var17, var31 >> 2, class15.field138, var27, class15.field139 * var24 + var19, var26 == 0);
                            }
                        }
                    }
                    class4.method16(arg0 - 23);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 474)
    public static final void method212(int arg0) {
        if (class9.field67 != null) {
            class37 var1 = class9.field67;
            synchronized (class9.field67) {
                class9.field67 = null;
            }
        }
        int var3 = -100 / ((-arg0 - 64) / 55);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BI)V", line = 493)
    private final void method213(byte[] arg0, int arg1) {
        int var3 = arg1;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class6.field37;
                int var5 = (arg0[var3++] & 0xFF) * 64 - field472;
                if (var4 > 0 && var5 > 0 && class1.field3 > var4 + 64 && class13.field122 > var5 + 64) {
                    class34.field436 = var4 >> 6;
                    class9.field70 = class13.field122 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class3.method6(3, (byte) 115, class13.field122 - var5 - var7 - 1 - 64, var4 + var6, var9);
                                if (class3.field16[class9.field70][class34.field436] == null) {
                                    class3.field16[class9.field70][class34.field436] = new class36();
                                    class3.field16[class9.field70][class34.field436].field486 = new byte[4096];
                                }
                                class3.field16[class9.field70][class34.field436].field486[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class3.field16[class9.field70][class34.field436] != null) {
                        class3.field16[class9.field70][class34.field436].method226(arg1 ^ 0x0);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lb;B)V", line = 574)
    public final void method214(class3 arg0, byte arg1) {
        class18 var3 = new class18(arg0.method62(class11.field94, (byte) 26, class36.field493));
        int var4 = var3.method107(-5286);
        int var5 = var3.method107(-5286);
        int var6 = var3.method107(-5286);
        if (arg1 > -17) {
            this.field484 = null;
        }
        int var7 = var3.method107(-5286);
        int var8 = var3.method107(-5286);
        int var9 = var3.method107(-5286);
        var3.method110((byte) -116);
        class13.field122 = (var7 + 1 - var5) * 64;
        class6.field37 = var4 * 64;
        class1.field3 = (var6 + 1 - var4) * 64;
        class37.field495 = var8 * 64 - class6.field37;
        field472 = var5 * 64;
        mapview.field264 = field472 + class13.field122 - var9 * 64;
        this.method210(class13.field122, class1.field3, (byte) 108);
        class18 var10 = new class18(arg0.method62(class32.field414, (byte) 40, class36.field493));
        int var11 = var10.method107(-5286);
        class1.field10 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class1.field10[var12 + 1] = var10.method113((byte) 67);
        }
        int var13 = var10.method107(-5286);
        class8.field65 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class8.field65[var14 + 1] = var10.method113((byte) 59);
        }
        byte[] var15 = arg0.method62(class13.field127, (byte) 27, class36.field493);
        byte[][] var16 = new byte[class1.field3][class13.field122];
        this.method222((byte) 125, var16, var15);
        byte[] var17 = arg0.method62(class25.field348, (byte) 16, class36.field493);
        this.method213(var17, 0);
        byte[] var18 = arg0.method62(class23.field240, (byte) 125, class36.field493);
        this.method220(var18, (byte) 55);
        byte[] var19 = arg0.method62(field482, (byte) 37, class36.field493);
        class19.field188 = 0;
        this.method217(var19, -119);
        this.method221((byte) -108, var16);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIIIIBII)V", line = 645)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var10 = arg5 - arg8;
        if (arg6 >= -53) {
            field485 = 88;
        }
        this.field473 = 0;
        int var11 = (arg0 - arg2 << 16) / var10;
        int var12 = arg1 - arg4;
        int var13 = (arg7 - arg3 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                class16.method88(arg8 + var14, arg4, (byte) -72);
                for (int var18 = 0; var18 < var12; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = class27.method171(0) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var21 == 1) {
                                var23 = var19;
                            } else {
                                var23 = var20 - 1;
                            }
                            int var24 = 13421772;
                            int var25;
                            if (var17 == 1) {
                                var25 = var16;
                            } else {
                                var25 = var15 - 1;
                            }
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var24 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class15.method82(var16, var19, var21, var24);
                            } else if (var22 == 2) {
                                class15.method81(var16, var19, var17, var24);
                            } else if (var22 == 3) {
                                class15.method82(var25, var19, var21, var24);
                            } else if (var22 == 4) {
                                class15.method81(var16, var23, var17, var24);
                            } else if (var22 == 9) {
                                class15.method82(var16, var19, var21, 16777215);
                                class15.method81(var16, var19, var17, var24);
                            } else if (var22 == 10) {
                                class15.method82(var25, var19, var21, 16777215);
                                class15.method81(var16, var19, var17, var24);
                            } else if (var22 == 11) {
                                class15.method82(var25, var19, var21, 16777215);
                                class15.method81(var16, var23, var17, var24);
                            } else if (var22 == 12) {
                                class15.method82(var16, var19, var21, 16777215);
                                class15.method81(var16, var23, var17, var24);
                            } else if (var22 == 17) {
                                class15.method81(var16, var19, 1, var24);
                            } else if (var22 == 18) {
                                class15.method81(var25, var19, 1, var24);
                            } else if (var22 == 19) {
                                class15.method81(var25, var23, 1, var24);
                            } else if (var22 == 20) {
                                class15.method81(var16, var23, 1, var24);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class15.method81(var16 + var27, -var27 + var23, 1, var24);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class15.method81(var16 + var26, var19 - -var26, 1, var24);
                                }
                            }
                        }
                        int var28 = class13.method56((byte) 61) & 0xFF;
                        if (var28 != 0) {
                            this.field484[this.field473] = var28 - 1;
                            this.field471[this.field473] = var17 / 2 + var16;
                            this.field481[this.field473] = var21 / 2 + var19;
                            this.field473++;
                        }
                    }
                    class4.method16(-101);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIIIII[IIIZ)V", line = 830)
    private final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        int var11 = class15.field139 - arg4;
        if (arg0 < 119) {
            return;
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg2 = arg2 + 1 & 0x3;
        }
        if (arg5 == 10) {
            arg2 = arg2 + 3 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 11) {
            arg2 = arg2 + 3 & 0x3;
            arg5 = 8;
        }
        if (arg5 == 1) {
            if (arg2 == 0) {
                for (int var12 = 0; var12 < arg3; var12++) {
                    for (int var13 = 0; var13 < arg4; var13++) {
                        if (var12 >= var13) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 1) {
                for (int var14 = arg3 - 1; var14 >= 0; var14--) {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        if (var14 >= var15) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 2) {
                for (int var16 = 0; var16 < arg3; var16++) {
                    for (int var17 = 0; var17 < arg4; var17++) {
                        if (var16 <= var17) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 3) {
                for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg4; var19++) {
                        if (var19 >= var18) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg5 == 2) {
            if (arg2 == 0) {
                for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg4; var21++) {
                        if (var20 >> 1 >= var21) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 1) {
                for (int var26 = 0; var26 < arg3; var26++) {
                    for (int var27 = 0; var27 < arg4; var27++) {
                        if (var27 >= var26 << 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 2) {
                for (int var24 = 0; var24 < arg3; var24++) {
                    for (int var25 = arg4 - 1; var25 >= 0; var25--) {
                        if (var24 >> 1 >= var25) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 3) {
                for (int var22 = arg3 - 1; var22 >= 0; var22--) {
                    for (int var23 = arg4 - 1; var23 >= 0; var23--) {
                        if (var23 >= var22 << 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg5 == 3) {
            if (arg2 == 0) {
                for (int var28 = arg3 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg4 - 1; var29 >= 0; var29--) {
                        if (var29 <= var28 >> 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 1) {
                for (int var30 = arg3 - 1; var30 >= 0; var30--) {
                    for (int var31 = 0; var31 < arg4; var31++) {
                        if (var30 << 1 <= var31) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 2) {
                for (int var32 = 0; var32 < arg3; var32++) {
                    for (int var33 = 0; var33 < arg4; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 3) {
                for (int var34 = 0; var34 < arg3; var34++) {
                    for (int var35 = arg4 - 1; var35 >= 0; var35--) {
                        if (var34 << 1 <= var35) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg5 == 4) {
            if (arg2 == 0) {
                for (int var36 = arg3 - 1; var36 >= 0; var36--) {
                    for (int var37 = 0; var37 < arg4; var37++) {
                        if (var37 >= var36 >> 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 1) {
                for (int var42 = 0; var42 < arg3; var42++) {
                    for (int var43 = 0; var43 < arg4; var43++) {
                        if (var43 <= var42 << 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 2) {
                for (int var40 = 0; var40 < arg3; var40++) {
                    for (int var41 = arg4 - 1; var41 >= 0; var41--) {
                        if (var40 >> 1 <= var41) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            } else if (arg2 == 3) {
                for (int var38 = arg3 - 1; var38 >= 0; var38--) {
                    for (int var39 = arg4 - 1; var39 >= 0; var39--) {
                        if (var39 <= var38 << 1) {
                            arg6[arg8] = arg7;
                        } else if (arg9) {
                            arg6[arg8] = arg1;
                        }
                        arg8++;
                    }
                    arg8 += var11;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg2 == 0) {
                    for (int var44 = 0; var44 < arg3; var44++) {
                        for (int var45 = 0; var45 < arg4; var45++) {
                            if (arg4 / 2 >= var45) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var66 = 0; var66 < arg3; var66++) {
                        for (int var67 = 0; var67 < arg4; var67++) {
                            if (var66 <= arg3 / 2) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var46 = 0; var46 < arg3; var46++) {
                        for (int var47 = 0; var47 < arg4; var47++) {
                            if (arg4 / 2 <= var47) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var48 = 0; var48 < arg3; var48++) {
                        for (int var49 = 0; var49 < arg4; var49++) {
                            if (arg3 / 2 <= var48) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg2 == 0) {
                    for (int var50 = 0; var50 < arg3; var50++) {
                        for (int var51 = 0; var51 < arg4; var51++) {
                            if (var51 <= var50 - arg3 / 2) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var52 = arg3 - 1; var52 >= 0; var52--) {
                        for (int var53 = 0; var53 < arg4; var53++) {
                            if (var53 <= var52 - arg3 / 2) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var56 = arg3 - 1; var56 >= 0; var56--) {
                        for (int var57 = arg4 - 1; var57 >= 0; var57--) {
                            if (var57 <= var56 - arg3 / 2) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var54 = 0; var54 < arg3; var54++) {
                        for (int var55 = arg4 - 1; var55 >= 0; var55--) {
                            if (var54 - arg3 / 2 >= var55) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg2 == 0) {
                    for (int var58 = 0; var58 < arg3; var58++) {
                        for (int var59 = 0; var59 < arg4; var59++) {
                            if (var58 - arg3 / 2 <= var59) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 1) {
                    for (int var64 = arg3 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg4; var65++) {
                            if (var64 - arg3 / 2 <= var65) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 2) {
                    for (int var62 = arg3 - 1; var62 >= 0; var62--) {
                        for (int var63 = arg4 - 1; var63 >= 0; var63--) {
                            if (var62 - arg3 / 2 <= var63) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
                if (arg2 == 3) {
                    for (int var60 = 0; var60 < arg3; var60++) {
                        for (int var61 = arg4 - 1; var61 >= 0; var61--) {
                            if (var60 - arg3 / 2 <= var61) {
                                arg6[arg8] = arg7;
                            } else if (arg9) {
                                arg6[arg8] = arg1;
                            }
                            arg8++;
                        }
                        arg8 += var11;
                    }
                    return;
                }
            }
        } else if (arg2 == 0) {
            for (int var68 = arg3 - 1; var68 >= 0; var68--) {
                for (int var69 = arg4 - 1; var69 >= 0; var69--) {
                    if (var68 >> 1 <= var69) {
                        arg6[arg8] = arg7;
                    } else if (arg9) {
                        arg6[arg8] = arg1;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg2 == 1) {
            for (int var74 = arg3 - 1; var74 >= 0; var74--) {
                for (int var75 = 0; var75 < arg4; var75++) {
                    if (var75 <= var74 << 1) {
                        arg6[arg8] = arg7;
                    } else if (arg9) {
                        arg6[arg8] = arg1;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg2 == 2) {
            for (int var72 = 0; var72 < arg3; var72++) {
                for (int var73 = 0; var73 < arg4; var73++) {
                    if (var72 >> 1 <= var73) {
                        arg6[arg8] = arg7;
                    } else if (arg9) {
                        arg6[arg8] = arg1;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        } else if (arg2 == 3) {
            for (int var70 = 0; var70 < arg3; var70++) {
                for (int var71 = arg4 - 1; var71 >= 0; var71--) {
                    if (var71 <= var70 << 1) {
                        arg6[arg8] = arg7;
                    } else if (arg9) {
                        arg6[arg8] = arg1;
                    }
                    arg8++;
                }
                arg8 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "([BI)V", line = 1958)
    private final void method217(byte[] arg0, int arg1) {
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class6.field37;
                int var5 = (arg0[var3++] & 0xFF) * 64 - field472;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class1.field3 && var5 + 64 < class13.field122) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class13.field122 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class3.method6(0, (byte) 98, class13.field122 - var5 - var8 - 64 - 1, var4 + var6, (byte) var9);
                                } else if (var9 < 160) {
                                    class3.method6(1, (byte) 76, class13.field122 - var8 - var5 - 65, var4 - -var6, (byte) (var9 - 28));
                                } else {
                                    class3.method6(2, (byte) 95, class13.field122 - var5 - var8 - 64 - 1, var4 + var6, (byte) (var9 - 159));
                                    if (class19.field188 >= 1500) {
                                        break;
                                    }
                                    this.field476[class19.field188] = var4 + var6;
                                    this.field474[class19.field188] = var7;
                                    this.field478[class19.field188] = var9 - 160;
                                    class19.field188++;
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg0[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            if (arg1 > -44) {
                method218(null, -26);
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 2066)
    public static final void method218(Component arg0, int arg1) {
        if (arg1 != 500743334) {
            field477 = 32;
        }
        Method var2 = class22.field234;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class27.field374);
        arg0.addFocusListener(class27.field374);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/String;Z)Lw;", line = 2101)
    public static final class38 method219(String arg0, boolean arg1) {
        if (!arg1) {
            method218(null, -18);
        }
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class38 var4 = new class38();
        int var5 = 0;
        var4.field503 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field503[var4.field502++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field503[var4.field502++] = (byte) var6;
            }
        }
        var4.method246(arg1);
        return var4.method252(0);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BB)V", line = 2141)
    private final void method220(byte[] arg0, byte arg1) {
        if (arg1 < 15) {
            this.field474 = null;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class6.field37;
                int var5 = (arg0[var3++] & 0xFF) * 64 - field472;
                if (var4 > 0 && var5 > 0 && class1.field3 > var4 + 64 && class13.field122 > var5 + 64) {
                    class9.field70 = class13.field122 - var5 - 1 >> 6;
                    class34.field436 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class3.method6(4, (byte) 50, class13.field122 - var7 - var5 - 1 - 64, var4 + var6, var9);
                                if (class33.field420[class9.field70][class34.field436] == null) {
                                    class33.field420[class9.field70][class34.field436] = new class36();
                                    class33.field420[class9.field70][class34.field436].field486 = new byte[4096];
                                }
                                class33.field420[class9.field70][class34.field436].field486[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class33.field420[class9.field70][class34.field436] != null) {
                        class33.field420[class9.field70][class34.field436].method226(0);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B[[B)V", line = 2241)
    private final void method221(byte arg0, byte[][] arg1) {
        int var3 = class1.field3;
        int var4 = class13.field122;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        if (arg0 > -6) {
            this.field481 = null;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class1.field10[var8[var10] & 0xFF];
                int var12 = class1.field10[var9[var10] & 0xFF];
                if (var11 <= 0 && class18.method111(4032, var7 + 5, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class18.method111(4032, var7 - 5, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var15 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFD18) >> 10);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var13 += (var18 >> 20) - (var17 >> 20);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class6.field40[var20][var19] == null) {
                            class6.field40[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class6.field40[var20][var19][class18.method100(var7, 63) + (class18.method100(var16, 63) << 6)] = 0;
                        } else {
                            class6.field40[var20][var19][class18.method100(var7, 63) + (class18.method100(var16, 63) << 6)] = this.method207((double) var15 / 8533.0D, 3, (double) var14 / 8533.0D, (double) var13 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B[[B[B)V", line = 2347)
    private final void method222(byte arg0, byte[][] arg1, byte[] arg2) {
        int var4 = 0;
        if (arg0 <= 123) {
            this.method210(59, -89, (byte) 109);
        }
        while (true) {
            while (arg2.length > var4) {
                int var5 = (arg2[var4++] & 0xFF) * 64 - class6.field37;
                int var6 = (arg2[var4++] & 0xFF) * 64 - field472;
                if (var5 > 0 && var6 > 0 && class1.field3 > var5 + 64 && var6 + 64 < class13.field122) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg1[var5 + var7];
                        int var9 = class13.field122 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg2[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 2393)
    public static void method223(int arg0) {
        if (arg0 == -1) {
            field475 = null;
            field482 = null;
            field480 = null;
        }
    }
}
