import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 {

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "[I")
    private int[] field35 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "I")
    private int field42 = 0;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "[I")
    public int[] field44 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "[I")
    public int[] field50 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "[I")
    public int[] field41 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "[I")
    private int[] field45 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "[I")
    private int[] field33 = new int[1500];

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Z")
    public static boolean field34 = false;

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "Lea;")
    public static class10 field49 = class3.method8("Farming patch", -30);

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "Lea;")
    public static class10 field46 = class3.method8("Hunter Store", -106);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Lea;")
    public static class10 field37 = class3.method8("Spice Shop", -122);

    @OriginalMember(owner = "mapview!ca", name = "t", descriptor = "I")
    public static int field52 = 0;

    @OriginalMember(owner = "mapview!ca", name = "s", descriptor = "Lea;")
    public static class10 field51 = class3.method8("General Store", -20);

    @OriginalMember(owner = "mapview!ca", name = "u", descriptor = "I")
    public static int field53 = -1;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Lea;")
    public static class10 field38 = class3.method8("Cooking Range", -46);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field40;

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "[B")
    public static byte[] field47;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "[I")
    public static int[] field43;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I[B)V", line = 5)
    private final void method17(int arg0, byte[] arg1) {
        int var3 = 0;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - mapview.field295;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class19.field201;
                if (var4 > 0 && var5 > 0 && class33.field453 > var4 + 64 && field48 > var5 + 64) {
                    class21.field231 = var4 >> 6;
                    class17.field185 = field48 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class7.method32(4, var4 + var6, var9, (byte) -9, field48 - var5 - var7 - 65);
                                if (class18.field186[class17.field185][class21.field231] == null) {
                                    class18.field186[class17.field185][class21.field231] = new class33();
                                    class18.field186[class17.field185][class21.field231].field449 = new byte[4096];
                                }
                                class18.field186[class17.field185][class21.field231].field449[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class18.field186[class17.field185][class21.field231] != null) {
                        class18.field186[class17.field185][class21.field231].method229(false);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([BI[[B)V", line = 94)
    private final void method18(byte[] arg0, int arg1, byte[][] arg2) {
        int var4 = 0;
        while (true) {
            while (arg0.length > var4) {
                int var5 = (arg0[var4++] & 0xFF) * 64 - mapview.field295;
                int var6 = (arg0[var4++] & 0xFF) * 64 - class19.field201;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class33.field453 && var6 + 64 < field48) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg2[var7 + var5];
                        int var9 = field48 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg0[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg1 != -64) {
                this.field44 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "([BB)V", line = 142)
    private final void method19(byte[] arg0, byte arg1) {
        int var3 = 0;
        if (arg1 != -34) {
            field53 = -76;
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - mapview.field295;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class19.field201;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class33.field453 && field48 > var5 + 64) {
                    class21.field231 = var4 >> 6;
                    class17.field185 = field48 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class7.method32(3, var4 + var6, var9, (byte) -9, field48 - var7 - var5 - 1 - 64);
                                if (class1.field7[class17.field185][class21.field231] == null) {
                                    class1.field7[class17.field185][class21.field231] = new class33();
                                    class1.field7[class17.field185][class21.field231].field449 = new byte[4096];
                                }
                                class1.field7[class17.field185][class21.field231].field449[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class1.field7[class17.field185][class21.field231] != null) {
                        class1.field7[class17.field185][class21.field231].method229(false);
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

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(III)V", line = 222)
    private final void method20(int arg0, int arg1, int arg2) {
        int var4 = arg2 >> 6;
        int var5 = arg1 >> 6;
        class22.field239[2] = new byte[var5][var4][];
        class22.field239[1] = new byte[var5][var4][];
        class22.field239[0] = new byte[var5][var4][];
        class18.field186 = new class33[var5][var4];
        class20.field214 = new int[var5][var4][];
        class22.field239[3] = new byte[var5][var4][];
        class22.field239[4] = new byte[var5][var4][];
        class1.field7 = new class33[var5][var4];
        if (arg0 != 19240) {
            this.method28(11, -119, -121, 58, -82, -125, 63, 97, 97, (byte) -19, -57);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 244)
    public static void method21(int arg0) {
        field47 = null;
        field51 = null;
        field43 = null;
        field40 = null;
        field37 = null;
        if (arg0 == -20202) {
            field49 = null;
            field38 = null;
            field46 = null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "([BB)V", line = 268)
    private final void method22(byte[] arg0, byte arg1) {
        if (arg1 >= -3) {
            field34 = true;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - mapview.field295;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class19.field201;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class33.field453 && var5 + 64 < field48) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = field48 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class7.method32(0, var4 + var6, (byte) var9, (byte) -9, field48 - var5 - var8 - 64 - 1);
                                } else if (var9 < 160) {
                                    class7.method32(1, var4 + var6, (byte) (var9 + -28), (byte) -9, field48 - var5 - var8 - 64 - 1);
                                } else {
                                    class7.method32(2, var4 + var6, (byte) (var9 + -159), (byte) -9, field48 - var8 - var5 - 1 - 64);
                                    if (class7.field55 >= 1500) {
                                        break;
                                    }
                                    this.field50[class7.field55] = var4 + var6;
                                    this.field41[class7.field55] = var7;
                                    this.field44[class7.field55] = var9 - 160;
                                    class7.field55++;
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
            return;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(DDID)I", line = 375)
    private final int method23(double arg0, double arg1, int arg2, double arg3) {
        double var8 = arg3;
        if (arg2 > -109) {
            field36 = -70;
        }
        double var10 = arg3;
        double var12 = arg3;
        if (arg0 != 0.0D) {
            double var14;
            if (arg3 < 0.5D) {
                var14 = (arg0 + 1.0D) * arg3;
            } else {
                var14 = arg0 + arg3 - arg0 * arg3;
            }
            double var16 = arg3 * 2.0D - var14;
            if (arg1 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg1 + var16;
            } else if (arg1 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (0.6666666666666666D - arg1) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            double var20 = arg1 + 0.3333333333333333D;
            if (var20 > 1.0D) {
                var20--;
            }
            double var22 = arg1 - 0.3333333333333333D;
            if (var20 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var20) * (-var16 + var14) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (-var22 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var12 = var16;
            }
        }
        int var24 = (int) (var12 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        int var26 = (int) (var10 * 256.0D);
        return (var25 << 16) + (var26 << 8) + var24;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIBIIIIII)V", line = 464)
    public final void method24(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field42 = 0;
        int var10 = arg1 - arg8;
        int var11 = arg0 - arg6;
        int var12 = (arg4 - arg5 << 16) / var11;
        int var13 = (arg3 - arg7 << 16) / var10;
        int var14 = 0;
        int var15 = 32 / ((32 - arg2) / 48);
        while (var14 < var10) {
            int var16 = var13 * var14 >> 16;
            int var17 = (var14 + 1) * var13 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class39.method251(arg8 + var14, arg6, 74);
                for (int var19 = 0; var19 < var11; var19++) {
                    int var20 = var12 * var19 >> 16;
                    int var21 = (var19 + 1) * var12 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class22.method150(0) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var22 == 1) {
                                var24 = var20;
                            } else {
                                var24 = var21 - 1;
                            }
                            int var25;
                            if (var18 == 1) {
                                var25 = var16;
                            } else {
                                var25 = var17 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var23 -= 4;
                                var26 = 13369344;
                            }
                            if (var23 == 1) {
                                class27.method208(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class27.method198(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class27.method208(var25, var20, var22, var26);
                            } else if (var23 == 4) {
                                class27.method198(var16, var24, var18, var26);
                            } else if (var23 == 9) {
                                class27.method208(var16, var20, var22, 16777215);
                                class27.method198(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class27.method208(var25, var20, var22, 16777215);
                                class27.method198(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class27.method208(var25, var20, var22, 16777215);
                                class27.method198(var16, var24, var18, var26);
                            } else if (var23 == 12) {
                                class27.method208(var16, var20, var22, 16777215);
                                class27.method198(var16, var24, var18, var26);
                            } else if (var23 == 17) {
                                class27.method198(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class27.method198(var25, var20, 1, var26);
                            } else if (var23 == 19) {
                                class27.method198(var25, var24, 1, var26);
                            } else if (var23 == 20) {
                                class27.method198(var16, var24, 1, var26);
                            } else if (var23 == 25) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class27.method198(var16 + var28, -var28 + var24, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class27.method198(var16 + var27, var20 + var27, 1, var26);
                                }
                            }
                        }
                        int var29 = class14.method100((byte) -52) & 0xFF;
                        if (var29 != 0) {
                            this.field33[this.field42] = var29 - 1;
                            this.field35[this.field42] = var18 / 2 + var16;
                            this.field45[this.field42] = var22 / 2 + var20;
                            this.field42++;
                        }
                    }
                    class34.method232((byte) 110);
                }
            }
            var14++;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(ILba;)V", line = 643)
    public final void method25(int arg0, class4 arg1) {
        class11 var3 = new class11(arg1.method234(class7.field59, 2, mapview.field376));
        int var4 = var3.method74((byte) -127);
        int var5 = var3.method74((byte) -89);
        int var6 = var3.method74((byte) -120);
        int var7 = var3.method74((byte) -114);
        int var8 = var3.method74((byte) -96);
        if (arg0 != 3) {
            this.method20(103, 124, 31);
        }
        int var9 = var3.method74((byte) -83);
        var3.method76(arg0 - 13235);
        class19.field201 = var5 * 64;
        field48 = (var7 + 1 - var5) * 64;
        class33.field453 = (var6 + 1 - var4) * 64;
        class28.field404 = field48 + class19.field201 - var9 * 64;
        mapview.field295 = var4 * 64;
        class18.field190 = var8 * 64 - mapview.field295;
        this.method20(19240, field48, class33.field453);
        class11 var10 = new class11(arg1.method234(class10.field74, 2, mapview.field376));
        int var11 = var10.method74((byte) -103);
        class40.field508 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class40.field508[var12 + 1] = var10.method83(1);
        }
        int var13 = var10.method74((byte) -98);
        class10.field75 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class10.field75[var14 + 1] = var10.method83(class32.method226(arg0, 2));
        }
        byte[] var15 = arg1.method234(class3.field22, arg0 ^ 0x1, mapview.field376);
        byte[][] var16 = new byte[class33.field453][field48];
        this.method18(var15, arg0 - 67, var16);
        byte[] var17 = arg1.method234(class36.field487, 2, mapview.field376);
        this.method19(var17, (byte) -34);
        byte[] var18 = arg1.method234(class35.field464, arg0 ^ 0x1, mapview.field376);
        this.method17(-1, var18);
        byte[] var19 = arg1.method234(class19.field202, 2, mapview.field376);
        class7.field55 = 0;
        this.method22(var19, (byte) -26);
        this.method27(-4098, var16);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIIIIIII)V", line = 716)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg6 - arg7;
        int var11 = arg8 - arg0;
        int var12 = (arg5 - arg2 << 16) / var10;
        int var13 = (arg4 - arg3 << 16) / var11;
        for (int var14 = 0; var14 < var11; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                class39.method251(arg0 + var14, arg7, 79);
                int var18 = arg3 + var16;
                int var19 = arg3 + var15;
                for (int var20 = 0; var20 < var10; var20++) {
                    int var21 = var12 * var20 >> 16;
                    int var22 = (var20 + 1) * var12 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = arg2 + var21;
                        int var25 = arg2 + var22;
                        int var26 = class21.method147((byte) -128);
                        int var27 = class8.method38((byte) -65);
                        if (var26 == 0 && var27 == 0) {
                            class27.method201(var19, var24, var18 - var19, var25 - var24, class2.method6(true));
                        } else {
                            byte var28 = class10.method57(0);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class27.method201(var19, var24, var17, var23, var26);
                            } else {
                                this.method29(var26, var28 & 0x3, true, class2.method6(true), class27.field399, var17, var29 >> 2, class27.field397 * var24 + var19, var23, true);
                            }
                            if (var27 > 0) {
                                byte var30 = class31.method221(true);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class27.method201(var19, var24, var17, var23, var27);
                                }
                                this.method29(var27, var30 & 0x3, var26 == 0, class2.method6(true), class27.field399, var17, var31 >> 2, class27.field397 * var24 + var19, var23, true);
                            }
                        }
                    }
                    class34.method232((byte) 126);
                }
            }
        }
        if (arg1 != -1) {
            method21(-73);
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I[[B)V", line = 806)
    private final void method27(int arg0, byte[][] arg1) {
        int var3 = class33.field453;
        int var4 = field48;
        int[] var5 = new int[var4];
        int var6 = 0;
        if (arg0 != -4098) {
            this.method18(null, -59, null);
        }
        while (var6 < var4) {
            var5[var6] = 0;
            var6++;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class40.field508[var9[var10] & 0xFF];
                int var12 = class40.field508[var8[var10] & 0xFF];
                if (var12 <= 0 && class21.method144(var7 + 5, var10, (byte) 92) > 0) {
                    var12 = 64;
                }
                if (var11 <= 0 && class21.method144(var7 - 5, var10, (byte) 105) > 0) {
                    var11 = 64;
                }
                var5[var10] += var12 - var11;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var13 += (var18 >> 10 & 0x3FF) - (var17 >> 10 & 0x3FF);
                    var15 += (var18 >> 20) - (var17 >> 20);
                    var14 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    if (var14 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class20.field214[var20][var19] == null) {
                            class20.field214[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class20.field214[var20][var19][class13.method96(63, var7) + class13.method96(var16 << 6, 4032)] = this.method23((double) var13 / 8533.0D, (double) var15 / 8533.0D, -114, (double) var14 / 8533.0D);
                        } else {
                            class20.field214[var20][var19][class13.method96(var7, 63) + (class13.method96(63, var16) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIIIIIIIBI)V", line = 917)
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        if (this.field42 == 0) {
            int var12 = arg10 - arg1;
            int var13 = arg6 - arg3;
            int var14 = (arg5 - arg4 << 16) / var12;
            int var15 = (arg0 - arg8 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class39.method251(var16 + arg1, arg3, 76);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var15 * var20 >> 16;
                        int var22 = (var20 + 1) * var15 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class14.method100((byte) -110) & 0xFF;
                            if (var24 != 0) {
                                this.field33[this.field42] = var24 - 1;
                                this.field35[this.field42] = var19 / 2 + var18;
                                this.field45[this.field42] = var21 + var23 / 2;
                                this.field42++;
                            }
                        }
                        class34.method232((byte) 119);
                    }
                }
            }
        }
        for (int var25 = 0; var25 < this.field42; var25++) {
            if (class32.field442[this.field33[var25]] != null) {
                class32.field442[this.field33[var25]].method215(this.field35[var25] - 7, this.field45[var25] - 7);
            }
        }
        if (arg2 > 0) {
            for (int var26 = 0; var26 < this.field42; var26++) {
                if (this.field33[var26] == arg7) {
                    class32.field442[this.field33[var26]].method215(this.field35[var26] - 7, this.field45[var26] + -7);
                    if (arg2 % 10 < 5) {
                        class27.method209(this.field35[var26], this.field45[var26], 15, 16776960, 128);
                        class27.method209(this.field35[var26], this.field45[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        if (arg9 >= -95) {
            this.field33 = null;
        }
        this.field42 = 0;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIZI[IIIIIZ)V", line = 1033)
    private final void method29(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg6 == 9) {
            arg6 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        int var11 = class27.field397 - arg5;
        if (arg6 == 10) {
            arg6 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg6 = 8;
        }
        if (arg6 == 1) {
            if (arg1 == 0) {
                for (int var68 = 0; var68 < arg8; var68++) {
                    for (int var69 = 0; var69 < arg5; var69++) {
                        if (var68 >= var69) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var70 = arg8 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg5; var71++) {
                        if (var70 >= var71) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var72 = 0; var72 < arg8; var72++) {
                    for (int var73 = 0; var73 < arg5; var73++) {
                        if (var73 >= var72) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var74 = arg8 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg5; var75++) {
                        if (var75 >= var74) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg6 != 2) {
            if (!arg9) {
                this.method27(-72, null);
            }
            if (arg6 == 3) {
                if (arg1 == 0) {
                    for (int var60 = arg8 - 1; var60 >= 0; var60--) {
                        for (int var61 = arg5 - 1; var61 >= 0; var61--) {
                            if (var60 >> 1 >= var61) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var66 = arg8 - 1; var66 >= 0; var66--) {
                        for (int var67 = 0; var67 < arg5; var67++) {
                            if (var66 << 1 <= var67) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 2) {
                    for (int var64 = 0; var64 < arg8; var64++) {
                        for (int var65 = 0; var65 < arg5; var65++) {
                            if (var65 <= var64 >> 1) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var62 = 0; var62 < arg8; var62++) {
                        for (int var63 = arg5 - 1; var63 >= 0; var63--) {
                            if (var62 << 1 <= var63) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                }
            } else if (arg6 == 4) {
                if (arg1 == 0) {
                    for (int var26 = arg8 - 1; var26 >= 0; var26--) {
                        for (int var27 = 0; var27 < arg5; var27++) {
                            if (var26 >> 1 <= var27) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 1) {
                    for (int var20 = 0; var20 < arg8; var20++) {
                        for (int var21 = 0; var21 < arg5; var21++) {
                            if (var21 <= var20 << 1) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 2) {
                    for (int var24 = 0; var24 < arg8; var24++) {
                        for (int var25 = arg5 - 1; var25 >= 0; var25--) {
                            if (var24 >> 1 <= var25) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                } else if (arg1 == 3) {
                    for (int var22 = arg8 - 1; var22 >= 0; var22--) {
                        for (int var23 = arg5 - 1; var23 >= 0; var23--) {
                            if (var23 <= var22 << 1) {
                                arg4[arg7] = arg0;
                            } else if (arg2) {
                                arg4[arg7] = arg3;
                            }
                            arg7++;
                        }
                        arg7 += var11;
                    }
                }
            } else if (arg6 != 5) {
                if (arg6 == 6) {
                    if (arg1 == 0) {
                        for (int var58 = 0; var58 < arg8; var58++) {
                            for (int var59 = 0; var59 < arg5; var59++) {
                                if (arg5 / 2 >= var59) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var36 = 0; var36 < arg8; var36++) {
                            for (int var37 = 0; var37 < arg5; var37++) {
                                if (var36 <= arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var38 = 0; var38 < arg8; var38++) {
                            for (int var39 = 0; var39 < arg5; var39++) {
                                if (arg5 / 2 <= var39) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var40 = 0; var40 < arg8; var40++) {
                            for (int var41 = 0; var41 < arg5; var41++) {
                                if (var40 >= arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                }
                if (arg6 == 7) {
                    if (arg1 == 0) {
                        for (int var48 = 0; var48 < arg8; var48++) {
                            for (int var49 = 0; var49 < arg5; var49++) {
                                if (var48 - arg8 / 2 >= var49) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var42 = arg8 - 1; var42 >= 0; var42--) {
                            for (int var43 = 0; var43 < arg5; var43++) {
                                if (var42 - arg8 / 2 >= var43) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var46 = arg8 - 1; var46 >= 0; var46--) {
                            for (int var47 = arg5 - 1; var47 >= 0; var47--) {
                                if (var46 - arg8 / 2 >= var47) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var44 = 0; var44 < arg8; var44++) {
                            for (int var45 = arg5 - 1; var45 >= 0; var45--) {
                                if (var45 <= var44 - arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                }
                if (arg6 == 8) {
                    if (arg1 == 0) {
                        for (int var50 = 0; var50 < arg8; var50++) {
                            for (int var51 = 0; var51 < arg5; var51++) {
                                if (var51 >= var50 - arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 1) {
                        for (int var56 = arg8 - 1; var56 >= 0; var56--) {
                            for (int var57 = 0; var57 < arg5; var57++) {
                                if (var56 - arg8 / 2 <= var57) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 2) {
                        for (int var54 = arg8 - 1; var54 >= 0; var54--) {
                            for (int var55 = arg5 - 1; var55 >= 0; var55--) {
                                if (var55 >= var54 - arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                    if (arg1 == 3) {
                        for (int var52 = 0; var52 < arg8; var52++) {
                            for (int var53 = arg5 - 1; var53 >= 0; var53--) {
                                if (var53 >= var52 - arg8 / 2) {
                                    arg4[arg7] = arg0;
                                } else if (arg2) {
                                    arg4[arg7] = arg3;
                                }
                                arg7++;
                            }
                            arg7 += var11;
                        }
                        return;
                    }
                }
            } else if (arg1 == 0) {
                for (int var28 = arg8 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg5 - 1; var29 >= 0; var29--) {
                        if (var28 >> 1 <= var29) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 1) {
                for (int var30 = arg8 - 1; var30 >= 0; var30--) {
                    for (int var31 = 0; var31 < arg5; var31++) {
                        if (var31 <= var30 << 1) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 2) {
                for (int var34 = 0; var34 < arg8; var34++) {
                    for (int var35 = 0; var35 < arg5; var35++) {
                        if (var34 >> 1 <= var35) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            } else if (arg1 == 3) {
                for (int var32 = 0; var32 < arg8; var32++) {
                    for (int var33 = arg5 - 1; var33 >= 0; var33--) {
                        if (var32 << 1 >= var33) {
                            arg4[arg7] = arg0;
                        } else if (arg2) {
                            arg4[arg7] = arg3;
                        }
                        arg7++;
                    }
                    arg7 += var11;
                }
            }
        } else if (arg1 == 0) {
            for (int var18 = arg8 - 1; var18 >= 0; var18--) {
                for (int var19 = 0; var19 < arg5; var19++) {
                    if (var19 <= var18 >> 1) {
                        arg4[arg7] = arg0;
                    } else if (arg2) {
                        arg4[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 1) {
            for (int var12 = 0; var12 < arg8; var12++) {
                for (int var13 = 0; var13 < arg5; var13++) {
                    if (var13 >= var12 << 1) {
                        arg4[arg7] = arg0;
                    } else if (arg2) {
                        arg4[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 2) {
            for (int var16 = 0; var16 < arg8; var16++) {
                for (int var17 = arg5 - 1; var17 >= 0; var17--) {
                    if (var17 <= var16 >> 1) {
                        arg4[arg7] = arg0;
                    } else if (arg2) {
                        arg4[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        } else if (arg1 == 3) {
            for (int var14 = arg8 - 1; var14 >= 0; var14--) {
                for (int var15 = arg5 - 1; var15 >= 0; var15--) {
                    if (var15 >= var14 << 1) {
                        arg4[arg7] = arg0;
                    } else if (arg2) {
                        arg4[arg7] = arg3;
                    }
                    arg7++;
                }
                arg7 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(IIIDIIIIIB)V", line = 2186)
    public final void method30(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        if (arg9 != -96) {
            this.method30(-37, -3, 39, -1.0121454281019622D, -71, -5, 19, 14, -29, (byte) 79);
        }
        int var12 = arg7 - arg8;
        int var13 = arg0 - arg5;
        int var14 = (arg4 - arg2 << 16) / var13;
        int var15 = (arg6 - arg1 << 16) / var12;
        if (arg0 - arg5 > -arg2 + arg4) {
            return;
        }
        this.field42 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            int var17 = var14 * var16 >> 16;
            int var18 = (var16 + 1) * var14 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class39.method251(var16 + arg5, arg8, arg9 + 198);
                for (int var20 = 0; var20 < var12; var20++) {
                    int var21 = var15 * var20 >> 16;
                    int var22 = (var20 + 1) * var15 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class18.method116((byte) 98) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg3 < 4.0D) && arg3 > 4.2D && !(arg3 > 6.2D)) {
                                }
                                class33.field450[var24 - 1].method174(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class33.field450[var24 - 1].method174(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class34.method232((byte) -68);
                }
            }
        }
    }
}
